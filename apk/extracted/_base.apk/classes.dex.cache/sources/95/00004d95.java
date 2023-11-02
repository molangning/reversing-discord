package tc;

import com.google.zxing.Result;
import java.util.Map;
import lc.C10119a;
import p136hc.C7060f;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;

/* renamed from: tc.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12645h extends AbstractC12648k {

    /* renamed from: b */
    private static final int[] f32771b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f32772c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f32773d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f32774e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f32775a = -1;

    /* renamed from: g */
    private static int m4638g(int[] iArr) {
        int length = f32774e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float m4630d = AbstractC12648k.m4630d(iArr, f32774e[i2], 0.5f);
            if (m4630d < f) {
                i = i2;
                f = m4630d;
            } else if (m4630d == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: h */
    private int[] m4637h(C10119a c10119a) {
        int i;
        int[] m4634k;
        c10119a.m12258m();
        try {
            try {
                m4634k = m4634k(c10119a, m4633l(c10119a), f32773d[0]);
            } catch (C7064j unused) {
                m4634k = m4634k(c10119a, i, f32773d[1]);
            }
            m4632m(c10119a, m4634k[0]);
            int i2 = m4634k[0];
            m4634k[0] = c10119a.m12261j() - m4634k[1];
            m4634k[1] = c10119a.m12261j() - i2;
            return m4634k;
        } finally {
            c10119a.m12258m();
        }
    }

    /* renamed from: i */
    private static void m4636i(C10119a c10119a, int i, int i2, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            AbstractC12648k.m4629e(c10119a, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb2.append((char) (m4638g(iArr2) + 48));
            sb2.append((char) (m4638g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: j */
    private int[] m4635j(C10119a c10119a) {
        int[] m4634k = m4634k(c10119a, m4633l(c10119a), f32772c);
        int i = m4634k[1];
        int i2 = m4634k[0];
        this.f32775a = (i - i2) / 4;
        m4632m(c10119a, i2);
        return m4634k;
    }

    /* renamed from: k */
    private static int[] m4634k(C10119a c10119a, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m12261j = c10119a.m12261j();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < m12261j) {
            if (c10119a.m12265d(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 == length - 1) {
                    if (AbstractC12648k.m4630d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: l */
    private static int m4633l(C10119a c10119a) {
        int m12261j = c10119a.m12261j();
        int m12263f = c10119a.m12263f(0);
        if (m12263f != m12261j) {
            return m12263f;
        }
        throw C7064j.m21461a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x001b, code lost:
        return;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4632m(lc.C10119a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f32775a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.m12265d(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            hc.j r3 = p136hc.C7064j.m21461a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.C12645h.m4632m(lc.a, int):void");
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        int[] iArr;
        boolean z;
        int[] m4635j = m4635j(c10119a);
        int[] m4637h = m4637h(c10119a);
        StringBuilder sb2 = new StringBuilder(20);
        m4636i(c10119a, m4635j[1], m4637h[0], sb2);
        String sb3 = sb2.toString();
        if (map != null) {
            iArr = (int[]) map.get(EnumC7059e.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f32771b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length2) {
                int i4 = iArr[i2];
                if (length == i4) {
                    z = true;
                    break;
                }
                if (i4 > i3) {
                    i3 = i4;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = i;
            return new Result(sb3, null, new C7069o[]{new C7069o(m4635j[1], f), new C7069o(m4637h[0], f)}, EnumC7055a.ITF);
        }
        throw C7060f.m21471a();
    }
}