package com.henninghall.date_picker;

import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.C10767j0;
import p084ed.EnumC6206d;
import p164j$.util.DesugarTimeZone;

/* renamed from: com.henninghall.date_picker.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5153k {
    /* renamed from: a */
    public static String m26031a(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /* renamed from: b */
    public static String m26030b(Calendar calendar) {
        return m26028d().format(calendar.getTime());
    }

    /* renamed from: c */
    public static boolean m26029c() {
        return !DateFormat.is24HourFormat(C5136a.f14460a);
    }

    /* renamed from: d */
    private static SimpleDateFormat m26028d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* renamed from: e */
    public static String m26027e(Locale locale, String str) {
        ReactApplicationContext reactApplicationContext = C5136a.f14460a;
        return C5146f.m26071g(locale, reactApplicationContext.getResources().getIdentifier(str, "string", reactApplicationContext.getPackageName()), reactApplicationContext);
    }

    /* renamed from: f */
    public static int m26026f(int i, int i2, int i3, boolean z) {
        int i4 = i3 + 1;
        int i5 = i2 - i;
        int i6 = i5 > 0 ? i5 - i4 : i4 + i5;
        if (z) {
            return Math.abs(i5) < Math.abs(i6) ? i5 : i6;
        }
        int i7 = i + i5;
        return (i7 <= i3 && i7 >= 0) ? i5 : i6;
    }

    /* renamed from: g */
    public static boolean m26025g(Calendar calendar) {
        return DateUtils.isToday(calendar.getTimeInMillis());
    }

    /* renamed from: h */
    public static Calendar m26024h(String str, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        try {
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(m26028d().parse(str));
            return calendar;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static EnumC6206d m26023i(char c) {
        if (c != 'H') {
            if (c != 'M') {
                if (c != 'a') {
                    if (c != 'd') {
                        if (c != 'h') {
                            if (c != 'm') {
                                if (c == 'y') {
                                    return EnumC6206d.YEAR;
                                }
                                throw new Exception("Invalid pattern char: " + c);
                            }
                            return EnumC6206d.MINUTE;
                        }
                    } else {
                        return EnumC6206d.DATE;
                    }
                } else {
                    return EnumC6206d.AM_PM;
                }
            } else {
                return EnumC6206d.MONTH;
            }
        }
        return EnumC6206d.HOUR;
    }

    /* renamed from: j */
    public static String m26022j(Locale locale) {
        return C10767j0.m10305b(locale).m10304c();
    }

    /* renamed from: k */
    public static int m26021k(int i) {
        return (int) (i * C5136a.f14460a.getResources().getDisplayMetrics().density);
    }

    /* renamed from: l */
    public static String m26020l(int i) {
        return new DecimalFormat("00").format(i);
    }
}