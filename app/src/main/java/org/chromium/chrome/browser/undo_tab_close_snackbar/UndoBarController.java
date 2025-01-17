// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.undo_tab_close_snackbar;

import android.content.Context;

import androidx.annotation.Nullable;

import org.chromium.base.CallbackController;
import org.chromium.base.supplier.OneshotSupplier;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.compositor.layouts.OverviewModeBehavior;
import org.chromium.chrome.browser.device.DeviceClassManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tabmodel.TabModelObserver;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.tasks.ConditionalTabStripUtils;
import org.chromium.chrome.browser.tasks.tab_management.TabUiFeatureUtilities;
import org.chromium.chrome.browser.ui.messages.snackbar.Snackbar;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;
import org.chromium.chrome.browser.util.ChromeAccessibilityUtil;

import java.util.List;
import java.util.Locale;

/**
 * A controller that listens to and visually represents cancelable tab closures.
 * <p/>
 * Each time a tab is undoably closed via {@link TabModelObserver#tabPendingClosure(Tab)},
 * this controller saves that tab id and title to the stack of SnackbarManager. It will then let
 * SnackbarManager to show a snackbar representing the top entry in of stack. Each added entry
 * resets the timeout that tracks when to commit the undoable actions.
 * <p/>
 * When the undo button is clicked, it will cancel the tab closure if any. all pending closing will
 * be committed.
 * <p/>
 * This class also responds to external changes to the undo state by monitoring
 * {@link TabModelObserver#tabClosureUndone(Tab)} and
 * {@link TabModelObserver#tabClosureCommitted(Tab)} to properly keep it's internal state
 * in sync with the model.
 */
public class UndoBarController implements SnackbarManager.SnackbarController {
    private final TabModelSelector mTabModelSelector;
    private final TabModelObserver mTabModelObserver;
    private final SnackbarManager.SnackbarManageable mSnackbarManagable;
    private final Context mContext;
    private CallbackController mCallbackController = new CallbackController();
    private OverviewModeBehavior mOverviewModeBehavior;

    /**
     * Creates an instance of a {@link UndoBarController}.
     * @param context The {@link Context} in which snackbar is shown.
     * @param selector The {@link TabModelSelector} that will be used to commit and undo tab
     *                 closures.
     * @param snackbarManageable The holder class to get the manager that helps to show up snackbar.
     * @param overviewModeBehaviorSupplier The {@link OverviewModeBehavior} to help check whether
     *         the
     * @param dialogVisibilitySupplier The {@link Supplier} to get the visibility of TabGridDialog.
     */
    public UndoBarController(Context context, TabModelSelector selector,
            SnackbarManager.SnackbarManageable snackbarManageable,
            OneshotSupplier<OverviewModeBehavior> overviewModeBehaviorSupplier,
            @Nullable Supplier<Boolean> dialogVisibilitySupplier) {
        mSnackbarManagable = snackbarManageable;
        mTabModelSelector = selector;
        mContext = context;
        overviewModeBehaviorSupplier.onAvailable(mCallbackController.makeCancelable(
                overviewModeBehavior -> mOverviewModeBehavior = overviewModeBehavior));

        mTabModelObserver = new TabModelObserver() {
            /**
             * Decides whether we should disable an attempt to show/hide the undo bar.
             * @param showingUndoBar indicates whether the expected behavior of the caller is to
             *         show or dismiss the undo bar.
             */
            private boolean disableUndo(boolean showingUndoBar) {
                // If the closure happens through conditional tab strip, show the undo snack bar
                // regardless of whether accessibility mode is enabled.
                if (TabUiFeatureUtilities.isConditionalTabStripEnabled()
                        && ConditionalTabStripUtils.getFeatureStatus()
                                == ConditionalTabStripUtils.FeatureStatus.ACTIVATED
                        && (mOverviewModeBehavior != null
                                && !mOverviewModeBehavior.overviewVisible())) {
                    return false;
                }
                // When closure(s) happen and we are trying to show the undo bar, check whether the
                // TabGridDialog is showing. If so, don't show the undo bar because TabGridDialog
                // has its own undo bar. See crbug.com/1119899. Note that we don't disable attempts
                // to dismiss snack bar to make sure that snack bar state is in sync with tab model.
                if (dialogVisibilitySupplier != null && showingUndoBar) {
                    return dialogVisibilitySupplier.get();
                }
                // If grid tab switcher is enabled, show the undo snack bar regardless of whether
                // accessibility mode is enabled.
                if (TabUiFeatureUtilities.isGridTabSwitcherEnabled()) {
                    return false;
                }
                return ChromeAccessibilityUtil.get().isAccessibilityEnabled()
                        || DeviceClassManager.enableAccessibilityLayout();
            }

            @Override
            public void tabPendingClosure(Tab tab) {
                if (disableUndo(true)) return;
                showUndoBar(tab.getId(), tab.getTitle());
            }

            @Override
            public void tabClosureUndone(Tab tab) {
                if (disableUndo(false)) return;
                mSnackbarManagable.getSnackbarManager().dismissSnackbars(
                        UndoBarController.this, tab.getId());
            }

            @Override
            public void tabClosureCommitted(Tab tab) {
                if (disableUndo(false)) return;
                mSnackbarManagable.getSnackbarManager().dismissSnackbars(
                        UndoBarController.this, tab.getId());
            }

            @Override
            public void multipleTabsPendingClosure(List<Tab> tabs, boolean isAllTabs) {
                if (disableUndo(true)) return;

                if (tabs.size() == 1) {
                    tabPendingClosure(tabs.get(0));
                    return;
                }

                // "Undo close all" bar can be reused for undoing close multiple tabs.
                showUndoCloseMultipleBar(tabs, isAllTabs);
            }

            @Override
            public void allTabsClosureCommitted() {
                if (disableUndo(false)) return;
                mSnackbarManagable.getSnackbarManager().dismissSnackbars(UndoBarController.this);
            }
        };
    }

