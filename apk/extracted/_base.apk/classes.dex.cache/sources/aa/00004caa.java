package p337s7;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.C4559i;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import gb.C6712x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151i6.C7390b;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.InterfaceC10353z;
import p317r7.InterfaceC12084g;
import p337s7.C12410d;
import p337s7.C12413f;
import p337s7.C12416g;
import p337s7.C12424i;
import p337s7.InterfaceC12428k;

/* renamed from: s7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12410d implements InterfaceC12428k, C4550h.InterfaceC4552b<C4559i<AbstractC12423h>> {

    /* renamed from: y */
    public static final InterfaceC12428k.InterfaceC12429a f32221y = new InterfaceC12428k.InterfaceC12429a() { // from class: s7.b
        @Override // p337s7.InterfaceC12428k.InterfaceC12429a
        /* renamed from: a */
        public final InterfaceC12428k mo5286a(InterfaceC12084g interfaceC12084g, InterfaceC4548g interfaceC4548g, InterfaceC12427j interfaceC12427j) {
            return new C12410d(interfaceC12084g, interfaceC4548g, interfaceC12427j);
        }
    };

    /* renamed from: j */
    private final InterfaceC12084g f32222j;

    /* renamed from: k */
    private final InterfaceC12427j f32223k;

    /* renamed from: l */
    private final InterfaceC4548g f32224l;

    /* renamed from: m */
    private final HashMap<Uri, C12411a> f32225m;

    /* renamed from: n */
    private final List<InterfaceC12428k.InterfaceC12430b> f32226n;

    /* renamed from: o */
    private final double f32227o;

    /* renamed from: p */
    private InterfaceC10353z.C10354a f32228p;

    /* renamed from: q */
    private C4550h f32229q;

    /* renamed from: r */
    private Handler f32230r;

    /* renamed from: s */
    private InterfaceC12428k.InterfaceC12433e f32231s;

    /* renamed from: t */
    private C12413f f32232t;

    /* renamed from: u */
    private Uri f32233u;

    /* renamed from: v */
    private C12416g f32234v;

    /* renamed from: w */
    private boolean f32235w;

    /* renamed from: x */
    private long f32236x;

    /* renamed from: s7.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C12411a implements C4550h.InterfaceC4552b<C4559i<AbstractC12423h>> {

        /* renamed from: j */
        private final Uri f32237j;

        /* renamed from: k */
        private final C4550h f32238k = new C4550h("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: l */
        private final DataSource f32239l;

        /* renamed from: m */
        private C12416g f32240m;

        /* renamed from: n */
        private long f32241n;

        /* renamed from: o */
        private long f32242o;

        /* renamed from: p */
        private long f32243p;

        /* renamed from: q */
        private long f32244q;

        /* renamed from: r */
        private boolean f32245r;

        /* renamed from: s */
        private IOException f32246s;

        public C12411a(Uri uri) {
            C12410d.this = r2;
            this.f32237j = uri;
            this.f32239l = r2.f32222j.mo6279a(4);
        }

        /* renamed from: f */
        private boolean m5360f(long j) {
            this.f32244q = SystemClock.elapsedRealtime() + j;
            if (this.f32237j.equals(C12410d.this.f32233u) && !C12410d.this.m5384H()) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private Uri m5359g() {
            String str;
            C12416g c12416g = this.f32240m;
            if (c12416g != null) {
                C12416g.C12422f c12422f = c12416g.f32287t;
                if (c12422f.f32306a != -9223372036854775807L || c12422f.f32310e) {
                    Uri.Builder buildUpon = this.f32237j.buildUpon();
                    C12416g c12416g2 = this.f32240m;
                    if (c12416g2.f32287t.f32310e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c12416g2.f32276i + c12416g2.f32283p.size()));
                        C12416g c12416g3 = this.f32240m;
                        if (c12416g3.f32279l != -9223372036854775807L) {
                            List<C12416g.C12418b> list = c12416g3.f32284q;
                            int size = list.size();
                            if (!list.isEmpty() && ((C12416g.C12418b) C6712x.m22059c(list)).f32289v) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C12416g.C12422f c12422f2 = this.f32240m.f32287t;
                    if (c12422f2.f32306a != -9223372036854775807L) {
                        if (c12422f2.f32307b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        buildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    return buildUpon.build();
                }
            }
            return this.f32237j;
        }

        /* renamed from: l */
        public /* synthetic */ void m5354l(Uri uri) {
            this.f32245r = false;
            m5352n(uri);
        }

        /* renamed from: n */
        private void m5352n(Uri uri) {
            C4559i c4559i = new C4559i(this.f32239l, uri, 4, C12410d.this.f32223k.mo5298b(C12410d.this.f32232t, this.f32240m));
            C12410d.this.f32228p.m11680z(new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, this.f32238k.m28615n(c4559i, this, C12410d.this.f32224l.mo28629c(c4559i.f12407c))), c4559i.f12407c);
        }

        /* renamed from: p */
        public void m5350p(final Uri uri) {
            this.f32244q = 0L;
            if (!this.f32245r && !this.f32238k.m28619j() && !this.f32238k.m28620i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f32243p) {
                    this.f32245r = true;
                    C12410d.this.f32230r.postDelayed(new Runnable() { // from class: s7.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12410d.C12411a.this.m5354l(uri);
                        }
                    }, this.f32243p - elapsedRealtime);
                    return;
                }
                m5352n(uri);
            }
        }

        /* renamed from: u */
        public void m5345u(C12416g c12416g, LoadEventInfo loadEventInfo) {
            long j;
            C12416g c12416g2 = this.f32240m;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f32241n = elapsedRealtime;
            C12416g m5389C = C12410d.this.m5389C(c12416g2, c12416g);
            this.f32240m = m5389C;
            boolean z = true;
            if (m5389C != c12416g2) {
                this.f32246s = null;
                this.f32242o = elapsedRealtime;
                C12410d.this.m5378N(this.f32237j, m5389C);
            } else if (!m5389C.f32280m) {
                C12416g c12416g3 = this.f32240m;
                if (c12416g.f32276i + c12416g.f32283p.size() < c12416g3.f32276i) {
                    this.f32246s = new InterfaceC12428k.C12431c(this.f32237j);
                    C12410d.this.m5382J(this.f32237j, -9223372036854775807L);
                } else if (elapsedRealtime - this.f32242o > C7390b.m20791d(c12416g3.f32278k) * C12410d.this.f32227o) {
                    this.f32246s = new InterfaceC12428k.C12432d(this.f32237j);
                    long mo28630b = C12410d.this.f32224l.mo28630b(new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(4), this.f32246s, 1));
                    C12410d.this.m5382J(this.f32237j, mo28630b);
                    if (mo28630b != -9223372036854775807L) {
                        m5360f(mo28630b);
                    }
                }
            }
            C12416g c12416g4 = this.f32240m;
            if (!c12416g4.f32287t.f32310e) {
                if (c12416g4 != c12416g2) {
                    j = c12416g4.f32278k;
                } else {
                    j = c12416g4.f32278k / 2;
                }
            } else {
                j = 0;
            }
            this.f32243p = elapsedRealtime + C7390b.m20791d(j);
            if (this.f32240m.f32279l == -9223372036854775807L && !this.f32237j.equals(C12410d.this.f32233u)) {
                z = false;
            }
            if (z && !this.f32240m.f32280m) {
                m5350p(m5359g());
            }
        }

        /* renamed from: h */
        public C12416g m5358h() {
            return this.f32240m;
        }

        /* renamed from: i */
        public boolean m5357i() {
            int i;
            if (this.f32240m == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C7390b.m20791d(this.f32240m.f32286s));
            C12416g c12416g = this.f32240m;
            if (!c12416g.f32280m && (i = c12416g.f32271d) != 2 && i != 1 && this.f32241n + max <= elapsedRealtime) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        public void m5353m() {
            m5350p(this.f32237j);
        }

        /* renamed from: q */
        public void m5349q() {
            this.f32238k.mo20615a();
            IOException iOException = this.f32246s;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: r */
        public void mo5356j(C4559i<AbstractC12423h> c4559i, long j, long j2, boolean z) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
            C12410d.this.f32224l.mo28628d(c4559i.f12405a);
            C12410d.this.f32228p.m11689q(loadEventInfo, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: s */
        public void mo5355k(C4559i<AbstractC12423h> c4559i, long j, long j2) {
            AbstractC12423h m28603e = c4559i.m28603e();
            LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
            if (m28603e instanceof C12416g) {
                m5345u((C12416g) m28603e, loadEventInfo);
                C12410d.this.f32228p.m11686t(loadEventInfo, 4);
            } else {
                this.f32246s = new C7402m("Loaded playlist has unexpected type.");
                C12410d.this.f32228p.m11682x(loadEventInfo, 4, this.f32246s, true);
            }
            C12410d.this.f32224l.mo28628d(c4559i.f12405a);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: t */
        public C4550h.C4553c mo5351o(C4559i<AbstractC12423h> c4559i, long j, long j2, IOException iOException, int i) {
            boolean z;
            int i2;
            boolean z2;
            boolean z3;
            C4550h.C4553c c4553c;
            LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
            if (c4559i.m28602f().getQueryParameter("_HLS_msn") != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = iOException instanceof C12424i.C12425a;
            if (z || z4) {
                if (iOException instanceof InterfaceC4540f.C4546f) {
                    i2 = ((InterfaceC4540f.C4546f) iOException).f12375l;
                } else {
                    i2 = ViewDefaults.NUMBER_OF_LINES;
                }
                if (z4 || i2 == 400 || i2 == 503) {
                    this.f32243p = SystemClock.elapsedRealtime();
                    m5353m();
                    ((InterfaceC10353z.C10354a) C9191p0.m16243j(C12410d.this.f32228p)).m11682x(loadEventInfo, c4559i.f12407c, iOException, true);
                    return C4550h.f12387f;
                }
            }
            InterfaceC4548g.C4549a c4549a = new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(c4559i.f12407c), iOException, i);
            long mo28630b = C12410d.this.f32224l.mo28630b(c4549a);
            if (mo28630b != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C12410d.this.m5382J(this.f32237j, mo28630b) && z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2) {
                z3 |= m5360f(mo28630b);
            }
            if (z3) {
                long mo28631a = C12410d.this.f32224l.mo28631a(c4549a);
                if (mo28631a != -9223372036854775807L) {
                    c4553c = C4550h.m28621h(false, mo28631a);
                } else {
                    c4553c = C4550h.f12388g;
                }
            } else {
                c4553c = C4550h.f12387f;
            }
            boolean z5 = !c4553c.m28612c();
            C12410d.this.f32228p.m11682x(loadEventInfo, c4559i.f12407c, iOException, z5);
            if (z5) {
                C12410d.this.f32224l.mo28628d(c4559i.f12405a);
            }
            return c4553c;
        }

        /* renamed from: v */
        public void m5344v() {
            this.f32238k.m28617l();
        }
    }

    public C12410d(InterfaceC12084g interfaceC12084g, InterfaceC4548g interfaceC4548g, InterfaceC12427j interfaceC12427j) {
        this(interfaceC12084g, interfaceC4548g, interfaceC12427j, 3.5d);
    }

    /* renamed from: A */
    private void m5391A(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f32225m.put(uri, new C12411a(uri));
        }
    }

    /* renamed from: B */
    private static C12416g.C12420d m5390B(C12416g c12416g, C12416g c12416g2) {
        int i = (int) (c12416g2.f32276i - c12416g.f32276i);
        List<C12416g.C12420d> list = c12416g.f32283p;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: C */
    public C12416g m5389C(C12416g c12416g, C12416g c12416g2) {
        if (!c12416g2.m5332f(c12416g)) {
            if (c12416g2.f32280m) {
                return c12416g.m5334d();
            }
            return c12416g;
        }
        return c12416g2.m5335c(m5387E(c12416g, c12416g2), m5388D(c12416g, c12416g2));
    }

    /* renamed from: D */
    private int m5388D(C12416g c12416g, C12416g c12416g2) {
        int i;
        if (c12416g2.f32274g) {
            return c12416g2.f32275h;
        }
        C12416g c12416g3 = this.f32234v;
        if (c12416g3 != null) {
            i = c12416g3.f32275h;
        } else {
            i = 0;
        }
        if (c12416g == null) {
            return i;
        }
        C12416g.C12420d m5390B = m5390B(c12416g, c12416g2);
        if (m5390B != null) {
            return (c12416g.f32275h + m5390B.f32298m) - c12416g2.f32283p.get(0).f32298m;
        }
        return i;
    }

    /* renamed from: E */
    private long m5387E(C12416g c12416g, C12416g c12416g2) {
        long j;
        if (c12416g2.f32281n) {
            return c12416g2.f32273f;
        }
        C12416g c12416g3 = this.f32234v;
        if (c12416g3 != null) {
            j = c12416g3.f32273f;
        } else {
            j = 0;
        }
        if (c12416g == null) {
            return j;
        }
        int size = c12416g.f32283p.size();
        C12416g.C12420d m5390B = m5390B(c12416g, c12416g2);
        if (m5390B != null) {
            return c12416g.f32273f + m5390B.f32299n;
        }
        if (size == c12416g2.f32276i - c12416g.f32276i) {
            return c12416g.m5333e();
        }
        return j;
    }

    /* renamed from: F */
    private Uri m5386F(Uri uri) {
        C12416g.C12419c c12419c;
        C12416g c12416g = this.f32234v;
        if (c12416g != null && c12416g.f32287t.f32310e && (c12419c = c12416g.f32285r.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c12419c.f32291b));
            int i = c12419c.f32292c;
            if (i != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    /* renamed from: G */
    private boolean m5385G(Uri uri) {
        List<C12413f.C12415b> list = this.f32232t.f32252e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).f32265a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public boolean m5384H() {
        List<C12413f.C12415b> list = this.f32232t.f32252e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C12411a c12411a = (C12411a) C9149a.m16448e(this.f32225m.get(list.get(i).f32265a));
            if (elapsedRealtime > c12411a.f32244q) {
                Uri uri = c12411a.f32237j;
                this.f32233u = uri;
                c12411a.m5350p(m5386F(uri));
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    private void m5383I(Uri uri) {
        if (!uri.equals(this.f32233u) && m5385G(uri)) {
            C12416g c12416g = this.f32234v;
            if (c12416g == null || !c12416g.f32280m) {
                this.f32233u = uri;
                this.f32225m.get(uri).m5350p(m5386F(uri));
            }
        }
    }

    /* renamed from: J */
    public boolean m5382J(Uri uri, long j) {
        int size = this.f32226n.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !this.f32226n.get(i).mo5284i(uri, j);
        }
        return z;
    }

    /* renamed from: N */
    public void m5378N(Uri uri, C12416g c12416g) {
        if (uri.equals(this.f32233u)) {
            if (this.f32234v == null) {
                this.f32235w = !c12416g.f32280m;
                this.f32236x = c12416g.f32273f;
            }
            this.f32234v = c12416g;
            this.f32231s.mo5283f(c12416g);
        }
        int size = this.f32226n.size();
        for (int i = 0; i < size; i++) {
            this.f32226n.get(i).mo5285e();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: K */
    public void mo5356j(C4559i<AbstractC12423h> c4559i, long j, long j2, boolean z) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        this.f32224l.mo28628d(c4559i.f12405a);
        this.f32228p.m11689q(loadEventInfo, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: L */
    public void mo5355k(C4559i<AbstractC12423h> c4559i, long j, long j2) {
        C12413f c12413f;
        AbstractC12423h m28603e = c4559i.m28603e();
        boolean z = m28603e instanceof C12416g;
        if (z) {
            c12413f = C12413f.m5340e(m28603e.f32311a);
        } else {
            c12413f = (C12413f) m28603e;
        }
        this.f32232t = c12413f;
        this.f32233u = c12413f.f32252e.get(0).f32265a;
        m5391A(c12413f.f32251d);
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        C12411a c12411a = this.f32225m.get(this.f32233u);
        if (z) {
            c12411a.m5345u((C12416g) m28603e, loadEventInfo);
        } else {
            c12411a.m5353m();
        }
        this.f32224l.mo28628d(c4559i.f12405a);
        this.f32228p.m11686t(loadEventInfo, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: M */
    public C4550h.C4553c mo5351o(C4559i<AbstractC12423h> c4559i, long j, long j2, IOException iOException, int i) {
        boolean z;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        long mo28631a = this.f32224l.mo28631a(new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(c4559i.f12407c), iOException, i));
        if (mo28631a == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.f32228p.m11682x(loadEventInfo, c4559i.f12407c, iOException, z);
        if (z) {
            this.f32224l.mo28628d(c4559i.f12405a);
        }
        if (z) {
            return C4550h.f12388g;
        }
        return C4550h.m28621h(false, mo28631a);
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: a */
    public void mo5297a(Uri uri) {
        this.f32225m.get(uri).m5349q();
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: b */
    public long mo5296b() {
        return this.f32236x;
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: c */
    public C12413f mo5295c() {
        return this.f32232t;
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: d */
    public void mo5294d(Uri uri) {
        this.f32225m.get(uri).m5353m();
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: e */
    public void mo5293e(Uri uri, InterfaceC10353z.C10354a c10354a, InterfaceC12428k.InterfaceC12433e interfaceC12433e) {
        boolean z;
        this.f32230r = C9191p0.m16215x();
        this.f32228p = c10354a;
        this.f32231s = interfaceC12433e;
        C4559i c4559i = new C4559i(this.f32222j.mo6279a(4), uri, 4, this.f32223k.mo5299a());
        if (this.f32229q == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        C4550h c4550h = new C4550h("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f32229q = c4550h;
        c10354a.m11680z(new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4550h.m28615n(c4559i, this, this.f32224l.mo28629c(c4559i.f12407c))), c4559i.f12407c);
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: f */
    public boolean mo5292f(Uri uri) {
        return this.f32225m.get(uri).m5357i();
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: g */
    public boolean mo5291g() {
        return this.f32235w;
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: h */
    public void mo5290h() {
        C4550h c4550h = this.f32229q;
        if (c4550h != null) {
            c4550h.mo20615a();
        }
        Uri uri = this.f32233u;
        if (uri != null) {
            mo5297a(uri);
        }
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: i */
    public void mo5289i(InterfaceC12428k.InterfaceC12430b interfaceC12430b) {
        this.f32226n.remove(interfaceC12430b);
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: l */
    public C12416g mo5288l(Uri uri, boolean z) {
        C12416g m5358h = this.f32225m.get(uri).m5358h();
        if (m5358h != null && z) {
            m5383I(uri);
        }
        return m5358h;
    }

    @Override // p337s7.InterfaceC12428k
    /* renamed from: m */
    public void mo5287m(InterfaceC12428k.InterfaceC12430b interfaceC12430b) {
        C9149a.m16448e(interfaceC12430b);
        this.f32226n.add(interfaceC12430b);
    }

    @Override // p337s7.InterfaceC12428k
    public void stop() {
        this.f32233u = null;
        this.f32234v = null;
        this.f32232t = null;
        this.f32236x = -9223372036854775807L;
        this.f32229q.m28617l();
        this.f32229q = null;
        for (C12411a c12411a : this.f32225m.values()) {
            c12411a.m5344v();
        }
        this.f32230r.removeCallbacksAndMessages(null);
        this.f32230r = null;
        this.f32225m.clear();
    }

    public C12410d(InterfaceC12084g interfaceC12084g, InterfaceC4548g interfaceC4548g, InterfaceC12427j interfaceC12427j, double d) {
        this.f32222j = interfaceC12084g;
        this.f32223k = interfaceC12427j;
        this.f32224l = interfaceC4548g;
        this.f32227o = d;
        this.f32226n = new ArrayList();
        this.f32225m = new HashMap<>();
        this.f32236x = -9223372036854775807L;
    }
}