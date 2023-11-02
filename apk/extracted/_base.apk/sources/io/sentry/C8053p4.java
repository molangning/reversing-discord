package io.sentry;

import java.util.Date;

/* renamed from: io.sentry.p4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8053p4 extends AbstractC8003k3 {

    /* renamed from: j */
    private final Date f21798j;

    /* renamed from: k */
    private final long f21799k;

    public C8053p4() {
        this(C7991j.m19088c(), System.nanoTime());
    }

    /* renamed from: g */
    private long m18863g(C8053p4 c8053p4, C8053p4 c8053p42) {
        return c8053p4.mo18864f() + (c8053p42.f21799k - c8053p4.f21799k);
    }

    @Override // io.sentry.AbstractC8003k3, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC8003k3 abstractC8003k3) {
        if (abstractC8003k3 instanceof C8053p4) {
            C8053p4 c8053p4 = (C8053p4) abstractC8003k3;
            long time = this.f21798j.getTime();
            long time2 = c8053p4.f21798j.getTime();
            if (time == time2) {
                return Long.valueOf(this.f21799k).compareTo(Long.valueOf(c8053p4.f21799k));
            }
            return Long.valueOf(time).compareTo(Long.valueOf(time2));
        }
        return super.compareTo(abstractC8003k3);
    }

    @Override // io.sentry.AbstractC8003k3
    /* renamed from: b */
    public long mo18866b(AbstractC8003k3 abstractC8003k3) {
        if (abstractC8003k3 instanceof C8053p4) {
            return this.f21799k - ((C8053p4) abstractC8003k3).f21799k;
        }
        return super.mo18866b(abstractC8003k3);
    }

    @Override // io.sentry.AbstractC8003k3
    /* renamed from: e */
    public long mo18865e(AbstractC8003k3 abstractC8003k3) {
        if (abstractC8003k3 != null && (abstractC8003k3 instanceof C8053p4)) {
            C8053p4 c8053p4 = (C8053p4) abstractC8003k3;
            if (compareTo(abstractC8003k3) < 0) {
                return m18863g(this, c8053p4);
            }
            return m18863g(c8053p4, this);
        }
        return super.mo18865e(abstractC8003k3);
    }

    @Override // io.sentry.AbstractC8003k3
    /* renamed from: f */
    public long mo18864f() {
        return C7991j.m19090a(this.f21798j);
    }

    public C8053p4(Date date, long j) {
        this.f21798j = date;
        this.f21799k = j;
    }
}
