package tc;

import com.google.zxing.Result;
import java.util.EnumMap;
import java.util.Map;
import lc.C10119a;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7068n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tc.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12651n {

    /* renamed from: c */
    private static final int[] f32781c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f32782a = new int[4];

    /* renamed from: b */
    private final StringBuilder f32783b = new StringBuilder();

    /* renamed from: a */
    private int m4623a(C10119a c10119a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f32782a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12261j = c10119a.m12261j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < m12261j; i3++) {
            int m4615i = AbstractC12653p.m4615i(c10119a, iArr2, i, AbstractC12653p.f32791h);
            sb2.append((char) ((m4615i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m4615i >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c10119a.m12262g(c10119a.m12263f(i));
            }
        }
        if (sb2.length() == 5) {
            if (m4620d(sb2.toString()) == m4621c(i2)) {
                return i;
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: c */
    private static int m4621c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f32781c[i2]) {
                return i2;
            }
        }
        throw C7064j.m21461a();
    }

    /* renamed from: d */
    private static int m4620d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.equals("90000") == false) goto L9;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m4619e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L15
            goto L4f
        L15:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r2
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r3
            goto L3e
        L35:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r4 = "$"
            goto L4f
        L4d:
            java.lang.String r4 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r1 = "0"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.C12651n.m4619e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<EnumC7068n, Object> m4618f(String str) {
        String m4619e;
        if (str.length() != 5 || (m4619e = m4619e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC7068n.class);
        enumMap.put((EnumMap) EnumC7068n.SUGGESTED_PRICE, (EnumC7068n) m4619e);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Result m4622b(int i, C10119a c10119a, int[] iArr) {
        StringBuilder sb2 = this.f32783b;
        sb2.setLength(0);
        int m4623a = m4623a(c10119a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC7068n, Object> m4618f = m4618f(sb3);
        float f = i;
        Result result = new Result(sb3, null, new C7069o[]{new C7069o((iArr[0] + iArr[1]) / 2.0f, f), new C7069o(m4623a, f)}, EnumC7055a.UPC_EAN_EXTENSION);
        if (m4618f != null) {
            result.m26108g(m4618f);
        }
        return result;
    }
}
