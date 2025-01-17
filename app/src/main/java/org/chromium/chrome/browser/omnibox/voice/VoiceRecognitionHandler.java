// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.omnibox.voice;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognizerIntent;
import android.text.TextUtils;

import androidx.annotation.IntDef;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

import org.chromium.base.FeatureList;
import org.chromium.base.Log;
import org.chromium.base.ObserverList;
import org.chromium.base.ThreadUtils;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.omnibox.LocationBarDataProvider;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteCoordinator;
import org.chromium.chrome.browser.preferences.Pref;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.search_engines.TemplateUrlServiceFactory;
import org.chromium.chrome.browser.settings.SettingsLauncherImpl;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.translate.TranslateBridge;
import org.chromium.chrome.browser.util.VoiceRecognitionUtil;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetControllerProvider;
import org.chromium.components.embedder_support.util.UrlUtilities;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.user_prefs.UserPrefs;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.browser.WebContentsObserver;
import org.chromium.ui.base.PermissionCallback;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

import java.util.ArrayList;
import java.util.List;

/**
 * Class containing functionality related to voice search.
 */
public class VoiceRecognitionHandler implements ProfileManager.Observer {
    private static final String TAG = "VoiceRecognition";

    /**
     * The minimum confidence threshold that will result in navigating directly to a voice search
     * response (as opposed to treating it like a typed string in the Omnibox).
     */
    @VisibleForTesting
    public static final float VOICE_SEARCH_CONFIDENCE_NAVIGATE_THRESHOLD = 0.9f;
    /**
     * Extra containing the languages for the returned voice transcriptions (ArrayList<String>).
     *
     * This language is only returned for queries handled by Assistant.
     */
    @VisibleForTesting
    static final String VOICE_QUERY_RESULT_LANGUAGES = "android.speech.extra.LANGUAGE";
    /**
     * Extra containing an identifier for the current Assistant experiment.
     *
     * This is only populated for intents initiated via the toolbar button, and is not populated for
     * internal Chrome URLs.
     */
    @VisibleForTesting
    static final String EXTRA_EXPERIMENT_ID = "com.android.chrome.voice.EXPERIMENT_ID";
    /**
     * The parameter from the ASSISTANT_INTENT_EXPERIMENT_ID feature that configures the experiment
     * ID attached via the EXTRA_EXPERIMENT_ID extra.
     */
    @VisibleForTesting
    static final String ASSISTANT_EXPERIMENT_ID_PARAM_NAME = "experiment_id";
    /**
     * Extra containing the URL of the current page.
     *
     * This is only populated for intents initiated via the toolbar button, and is not populated for
     * internal Chrome URLs.
     */
    @VisibleForTesting
    static final String EXTRA_PAGE_URL = "com.android.chrome.voice.PAGE_URL";
    /**
     * Extra containing the original language code of the current page.
     *
     * This is only populated for pages that are translatable and only for intents initiated via the
     * toolbar button.
     */
    @VisibleForTesting
    static final String EXTRA_TRANSLATE_ORIGINAL_LANGUAGE =
            "com.android.chrome.voice.TRANSLATE_ORIGINAL_LANGUAGE";
    /**
     * Extra containing the current language code of the current page.
     *
     * This is only populated for pages that are translatable and only for intents initiated via the
     * toolbar button.
     */
    @VisibleForTesting
    static final String EXTRA_TRANSLATE_CURRENT_LANGUAGE =
            "com.android.chrome.voice.TRANSLATE_CURRENT_LANGUAGE";
    /**
     * Extra containing the user's default target language code.
     *
     * This is only populated for pages that are translatable and only for intents initiated via the
     * toolbar button.
     */
    @VisibleForTesting
    static final String EXTRA_TRANSLATE_TARGET_LANGUAGE =
            "com.android.chrome.voice.TRANSLATE_TARGET_LANGUAGE";
    /**
     * Extra containing a string that represents the action taken by Assistant after being opened
     * for voice transcription.
     *
     * See AssistantActionPerformed, below.
     */
    @VisibleForTesting
    static final String EXTRA_ACTION_PERFORMED = "com.android.chrome.voice.ACTION_PERFORMED";
    /**
     * Extra containing the current timestamp (in epoch time) used for tracking intent latency.
     */
    @VisibleForTesting
    static final String EXTRA_INTENT_SENT_TIMESTAMP =
            "com.android.chrome.voice.INTENT_SENT_TIMESTAMP";
    /**
     * Extra containing the email for the signed-in/syncing account on the device.
     */
    @VisibleForTesting
    static final String EXTRA_INTENT_USER_EMAIL = "com.android.chrome.voice.INTENT_USER_EMAIL";
    /**
     * Extra containing an integer that indicates which voice entrypoint the intent was initiated
     * from.
     *
     * See VoiceInteractionEventSource for possible values.
     */
    @VisibleForTesting
    static final String EXTRA_VOICE_ENTRYPOINT = "com.android.chrome.voice.VOICE_ENTRYPOINT";

    private final Delegate mDelegate;
    private Long mQueryStartTimeMs;
    private WebContentsObserver mVoiceSearchWebContentsObserver;
    private Supplier<AssistantVoiceSearchService> mAssistantVoiceSearchServiceSupplier;
    private TranslateBridgeWrapper mTranslateBridgeWrapper;
    private final ObserverList<Observer> mObservers = new ObserverList<>();

