// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.ui.android.webid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.StringRes;

import com.google.android.material.color.MaterialColors;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionProperties.AccountProperties;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionProperties.AutoSignInCancelButtonProperties;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionProperties.ContinueButtonProperties;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionProperties.DataSharingConsentProperties;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionProperties.HeaderProperties;
import org.chromium.chrome.browser.ui.android.webid.AccountSelectionProperties.ItemProperties;
import org.chromium.chrome.browser.ui.android.webid.data.Account;
import org.chromium.chrome.browser.ui.android.webid.data.IdentityProviderMetadata;
import org.chromium.components.browser_ui.util.AvatarGenerator;
import org.chromium.components.browser_ui.widget.RoundedIconGenerator;
import org.chromium.ui.modelutil.PropertyKey;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.modelutil.PropertyModel.WritableObjectPropertyKey;
import org.chromium.ui.modelutil.PropertyModelChangeProcessor.ViewBinder;
import org.chromium.ui.text.NoUnderlineClickableSpan;
import org.chromium.ui.text.SpanApplier;
import org.chromium.ui.util.ColorUtils;
import org.chromium.ui.widget.ButtonCompat;

import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.R;
/**
 * Provides functions that map {@link AccountSelectionProperties} changes in a {@link PropertyModel}
 * to the suitable method in {@link AccountSelectionView}.
 */
class AccountSelectionViewBinder {
    private static final String TAG = "AccountSelectionView";

    /**
     * The size of the maskable icon's safe zone as a fraction of the icon's edge size as defined
     * in https://www.w3.org/TR/appmanifest/
     */
    private static final float MASKABLE_ICON_SAFE_ZONE_DIAMETER_RATIO = 0.8f;

    /**
     * Returns bitmap with the maskable bitmap's safe zone as defined in
     * https://www.w3.org/TR/appmanifest/ cropped in a circle.
     * @param resources the Resources used to set initial target density.
     * @param bitmap the maskable bitmap. It should adhere to the maskable icon spec as defined in
     * https://www.w3.org/TR/appmanifest/
     * @param outBitmapSize the target bitmap size in pixels.
     * @return the cropped bitmap.
     */
    public static Drawable createBitmapWithMaskableIconSafeZone(
            Resources resources, Bitmap bitmap, int outBitmapSize) {
        int cropWidth =
                (int) Math.floor(bitmap.getWidth() * MASKABLE_ICON_SAFE_ZONE_DIAMETER_RATIO);
        int cropHeight =
                (int) Math.floor(bitmap.getHeight() * MASKABLE_ICON_SAFE_ZONE_DIAMETER_RATIO);
        int cropX = (int) Math.floor((bitmap.getWidth() - cropWidth) / 2.0f);
        int cropY = (int) Math.floor((bitmap.getHeight() - cropHeight) / 2.0f);

        Bitmap output = Bitmap.createBitmap(outBitmapSize, outBitmapSize, Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        // Fill the canvas with transparent color.
        canvas.drawColor(Color.TRANSPARENT);
        // Draw a white circle.
        float radius = (float) outBitmapSize / 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(radius, radius, radius, paint);
        // Use SRC_IN so white circle acts as a mask while drawing the avatar.
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, new Rect(cropX, cropY, cropWidth + cropX, cropHeight + cropY),
                new Rect(0, 0, outBitmapSize, outBitmapSize), paint);
        return new BitmapDrawable(resources, output);
    }

