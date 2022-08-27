// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
package org.chromium.chrome.browser.content_creation.notes.top_bar;

import android.content.Context;
import android.view.View;

import org.chromium.chrome.R;

/**
 * Coordinator for the TopBar.
 */
public class TopBarCoordinator {
    public TopBarCoordinator(Context context, View parentView, TopBarDelegate delegate) {
        TopBarView topBarView = (TopBarView) parentView.findViewById(R.id.top_bar);
        topBarView.setOnCloseListener(delegate::dismiss);
        topBarView.setOnPublishListener(delegate::publish);
        topBarView.setOnNextListener(delegate::executeAction);
    }
}