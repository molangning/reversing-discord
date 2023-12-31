package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

@DoNotStrip
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CppSystemErrorException extends CppException {
    int errorCode;

    @DoNotStrip
    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
