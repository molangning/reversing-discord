package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.C4467e;
import com.google.android.exoplayer2.source.dash.InterfaceC4458a;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p099f8.InterfaceC6337h;
import p151i6.C7410u;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7467t;
import p153i8.InterfaceC7472x;
import p177jb.C8891c;
import p195k8.C9191p0;
import p229m7.C10311k;
import p229m7.C10344s0;
import p229m7.InterfaceC10298h;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10322n0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p260o7.C11062h;
import p297q7.AbstractC11779i;
import p297q7.C11770a;
import p297q7.C11771b;
import p297q7.C11774d;
import p297q7.C11775e;
import p297q7.C11776f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.dash.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4460b implements InterfaceC10329p, InterfaceC10322n0.InterfaceC10323a<C11062h<InterfaceC4458a>>, C11062h.InterfaceC11064b<InterfaceC4458a> {

    /* renamed from: F */
    private static final Pattern f11827F = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: G */
    private static final Pattern f11828G = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: B */
    private InterfaceC10322n0 f11830B;

    /* renamed from: C */
    private C11771b f11831C;

    /* renamed from: D */
    private int f11832D;

    /* renamed from: E */
    private List<C11775e> f11833E;

    /* renamed from: j */
    final int f11834j;

    /* renamed from: k */
    private final InterfaceC4458a.InterfaceC4459a f11835k;

    /* renamed from: l */
    private final InterfaceC7472x f11836l;

    /* renamed from: m */
    private final InterfaceC11049x f11837m;

    /* renamed from: n */
    private final InterfaceC4548g f11838n;

    /* renamed from: o */
    private final long f11839o;

    /* renamed from: p */
    private final InterfaceC7467t f11840p;

    /* renamed from: q */
    private final InterfaceC7440b f11841q;

    /* renamed from: r */
    private final TrackGroupArray f11842r;

    /* renamed from: s */
    private final C4461a[] f11843s;

    /* renamed from: t */
    private final InterfaceC10298h f11844t;

    /* renamed from: u */
    private final C4467e f11845u;

    /* renamed from: w */
    private final InterfaceC10353z.C10354a f11847w;

    /* renamed from: x */
    private final InterfaceC11045v.C11046a f11848x;

    /* renamed from: y */
    private InterfaceC10329p.InterfaceC10330a f11849y;

    /* renamed from: z */
    private C11062h<InterfaceC4458a>[] f11850z = m29085F(0);

    /* renamed from: A */
    private C4466d[] f11829A = new C4466d[0];

    /* renamed from: v */
    private final IdentityHashMap<C11062h<InterfaceC4458a>, C4467e.C4470c> f11846v = new IdentityHashMap<>();

    /* renamed from: com.google.android.exoplayer2.source.dash.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4461a {

        /* renamed from: a */
        public final int[] f11851a;

        /* renamed from: b */
        public final int f11852b;

        /* renamed from: c */
        public final int f11853c;

        /* renamed from: d */
        public final int f11854d;

        /* renamed from: e */
        public final int f11855e;

        /* renamed from: f */
        public final int f11856f;

        /* renamed from: g */
        public final int f11857g;

        private C4461a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f11852b = i;
            this.f11851a = iArr;
            this.f11853c = i2;
            this.f11855e = i3;
            this.f11856f = i4;
            this.f11857g = i5;
            this.f11854d = i6;
        }

        /* renamed from: a */
        public static C4461a m29069a(int[] iArr, int i) {
            return new C4461a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static C4461a m29068b(int[] iArr, int i) {
            return new C4461a(5, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: c */
        public static C4461a m29067c(int i) {
            return new C4461a(5, 2, new int[0], -1, -1, -1, i);
        }

        /* renamed from: d */
        public static C4461a m29066d(int i, int[] iArr, int i2, int i3, int i4) {
            return new C4461a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C4460b(int i, C11771b c11771b, int i2, InterfaceC4458a.InterfaceC4459a interfaceC4459a, InterfaceC7472x interfaceC7472x, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a, long j, InterfaceC7467t interfaceC7467t, InterfaceC7440b interfaceC7440b, InterfaceC10298h interfaceC10298h, C4467e.InterfaceC4469b interfaceC4469b) {
        this.f11834j = i;
        this.f11831C = c11771b;
        this.f11832D = i2;
        this.f11835k = interfaceC4459a;
        this.f11836l = interfaceC7472x;
        this.f11837m = interfaceC11049x;
        this.f11848x = c11046a;
        this.f11838n = interfaceC4548g;
        this.f11847w = c10354a;
        this.f11839o = j;
        this.f11840p = interfaceC7467t;
        this.f11841q = interfaceC7440b;
        this.f11844t = interfaceC10298h;
        this.f11845u = new C4467e(c11771b, interfaceC4469b, interfaceC7440b);
        this.f11830B = interfaceC10298h.mo11874a(this.f11850z);
        C11776f m6955d = c11771b.m6955d(i2);
        List<C11775e> list = m6955d.f30718d;
        this.f11833E = list;
        Pair<TrackGroupArray, C4461a[]> m29074v = m29074v(interfaceC11049x, m6955d.f30717c, list);
        this.f11842r = (TrackGroupArray) m29074v.first;
        this.f11843s = (C4461a[]) m29074v.second;
    }

    /* renamed from: A */
    private static int[][] m29090A(List<C11770a> list) {
        int i;
        C11774d m29073w;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(list.get(i2).f30676a, i2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i2));
            arrayList.add(arrayList2);
            sparseArray.put(i2, arrayList2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            C11770a c11770a = list.get(i3);
            C11774d m29071y = m29071y(c11770a.f30680e);
            if (m29071y == null) {
                m29071y = m29071y(c11770a.f30681f);
            }
            if (m29071y == null || (i = sparseIntArray.get(Integer.parseInt(m29071y.f30708b), -1)) == -1) {
                i = i3;
            }
            if (i == i3 && (m29073w = m29073w(c11770a.f30681f)) != null) {
                for (String str : C9191p0.m16286N0(m29073w.f30708b, ",")) {
                    int i4 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i4 != -1) {
                        i = Math.min(i, i4);
                    }
                }
            }
            if (i != i3) {
                List list2 = (List) sparseArray.get(i3);
                List list3 = (List) sparseArray.get(i);
                list3.addAll(list2);
                sparseArray.put(i3, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            int[] m17070k = C8891c.m17070k((Collection) arrayList.get(i5));
            iArr[i5] = m17070k;
            Arrays.sort(m17070k);
        }
        return iArr;
    }

    /* renamed from: B */
    private int m29089B(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f11843s[i2].f11855e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f11843s[i5].f11853c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: C */
    private int[] m29088C(InterfaceC6337h[] interfaceC6337hArr) {
        int[] iArr = new int[interfaceC6337hArr.length];
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC6337h interfaceC6337h = interfaceC6337hArr[i];
            if (interfaceC6337h != null) {
                iArr[i] = this.f11842r.m29143b(interfaceC6337h.mo22888i());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: D */
    private static boolean m29087D(List<C11770a> list, int[] iArr) {
        for (int i : iArr) {
            List<AbstractC11779i> list2 = list.get(i).f30678c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f30733e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private static int m29086E(int i, List<C11770a> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m29087D(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            Format[] m29070z = m29070z(list, iArr[i3]);
            formatArr[i3] = m29070z;
            if (m29070z.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: F */
    private static C11062h<InterfaceC4458a>[] m29085F(int i) {
        return new C11062h[i];
    }

    /* renamed from: H */
    private static Format[] m29083H(C11774d c11774d, Pattern pattern, Format format) {
        String str = c11774d.f30708b;
        if (str == null) {
            return new Format[]{format};
        }
        String[] m16286N0 = C9191p0.m16286N0(str, ";");
        Format[] formatArr = new Format[m16286N0.length];
        for (int i = 0; i < m16286N0.length; i++) {
            Matcher matcher = pattern.matcher(m16286N0[i]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            formatArr[i] = format.m29926a().m29900S(format.f11186j + ":" + parseInt).m29913F(parseInt).m29897V(matcher.group(2)).m29914E();
        }
        return formatArr;
    }

    /* renamed from: J */
    private void m29081J(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr) {
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            if (interfaceC6337hArr[i] == null || !zArr[i]) {
                InterfaceC10320m0 interfaceC10320m0 = interfaceC10320m0Arr[i];
                if (interfaceC10320m0 instanceof C11062h) {
                    ((C11062h) interfaceC10320m0).m9220Q(this);
                } else if (interfaceC10320m0 instanceof C11062h.C11063a) {
                    ((C11062h.C11063a) interfaceC10320m0).m9208c();
                }
                interfaceC10320m0Arr[i] = null;
            }
        }
    }

    /* renamed from: K */
    private void m29080K(InterfaceC6337h[] interfaceC6337hArr, InterfaceC10320m0[] interfaceC10320m0Arr, int[] iArr) {
        boolean z;
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC10320m0 interfaceC10320m0 = interfaceC10320m0Arr[i];
            if ((interfaceC10320m0 instanceof C10311k) || (interfaceC10320m0 instanceof C11062h.C11063a)) {
                int m29089B = m29089B(i, iArr);
                if (m29089B == -1) {
                    z = interfaceC10320m0Arr[i] instanceof C10311k;
                } else {
                    InterfaceC10320m0 interfaceC10320m02 = interfaceC10320m0Arr[i];
                    if ((interfaceC10320m02 instanceof C11062h.C11063a) && ((C11062h.C11063a) interfaceC10320m02).f28976j == interfaceC10320m0Arr[m29089B]) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    InterfaceC10320m0 interfaceC10320m03 = interfaceC10320m0Arr[i];
                    if (interfaceC10320m03 instanceof C11062h.C11063a) {
                        ((C11062h.C11063a) interfaceC10320m03).m9208c();
                    }
                    interfaceC10320m0Arr[i] = null;
                }
            }
        }
    }

    /* renamed from: L */
    private void m29079L(InterfaceC6337h[] interfaceC6337hArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC6337h interfaceC6337h = interfaceC6337hArr[i];
            if (interfaceC6337h != null) {
                InterfaceC10320m0 interfaceC10320m0 = interfaceC10320m0Arr[i];
                if (interfaceC10320m0 == null) {
                    zArr[i] = true;
                    C4461a c4461a = this.f11843s[iArr[i]];
                    int i2 = c4461a.f11853c;
                    if (i2 == 0) {
                        interfaceC10320m0Arr[i] = m29075s(c4461a, interfaceC6337h, j);
                    } else if (i2 == 2) {
                        interfaceC10320m0Arr[i] = new C4466d(this.f11833E.get(c4461a.f11854d), interfaceC6337h.mo22888i().m11721a(0), this.f11831C.f30685d);
                    }
                } else if (interfaceC10320m0 instanceof C11062h) {
                    ((InterfaceC4458a) ((C11062h) interfaceC10320m0).m9232E()).mo29065b(interfaceC6337h);
                }
            }
        }
        for (int i3 = 0; i3 < interfaceC6337hArr.length; i3++) {
            if (interfaceC10320m0Arr[i3] == null && interfaceC6337hArr[i3] != null) {
                C4461a c4461a2 = this.f11843s[iArr[i3]];
                if (c4461a2.f11853c == 1) {
                    int m29089B = m29089B(i3, iArr);
                    if (m29089B == -1) {
                        interfaceC10320m0Arr[i3] = new C10311k();
                    } else {
                        interfaceC10320m0Arr[i3] = ((C11062h) interfaceC10320m0Arr[m29089B]).m9217T(j, c4461a2.f11852b);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private static void m29077i(List<C11775e> list, C10344s0[] c10344s0Arr, C4461a[] c4461aArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            c10344s0Arr[i] = new C10344s0(new Format.C4362b().m29900S(list.get(i2).m6883a()).m29883e0("application/x-emsg").m29914E());
            c4461aArr[i] = C4461a.m29067c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: p */
    private static int m29076p(InterfaceC11049x interfaceC11049x, List<C11770a> list, int[][] iArr, int i, boolean[] zArr, Format[][] formatArr, C10344s0[] c10344s0Arr, C4461a[] c4461aArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).f30678c);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i7 = 0; i7 < size; i7++) {
                Format format = ((AbstractC11779i) arrayList.get(i7)).f30730b;
                formatArr2[i7] = format.m29925b(interfaceC11049x.mo9266b(format));
            }
            C11770a c11770a = list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8 + 1;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (formatArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            c10344s0Arr[i5] = new C10344s0(formatArr2);
            c4461aArr[i5] = C4461a.m29066d(c11770a.f30677b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                c10344s0Arr[i8] = new C10344s0(new Format.C4362b().m29900S(c11770a.f30676a + ":emsg").m29883e0("application/x-emsg").m29914E());
                c4461aArr[i8] = C4461a.m29068b(iArr2, i5);
            }
            if (i2 != -1) {
                c10344s0Arr[i2] = new C10344s0(formatArr[i4]);
                c4461aArr[i2] = C4461a.m29069a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: s */
    private C11062h<InterfaceC4458a> m29075s(C4461a c4461a, InterfaceC6337h interfaceC6337h, long j) {
        boolean z;
        int i;
        C10344s0 c10344s0;
        boolean z2;
        C10344s0 c10344s02;
        int i2;
        int i3 = c4461a.f11856f;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
        }
        C4467e.C4470c c4470c = null;
        if (z) {
            c10344s0 = this.f11842r.m29144a(i3);
            i = 1;
        } else {
            i = 0;
            c10344s0 = null;
        }
        int i4 = c4461a.f11857g;
        if (i4 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c10344s02 = this.f11842r.m29144a(i4);
            i += c10344s02.f27056j;
        } else {
            c10344s02 = null;
        }
        Format[] formatArr = new Format[i];
        int[] iArr = new int[i];
        if (z) {
            formatArr[0] = c10344s0.m11721a(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < c10344s02.f27056j; i5++) {
                Format m11721a = c10344s02.m11721a(i5);
                formatArr[i2] = m11721a;
                iArr[i2] = 3;
                arrayList.add(m11721a);
                i2++;
            }
        }
        if (this.f11831C.f30685d && z) {
            c4470c = this.f11845u.m29030k();
        }
        C4467e.C4470c c4470c2 = c4470c;
        C11062h<InterfaceC4458a> c11062h = new C11062h<>(c4461a.f11852b, iArr, formatArr, this.f11835k.mo29057a(this.f11840p, this.f11831C, this.f11832D, c4461a.f11851a, interfaceC6337h, c4461a.f11852b, this.f11839o, z, arrayList, c4470c2, this.f11836l), this, this.f11841q, j, this.f11837m, this.f11848x, this.f11838n, this.f11847w);
        synchronized (this) {
            this.f11846v.put(c11062h, c4470c2);
        }
        return c11062h;
    }

    /* renamed from: v */
    private static Pair<TrackGroupArray, C4461a[]> m29074v(InterfaceC11049x interfaceC11049x, List<C11770a> list, List<C11775e> list2) {
        int[][] m29090A = m29090A(list);
        int length = m29090A.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length];
        int m29086E = m29086E(length, list, m29090A, zArr, formatArr) + length + list2.size();
        C10344s0[] c10344s0Arr = new C10344s0[m29086E];
        C4461a[] c4461aArr = new C4461a[m29086E];
        m29077i(list2, c10344s0Arr, c4461aArr, m29076p(interfaceC11049x, list, m29090A, length, zArr, formatArr, c10344s0Arr, c4461aArr));
        return Pair.create(new TrackGroupArray(c10344s0Arr), c4461aArr);
    }

    /* renamed from: w */
    private static C11774d m29073w(List<C11774d> list) {
        return m29072x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: x */
    private static C11774d m29072x(List<C11774d> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C11774d c11774d = list.get(i);
            if (str.equals(c11774d.f30707a)) {
                return c11774d;
            }
        }
        return null;
    }

    /* renamed from: y */
    private static C11774d m29071y(List<C11774d> list) {
        return m29072x(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: z */
    private static Format[] m29070z(List<C11770a> list, int[] iArr) {
        for (int i : iArr) {
            C11770a c11770a = list.get(i);
            List<C11774d> list2 = list.get(i).f30679d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C11774d c11774d = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c11774d.f30707a)) {
                    return m29083H(c11774d, f11827F, new Format.C4362b().m29883e0("application/cea-608").m29900S(c11770a.f30676a + ":cea608").m29914E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(c11774d.f30707a)) {
                    return m29083H(c11774d, f11828G, new Format.C4362b().m29883e0("application/cea-708").m29900S(c11770a.f30676a + ":cea708").m29914E());
                }
            }
        }
        return new Format[0];
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: G */
    public void mo6251k(C11062h<InterfaceC4458a> c11062h) {
        this.f11849y.mo6251k(this);
    }

    /* renamed from: I */
    public void m29082I() {
        this.f11845u.m29026o();
        for (C11062h<InterfaceC4458a> c11062h : this.f11850z) {
            c11062h.m9220Q(this);
        }
        this.f11849y = null;
    }

    /* renamed from: M */
    public void m29078M(C11771b c11771b, int i) {
        C4466d[] c4466dArr;
        this.f11831C = c11771b;
        this.f11832D = i;
        this.f11845u.m29024q(c11771b);
        C11062h<InterfaceC4458a>[] c11062hArr = this.f11850z;
        if (c11062hArr != null) {
            for (C11062h<InterfaceC4458a> c11062h : c11062hArr) {
                c11062h.m9232E().mo29064c(c11771b, i);
            }
            this.f11849y.mo6251k(this);
        }
        this.f11833E = c11771b.m6955d(i).f30718d;
        for (C4466d c4466d : this.f11829A) {
            Iterator<C11775e> it = this.f11833E.iterator();
            while (true) {
                if (it.hasNext()) {
                    C11775e next = it.next();
                    if (next.m6883a().equals(c4466d.m29043b())) {
                        boolean z = true;
                        c4466d.m29041d(next, (c11771b.f30685d && i == c11771b.m6954e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        return this.f11830B.mo6201b();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f11830B.mo6199c();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        return this.f11830B.mo6197d(j);
    }

    @Override // p260o7.C11062h.InterfaceC11064b
    /* renamed from: e */
    public synchronized void mo9207e(C11062h<InterfaceC4458a> c11062h) {
        C4467e.C4470c remove = this.f11846v.remove(c11062h);
        if (remove != null) {
            remove.m29014n();
        }
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        return this.f11830B.mo6194f();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        C11062h<InterfaceC4458a>[] c11062hArr;
        for (C11062h<InterfaceC4458a> c11062h : this.f11850z) {
            if (c11062h.f28959j == 2) {
                return c11062h.m9216g(j, c7410u);
            }
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        this.f11830B.mo6191h(j);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        for (C11062h<InterfaceC4458a> c11062h : this.f11850z) {
            c11062h.m9218S(j);
        }
        for (C4466d c4466d : this.f11829A) {
            c4466d.m29042c(j);
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f11849y = interfaceC10330a;
        interfaceC10330a.mo11759j(this);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        return -9223372036854775807L;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        int[] m29088C = m29088C(interfaceC6337hArr);
        m29081J(interfaceC6337hArr, zArr, interfaceC10320m0Arr);
        m29080K(interfaceC6337hArr, interfaceC10320m0Arr, m29088C);
        m29079L(interfaceC6337hArr, interfaceC10320m0Arr, zArr2, j, m29088C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC10320m0 interfaceC10320m0 : interfaceC10320m0Arr) {
            if (interfaceC10320m0 instanceof C11062h) {
                arrayList.add((C11062h) interfaceC10320m0);
            } else if (interfaceC10320m0 instanceof C4466d) {
                arrayList2.add((C4466d) interfaceC10320m0);
            }
        }
        C11062h<InterfaceC4458a>[] m29085F = m29085F(arrayList.size());
        this.f11850z = m29085F;
        arrayList.toArray(m29085F);
        C4466d[] c4466dArr = new C4466d[arrayList2.size()];
        this.f11829A = c4466dArr;
        arrayList2.toArray(c4466dArr);
        this.f11830B = this.f11844t.mo11874a(this.f11850z);
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        this.f11840p.mo20615a();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return this.f11842r;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        for (C11062h<InterfaceC4458a> c11062h : this.f11850z) {
            c11062h.m9215u(j, z);
        }
    }
}