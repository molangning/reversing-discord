package tc;

import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import lc.C10119a;
import p136hc.C7057c;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7059e;
import p136hc.EnumC7068n;
import p136hc.InterfaceC7066l;

/* renamed from: tc.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12648k implements InterfaceC7066l {
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[Catch: m -> 0x00cc, TRY_LEAVE, TryCatch #1 {m -> 0x00cc, blocks: (B:39:0x0076, B:41:0x007c), top: B:68:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.zxing.Result m4631c(p136hc.C7057c r22, java.util.Map<p136hc.EnumC7059e, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.AbstractC12648k.m4631c(hc.c, java.util.Map):com.google.zxing.Result");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static float m4630d(int[] iArr, int[] iArr2, float f) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static void m4629e(C10119a c10119a, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m12261j = c10119a.m12261j();
        if (i < m12261j) {
            boolean z = !c10119a.m12265d(i);
            while (i < m12261j) {
                if (c10119a.m12265d(i) != z) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                }
                i++;
            }
            if (i2 != length) {
                if (i2 != length - 1 || i != m12261j) {
                    throw C7064j.m21461a();
                }
                return;
            }
            return;
        }
        throw C7064j.m21461a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static void m4628f(C10119a c10119a, int i, int[] iArr) {
        int length = iArr.length;
        boolean m12265d = c10119a.m12265d(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c10119a.m12265d(i) != m12265d) {
                length--;
                m12265d = !m12265d;
            }
        }
        if (length < 0) {
            m4629e(c10119a, i + 1, iArr);
            return;
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    public Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        boolean z;
        try {
            return m4631c(c7057c, map);
        } catch (C7064j e) {
            if (map != null && map.containsKey(EnumC7059e.TRY_HARDER)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c7057c.m21474e()) {
                C7057c m21473f = c7057c.m21473f();
                Result m4631c = m4631c(m21473f, map);
                Map<EnumC7068n, Object> m26111d = m4631c.m26111d();
                int i = 270;
                if (m26111d != null) {
                    EnumC7068n enumC7068n = EnumC7068n.ORIENTATION;
                    if (m26111d.containsKey(enumC7068n)) {
                        i = (((Integer) m26111d.get(enumC7068n)).intValue() + 270) % 360;
                    }
                }
                m4631c.m26107h(EnumC7068n.ORIENTATION, Integer.valueOf(i));
                C7069o[] m26110e = m4631c.m26110e();
                if (m26110e != null) {
                    int m21476c = m21473f.m21476c();
                    for (int i2 = 0; i2 < m26110e.length; i2++) {
                        m26110e[i2] = new C7069o((m21476c - m26110e[i2].m21454d()) - 1.0f, m26110e[i2].m21455c());
                    }
                }
                return m4631c;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public abstract Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map);

    @Override // p136hc.InterfaceC7066l
    public void reset() {
    }
}
