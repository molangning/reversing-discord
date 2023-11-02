package com.discord.crash_reporting;

import com.discord.crash_reporting.CrashReportingCache;
import com.discord.crash_reporting.react_events.CrashReportEvent;
import com.discord.crash_reporting.system_logs.SystemLogReport;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.sentry.react.RNSentryModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/crash_reporting/CrashReportingModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "sentryModule", "Lio/sentry/react/RNSentryModule;", "getSentryModule", "()Lio/sentry/react/RNSentryModule;", "addListener", "", "type", "", "crash", "getDidCrashDuringPreviousExecution", "callback", "Lcom/facebook/react/bridge/Callback;", "getName", "getSystemLog", "initializeManager", "removeListeners", "count", "", "setUser", "user", "Lcom/facebook/react/bridge/ReadableMap;", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CrashReportingModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashReportingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(C11591x.m7577a("DCDCrashlyticsCrashReports", C9591f0.m13969b(CrashReportEvent.class)));
    }

    private final RNSentryModule getSentryModule() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule(RNSentryModule.class);
        C9612q.m13920e(nativeModule);
        return (RNSentryModule) nativeModule;
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
        if (C9612q.m13922c(CrashReporting.INSTANCE.isCrashedLastRun(), Boolean.TRUE)) {
            SystemLogReport systemLogReport = SystemLogReport.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
            systemLogReport.reportLastCrash$crash_reporting_release(reactApplicationContext, new CrashReportingModule$addListener$1(this));
        }
    }

    @ReactMethod
    public final void crash() {
        getSentryModule().crash();
    }

    @ReactMethod
    public final void getDidCrashDuringPreviousExecution(Callback callback) {
        C9612q.m13917h(callback, "callback");
        Boolean isCrashedLastRun = CrashReporting.INSTANCE.isCrashedLastRun();
        if (isCrashedLastRun != null) {
            callback.invoke(isCrashedLastRun);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CrashlyticsManager";
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void getSystemLog(Callback callback) {
        C9612q.m13917h(callback, "callback");
        SystemLogUtils systemLogUtils = SystemLogUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        callback.invoke(systemLogUtils.fetch(reactApplicationContext));
    }

    @ReactMethod
    public final void initializeManager() {
        SystemLogUtils systemLogUtils = SystemLogUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        systemLogUtils.initSystemLogCapture(reactApplicationContext);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setUser(ReadableMap user) {
        C9612q.m13917h(user, "user");
        boolean z = user.getBoolean("staff");
        CrashReportingCache.Companion companion = CrashReportingCache.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.getInstance(reactApplicationContext).setStaff(z);
    }
}