    /**
     * VoiceInteractionEventSource defined in tools/metrics/histograms/enums.xml.
     *
     * Do not reorder or remove items, only add new items before NUM_ENTRIES.
     */
    @IntDef({VoiceInteractionSource.OMNIBOX, VoiceInteractionSource.NTP,
            VoiceInteractionSource.SEARCH_WIDGET, VoiceInteractionSource.TASKS_SURFACE,
            VoiceInteractionSource.TOOLBAR})
    public @interface VoiceInteractionSource {
        int OMNIBOX = 0;
        int NTP = 1;
        int SEARCH_WIDGET = 2;
        int TASKS_SURFACE = 3;
        int TOOLBAR = 4;

        // Be sure to also update enums.xml when updating these values.
        int NUM_ENTRIES = 5;
    }

    /**
     * VoiceIntentTarget defined in tools/metrics/histograms/enums.xml.
     *
     * Do not reorder or remove items, only add new items before NUM_ENTRIES.
     */
    @IntDef({VoiceIntentTarget.SYSTEM, VoiceIntentTarget.ASSISTANT})
    public @interface VoiceIntentTarget {
        int SYSTEM = 0;
        int ASSISTANT = 1;

        // Be sure to also update enums.xml when updating these values.
        int NUM_ENTRIES = 2;
    }

    /**
     * AssistantActionPerformed defined in tools/metrics/histograms/enums.xml.
     *
     * Do not reorder or remove items, only add new items before NUM_ENTRIES.
     */
    @IntDef({AssistantActionPerformed.UNKNOWN, AssistantActionPerformed.TRANSCRIPTION,
            AssistantActionPerformed.TRANSLATE, AssistantActionPerformed.READOUT})
    public @interface AssistantActionPerformed {
        int UNKNOWN = 0;
        int TRANSCRIPTION = 1;
        int TRANSLATE = 2;
        int READOUT = 3;

        // Be sure to also update enums.xml when updating these values.
        int NUM_ENTRIES = 4;
    }

    /**
     * Delegate interface to provide data to this class from the location bar implementation.
     */
    public interface Delegate {
        /**
         * Loads the provided URL, assumes the PageTransition type is TYPED.
         * @param url The URL to load.
         */
        void loadUrlFromVoice(String url);


        /**
         * Sets the query string in the omnibox (ensuring the URL bar has focus and triggering
         * autocomplete for the specified query) as if the user typed it.
         * @param query The query to be set in the omnibox.
         */
        void setSearchQuery(final String query);

        /**
         * Grabs a reference to the location data provider from the location bar.
         * @return The {@link LocationBarDataProvider} currently in use by the
         *         {@link LocationBarLayout}.
         */
        LocationBarDataProvider getLocationBarDataProvider();

        /**
         * Grabs a reference to the autocomplete coordinator from the location bar.
         * @return The {@link AutocompleteCoordinator} currently in use by the
         *         {@link LocationBarLayout}.
         */
        // TODO(tedchoc): Limit the visibility of what is passed in here.  This does not need the
        //                full coordinator.  It simply needs a way to pass voice suggestions to the
        //                AutocompleteController.
        AutocompleteCoordinator getAutocompleteCoordinator();

        /**
         * @return The current {@link WindowAndroid}.
         */
        WindowAndroid getWindowAndroid();

        /** Clears omnibox focus, used to display the dialog when the keyboard is shown. */
        void clearOmniboxFocus();
    }

    /** Interface for observers interested in updates to the voice state. */
    public interface Observer {
        /**
         * Triggers when an event occurs that impacts availability of the voice
         * recognition, for example audio permissions or policy values change.
         */
        void onVoiceAvailabilityImpacted();
    }

    /**
     * Wraps our usage of the static methods in the {@link TranslateBridge} into a class that can be
     * mocked for testing.
     */
    public static class TranslateBridgeWrapper {
        /**
         * Returns true iff the current tab can be manually translated.
         * Logging should only be performed when this method is called to show the translate menu
         * item.
         */
        public boolean canManuallyTranslate(Tab tab) {
            return TranslateBridge.canManuallyTranslate(tab, /*menuLogging=*/false);
        }

        /**
         * Returns the original language code of the given tab. Empty string if no language was
         * detected yet.
         */
        public String getOriginalLanguage(Tab tab) {
            return TranslateBridge.getOriginalLanguage(tab);
        }

        /**
         * Returns the current language code of the given tab. Empty string if no language was
         * detected yet.
         */
        public String getCurrentLanguage(Tab tab) {
            return TranslateBridge.getCurrentLanguage(tab);
        }

        /**
         * Returns the best target language based on what the Translate Service knows about the
         * user.
         */
        public String getTargetLanguage() {
            return TranslateBridge.getTargetLanguage();
        }
    }

    /**
     * A storage class that holds voice recognition string matches and confidence scores.
     */
    public static class VoiceResult {
        private final String mMatch;
        private final float mConfidence;
        @Nullable
        private final String mLanguage;

        public VoiceResult(String match, float confidence) {
            this(match, confidence, null);
        }

        /**
         * Creates an instance of a VoiceResult.
         * @param match The text match from the voice recognition.
         * @param confidence The confidence value of the recognition that should go from 0.0 to 1.0.
         * @param language The language of the returned query.
         */
        public VoiceResult(String match, float confidence, @Nullable String language) {
            mMatch = match;
            mConfidence = confidence;
            mLanguage = language;
        }

        /**
         * @return The text match from the voice recognition.
         */
        public String getMatch() {
            return mMatch;
        }

        /**
         * @return The confidence value of the recognition that should go from 0.0 to 1.0.
         */
        public float getConfidence() {
            return mConfidence;
        }

        /**
         * @return The IETF language tag for this result.
         */
        public @Nullable String getLanguage() {
            return mLanguage;
        }
    }

    public VoiceRecognitionHandler(Delegate delegate,
            Supplier<AssistantVoiceSearchService> assistantVoiceSearchServiceSupplier) {
        mDelegate = delegate;
        mAssistantVoiceSearchServiceSupplier = assistantVoiceSearchServiceSupplier;
        mTranslateBridgeWrapper = new TranslateBridgeWrapper();
        ProfileManager.addObserver(this);
    }

