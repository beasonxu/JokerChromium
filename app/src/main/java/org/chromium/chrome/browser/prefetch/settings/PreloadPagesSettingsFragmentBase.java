// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.prefetch.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.preference.PreferenceFragmentCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import org.chromium.chrome.browser.feedback.FragmentHelpAndFeedbackLauncher;
import org.chromium.chrome.browser.feedback.HelpAndFeedbackLauncher;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.SettingsUtils;

/**
 * The base fragment class for Preload Pages settings fragments.
 */
public abstract class PreloadPagesSettingsFragmentBase
        extends PreferenceFragmentCompat implements FragmentHelpAndFeedbackLauncher {
    private HelpAndFeedbackLauncher mHelpAndFeedbackLauncher;

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        SettingsUtils.addPreferencesFromResource(this, getPreferenceResource());
        getActivity().setTitle(R.string.prefs_section_preload_pages_title);

        onCreatePreferencesInternal(bundle, s);

        setHasOptionsMenu(true);
    }

    @Override
    public void setHelpAndFeedbackLauncher(HelpAndFeedbackLauncher helpAndFeedbackLauncher) {
        mHelpAndFeedbackLauncher = helpAndFeedbackLauncher;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        MenuItem help =
                menu.add(Menu.NONE, R.id.menu_id_targeted_help, Menu.NONE, R.string.menu_help);
        help.setIcon(VectorDrawableCompat.create(
                getResources(), R.drawable.ic_help_and_feedback, getActivity().getTheme()));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != R.id.menu_id_targeted_help) {
            return false;
        }
        mHelpAndFeedbackLauncher.show(getActivity(), getString(R.string.help_context_privacy),
                Profile.getLastUsedRegularProfile(), null);
        return true;
    }

    /**
     * Called within {@link PreloadPagesSettingsFragmentBase#onCreatePreferences(Bundle, String)}.
     * If the child class needs to handle specific logic during preference creation, it can override
     * this method.
     *
     * @param bundle If the fragment is being re-created from a previous saved state, this is the
     *         state.
     * @param s If non-null, this preference should be rooted at the PreferenceScreen with this key.
     */
    protected void onCreatePreferencesInternal(Bundle bundle, String s) {}

    /**
     * @return The resource id of the preference.
     */
    protected abstract int getPreferenceResource();
}
