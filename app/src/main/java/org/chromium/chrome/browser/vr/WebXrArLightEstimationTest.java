// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.vr;

import static org.chromium.chrome.browser.vr.WebXrArTestFramework.PAGE_LOAD_TIMEOUT_S;

import android.os.Build;

import androidx.test.filters.MediumTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.runner.RunWith;

import org.chromium.base.test.params.ParameterAnnotations.ClassParameter;
import org.chromium.base.test.params.ParameterAnnotations.UseRunnerDelegate;
import org.chromium.base.test.params.ParameterSet;
import org.chromium.base.test.params.ParameterizedRunner;
import org.chromium.base.test.util.CommandLineFlags;
import org.chromium.base.test.util.MinAndroidSdkLevel;
import org.chromium.chrome.browser.flags.ChromeSwitches;
import org.chromium.chrome.browser.vr.rules.ArPlaybackFile;
import org.chromium.chrome.browser.vr.rules.XrActivityRestriction;
import org.chromium.chrome.browser.vr.util.ArTestRuleUtils;
import org.chromium.chrome.test.ChromeActivityTestRule;
import org.chromium.chrome.test.ChromeJUnit4RunnerDelegate;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * End-to-end tests for testing WebXR for AR's anchors behavior.
 */
@RunWith(ParameterizedRunner.class)
@UseRunnerDelegate(ChromeJUnit4RunnerDelegate.class)
@CommandLineFlags.
Add({ChromeSwitches.DISABLE_FIRST_RUN_EXPERIENCE, "enable-features=LogJsConsoleMessages"})
@MinAndroidSdkLevel(Build.VERSION_CODES.N) // WebXR for AR is only supported on N+
public class WebXrArLightEstimationTest {
    @ClassParameter
    private static List<ParameterSet> sClassParams =
            ArTestRuleUtils.generateDefaultTestRuleParameters();
    @Rule
    public RuleChain mRuleChain;

    private ChromeActivityTestRule mTestRule;
    private WebXrArTestFramework mWebXrArTestFramework;

    public WebXrArLightEstimationTest(Callable<ChromeActivityTestRule> callable) throws Exception {
        mTestRule = callable.call();
        mRuleChain = ArTestRuleUtils.wrapRuleInActivityRestrictionRule(mTestRule);
    }

    @Before
    public void setUp() {
        mWebXrArTestFramework = new WebXrArTestFramework(mTestRule);
    }

    /**
     * Tests that depth sensing API returns results that can be queried for depth.
     */
    @Test
    @MediumTest
    @XrActivityRestriction({XrActivityRestriction.SupportedActivity.ALL})
    @ArPlaybackFile("chrome/test/data/xr/ar_playback_datasets/floor_session_12s_30fps.mp4")
    public void testLightEstimationWorks() {
        mWebXrArTestFramework.loadFileAndAwaitInitialization(
                "webxr_test_basic_light_estimation_test", PAGE_LOAD_TIMEOUT_S);
        mWebXrArTestFramework.enterSessionWithUserGestureOrFail();
        mWebXrArTestFramework.executeStepAndWait("stepStartLightEstimationTest()");
        mWebXrArTestFramework.endTest();
    }
}
