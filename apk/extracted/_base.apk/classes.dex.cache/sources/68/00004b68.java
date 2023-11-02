package p317r7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p099f8.InterfaceC6337h;
import p151i6.C7410u;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p177jb.C8891c;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9200u;
import p229m7.C10344s0;
import p229m7.InterfaceC10298h;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10322n0;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10353z;
import p259o6.C11028l;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p317r7.C12094q;
import p337s7.C12413f;
import p337s7.InterfaceC12428k;

/* renamed from: r7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12088k implements InterfaceC10329p, C12094q.InterfaceC12096b, InterfaceC12428k.InterfaceC12430b {

    /* renamed from: A */
    private TrackGroupArray f31314A;

    /* renamed from: E */
    private int f31318E;

    /* renamed from: F */
    private InterfaceC10322n0 f31319F;

    /* renamed from: j */
    private final InterfaceC12085h f31320j;

    /* renamed from: k */
    private final InterfaceC12428k f31321k;

    /* renamed from: l */
    private final InterfaceC12084g f31322l;

    /* renamed from: m */
    private final InterfaceC7472x f31323m;

    /* renamed from: n */
    private final InterfaceC11049x f31324n;

    /* renamed from: o */
    private final InterfaceC11045v.C11046a f31325o;

    /* renamed from: p */
    private final InterfaceC4548g f31326p;

    /* renamed from: q */
    private final InterfaceC10353z.C10354a f31327q;

    /* renamed from: r */
    private final InterfaceC7440b f31328r;

    /* renamed from: u */
    private final InterfaceC10298h f31331u;

    /* renamed from: v */
    private final boolean f31332v;

    /* renamed from: w */
    private final int f31333w;

    /* renamed from: x */
    private final boolean f31334x;

    /* renamed from: y */
    private InterfaceC10329p.InterfaceC10330a f31335y;

    /* renamed from: z */
    private int f31336z;

    /* renamed from: s */
    private final IdentityHashMap<InterfaceC10320m0, Integer> f31329s = new IdentityHashMap<>();

    /* renamed from: t */
    private final C12104t f31330t = new C12104t();

    /* renamed from: B */
    private C12094q[] f31315B = new C12094q[0];

    /* renamed from: C */
    private C12094q[] f31316C = new C12094q[0];

    /* renamed from: D */
    private int[][] f31317D = new int[0];

    public C12088k(InterfaceC12085h interfaceC12085h, InterfaceC12428k interfaceC12428k, InterfaceC12084g interfaceC12084g, InterfaceC7472x interfaceC7472x, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a, InterfaceC7440b interfaceC7440b, InterfaceC10298h interfaceC10298h, boolean z, int i, boolean z2) {
        this.f31320j = interfaceC12085h;
        this.f31321k = interfaceC12428k;
        this.f31322l = interfaceC12084g;
        this.f31323m = interfaceC7472x;
        this.f31324n = interfaceC11049x;
        this.f31325o = c11046a;
        this.f31326p = interfaceC4548g;
        this.f31327q = c10354a;
        this.f31328r = interfaceC7440b;
        this.f31331u = interfaceC10298h;
        this.f31332v = z;
        this.f31333w = i;
        this.f31334x = z2;
        this.f31319F = interfaceC10298h.mo11874a(new InterfaceC10322n0[0]);
    }

    /* renamed from: p */
    private void m6247p(long j, List<C12413f.C12414a> list, List<C12094q> list2, List<int[]> list3, Map<String, C11028l> map) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f32264d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z2 = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (C9191p0.m16257c(str, list.get(i2).f32264d)) {
                        C12413f.C12414a c12414a = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(c12414a.f32261a);
                        arrayList2.add(c12414a.f32262b);
                        if (C9191p0.m16295J(c12414a.f32262b.f11194r, 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                }
                C12094q m6240w = m6240w(1, (Uri[]) arrayList.toArray((Uri[]) C9191p0.m16241k(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j);
                list3.add(C8891c.m17070k(arrayList3));
                list2.add(m6240w);
                if (this.f31332v && z2) {
                    m6240w.m6198c0(new C10344s0[]{new C10344s0((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* renamed from: s */
    private void m6244s(C12413f c12413f, long j, List<C12094q> list, List<int[]> list2, Map<String, C11028l> map) {
        boolean z;
        boolean z2;
        boolean z3;
        int size = c12413f.f32252e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < c12413f.f32252e.size(); i3++) {
            Format format = c12413f.f32252e.get(i3).f32266b;
            if (format.f11171A <= 0 && C9191p0.m16293K(format.f11194r, 2) == null) {
                if (C9191p0.m16293K(format.f11194r, 1) != null) {
                    iArr[i3] = 1;
                    i2++;
                } else {
                    iArr[i3] = -1;
                }
            } else {
                iArr[i3] = 2;
                i++;
            }
        }
        if (i > 0) {
            size = i;
            z = true;
            z2 = false;
        } else if (i2 < size) {
            size -= i2;
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < c12413f.f32252e.size(); i5++) {
            if ((!z || iArr[i5] == 2) && (!z2 || iArr[i5] != 1)) {
                C12413f.C12415b c12415b = c12413f.f32252e.get(i5);
                uriArr[i4] = c12415b.f32265a;
                formatArr[i4] = c12415b.f32266b;
                iArr2[i4] = i5;
                i4++;
            }
        }
        String str = formatArr[0].f11194r;
        int m16295J = C9191p0.m16295J(str, 2);
        int m16295J2 = C9191p0.m16295J(str, 1);
        if (m16295J2 <= 1 && m16295J <= 1 && m16295J2 + m16295J > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C12094q m6240w = m6240w(0, uriArr, formatArr, c12413f.f32257j, c12413f.f32258k, map, j);
        list.add(m6240w);
        list2.add(iArr2);
        if (this.f31332v && z3) {
            ArrayList arrayList = new ArrayList();
            if (m16295J > 0) {
                Format[] formatArr2 = new Format[size];
                for (int i6 = 0; i6 < size; i6++) {
                    formatArr2[i6] = m6237z(formatArr[i6]);
                }
                arrayList.add(new C10344s0(formatArr2));
                if (m16295J2 > 0 && (c12413f.f32257j != null || c12413f.f32254g.isEmpty())) {
                    arrayList.add(new C10344s0(m6239x(formatArr[0], c12413f.f32257j, false)));
                }
                List<Format> list3 = c12413f.f32258k;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new C10344s0(list3.get(i7)));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[size];
                for (int i8 = 0; i8 < size; i8++) {
                    formatArr3[i8] = m6239x(formatArr[i8], c12413f.f32257j, true);
                }
                arrayList.add(new C10344s0(formatArr3));
            }
            C10344s0 c10344s0 = new C10344s0(new Format.C4362b().m29900S("ID3").m29883e0("application/id3").m29914E());
            arrayList.add(c10344s0);
            m6240w.m6198c0((C10344s0[]) arrayList.toArray(new C10344s0[0]), 0, arrayList.indexOf(c10344s0));
        }
    }

    /* renamed from: v */
    private void m6241v(long j) {
        Map<String, C11028l> emptyMap;
        C12413f c12413f = (C12413f) C9149a.m16448e(this.f31321k.mo5295c());
        if (this.f31334x) {
            emptyMap = m6238y(c12413f.f32260m);
        } else {
            emptyMap = Collections.emptyMap();
        }
        Map<String, C11028l> map = emptyMap;
        boolean z = !c12413f.f32252e.isEmpty();
        List<C12413f.C12414a> list = c12413f.f32254g;
        List<C12413f.C12414a> list2 = c12413f.f32255h;
        this.f31336z = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            m6244s(c12413f, j, arrayList, arrayList2, map);
        }
        m6247p(j, list, arrayList, arrayList2, map);
        this.f31318E = arrayList.size();
        int i = 0;
        while (i < list2.size()) {
            C12413f.C12414a c12414a = list2.get(i);
            int i2 = i;
            C12094q m6240w = m6240w(3, new Uri[]{c12414a.f32261a}, new Format[]{c12414a.f32262b}, null, Collections.emptyList(), map, j);
            arrayList2.add(new int[]{i2});
            arrayList.add(m6240w);
            m6240w.m6198c0(new C10344s0[]{new C10344s0(c12414a.f32262b)}, 0, new int[0]);
            i = i2 + 1;
        }
        this.f31315B = (C12094q[]) arrayList.toArray(new C12094q[0]);
        this.f31317D = (int[][]) arrayList2.toArray(new int[0]);
        C12094q[] c12094qArr = this.f31315B;
        this.f31336z = c12094qArr.length;
        c12094qArr[0].m6186l0(true);
        for (C12094q c12094q : this.f31315B) {
            c12094q.m6228B();
        }
        this.f31316C = this.f31315B;
    }

    /* renamed from: w */
    private C12094q m6240w(int i, Uri[] uriArr, Format[] formatArr, Format format, List<Format> list, Map<String, C11028l> map, long j) {
        return new C12094q(i, this, new C12078f(this.f31320j, this.f31321k, uriArr, formatArr, this.f31322l, this.f31323m, this.f31330t, list), map, this.f31328r, j, format, this.f31324n, this.f31325o, this.f31326p, this.f31327q, this.f31333w);
    }

    /* renamed from: x */
    private static Format m6239x(Format format, Format format2, boolean z) {
        String m16293K;
        Metadata metadata;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        int i5 = -1;
        if (format2 != null) {
            m16293K = format2.f11194r;
            metadata = format2.f11195s;
            i2 = format2.f11178H;
            i = format2.f11189m;
            i3 = format2.f11190n;
            str = format2.f11188l;
            str2 = format2.f11187k;
        } else {
            m16293K = C9191p0.m16293K(format.f11194r, 1);
            metadata = format.f11195s;
            if (z) {
                i2 = format.f11178H;
                i = format.f11189m;
                i3 = format.f11190n;
                str = format.f11188l;
                str2 = format.f11187k;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        String m16163g = C9200u.m16163g(m16293K);
        if (z) {
            i4 = format.f11191o;
        } else {
            i4 = -1;
        }
        if (z) {
            i5 = format.f11192p;
        }
        return new Format.C4362b().m29900S(format.f11186j).m29898U(str2).m29908K(format.f11196t).m29883e0(m16163g).m29910I(m16293K).m29895X(metadata).m29912G(i4).m29893Z(i5).m29911H(i2).m29879g0(i).m29887c0(i3).m29897V(str).m29914E();
    }

    /* renamed from: y */
    private static Map<String, C11028l> m6238y(List<C11028l> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            C11028l c11028l = list.get(i);
            String str = c11028l.f28888l;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                C11028l c11028l2 = (C11028l) arrayList.get(i2);
                if (TextUtils.equals(c11028l2.f28888l, str)) {
                    c11028l = c11028l.m9321O(c11028l2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, c11028l);
        }
        return hashMap;
    }

    /* renamed from: z */
    private static Format m6237z(Format format) {
        String m16293K = C9191p0.m16293K(format.f11194r, 2);
        return new Format.C4362b().m29900S(format.f11186j).m29898U(format.f11187k).m29908K(format.f11196t).m29883e0(C9200u.m16163g(m16293K)).m29910I(m16293K).m29895X(format.f11195s).m29912G(format.f11191o).m29893Z(format.f11192p).m29873j0(format.f11202z).m29902Q(format.f11171A).m29903P(format.f11172B).m29879g0(format.f11189m).m29887c0(format.f11190n).m29914E();
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: A */
    public void mo6251k(C12094q c12094q) {
        this.f31335y.mo6251k(this);
    }

    /* renamed from: B */
    public void m6253B() {
        this.f31321k.mo5289i(this);
        for (C12094q c12094q : this.f31315B) {
            c12094q.m6195e0();
        }
        this.f31335y = null;
    }

    @Override // p317r7.C12094q.InterfaceC12096b
    /* renamed from: a */
    public void mo6172a() {
        C12094q[] c12094qArr;
        int i = this.f31336z - 1;
        this.f31336z = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C12094q c12094q : this.f31315B) {
            i2 += c12094q.m6179t().f11764j;
        }
        C10344s0[] c10344s0Arr = new C10344s0[i2];
        int i3 = 0;
        for (C12094q c12094q2 : this.f31315B) {
            int i4 = c12094q2.m6179t().f11764j;
            int i5 = 0;
            while (i5 < i4) {
                c10344s0Arr[i3] = c12094q2.m6179t().m29144a(i5);
                i5++;
                i3++;
            }
        }
        this.f31314A = new TrackGroupArray(c10344s0Arr);
        this.f31335y.mo11759j(this);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        return this.f31319F.mo6201b();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f31319F.mo6199c();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        if (this.f31314A == null) {
            for (C12094q c12094q : this.f31315B) {
                c12094q.m6228B();
            }
            return false;
        }
        return this.f31319F.mo6197d(j);
    }

    @Override // p337s7.InterfaceC12428k.InterfaceC12430b
    /* renamed from: e */
    public void mo5285e() {
        for (C12094q c12094q : this.f31315B) {
            c12094q.m6202a0();
        }
        this.f31335y.mo6251k(this);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        return this.f31319F.mo6194f();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        return j;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        this.f31319F.mo6191h(j);
    }

    @Override // p337s7.InterfaceC12428k.InterfaceC12430b
    /* renamed from: i */
    public boolean mo5284i(Uri uri, long j) {
        boolean z = true;
        for (C12094q c12094q : this.f31315B) {
            z &= c12094q.m6204Z(uri, j);
        }
        this.f31335y.mo6251k(this);
        return z;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        C12094q[] c12094qArr = this.f31316C;
        if (c12094qArr.length > 0) {
            boolean m6190h0 = c12094qArr[0].m6190h0(j, false);
            int i = 1;
            while (true) {
                C12094q[] c12094qArr2 = this.f31316C;
                if (i >= c12094qArr2.length) {
                    break;
                }
                c12094qArr2[i].m6190h0(j, m6190h0);
                i++;
            }
            if (m6190h0) {
                this.f31330t.m6150b();
            }
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f31335y = interfaceC10330a;
        this.f31321k.mo5287m(this);
        m6241v(j);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        return -9223372036854775807L;
    }

    @Override // p317r7.C12094q.InterfaceC12096b
    /* renamed from: o */
    public void mo6171o(Uri uri) {
        this.f31321k.mo5294d(uri);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        boolean z;
        InterfaceC10320m0 interfaceC10320m0;
        int intValue;
        InterfaceC10320m0[] interfaceC10320m0Arr2 = interfaceC10320m0Arr;
        int[] iArr = new int[interfaceC6337hArr.length];
        int[] iArr2 = new int[interfaceC6337hArr.length];
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC10320m0 interfaceC10320m02 = interfaceC10320m0Arr2[i];
            if (interfaceC10320m02 == null) {
                intValue = -1;
            } else {
                intValue = this.f31329s.get(interfaceC10320m02).intValue();
            }
            iArr[i] = intValue;
            iArr2[i] = -1;
            InterfaceC6337h interfaceC6337h = interfaceC6337hArr[i];
            if (interfaceC6337h != null) {
                C10344s0 mo22888i = interfaceC6337h.mo22888i();
                int i2 = 0;
                while (true) {
                    C12094q[] c12094qArr = this.f31315B;
                    if (i2 >= c12094qArr.length) {
                        break;
                    } else if (c12094qArr[i2].m6179t().m29143b(mo22888i) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f31329s.clear();
        int length = interfaceC6337hArr.length;
        InterfaceC10320m0[] interfaceC10320m0Arr3 = new InterfaceC10320m0[length];
        InterfaceC10320m0[] interfaceC10320m0Arr4 = new InterfaceC10320m0[interfaceC6337hArr.length];
        InterfaceC6337h[] interfaceC6337hArr2 = new InterfaceC6337h[interfaceC6337hArr.length];
        C12094q[] c12094qArr2 = new C12094q[this.f31315B.length];
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < this.f31315B.length) {
            for (int i5 = 0; i5 < interfaceC6337hArr.length; i5++) {
                InterfaceC6337h interfaceC6337h2 = null;
                if (iArr[i5] == i4) {
                    interfaceC10320m0 = interfaceC10320m0Arr2[i5];
                } else {
                    interfaceC10320m0 = null;
                }
                interfaceC10320m0Arr4[i5] = interfaceC10320m0;
                if (iArr2[i5] == i4) {
                    interfaceC6337h2 = interfaceC6337hArr[i5];
                }
                interfaceC6337hArr2[i5] = interfaceC6337h2;
            }
            C12094q c12094q = this.f31315B[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            InterfaceC6337h[] interfaceC6337hArr3 = interfaceC6337hArr2;
            C12094q[] c12094qArr3 = c12094qArr2;
            boolean m6189i0 = c12094q.m6189i0(interfaceC6337hArr2, zArr, interfaceC10320m0Arr4, zArr2, j, z2);
            int i9 = 0;
            boolean z3 = false;
            while (true) {
                z = true;
                if (i9 >= interfaceC6337hArr.length) {
                    break;
                }
                InterfaceC10320m0 interfaceC10320m03 = interfaceC10320m0Arr4[i9];
                if (iArr2[i9] == i8) {
                    C9149a.m16448e(interfaceC10320m03);
                    interfaceC10320m0Arr3[i9] = interfaceC10320m03;
                    this.f31329s.put(interfaceC10320m03, Integer.valueOf(i8));
                    z3 = true;
                } else if (iArr[i9] == i8) {
                    if (interfaceC10320m03 != null) {
                        z = false;
                    }
                    C9149a.m16447f(z);
                }
                i9++;
            }
            if (z3) {
                c12094qArr3[i6] = c12094q;
                i3 = i6 + 1;
                if (i6 == 0) {
                    c12094q.m6186l0(true);
                    if (!m6189i0) {
                        C12094q[] c12094qArr4 = this.f31316C;
                        if (c12094qArr4.length != 0 && c12094q == c12094qArr4[0]) {
                        }
                    }
                    this.f31330t.m6150b();
                    z2 = true;
                } else {
                    if (i8 >= this.f31318E) {
                        z = false;
                    }
                    c12094q.m6186l0(z);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            interfaceC10320m0Arr2 = interfaceC10320m0Arr;
            c12094qArr2 = c12094qArr3;
            length = i7;
            interfaceC6337hArr2 = interfaceC6337hArr3;
        }
        System.arraycopy(interfaceC10320m0Arr3, 0, interfaceC10320m0Arr2, 0, length);
        C12094q[] c12094qArr5 = (C12094q[]) C9191p0.m16310B0(c12094qArr2, i3);
        this.f31316C = c12094qArr5;
        this.f31319F = this.f31331u.mo11874a(c12094qArr5);
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        for (C12094q c12094q : this.f31315B) {
            c12094q.m6180r();
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return (TrackGroupArray) C9149a.m16448e(this.f31314A);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        for (C12094q c12094q : this.f31316C) {
            c12094q.m6178u(j, z);
        }
    }
}