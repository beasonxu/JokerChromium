// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.notifications;

import static android.content.Context.NOTIFICATION_SERVICE;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.test.InstrumentationRegistry;
import android.text.SpannableStringBuilder;

import androidx.test.filters.SmallTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.chromium.base.test.BaseJUnit4ClassRunner;
import org.chromium.base.test.util.Batch;
import org.chromium.base.test.util.Feature;
import org.chromium.base.test.util.MinAndroidSdkLevel;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.notifications.channels.ChromeChannelDefinitions;
import org.chromium.components.browser_ui.notifications.NotificationMetadata;
import org.chromium.components.browser_ui.notifications.PendingIntentProvider;
import org.chromium.components.browser_ui.widget.RoundedIconGenerator;
import org.chromium.components.embedder_support.util.UrlUtilities;
import org.chromium.content_public.browser.test.NativeLibraryTestUtils;

/**
 * Instrumentation unit tests for StandardNotificationBuilder.
 *
 * Extends NativeLibraryTestBase so that {@link UrlUtilities#getDomainAndRegistry} can access
 * native GetDomainAndRegistry, when called by {@link RoundedIconGenerator#getIconTextForUrl}
 * during notification construction.
 */
@RunWith(BaseJUnit4ClassRunner.class)
@Batch(Batch.UNIT_TESTS)
public class StandardNotificationBuilderTest {
    private static final String NOTIFICATION_TAG = "TestNotificationTag";
    private static final int NOTIFICATION_ID = 99;

    @Before
    public void setUp() {
        // Not initializing the browser process is safe because GetDomainAndRegistry() is
        // stand-alone.
        NativeLibraryTestUtils.loadNativeLibraryNoBrowserProcess();
    }

    private NotificationBuilderBase createAllOptionsBuilder(
            PendingIntentProvider[] outContentAndDeleteIntents) {
        if (outContentAndDeleteIntents == null || outContentAndDeleteIntents.length != 2) {
            throw new IllegalArgumentException();
        }

        Context context = InstrumentationRegistry.getTargetContext();
        outContentAndDeleteIntents[0] = createIntent(context, "content");
        outContentAndDeleteIntents[1] = createIntent(context, "delete");

        Bitmap image = Bitmap.createBitmap(
                new int[] {Color.BLUE}, 1 /* width */, 1 /* height */, Bitmap.Config.ARGB_8888);
        image = image.copy(Bitmap.Config.ARGB_8888, true /* isMutable */);

        Bitmap largeIcon = Bitmap.createBitmap(
                new int[] {Color.RED}, 1 /* width */, 1 /* height */, Bitmap.Config.ARGB_8888);
        largeIcon = largeIcon.copy(Bitmap.Config.ARGB_8888, true /* isMutable */);

        Bitmap actionIcon = Bitmap.createBitmap(
                new int[] {Color.GRAY}, 1 /* width */, 1 /* height */, Bitmap.Config.ARGB_8888);
        actionIcon = actionIcon.copy(Bitmap.Config.ARGB_8888, true /* isMutable */);

        return new StandardNotificationBuilder(context)
                .setTitle("title")
                .setBody("body")
                .setOrigin("origin")
                .setChannelId(ChromeChannelDefinitions.ChannelId.SITES)
                .setTicker(new SpannableStringBuilder("ticker"))
                .setImage(image)
                .setLargeIcon(largeIcon)
                .setSmallIconId(R.drawable.ic_chrome)
                .setDefaults(Notification.DEFAULT_ALL)
                .setVibrate(new long[] {100L})
                .setContentIntent(outContentAndDeleteIntents[0])
                .setDeleteIntent(outContentAndDeleteIntents[1])
                .addButtonAction(actionIcon, "button 1", createIntent(context, "button1"))
                .addButtonAction(actionIcon, "button 2", createIntent(context, "button2"))
                .addSettingsAction(0 /* iconId */, "settings", createIntent(context, "settings"));
    }

