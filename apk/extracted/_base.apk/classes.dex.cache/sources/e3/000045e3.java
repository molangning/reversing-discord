package p260o7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import p153i8.C7470v;
import p195k8.C9191p0;
import p260o7.InterfaceC11059f;
import p296q6.C11743f;

/* renamed from: o7.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11066j extends AbstractC11053a {

    /* renamed from: o */
    private final int f28981o;

    /* renamed from: p */
    private final long f28982p;

    /* renamed from: q */
    private final InterfaceC11059f f28983q;

    /* renamed from: r */
    private long f28984r;

    /* renamed from: s */
    private volatile boolean f28985s;

    /* renamed from: t */
    private boolean f28986t;

    public C11066j(DataSource dataSource, C4515a c4515a, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, InterfaceC11059f interfaceC11059f) {
        super(dataSource, c4515a, format, i, obj, j, j2, j3, j4, j5);
        this.f28981o = i2;
        this.f28982p = j6;
        this.f28983q = interfaceC11059f;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: a */
    public final void mo6277a() {
        long j;
        long j2;
        if (this.f28984r == 0) {
            C11055c m9252j = m9252j();
            m9252j.m9248b(this.f28982p);
            InterfaceC11059f interfaceC11059f = this.f28983q;
            InterfaceC11059f.InterfaceC11060a m9199l = m9199l(m9252j);
            long j3 = this.f28916k;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.f28982p;
            }
            long j4 = this.f28917l;
            if (j4 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 = j4 - this.f28982p;
            }
            interfaceC11059f.mo9240c(m9199l, j, j2);
        }
        try {
            C4515a m28767e = this.f28943b.m28767e(this.f28984r);
            C7470v c7470v = this.f28950i;
            C11743f c11743f = new C11743f(c7470v, m28767e.f12263g, c7470v.mo6322b(m28767e));
            while (!this.f28985s && this.f28983q.mo9242a(c11743f)) {
            }
            this.f28984r = c11743f.getPosition() - this.f28943b.f12263g;
            C9191p0.m16235n(this.f28950i);
            this.f28986t = !this.f28985s;
        } catch (Throwable th2) {
            C9191p0.m16235n(this.f28950i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: c */
    public final void mo6276c() {
        this.f28985s = true;
    }

    @Override // p260o7.AbstractC11069m
    /* renamed from: g */
    public long mo9195g() {
        return this.f28993j + this.f28981o;
    }

    @Override // p260o7.AbstractC11069m
    /* renamed from: h */
    public boolean mo6275h() {
        return this.f28986t;
    }

    /* renamed from: l */
    protected InterfaceC11059f.InterfaceC11060a m9199l(C11055c c11055c) {
        return c11055c;
    }
}