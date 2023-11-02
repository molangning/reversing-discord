package com.facebook.react.bridge;

import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface JavaJSExecutor {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface Factory {
        JavaJSExecutor create();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th2) {
            super(th2);
        }
    }

    void close();

    @InterfaceC6107a
    String executeJSCall(String str, String str2);

    @InterfaceC6107a
    void loadBundle(String str);

    @InterfaceC6107a
    void setGlobalVariable(String str, String str2);
}