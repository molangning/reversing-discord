package p260o7;

import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import p195k8.C9191p0;
import p296q6.C11743f;
import p296q6.InterfaceC11732b0;

/* renamed from: o7.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11072o extends AbstractC11053a {

    /* renamed from: o */
    private final int f28995o;

    /* renamed from: p */
    private final Format f28996p;

    /* renamed from: q */
    private long f28997q;

    /* renamed from: r */
    private boolean f28998r;

    public C11072o(DataSource dataSource, C4515a c4515a, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(dataSource, c4515a, format, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f28995o = i2;
        this.f28996p = format2;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: a */
    public void mo6277a() {
        C11055c m9252j = m9252j();
        m9252j.m9248b(0L);
        InterfaceC11732b0 mo9238e = m9252j.mo9238e(0, this.f28995o);
        mo9238e.mo6168c(this.f28996p);
        try {
            long mo6322b = this.f28950i.mo6322b(this.f28943b.m28767e(this.f28997q));
            if (mo6322b != -1) {
                mo6322b += this.f28997q;
            }
            C11743f c11743f = new C11743f(this.f28950i, this.f28997q, mo6322b);
            for (int i = 0; i != -1; i = mo9238e.mo6167d(c11743f, ViewDefaults.NUMBER_OF_LINES, true)) {
                this.f28997q += i;
            }
            mo9238e.mo6162f(this.f28948g, 1, (int) this.f28997q, 0, null);
            C9191p0.m16235n(this.f28950i);
            this.f28998r = true;
        } catch (Throwable th2) {
            C9191p0.m16235n(this.f28950i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: c */
    public void mo6276c() {
    }

    @Override // p260o7.AbstractC11069m
    /* renamed from: h */
    public boolean mo6275h() {
        return this.f28998r;
    }
}