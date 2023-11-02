package com.facebook.react.common;

import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JavascriptException extends RuntimeException implements HasJavascriptExceptionMetadata {
    private String extraDataAsJson;

    public JavascriptException(String str) {
        super(str);
    }

    @Override // com.facebook.react.common.HasJavascriptExceptionMetadata
    public String getExtraDataAsJson() {
        return this.extraDataAsJson;
    }

    public JavascriptException setExtraDataAsJson(String str) {
        this.extraDataAsJson = str;
        return this;
    }
}