    /**
     * Called whenever an account is bound to this view.
     * @param model The model containing the data for the view.
     * @param view The view to be bound.
     * @param key The key of the property to be bound.
     */
    static void bindAccountView(PropertyModel model, View view, PropertyKey key) {
        Account account = model.get(AccountProperties.ACCOUNT);
        if (key == AccountProperties.AVATAR) {
            AccountProperties.Avatar avatarData = model.get(AccountProperties.AVATAR);
            int avatarSize = avatarData.mAvatarSize;
            Bitmap avatar = avatarData.mAvatar;

            Resources resources = view.getContext().getResources();

            // Prepare avatar or its fallback monogram.
            if (avatar == null) {
                int avatarMonogramTextSize = view.getResources().getDimensionPixelSize(
                        R.dimen.account_selection_account_avatar_monogram_text_size);
                // TODO(crbug.com/1295017): Consult UI team to determine the background color we
                // need to use here.
                RoundedIconGenerator roundedIconGenerator =
                        new RoundedIconGenerator(resources, avatarSize /* iconWidthDp */,
                                avatarSize /* iconHeightDp */, avatarSize / 2 /* cornerRadiusDp */,
                                Color.GRAY /* backgroundColor */, avatarMonogramTextSize);
                avatar = roundedIconGenerator.generateIconForText(avatarData.mName);
            }
            Drawable croppedAvatar = AvatarGenerator.makeRoundAvatar(resources, avatar, avatarSize);

            ImageView avatarView = view.findViewById(R.id.start_icon);
            avatarView.setImageDrawable(croppedAvatar);
        } else if (key == AccountProperties.ON_CLICK_LISTENER) {
            Callback<Account> clickCallback = model.get(AccountProperties.ON_CLICK_LISTENER);
            if (clickCallback == null) {
                view.setOnClickListener(null);
            } else {
                view.setOnClickListener(clickedView -> { clickCallback.onResult(account); });
            }
        } else if (key == AccountProperties.ACCOUNT) {
            TextView subject = view.findViewById(R.id.title);
            subject.setText(account.getName());
            TextView email = view.findViewById(R.id.description);
            email.setText(account.getEmail());
        } else {
            assert false : "Unhandled update to property:" + key;
        }
    }

    static SpanApplier.SpanInfo createLink(Context context, String url, String tag) {
        if (TextUtils.isEmpty(url)) return null;

        String startTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";
        Callback<View> onClickCallback = v -> {
            CustomTabActivity.showInfoPage(context, url);
        };
        return new SpanApplier.SpanInfo(
                startTag, endTag, new NoUnderlineClickableSpan(context, onClickCallback));
    }

    /**
     * Called whenever a user data sharing consent is bound to this view.
     * @param model The model containing the data for the view.
     * @param view The view to be bound.
     * @param key The key of the property to be bound.
     */
    static void bindDataSharingConsentView(PropertyModel model, View view, PropertyKey key) {
        if (key == DataSharingConsentProperties.PROPERTIES) {
            DataSharingConsentProperties.Properties properties =
                    model.get(DataSharingConsentProperties.PROPERTIES);

            Context context = view.getContext();
            SpanApplier.SpanInfo privacyPolicySpan =
                    createLink(context, properties.mPrivacyPolicyUrl, "link_privacy_policy");
            SpanApplier.SpanInfo termsOfServiceSpan =
                    createLink(context, properties.mTermsOfServiceUrl, "link_terms_of_service");

            int consentTextId;
            if (privacyPolicySpan == null && termsOfServiceSpan == null) {
                consentTextId = R.string.account_selection_data_sharing_consent_no_pp_or_tos;
            } else if (privacyPolicySpan == null) {
                consentTextId = R.string.account_selection_data_sharing_consent_no_pp;
            } else if (termsOfServiceSpan == null) {
                consentTextId = R.string.account_selection_data_sharing_consent_no_tos;
            } else {
                consentTextId = R.string.account_selection_data_sharing_consent;
            }
            String consentText =
                    String.format(context.getString(consentTextId), properties.mIdpForDisplay);

            List<SpanApplier.SpanInfo> spans = new ArrayList<>();
            if (privacyPolicySpan != null) {
                spans.add(privacyPolicySpan);
            }
            if (termsOfServiceSpan != null) {
                spans.add(termsOfServiceSpan);
            }

            SpannableString span =
                    SpanApplier.applySpans(consentText, spans.toArray(new SpanApplier.SpanInfo[0]));
            TextView textView = view.findViewById(R.id.user_data_sharing_consent);
            textView.setText(span);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            assert false : "Unhandled update to property:" + key;
        }
    }