    private Notification buildNotification(NotificationBuilderBase builder) {
        NotificationMetadata metadata =
                new NotificationMetadata(NotificationUmaTracker.SystemNotificationType.SITES,
                        NOTIFICATION_TAG, NOTIFICATION_ID);
        return builder.build(metadata).getNotification();
    }

    @Test
    @SmallTest
    @Feature({"Browser", "Notifications"})
    public void testSetAll() {
        PendingIntentProvider[] contentAndDeleteIntents = new PendingIntentProvider[2];
        NotificationBuilderBase builder = createAllOptionsBuilder(contentAndDeleteIntents);
        Notification notification = buildNotification(builder);

        Assert.assertEquals("title", NotificationTestUtil.getExtraTitle(notification));
        Assert.assertEquals("body", NotificationTestUtil.getExtraText(notification));
        Assert.assertEquals("origin", NotificationTestUtil.getExtraSubText(notification));
        Assert.assertEquals(
                NotificationConstants.GROUP_WEB_PREFIX + "origin", notification.getGroup());
        Assert.assertEquals("ticker", notification.tickerText.toString());
        Assert.assertEquals("android.app.Notification$BigPictureStyle",
                notification.extras.getString(Notification.EXTRA_TEMPLATE));
        Bitmap picture = NotificationTestUtil.getExtraPicture(notification);
        Assert.assertNotNull(picture);
        Assert.assertTrue(picture.getWidth() > 0 && picture.getHeight() > 0);

        Context context = InstrumentationRegistry.getTargetContext();
        Bitmap smallIcon =
                BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_chrome);
        Assert.assertTrue(smallIcon.sameAs(
                NotificationTestUtil.getSmallIconFromNotification(context, notification)));
        Assert.assertNotNull(
                NotificationTestUtil.getLargeIconFromNotification(context, notification));

