package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4477b;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.util.ArrayList;
import p099f8.InterfaceC6337h;
import p151i6.C7410u;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7467t;
import p153i8.InterfaceC7472x;
import p229m7.C10344s0;
import p229m7.InterfaceC10298h;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10322n0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p260o7.C11062h;
import p364u7.C12878a;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4479c implements InterfaceC10329p, InterfaceC10322n0.InterfaceC10323a<C11062h<InterfaceC4477b>> {

    /* renamed from: j */
    private final InterfaceC4477b.InterfaceC4478a f11976j;

    /* renamed from: k */
    private final InterfaceC7472x f11977k;

    /* renamed from: l */
    private final InterfaceC7467t f11978l;

    /* renamed from: m */
    private final InterfaceC11049x f11979m;

    /* renamed from: n */
    private final InterfaceC11045v.C11046a f11980n;

    /* renamed from: o */
    private final InterfaceC4548g f11981o;

    /* renamed from: p */
    private final InterfaceC10353z.C10354a f11982p;

    /* renamed from: q */
    private final InterfaceC7440b f11983q;

    /* renamed from: r */
    private final TrackGroupArray f11984r;

    /* renamed from: s */
    private final InterfaceC10298h f11985s;

    /* renamed from: t */
    private InterfaceC10329p.InterfaceC10330a f11986t;

    /* renamed from: u */
    private C12878a f11987u;

    /* renamed from: v */
    private C11062h<InterfaceC4477b>[] f11988v;

    /* renamed from: w */
    private InterfaceC10322n0 f11989w;

    public C4479c(C12878a c12878a, InterfaceC4477b.InterfaceC4478a interfaceC4478a, InterfaceC7472x interfaceC7472x, InterfaceC10298h interfaceC10298h, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a, InterfaceC7467t interfaceC7467t, InterfaceC7440b interfaceC7440b) {
        this.f11987u = c12878a;
        this.f11976j = interfaceC4478a;
        this.f11977k = interfaceC7472x;
        this.f11978l = interfaceC7467t;
        this.f11979m = interfaceC11049x;
        this.f11980n = c11046a;
        this.f11981o = interfaceC4548g;
        this.f11982p = c10354a;
        this.f11983q = interfaceC7440b;
        this.f11985s = interfaceC10298h;
        this.f11984r = m28982i(c12878a, interfaceC11049x);
        C11062h<InterfaceC4477b>[] m28981p = m28981p(0);
        this.f11988v = m28981p;
        this.f11989w = interfaceC10298h.mo11874a(m28981p);
    }

    /* renamed from: e */
    private C11062h<InterfaceC4477b> m28983e(InterfaceC6337h interfaceC6337h, long j) {
        int m29143b = this.f11984r.m29143b(interfaceC6337h.mo22888i());
        return new C11062h<>(this.f11987u.f33525f[m29143b].f33531a, null, null, this.f11976j.mo28984a(this.f11978l, this.f11987u, m29143b, interfaceC6337h, this.f11977k), this, this.f11983q, j, this.f11979m, this.f11980n, this.f11981o, this.f11982p);
    }

    /* renamed from: i */
    private static TrackGroupArray m28982i(C12878a c12878a, InterfaceC11049x interfaceC11049x) {
        C10344s0[] c10344s0Arr = new C10344s0[c12878a.f33525f.length];
        int i = 0;
        while (true) {
            C12878a.C12880b[] c12880bArr = c12878a.f33525f;
            if (i < c12880bArr.length) {
                Format[] formatArr = c12880bArr[i].f33540j;
                Format[] formatArr2 = new Format[formatArr.length];
                for (int i2 = 0; i2 < formatArr.length; i2++) {
                    Format format = formatArr[i2];
                    formatArr2[i2] = format.m29925b(interfaceC11049x.mo9266b(format));
                }
                c10344s0Arr[i] = new C10344s0(formatArr2);
                i++;
            } else {
                return new TrackGroupArray(c10344s0Arr);
            }
        }
    }

    /* renamed from: p */
    private static C11062h<InterfaceC4477b>[] m28981p(int i) {
        return new C11062h[i];
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        return this.f11989w.mo6201b();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f11989w.mo6199c();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        return this.f11989w.mo6197d(j);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        return this.f11989w.mo6194f();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        C11062h<InterfaceC4477b>[] c11062hArr;
        for (C11062h<InterfaceC4477b> c11062h : this.f11988v) {
            if (c11062h.f28959j == 2) {
                return c11062h.m9216g(j, c7410u);
            }
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        this.f11989w.mo6191h(j);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        for (C11062h<InterfaceC4477b> c11062h : this.f11988v) {
            c11062h.m9218S(j);
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f11986t = interfaceC10330a;
        interfaceC10330a.mo11759j(this);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        return -9223372036854775807L;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        InterfaceC6337h interfaceC6337h;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC10320m0 interfaceC10320m0 = interfaceC10320m0Arr[i];
            if (interfaceC10320m0 != null) {
                C11062h c11062h = (C11062h) interfaceC10320m0;
                if (interfaceC6337hArr[i] != null && zArr[i]) {
                    ((InterfaceC4477b) c11062h.m9232E()).mo28986b(interfaceC6337hArr[i]);
                    arrayList.add(c11062h);
                } else {
                    c11062h.m9221P();
                    interfaceC10320m0Arr[i] = null;
                }
            }
            if (interfaceC10320m0Arr[i] == null && (interfaceC6337h = interfaceC6337hArr[i]) != null) {
                C11062h<InterfaceC4477b> m28983e = m28983e(interfaceC6337h, j);
                arrayList.add(m28983e);
                interfaceC10320m0Arr[i] = m28983e;
                zArr2[i] = true;
            }
        }
        C11062h<InterfaceC4477b>[] m28981p = m28981p(arrayList.size());
        this.f11988v = m28981p;
        arrayList.toArray(m28981p);
        this.f11989w = this.f11985s.mo11874a(this.f11988v);
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        this.f11978l.mo20615a();
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: s */
    public void mo6251k(C11062h<InterfaceC4477b> c11062h) {
        this.f11986t.mo6251k(this);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return this.f11984r;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        for (C11062h<InterfaceC4477b> c11062h : this.f11988v) {
            c11062h.m9215u(j, z);
        }
    }

    /* renamed from: v */
    public void m28979v() {
        for (C11062h<InterfaceC4477b> c11062h : this.f11988v) {
            c11062h.m9221P();
        }
        this.f11986t = null;
    }

    /* renamed from: w */
    public void m28978w(C12878a c12878a) {
        this.f11987u = c12878a;
        for (C11062h<InterfaceC4477b> c11062h : this.f11988v) {
            c11062h.m9232E().mo28985e(c12878a);
        }
        this.f11986t.mo6251k(this);
    }
}
