package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p010a9.C0093b;
import p029b9.AbstractC2150c;
import p029b9.C2162e;
import p029b9.C2187m;
import p029b9.C2201q;
import p029b9.C2204r;
import p119g9.C6579b;
import p134ha.InterfaceC7046d;
import p441y8.C13930a;
import p461z8.C14118b;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4654y<T> implements InterfaceC7046d<T> {

    /* renamed from: a */
    private final C4614c f12779a;

    /* renamed from: b */
    private final int f12780b;

    /* renamed from: c */
    private final C0093b<?> f12781c;

    /* renamed from: d */
    private final long f12782d;

    /* renamed from: e */
    private final long f12783e;

    C4654y(C4614c c4614c, int i, C0093b<?> c0093b, long j, long j2, String str, String str2) {
        this.f12779a = c4614c;
        this.f12780b = i;
        this.f12781c = c0093b;
        this.f12782d = j;
        this.f12783e = j2;
    }

    /* renamed from: b */
    public static <T> C4654y<T> m28060b(C4614c c4614c, int i, C0093b<?> c0093b) {
        boolean z;
        long j;
        long j2;
        if (!c4614c.m28204g()) {
            return null;
        }
        C2204r m33977a = C2201q.m33976b().m33977a();
        if (m33977a != null) {
            if (!m33977a.m33971A()) {
                return null;
            }
            z = m33977a.m33970G();
            C4649t m28187x = c4614c.m28187x(c0093b);
            if (m28187x != null) {
                if (!(m28187x.m28075v() instanceof AbstractC2150c)) {
                    return null;
                }
                AbstractC2150c abstractC2150c = (AbstractC2150c) m28187x.m28075v();
                if (abstractC2150c.m34109I() && !abstractC2150c.m34090c()) {
                    C2162e m28059c = m28059c(m28187x, abstractC2150c, i);
                    if (m28059c == null) {
                        return null;
                    }
                    m28187x.m28106G();
                    z = m28059c.m34055H();
                }
            }
        } else {
            z = true;
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new C4654y<>(c4614c, i, c0093b, j, j2, null, null);
    }

    /* renamed from: c */
    private static C2162e m28059c(C4649t<?> c4649t, AbstractC2150c<?> abstractC2150c, int i) {
        int[] m34052z;
        int[] m34057A;
        C2162e m34110G = abstractC2150c.m34110G();
        if (m34110G == null || !m34110G.m34056G() || ((m34052z = m34110G.m34052z()) != null ? !C6579b.m22385a(m34052z, i) : !((m34057A = m34110G.m34057A()) == null || !C6579b.m22385a(m34057A, i))) || c4649t.m28078s() >= m34110G.m34053r()) {
            return null;
        }
        return m34110G;
    }

    @Override // p134ha.InterfaceC7046d
    /* renamed from: a */
    public final void mo1614a(Task<T> task) {
        C4649t m28187x;
        boolean z;
        int i;
        int i2;
        int i3;
        int m1144r;
        int i4;
        long j;
        long j2;
        int i5;
        if (!this.f12779a.m28204g()) {
            return;
        }
        C2204r m33977a = C2201q.m33976b().m33977a();
        if ((m33977a == null || m33977a.m33971A()) && (m28187x = this.f12779a.m28187x(this.f12781c)) != null && (m28187x.m28075v() instanceof AbstractC2150c)) {
            AbstractC2150c abstractC2150c = (AbstractC2150c) m28187x.m28075v();
            boolean z2 = true;
            int i6 = 0;
            if (this.f12782d > 0) {
                z = true;
            } else {
                z = false;
            }
            int m34074y = abstractC2150c.m34074y();
            if (m33977a != null) {
                z &= m33977a.m33970G();
                int m33968r = m33977a.m33968r();
                int m33967z = m33977a.m33967z();
                i = m33977a.m33969H();
                if (abstractC2150c.m34109I() && !abstractC2150c.m34090c()) {
                    C2162e m28059c = m28059c(m28187x, abstractC2150c, this.f12780b);
                    if (m28059c == null) {
                        return;
                    }
                    if (!m28059c.m34055H() || this.f12782d <= 0) {
                        z2 = false;
                    }
                    m33967z = m28059c.m34053r();
                    z = z2;
                }
                i3 = m33968r;
                i2 = m33967z;
            } else {
                i = 0;
                i2 = 100;
                i3 = 5000;
            }
            C4614c c4614c = this.f12779a;
            if (task.mo27969o()) {
                i4 = 0;
            } else {
                if (task.mo27971m()) {
                    i6 = 100;
                } else {
                    Exception mo27974j = task.mo27974j();
                    if (mo27974j instanceof C14118b) {
                        Status m634a = ((C14118b) mo27974j).m634a();
                        int m28236z = m634a.m28236z();
                        C13930a m28237r = m634a.m28237r();
                        if (m28237r == null) {
                            m1144r = -1;
                        } else {
                            m1144r = m28237r.m1144r();
                        }
                        i4 = m1144r;
                        i6 = m28236z;
                    } else {
                        i6 = 101;
                    }
                }
                i4 = -1;
            }
            if (z) {
                long j3 = this.f12782d;
                long currentTimeMillis = System.currentTimeMillis();
                i5 = (int) (SystemClock.elapsedRealtime() - this.f12783e);
                j = j3;
                j2 = currentTimeMillis;
            } else {
                j = 0;
                j2 = 0;
                i5 = -1;
            }
            c4614c.m28212I(new C2187m(this.f12780b, i6, i4, j, j2, null, null, m34074y, i5), i, i3, i2);
        }
    }
}