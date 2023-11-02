package com.facebook.react.bridge;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface WritableArray extends ReadableArray {
    void pushArray(ReadableArray readableArray);

    void pushBoolean(boolean z);

    void pushDouble(double d);

    void pushInt(int i);

    void pushMap(ReadableMap readableMap);

    void pushNull();

    void pushString(String str);
}