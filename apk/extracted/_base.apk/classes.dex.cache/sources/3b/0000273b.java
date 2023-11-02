package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface RCTEventEmitter extends JavaScriptModule {
    @Deprecated
    void receiveEvent(int i, String str, WritableMap writableMap);

    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}