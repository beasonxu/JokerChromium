// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.ui.dragdrop;

import android.content.Intent;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/**
 * Delegate for browser related functions used by Drag and Drop.
 */
public interface DragAndDropBrowserDelegate {
    /** Get whether to support the image drop into Chrome */
    boolean getSupportDropInChrome();

    /** Request DragAndDropPermissions. */
    DragAndDropPermissions getDragAndDropPermissions(DragEvent dropEvent);

    /** Create an intent from a dragged text link. */
    Intent createLinkIntent(String urlString);
}
