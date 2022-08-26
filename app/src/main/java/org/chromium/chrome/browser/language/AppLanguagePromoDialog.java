// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.language;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.IntDef;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.chromium.base.LocaleUtils;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.language.settings.LanguageItem;
import org.chromium.chrome.browser.language.settings.LanguagesManager;
import org.chromium.chrome.browser.translate.TranslateBridge;
import org.chromium.components.language.AndroidLanguageMetricsBridge;
import org.chromium.components.language.GeoLanguageProviderBridge;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.modaldialog.DialogDismissalCause;
import org.chromium.ui.modaldialog.ModalDialogManager;
import org.chromium.ui.modaldialog.ModalDialogProperties;
import org.chromium.ui.modaldialog.SimpleModalDialogController;
import org.chromium.ui.modelutil.PropertyModel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;

/**
 * Implements a modal dialog that prompts the user to change their UI language. Displayed once at
 * browser startup when no other promo or modals are shown.
 */
public class AppLanguagePromoDialog {
    private Activity mActivity;
    private ModalDialogManager mModalDialogManager;
    private PropertyModel mAppLanguageModal;
    private PropertyModel mLoadingModal;
    private LanguageItemAdapter mAdapter;
    private RestartAction mRestartAction;

    /** Annotation for row item type. Either a LanguageItem or separator */
    @IntDef({ItemType.LANGUAGE, ItemType.SEPARATOR, ItemType.MORE_LANGUAGES})
    @Retention(RetentionPolicy.SOURCE)
    private @interface ItemType {
        int LANGUAGE = 0;
        int SEPARATOR = 1;
        int MORE_LANGUAGES = 2;
    }

    /**
     * Annotation for the action taken on the language dialog.
     * Do not reorder or remove items, only add new items before NUM_ENTRIES.
     * Keep in sync with LanguageSettingsAppLanguagePromptAction from enums.xml.
     */
    @IntDef({ActionType.DISMISSED_CANCEL_BUTTON, ActionType.DISMISSED_SYSTEM_BACK,
            ActionType.OK_CHANGE_LANGUAGE, ActionType.OK_SAME_LANGUAGE, ActionType.OTHER})
    @Retention(RetentionPolicy.SOURCE)
    private @interface ActionType {
        int DISMISSED_CANCEL_BUTTON = 0;
        int DISMISSED_SYSTEM_BACK = 1;
        int OK_CHANGE_LANGUAGE = 2;
        int OK_SAME_LANGUAGE = 3;
        int OTHER = 4;
        int NUM_ENTRIES = 5;
    }

    /**
     * Interface for holding the Chrome restart action.
     */
    @FunctionalInterface
    public interface RestartAction {
        void restart();
    }

    public AppLanguagePromoDialog(Activity activity,
            ObservableSupplier<ModalDialogManager> modalDialogManagerSupplier,
            RestartAction restartAction) {
        mActivity = activity;
        mModalDialogManager = modalDialogManagerSupplier.get();
        mRestartAction = restartAction;

        Resources resources = mActivity.getResources();
        mAppLanguageModal =
                new PropertyModel.Builder(ModalDialogProperties.ALL_KEYS)
                        .with(ModalDialogProperties.CONTROLLER,
                                new SimpleModalDialogController(
                                        mModalDialogManager, this::onDismissAppLanguageModal))
                        .with(ModalDialogProperties.TITLE, resources, R.string.languages_srp_title)
                        .with(ModalDialogProperties.POSITIVE_BUTTON_TEXT, resources, R.string.ok)
                        .with(ModalDialogProperties.NEGATIVE_BUTTON_TEXT, resources,
                                R.string.cancel)
                        .with(ModalDialogProperties.BUTTON_STYLES,
                                ModalDialogProperties.ButtonStyles.PRIMARY_FILLED_NEGATIVE_OUTLINE)
                        .build();

        mLoadingModal = new PropertyModel.Builder(ModalDialogProperties.ALL_KEYS)
                                .with(ModalDialogProperties.CONTROLLER,
                                        new SimpleModalDialogController(
                                                mModalDialogManager, this::onDismissConfirmModal))
                                .build();
    }

