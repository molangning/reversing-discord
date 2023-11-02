package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativeMobileVoiceOverlaySpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNMobileVoiceOverlay";

    public NativeMobileVoiceOverlaySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void enableOverlay(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNMobileVoiceOverlay";
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void hideOverlay();

    @ReactMethod
    @InterfaceC6107a
    public abstract void setData(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC6107a
    public abstract void showOverlay(ReadableMap readableMap);
}