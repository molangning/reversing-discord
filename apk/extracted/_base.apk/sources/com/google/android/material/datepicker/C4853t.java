package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p164j$.util.DesugarTimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4853t {

    /* renamed from: a */
    static AtomicReference<C4851r> f13529a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m27227a(long j) {
        Calendar m27217k = m27217k();
        m27217k.setTimeInMillis(j);
        return m27224d(m27217k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m27226b(Locale locale) {
        return m27225c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m27225c(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m27218j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m27224d(Calendar calendar) {
        Calendar m27216l = m27216l(calendar);
        Calendar m27217k = m27217k();
        m27217k.set(m27216l.get(1), m27216l.get(2), m27216l.get(5));
        return m27217k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m27223e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m27220h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m27222f(Locale locale) {
        return m27223e(0, locale);
    }

    /* renamed from: g */
    static C4851r m27221g() {
        C4851r c4851r = f13529a.get();
        if (c4851r == null) {
            return C4851r.m27229c();
        }
        return c4851r;
    }

    /* renamed from: h */
    private static TimeZone m27220h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m27219i() {
        Calendar m27231a = m27221g().m27231a();
        m27231a.set(11, 0);
        m27231a.set(12, 0);
        m27231a.set(13, 0);
        m27231a.set(14, 0);
        m27231a.setTimeZone(m27220h());
        return m27231a;
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m27218j() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        return timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m27217k() {
        return m27216l(null);
    }

    /* renamed from: l */
    static Calendar m27216l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m27220h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: m */
    public static DateFormat m27215m(Locale locale) {
        return m27225c("yMMMEd", locale);
    }
}
