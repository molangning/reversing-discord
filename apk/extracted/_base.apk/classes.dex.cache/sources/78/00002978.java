package com.google.android.exoplayer2;

import p195k8.C9191p0;
import p229m7.InterfaceC10341s;

/* renamed from: com.google.android.exoplayer2.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4425l0 {

    /* renamed from: a */
    public final InterfaceC10341s.C10342a f11645a;

    /* renamed from: b */
    public final long f11646b;

    /* renamed from: c */
    public final long f11647c;

    /* renamed from: d */
    public final long f11648d;

    /* renamed from: e */
    public final long f11649e;

    /* renamed from: f */
    public final boolean f11650f;

    /* renamed from: g */
    public final boolean f11651g;

    /* renamed from: h */
    public final boolean f11652h;

    public C4425l0(InterfaceC10341s.C10342a c10342a, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f11645a = c10342a;
        this.f11646b = j;
        this.f11647c = j2;
        this.f11648d = j3;
        this.f11649e = j4;
        this.f11650f = z;
        this.f11651g = z2;
        this.f11652h = z3;
    }

    /* renamed from: a */
    public C4425l0 m29252a(long j) {
        if (j == this.f11647c) {
            return this;
        }
        return new C4425l0(this.f11645a, this.f11646b, j, this.f11648d, this.f11649e, this.f11650f, this.f11651g, this.f11652h);
    }

    /* renamed from: b */
    public C4425l0 m29251b(long j) {
        if (j == this.f11646b) {
            return this;
        }
        return new C4425l0(this.f11645a, j, this.f11647c, this.f11648d, this.f11649e, this.f11650f, this.f11651g, this.f11652h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4425l0.class != obj.getClass()) {
            return false;
        }
        C4425l0 c4425l0 = (C4425l0) obj;
        if (this.f11646b == c4425l0.f11646b && this.f11647c == c4425l0.f11647c && this.f11648d == c4425l0.f11648d && this.f11649e == c4425l0.f11649e && this.f11650f == c4425l0.f11650f && this.f11651g == c4425l0.f11651g && this.f11652h == c4425l0.f11652h && C9191p0.m16257c(this.f11645a, c4425l0.f11645a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f11645a.hashCode()) * 31) + ((int) this.f11646b)) * 31) + ((int) this.f11647c)) * 31) + ((int) this.f11648d)) * 31) + ((int) this.f11649e)) * 31) + (this.f11650f ? 1 : 0)) * 31) + (this.f11651g ? 1 : 0)) * 31) + (this.f11652h ? 1 : 0);
    }
}