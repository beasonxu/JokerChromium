// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.ui.android.webid;

import android.content.res.Resources;

import androidx.annotation.Nullable;

import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.chrome.browser.ui.android.webid.data.Account;
import org.chromium.chrome.browser.ui.android.webid.data.ClientIdMetadata;
import org.chromium.chrome.browser.ui.android.webid.data.IdentityProviderMetadata;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetController;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetControllerProvider;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

import java.util.Arrays;

/**
 * This bridge creates and initializes a {@link AccountSelectionComponent} on construction and
 * forwards native calls to it.
 */
class AccountSelectionBridge implements AccountSelectionComponent.Delegate {
    private long mNativeView;
    private final AccountSelectionComponent mAccountSelectionComponent;

    private AccountSelectionBridge(long nativeView, WindowAndroid windowAndroid,
            BottomSheetController bottomSheetController) {
        mNativeView = nativeView;
        mAccountSelectionComponent = new AccountSelectionCoordinator();
        mAccountSelectionComponent.initialize(
                windowAndroid.getContext().get(), bottomSheetController, this);
    }

    @CalledByNative
    static int getBrandIconMinimumSize() {
        // Icon needs to be big enough for the smallest screen density (1x).
        Resources resources = ContextUtils.getApplicationContext().getResources();
        // Density < 1.0f on ldpi devices. Adjust density to ensure that
        // {@link getBrandIconMinimumSize()} <= {@link getBrandIconIdealSize()}.
        float density = Math.max(resources.getDisplayMetrics().density, 1.0f);
        return Math.round(getBrandIconIdealSize() / density);
    }

    @CalledByNative
    static int getBrandIconIdealSize() {
        Resources resources = ContextUtils.getApplicationContext().getResources();
        return Math.round(resources.getDimension(R.dimen.account_selection_sheet_icon_size));
    }

    @CalledByNative
    private static @Nullable AccountSelectionBridge create(
            long nativeView, WindowAndroid windowAndroid) {
        BottomSheetController bottomSheetController =
                BottomSheetControllerProvider.from(windowAndroid);
        if (bottomSheetController == null) return null;
        return new AccountSelectionBridge(nativeView, windowAndroid, bottomSheetController);
    }

    @CalledByNative
    private void destroy() {
        mAccountSelectionComponent.hideBottomSheet();
        mNativeView = 0;
    }

    /* Shows the accounts in a bottom sheet UI allowing user to select one.
     *
     * @param rpForDisplay is the formatted RP URL to display in the FedCM prompt.
     * @param idpForDisplay is the formatted IDP URL to display in the FedCM prompt.
     * @param accounts is the list of accounts to be shown.
     * @param isAutoSignIn represents whether this is an auto sign in flow.
     */
    @CalledByNative
    private void showAccounts(String rpForDisplay, String idpForDisplay, Account[] accounts,
            IdentityProviderMetadata idpMetadata, ClientIdMetadata clientIdMetadata,
            boolean isAutoSignIn) {
        assert accounts != null && accounts.length > 0;
        mAccountSelectionComponent.showAccounts(rpForDisplay, idpForDisplay,
                Arrays.asList(accounts), idpMetadata, clientIdMetadata, isAutoSignIn);
    }

    @Override
    public void onDismissed(boolean shouldEmbargo) {
        if (mNativeView != 0) {
            AccountSelectionBridgeJni.get().onDismiss(mNativeView, shouldEmbargo);
        }
    }

    @Override
    public void onAccountSelected(Account account) {
        if (mNativeView != 0) {
            // This call passes the account fields directly as String and GURL parameters as an
            // optimization to avoid needing multiple JNI getters on the Account class on for each
            // field.
            AccountSelectionBridgeJni.get().onAccountSelected(mNativeView,
                    account.getStringFields(), account.getPictureUrl(), account.isSignIn());
        }
    }

    @Override
    public void onAutoSignInCancelled() {
        if (mNativeView != 0) {
            // This call passes the account fields directly as String and GURL parameters as an
            // optimization to avoid needing multiple JNI getters on the Account class on for each
            // field.
            AccountSelectionBridgeJni.get().onAutoSignInCancelled(mNativeView);
        }
    }

    @NativeMethods
    interface Natives {
        void onAccountSelected(long nativeAccountSelectionViewAndroid, String[] accountFields,
                GURL accountPictureUrl, boolean isSignedIn);
        void onDismiss(long nativeAccountSelectionViewAndroid, boolean shouldEmbargo);
        void onAutoSignInCancelled(long nativeAccountSelectionViewAndroid);
    }
}