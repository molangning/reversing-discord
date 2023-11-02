package p366u9;

import com.facebook.react.uimanager.ViewDefaults;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.math.RoundingMode;

/* renamed from: u9.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12914k0 {

    /* renamed from: a */
    private static final byte[] f33607a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    private static final int[] f33608b = {1, 10, 100, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c */
    private static final int[] f33609c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, ViewDefaults.NUMBER_OF_LINES};

    /* renamed from: d */
    private static final int[] f33610d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    private static int[] f33611e = {ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0044, code lost:
        if ((r6 & r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0047, code lost:
        if (r1 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x004a, code lost:
        if (r5 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004d, code lost:
        if (r5 < 0) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3680a(int r5, int r6, java.math.RoundingMode r7) {
        /*
            p366u9.C12919n.m3674b(r7)
            if (r6 == 0) goto L5c
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = p366u9.C12912j0.f33606a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4d;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L58
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = r2
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = r2
            goto L43
        L42:
            r7 = r4
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L57
            goto L58
        L47:
            if (r1 <= 0) goto L57
            goto L58
        L4a:
            if (r5 <= 0) goto L57
            goto L58
        L4d:
            if (r5 >= 0) goto L57
            goto L58
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            p366u9.C12918m0.m3676a(r2)
        L57:
            r2 = r4
        L58:
            if (r2 == 0) goto L5b
            int r0 = r0 + r5
        L5b:
            return r0
        L5c:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p366u9.C12914k0.m3680a(int, int, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static int m3679b(int i, RoundingMode roundingMode) {
        boolean z;
        if (i > 0) {
            boolean z2 = true;
            switch (C12912j0.f33606a[roundingMode.ordinal()]) {
                case 1:
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((i - 1) & i) != 0) {
                        z2 = false;
                    }
                    C12918m0.m3676a(z & z2);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        StringBuilder sb2 = new StringBuilder("x".length() + 26);
        sb2.append("x");
        sb2.append(" (");
        sb2.append(i);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }
}