package com.facebook.common.time;

import android.os.SystemClock;
import p056d3.InterfaceC5739b;
import p056d3.InterfaceC5740c;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AwakeTimeSinceBootClock implements InterfaceC5739b, InterfaceC5740c {
    @InterfaceC13370d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @InterfaceC13370d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p056d3.InterfaceC5739b
    @InterfaceC13370d
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @Override // p056d3.InterfaceC5740c
    @InterfaceC13370d
    public long nowNanos() {
        return System.nanoTime();
    }
}
