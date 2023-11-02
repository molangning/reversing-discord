package com.henninghall.date_picker;

import android.content.Context;
import android.content.res.Configuration;
import com.henninghall.date_picker.C5140d;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p163ik.C7677a;

/* renamed from: com.henninghall.date_picker.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5146f {
    /* renamed from: a */
    public static String m26077a(String str) {
        return m26073e(str, C5140d.EnumC5143c.d);
    }

    /* renamed from: b */
    public static String m26076b(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateInstance(0, locale)).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m26075c(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateTimeInstance(0, 0, locale)).toLocalizedPattern().replace(",", "");
    }

    /* renamed from: d */
    public static String m26074d(String str) {
        return m26073e(str, C5140d.EnumC5143c.MMMEd);
    }

    /* renamed from: e */
    private static String m26073e(String str, C5140d.EnumC5143c enumC5143c) {
        try {
            try {
                return C5140d.m26082b(str, enumC5143c);
            } catch (C5140d.C5144d | IndexOutOfBoundsException unused) {
                return C5140d.f14464a.get(enumC5143c);
            }
        } catch (C5140d.C5144d unused2) {
            return C5140d.m26082b(str.substring(0, str.indexOf("_")), enumC5143c);
        }
    }

    /* renamed from: f */
    public static Locale m26072f(String str) {
        try {
            return C7677a.m20096e(str);
        } catch (Exception unused) {
            return C7677a.m20096e(str.substring(0, str.indexOf("_")));
        }
    }

    /* renamed from: g */
    public static String m26071g(Locale locale, int i, Context context) {
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration).getText(i).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m26070h(String str) {
        return m26073e(str, C5140d.EnumC5143c.y);
    }

    /* renamed from: i */
    public static boolean m26069i(Locale locale) {
        DateFormat timeInstance = DateFormat.getTimeInstance(0, locale);
        if (!(timeInstance instanceof SimpleDateFormat) || !((SimpleDateFormat) timeInstance).toPattern().contains("a")) {
            return false;
        }
        return true;
    }
}
