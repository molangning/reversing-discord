package net.time4j.base;

import com.facebook.react.views.text.TypefaceStyle;

/* renamed from: net.time4j.base.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10615b {
    /* renamed from: a */
    public static void m11054a(int i, int i2, int i3) {
        if (i >= -999999999 && i <= 999999999) {
            if (i2 >= 1 && i2 <= 12) {
                if (i3 >= 1 && i3 <= 31) {
                    if (i3 <= m11051d(i, i2)) {
                        return;
                    }
                    throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + m11042m(i, i2, i3));
                }
                throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i3);
            }
            throw new IllegalArgumentException("MONTH out of range: " + i2);
        }
        throw new IllegalArgumentException("YEAR out of range: " + i);
    }

    /* renamed from: b */
    private static int m11053b(int i) {
        switch (i) {
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 15;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 23;
            case 12:
                return 25;
            default:
                throw new IllegalArgumentException("Month out of range: " + i);
        }
    }

    /* renamed from: c */
    public static int m11052c(int i, int i2, int i3) {
        if (i3 >= 1 && i3 <= 31) {
            if (i3 <= m11051d(i, i2)) {
                int m11053b = m11053b(i2);
                int i4 = i % 100;
                int m11041a = C10616c.m11041a(i, 100);
                if (i4 < 0) {
                    i4 += 100;
                }
                if (i2 <= 2 && i4 - 1 < 0) {
                    m11041a--;
                    i4 = 99;
                }
                int m11041a2 = (((((i3 + m11053b) + i4) + (i4 / 4)) + C10616c.m11041a(m11041a, 4)) - (m11041a * 2)) % 7;
                if (m11041a2 <= 0) {
                    return m11041a2 + 7;
                }
                return m11041a2;
            }
            throw new IllegalArgumentException("Day exceeds month length: " + m11042m(i, i2, i3));
        }
        throw new IllegalArgumentException("Day out of range: " + i3);
    }

    /* renamed from: d */
    public static int m11051d(int i, int i2) {
        switch (i2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (m11050e(i)) {
                    return 29;
                }
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i2);
        }
    }

    /* renamed from: e */
    public static boolean m11050e(int i) {
        return (i <= 1900 || i >= 2100) ? ((i & 3) == 0 && i % 100 != 0) || i % TypefaceStyle.NORMAL == 0 : (i & 3) == 0;
    }

    /* renamed from: f */
    public static boolean m11049f(int i, int i2, int i3) {
        return i >= -999999999 && i <= 999999999 && i2 >= 1 && i2 <= 12 && i3 >= 1 && i3 <= m11051d(i, i2);
    }

    /* renamed from: g */
    public static int m11048g(long j) {
        return (int) (j & 255);
    }

    /* renamed from: h */
    public static int m11047h(long j) {
        return (int) ((j >> 16) & 255);
    }

    /* renamed from: i */
    public static int m11046i(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: j */
    public static long m11045j(int i, int i2, int i3) {
        m11054a(i, i2, i3);
        long j = i;
        if (i2 < 3) {
            j--;
            i2 += 12;
        }
        return (((((((365 * j) + C10616c.m11040b(j, 4)) - C10616c.m11040b(j, 100)) + C10616c.m11040b(j, TypefaceStyle.NORMAL)) + (((i2 + 1) * 153) / 5)) - 123) + i3) - 678881;
    }

    /* renamed from: k */
    public static long m11044k(InterfaceC10614a interfaceC10614a) {
        return m11045j(interfaceC10614a.mo10482o(), interfaceC10614a.mo10481p(), interfaceC10614a.mo10480r());
    }

    /* renamed from: l */
    public static long m11043l(long j) {
        long j2;
        long m11036f = C10616c.m11036f(j, 678881L);
        long m11040b = C10616c.m11040b(m11036f, 146097);
        int m11038d = C10616c.m11038d(m11036f, 146097);
        int i = 29;
        int i2 = 2;
        if (m11038d == 146096) {
            j2 = (m11040b + 1) * 400;
        } else {
            int i3 = m11038d / 36524;
            int i4 = m11038d % 36524;
            int i5 = i4 / 1461;
            int i6 = i4 % 1461;
            if (i6 == 1460) {
                j2 = (m11040b * 400) + (i3 * 100) + ((i5 + 1) * 4);
            } else {
                int i7 = i6 / 365;
                int i8 = i6 % 365;
                j2 = (m11040b * 400) + (i3 * 100) + (i5 * 4) + i7;
                i2 = 2 + (((i8 + 31) * 5) / 153);
                i = (i8 - (((i2 + 1) * 153) / 5)) + 123;
                if (i2 > 12) {
                    j2++;
                    i2 -= 12;
                }
            }
        }
        if (j2 >= -999999999 && j2 <= 999999999) {
            return (j2 << 32) | (i2 << 16) | i;
        }
        throw new IllegalArgumentException("Year out of range: " + j2);
    }

    /* renamed from: m */
    static String m11042m(int i, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append('-');
        if (i2 < 10) {
            sb2.append('0');
        }
        sb2.append(i2);
        sb2.append('-');
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        return sb2.toString();
    }
}