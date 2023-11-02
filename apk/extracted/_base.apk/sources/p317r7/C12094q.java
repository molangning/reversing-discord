package p317r7;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import gb.AbstractC6693s;
import gb.C6712x;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p098f7.C6314a;
import p098f7.C6316b;
import p151i6.C7390b;
import p151i6.C7399j;
import p151i6.C7402m;
import p152i7.C7433l;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7451h;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p195k8.C9208y;
import p228m6.C10271g;
import p229m7.C10315l0;
import p229m7.C10344s0;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10322n0;
import p229m7.InterfaceC10353z;
import p259o6.C11028l;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p260o7.AbstractC11058e;
import p296q6.C11730a0;
import p296q6.C11745h;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;
import p317r7.C12078f;
import p317r7.C12094q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r7.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12094q implements C4550h.InterfaceC4552b<AbstractC11058e>, C4550h.InterfaceC4556f, InterfaceC10322n0, InterfaceC11748k, C10315l0.InterfaceC10317b {

    /* renamed from: g0 */
    private static final Set<Integer> f31344g0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    private final ArrayList<C12090m> f31345A;

    /* renamed from: B */
    private final Map<String, C11028l> f31346B;

    /* renamed from: C */
    private AbstractC11058e f31347C;

    /* renamed from: D */
    private C12098d[] f31348D;

    /* renamed from: F */
    private Set<Integer> f31350F;

    /* renamed from: G */
    private SparseIntArray f31351G;

    /* renamed from: H */
    private InterfaceC11732b0 f31352H;

    /* renamed from: I */
    private int f31353I;

    /* renamed from: J */
    private int f31354J;

    /* renamed from: K */
    private boolean f31355K;

    /* renamed from: L */
    private boolean f31356L;

    /* renamed from: M */
    private int f31357M;

    /* renamed from: N */
    private Format f31358N;

    /* renamed from: O */
    private Format f31359O;

    /* renamed from: P */
    private boolean f31360P;

    /* renamed from: Q */
    private TrackGroupArray f31361Q;

    /* renamed from: R */
    private Set<C10344s0> f31362R;

    /* renamed from: S */
    private int[] f31363S;

    /* renamed from: T */
    private int f31364T;

    /* renamed from: U */
    private boolean f31365U;

    /* renamed from: V */
    private boolean[] f31366V;

    /* renamed from: W */
    private boolean[] f31367W;

    /* renamed from: X */
    private long f31368X;

    /* renamed from: Y */
    private long f31369Y;

    /* renamed from: Z */
    private boolean f31370Z;

    /* renamed from: a0 */
    private boolean f31371a0;

    /* renamed from: b0 */
    private boolean f31372b0;

    /* renamed from: c0 */
    private boolean f31373c0;

    /* renamed from: d0 */
    private long f31374d0;

    /* renamed from: e0 */
    private C11028l f31375e0;

    /* renamed from: f0 */
    private C12086i f31376f0;

    /* renamed from: j */
    private final int f31377j;

    /* renamed from: k */
    private final InterfaceC12096b f31378k;

    /* renamed from: l */
    private final C12078f f31379l;

    /* renamed from: m */
    private final InterfaceC7440b f31380m;

    /* renamed from: n */
    private final Format f31381n;

    /* renamed from: o */
    private final InterfaceC11049x f31382o;

    /* renamed from: p */
    private final InterfaceC11045v.C11046a f31383p;

    /* renamed from: q */
    private final InterfaceC4548g f31384q;

    /* renamed from: s */
    private final InterfaceC10353z.C10354a f31386s;

    /* renamed from: t */
    private final int f31387t;

    /* renamed from: v */
    private final ArrayList<C12086i> f31389v;

    /* renamed from: w */
    private final List<C12086i> f31390w;

    /* renamed from: x */
    private final Runnable f31391x;

    /* renamed from: y */
    private final Runnable f31392y;

    /* renamed from: z */
    private final Handler f31393z;

    /* renamed from: r */
    private final C4550h f31385r = new C4550h("Loader:HlsSampleStreamWrapper");

    /* renamed from: u */
    private final C12078f.C12080b f31388u = new C12078f.C12080b();

    /* renamed from: E */
    private int[] f31349E = new int[0];

    /* renamed from: r7.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12096b extends InterfaceC10322n0.InterfaceC10323a<C12094q> {
        /* renamed from: a */
        void mo6172a();

        /* renamed from: o */
        void mo6171o(Uri uri);
    }

    /* renamed from: r7.q$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C12097c implements InterfaceC11732b0 {

        /* renamed from: g */
        private static final Format f31394g = new Format.C4362b().m29883e0("application/id3").m29914E();

        /* renamed from: h */
        private static final Format f31395h = new Format.C4362b().m29883e0("application/x-emsg").m29914E();

        /* renamed from: a */
        private final C6316b f31396a = new C6316b();

        /* renamed from: b */
        private final InterfaceC11732b0 f31397b;

        /* renamed from: c */
        private final Format f31398c;

        /* renamed from: d */
        private Format f31399d;

        /* renamed from: e */
        private byte[] f31400e;

        /* renamed from: f */
        private int f31401f;

        public C12097c(InterfaceC11732b0 interfaceC11732b0, int i) {
            this.f31397b = interfaceC11732b0;
            if (i != 1) {
                if (i == 3) {
                    this.f31398c = f31395h;
                } else {
                    throw new IllegalArgumentException("Unknown metadataType: " + i);
                }
            } else {
                this.f31398c = f31394g;
            }
            this.f31400e = new byte[0];
            this.f31401f = 0;
        }

        /* renamed from: g */
        private boolean m6165g(C6314a c6314a) {
            Format mo6156g = c6314a.mo6156g();
            if (mo6156g != null && C9191p0.m16257c(this.f31398c.f11197u, mo6156g.f11197u)) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        private void m6164h(int i) {
            byte[] bArr = this.f31400e;
            if (bArr.length < i) {
                this.f31400e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        /* renamed from: i */
        private C9208y m6163i(int i, int i2) {
            int i3 = this.f31401f - i2;
            C9208y c9208y = new C9208y(Arrays.copyOfRange(this.f31400e, i3 - i, i3));
            byte[] bArr = this.f31400e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f31401f = i2;
            return c9208y;
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: a */
        public /* synthetic */ void mo6170a(C9208y c9208y, int i) {
            C11730a0.m7041b(this, c9208y, i);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: b */
        public void mo6169b(C9208y c9208y, int i, int i2) {
            m6164h(this.f31401f + i);
            c9208y.m16088j(this.f31400e, this.f31401f, i);
            this.f31401f += i;
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: c */
        public void mo6168c(Format format) {
            this.f31399d = format;
            this.f31397b.mo6168c(this.f31398c);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: d */
        public /* synthetic */ int mo6167d(InterfaceC7451h interfaceC7451h, int i, boolean z) {
            return C11730a0.m7042a(this, interfaceC7451h, i, z);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: e */
        public int mo6166e(InterfaceC7451h interfaceC7451h, int i, boolean z, int i2) {
            m6164h(this.f31401f + i);
            int read = interfaceC7451h.read(this.f31400e, this.f31401f, i);
            if (read == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f31401f += read;
            return read;
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: f */
        public void mo6162f(long j, int i, int i2, int i3, InterfaceC11732b0.C11733a c11733a) {
            C9149a.m16448e(this.f31399d);
            C9208y m6163i = m6163i(i2, i3);
            if (!C9191p0.m16257c(this.f31399d.f11197u, this.f31398c.f11197u)) {
                if ("application/x-emsg".equals(this.f31399d.f11197u)) {
                    C6314a m22995c = this.f31396a.m22995c(m6163i);
                    if (!m6165g(m22995c)) {
                        C9197r.m16178h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f31398c.f11197u, m22995c.mo6156g()));
                        return;
                    }
                    m6163i = new C9208y((byte[]) C9149a.m16448e(m22995c.mo6157R()));
                } else {
                    C9197r.m16178h("EmsgUnwrappingTrackOutput", "Ignoring sample for unsupported format: " + this.f31399d.f11197u);
                    return;
                }
            }
            int m16097a = m6163i.m16097a();
            this.f31397b.mo6170a(m6163i, m16097a);
            this.f31397b.mo6162f(j, i, m16097a, i3, c11733a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r7.q$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12098d extends C10315l0 {

        /* renamed from: J */
        private final Map<String, C11028l> f31402J;

        /* renamed from: K */
        private C11028l f31403K;

        /* renamed from: f0 */
        private Metadata m6161f0(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int m29247e = metadata.m29247e();
            int i = 0;
            while (true) {
                if (i < m29247e) {
                    Metadata.InterfaceC4429b m29248d = metadata.m29248d(i);
                    if ((m29248d instanceof C7433l) && "com.apple.streaming.transportStreamTimestamp".equals(((C7433l) m29248d).f19970k)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return metadata;
            }
            if (m29247e == 1) {
                return null;
            }
            Metadata.InterfaceC4429b[] interfaceC4429bArr = new Metadata.InterfaceC4429b[m29247e - 1];
            for (int i2 = 0; i2 < m29247e; i2++) {
                if (i2 != i) {
                    interfaceC4429bArr[i2 < i ? i2 : i2 - 1] = metadata.m29248d(i2);
                }
            }
            return new Metadata(interfaceC4429bArr);
        }

        @Override // p229m7.C10315l0, p296q6.InterfaceC11732b0
        /* renamed from: f */
        public void mo6162f(long j, int i, int i2, int i3, InterfaceC11732b0.C11733a c11733a) {
            super.mo6162f(j, i, i2, i3, c11733a);
        }

        /* renamed from: g0 */
        public void m6160g0(C11028l c11028l) {
            this.f31403K = c11028l;
            m11833H();
        }

        /* renamed from: h0 */
        public void m6159h0(C12086i c12086i) {
            m11811d0(c12086i.f31298k);
        }

        @Override // p229m7.C10315l0
        /* renamed from: v */
        public Format mo6158v(Format format) {
            C11028l c11028l;
            C11028l c11028l2 = this.f31403K;
            if (c11028l2 == null) {
                c11028l2 = format.f11200x;
            }
            if (c11028l2 != null && (c11028l = this.f31402J.get(c11028l2.f28888l)) != null) {
                c11028l2 = c11028l;
            }
            Metadata m6161f0 = m6161f0(format.f11195s);
            if (c11028l2 != format.f11200x || m6161f0 != format.f11195s) {
                format = format.m29926a().m29907L(c11028l2).m29895X(m6161f0).m29914E();
            }
            return super.mo6158v(format);
        }

        private C12098d(InterfaceC7440b interfaceC7440b, Looper looper, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, Map<String, C11028l> map) {
            super(interfaceC7440b, looper, interfaceC11049x, c11046a);
            this.f31402J = map;
        }
    }

    public C12094q(int i, InterfaceC12096b interfaceC12096b, C12078f c12078f, Map<String, C11028l> map, InterfaceC7440b interfaceC7440b, long j, Format format, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a, int i2) {
        this.f31377j = i;
        this.f31378k = interfaceC12096b;
        this.f31379l = c12078f;
        this.f31346B = map;
        this.f31380m = interfaceC7440b;
        this.f31381n = format;
        this.f31382o = interfaceC11049x;
        this.f31383p = c11046a;
        this.f31384q = interfaceC4548g;
        this.f31386s = c10354a;
        this.f31387t = i2;
        Set<Integer> set = f31344g0;
        this.f31350F = new HashSet(set.size());
        this.f31351G = new SparseIntArray(set.size());
        this.f31348D = new C12098d[0];
        this.f31367W = new boolean[0];
        this.f31366V = new boolean[0];
        ArrayList<C12086i> arrayList = new ArrayList<>();
        this.f31389v = arrayList;
        this.f31390w = Collections.unmodifiableList(arrayList);
        this.f31345A = new ArrayList<>();
        this.f31391x = new Runnable() { // from class: r7.n
            @Override // java.lang.Runnable
            public final void run() {
                C12094q.this.m6211S();
            }
        };
        this.f31392y = new Runnable() { // from class: r7.o
            @Override // java.lang.Runnable
            public final void run() {
                C12094q.this.m6200b0();
            }
        };
        this.f31393z = C9191p0.m16215x();
        this.f31368X = j;
        this.f31369Y = j;
    }

    /* renamed from: A */
    private boolean m6229A(int i) {
        for (int i2 = i; i2 < this.f31389v.size(); i2++) {
            if (this.f31389v.get(i2).f31301n) {
                return false;
            }
        }
        C12086i c12086i = this.f31389v.get(i);
        for (int i3 = 0; i3 < this.f31348D.length; i3++) {
            if (this.f31348D[i3].m11839B() > c12086i.m6270m(i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private static C11745h m6227C(int i, int i2) {
        C9197r.m16178h("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C11745h();
    }

    /* renamed from: D */
    private C10315l0 m6226D(int i, int i2) {
        int length = this.f31348D.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        C12098d c12098d = new C12098d(this.f31380m, this.f31393z.getLooper(), this.f31382o, this.f31383p, this.f31346B);
        c12098d.m11815Z(this.f31368X);
        if (z) {
            c12098d.m6160g0(this.f31375e0);
        }
        c12098d.m11816Y(this.f31374d0);
        C12086i c12086i = this.f31376f0;
        if (c12086i != null) {
            c12098d.m6159h0(c12086i);
        }
        c12098d.m11813b0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f31349E, i3);
        this.f31349E = copyOf;
        copyOf[length] = i;
        this.f31348D = (C12098d[]) C9191p0.m16210z0(this.f31348D, c12098d);
        boolean[] copyOf2 = Arrays.copyOf(this.f31367W, i3);
        this.f31367W = copyOf2;
        copyOf2[length] = z;
        this.f31365U |= z;
        this.f31350F.add(Integer.valueOf(i2));
        this.f31351G.append(i2, length);
        if (m6217M(i2) > m6217M(this.f31353I)) {
            this.f31354J = length;
            this.f31353I = i2;
        }
        this.f31366V = Arrays.copyOf(this.f31366V, i3);
        return c12098d;
    }

    /* renamed from: E */
    private TrackGroupArray m6225E(C10344s0[] c10344s0Arr) {
        for (int i = 0; i < c10344s0Arr.length; i++) {
            C10344s0 c10344s0 = c10344s0Arr[i];
            Format[] formatArr = new Format[c10344s0.f27056j];
            for (int i2 = 0; i2 < c10344s0.f27056j; i2++) {
                Format m11721a = c10344s0.m11721a(i2);
                formatArr[i2] = m11721a.m29925b(this.f31382o.mo9266b(m11721a));
            }
            c10344s0Arr[i] = new C10344s0(formatArr);
        }
        return new TrackGroupArray(c10344s0Arr);
    }

    /* renamed from: F */
    private static Format m6224F(Format format, Format format2, boolean z) {
        String m16166d;
        String str;
        int i;
        int i2;
        if (format == null) {
            return format2;
        }
        int m16158l = C9200u.m16158l(format2.f11197u);
        if (C9191p0.m16295J(format.f11194r, m16158l) == 1) {
            m16166d = C9191p0.m16293K(format.f11194r, m16158l);
            str = C9200u.m16163g(m16166d);
        } else {
            m16166d = C9200u.m16166d(format.f11194r, format2.f11197u);
            str = format2.f11197u;
        }
        Format.C4362b m29887c0 = format2.m29926a().m29900S(format.f11186j).m29898U(format.f11187k).m29897V(format.f11188l).m29879g0(format.f11189m).m29887c0(format.f11190n);
        if (z) {
            i = format.f11191o;
        } else {
            i = -1;
        }
        Format.C4362b m29912G = m29887c0.m29912G(i);
        if (z) {
            i2 = format.f11192p;
        } else {
            i2 = -1;
        }
        Format.C4362b m29902Q = m29912G.m29893Z(i2).m29910I(m16166d).m29873j0(format.f11202z).m29902Q(format.f11171A);
        if (str != null) {
            m29902Q.m29883e0(str);
        }
        int i3 = format.f11178H;
        if (i3 != -1) {
            m29902Q.m29911H(i3);
        }
        Metadata metadata = format.f11195s;
        if (metadata != null) {
            Metadata metadata2 = format2.f11195s;
            if (metadata2 != null) {
                metadata = metadata2.m29249b(metadata);
            }
            m29902Q.m29895X(metadata);
        }
        return m29902Q.m29914E();
    }

    /* renamed from: G */
    private void m6223G(int i) {
        C9149a.m16447f(!this.f31385r.m28619j());
        while (true) {
            if (i < this.f31389v.size()) {
                if (m6229A(i)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m6219K().f28949h;
        C12086i m6222H = m6222H(i);
        if (this.f31389v.isEmpty()) {
            this.f31369Y = this.f31368X;
        } else {
            ((C12086i) C6712x.m22059c(this.f31389v)).m6268o();
        }
        this.f31372b0 = false;
        this.f31386s.m11708D(this.f31353I, m6222H.f28948g, j);
    }

    /* renamed from: H */
    private C12086i m6222H(int i) {
        C12086i c12086i = this.f31389v.get(i);
        ArrayList<C12086i> arrayList = this.f31389v;
        C9191p0.m16298H0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.f31348D.length; i2++) {
            this.f31348D[i2].m11796t(c12086i.m6270m(i2));
        }
        return c12086i;
    }

    /* renamed from: I */
    private boolean m6221I(C12086i c12086i) {
        int i = c12086i.f31298k;
        int length = this.f31348D.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f31366V[i2] && this.f31348D[i2].m11826O() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    private static boolean m6220J(Format format, Format format2) {
        String str = format.f11197u;
        String str2 = format2.f11197u;
        int m16158l = C9200u.m16158l(str);
        if (m16158l != 3) {
            if (m16158l == C9200u.m16158l(str2)) {
                return true;
            }
            return false;
        } else if (!C9191p0.m16257c(str, str2)) {
            return false;
        } else {
            if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || format.f11183M == format2.f11183M) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: K */
    private C12086i m6219K() {
        ArrayList<C12086i> arrayList = this.f31389v;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: L */
    private InterfaceC11732b0 m6218L(int i, int i2) {
        C9149a.m16452a(f31344g0.contains(Integer.valueOf(i2)));
        int i3 = this.f31351G.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.f31350F.add(Integer.valueOf(i2))) {
            this.f31349E[i3] = i;
        }
        if (this.f31349E[i3] == i) {
            return this.f31348D[i3];
        }
        return m6227C(i, i2);
    }

    /* renamed from: M */
    private static int m6217M(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    /* renamed from: N */
    private void m6216N(C12086i c12086i) {
        C12098d[] c12098dArr;
        this.f31376f0 = c12086i;
        this.f31358N = c12086i.f28945d;
        this.f31369Y = -9223372036854775807L;
        this.f31389v.add(c12086i);
        AbstractC6693s.C6694a m22136s = AbstractC6693s.m22136s();
        for (C12098d c12098d : this.f31348D) {
            m22136s.m22128d(Integer.valueOf(c12098d.m11835F()));
        }
        c12086i.m6269n(this, m22136s.m22127e());
        for (C12098d c12098d2 : this.f31348D) {
            c12098d2.m6159h0(c12086i);
            if (c12086i.f31301n) {
                c12098d2.m11810e0();
            }
        }
    }

    /* renamed from: O */
    private static boolean m6215O(AbstractC11058e abstractC11058e) {
        return abstractC11058e instanceof C12086i;
    }

    /* renamed from: P */
    private boolean m6214P() {
        return this.f31369Y != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    /* renamed from: R */
    private void m6212R() {
        int i = this.f31361Q.f11764j;
        int[] iArr = new int[i];
        this.f31363S = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C12098d[] c12098dArr = this.f31348D;
                if (i3 >= c12098dArr.length) {
                    break;
                } else if (m6220J((Format) C9149a.m16445h(c12098dArr[i3].m11836E()), this.f31361Q.m29144a(i2).m11721a(0))) {
                    this.f31363S[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<C12090m> it = this.f31345A.iterator();
        while (it.hasNext()) {
            it.next().m6235b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m6211S() {
        if (!this.f31360P && this.f31363S == null && this.f31355K) {
            for (C12098d c12098d : this.f31348D) {
                if (c12098d.m11836E() == null) {
                    return;
                }
            }
            if (this.f31361Q != null) {
                m6212R();
                return;
            }
            m6173z();
            m6187k0();
            this.f31378k.mo6172a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m6200b0() {
        this.f31355K = true;
        m6211S();
    }

    /* renamed from: f0 */
    private void m6193f0() {
        for (C12098d c12098d : this.f31348D) {
            c12098d.m11820U(this.f31370Z);
        }
        this.f31370Z = false;
    }

    /* renamed from: g0 */
    private boolean m6192g0(long j) {
        int length = this.f31348D.length;
        for (int i = 0; i < length; i++) {
            if (!this.f31348D[i].m11817X(j, false) && (this.f31367W[i] || !this.f31365U)) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: k0 */
    private void m6187k0() {
        this.f31356L = true;
    }

    /* renamed from: p0 */
    private void m6181p0(InterfaceC10320m0[] interfaceC10320m0Arr) {
        this.f31345A.clear();
        for (InterfaceC10320m0 interfaceC10320m0 : interfaceC10320m0Arr) {
            if (interfaceC10320m0 != null) {
                this.f31345A.add((C12090m) interfaceC10320m0);
            }
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: x */
    private void m6175x() {
        C9149a.m16447f(this.f31356L);
        C9149a.m16448e(this.f31361Q);
        C9149a.m16448e(this.f31362R);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    /* renamed from: z */
    private void m6173z() {
        Format format;
        int length = this.f31348D.length;
        boolean z = false;
        int i = 7;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = ((Format) C9149a.m16445h(this.f31348D[i3].m11836E())).f11197u;
            if (!C9200u.m16151s(str)) {
                if (C9200u.m16154p(str)) {
                    i4 = 1;
                } else if (C9200u.m16152r(str)) {
                    i4 = 3;
                } else {
                    i4 = 7;
                }
            }
            if (m6217M(i4) > m6217M(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        C10344s0 m6299i = this.f31379l.m6299i();
        int i5 = m6299i.f27056j;
        this.f31364T = -1;
        this.f31363S = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f31363S[i6] = i6;
        }
        C10344s0[] c10344s0Arr = new C10344s0[length];
        for (int i7 = 0; i7 < length; i7++) {
            Format format2 = (Format) C9149a.m16445h(this.f31348D[i7].m11836E());
            if (i7 == i2) {
                Format[] formatArr = new Format[i5];
                if (i5 == 1) {
                    formatArr[0] = format2.m29921j(m6299i.m11721a(0));
                } else {
                    for (int i8 = 0; i8 < i5; i8++) {
                        formatArr[i8] = m6224F(m6299i.m11721a(i8), format2, true);
                    }
                }
                c10344s0Arr[i7] = new C10344s0(formatArr);
                this.f31364T = i7;
            } else {
                if (i == 2 && C9200u.m16154p(format2.f11197u)) {
                    format = this.f31381n;
                } else {
                    format = null;
                }
                c10344s0Arr[i7] = new C10344s0(m6224F(format, format2, false));
            }
        }
        this.f31361Q = m6225E(c10344s0Arr);
        if (this.f31362R == null) {
            z = true;
        }
        C9149a.m16447f(z);
        this.f31362R = Collections.emptySet();
    }

    /* renamed from: B */
    public void m6228B() {
        if (!this.f31356L) {
            mo6197d(this.f31368X);
        }
    }

    /* renamed from: Q */
    public boolean m6213Q(int i) {
        return !m6214P() && this.f31348D[i].m11831J(this.f31372b0);
    }

    /* renamed from: T */
    public void m6210T() {
        this.f31385r.mo20615a();
        this.f31379l.m6295m();
    }

    /* renamed from: U */
    public void m6209U(int i) {
        m6210T();
        this.f31348D[i].m11829L();
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: V */
    public void mo5356j(AbstractC11058e abstractC11058e, long j, long j2, boolean z) {
        this.f31347C = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, abstractC11058e.m9243f(), abstractC11058e.m9244e(), j, j2, abstractC11058e.m9246b());
        this.f31384q.mo28628d(abstractC11058e.f28942a);
        this.f31386s.m11688r(loadEventInfo, abstractC11058e.f28944c, this.f31377j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h);
        if (!z) {
            if (m6214P() || this.f31357M == 0) {
                m6193f0();
            }
            if (this.f31357M > 0) {
                this.f31378k.mo6251k(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: W */
    public void mo5355k(AbstractC11058e abstractC11058e, long j, long j2) {
        this.f31347C = null;
        this.f31379l.m6294n(abstractC11058e);
        LoadEventInfo loadEventInfo = new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, abstractC11058e.m9243f(), abstractC11058e.m9244e(), j, j2, abstractC11058e.m9246b());
        this.f31384q.mo28628d(abstractC11058e.f28942a);
        this.f31386s.m11685u(loadEventInfo, abstractC11058e.f28944c, this.f31377j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h);
        if (!this.f31356L) {
            mo6197d(this.f31368X);
        } else {
            this.f31378k.mo6251k(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: X */
    public C4550h.C4553c mo5351o(AbstractC11058e abstractC11058e, long j, long j2, IOException iOException, int i) {
        boolean z;
        C4550h.C4553c c4553c;
        int i2;
        boolean m6215O = m6215O(abstractC11058e);
        if (m6215O && !((C12086i) abstractC11058e).m6266q() && (iOException instanceof InterfaceC4540f.C4546f) && ((i2 = ((InterfaceC4540f.C4546f) iOException).f12375l) == 410 || i2 == 404)) {
            return C4550h.f12385d;
        }
        long m9246b = abstractC11058e.m9246b();
        LoadEventInfo loadEventInfo = new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, abstractC11058e.m9243f(), abstractC11058e.m9244e(), j, j2, m9246b);
        InterfaceC4548g.C4549a c4549a = new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(abstractC11058e.f28944c, this.f31377j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, C7390b.m20791d(abstractC11058e.f28948g), C7390b.m20791d(abstractC11058e.f28949h)), iOException, i);
        long mo28630b = this.f31384q.mo28630b(c4549a);
        boolean z2 = false;
        if (mo28630b != -9223372036854775807L) {
            z = this.f31379l.m6296l(abstractC11058e, mo28630b);
        } else {
            z = false;
        }
        if (z) {
            if (m6215O && m9246b == 0) {
                ArrayList<C12086i> arrayList = this.f31389v;
                if (arrayList.remove(arrayList.size() - 1) == abstractC11058e) {
                    z2 = true;
                }
                C9149a.m16447f(z2);
                if (this.f31389v.isEmpty()) {
                    this.f31369Y = this.f31368X;
                } else {
                    ((C12086i) C6712x.m22059c(this.f31389v)).m6268o();
                }
            }
            c4553c = C4550h.f12387f;
        } else {
            long mo28631a = this.f31384q.mo28631a(c4549a);
            if (mo28631a != -9223372036854775807L) {
                c4553c = C4550h.m28621h(false, mo28631a);
            } else {
                c4553c = C4550h.f12388g;
            }
        }
        C4550h.C4553c c4553c2 = c4553c;
        boolean z3 = !c4553c2.m28612c();
        this.f31386s.m11683w(loadEventInfo, abstractC11058e.f28944c, this.f31377j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h, iOException, z3);
        if (z3) {
            this.f31347C = null;
            this.f31384q.mo28628d(abstractC11058e.f28942a);
        }
        if (z) {
            if (!this.f31356L) {
                mo6197d(this.f31368X);
            } else {
                this.f31378k.mo6251k(this);
            }
        }
        return c4553c2;
    }

    /* renamed from: Y */
    public void m6205Y() {
        this.f31350F.clear();
    }

    /* renamed from: Z */
    public boolean m6204Z(Uri uri, long j) {
        return this.f31379l.m6293o(uri, j);
    }

    @Override // p229m7.C10315l0.InterfaceC10317b
    /* renamed from: a */
    public void mo6203a(Format format) {
        this.f31393z.post(this.f31391x);
    }

    /* renamed from: a0 */
    public void m6202a0() {
        if (this.f31389v.isEmpty()) {
            return;
        }
        C12086i c12086i = (C12086i) C6712x.m22059c(this.f31389v);
        int m6306b = this.f31379l.m6306b(c12086i);
        if (m6306b == 1) {
            c12086i.m6261v();
        } else if (m6306b == 2 && !this.f31372b0 && this.f31385r.m28619j()) {
            this.f31385r.m28623f();
        }
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        if (m6214P()) {
            return this.f31369Y;
        }
        if (this.f31372b0) {
            return Long.MIN_VALUE;
        }
        return m6219K().f28949h;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f31385r.m28619j();
    }

    /* renamed from: c0 */
    public void m6198c0(C10344s0[] c10344s0Arr, int i, int... iArr) {
        this.f31361Q = m6225E(c10344s0Arr);
        this.f31362R = new HashSet();
        for (int i2 : iArr) {
            this.f31362R.add(this.f31361Q.m29144a(i2));
        }
        this.f31364T = i;
        Handler handler = this.f31393z;
        final InterfaceC12096b interfaceC12096b = this.f31378k;
        Objects.requireNonNull(interfaceC12096b);
        handler.post(new Runnable() { // from class: r7.p
            @Override // java.lang.Runnable
            public final void run() {
                C12094q.InterfaceC12096b.this.mo6172a();
            }
        });
        m6187k0();
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        List<C12086i> list;
        long max;
        boolean z;
        if (this.f31372b0 || this.f31385r.m28619j() || this.f31385r.m28620i()) {
            return false;
        }
        if (m6214P()) {
            list = Collections.emptyList();
            max = this.f31369Y;
            for (C12098d c12098d : this.f31348D) {
                c12098d.m11815Z(this.f31369Y);
            }
        } else {
            list = this.f31390w;
            C12086i m6219K = m6219K();
            if (m6219K.mo6275h()) {
                max = m6219K.f28949h;
            } else {
                max = Math.max(this.f31368X, m6219K.f28948g);
            }
        }
        List<C12086i> list2 = list;
        long j2 = max;
        C12078f c12078f = this.f31379l;
        if (!this.f31356L && list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        c12078f.m6304d(j, j2, list2, z, this.f31388u);
        C12078f.C12080b c12080b = this.f31388u;
        boolean z2 = c12080b.f31275b;
        AbstractC11058e abstractC11058e = c12080b.f31274a;
        Uri uri = c12080b.f31276c;
        c12080b.m6284a();
        if (z2) {
            this.f31369Y = -9223372036854775807L;
            this.f31372b0 = true;
            return true;
        } else if (abstractC11058e == null) {
            if (uri != null) {
                this.f31378k.mo6171o(uri);
            }
            return false;
        } else {
            if (m6215O(abstractC11058e)) {
                m6216N((C12086i) abstractC11058e);
            }
            this.f31347C = abstractC11058e;
            this.f31386s.m11711A(new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, this.f31385r.m28615n(abstractC11058e, this, this.f31384q.mo28629c(abstractC11058e.f28944c))), abstractC11058e.f28944c, this.f31377j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h);
            return true;
        }
    }

    /* renamed from: d0 */
    public int m6196d0(int i, C7399j c7399j, C10271g c10271g, boolean z) {
        Format format;
        if (m6214P()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f31389v.isEmpty()) {
            int i3 = 0;
            while (i3 < this.f31389v.size() - 1 && m6221I(this.f31389v.get(i3))) {
                i3++;
            }
            C9191p0.m16298H0(this.f31389v, 0, i3);
            C12086i c12086i = this.f31389v.get(0);
            Format format2 = c12086i.f28945d;
            if (!format2.equals(this.f31359O)) {
                this.f31386s.m11697i(this.f31377j, format2, c12086i.f28946e, c12086i.f28947f, c12086i.f28948g);
            }
            this.f31359O = format2;
        }
        if (!this.f31389v.isEmpty() && !this.f31389v.get(0).m6266q()) {
            return -3;
        }
        int m11824Q = this.f31348D[i].m11824Q(c7399j, c10271g, z, this.f31372b0);
        if (m11824Q == -5) {
            Format format3 = (Format) C9149a.m16448e(c7399j.f19920b);
            if (i == this.f31354J) {
                int m11826O = this.f31348D[i].m11826O();
                while (i2 < this.f31389v.size() && this.f31389v.get(i2).f31298k != m11826O) {
                    i2++;
                }
                if (i2 < this.f31389v.size()) {
                    format = this.f31389v.get(i2).f28945d;
                } else {
                    format = (Format) C9149a.m16448e(this.f31358N);
                }
                format3 = format3.m29921j(format);
            }
            c7399j.f19920b = format3;
        }
        return m11824Q;
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: e */
    public InterfaceC11732b0 mo3740e(int i, int i2) {
        InterfaceC11732b0 interfaceC11732b0;
        if (f31344g0.contains(Integer.valueOf(i2))) {
            interfaceC11732b0 = m6218L(i, i2);
        } else {
            int i3 = 0;
            while (true) {
                InterfaceC11732b0[] interfaceC11732b0Arr = this.f31348D;
                if (i3 < interfaceC11732b0Arr.length) {
                    if (this.f31349E[i3] == i) {
                        interfaceC11732b0 = interfaceC11732b0Arr[i3];
                        break;
                    }
                    i3++;
                } else {
                    interfaceC11732b0 = null;
                    break;
                }
            }
        }
        if (interfaceC11732b0 == null) {
            if (this.f31373c0) {
                return m6227C(i, i2);
            }
            interfaceC11732b0 = m6226D(i, i2);
        }
        if (i2 == 5) {
            if (this.f31352H == null) {
                this.f31352H = new C12097c(interfaceC11732b0, this.f31387t);
            }
            return this.f31352H;
        }
        return interfaceC11732b0;
    }

    /* renamed from: e0 */
    public void m6195e0() {
        if (this.f31356L) {
            for (C12098d c12098d : this.f31348D) {
                c12098d.m11825P();
            }
        }
        this.f31385r.m28616m(this);
        this.f31393z.removeCallbacksAndMessages(null);
        this.f31360P = true;
        this.f31345A.clear();
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        ArrayList<C12086i> arrayList;
        if (this.f31372b0) {
            return Long.MIN_VALUE;
        }
        if (m6214P()) {
            return this.f31369Y;
        }
        long j = this.f31368X;
        C12086i m6219K = m6219K();
        if (!m6219K.mo6275h()) {
            if (this.f31389v.size() > 1) {
                m6219K = this.f31389v.get(arrayList.size() - 2);
            } else {
                m6219K = null;
            }
        }
        if (m6219K != null) {
            j = Math.max(j, m6219K.f28949h);
        }
        if (this.f31355K) {
            for (C12098d c12098d : this.f31348D) {
                j = Math.max(j, c12098d.m11792y());
            }
        }
        return j;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        if (!this.f31385r.m28620i() && !m6214P()) {
            if (this.f31385r.m28619j()) {
                C9149a.m16448e(this.f31347C);
                if (this.f31379l.m6288t(j, this.f31347C, this.f31390w)) {
                    this.f31385r.m28623f();
                    return;
                }
                return;
            }
            int size = this.f31390w.size();
            while (size > 0 && this.f31379l.m6306b(this.f31390w.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f31390w.size()) {
                m6223G(size);
            }
            int m6301g = this.f31379l.m6301g(j, this.f31390w);
            if (m6301g < this.f31389v.size()) {
                m6223G(m6301g);
            }
        }
    }

    /* renamed from: h0 */
    public boolean m6190h0(long j, boolean z) {
        this.f31368X = j;
        if (m6214P()) {
            this.f31369Y = j;
            return true;
        }
        if (this.f31355K && !z && m6192g0(j)) {
            return false;
        }
        this.f31369Y = j;
        this.f31372b0 = false;
        this.f31389v.clear();
        if (this.f31385r.m28619j()) {
            if (this.f31355K) {
                for (C12098d c12098d : this.f31348D) {
                    c12098d.m11799q();
                }
            }
            this.f31385r.m28623f();
        } else {
            this.f31385r.m28622g();
            m6193f0();
        }
        return true;
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: i */
    public void mo3739i(InterfaceC11766y interfaceC11766y) {
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6189i0(p099f8.InterfaceC6337h[] r20, boolean[] r21, p229m7.InterfaceC10320m0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p317r7.C12094q.m6189i0(f8.h[], boolean[], m7.m0[], boolean[], long, boolean):boolean");
    }

    /* renamed from: j0 */
    public void m6188j0(C11028l c11028l) {
        if (!C9191p0.m16257c(this.f31375e0, c11028l)) {
            this.f31375e0 = c11028l;
            int i = 0;
            while (true) {
                C12098d[] c12098dArr = this.f31348D;
                if (i < c12098dArr.length) {
                    if (this.f31367W[i]) {
                        c12098dArr[i].m6160g0(c11028l);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l0 */
    public void m6186l0(boolean z) {
        this.f31379l.m6290r(z);
    }

    /* renamed from: m0 */
    public void m6185m0(long j) {
        if (this.f31374d0 != j) {
            this.f31374d0 = j;
            for (C12098d c12098d : this.f31348D) {
                c12098d.m11816Y(j);
            }
        }
    }

    /* renamed from: n0 */
    public int m6184n0(int i, long j) {
        int i2 = 0;
        if (m6214P()) {
            return 0;
        }
        C12098d c12098d = this.f31348D[i];
        int m11837D = c12098d.m11837D(j, this.f31372b0);
        int m11839B = c12098d.m11839B();
        while (true) {
            if (i2 >= this.f31389v.size()) {
                break;
            }
            C12086i c12086i = this.f31389v.get(i2);
            int m6270m = this.f31389v.get(i2).m6270m(i);
            if (m11839B + m11837D <= m6270m) {
                break;
            } else if (!c12086i.m6266q()) {
                m11837D = m6270m - m11839B;
                break;
            } else {
                i2++;
            }
        }
        c12098d.m11812c0(m11837D);
        return m11837D;
    }

    /* renamed from: o0 */
    public void m6183o0(int i) {
        m6175x();
        C9149a.m16448e(this.f31363S);
        int i2 = this.f31363S[i];
        C9149a.m16447f(this.f31366V[i2]);
        this.f31366V[i2] = false;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4556f
    /* renamed from: p */
    public void mo6182p() {
        for (C12098d c12098d : this.f31348D) {
            c12098d.m11823R();
        }
    }

    /* renamed from: r */
    public void m6180r() {
        m6210T();
        if (this.f31372b0 && !this.f31356L) {
            throw new C7402m("Loading finished before preparation is complete.");
        }
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: s */
    public void mo3738s() {
        this.f31373c0 = true;
        this.f31393z.post(this.f31392y);
    }

    /* renamed from: t */
    public TrackGroupArray m6179t() {
        m6175x();
        return this.f31361Q;
    }

    /* renamed from: u */
    public void m6178u(long j, boolean z) {
        if (this.f31355K && !m6214P()) {
            int length = this.f31348D.length;
            for (int i = 0; i < length; i++) {
                this.f31348D[i].m11800p(j, z, this.f31366V[i]);
            }
        }
    }

    /* renamed from: y */
    public int m6174y(int i) {
        m6175x();
        C9149a.m16448e(this.f31363S);
        int i2 = this.f31363S[i];
        if (i2 == -1) {
            if (!this.f31362R.contains(this.f31361Q.m29144a(i))) {
                return -2;
            }
            return -3;
        }
        boolean[] zArr = this.f31366V;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }
}
