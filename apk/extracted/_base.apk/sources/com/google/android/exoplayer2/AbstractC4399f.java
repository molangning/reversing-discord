package com.google.android.exoplayer2;

import p151i6.C7399j;
import p151i6.C7405p;
import p151i6.C7406q;
import p151i6.C7408s;
import p151i6.InterfaceC7407r;
import p195k8.C9149a;
import p195k8.InterfaceC9199t;
import p228m6.C10271g;
import p229m7.InterfaceC10320m0;

/* renamed from: com.google.android.exoplayer2.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4399f implements InterfaceC4483u0, InterfaceC7407r {

    /* renamed from: j */
    private final int f11504j;

    /* renamed from: l */
    private C7408s f11506l;

    /* renamed from: m */
    private int f11507m;

    /* renamed from: n */
    private int f11508n;

    /* renamed from: o */
    private InterfaceC10320m0 f11509o;

    /* renamed from: p */
    private Format[] f11510p;

    /* renamed from: q */
    private long f11511q;

    /* renamed from: r */
    private long f11512r;

    /* renamed from: t */
    private boolean f11514t;

    /* renamed from: u */
    private boolean f11515u;

    /* renamed from: k */
    private final C7399j f11505k = new C7399j();

    /* renamed from: s */
    private long f11513s = Long.MIN_VALUE;

    public AbstractC4399f(int i) {
        this.f11504j = i;
    }

    /* renamed from: A */
    protected final int m29430A() {
        return this.f11507m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final Format[] m29429B() {
        return (Format[]) C9149a.m16448e(this.f11510p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean m29428C() {
        return mo28968g() ? this.f11514t : ((InterfaceC10320m0) C9149a.m16448e(this.f11509o)).mo6232e();
    }

    /* renamed from: D */
    protected abstract void mo3123D();

    /* renamed from: E */
    protected void mo12403E(boolean z, boolean z2) {
    }

    /* renamed from: F */
    protected abstract void mo3122F(long j, boolean z);

    /* renamed from: G */
    protected void mo12400G() {
    }

    /* renamed from: H */
    protected void mo12398H() {
    }

    /* renamed from: I */
    protected void mo12396I() {
    }

    /* renamed from: J */
    protected abstract void mo3121J(Format[] formatArr, long j, long j2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final int m29427K(C7399j c7399j, C10271g c10271g, boolean z) {
        int mo6231i = ((InterfaceC10320m0) C9149a.m16448e(this.f11509o)).mo6231i(c7399j, c10271g, z);
        if (mo6231i == -4) {
            if (c10271g.m11988l()) {
                this.f11513s = Long.MIN_VALUE;
                if (this.f11514t) {
                    return -4;
                }
                return -3;
            }
            long j = c10271g.f26745n + this.f11511q;
            c10271g.f26745n = j;
            this.f11513s = Math.max(this.f11513s, j);
        } else if (mo6231i == -5) {
            Format format = (Format) C9149a.m16448e(c7399j.f19920b);
            if (format.f11201y != Long.MAX_VALUE) {
                c7399j.f19920b = format.m29926a().m29875i0(format.f11201y + this.f11511q).m29914E();
            }
        }
        return mo6231i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public int m29426L(long j) {
        return ((InterfaceC10320m0) C9149a.m16448e(this.f11509o)).mo6230s(j - this.f11511q);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0, p151i6.InterfaceC7407r
    /* renamed from: d */
    public final int mo20720d() {
        return this.f11504j;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    public final void disable() {
        boolean z = true;
        if (this.f11508n != 1) {
            z = false;
        }
        C9149a.m16447f(z);
        this.f11505k.m20757a();
        this.f11508n = 0;
        this.f11509o = null;
        this.f11510p = null;
        this.f11514t = false;
        mo3123D();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: g */
    public final boolean mo28968g() {
        return this.f11513s == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    public final int getState() {
        return this.f11508n;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: h */
    public final void mo28967h(C7408s c7408s, Format[] formatArr, InterfaceC10320m0 interfaceC10320m0, long j, boolean z, boolean z2, long j2, long j3) {
        boolean z3;
        if (this.f11508n == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9149a.m16447f(z3);
        this.f11506l = c7408s;
        this.f11508n = 1;
        this.f11512r = j;
        mo12403E(z, z2);
        mo28965k(formatArr, interfaceC10320m0, j2, j3);
        mo3122F(j, z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: i */
    public final void mo28966i() {
        this.f11514t = true;
    }

    @Override // com.google.android.exoplayer2.C4446s0.InterfaceC4448b
    /* renamed from: j */
    public void mo11675j(int i, Object obj) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: k */
    public final void mo28965k(Format[] formatArr, InterfaceC10320m0 interfaceC10320m0, long j, long j2) {
        C9149a.m16447f(!this.f11514t);
        this.f11509o = interfaceC10320m0;
        this.f11513s = j2;
        this.f11510p = formatArr;
        this.f11511q = j2;
        mo3121J(formatArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: l */
    public final void mo28964l() {
        ((InterfaceC10320m0) C9149a.m16448e(this.f11509o)).mo6236a();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: m */
    public final boolean mo28963m() {
        return this.f11514t;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: n */
    public final InterfaceC7407r mo28962n() {
        return this;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: p */
    public /* synthetic */ void mo12360p(float f, float f2) {
        C7405p.m20726a(this, f, f2);
    }

    /* renamed from: q */
    public int mo20719q() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    public final void reset() {
        boolean z;
        if (this.f11508n == 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f11505k.m20757a();
        mo12400G();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: s */
    public final InterfaceC10320m0 mo28961s() {
        return this.f11509o;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    public final void setIndex(int i) {
        this.f11507m = i;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    public final void start() {
        boolean z = true;
        if (this.f11508n != 1) {
            z = false;
        }
        C9149a.m16447f(z);
        this.f11508n = 2;
        mo12398H();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    public final void stop() {
        boolean z;
        if (this.f11508n == 2) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f11508n = 1;
        mo12396I();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: t */
    public final long mo28960t() {
        return this.f11513s;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: u */
    public final void mo28959u(long j) {
        this.f11514t = false;
        this.f11512r = j;
        this.f11513s = j;
        mo3122F(j, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: v */
    public InterfaceC9199t mo16660v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final ExoPlaybackException m29425w(Throwable th2, Format format) {
        return m29424x(th2, format, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final ExoPlaybackException m29424x(Throwable th2, Format format, boolean z) {
        int i;
        if (format != null && !this.f11515u) {
            this.f11515u = true;
            try {
                i = C7406q.m20722d(mo3110a(format));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f11515u = false;
            }
            return ExoPlaybackException.m29932c(th2, getName(), m29430A(), format, i, z);
        }
        i = 4;
        return ExoPlaybackException.m29932c(th2, getName(), m29430A(), format, i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final C7408s m29423y() {
        return (C7408s) C9149a.m16448e(this.f11506l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final C7399j m29422z() {
        this.f11505k.m20757a();
        return this.f11505k;
    }
}
