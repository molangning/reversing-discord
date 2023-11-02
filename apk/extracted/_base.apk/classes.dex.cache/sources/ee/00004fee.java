package vc;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lc.C10119a;
import mc.C10434a;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p368uc.AbstractC12946a;
import p368uc.C12947b;
import p368uc.C12948c;
import p368uc.C12951f;
import p404wc.AbstractC13478j;
import tc.AbstractC12648k;

/* renamed from: vc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13246d extends AbstractC12946a {

    /* renamed from: k */
    private static final int[] f34305k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f34306l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f34307m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f34308n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f34309o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f34310p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C13244b> f34311g = new ArrayList(11);

    /* renamed from: h */
    private final List<C13245c> f34312h = new ArrayList();

    /* renamed from: i */
    private final int[] f34313i = new int[2];

    /* renamed from: j */
    private boolean f34314j;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
        continue;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m2961A(java.lang.Iterable<vc.C13244b> r7, java.lang.Iterable<vc.C13245c> r8) {
        /*
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.Object r0 = r8.next()
            vc.c r0 = (vc.C13245c) r0
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            vc.b r3 = (vc.C13244b) r3
            java.util.List r5 = r0.m2964a()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            vc.b r6 = (vc.C13244b) r6
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L2a
            r3 = r4
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L15
            goto L43
        L42:
            r1 = r4
        L43:
            if (r1 == 0) goto L4
            return r4
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.C13246d.m2961A(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    /* renamed from: B */
    private static boolean m2960B(List<C13244b> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f34310p) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (list.get(i).m2969b().m3620c() != iArr2[i]) {
                            z = false;
                            break;
                        }
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private C12948c m2959C(C10119a c10119a, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f34313i[0] - 1;
            while (i5 >= 0 && !c10119a.m12265d(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f34313i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f34313i;
            int i7 = iArr2[0];
            int m12262g = c10119a.m12262g(iArr2[1] + 1);
            i2 = m12262g;
            i3 = i7;
            i4 = m12262g - this.f34313i[1];
        }
        int[] m3632i = m3632i();
        System.arraycopy(m3632i, 0, m3632i, 1, m3632i.length - 1);
        m3632i[0] = i4;
        try {
            return new C12948c(AbstractC12946a.m3625p(m3632i, f34308n), new int[]{i3, i2}, i3, i2, i);
        } catch (C7064j unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x004c, code lost:
        continue;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m2958D(java.util.List<vc.C13244b> r6, java.util.List<vc.C13245c> r7) {
        /*
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r7.next()
            vc.c r0 = (vc.C13245c) r0
            java.util.List r1 = r0.m2964a()
            int r1 = r1.size()
            int r2 = r6.size()
            if (r1 == r2) goto L4
            java.util.List r0 = r0.m2964a()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            vc.b r1 = (vc.C13244b) r1
            java.util.Iterator r3 = r6.iterator()
        L37:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            vc.b r4 = (vc.C13244b) r4
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L37
            goto L4c
        L4b:
            r2 = r5
        L4c:
            if (r2 != 0) goto L26
            r2 = r5
        L4f:
            if (r2 == 0) goto L4
            r7.remove()
            goto L4
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.C13246d.m2958D(java.util.List, java.util.List):void");
    }

    /* renamed from: F */
    private static void m2956F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: G */
    private void m2955G(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f34312h.size()) {
                break;
            }
            C13245c c13245c = this.f34312h.get(i2);
            if (c13245c.m2963b() > i) {
                z2 = c13245c.m2962c(this.f34311g);
                break;
            } else {
                z3 = c13245c.m2962c(this.f34311g);
                i2++;
            }
        }
        if (z2 || z3 || m2961A(this.f34311g, this.f34312h)) {
            return;
        }
        this.f34312h.add(i2, new C13245c(this.f34311g, i, z));
        m2958D(this.f34311g, this.f34312h);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2953q(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.C13246d.m2953q(int):void");
    }

    /* renamed from: r */
    private boolean m2952r() {
        C13244b c13244b = this.f34311g.get(0);
        C12947b m2968c = c13244b.m2968c();
        C12947b m2967d = c13244b.m2967d();
        if (m2967d == null) {
            return false;
        }
        int m3624a = m2967d.m3624a();
        int i = 2;
        for (int i2 = 1; i2 < this.f34311g.size(); i2++) {
            C13244b c13244b2 = this.f34311g.get(i2);
            m3624a += c13244b2.m2968c().m3624a();
            i++;
            C12947b m2967d2 = c13244b2.m2967d();
            if (m2967d2 != null) {
                m3624a += m2967d2.m3624a();
                i++;
            }
        }
        if (((i - 4) * 211) + (m3624a % 211) != m2968c.m3623b()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private List<C13244b> m2951s(List<C13245c> list, int i) {
        while (i < this.f34312h.size()) {
            C13245c c13245c = this.f34312h.get(i);
            this.f34311g.clear();
            for (C13245c c13245c2 : list) {
                this.f34311g.addAll(c13245c2.m2964a());
            }
            this.f34311g.addAll(c13245c.m2964a());
            if (m2960B(this.f34311g)) {
                if (m2952r()) {
                    return this.f34311g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c13245c);
                try {
                    return m2951s(arrayList, i + 1);
                } catch (C7064j unused) {
                    continue;
                }
            }
            i++;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: t */
    private List<C13244b> m2950t(boolean z) {
        List<C13244b> list = null;
        if (this.f34312h.size() > 25) {
            this.f34312h.clear();
            return null;
        }
        this.f34311g.clear();
        if (z) {
            Collections.reverse(this.f34312h);
        }
        try {
            list = m2951s(new ArrayList(), 0);
        } catch (C7064j unused) {
        }
        if (z) {
            Collections.reverse(this.f34312h);
        }
        return list;
    }

    /* renamed from: u */
    static Result m2949u(List<C13244b> list) {
        String mo2411d = AbstractC13478j.m2414a(C13243a.m2971a(list)).mo2411d();
        C7069o[] m3622a = list.get(0).m2969b().m3622a();
        C7069o[] m3622a2 = list.get(list.size() - 1).m2969b().m3622a();
        return new Result(mo2411d, null, new C7069o[]{m3622a[0], m3622a[1], m3622a2[0], m3622a2[1]}, EnumC7055a.RSS_EXPANDED);
    }

    /* renamed from: x */
    private void m2946x(C10119a c10119a, List<C13244b> list, int i) {
        boolean z;
        int[] m3632i = m3632i();
        m3632i[0] = 0;
        m3632i[1] = 0;
        m3632i[2] = 0;
        m3632i[3] = 0;
        int m12261j = c10119a.m12261j();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).m2969b().m3621b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f34314j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < m12261j) {
            z2 = !c10119a.m12265d(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < m12261j) {
            if (c10119a.m12265d(i) != z3) {
                m3632i[i2] = m3632i[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m2956F(m3632i);
                    }
                    if (AbstractC12946a.m3626o(m3632i)) {
                        int[] iArr = this.f34313i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m2956F(m3632i);
                    }
                    i3 += m3632i[0] + m3632i[1];
                    m3632i[0] = m3632i[2];
                    m3632i[1] = m3632i[3];
                    m3632i[2] = 0;
                    m3632i[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                m3632i[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: y */
    private static int m2945y(C10119a c10119a, int i) {
        if (c10119a.m12265d(i)) {
            return c10119a.m12263f(c10119a.m12262g(i));
        }
        return c10119a.m12262g(c10119a.m12263f(i));
    }

    /* renamed from: z */
    private static boolean m2944z(C12948c c12948c, boolean z, boolean z2) {
        return (c12948c.m3620c() == 0 && z && z2) ? false : true;
    }

    /* renamed from: E */
    C13244b m2957E(C10119a c10119a, List<C13244b> list, int i) {
        boolean z;
        C12948c m2959C;
        C12947b c12947b;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f34314j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m2946x(c10119a, list, i2);
            m2959C = m2959C(c10119a, i, z);
            if (m2959C == null) {
                i2 = m2945y(c10119a, this.f34313i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C12947b m2948v = m2948v(c10119a, m2959C, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m2965f()) {
            throw C7064j.m21461a();
        }
        try {
            c12947b = m2948v(c10119a, m2959C, z, false);
        } catch (C7064j unused) {
            c12947b = null;
        }
        return new C13244b(m2948v, c12947b, m2959C, true);
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        this.f34311g.clear();
        this.f34314j = false;
        try {
            return m2949u(m2947w(i, c10119a));
        } catch (C7064j unused) {
            this.f34311g.clear();
            this.f34314j = true;
            return m2949u(m2947w(i, c10119a));
        }
    }

    @Override // tc.AbstractC12648k, p136hc.InterfaceC7066l
    public void reset() {
        this.f34311g.clear();
        this.f34312h.clear();
    }

    /* renamed from: v */
    C12947b m2948v(C10119a c10119a, C12948c c12948c, boolean z, boolean z2) {
        int i;
        int[] m3633h = m3633h();
        for (int i2 = 0; i2 < m3633h.length; i2++) {
            m3633h[i2] = 0;
        }
        if (z2) {
            AbstractC12648k.m4628f(c10119a, c12948c.m3621b()[0], m3633h);
        } else {
            AbstractC12648k.m4629e(c10119a, c12948c.m3621b()[1], m3633h);
            int i3 = 0;
            for (int length = m3633h.length - 1; i3 < length; length--) {
                int i4 = m3633h[i3];
                m3633h[i3] = m3633h[length];
                m3633h[length] = i4;
                i3++;
            }
        }
        float m11568d = C10434a.m11568d(m3633h) / 17.0f;
        float f = (c12948c.m3621b()[1] - c12948c.m3621b()[0]) / 15.0f;
        if (Math.abs(m11568d - f) / f <= 0.3f) {
            int[] m3629l = m3629l();
            int[] m3631j = m3631j();
            float[] m3628m = m3628m();
            float[] m3630k = m3630k();
            for (int i5 = 0; i5 < m3633h.length; i5++) {
                float f2 = (m3633h[i5] * 1.0f) / m11568d;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw C7064j.m21461a();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw C7064j.m21461a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    m3629l[i7] = i6;
                    m3628m[i7] = f2 - i6;
                } else {
                    m3631j[i7] = i6;
                    m3630k[i7] = f2 - i6;
                }
            }
            m2953q(17);
            int m3620c = c12948c.m3620c() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i8 = ((m3620c + i) + (!z2 ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = m3629l.length - 1; length2 >= 0; length2--) {
                if (m2944z(c12948c, z, z2)) {
                    i9 += m3629l[length2] * f34309o[i8][length2 * 2];
                }
                i10 += m3629l[length2];
            }
            int i11 = 0;
            for (int length3 = m3631j.length - 1; length3 >= 0; length3--) {
                if (m2944z(c12948c, z, z2)) {
                    i11 += m3631j[length3] * f34309o[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) == 0 && i10 <= 13 && i10 >= 4) {
                int i13 = (13 - i10) / 2;
                int i14 = f34305k[i13];
                return new C12947b((C12951f.m3607b(m3629l, i14, true) * f34306l[i13]) + C12951f.m3607b(m3631j, 9 - i14, false) + f34307m[i13], i12);
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: w */
    List<C13244b> m2947w(int i, C10119a c10119a) {
        boolean z = false;
        while (!z) {
            try {
                List<C13244b> list = this.f34311g;
                list.add(m2957E(c10119a, list, i));
            } catch (C7064j e) {
                if (!this.f34311g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m2952r()) {
            return this.f34311g;
        }
        boolean z2 = !this.f34312h.isEmpty();
        m2955G(i, false);
        if (z2) {
            List<C13244b> m2950t = m2950t(false);
            if (m2950t != null) {
                return m2950t;
            }
            List<C13244b> m2950t2 = m2950t(true);
            if (m2950t2 != null) {
                return m2950t2;
            }
        }
        throw C7064j.m21461a();
    }
}