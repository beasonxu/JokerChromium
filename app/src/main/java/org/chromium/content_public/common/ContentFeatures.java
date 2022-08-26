// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.content_public.common;

/**
 * Constants for the names of Content Features.
 */
public final class ContentFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../content/public/common/content_features.cc
    // Into
    //     ../../content/public/common/android/java_templates/ContentFeatures.java.tmpl

    // Enables content-initiated, main frame navigations to data URLs.
    // TODO(meacer): Remove when the deprecation is complete.
    //               https://www.chromestatus.com/feature/5669602927312896
    public static final String ALLOW_CONTENT_INITIATED_DATA_URL_NAVIGATIONS = "AllowContentInitiatedDataUrlNavigations";

    // Allows Blink to request fonts from the Android Downloadable Fonts API through
    // the service implemented on the Java side.
    public static final String ANDROID_DOWNLOADABLE_FONTS_MATCHING = "AndroidDownloadableFontsMatching";


    public static final String AUDIO_PROCESS_HIGH_PRIORITY_WIN = "AudioProcessHighPriorityWin";

    // Launches the audio service on the browser startup.
    public static final String AUDIO_SERVICE_LAUNCH_ON_STARTUP = "AudioServiceLaunchOnStartup";

    // Runs the audio service in a separate process.
    public static final String AUDIO_SERVICE_OUT_OF_PROCESS = "AudioServiceOutOfProcess";

    // Enables the audio-service sandbox. This feature has an effect only when the
    // kAudioServiceOutOfProcess feature is enabled.
    public static final String AUDIO_SERVICE_SANDBOX = "AudioServiceSandbox";

    // The following two features, when enabled, result in the browser process only
    // asking the renderer process to run beforeunload handlers if it knows such
    // handlers are registered. The two slightly differ in what they do and how
    // they behave:
    // . `kAvoidUnnecessaryBeforeUnloadCheckPostTask` in this case content continues
    //   to report a beforeunload handler is present (even though it isn't). When
    //   asked to dispatch the beforeunload handler, a post task is used (rather
    //   than going to the renderer).
    // . `kAvoidUnnecessaryBeforeUnloadCheckSync` in this case content does not
    //   report a beforeunload handler is present. A ramification of this is
    //   navigations that would normally check beforeunload handlers before
    //   continuing will not, and navigation will synchronously continue.
    // Only one should be used (if both are set, the second takes precedence). The
    // second is unsafe for Android WebView (and thus entirely disabled via
    // ContentBrowserClient::SupportsAvoidUnnecessaryBeforeUnloadCheckSync()),
    // because the embedder may trigger reentrancy, which cannot be avoided.
    public static final String AVOID_UNNECESSARY_BEFORE_UNLOAD_CHECK_POST_TASK = "AvoidUnnecessaryBeforeUnloadCheck";


    public static final String AVOID_UNNECESSARY_BEFORE_UNLOAD_CHECK_SYNC = "AvoidUnnecessaryBeforeUnloadCheckSync";

    // Kill switch for Background Fetch.
    public static final String BACKGROUND_FETCH = "BackgroundFetch";

    // Enable using the BackForwardCache.
    public static final String BACK_FORWARD_CACHE = "BackForwardCache";

    // Allows pages that created a MediaSession service to stay eligible for the
    // back/forward cache.
    public static final String BACK_FORWARD_CACHE_MEDIA_SESSION_SERVICE = "BackForwardCacheMediaSessionService";

    // Enable back/forward cache for screen reader users. This flag should be
    // removed once the https://crbug.com/1271450 is resolved.
    public static final String ENABLE_BACK_FORWARD_CACHE_FOR_SCREEN_READER = "EnableBackForwardCacheForScreenReader";

    // BackForwardCacheMemoryControls is enabled only on Android to disable
    // BackForwardCache for lower memory devices due to memory limiations.
    public static final String BACK_FORWARD_CACHE_MEMORY_CONTROLS = "BackForwardCacheMemoryControls";

    // See also:
    //  - https://wicg.github.io/private-network-access/#integration-fetch
    //  - kBlockInsecurePrivateNetworkRequestsFromPrivate
    //  - kBlockInsecurePrivateNetworkRequestsFromUnknown
    //  - kBlockInsecurePrivateNetworkRequestsForNavigations
    public static final String BLOCK_INSECURE_PRIVATE_NETWORK_REQUESTS = "BlockInsecurePrivateNetworkRequests";

    // See also:
    //  - https://wicg.github.io/private-network-access/#integration-fetch
    //  - kBlockInsecurePrivateNetworkRequests
    public static final String BLOCK_INSECURE_PRIVATE_NETWORK_REQUESTS_FROM_PRIVATE = "BlockInsecurePrivateNetworkRequestsFromPrivate";

    // See also:
    //  - kBlockInsecurePrivateNetworkRequests
    public static final String BLOCK_INSECURE_PRIVATE_NETWORK_REQUESTS_FROM_UNKNOWN = "BlockInsecurePrivateNetworkRequestsFromUnknown";

    // Enables use of the PrivateNetworkAccessNonSecureContextsAllowed deprecation
    // trial. This is a necessary yet insufficient condition: documents that wish to
    // make use of the trial must additionally serve a valid origin trial token.
    public static final String BLOCK_INSECURE_PRIVATE_NETWORK_REQUESTS_DEPRECATION_TRIAL = "BlockInsecurePrivateNetworkRequestsDeprecationTrial";

    // When both kBlockInsecurePrivateNetworkRequestsForNavigations and
    // kBlockInsecurePrivateNetworkRequests are enabled, navigations initiated
    // by documents in a less-private network may only target a more-private network
    // if the initiating context is secure.
    public static final String BLOCK_INSECURE_PRIVATE_NETWORK_REQUESTS_FOR_NAVIGATIONS = "BlockInsecurePrivateNetworkRequestsForNavigations";

    // Broker file operations on disk cache in the Network Service.
    // This is no-op if the network service is hosted in the browser process.
    public static final String BROKER_FILE_OPERATIONS_ON_DISK_CACHE_IN_NETWORK_SERVICE = "BrokerFileOperationsOnDiskCacheInNetworkService";

    // Use ThreadPriority::DISPLAY for browser UI and IO threads.
    public static final String BROWSER_USE_DISPLAY_THREAD_PRIORITY = "BrowserUseDisplayThreadPriority";

    // When enabled, keyboard user activation will be verified by the browser side.
    public static final String BROWSER_VERIFIED_USER_ACTIVATION_KEYBOARD = "BrowserVerifiedUserActivationKeyboard";

    // When enabled, mouse user activation will be verified by the browser side.
    public static final String BROWSER_VERIFIED_USER_ACTIVATION_MOUSE = "BrowserVerifiedUserActivationMouse";

    // If Canvas2D Image Chromium is allowed, this feature controls whether it is
    // enabled.
    public static final String CANVAS2D_IMAGE_CHROMIUM = "Canvas2DImageChromium";

    // Clear the window.name property for the top-level cross-site navigations that
    // swap BrowsingContextGroups(BrowsingInstances).
    public static final String CLEAR_CROSS_SITE_CROSS_BROWSING_CONTEXT_GROUP_WINDOW_NAME = "ClearCrossSiteCrossBrowsingContextGroupWindowName";


    public static final String CLICK_POINTER_EVENT = "ClickPointerEvent";


    public static final String COMPOSITE_BG_COLOR_ANIMATION = "CompositeBGColorAnimation";

    // When enabled, event.movement is calculated in blink instead of in browser.
    public static final String CONSOLIDATED_MOVEMENT_XY = "ConsolidatedMovementXY";

    // Enables Blink cooperative scheduling.
    public static final String COOPERATIVE_SCHEDULING = "CooperativeScheduling";

    // Enables crash reporting via Reporting API.
    // https://www.w3.org/TR/reporting/#crash-report
    public static final String CRASH_REPORTING = "CrashReporting";

    // Enables support for the `Critical-CH` response header.
    // https://github.com/WICG/client-hints-infrastructure/blob/master/reliability.md#critical-ch
    public static final String CRITICAL_CLIENT_HINT = "CriticalClientHint";

    // Enable debugging the issue crbug.com/1201355
    public static final String DEBUG_HISTORY_INTERVENTION_NO_USER_ACTIVATION = "DebugHistoryInterventionNoUserActivation";

    // Enable changing source dynamically for desktop capture.
    public static final String DESKTOP_CAPTURE_CHANGE_SOURCE = "DesktopCaptureChangeSource";

    // Enables the alternative, improved desktop/window capturer for LaCrOS
    public static final String DESKTOP_CAPTURE_LACROS_V2 = "DesktopCaptureLacrosV2";

    // Adds a tab strip to PWA windows.
    // TODO(crbug.com/897314): Enable this feature.
    public static final String DESKTOP_PW_AS_TAB_STRIP = "DesktopPWAsTabStrip";

    // Enable the device posture API.
    // Tracking bug for enabling device posture API: https://crbug.com/1066842.
    public static final String DEVICE_POSTURE = "DevicePosture";

    // Controls whether the Digital Goods API is enabled.
    // https://github.com/WICG/digital-goods/
    public static final String DIGITAL_GOODS_API = "DigitalGoodsApi";

    // Enable document policy for configuring and restricting feature behavior.
    public static final String DOCUMENT_POLICY = "DocumentPolicy";

    // Enable document policy negotiation mechanism.
    public static final String DOCUMENT_POLICY_NEGOTIATION = "DocumentPolicyNegotiation";

    // Enable establishing the GPU channel early in renderer startup.
    public static final String EARLY_ESTABLISH_GPU_CHANNEL = "EarlyEstablishGpuChannel";

    // Enable Early Hints subresource preloads for navigation.
    public static final String EARLY_HINTS_PRELOAD_FOR_NAVIGATION = "EarlyHintsPreloadForNavigation";

    // Requires documents embedded via <iframe>, etc, to explicitly opt-into the
    // embedding: https://github.com/mikewest/embedding-requires-opt-in.
    public static final String EMBEDDING_REQUIRES_OPT_IN = "EmbeddingRequiresOptIn";

    // Enables canvas 2d methods BeginLayer and EndLayer.
    public static final String ENABLE_CANVAS2D_LAYERS = "EnableCanvas2DLayers";

    // Enables the Machine Learning Model Loader Web Platform API. Explainer:
    // https://github.com/webmachinelearning/model-loader/blob/main/explainer.md
    public static final String ENABLE_MACHINE_LEARNING_MODEL_LOADER_WEB_PLATFORM_API = "EnableMachineLearningModelLoaderWebPlatformApi";

    // Enables service workers on chrome-untrusted:// urls.
    public static final String ENABLE_SERVICE_WORKERS_FOR_CHROME_UNTRUSTED = "EnableServiceWorkersForChromeUntrusted";

    // If this feature is enabled and device permission is not granted by the user,
    // media-device enumeration will provide at most one device per type and the
    // device IDs will not be available.
    // TODO(crbug.com/1019176): remove the feature in M89.
    public static final String ENUMERATE_DEVICES_HIDE_DEVICE_I_DS = "EnumerateDevicesHideDeviceIDs";

    // Content counterpart of ExperimentalContentSecurityPolicyFeatures in
    // third_party/blink/renderer/platform/runtime_enabled_features.json5. Enables
    // experimental Content Security Policy features ('navigate-to' and
    // 'prefetch-src').
    public static final String EXPERIMENTAL_CONTENT_SECURITY_POLICY_FEATURES = "ExperimentalContentSecurityPolicyFeatures";

    // Extra CORS safelisted headers. See https://crbug.com/999054.
    public static final String EXTRA_SAFELISTED_REQUEST_HEADERS_FOR_OUT_OF_BLINK_CORS = "ExtraSafelistedRequestHeadersForOutOfBlinkCors";

    // Enables JavaScript API to intermediate federated identity requests.
    // Note that actual exposure of the FedCM API to web content is controlled
    // by the flag in RuntimeEnabledFeatures on the blink side. See also
    // the use of kSetOnlyIfOverridden in content/child/runtime_features.cc.
    // We enable it here by default to support use in origin trials.
    public static final String FED_CM = "FedCm";

    // Kill switch for FedCm manifest validation.
    public static final String FED_CM_MANIFEST_VALIDATION = "FedCmManifestValidation";

    // Whether to initialize the font manager when the renderer starts on a
    // background thread.
    public static final String FONT_MANAGER_EARLY_INIT = "FontManagerEarlyInit";

    // Enables fixes for matching src: local() for web fonts correctly against full
    // font name or postscript name. Rolling out behind a flag, as enabling this
    // enables a font indexer on Android which we need to test in the field first.
    public static final String FONT_SRC_LOCAL_MATCHING = "FontSrcLocalMatching";

    // Feature controlling whether or not memory pressure signals will be forwarded
    // to the GPU process.
    public static final String FORWARD_MEMORY_PRESSURE_EVENTS_TO_GPU_PROCESS = "ForwardMemoryPressureEventsToGpuProcess";

    // If enabled, limits the number of FLEDGE auctions that can be run between page
    // load and unload -- any attempt to run more than this number of auctions will
    // fail (return null to JavaScript).
    public static final String FLEDGE_LIMIT_NUM_AUCTIONS = "LimitNumFledgeAuctions";

    // Enables scrollers inside Blink to store scroll offsets in fractional
    // floating-point numbers rather than truncating to integers.
    public static final String FRACTIONAL_SCROLL_OFFSETS = "FractionalScrollOffsets";

    // Puts network quality estimate related Web APIs in the holdback mode. When the
    // holdback is enabled the related Web APIs return network quality estimate
    // set by the experiment (regardless of the actual quality).
    public static final String NETWORK_QUALITY_ESTIMATOR_WEB_HOLDBACK = "NetworkQualityEstimatorWebHoldback";

    // Determines if an extra brand version pair containing possibly escaped double
    // quotes and escaped backslashed should be added to the Sec-CH-UA header
    // (activated by kUserAgentClientHint)
    public static final String GREASE_UACH = "GreaseUACH";

    // This is intended as a kill switch for the Idle Detection feature. To enable
    // this feature, the experimental web platform features flag should be set,
    // or the site should obtain an Origin Trial token.
    public static final String IDLE_DETECTION = "IdleDetection";

    // Historically most navigations required IPC from browser to renderer and
    // from renderer back to browser. This was done to check for before-unload
    // handlers on the current page and occurred regardless of whether a
    // before-unload handler was present. The navigation start time (as used in
    // various metrics) is the time the renderer initiates the IPC back to the
    // browser. If this feature is enabled, the navigation start time takes into
    // account the cost of the IPC from the browser to renderer. More specifically:
    // navigation_start = time_renderer_sends_ipc_to_browser -
    //    (time_renderer_receives_ipc - time_browser_sends_ipc)
    // Note that navigation_start does not take into account the amount of time the
    // renderer spends processing the IPC (that is, executing script).
    public static final String INCLUDE_IPC_OVERHEAD_IN_NAVIGATION_START = "IncludeIpcOverheadInNavigationStart";

    // Kill switch for the GetInstalledRelatedApps API.
    public static final String INSTALLED_APP = "InstalledApp";

    // Allow Windows specific implementation for the GetInstalledRelatedApps API.
    public static final String INSTALLED_APP_PROVIDER = "InstalledAppProvider";

    // Show warning about clearing data from installed apps in the clear browsing
    // data flow. The warning will be shown in a second dialog.
    public static final String INSTALLED_APPS_IN_CBD = "InstalledAppsInCbd";

    // Alternative to switches::kIsolateOrigins, for turning on origin isolation.
    // List of origins to isolate has to be specified via
    // kIsolateOriginsFieldTrialParamName.
    public static final String ISOLATE_ORIGINS = "IsolateOrigins";

    // Allow process isolation of iframes with the 'sandbox' attribute set. Whether
    // or not such an iframe will be isolated may depend on options specified with
    // the attribute. Note: At present, only iframes with origin-restricted
    // sandboxes are isolated.
    public static final String ISOLATE_SANDBOXED_IFRAMES = "IsolateSandboxedIframes";


    public static final String LAZY_FRAME_LOADING = "LazyFrameLoading";


    public static final String LAZY_FRAME_VISIBLE_LOAD_TIME_METRICS = "LazyFrameVisibleLoadTimeMetrics";


    public static final String LAZY_IMAGE_LOADING = "LazyImageLoading";


    public static final String LAZY_IMAGE_VISIBLE_LOAD_TIME_METRICS = "LazyImageVisibleLoadTimeMetrics";

    // Enable lazy initialization of the media controls.
    public static final String LAZY_INITIALIZE_MEDIA_CONTROLS = "LazyInitializeMediaControls";

    // Configures whether Blink on Windows 8.0 and below should use out of process
    // API font fallback calls to retrieve a fallback font family name as opposed to
    // using a hard-coded font lookup table.
    public static final String LEGACY_WINDOWS_D_WRITE_FONT_FALLBACK = "LegacyWindowsDWriteFontFallback";


    public static final String LOG_JS_CONSOLE_MESSAGES = "LogJsConsoleMessages";

    // The MBI mode controls whether or not communication over the
    // AgentSchedulingGroup is ordered with respect to the render-process-global
    // legacy IPC channel, as well as the granularity of AgentSchedulingGroup
    // creation. This will break ordering guarantees between different agent
    // scheduling groups (ordering withing a group is still preserved).
    // DO NOT USE! The feature is not yet fully implemented. See crbug.com/1111231.
    public static final String MBI_MODE = "MBIMode";

    // If this feature is enabled, media-device enumerations use a cache that is
    // invalidated upon notifications sent by base::SystemMonitor. If disabled, the
    // cache is considered invalid on every enumeration request.
    public static final String MEDIA_DEVICES_SYSTEM_MONITOR_CACHE = "MediaDevicesSystemMonitorCaching";

    // Use a custom backend to store media licenses in lieu of the
    // Plugin Private File System.
    public static final String MEDIA_LICENSE_BACKEND = "MediaLicenseBackend";

    // Allow cross-context transfer of MediaStreamTracks.
    public static final String MEDIA_STREAM_TRACK_TRANSFER = "MediaStreamTrackTransfer";

    // If enabled Mojo uses a dedicated background thread to listen for incoming
    // IPCs. Otherwise it's configured to use Content's IO thread for that purpose.
    public static final String MOJO_DEDICATED_THREAD = "MojoDedicatedThread";

    // Enables/disables the video capture service.
    public static final String MOJO_VIDEO_CAPTURE = "MojoVideoCapture";

    // A secondary switch used in combination with kMojoVideoCapture.
    // This is intended as a kill switch to allow disabling the service on
    // particular groups of devices even if they forcibly enable kMojoVideoCapture
    // via a command-line argument.
    public static final String MOJO_VIDEO_CAPTURE_SECONDARY = "MojoVideoCaptureSecondary";

    // When enable, iframe does not implicit capture mouse event.
    public static final String MOUSE_SUBFRAME_NO_IMPLICIT_CAPTURE = "MouseSubframeNoImplicitCapture";

    // When NavigationNetworkResponseQueue is enabled, the browser will schedule
    // some tasks related to navigation network responses in a kHighest priority
    // queue.
    public static final String NAVIGATION_NETWORK_RESPONSE_QUEUE = "NavigationNetworkResponseQueue";

    // Preconnects socket at the construction of NavigationRequest.
    public static final String NAVIGATION_REQUEST_PRECONNECT = "NavigationRequestPreconnect";

    // Enables optimizations for renderer->browser mojo calls to avoid waiting on
    // the UI thread during navigation.
    public static final String NAVIGATION_THREADING_OPTIMIZATIONS = "NavigationThreadingOptimizations";

    // If the network service is enabled, runs it in process.
    public static final String NETWORK_SERVICE_IN_PROCESS = "NetworkServiceInProcess2";


    public static final String NEVER_SLOW_MODE = "NeverSlowMode";

    // Kill switch for Web Notification content images.
    public static final String NOTIFICATION_CONTENT_IMAGE = "NotificationContentImage";

    // Enables the notification trigger API.
    public static final String NOTIFICATION_TRIGGERS = "NotificationTriggers";

    // The name is "OriginIsolationHeader" because that was the old name when the
    // feature was under development.
    public static final String ORIGIN_ISOLATION_HEADER = "OriginIsolationHeader";

    // Origin Policy. See https://crbug.com/751996
    public static final String ORIGIN_POLICY = "OriginPolicy";

    // History navigation in response to horizontal overscroll (aka gesture-nav).
    public static final String OVERSCROLL_HISTORY_NAVIGATION = "OverscrollHistoryNavigation";

    // Whether web apps can run periodic tasks upon network connectivity.
    public static final String PERIODIC_BACKGROUND_SYNC = "PeriodicBackgroundSync";

    // If Pepper 3D Image Chromium is allowed, this feature controls whether it is
    // enabled.
    // TODO(https://crbug.com/1196009): Remove this feature, remove the code that
    // uses it.
    public static final String PEPPER3D_IMAGE_CHROMIUM = "Pepper3DImageChromium";

    // Kill-switch to introduce a compatibility breaking restriction.
    public static final String PEPPER_CROSS_ORIGIN_REDIRECT_RESTRICTION = "PepperCrossOriginRedirectRestriction";

    // Tracking bug: https://crbug.com/1269059
    // Removal bug (when no longer experimental): https://crbug.com/1285144
    public static final String PICTURE_IN_PICTURE_V2 = "PictureInPictureV2";

    // Enables process sharing for sites that do not require a dedicated process
    // by using a default SiteInstance. Default SiteInstances will only be used
    // on platforms that do not use full site isolation.
    // Note: This feature is mutally exclusive with
    // kProcessSharingWithStrictSiteInstances. Only one of these should be enabled
    // at a time.
    public static final String PROCESS_SHARING_WITH_DEFAULT_SITE_INSTANCES = "ProcessSharingWithDefaultSiteInstances";

    // Whether cross-site frames should get their own SiteInstance even when
    // strict site isolation is disabled. These SiteInstances will still be
    // grouped into a shared default process based on BrowsingInstance.
    public static final String PROCESS_SHARING_WITH_STRICT_SITE_INSTANCES = "ProcessSharingWithStrictSiteInstances";

    // Tells the RenderFrameHost to send beforeunload messages on a different
    // local frame interface which will handle the messages at a higher priority.
    public static final String HIGH_PRIORITY_BEFORE_UNLOAD = "HighPriorityBeforeUnload";

    // Preload cookie database on NetworkContext creation.
    public static final String PRELOAD_COOKIES = "PreloadCookies";

    // Enables exposure of ads APIs in the renderer: Attribution Reporting,
    // FLEDGE, Topics.
    public static final String PRIVACY_SANDBOX_ADS_AP_IS_OVERRIDE = "PrivacySandboxAdsAPIsOverride";


    public static final String PRIVATE_NETWORK_ACCESS_FOR_WORKERS = "PrivateNetworkAccessForWorkers";

    // Requires that CORS preflight requests succeed before sending private network
    // requests. This flag implies `kPrivateNetworkAccessSendPreflights`.
    // See: https://wicg.github.io/private-network-access/#cors-preflight
    public static final String PRIVATE_NETWORK_ACCESS_RESPECT_PREFLIGHT_RESULTS = "PrivateNetworkAccessRespectPreflightResults";

    // Enables sending CORS preflight requests ahead of private network requests.
    // See: https://wicg.github.io/private-network-access/#cors-preflight
    public static final String PRIVATE_NETWORK_ACCESS_SEND_PREFLIGHTS = "PrivateNetworkAccessSendPreflights";

    // Enable the ProactivelySwapBrowsingInstance experiment. A browsing instance
    // represents a set of frames that can script each other. Currently, Chrome does
    // not always switch BrowsingInstance when navigating in between two unrelated
    // pages. This experiment makes Chrome swap BrowsingInstances for cross-site
    // HTTP(S) navigations when the BrowsingInstance doesn't contain any other
    // windows.
    public static final String PROACTIVELY_SWAP_BROWSING_INSTANCE = "ProactivelySwapBrowsingInstance";

    // Fires the `pushsubscriptionchange` event defined here:
    // https://w3c.github.io/push-api/#the-pushsubscriptionchange-event
    // for subscription refreshes, revoked permissions or subscription losses
    public static final String PUSH_SUBSCRIPTION_CHANGE_EVENT = "PushSubscriptionChangeEvent";

    // Causes hidden tabs with crashed subframes to be marked for reload, meaning
    // that if a user later switches to that tab, the current page will be
    // reloaded.  This will hide crashed subframes from the user at the cost of
    // extra reloads.
    public static final String RELOAD_HIDDEN_TABS_WITH_CRASHED_SUBFRAMES = "ReloadHiddenTabsWithCrashedSubframes";

    // TODO(nuskos): Once we've conducted a retroactive study of chrometto
    // improvements clean up this feature.
    public static final String RENDER_ACCESSIBILITY_HOST_DESERIALIZATION_OFF_MAIN_THREAD = "RenderAccessibilityHostDeserializationOffMainThread";

    // Enable using the RenderDocument.
    public static final String RENDER_DOCUMENT = "RenderDocument";

    // Enables skipping the early call to CommitPending when navigating away from a
    // crashed frame.
    public static final String SKIP_EARLY_COMMIT_PENDING_FOR_CRASHED_FRAME = "SkipEarlyCommitPendingForCrashedFrame";

    // Run video capture service in the Browser process as opposed to a dedicated
    // utility process
    public static final String RUN_VIDEO_CAPTURE_SERVICE_IN_BROWSER_PROCESS = "RunVideoCaptureServiceInBrowserProcess";

    // Enables saving pages as Web Bundle.
    public static final String SAVE_PAGE_AS_WEB_BUNDLE = "SavePageAsWebBundle";

    // Browser-side feature flag for Secure Payment Confirmation (SPC) that also
    // controls the render side feature state. SPC initial launch is intended
    // only for Mac devices with Touch ID and and Windows devices with
    // Windows Hello authentication available and setup.
    public static final String SECURE_PAYMENT_CONFIRMATION = "SecurePaymentConfirmationBrowser";

    // Used to control whether to remove the restriction that PaymentCredential in
    // WebAuthn and secure payment confirmation method in PaymentRequest API must
    // use a user verifying platform authenticator. When enabled, this allows using
    // such devices as UbiKey on Linux, which can make development easier.
    public static final String SECURE_PAYMENT_CONFIRMATION_DEBUG = "SecurePaymentConfirmationDebug";

    // Make sendBeacon throw for a Blob with a non simple type.
    public static final String SEND_BEACON_THROW_FOR_BLOB_WITH_NON_SIMPLE_TYPE = "SendBeaconThrowForBlobWithNonSimpleType";

    // Service worker based payment apps as defined by w3c here:
    // https://w3c.github.io/webpayments-payment-apps-api/
    // TODO(rouslan): Remove this.
    public static final String SERVICE_WORKER_PAYMENT_APPS = "ServiceWorkerPaymentApps";

    // Enable the basic-card payment method from the PaymentRequest API. This has
    // been disabled since M100 and is soon to be removed: crbug.com/1209835.
    public static final String PAYMENT_REQUEST_BASIC_CARD = "PaymentRequestBasicCard";

    // Use this feature to experiment terminating a service worker when it doesn't
    // control any clients: https://crbug.com/1043845.
    public static final String SERVICE_WORKER_TERMINATION_ON_NO_CONTROLLEE = "ServiceWorkerTerminationOnNoControllee";

    // http://tc39.github.io/ecmascript_sharedmem/shmem.html
    // This feature is also enabled independently of this flag for cross-origin
    // isolated renderers.
    public static final String SHARED_ARRAY_BUFFER = "SharedArrayBuffer";

    // If enabled, SharedArrayBuffer is present and can be transferred on desktop
    // platforms. This flag is used only as a "kill switch" as we migrate towards
    // requiring 'crossOriginIsolated'.
    public static final String SHARED_ARRAY_BUFFER_ON_DESKTOP = "SharedArrayBufferOnDesktop";

    // Signed Exchange Reporting for distributors
    // https://www.chromestatus.com/feature/5687904902840320
    public static final String SIGNED_EXCHANGE_REPORTING_FOR_DISTRIBUTORS = "SignedExchangeReportingForDistributors";

    // Subresource prefetching+loading via Signed HTTP Exchange
    // https://www.chromestatus.com/feature/5126805474246656
    public static final String SIGNED_EXCHANGE_SUBRESOURCE_PREFETCH = "SignedExchangeSubresourcePrefetch";

    // Origin-Signed HTTP Exchanges (for WebPackage Loading)
    // https://www.chromestatus.com/feature/5745285984681984
    public static final String SIGNED_HTTP_EXCHANGE = "SignedHTTPExchange";

    // Whether to send a ping to the inner URL upon navigation or not.
    public static final String SIGNED_HTTP_EXCHANGE_PING_VALIDITY = "SignedHTTPExchangePingValidity";

    // Delays RenderProcessHost shutdown by a few seconds to allow the subframe's
    // process to be potentially reused. This aims to reduce process churn in
    // navigations where the source and destination share subframes.
    public static final String SUBFRAME_SHUTDOWN_DELAY = "SubframeShutdownDelay";

    // If enabled, GetUserMedia API will only work when the concerned tab is in
    // focus
    public static final String USER_MEDIA_CAPTURE_ON_FOCUS = "UserMediaCaptureOnFocus";

    // This is intended as a kill switch for the WebOTP Service feature. To enable
    // this feature, the experimental web platform features flag should be set.
    public static final String WEB_OTP = "WebOTP";

    // Enables WebOTP calls in cross-origin iframes if allowed by Permissions
    // Policy.
    public static final String WEB_OTP_ASSERTION_FEATURE_POLICY = "WebOTPAssertionFeaturePolicy";


    public static final String WEB_LOCK_SCREEN_API = "WebLockScreenApi";

    // Controls whether to isolate sites of documents that specify an eligible
    // Cross-Origin-Opener-Policy header.  Note that this is only intended to be
    // used on Android, which does not use strict site isolation. See
    // https://crbug.com/1018656.
    public static final String SITE_ISOLATION_FOR_CROSS_ORIGIN_OPENER_POLICY = "SiteIsolationForCrossOriginOpenerPolicy";

    // This feature turns on site isolation support in <webview> guests.
    public static final String SITE_ISOLATION_FOR_GUESTS = "SiteIsolationForGuests";

    // When enabled, OOPIFs will not try to reuse compatible processes from
    // unrelated tabs.
    public static final String DISABLE_PROCESS_REUSE = "DisableProcessReuse";

    // Controls whether SpareRenderProcessHostManager tries to always have a warm
    // spare renderer process around for the most recently requested BrowserContext.
    // This feature is only consulted in site-per-process mode.
    public static final String SPARE_RENDERER_FOR_SITE_PER_PROCESS = "SpareRendererForSitePerProcess";


    public static final String STOP_VIDEO_CAPTURE_ON_SCREEN_LOCK = "StopVideoCaptureOnScreenLock";

    // Controls whether site isolation should use origins instead of scheme and
    // eTLD+1.
    public static final String STRICT_ORIGIN_ISOLATION = "StrictOriginIsolation";

    // Enables subresource loading with Web Bundles.
    public static final String SUBRESOURCE_WEB_BUNDLES = "SubresourceWebBundles";

    // Disallows window.{alert, prompt, confirm} if triggered inside a subframe that
    // is not same origin with the main frame.
    public static final String SUPPRESS_DIFFERENT_ORIGIN_SUBFRAME_JS_DIALOGS = "SuppressDifferentOriginSubframeJSDialogs";

    // Dispatch touch events to "SyntheticGestureController" for events from
    // Devtool Protocol Input.dispatchTouchEvent to simulate touch events close to
    // real OS events.
    public static final String SYNTHETIC_POINTER_ACTIONS = "SyntheticPointerActions";

    // Whether optimizations controlled by kNavigationThreadingOptimizations are
    // moved to the IO thread or a separate background thread.
    public static final String THREADING_OPTIMIZATIONS_ON_IO = "ThreadingOptimizationsOnIO";

    // This feature allows touch dragging and a context menu to occur
    // simultaneously, with the assumption that the menu is non-modal.  Without this
    // feature, a long-press touch gesture can start either a drag or a context-menu
    // in Blink, not both (more precisely, a context menu is shown only if a drag
    // cannot be started).
    public static final String TOUCH_DRAG_AND_CONTEXT_MENU = "TouchDragAndContextMenu";

    // Enables async touchpad pinch zoom events. We check the ACK of the first
    // synthetic wheel event in a pinch sequence, then send the rest of the
    // synthetic wheel events of the pinch sequence as non-blocking if the first
    // event’s ACK is not canceled.
    public static final String TOUCHPAD_ASYNC_PINCH_EVENTS = "TouchpadAsyncPinchEvents";

    // Allows swipe left/right from touchpad change browser navigation. Currently
    // only enabled by default on CrOS, LaCrOS and Windows.
    public static final String TOUCHPAD_OVERSCROLL_HISTORY_NAVIGATION = "TouchpadOverscrollHistoryNavigation";

    // When TreatBootstrapAsDefault is enabled, the browser will execute tasks with
    // the kBootstrap task type on the default task queues (based on priority of
    // the task) rather than a dedicated high-priority task queue. Intended to
    // evaluate the impact of the already-launched prioritization of bootstrap
    // tasks (crbug.com/1258621).
    public static final String TREAT_BOOTSTRAP_AS_DEFAULT = "TreatBootstrapAsDefault";

    // Controls whether the Trusted Types API is available.
    public static final String TRUSTED_DOM_TYPES = "TrustedDOMTypes";

    // This feature is for a reverse Origin Trial, enabling SharedArrayBuffer for
    // sites as they migrate towards requiring cross-origin isolation for these
    // features.
    // TODO(bbudge): Remove when the deprecation is complete.
    // https://developer.chrome.com/origintrials/#/view_trial/303992974847508481
    // https://crbug.com/1144104
    public static final String UNRESTRICTED_SHARED_ARRAY_BUFFER = "UnrestrictedSharedArrayBuffer";

    // Allows user activation propagation to all frames having the same origin as
    // the activation notifier frame.  This is an intermediate measure before we
    // have an iframe attribute to declaratively allow user activation propagation
    // to subframes.
    public static final String USER_ACTIVATION_SAME_ORIGIN_VISIBILITY = "UserActivationSameOriginVisibility";

    // Enables comparing browser and renderer's DidCommitProvisionalLoadParams in
    // RenderFrameHostImpl::VerifyThatBrowserAndRendererCalculatedDidCommitParamsMatch.
    public static final String VERIFY_DID_COMMIT_PARAMS = "VerifyDidCommitParams";

    // Controls whether the <video>.getVideoPlaybackQuality() API is enabled.
    public static final String VIDEO_PLAYBACK_QUALITY = "VideoPlaybackQuality";

    // Enables future V8 VM features
    public static final String V8_VM_FUTURE = "V8VmFuture";

    // Enable window controls overlays for desktop PWAs
    public static final String WEB_APP_WINDOW_CONTROLS_OVERLAY = "WebAppWindowControlsOverlay";

    // Enable WebAssembly baseline compilation (Liftoff).
    public static final String WEB_ASSEMBLY_BASELINE = "WebAssemblyBaseline";

    // Enable memory protection for code JITed for WebAssembly.
    public static final String WEB_ASSEMBLY_CODE_PROTECTION = "WebAssemblyCodeProtection";

    // Use memory protection keys in userspace (PKU) (if available) to protect code
    // JITed for WebAssembly. Fall back to traditional memory protection if
    // WebAssemblyCodeProtection is also enabled.
    public static final String WEB_ASSEMBLY_CODE_PROTECTION_PKU = "WebAssemblyCodeProtectionPku";


    public static final String ENABLE_EXPERIMENTAL_WEB_ASSEMBLY_STACK_SWITCHING = "WebAssemblyExperimentalStackSwitching";

    // Enable WebAssembly dynamic tiering (only tier up hot functions).
    public static final String WEB_ASSEMBLY_DYNAMIC_TIERING = "WebAssemblyDynamicTiering";

    // Enable WebAssembly lazy compilation (JIT on first call).
    public static final String WEB_ASSEMBLY_LAZY_COMPILATION = "WebAssemblyLazyCompilation";

    // Enable WebAssembly SIMD.
    // https://github.com/WebAssembly/Simd
    public static final String WEB_ASSEMBLY_SIMD = "WebAssemblySimd";

    // Enable WebAssembly tiering (Liftoff -> TurboFan).
    public static final String WEB_ASSEMBLY_TIERING = "WebAssemblyTiering";

    // Enable WebAssembly trap handler.
    public static final String WEB_ASSEMBLY_TRAP_HANDLER = "WebAssemblyTrapHandler";

    // Controls whether CTAP2 devices can communicate via the WebAuthentication API
    // using pairingless BLE protocol.
    // https://w3c.github.io/webauthn
    public static final String WEB_AUTH_CABLE = "WebAuthenticationCable";

    // Controls whether WebAuthn conditional UI requests are supported.
    public static final String WEB_AUTH_CONDITIONAL_UI = "WebAuthenticationConditionalUI";

    // Controls whether the Web Bluetooth API is enabled:
    // https://webbluetoothcg.github.io/web-bluetooth/
    public static final String WEB_BLUETOOTH = "WebBluetooth";

    // Controls whether Web Bluetooth should use the new permissions backend. The
    // new permissions backend uses ChooserContextBase, which is used by other
    // device APIs, such as WebUSB. When enabled, WebBluetoothWatchAdvertisements
    // and WebBluetoothGetDevices blink features are also enabled.
    public static final String WEB_BLUETOOTH_NEW_PERMISSIONS_BACKEND = "WebBluetoothNewPermissionsBackend";

    // Controls whether Web Bundles (Bundled HTTP Exchanges) is enabled.
    // https://wicg.github.io/webpackage/draft-yasskin-wpack-bundled-exchanges.html
    // When this feature is enabled, Chromium can load unsigned Web Bundles local
    // file under file:// URL (and content:// URI on Android).
    public static final String WEB_BUNDLES = "WebBundles";

    // When this feature is enabled, Chromium will be able to load unsigned Web
    // Bundles file under https: URL and localhost http: URL.
    // TODO(crbug.com/1018640): Implement this feature.
    public static final String WEB_BUNDLES_FROM_NETWORK = "WebBundlesFromNetwork";

    // If WebGL Image Chromium is allowed, this feature controls whether it is
    // enabled.
    public static final String WEB_GL_IMAGE_CHROMIUM = "WebGLImageChromium";

    // Enable the browser process components of the Web MIDI API. This flag does not
    // control whether the API is exposed in Blink.
    public static final String WEB_MIDI = "WebMidi";

    // Controls which backend is used to retrieve OTP on Android. When disabled
    // we use User Consent API.
    public static final String WEB_OTP_BACKEND_AUTO = "WebOtpBackendAuto";

    // The JavaScript API for payments on the web.
    public static final String WEB_PAYMENTS = "WebPayments";

    // Use GpuMemoryBuffer backed VideoFrames in media streams.
    public static final String WEB_RTC_USE_GPU_MEMORY_BUFFER_VIDEO_FRAMES = "WebRTC-UseGpuMemoryBufferVideoFrames";

    // Enables code caching for scripts used on WebUI pages.
    public static final String WEB_UI_CODE_CACHE = "WebUICodeCache";

    // Enables report-only Trusted Types experiment on WebUIs
    public static final String WEB_UI_REPORT_ONLY_TRUSTED_TYPES = "WebUIReportOnlyTrustedTypes";

    // Controls whether the WebUSB API is enabled:
    // https://wicg.github.io/webusb
    public static final String WEB_USB = "WebUSB";

    // Controls whether the WebXR Device API is enabled.
    public static final String WEB_XR = "WebXR";

    // Enables access to AR features via the WebXR API.
    public static final String WEB_XR_AR_MODULE = "WebXRARModule";

    // Allows the use of page zoom in place of accessibility text autosizing, and
    // updated UI to replace existing Chrome Accessibility Settings.
    public static final String ACCESSIBILITY_PAGE_ZOOM = "AccessibilityPageZoom";

    // Sets moderate binding to background renderers playing media, when enabled.
    // Else the renderer will have strong binding.
    public static final String BACKGROUND_MEDIA_RENDERER_HAS_MODERATE_BINDING = "BackgroundMediaRendererHasModerateBinding";

    // Coalesce independent begin frame by ignoring begin frame that is out of date.
    public static final String COALESCE_INDEPENDENT_BEGIN_FRAME = "CoalesceIndependentBeginFrame";

    // Allows the use of an experimental feature to drop any AccessibilityEvents
    // that are not relevant to currently enabled accessibility services.
    public static final String ON_DEMAND_ACCESSIBILITY_EVENTS = "OnDemandAccessibilityEvents";

    // Request Desktop Site per-site setting for Android.
    // Refer to the launch bug (https://crbug.com/1244979) for more information.
    public static final String REQUEST_DESKTOP_SITE_EXCEPTIONS = "RequestDesktopSiteExceptions";

    // Request Desktop Site global setting for Android.
    // Refer to the launch bug (https://crbug.com/1244979) for more information.
    public static final String REQUEST_DESKTOP_SITE_GLOBAL = "RequestDesktopSiteGlobal";

    // Screen Capture API support for Android
    public static final String USER_MEDIA_SCREEN_CAPTURING = "UserMediaScreenCapturing";

    // Pre-warm up the network process on browser startup.
    public static final String WARM_UP_NETWORK_PROCESS = "WarmUpNetworkProcess";

    // Kill switch for the WebNFC feature. This feature can be enabled for all sites
    // using the kEnableExperimentalWebPlatformFeatures flag.
    // https://w3c.github.io/web-nfc/
    public static final String WEB_NFC = "WebNFC";

    // Temporarily pauses the compositor early in navigation.
    public static final String OPTIMIZE_EARLY_NAVIGATION = "OptimizeEarlyNavigation";

    // Enables caching of media devices for the purpose of enumerating them.
    public static final String DEVICE_MONITOR_MAC = "DeviceMonitorMac";

    // Enable IOSurface based screen capturer.
    public static final String IO_SURFACE_CAPTURER = "IOSurfaceCapturer";


    public static final String MAC_SYSCALL_SANDBOX = "MacSyscallSandbox";

    // Feature that controls whether WebContentsOcclusionChecker should handle
    // occlusion notifications.
    public static final String MAC_WEB_CONTENTS_OCCLUSION = "MacWebContentsOcclusion";

    // Enables retrying to obtain list of available cameras on Macbooks after
    // restarting the video capture service if a previous attempt delivered zero
    // cameras.
    public static final String RETRY_GET_VIDEO_CAPTURE_DEVICE_INFOS = "RetryGetVideoCaptureDeviceInfos";

    // Controls whether the PipeWire support for screen capturing is enabled on the
    // Wayland display server.
    public static final String WEB_RTC_PIPE_WIRE_CAPTURER = "WebRTCPipeWireCapturer";

    // Do not instantiate this class.
    private ContentFeatures() {}
}
