package com.discord.device;

import com.discord.codegen.NativeDevicePerformanceManagerSpec;
import com.discord.device.utils.DefaultDevicePerformance;
import com.discord.device.utils.DevicePerformance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/device/DevicePerformanceManagerModule;", "Lcom/discord/codegen/NativeDevicePerformanceManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "devicePerformance", "Lcom/discord/device/utils/DevicePerformance;", "getMediaPerformanceClass", "", "getName", "", "Companion", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DevicePerformanceManagerModule extends NativeDevicePerformanceManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNDevicePerformanceManager";
    private DevicePerformance devicePerformance;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/device/DevicePerformanceManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new DevicePerformanceManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePerformanceManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.devicePerformance = new DefaultDevicePerformance();
    }

    @Override // com.discord.codegen.NativeDevicePerformanceManagerSpec
    @ReactMethod
    public double getMediaPerformanceClass() {
        return this.devicePerformance.getMediaPerformanceClass();
    }

    @Override // com.discord.codegen.NativeDevicePerformanceManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNDeviceLocaleManager";
    }
}
