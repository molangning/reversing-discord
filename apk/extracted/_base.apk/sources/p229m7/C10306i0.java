package p229m7;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p229m7.C10299h0;
import p229m7.C10306i0;
import p229m7.InterfaceC10341s;
import p259o6.C11026k;
import p259o6.InterfaceC11049x;
import p259o6.InterfaceC11051y;
import p296q6.C11744g;
import p296q6.InterfaceC11753o;

/* renamed from: m7.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10306i0 extends AbstractC10277a implements C10299h0.InterfaceC10301b {

    /* renamed from: A */
    private InterfaceC7472x f26893A;

    /* renamed from: p */
    private final MediaItem f26894p;

    /* renamed from: q */
    private final MediaItem.C4369g f26895q;

    /* renamed from: r */
    private final DataSource.Factory f26896r;

    /* renamed from: s */
    private final InterfaceC11753o f26897s;

    /* renamed from: t */
    private final InterfaceC11049x f26898t;

    /* renamed from: u */
    private final InterfaceC4548g f26899u;

    /* renamed from: v */
    private final int f26900v;

    /* renamed from: w */
    private boolean f26901w = true;

    /* renamed from: x */
    private long f26902x = -9223372036854775807L;

    /* renamed from: y */
    private boolean f26903y;

    /* renamed from: z */
    private boolean f26904z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m7.i0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C10307a extends AbstractC10314l {
        C10307a(Timeline timeline) {
            super(timeline);
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C4379c mo11754o(int i, Timeline.C4379c c4379c, long j) {
            super.mo11754o(i, c4379c, j);
            c4379c.f11390l = true;
            return c4379c;
        }
    }

    /* renamed from: m7.i0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10308b implements InterfaceC10278a0 {

        /* renamed from: a */
        private final DataSource.Factory f26906a;

        /* renamed from: b */
        private InterfaceC11753o f26907b;

        /* renamed from: c */
        private boolean f26908c;

        /* renamed from: d */
        private InterfaceC11051y f26909d;

        /* renamed from: e */
        private InterfaceC4548g f26910e;

        /* renamed from: f */
        private int f26911f;

        /* renamed from: g */
        private String f26912g;

        /* renamed from: h */
        private Object f26913h;

        public C10308b(DataSource.Factory factory) {
            this(factory, new C11744g());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ InterfaceC11049x m11868d(InterfaceC11049x interfaceC11049x, MediaItem mediaItem) {
            return interfaceC11049x;
        }

        @Deprecated
        /* renamed from: b */
        public C10306i0 m11870b(Uri uri) {
            return m11869c(new MediaItem.C4365c().m29846i(uri).m29854a());
        }

        /* renamed from: c */
        public C10306i0 m11869c(MediaItem mediaItem) {
            boolean z;
            C9149a.m16448e(mediaItem.f11234b);
            MediaItem.C4369g c4369g = mediaItem.f11234b;
            boolean z2 = true;
            if (c4369g.f11294h == null && this.f26913h != null) {
                z = true;
            } else {
                z = false;
            }
            if (c4369g.f11292f != null || this.f26912g == null) {
                z2 = false;
            }
            if (z && z2) {
                mediaItem = mediaItem.m29856a().m29847h(this.f26913h).m29853b(this.f26912g).m29854a();
            } else if (z) {
                mediaItem = mediaItem.m29856a().m29847h(this.f26913h).m29854a();
            } else if (z2) {
                mediaItem = mediaItem.m29856a().m29853b(this.f26912g).m29854a();
            }
            MediaItem mediaItem2 = mediaItem;
            return new C10306i0(mediaItem2, this.f26906a, this.f26907b, this.f26909d.mo4725a(mediaItem2), this.f26910e, this.f26911f);
        }

        /* renamed from: e */
        public C10308b m11867e(final InterfaceC11049x interfaceC11049x) {
            if (interfaceC11049x == null) {
                m11866f(null);
            } else {
                m11866f(new InterfaceC11051y() { // from class: m7.j0
                    @Override // p259o6.InterfaceC11051y
                    /* renamed from: a */
                    public final InterfaceC11049x mo4725a(MediaItem mediaItem) {
                        InterfaceC11049x m11868d;
                        m11868d = C10306i0.C10308b.m11868d(InterfaceC11049x.this, mediaItem);
                        return m11868d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public C10308b m11866f(InterfaceC11051y interfaceC11051y) {
            if (interfaceC11051y != null) {
                this.f26909d = interfaceC11051y;
                this.f26908c = true;
            } else {
                this.f26909d = new C11026k();
                this.f26908c = false;
            }
            return this;
        }

        /* renamed from: g */
        public C10308b m11865g(InterfaceC4548g interfaceC4548g) {
            if (interfaceC4548g == null) {
                interfaceC4548g = new C4538d();
            }
            this.f26910e = interfaceC4548g;
            return this;
        }

        public C10308b(DataSource.Factory factory, InterfaceC11753o interfaceC11753o) {
            this.f26906a = factory;
            this.f26907b = interfaceC11753o;
            this.f26909d = new C11026k();
            this.f26910e = new C4538d();
            this.f26911f = 1048576;
        }
    }

    C10306i0(MediaItem mediaItem, DataSource.Factory factory, InterfaceC11753o interfaceC11753o, InterfaceC11049x interfaceC11049x, InterfaceC4548g interfaceC4548g, int i) {
        this.f26895q = (MediaItem.C4369g) C9149a.m16448e(mediaItem.f11234b);
        this.f26894p = mediaItem;
        this.f26896r = factory;
        this.f26897s = interfaceC11753o;
        this.f26898t = interfaceC11049x;
        this.f26899u = interfaceC4548g;
        this.f26900v = i;
    }

    /* renamed from: D */
    private void m11873D() {
        Timeline c10331p0 = new C10331p0(this.f26902x, this.f26903y, false, this.f26904z, null, this.f26894p);
        if (this.f26901w) {
            c10331p0 = new C10307a(c10331p0);
        }
        m11958B(c10331p0);
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: A */
    protected void mo11739A(InterfaceC7472x interfaceC7472x) {
        this.f26893A = interfaceC7472x;
        this.f26898t.mo9265c();
        m11873D();
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: C */
    protected void mo11738C() {
        this.f26898t.release();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        return this.f26894p;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: g */
    public InterfaceC10329p mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        DataSource createDataSource = this.f26896r.createDataSource();
        InterfaceC7472x interfaceC7472x = this.f26893A;
        if (interfaceC7472x != null) {
            createDataSource.mo6320f(interfaceC7472x);
        }
        return new C10299h0(this.f26895q.f11287a, createDataSource, this.f26897s, this.f26898t, m11956t(c10342a), this.f26899u, m11954v(c10342a), this, interfaceC7440b, this.f26895q.f11292f, this.f26900v);
    }

    @Override // p229m7.C10299h0.InterfaceC10301b
    /* renamed from: h */
    public void mo11872h(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f26902x;
        }
        if (!this.f26901w && this.f26902x == j && this.f26903y == z && this.f26904z == z2) {
            return;
        }
        this.f26902x = j;
        this.f26903y = z;
        this.f26904z = z2;
        this.f26901w = false;
        m11873D();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        ((C10299h0) interfaceC10329p).m11894c0();
    }
}
