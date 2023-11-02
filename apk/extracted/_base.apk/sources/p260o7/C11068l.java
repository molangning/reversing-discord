package p260o7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import p153i8.C7470v;
import p195k8.C9191p0;
import p260o7.InterfaceC11059f;
import p296q6.C11743f;

/* renamed from: o7.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11068l extends AbstractC11058e {

    /* renamed from: j */
    private final InterfaceC11059f f28989j;

    /* renamed from: k */
    private InterfaceC11059f.InterfaceC11060a f28990k;

    /* renamed from: l */
    private long f28991l;

    /* renamed from: m */
    private volatile boolean f28992m;

    public C11068l(DataSource dataSource, C4515a c4515a, Format format, int i, Object obj, InterfaceC11059f interfaceC11059f) {
        super(dataSource, c4515a, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f28989j = interfaceC11059f;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: a */
    public void mo6277a() {
        if (this.f28991l == 0) {
            this.f28989j.mo9240c(this.f28990k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C4515a m28767e = this.f28943b.m28767e(this.f28991l);
            C7470v c7470v = this.f28950i;
            C11743f c11743f = new C11743f(c7470v, m28767e.f12263g, c7470v.mo6322b(m28767e));
            while (!this.f28992m && this.f28989j.mo9242a(c11743f)) {
            }
            this.f28991l = c11743f.getPosition() - this.f28943b.f12263g;
        } finally {
            C9191p0.m16235n(this.f28950i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: c */
    public void mo6276c() {
        this.f28992m = true;
    }

    /* renamed from: g */
    public void m9196g(InterfaceC11059f.InterfaceC11060a interfaceC11060a) {
        this.f28990k = interfaceC11060a;
    }
}
