package org.chromium.content.browser.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.Override;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@CheckDiscard("crbug.com/993421")
class WebContentsAccessibilityImplJni implements WebContentsAccessibilityImpl.Natives {
  private static WebContentsAccessibilityImpl.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsAccessibilityImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContentsAccessibilityImpl caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_init(caller, webContents);
  }

  @Override
  public long initWithAXTree(WebContentsAccessibilityImpl caller, long axTreePtr) {
    return (long)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_initWithAXTree(caller, axTreePtr);
  }

  @Override
  public void deleteEarly(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_deleteEarly(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void onAutofillPopupDisplayed(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDisplayed(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void onAutofillPopupDismissed(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDismissed(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public int getIdForElementAfterElementHostingAutofillPopup(
      long nativeWebContentsAccessibilityAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getIdForElementAfterElementHostingAutofillPopup(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public int getRootId(long nativeWebContentsAccessibilityAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getRootId(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public boolean isNodeValid(long nativeWebContentsAccessibilityAndroid, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isNodeValid(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public boolean isAutofillPopupNode(long nativeWebContentsAccessibilityAndroid, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isAutofillPopupNode(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public boolean isEditableText(long nativeWebContentsAccessibilityAndroid, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEditableText(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public boolean isFocused(long nativeWebContentsAccessibilityAndroid, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isFocused(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public int getEditableTextSelectionStart(long nativeWebContentsAccessibilityAndroid, int id) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionStart(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public int getEditableTextSelectionEnd(long nativeWebContentsAccessibilityAndroid, int id) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionEnd(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public int[] getAbsolutePositionForNode(long nativeWebContentsAccessibilityAndroid, int id) {
    return (int[])GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getAbsolutePositionForNode(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public boolean updateCachedAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid,
      AccessibilityNodeInfoCompat info, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_updateCachedAccessibilityNodeInfo(nativeWebContentsAccessibilityAndroid, info, id);
  }

  @Override
  public boolean populateAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid,
      AccessibilityNodeInfoCompat info, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityNodeInfo(nativeWebContentsAccessibilityAndroid, info, id);
  }

  @Override
  public boolean populateAccessibilityEvent(long nativeWebContentsAccessibilityAndroid,
      AccessibilityEvent event, int id, int eventType) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityEvent(nativeWebContentsAccessibilityAndroid, event, id, eventType);
  }

  @Override
  public void click(long nativeWebContentsAccessibilityAndroid, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_click(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public void focus(long nativeWebContentsAccessibilityAndroid, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_focus(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public void blur(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_blur(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void scrollToMakeNodeVisible(long nativeWebContentsAccessibilityAndroid, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scrollToMakeNodeVisible(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public int findElementType(long nativeWebContentsAccessibilityAndroid, int startId,
      String elementType, boolean forwards, boolean canWrapToLastElement,
      boolean useDefaultPredicate) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_findElementType(nativeWebContentsAccessibilityAndroid, startId, elementType, forwards, canWrapToLastElement, useDefaultPredicate);
  }

  @Override
  public void setTextFieldValue(long nativeWebContentsAccessibilityAndroid, int id,
      String newValue) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setTextFieldValue(nativeWebContentsAccessibilityAndroid, id, newValue);
  }

  @Override
  public void setSelection(long nativeWebContentsAccessibilityAndroid, int id, int start, int end) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setSelection(nativeWebContentsAccessibilityAndroid, id, start, end);
  }

  @Override
  public boolean nextAtGranularity(long nativeWebContentsAccessibilityAndroid,
      int selectionGranularity, boolean extendSelection, int id, int cursorIndex) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_nextAtGranularity(nativeWebContentsAccessibilityAndroid, selectionGranularity, extendSelection, id, cursorIndex);
  }

  @Override
  public boolean previousAtGranularity(long nativeWebContentsAccessibilityAndroid,
      int selectionGranularity, boolean extendSelection, int id, int cursorIndex) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_previousAtGranularity(nativeWebContentsAccessibilityAndroid, selectionGranularity, extendSelection, id, cursorIndex);
  }

  @Override
  public boolean adjustSlider(long nativeWebContentsAccessibilityAndroid, int id,
      boolean increment) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_adjustSlider(nativeWebContentsAccessibilityAndroid, id, increment);
  }

  @Override
  public void moveAccessibilityFocus(long nativeWebContentsAccessibilityAndroid, int oldId,
      int newId) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_moveAccessibilityFocus(nativeWebContentsAccessibilityAndroid, oldId, newId);
  }

  @Override
  public boolean isSlider(long nativeWebContentsAccessibilityAndroid, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isSlider(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public boolean scroll(long nativeWebContentsAccessibilityAndroid, int id, int direction,
      boolean pageScroll) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scroll(nativeWebContentsAccessibilityAndroid, id, direction, pageScroll);
  }

  @Override
  public boolean setRangeValue(long nativeWebContentsAccessibilityAndroid, int id, float value) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setRangeValue(nativeWebContentsAccessibilityAndroid, id, value);
  }

  @Override
  public String getSupportedHtmlElementTypes(long nativeWebContentsAccessibilityAndroid) {
    return (String)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getSupportedHtmlElementTypes(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void showContextMenu(long nativeWebContentsAccessibilityAndroid, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_showContextMenu(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public boolean isEnabled(long nativeWebContentsAccessibilityAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEnabled(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void enable(long nativeWebContentsAccessibilityAndroid, boolean screenReaderMode) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_enable(nativeWebContentsAccessibilityAndroid, screenReaderMode);
  }

  @Override
  public void setAXMode(long nativeWebContentsAccessibilityAndroid, boolean screenReaderMode,
      boolean isAccessibilityEnabled) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setAXMode(nativeWebContentsAccessibilityAndroid, screenReaderMode, isAccessibilityEnabled);
  }

  @Override
  public boolean areInlineTextBoxesLoaded(long nativeWebContentsAccessibilityAndroid, int id) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_areInlineTextBoxesLoaded(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public void loadInlineTextBoxes(long nativeWebContentsAccessibilityAndroid, int id) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_loadInlineTextBoxes(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public int[] getCharacterBoundingBoxes(long nativeWebContentsAccessibilityAndroid, int id,
      int start, int len) {
    return (int[])GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getCharacterBoundingBoxes(nativeWebContentsAccessibilityAndroid, id, start, len);
  }

  @Override
  public int getTextLength(long nativeWebContentsAccessibilityAndroid, int id) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getTextLength(nativeWebContentsAccessibilityAndroid, id);
  }

  @Override
  public void addSpellingErrorForTesting(long nativeWebContentsAccessibilityAndroid, int id,
      int startOffset, int endOffset) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_addSpellingErrorForTesting(nativeWebContentsAccessibilityAndroid, id, startOffset, endOffset);
  }

  @Override
  public void setMaxContentChangedEventsToFireForTesting(long nativeWebContentsAccessibilityAndroid,
      int maxEvents) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setMaxContentChangedEventsToFireForTesting(nativeWebContentsAccessibilityAndroid, maxEvents);
  }

  @Override
  public int getMaxContentChangedEventsToFireForTesting(
      long nativeWebContentsAccessibilityAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getMaxContentChangedEventsToFireForTesting(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void signalEndOfTestForTesting(long nativeWebContentsAccessibilityAndroid) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_signalEndOfTestForTesting(nativeWebContentsAccessibilityAndroid);
  }

  @Override
  public void setAllowImageDescriptions(long nativeWebContentsAccessibilityAndroid,
      boolean allowImageDescriptions) {
    GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setAllowImageDescriptions(nativeWebContentsAccessibilityAndroid, allowImageDescriptions);
  }

  @Override
  public boolean onHoverEventNoRenderer(long nativeWebContentsAccessibilityAndroid, float x,
      float y) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onHoverEventNoRenderer(nativeWebContentsAccessibilityAndroid, x, y);
  }

  @Override
  public boolean getImageData(long nativeWebContentsAccessibilityAndroid,
      AccessibilityNodeInfoCompat info, int id, boolean hasSentPreviousRequest) {
    return (boolean)GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getImageData(nativeWebContentsAccessibilityAndroid, info, id, hasSentPreviousRequest);
  }

  public static WebContentsAccessibilityImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsAccessibilityImplJni();
  }
}
