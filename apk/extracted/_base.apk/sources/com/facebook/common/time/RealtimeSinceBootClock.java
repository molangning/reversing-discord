package com.facebook.common.time;

import android.os.SystemClock;
import p056d3.InterfaceC5739b;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RealtimeSinceBootClock implements InterfaceC5739b {

    /* renamed from: a */
    private static final RealtimeSinceBootClock f9703a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @InterfaceC13370d
    public static RealtimeSinceBootClock get() {
        return f9703a;
    }

    @Override // p056d3.InterfaceC5739b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
