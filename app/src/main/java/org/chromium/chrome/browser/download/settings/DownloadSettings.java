// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.download.settings;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import org.chromium.chrome.browser.download.DownloadDialogBridge;
import org.chromium.chrome.browser.download.DownloadLaterPromptStatus;
import org.chromium.chrome.browser.download.DownloadPromptStatus;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.preferences.Pref;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.ChromeManagedPreferenceDelegate;
import org.chromium.components.browser_ui.settings.ChromeSwitchPreference;
import org.chromium.components.browser_ui.settings.ManagedPreferenceDelegate;
import org.chromium.components.browser_ui.settings.SettingsUtils;
import org.chromium.components.prefs.PrefService;
import org.chromium.components.user_prefs.UserPrefs;

/**
 * Fragment containing Download settings.
 */
public class DownloadSettings
        extends PreferenceFragmentCompat implements Preference.OnPreferenceChangeListener {
    public static final String PREF_LOCATION_CHANGE = "location_change";
    public static final String PREF_DOWNLOAD_LATER_PROMPT_ENABLED = "download_later_prompt_enabled";
    public static final String PREF_LOCATION_PROMPT_ENABLED = "location_prompt_enabled";

    private PrefService mPrefService;
    private DownloadLocationPreference mLocationChangePref;
    private ChromeSwitchPreference mDownloadLaterPromptEnabledPref;
    private ChromeSwitchPreference mLocationPromptEnabledPref;
    private ManagedPreferenceDelegate mLocationPromptEnabledPrefDelegate;

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, String s) {
        getActivity().setTitle(R.string.menu_downloads);
        SettingsUtils.addPreferencesFromResource(this, R.xml.download_preferences);
        mPrefService = UserPrefs.get(Profile.getLastUsedRegularProfile());

        mDownloadLaterPromptEnabledPref =
                (ChromeSwitchPreference) findPreference(PREF_DOWNLOAD_LATER_PROMPT_ENABLED);
        mDownloadLaterPromptEnabledPref.setOnPreferenceChangeListener(this);

        boolean locationManaged = DownloadDialogBridge.isLocationDialogManaged();
        if (locationManaged || !ChromeFeatureList.isEnabled(ChromeFeatureList.DOWNLOAD_LATER)) {
            getPreferenceScreen().removePreference(
                    findPreference(PREF_DOWNLOAD_LATER_PROMPT_ENABLED));
        }

        mLocationPromptEnabledPref =
                (ChromeSwitchPreference) findPreference(PREF_LOCATION_PROMPT_ENABLED);
        mLocationPromptEnabledPref.setOnPreferenceChangeListener(this);
        mLocationPromptEnabledPrefDelegate = new ChromeManagedPreferenceDelegate() {
            @Override
            public boolean isPreferenceControlledByPolicy(Preference preference) {
                return DownloadDialogBridge.isLocationDialogManaged();
            }
        };
        mLocationPromptEnabledPref.setManagedPreferenceDelegate(mLocationPromptEnabledPrefDelegate);
        mLocationChangePref = (DownloadLocationPreference) findPreference(PREF_LOCATION_CHANGE);
    }

    @Override
    public void onDisplayPreferenceDialog(Preference preference) {
        if (preference instanceof DownloadLocationPreference) {
            DownloadLocationPreferenceDialog dialogFragment =
                    DownloadLocationPreferenceDialog.newInstance(
                            (DownloadLocationPreference) preference);
            dialogFragment.setTargetFragment(this, 0);
            dialogFragment.show(getFragmentManager(), DownloadLocationPreferenceDialog.TAG);
        } else {
            super.onDisplayPreferenceDialog(preference);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateDownloadSettings();
    }

    private void updateDownloadSettings() {
        mLocationChangePref.updateSummary();

        if (ChromeFeatureList.isEnabled(ChromeFeatureList.DOWNLOAD_LATER)) {
            @DownloadLaterPromptStatus
            int downloadLaterPromptStatus =
                    mPrefService.getInteger(Pref.DOWNLOAD_LATER_PROMPT_STATUS);
            mDownloadLaterPromptEnabledPref.setChecked(
                    !(downloadLaterPromptStatus == DownloadLaterPromptStatus.DONT_SHOW));
        }

        if (DownloadDialogBridge.isLocationDialogManaged()) {
            // Location prompt can be controlled by the enterprise policy.
            mLocationPromptEnabledPref.setChecked(
                    DownloadDialogBridge.getPromptForDownloadPolicy());
        } else {
            // Location prompt is marked enabled if the prompt status is not DONT_SHOW.
            boolean isLocationPromptEnabled = DownloadDialogBridge.getPromptForDownloadAndroid()
                    != DownloadPromptStatus.DONT_SHOW;
            mLocationPromptEnabledPref.setChecked(isLocationPromptEnabled);
            mLocationPromptEnabledPref.setEnabled(true);
        }
    }

    // Preference.OnPreferenceChangeListener implementation.
    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        if (PREF_DOWNLOAD_LATER_PROMPT_ENABLED.equals(preference.getKey())) {
            if (!ChromeFeatureList.isEnabled(ChromeFeatureList.DOWNLOAD_LATER)) return false;
            @DownloadLaterPromptStatus
            int downloadLaterPromptStatus =
                    mPrefService.getInteger(Pref.DOWNLOAD_LATER_PROMPT_STATUS);
            if (!(boolean) newValue) {
                mPrefService.setInteger(
                        Pref.DOWNLOAD_LATER_PROMPT_STATUS, DownloadLaterPromptStatus.DONT_SHOW);
                return true;
            }

            // Only update if the download later dialog has been shown before.
            if (downloadLaterPromptStatus != DownloadLaterPromptStatus.SHOW_INITIAL) {
                mPrefService.setInteger(Pref.DOWNLOAD_LATER_PROMPT_STATUS,
                        DownloadLaterPromptStatus.SHOW_PREFERENCE);
            }
        } else if (PREF_LOCATION_PROMPT_ENABLED.equals(preference.getKey())) {
            if ((boolean) newValue) {
                // Only update if the download location dialog has been shown before.
                if (DownloadDialogBridge.getPromptForDownloadAndroid()
                        != DownloadPromptStatus.SHOW_INITIAL) {
                    DownloadDialogBridge.setPromptForDownloadAndroid(
                            DownloadPromptStatus.SHOW_PREFERENCE);
                }
            } else {
                DownloadDialogBridge.setPromptForDownloadAndroid(DownloadPromptStatus.DONT_SHOW);
            }
        }
        return true;
    }

    @VisibleForTesting
    public ManagedPreferenceDelegate getLocationPromptEnabledPrefDelegateForTesting() {
        return mLocationPromptEnabledPrefDelegate;
    }
}
