package com.facebook.react.bridge;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DefaultJSExceptionHandler implements JSExceptionHandler {
    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}