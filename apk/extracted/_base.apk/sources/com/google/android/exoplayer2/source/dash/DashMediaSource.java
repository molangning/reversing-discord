package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.dash.C4462c;
import com.google.android.exoplayer2.source.dash.C4467e;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.InterfaceC4458a;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.C4559i;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p102fb.C6374d;
import p151i6.C7390b;
import p151i6.C7397h;
import p151i6.C7402m;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7467t;
import p153i8.InterfaceC7472x;
import p156ib.C7491b;
import p164j$.util.DesugarTimeZone;
import p195k8.C9149a;
import p195k8.C9166g0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p212l7.C10058b;
import p212l7.C10059c;
import p229m7.AbstractC10277a;
import p229m7.C10305i;
import p229m7.InterfaceC10278a0;
import p229m7.InterfaceC10298h;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;
import p259o6.C11026k;
import p259o6.InterfaceC11049x;
import p259o6.InterfaceC11051y;
import p281p7.InterfaceC11449e;
import p297q7.AbstractC11779i;
import p297q7.C11770a;
import p297q7.C11771b;
import p297q7.C11772c;
import p297q7.C11776f;
import p297q7.C11792n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DashMediaSource extends AbstractC10277a {

    /* renamed from: A */
    private final Object f11767A;

    /* renamed from: B */
    private final SparseArray<C4460b> f11768B;

    /* renamed from: C */
    private final Runnable f11769C;

    /* renamed from: D */
    private final Runnable f11770D;

    /* renamed from: E */
    private final C4467e.InterfaceC4469b f11771E;

    /* renamed from: F */
    private final InterfaceC7467t f11772F;

    /* renamed from: G */
    private DataSource f11773G;

    /* renamed from: H */
    private C4550h f11774H;

    /* renamed from: I */
    private InterfaceC7472x f11775I;

    /* renamed from: J */
    private IOException f11776J;

    /* renamed from: K */
    private Handler f11777K;

    /* renamed from: L */
    private MediaItem.C4368f f11778L;

    /* renamed from: M */
    private Uri f11779M;

    /* renamed from: N */
    private Uri f11780N;

    /* renamed from: O */
    private C11771b f11781O;

    /* renamed from: P */
    private boolean f11782P;

    /* renamed from: Q */
    private long f11783Q;

    /* renamed from: R */
    private long f11784R;

    /* renamed from: S */
    private long f11785S;

    /* renamed from: T */
    private int f11786T;

    /* renamed from: U */
    private long f11787U;

    /* renamed from: V */
    private int f11788V;

    /* renamed from: p */
    private final MediaItem f11789p;

    /* renamed from: q */
    private final boolean f11790q;

    /* renamed from: r */
    private final DataSource.Factory f11791r;

    /* renamed from: s */
    private final InterfaceC4458a.InterfaceC4459a f11792s;

    /* renamed from: t */
    private final InterfaceC10298h f11793t;

    /* renamed from: u */
    private final InterfaceC11049x f11794u;

    /* renamed from: v */
    private final InterfaceC4548g f11795v;

    /* renamed from: w */
    private final long f11796w;

    /* renamed from: x */
    private final InterfaceC10353z.C10354a f11797x;

    /* renamed from: y */
    private final C4559i.InterfaceC4560a<? extends C11771b> f11798y;

    /* renamed from: z */
    private final C4454e f11799z;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Factory implements InterfaceC10278a0 {

        /* renamed from: a */
        private final InterfaceC4458a.InterfaceC4459a f11800a;

        /* renamed from: b */
        private final DataSource.Factory f11801b;

        /* renamed from: c */
        private boolean f11802c;

        /* renamed from: d */
        private InterfaceC11051y f11803d;

        /* renamed from: e */
        private InterfaceC10298h f11804e;

        /* renamed from: f */
        private InterfaceC4548g f11805f;

        /* renamed from: g */
        private long f11806g;

        /* renamed from: h */
        private long f11807h;

        /* renamed from: i */
        private C4559i.InterfaceC4560a<? extends C11771b> f11808i;

        /* renamed from: j */
        private List<C10059c> f11809j;

        /* renamed from: k */
        private Object f11810k;

        public Factory(DataSource.Factory factory) {
            this(new C4462c.C4463a(factory), factory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ InterfaceC11049x m29105d(InterfaceC11049x interfaceC11049x, MediaItem mediaItem) {
            return interfaceC11049x;
        }

        @Deprecated
        /* renamed from: b */
        public DashMediaSource m29107b(Uri uri) {
            return m29106c(new MediaItem.C4365c().m29846i(uri).m29850e("application/dash+xml").m29847h(this.f11810k).m29854a());
        }

        /* renamed from: c */
        public DashMediaSource m29106c(MediaItem mediaItem) {
            List<C10059c> list;
            C10058b c10058b;
            boolean z;
            boolean z2;
            MediaItem mediaItem2 = mediaItem;
            C9149a.m16448e(mediaItem2.f11234b);
            C4559i.InterfaceC4560a interfaceC4560a = this.f11808i;
            if (interfaceC4560a == null) {
                interfaceC4560a = new C11772c();
            }
            if (mediaItem2.f11234b.f11291e.isEmpty()) {
                list = this.f11809j;
            } else {
                list = mediaItem2.f11234b.f11291e;
            }
            if (!list.isEmpty()) {
                c10058b = new C10058b(interfaceC4560a, list);
            } else {
                c10058b = interfaceC4560a;
            }
            MediaItem.C4369g c4369g = mediaItem2.f11234b;
            boolean z3 = true;
            if (c4369g.f11294h == null && this.f11810k != null) {
                z = true;
            } else {
                z = false;
            }
            if (c4369g.f11291e.isEmpty() && !list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (mediaItem2.f11235c.f11282a != -9223372036854775807L || this.f11806g == -9223372036854775807L) {
                z3 = false;
            }
            if (z || z2 || z3) {
                MediaItem.C4365c m29856a = mediaItem.m29856a();
                if (z) {
                    m29856a.m29847h(this.f11810k);
                }
                if (z2) {
                    m29856a.m29849f(list);
                }
                if (z3) {
                    m29856a.m29852c(this.f11806g);
                }
                mediaItem2 = m29856a.m29854a();
            }
            MediaItem mediaItem3 = mediaItem2;
            return new DashMediaSource(mediaItem3, null, this.f11801b, c10058b, this.f11800a, this.f11804e, this.f11803d.mo4725a(mediaItem3), this.f11805f, this.f11807h, null);
        }

        /* renamed from: e */
        public Factory m29104e(final InterfaceC11049x interfaceC11049x) {
            if (interfaceC11049x == null) {
                m29103f(null);
            } else {
                m29103f(new InterfaceC11051y() { // from class: p7.d
                    @Override // p259o6.InterfaceC11051y
                    /* renamed from: a */
                    public final InterfaceC11049x mo4725a(MediaItem mediaItem) {
                        InterfaceC11049x m29105d;
                        m29105d = DashMediaSource.Factory.m29105d(InterfaceC11049x.this, mediaItem);
                        return m29105d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public Factory m29103f(InterfaceC11051y interfaceC11051y) {
            if (interfaceC11051y != null) {
                this.f11803d = interfaceC11051y;
                this.f11802c = true;
            } else {
                this.f11803d = new C11026k();
                this.f11802c = false;
            }
            return this;
        }

        /* renamed from: g */
        public Factory m29102g(InterfaceC4548g interfaceC4548g) {
            if (interfaceC4548g == null) {
                interfaceC4548g = new C4538d();
            }
            this.f11805f = interfaceC4548g;
            return this;
        }

        public Factory(InterfaceC4458a.InterfaceC4459a interfaceC4459a, DataSource.Factory factory) {
            this.f11800a = (InterfaceC4458a.InterfaceC4459a) C9149a.m16448e(interfaceC4459a);
            this.f11801b = factory;
            this.f11803d = new C11026k();
            this.f11805f = new C4538d();
            this.f11806g = -9223372036854775807L;
            this.f11807h = 30000L;
            this.f11804e = new C10305i();
            this.f11809j = Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4450a implements C9166g0.InterfaceC9168b {
        C4450a() {
        }

        @Override // p195k8.C9166g0.InterfaceC9168b
        /* renamed from: a */
        public void mo16391a(IOException iOException) {
            DashMediaSource.this.m29118Y(iOException);
        }

        @Override // p195k8.C9166g0.InterfaceC9168b
        /* renamed from: b */
        public void mo16390b() {
            DashMediaSource.this.m29117Z(C9166g0.m16399h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4451b extends Timeline {

        /* renamed from: b */
        private final long f11812b;

        /* renamed from: c */
        private final long f11813c;

        /* renamed from: d */
        private final long f11814d;

        /* renamed from: e */
        private final int f11815e;

        /* renamed from: f */
        private final long f11816f;

        /* renamed from: g */
        private final long f11817g;

        /* renamed from: h */
        private final long f11818h;

        /* renamed from: i */
        private final C11771b f11819i;

        /* renamed from: j */
        private final MediaItem f11820j;

        /* renamed from: k */
        private final MediaItem.C4368f f11821k;

        public C4451b(long j, long j2, long j3, int i, long j4, long j5, long j6, C11771b c11771b, MediaItem mediaItem, MediaItem.C4368f c4368f) {
            boolean z;
            boolean z2 = c11771b.f30685d;
            if (c4368f != null) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z2 == z);
            this.f11812b = j;
            this.f11813c = j2;
            this.f11814d = j3;
            this.f11815e = i;
            this.f11816f = j4;
            this.f11817g = j5;
            this.f11818h = j6;
            this.f11819i = c11771b;
            this.f11820j = mediaItem;
            this.f11821k = c4368f;
        }

        /* renamed from: s */
        private long m29101s(long j) {
            long j2 = this.f11818h;
            if (!m29100t(this.f11819i)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f11817g) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f11816f + j2;
            long m6952g = this.f11819i.m6952g(0);
            int i = 0;
            while (i < this.f11819i.m6954e() - 1 && j3 >= m6952g) {
                j3 -= m6952g;
                i++;
                m6952g = this.f11819i.m6952g(i);
            }
            C11776f m6955d = this.f11819i.m6955d(i);
            int m6882a = m6955d.m6882a(2);
            if (m6882a == -1) {
                return j2;
            }
            InterfaceC11449e mo6874b = m6955d.f30717c.get(m6882a).f30678c.get(0).mo6874b();
            if (mo6874b != null && mo6874b.mo6853i(m6952g) != 0) {
                return (j2 + mo6874b.mo6859c(mo6874b.mo6854h(j3, m6952g))) - j3;
            }
            return j2;
        }

        /* renamed from: t */
        private static boolean m29100t(C11771b c11771b) {
            return c11771b.f30685d && c11771b.f30686e != -9223372036854775807L && c11771b.f30683b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo11758b(Object obj) {
            int intValue;
            if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f11815e) < 0 || intValue >= mo11756i()) {
                return -1;
            }
            return intValue;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C4378b mo11757g(int i, Timeline.C4378b c4378b, boolean z) {
            String str;
            C9149a.m16450c(i, 0, mo11756i());
            Integer num = null;
            if (z) {
                str = this.f11819i.m6955d(i).f30715a;
            } else {
                str = null;
            }
            if (z) {
                num = Integer.valueOf(this.f11815e + i);
            }
            return c4378b.m29722n(str, num, 0, this.f11819i.m6952g(i), C7390b.m20792c(this.f11819i.m6955d(i).f30716b - this.f11819i.m6955d(0).f30716b) - this.f11816f);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public int mo11756i() {
            return this.f11819i.m6954e();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo11755m(int i) {
            C9149a.m16450c(i, 0, mo11756i());
            return Integer.valueOf(this.f11815e + i);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C4379c mo11754o(int i, Timeline.C4379c c4379c, long j) {
            C9149a.m16450c(i, 0, 1);
            long m29101s = m29101s(j);
            Object obj = Timeline.C4379c.f11377r;
            MediaItem mediaItem = this.f11820j;
            C11771b c11771b = this.f11819i;
            return c4379c.m29714g(obj, mediaItem, c11771b, this.f11812b, this.f11813c, this.f11814d, true, m29100t(c11771b), this.f11821k, m29101s, this.f11817g, 0, mo11756i() - 1, this.f11816f);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: p */
        public int mo11753p() {
            return 1;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class C4452c implements C4467e.InterfaceC4469b {
        private C4452c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.C4467e.InterfaceC4469b
        /* renamed from: a */
        public void mo29023a(long j) {
            DashMediaSource.this.m29125R(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.C4467e.InterfaceC4469b
        /* renamed from: b */
        public void mo29022b() {
            DashMediaSource.this.m29124S();
        }

        /* synthetic */ C4452c(DashMediaSource dashMediaSource, C4450a c4450a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4453d implements C4559i.InterfaceC4560a<Long> {

        /* renamed from: a */
        private static final Pattern f11823a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        C4453d() {
        }

        @Override // com.google.android.exoplayer2.upstream.C4559i.InterfaceC4560a
        /* renamed from: b */
        public Long mo3724a(Uri uri, InputStream inputStream) {
            long j;
            long parseLong;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, C6374d.f18023c)).readLine();
            try {
                Matcher matcher = f11823a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if ("+".equals(matcher.group(4))) {
                            j = 1;
                        } else {
                            j = -1;
                        }
                        long parseLong2 = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            parseLong = 0;
                        } else {
                            parseLong = Long.parseLong(group2);
                        }
                        time -= j * ((((parseLong2 * 60) + parseLong) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw new C7402m("Couldn't parse timestamp: " + readLine);
            } catch (ParseException e) {
                throw new C7402m(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C4454e implements C4550h.InterfaceC4552b<C4559i<C11771b>> {
        private C4454e() {
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: a */
        public void mo5356j(C4559i<C11771b> c4559i, long j, long j2, boolean z) {
            DashMediaSource.this.m29123T(c4559i, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: b */
        public void mo5355k(C4559i<C11771b> c4559i, long j, long j2) {
            DashMediaSource.this.m29122U(c4559i, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: c */
        public C4550h.C4553c mo5351o(C4559i<C11771b> c4559i, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m29121V(c4559i, j, j2, iOException, i);
        }

        /* synthetic */ C4454e(DashMediaSource dashMediaSource, C4450a c4450a) {
            this();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    final class C4455f implements InterfaceC7467t {
        C4455f() {
        }

        /* renamed from: b */
        private void m29095b() {
            if (DashMediaSource.this.f11776J == null) {
                return;
            }
            throw DashMediaSource.this.f11776J;
        }

        @Override // p153i8.InterfaceC7467t
        /* renamed from: a */
        public void mo20615a() {
            DashMediaSource.this.f11774H.mo20615a();
            m29095b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C4456g implements C4550h.InterfaceC4552b<C4559i<Long>> {
        private C4456g() {
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: a */
        public void mo5356j(C4559i<Long> c4559i, long j, long j2, boolean z) {
            DashMediaSource.this.m29123T(c4559i, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: b */
        public void mo5355k(C4559i<Long> c4559i, long j, long j2) {
            DashMediaSource.this.m29120W(c4559i, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
        /* renamed from: c */
        public C4550h.C4553c mo5351o(C4559i<Long> c4559i, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m29119X(c4559i, j, j2, iOException);
        }

        /* synthetic */ C4456g(DashMediaSource dashMediaSource, C4450a c4450a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4457h implements C4559i.InterfaceC4560a<Long> {
        private C4457h() {
        }

        /* synthetic */ C4457h(C4450a c4450a) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.C4559i.InterfaceC4560a
        /* renamed from: b */
        public Long mo3724a(Uri uri, InputStream inputStream) {
            return Long.valueOf(C9191p0.m16306D0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C7397h.m20760a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(MediaItem mediaItem, C11771b c11771b, DataSource.Factory factory, C4559i.InterfaceC4560a interfaceC4560a, InterfaceC4458a.InterfaceC4459a interfaceC4459a, InterfaceC10298h interfaceC10298h, InterfaceC11049x interfaceC11049x, InterfaceC4548g interfaceC4548g, long j, C4450a c4450a) {
        this(mediaItem, c11771b, factory, interfaceC4560a, interfaceC4459a, interfaceC10298h, interfaceC11049x, interfaceC4548g, j);
    }

    /* renamed from: J */
    private static long m29133J(C11776f c11776f, long j, long j2) {
        int i;
        long m20792c = C7390b.m20792c(c11776f.f30716b);
        boolean m29129N = m29129N(c11776f);
        long j3 = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (i3 < c11776f.f30717c.size()) {
            C11770a c11770a = c11776f.f30717c.get(i3);
            List<AbstractC11779i> list = c11770a.f30678c;
            if ((m29129N && c11770a.f30677b == 3) || list.isEmpty()) {
                i = i3;
            } else {
                InterfaceC11449e mo6874b = list.get(i2).mo6874b();
                if (mo6874b == null) {
                    return m20792c + j;
                }
                int mo6850l = mo6874b.mo6850l(j, j2);
                if (mo6850l == 0) {
                    return m20792c;
                }
                i = i3;
                long mo6857e = (mo6874b.mo6857e(j, j2) + mo6850l) - 1;
                j3 = Math.min(j3, mo6874b.mo6859c(mo6857e) + m20792c + mo6874b.mo6858d(mo6857e, j));
            }
            i3 = i + 1;
            i2 = 0;
        }
        return j3;
    }

    /* renamed from: K */
    private static long m29132K(C11776f c11776f, long j, long j2) {
        long m20792c = C7390b.m20792c(c11776f.f30716b);
        boolean m29129N = m29129N(c11776f);
        long j3 = m20792c;
        for (int i = 0; i < c11776f.f30717c.size(); i++) {
            C11770a c11770a = c11776f.f30717c.get(i);
            List<AbstractC11779i> list = c11770a.f30678c;
            if ((!m29129N || c11770a.f30677b != 3) && !list.isEmpty()) {
                InterfaceC11449e mo6874b = list.get(0).mo6874b();
                if (mo6874b == null) {
                    return m20792c;
                }
                if (mo6874b.mo6850l(j, j2) == 0) {
                    return m20792c;
                }
                j3 = Math.max(j3, mo6874b.mo6859c(mo6874b.mo6857e(j, j2)) + m20792c);
            }
        }
        return j3;
    }

    /* renamed from: L */
    private static long m29131L(C11771b c11771b, long j) {
        InterfaceC11449e mo6874b;
        int m6954e = c11771b.m6954e() - 1;
        C11776f m6955d = c11771b.m6955d(m6954e);
        long m20792c = C7390b.m20792c(m6955d.f30716b);
        long m6952g = c11771b.m6952g(m6954e);
        long m20792c2 = C7390b.m20792c(j);
        long m20792c3 = C7390b.m20792c(c11771b.f30682a);
        long m20792c4 = C7390b.m20792c(5000L);
        for (int i = 0; i < m6955d.f30717c.size(); i++) {
            List<AbstractC11779i> list = m6955d.f30717c.get(i).f30678c;
            if (!list.isEmpty() && (mo6874b = list.get(0).mo6874b()) != null) {
                long mo6856f = ((m20792c3 + m20792c) + mo6874b.mo6856f(m6952g, m20792c2)) - m20792c2;
                if (mo6856f < m20792c4 - 100000 || (mo6856f > m20792c4 && mo6856f < m20792c4 + 100000)) {
                    m20792c4 = mo6856f;
                }
            }
        }
        return C7491b.m20595a(m20792c4, 1000L, RoundingMode.CEILING);
    }

    /* renamed from: M */
    private long m29130M() {
        return Math.min((this.f11786T - 1) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 5000);
    }

    /* renamed from: N */
    private static boolean m29129N(C11776f c11776f) {
        for (int i = 0; i < c11776f.f30717c.size(); i++) {
            int i2 = c11776f.f30717c.get(i).f30677b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    private static boolean m29128O(C11776f c11776f) {
        for (int i = 0; i < c11776f.f30717c.size(); i++) {
            InterfaceC11449e mo6874b = c11776f.f30717c.get(i).f30678c.get(0).mo6874b();
            if (mo6874b == null || mo6874b.mo6852j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m29127P() {
        m29116a0(false);
    }

    /* renamed from: Q */
    private void m29126Q() {
        C9166g0.m16397j(this.f11774H, new C4450a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m29118Y(IOException iOException) {
        C9197r.m16182d("DashMediaSource", "Failed to resolve time offset.", iOException);
        m29116a0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m29117Z(long j) {
        this.f11785S = j;
        m29116a0(true);
    }

    /* renamed from: a0 */
    private void m29116a0(boolean z) {
        boolean z2;
        C11776f c11776f;
        long j;
        long j2;
        MediaItem.C4368f c4368f;
        boolean z3;
        for (int i = 0; i < this.f11768B.size(); i++) {
            int keyAt = this.f11768B.keyAt(i);
            if (keyAt >= this.f11788V) {
                this.f11768B.valueAt(i).m29078M(this.f11781O, keyAt - this.f11788V);
            }
        }
        C11776f m6955d = this.f11781O.m6955d(0);
        int m6954e = this.f11781O.m6954e() - 1;
        C11776f m6955d2 = this.f11781O.m6955d(m6954e);
        long m6952g = this.f11781O.m6952g(m6954e);
        long m20792c = C7390b.m20792c(C9191p0.m16263Z(this.f11785S));
        long m29132K = m29132K(m6955d, this.f11781O.m6952g(0), m20792c);
        long m29133J = m29133J(m6955d2, m6952g, m20792c);
        if (this.f11781O.f30685d && !m29128O(m6955d2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            long j3 = this.f11781O.f30687f;
            if (j3 != -9223372036854775807L) {
                m29132K = Math.max(m29132K, m29133J - C7390b.m20792c(j3));
            }
        }
        long j4 = m29133J - m29132K;
        C11771b c11771b = this.f11781O;
        if (c11771b.f30685d) {
            if (c11771b.f30682a != -9223372036854775807L) {
                z3 = true;
            } else {
                z3 = false;
            }
            C9149a.m16447f(z3);
            long m20792c2 = (m20792c - C7390b.m20792c(this.f11781O.f30682a)) - m29132K;
            m29109h0(m20792c2, j4);
            long m20791d = this.f11781O.f30682a + C7390b.m20791d(m29132K);
            long m20792c3 = m20792c2 - C7390b.m20792c(this.f11778L.f11282a);
            long min = Math.min(5000000L, j4 / 2);
            j = m20791d;
            if (m20792c3 < min) {
                j2 = min;
            } else {
                j2 = m20792c3;
            }
            c11776f = m6955d;
        } else {
            c11776f = m6955d;
            j = -9223372036854775807L;
            j2 = 0;
        }
        long m20792c4 = m29132K - C7390b.m20792c(c11776f.f30716b);
        C11771b c11771b2 = this.f11781O;
        long j5 = c11771b2.f30682a;
        long j6 = this.f11785S;
        int i2 = this.f11788V;
        MediaItem mediaItem = this.f11789p;
        if (c11771b2.f30685d) {
            c4368f = this.f11778L;
        } else {
            c4368f = null;
        }
        m11958B(new C4451b(j5, j, j6, i2, m20792c4, j4, j2, c11771b2, mediaItem, c4368f));
        if (!this.f11790q) {
            this.f11777K.removeCallbacks(this.f11770D);
            if (z2) {
                this.f11777K.postDelayed(this.f11770D, m29131L(this.f11781O, C9191p0.m16263Z(this.f11785S)));
            }
            if (this.f11782P) {
                m29110g0();
            } else if (z) {
                C11771b c11771b3 = this.f11781O;
                if (c11771b3.f30685d) {
                    long j7 = c11771b3.f30686e;
                    if (j7 != -9223372036854775807L) {
                        if (j7 == 0) {
                            j7 = 5000;
                        }
                        m29112e0(Math.max(0L, (this.f11783Q + j7) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    private void m29115b0(C11792n c11792n) {
        String str = c11792n.f30768a;
        if (!C9191p0.m16257c(str, "urn:mpeg:dash:utc:direct:2014") && !C9191p0.m16257c(str, "urn:mpeg:dash:utc:direct:2012")) {
            if (!C9191p0.m16257c(str, "urn:mpeg:dash:utc:http-iso:2014") && !C9191p0.m16257c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!C9191p0.m16257c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !C9191p0.m16257c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!C9191p0.m16257c(str, "urn:mpeg:dash:utc:ntp:2014") && !C9191p0.m16257c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        m29118Y(new IOException("Unsupported UTC timing scheme"));
                        return;
                    } else {
                        m29126Q();
                        return;
                    }
                }
                m29113d0(c11792n, new C4457h(null));
                return;
            }
            m29113d0(c11792n, new C4453d());
            return;
        }
        m29114c0(c11792n);
    }

    /* renamed from: c0 */
    private void m29114c0(C11792n c11792n) {
        try {
            m29117Z(C9191p0.m16306D0(c11792n.f30769b) - this.f11784R);
        } catch (C7402m e) {
            m29118Y(e);
        }
    }

    /* renamed from: d0 */
    private void m29113d0(C11792n c11792n, C4559i.InterfaceC4560a<Long> interfaceC4560a) {
        m29111f0(new C4559i(this.f11773G, Uri.parse(c11792n.f30769b), 5, interfaceC4560a), new C4456g(this, null), 1);
    }

    /* renamed from: e0 */
    private void m29112e0(long j) {
        this.f11777K.postDelayed(this.f11769C, j);
    }

    /* renamed from: f0 */
    private <T> void m29111f0(C4559i<T> c4559i, C4550h.InterfaceC4552b<C4559i<T>> interfaceC4552b, int i) {
        this.f11797x.m11680z(new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, this.f11774H.m28615n(c4559i, interfaceC4552b, i)), c4559i.f12407c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m29110g0() {
        Uri uri;
        this.f11777K.removeCallbacks(this.f11769C);
        if (this.f11774H.m28620i()) {
            return;
        }
        if (this.f11774H.m28619j()) {
            this.f11782P = true;
            return;
        }
        synchronized (this.f11767A) {
            uri = this.f11779M;
        }
        this.f11782P = false;
        m29111f0(new C4559i(this.f11773G, uri, 4, this.f11798y), this.f11799z, this.f11795v.mo28629c(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r5 != (-9223372036854775807L)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 != (-9223372036854775807L)) goto L8;
     */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29109h0(long r15, long r17) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m29109h0(long, long):void");
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: A */
    protected void mo11739A(InterfaceC7472x interfaceC7472x) {
        this.f11775I = interfaceC7472x;
        this.f11794u.mo9265c();
        if (this.f11790q) {
            m29116a0(false);
            return;
        }
        this.f11773G = this.f11791r.createDataSource();
        this.f11774H = new C4550h("Loader:DashMediaSource");
        this.f11777K = C9191p0.m16215x();
        m29110g0();
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: C */
    protected void mo11738C() {
        C11771b c11771b;
        this.f11782P = false;
        this.f11773G = null;
        C4550h c4550h = this.f11774H;
        if (c4550h != null) {
            c4550h.m28617l();
            this.f11774H = null;
        }
        this.f11783Q = 0L;
        this.f11784R = 0L;
        if (this.f11790q) {
            c11771b = this.f11781O;
        } else {
            c11771b = null;
        }
        this.f11781O = c11771b;
        this.f11779M = this.f11780N;
        this.f11776J = null;
        Handler handler = this.f11777K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11777K = null;
        }
        this.f11785S = -9223372036854775807L;
        this.f11786T = 0;
        this.f11787U = -9223372036854775807L;
        this.f11788V = 0;
        this.f11768B.clear();
        this.f11794u.release();
    }

    /* renamed from: R */
    void m29125R(long j) {
        long j2 = this.f11787U;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f11787U = j;
        }
    }

    /* renamed from: S */
    void m29124S() {
        this.f11777K.removeCallbacks(this.f11770D);
        m29110g0();
    }

    /* renamed from: T */
    void m29123T(C4559i<?> c4559i, long j, long j2) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        this.f11795v.mo28628d(c4559i.f12405a);
        this.f11797x.m11689q(loadEventInfo, c4559i.f12407c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m29122U(com.google.android.exoplayer2.upstream.C4559i<p297q7.C11771b> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m29122U(com.google.android.exoplayer2.upstream.i, long, long):void");
    }

    /* renamed from: V */
    C4550h.C4553c m29121V(C4559i<C11771b> c4559i, long j, long j2, IOException iOException, int i) {
        C4550h.C4553c m28621h;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        long mo28631a = this.f11795v.mo28631a(new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(c4559i.f12407c), iOException, i));
        if (mo28631a == -9223372036854775807L) {
            m28621h = C4550h.f12388g;
        } else {
            m28621h = C4550h.m28621h(false, mo28631a);
        }
        boolean z = !m28621h.m28612c();
        this.f11797x.m11682x(loadEventInfo, c4559i.f12407c, iOException, z);
        if (z) {
            this.f11795v.mo28628d(c4559i.f12405a);
        }
        return m28621h;
    }

    /* renamed from: W */
    void m29120W(C4559i<Long> c4559i, long j, long j2) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b());
        this.f11795v.mo28628d(c4559i.f12405a);
        this.f11797x.m11686t(loadEventInfo, c4559i.f12407c);
        m29117Z(c4559i.m28603e().longValue() - j);
    }

    /* renamed from: X */
    C4550h.C4553c m29119X(C4559i<Long> c4559i, long j, long j2, IOException iOException) {
        this.f11797x.m11682x(new LoadEventInfo(c4559i.f12405a, c4559i.f12406b, c4559i.m28602f(), c4559i.m28604d(), j, j2, c4559i.m28605b()), c4559i.f12407c, iOException, true);
        this.f11795v.mo28628d(c4559i.f12405a);
        m29118Y(iOException);
        return C4550h.f12387f;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        return this.f11789p;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: g */
    public InterfaceC10329p mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        int intValue = ((Integer) c10342a.f27016a).intValue() - this.f11788V;
        InterfaceC10353z.C10354a m11953w = m11953w(c10342a, this.f11781O.m6955d(intValue).f30716b);
        C4460b c4460b = new C4460b(this.f11788V + intValue, this.f11781O, intValue, this.f11792s, this.f11775I, this.f11794u, m11956t(c10342a), this.f11795v, m11953w, this.f11785S, this.f11772F, interfaceC7440b, this.f11793t, this.f11771E);
        this.f11768B.put(c4460b.f11834j, c4460b);
        return c4460b;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
        this.f11772F.mo20615a();
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        C4460b c4460b = (C4460b) interfaceC10329p;
        c4460b.m29082I();
        this.f11768B.remove(c4460b.f11834j);
    }

    private DashMediaSource(MediaItem mediaItem, C11771b c11771b, DataSource.Factory factory, C4559i.InterfaceC4560a<? extends C11771b> interfaceC4560a, InterfaceC4458a.InterfaceC4459a interfaceC4459a, InterfaceC10298h interfaceC10298h, InterfaceC11049x interfaceC11049x, InterfaceC4548g interfaceC4548g, long j) {
        this.f11789p = mediaItem;
        this.f11778L = mediaItem.f11235c;
        this.f11779M = ((MediaItem.C4369g) C9149a.m16448e(mediaItem.f11234b)).f11287a;
        this.f11780N = mediaItem.f11234b.f11287a;
        this.f11781O = c11771b;
        this.f11791r = factory;
        this.f11798y = interfaceC4560a;
        this.f11792s = interfaceC4459a;
        this.f11794u = interfaceC11049x;
        this.f11795v = interfaceC4548g;
        this.f11796w = j;
        this.f11793t = interfaceC10298h;
        boolean z = c11771b != null;
        this.f11790q = z;
        this.f11797x = m11954v(null);
        this.f11767A = new Object();
        this.f11768B = new SparseArray<>();
        this.f11771E = new C4452c(this, null);
        this.f11787U = -9223372036854775807L;
        this.f11785S = -9223372036854775807L;
        if (z) {
            C9149a.m16447f(true ^ c11771b.f30685d);
            this.f11799z = null;
            this.f11769C = null;
            this.f11770D = null;
            this.f11772F = new InterfaceC7467t.C7468a();
            return;
        }
        this.f11799z = new C4454e(this, null);
        this.f11772F = new C4455f();
        this.f11769C = new Runnable() { // from class: p7.b
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.m29110g0();
            }
        };
        this.f11770D = new Runnable() { // from class: p7.c
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.m29127P();
            }
        };
    }
}
