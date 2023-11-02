package ad;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lc.C10120b;
import p136hc.C7057c;
import p136hc.C7069o;
import p136hc.EnumC7059e;

/* renamed from: ad.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0147a {

    /* renamed from: a */
    private static final int[] f547a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f548b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f549c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f550d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m41070a(C7069o[] c7069oArr, C7069o[] c7069oArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            c7069oArr[iArr[i]] = c7069oArr2[i];
        }
    }

    /* renamed from: b */
    public static C0148b m41069b(C7057c c7057c, Map<EnumC7059e, ?> map, boolean z) {
        C10120b m21478a = c7057c.m21478a();
        List<C7069o[]> m41068c = m41068c(z, m21478a);
        if (m41068c.isEmpty()) {
            m21478a = m21478a.clone();
            m21478a.m12245n();
            m41068c = m41068c(z, m21478a);
        }
        return new C0148b(m21478a, m41068c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = (p136hc.C7069o[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = (int) java.lang.Math.max(r2, r7.m21454d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.m21454d());
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<p136hc.C7069o[]> m41068c(boolean r8, lc.C10120b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.m12249j()
            if (r2 >= r5) goto L77
            hc.o[] r3 = m41065f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4f
            if (r4 == 0) goto L77
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            hc.o[] r4 = (p136hc.C7069o[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3d
            float r2 = (float) r2
            float r7 = r7.m21454d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3d:
            r4 = r4[r5]
            if (r4 == 0) goto L23
            float r4 = r4.m21454d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L23
        L4b:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L4f:
            r0.add(r3)
            if (r8 == 0) goto L77
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L65
            float r4 = r4.m21455c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.m21454d()
            goto L73
        L65:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.m21455c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.m21454d()
        L73:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.C0147a.m41068c(boolean, lc.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m41067d(C10120b c10120b, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (c10120b.m12252e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (c10120b.m12252e(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 == length - 1) {
                    if (m41064g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                } else {
                    i6++;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m41064g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C7069o[] m41066e(C10120b c10120b, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        C7069o[] c7069oArr = new C7069o[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 < i) {
                int[] m41067d = m41067d(c10120b, i4, i8, i2, false, iArr, iArr2);
                if (m41067d != null) {
                    int i9 = i8;
                    int[] iArr3 = m41067d;
                    int i10 = i9;
                    while (true) {
                        if (i10 > 0) {
                            int i11 = i10 - 1;
                            int[] m41067d2 = m41067d(c10120b, i4, i11, i2, false, iArr, iArr2);
                            if (m41067d2 != null) {
                                iArr3 = m41067d2;
                                i10 = i11;
                            } else {
                                i7 = i11 + 1;
                                break;
                            }
                        } else {
                            i7 = i10;
                            break;
                        }
                    }
                    float f = i7;
                    c7069oArr[0] = new C7069o(iArr3[0], f);
                    c7069oArr[1] = new C7069o(iArr3[1], f);
                    z = true;
                    i8 = i7;
                } else {
                    i8 += 5;
                }
            } else {
                z = false;
                break;
            }
        }
        int i12 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) c7069oArr[0].m21455c(), (int) c7069oArr[1].m21455c()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 < i) {
                    i5 = i14;
                    i6 = i13;
                    int[] m41067d3 = m41067d(c10120b, iArr4[0], i13, i2, false, iArr, iArr2);
                    if (m41067d3 != null && Math.abs(iArr4[0] - m41067d3[0]) < 5 && Math.abs(iArr4[1] - m41067d3[1]) < 5) {
                        iArr4 = m41067d3;
                        i14 = 0;
                    } else if (i5 > 25) {
                        break;
                    } else {
                        i14 = i5 + 1;
                    }
                    i13 = i6 + 1;
                } else {
                    i5 = i14;
                    i6 = i13;
                    break;
                }
            }
            i12 = i6 - (i5 + 1);
            float f2 = i12;
            c7069oArr[2] = new C7069o(iArr4[0], f2);
            c7069oArr[3] = new C7069o(iArr4[1], f2);
        }
        if (i12 - i8 < 10) {
            Arrays.fill(c7069oArr, (Object) null);
        }
        return c7069oArr;
    }

    /* renamed from: f */
    private static C7069o[] m41065f(C10120b c10120b, int i, int i2) {
        int m12249j = c10120b.m12249j();
        int m12246m = c10120b.m12246m();
        C7069o[] c7069oArr = new C7069o[8];
        m41070a(c7069oArr, m41066e(c10120b, m12249j, m12246m, i, i2, f549c), f547a);
        C7069o c7069o = c7069oArr[4];
        if (c7069o != null) {
            i2 = (int) c7069o.m21455c();
            i = (int) c7069oArr[4].m21454d();
        }
        m41070a(c7069oArr, m41066e(c10120b, m12249j, m12246m, i, i2, f550d), f548b);
        return c7069oArr;
    }

    /* renamed from: g */
    private static float m41064g(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i;
        float f4 = f3 / i2;
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f7 = iArr2[i4] * f4;
            float f8 = iArr[i4];
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }
}
