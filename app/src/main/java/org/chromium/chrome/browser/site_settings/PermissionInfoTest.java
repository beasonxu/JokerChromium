// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.site_settings;

import androidx.test.filters.SmallTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.chromium.base.test.util.Batch;
import org.chromium.base.test.util.CallbackHelper;
import org.chromium.base.test.util.CommandLineFlags;
import org.chromium.base.test.util.DisabledTest;
import org.chromium.base.test.util.Feature;
import org.chromium.base.test.util.RequiresRestart;
import org.chromium.chrome.browser.browsing_data.BrowsingDataBridge;
import org.chromium.chrome.browser.browsing_data.BrowsingDataType;
import org.chromium.chrome.browser.browsing_data.TimePeriod;
import org.chromium.chrome.browser.flags.ChromeSwitches;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.test.ChromeJUnit4ClassRunner;
import org.chromium.chrome.test.ChromeTabbedActivityTestRule;
import org.chromium.chrome.test.batch.BlankCTATabInitialStateRule;
import org.chromium.components.browser_ui.site_settings.PermissionInfo;
import org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridgeJni;
import org.chromium.components.content_settings.ContentSettingValues;
import org.chromium.components.content_settings.ContentSettingsType;
import org.chromium.content_public.browser.test.util.TestThreadUtils;
import org.chromium.content_public.common.ContentSwitches;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/** Tests for the PermissionInfoTest. */
@RunWith(ChromeJUnit4ClassRunner.class)
@CommandLineFlags.Add({ChromeSwitches.DISABLE_FIRST_RUN_EXPERIENCE,
        ContentSwitches.HOST_RESOLVER_RULES + "=MAP * 127.0.0.1", "ignore-certificate-errors"})
@Batch(SiteSettingsTest.SITE_SETTINGS_BATCH_NAME)
public class PermissionInfoTest {
    private static final String DSE_ORIGIN = "https://www.google.com";
    private static final String OTHER_ORIGIN = "https://www.other.com";

    @ClassRule
    public static ChromeTabbedActivityTestRule sActivityTestRule =
            new ChromeTabbedActivityTestRule();

    @Rule
    public BlankCTATabInitialStateRule mBlankCTATabInitialStateRule =
            new BlankCTATabInitialStateRule(sActivityTestRule, false);

    @After
    public void tearDown() throws TimeoutException {
        // Clean up cookies and permissions.
        CallbackHelper helper = new CallbackHelper();
        TestThreadUtils.runOnUiThreadBlocking(() -> {
            BrowsingDataBridge.getInstance().clearBrowsingData(helper::notifyCalled,
                    new int[] {BrowsingDataType.SITE_SETTINGS}, TimePeriod.ALL_TIME);
        });
        helper.waitForCallback(0);
    }

    private static Profile getRegularProfile() {
        return TestThreadUtils.runOnUiThreadBlockingNoException(
                (Callable<Profile>) () -> Profile.getLastUsedRegularProfile());
    }

    private static Profile getNonPrimaryOTRProfile() {
        return TestThreadUtils.runOnUiThreadBlockingNoException((Callable<Profile>) () -> {
            OTRProfileID otrProfileID = OTRProfileID.createUnique("CCT:Incognito");
            return Profile.getLastUsedRegularProfile().getOffTheRecordProfile(
                    otrProfileID, /*createIfNeeded=*/true);
        });
    }

    private static Profile getPrimaryOTRProfile() {
        return TestThreadUtils.runOnUiThreadBlockingNoException(
                (Callable<Profile>) ()
                        -> Profile.getLastUsedRegularProfile().getPrimaryOTRProfile(
                                /*createIfNeeded=*/true));
    }

    private void setGeolocation(
            String origin, String embedder, @ContentSettingValues int setting, Profile profile) {
        PermissionInfo info = new PermissionInfo(ContentSettingsType.GEOLOCATION, origin, embedder);
        TestThreadUtils.runOnUiThreadBlocking(() -> info.setContentSetting(profile, setting));
    }

    private @ContentSettingValues int getGeolocation(
            String origin, String embedder, Profile profile) throws ExecutionException {
        return TestThreadUtils.runOnUiThreadBlocking(() -> {
            PermissionInfo info =
                    new PermissionInfo(ContentSettingsType.GEOLOCATION, origin, embedder);
            return info.getContentSetting(profile);
        });
    }

    private void setNotifications(
            String origin, String embedder, @ContentSettingValues int setting, Profile profile) {
        PermissionInfo info =
                new PermissionInfo(ContentSettingsType.NOTIFICATIONS, origin, embedder);
        TestThreadUtils.runOnUiThreadBlocking(() -> info.setContentSetting(profile, setting));
    }

    private @ContentSettingValues int getNotifications(
            String origin, String embedder, Profile profile) throws ExecutionException {
        return TestThreadUtils.runOnUiThreadBlocking(() -> {
            PermissionInfo info =
                    new PermissionInfo(ContentSettingsType.NOTIFICATIONS, origin, embedder);
            return info.getContentSetting(profile);
        });
    }