        // On Android O+ the defaults are ignored as vibrate and silent moved to the notification
        // channel.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Assert.assertEquals(0, notification.defaults);
        } else {
            Assert.assertEquals(Notification.DEFAULT_ALL, notification.defaults);
            Assert.assertEquals(1, notification.vibrate.length);
            Assert.assertEquals(100L, notification.vibrate[0]);
        }

        Notification.Action[] actions = NotificationTestUtil.getActions(notification);
        Assert.assertEquals(3, actions.length);
        Assert.assertEquals("button 1", NotificationTestUtil.getActionTitle(actions[0]));
        Assert.assertEquals("button 2", NotificationTestUtil.getActionTitle(actions[1]));
        Assert.assertEquals("settings", NotificationTestUtil.getActionTitle(actions[2]));

        Assert.assertNotNull(notification.publicVersion);
        Assert.assertEquals(context.getString(R.string.notification_hidden_text),
                NotificationTestUtil.getExtraText(notification.publicVersion));
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            Assert.assertEquals(
                    "origin", NotificationTestUtil.getExtraSubText(notification.publicVersion));
        } else {
            Assert.assertEquals(
                    "origin", NotificationTestUtil.getExtraTitle(notification.publicVersion));
        }
    }

    @Test
    @SmallTest
    @Feature({"Browser", "Notifications"})
    public void testBigTextStyle() {
        PendingIntentProvider[] contentAndDeleteIntents = new PendingIntentProvider[2];
        NotificationBuilderBase builder = createAllOptionsBuilder(contentAndDeleteIntents);
        builder.setImage(null);
        Notification notification = buildNotification(builder);
        Assert.assertEquals("android.app.Notification$BigTextStyle",
                notification.extras.getString(Notification.EXTRA_TEMPLATE));
    }

    @Test
    @SmallTest
    @Feature({"Browser", "Notifications"})
    public void testSetSmallIcon() {
        Context context = InstrumentationRegistry.getTargetContext();
        NotificationBuilderBase notificationBuilder = new StandardNotificationBuilder(context);

        Bitmap bitmap =
                BitmapFactory.decodeResource(context.getResources(), R.drawable.chrome_sync_logo);

        notificationBuilder.setSmallIconId(R.drawable.ic_chrome);
        notificationBuilder.setStatusBarIcon(bitmap);
        notificationBuilder.setChannelId(ChromeChannelDefinitions.ChannelId.SITES);

        Notification notification = buildNotification(notificationBuilder);

        Bitmap result = NotificationTestUtil.getSmallIconFromNotification(context, notification);

        Assert.assertNotNull(result);

        if (NotificationBuilderBase.deviceSupportsBitmapStatusBarIcons()) {
            // Check the white overlay was applied.
            Bitmap expected = bitmap.copy(bitmap.getConfig(), true);
            NotificationBuilderBase.applyWhiteOverlayToBitmap(expected);
            Assert.assertTrue(expected.sameAs(result));

            // Check using the same bitmap on another builder gives the same result.
            NotificationBuilderBase otherBuilder = new StandardNotificationBuilder(context);
            otherBuilder.setStatusBarIcon(bitmap).setChannelId(
                    ChromeChannelDefinitions.ChannelId.SITES);
            Notification otherNotification = buildNotification(otherBuilder);
            Assert.assertTrue(expected.sameAs(
                    NotificationTestUtil.getSmallIconFromNotification(context, otherNotification)));
        } else {
            Bitmap expected =
                    BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_chrome);
            Assert.assertTrue(expected.sameAs(result));
        }
    }

    /**
     * Regression test for crash observed on Samsung/Coolpad Marshmallow devices - see crbug/829367.
     */
    @Test
    @MinAndroidSdkLevel(Build.VERSION_CODES.M)
    @SmallTest
    @Feature({"Browser", "Notifications"})
    public void testRenotifyWithCustomBadgeDoesNotCrash() {
        Context context = InstrumentationRegistry.getTargetContext();

        NotificationBuilderBase builder =
                new StandardNotificationBuilder(context)
                        .setChannelId(ChromeChannelDefinitions.ChannelId.SITES)
                        .setSmallIconId(R.drawable.ic_chrome);
        Notification notification = buildNotification(builder);

        Bitmap bitmap = Bitmap.createBitmap(new int[] {Color.BLUE}, 1, 1, Bitmap.Config.ARGB_8888);

        NotificationBuilderBase otherBuilder =
                new StandardNotificationBuilder(context)
                        .setChannelId(ChromeChannelDefinitions.ChannelId.SITES)
                        .setSmallIconId(R.drawable.ic_chrome)
                        .setStatusBarIcon(bitmap);
        Notification notificationWithBitmap = buildNotification(otherBuilder);

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify("tag-1", 1, notification);
        notificationManager.notify("tag-1", 1, notificationWithBitmap);
    }

    @Test
    @SmallTest
    @Feature({"Browser", "Notifications"})
    public void testAddTextActionSetsRemoteInput() {
        Context context = InstrumentationRegistry.getTargetContext();
        NotificationBuilderBase notificationBuilder =
                new StandardNotificationBuilder(context)
                        .setChannelId(ChromeChannelDefinitions.ChannelId.SITES)
                        .addTextAction(null, "Action Title", createIntent(context, "button"),
                                "Placeholder");

        Notification notification = buildNotification(notificationBuilder);

        Assert.assertEquals(1, notification.actions.length);
        Assert.assertEquals("Action Title", notification.actions[0].title);
        Assert.assertNotNull(notification.actions[0].getRemoteInputs());
        Assert.assertEquals(1, notification.actions[0].getRemoteInputs().length);
        Assert.assertEquals("Placeholder", notification.actions[0].getRemoteInputs()[0].getLabel());
    }

    private static PendingIntentProvider createIntent(Context context, String action) {
        Intent intent = new Intent("StandardNotificationBuilderTest." + action);
        return PendingIntentProvider.getBroadcast(
                context, 0 /* requestCode */, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }
}
