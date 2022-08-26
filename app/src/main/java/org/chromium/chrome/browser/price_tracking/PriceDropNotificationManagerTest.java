// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.price_tracking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Browser;
import android.provider.Settings;

import androidx.test.filters.MediumTest;

import org.json.JSONArray;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import org.chromium.base.Callback;
import org.chromium.base.ContextUtils;
import org.chromium.base.IntentUtils;
import org.chromium.base.test.util.CommandLineFlags;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.browserservices.intents.WebappConstants;
import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.flags.ChromeSwitches;
import org.chromium.chrome.browser.notifications.NotificationUmaTracker.SystemNotificationType;
import org.chromium.chrome.browser.notifications.channels.ChromeChannelDefinitions;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;
import org.chromium.chrome.browser.price_tracking.PriceDropNotificationManager.DismissNotificationChromeActivity;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription.CommerceSubscriptionType;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription.SubscriptionManagementType;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription.TrackingIdType;
import org.chromium.chrome.browser.subscriptions.CommerceSubscriptionsService;
import org.chromium.chrome.browser.subscriptions.CommerceSubscriptionsServiceFactory;
import org.chromium.chrome.browser.subscriptions.SubscriptionsManagerImpl;
import org.chromium.chrome.test.ChromeJUnit4ClassRunner;
import org.chromium.chrome.test.ChromeTabbedActivityTestRule;
import org.chromium.chrome.test.batch.BlankCTATabInitialStateRule;
import org.chromium.chrome.test.util.browser.Features;
import org.chromium.components.browser_ui.notifications.MockNotificationManagerProxy;

/**
 * Tests for  {@link PriceDropNotificationManager}.
 */
@RunWith(ChromeJUnit4ClassRunner.class)
// clang-format off
@CommandLineFlags.Add({ChromeSwitches.DISABLE_FIRST_RUN_EXPERIENCE,
        "enable-features=" + ChromeFeatureList.COMMERCE_PRICE_TRACKING + "<Study",
        "force-fieldtrials=Study/Group",
        "force-fieldtrial-params=Study.Group:enable_price_notification/true"
            + "/user_managed_notification_max_number/2"})
@Features.DisableFeatures({ChromeFeatureList.START_SURFACE_ANDROID})
public class PriceDropNotificationManagerTest {
    // clang-format on
    private static final String ACTION_APP_NOTIFICATION_SETTINGS =
            "android.settings.APP_NOTIFICATION_SETTINGS";
    private static final String EXTRA_APP_PACKAGE = "app_package";
    private static final String EXTRA_APP_UID = "app_uid";
    private static final String ACTION_ID_VISIT_SITE = "visit_site";
    private static final String ACTION_ID_TURN_OFF_ALERT = "turn_off_alert";
    private static final String TEST_URL = "www.test.com";
    private static final String OFFER_ID = "offer_id";
    private static final String PRODUCT_CLUSTER_ID = "cluster_id";
    private static final int NOTIFICATION_ID = 123;

    private MockNotificationManagerProxy mMockNotificationManager;
    private PriceDropNotificationManager mPriceDropNotificationManager;

    @ClassRule
    public static ChromeTabbedActivityTestRule sActivityTestRule =
            new ChromeTabbedActivityTestRule();
    @Rule
    public MockitoRule mMockitoRule = MockitoJUnit.rule();

    @Rule
    public BlankCTATabInitialStateRule mInitialStateRule =
            new BlankCTATabInitialStateRule(sActivityTestRule, false);

    @Mock
    private CommerceSubscriptionsService mMockSubscriptionsService;

    @Mock
    private SubscriptionsManagerImpl mMockSubscriptionsManager;

    @Mock
    private BookmarkBridge mMockBookmarkBridge;

