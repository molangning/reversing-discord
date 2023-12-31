package com.discord.resource_usage;

import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/resource_usage/DeviceResourceUsageManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "deviceResourceUsageManager", "Lcom/discord/resource_usage/DeviceResourceUsageManager;", "getCpuCoreCount", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getCurrentCpuUsagePercent", "getCurrentMemoryUsageKb", "getName", "", "getNetworkUsage", "initialize", "invalidate", "resource_usage_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class DeviceResourceUsageManagerModule extends ReactContextBaseJavaModule {
    private final DeviceResourceUsageManager deviceResourceUsageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceResourceUsageManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.deviceResourceUsageManager = new DeviceResourceUsageManager(0L, 1, null);
    }

    @ReactMethod
    public final void getCpuCoreCount(Callback callback) {
        C9612q.m13917h(callback, "callback");
        callback.invoke(Integer.valueOf(this.deviceResourceUsageManager.getCpuCoreCount()));
    }

    @ReactMethod
    public final void getCurrentCpuUsagePercent(Callback callback) {
        C9612q.m13917h(callback, "callback");
        callback.invoke(Double.valueOf(this.deviceResourceUsageManager.getCpuUsagePercent()));
    }

    @ReactMethod
    public final void getCurrentMemoryUsageKb(Callback callback) {
        C9612q.m13917h(callback, "callback");
        callback.invoke(Integer.valueOf(this.deviceResourceUsageManager.getMemoryRssKB()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SystemResourceManager";
    }

    @ReactMethod
    public final void getNetworkUsage(Callback callback) {
        C9612q.m13917h(callback, "callback");
        DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        callback.invoke(companion.getNetworkUsage(reactApplicationContext));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.deviceResourceUsageManager.start();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        this.deviceResourceUsageManager.stop();
    }
}