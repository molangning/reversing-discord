package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.AbstractC8003k3;
import io.sentry.C7991j;
import io.sentry.C8045o4;

/* renamed from: io.sentry.android.core.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7792m0 {

    /* renamed from: e */
    private static C7792m0 f21315e = new C7792m0();

    /* renamed from: a */
    private Long f21316a;

    /* renamed from: b */
    private Long f21317b;

    /* renamed from: c */
    private Boolean f21318c = null;

    /* renamed from: d */
    private AbstractC8003k3 f21319d;

    private C7792m0() {
    }

    /* renamed from: e */
    public static C7792m0 m19723e() {
        return f21315e;
    }

    /* renamed from: a */
    public AbstractC8003k3 m19727a() {
        Long m19726b;
        AbstractC8003k3 m19724d = m19724d();
        if (m19724d != null && (m19726b = m19726b()) != null) {
            return new C8045o4(m19724d.mo18864f() + C7991j.m19083h(m19726b.longValue()));
        }
        return null;
    }

    /* renamed from: b */
    public synchronized Long m19726b() {
        Long l;
        if (this.f21316a != null && (l = this.f21317b) != null && this.f21318c != null) {
            long longValue = l.longValue() - this.f21316a.longValue();
            if (longValue >= 60000) {
                return null;
            }
            return Long.valueOf(longValue);
        }
        return null;
    }

    /* renamed from: c */
    public Long m19725c() {
        return this.f21316a;
    }

    /* renamed from: d */
    public AbstractC8003k3 m19724d() {
        return this.f21319d;
    }

    /* renamed from: f */
    public Boolean m19722f() {
        return this.f21318c;
    }

    /* renamed from: g */
    public synchronized void m19721g() {
        m19720h(SystemClock.uptimeMillis());
    }

    /* renamed from: h */
    void m19720h(long j) {
        this.f21317b = Long.valueOf(j);
    }

    /* renamed from: i */
    public synchronized void m19719i(long j, AbstractC8003k3 abstractC8003k3) {
        if (this.f21319d != null && this.f21316a != null) {
            return;
        }
        this.f21319d = abstractC8003k3;
        this.f21316a = Long.valueOf(j);
    }

    /* renamed from: j */
    public synchronized void m19718j(boolean z) {
        if (this.f21318c != null) {
            return;
        }
        this.f21318c = Boolean.valueOf(z);
    }
}