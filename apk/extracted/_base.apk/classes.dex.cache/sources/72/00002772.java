package com.facebook.react.util;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNLog {
    public static final int ADVICE = 4;
    public static final int ERROR = 6;
    public static final int LOG = 2;
    public static final int MINIMUM_LEVEL_FOR_UI = 5;
    public static final int TRACE = 3;
    public static final int WARN = 5;

    /* renamed from: a */
    public static void m30238a(String str) {
        C13677a.m1870H(ReactConstants.TAG, "(ADVICE)" + str);
    }

    /* renamed from: e */
    public static void m30237e(ReactContext reactContext, String str) {
        logInternal(reactContext, str, 6);
        C13677a.m1854j(ReactConstants.TAG, str);
    }

    /* renamed from: l */
    public static void m30235l(String str) {
        C13677a.m1848p(ReactConstants.TAG, str);
    }

    private static String levelToString(int i) {
        String str = "log";
        if (i != 2 && i != 3) {
            str = "warn";
            if (i != 4 && i != 5) {
                return i != 6 ? ViewProps.NONE : "error";
            }
        }
        return str;
    }

    private static void logInternal(ReactContext reactContext, String str, int i) {
        if (i >= 5 && reactContext != null && reactContext.hasActiveReactInstance() && str != null) {
            ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(levelToString(i), str);
        }
    }

    /* renamed from: t */
    public static void m30234t(String str) {
        C13677a.m1848p(ReactConstants.TAG, str);
    }

    /* renamed from: w */
    public static void m30233w(ReactContext reactContext, String str) {
        logInternal(reactContext, str, 5);
        C13677a.m1870H(ReactConstants.TAG, str);
    }

    /* renamed from: e */
    public static void m30236e(String str) {
        C13677a.m1854j(ReactConstants.TAG, str);
    }
}