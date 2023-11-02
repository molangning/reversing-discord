package p008a7;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p008a7.InterfaceC0052i0;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: a7.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0048h0 implements InterfaceC11746i {

    /* renamed from: t */
    public static final InterfaceC11753o f128t = new InterfaceC11753o() { // from class: a7.g0
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m41312w;
            m41312w = C0048h0.m41312w();
            return m41312w;
        }
    };

    /* renamed from: a */
    private final int f129a;

    /* renamed from: b */
    private final int f130b;

    /* renamed from: c */
    private final List<C9183l0> f131c;

    /* renamed from: d */
    private final C9208y f132d;

    /* renamed from: e */
    private final SparseIntArray f133e;

    /* renamed from: f */
    private final InterfaceC0052i0.InterfaceC0055c f134f;

    /* renamed from: g */
    private final SparseArray<InterfaceC0052i0> f135g;

    /* renamed from: h */
    private final SparseBooleanArray f136h;

    /* renamed from: i */
    private final SparseBooleanArray f137i;

    /* renamed from: j */
    private final C0044f0 f138j;

    /* renamed from: k */
    private C0041e0 f139k;

    /* renamed from: l */
    private InterfaceC11748k f140l;

    /* renamed from: m */
    private int f141m;

    /* renamed from: n */
    private boolean f142n;

    /* renamed from: o */
    private boolean f143o;

    /* renamed from: p */
    private boolean f144p;

    /* renamed from: q */
    private InterfaceC0052i0 f145q;

    /* renamed from: r */
    private int f146r;

    /* renamed from: s */
    private int f147s;

    /* renamed from: a7.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C0049a implements InterfaceC0035b0 {

        /* renamed from: a */
        private final C9207x f148a = new C9207x(new byte[4]);

        public C0049a() {
            C0048h0.this = r2;
        }

        @Override // p008a7.InterfaceC0035b0
        /* renamed from: a */
        public void mo41205a(C9208y c9208y) {
            if (c9208y.m16111D() != 0 || (c9208y.m16111D() & 128) == 0) {
                return;
            }
            c9208y.m16098Q(6);
            int m16097a = c9208y.m16097a() / 4;
            for (int i = 0; i < m16097a; i++) {
                c9208y.m16089i(this.f148a, 4);
                int m16126h = this.f148a.m16126h(16);
                this.f148a.m16116r(3);
                if (m16126h == 0) {
                    this.f148a.m16116r(13);
                } else {
                    int m16126h2 = this.f148a.m16126h(13);
                    if (C0048h0.this.f135g.get(m16126h2) == null) {
                        C0048h0.this.f135g.put(m16126h2, new C0037c0(new C0050b(m16126h2)));
                        C0048h0.m41324k(C0048h0.this);
                    }
                }
            }
            if (C0048h0.this.f129a != 2) {
                C0048h0.this.f135g.remove(0);
            }
        }

        @Override // p008a7.InterfaceC0035b0
        /* renamed from: b */
        public void mo41204b(C9183l0 c9183l0, InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        }
    }

    /* renamed from: a7.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C0050b implements InterfaceC0035b0 {

        /* renamed from: a */
        private final C9207x f150a = new C9207x(new byte[5]);

        /* renamed from: b */
        private final SparseArray<InterfaceC0052i0> f151b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f152c = new SparseIntArray();

        /* renamed from: d */
        private final int f153d;

        public C0050b(int i) {
            C0048h0.this = r2;
            this.f153d = i;
        }

        /* renamed from: c */
        private InterfaceC0052i0.C0054b m41308c(C9208y c9208y, int i) {
            int m16093e = c9208y.m16093e();
            int i2 = i + m16093e;
            int i3 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (c9208y.m16093e() < i2) {
                int m16111D = c9208y.m16111D();
                int m16093e2 = c9208y.m16093e() + c9208y.m16111D();
                if (m16093e2 > i2) {
                    break;
                }
                if (m16111D == 5) {
                    long m16109F = c9208y.m16109F();
                    if (m16109F != 1094921523) {
                        if (m16109F != 1161904947) {
                            if (m16109F != 1094921524) {
                                if (m16109F == 1212503619) {
                                    i3 = 36;
                                }
                            }
                            i3 = 172;
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (m16111D != 106) {
                        if (m16111D != 122) {
                            if (m16111D == 127) {
                                if (c9208y.m16111D() != 21) {
                                }
                                i3 = 172;
                            } else if (m16111D == 123) {
                                i3 = 138;
                            } else if (m16111D == 10) {
                                str = c9208y.m16114A(3).trim();
                            } else if (m16111D == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c9208y.m16093e() < m16093e2) {
                                    String trim = c9208y.m16114A(3).trim();
                                    int m16111D2 = c9208y.m16111D();
                                    byte[] bArr = new byte[4];
                                    c9208y.m16088j(bArr, 0, 4);
                                    arrayList2.add(new InterfaceC0052i0.C0053a(trim, m16111D2, bArr));
                                }
                                arrayList = arrayList2;
                                i3 = 89;
                            } else if (m16111D == 111) {
                                i3 = 257;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                c9208y.m16098Q(m16093e2 - c9208y.m16093e());
            }
            c9208y.m16099P(i2);
            return new InterfaceC0052i0.C0054b(i3, str, arrayList, Arrays.copyOfRange(c9208y.m16094d(), m16093e, i2));
        }

        @Override // p008a7.InterfaceC0035b0
        /* renamed from: a */
        public void mo41205a(C9208y c9208y) {
            C9183l0 c9183l0;
            int i;
            InterfaceC0052i0 mo41284b;
            if (c9208y.m16111D() != 2) {
                return;
            }
            if (C0048h0.this.f129a != 1 && C0048h0.this.f129a != 2 && C0048h0.this.f141m != 1) {
                c9183l0 = new C9183l0(((C9183l0) C0048h0.this.f131c.get(0)).m16344c());
                C0048h0.this.f131c.add(c9183l0);
            } else {
                c9183l0 = (C9183l0) C0048h0.this.f131c.get(0);
            }
            if ((c9208y.m16111D() & 128) == 0) {
                return;
            }
            c9208y.m16098Q(1);
            int m16105J = c9208y.m16105J();
            int i2 = 3;
            c9208y.m16098Q(3);
            c9208y.m16089i(this.f150a, 2);
            this.f150a.m16116r(3);
            int i3 = 13;
            C0048h0.this.f147s = this.f150a.m16126h(13);
            c9208y.m16089i(this.f150a, 2);
            int i4 = 4;
            this.f150a.m16116r(4);
            c9208y.m16098Q(this.f150a.m16126h(12));
            if (C0048h0.this.f129a == 2 && C0048h0.this.f145q == null) {
                InterfaceC0052i0.C0054b c0054b = new InterfaceC0052i0.C0054b(21, null, null, C9191p0.f24176f);
                C0048h0 c0048h0 = C0048h0.this;
                c0048h0.f145q = c0048h0.f134f.mo41284b(21, c0054b);
                C0048h0.this.f145q.mo41201b(c9183l0, C0048h0.this.f140l, new InterfaceC0052i0.C0056d(m16105J, 21, 8192));
            }
            this.f151b.clear();
            this.f152c.clear();
            int m16097a = c9208y.m16097a();
            while (m16097a > 0) {
                c9208y.m16089i(this.f150a, 5);
                int m16126h = this.f150a.m16126h(8);
                this.f150a.m16116r(i2);
                int m16126h2 = this.f150a.m16126h(i3);
                this.f150a.m16116r(i4);
                int m16126h3 = this.f150a.m16126h(12);
                InterfaceC0052i0.C0054b m41308c = m41308c(c9208y, m16126h3);
                if (m16126h == 6 || m16126h == 5) {
                    m16126h = m41308c.f180a;
                }
                m16097a -= m16126h3 + 5;
                if (C0048h0.this.f129a == 2) {
                    i = m16126h;
                } else {
                    i = m16126h2;
                }
                if (!C0048h0.this.f136h.get(i)) {
                    if (C0048h0.this.f129a == 2 && m16126h == 21) {
                        mo41284b = C0048h0.this.f145q;
                    } else {
                        mo41284b = C0048h0.this.f134f.mo41284b(m16126h, m41308c);
                    }
                    if (C0048h0.this.f129a != 2 || m16126h2 < this.f152c.get(i, 8192)) {
                        this.f152c.put(i, m16126h2);
                        this.f151b.put(i, mo41284b);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
            }
            int size = this.f152c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.f152c.keyAt(i5);
                int valueAt = this.f152c.valueAt(i5);
                C0048h0.this.f136h.put(keyAt, true);
                C0048h0.this.f137i.put(valueAt, true);
                InterfaceC0052i0 valueAt2 = this.f151b.valueAt(i5);
                if (valueAt2 != null) {
                    if (valueAt2 != C0048h0.this.f145q) {
                        valueAt2.mo41201b(c9183l0, C0048h0.this.f140l, new InterfaceC0052i0.C0056d(m16105J, keyAt, 8192));
                    }
                    C0048h0.this.f135g.put(valueAt, valueAt2);
                }
            }
            if (C0048h0.this.f129a == 2) {
                if (!C0048h0.this.f142n) {
                    C0048h0.this.f140l.mo3738s();
                    C0048h0.this.f141m = 0;
                    C0048h0.this.f142n = true;
                    return;
                }
                return;
            }
            C0048h0.this.f135g.remove(this.f153d);
            C0048h0 c0048h02 = C0048h0.this;
            c0048h02.f141m = c0048h02.f129a == 1 ? 0 : C0048h0.this.f141m - 1;
            if (C0048h0.this.f141m == 0) {
                C0048h0.this.f140l.mo3738s();
                C0048h0.this.f142n = true;
            }
        }

        @Override // p008a7.InterfaceC0035b0
        /* renamed from: b */
        public void mo41204b(C9183l0 c9183l0, InterfaceC11748k interfaceC11748k, InterfaceC0052i0.C0056d c0056d) {
        }
    }

    public C0048h0() {
        this(0);
    }

    /* renamed from: k */
    static /* synthetic */ int m41324k(C0048h0 c0048h0) {
        int i = c0048h0.f141m;
        c0048h0.f141m = i + 1;
        return i;
    }

    /* renamed from: u */
    private boolean m41314u(InterfaceC11747j interfaceC11747j) {
        byte[] m16094d = this.f132d.m16094d();
        if (9400 - this.f132d.m16093e() < 188) {
            int m16097a = this.f132d.m16097a();
            if (m16097a > 0) {
                System.arraycopy(m16094d, this.f132d.m16093e(), m16094d, 0, m16097a);
            }
            this.f132d.m16101N(m16094d, m16097a);
        }
        while (this.f132d.m16097a() < 188) {
            int m16092f = this.f132d.m16092f();
            int read = interfaceC11747j.read(m16094d, m16092f, 9400 - m16092f);
            if (read == -1) {
                return false;
            }
            this.f132d.m16100O(m16092f + read);
        }
        return true;
    }

    /* renamed from: v */
    private int m41313v() {
        int m16093e = this.f132d.m16093e();
        int m16092f = this.f132d.m16092f();
        int m41279a = C0058j0.m41279a(this.f132d.m16094d(), m16093e, m16092f);
        this.f132d.m16099P(m41279a);
        int i = m41279a + 188;
        if (i > m16092f) {
            int i2 = this.f146r + (m41279a - m16093e);
            this.f146r = i2;
            if (this.f129a == 2 && i2 > 376) {
                throw new C7402m("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f146r = 0;
        }
        return i;
    }

    /* renamed from: w */
    public static /* synthetic */ InterfaceC11746i[] m41312w() {
        return new InterfaceC11746i[]{new C0048h0()};
    }

    /* renamed from: x */
    private void m41311x(long j) {
        if (!this.f143o) {
            this.f143o = true;
            if (this.f138j.m41345b() != -9223372036854775807L) {
                C0041e0 c0041e0 = new C0041e0(this.f138j.m41344c(), this.f138j.m41345b(), j, this.f147s, this.f130b);
                this.f139k = c0041e0;
                this.f140l.mo3739i(c0041e0.m7078b());
                return;
            }
            this.f140l.mo3739i(new InterfaceC11766y.C11768b(this.f138j.m41345b()));
        }
    }

    /* renamed from: y */
    private void m41310y() {
        this.f136h.clear();
        this.f135g.clear();
        SparseArray<InterfaceC0052i0> mo41285a = this.f134f.mo41285a();
        int size = mo41285a.size();
        for (int i = 0; i < size; i++) {
            this.f135g.put(mo41285a.keyAt(i), mo41285a.valueAt(i));
        }
        this.f135g.put(0, new C0037c0(new C0049a()));
        this.f145q = null;
    }

    /* renamed from: z */
    private boolean m41309z(int i) {
        if (this.f129a != 2 && !this.f142n && this.f137i.get(i, false)) {
            return false;
        }
        return true;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        boolean z;
        C0041e0 c0041e0;
        boolean z2;
        if (this.f129a != 2) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        int size = this.f131c.size();
        for (int i = 0; i < size; i++) {
            C9183l0 c9183l0 = this.f131c.get(i);
            if (c9183l0.m16342e() == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || (c9183l0.m16342e() != 0 && c9183l0.m16344c() != j2)) {
                c9183l0.m16340g(j2);
            }
        }
        if (j2 != 0 && (c0041e0 = this.f139k) != null) {
            c0041e0.m7072h(j2);
        }
        this.f132d.m16103L(0);
        this.f133e.clear();
        for (int i2 = 0; i2 < this.f135g.size(); i2++) {
            this.f135g.valueAt(i2).mo41200c();
        }
        this.f146r = 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f140l = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int i;
        boolean z;
        boolean z2;
        InterfaceC0052i0 interfaceC0052i0;
        int i2;
        boolean z3;
        long length = interfaceC11747j.getLength();
        if (this.f142n) {
            if (length != -1 && this.f129a != 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && !this.f138j.m41343d()) {
                return this.f138j.m41342e(interfaceC11747j, c11765x, this.f147s);
            }
            m41311x(length);
            if (this.f144p) {
                this.f144p = false;
                mo663a(0L, 0L);
                if (interfaceC11747j.getPosition() != 0) {
                    c11765x.f30668a = 0L;
                    return 1;
                }
            }
            C0041e0 c0041e0 = this.f139k;
            if (c0041e0 != null && c0041e0.m7076d()) {
                return this.f139k.m7077c(interfaceC11747j, c11765x);
            }
        }
        if (!m41314u(interfaceC11747j)) {
            return -1;
        }
        int m41313v = m41313v();
        int m16092f = this.f132d.m16092f();
        if (m41313v > m16092f) {
            return 0;
        }
        int m16084n = this.f132d.m16084n();
        if ((8388608 & m16084n) != 0) {
            this.f132d.m16099P(m41313v);
            return 0;
        }
        if ((4194304 & m16084n) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i | 0;
        int i4 = (2096896 & m16084n) >> 8;
        if ((m16084n & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((m16084n & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            interfaceC0052i0 = this.f135g.get(i4);
        } else {
            interfaceC0052i0 = null;
        }
        if (interfaceC0052i0 == null) {
            this.f132d.m16099P(m41313v);
            return 0;
        }
        if (this.f129a != 2) {
            int i5 = m16084n & 15;
            int i6 = this.f133e.get(i4, i5 - 1);
            this.f133e.put(i4, i5);
            if (i6 == i5) {
                this.f132d.m16099P(m41313v);
                return 0;
            } else if (i5 != ((i6 + 1) & 15)) {
                interfaceC0052i0.mo41200c();
            }
        }
        if (z) {
            int m16111D = this.f132d.m16111D();
            if ((this.f132d.m16111D() & 64) != 0) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            i3 |= i2;
            this.f132d.m16098Q(m16111D - 1);
        }
        boolean z4 = this.f142n;
        if (m41309z(i4)) {
            this.f132d.m16100O(m41313v);
            interfaceC0052i0.mo41202a(this.f132d, i3);
            this.f132d.m16100O(m16092f);
        }
        if (this.f129a != 2 && !z4 && this.f142n && length != -1) {
            this.f144p = true;
        }
        this.f132d.m16099P(m41313v);
        return 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        boolean z;
        byte[] m16094d = this.f132d.m16094d();
        interfaceC11747j.mo6963n(m16094d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 < 5) {
                    if (m16094d[(i2 * 188) + i] != 71) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                interfaceC11747j.mo6965k(i);
                return true;
            }
        }
        return false;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C0048h0(int i) {
        this(1, i, 112800);
    }

    public C0048h0(int i, int i2, int i3) {
        this(i, new C9183l0(0L), new C0057j(i2), i3);
    }

    public C0048h0(int i, C9183l0 c9183l0, InterfaceC0052i0.InterfaceC0055c interfaceC0055c) {
        this(i, c9183l0, interfaceC0055c, 112800);
    }

    public C0048h0(int i, C9183l0 c9183l0, InterfaceC0052i0.InterfaceC0055c interfaceC0055c, int i2) {
        this.f134f = (InterfaceC0052i0.InterfaceC0055c) C9149a.m16448e(interfaceC0055c);
        this.f130b = i2;
        this.f129a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.f131c = arrayList;
            arrayList.add(c9183l0);
        } else {
            this.f131c = Collections.singletonList(c9183l0);
        }
        this.f132d = new C9208y(new byte[9400], 0);
        this.f136h = new SparseBooleanArray();
        this.f137i = new SparseBooleanArray();
        this.f135g = new SparseArray<>();
        this.f133e = new SparseIntArray();
        this.f138j = new C0044f0(i2);
        this.f147s = -1;
        m41310y();
    }
}