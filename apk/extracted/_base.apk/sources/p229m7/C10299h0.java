package p229m7;

import android.net.Uri;
import android.os.Handler;
import com.discord.nearby.NearbyManager;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p099f8.InterfaceC6337h;
import p131h7.C7023b;
import p151i6.C7390b;
import p151i6.C7399j;
import p151i6.C7402m;
import p151i6.C7410u;
import p153i8.C7470v;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7451h;
import p195k8.C9149a;
import p195k8.C9161f;
import p195k8.C9191p0;
import p195k8.C9200u;
import p195k8.C9208y;
import p228m6.C10271g;
import p229m7.C10315l0;
import p229m7.C10318m;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m7.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10299h0 implements InterfaceC10329p, InterfaceC11748k, C4550h.InterfaceC4552b<C10300a>, C4550h.InterfaceC4556f, C10315l0.InterfaceC10317b {

    /* renamed from: V */
    private static final Map<String, String> f26830V = m11912K();

    /* renamed from: W */
    private static final Format f26831W = new Format.C4362b().m29900S("icy").m29883e0("application/x-icy").m29914E();

    /* renamed from: A */
    private C7023b f26832A;

    /* renamed from: D */
    private boolean f26835D;

    /* renamed from: E */
    private boolean f26836E;

    /* renamed from: F */
    private boolean f26837F;

    /* renamed from: G */
    private C10304e f26838G;

    /* renamed from: H */
    private InterfaceC11766y f26839H;

    /* renamed from: J */
    private boolean f26841J;

    /* renamed from: L */
    private boolean f26843L;

    /* renamed from: M */
    private boolean f26844M;

    /* renamed from: N */
    private int f26845N;

    /* renamed from: P */
    private long f26847P;

    /* renamed from: R */
    private boolean f26849R;

    /* renamed from: S */
    private int f26850S;

    /* renamed from: T */
    private boolean f26851T;

    /* renamed from: U */
    private boolean f26852U;

    /* renamed from: j */
    private final Uri f26853j;

    /* renamed from: k */
    private final DataSource f26854k;

    /* renamed from: l */
    private final InterfaceC11049x f26855l;

    /* renamed from: m */
    private final InterfaceC4548g f26856m;

    /* renamed from: n */
    private final InterfaceC10353z.C10354a f26857n;

    /* renamed from: o */
    private final InterfaceC11045v.C11046a f26858o;

    /* renamed from: p */
    private final InterfaceC10301b f26859p;

    /* renamed from: q */
    private final InterfaceC7440b f26860q;

    /* renamed from: r */
    private final String f26861r;

    /* renamed from: s */
    private final long f26862s;

    /* renamed from: u */
    private final InterfaceC10289d0 f26864u;

    /* renamed from: z */
    private InterfaceC10329p.InterfaceC10330a f26869z;

    /* renamed from: t */
    private final C4550h f26863t = new C4550h("Loader:ProgressiveMediaPeriod");

    /* renamed from: v */
    private final C9161f f26865v = new C9161f();

    /* renamed from: w */
    private final Runnable f26866w = new Runnable() { // from class: m7.e0
        @Override // java.lang.Runnable
        public final void run() {
            C10299h0.this.m11904S();
        }
    };

    /* renamed from: x */
    private final Runnable f26867x = new Runnable() { // from class: m7.f0
        @Override // java.lang.Runnable
        public final void run() {
            C10299h0.this.m11906Q();
        }
    };

    /* renamed from: y */
    private final Handler f26868y = C9191p0.m16215x();

    /* renamed from: C */
    private C10303d[] f26834C = new C10303d[0];

    /* renamed from: B */
    private C10315l0[] f26833B = new C10315l0[0];

    /* renamed from: Q */
    private long f26848Q = -9223372036854775807L;

    /* renamed from: O */
    private long f26846O = -1;

    /* renamed from: I */
    private long f26840I = -9223372036854775807L;

    /* renamed from: K */
    private int f26842K = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m7.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C10300a implements C4550h.InterfaceC4555e, C10318m.InterfaceC10319a {

        /* renamed from: b */
        private final Uri f26871b;

        /* renamed from: c */
        private final C7470v f26872c;

        /* renamed from: d */
        private final InterfaceC10289d0 f26873d;

        /* renamed from: e */
        private final InterfaceC11748k f26874e;

        /* renamed from: f */
        private final C9161f f26875f;

        /* renamed from: h */
        private volatile boolean f26877h;

        /* renamed from: j */
        private long f26879j;

        /* renamed from: m */
        private InterfaceC11732b0 f26882m;

        /* renamed from: n */
        private boolean f26883n;

        /* renamed from: g */
        private final C11765x f26876g = new C11765x();

        /* renamed from: i */
        private boolean f26878i = true;

        /* renamed from: l */
        private long f26881l = -1;

        /* renamed from: a */
        private final long f26870a = LoadEventInfo.m29145a();

        /* renamed from: k */
        private C4515a f26880k = m11877j(0);

        public C10300a(Uri uri, DataSource dataSource, InterfaceC10289d0 interfaceC10289d0, InterfaceC11748k interfaceC11748k, C9161f c9161f) {
            this.f26871b = uri;
            this.f26872c = new C7470v(dataSource);
            this.f26873d = interfaceC10289d0;
            this.f26874e = interfaceC11748k;
            this.f26875f = c9161f;
        }

        /* renamed from: j */
        private C4515a m11877j(long j) {
            return new C4515a.C4517b().m28757i(this.f26871b).m28758h(j).m28760f(C10299h0.this.f26861r).m28764b(6).m28761e(C10299h0.f26830V).m28765a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m11876k(long j, long j2) {
            this.f26876g.f30668a = j;
            this.f26879j = j2;
            this.f26878i = true;
            this.f26883n = false;
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
        /* renamed from: a */
        public void mo6277a() {
            int i = 0;
            while (i == 0 && !this.f26877h) {
                try {
                    long j = this.f26876g.f30668a;
                    C4515a m11877j = m11877j(j);
                    this.f26880k = m11877j;
                    long mo6322b = this.f26872c.mo6322b(m11877j);
                    this.f26881l = mo6322b;
                    if (mo6322b != -1) {
                        this.f26881l = mo6322b + j;
                    }
                    C10299h0.this.f26832A = C7023b.m21525a(this.f26872c.mo6321d());
                    InterfaceC7451h interfaceC7451h = this.f26872c;
                    if (C10299h0.this.f26832A != null && C10299h0.this.f26832A.f19218o != -1) {
                        interfaceC7451h = new C10318m(this.f26872c, C10299h0.this.f26832A.f19218o, this);
                        InterfaceC11732b0 m11909N = C10299h0.this.m11909N();
                        this.f26882m = m11909N;
                        m11909N.mo6168c(C10299h0.f26831W);
                    }
                    long j2 = j;
                    this.f26873d.mo11933d(interfaceC7451h, this.f26871b, this.f26872c.mo6321d(), j, this.f26881l, this.f26874e);
                    if (C10299h0.this.f26832A != null) {
                        this.f26873d.mo11934c();
                    }
                    if (this.f26878i) {
                        this.f26873d.mo11936a(j2, this.f26879j);
                        this.f26878i = false;
                    }
                    while (true) {
                        long j3 = j2;
                        while (i == 0 && !this.f26877h) {
                            try {
                                this.f26875f.m16419a();
                                i = this.f26873d.mo11935b(this.f26876g);
                                j2 = this.f26873d.mo11932e();
                                if (j2 > C10299h0.this.f26862s + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f26875f.m16418b();
                        C10299h0.this.f26868y.post(C10299h0.this.f26867x);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f26873d.mo11932e() != -1) {
                        this.f26876g.f30668a = this.f26873d.mo11932e();
                    }
                    C9191p0.m16235n(this.f26872c);
                } catch (Throwable th2) {
                    if (i != 1 && this.f26873d.mo11932e() != -1) {
                        this.f26876g.f30668a = this.f26873d.mo11932e();
                    }
                    C9191p0.m16235n(this.f26872c);
                    throw th2;
                }
            }
        }

        @Override // p229m7.C10318m.InterfaceC10319a
        /* renamed from: b */
        public void mo11789b(C9208y c9208y) {
            long max;
            if (!this.f26883n) {
                max = this.f26879j;
            } else {
                max = Math.max(C10299h0.this.m11910M(), this.f26879j);
            }
            int m16097a = c9208y.m16097a();
            InterfaceC11732b0 interfaceC11732b0 = (InterfaceC11732b0) C9149a.m16448e(this.f26882m);
            interfaceC11732b0.mo6170a(c9208y, m16097a);
            interfaceC11732b0.mo6162f(max, 1, m16097a, 0, null);
            this.f26883n = true;
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
        /* renamed from: c */
        public void mo6276c() {
            this.f26877h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m7.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10301b {
        /* renamed from: h */
        void mo11872h(long j, boolean z, boolean z2);
    }

    /* renamed from: m7.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class C10302c implements InterfaceC10320m0 {

        /* renamed from: j */
        private final int f26885j;

        public C10302c(int i) {
            this.f26885j = i;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: a */
        public void mo6236a() {
            C10299h0.this.m11900W(this.f26885j);
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: e */
        public boolean mo6232e() {
            return C10299h0.this.m11907P(this.f26885j);
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: i */
        public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
            return C10299h0.this.m11895b0(this.f26885j, c7399j, c10271g, z);
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: s */
        public int mo6230s(long j) {
            return C10299h0.this.m11891f0(this.f26885j, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.h0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10303d {

        /* renamed from: a */
        public final int f26887a;

        /* renamed from: b */
        public final boolean f26888b;

        public C10303d(int i, boolean z) {
            this.f26887a = i;
            this.f26888b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10303d.class != obj.getClass()) {
                return false;
            }
            C10303d c10303d = (C10303d) obj;
            if (this.f26887a == c10303d.f26887a && this.f26888b == c10303d.f26888b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f26887a * 31) + (this.f26888b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.h0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10304e {

        /* renamed from: a */
        public final TrackGroupArray f26889a;

        /* renamed from: b */
        public final boolean[] f26890b;

        /* renamed from: c */
        public final boolean[] f26891c;

        /* renamed from: d */
        public final boolean[] f26892d;

        public C10304e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f26889a = trackGroupArray;
            this.f26890b = zArr;
            int i = trackGroupArray.f11764j;
            this.f26891c = new boolean[i];
            this.f26892d = new boolean[i];
        }
    }

    public C10299h0(Uri uri, DataSource dataSource, InterfaceC11753o interfaceC11753o, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a, InterfaceC10301b interfaceC10301b, InterfaceC7440b interfaceC7440b, String str, int i) {
        this.f26853j = uri;
        this.f26854k = dataSource;
        this.f26855l = interfaceC11049x;
        this.f26858o = c11046a;
        this.f26856m = interfaceC4548g;
        this.f26857n = c10354a;
        this.f26859p = interfaceC10301b;
        this.f26860q = interfaceC7440b;
        this.f26861r = str;
        this.f26862s = i;
        this.f26864u = new C10283c(interfaceC11753o);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: H */
    private void m11915H() {
        C9149a.m16447f(this.f26836E);
        C9149a.m16448e(this.f26838G);
        C9149a.m16448e(this.f26839H);
    }

    /* renamed from: I */
    private boolean m11914I(C10300a c10300a, int i) {
        InterfaceC11766y interfaceC11766y;
        if (this.f26846O == -1 && ((interfaceC11766y = this.f26839H) == null || interfaceC11766y.mo1208i() == -9223372036854775807L)) {
            if (this.f26836E && !m11889h0()) {
                this.f26849R = true;
                return false;
            }
            this.f26844M = this.f26836E;
            this.f26847P = 0L;
            this.f26850S = 0;
            for (C10315l0 c10315l0 : this.f26833B) {
                c10315l0.m11821T();
            }
            c10300a.m11876k(0L, 0L);
            return true;
        }
        this.f26850S = i;
        return true;
    }

    /* renamed from: J */
    private void m11913J(C10300a c10300a) {
        if (this.f26846O == -1) {
            this.f26846O = c10300a.f26881l;
        }
    }

    /* renamed from: K */
    private static Map<String, String> m11912K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", NearbyManager.PERMISSION_DENIED);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: L */
    private int m11911L() {
        int i = 0;
        for (C10315l0 c10315l0 : this.f26833B) {
            i += c10315l0.m11835F();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public long m11910M() {
        long j = Long.MIN_VALUE;
        for (C10315l0 c10315l0 : this.f26833B) {
            j = Math.max(j, c10315l0.m11792y());
        }
        return j;
    }

    /* renamed from: O */
    private boolean m11908O() {
        return this.f26848Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m11906Q() {
        if (!this.f26852U) {
            ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26869z)).mo6251k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m11904S() {
        boolean z;
        Metadata m29250a;
        if (!this.f26852U && !this.f26836E && this.f26835D && this.f26839H != null) {
            for (C10315l0 c10315l0 : this.f26833B) {
                if (c10315l0.m11836E() == null) {
                    return;
                }
            }
            this.f26865v.m16418b();
            int length = this.f26833B.length;
            C10344s0[] c10344s0Arr = new C10344s0[length];
            boolean[] zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                Format format = (Format) C9149a.m16448e(this.f26833B[i].m11836E());
                String str = format.f11197u;
                boolean m16154p = C9200u.m16154p(str);
                if (!m16154p && !C9200u.m16151s(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i] = z;
                this.f26837F = z | this.f26837F;
                C7023b c7023b = this.f26832A;
                if (c7023b != null) {
                    if (m16154p || this.f26834C[i].f26888b) {
                        Metadata metadata = format.f11195s;
                        if (metadata == null) {
                            m29250a = new Metadata(c7023b);
                        } else {
                            m29250a = metadata.m29250a(c7023b);
                        }
                        format = format.m29926a().m29895X(m29250a).m29914E();
                    }
                    if (m16154p && format.f11191o == -1 && format.f11192p == -1 && c7023b.f19213j != -1) {
                        format = format.m29926a().m29912G(c7023b.f19213j).m29914E();
                    }
                }
                c10344s0Arr[i] = new C10344s0(format.m29925b(this.f26855l.mo9266b(format)));
            }
            this.f26838G = new C10304e(new TrackGroupArray(c10344s0Arr), zArr);
            this.f26836E = true;
            ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26869z)).mo11759j(this);
        }
    }

    /* renamed from: T */
    private void m11903T(int i) {
        m11915H();
        C10304e c10304e = this.f26838G;
        boolean[] zArr = c10304e.f26892d;
        if (!zArr[i]) {
            Format m11721a = c10304e.f26889a.m29144a(i).m11721a(0);
            this.f26857n.m11697i(C9200u.m16158l(m11721a.f11197u), m11721a, 0, null, this.f26847P);
            zArr[i] = true;
        }
    }

    /* renamed from: U */
    private void m11902U(int i) {
        m11915H();
        boolean[] zArr = this.f26838G.f26890b;
        if (this.f26849R && zArr[i]) {
            if (!this.f26833B[i].m11831J(false)) {
                this.f26848Q = 0L;
                this.f26849R = false;
                this.f26844M = true;
                this.f26847P = 0L;
                this.f26850S = 0;
                for (C10315l0 c10315l0 : this.f26833B) {
                    c10315l0.m11821T();
                }
                ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26869z)).mo6251k(this);
            }
        }
    }

    /* renamed from: a0 */
    private InterfaceC11732b0 m11896a0(C10303d c10303d) {
        int length = this.f26833B.length;
        for (int i = 0; i < length; i++) {
            if (c10303d.equals(this.f26834C[i])) {
                return this.f26833B[i];
            }
        }
        C10315l0 m11806j = C10315l0.m11806j(this.f26860q, this.f26868y.getLooper(), this.f26855l, this.f26858o);
        m11806j.m11813b0(this);
        int i2 = length + 1;
        C10303d[] c10303dArr = (C10303d[]) Arrays.copyOf(this.f26834C, i2);
        c10303dArr[length] = c10303d;
        this.f26834C = (C10303d[]) C9191p0.m16241k(c10303dArr);
        C10315l0[] c10315l0Arr = (C10315l0[]) Arrays.copyOf(this.f26833B, i2);
        c10315l0Arr[length] = m11806j;
        this.f26833B = (C10315l0[]) C9191p0.m16241k(c10315l0Arr);
        return m11806j;
    }

    /* renamed from: d0 */
    private boolean m11893d0(boolean[] zArr, long j) {
        int length = this.f26833B.length;
        for (int i = 0; i < length; i++) {
            if (!this.f26833B[i].m11817X(j, false) && (zArr[i] || !this.f26837F)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m11905R(InterfaceC11766y interfaceC11766y) {
        InterfaceC11766y c11768b;
        boolean z;
        if (this.f26832A == null) {
            c11768b = interfaceC11766y;
        } else {
            c11768b = new InterfaceC11766y.C11768b(-9223372036854775807L);
        }
        this.f26839H = c11768b;
        this.f26840I = interfaceC11766y.mo1208i();
        int i = 1;
        if (this.f26846O == -1 && interfaceC11766y.mo1208i() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.f26841J = z;
        if (z) {
            i = 7;
        }
        this.f26842K = i;
        this.f26859p.mo11872h(this.f26840I, interfaceC11766y.mo1209h(), this.f26841J);
        if (!this.f26836E) {
            m11904S();
        }
    }

    /* renamed from: g0 */
    private void m11890g0() {
        C10300a c10300a = new C10300a(this.f26853j, this.f26854k, this.f26864u, this, this.f26865v);
        if (this.f26836E) {
            C9149a.m16447f(m11908O());
            long j = this.f26840I;
            if (j != -9223372036854775807L && this.f26848Q > j) {
                this.f26851T = true;
                this.f26848Q = -9223372036854775807L;
                return;
            }
            c10300a.m11876k(((InterfaceC11766y) C9149a.m16448e(this.f26839H)).mo1210f(this.f26848Q).f30669a.f30675b, this.f26848Q);
            for (C10315l0 c10315l0 : this.f26833B) {
                c10315l0.m11815Z(this.f26848Q);
            }
            this.f26848Q = -9223372036854775807L;
        }
        this.f26850S = m11911L();
        this.f26857n.m11711A(new LoadEventInfo(c10300a.f26870a, c10300a.f26880k, this.f26863t.m28615n(c10300a, this, this.f26856m.mo28629c(this.f26842K))), 1, -1, null, 0, null, c10300a.f26879j, this.f26840I);
    }

    /* renamed from: h0 */
    private boolean m11889h0() {
        return this.f26844M || m11908O();
    }

    /* renamed from: N */
    InterfaceC11732b0 m11909N() {
        return m11896a0(new C10303d(0, true));
    }

    /* renamed from: P */
    boolean m11907P(int i) {
        return !m11889h0() && this.f26833B[i].m11831J(this.f26851T);
    }

    /* renamed from: V */
    void m11901V() {
        this.f26863t.m28618k(this.f26856m.mo28629c(this.f26842K));
    }

    /* renamed from: W */
    void m11900W(int i) {
        this.f26833B[i].m11829L();
        m11901V();
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: X */
    public void mo5356j(C10300a c10300a, long j, long j2, boolean z) {
        C7470v c7470v = c10300a.f26872c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c10300a.f26870a, c10300a.f26880k, c7470v.m20613p(), c7470v.m20612q(), j, j2, c7470v.m20614o());
        this.f26856m.mo28628d(c10300a.f26870a);
        this.f26857n.m11688r(loadEventInfo, 1, -1, null, 0, null, c10300a.f26879j, this.f26840I);
        if (!z) {
            m11913J(c10300a);
            for (C10315l0 c10315l0 : this.f26833B) {
                c10315l0.m11821T();
            }
            if (this.f26845N > 0) {
                ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26869z)).mo6251k(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: Y */
    public void mo5355k(C10300a c10300a, long j, long j2) {
        InterfaceC11766y interfaceC11766y;
        long j3;
        if (this.f26840I == -9223372036854775807L && (interfaceC11766y = this.f26839H) != null) {
            boolean mo1209h = interfaceC11766y.mo1209h();
            long m11910M = m11910M();
            if (m11910M == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = m11910M + 10000;
            }
            this.f26840I = j3;
            this.f26859p.mo11872h(j3, mo1209h, this.f26841J);
        }
        C7470v c7470v = c10300a.f26872c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c10300a.f26870a, c10300a.f26880k, c7470v.m20613p(), c7470v.m20612q(), j, j2, c7470v.m20614o());
        this.f26856m.mo28628d(c10300a.f26870a);
        this.f26857n.m11685u(loadEventInfo, 1, -1, null, 0, null, c10300a.f26879j, this.f26840I);
        m11913J(c10300a);
        this.f26851T = true;
        ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26869z)).mo6251k(this);
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: Z */
    public C4550h.C4553c mo5351o(C10300a c10300a, long j, long j2, IOException iOException, int i) {
        boolean z;
        C10300a c10300a2;
        C4550h.C4553c c4553c;
        m11913J(c10300a);
        C7470v c7470v = c10300a.f26872c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c10300a.f26870a, c10300a.f26880k, c7470v.m20613p(), c7470v.m20612q(), j, j2, c7470v.m20614o());
        long mo28631a = this.f26856m.mo28631a(new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, C7390b.m20791d(c10300a.f26879j), C7390b.m20791d(this.f26840I)), iOException, i));
        if (mo28631a == -9223372036854775807L) {
            c4553c = C4550h.f12388g;
        } else {
            int m11911L = m11911L();
            if (m11911L > this.f26850S) {
                c10300a2 = c10300a;
                z = true;
            } else {
                z = false;
                c10300a2 = c10300a;
            }
            if (m11914I(c10300a2, m11911L)) {
                c4553c = C4550h.m28621h(z, mo28631a);
            } else {
                c4553c = C4550h.f12387f;
            }
        }
        boolean z2 = !c4553c.m28612c();
        this.f26857n.m11683w(loadEventInfo, 1, -1, null, 0, null, c10300a.f26879j, this.f26840I, iOException, z2);
        if (z2) {
            this.f26856m.mo28628d(c10300a.f26870a);
        }
        return c4553c;
    }

    @Override // p229m7.C10315l0.InterfaceC10317b
    /* renamed from: a */
    public void mo6203a(Format format) {
        this.f26868y.post(this.f26866w);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        if (this.f26845N == 0) {
            return Long.MIN_VALUE;
        }
        return mo6194f();
    }

    /* renamed from: b0 */
    int m11895b0(int i, C7399j c7399j, C10271g c10271g, boolean z) {
        if (m11889h0()) {
            return -3;
        }
        m11903T(i);
        int m11824Q = this.f26833B[i].m11824Q(c7399j, c10271g, z, this.f26851T);
        if (m11824Q == -3) {
            m11902U(i);
        }
        return m11824Q;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f26863t.m28619j() && this.f26865v.m16417c();
    }

    /* renamed from: c0 */
    public void m11894c0() {
        if (this.f26836E) {
            for (C10315l0 c10315l0 : this.f26833B) {
                c10315l0.m11825P();
            }
        }
        this.f26863t.m28616m(this);
        this.f26868y.removeCallbacksAndMessages(null);
        this.f26869z = null;
        this.f26852U = true;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        if (!this.f26851T && !this.f26863t.m28620i() && !this.f26849R) {
            if (!this.f26836E || this.f26845N != 0) {
                boolean m16416d = this.f26865v.m16416d();
                if (!this.f26863t.m28619j()) {
                    m11890g0();
                    return true;
                }
                return m16416d;
            }
            return false;
        }
        return false;
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: e */
    public InterfaceC11732b0 mo3740e(int i, int i2) {
        return m11896a0(new C10303d(i, false));
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        long j;
        m11915H();
        boolean[] zArr = this.f26838G.f26890b;
        if (this.f26851T) {
            return Long.MIN_VALUE;
        }
        if (m11908O()) {
            return this.f26848Q;
        }
        if (this.f26837F) {
            int length = this.f26833B.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f26833B[i].m11832I()) {
                    j = Math.min(j, this.f26833B[i].m11792y());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m11910M();
        }
        if (j == Long.MIN_VALUE) {
            return this.f26847P;
        }
        return j;
    }

    /* renamed from: f0 */
    int m11891f0(int i, long j) {
        if (m11889h0()) {
            return 0;
        }
        m11903T(i);
        C10315l0 c10315l0 = this.f26833B[i];
        int m11837D = c10315l0.m11837D(j, this.f26851T);
        c10315l0.m11812c0(m11837D);
        if (m11837D == 0) {
            m11902U(i);
        }
        return m11837D;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        m11915H();
        if (!this.f26839H.mo1209h()) {
            return 0L;
        }
        InterfaceC11766y.C11767a mo1210f = this.f26839H.mo1210f(j);
        return c7410u.m20717a(j, mo1210f.f30669a.f30674a, mo1210f.f30670b.f30674a);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: i */
    public void mo3739i(final InterfaceC11766y interfaceC11766y) {
        this.f26868y.post(new Runnable() { // from class: m7.g0
            @Override // java.lang.Runnable
            public final void run() {
                C10299h0.this.m11905R(interfaceC11766y);
            }
        });
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        m11915H();
        boolean[] zArr = this.f26838G.f26890b;
        if (!this.f26839H.mo1209h()) {
            j = 0;
        }
        int i = 0;
        this.f26844M = false;
        this.f26847P = j;
        if (m11908O()) {
            this.f26848Q = j;
            return j;
        } else if (this.f26842K != 7 && m11893d0(zArr, j)) {
            return j;
        } else {
            this.f26849R = false;
            this.f26848Q = j;
            this.f26851T = false;
            if (this.f26863t.m28619j()) {
                C10315l0[] c10315l0Arr = this.f26833B;
                int length = c10315l0Arr.length;
                while (i < length) {
                    c10315l0Arr[i].m11799q();
                    i++;
                }
                this.f26863t.m28623f();
            } else {
                this.f26863t.m28622g();
                C10315l0[] c10315l0Arr2 = this.f26833B;
                int length2 = c10315l0Arr2.length;
                while (i < length2) {
                    c10315l0Arr2[i].m11821T();
                    i++;
                }
            }
            return j;
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f26869z = interfaceC10330a;
        this.f26865v.m16416d();
        m11890g0();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        if (this.f26844M) {
            if (this.f26851T || m11911L() > this.f26850S) {
                this.f26844M = false;
                return this.f26847P;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4556f
    /* renamed from: p */
    public void mo6182p() {
        for (C10315l0 c10315l0 : this.f26833B) {
            c10315l0.m11823R();
        }
        this.f26864u.release();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        boolean z;
        InterfaceC6337h interfaceC6337h;
        boolean z2;
        boolean z3;
        m11915H();
        C10304e c10304e = this.f26838G;
        TrackGroupArray trackGroupArray = c10304e.f26889a;
        boolean[] zArr3 = c10304e.f26891c;
        int i = this.f26845N;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC6337hArr.length; i3++) {
            InterfaceC10320m0 interfaceC10320m0 = interfaceC10320m0Arr[i3];
            if (interfaceC10320m0 != null && (interfaceC6337hArr[i3] == null || !zArr[i3])) {
                int i4 = ((C10302c) interfaceC10320m0).f26885j;
                C9149a.m16447f(zArr3[i4]);
                this.f26845N--;
                zArr3[i4] = false;
                interfaceC10320m0Arr[i3] = null;
            }
        }
        if (!this.f26843L ? j != 0 : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < interfaceC6337hArr.length; i5++) {
            if (interfaceC10320m0Arr[i5] == null && (interfaceC6337h = interfaceC6337hArr[i5]) != null) {
                if (interfaceC6337h.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9149a.m16447f(z2);
                if (interfaceC6337h.mo22890d(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C9149a.m16447f(z3);
                int m29143b = trackGroupArray.m29143b(interfaceC6337h.mo22888i());
                C9149a.m16447f(!zArr3[m29143b]);
                this.f26845N++;
                zArr3[m29143b] = true;
                interfaceC10320m0Arr[i5] = new C10302c(m29143b);
                zArr2[i5] = true;
                if (!z) {
                    C10315l0 c10315l0 = this.f26833B[m29143b];
                    if (!c10315l0.m11817X(j, true) && c10315l0.m11839B() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.f26845N == 0) {
            this.f26849R = false;
            this.f26844M = false;
            if (this.f26863t.m28619j()) {
                C10315l0[] c10315l0Arr = this.f26833B;
                int length = c10315l0Arr.length;
                while (i2 < length) {
                    c10315l0Arr[i2].m11799q();
                    i2++;
                }
                this.f26863t.m28623f();
            } else {
                C10315l0[] c10315l0Arr2 = this.f26833B;
                int length2 = c10315l0Arr2.length;
                while (i2 < length2) {
                    c10315l0Arr2[i2].m11821T();
                    i2++;
                }
            }
        } else if (z) {
            j = mo6250l(j);
            while (i2 < interfaceC10320m0Arr.length) {
                if (interfaceC10320m0Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f26843L = true;
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        m11901V();
        if (this.f26851T && !this.f26836E) {
            throw new C7402m("Loading finished before preparation is complete.");
        }
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: s */
    public void mo3738s() {
        this.f26835D = true;
        this.f26868y.post(this.f26866w);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        m11915H();
        return this.f26838G.f26889a;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        m11915H();
        if (m11908O()) {
            return;
        }
        boolean[] zArr = this.f26838G.f26891c;
        int length = this.f26833B.length;
        for (int i = 0; i < length; i++) {
            this.f26833B[i].m11800p(j, z, zArr[i]);
        }
    }
}