    /**
     * Called whenever a continue button for a single account is bound to this view.
     * @param model The model containing the data for the view.
     * @param view The view to be bound.
     * @param key The key of the property to be bound.
     */
    @SuppressWarnings("checkstyle:SetTextColorAndSetTextSizeCheck")
    static void bindContinueButtonView(PropertyModel model, View view, PropertyKey key) {
        Context context = view.getContext();
        ButtonCompat button = view.findViewById(R.id.account_selection_continue_btn);
        if (key == ContinueButtonProperties.IDP_METADATA) {
            if (!ColorUtils.inNightMode(context)) {
                IdentityProviderMetadata idpMetadata =
                        model.get(ContinueButtonProperties.IDP_METADATA);

                Integer backgroundColor = idpMetadata.getBrandBackgroundColor();
                if (backgroundColor != null) {
                    button.setButtonColor(ColorStateList.valueOf(backgroundColor));

                    Integer textColor = idpMetadata.getBrandTextColor();
                    if (textColor == null) {
                        textColor = MaterialColors.getColor(context,
                                ColorUtils.shouldUseLightForegroundOnBackground(backgroundColor)
                                        ? R.attr.colorOnPrimary
                                        : R.attr.colorOnSurface,
                                TAG);
                    }
                    button.setTextColor(textColor);
                }
            }
        } else if (key == ContinueButtonProperties.ACCOUNT) {
            Account account = model.get(ContinueButtonProperties.ACCOUNT);
            // Prefers to use given name if it is provided otherwise falls back to using the name.
            String givenName = account.getGivenName();
            String displayedName =
                    givenName != null && !givenName.isEmpty() ? givenName : account.getName();
            String btnText = String.format(
                    context.getString(R.string.account_selection_continue), displayedName);
            button.setText(btnText);
        } else if (key == ContinueButtonProperties.ON_CLICK_LISTENER) {
            button.setOnClickListener(clickedView -> {
                Account account = model.get(ContinueButtonProperties.ACCOUNT);
                model.get(ContinueButtonProperties.ON_CLICK_LISTENER).onResult(account);
            });
        } else {
            assert false : "Unhandled update to property:" + key;
        }
    }

    /**
     * Called whenever a cancel button for a single account is bound to this view.
     * @param model The model containing the data for the view.
     * @param view The view to be bound.
     * @param key The key of the property to be bound.
     */
    static void bindAutoSignInCancelButtonView(PropertyModel model, View view, PropertyKey key) {
        if (key != AutoSignInCancelButtonProperties.ON_CLICK_LISTENER) {
            assert false : "Unhandled update to property:" + key;
            return;
        }
        view.setOnClickListener(clickedView -> {
            model.get(AutoSignInCancelButtonProperties.ON_CLICK_LISTENER).run();
        });
        String btnText = String.format(view.getContext().getString(R.string.cancel));
        Button button = view.findViewById(R.id.auto_sign_in_cancel_btn);
        button.setText(btnText);
    }

    /**
     * Called whenever non-account views are bound to the bottom sheet.
     * @param model The model containing the data for the view.
     * @param view The view to be bound.
     * @param key The key of the property to be bound.
     */
    static void bindContentView(PropertyModel model, View view, PropertyKey key) {
        PropertyModel itemModel = model.get((WritableObjectPropertyKey<PropertyModel>) key);
        View itemView = null;
        ViewBinder<PropertyModel, View, PropertyKey> itemBinder = null;
        if (key == ItemProperties.HEADER) {
            itemView = view.findViewById(R.id.header_view_item);
            itemBinder = AccountSelectionViewBinder::bindHeaderView;
        } else if (key == ItemProperties.CONTINUE_BUTTON) {
            itemView = view.findViewById(R.id.account_selection_continue_btn);
            itemBinder = AccountSelectionViewBinder::bindContinueButtonView;
        } else if (key == ItemProperties.AUTO_SIGN_IN_CANCEL_BUTTON) {
            itemView = view.findViewById(R.id.auto_sign_in_cancel_btn);
            itemBinder = AccountSelectionViewBinder::bindAutoSignInCancelButtonView;
        } else if (key == ItemProperties.DATA_SHARING_CONSENT) {
            itemView = view.findViewById(R.id.user_data_sharing_consent);
            itemBinder = AccountSelectionViewBinder::bindDataSharingConsentView;
        } else {
            assert false : "Unhandled update to property:" + key;
            return;
        }

        if (itemModel == null) {
            itemView.setVisibility(View.GONE);
            return;
        }

        itemView.setVisibility(View.VISIBLE);
        for (PropertyKey itemKey : itemModel.getAllSetProperties()) {
            itemBinder.bind(itemModel, itemView, itemKey);
        }
    }

