package com.balthazargronon.RCTZeroconf;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p393w1.C13364a;
import p393w1.InterfaceC13365b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ZeroconfModule extends ReactContextBaseJavaModule {
    public static final String EVENT_ERROR = "RNZeroconfError";
    public static final String EVENT_FOUND = "RNZeroconfFound";
    public static final String EVENT_PUBLISHED = "RNZeroconfServiceRegistered";
    public static final String EVENT_REMOVE = "RNZeroconfRemove";
    public static final String EVENT_RESOLVE = "RNZeroconfResolved";
    public static final String EVENT_START = "RNZeroconfStart";
    public static final String EVENT_STOP = "RNZeroconfStop";
    public static final String EVENT_UNREGISTERED = "RNZeroconfServiceUnregistered";
    public static final String KEY_SERVICE_ADDRESSES = "addresses";
    public static final String KEY_SERVICE_FULL_NAME = "fullName";
    public static final String KEY_SERVICE_HOST = "host";
    public static final String KEY_SERVICE_NAME = "name";
    public static final String KEY_SERVICE_PORT = "port";
    public static final String KEY_SERVICE_TXT = "txt";
    private C13364a zeroConfFactory;

    public ZeroconfModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.zeroConfFactory = new C13364a(this, getReactApplicationContext());
    }

    private InterfaceC13365b getZeroconfImpl(String str) {
        return this.zeroConfFactory.m2703b(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNZeroconf";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        try {
            stop("NSD");
            stop("DNSSD");
        } catch (Throwable th2) {
            Log.e(getClass().getName(), th2.getMessage(), th2);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            sendEvent(reactApplicationContext, EVENT_ERROR, "Exception During Catalyst Destroy: " + th2.getMessage());
        }
    }

    @ReactMethod
    public void registerService(String str, String str2, String str3, String str4, int i, ReadableMap readableMap, String str5) {
        try {
            getZeroconfImpl(str5).mo1364b(str, str2, str3, str4, i, readableMap);
        } catch (Throwable th2) {
            Log.e(getClass().getName(), th2.getMessage(), th2);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            sendEvent(reactApplicationContext, EVENT_ERROR, "Exception During Register Service: " + th2.getMessage());
        }
    }

    @ReactMethod
    public void scan(String str, String str2, String str3, String str4) {
        try {
            getZeroconfImpl(str4).mo1365a(str, str2, str3);
        } catch (Throwable th2) {
            Log.e(getClass().getName(), th2.getMessage(), th2);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            sendEvent(reactApplicationContext, EVENT_ERROR, "Exception During Scan: " + th2.getMessage());
        }
    }

    public void sendEvent(ReactContext reactContext, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void stop(String str) {
        try {
            getZeroconfImpl(str).stop();
        } catch (Throwable th2) {
            Log.e(getClass().getName(), th2.getMessage(), th2);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            sendEvent(reactApplicationContext, EVENT_ERROR, "Exception During Stop: " + th2.getMessage());
        }
    }

    @ReactMethod
    public void unregisterService(String str, String str2) {
        try {
            getZeroconfImpl(str2).mo1363c(str);
        } catch (Throwable th2) {
            Log.e(getClass().getName(), th2.getMessage(), th2);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            sendEvent(reactApplicationContext, EVENT_ERROR, "Exception During Unregister Service: " + th2.getMessage());
        }
    }
}