package com.facebook.react.modules.common;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ModuleDataCleaner {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface Cleanable {
        void clearSensitiveData();
    }

    public static void cleanDataFromModules(CatalystInstance catalystInstance) {
        for (NativeModule nativeModule : catalystInstance.getNativeModules()) {
            if (nativeModule instanceof Cleanable) {
                C13677a.m1862b(ReactConstants.TAG, "Cleaning data from " + nativeModule.getName());
                ((Cleanable) nativeModule).clearSensitiveData();
            }
        }
    }

    public static void cleanDataFromModules(ReactContext reactContext) {
        for (NativeModule nativeModule : reactContext.getNativeModules()) {
            if (nativeModule instanceof Cleanable) {
                C13677a.m1862b(ReactConstants.TAG, "Cleaning data from " + nativeModule.getName());
                ((Cleanable) nativeModule).clearSensitiveData();
            }
        }
    }
}