    @Before
    public void setUp() {
        mMockNotificationManager = new MockNotificationManagerProxy();
        PriceDropNotificationManager.setNotificationManagerForTesting(mMockNotificationManager);
        mPriceDropNotificationManager = new PriceDropNotificationManager();
        when(mMockBookmarkBridge.isBookmarkModelLoaded()).thenReturn(true);
        PriceDropNotificationManager.setBookmarkBridgeForTesting(mMockBookmarkBridge);
    }

    @After
    public void tearDown() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            mPriceDropNotificationManager.deleteChannelForTesting();
        }
        PriceDropNotificationManager.setNotificationManagerForTesting(null);
    }

    private void verifyClickIntent(Intent intent) {
        assertEquals(Intent.ACTION_VIEW, intent.getAction());
        assertEquals(Uri.parse(TEST_URL), intent.getData());
        assertEquals(DismissNotificationChromeActivity.class.getName(),
                intent.getComponent().getClassName());
        assertEquals(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NEW_DOCUMENT,
                intent.getFlags());
        assertEquals(ContextUtils.getApplicationContext().getPackageName(),
                intent.getStringExtra(Browser.EXTRA_APPLICATION_ID));
        assertEquals(true,
                intent.getBooleanExtra(WebappConstants.REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB, false));
        assertEquals(NOTIFICATION_ID,
                intent.getIntExtra(PriceDropNotificationManager.EXTRA_NOTIFICATION_ID, 0));
    }

    @Test
    @MediumTest
    public void testCanPostNotification_FeatureDisabled() {
        mMockNotificationManager.setNotificationsEnabled(true);
        PriceTrackingFeatures.setIsSignedInAndSyncEnabledForTesting(false);
        assertFalse(PriceTrackingFeatures.isPriceTrackingEligible());
        assertFalse(mPriceDropNotificationManager.canPostNotification());
        assertFalse(mPriceDropNotificationManager.canPostNotificationWithMetricsRecorded());
    }

    @Test
    @MediumTest
    public void testCanPostNotification_NotificationDisabled() {
        PriceTrackingFeatures.setIsSignedInAndSyncEnabledForTesting(true);
        mMockNotificationManager.setNotificationsEnabled(false);
        assertFalse(mPriceDropNotificationManager.areAppNotificationsEnabled());
        assertFalse(mPriceDropNotificationManager.canPostNotification());
        assertFalse(mPriceDropNotificationManager.canPostNotificationWithMetricsRecorded());
    }

    @Test
    @MediumTest
    public void testCanPostNotificaton() {
        PriceTrackingFeatures.setIsSignedInAndSyncEnabledForTesting(true);
        assertTrue(PriceTrackingFeatures.isPriceTrackingEligible());
        mMockNotificationManager.setNotificationsEnabled(true);
        assertTrue(mPriceDropNotificationManager.areAppNotificationsEnabled());

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            assertTrue(mPriceDropNotificationManager.canPostNotification());
            assertTrue(mPriceDropNotificationManager.canPostNotificationWithMetricsRecorded());
        } else {
            assertNull(mPriceDropNotificationManager.getNotificationChannel());
            assertFalse(mPriceDropNotificationManager.canPostNotification());
            assertFalse(mPriceDropNotificationManager.canPostNotificationWithMetricsRecorded());

            mPriceDropNotificationManager.createNotificationChannel();
            assertNotNull(mPriceDropNotificationManager.getNotificationChannel());
            assertEquals(NotificationManager.IMPORTANCE_LOW,
                    mPriceDropNotificationManager.getNotificationChannel().getImportance());

            assertTrue(mPriceDropNotificationManager.canPostNotification());
            assertTrue(mPriceDropNotificationManager.canPostNotificationWithMetricsRecorded());
        }
    }

    @Test
    @MediumTest
    public void testGetNotificationSettingsIntent_NotificationDisabled() {
        mMockNotificationManager.setNotificationsEnabled(false);
        Intent intent = mPriceDropNotificationManager.getNotificationSettingsIntent();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            assertEquals(ACTION_APP_NOTIFICATION_SETTINGS, intent.getAction());
            assertEquals(ContextUtils.getApplicationContext().getPackageName(),
                    intent.getStringExtra(EXTRA_APP_PACKAGE));
            assertEquals(ContextUtils.getApplicationContext().getApplicationInfo().uid,
                    intent.getIntExtra(EXTRA_APP_UID, 0));
        } else {
            assertEquals(Settings.ACTION_APP_NOTIFICATION_SETTINGS, intent.getAction());
            assertEquals(ContextUtils.getApplicationContext().getPackageName(),
                    intent.getStringExtra(Settings.EXTRA_APP_PACKAGE));
        }
        assertEquals(Intent.FLAG_ACTIVITY_NEW_TASK, intent.getFlags());
    }

    @Test
    @MediumTest
    public void testGetNotificationSettingsIntent_NotificationEnabled() {
        mMockNotificationManager.setNotificationsEnabled(true);
        Intent intent = mPriceDropNotificationManager.getNotificationSettingsIntent();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            assertEquals(ACTION_APP_NOTIFICATION_SETTINGS, intent.getAction());
            assertEquals(ContextUtils.getApplicationContext().getPackageName(),
                    intent.getStringExtra(EXTRA_APP_PACKAGE));
            assertEquals(ContextUtils.getApplicationContext().getApplicationInfo().uid,
                    intent.getIntExtra(EXTRA_APP_UID, 0));
        } else {
            assertEquals(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS, intent.getAction());
            assertEquals(ContextUtils.getApplicationContext().getPackageName(),
                    intent.getStringExtra(Settings.EXTRA_APP_PACKAGE));
            assertEquals(ChromeChannelDefinitions.ChannelId.PRICE_DROP,
                    intent.getStringExtra(Settings.EXTRA_CHANNEL_ID));
        }
        assertEquals(Intent.FLAG_ACTIVITY_NEW_TASK, intent.getFlags());
    }

    @Test
    @MediumTest
    public void testGetNotificationClickIntent() {
        verifyClickIntent(mPriceDropNotificationManager.getNotificationClickIntent(
                TEST_URL, NOTIFICATION_ID));
    }

    @Test
    @MediumTest
    public void testGetNotificationActionClickIntent() {
        verifyClickIntent(mPriceDropNotificationManager.getNotificationActionClickIntent(
                ACTION_ID_VISIT_SITE, TEST_URL, OFFER_ID, PRODUCT_CLUSTER_ID, NOTIFICATION_ID));
        Intent turnOffAlertIntent = mPriceDropNotificationManager.getNotificationActionClickIntent(
                ACTION_ID_TURN_OFF_ALERT, TEST_URL, OFFER_ID, PRODUCT_CLUSTER_ID, NOTIFICATION_ID);
        assertNotNull(turnOffAlertIntent);
        assertEquals(PriceDropNotificationManager.TrampolineActivity.class.getName(),
                turnOffAlertIntent.getComponent().getClassName());
        assertEquals(PRODUCT_CLUSTER_ID,
                IntentUtils.safeGetStringExtra(
                        turnOffAlertIntent, PriceDropNotificationManager.EXTRA_PRODUCT_CLUSTER_ID));
        assertEquals(OFFER_ID,
                IntentUtils.safeGetStringExtra(
                        turnOffAlertIntent, PriceDropNotificationManager.EXTRA_OFFER_ID));
        assertEquals(TEST_URL,
                IntentUtils.safeGetStringExtra(
                        turnOffAlertIntent, PriceDropNotificationManager.EXTRA_DESTINATION_URL));
        assertEquals(ACTION_ID_TURN_OFF_ALERT,
                IntentUtils.safeGetStringExtra(
                        turnOffAlertIntent, PriceDropNotificationManager.EXTRA_ACTION_ID));
        assertEquals(NOTIFICATION_ID,
                IntentUtils.safeGetIntExtra(
                        turnOffAlertIntent, PriceDropNotificationManager.EXTRA_NOTIFICATION_ID, 0));
    }

    @Test
    @MediumTest
    public void testOnNotificationActionClicked_TurnOffAlert() {
        doReturn(mMockSubscriptionsManager)
                .when(mMockSubscriptionsService)
                .getSubscriptionsManager();
        CommerceSubscriptionsServiceFactory.setSubscriptionsServiceForTesting(
                mMockSubscriptionsService);

        String offerId = "offer_id";
        CommerceSubscription commerceSubscription =
                new CommerceSubscription(CommerceSubscriptionType.PRICE_TRACK, offerId,
                        SubscriptionManagementType.CHROME_MANAGED, TrackingIdType.OFFER_ID);

        mPriceDropNotificationManager.onNotificationActionClicked(
                ACTION_ID_TURN_OFF_ALERT, TEST_URL, null, null, false);
        verify(mMockSubscriptionsManager, times(0))
                .unsubscribe(eq(commerceSubscription), any(Callback.class));

        mPriceDropNotificationManager.onNotificationActionClicked(
                ACTION_ID_TURN_OFF_ALERT, TEST_URL, offerId, null, false);
        verify(mMockSubscriptionsManager, times(1))
                .unsubscribe(eq(commerceSubscription), any(Callback.class));
    }

    @Test
    @MediumTest
    public void testNotificationTypeEnabled() {
        assertTrue(mPriceDropNotificationManager.isEnabled());
    }

    @Test
    @MediumTest
    public void testUpdateNotificationTimestamps() {
        SharedPreferencesManager preferencesManager = SharedPreferencesManager.getInstance();
        int mockType = SystemNotificationType.PRICE_DROP_ALERTS_USER_MANAGED;
        long mockTimestamp = System.currentTimeMillis()
                - 2 * PriceTrackingNotificationConfig.getNotificationTimestampsStoreWindowMs();
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(mockTimestamp);
        preferencesManager.writeString(
                PriceDropNotificationManager.USER_MANAGED_TIMESTAMPS, jsonArray.toString());
        assertEquals(
                0, mPriceDropNotificationManager.updateNotificationTimestamps(mockType, false));

        mockTimestamp = System.currentTimeMillis();
        jsonArray = new JSONArray();
        jsonArray.put(mockTimestamp);
        preferencesManager.writeString(
                PriceDropNotificationManager.USER_MANAGED_TIMESTAMPS, jsonArray.toString());
        assertEquals(
                1, mPriceDropNotificationManager.updateNotificationTimestamps(mockType, false));

        assertEquals(2, mPriceDropNotificationManager.updateNotificationTimestamps(mockType, true));
        assertEquals(3, mPriceDropNotificationManager.updateNotificationTimestamps(mockType, true));

        preferencesManager.writeString(PriceDropNotificationManager.USER_MANAGED_TIMESTAMPS, "");
        assertEquals(
                0, mPriceDropNotificationManager.updateNotificationTimestamps(mockType, false));
        assertEquals(1, mPriceDropNotificationManager.updateNotificationTimestamps(mockType, true));
    }

    @Test
    @MediumTest
    public void testHasReachedMaxAllowedNotificationNumber() {
        int mockType = SystemNotificationType.PRICE_DROP_ALERTS_USER_MANAGED;
        assertEquals(false,
                mPriceDropNotificationManager.hasReachedMaxAllowedNotificationNumber(mockType));

        mPriceDropNotificationManager.updateNotificationTimestamps(mockType, true);
        assertEquals(false,
                mPriceDropNotificationManager.hasReachedMaxAllowedNotificationNumber(mockType));

        mPriceDropNotificationManager.updateNotificationTimestamps(mockType, true);
        assertEquals(true,
                mPriceDropNotificationManager.hasReachedMaxAllowedNotificationNumber(mockType));
    }
}
