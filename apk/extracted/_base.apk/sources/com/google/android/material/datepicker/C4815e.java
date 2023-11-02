package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4815e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m27326a(long j) {
        return m27325b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m27325b(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = C4853t.m27226b(locale).format(new Date(j));
            return format;
        }
        return C4853t.m27222f(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m27324c(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m27323d(long j) {
        return m27322e(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m27322e(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = C4853t.m27215m(locale).format(new Date(j));
            return format;
        }
        return C4853t.m27222f(locale).format(new Date(j));
    }
}