    public void addObserver(Observer observer) {
        mObservers.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        mObservers.removeObserver(observer);
    }

    private void notifyVoiceAvailabilityImpacted() {
        for (Observer o : mObservers) {
            o.onVoiceAvailabilityImpacted();
        }
    }

    /**
     * After profile is created and prefs loaded ensure that UI is updated and the mic shown/hidden
     * as needed.
     */
    @Override
    public void onProfileAdded(Profile profile) {
        notifyVoiceAvailabilityImpacted();
    }

    @Override
    public void onProfileDestroyed(Profile profile) {}

    /**
     * Instantiated when a voice search is performed to monitor the web contents for a navigation
     * to be started so we can notify the render frame that a user gesture has been performed. This
     * allows autoplay of the voice response for search results.
     */
    private final class VoiceSearchWebContentsObserver extends WebContentsObserver {
        public VoiceSearchWebContentsObserver(WebContents webContents) {
            super(webContents);
        }

        /**
         * Forces the user gesture flag to be set on a render frame if the URL being navigated to
         * is a SRP.
         *
         * @param url The URL for the navigation that started, so we can ensure that what we're
         * navigating to is actually a SRP.
         */
        private void setReceivedUserGesture(GURL url) {
            WebContents webContents = mWebContents.get();
            if (webContents == null) return;

            RenderFrameHost renderFrameHost = webContents.getMainFrame();
            if (renderFrameHost == null) return;
            if (TemplateUrlServiceFactory.get().isSearchResultsPageFromDefaultSearchProvider(url)) {
                renderFrameHost.notifyUserActivation();
            }
        }

        @Override
        public void didFinishNavigation(NavigationHandle navigation) {
            if (navigation.hasCommitted() && navigation.isInMainFrame()
                    && !navigation.isErrorPage()) {
                setReceivedUserGesture(navigation.getUrl());
            }
            destroy();
        }
    }

    /**
     * Callback for when we receive voice search results after initiating voice recognition.
     */
    class VoiceRecognitionCompleteCallback implements WindowAndroid.IntentCallback {
        @VoiceInteractionSource
        private final int mSource;

        @VoiceIntentTarget
        private final int mTarget;

        private boolean mCallbackComplete;

        public VoiceRecognitionCompleteCallback(
                @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
            mSource = source;
            mTarget = target;
        }

        // WindowAndroid.IntentCallback implementation:
        @Override
        public void onIntentCompleted(WindowAndroid window, int resultCode, Intent data) {
            if (mCallbackComplete) {
                recordVoiceSearchUnexpectedResult(mSource, mTarget);
                return;
            }

            mCallbackComplete = true;
            if (resultCode == Activity.RESULT_CANCELED) {
                recordVoiceSearchDismissedEvent(mSource, mTarget);
                return;
            }
            if (resultCode != Activity.RESULT_OK || data.getExtras() == null) {
                recordVoiceSearchFailureEvent(mSource, mTarget);
                return;
            }

            // Assume transcription by default when the page URL feature is disabled.
            @AssistantActionPerformed
            int actionPerformed = AssistantActionPerformed.TRANSCRIPTION;
            if (FeatureList.isInitialized()
                    && ChromeFeatureList.isEnabled(ChromeFeatureList.ASSISTANT_INTENT_PAGE_URL)) {
                actionPerformed = getActionPerformed(data.getExtras());
            }

            recordSuccessMetrics(mSource, mTarget, actionPerformed);

            if (actionPerformed == AssistantActionPerformed.TRANSCRIPTION) {
                handleTranscriptionResult(data);
            }
        }

        /**
         * Processes the transcription results within the given Intent, potentially initiating a
         * search or navigation.
         * @param data The {@link Intent} with returned transcription data.
         */
        private void handleTranscriptionResult(Intent data) {
            AutocompleteCoordinator autocompleteCoordinator =
                    mDelegate.getAutocompleteCoordinator();
            assert autocompleteCoordinator != null;

            List<VoiceResult> voiceResults = convertBundleToVoiceResults(data.getExtras());
            autocompleteCoordinator.onVoiceResults(voiceResults);
            VoiceResult topResult =
                    (voiceResults != null && voiceResults.size() > 0) ? voiceResults.get(0) : null;
            if (topResult == null) {
                recordVoiceSearchResult(mTarget, false);
                return;
            }

            String topResultQuery = topResult.getMatch();
            if (TextUtils.isEmpty(topResultQuery)) {
                recordVoiceSearchResult(mTarget, false);
                return;
            }

            recordVoiceSearchResult(mTarget, true);
            recordVoiceSearchConfidenceValue(mTarget, topResult.getConfidence());

            if (topResult.getConfidence() < VOICE_SEARCH_CONFIDENCE_NAVIGATE_THRESHOLD) {
                mDelegate.setSearchQuery(topResultQuery);
                return;
            }

            String url = AutocompleteCoordinator.qualifyPartialURLQuery(topResultQuery);
            if (url == null) {
                url = TemplateUrlServiceFactory.get()
                              .getUrlForVoiceSearchQuery(topResultQuery)
                              .getSpec();

                // If a language was returned to us from voice recognition, then use it. Currently,
                // this is only returned when Google is the search engine. Since Google always has
                // the query as a url parameter so appending this param will always be safe.
                if (topResult.getLanguage() != null) {
                    // TODO(crbug.com/1117271): Cleanup these assertions when Assistant launches.
                    assert url.contains("?") : "URL must contain at least one URL param.";
                    assert !url.contains("#") : "URL must not contain a fragment.";
                    url += "&hl=" + topResult.getLanguage();
                }
            }

            // Since voice was used, we need to let the frame know that there was a user gesture.
            LocationBarDataProvider locationBarDataProvider =
                    mDelegate.getLocationBarDataProvider();
            Tab currentTab =
                    locationBarDataProvider != null ? locationBarDataProvider.getTab() : null;
            if (currentTab != null) {
                if (mVoiceSearchWebContentsObserver != null) {
                    mVoiceSearchWebContentsObserver.destroy();
                    mVoiceSearchWebContentsObserver = null;
                }
                if (currentTab.getWebContents() != null) {
                    mVoiceSearchWebContentsObserver =
                            new VoiceSearchWebContentsObserver(currentTab.getWebContents());
                }
            }
            mDelegate.loadUrlFromVoice(url);
        }
    }

