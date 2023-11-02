package p297q7;

import android.net.Uri;
import p195k8.C9187n0;

/* renamed from: q7.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11778h {

    /* renamed from: a */
    public final long f30725a;

    /* renamed from: b */
    public final long f30726b;

    /* renamed from: c */
    private final String f30727c;

    /* renamed from: d */
    private int f30728d;

    public C11778h(String str, long j, long j2) {
        this.f30727c = str == null ? "" : str;
        this.f30725a = j;
        this.f30726b = j2;
    }

    /* renamed from: a */
    public C11778h m6881a(C11778h c11778h, String str) {
        String m6879c = m6879c(str);
        if (c11778h != null && m6879c.equals(c11778h.m6879c(str))) {
            long j = this.f30726b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f30725a;
                if (j3 + j == c11778h.f30725a) {
                    long j4 = c11778h.f30726b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new C11778h(m6879c, j3, j2);
                }
            }
            long j5 = c11778h.f30726b;
            if (j5 != -1) {
                long j6 = c11778h.f30725a;
                if (j6 + j5 == this.f30725a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new C11778h(m6879c, j6, j2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m6880b(String str) {
        return C9187n0.m16314d(str, this.f30727c);
    }

    /* renamed from: c */
    public String m6879c(String str) {
        return C9187n0.m16315c(str, this.f30727c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11778h.class != obj.getClass()) {
            return false;
        }
        C11778h c11778h = (C11778h) obj;
        if (this.f30725a == c11778h.f30725a && this.f30726b == c11778h.f30726b && this.f30727c.equals(c11778h.f30727c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f30728d == 0) {
            this.f30728d = ((((527 + ((int) this.f30725a)) * 31) + ((int) this.f30726b)) * 31) + this.f30727c.hashCode();
        }
        return this.f30728d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f30727c + ", start=" + this.f30725a + ", length=" + this.f30726b + ")";
    }
}
