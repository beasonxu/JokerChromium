// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.blink_public.common;

/**
 * Constants for the names of Blink Features.
 */
public final class BlinkFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../third_party/blink/common/features.cc
    // Into
    //     ../../third_party/blink/public/common/android/java_templates/BlinkFeatures.java.tmpl

    // Apply lazy-loading to ad frames which have embeds likely impacting Core Web
    // Vitals.
    public static final String AUTOMATIC_LAZY_FRAME_LOADING_TO_ADS = "AutomaticLazyFrameLoadingToAds";

    // Apply lazy-loading to frames which have embeds likely impacting Core Web
    // Vitals.
    public static final String AUTOMATIC_LAZY_FRAME_LOADING_TO_EMBEDS = "AutomaticLazyFrameLoadingToEmbeds";

    // Define the allowed websites to use LazyEmbeds. The allowed websites need to
    // be defined separately from kAutomaticLazyFrameLoadingToEmbeds because we want
    // to gather Blink.AutomaticLazyLoadFrame.LazyEmbedFrameCount UKM data even when
    // kAutomaticLazyFrameLoadingToEmbeds is disabled.
    public static final String AUTOMATIC_LAZY_FRAME_LOADING_TO_EMBED_URLS = "AutomaticLazyFrameLoadingToEmbedUrls";

    // Allows pages with DedicatedWorker to stay eligible for the back/forward
    // cache.
    public static final String BACK_FORWARD_CACHE_DEDICATED_WORKER = "BackForwardCacheDedicatedWorker";

    // Enable intervention for download that was initiated from or occurred in an ad
    // frame without user activation.
    public static final String BLOCKING_DOWNLOADS_IN_AD_FRAME_WITHOUT_USER_ACTIVATION = "BlockingDownloadsInAdFrameWithoutUserActivation";

    // Enable CSS Container Queries. Also implies LayoutNGGrid and CSSContainSize1D.
    public static final String CSS_CONTAINER_QUERIES = "CSSContainerQueries";

    // Controls whether the Conversion Measurement API infrastructure is enabled.
    public static final String CONVERSION_MEASUREMENT = "ConversionMeasurement";

    // Controls whether LCP calculations should exclude low-entropy images. If
    // enabled, then the associated parameter sets the cutoff, expressed as the
    // minimum number of bits of encoded image data used to encode each rendered
    // pixel. Note that this is not just pixels of decoded image data; the rendered
    // size includes any scaling applied by the rendering engine to display the
    // content.
    public static final String EXCLUDE_LOW_ENTROPY_IMAGES_FROM_LCP = "ExcludeLowEntropyImagesFromLCP";

    // Used as a binding for controlling the runtime enabled blink feature
    // "FixedElementsDontOverscroll". This is needed for experimentation.
    public static final String FIXED_ELEMENTS_DONT_OVERSCROLL = "FixedElementsDontOverscroll";


    public static final String GMS_CORE_EMOJI = "GMSCoreEmoji";

    // Enable defer commits to avoid flash of unstyled content, for same origin
    // navigation only.
    public static final String PAINT_HOLDING = "PaintHolding";

    // Enable defer commits to avoid flash of unstyled content, for all navigation.
    public static final String PAINT_HOLDING_CROSS_ORIGIN = "PaintHoldingCrossOrigin";

    // Enable eagerly setting up a CacheStorage interface pointer and
    // passing it to service workers on startup as an optimization.
    // TODO(crbug/1077916): Re-enable once the issue with COOP/COEP is fixed.
    public static final String EAGER_CACHE_STORAGE_SETUP_FOR_SERVICE_WORKERS = "EagerCacheStorageSetupForServiceWorkers";

    // Controls script streaming.
    public static final String SCRIPT_STREAMING = "ScriptStreaming";

    // Allow streaming small (<30kB) scripts.
    public static final String SMALL_SCRIPT_STREAMING = "SmallScriptStreaming";

    // Controls off-thread code cache consumption.
    public static final String CONSUME_CODE_CACHE_OFF_THREAD = "ConsumeCodeCacheOffThread";

    // Enables user level memory pressure signal generation on Android.
    public static final String USER_LEVEL_MEMORY_PRESSURE_SIGNAL = "UserLevelMemoryPressureSignal";

    // Perform memory purges after freezing only if all pages are frozen.
    public static final String FREEZE_PURGE_MEMORY_ALL_PAGES_FROZEN = "FreezePurgeMemoryAllPagesFrozen";

    // Freezes the user-agent as part of https://github.com/WICG/ua-client-hints.
    public static final String REDUCE_USER_AGENT = "ReduceUserAgent";

    // Enables the `sec-ch-ua-full` client hint to be sent along with the full user
    // agent string in the HTTP request headers, as well as surfacing the full user
    // agent string in the JS APIs (navigator.userAgent, etc).
    public static final String FULL_USER_AGENT = "FullUserAgent";

    // Enables the frequency capping for detecting overlay popups. Overlay-popups
    // are the interstitials that pop up and block the main content of the page.
    public static final String FREQUENCY_CAPPING_FOR_OVERLAY_POPUP_DETECTION = "FrequencyCappingForOverlayPopupDetection";

    // Enables the frequency capping for detecting large sticky ads.
    // Large-sticky-ads are those ads that stick to the bottom of the page
    // regardless of a user’s efforts to scroll, and take up more than 30% of the
    // screen’s real estate.
    public static final String FREQUENCY_CAPPING_FOR_LARGE_STICKY_AD_DETECTION = "FrequencyCappingForLargeStickyAdDetection";

    // Enable Display Locking JavaScript APIs.
    public static final String DISPLAY_LOCKING = "DisplayLocking";


    public static final String JSON_MODULES = "JSONModules";


    public static final String DEFERRED_FONT_SHAPING = "DeferredShaping";

    // Enable LayoutNG.
    public static final String LAYOUT_NG = "LayoutNG";

    // Enables the use of the PaintCache for Path2D objects that are rasterized
    // out of process.  Has no effect when kCanvasOopRasterization is disabled.
    public static final String PATH2D_PAINT_CACHE = "Path2DPaintCache";

    // Enable by default. This feature is for a kill switch.
    public static final String LAYOUT_NG_BLOCK_IN_INLINE = "LayoutNGBlockInInline";


    public static final String PRIVACY_SANDBOX_ADS_AP_IS = "PrivacySandboxAdsAPIs";


    public static final String MIXED_CONTENT_AUTOUPGRADE = "AutoupgradeMixedContent";

    // Enables User-Agent Client Hints
    public static final String USER_AGENT_CLIENT_HINT = "UserAgentClientHint";

    // Handle prefers-color-scheme user preference media feature via client hints.
    public static final String PREFERS_COLOR_SCHEME_CLIENT_HINT_HEADER = "PrefersColorSchemeClientHintHeader";

    // Controls whether the Viewport Height client hint can be added to request
    // headers.
    public static final String VIEWPORT_HEIGHT_CLIENT_HINT_HEADER = "ViewportHeightClientHintHeader";

    // Used to control the collection of anchor element metrics (crbug.com/856683).
    // If kNavigationPredictor is enabled, then metrics of anchor elements
    // in the first viewport after the page load and the metrics of the clicked
    // anchor element will be extracted and recorded. Additionally, navigation
    // predictor may preconnect/prefetch to resources/origins to make the
    // future navigations faster.
    public static final String NAVIGATION_PREDICTOR = "NavigationPredictor";

    // Anchor Element Interaction
    public static final String ANCHOR_ELEMENT_INTERACTION = "AnchorElementInteraction";

    // Enable browser-initiated dedicated worker script loading
    // (PlzDedicatedWorker). https://crbug.com/906991
    public static final String PLZ_DEDICATED_WORKER = "PlzDedicatedWorker";

    // Enable Portals. https://crbug.com/865123.
    // Note that default enabling this does not expose the portal
    // element on its own, but does allow its use with an origin trial. This was the
    // case for the M85 Android only origin trial (https://crbug.com/1040212).
    public static final String PORTALS = "Portals";

    // https://crbug.com/1013389
    public static final String PORTALS_CROSS_ORIGIN = "PortalsCrossOrigin";

    // Enable the <fencedframe> element; see crbug.com/1123606. Note that enabling
    // this feature does not automatically expose this element to the web, it only
    // allows the element to be enabled by the runtime enabled feature, for origin
    // trials.
    public static final String FENCED_FRAMES = "FencedFrames";

    // Enable the shared storage API. Note that enabling this feature does not
    // automatically expose this API to the web, it only allows the element to be
    // enabled by the runtime enabled feature, for origin trials.
    // https://github.com/pythagoraskitty/shared-storage/blob/main/README.md
    public static final String SHARED_STORAGE_API = "SharedStorageAPI";

    // Enables the Prerender2 feature: https://crbug.com/1126305
    // Note that default enabling this does not enable the Prerender2 features
    // because kSetOnlyIfOverridden is used for setting WebRuntimeFeatures'
    // Prerender2. To enable this feature, we need to force-enable this feature
    // using chrome://flags/#enable-prerender2 or --enable-features=Prerender2
    // command line or a valid Origin Trial token in the page.
    public static final String PRERENDER2 = "Prerender2";


    public static final String PRERENDER2_MEMORY_CONTROLS = "Prerender2MemoryControls";


    public static final String INITIAL_NAVIGATION_ENTRY = "InitialNavigationEntry";

    // Enable limiting previews loading hints to specific resource types.
    public static final String PREVIEWS_RESOURCE_LOADING_HINTS_SPECIFIC_RESOURCE_TYPES = "PreviewsResourceLoadingHintsSpecificResourceTypes";

    // TODO(https://crbug.com/926186): Disabled by default on Android for historical
    // reasons. Consider enabling by default if experiment results are positive.
    public static final String PURGE_RENDERER_MEMORY_WHEN_BACKGROUNDED = "PurgeRendererMemoryWhenBackgrounded";

    // Enables new behavior for window.open() and BarProp properties.
    public static final String WINDOW_OPEN_NEW_POPUP_BEHAVIOR = "WindowOpenNewPopupBehavior";

    // Changes the default RTCPeerConnection constructor behavior to use Unified
    // Plan as the SDP semantics. When the feature is enabled, Unified Plan is used
    // unless the default is overridden (by passing {sdpSemantics:'plan-b'} as the
    // argument). This was shipped in M72.
    // The feature is still used by virtual test suites exercising Plan B.
    public static final String RTC_UNIFIED_PLAN_BY_DEFAULT = "RTCUnifiedPlanByDefault";

    // Determines if the SDP attrbute extmap-allow-mixed should be offered by
    // default or not. The default value can be overridden by passing
    // {offerExtmapAllowMixed:false} as an argument to the RTCPeerConnection
    // constructor.
    public static final String RTC_OFFER_EXTMAP_ALLOW_MIXED = "RTCOfferExtmapAllowMixed";

    // Enables waiting for codec support status notification from GPU factory in RTC
    // codec factories.
    public static final String RTC_GPU_CODEC_SUPPORT_WAITER = "kRTCGpuCodecSupportWaiter";

    // Prevents workers from sending IsolateInBackgroundNotification to V8
    // and thus instructs V8 to favor performance over memory on workers.
    public static final String V8_OPTIMIZE_WORKERS_FOR_PERFORMANCE = "V8OptimizeWorkersForPerformance";

    // Controls whether the implementation of the performance.measureMemory
    // web API uses PerformanceManager or not.
    public static final String WEB_MEASURE_MEMORY_VIA_PERFORMANCE_MANAGER = "WebMeasureMemoryViaPerformanceManager";

    // Enables negotiation of experimental multiplex codec in SDP.
    public static final String WEB_RTC_MULTIPLEX_CODEC = "WebRTC-MultiplexCodec";

    // Causes WebRTC to replace host ICE candidate IP addresses with generated
    // names ending in ".local" and resolve them using mDNS.
    // http://crbug.com/878465
    public static final String WEB_RTC_HIDE_LOCAL_IPS_WITH_MDNS = "WebRtcHideLocalIpsWithMdns";

    // Causes WebRTC to not set the color space of video frames on the receive side
    // in case it's unspecified. Otherwise we will guess that the color space is
    // BT709. http://crbug.com/1129243
    public static final String WEB_RTC_IGNORE_UNSPECIFIED_COLOR_SPACE = "WebRtcIgnoreUnspecifiedColorSpace";

    // The base::Feature is enabled by default on all platforms. However, on
    // Android, it has no effect because page freezing kicks in at the same time. It
    // would have an effect if the grace period ("grace_period_seconds" param) was
    // reduced.
    public static final String INTENSIVE_WAKE_UP_THROTTLING = "IntensiveWakeUpThrottling";

    // Throttles Javascript timer wake ups on foreground pages.
    public static final String THROTTLE_FOREGROUND_TIMERS = "ThrottleForegroundTimers";

    // Run-time feature for the |rtc_use_h264| encoder/decoder.
    public static final String WEB_RTC_H264_WITH_OPEN_H264F_FMPEG = "WebRTC-H264WithOpenH264FFmpeg";

    // Experiment of the delay from navigation to starting an update of a service
    // worker's script.
    public static final String SERVICE_WORKER_UPDATE_DELAY = "ServiceWorkerUpdateDelay";

    // Enable the use of Speculation Rules in access the private prefetch proxy
    // (chrome/browser/prefetch/prefetch_proxy/).
    // https://crbug.com/1190167
    public static final String SPECULATION_RULES_PREFETCH_PROXY = "SpeculationRulesPrefetchProxy";

    // Freeze scheduler task queues in background after allowed grace time.
    // "stop" is a legacy name.
    public static final String STOP_IN_BACKGROUND = "stop-in-background";

    // Enable the Storage Access API. https://crbug.com/989663.
    public static final String STORAGE_ACCESS_API = "StorageAccessAPI";

    // Enable text snippets in URL fragments. https://crbug.com/919204.
    public static final String TEXT_FRAGMENT_ANCHOR = "TextFragmentAnchor";

    // Enables CSS selector fragment anchors. https://crbug.com/1252460
    public static final String CSS_SELECTOR_FRAGMENT_ANCHOR = "CssSelectorFragmentAnchor";

    // File handling integration. https://crbug.com/829689
    public static final String FILE_HANDLING_API = "FileHandlingAPI";

    // File handling icons. https://crbug.com/1218213
    public static final String FILE_HANDLING_ICONS = "FileHandlingIcons";

    // Allows for synchronous XHR requests during page dismissal
    public static final String ALLOW_SYNC_XHR_IN_PAGE_DISMISSAL = "AllowSyncXHRInPageDismissal";

    // Font enumeration and data access. https://crbug.com/535764
    public static final String FONT_ACCESS = "FontAccess";

    // Kill switch for the Compute Pressure API. https://crbug.com/1067627
    public static final String COMPUTE_PRESSURE = "ComputePressure";

    // Prefetch request properties are updated to be privacy-preserving. See
    // crbug.com/988956.
    public static final String PREFETCH_PRIVACY_CHANGES = "PrefetchPrivacyChanges";

    // Decodes jpeg 4:2:0 formatted images to YUV instead of RGBX and stores in this
    // format in the image decode cache. See crbug.com/919627 for details on the
    // feature.
    public static final String DECODE_JPEG420_IMAGES_TO_YUV = "DecodeJpeg420ImagesToYUV";

    // Decodes lossy WebP images to YUV instead of RGBX and stores in this format
    // in the image decode cache. See crbug.com/900264 for details on the feature.
    public static final String DECODE_LOSSY_WEB_P_IMAGES_TO_YUV = "DecodeLossyWebPImagesToYUV";

    // Enables cache-aware WebFonts loading. See https://crbug.com/570205.
    // The feature is disabled on Android for WebView API issue discussed at
    // https://crbug.com/942440.
    public static final String WEB_FONTS_CACHE_AWARE_TIMEOUT_ADAPTION = "WebFontsCacheAwareTimeoutAdaption";

    // Enabled to block programmatic focus in subframes when not triggered by user
    // activation (see htpps://crbug.com/954349).
    public static final String BLOCKING_FOCUS_WITHOUT_USER_ACTIVATION = "BlockingFocusWithoutUserActivation";

    // A server-side switch for the REALTIME_AUDIO thread priority of
    // RealtimeAudioWorkletThread object. This can be controlled by a field trial,
    // it will use the NORMAL priority thread when disabled.
    public static final String AUDIO_WORKLET_THREAD_REALTIME_PRIORITY = "AudioWorkletThreadRealtimePriority";

    // A feature to reduce the set of resources fetched by No-State Prefetch.
    public static final String LIGHTWEIGHT_NO_STATE_PREFETCH = "LightweightNoStatePrefetch";

    // Automatically convert light-themed pages to use a Blink-generated dark theme
    public static final String FORCE_WEB_CONTENTS_DARK_MODE = "WebContentsForceDark";

    // A feature to enable using the smallest image specified within image srcset
    // for users with Save Data enabled.
    public static final String SAVE_DATA_IMG_SRCSET = "SaveDataImgSrcset";

    // Instructs WebRTC to honor the Min/Max Video Encode Accelerator dimensions.
    public static final String WEB_RTC_USE_MIN_MAX_VEA_DIMENSIONS = "WebRtcUseMinMaxVEADimensions";

    // Blink garbage collection.
    // Enables compaction of backing stores on Blink's heap.
    public static final String BLINK_HEAP_COMPACTION = "BlinkHeapCompaction";

    // Enables concurrently marking Blink's heap.
    public static final String BLINK_HEAP_CONCURRENT_MARKING = "BlinkHeapConcurrentMarking";

    // Enables concurrently sweeping Blink's heap.
    public static final String BLINK_HEAP_CONCURRENT_SWEEPING = "BlinkHeapConcurrentSweeping";

    // Enables incrementally marking Blink's heap.
    public static final String BLINK_HEAP_INCREMENTAL_MARKING = "BlinkHeapIncrementalMarking";

    // Enables a marking stress mode that schedules more garbage collections and
    // also adds additional verification passes.
    public static final String BLINK_HEAP_INCREMENTAL_MARKING_STRESS = "BlinkHeapIncrementalMarkingStress";

    // Controls whether we use ThreadPriority::DISPLAY for renderer
    // compositor & IO threads.
    public static final String BLINK_COMPOSITOR_USE_DISPLAY_THREAD_PRIORITY = "BlinkCompositorUseDisplayThreadPriority";

    // When enabled, enforces new interoperable semantics for 3D transforms.
    // See crbug.com/1008483.
    public static final String BACKFACE_VISIBILITY_INTEROP = "BackfaceVisibilityInterop";

    // When enabled, beacons (and friends) have ResourceLoadPriority::kLow,
    // not ResourceLoadPriority::kVeryLow.
    public static final String SET_LOW_PRIORITY_FOR_BEACON = "SetLowPriorityForBeacon";

    // When enabled allows the header name used in the blink
    // CacheStorageCodeCacheHint runtime feature to be modified.  This runtime
    // feature disables generating full code cache for responses stored in
    // cache_storage during a service worker install event.  The runtime feature
    // must be enabled via the blink runtime feature mechanism, however.
    public static final String CACHE_STORAGE_CODE_CACHE_HINT_HEADER = "CacheStorageCodeCacheHintHeader";

    // When enabled, the beforeunload handler is dispatched when a frame is frozen.
    // This allows the browser to know whether discarding the frame could result in
    // lost user data, at the cost of extra CPU usage. The feature will be removed
    // once we have determine whether the CPU cost is acceptable.
    public static final String DISPATCH_BEFORE_UNLOAD_ON_FREEZE = "DispatchBeforeUnloadOnFreeze";

    // Enables the use of GpuMemoryBuffer images for low latency 2d canvas.
    // TODO(khushalsagar): Enable this if we're using SurfaceControl and GMBs allow
    // us to overlay these resources.
    public static final String LOW_LATENCY_CANVAS2D_IMAGE_CHROMIUM = "LowLatencyCanvas2dImageChromium";

    // Enables the use of shared image swap chains for low latency 2d canvas.
    public static final String LOW_LATENCY_CANVAS2D_SWAP_CHAIN = "LowLatencyCanvas2dSwapChain";

    // Enables the use of shared image swap chains for low latency webgl canvas.
    public static final String LOW_LATENCY_WEB_GL_SWAP_CHAIN = "LowLatencyWebGLSwapChain";

    // Enables Dawn-accelerated 2D canvas.
    public static final String DAWN2D_CANVAS = "Dawn2dCanvas";

    // Enables small accelerated canvases for webview (crbug.com/1004304)
    public static final String WEBVIEW_ACCELERATE_SMALL_CANVASES = "WebviewAccelerateSmallCanvases";

    // Let accelerated canvases remain accelerated after readback
    // (crbug.com/1288118)
    public static final String CANVAS2D_STAYS_GPU_ON_READBACK = "Canvas2dStaysGPUOnReadback";

    // When enabled, frees up CachedMetadata after consumption by script resources
    // and modules. Needed for the experiment in http://crbug.com/1045052.
    public static final String DISCARD_CODE_CACHE_AFTER_FIRST_USE = "DiscardCodeCacheAfterFirstUse";


    public static final String CACHE_CODE_ON_IDLE = "CacheCodeOnIdle";

    // Kill switch for the new element.offsetParent behavior.
    // TODO(crbug.com/920069): Remove this once the feature has
    // landed and no compat issues are reported.
    public static final String OFFSET_PARENT_NEW_SPEC_BEHAVIOR = "OffsetParentNewSpecBehavior";

    // Makes form elements cancel previous form submissions made by the same form
    // when the default event handler schedules a form submission.
    // TODO(crbug.com/1234409): Remove this flag when this feature has been in
    // stable for a release with no issues
    public static final String CANCEL_FORM_SUBMISSION_IN_DEFAULT_HANDLER = "CancelFormSubmissionInDefaultHandler";

    // Enables the JPEG XL Image File Format (JXL).
    public static final String JXL = "JXL";

    // Make all pending 'display: auto' web fonts enter the swap or failure period
    // immediately before reaching the LCP time limit (~2500ms), so that web fonts
    // do not become a source of bad LCP.
    public static final String ALIGN_FONT_DISPLAY_AUTO_TIMEOUT_WITH_LCP_GOAL = "AlignFontDisplayAutoTimeoutWithLCPGoal";

    // Enable throttling of fetch() requests from service workers in the
    // installing state.  The limit of 3 was chosen to match the limit
    // in background main frames.  In addition, trials showed that this
    // did not cause excessive timeouts and resulted in a net improvement
    // in successful install rate on some platforms.
    public static final String THROTTLE_INSTALLING_SERVICE_WORKER = "ThrottleInstallingServiceWorker";


    public static final String INPUT_PREDICTOR_TYPE_CHOICE = "InputPredictorTypeChoice";


    public static final String RESAMPLING_INPUT_EVENTS = "ResamplingInputEvents";


    public static final String INPUT_TARGET_CLIENT_HIGH_PRIORITY = "InputTargetClientHighPriority";


    public static final String RESAMPLING_SCROLL_EVENTS = "ResamplingScrollEvents";

    // Enables the device-memory, resource-width, viewport-width and DPR client
    // hints to be sent to third-party origins if the first-party has opted in to
    // receiving client hints, regardless of Permissions Policy.
    public static final String ALLOW_CLIENT_HINTS_TO_THIRD_PARTY = "AllowClientHintsToThirdParty";


    public static final String FILTERING_SCROLL_PREDICTION = "FilteringScrollPrediction";


    public static final String KALMAN_HEURISTICS = "KalmanHeuristics";


    public static final String KALMAN_DIRECTION_CUT_OFF = "KalmanDirectionCutOff";


    public static final String SKIP_TOUCH_EVENT_FILTER = "SkipTouchEventFilter";

    // Disabling this will cause parkable strings to never be compressed.
    // This is useful for headless mode + virtual time. Since virtual time advances
    // quickly, strings may be parked too eagerly in that mode.
    public static final String COMPRESS_PARKABLE_STRINGS = "CompressParkableStrings";

    // Enabling this will cause parkable strings to use Snappy for compression iff
    // kCompressParkableStrings is enabled.
    public static final String USE_SNAPPY_FOR_PARKABLE_STRINGS = "UseSnappyForParkableStrings";

    // Enabling this will delay the first aging of strings by 60 seconds instead of
    // the default. See comment around the use of the feature for the logic behind
    // the delay.
    public static final String DELAY_FIRST_PARKING_OF_STRINGS = "DelayFirstParkingOfStrings";


    public static final String CLS_SCROLL_ANCHORING = "CLSScrollAnchoring";

    // Reduce the amount of information in the default 'referer' header for
    // cross-origin requests.
    public static final String REDUCED_REFERRER_GRANULARITY = "ReducedReferrerGranularity";

    // Enables the constant streaming in the ContentCapture task.
    public static final String CONTENT_CAPTURE_CONSTANT_STREAMING = "ContentCaptureConstantStreaming";

    // Dispatches a fake fetch event to a service worker to check the offline
    // capability of the site before promoting installation.
    // See https://crbug.com/965802 for more details.
    public static final String CHECK_OFFLINE_CAPABILITY = "CheckOfflineCapability";

    // The "BackForwardCacheABExperimentControl" feature indicates the state of the
    // same-site BackForwardCache experiment. This information is used when sending
    // the "Sec-bfcache-experiment" HTTP Header on resource requests. The header
    // value is determined by the value of the "experiment_group_for_http_header"
    // feature parameter.
    public static final String BACK_FORWARD_CACHE_AB_EXPERIMENT_CONTROL = "BackForwardCacheABExperimentControl";

    // Whether we should composite a PLSA (paint layer scrollable area) even if it
    // means losing lcd text.
    public static final String PREFER_COMPOSITING_TO_LCD_TEXT = "PreferCompositingToLCDText";


    public static final String LOG_UNEXPECTED_IPC_POSTED_TO_BACK_FORWARD_CACHED_DOCUMENTS = "LogUnexpectedIPCPostedToBackForwardCachedDocuments";

    // Enables web apps to provide theme color and background color overrides for
    // dark mode.
    public static final String WEB_APP_ENABLE_DARK_MODE = "WebAppEnableDarkMode";

    // Enables the "handle_links" manifest field for web apps.
    // Explainer:
    // https://github.com/WICG/pwa-url-handler/blob/main/handle_links/explainer.md
    public static final String WEB_APP_ENABLE_HANDLE_LINKS = "WebAppEnableHandleLinks";

    // Enables the "launch_handler" manifest field for web apps.
    // Explainer: https://github.com/WICG/sw-launch/blob/main/launch_handler.md
    public static final String WEB_APP_ENABLE_LAUNCH_HANDLER = "WebAppEnableLaunchHandler";

    // Enables the deprecated syntax for the above "launch_handler": {
    //   "route_to": "existing-client",
    //   "navigate_existing_client: "always" | "never"
    // }
    public static final String WEB_APP_ENABLE_LAUNCH_HANDLER_V1API = "WebAppEnableLaunchHandlerV1API";

    // Enables Unique ID feature in web apps. Controls parsing of "id" field in web
    // app manifests. See explainer for more information:
    // https://github.com/philloooo/pwa-unique-id
    public static final String WEB_APP_ENABLE_MANIFEST_ID = "WebAppEnableManifestId";

    // Enables the "translations" manifest field for web apps.
    public static final String WEB_APP_ENABLE_TRANSLATIONS = "WebAppEnableTranslations";

    // Controls URL handling feature in web apps. Controls parsing of "url_handlers"
    // field in web app manifests. See explainer for more information:
    // https://github.com/WICG/pwa-url-handler/blob/main/explainer.md
    public static final String WEB_APP_ENABLE_URL_HANDLERS = "WebAppEnableUrlHandlers";

    // Controls parsing of the "lock_screen" dictionary field and its "start_url"
    // entry in web app manifests.  See explainer for more information:
    // https://github.com/WICG/lock-screen/
    // Note: the lock screen API and OS integration is separately controlled by
    // the content feature `kWebLockScreenApi`.
    public static final String WEB_APP_MANIFEST_LOCK_SCREEN = "WebAppManifestLockScreen";

    // Enable borderless mode for desktop PWAs. go/borderless-mode
    public static final String WEB_APP_BORDERLESS = "WebAppBorderless";

    // Makes network loading tasks unfreezable so that they can be processed while
    // the page is frozen.
    public static final String LOADING_TASKS_UNFREEZABLE = "LoadingTasksUnfreezable";

    // Controls how max frame rates are enforced in MediaStreamTracks.
    // TODO(crbug.com/1152307): Remove in M91.
    public static final String MEDIA_STREAM_TRACK_USE_CONFIG_MAX_FRAME_RATE = "MediaStreamTrackUseConfigMaxFrameRate";

    // When enabled, the SubresourceFilter receives calls from the ResourceLoader
    // to perform additional checks against any aliases found from DNS CNAME records
    // for the requested URL.
    public static final String SEND_CNAME_ALIASES_TO_SUBRESOURCE_FILTER_FROM_RENDERER = "SendCnameAliasesToSubresourceFilterFromRenderer";


    public static final String DISABLE_DOCUMENT_DOMAIN_BY_DEFAULT = "DisableDocumentDomainByDefault";

    // Scopes the memory cache to a fetcher i.e. document/frame. Any resource cached
    // in the blink cache will only be reused if the most recent fetcher that
    // fetched it was the same as the current document.
    public static final String SCOPE_MEMORY_CACHE_PER_CONTEXT = "ScopeMemoryCachePerContext";

    // Allow image context menu selections to penetrate through transparent
    // elements.
    public static final String ENABLE_PENETRATING_IMAGE_SELECTION = "EnablePenetratingImageSelection";

    // When enabled, permits shared/root element transitions. See
    // https://github.com/WICG/shared-element-transitions.
    public static final String DOCUMENT_TRANSITION = "DocumentTransition";

    // Used to configure a per-origin allowlist of performance.mark events that are
    // permitted to be included in slow reports traces. See crbug.com/1181774.
    public static final String BACKGROUND_TRACING_PERFORMANCE_MARK = "BackgroundTracingPerformanceMark";

    // Controls whether (and how much of) the Sanitizer API is available.
    public static final String SANITIZER_API = "SanitizerAPI";


    public static final String SANITIZER_AP_IV0 = "SanitizerAPIv0";

    // This feature is unlikely to be launched as-is. The primary purpose is to
    // allow testing of different non-standard configurations.
    public static final String SANITIZER_API_NAMESPACES = "SanitizerAPINamespacesForTesting";

    // Kill switch for the blocking of the navigation of top from a cross origin
    // iframe to a different protocol. TODO(https://crbug.com/1151507): Remove in
    // M92.
    public static final String BLOCK_CROSS_ORIGIN_TOP_NAVIGATION_TO_DIFFENT_SCHEME = "BlockCrossOriginTopNavigationToDiffentScheme";

    // Enables a Web API for websites to access admin-provided configuration.
    public static final String MANAGED_CONFIGURATION = "ManagedConfiguration";

    // Causes all cross-origin iframes, both same-process and out-of-process, to
    // have their rendering throttled on display:none or zero-area.
    public static final String THROTTLE_DISPLAY_NONE_AND_VISIBILITY_HIDDEN_CROSS_ORIGIN_IFRAMES = "ThrottleDisplayNoneAndVisibilityHiddenCrossOriginIframes";

    // Kill switch for the Interest Group API, i.e. if disabled, the
    // API exposure will be disabled regardless of the OT config.
    public static final String INTEREST_GROUP_STORAGE = "InterestGroupStorage";

    // Enable the availability of the ad interest group API as part of the
    // origin trial for FLEDGE or PARAKEET.
    public static final String AD_INTEREST_GROUP_API = "AdInterestGroupAPI";

    // Feature flag to enable PARAKEET implementation (See
    // https://github.com/WICG/privacy-preserving-ads/blob/main/Parakeet.md).
    // See also https://crbug.com/1249186.
    public static final String PARAKEET = "Parakeet";

    // See https://github.com/WICG/turtledove/blob/main/FLEDGE.md
    // Enables FLEDGE implementation. See https://crbug.com/1186444.
    public static final String FLEDGE = "Fledge";

    // See https://github.com/WICG/turtledove/blob/main/FLEDGE.md
    // Changes default Permissions Policy for features join-ad-interest-group and
    // run-ad-auction to a more restricted EnableForSelf.
    public static final String AD_INTEREST_GROUP_API_RESTRICTED_POLICY_BY_DEFAULT = "AdInterestGroupAPIRestrictedPolicyByDefault";

    // See https://github.com/WICG/turtledove/blob/main/FLEDGE.md
    // Feature flag to enable debug reporting APIs.
    public static final String BIDDING_AND_SCORING_DEBUG_REPORTING_API = "BiddingAndScoringDebugReportingAPI";

    // Enables URN URLs like those produced by FLEDGE auctions to be displayed by
    // iframes (instead of requiring fenced frames). This is only intended to be
    // enabled as part of the FLEDGE origin trial.
    public static final String ALLOW_UR_NS_IN_IFRAMES = "AllowURNsInIframes";

    // https://github.com/jkarlin/topics
    // Kill switch for the Topics API.
    public static final String BROWSING_TOPICS = "BrowsingTopics";

    // If enabled, the check for whether the IP address is publicly routable will be
    // bypassed when determining the eligibility for a page to be included in topics
    // calculation. This is useful for developers to test in local environment.
    public static final String BROWSING_TOPICS_BYPASS_IP_IS_PUBLICLY_ROUTABLE_CHECK = "BrowsingTopicsBypassIPIsPubliclyRoutableCheck";

    // When <dialog>s are closed, this focuses the "previously focused" element
    // which had focus when the <dialog> was first opened.
    // TODO(crbug.com/649162): Remove DialogFocusNewSpecBehavior after
    // the feature is in stable with no issues.
    public static final String DIALOG_FOCUS_NEW_SPEC_BEHAVIOR = "DialogFocusNewSpecBehavior";

    // Makes autofill look across shadow boundaries when collecting form controls to
    // fill.
    public static final String AUTOFILL_SHADOW_DOM = "AutofillShadowDOM";

    // Allows read/write of custom formats with unsanitized clipboard content. See
    // crbug.com/106449.
    public static final String CLIPBOARD_CUSTOM_FORMATS = "ClipboardCustomFormats";

    // Uses page viewport instead of frame viewport in the Largest Contentful Paint
    // heuristic where images occupying the full viewport are ignored.
    public static final String USE_PAGE_VIEWPORT_IN_LCP = "UsePageViewportInLCP";

    // When enabled, allow dropping alpha on media streams for rendering sinks if
    // other sinks connected do not use alpha.
    public static final String ALLOW_DROP_ALPHA_FOR_MEDIA_STREAM = "AllowDropAlphaForMediaStream";

    // Enables partitioning of third party storage (IndexedDB, CacheStorage, etc.)
    // by the top level site to reduce fingerprinting.
    public static final String THIRD_PARTY_STORAGE_PARTITIONING = "ThirdPartyStoragePartitioning";

    // API that allows installed PWAs to add additional shortcuts by means of
    // installing sub app components.
    public static final String DESKTOP_PW_AS_SUB_APPS = "DesktopPWAsSubApps";

    // Suppresses console errors for CORS problems which report an associated
    // inspector issue anyway.
    public static final String CORS_ERRORS_ISSUE_ONLY = "CORSErrorsIssueOnly";


    public static final String PERSISTENT_QUOTA_IS_TEMPORARY_QUOTA = "PersistentQuotaIsTemporaryQuota";


    public static final String DELAY_LOW_PRIORITY_REQUESTS_ACCORDING_TO_NETWORK_STATE = "DelayLowPriorityRequestsAccordingToNetworkState";


    public static final String INCLUDE_INITIALLY_INVISIBLE_IMAGES_IN_LCP = "IncludeInitiallyInvisibleImagesInLCP";


    public static final String INCLUDE_BACKGROUND_SVG_IN_LCP = "IncludeBackgroundSVGInLCP";


    public static final String HTML_PARAM_ELEMENT_URL_SUPPORT = "HTMLParamElementUrlSupport";


    public static final String FORCE_MAJOR_VERSION_IN_MINOR_POSITION_IN_USER_AGENT = "ForceMajorVersionInMinorPositionInUserAgent";

    // Enable `sec-ch-device-memory` client hint.
    public static final String CLIENT_HINTS_DEVICE_MEMORY = "ClientHintsDeviceMemory";

    // Enable `sec-ch-dpr` client hint.
    public static final String CLIENT_HINTS_DPR = "ClientHintsDPR";

    // Enable `sec-ch-width` client hint.
    public static final String CLIENT_HINTS_RESOURCE_WIDTH = "ClientHintsResourceWidth";

    // Enable `sec-ch-viewport-width` client hint.
    public static final String CLIENT_HINTS_VIEWPORT_WIDTH = "ClientHintsViewportWidth";

    // Enable legacy `device-memory` client hint.
    public static final String CLIENT_HINTS_DEVICE_MEMORY_DEPRECATED = "ClientHintsDeviceMemory_DEPRECATED";

    // Enable legacy `dpr` client hint.
    public static final String CLIENT_HINTS_DPR_DEPRECATED = "ClientHintsDPR_DEPRECATED";

    // Enable legacy `width` client hint.
    public static final String CLIENT_HINTS_RESOURCE_WIDTH_DEPRECATED = "ClientHintsResourceWidth_DEPRECATED";

    // Enable legacy `viewport-width` client hint.
    public static final String CLIENT_HINTS_VIEWPORT_WIDTH_DEPRECATED = "ClientHintsViewportWidth_DEPRECATED";

    // If enabled, the setTimeout(..., 0) will not clamp to 1ms.
    // Tracking bug: https://crbug.com/402694.
    public static final String SET_TIMEOUT_WITHOUT_CLAMP = "SetTimeoutWithoutClamp";

    // If enabled, the setTimeout(..., 0) will clamp to 4ms after a custom `nesting`
    // level.
    // Tracking bug: https://crbug.com/1108877.
    public static final String MAX_UNTHROTTLED_TIMEOUT_NESTING_LEVEL = "MaxUnthrottledTimeoutNestingLevel";


    public static final String TAB_SWITCH_METRICS2 = "TabSwitchMetrics2";

    // Enables reporting and web-exposure (respectively) of the time the first frame
    // of an animated image was painted.
    public static final String LCP_ANIMATED_IMAGES_REPORTING = "LCPAnimatedImagesReporting";

    // TODO(crbug.com/1185950): Remove this flag when the feature is fully launched
    // and released to stable with no issues.
    public static final String AUTO_EXPAND_DETAILS_ELEMENT = "AutoExpandDetailsElement";

    // Enables loading the response body earlier in navigation.
    public static final String EARLY_BODY_LOAD = "EarlyBodyLoad";

    // Enables fetching the code cache earlier in navigation.
    public static final String EARLY_CODE_CACHE = "EarlyCodeCache";

    // Allow use of an http-equiv meta tag to set client hints.
    public static final String CLIENT_HINTS_META_HTTP_EQUIV_ACCEPT_CH = "ClientHintsMetaHTTPEquivAcceptCH";

    // Allow use of a named meta tag to set client hints.
    public static final String CLIENT_HINTS_META_NAME_ACCEPT_CH = "ClientHintsMetaNameAcceptCH";


    public static final String ORIGIN_AGENT_CLUSTER_DEFAULT_ENABLED = "OriginAgentClusterDefaultEnable";


    public static final String ORIGIN_AGENT_CLUSTER_DEFAULT_WARNING = "OriginAgentClusterDefaultWarning";

    // Allow third-party delegation of client hint information.
    public static final String CLIENT_HINT_THIRD_PARTY_DELEGATION = "ClientHintThirdPartyDelegation";

    // Enables prefetching Android fonts on renderer startup.
    public static final String PREFETCH_ANDROID_FONTS = "PrefetchAndroidFonts";


    public static final String COMPOSITED_CARET = "CompositedCaret";


    public static final String BACK_FORWARD_CACHE_APP_BANNER = "BackForwardCacheAppBanner";

    // Initialize CSSDefaultStyleSheets early in renderer startup.
    public static final String DEFAULT_STYLE_SHEETS_EARLY_INIT = "DefaultStyleSheetsEarlyInit";


    public static final String SYSTEM_COLOR_CHOOSER = "SystemColorChooser";


    public static final String NO_FORCED_FRAME_UPDATES_FOR_WEB_TESTS = "NoForcedFrameUpdatesForWebTests";

    // This flag makes ElementRareData lazily initialize infrequently used fields as
    // another class called ElementSuperRareData to improve memory usage.
    public static final String ELEMENT_SUPER_RARE_DATA = "ElementSuperRareData";


    public static final String DURABLE_CLIENT_HINTS_CACHE = "DurableClientHintsCache";

    // If enabled, allows web pages to use the experimental EditContext API to
    // better control text input. See crbug.com/999184.
    public static final String EDIT_CONTEXT = "EditContext";

    // Enables basic Multi-Screen Window Placement functionality.
    public static final String WINDOW_PLACEMENT = "WindowPlacement";

    // Allows sites to request fullscreen and open a popup from a single gesture.
    public static final String WINDOW_PLACEMENT_FULLSCREEN_COMPANION_WINDOW = "WindowPlacementFullscreenCompanionWindow";

    // Allows sites to request fullscreen when the set of screens change.
    public static final String WINDOW_PLACEMENT_FULLSCREEN_ON_SCREENS_CHANGE = "WindowPlacementFullscreenOnScreensChange";

    // TODO(crbug.com/1277431): This flag should be eventually disabled.
    public static final String EVENT_PATH = "EventPath";

    // Removes a paint invalidation of viewport constrained objects (sticky or
    // fixed) after scrolling.
    public static final String OPTIMIZE_VIEWPORT_CONSTRAINED_PAINT_INVALIDATION = "OptimizeViewportConstrainedPaintInvalidation";


    public static final String REDUCE_USER_AGENT_MINOR_VERSION = "ReduceUserAgentMinorVersion";


    public static final String REPORT_FCP_ONLY_ON_SUCCESSFUL_COMMIT = "ReportFCPOnlyOnSuccessfulCommit";

    // Enables correctly computing whether dedicated workers are secure contexts.
    // TODO(https://crbug.com/780031): Remove this once fully shipped.
    public static final String SECURE_CONTEXT_FIX_FOR_WORKERS = "SecureContextFixForWorkers";


    public static final String ZERO_COPY_TAB_CAPTURE = "ZeroCopyTabCapture";


    public static final String USER_AGENT_OVERRIDE_EXPERIMENT = "UserAgentOverrideExperiment";

    // Allow access to WebSQL APIs.
    public static final String WEB_SQL_ACCESS = "kWebSQLAccess";

    // Changes behavior of User-Agent Client Hints to send blank headers when the
    // User-Agent string is overridden, instead of disabling the headers altogether.
    public static final String UACH_OVERRIDE_BLANK = "UACHOverrideBlank";


    public static final String PREWARM_DEFAULT_FONT_FAMILIES = "PrewarmDefaultFontFamilies";

    // Enable `save-data` client hint.
    public static final String CLIENT_HINTS_SAVE_DATA = "ClientHintsSaveData";


    public static final String ESTABLISH_GPU_CHANNEL_ASYNC = "EstablishGpuChannelAsync";


    public static final String DEFER_BEGIN_MAIN_FRAME_DURING_LOADING = "DeferBeginMainFrameDuringLoading";


    public static final String DECODE_SCRIPT_SOURCE_OFF_THREAD = "DecodeScriptSourceOffThread";


    public static final String ALLOW_SOURCE_SWITCH_ON_PAUSED_VIDEO_MEDIA_STREAM = "AllowSourceSwitchOnPausedVideoMediaStream";


    public static final String DISPATCH_POPSTATE_SYNC = "DispatchPopstateSync";

    // Exposes non-standard stats in the WebRTC getStats() API.
    public static final String WEB_RTC_EXPOSE_NON_STANDARD_STATS = "WebRtc-ExposeNonStandardStats";


    public static final String SUBSTRING_SET_TREE_FOR_ATTRIBUTE_BUCKETS = "SubstringSetTreeForAttributeBuckets";


    public static final String PENDING_BEACON_API = "PendingBeaconAPI";


    public static final String PREFETCH_FONT_LOOKUP_TABLES = "PrefetchFontLookupTables";


    public static final String PRECOMPILE_INLINE_SCRIPTS = "PrecompileInlineScripts";


    public static final String SIMULATE_CLICK_ON_AX_FOCUS = "SimulateClickOnAXFocus";

    // Allow access to WebSQL in non-secure contexts.
    public static final String WEB_SQL_NON_SECURE_CONTEXT_ACCESS = "WebSQLNonSecureContextAccess";


    public static final String FILE_SYSTEM_URL_NAVIGATION = "FileSystemUrlNavigation";


    public static final String EARLY_EXIT_ON_NOOP_CLASS_OR_STYLE_CHANGE = "EarlyExitOnNoopClassOrStyleChange";


    public static final String TIMED_HTML_PARSER_BUDGET = "TimedHTMLParserBudget";

    // Do not instantiate this class.
    private BlinkFeatures() {}
}
