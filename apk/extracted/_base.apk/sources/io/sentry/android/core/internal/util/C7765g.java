package io.sentry.android.core.internal.util;

import io.sentry.transport.InterfaceC8189o;

/* renamed from: io.sentry.android.core.internal.util.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7765g {

    /* renamed from: a */
    private final long f21261a;

    /* renamed from: b */
    private final InterfaceC8189o f21262b;

    /* renamed from: c */
    private Long f21263c = null;

    public C7765g(InterfaceC8189o interfaceC8189o, long j) {
        this.f21262b = interfaceC8189o;
        this.f21261a = j;
    }

    /* renamed from: a */
    public boolean m19764a() {
        long mo18303a = this.f21262b.mo18303a();
        Long l = this.f21263c;
        if (l != null && l.longValue() + this.f21261a > mo18303a) {
            return true;
        }
        this.f21263c = Long.valueOf(mo18303a);
        return false;
    }
}
