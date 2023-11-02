package com.facebook.react.common;

import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SingleThreadAsserter {
    private Thread mThread = null;

    public void assertNow() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (this.mThread == null) {
            this.mThread = currentThread;
        }
        if (this.mThread == currentThread) {
            z = true;
        } else {
            z = false;
        }
        C5743a.m24585a(z);
    }
}