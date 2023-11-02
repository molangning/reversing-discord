package p445yc;

import java.math.BigInteger;
import java.util.Arrays;
import p136hc.C7060f;
import p424xc.C13779c;

/* renamed from: yc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13976e {

    /* renamed from: a */
    private static final char[] f35966a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f35967b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f35968c;

    /* renamed from: yc.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C13977a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35969a;

        static {
            int[] iArr = new int[EnumC13978b.values().length];
            f35969a = iArr;
            try {
                iArr[EnumC13978b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35969a[EnumC13978b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35969a[EnumC13978b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35969a[EnumC13978b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35969a[EnumC13978b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35969a[EnumC13978b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: yc.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC13978b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f35968c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f35968c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m1024a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p445yc.C13976e.m1024a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lc.C10123e m1023b(int[] r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            xc.c r3 = new xc.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = m1018g(r6, r4, r0)
            goto L60
        L28:
            int r2 = m1021d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            lc.d r1 = lc.EnumC10122d.m12236a(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            hc.f r6 = p136hc.C7060f.m21471a()
            throw r6
        L49:
            int r2 = m1019f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = m1024a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = m1018g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            hc.f r6 = p136hc.C7060f.m21471a()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            lc.e r6 = new lc.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.m12223m(r3)
            return r6
        L81:
            hc.f r6 = p136hc.C7060f.m21471a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p445yc.C13976e.m1023b(int[], java.lang.String):lc.e");
    }

    /* renamed from: c */
    private static String m1022c(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f35968c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C7060f.m21471a();
    }

    /* renamed from: d */
    static int m1021d(int[] iArr, int i, C13779c c13779c) {
        int i2;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i];
                i3++;
                i++;
            }
            c13779c.m1552j(Integer.parseInt(m1022c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int m1018g = m1018g(iArr, i, sb2);
            c13779c.m1558d(sb2.toString());
            if (iArr[m1018g] == 923) {
                i2 = m1018g + 1;
            } else {
                i2 = -1;
            }
            while (m1018g < iArr[0]) {
                int i4 = iArr[m1018g];
                if (i4 != 922) {
                    if (i4 == 923) {
                        int i5 = m1018g + 1;
                        switch (iArr[i5]) {
                            case 0:
                                StringBuilder sb3 = new StringBuilder();
                                m1018g = m1018g(iArr, i5 + 1, sb3);
                                c13779c.m1557e(sb3.toString());
                                continue;
                            case 1:
                                StringBuilder sb4 = new StringBuilder();
                                m1018g = m1019f(iArr, i5 + 1, sb4);
                                c13779c.m1553i(Integer.parseInt(sb4.toString()));
                                continue;
                            case 2:
                                StringBuilder sb5 = new StringBuilder();
                                m1018g = m1019f(iArr, i5 + 1, sb5);
                                c13779c.m1550l(Long.parseLong(sb5.toString()));
                                continue;
                            case 3:
                                StringBuilder sb6 = new StringBuilder();
                                m1018g = m1018g(iArr, i5 + 1, sb6);
                                c13779c.m1551k(sb6.toString());
                                continue;
                            case 4:
                                StringBuilder sb7 = new StringBuilder();
                                m1018g = m1018g(iArr, i5 + 1, sb7);
                                c13779c.m1560b(sb7.toString());
                                continue;
                            case 5:
                                StringBuilder sb8 = new StringBuilder();
                                m1018g = m1019f(iArr, i5 + 1, sb8);
                                c13779c.m1556f(Long.parseLong(sb8.toString()));
                                continue;
                            case 6:
                                StringBuilder sb9 = new StringBuilder();
                                m1018g = m1019f(iArr, i5 + 1, sb9);
                                c13779c.m1559c(Integer.parseInt(sb9.toString()));
                                continue;
                            default:
                                throw C7060f.m21471a();
                        }
                    } else {
                        throw C7060f.m21471a();
                    }
                } else {
                    m1018g++;
                    c13779c.m1555g(true);
                }
            }
            if (i2 != -1) {
                int i6 = m1018g - i2;
                if (c13779c.m1561a()) {
                    i6--;
                }
                c13779c.m1554h(Arrays.copyOfRange(iArr, i2, i6 + i2));
            }
            return m1018g;
        }
        throw C7060f.m21471a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static void m1020e(int[] iArr, int[] iArr2, int i, StringBuilder sb2) {
        EnumC13978b enumC13978b;
        int i2;
        EnumC13978b enumC13978b2 = EnumC13978b.ALPHA;
        EnumC13978b enumC13978b3 = enumC13978b2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C13977a.f35969a[enumC13978b2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 27:
                                        enumC13978b2 = EnumC13978b.LOWER;
                                        break;
                                    case 28:
                                        enumC13978b2 = EnumC13978b.MIXED;
                                        break;
                                    case 29:
                                        enumC13978b = EnumC13978b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC13978b enumC13978b4 = enumC13978b;
                                        enumC13978b3 = enumC13978b2;
                                        enumC13978b2 = enumC13978b4;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                        } else {
                            enumC13978b2 = EnumC13978b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 27:
                                        enumC13978b = EnumC13978b.ALPHA_SHIFT;
                                        c = 0;
                                        EnumC13978b enumC13978b42 = enumC13978b;
                                        enumC13978b3 = enumC13978b2;
                                        enumC13978b2 = enumC13978b42;
                                        break;
                                    case 28:
                                        enumC13978b2 = EnumC13978b.MIXED;
                                        break;
                                    case 29:
                                        enumC13978b = EnumC13978b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC13978b enumC13978b422 = enumC13978b;
                                        enumC13978b3 = enumC13978b2;
                                        enumC13978b2 = enumC13978b422;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                        } else {
                            enumC13978b2 = EnumC13978b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 3:
                    if (i4 < 25) {
                        c = f35967b[i4];
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 25:
                                        enumC13978b2 = EnumC13978b.PUNCT;
                                        break;
                                    case 27:
                                        enumC13978b2 = EnumC13978b.LOWER;
                                        break;
                                    case 28:
                                        enumC13978b2 = EnumC13978b.ALPHA;
                                        break;
                                    case 29:
                                        enumC13978b = EnumC13978b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC13978b enumC13978b4222 = enumC13978b;
                                        enumC13978b3 = enumC13978b2;
                                        enumC13978b2 = enumC13978b4222;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                        } else {
                            enumC13978b2 = EnumC13978b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 4:
                    if (i4 < 29) {
                        c = f35966a[i4];
                        break;
                    } else {
                        if (i4 != 29) {
                            if (i4 != 900) {
                                if (i4 == 913) {
                                    sb2.append((char) iArr2[i3]);
                                }
                            } else {
                                enumC13978b2 = EnumC13978b.ALPHA;
                            }
                        } else {
                            enumC13978b2 = EnumC13978b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        if (i4 != 900) {
                            enumC13978b2 = enumC13978b3;
                        } else {
                            enumC13978b2 = EnumC13978b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                    enumC13978b2 = enumC13978b3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = f35966a[i4];
                    } else {
                        if (i4 != 29) {
                            if (i4 != 900) {
                                if (i4 == 913) {
                                    sb2.append((char) iArr2[i3]);
                                }
                                c = 0;
                            } else {
                                enumC13978b2 = EnumC13978b.ALPHA;
                            }
                        } else {
                            enumC13978b2 = EnumC13978b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                    enumC13978b2 = enumC13978b3;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb2.append(c);
            }
        }
    }

    /* renamed from: f */
    private static int m1019f(int[] iArr, int i, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 928) {
                        switch (i5) {
                        }
                    }
                    i4--;
                    z = true;
                }
                if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                    sb2.append(m1022c(iArr2, i2));
                    i2 = 0;
                }
                i = i4;
            }
        }
        return i;
    }

    /* renamed from: g */
    private static int m1018g(int[] iArr, int i, StringBuilder sb2) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                            }
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = 913;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m1020e(iArr2, iArr3, i3, sb2);
        return i;
    }
}