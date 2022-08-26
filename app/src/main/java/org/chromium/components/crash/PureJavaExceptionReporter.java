// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.crash;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;

import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.BuildInfo;
import org.chromium.base.CommandLine;
import org.chromium.base.ContextUtils;
import org.chromium.base.PiiElider;
import org.chromium.base.StrictModeContext;
import org.chromium.base.annotations.MainDex;
import org.chromium.components.minidump_uploader.CrashFileManager;
import org.chromium.components.version_info.VersionInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * Creates a crash report and uploads it to crash server if there is a Java exception.
 *
 * This class is written in pure Java, so it can handle exception happens before native is loaded.
 */
@MainDex
public abstract class PureJavaExceptionReporter
        implements PureJavaExceptionHandler.JavaExceptionReporter {
    // report fields, please keep the name sync with MIME blocks in breakpad_linux.cc
    public static final String CHANNEL = "channel";
    public static final String VERSION = "ver";
    public static final String PRODUCT = "prod";
    public static final String ANDROID_BUILD_ID = "android_build_id";
    public static final String ANDROID_BUILD_FP = "android_build_fp";
    public static final String SDK = "sdk";
    public static final String DEVICE = "device";
    public static final String GMS_CORE_VERSION = "gms_core_version";
    public static final String INSTALLER_PACKAGE_NAME = "installer_package_name";
    public static final String ABI_NAME = "abi_name";
    public static final String PACKAGE = "package";
    public static final String MODEL = "model";
    public static final String BRAND = "brand";
    public static final String BOARD = "board";
    public static final String EXCEPTION_INFO = "exception_info";
    public static final String PROCESS_TYPE = "ptype";
    public static final String EARLY_JAVA_EXCEPTION = "early_java_exception";
    public static final String CUSTOM_THEMES = "custom_themes";
    public static final String RESOURCES_VERSION = "resources_version";

    private static final String DUMP_LOCATION_SWITCH = "breakpad-dump-location";
    private static final String FILE_SUFFIX = ".dmp";
    private static final String RN = "\r\n";
    private static final String FORM_DATA_MESSAGE = "Content-Disposition: form-data; name=\"";

    private boolean mUpload;
    protected File mMinidumpFile;
    private FileOutputStream mMinidumpFileStream;
    private final String mLocalId = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    private final String mBoundary = "------------" + UUID.randomUUID() + RN;

    // The top level directory where all crash related files are stored.
    protected final File mCrashFilesDirectory;

    public PureJavaExceptionReporter(File crashFilesDirectory) {
        mCrashFilesDirectory = crashFilesDirectory;
    }

    @Override
    public void createAndUploadReport(Throwable javaException) {
        // It is OK to do IO in main thread when we know there is a crash happens.
        try (StrictModeContext ignored = StrictModeContext.allowDiskWrites()) {
            createReport(javaException);
            flushToFile();
            uploadReport();
        }
    }

    private void addPairedString(String messageType, String messageData) {
        addString(mBoundary);
        addString(FORM_DATA_MESSAGE + messageType + "\"");
        addString(RN + RN + messageData + RN);
    }

    private void addString(String s) {
        try {
            mMinidumpFileStream.write(ApiCompatibilityUtils.getBytesUtf8(s));
        } catch (IOException e) {
            // Nothing we can do here.
        }
    }

    @SuppressLint("WrongConstant")
    private void createReport(Throwable javaException) {
        try {
            String minidumpFileName = getMinidumpPrefix() + mLocalId + FILE_SUFFIX;
            File minidumpDir = new File(mCrashFilesDirectory, CrashFileManager.CRASH_DUMP_DIR);
            // Tests disable minidump uploading by not creating the minidump directory.
            mUpload = minidumpDir.exists();
            String overrideMinidumpDirPath =
                    CommandLine.getInstance().getSwitchValue(DUMP_LOCATION_SWITCH);
            if (overrideMinidumpDirPath != null) {
                minidumpDir = new File(overrideMinidumpDirPath);
                minidumpDir.mkdirs();
            }
            mMinidumpFile = new File(minidumpDir, minidumpFileName);
            mMinidumpFileStream = new FileOutputStream(mMinidumpFile);
        } catch (FileNotFoundException e) {
            mMinidumpFile = null;
            mMinidumpFileStream = null;
            return;
        }

        String processName = ContextUtils.getProcessName();
        if (processName == null || !processName.contains(":")) {
            processName = "browser";
        }

        BuildInfo buildInfo = BuildInfo.getInstance();
        addPairedString(PRODUCT, getProductName());
        addPairedString(PROCESS_TYPE, processName);
        addPairedString(DEVICE, Build.DEVICE);
        addPairedString(VERSION, VersionInfo.getProductVersion());
        addPairedString(CHANNEL, getChannel());
        addPairedString(ANDROID_BUILD_ID, Build.ID);
        addPairedString(MODEL, Build.MODEL);
        addPairedString(BRAND, Build.BRAND);
        addPairedString(BOARD, Build.BOARD);
        addPairedString(ANDROID_BUILD_FP, buildInfo.androidBuildFingerprint);
        addPairedString(SDK, String.valueOf(Build.VERSION.SDK_INT));
        addPairedString(GMS_CORE_VERSION, buildInfo.gmsVersionCode);
        addPairedString(INSTALLER_PACKAGE_NAME, buildInfo.installerPackageName);
        addPairedString(ABI_NAME, buildInfo.abiString);
        addPairedString(EXCEPTION_INFO,
                PiiElider.sanitizeStacktrace(Log.getStackTraceString(javaException)));
        addPairedString(EARLY_JAVA_EXCEPTION, "true");
        addPairedString(PACKAGE,
                String.format("%s v%s (%s)", BuildInfo.getFirebaseAppId(), buildInfo.versionCode,
                        buildInfo.versionName));
        addPairedString(CUSTOM_THEMES, buildInfo.customThemes);
        addPairedString(RESOURCES_VERSION, buildInfo.resourcesVersion);

        AtomicReferenceArray<String> values = CrashKeys.getInstance().getValues();
        for (int i = 0; i < values.length(); i++) {
            String value = values.get(i);
            if (value != null) addPairedString(CrashKeys.getKey(i), value);
        }

        addString(mBoundary);
    }

    private void flushToFile() {
        if (mMinidumpFileStream == null) {
            return;
        }
        try {
            mMinidumpFileStream.flush();
            mMinidumpFileStream.close();
        } catch (Throwable e) {
            mMinidumpFile = null;
        } finally {
            mMinidumpFileStream = null;
        }
    }

    private static String getChannel() {
        if (VersionInfo.isCanaryBuild()) {
            return "canary";
        }
        if (VersionInfo.isDevBuild()) {
            return "dev";
        }
        if (VersionInfo.isBetaBuild()) {
            return "beta";
        }
        // An empty string indicates the stable channel.
        return "";
    }

    private void uploadReport() {
        if (mMinidumpFile == null || !mUpload) return;
        LogcatCrashExtractor logcatExtractor = new LogcatCrashExtractor();
        mMinidumpFile = logcatExtractor.attachLogcatToMinidump(mMinidumpFile);
        uploadMinidump(mMinidumpFile);
    }

    /**
     * @return the product name to be used in the crash report.
     */
    protected abstract String getProductName();

    /**
     * Attempt uploading the given {@code minidump} report immediately.
     *
     * @param minidump the minidump file to be uploaded.
     */
    protected abstract void uploadMinidump(File minidump);

    /**
     * @return prefix to be added before the minidump file name.
     */
    protected abstract String getMinidumpPrefix();
}
