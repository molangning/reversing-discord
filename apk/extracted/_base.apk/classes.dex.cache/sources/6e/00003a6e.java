package io.sentry.vendor.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p164j$.util.DesugarTimeZone;

/* renamed from: io.sentry.vendor.gson.internal.bind.util.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8253a {

    /* renamed from: a */
    public static final TimeZone f22183a = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    private static boolean m18124a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: b */
    public static String m18123b(Date date, boolean z) {
        return m18122c(date, z, f22183a);
    }

    /* renamed from: c */
    public static String m18122c(Date date, boolean z, TimeZone timeZone) {
        int i;
        int i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        int i3 = 19 + i;
        if (timeZone.getRawOffset() == 0) {
            i2 = 1;
        } else {
            i2 = 6;
        }
        StringBuilder sb2 = new StringBuilder(i3 + i2);
        m18120e(sb2, gregorianCalendar.get(1), 4);
        char c = '-';
        sb2.append('-');
        m18120e(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        m18120e(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        m18120e(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        m18120e(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        m18120e(sb2, gregorianCalendar.get(13), 2);
        if (z) {
            sb2.append('.');
            m18120e(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / 60000;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            if (offset >= 0) {
                c = '+';
            }
            sb2.append(c);
            m18120e(sb2, abs, 2);
            sb2.append(':');
            m18120e(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    /* renamed from: d */
    private static int m18121d(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            } else {
                return i;
            }
        }
        return str.length();
    }

    /* renamed from: e */
    private static void m18120e(StringBuilder sb2, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:98:0x0004, B:100:0x0016, B:101:0x0018, B:103:0x0024, B:104:0x0026, B:106:0x0035, B:108:0x003b, B:112:0x0050, B:114:0x0060, B:115:0x0062, B:117:0x006e, B:118:0x0070, B:120:0x0076, B:124:0x0080, B:129:0x0090, B:131:0x0098, B:142:0x00c9, B:144:0x00cf, B:146:0x00d6, B:170:0x0183, B:150:0x00e0, B:151:0x00fb, B:152:0x00fc, B:156:0x0118, B:158:0x0125, B:161:0x012e, B:163:0x014d, B:166:0x015c, B:167:0x017e, B:169:0x0181, B:155:0x0107, B:172:0x01b4, B:173:0x01bb, B:135:0x00b0, B:136:0x00b3), top: B:189:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:98:0x0004, B:100:0x0016, B:101:0x0018, B:103:0x0024, B:104:0x0026, B:106:0x0035, B:108:0x003b, B:112:0x0050, B:114:0x0060, B:115:0x0062, B:117:0x006e, B:118:0x0070, B:120:0x0076, B:124:0x0080, B:129:0x0090, B:131:0x0098, B:142:0x00c9, B:144:0x00cf, B:146:0x00d6, B:170:0x0183, B:150:0x00e0, B:151:0x00fb, B:152:0x00fc, B:156:0x0118, B:158:0x0125, B:161:0x012e, B:163:0x014d, B:166:0x015c, B:167:0x017e, B:169:0x0181, B:155:0x0107, B:172:0x01b4, B:173:0x01bb, B:135:0x00b0, B:136:0x00b3), top: B:189:0x0004 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date m18119f(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.internal.bind.util.C8253a.m18119f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: g */
    private static int m18118g(String str, int i, int i2) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }
}