    /**
     * Returns the action performed by Assistant from the Assistant Intent callback bundle.
     *
     * If the extra is unavailable, assume TRANSCRIPTION.
     */
    private static @AssistantActionPerformed int getActionPerformed(Bundle extras) {
        assert extras != null;
        String actionPerformed = extras.getString(EXTRA_ACTION_PERFORMED);
        if (actionPerformed == null) {
            // Older versions of Assistant will not set EXTRA_ACTION_PERFORMED. These versions of
            // Assistant also do not handle translate or readout, so we should assume transcription.
            return AssistantActionPerformed.TRANSCRIPTION;
        }
        return parseActionPerformed(actionPerformed);
    }

    /**
     * Parses actionPerformed and returns the associated AssistantActionPerformedValue.
     * @param actionPerformed A String representation of the action enum.
     * @return The parsed action or AssistantActionPerformed.UNKNOWN if no match was found.
     */
    private static @AssistantActionPerformed int parseActionPerformed(String actionPerformed) {
        switch (actionPerformed) {
            case "TRANSCRIPTION":
                return AssistantActionPerformed.TRANSCRIPTION;
            case "TRANSLATE":
                return AssistantActionPerformed.TRANSLATE;
            case "READOUT":
                return AssistantActionPerformed.READOUT;
            default:
                return AssistantActionPerformed.UNKNOWN;
        }
    }

    /**
     * Returns a String for use as a histogram suffix for histograms split by
     * AssistantActionPerformed.
     * @param action The action performed by the Assistant.
     * @return The histogram suffix for the given action. No '.' separator is included.
     */
    private static String getHistogramSuffixForAction(@AssistantActionPerformed int action) {
        switch (action) {
            case AssistantActionPerformed.TRANSCRIPTION:
                return "Transcription";
            case AssistantActionPerformed.TRANSLATE:
                return "Translate";
            case AssistantActionPerformed.READOUT:
                return "Readout";
            default:
                return "Unknown";
        }
    }

    /**
     * Returns a String for use as a histogram suffix for histograms split by
     * VoiceInteractionSource.
     * @param source The source of the voice interaction.
     * @return The histogram suffix for the given source or null if unknown. No '.' separator is
     *         included.
     */
    private static @Nullable String getHistogramSuffixForSource(
            @VoiceInteractionSource int source) {
        switch (source) {
            case VoiceInteractionSource.OMNIBOX:
                return "Omnibox";
            case VoiceInteractionSource.NTP:
                return "NTP";
            case VoiceInteractionSource.SEARCH_WIDGET:
                return "SearchWidget";
            case VoiceInteractionSource.TASKS_SURFACE:
                return "TasksSurface";
            case VoiceInteractionSource.TOOLBAR:
                return "Toolbar";
            default:
                assert false : "Unknown VoiceInteractionSource: " + source;
                return null;
        }
    }

    /**
     * Returns a String for use as a histogram suffix for histograms split by VoiceIntentTarget.
     * @param target The target of the voice search intent.
     * @return The histogram suffix for the given target. No '.' separator is included.
     */
    private static String getHistogramSuffixForTarget(@VoiceIntentTarget int target) {
        switch (target) {
            case VoiceIntentTarget.SYSTEM:
                return "System";
            case VoiceIntentTarget.ASSISTANT:
                return "Assistant";
            default:
                assert false : "Unknown VoiceIntentTarget: " + target;
                return null;
        }
    }

    /** Convert the android voice intent bundle to a list of result objects. */
    @VisibleForTesting
    protected List<VoiceResult> convertBundleToVoiceResults(Bundle extras) {
        if (extras == null) return null;

        ArrayList<String> strings = extras.getStringArrayList(RecognizerIntent.EXTRA_RESULTS);
        float[] confidences = extras.getFloatArray(RecognizerIntent.EXTRA_CONFIDENCE_SCORES);
        ArrayList<String> languages = extras.getStringArrayList(VOICE_QUERY_RESULT_LANGUAGES);

        if (strings == null || confidences == null) return null;
        if (strings.size() != confidences.length) return null;
        // Langues is optional, so only check the size when it's non-null.
        if (languages != null && languages.size() != strings.size()) return null;

        List<VoiceResult> results = new ArrayList<>();
        for (int i = 0; i < strings.size(); ++i) {
            // Remove any spaces in the voice search match when determining whether it
            // appears to be a URL. This is to prevent cases like (
            // "tech crunch.com" and "www. engadget .com" from not appearing like URLs)
            // from not navigating to the URL.
            // If the string appears to be a URL, then use it instead of the string returned from
            // the voice engine.
            String culledString = strings.get(i).replaceAll(" ", "");
            String url = AutocompleteCoordinator.qualifyPartialURLQuery(culledString);
            String language = languages == null ? null : languages.get(i);
            results.add(new VoiceResult(
                    url == null ? strings.get(i) : culledString, confidences[i], language));
        }
        return results;
    }

