// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.customtabs;

import android.support.test.InstrumentationRegistry;

import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;

/**
 * Fake default browser provider implementation to inject into
 * CustomTabActivityNavigationController.
 *
 * Required for all tests which call {@link
 * CustomTabActivityNavigationController#openCurrentUrlInBrowser}.
 */
public class FakeDefaultBrowserProviderImpl
        implements CustomTabActivityNavigationController.DefaultBrowserProvider {
    @Override
    public String getDefaultBrowser() {
        return InstrumentationRegistry.getTargetContext().getPackageName();
    }
}
