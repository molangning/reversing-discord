package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class NativeKeyboardManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RTNKeyboardManager";

    public NativeKeyboardManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void clearCurrentFocusAndDismissKeyboard();

    @ReactMethod
    @InterfaceC6107a
    public abstract void dismissGlobalKeyboard();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNKeyboardManager";
    }

    @ReactMethod
    @InterfaceC6107a
    public abstract void onKeyboardChanged(boolean z);

    @ReactMethod
    @InterfaceC6107a
    public abstract void showGlobalKeyboard();
}
