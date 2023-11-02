package io.sentry;

import io.sentry.vendor.gson.internal.bind.util.C8253a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* renamed from: io.sentry.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7991j {
    /* renamed from: a */
    public static long m19090a(Date date) {
        return m19083h(date.getTime());
    }

    /* renamed from: b */
    public static double m19089b(Date date) {
        return m19082i(date.getTime());
    }

    /* renamed from: c */
    public static Date m19088c() {
        return Calendar.getInstance(C8253a.f22183a).getTime();
    }

    /* renamed from: d */
    public static Date m19087d(long j) {
        Calendar calendar = Calendar.getInstance(C8253a.f22183a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    /* renamed from: e */
    public static Date m19086e(String str) {
        try {
            return C8253a.m18119f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    /* renamed from: f */
    public static Date m19085f(String str) {
        try {
            return m19087d(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    /* renamed from: g */
    public static String m19084g(Date date) {
        return C8253a.m18123b(date, true);
    }

    /* renamed from: h */
    public static long m19083h(long j) {
        return j * 1000000;
    }

    /* renamed from: i */
    public static double m19082i(double d) {
        return d / 1000.0d;
    }

    /* renamed from: j */
    public static Date m19081j(long j) {
        return m19087d(Double.valueOf(m19080k(Double.valueOf(j).doubleValue())).longValue());
    }

    /* renamed from: k */
    public static double m19080k(double d) {
        return d / 1000000.0d;
    }

    /* renamed from: l */
    public static double m19079l(long j) {
        return Double.valueOf(j).doubleValue() / 1.0E9d;
    }

    /* renamed from: m */
    public static long m19078m(long j) {
        return j * 1000000000;
    }

    /* renamed from: n */
    public static Date m19077n(AbstractC8003k3 abstractC8003k3) {
        if (abstractC8003k3 == null) {
            return null;
        }
        return m19076o(abstractC8003k3);
    }

    /* renamed from: o */
    public static Date m19076o(AbstractC8003k3 abstractC8003k3) {
        return m19081j(abstractC8003k3.mo18864f());
    }
}