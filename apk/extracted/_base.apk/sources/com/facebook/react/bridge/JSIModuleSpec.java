package com.facebook.react.bridge;

import com.facebook.react.bridge.JSIModule;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface JSIModuleSpec<T extends JSIModule> {
    JSIModuleProvider<T> getJSIModuleProvider();

    JSIModuleType getJSIModuleType();
}