    /**
     * Internal class for managing a list of languages in a RecyclerView.
     * TODO(https://crbug.com/1325473) Refactor this to a separate file.
     */
    protected static class LanguageItemAdapter
            extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private ArrayList<LanguageItem> mTopLanguages;
        private ArrayList<LanguageItem> mOtherLanguages;
        private LanguageItem mCurrentLanguage;
        private boolean mShowOtherLanguages;

        /**
         * @param topLanguages - LanguageItems to appear at the top of the adapter list.
         * @param otherLanguages - LanguageItems to appear below the top languages.
         * @param currentLanguage - The currently selected app language.
         */
        public LanguageItemAdapter(Collection<LanguageItem> topLanguages,
                Collection<LanguageItem> otherLanguages, LanguageItem currentLanguage) {
            mTopLanguages = new ArrayList<LanguageItem>(topLanguages);
            mOtherLanguages = new ArrayList<LanguageItem>(otherLanguages);
            mCurrentLanguage = currentLanguage;
        }

        @Override
        public int getItemViewType(int position) {
            // The separator or "More languages" item is between top and other languages.
            if (position != mTopLanguages.size()) return ItemType.LANGUAGE;
            return mShowOtherLanguages ? ItemType.SEPARATOR : ItemType.MORE_LANGUAGES;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            switch (viewType) {
                case ItemType.LANGUAGE:
                    return new AppLanguagePromptRowViewHolder(
                            LayoutInflater.from(parent.getContext())
                                    .inflate(R.layout.app_language_prompt_row, parent, false));
                case ItemType.MORE_LANGUAGES:
                    return new MoreLanguagesRowViewHolder(
                            LayoutInflater.from(parent.getContext())
                                    .inflate(R.layout.app_language_prompt_more_languages, parent,
                                            false));
                case ItemType.SEPARATOR:
                    return new SeparatorViewHolder(
                            LayoutInflater.from(parent.getContext())
                                    .inflate(R.layout.language_ask_prompt_row_separator, parent,
                                            false));
                default:
                    assert false : "No matching viewType";
                    return null;
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (getItemViewType(position) == ItemType.LANGUAGE) {
                LanguageItem languageItem = getLanguageItemAt(position);
                ((AppLanguagePromptRowViewHolder) holder)
                        .bindViewHolder(languageItem, languageItem.equals(mCurrentLanguage));
            }
        }

        /**
         * Modify the LanguageItemAdapter to show the other languages in addition to the top
         * languages. Can only called once. The other languages can not be hidden once shown.
         */
        public void showOtherLanguages() {
            mShowOtherLanguages = true;
            notifyItemRemoved(mTopLanguages.size()); // Remove "More languages" item.
            // Other languages plus a horizontal separator have been added.
            notifyItemRangeInserted(mTopLanguages.size(), mOtherLanguages.size() + 1);
        }

        /**
         * Set the currently selected LanguageItem based on the position.
         * TODO(https://crbug.com/1325522) Refactor to not use notifyDataSetChanged.
         * @param position Offset of the LanguageItem to select.
         */
        public void setSelectedLanguage(int position) {
            mCurrentLanguage = getLanguageItemAt(position);
            notifyDataSetChanged();
        }

        /**
         * Return the number of items in the list making room for the list separator or more
         * languages item.
         */
        @Override
        public int getItemCount() {
            // The top languages and a separator or "More languages" item are always shown.
            int count = mTopLanguages.size() + 1;
            if (mShowOtherLanguages) {
                count += mOtherLanguages.size();
            }
            return count;
        }

        public LanguageItem getSelectedLanguage() {
            return mCurrentLanguage;
        }

        public boolean isTopLanguageSelected() {
            return mTopLanguages.contains(mCurrentLanguage);
        }

        public boolean areOtherLanguagesShown() {
            return mShowOtherLanguages;
        }

        protected LanguageItem getLanguageItemAt(int position) {
            if (position < mTopLanguages.size()) {
                return mTopLanguages.get(position);
            } else if (position > mTopLanguages.size()) {
                // Other languages are offset by one from the seperator.
                return mOtherLanguages.get(position - mTopLanguages.size() - 1);
            }
            assert false : "The language item at the separator can not be accessed";
            return null;
        }
    }

