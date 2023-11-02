package net.time4j.history;

import net.time4j.base.C10616c;

/* renamed from: net.time4j.history.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C10750m {
    /* renamed from: a */
    public static void m10336a(int i, int i2, int i3) {
        if (i >= -999999999 && i <= 999999999) {
            if (i2 >= 1 && i2 <= 12) {
                if (i3 >= 1 && i3 <= 31) {
                    if (i3 <= m10335b(i, i2)) {
                        return;
                    }
                    throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + m10327j(i, i2, i3));
                }
                throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i3);
            }
            throw new IllegalArgumentException("MONTH out of range: " + i2);
        }
        throw new IllegalArgumentException("YEAR out of range: " + i);
    }

    /* renamed from: b */
    public static int m10335b(int i, int i2) {
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
                if (m10334c(i)) {
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

    /* renamed from: c */
    public static boolean m10334c(int i) {
        return C10616c.m11039c(i, 4) == 0;
    }

    /* renamed from: d */
    public static boolean m10333d(int i, int i2, int i3) {
        return i >= -999999999 && i <= 999999999 && i2 >= 1 && i2 <= 12 && i3 >= 1 && i3 <= m10335b(i, i2);
    }

    /* renamed from: e */
    public static int m10332e(long j) {
        return (int) (j & 255);
    }

    /* renamed from: f */
    public static int m10331f(long j) {
        return (int) ((j >> 16) & 255);
    }

    /* renamed from: g */
    public static int m10330g(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: h */
    public static long m10329h(int i, int i2, int i3) {
        m10336a(i, i2, i3);
        long j = i;
        if (i2 < 3) {
            j--;
            i2 += 12;
        }
        return (((((365 * j) + C10616c.m11040b(j, 4)) + (((i2 + 1) * 153) / 5)) - 123) + i3) - 678883;
    }

    /* renamed from: i */
    public static long m10328i(long j) {
        long j2;
        int i;
        long m11036f = C10616c.m11036f(j, 678883L);
        long m11040b = C10616c.m11040b(m11036f, 1461);
        int m11038d = C10616c.m11038d(m11036f, 1461);
        int i2 = 2;
        if (m11038d == 1460) {
            j2 = (m11040b + 1) * 4;
            i = 29;
        } else {
            int i3 = m11038d / 365;
            int i4 = m11038d % 365;
            j2 = (m11040b * 4) + i3;
            i2 = 2 + (((i4 + 31) * 5) / 153);
            i = (i4 - (((i2 + 1) * 153) / 5)) + 123;
            if (i2 > 12) {
                j2++;
                i2 -= 12;
            }
        }
        if (j2 >= -999999999 && j2 <= 999999999) {
            return i | (j2 << 32) | (i2 << 16);
        }
        throw new IllegalArgumentException("Year out of range: " + j2);
    }

    /* renamed from: j */
    private static String m10327j(int i, int i2, int i3) {
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