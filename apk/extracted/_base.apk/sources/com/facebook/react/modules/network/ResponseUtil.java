package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.net.SocketTimeoutException;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ResponseUtil {
    public static void onDataReceived(ReactApplicationContext reactApplicationContext, int i, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", createArray);
        }
    }

    public static void onDataReceivedProgress(ReactApplicationContext reactApplicationContext, int i, long j, long j2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt((int) j);
        createArray.pushInt((int) j2);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkDataProgress", createArray);
        }
    }

    public static void onDataSend(ReactApplicationContext reactApplicationContext, int i, long j, long j2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt((int) j);
        createArray.pushInt((int) j2);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didSendNetworkData", createArray);
        }
    }

    public static void onIncrementalDataReceived(ReactApplicationContext reactApplicationContext, int i, String str, long j, long j2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        createArray.pushInt((int) j);
        createArray.pushInt((int) j2);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkIncrementalData", createArray);
        }
    }

    public static void onRequestError(ReactApplicationContext reactApplicationContext, int i, String str, Throwable th2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        if (th2 != null && th2.getClass() == SocketTimeoutException.class) {
            createArray.pushBoolean(true);
        }
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", createArray);
        }
    }

    public static void onRequestSuccess(ReactApplicationContext reactApplicationContext, int i) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushNull();
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", createArray);
        }
    }

    public static void onResponseReceived(ReactApplicationContext reactApplicationContext, int i, int i2, WritableMap writableMap, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt(i2);
        createArray.pushMap(writableMap);
        createArray.pushString(str);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", createArray);
        }
    }

    public static void onDataReceived(ReactApplicationContext reactApplicationContext, int i, WritableMap writableMap) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushMap(writableMap);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", createArray);
        }
    }
}
