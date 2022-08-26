// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.autofill.prefeditor;

import androidx.annotation.Nullable;

import org.chromium.components.autofill.prefeditor.EditorFieldModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of an editor layout. Can be used, for example, to edit contact information.
 */
public class EditorModel {
    private final String mTitle;
    @Nullable
    private final String mCustomDoneButtonText;
    private final List<EditorFieldModel> mFields;
    @Nullable
    private Runnable mDoneCallback;
    @Nullable
    private Runnable mCancelCallback;

    /**
     * Constructs an editor model with default done button text.
     *
     * @param title The title for the editor window.
     */
    public EditorModel(String title) {
        this(title, null);
    }

    /**
     * Constructs an editor model.
     *
     * @param title The title for the editor window.
     * @param customDoneButtonText The text to display on the done button. If null, the default
     *        value will be used.
     */
    public EditorModel(String title, @Nullable String customDoneButtonText) {
        mTitle = title;
        mCustomDoneButtonText = customDoneButtonText;
        mFields = new ArrayList<>();
    }

    /** @return The title of the editor window. */
    public String getTitle() {
        return mTitle;
    }

    /** @return The custom text on the done button or null if the default value should be used. */
    @Nullable
    public String getCustomDoneButtonText() {
        return mCustomDoneButtonText;
    }

    /** @return The input fields for the editor. */
    public List<EditorFieldModel> getFields() {
        return mFields;
    }

    /**
     * Adds an input field to the editor.
     *
     * @param field The input field to add.
     */
    public void addField(EditorFieldModel field) {
        mFields.add(field);
    }

    /**
     * Removes all fields from the editor. The field contents are not altered.
     */
    public void removeAllFields() {
        mFields.clear();
    }

    /**
     * Specifies the callback to invoke when the user clicks "Done."
     *
     * @param callback The callback to invoke when the user clicks "Done."
     */
    public void setDoneCallback(Runnable callback) {
        mDoneCallback = callback;
    }

    /**
     * Specifies the callback to invoke when the user clicks "Cancel."
     *
     * @param callback The callback to invoke when the user clicks "Cancel."
     */
    public void setCancelCallback(Runnable callback) {
        mCancelCallback = callback;
    }

    /**
     * Called when the user clicks "Done." Can be called only once. If this method is called, then
     * cancel() should not be called.
     */
    public void done() {
        if (mDoneCallback != null) mDoneCallback.run();
        mDoneCallback = null;
        mCancelCallback = null;
    }

    /**
     * Called when the user clicks "Cancel." Can be called only once. If this method is called, then
     * done() should not be called.
     */
    public void cancel() {
        if (mCancelCallback != null) mCancelCallback.run();
        mDoneCallback = null;
        mCancelCallback = null;
    }
}
