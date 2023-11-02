package androidx.core.util;

import java.io.PrintWriter;

/* renamed from: androidx.core.util.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1140h {

    /* renamed from: a */
    private static final Object f3510a = new Object();

    /* renamed from: b */
    private static char[] f3511b = new char[24];

    /* renamed from: a */
    private static int m37820a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m37819b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m37817d(j - j2, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m37818c(long j, PrintWriter printWriter) {
        m37817d(j, printWriter, 0);
    }

    /* renamed from: d */
    public static void m37817d(long j, PrintWriter printWriter, int i) {
        synchronized (f3510a) {
            printWriter.print(new String(f3511b, 0, m37816e(j, i)));
        }
    }

    /* renamed from: e */
    private static int m37816e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        int i11;
        long j2 = j;
        if (f3511b.length < i) {
            f3511b = new char[i];
        }
        char[] cArr = f3511b;
        int i12 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i12 == 0) {
            int i13 = i - 1;
            while (i13 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i12 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i14 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i4 = floor - (i15 * 60);
            i5 = i15;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int m37820a = m37820a(i2, 1, false, 0);
            if (m37820a > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int m37820a2 = m37820a + m37820a(i3, 1, z5, 2);
            if (m37820a2 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int m37820a3 = m37820a2 + m37820a(i5, 1, z6, 2);
            if (m37820a3 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int m37820a4 = m37820a3 + m37820a(i4, 1, z7, 2);
            if (m37820a4 > 0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            i6 = 0;
            for (int m37820a5 = m37820a4 + m37820a(i14, 2, true, i11) + 1; m37820a5 < i; m37820a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i16 = i6 + 1;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int m37815f = m37815f(cArr, i2, 'd', i16, false, 0);
        if (m37815f != i16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int m37815f2 = m37815f(cArr, i3, 'h', m37815f, z2, i7);
        if (m37815f2 != i16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int m37815f3 = m37815f(cArr, i5, 'm', m37815f2, z3, i8);
        if (m37815f3 != i16) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int m37815f4 = m37815f(cArr, i4, 's', m37815f3, z4, i9);
        if (z && m37815f4 != i16) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        int m37815f5 = m37815f(cArr, i14, 'm', m37815f4, true, i10);
        cArr[m37815f5] = 's';
        return m37815f5 + 1;
    }

    /* renamed from: f */
    private static int m37815f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((z && i3 >= 3) || i > 99) {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            } else {
                i4 = i2;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            int i7 = i4 + 1;
            cArr[i7] = c;
            return i7 + 1;
        }
        return i2;
    }
}
