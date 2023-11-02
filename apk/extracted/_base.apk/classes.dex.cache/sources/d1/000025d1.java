package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import p077e5.InterfaceC6107a;

@ReactModule(name = NativeDeviceEventManagerSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    private final Runnable mInvokeDefaultBackPressRunnable;

    @InterfaceC6107a
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, final DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new Runnable() { // from class: com.facebook.react.modules.core.DeviceEventManagerModule.1
            @Override // java.lang.Runnable
            public void run() {
                UiThreadUtil.assertOnUiThread();
                defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
            }
        };
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("hardwareBackPress", null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("url", uri.toString());
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("url", createMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}