package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C4851r {

    /* renamed from: c */
    private static final C4851r f13526c = new C4851r(null, null);

    /* renamed from: a */
    private final Long f13527a;

    /* renamed from: b */
    private final TimeZone f13528b;

    private C4851r(Long l, TimeZone timeZone) {
        this.f13527a = l;
        this.f13528b = timeZone;
    }

    /* renamed from: c */
    public static C4851r m27229c() {
        return f13526c;
    }

    /* renamed from: a */
    public Calendar m27231a() {
        return m27230b(this.f13528b);
    }

    /* renamed from: b */
    Calendar m27230b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f13527a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}