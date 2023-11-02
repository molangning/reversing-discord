package tc;

import lc.C10119a;
import p136hc.C7064j;

/* renamed from: tc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12639b extends AbstractC12648k {

    /* renamed from: a */
    static final int[][] f32755a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: g */
    private static int m4654g(C10119a c10119a, int[] iArr, int i) {
        AbstractC12648k.m4629e(c10119a, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = f32755a;
            if (i3 >= iArr2.length) {
                break;
            }
            float m4630d = AbstractC12648k.m4630d(iArr, iArr2[i3], 0.7f);
            if (m4630d < f) {
                i2 = i3;
                f = m4630d;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: h */
    private static int[] m4653h(C10119a c10119a) {
        int m12261j = c10119a.m12261j();
        int m12263f = c10119a.m12263f(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = m12263f;
        while (m12263f < m12261j) {
            if (c10119a.m12265d(m12263f) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = 0.25f;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float m4630d = AbstractC12648k.m4630d(iArr, f32755a[i4], 0.7f);
                        if (m4630d < f) {
                            i3 = i4;
                            f = m4630d;
                        }
                    }
                    if (i3 >= 0 && c10119a.m12260k(Math.max(0, i2 - ((m12263f - i2) / 2)), i2, false)) {
                        return new int[]{i2, m12263f, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            m12263f++;
        }
        throw C7064j.m21461a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r9 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
        if (r9 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012c, code lost:
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131 A[PHI: r17 
      PHI: (r17v10 boolean) = (r17v6 boolean), (r17v16 boolean) binds: [B:67:0x010a, B:43:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d A[PHI: r16 r17 
      PHI: (r16v4 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v3 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:67:0x010a, B:69:0x010e, B:73:0x011a, B:72:0x0116, B:85:0x013b, B:43:0x00c2, B:45:0x00c7, B:49:0x00d4, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v9 boolean) = (r17v6 boolean), (r17v6 boolean), (r17v6 boolean), (r17v6 boolean), (r17v8 boolean), (r17v16 boolean), (r17v16 boolean), (r17v16 boolean), (r17v16 boolean) binds: [B:67:0x010a, B:69:0x010e, B:73:0x011a, B:72:0x0116, B:85:0x013b, B:43:0x00c2, B:45:0x00c7, B:49:0x00d4, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // tc.AbstractC12648k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.Result mo2954b(int r25, lc.C10119a r26, java.util.Map<p136hc.EnumC7059e, ?> r27) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.C12639b.mo2954b(int, lc.a, java.util.Map):com.google.zxing.Result");
    }
}
