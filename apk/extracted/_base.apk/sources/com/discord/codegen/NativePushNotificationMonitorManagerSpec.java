package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativePushNotificationMonitorManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNNativePushNotificationMonitor";

    public NativePushNotificationMonitorManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void areNotificationsEnabled(Promise promise);

    @ReactMethod
    @InterfaceC6107a
    public abstract void clearLogs();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNNativePushNotificationMonitor";
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void getPushNotificationLogs(String str, Promise promise);
}
