package p445yc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import lc.C10120b;
import lc.C10123e;
import mc.C10434a;
import p136hc.C7058d;
import p136hc.C7060f;
import p136hc.C7064j;
import p136hc.C7069o;
import p424xc.C13777a;
import p464zc.C14145a;

/* renamed from: yc.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13983j {

    /* renamed from: a */
    private static final C14145a f35985a = new C14145a();

    /* renamed from: a */
    private static C13974c m982a(C13981h c13981h) {
        int[] m991j;
        if (c13981h == null || (m991j = c13981h.m991j()) == null) {
            return null;
        }
        int m967p = m967p(m991j);
        int i = 0;
        int i2 = 0;
        for (int i3 : m991j) {
            i2 += m967p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C13975d[] m997d = c13981h.m997d();
        for (int i4 = 0; i2 > 0 && m997d[i4] == null; i4++) {
            i2--;
        }
        for (int length = m991j.length - 1; length >= 0; length--) {
            int i5 = m991j[length];
            i += m967p - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = m997d.length - 1; i > 0 && m997d[length2] == null; length2--) {
            i--;
        }
        return c13981h.m1000a().m1044a(i2, i, c13981h.m990k());
    }

    /* renamed from: b */
    private static void m981b(C13979f c13979f, C13973b[][] c13973bArr) {
        C13973b c13973b = c13973bArr[0][1];
        int[] m1046a = c13973b.m1046a();
        int m1008j = (c13979f.m1008j() * c13979f.m1006l()) - m965r(c13979f.m1007k());
        if (m1046a.length == 0) {
            if (m1008j > 0 && m1008j <= 928) {
                c13973b.m1045b(m1008j);
                return;
            }
            throw C7064j.m21461a();
        } else if (m1046a[0] != m1008j) {
            c13973b.m1045b(m1008j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m980c(lc.C10120b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.m12252e(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p445yc.C13983j.m980c(lc.b, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    private static boolean m979d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m978e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f35985a.m587a(iArr, i, iArr2);
        }
        throw C7058d.m21472a();
    }

    /* renamed from: f */
    private static C13973b[][] m977f(C13979f c13979f) {
        C13980g[] m1003o;
        C13975d[] m997d;
        int m1032c;
        C13973b[][] c13973bArr = (C13973b[][]) Array.newInstance(C13973b.class, c13979f.m1006l(), c13979f.m1008j() + 2);
        for (C13973b[] c13973bArr2 : c13973bArr) {
            int i = 0;
            while (true) {
                if (i < c13973bArr2.length) {
                    c13973bArr2[i] = new C13973b();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (C13980g c13980g : c13979f.m1003o()) {
            if (c13980g != null) {
                for (C13975d c13975d : c13980g.m997d()) {
                    if (c13975d != null && (m1032c = c13975d.m1032c()) >= 0 && m1032c < c13973bArr.length) {
                        c13973bArr[m1032c][i2].m1045b(c13975d.m1030e());
                    }
                }
            }
            i2++;
        }
        return c13973bArr;
    }

    /* renamed from: g */
    private static C10123e m976g(C13979f c13979f) {
        C13973b[][] m977f = m977f(c13979f);
        m981b(c13979f, m977f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c13979f.m1006l() * c13979f.m1008j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < c13979f.m1006l(); i++) {
            int i2 = 0;
            while (i2 < c13979f.m1008j()) {
                int i3 = i2 + 1;
                int[] m1046a = m977f[i][i3].m1046a();
                int m1008j = (c13979f.m1008j() * i) + i2;
                if (m1046a.length == 0) {
                    arrayList.add(Integer.valueOf(m1008j));
                } else if (m1046a.length == 1) {
                    iArr[m1008j] = m1046a[0];
                } else {
                    arrayList3.add(Integer.valueOf(m1008j));
                    arrayList2.add(m1046a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m975h(c13979f.m1007k(), iArr, C13777a.m1568b(arrayList), C13777a.m1568b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C10123e m975h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m973j(iArr, i, iArr2);
                } catch (C7058d unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw C7058d.m21472a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C7058d.m21472a();
                    }
                }
            } else {
                throw C7058d.m21472a();
            }
        }
    }

    /* renamed from: i */
    public static C10123e m974i(C10120b c10120b, C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4, int i, int i2) {
        boolean z;
        int i3;
        C13980g c13981h;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        C13981h c13981h2 = null;
        C13981h c13981h3 = null;
        C13979f c13979f = null;
        C13974c c13974c = new C13974c(c10120b, c7069o, c7069o2, c7069o3, c7069o4);
        for (int i8 = 0; i8 < 2; i8++) {
            if (c7069o != null) {
                c13981h2 = m964s(c10120b, c13974c, c7069o, true, i, i2);
            }
            if (c7069o3 != null) {
                c13981h3 = m964s(c10120b, c13974c, c7069o3, false, i, i2);
            }
            c13979f = m961v(c13981h2, c13981h3);
            if (c13979f != null) {
                if (i8 == 0 && c13979f.m1005m() != null && (c13979f.m1005m().m1038g() < c13974c.m1038g() || c13979f.m1005m().m1040e() > c13974c.m1040e())) {
                    c13974c = c13979f.m1005m();
                } else {
                    c13979f.m1002p(c13974c);
                    break;
                }
            } else {
                throw C7064j.m21461a();
            }
        }
        int m1008j = c13979f.m1008j() + 1;
        c13979f.m1001q(0, c13981h2);
        c13979f.m1001q(m1008j, c13981h3);
        if (c13981h2 != null) {
            z = true;
        } else {
            z = false;
        }
        int i9 = i;
        int i10 = i2;
        for (int i11 = 1; i11 <= m1008j; i11++) {
            if (z) {
                i3 = i11;
            } else {
                i3 = m1008j - i11;
            }
            if (c13979f.m1004n(i3) == null) {
                if (i3 != 0 && i3 != m1008j) {
                    c13981h = new C13980g(c13974c);
                } else {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c13981h = new C13981h(c13974c, z2);
                }
                c13979f.m1001q(i3, c13981h);
                int i12 = -1;
                int m1038g = c13974c.m1038g();
                int i13 = -1;
                while (m1038g <= c13974c.m1040e()) {
                    int m963t = m963t(c13979f, i3, m1038g, z);
                    if (m963t >= 0 && m963t <= c13974c.m1041d()) {
                        i7 = m963t;
                    } else if (i13 != i12) {
                        i7 = i13;
                    } else {
                        i4 = i13;
                        i5 = m1038g;
                        i6 = i12;
                        i13 = i4;
                        m1038g = i5 + 1;
                        i12 = i6;
                    }
                    i4 = i13;
                    int i14 = m1038g;
                    i6 = i12;
                    C13975d m972k = m972k(c10120b, c13974c.m1039f(), c13974c.m1041d(), z, i7, i14, i9, i10);
                    i5 = i14;
                    if (m972k != null) {
                        c13981h.m995f(i5, m972k);
                        i9 = Math.min(i9, m972k.m1029f());
                        i10 = Math.max(i10, m972k.m1029f());
                        i13 = i7;
                        m1038g = i5 + 1;
                        i12 = i6;
                    }
                    i13 = i4;
                    m1038g = i5 + 1;
                    i12 = i6;
                }
            }
        }
        return m976g(c13979f);
    }

    /* renamed from: j */
    private static C10123e m973j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int m978e = m978e(iArr, iArr2, i2);
            m960w(iArr, i2);
            C10123e m1023b = C13976e.m1023b(iArr, String.valueOf(i));
            m1023b.m12225k(Integer.valueOf(m978e));
            m1023b.m12226j(Integer.valueOf(iArr2.length));
            return m1023b;
        }
        throw C7060f.m21471a();
    }

    /* renamed from: k */
    private static C13975d m972k(C10120b c10120b, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int m984d;
        int m1569a;
        int m980c = m980c(c10120b, i, i2, z, i3, i4);
        int[] m966q = m966q(c10120b, i, i2, z, m980c, i4);
        if (m966q == null) {
            return null;
        }
        int m11568d = C10434a.m11568d(m966q);
        if (z) {
            i7 = m980c + m11568d;
        } else {
            for (int i8 = 0; i8 < m966q.length / 2; i8++) {
                int i9 = m966q[i8];
                m966q[i8] = m966q[(m966q.length - 1) - i8];
                m966q[(m966q.length - 1) - i8] = i9;
            }
            m980c -= m11568d;
            i7 = m980c;
        }
        if (!m979d(m11568d, i5, i6) || (m1569a = C13777a.m1569a((m984d = C13982i.m984d(m966q)))) == -1) {
            return null;
        }
        return new C13975d(m980c, i7, m969n(m984d), m1569a);
    }

    /* renamed from: l */
    private static C13972a m971l(C13981h c13981h, C13981h c13981h2) {
        C13972a m992i;
        C13972a m992i2;
        if (c13981h != null && (m992i = c13981h.m992i()) != null) {
            if (c13981h2 != null && (m992i2 = c13981h2.m992i()) != null && m992i.m1051a() != m992i2.m1051a() && m992i.m1050b() != m992i2.m1050b() && m992i.m1049c() != m992i2.m1049c()) {
                return null;
            }
            return m992i;
        } else if (c13981h2 == null) {
            return null;
        } else {
            return c13981h2.m992i();
        }
    }

    /* renamed from: m */
    private static int[] m970m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 >= 0) {
                    i2 = i4;
                } else {
                    return iArr;
                }
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m969n(int i) {
        return m968o(m970m(i));
    }

    /* renamed from: o */
    private static int m968o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m967p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] m966q(lc.C10120b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.m12252e(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p445yc.C13983j.m966q(lc.b, int, int, boolean, int, int):int[]");
    }

    /* renamed from: r */
    private static int m965r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C13981h m964s(C10120b c10120b, C13974c c13974c, C7069o c7069o, boolean z, int i, int i2) {
        int i3;
        int m1033b;
        C13981h c13981h = new C13981h(c13974c, z);
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i5 = i3;
            int m21455c = (int) c7069o.m21455c();
            for (int m21454d = (int) c7069o.m21454d(); m21454d <= c13974c.m1040e() && m21454d >= c13974c.m1038g(); m21454d += i5) {
                C13975d m972k = m972k(c10120b, 0, c10120b.m12246m(), z, m21455c, m21454d, i, i2);
                if (m972k != null) {
                    c13981h.m995f(m21454d, m972k);
                    if (z) {
                        m1033b = m972k.m1031d();
                    } else {
                        m1033b = m972k.m1033b();
                    }
                    m21455c = m1033b;
                }
            }
        }
        return c13981h;
    }

    /* renamed from: t */
    private static int m963t(C13979f c13979f, int i, int i2, boolean z) {
        int i3;
        C13975d c13975d;
        C13975d[] m997d;
        int m1031d;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i4 = i - i3;
        if (m962u(c13979f, i4)) {
            c13975d = c13979f.m1004n(i4).m999b(i2);
        } else {
            c13975d = null;
        }
        if (c13975d != null) {
            if (z) {
                return c13975d.m1033b();
            }
            return c13975d.m1031d();
        }
        C13975d m998c = c13979f.m1004n(i).m998c(i2);
        if (m998c != null) {
            if (z) {
                return m998c.m1031d();
            }
            return m998c.m1033b();
        }
        if (m962u(c13979f, i4)) {
            m998c = c13979f.m1004n(i4).m998c(i2);
        }
        if (m998c != null) {
            if (z) {
                return m998c.m1033b();
            }
            return m998c.m1031d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m962u(c13979f, i)) {
                for (C13975d c13975d2 : c13979f.m1004n(i).m997d()) {
                    if (c13975d2 != null) {
                        if (z) {
                            m1031d = c13975d2.m1033b();
                        } else {
                            m1031d = c13975d2.m1031d();
                        }
                        return m1031d + (i3 * i5 * (c13975d2.m1033b() - c13975d2.m1031d()));
                    }
                }
                i5++;
            } else {
                C13974c m1005m = c13979f.m1005m();
                if (z) {
                    return m1005m.m1039f();
                }
                return m1005m.m1041d();
            }
        }
    }

    /* renamed from: u */
    private static boolean m962u(C13979f c13979f, int i) {
        return i >= 0 && i <= c13979f.m1008j() + 1;
    }

    /* renamed from: v */
    private static C13979f m961v(C13981h c13981h, C13981h c13981h2) {
        C13972a m971l;
        if ((c13981h == null && c13981h2 == null) || (m971l = m971l(c13981h, c13981h2)) == null) {
            return null;
        }
        return new C13979f(m971l, C13974c.m1035j(m982a(c13981h), m982a(c13981h2)));
    }

    /* renamed from: w */
    private static void m960w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 <= iArr.length) {
                if (i2 == 0) {
                    if (i < iArr.length) {
                        iArr[0] = iArr.length - i;
                        return;
                    }
                    throw C7060f.m21471a();
                }
                return;
            }
            throw C7060f.m21471a();
        }
        throw C7060f.m21471a();
    }
}
