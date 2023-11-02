package com.facebook.react.bridge;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface Dynamic {
    ReadableArray asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    ReadableMap asMap();

    String asString();

    ReadableType getType();

    boolean isNull();

    void recycle();
}
