package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = NativePlatformConstantsAndroidSpec.NAME)
@SuppressLint({"HardwareIds"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec {
    private static final String IS_TESTING = "IS_TESTING";

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 2) {
                if (currentModeType != 3) {
                    if (currentModeType != 4) {
                        if (currentModeType != 6) {
                            if (currentModeType != 7) {
                                return "unknown";
                            }
                            return "vrheadset";
                        }
                        return "watch";
                    }
                    return "tv";
                }
                return "car";
            }
            return "desk";
        }
        return "normal";
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        boolean z;
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("Release", Build.VERSION.RELEASE);
        hashMap.put("Serial", Build.SERIAL);
        hashMap.put("Fingerprint", Build.FINGERPRINT);
        hashMap.put("Model", Build.MODEL);
        hashMap.put("Manufacturer", Build.MANUFACTURER);
        hashMap.put("Brand", Build.BRAND);
        if (!"true".equals(System.getProperty(IS_TESTING)) && !isRunningScreenshotTest().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        hashMap.put("isTesting", Boolean.valueOf(z));
        hashMap.put("reactNativeVersion", ReactNativeVersion.VERSION);
        hashMap.put("uiMode", uiMode());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
    }
}