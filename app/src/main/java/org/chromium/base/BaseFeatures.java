// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.base;

/**
* Constants for the names of //base Features.
*/
public final class BaseFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../base/android/base_features.cc,
    //     ../../base/features.cc,
    //     ../../base/task/task_features.cc
    // Into
    //     ../../base/android/java/src/org/chromium/base/BaseFeatures.java.tmpl

    // Crash the browser process if a child process is created which does not match
    // the browser process and the browser package appears to have changed since the
    // browser process was launched, so that the browser process will be started
    // fresh when next used, hopefully resolving the issue.
    public static final String CRASH_BROWSER_ON_CHILD_MISMATCH_IF_BROWSER_CHANGED = "CrashBrowserOnChildMismatchIfBrowserChanged";

    // Crash the browser process if a child process is created which does not match
    // the browser process regardless of whether the browser package appears to have
    // changed.
    public static final String CRASH_BROWSER_ON_ANY_CHILD_MISMATCH = "CrashBrowserOnAnyChildMismatch";

    // Optimizes parsing and loading of data: URLs.
    public static final String OPTIMIZE_DATA_URLS = "OptimizeDataUrls";


    public static final String MAY_BLOCK_WITHOUT_DELAY = "MayBlockWithoutDelay";


    public static final String DISABLE_JOB_YIELD = "DisableJobYield";


    public static final String DISABLE_FAIR_JOB_SCHEDULING = "DisableFairJobScheduling";


    public static final String DISABLE_JOB_UPDATE_PRIORITY = "DisableJobUpdatePriority";


    public static final String WAKE_UP_STRATEGY_FEATURE = "WakeUpStrategyFeature";


    public static final String WAKE_UP_AFTER_GET_WORK = "WakeUpAfterGetWork";


    public static final String USE_NATIVE_THREAD_POOL = "UseNativeThreadPool";


    public static final String USE_BACKGROUND_NATIVE_THREAD_POOL = "UseBackgroundNativeThreadPool";


    public static final String USE_FIVE_MINUTES_THREAD_RECLAIM_TIME = "UseFiveMinutesThreadReclaimTime";

    // static
    public static final String NO_WAKE_UPS_FOR_CANCELED_TASKS = "NoWakeUpsForCanceledTasks";


    public static final String REMOVE_CANCELED_TASKS_IN_TASK_QUEUE = "RemoveCanceledTasksInTaskQueue2";


    public static final String ADD_TASK_LEEWAY_FEATURE = "AddTaskLeeway";


    public static final String ALIGN_WAKE_UPS = "AlignWakeUps";


    public static final String EXPLICIT_HIGH_RESOLUTION_TIMER_WIN = "ExplicitHighResolutionTimerWin";


    public static final String RUN_TASKS_BY_BATCHES = "RunTasksByBatches";

    // Prevents instantiation.
    private BaseFeatures() {}
}
