package com.discord.device;

import android.os.Build;
import android.os.PowerManager;
import com.discord.device.events.DeviceThermalStateChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/device/DeviceThermalStateManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "getName", "getThermalState", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "initialize", "removeListeners", "count", "", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeviceThermalStateManagerModule extends ReactContextBaseJavaModule {
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceThermalStateManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(C11591x.m7577a("DeviceThermalStateDidChange", C9591f0.m13969b(DeviceThermalStateChangedEvent.class)));
    }

    public static final void initialize$lambda$0(DeviceThermalStateManagerModule this$0, int i) {
        C9612q.m13917h(this$0, "this$0");
        ReactEvents reactEvents = this$0.reactEvents;
        ReactApplicationContext reactApplicationContext = this$0.getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        reactEvents.emitModuleEvent(reactApplicationContext, new DeviceThermalStateChangedEvent(i));
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDDeviceThermalStateManager";
    }

    @ReactMethod
    public final void getThermalState(Promise promise) {
        int currentThermalStatus;
        C9612q.m13917h(promise, "promise");
        Object systemService = getReactApplicationContext().getSystemService("power");
        C9612q.m13919f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            currentThermalStatus = powerManager.getCurrentThermalStatus();
            promise.resolve(Integer.valueOf(currentThermalStatus));
            return;
        }
        promise.reject(new Exception("getThermalState() requires OS Android 10 or up."));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Object systemService = getReactApplicationContext().getSystemService("power");
        C9612q.m13919f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            powerManager.addThermalStatusListener(new PowerManager.OnThermalStatusChangedListener() { // from class: com.discord.device.g
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public final void onThermalStatusChanged(int i) {
                    DeviceThermalStateManagerModule.initialize$lambda$0(DeviceThermalStateManagerModule.this, i);
                }
            });
        }
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }
}