    /**
     * Carry out native library dependent operations like registering observers and notifications.
     */
    public void initialize() {
        mTabModelSelector.getModel(false).addObserver(mTabModelObserver);
    }

    /**
     * Cleans up this class, unregistering for application notifications from the
     * {@link TabModelSelector}.
     */
    public void destroy() {
        TabModel model = mTabModelSelector.getModel(false);
        if (model != null) model.removeObserver(mTabModelObserver);
        if (mCallbackController != null) {
            mCallbackController.destroy();
            mCallbackController = null;
        }
    }

    /**
     * Shows an undo bar. Based on user actions, this will cause a call to either
     * {@link TabModel#commitTabClosure(int)} or {@link TabModel#cancelTabClosure(int)} to be called
     * for {@code tabId}.
     *
     * @param tabId The id of the tab.
     * @param content The title of the tab.
     */
    private void showUndoBar(int tabId, String content) {
        mSnackbarManagable.getSnackbarManager().showSnackbar(
                Snackbar.make(content, this, Snackbar.TYPE_ACTION, Snackbar.UMA_TAB_CLOSE_UNDO)
                        .setTemplateText(mContext.getString(R.string.undo_bar_close_message))
                        .setAction(mContext.getString(R.string.undo), tabId)
                        .setActionAccessibilityAnnouncement(
                                getUndoneAccessibilityAnnouncement(content, false)));
    }

    /**
     * Shows an undo close all bar. Based on user actions, this will cause a call to either
     * {@link TabModel#commitTabClosure(int)} or {@link TabModel#cancelTabClosure(int)} to be called
     * for each tab in {@code closedTabIds}. This will happen unless
     * {@code SnackbarManager#removeFromStackForData(Object)} is called.
     *
     * @param closedTabs A list of tabs that were closed.
     * @param isAllTabs Whether all tabs were closed.
     */
    private void showUndoCloseMultipleBar(List<Tab> closedTabs, boolean isAllTabs) {
        String content = String.format(Locale.getDefault(), "%d", closedTabs.size());
        mSnackbarManagable.getSnackbarManager().showSnackbar(
                Snackbar.make(content, this, Snackbar.TYPE_ACTION,
                                isAllTabs ? Snackbar.UMA_TAB_CLOSE_ALL_UNDO
                                          : Snackbar.UMA_TAB_CLOSE_MULTIPLE_UNDO)
                        .setTemplateText(mContext.getString(R.string.undo_bar_close_all_message))
                        .setAction(mContext.getString(R.string.undo), closedTabs)
                        .setActionAccessibilityAnnouncement(
                                getUndoneAccessibilityAnnouncement(content, true)));
    }

    private String getUndoneAccessibilityAnnouncement(String content, boolean isMultiple) {
        return isMultiple
                ? mContext.getString(
                        R.string.accessibility_undo_multiple_closed_tabs_announcement_message,
                        content)
                : mContext.getString(
                        R.string.accessibility_undo_closed_tab_announcement_message, content);
    }

    /**
     * Calls {@link TabModel#cancelTabClosure(int)} for the tab or for each tab in
     * the list of closed tabs.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void onAction(Object actionData) {
        if (actionData instanceof Integer) {
            cancelTabClosure((Integer) actionData);
        } else {
            for (Tab tab : (List<Tab>) actionData) {
                cancelTabClosure(tab.getId());
            }
        }
    }

    private void cancelTabClosure(int tabId) {
        TabModel model = mTabModelSelector.getModelForTabId(tabId);
        if (model != null) model.cancelTabClosure(tabId);
    }

    /**
     * Calls {@link TabModel#commitTabClosure(int)} for the tab or for each tab in
     * the list of closed tabs.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void onDismissNoAction(Object actionData) {
        if (actionData instanceof Integer) {
            commitTabClosure((Integer) actionData);
        } else {
            for (Tab tab : (List<Tab>) actionData) {
                commitTabClosure(tab.getId());
            }
        }
    }

    private void commitTabClosure(int tabId) {
        TabModel model = mTabModelSelector.getModelForTabId(tabId);
        if (model != null) model.commitTabClosure(tabId);
    }
}
