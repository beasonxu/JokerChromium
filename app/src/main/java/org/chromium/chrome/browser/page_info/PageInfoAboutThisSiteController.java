// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.page_info;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import org.chromium.base.Log;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.compositor.bottombar.ephemeraltab.EphemeralTabCoordinator;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.tab.TabLaunchType;
import org.chromium.chrome.browser.tab.TabUtils;
import org.chromium.chrome.browser.tabmodel.document.TabDelegate;
import org.chromium.components.page_info.PageInfoAction;
import org.chromium.components.page_info.PageInfoControllerDelegate;
import org.chromium.components.page_info.PageInfoMainController;
import org.chromium.components.page_info.PageInfoRowView;
import org.chromium.components.page_info.PageInfoSubpageController;
import org.chromium.components.page_info.proto.AboutThisSiteMetadataProto.SiteInfo;
import org.chromium.components.security_state.ConnectionSecurityLevel;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.LayoutInflaterUtils;
import org.chromium.url.GURL;

/**
 * Class for controlling the page info 'About This Site' section.
 */
public class PageInfoAboutThisSiteController implements PageInfoSubpageController {
    public static final int ROW_ID = View.generateViewId();
    private static final String TAG = "PageInfo";

    private final PageInfoMainController mMainController;
    private final Supplier<EphemeralTabCoordinator> mEphemeralTabCoordinatorSupplier;
    private final PageInfoRowView mRowView;
    private final PageInfoControllerDelegate mDelegate;
    private final WebContents mWebContents;
    private @Nullable SiteInfo mSiteInfo;

    static boolean isFeatureEnabled() {
        return PageInfoAboutThisSiteControllerJni.get().isFeatureEnabled();
    }

    public PageInfoAboutThisSiteController(PageInfoMainController mainController,
            Supplier<EphemeralTabCoordinator> ephemeralTabCoordinatorSupplier,
            PageInfoRowView rowView, PageInfoControllerDelegate delegate, WebContents webContents) {
        mMainController = mainController;
        mEphemeralTabCoordinatorSupplier = ephemeralTabCoordinatorSupplier;
        mRowView = rowView;
        mDelegate = delegate;
        mWebContents = webContents;
        setupRow();
    }

    private void launchSubpage() {
        mMainController.recordAction(PageInfoAction.PAGE_INFO_ABOUT_THIS_SITE_PAGE_OPENED);
        mMainController.launchSubpage(this);
    }

    @Override
    public String getSubpageTitle() {
        return mRowView.getContext().getResources().getString(
                R.string.page_info_about_this_site_title);
    }

    @Override
    public View createViewForSubpage(ViewGroup parent) {
        // The subpage can only be created if there is a row and the row is only visible if siteInfo
        // is populated.
        assert mSiteInfo != null;
        assert mSiteInfo.hasDescription();
        assert !mDelegate.isIncognito();
        AboutThisSiteView view = (AboutThisSiteView) LayoutInflaterUtils.inflate(
                parent.getContext(), R.layout.page_info_about_this_site_view, parent, false);
        view.setSiteInfo(mSiteInfo,
                ()
                        -> openUrl(mSiteInfo.getDescription().getSource().getUrl(),
                                PageInfoAction.PAGE_INFO_ABOUT_THIS_SITE_SOURCE_LINK_CLICKED));
        return view;
    }

    private void openUrl(String url, @PageInfoAction int action) {
        mMainController.recordAction(action);
        if (mEphemeralTabCoordinatorSupplier != null
                && mEphemeralTabCoordinatorSupplier.get() != null) {
            // Append parameter to open the page with reduced UI elements in the bottomsheet.
            Uri.Builder builder = Uri.parse(url).buildUpon();
            if (mSiteInfo.hasMoreAbout() && url.equals(mSiteInfo.getMoreAbout().getUrl())) {
                builder.appendQueryParameter("ilrm", "minimal");
            }
            GURL bottomSheetUrl = new GURL(builder.toString());
            GURL fullPageUrl = new GURL(url);
            mEphemeralTabCoordinatorSupplier.get().requestOpenSheetWithFullPageUrl(
                    bottomSheetUrl, fullPageUrl, getTitle(), /*isIncognito=*/false);
            mMainController.dismiss();
        } else {
            new TabDelegate(/*incognito=*/false)
                    .createNewTab(new LoadUrlParams(url), TabLaunchType.FROM_CHROME_UI,
                            TabUtils.fromWebContents(mWebContents));
        }
    }

    @Override
    public void onSubpageRemoved() {}

    private void setupRow() {
        if (!mDelegate.isSiteSettingsAvailable() || mDelegate.isIncognito()) {
            return;
        }

        if (mMainController.getSecurityLevel() != ConnectionSecurityLevel.SECURE) {
            return;
        }

        mSiteInfo = getSiteInfo();
        if (mSiteInfo == null) {
            return;
        }

        boolean more_info_enabled =
                ChromeFeatureList.isEnabled(ChromeFeatureList.PAGE_INFO_ABOUT_THIS_SITE_MORE_INFO);

        assert mSiteInfo.hasDescription();
        String subtitle = mSiteInfo.getDescription().getDescription();
        PageInfoRowView.ViewParams rowParams = new PageInfoRowView.ViewParams();
        rowParams.title = getTitle();
        rowParams.subtitle = subtitle;
        rowParams.singleLineSubTitle = true;
        rowParams.visible = true;
        rowParams.iconResId =
                more_info_enabled ? R.drawable.ic_globe_24dp : R.drawable.ic_info_outline_grey_24dp;
        rowParams.decreaseIconSize = true;
        rowParams.clickCallback = more_info_enabled ? ()
                -> openUrl(mSiteInfo.getMoreAbout().getUrl(),
                        PageInfoAction.PAGE_INFO_ABOUT_THIS_SITE_PAGE_OPENED)
                : this::launchSubpage;
        mRowView.setParams(rowParams);
    }

    private String getTitle() {
        return mRowView.getContext().getResources().getString(
                ChromeFeatureList.isEnabled(ChromeFeatureList.PAGE_INFO_ABOUT_THIS_SITE_MORE_INFO)
                        ? R.string.page_info_about_this_page_title
                        : R.string.page_info_about_this_site_title);
    }

    private @Nullable SiteInfo getSiteInfo() {
        byte[] result = PageInfoAboutThisSiteControllerJni.get().getSiteInfo(
                mMainController.getBrowserContext(), mMainController.getURL(), mWebContents);
        if (result == null) return null;
        SiteInfo info = null;
        try {
            info = SiteInfo.parseFrom(result);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            Log.e(TAG, "Could not parse proto: %s", e);
            assert false;
        }
        return info;
    }
    @Override
    public void clearData() {}

    @Override
    public void updateRowIfNeeded() {}

    @Override
    public void onNativeInitialized() {
        mMainController.setAboutThisSiteShown(mSiteInfo != null);
    }

    @NativeMethods
    interface Natives {
        boolean isFeatureEnabled();
        byte[] getSiteInfo(BrowserContextHandle browserContext, GURL url, WebContents webContents);
    }
}
