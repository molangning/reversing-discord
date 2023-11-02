package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import p150i5.C7382a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactBridge {
    private static volatile boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (sDidInit) {
                return;
            }
            sLoadStartTime = SystemClock.uptimeMillis();
            C7382a.m20813c(0L, "ReactBridge.staticInit::load:reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.m30164r("reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            C7382a.m20809g(0L);
            sLoadEndTime = SystemClock.uptimeMillis();
            sDidInit = true;
        }
    }
}
