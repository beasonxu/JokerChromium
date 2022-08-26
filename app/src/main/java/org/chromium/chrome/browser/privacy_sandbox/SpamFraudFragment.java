// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.privacy_sandbox;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import org.chromium.components.browser_ui.settings.SettingsUtils;

/**
 * Settings fragment for privacy sandbox settings.
 */
public class SpamFraudFragment extends PreferenceFragmentCompat {
    private static final String SPAM_FRAUD_DESCRIPTION = "spam_fraud_description";

    /**
     * Initializes all the objects related to the preferences page.
     */
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        getActivity().setTitle(R.string.privacy_sandbox_spam_fraud_title);
        SettingsUtils.addPreferencesFromResource(this, R.xml.spam_fraud_preference);
        int description = PrivacySandboxBridge.isPrivacySandboxEnabled()
                ? R.string.privacy_sandbox_spam_fraud_description_trials_on
                : R.string.privacy_sandbox_spam_fraud_description_trials_off;
        findPreference(SPAM_FRAUD_DESCRIPTION).setSummary(description);
    }
}