    /**
     * Internal class representing an individual language row.
     */
    private static class AppLanguagePromptRowViewHolder
            extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mPrimaryNameTextView;
        private TextView mSecondaryNameTextView;
        private RadioButton mRadioButton;

        AppLanguagePromptRowViewHolder(View view) {
            super(view);
            mPrimaryNameTextView = ((TextView) itemView.findViewById(R.id.primary_language_name));
            mSecondaryNameTextView =
                    ((TextView) itemView.findViewById(R.id.secondary_language_name));
            mRadioButton =
                    ((RadioButton) itemView.findViewById(R.id.app_language_prompt_radiobutton));

            view.setOnClickListener(this);
            mRadioButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View row) {
            LanguageItemAdapter adapter = (LanguageItemAdapter) getBindingAdapter();
            int position = getBindingAdapterPosition();
            if (position == RecyclerView.NO_POSITION) {
                // NO_POSITION will be returned if no layout pass has been done since the last call
                // to RecyclerView.Adapter.notifyDataSetChanged(). In that case we should not
                // update the new selected language.
                return;
            }
            adapter.setSelectedLanguage(position);
            View positiveButton = row.getRootView().findViewById(R.id.positive_button);
            if (positiveButton != null) {
                positiveButton.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_FOCUSED);
            }
        }

        public void bindViewHolder(LanguageItem languageItem, boolean checked) {
            mRadioButton.setChecked(checked);
            mRadioButton.setContentDescription(languageItem.getDisplayName());
            if (languageItem.isSystemDefault()) {
                // For the system default locale the display name should be the primary TextView.
                mPrimaryNameTextView.setText(languageItem.getDisplayName());
                mSecondaryNameTextView.setText(languageItem.getNativeDisplayName());
            } else {
                mPrimaryNameTextView.setText(languageItem.getNativeDisplayName());
                mSecondaryNameTextView.setText(languageItem.getDisplayName());
            }
        }
    }

    /**
     * Internal class representing the "More languages" list item.
     */
    private static class MoreLanguagesRowViewHolder
            extends RecyclerView.ViewHolder implements View.OnClickListener {
        MoreLanguagesRowViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View row) {
            // TODO(https://crbug.com/1325471) Add meteric recording action.
            LanguageItemAdapter adapter = (LanguageItemAdapter) getBindingAdapter();
            adapter.showOtherLanguages();
        }
    }

    /**
     * Internal class representing the separator row.
     */
    private static class SeparatorViewHolder extends RecyclerView.ViewHolder {
        SeparatorViewHolder(View view) {
            super(view);
        }
    }

    /**
     * Show the app language modal and add a custom view holding a list of languages with the
     * current location's and users preferred languages at the top.
     */
    protected void showAppLanguageModal() {
        // Setup initial language lists.
        LanguageItem currentOverrideLanguage =
                LanguagesManager.getInstance().getLanguageItem(AppLocaleUtils.getAppLanguagePref());
        LinkedHashSet<LanguageItem> uiLanguages = new LinkedHashSet<LanguageItem>(
                LanguagesManager.getInstance().getAllPossibleUiLanguages());
        LinkedHashSet<LanguageItem> topLanguages =
                getTopLanguages(uiLanguages, currentOverrideLanguage);
        uiLanguages.removeAll(topLanguages);
        mAdapter = new LanguageItemAdapter(topLanguages, uiLanguages, currentOverrideLanguage);
        // Release all static LanguagesManager resources since they are no longer needed.
        LanguagesManager.recycle();

        // Setup RecyclerView.
        View customView = LayoutInflater.from(mActivity).inflate(
                R.layout.app_language_prompt_content, null, false);
        RecyclerView list = customView.findViewById(R.id.app_language_prompt_content_recycler_view);
        list.setAdapter(mAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mActivity);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        list.setLayoutManager(linearLayoutManager);

        // Make top and bottom shadow visible when needed.
        ImageView topShadow = customView.findViewById(R.id.top_shadow);
        ImageView bottomShadow = customView.findViewById(R.id.bottom_shadow);
        list.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                if (recyclerView.canScrollVertically(-1)) {
                    topShadow.setVisibility(View.VISIBLE);
                } else {
                    topShadow.setVisibility(View.GONE);
                }

                if (recyclerView.canScrollVertically(1)) {
                    bottomShadow.setVisibility(View.VISIBLE);
                } else {
                    bottomShadow.setVisibility(View.GONE);
                }
            }
        });

        mAppLanguageModal.set(ModalDialogProperties.CUSTOM_VIEW, customView);
        mModalDialogManager.showDialog(mAppLanguageModal, ModalDialogManager.ModalDialogType.APP);
    }

    public void onDismissAppLanguageModal(@DialogDismissalCause int dismissalCause) {
        if (dismissalCause == DialogDismissalCause.POSITIVE_BUTTON_CLICKED) {
            String languageCode = mAdapter.getSelectedLanguage().getCode();
            if (AppLocaleUtils.isAppLanguagePref(languageCode)) {
                recordDismissAction(ActionType.OK_SAME_LANGUAGE);
            } else {
                recordDismissAction(ActionType.OK_CHANGE_LANGUAGE);
            }
            startAppLanguageInstall();
        } else if (dismissalCause == DialogDismissalCause.NEGATIVE_BUTTON_CLICKED) {
            recordDismissAction(ActionType.DISMISSED_CANCEL_BUTTON);
        } else if (dismissalCause == DialogDismissalCause.NAVIGATE_BACK_OR_TOUCH_OUTSIDE) {
            recordDismissAction(ActionType.DISMISSED_SYSTEM_BACK);
        } else {
            recordDismissAction(ActionType.OTHER);
        }
        recordOtherLanguagesShown(mAdapter.areOtherLanguagesShown());
        TranslateBridge.setAppLanguagePromptShown();
    }

    public void onDismissConfirmModal(@DialogDismissalCause int dismissalCause) {
        // No action is taken if the confirm modal is dismissed.
    }

    /**
     * Return an ordered set of LanguageItems that should be shown at the top of the list. These
     * languages come from the user's current location and preferred languages. The original
     * system language is replaced with a value that follows the current device language and is
     * added to the top of the list.
     * @param uiLanguages Collection of possible UI languages.
     * @param currentOverrideLanguage The LanguageItem representing the current UI language.
     * @return An ordered set of LanguageItems.
     */
    private static LinkedHashSet<LanguageItem> getTopLanguages(
            Collection<LanguageItem> uiLanguages, LanguageItem currentOverrideLanguage) {
        LinkedHashSet<String> topLanguageCodes =
                new LinkedHashSet<>(GeoLanguageProviderBridge.getCurrentGeoLanguages());
        topLanguageCodes.addAll(TranslateBridge.getUserLanguageCodes());

        Locale originalSystemLocale =
                GlobalAppLocaleController.getInstance().getOriginalSystemLocale();
        return getTopLanguagesHelper(
                uiLanguages, topLanguageCodes, currentOverrideLanguage, originalSystemLocale);
    }

    /**
     * Helper function isolating the logic for making the top language list for testing. Adds the
     * system default language to the top of the list if needed and only adds top languages that are
     * possible UI languages.
     * @param uiLanguages Collection of possible UI languages.
     * @param topLanguageCodes Ordered set of potential top languages tags.
     * @param currentOverrideLanguage The LanguageItem representing the current UI language.
     * @param originalSystemLocale Locale of the original device language before any override.
     * @return An ordered set of LanguageItems.
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    static LinkedHashSet<LanguageItem> getTopLanguagesHelper(Collection<LanguageItem> uiLanguages,
            LinkedHashSet<String> topLanguageCodes, LanguageItem currentOverrideLanguage,
            Locale originalSystemLocale) {
        // Remove the exact language from top language codes if there are multiple UI languages
        // with the same base, otherwise remove the base language.
        if (AppLocaleUtils.hasMultipleUiLanguageVariants(originalSystemLocale.toLanguageTag())) {
            topLanguageCodes.remove(originalSystemLocale.toLanguageTag());
        } else {
            topLanguageCodes.remove(originalSystemLocale.getLanguage());
        }

        // The system default language should always be at the top of the list unless the current
        // override language is equal to the original system language. In that case only the
        // current override language is added to the top of the list.
        LinkedHashSet<LanguageItem> topLanguages = new LinkedHashSet<>();
        if (currentOverrideLanguage.isSystemDefault()) {
            topLanguages.add(LanguageItem.makeFollowSystemLanguageItem());
        } else if (!isOverrideLanguageOriginalSystemLanguage(
                           currentOverrideLanguage, originalSystemLocale)) {
            topLanguages.add(LanguageItem.makeFollowSystemLanguageItem());
            topLanguages.add(currentOverrideLanguage);
        } else {
            // The current override language can only be the original system language if it has
            // already been changed in settings. The option to track the system language is not
            // given in the app language promo - but can be reset from Language Settings.
            topLanguages.add(currentOverrideLanguage);
        }

        // Make a map of code -> LanguageItem for UI languages
        HashMap<String, LanguageItem> uiLanguagesMap = new HashMap<>();
        for (LanguageItem item : uiLanguages) {
            uiLanguagesMap.put(item.getCode(), item);
        }
        // Only add top languages that can be UI languages.
        for (String code : topLanguageCodes) {
            LanguageItem item = uiLanguagesMap.get(code);
            if (item != null) topLanguages.add(item);
        }
        return topLanguages;
    }

    /**
     * Returns true if the current override language is the same as the original system language.
     * For languages that have only one Chrome UI language variant the base languages are compared
     * and for languages with multiple Chrome UI languages the full language tag is compared.
     * @param overrideLanguage LanguageItem for the current override language.
     * @param originalSystemLocale String language code for the original system locale.
     * @return Whether or not the override language is the same as the original system language.
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    static boolean isOverrideLanguageOriginalSystemLanguage(
            LanguageItem overrideLanguage, Locale originalSystemLocale) {
        if (overrideLanguage.isSystemDefault()) {
            return false;
        }
        if (AppLocaleUtils.hasMultipleUiLanguageVariants(overrideLanguage.getCode())) {
            return TextUtils.equals(
                    overrideLanguage.getCode(), originalSystemLocale.toLanguageTag());
        }
        return LocaleUtils.isBaseLanguageEqual(
                overrideLanguage.getCode(), originalSystemLocale.toLanguageTag());
    }

    /**
     * Show the confirm modal with a progress spinner and start the language split install. Chrome
     * will restart once the language split has been downloaded. If the download fails an error
     * message is shown.
     */
    private void startAppLanguageInstall() {
        View customView = LayoutInflater.from(mActivity).inflate(
                R.layout.app_language_confirm_content, null, false);
        LanguageItem selectedLanguage = mAdapter.getSelectedLanguage();
        CharSequence messageText = mActivity.getResources().getString(
                R.string.languages_srp_loading_text, selectedLanguage.getDisplayName());
        TextView messageView = customView.findViewById(R.id.message);
        messageView.setText(messageText);

        mLoadingModal.set(ModalDialogProperties.CUSTOM_VIEW, customView);

        // Only show the modal if the selected language is not installed.
        if (!LanguageSplitInstaller.getInstance().isLanguageSplitInstalled(
                    selectedLanguage.getCode())) {
            mModalDialogManager.showDialog(mLoadingModal, ModalDialogManager.ModalDialogType.APP);
        }

        boolean isSelectedCurrentUI = AppLocaleUtils.isAppLanguagePref(selectedLanguage.getCode());
        if (!isSelectedCurrentUI) {
            // Only record isTopLanguage if the app language has changed.
            recordIsTopLanguage(mAdapter.isTopLanguageSelected());
        }
        AndroidLanguageMetricsBridge.reportAppLanguagePromptLanguage(
                selectedLanguage.isSystemDefault() ? "" : selectedLanguage.getCode());

        // Create call back for after language split install completes.
        AppLocaleUtils.setAppLanguagePref(selectedLanguage.getCode(), (success) -> {
            if (success) {
                if (!isSelectedCurrentUI) {
                    // Only restart if the new language is different than the current UI.
                    mRestartAction.restart();
                }
            } else {
                // The loading language modal will always already be shown if a download fails.
                CharSequence failedText = mActivity.getResources().getString(
                        R.string.languages_split_failed, selectedLanguage.getDisplayName());
                messageView.setText(failedText);
                mLoadingModal.set(ModalDialogProperties.POSITIVE_BUTTON_TEXT,
                        mActivity.getText(R.string.ok).toString());
            }
        });
    }

    /**
     * Displays starts showing the App language prompt if the experiment is enabled.
     * @param activity The current activity to display the prompt into.
     * @param modalDialogManagerSupplier Supplier of {@link ModalDialogManager}.
     * @return Whether the prompt was shown or not.
     */
    public static boolean maybeShowPrompt(Activity activity,
            ObservableSupplier<ModalDialogManager> modalDialogManagerSupplier,
            RestartAction restartAction) {
        if (!shouldShowPrompt()) return false;

        AppLanguagePromoDialog prompt =
                new AppLanguagePromoDialog(activity, modalDialogManagerSupplier, restartAction);
        prompt.showAppLanguageModal();
        return true;
    }

    /**
     * @return Whether the app language prompt should be shown or not.
     */
    private static boolean shouldShowPrompt() {
        // Skip feature and preference checks if forced on for testing.
        if (!ChromeFeatureList.isEnabled(ChromeFeatureList.FORCE_APP_LANGUAGE_PROMPT)) {
            // Don't show if prompt has already been shown.
            if (TranslateBridge.getAppLanguagePromptShown()) return false;
            boolean hasULPMatch =
                    LanguageBridge.isTopULPBaseLanguage(Locale.getDefault().toLanguageTag());
            recordTopULPMatchStatus(hasULPMatch);
            // Don't show if not enabled.
            if (!ChromeFeatureList.isEnabled(ChromeFeatureList.APP_LANGUAGE_PROMPT)) return false;
            // Don't show if ULP match is enabled and the UI language matches the top ULP language.
            if (ChromeFeatureList.isEnabled(ChromeFeatureList.APP_LANGUAGE_PROMPT_ULP)
                    && hasULPMatch) {
                return false;
            }
        }

        boolean isOnline = NetworkChangeNotifier.isOnline();
        recordOnlineStatus(isOnline);

        // Only show the prompt if online.
        return isOnline;
    }

    /**
     * Record the action type when dismissing the dialog and how long the dialog was shown for.
     * @param @ActionType int.
     */
    private static void recordDismissAction(@ActionType int actionType) {
        RecordHistogram.recordEnumeratedHistogram(
                "LanguageSettings.AppLanguagePrompt.Action", actionType, ActionType.NUM_ENTRIES);
    }

    private static void recordOnlineStatus(boolean isOnline) {
        RecordHistogram.recordBooleanHistogram(
                "LanguageSettings.AppLanguagePrompt.IsOnline", isOnline);
    }

    private static void recordTopULPMatchStatus(boolean hasMatch) {
        RecordHistogram.recordBooleanHistogram(
                "LanguageSettings.AppLanguagePrompt.HasTopULPMatch", hasMatch);
    }

    private static void recordIsTopLanguage(boolean isTopLanguage) {
        RecordHistogram.recordBooleanHistogram(
                "LanguageSettings.AppLanguagePrompt.IsTopLanguageSelected", isTopLanguage);
    }

    private static void recordOtherLanguagesShown(boolean shown) {
        RecordHistogram.recordBooleanHistogram(
                "LanguageSettings.AppLanguagePrompt.OtherLanguagesShown", shown);
    }
}
