// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.download;

import org.chromium.base.ActivityState;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ApplicationStatus.ActivityStateListener;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.stable.R;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.download.home.DownloadManagerCoordinator;
import org.chromium.chrome.browser.download.home.DownloadManagerCoordinatorFactoryHelper;
import org.chromium.chrome.browser.download.home.DownloadManagerUiConfig;
import org.chromium.chrome.browser.download.home.DownloadManagerUiConfigHelper;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.chrome.browser.ui.native_page.BasicNativePage;
import org.chromium.chrome.browser.ui.native_page.NativePageHost;
import org.chromium.components.embedder_support.util.UrlConstants;

/**
 * Native page for managing downloads handled through Chrome.
 */
public class DownloadPage extends BasicNativePage implements DownloadManagerCoordinator.Observer {
    private ActivityStateListener mActivityStateListener;

    private DownloadManagerCoordinator mDownloadCoordinator;
    private String mTitle;

    /**
     * Create a new instance of the downloads page.
     * @param activity The activity to get context and manage fragments.
     * @param otrProfileID The {@link OTRProfileID} for the profile, null for regular profile.
     * @param host A NativePageHost to load urls.
     */
    public DownloadPage(ChromeActivity activity, OTRProfileID otrProfileID, NativePageHost host) {
        super(host);

        ThreadUtils.assertOnUiThread();
        DownloadManagerUiConfig config =
                DownloadManagerUiConfigHelper.fromFlags()
                        .setIsOffTheRecord(otrProfileID != null)
                        .setOTRProfileID(otrProfileID)
                        .setIsSeparateActivity(false)
                        .setShowPaginationHeaders(DownloadUtils.shouldShowPaginationHeaders())
                        .build();

        mDownloadCoordinator = DownloadManagerCoordinatorFactoryHelper.create(
                activity, config, activity.getSnackbarManager(), activity.getModalDialogManager());

        mDownloadCoordinator.addObserver(this);
        mTitle = activity.getString(R.string.menu_downloads);

        // #destroy() unregisters the ActivityStateListener to avoid checking for externally removed
        // downloads after the downloads page is closed. This requires each DownloadPage to have its
        // own ActivityStateListener. If multiple tabs are showing the downloads page, multiple
        // requests to check for externally removed downloads will be issued when the activity is
        // resumed.
        mActivityStateListener = (activity1, newState) -> {
            if (newState == ActivityState.RESUMED) {
                Profile profile = activity.getCurrentTabModel().getProfile();
                ProfileKey profileKey = profile == null ? ProfileKey.getLastUsedRegularProfileKey()
                                                        : profile.getProfileKey();
                DownloadUtils.checkForExternallyRemovedDownloads(profileKey);
            }
        };
        ApplicationStatus.registerStateListenerForActivity(mActivityStateListener, activity);

        initWithView(mDownloadCoordinator.getView());
    }

    @Override
    public String getTitle() {
        return mTitle;
    }

    @Override
    public String getHost() {
        return UrlConstants.DOWNLOADS_HOST;
    }

    @Override
    public void updateForUrl(String url) {
        super.updateForUrl(url);
        mDownloadCoordinator.updateForUrl(url);
    }

    @Override
    public void destroy() {
        mDownloadCoordinator.removeObserver(this);
        mDownloadCoordinator.destroy();
        mDownloadCoordinator = null;
        ApplicationStatus.unregisterActivityStateListener(mActivityStateListener);
        super.destroy();
    }

    // DownloadManagerCoordinator.Observer implementation.
    @Override
    public void onUrlChanged(String url) {
        // We want to squash consecutive download home URLs having different filters into the one
        // having the latest filter. This will avoid requiring user to press back button too many
        // times to exit download home. In the event, chrome gets killed or if user navigates away
        // from download home, we still will be able to come back to the latest filter.
        onStateChange(url, true);
    }
}
