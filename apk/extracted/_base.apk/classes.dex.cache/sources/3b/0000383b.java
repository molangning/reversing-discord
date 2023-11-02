package io.sentry.android.core;

import io.sentry.C8132r4;
import io.sentry.protocol.C8096o;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SentryAndroidOptions extends C8132r4 {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private InterfaceC7702a beforeScreenshotCaptureCallback;
    private InterfaceC7702a beforeViewHierarchyCaptureCallback;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private int profilingTracesHz = 101;
    private InterfaceC7821x0 debugImagesLoader = C7734h1.m19834a();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;

    /* renamed from: io.sentry.android.core.SentryAndroidOptions$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7702a {
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/6.27.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
        setEnableScopeSync(true);
    }

    private C8096o createSdkVersion() {
        C8096o m18596n = C8096o.m18596n(getSdkVersion(), "sentry.java.android", "6.27.0");
        m18596n.m18606d("maven:io.sentry:sentry-android-core", "6.27.0");
        return m18596n;
    }

    public void enableAllAutoBreadcrumbs(boolean z) {
        this.enableActivityLifecycleBreadcrumbs = z;
        this.enableAppComponentBreadcrumbs = z;
        this.enableSystemEventBreadcrumbs = z;
        this.enableAppLifecycleBreadcrumbs = z;
        this.enableNetworkEventBreadcrumbs = z;
        setEnableUserInteractionBreadcrumbs(z);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public InterfaceC7702a getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public InterfaceC7702a getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public InterfaceC7821x0 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Deprecated
    public int getProfilingTracesIntervalMillis() {
        return 0;
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z) {
        this.anrEnabled = z;
    }

    public void setAnrReportInDebug(boolean z) {
        this.anrReportInDebug = z;
    }

    public void setAnrTimeoutIntervalMillis(long j) {
        this.anrTimeoutIntervalMillis = j;
    }

    public void setAttachAnrThreadDump(boolean z) {
        this.attachAnrThreadDump = z;
    }

    public void setAttachScreenshot(boolean z) {
        this.attachScreenshot = z;
    }

    public void setAttachViewHierarchy(boolean z) {
        this.attachViewHierarchy = z;
    }

    public void setBeforeScreenshotCaptureCallback(InterfaceC7702a interfaceC7702a) {
    }

    public void setBeforeViewHierarchyCaptureCallback(InterfaceC7702a interfaceC7702a) {
    }

    public void setCollectAdditionalContext(boolean z) {
        this.collectAdditionalContext = z;
    }

    public void setDebugImagesLoader(InterfaceC7821x0 interfaceC7821x0) {
        if (interfaceC7821x0 == null) {
            interfaceC7821x0 = C7734h1.m19834a();
        }
        this.debugImagesLoader = interfaceC7821x0;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z) {
        this.enableActivityLifecycleBreadcrumbs = z;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z) {
        this.enableActivityLifecycleTracingAutoFinish = z;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z) {
        this.enableAppComponentBreadcrumbs = z;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z) {
        this.enableAppLifecycleBreadcrumbs = z;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z) {
        this.enableAutoActivityLifecycleTracing = z;
    }

    public void setEnableFramesTracking(boolean z) {
        this.enableFramesTracking = z;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z) {
        this.enableNetworkEventBreadcrumbs = z;
    }

    public void setEnableRootCheck(boolean z) {
        this.enableRootCheck = z;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z) {
        this.enableSystemEventBreadcrumbs = z;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    @Deprecated
    public void setProfilingTracesIntervalMillis(int i) {
    }

    public void setReportHistoricalAnrs(boolean z) {
        this.reportHistoricalAnrs = z;
    }

    void setStartupCrashFlushTimeoutMillis(long j) {
        this.startupCrashFlushTimeoutMillis = j;
    }
}