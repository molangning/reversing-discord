package p229m7;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import p099f8.InterfaceC6337h;
import p151i6.C7410u;
import p153i8.InterfaceC7440b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;

/* renamed from: m7.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10321n implements InterfaceC10329p, InterfaceC10329p.InterfaceC10330a {

    /* renamed from: j */
    public final InterfaceC10341s.C10342a f26979j;

    /* renamed from: k */
    private final long f26980k;

    /* renamed from: l */
    private final InterfaceC7440b f26981l;

    /* renamed from: m */
    private InterfaceC10341s f26982m;

    /* renamed from: n */
    private InterfaceC10329p f26983n;

    /* renamed from: o */
    private InterfaceC10329p.InterfaceC10330a f26984o;

    /* renamed from: p */
    private long f26985p = -9223372036854775807L;

    public C10321n(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        this.f26979j = c10342a;
        this.f26981l = interfaceC7440b;
        this.f26980k = j;
    }

    /* renamed from: s */
    private long m11785s(long j) {
        long j2 = this.f26985p;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6201b();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        InterfaceC10329p interfaceC10329p = this.f26983n;
        return interfaceC10329p != null && interfaceC10329p.mo6199c();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        InterfaceC10329p interfaceC10329p = this.f26983n;
        return interfaceC10329p != null && interfaceC10329p.mo6197d(j);
    }

    /* renamed from: e */
    public void m11788e(InterfaceC10341s.C10342a c10342a) {
        long m11785s = m11785s(this.f26980k);
        InterfaceC10329p mo11731g = ((InterfaceC10341s) C9149a.m16448e(this.f26982m)).mo11731g(c10342a, this.f26981l, m11785s);
        this.f26983n = mo11731g;
        if (this.f26984o != null) {
            mo11731g.mo6249m(this, m11785s);
        }
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6194f();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6252g(j, c7410u);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6191h(j);
    }

    /* renamed from: i */
    public long m11787i() {
        return this.f26985p;
    }

    @Override // p229m7.InterfaceC10329p.InterfaceC10330a
    /* renamed from: j */
    public void mo11759j(InterfaceC10329p interfaceC10329p) {
        ((InterfaceC10329p.InterfaceC10330a) C9191p0.m16243j(this.f26984o)).mo11759j(this);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6250l(j);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f26984o = interfaceC10330a;
        InterfaceC10329p interfaceC10329p = this.f26983n;
        if (interfaceC10329p != null) {
            interfaceC10329p.mo6249m(this, m11785s(this.f26980k));
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6248n();
    }

    /* renamed from: p */
    public long m11786p() {
        return this.f26980k;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f26985p;
        if (j3 != -9223372036854775807L && j == this.f26980k) {
            this.f26985p = -9223372036854775807L;
            j2 = j3;
        } else {
            j2 = j;
        }
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6246q(interfaceC6337hArr, zArr, interfaceC10320m0Arr, zArr2, j2);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        try {
            InterfaceC10329p interfaceC10329p = this.f26983n;
            if (interfaceC10329p != null) {
                interfaceC10329p.mo6245r();
                return;
            }
            InterfaceC10341s interfaceC10341s = this.f26982m;
            if (interfaceC10341s != null) {
                interfaceC10341s.mo11728m();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6243t();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        ((InterfaceC10329p) C9191p0.m16243j(this.f26983n)).mo6242u(j, z);
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: v */
    public void mo6251k(InterfaceC10329p interfaceC10329p) {
        ((InterfaceC10329p.InterfaceC10330a) C9191p0.m16243j(this.f26984o)).mo6251k(this);
    }

    /* renamed from: w */
    public void m11783w(long j) {
        this.f26985p = j;
    }

    /* renamed from: x */
    public void m11782x() {
        if (this.f26983n != null) {
            ((InterfaceC10341s) C9149a.m16448e(this.f26982m)).mo11725q(this.f26983n);
        }
    }

    /* renamed from: y */
    public void m11781y(InterfaceC10341s interfaceC10341s) {
        boolean z;
        if (this.f26982m == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f26982m = interfaceC10341s;
    }
}
