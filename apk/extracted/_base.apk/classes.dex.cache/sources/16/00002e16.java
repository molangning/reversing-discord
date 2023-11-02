package com.mkuczera;

import android.os.Vibrator;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNReactNativeHapticFeedbackModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNReactNativeHapticFeedback";
    }

    @ReactMethod
    public void trigger(String str, ReadableMap readableMap) {
        boolean z = readableMap.getBoolean("ignoreAndroidSystemSettings");
        int i = Settings.System.getInt(this.reactContext.getContentResolver(), "haptic_feedback_enabled", 0);
        if (!z && i == 0) {
            return;
        }
        Vibrator vibrator = (Vibrator) this.reactContext.getSystemService("vibrator");
        InterfaceC5276b m25542a = C5277c.m25542a(str);
        if (vibrator != null && m25542a != null) {
            m25542a.mo25540a(vibrator);
        }
    }
}