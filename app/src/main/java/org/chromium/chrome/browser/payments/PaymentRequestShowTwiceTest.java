// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.payments;

import androidx.test.filters.MediumTest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.chromium.base.metrics.RecordHistogram;
import org.chromium.base.test.util.CallbackHelper;
import org.chromium.base.test.util.CommandLineFlags;
import org.chromium.base.test.util.Feature;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.autofill.AutofillTestHelper;
import org.chromium.chrome.browser.autofill.PersonalDataManager.AutofillProfile;
import org.chromium.chrome.browser.autofill.PersonalDataManager.CreditCard;
import org.chromium.chrome.browser.flags.ChromeSwitches;
import org.chromium.chrome.browser.payments.PaymentRequestTestRule.MainActivityStartCallback;
import org.chromium.chrome.test.ChromeJUnit4ClassRunner;
import org.chromium.components.payments.NotShownReason;
import org.chromium.content_public.browser.test.util.JavaScriptUtils;

import java.util.concurrent.TimeoutException;

/**
 * A payment integration test for a merchant that calls show() twice.
 */
@RunWith(ChromeJUnit4ClassRunner.class)
@CommandLineFlags.Add({ChromeSwitches.DISABLE_FIRST_RUN_EXPERIENCE})
public class PaymentRequestShowTwiceTest implements MainActivityStartCallback {
    @Rule
    public PaymentRequestTestRule mPaymentRequestTestRule =
            new PaymentRequestTestRule("payment_request_show_twice_test.html", this);

    @Override
    public void onMainActivityStarted() throws TimeoutException {
        AutofillTestHelper helper = new AutofillTestHelper();
        String billingAddressId = helper.setProfile(new AutofillProfile("", "https://example.com",
                true, "" /* honorific prefix */, "Jon Doe", "Google", "340 Main St", "CA",
                "Los Angeles", "", "90291", "", "US", "555-555-5555", "", "en-US"));
        helper.setCreditCard(new CreditCard("", "https://example.com", true, true, "Jon Doe",
                "4111111111111111", "1111", "12", "2050", "visa", R.drawable.visa_card,
                billingAddressId, "" /* serverId */));
    }

    /**
     * Runs a piece of JavaScript with a user gesture and waits for a given CallbackHelper to occur.
     **/
    private void runJavascriptAndWaitFor(String code, CallbackHelper helper)
            throws TimeoutException {
        int callCount = helper.getCallCount();
        mPaymentRequestTestRule.runJavaScriptCodeWithUserGestureInCurrentTab(code);
        helper.waitForCallback(callCount);
    }

    /**
     * Runs a piece of JavaScript with a user gesture and waits for the promise it returns to settle
     * or reject; returning the result in either case.
     *
     * @param promiseCode a JavaScript snippet that will return a promise
     */
    private String runJavaScriptWithUserGestureAndWaitForPromise(String promiseCode)
            throws TimeoutException {
        String code = promiseCode + ".then(result => domAutomationController.send(result))"
                + ".catch(error => domAutomationController.send(error));";
        return JavaScriptUtils.runJavascriptWithUserGestureAndAsyncResult(
                mPaymentRequestTestRule.getWebContents(), code);
    }

    @Test
    @MediumTest
    @Feature({"Payments"})
    @CommandLineFlags.Add({"enable-features=PaymentRequestBasicCard"})
    public void testSecondShowRequestCancelled() throws TimeoutException {
        mPaymentRequestTestRule.openPage();
        runJavascriptAndWaitFor("showFirst()", mPaymentRequestTestRule.getReadyToPay());
        Assert.assertEquals(
                "\"Second request: AbortError: Another PaymentRequest UI is already showing in a different tab or window.\"",
                runJavaScriptWithUserGestureAndWaitForPromise("showSecond()"));

        // The web payments UI was not aborted.
        mPaymentRequestTestRule.assertOnlySpecificAbortMetricLogged(-1 /* none */);

        // The second UI was never shown due to another web payments UI already showing.
        Assert.assertEquals(1,
                RecordHistogram.getHistogramValueCountForTesting(
                        "PaymentRequest.CheckoutFunnel.NoShow",
                        NotShownReason.CONCURRENT_REQUESTS));

        mPaymentRequestTestRule.clickAndWait(
                R.id.close_button, mPaymentRequestTestRule.getDismissed());
    }
}
