package com.facebook.react.fabric;

import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ReactNativeConfig {
    public static final ReactNativeConfig DEFAULT_CONFIG = new EmptyReactNativeConfig();

    @InterfaceC6107a
    boolean getBool(String str);

    @InterfaceC6107a
    double getDouble(String str);

    @InterfaceC6107a
    long getInt64(String str);

    @InterfaceC6107a
    String getString(String str);
}
