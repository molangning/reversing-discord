package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
