package com.facebook.react.bridge;

import java.lang.reflect.Method;
import p077e5.InterfaceC6107a;
import p414x2.C13677a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @InterfaceC6107a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e) {
                C13677a.m1853k("ReactCxxErrorHandler", "Failed to invoke error handler function", e);
            }
        }
    }

    @InterfaceC6107a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
