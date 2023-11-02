package p164j$.time.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p164j$.time.AbstractC8329o;
import p164j$.time.C8295d;
import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8293g;
import p164j$.time.temporal.AbstractC8341i;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8343k;

/* renamed from: j$.time.format.DateTimeFormatter */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: f */
    public static final DateTimeFormatter f22298f;

    /* renamed from: a */
    private final C8303f f22299a;

    /* renamed from: b */
    private final Locale f22300b;

    /* renamed from: c */
    private final C8317t f22301c;

    /* renamed from: d */
    private final InterfaceC8293g f22302d;

    /* renamed from: e */
    private final AbstractC8329o f22303e;

    static {
        C8313p c8313p = new C8313p();
        EnumC8333a enumC8333a = EnumC8333a.YEAR;
        EnumC8319v enumC8319v = EnumC8319v.EXCEEDS_PAD;
        c8313p.m17872j(enumC8333a, 4, 10, enumC8319v);
        c8313p.m17877e('-');
        EnumC8333a enumC8333a2 = EnumC8333a.MONTH_OF_YEAR;
        c8313p.m17870l(enumC8333a2, 2);
        c8313p.m17877e('-');
        EnumC8333a enumC8333a3 = EnumC8333a.DAY_OF_MONTH;
        c8313p.m17870l(enumC8333a3, 2);
        EnumC8318u enumC8318u = EnumC8318u.STRICT;
        C8294h c8294h = C8294h.f22292a;
        DateTimeFormatter m17863s = c8313p.m17863s(enumC8318u, c8294h);
        ISO_LOCAL_DATE = m17863s;
        C8313p c8313p2 = new C8313p();
        c8313p2.m17866p();
        c8313p2.m17881a(m17863s);
        c8313p2.m17874h();
        c8313p2.m17863s(enumC8318u, c8294h);
        C8313p c8313p3 = new C8313p();
        c8313p3.m17866p();
        c8313p3.m17881a(m17863s);
        c8313p3.m17867o();
        c8313p3.m17874h();
        c8313p3.m17863s(enumC8318u, c8294h);
        C8313p c8313p4 = new C8313p();
        EnumC8333a enumC8333a4 = EnumC8333a.HOUR_OF_DAY;
        c8313p4.m17870l(enumC8333a4, 2);
        c8313p4.m17877e(':');
        EnumC8333a enumC8333a5 = EnumC8333a.MINUTE_OF_HOUR;
        c8313p4.m17870l(enumC8333a5, 2);
        c8313p4.m17867o();
        c8313p4.m17877e(':');
        EnumC8333a enumC8333a6 = EnumC8333a.SECOND_OF_MINUTE;
        c8313p4.m17870l(enumC8333a6, 2);
        c8313p4.m17867o();
        c8313p4.m17880b(EnumC8333a.NANO_OF_SECOND);
        DateTimeFormatter m17863s2 = c8313p4.m17863s(enumC8318u, null);
        C8313p c8313p5 = new C8313p();
        c8313p5.m17866p();
        c8313p5.m17881a(m17863s2);
        c8313p5.m17874h();
        c8313p5.m17863s(enumC8318u, null);
        C8313p c8313p6 = new C8313p();
        c8313p6.m17866p();
        c8313p6.m17881a(m17863s2);
        c8313p6.m17867o();
        c8313p6.m17874h();
        c8313p6.m17863s(enumC8318u, null);
        C8313p c8313p7 = new C8313p();
        c8313p7.m17866p();
        c8313p7.m17881a(m17863s);
        c8313p7.m17877e('T');
        c8313p7.m17881a(m17863s2);
        DateTimeFormatter m17863s3 = c8313p7.m17863s(enumC8318u, c8294h);
        C8313p c8313p8 = new C8313p();
        c8313p8.m17866p();
        c8313p8.m17881a(m17863s3);
        c8313p8.m17874h();
        DateTimeFormatter m17863s4 = c8313p8.m17863s(enumC8318u, c8294h);
        C8313p c8313p9 = new C8313p();
        c8313p9.m17881a(m17863s4);
        c8313p9.m17867o();
        c8313p9.m17877e('[');
        c8313p9.m17865q();
        c8313p9.m17869m();
        c8313p9.m17877e(']');
        c8313p9.m17863s(enumC8318u, c8294h);
        C8313p c8313p10 = new C8313p();
        c8313p10.m17881a(m17863s3);
        c8313p10.m17867o();
        c8313p10.m17874h();
        c8313p10.m17867o();
        c8313p10.m17877e('[');
        c8313p10.m17865q();
        c8313p10.m17869m();
        c8313p10.m17877e(']');
        c8313p10.m17863s(enumC8318u, c8294h);
        C8313p c8313p11 = new C8313p();
        c8313p11.m17866p();
        c8313p11.m17872j(enumC8333a, 4, 10, enumC8319v);
        c8313p11.m17877e('-');
        c8313p11.m17870l(EnumC8333a.DAY_OF_YEAR, 3);
        c8313p11.m17867o();
        c8313p11.m17874h();
        c8313p11.m17863s(enumC8318u, c8294h);
        C8313p c8313p12 = new C8313p();
        c8313p12.m17866p();
        c8313p12.m17872j(AbstractC8341i.f22388c, 4, 10, enumC8319v);
        c8313p12.m17876f("-W");
        c8313p12.m17870l(AbstractC8341i.f22387b, 2);
        c8313p12.m17877e('-');
        EnumC8333a enumC8333a7 = EnumC8333a.DAY_OF_WEEK;
        c8313p12.m17870l(enumC8333a7, 1);
        c8313p12.m17867o();
        c8313p12.m17874h();
        c8313p12.m17863s(enumC8318u, c8294h);
        C8313p c8313p13 = new C8313p();
        c8313p13.m17866p();
        c8313p13.m17879c();
        f22298f = c8313p13.m17863s(enumC8318u, null);
        C8313p c8313p14 = new C8313p();
        c8313p14.m17866p();
        c8313p14.m17870l(enumC8333a, 4);
        c8313p14.m17870l(enumC8333a2, 2);
        c8313p14.m17870l(enumC8333a3, 2);
        c8313p14.m17867o();
        c8313p14.m17875g("+HHMMss", "Z");
        c8313p14.m17863s(enumC8318u, c8294h);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C8313p c8313p15 = new C8313p();
        c8313p15.m17866p();
        c8313p15.m17864r();
        c8313p15.m17867o();
        c8313p15.m17873i(enumC8333a7, hashMap);
        c8313p15.m17876f(", ");
        c8313p15.m17868n();
        c8313p15.m17872j(enumC8333a3, 1, 2, EnumC8319v.NOT_NEGATIVE);
        c8313p15.m17877e(' ');
        c8313p15.m17873i(enumC8333a2, hashMap2);
        c8313p15.m17877e(' ');
        c8313p15.m17870l(enumC8333a, 4);
        c8313p15.m17877e(' ');
        c8313p15.m17870l(enumC8333a4, 2);
        c8313p15.m17877e(':');
        c8313p15.m17870l(enumC8333a5, 2);
        c8313p15.m17867o();
        c8313p15.m17877e(':');
        c8313p15.m17870l(enumC8333a6, 2);
        c8313p15.m17868n();
        c8313p15.m17877e(' ');
        c8313p15.m17875g("+HHMM", "GMT");
        c8313p15.m17863s(EnumC8318u.SMART, c8294h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C8303f c8303f, Locale locale, EnumC8318u enumC8318u, C8294h c8294h) {
        C8317t c8317t = C8317t.f22347a;
        this.f22299a = c8303f;
        this.f22300b = locale;
        this.f22301c = c8317t;
        if (enumC8318u == null) {
            throw new NullPointerException("resolverStyle");
        }
        this.f22302d = c8294h;
        this.f22303e = null;
    }

    /* renamed from: a */
    public final String m17893a(InterfaceC8343k interfaceC8343k) {
        StringBuilder sb2 = new StringBuilder(32);
        if (interfaceC8343k != null) {
            try {
                this.f22299a.mo17882a(new C8315r(interfaceC8343k, this), sb2);
                return sb2.toString();
            } catch (IOException e) {
                throw new C8295d(e.getMessage(), e);
            }
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: b */
    public final InterfaceC8293g m17892b() {
        return this.f22302d;
    }

    /* renamed from: c */
    public final C8317t m17891c() {
        return this.f22301c;
    }

    /* renamed from: d */
    public final Locale m17890d() {
        return this.f22300b;
    }

    /* renamed from: e */
    public final AbstractC8329o m17889e() {
        return this.f22303e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C8303f m17888f() {
        return this.f22299a.m17886b();
    }

    public final String toString() {
        String c8303f = this.f22299a.toString();
        return c8303f.startsWith("[") ? c8303f : c8303f.substring(1, c8303f.length() - 1);
    }
}