    /**
     * Called whenever a header is bound to this view.
     * @param model The model containing the data for the view.
     * @param view The view to be bound.
     * @param key The key of the property to be bound.
     */
    static void bindHeaderView(PropertyModel model, View view, PropertyKey key) {
        if (key == HeaderProperties.RP_FOR_DISPLAY || key == HeaderProperties.IDP_FOR_DISPLAY
                || key == HeaderProperties.TYPE) {
            Resources resources = view.getResources();
            TextView headerTitleText = view.findViewById(R.id.header_title);
            HeaderProperties.HeaderType headerType = model.get(HeaderProperties.TYPE);
            String title = computeHeaderTitle(resources, headerType,
                    model.get(HeaderProperties.RP_FOR_DISPLAY),
                    model.get(HeaderProperties.IDP_FOR_DISPLAY));
            headerTitleText.setText(title);

            // Make instructions for closing the bottom sheet part of the header's content
            // description. This is needed because the bottom sheet's content description (which
            // includes instructions to close the bottom sheet) is not announced when the FedCM
            // bottom sheet is shown. Don't include instructions for closing the bottom sheet as
            // part of the "Verifying..." header content description because the bottom sheet
            // closes itself automatically at the "Verifying..." stage.
            if (headerType != HeaderProperties.HeaderType.VERIFY) {
                headerTitleText.setContentDescription(title + ". "
                        + resources.getString(R.string.bottom_sheet_accessibility_description));
            } else {
                // Update the content description in case the view is recycled.
                headerTitleText.setContentDescription(title);
            }

            if (key == HeaderProperties.TYPE) {
                boolean progressBarVisible = (headerType == HeaderProperties.HeaderType.VERIFY);
                view.findViewById(R.id.header_progress_bar)
                        .setVisibility(progressBarVisible ? View.VISIBLE : View.GONE);
                view.findViewById(R.id.header_divider)
                        .setVisibility(!progressBarVisible ? View.VISIBLE : View.GONE);
            }
        } else if (key == HeaderProperties.IDP_BRAND_ICON) {
            Bitmap brandIcon = model.get(HeaderProperties.IDP_BRAND_ICON);
            if (brandIcon != null) {
                Resources resources = view.getResources();
                int iconSize =
                        resources.getDimensionPixelSize(R.dimen.account_selection_sheet_icon_size);
                Drawable croppedBrandIcon =
                        createBitmapWithMaskableIconSafeZone(resources, brandIcon, iconSize);
                ImageView headerIconView = (ImageView) view.findViewById(R.id.header_idp_icon);
                headerIconView.setImageDrawable(croppedBrandIcon);
                headerIconView.setVisibility(View.VISIBLE);
            }
        } else if (key == HeaderProperties.CLOSE_ON_CLICK_LISTENER) {
            final Runnable closeOnClickRunnable =
                    (Runnable) model.get(HeaderProperties.CLOSE_ON_CLICK_LISTENER);
            view.findViewById(R.id.close_button).setOnClickListener(clickedView -> {
                closeOnClickRunnable.run();
            });
        } else {
            assert false : "Unhandled update to property:" + key;
        }
    }

    /**
     * Returns text for the {@link HeaderType.VERIFY} header.
     */
    static @StringRes int getVerifyHeaderStringId() {
        return R.string.verify_sheet_title;
    }

    private static String computeHeaderTitle(
            Resources resources, HeaderProperties.HeaderType type, String rpUrl, String idpUrl) {
        if (type == HeaderProperties.HeaderType.VERIFY) {
            return resources.getString(getVerifyHeaderStringId());
        }
        @StringRes
        int titleStringId = (type == HeaderProperties.HeaderType.AUTO_SIGN_IN)
                ? R.string.account_selection_sheet_title_auto
                : R.string.account_selection_sheet_title_explicit;
        return String.format(resources.getString(titleStringId), rpUrl, idpUrl);
    }

    private AccountSelectionViewBinder() {}
}
