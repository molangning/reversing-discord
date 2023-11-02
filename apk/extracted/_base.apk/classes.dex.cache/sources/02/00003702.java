package p151i6;

import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: i6.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7410u {

    /* renamed from: c */
    public static final C7410u f19926c;

    /* renamed from: d */
    public static final C7410u f19927d;

    /* renamed from: e */
    public static final C7410u f19928e;

    /* renamed from: f */
    public static final C7410u f19929f;

    /* renamed from: g */
    public static final C7410u f19930g;

    /* renamed from: a */
    public final long f19931a;

    /* renamed from: b */
    public final long f19932b;

    static {
        C7410u c7410u = new C7410u(0L, 0L);
        f19926c = c7410u;
        f19927d = new C7410u(Long.MAX_VALUE, Long.MAX_VALUE);
        f19928e = new C7410u(Long.MAX_VALUE, 0L);
        f19929f = new C7410u(0L, Long.MAX_VALUE);
        f19930g = c7410u;
    }

    public C7410u(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        C9149a.m16452a(j2 >= 0);
        this.f19931a = j;
        this.f19932b = j2;
    }

    /* renamed from: a */
    public long m20717a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.f19931a;
        if (j4 == 0 && this.f19932b == 0) {
            return j;
        }
        long m16280Q0 = C9191p0.m16280Q0(j, j4, Long.MIN_VALUE);
        long m16259b = C9191p0.m16259b(j, this.f19932b, Long.MAX_VALUE);
        boolean z2 = true;
        if (m16280Q0 <= j2 && j2 <= m16259b) {
            z = true;
        } else {
            z = false;
        }
        if (m16280Q0 > j3 || j3 > m16259b) {
            z2 = false;
        }
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        } else if (z) {
            return j2;
        } else {
            if (z2) {
                return j3;
            }
            return m16280Q0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7410u.class != obj.getClass()) {
            return false;
        }
        C7410u c7410u = (C7410u) obj;
        if (this.f19931a == c7410u.f19931a && this.f19932b == c7410u.f19932b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f19931a) * 31) + ((int) this.f19932b);
    }
}