    /** Returns the PrefService for the active Profile, or null if no profile has been loaded. */
    private @Nullable PrefService getPrefService() {
        if (!ProfileManager.isInitialized()) {
            return null;
        }

        return UserPrefs.get(Profile.getLastUsedRegularProfile());
    }

    /**
     * Triggers a voice recognition intent to allow the user to specify a search query.
     *
     * @param source The source of the voice recognition initiation, such as NTP or omnibox.
     */
    public void startVoiceRecognition(@VoiceInteractionSource int source) {
        ThreadUtils.assertOnUiThread();
        startTrackingQueryDuration();

        WindowAndroid windowAndroid = mDelegate.getWindowAndroid();
        if (windowAndroid == null) return;
        Activity activity = windowAndroid.getActivity().get();
        if (activity == null) return;

        if (FeatureList.isInitialized()
                && ChromeFeatureList.isEnabled(
                        ChromeFeatureList.VOICE_SEARCH_AUDIO_CAPTURE_POLICY)) {
            // TODO(crbug.com/1161022): Rather than checking here we should instead hide the mics
            // when disabled via policy. Since the policy isn't available at layout time, we'll need
            // to add observers that can notify the different mic surfaces of voice search being
            // disabled.
            @Nullable
            PrefService prefService = getPrefService();
            if (prefService == null || !prefService.getBoolean(Pref.AUDIO_CAPTURE_ALLOWED)) {
                return;
            }
        }

        if (mAssistantVoiceSearchServiceSupplier.hasValue()) {
            mAssistantVoiceSearchServiceSupplier.get().reportUserEligibility();
            if (startAGSAForAssistantVoiceSearch(activity, windowAndroid, source)) return;
        }

        if (!startSystemForVoiceSearch(activity, windowAndroid, source)) {
            // TODO(wylieb): Emit histogram here to identify how many users are attempting to use
            // voice search, but fail completely.
            Log.w(TAG, "Couldn't find suitable provider for voice searching");
        }
    }

    /**
     * Requests the audio permission and resolves the voice recognition request if necessary.
     *
     * In a situation when permissions can't be requested anymore, or have been requested
     * and the result was a denial without an option to request them again, voice
     * functionality will become unavailable.
     *
     * @param activity The current {@link Activity} that we're requesting permission for.
     * @param windowAndroid Used to request audio permissions from the Android system.
     * @param source The source of the mic button click, used to record metrics.
     * @return Whether audio permissions are granted.
     */
    private boolean ensureAudioPermissionGranted(
            Activity activity, WindowAndroid windowAndroid, @VoiceInteractionSource int source) {
        if (windowAndroid.hasPermission(Manifest.permission.RECORD_AUDIO)) return true;

        // If we don't have permission and also can't ask, then there's no more work left other
        // than telling the delegate to update the mic state.
        if (!windowAndroid.canRequestPermission(Manifest.permission.RECORD_AUDIO)) {
            notifyVoiceAvailabilityImpacted();
            return false;
        }

        PermissionCallback callback = (permissions, grantResults) -> {
            if (grantResults.length != 1) {
                return;
            }

            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startSystemForVoiceSearch(activity, windowAndroid, source);
            } else if (!windowAndroid.canRequestPermission(Manifest.permission.RECORD_AUDIO)) {
                notifyVoiceAvailabilityImpacted();
            }
        };
        windowAndroid.requestPermissions(new String[] {Manifest.permission.RECORD_AUDIO}, callback);

