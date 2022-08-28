// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.prefetch.settings;
import org.chromium.chrome.R;
/**
 * Fragment containing extended preloading settings.
 */
public class ExtendedPreloadingSettingsFragment extends PreloadPagesSettingsFragmentBase {
    @Override
    protected int getPreferenceResource() {
        return R.xml.extended_preloading_preferences;
    }
}
