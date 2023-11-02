package com.facebook.react.devsupport;

import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JSException extends Exception {
    private final String mStack;

    @InterfaceC6107a
    public JSException(String str, String str2, Throwable th2) {
        super(str, th2);
        this.mStack = str2;
    }

    public String getStack() {
        return this.mStack;
    }

    public JSException(String str, String str2) {
        super(str);
        this.mStack = str2;
    }
}
