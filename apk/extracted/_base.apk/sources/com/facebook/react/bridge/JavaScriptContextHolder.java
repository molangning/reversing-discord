package com.facebook.react.bridge;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JavaScriptContextHolder {
    private long mContext;

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }

    public long get() {
        return this.mContext;
    }
}
