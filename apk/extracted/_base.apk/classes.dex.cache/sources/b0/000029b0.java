package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.smoothstreaming.C4474a;
import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4477b;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.C4559i;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p151i6.C7390b;
import p151i6.C7397h;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7467t;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p212l7.C10058b;
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
import p364u7.C12878a;
import p364u7.C12881b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SsMediaSource extends AbstractC10277a implements C4550h.InterfaceC4552b<C4559i<C12878a>> {

    /* renamed from: A */
    private final C4559i.InterfaceC4560a<? extends C12878a> f11935A;

    /* renamed from: B */
    private final ArrayList<C4479c> f11936B;

    /* renamed from: C */
    private DataSource f11937C;

    /* renamed from: D */
    private C4550h f11938D;

    /* renamed from: E */
    private InterfaceC7467t f11939E;

    /* renamed from: F */
    private InterfaceC7472x f11940F;

    /* renamed from: G */
    private long f11941G;

    /* renamed from: H */
    private C12878a f11942H;

    /* renamed from: I */
    private Handler f11943I;

    /* renamed from: p */
    private final boolean f11944p;

    /* renamed from: q */
    private final Uri f11945q;

    /* renamed from: r */
    private final MediaItem.C4369g f11946r;

    /* renamed from: s */
    private final MediaItem f11947s;

    /* renamed from: t */
    private final DataSource.Factory f11948t;

    /* renamed from: u */
    private final InterfaceC4477b.InterfaceC4478a f11949u;

    /* renamed from: v */
    private final InterfaceC10298h f11950v;

    /* renamed from: w */
    private final InterfaceC11049x f11951w;

    /* renamed from: x */
    private final InterfaceC4548g f11952x;

    /* renamed from: y */
    private final long f11953y;

    /* renamed from: z */
    private final InterfaceC10353z.C10354a f11954z;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Factory implements InterfaceC10278a0 {

        /* renamed from: a */
        private final InterfaceC4477b.InterfaceC4478a f11955a;

        /* renamed from: b */
        private final DataSource.Factory f11956b;

        /* renamed from: c */
        private InterfaceC10298h f11957c;

        /* renamed from: d */
        private boolean f11958d;

        /* renamed from: e */
        private InterfaceC11051y f11959e;

        /* renamed from: f */
        private InterfaceC4548g f11960f;

        /* renamed from: g */
        private long f11961g;

        /* renamed from: h */
        private C4559i.InterfaceC4560a<? extends C12878a> f11962h;

        /* renamed from: i */
        private List<C10059c> f11963i;

        /* renamed from: j */
        private Object f11964j;

        public Factory(DataSource.Factory factory) {
            this(new C4474a.C4475a(factory), factory);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC11049x m28992d(InterfaceC11049x interfaceC11049x, MediaItem mediaItem) {
            return interfaceC11049x;
        }

        @Deprecated
        /* renamed from: b */
        public SsMediaSource m28994b(Uri uri) {
            return m28993c(new MediaItem.C4365c().m29846i(uri).m29854a());
        }

        /* renamed from: c */
        public SsMediaSource m28993c(MediaItem mediaItem) {
            List<C10059c> list;
            C10058b c10058b;
            boolean z;
            MediaItem mediaItem2 = mediaItem;
            C9149a.m16448e(mediaItem2.f11234b);
            C4559i.InterfaceC4560a interfaceC4560a = this.f11962h;
            if (interfaceC4560a == null) {
                interfaceC4560a = new C12881b();
            }
            if (!mediaItem2.f11234b.f11291e.isEmpty()) {
                list = mediaItem2.f11234b.f11291e;
            } else {
                list = this.f11963i;
            }
            if (!list.isEmpty()) {
                c10058b = new C10058b(interfaceC4560a, list);
            } else {
                c10058b = interfaceC4560a;
            }
            MediaItem.C4369g c4369g = mediaItem2.f11234b;
            boolean z2 = true;
            if (c4369g.f11294h == null && this.f11964j != null) {
                z = true;
            } else {
                z = false;
            }
            if (!c4369g.f11291e.isEmpty() || list.isEmpty()) {
                z2 = false;
            }
            if (z && z2) {
                mediaItem2 = mediaItem.m29856a().m29847h(this.f11964j).m29849f(list).m29854a();
            } else if (z) {
                mediaItem2 = mediaItem.m29856a().m29847h(this.f11964j).m29854a();
            } else if (z2) {
                mediaItem2 = mediaItem.m29856a().m29849f(list).m29854a();
            }
            MediaItem mediaItem3 = mediaItem2;
            return new SsMediaSource(mediaItem3, null, this.f11956b, c10058b, this.f11955a, this.f11957c, this.f11959e.mo4725a(mediaItem3), this.f11960f, this.f11961g);
        }

        /* renamed from: e */
        public Factory m28991e(final InterfaceC11049x interfaceC11049x) {
            if (interfaceC11049x == null) {
                m28990f(null);
            } else {
                m28990f(new InterfaceC11051y() { // from class: t7.b
                    @Override // p259o6.InterfaceC11051y
                    /* renamed from: a */
                    public final InterfaceC11049x mo4725a(MediaItem mediaItem) {
                        InterfaceC11049x m28992d;
                        m28992d = SsMediaSource.Factory.m28992d(InterfaceC11049x.this, mediaItem);
                        return m28992d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public Factory m28990f(InterfaceC11051y interfaceC11051y) {
            if (interfaceC11051y != null) {
                this.f11959e = interfaceC11051y;
                this.f11958d = true;
            } else {
                this.f11959e = new C11026k();
                this.f11958d = false;
            }
            return this;
        }

        /* renamed from: g */
        public Factory m28989g(InterfaceC4548g interfaceC4548g) {
            if (interfaceC4548g == null) {
                interfaceC4548g = new C4538d();
            }
            this.f11960f = interfaceC4548g;
            return this;
        }

        public Factory(InterfaceC4477b.InterfaceC4478a interfaceC4478a, DataSource.Factory factory) {
            this.f11955a = (InterfaceC4477b.InterfaceC4478a) C9149a.m16448e(interfaceC4478a);
            this.f11956b = factory;
            this.f11959e = new C11026k();
            this.f11960f = new C4538d();
            this.f11961g = 30000L;
            this.f11957c = new C10305i();
            this.f11963i = Collections.emptyList();
        }
    }

    static {
        C7397h.m20760a("goog.exo.smoothstreaming");
    }

    /* renamed from: H */
    private void m28998H() {
        C12878a.C12880b[] c12880bArr;
        long j;
        C10331p0 c10331p0;
        long j2;
        for (int i = 0; i < this.f11936B.size(); i++) {
            this.f11936B.get(i).m28978w(this.f11942H);
        }
        long j3 = Long.MIN_VALUE;
        long j4 = Long.MAX_VALUE;
        for (C12878a.C12880b c12880b : this.f11942H.f33525f) {
            if (c12880b.f33541k > 0) {
                j4 = Math.min(j4, c12880b.m3725e(0));
                j3 = Math.max(j3, c12880b.m3725e(c12880b.f33541k - 1) + c12880b.m3727c(c12880b.f33541k - 1));
            }
        }
        if (j4 == Long.MAX_VALUE) {
            if (this.f11942H.f33523d) {
                j2 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            C12878a c12878a = this.f11942H;
            boolean z = c12878a.f33523d;
            c10331p0 = new C10331p0(j2, 0L, 0L, 0L, true, z, z, c12878a, this.f11947s);
        } else {
            C12878a c12878a2 = this.f11942H;
            if (c12878a2.f33523d) {
                long j5 = c12878a2.f33527h;
                if (j5 != -9223372036854775807L && j5 > 0) {
                    j4 = Math.max(j4, j3 - j5);
                }
                long j6 = j4;
                long j7 = j3 - j6;
                long m20792c = j7 - C7390b.m20792c(this.f11953y);
                if (m20792c < 5000000) {
                    m20792c = Math.min(5000000L, j7 / 2);
                }
                c10331p0 = new C10331p0(-9223372036854775807L, j7, j6, m20792c, true, true, true, this.f11942H, this.f11947s);
            } else {
                long j8 = c12878a2.f33526g;
                if (j8 != -9223372036854775807L) {
                    j = j8;
                } else {
                    j = j3 - j4;
                }
                c10331p0 = new C10331p0(j4 + j, j, j4, 0L, true, false, false, this.f11942H, this.f11947s);
            }
        }
        m11958B(c10331p0);
    }

    /* renamed from: I */
    private void m28997I() {
        if (!this.f11942H.f33523d) {
            return;
        }
        this.f11943I.postDelayed(new Runnable() { // from class: t7.a
            @Override // java.lang.Runnable
            public final void run() {
                SsMediaSource.this.m28996J();
            }
        }, Math.max(0L, (this.f11941G + 5000) - SystemClock.elapsedRealtime()));
    }

    /* renamed from: J */
    public void m28996J() {
        if (this.f11938D.m28620i()) {
            return;
        }
        C4559i c4559i = new C4559i(this.f11937C, this.f11945q, 4, this.f11935A);
        this.f11954z.m11680z(new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, this.f11938D.m28615n(c4559i, this, this.f11952x.mo28629c(c4559i.f12407c))), c4559i.f12407c);
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: A */
    protected void mo11739A(InterfaceC7472x interfaceC7472x) {
        this.f11940F = interfaceC7472x;
        this.f11951w.mo9265c();
        if (this.f11944p) {
            this.f11939E = new InterfaceC7467t.C7468a();
            m28998H();
            return;
        }
        this.f11937C = this.f11948t.createDataSource();
        C4550h c4550h = new C4550h("Loader:Manifest");
        this.f11938D = c4550h;
        this.f11939E = c4550h;
        this.f11943I = C9191p0.m16215x();
        m28996J();
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: C */
    protected void mo11738C() {
        C12878a c12878a;
        if (this.f11944p) {
            c12878a = this.f11942H;
        } else {
            c12878a = null;
        }
        this.f11942H = c12878a;
        this.f11937C = null;
        this.f11941G = 0L;
        C4550h c4550h = this.f11938D;
        if (c4550h != null) {
            c4550h.m28617l();
            this.f11938D = null;
        }
        Handler handler = this.f11943I;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11943I = null;
        }
        this.f11951w.release();
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: E */
    public void mo5356j(C4559i<C12878a> c4559i, long j, long j2, boolean z) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        this.f11952x.mo28628d(c4559i.f12405a);
        this.f11954z.m11689q(loadEventInfo, c4559i.f12407c);
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: F */
    public void mo5355k(C4559i<C12878a> c4559i, long j, long j2) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        this.f11952x.mo28628d(c4559i.f12405a);
        this.f11954z.m11686t(loadEventInfo, c4559i.f12407c);
        this.f11942H = c4559i.m28603e();
        this.f11941G = j - j2;
        m28998H();
        m28997I();
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: G */
    public C4550h.C4553c mo5351o(C4559i<C12878a> c4559i, long j, long j2, IOException iOException, int i) {
        C4550h.C4553c m28621h;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        long mo28631a = this.f11952x.mo28631a(new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(c4559i.f12407c), iOException, i));
        if (mo28631a == -9223372036854775807L) {
            m28621h = C4550h.f12388g;
        } else {
            m28621h = C4550h.m28621h(false, mo28631a);
        }
        boolean z = !m28621h.m28612c();
        this.f11954z.m11682x(loadEventInfo, c4559i.f12407c, iOException, z);
        if (z) {
            this.f11952x.mo28628d(c4559i.f12405a);
        }
        return m28621h;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        return this.f11947s;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: g */
    public InterfaceC10329p mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        InterfaceC10353z.C10354a m11954v = m11954v(c10342a);
        C4479c c4479c = new C4479c(this.f11942H, this.f11949u, this.f11940F, this.f11950v, this.f11951w, m11956t(c10342a), this.f11952x, m11954v, this.f11939E, interfaceC7440b);
        this.f11936B.add(c4479c);
        return c4479c;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
        this.f11939E.mo20615a();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        ((C4479c) interfaceC10329p).m28979v();
        this.f11936B.remove(interfaceC10329p);
    }

    private SsMediaSource(MediaItem mediaItem, C12878a c12878a, DataSource.Factory factory, C4559i.InterfaceC4560a<? extends C12878a> interfaceC4560a, InterfaceC4477b.InterfaceC4478a interfaceC4478a, InterfaceC10298h interfaceC10298h, InterfaceC11049x interfaceC11049x, InterfaceC4548g interfaceC4548g, long j) {
        C9149a.m16447f(c12878a == null || !c12878a.f33523d);
        this.f11947s = mediaItem;
        MediaItem.C4369g c4369g = (MediaItem.C4369g) C9149a.m16448e(mediaItem.f11234b);
        this.f11946r = c4369g;
        this.f11942H = c12878a;
        this.f11945q = c4369g.f11287a.equals(Uri.EMPTY) ? null : C9191p0.m16309C(c4369g.f11287a);
        this.f11948t = factory;
        this.f11935A = interfaceC4560a;
        this.f11949u = interfaceC4478a;
        this.f11950v = interfaceC10298h;
        this.f11951w = interfaceC11049x;
        this.f11952x = interfaceC4548g;
        this.f11953y = j;
        this.f11954z = m11954v(null);
        this.f11944p = c12878a != null;
        this.f11936B = new ArrayList<>();
    }
}