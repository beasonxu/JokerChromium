// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.dependency_injection;

import dagger.Subcomponent;

/**
 * Activity-scoped component associated with {@link org.chromium.chrome.browser.ChromeActivity}.
 */
@Subcomponent(modules = {ChromeActivityCommonsModule.class})
@ActivityScope
public interface ChromeActivityComponent {
    ChromeAppComponent getParent();
}
