package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.util.Collections;
import java.util.List;
import p151i6.C7390b;
import p151i6.C7397h;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p212l7.C10059c;
import p229m7.AbstractC10277a;
import p229m7.C10305i;
import p229m7.C10331p0;
import p229m7.InterfaceC10278a0;
import p229m7.InterfaceC10298h;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;
import p259o6.C11026k;
import p259o6.InterfaceC11049x;
import p259o6.InterfaceC11051y;
import p317r7.C12074c;
import p317r7.C12088k;
import p317r7.InterfaceC12084g;
import p317r7.InterfaceC12085h;
import p337s7.C12407a;
import p337s7.C12410d;
import p337s7.C12412e;
import p337s7.C12413f;
import p337s7.C12416g;
import p337s7.InterfaceC12427j;
import p337s7.InterfaceC12428k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class HlsMediaSource extends AbstractC10277a implements InterfaceC12428k.InterfaceC12433e {

    /* renamed from: A */
    private final MediaItem f11905A;

    /* renamed from: B */
    private MediaItem.C4368f f11906B;

    /* renamed from: C */
    private InterfaceC7472x f11907C;

    /* renamed from: p */
    private final InterfaceC12085h f11908p;

    /* renamed from: q */
    private final MediaItem.C4369g f11909q;

    /* renamed from: r */
    private final InterfaceC12084g f11910r;

    /* renamed from: s */
    private final InterfaceC10298h f11911s;

    /* renamed from: t */
    private final InterfaceC11049x f11912t;

    /* renamed from: u */
    private final InterfaceC4548g f11913u;

    /* renamed from: v */
    private final boolean f11914v;

    /* renamed from: w */
    private final int f11915w;

    /* renamed from: x */
    private final boolean f11916x;

    /* renamed from: y */
    private final InterfaceC12428k f11917y;

    /* renamed from: z */
    private final long f11918z;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Factory implements InterfaceC10278a0 {

        /* renamed from: a */
        private final InterfaceC12084g f11919a;

        /* renamed from: b */
        private InterfaceC12085h f11920b;

        /* renamed from: c */
        private InterfaceC12427j f11921c;

        /* renamed from: d */
        private InterfaceC12428k.InterfaceC12429a f11922d;

        /* renamed from: e */
        private InterfaceC10298h f11923e;

        /* renamed from: f */
        private boolean f11924f;

        /* renamed from: g */
        private InterfaceC11051y f11925g;

        /* renamed from: h */
        private InterfaceC4548g f11926h;

        /* renamed from: i */
        private boolean f11927i;

        /* renamed from: j */
        private int f11928j;

        /* renamed from: k */
        private boolean f11929k;

        /* renamed from: l */
        private List<C10059c> f11930l;

        /* renamed from: m */
        private Object f11931m;

        /* renamed from: n */
        private long f11932n;

        public Factory(DataSource.Factory factory) {
            this(new C12074c(factory));
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC11049x m29006d(InterfaceC11049x interfaceC11049x, MediaItem mediaItem) {
            return interfaceC11049x;
        }

        @Deprecated
        /* renamed from: b */
        public HlsMediaSource m29008b(Uri uri) {
            return m29007c(new MediaItem.C4365c().m29846i(uri).m29850e("application/x-mpegURL").m29854a());
        }

        /* renamed from: c */
        public HlsMediaSource m29007c(MediaItem mediaItem) {
            List<C10059c> list;
            boolean z;
            MediaItem mediaItem2 = mediaItem;
            C9149a.m16448e(mediaItem2.f11234b);
            InterfaceC12427j interfaceC12427j = this.f11921c;
            if (mediaItem2.f11234b.f11291e.isEmpty()) {
                list = this.f11930l;
            } else {
                list = mediaItem2.f11234b.f11291e;
            }
            if (!list.isEmpty()) {
                interfaceC12427j = new C12412e(interfaceC12427j, list);
            }
            MediaItem.C4369g c4369g = mediaItem2.f11234b;
            boolean z2 = true;
            if (c4369g.f11294h == null && this.f11931m != null) {
                z = true;
            } else {
                z = false;
            }
            if (!c4369g.f11291e.isEmpty() || list.isEmpty()) {
                z2 = false;
            }
            if (z && z2) {
                mediaItem2 = mediaItem.m29856a().m29847h(this.f11931m).m29849f(list).m29854a();
            } else if (z) {
                mediaItem2 = mediaItem.m29856a().m29847h(this.f11931m).m29854a();
            } else if (z2) {
                mediaItem2 = mediaItem.m29856a().m29849f(list).m29854a();
            }
            MediaItem mediaItem3 = mediaItem2;
            InterfaceC12084g interfaceC12084g = this.f11919a;
            InterfaceC12085h interfaceC12085h = this.f11920b;
            InterfaceC10298h interfaceC10298h = this.f11923e;
            InterfaceC11049x mo4725a = this.f11925g.mo4725a(mediaItem3);
            InterfaceC4548g interfaceC4548g = this.f11926h;
            return new HlsMediaSource(mediaItem3, interfaceC12084g, interfaceC12085h, interfaceC10298h, mo4725a, interfaceC4548g, this.f11922d.mo5286a(this.f11919a, interfaceC4548g, interfaceC12427j), this.f11932n, this.f11927i, this.f11928j, this.f11929k);
        }

        /* renamed from: e */
        public Factory m29005e(final InterfaceC11049x interfaceC11049x) {
            if (interfaceC11049x == null) {
                m29004f(null);
            } else {
                m29004f(new InterfaceC11051y() { // from class: r7.l
                    @Override // p259o6.InterfaceC11051y
                    /* renamed from: a */
                    public final InterfaceC11049x mo4725a(MediaItem mediaItem) {
                        InterfaceC11049x m29006d;
                        m29006d = HlsMediaSource.Factory.m29006d(InterfaceC11049x.this, mediaItem);
                        return m29006d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public Factory m29004f(InterfaceC11051y interfaceC11051y) {
            if (interfaceC11051y != null) {
                this.f11925g = interfaceC11051y;
                this.f11924f = true;
            } else {
                this.f11925g = new C11026k();
                this.f11924f = false;
            }
            return this;
        }

        /* renamed from: g */
        public Factory m29003g(InterfaceC4548g interfaceC4548g) {
            if (interfaceC4548g == null) {
                interfaceC4548g = new C4538d();
            }
            this.f11926h = interfaceC4548g;
            return this;
        }

        public Factory(InterfaceC12084g interfaceC12084g) {
            this.f11919a = (InterfaceC12084g) C9149a.m16448e(interfaceC12084g);
            this.f11925g = new C11026k();
            this.f11921c = new C12407a();
            this.f11922d = C12410d.f32221y;
            this.f11920b = InterfaceC12085h.f31285a;
            this.f11926h = new C4538d();
            this.f11923e = new C10305i();
            this.f11928j = 1;
            this.f11930l = Collections.emptyList();
            this.f11932n = -9223372036854775807L;
        }
    }

    static {
        C7397h.m20760a("goog.exo.hls");
    }

    /* renamed from: D */
    private long m29013D(C12416g c12416g) {
        if (c12416g.f32281n) {
            return C7390b.m20792c(C9191p0.m16263Z(this.f11918z)) - c12416g.m5333e();
        }
        return 0L;
    }

    /* renamed from: E */
    private static long m29012E(C12416g c12416g, long j) {
        long j2;
        C12416g.C12422f c12422f = c12416g.f32287t;
        long j3 = c12416g.f32272e;
        if (j3 != -9223372036854775807L) {
            j2 = c12416g.f32286s - j3;
        } else {
            long j4 = c12422f.f32309d;
            if (j4 != -9223372036854775807L && c12416g.f32279l != -9223372036854775807L) {
                j2 = j4;
            } else {
                long j5 = c12422f.f32308c;
                if (j5 != -9223372036854775807L) {
                    j2 = j5;
                } else {
                    j2 = c12416g.f32278k * 3;
                }
            }
        }
        return j2 + j;
    }

    /* renamed from: F */
    private long m29011F(C12416g c12416g, long j) {
        List<C12416g.C12420d> list = c12416g.f32283p;
        int size = list.size() - 1;
        long m20792c = (c12416g.f32286s + j) - C7390b.m20792c(this.f11906B.f11282a);
        while (size > 0 && list.get(size).f32299n > m20792c) {
            size--;
        }
        return list.get(size).f32299n;
    }

    /* renamed from: G */
    private void m29010G(long j) {
        long m20791d = C7390b.m20791d(j);
        if (m20791d != this.f11906B.f11282a) {
            this.f11906B = this.f11905A.m29856a().m29852c(m20791d).m29854a().f11235c;
        }
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: A */
    protected void mo11739A(InterfaceC7472x interfaceC7472x) {
        this.f11907C = interfaceC7472x;
        this.f11912t.mo9265c();
        this.f11917y.mo5293e(this.f11909q.f11287a, m11954v(null), this);
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: C */
    protected void mo11738C() {
        this.f11917y.stop();
        this.f11912t.release();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        return this.f11905A;
    }

    @Override // p337s7.InterfaceC12428k.InterfaceC12433e
    /* renamed from: f */
    public void mo5283f(C12416g c12416g) {
        long j;
        long j2;
        long j3;
        C10331p0 c10331p0;
        long m29012E;
        long j4;
        long j5;
        if (c12416g.f32281n) {
            j = C7390b.m20791d(c12416g.f32273f);
        } else {
            j = -9223372036854775807L;
        }
        int i = c12416g.f32271d;
        if (i != 2 && i != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        long j6 = c12416g.f32272e;
        C4472a c4472a = new C4472a((C12413f) C9149a.m16448e(this.f11917y.mo5295c()), c12416g);
        if (this.f11917y.mo5291g()) {
            long m29013D = m29013D(c12416g);
            long j7 = this.f11906B.f11282a;
            if (j7 != -9223372036854775807L) {
                m29012E = C7390b.m20792c(j7);
            } else {
                m29012E = m29012E(c12416g, m29013D);
            }
            m29010G(C9191p0.m16225s(m29012E, m29013D, c12416g.f32286s + m29013D));
            long mo5296b = c12416g.f32273f - this.f11917y.mo5296b();
            if (c12416g.f32280m) {
                j4 = mo5296b + c12416g.f32286s;
            } else {
                j4 = -9223372036854775807L;
            }
            if (!c12416g.f32283p.isEmpty()) {
                j5 = m29011F(c12416g, m29013D);
            } else if (j6 == -9223372036854775807L) {
                j5 = 0;
            } else {
                j5 = j6;
            }
            c10331p0 = new C10331p0(j2, j, -9223372036854775807L, j4, c12416g.f32286s, mo5296b, j5, true, !c12416g.f32280m, c4472a, this.f11905A, this.f11906B);
        } else {
            if (j6 == -9223372036854775807L) {
                j3 = 0;
            } else {
                j3 = j6;
            }
            long j8 = c12416g.f32286s;
            c10331p0 = new C10331p0(j2, j, -9223372036854775807L, j8, j8, 0L, j3, true, false, c4472a, this.f11905A, null);
        }
        m11958B(c10331p0);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: g */
    public InterfaceC10329p mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        InterfaceC10353z.C10354a m11954v = m11954v(c10342a);
        return new C12088k(this.f11908p, this.f11917y, this.f11910r, this.f11907C, this.f11912t, m11956t(c10342a), this.f11913u, m11954v, interfaceC7440b, this.f11911s, this.f11914v, this.f11915w, this.f11916x);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
        this.f11917y.mo5290h();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        ((C12088k) interfaceC10329p).m6253B();
    }

    private HlsMediaSource(MediaItem mediaItem, InterfaceC12084g interfaceC12084g, InterfaceC12085h interfaceC12085h, InterfaceC10298h interfaceC10298h, InterfaceC11049x interfaceC11049x, InterfaceC4548g interfaceC4548g, InterfaceC12428k interfaceC12428k, long j, boolean z, int i, boolean z2) {
        this.f11909q = (MediaItem.C4369g) C9149a.m16448e(mediaItem.f11234b);
        this.f11905A = mediaItem;
        this.f11906B = mediaItem.f11235c;
        this.f11910r = interfaceC12084g;
        this.f11908p = interfaceC12085h;
        this.f11911s = interfaceC10298h;
        this.f11912t = interfaceC11049x;
        this.f11913u = interfaceC4548g;
        this.f11917y = interfaceC12428k;
        this.f11918z = j;
        this.f11914v = z;
        this.f11915w = i;
        this.f11916x = z2;
    }
}