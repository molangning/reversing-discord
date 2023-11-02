package p164j$.time.temporal;

import java.io.Serializable;
import p164j$.time.C8295d;

/* renamed from: j$.time.temporal.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8349q implements Serializable {

    /* renamed from: a */
    private final long f22397a;

    /* renamed from: b */
    private final long f22398b;

    /* renamed from: c */
    private final long f22399c;

    /* renamed from: d */
    private final long f22400d;

    private C8349q(long j, long j2, long j3, long j4) {
        this.f22397a = j;
        this.f22398b = j2;
        this.f22399c = j3;
        this.f22400d = j4;
    }

    /* renamed from: c */
    private String m17793c(long j, InterfaceC8344l interfaceC8344l) {
        if (interfaceC8344l == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + interfaceC8344l + " (valid values " + this + "): " + j;
    }

    /* renamed from: i */
    public static C8349q m17787i(long j, long j2) {
        if (j <= j2) {
            return new C8349q(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C8349q m17786j(long j, long j2) {
        if (j <= j2) {
            if (1 <= j2) {
                return new C8349q(1L, 1L, j, j2);
            }
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
    }

    /* renamed from: a */
    public final int m17795a(long j, InterfaceC8344l interfaceC8344l) {
        if (m17789g() && m17788h(j)) {
            return (int) j;
        }
        throw new C8295d(m17793c(j, interfaceC8344l));
    }

    /* renamed from: b */
    public final void m17794b(long j, InterfaceC8344l interfaceC8344l) {
        if (!m17788h(j)) {
            throw new C8295d(m17793c(j, interfaceC8344l));
        }
    }

    /* renamed from: d */
    public final long m17792d() {
        return this.f22400d;
    }

    /* renamed from: e */
    public final long m17791e() {
        return this.f22397a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8349q) {
            C8349q c8349q = (C8349q) obj;
            return this.f22397a == c8349q.f22397a && this.f22398b == c8349q.f22398b && this.f22399c == c8349q.f22399c && this.f22400d == c8349q.f22400d;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m17790f() {
        return this.f22397a == this.f22398b && this.f22399c == this.f22400d;
    }

    /* renamed from: g */
    public final boolean m17789g() {
        return this.f22397a >= -2147483648L && this.f22400d <= 2147483647L;
    }

    /* renamed from: h */
    public final boolean m17788h(long j) {
        return j >= this.f22397a && j <= this.f22400d;
    }

    public final int hashCode() {
        long j = this.f22398b;
        long j2 = this.f22397a + (j << 16) + (j >> 48);
        long j3 = this.f22399c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.f22400d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j = this.f22397a;
        sb2.append(j);
        long j2 = this.f22398b;
        if (j != j2) {
            sb2.append('/');
            sb2.append(j2);
        }
        sb2.append(" - ");
        long j3 = this.f22399c;
        sb2.append(j3);
        long j4 = this.f22400d;
        if (j3 != j4) {
            sb2.append('/');
            sb2.append(j4);
        }
        return sb2.toString();
    }
}