        return false;
    }

    /** Start the system-provided service to fulfill the current voice search. */
    private boolean startSystemForVoiceSearch(
            Activity activity, WindowAndroid windowAndroid, @VoiceInteractionSource int source) {
        // Check if we need to request audio permissions. If we don't, then trigger a permissions
        // prompt will appear and startVoiceRecognition will be called again.
        if (!ensureAudioPermissionGranted(activity, windowAndroid, source)) return false;

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,
                activity.getComponentName().flattenToString());
        intent.putExtra(RecognizerIntent.EXTRA_WEB_SEARCH_ONLY, true);

        if (!showSpeechRecognitionIntent(windowAndroid, intent, source, VoiceIntentTarget.SYSTEM)) {
            // Requery whether or not the recognition intent can be handled.
            isRecognitionIntentPresent(false);
            notifyVoiceAvailabilityImpacted();
            recordVoiceSearchFailureEvent(source, VoiceIntentTarget.SYSTEM);

            return false;
        }
        return true;
    }

    /**
     * Start AGSA to fulfill the current voice search.
     *
     * @return Whether AGSA was actually started, when false we should fallback to
     *         {@link startSystemForVoiceSearch}.
     */
    private boolean startAGSAForAssistantVoiceSearch(
            Activity activity, WindowAndroid windowAndroid, @VoiceInteractionSource int source) {
        AssistantVoiceSearchService assistantVoiceSearchService =
                mAssistantVoiceSearchServiceSupplier.get();
        if (assistantVoiceSearchService == null) return false;

        // Check if the device meets the requirements to use Assistant voice search.
        if (!assistantVoiceSearchService.canRequestAssistantVoiceSearch()) return false;

        // Check if the consent prompt needs to be shown.
        if (assistantVoiceSearchService.needsEnabledCheck()) {
            mDelegate.clearOmniboxFocus();
            AssistantVoiceSearchConsentUi.show(windowAndroid,
                    SharedPreferencesManager.getInstance(), new SettingsLauncherImpl(),
                    BottomSheetControllerProvider.from(windowAndroid), (useAssistant) -> {
                        // Notify the service about the consent completion.
                        assistantVoiceSearchService.onAssistantConsentDialogComplete(useAssistant);

                        if (useAssistant) {
                            if (!startAGSAForAssistantVoiceSearch(
                                        activity, windowAndroid, source)) {
                                // Fallback to system voice search.
                                startSystemForVoiceSearch(activity, windowAndroid, source);
                            }
                        } else {
                            startSystemForVoiceSearch(activity, windowAndroid, source);
                        }
                    });

            return true;
        }

        // Final check to see if Assistant voice search should be used.
        if (!assistantVoiceSearchService.shouldRequestAssistantVoiceSearch()) return false;

        Intent intent = assistantVoiceSearchService.getAssistantVoiceSearchIntent();
        intent.putExtra(EXTRA_VOICE_ENTRYPOINT, source);
        // Allows Assistant to track intent latency.
        intent.putExtra(EXTRA_INTENT_SENT_TIMESTAMP, System.currentTimeMillis());
        intent.putExtra(EXTRA_INTENT_USER_EMAIL, assistantVoiceSearchService.getUserEmail());

        if (FeatureList.isInitialized()
                && ChromeFeatureList.isEnabled(ChromeFeatureList.ASSISTANT_INTENT_EXPERIMENT_ID)) {
            attachAssistantExperimentId(intent);
        }

        if (shouldAddPageUrl(source)) {
            String url = getUrl();
            if (url != null) {
                intent.putExtra(EXTRA_PAGE_URL, url);
            }
        }

        if (source == VoiceInteractionSource.TOOLBAR && FeatureList.isInitialized()
                && ChromeFeatureList.isEnabled(ChromeFeatureList.ASSISTANT_INTENT_TRANSLATE_INFO)) {
            boolean attached = attachTranslateExtras(intent);
            recordTranslateExtrasAttachResult(attached);
        }

        if (!showSpeechRecognitionIntent(
                    windowAndroid, intent, source, VoiceIntentTarget.ASSISTANT)) {
            notifyVoiceAvailabilityImpacted();
            recordVoiceSearchFailureEvent(source, VoiceIntentTarget.ASSISTANT);

            return false;
        }

        return true;
    }

    /**
     * Returns true if the current tab's URL should be included with an Assistant intent initiated
     * via the given source.
     */
    private static boolean shouldAddPageUrl(@VoiceInteractionSource int source) {
        // Non-toolbar entrypoints (Omnibox, NTP, etc) obscure the current page contents and make it
        // less obvious that user actions in Assistant may interact with the current page. Omit the
        // page URL in those cases to signal to Assistant that page-actions (e.g. translate,
        // readout) should be disallowed.
        return source == VoiceInteractionSource.TOOLBAR && FeatureList.isInitialized()
                && ChromeFeatureList.isEnabled(ChromeFeatureList.ASSISTANT_INTENT_PAGE_URL);
    }

    /**
     * Returns the URL of the tab associated with this VoiceRecognitionHandler or null if it is not
     * available.
     */
    @Nullable
    private String getUrl() {
        LocationBarDataProvider locationBarDataProvider = mDelegate.getLocationBarDataProvider();
        if (locationBarDataProvider == null) return null;

        Tab currentTab = locationBarDataProvider.getTab();
        if (currentTab == null || currentTab.isIncognito()) {
            return null;
        }

        GURL pageUrl = currentTab.getUrl();
        if (!UrlUtilities.isHttpOrHttps(pageUrl)) return null;
        return pageUrl.getSpec();
    }

    /** Adds an Extra used to indicate to Assistant which experiment arm the user is in. */
    private void attachAssistantExperimentId(Intent intent) {
        String experimentId = ChromeFeatureList.getFieldTrialParamByFeature(
                ChromeFeatureList.ASSISTANT_INTENT_EXPERIMENT_ID,
                ASSISTANT_EXPERIMENT_ID_PARAM_NAME);
        if (!TextUtils.isEmpty(experimentId)) {
            intent.putExtra(EXTRA_EXPERIMENT_ID, experimentId);
        }
    }

    /**
     * Includes translate information, if available, as Extras in the given Assistant intent.
     *
     * @return True if the Extras were attached successfully (page was translatable, languages
     *         detected, etc), false otherwise.
     */
    private boolean attachTranslateExtras(Intent intent) {
        LocationBarDataProvider locationBarDataProvider = mDelegate.getLocationBarDataProvider();
        Tab currentTab = locationBarDataProvider != null ? locationBarDataProvider.getTab() : null;
        if (currentTab == null || currentTab.isIncognito()
                || !mTranslateBridgeWrapper.canManuallyTranslate(currentTab)) {
            return false;
        }

        // The page's URL is used to ensure the Translate intent doesn't translate the wrong page.
        String url = getUrl();
        // The presence of original and current language fields are used to indicate whether the
        // page is translated and/or is translatable. Only include them if they are both available.
        String originalLanguageCode = mTranslateBridgeWrapper.getOriginalLanguage(currentTab);
        String currentLanguageCode = mTranslateBridgeWrapper.getCurrentLanguage(currentTab);
        if (TextUtils.isEmpty(url) || TextUtils.isEmpty(originalLanguageCode)
                || TextUtils.isEmpty(currentLanguageCode)) {
            return false;
        }

        intent.putExtra(EXTRA_TRANSLATE_ORIGINAL_LANGUAGE, originalLanguageCode);
        intent.putExtra(EXTRA_TRANSLATE_CURRENT_LANGUAGE, currentLanguageCode);

        // If ASSISTANT_INTENT_PAGE_URL is enabled, the URL may have already been added.
        if (!intent.hasExtra(EXTRA_PAGE_URL)) {
            intent.putExtra(EXTRA_PAGE_URL, url);
        }

        // The target language is not necessary for Assistant to decide whether to show the
        // translate UI.
        String targetLanguageCode = mTranslateBridgeWrapper.getTargetLanguage();
        if (!TextUtils.isEmpty(targetLanguageCode)) {
            intent.putExtra(EXTRA_TRANSLATE_TARGET_LANGUAGE, targetLanguageCode);
        }
        return true;
    }

    /**
     * Shows a cancelable speech recognition intent, returning a boolean that indicates if it was
     * successfully shown.
     *
     * @param windowAndroid The {@link WindowAndroid} associated with the current {@link Tab}.
     * @param intent The speech recognition {@link Intent}.
     * @param source Where the request to launch this {@link Intent} originated, such as NTP or
     *        omnibox.
     * @param target The intended destination of this {@link Intent}, such as the system voice
     *        transcription service or Assistant.
     * @return True if showing the {@link Intent} was successful.
     */
    private boolean showSpeechRecognitionIntent(WindowAndroid windowAndroid, Intent intent,
            @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
        recordVoiceSearchStartEvent(source, target);
        return windowAndroid.showCancelableIntent(intent,
                       new VoiceRecognitionCompleteCallback(source, target),
                       R.string.voice_search_error)
                >= 0;
    }

    /**
     * @return Whether or not voice search is enabled.
     */
    public boolean isVoiceSearchEnabled() {
        LocationBarDataProvider locationBarDataProvider = mDelegate.getLocationBarDataProvider();
        if (locationBarDataProvider == null) return false;

        boolean isIncognito = locationBarDataProvider.isIncognito();
        WindowAndroid windowAndroid = mDelegate.getWindowAndroid();
        if (windowAndroid == null || isIncognito) return false;

        if (!windowAndroid.hasPermission(Manifest.permission.RECORD_AUDIO)
                && !windowAndroid.canRequestPermission(Manifest.permission.RECORD_AUDIO)) {
            return false;
        }

        if (FeatureList.isInitialized()
                && ChromeFeatureList.isEnabled(
                        ChromeFeatureList.VOICE_SEARCH_AUDIO_CAPTURE_POLICY)) {
            @Nullable
            PrefService prefService = getPrefService();
            // If the PrefService isn't initialized yet we won't know here whether or not voice
            // search is allowed by policy. In that case, treat voice search as enabled but check
            // again before starting voice search.
            if (prefService != null && !prefService.getBoolean(Pref.AUDIO_CAPTURE_ALLOWED)) {
                return false;
            }
        }

        Activity activity = windowAndroid.getActivity().get();
        return activity != null && isRecognitionIntentPresent(true);
    }

    /** Start tracking query duration by capturing when it started */
    private void startTrackingQueryDuration() {
        mQueryStartTimeMs = SystemClock.elapsedRealtime();
    }

    /** Record metrics that are only logged for successful intent responses. */
    @VisibleForTesting
    protected void recordSuccessMetrics(@VoiceInteractionSource int source,
            @VoiceIntentTarget int target, @AssistantActionPerformed int action) {
        // Defensive check to guard against onIntentResult being called more than once. This only
        // happens with assistant experiments. See crbug.com/1116927 for details.
        if (mQueryStartTimeMs == null) return;
        long elapsedTimeMs = SystemClock.elapsedRealtime() - mQueryStartTimeMs;
        mQueryStartTimeMs = null;

        recordVoiceSearchFinishEvent(source, target);
        recordVoiceSearchOpenDuration(target, elapsedTimeMs);

        // We should only record per-action metrics when the page URL feature is enabled. When
        // disabled, only transcription should occur.
        if (FeatureList.isInitialized()
                && ChromeFeatureList.isEnabled(ChromeFeatureList.ASSISTANT_INTENT_PAGE_URL)) {
            recordAssistantActionPerformed(source, action);
            recordPerActionVoiceSearchOpenDuration(action, elapsedTimeMs);
        }
    }

    /**
     * Records the source of a voice search initiation.
     * @param source The source of the voice search, such as NTP or omnibox. Values taken from the
     *        enum VoiceInteractionEventSource in enums.xml.
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     */
    @VisibleForTesting
    protected void recordVoiceSearchStartEvent(
            @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.StartEventSource", source, VoiceInteractionSource.NUM_ENTRIES);
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.StartEventTarget", target, VoiceIntentTarget.NUM_ENTRIES);
    }

    /**
     * Records the source of a successful voice search completion.
     * @param source The source of the voice search, such as NTP or omnibox. Values taken from the
     *        enum VoiceInteractionEventSource in enums.xml.
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     */
    @VisibleForTesting
    protected void recordVoiceSearchFinishEvent(
            @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.FinishEventSource", source, VoiceInteractionSource.NUM_ENTRIES);
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.FinishEventTarget", target, VoiceIntentTarget.NUM_ENTRIES);
    }

    /**
     * Records the source of a dismissed voice search.
     * @param source The source of the voice search, such as NTP or omnibox. Values taken from the
     *        enum VoiceInteractionEventSource in enums.xml.
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     */
    @VisibleForTesting
    protected void recordVoiceSearchDismissedEvent(
            @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
        RecordHistogram.recordEnumeratedHistogram("VoiceInteraction.DismissedEventSource", source,
                VoiceInteractionSource.NUM_ENTRIES);
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.DismissedEventTarget", target, VoiceIntentTarget.NUM_ENTRIES);
    }

    /**
     * Records the source of a failed voice search.
     * @param source The source of the voice search, such as NTP or omnibox. Values taken from the
     *        enum VoiceInteractionEventSource in enums.xml.
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     */
    @VisibleForTesting
    protected void recordVoiceSearchFailureEvent(
            @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.FailureEventSource", source, VoiceInteractionSource.NUM_ENTRIES);
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.FailureEventTarget", target, VoiceIntentTarget.NUM_ENTRIES);
    }

    /**
     * Records the source of an unexpected voice search result. Ideally this will always be 0.
     * @param source The source of the voice search, such as NTP or omnibox. Values taken from the
     *        enum VoiceInteractionEventSource in enums.xml.
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     */
    @VisibleForTesting
    protected void recordVoiceSearchUnexpectedResult(
            @VoiceInteractionSource int source, @VoiceIntentTarget int target) {
        RecordHistogram.recordEnumeratedHistogram("VoiceInteraction.UnexpectedResultSource", source,
                VoiceInteractionSource.NUM_ENTRIES);
        RecordHistogram.recordEnumeratedHistogram(
                "VoiceInteraction.UnexpectedResultTarget", target, VoiceIntentTarget.NUM_ENTRIES);
    }

    /**
     * Records the action performed by Assistant as a result of the voice search intent.
     * @param action The action performed, such as transcription or translation. Values taken from
     *        the enum AssistantActionPerformed in enums.xml.
     */
    @VisibleForTesting
    protected void recordAssistantActionPerformed(
            @VoiceInteractionSource int source, @AssistantActionPerformed int action) {
        String sourceSuffix = getHistogramSuffixForSource(source);
        if (sourceSuffix != null) {
            RecordHistogram.recordEnumeratedHistogram(
                    "VoiceInteraction.AssistantActionPerformed." + sourceSuffix, action,
                    AssistantActionPerformed.NUM_ENTRIES);
        }
    }

    /**
     * Records the result of a voice search.
     *
     * This also records submetrics split by the intent target.
     *
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     * @param result The result of a voice search, true if results were successfully returned.
     */
    @VisibleForTesting
    protected void recordVoiceSearchResult(@VoiceIntentTarget int target, boolean result) {
        RecordHistogram.recordBooleanHistogram("VoiceInteraction.VoiceSearchResult", result);

        String targetSuffix = getHistogramSuffixForTarget(target);
        if (targetSuffix != null) {
            RecordHistogram.recordBooleanHistogram(
                    "VoiceInteraction.VoiceSearchResult." + targetSuffix, result);
        }
    }

    /**
     * Records the voice search confidence value as a percentage, instead of the 0.0 to 1.0 range
     * we receive.
     *
     * This also records submetrics split by the intent target.
     *
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     * @param value The voice search confidence value we received from 0.0 to 1.0.
     */
    @VisibleForTesting
    protected void recordVoiceSearchConfidenceValue(@VoiceIntentTarget int target, float value) {
        int percentage = Math.round(value * 100f);
        RecordHistogram.recordPercentageHistogram(
                "VoiceInteraction.VoiceResultConfidenceValue", percentage);

        String targetSuffix = getHistogramSuffixForTarget(target);
        if (targetSuffix != null) {
            RecordHistogram.recordPercentageHistogram(
                    "VoiceInteraction.VoiceResultConfidenceValue." + targetSuffix, percentage);
        }
    }

    /**
     * Records the end-to-end voice search duration.
     *
     * This also records submetrics split by the intent target.
     *
     * @param target The intended recipient of the intent, such as the system voice transcription
     *        service or Assistant.
     * @param openDurationMs The duration, in milliseconds, between when a voice intent was
     *        initiated and when its result was returned.
     */
    private void recordVoiceSearchOpenDuration(@VoiceIntentTarget int target, long openDurationMs) {
        RecordHistogram.recordMediumTimesHistogram(
                "VoiceInteraction.QueryDuration.Android", openDurationMs);

        String targetSuffix = getHistogramSuffixForTarget(target);
        if (targetSuffix != null) {
            RecordHistogram.recordMediumTimesHistogram(
                    "VoiceInteraction.QueryDuration.Android.Target." + targetSuffix,
                    openDurationMs);
        }
    }

    /** Records end-to-end voice search duration split by the action performed. */
    private void recordPerActionVoiceSearchOpenDuration(
            @AssistantActionPerformed int action, long openDurationMs) {
        String actionSuffix = getHistogramSuffixForAction(action);
        RecordHistogram.recordMediumTimesHistogram(
                "VoiceInteraction.QueryDuration.Android." + actionSuffix, openDurationMs);
    }

    /** Records whether translate information was successfully attached to an Assistant intent. */
    @VisibleForTesting
    protected void recordTranslateExtrasAttachResult(boolean result) {
        RecordHistogram.recordBooleanHistogram(
                "VoiceInteraction.AssistantIntent.TranslateExtrasAttached", result);
    }

    /** Allows for overriding the TranslateBridgeWrapper for test purposes. */
    @VisibleForTesting
    protected void setTranslateBridgeWrapper(TranslateBridgeWrapper wrapper) {
        mTranslateBridgeWrapper = wrapper;
    }

    /**
     * Calls into {@link VoiceRecognitionUtil} to determine whether or not the
     * {@link RecognizerIntent#ACTION_RECOGNIZE_SPEECH} {@link Intent} is handled by any
     * {@link android.app.Activity}s in the system.
     *
     * @param useCachedValue Whether or not to use the cached value from a previous result.
     * @return {@code true} if recognition is supported.  {@code false} otherwise.
     */
    @VisibleForTesting
    protected boolean isRecognitionIntentPresent(boolean useCachedValue) {
        return VoiceRecognitionUtil.isRecognitionIntentPresent(useCachedValue);
    }

    /** Sets the start time for testing. */
    void setQueryStartTimeForTesting(Long queryStartTimeMs) {
        mQueryStartTimeMs = queryStartTimeMs;
    }

    /** Clean up. Creators must call this when the object is no longer needed. */
    public void destroy() {
        ProfileManager.removeObserver(this);
    }
}
