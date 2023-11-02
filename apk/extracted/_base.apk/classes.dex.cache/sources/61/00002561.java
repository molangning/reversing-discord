package com.facebook.react.devsupport.interfaces;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum ErrorType {
    JS("JS"),
    NATIVE("Native");
    
    private final String name;

    ErrorType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}