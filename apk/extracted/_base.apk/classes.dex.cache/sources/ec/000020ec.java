package com.discord.tti_manager;

import com.discord.logging.Log;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.tti_manager.TTIBroadcastReceiver;
import com.discord.tti_manager.TTIMetrics;
import com.discord.tti_manager.react.ReactMarkerListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0007J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/tti_manager/TTIManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "ttiBroadcastReceiver", "Lcom/discord/tti_manager/TTIBroadcastReceiver;", "getAllNativeTimestamps", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getConstants", "", "", "", "getJSBundleTimestamps", "getName", "initialize", "invalidate", "logToDevice", "value", "logToDeviceEnabled", "runningTTIAutomation", "", "trackTTILogged", "tti_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class TTIManagerModule extends ReactContextBaseJavaModule {
    private final TTIBroadcastReceiver ttiBroadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTIManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.ttiBroadcastReceiver = new TTIBroadcastReceiver();
    }

    @ReactMethod
    public final void getAllNativeTimestamps(Promise promise) {
        int m14093t;
        C9612q.m13917h(promise, "promise");
        try {
            ArrayList<TTIMetrics.Timing> timings = TTIMetrics.INSTANCE.getTimings();
            m14093t = C9546k.m14093t(timings, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (TTIMetrics.Timing timing : timings) {
                arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("label", timing.getLabel()), C11591x.m7577a("timestamp", Long.valueOf(timing.getTimestamp())), C11591x.m7577a("tag", timing.getTag()), C11591x.m7577a("autoGenerated", Boolean.valueOf(timing.getAutoGenerated()))));
            }
            promise.resolve(NativeArrayExtensionsKt.toNativeArray(arrayList));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Long> getConstants() {
        Map<String, Long> m6750l;
        m6750l = C11889v.m6750l(C11591x.m7577a("AppOpenedTimestamp", Long.valueOf(TTILoggingApplication.Companion.getAppOpenedTimestamp$tti_manager_release())));
        return m6750l;
    }

    @ReactMethod
    public final void getJSBundleTimestamps(Promise promise) {
        C9612q.m13917h(promise, "promise");
        try {
            ReactMarkerListener reactMarkerListener = ReactMarkerListener.INSTANCE;
            promise.resolve(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("JSBundleStartedTimestamp", Double.valueOf(reactMarkerListener.getBundleStartedTimestamp())), C11591x.m7577a("JSBundleLoadedTimestamp", Double.valueOf(reactMarkerListener.getBundleLoadedTimestamp())), C11591x.m7577a("JSBundleParsedTimestamp", Double.valueOf(reactMarkerListener.getBundleParsedTimestamp()))));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TTIManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Boolean logTTIMetrics = BuildConfig.logTTIMetrics;
        C9612q.m13918g(logTTIMetrics, "logTTIMetrics");
        if (logTTIMetrics.booleanValue()) {
            TTIBroadcastReceiver.Companion companion = TTIBroadcastReceiver.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
            companion.register(reactApplicationContext, this.ttiBroadcastReceiver);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        try {
            Boolean logTTIMetrics = BuildConfig.logTTIMetrics;
            C9612q.m13918g(logTTIMetrics, "logTTIMetrics");
            if (logTTIMetrics.booleanValue()) {
                TTIBroadcastReceiver.Companion companion = TTIBroadcastReceiver.Companion;
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
                companion.unregister(reactApplicationContext, this.ttiBroadcastReceiver);
            }
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public final void logToDevice(String value) {
        C9612q.m13917h(value, "value");
        Log.i$default(Log.INSTANCE, "ttidata", value, (Throwable) null, 4, (Object) null);
    }

    @ReactMethod
    public final void logToDeviceEnabled(Promise promise) {
        C9612q.m13917h(promise, "promise");
        promise.resolve(BuildConfig.logTTIMetrics);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean runningTTIAutomation() {
        Boolean logTTIMetrics = BuildConfig.logTTIMetrics;
        C9612q.m13918g(logTTIMetrics, "logTTIMetrics");
        return logTTIMetrics.booleanValue();
    }

    @ReactMethod
    public final void trackTTILogged() {
        TTIMetrics.INSTANCE.setLoggedTTI(true);
    }
}