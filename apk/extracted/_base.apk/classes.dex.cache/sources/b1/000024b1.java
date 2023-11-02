package com.facebook.react.common;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SystemClock {
    public static long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static long nanoTime() {
        return System.nanoTime();
    }

    public static long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}