    private void resetNotificationsSettingsForTest() {
        TestThreadUtils.runOnUiThreadBlocking(() -> {
            WebsitePreferenceBridgeJni.get().resetNotificationsSettingsForTest(
                    Profile.getLastUsedRegularProfile());
        });
    }

    @Test
    @SmallTest
    @Feature({"Preferences"})
    @DisabledTest(message = "Flaky - https://crbug.com/1314109")
    public void testResetDSEGeolocation_InPrimaryOTRProfile_DefaultsToAskFromBlock()
            throws Throwable {
        Profile primaryOTRProfile = getPrimaryOTRProfile();
        setGeolocation(DSE_ORIGIN, null, ContentSettingValues.BLOCK, primaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.BLOCK, getGeolocation(DSE_ORIGIN, null, primaryOTRProfile));
        setGeolocation(DSE_ORIGIN, null, ContentSettingValues.DEFAULT, primaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.ASK, getGeolocation(DSE_ORIGIN, null, primaryOTRProfile));
    }

    @Test
    @SmallTest
    @Feature({"Preferences"})
    @DisabledTest(message = "Flaky - https://crbug.com/1314109")
    public void testResetDSEGeolocation_InNonPrimaryOTRProfile_DefaultsToAskFromBlock()
            throws Throwable {
        Profile nonPrimaryOTRProfile = getNonPrimaryOTRProfile();
        setGeolocation(DSE_ORIGIN, null, ContentSettingValues.BLOCK, nonPrimaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.BLOCK, getGeolocation(DSE_ORIGIN, null, nonPrimaryOTRProfile));
        setGeolocation(DSE_ORIGIN, null, ContentSettingValues.DEFAULT, nonPrimaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.ASK, getGeolocation(DSE_ORIGIN, null, nonPrimaryOTRProfile));
    }

    @Test
    @SmallTest
    @Feature({"Preferences"})
    @RequiresRestart
    @DisabledTest(message = "Flaky - https://crbug.com/1314109")
    public void testResetDSEGeolocation_RegularProfile_DefaultsToAskFromBlock() throws Throwable {
        Profile regularProfile = getRegularProfile();
        setGeolocation(DSE_ORIGIN, null, ContentSettingValues.BLOCK, regularProfile);
        Assert.assertEquals(
                ContentSettingValues.BLOCK, getGeolocation(DSE_ORIGIN, null, regularProfile));
        setGeolocation(DSE_ORIGIN, null, ContentSettingValues.DEFAULT, regularProfile);
        Assert.assertEquals(
                ContentSettingValues.ASK, getGeolocation(DSE_ORIGIN, null, regularProfile));
    }

    @Test
    @SmallTest
    @Feature({"Preferences"})
    public void testResetDSENotification_InPrimaryOTRProfile_DefaultsToAskFromBlock()
            throws Throwable {
        Profile primaryOTRProfile = getPrimaryOTRProfile();

        // Resetting in incognito should not have the same behavior.
        resetNotificationsSettingsForTest();
        setNotifications(DSE_ORIGIN, null, ContentSettingValues.BLOCK, primaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.BLOCK, getNotifications(DSE_ORIGIN, null, primaryOTRProfile));
        setNotifications(DSE_ORIGIN, null, ContentSettingValues.DEFAULT, primaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.ASK, getNotifications(DSE_ORIGIN, null, primaryOTRProfile));
    }

    @Test
    @SmallTest
    @Feature({"Preferences"})
    public void testResetDSENotification_InNonPrimaryOTRProfile_DefaultsToAskFromBlock()
            throws Throwable {
        Profile nonPrimaryOTRProfile = getNonPrimaryOTRProfile();

        // Resetting in incognito should not have the same behavior.
        resetNotificationsSettingsForTest();
        setNotifications(DSE_ORIGIN, null, ContentSettingValues.BLOCK, nonPrimaryOTRProfile);
        Assert.assertEquals(ContentSettingValues.BLOCK,
                getNotifications(DSE_ORIGIN, null, nonPrimaryOTRProfile));
        setNotifications(DSE_ORIGIN, null, ContentSettingValues.DEFAULT, nonPrimaryOTRProfile);
        Assert.assertEquals(
                ContentSettingValues.ASK, getNotifications(DSE_ORIGIN, null, nonPrimaryOTRProfile));
    }

    @Test
    @SmallTest
    @Feature({"Preferences"})
    @RequiresRestart
    public void testResetDSENotification_RegularProfile_DefaultsToAskFromBlock() throws Throwable {
        Profile regularProfile = getRegularProfile();
        resetNotificationsSettingsForTest();
        setNotifications(DSE_ORIGIN, null, ContentSettingValues.BLOCK, regularProfile);
        Assert.assertEquals(
                ContentSettingValues.BLOCK, getNotifications(DSE_ORIGIN, null, regularProfile));
        setNotifications(DSE_ORIGIN, null, ContentSettingValues.DEFAULT, regularProfile);
        Assert.assertEquals(
                ContentSettingValues.ASK, getNotifications(DSE_ORIGIN, null, regularProfile));
    }
}
