package org.chromium.content.browser.webcontents;

import android.graphics.Rect;
import android.view.ViewStructure;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.accessibility.ViewStructureBuilder;
import org.chromium.content_public.browser.ImageDownloadCallback;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.MessagePayload;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.OverscrollRefreshHandler;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

@CheckDiscard("crbug.com/993421")
class WebContentsImplJni implements WebContentsImpl.Natives {
  private static WebContentsImpl.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.webcontents.WebContentsImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.webcontents.WebContentsImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroyWebContents(long webContentsAndroidPtr) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_destroyWebContents(webContentsAndroidPtr);
  }

  @Override
  public WebContents fromNativePtr(long webContentsAndroidPtr) {
    return (WebContents)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_fromNativePtr(webContentsAndroidPtr);
  }

  @Override
  public void clearNativeReference(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_clearNativeReference(nativeWebContentsAndroid);
  }

  @Override
  public WindowAndroid getTopLevelNativeWindow(long nativeWebContentsAndroid) {
    return (WindowAndroid)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getTopLevelNativeWindow(nativeWebContentsAndroid);
  }

  @Override
  public void setTopLevelNativeWindow(long nativeWebContentsAndroid, WindowAndroid windowAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setTopLevelNativeWindow(nativeWebContentsAndroid, windowAndroid);
  }

  @Override
  public RenderFrameHost getMainFrame(long nativeWebContentsAndroid) {
    return (RenderFrameHost)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getMainFrame(nativeWebContentsAndroid);
  }

  @Override
  public RenderFrameHost getFocusedFrame(long nativeWebContentsAndroid) {
    return (RenderFrameHost)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getFocusedFrame(nativeWebContentsAndroid);
  }

  @Override
  public RenderFrameHost getRenderFrameHostFromId(long nativeWebContentsAndroid,
      int renderProcessId, int renderFrameId) {
    return (RenderFrameHost)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getRenderFrameHostFromId(nativeWebContentsAndroid, renderProcessId, renderFrameId);
  }

  @Override
  public RenderFrameHost[] getAllRenderFrameHosts(long nativeWebContentsAndroid) {
    return (RenderFrameHost[])GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getAllRenderFrameHosts(nativeWebContentsAndroid);
  }

  @Override
  public RenderWidgetHostViewImpl getRenderWidgetHostView(long nativeWebContentsAndroid) {
    return (RenderWidgetHostViewImpl)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getRenderWidgetHostView(nativeWebContentsAndroid);
  }

  @Override
  public WebContentsImpl[] getInnerWebContents(long nativeWebContentsAndroid) {
    return (WebContentsImpl[])GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getInnerWebContents(nativeWebContentsAndroid);
  }

  @Override
  public int getVisibility(long nativeWebContentsAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getVisibility(nativeWebContentsAndroid);
  }

  @Override
  public String getTitle(long nativeWebContentsAndroid) {
    return (String)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getTitle(nativeWebContentsAndroid);
  }

  @Override
  public GURL getVisibleURL(long nativeWebContentsAndroid) {
    return (GURL)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getVisibleURL(nativeWebContentsAndroid);
  }

  @Override
  public String getEncoding(long nativeWebContentsAndroid) {
    return (String)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getEncoding(nativeWebContentsAndroid);
  }

  @Override
  public boolean isLoading(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isLoading(nativeWebContentsAndroid);
  }

  @Override
  public boolean shouldShowLoadingUI(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_shouldShowLoadingUI(nativeWebContentsAndroid);
  }

  @Override
  public void dispatchBeforeUnload(long nativeWebContentsAndroid, boolean autoCancel) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_dispatchBeforeUnload(nativeWebContentsAndroid, autoCancel);
  }

  @Override
  public void stop(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_stop(nativeWebContentsAndroid);
  }

  @Override
  public void cut(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_cut(nativeWebContentsAndroid);
  }

  @Override
  public void copy(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_copy(nativeWebContentsAndroid);
  }

  @Override
  public void paste(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_paste(nativeWebContentsAndroid);
  }

  @Override
  public void pasteAsPlainText(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_pasteAsPlainText(nativeWebContentsAndroid);
  }

  @Override
  public void replace(long nativeWebContentsAndroid, String word) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_replace(nativeWebContentsAndroid, word);
  }

  @Override
  public void selectAll(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_selectAll(nativeWebContentsAndroid);
  }

  @Override
  public void collapseSelection(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_collapseSelection(nativeWebContentsAndroid);
  }

  @Override
  public void onHide(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_onHide(nativeWebContentsAndroid);
  }

  @Override
  public void onShow(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_onShow(nativeWebContentsAndroid);
  }

  @Override
  public void setImportance(long nativeWebContentsAndroid, int importance) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setImportance(nativeWebContentsAndroid, importance);
  }

  @Override
  public void suspendAllMediaPlayers(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_suspendAllMediaPlayers(nativeWebContentsAndroid);
  }

  @Override
  public void setAudioMuted(long nativeWebContentsAndroid, boolean mute) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setAudioMuted(nativeWebContentsAndroid, mute);
  }

  @Override
  public boolean focusLocationBarByDefault(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_focusLocationBarByDefault(nativeWebContentsAndroid);
  }

  @Override
  public boolean isFullscreenForCurrentTab(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isFullscreenForCurrentTab(nativeWebContentsAndroid);
  }

  @Override
  public void exitFullscreen(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_exitFullscreen(nativeWebContentsAndroid);
  }

  @Override
  public void scrollFocusedEditableNodeIntoView(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_scrollFocusedEditableNodeIntoView(nativeWebContentsAndroid);
  }

  @Override
  public void selectAroundCaret(long nativeWebContentsAndroid, int granularity,
      boolean shouldShowHandle, boolean shouldShowContextMenu) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_selectAroundCaret(nativeWebContentsAndroid, granularity, shouldShowHandle, shouldShowContextMenu);
  }

  @Override
  public void adjustSelectionByCharacterOffset(long nativeWebContentsAndroid, int startAdjust,
      int endAdjust, boolean showSelectionMenu) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_adjustSelectionByCharacterOffset(nativeWebContentsAndroid, startAdjust, endAdjust, showSelectionMenu);
  }

  @Override
  public GURL getLastCommittedURL(long nativeWebContentsAndroid) {
    return (GURL)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getLastCommittedURL(nativeWebContentsAndroid);
  }

  @Override
  public boolean isIncognito(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isIncognito(nativeWebContentsAndroid);
  }

  @Override
  public void resumeLoadingCreatedWebContents(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_resumeLoadingCreatedWebContents(nativeWebContentsAndroid);
  }

  @Override
  public void evaluateJavaScript(long nativeWebContentsAndroid, String script,
      JavaScriptCallback callback) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_evaluateJavaScript(nativeWebContentsAndroid, script, callback);
  }

  @Override
  public void evaluateJavaScriptForTests(long nativeWebContentsAndroid, String script,
      JavaScriptCallback callback) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_evaluateJavaScriptForTests(nativeWebContentsAndroid, script, callback);
  }

  @Override
  public void addMessageToDevToolsConsole(long nativeWebContentsAndroid, int level,
      String message) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_addMessageToDevToolsConsole(nativeWebContentsAndroid, level, message);
  }

  @Override
  public void postMessageToMainFrame(long nativeWebContentsAndroid, MessagePayload payload,
      String sourceOrigin, String targetOrigin, MessagePort[] ports) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_postMessageToMainFrame(nativeWebContentsAndroid, payload, sourceOrigin, targetOrigin, ports);
  }

  @Override
  public boolean hasAccessedInitialDocument(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_hasAccessedInitialDocument(nativeWebContentsAndroid);
  }

  @Override
  public int getThemeColor(long nativeWebContentsAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getThemeColor(nativeWebContentsAndroid);
  }

  @Override
  public float getLoadProgress(long nativeWebContentsAndroid) {
    return (float)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getLoadProgress(nativeWebContentsAndroid);
  }

  @Override
  public void requestSmartClipExtract(long nativeWebContentsAndroid,
      WebContentsImpl.SmartClipCallback callback, int x, int y, int width, int height) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_requestSmartClipExtract(nativeWebContentsAndroid, callback, x, y, width, height);
  }

  @Override
  public void requestAccessibilitySnapshot(long nativeWebContentsAndroid,
      ViewStructure viewStructureRoot, ViewStructureBuilder viewStructureBuilder,
      Runnable doneCallback) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_requestAccessibilitySnapshot(nativeWebContentsAndroid, viewStructureRoot, viewStructureBuilder, doneCallback);
  }

  @Override
  public void setOverscrollRefreshHandler(long nativeWebContentsAndroid,
      OverscrollRefreshHandler nativeOverscrollRefreshHandler) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setOverscrollRefreshHandler(nativeWebContentsAndroid, nativeOverscrollRefreshHandler);
  }

  @Override
  public void setSpatialNavigationDisabled(long nativeWebContentsAndroid, boolean disabled) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setSpatialNavigationDisabled(nativeWebContentsAndroid, disabled);
  }

  @Override
  public void setStylusHandwritingEnabled(long nativeWebContentsAndroid, boolean enabled) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setStylusHandwritingEnabled(nativeWebContentsAndroid, enabled);
  }

  @Override
  public int downloadImage(long nativeWebContentsAndroid, GURL url, boolean isFavicon,
      int maxBitmapSize, boolean bypassCache, ImageDownloadCallback callback) {
    return (int)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_downloadImage(nativeWebContentsAndroid, url, isFavicon, maxBitmapSize, bypassCache, callback);
  }

  @Override
  public void setHasPersistentVideo(long nativeWebContentsAndroid, boolean value) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setHasPersistentVideo(nativeWebContentsAndroid, value);
  }

  @Override
  public boolean hasActiveEffectivelyFullscreenVideo(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_hasActiveEffectivelyFullscreenVideo(nativeWebContentsAndroid);
  }

  @Override
  public boolean isPictureInPictureAllowedForFullscreenVideo(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isPictureInPictureAllowedForFullscreenVideo(nativeWebContentsAndroid);
  }

  @Override
  public Rect getFullscreenVideoSize(long nativeWebContentsAndroid) {
    return (Rect)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getFullscreenVideoSize(nativeWebContentsAndroid);
  }

  @Override
  public void setSize(long nativeWebContentsAndroid, int width, int height) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setSize(nativeWebContentsAndroid, width, height);
  }

  @Override
  public int getWidth(long nativeWebContentsAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getWidth(nativeWebContentsAndroid);
  }

  @Override
  public int getHeight(long nativeWebContentsAndroid) {
    return (int)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getHeight(nativeWebContentsAndroid);
  }

  @Override
  public EventForwarder getOrCreateEventForwarder(long nativeWebContentsAndroid) {
    return (EventForwarder)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getOrCreateEventForwarder(nativeWebContentsAndroid);
  }

  @Override
  public void setViewAndroidDelegate(long nativeWebContentsAndroid,
      ViewAndroidDelegate viewDelegate) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setViewAndroidDelegate(nativeWebContentsAndroid, viewDelegate);
  }

  @Override
  public void sendOrientationChangeEvent(long nativeWebContentsAndroid, int orientation) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_sendOrientationChangeEvent(nativeWebContentsAndroid, orientation);
  }

  @Override
  public void onScaleFactorChanged(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_onScaleFactorChanged(nativeWebContentsAndroid);
  }

  @Override
  public void setFocus(long nativeWebContentsAndroid, boolean focused) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setFocus(nativeWebContentsAndroid, focused);
  }

  @Override
  public void setDisplayCutoutSafeArea(long nativeWebContentsAndroid, int top, int left, int bottom,
      int right) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setDisplayCutoutSafeArea(nativeWebContentsAndroid, top, left, bottom, right);
  }

  @Override
  public void notifyRendererPreferenceUpdate(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_notifyRendererPreferenceUpdate(nativeWebContentsAndroid);
  }

  @Override
  public void notifyBrowserControlsHeightChanged(long nativeWebContentsAndroid) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_notifyBrowserControlsHeightChanged(nativeWebContentsAndroid);
  }

  @Override
  public boolean isBeingDestroyed(long nativeWebContentsAndroid) {
    return (boolean)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isBeingDestroyed(nativeWebContentsAndroid);
  }

  public static WebContentsImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.webcontents.WebContentsImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsImplJni();
  }
}
