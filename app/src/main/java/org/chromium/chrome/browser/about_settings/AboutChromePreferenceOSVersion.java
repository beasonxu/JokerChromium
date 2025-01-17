// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.about_settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.omaha.VersionNumberGetter;

/**
 * Preference specifically made for the Android OS version. It supports displaying a warning when
 * the current OS version is unsupported.
 */
public class AboutChromePreferenceOSVersion extends Preference {
    /**
     * Constructor for inflating from XML.
     */
    public AboutChromePreferenceOSVersion(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        // Show additional information only if the OS version is not supported.
        if (VersionNumberGetter.isCurrentOsVersionSupported()) return;

        ViewGroup root = (ViewGroup) holder.findViewById(android.R.id.summary).getParent();
        LayoutInflater.from(getContext()).inflate(R.layout.os_version_unsupported_text, root, true);
    }
}
