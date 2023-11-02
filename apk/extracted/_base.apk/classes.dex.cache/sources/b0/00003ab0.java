package p164j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p164j$.time.AbstractC8329o;
import p164j$.time.ZoneOffset;
import p164j$.time.chrono.C8294h;
import p164j$.time.temporal.AbstractC8341i;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.format.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8313p {

    /* renamed from: f */
    private static final C8298a f22332f = new InterfaceC8346n() { // from class: j$.time.format.a
        @Override // p164j$.time.temporal.InterfaceC8346n
        /* renamed from: a */
        public final Object mo17796a(InterfaceC8343k interfaceC8343k) {
            int i = C8313p.f22333g;
            AbstractC8329o abstractC8329o = (AbstractC8329o) interfaceC8343k.mo17802d(AbstractC8342j.m17806j());
            if (abstractC8329o == null || (abstractC8329o instanceof ZoneOffset)) {
                return null;
            }
            return abstractC8329o;
        }
    };

    /* renamed from: g */
    public static final /* synthetic */ int f22333g = 0;

    /* renamed from: a */
    private C8313p f22334a;

    /* renamed from: b */
    private final C8313p f22335b;

    /* renamed from: c */
    private final ArrayList f22336c;

    /* renamed from: d */
    private final boolean f22337d;

    /* renamed from: e */
    private int f22338e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', EnumC8333a.ERA);
        hashMap.put('y', EnumC8333a.YEAR_OF_ERA);
        hashMap.put('u', EnumC8333a.YEAR);
        InterfaceC8344l interfaceC8344l = AbstractC8341i.f22386a;
        hashMap.put('Q', interfaceC8344l);
        hashMap.put('q', interfaceC8344l);
        EnumC8333a enumC8333a = EnumC8333a.MONTH_OF_YEAR;
        hashMap.put('M', enumC8333a);
        hashMap.put('L', enumC8333a);
        hashMap.put('D', EnumC8333a.DAY_OF_YEAR);
        hashMap.put('d', EnumC8333a.DAY_OF_MONTH);
        hashMap.put('F', EnumC8333a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC8333a enumC8333a2 = EnumC8333a.DAY_OF_WEEK;
        hashMap.put('E', enumC8333a2);
        hashMap.put('c', enumC8333a2);
        hashMap.put('e', enumC8333a2);
        hashMap.put('a', EnumC8333a.AMPM_OF_DAY);
        hashMap.put('H', EnumC8333a.HOUR_OF_DAY);
        hashMap.put('k', EnumC8333a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', EnumC8333a.HOUR_OF_AMPM);
        hashMap.put('h', EnumC8333a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', EnumC8333a.MINUTE_OF_HOUR);
        hashMap.put('s', EnumC8333a.SECOND_OF_MINUTE);
        EnumC8333a enumC8333a3 = EnumC8333a.NANO_OF_SECOND;
        hashMap.put('S', enumC8333a3);
        hashMap.put('A', EnumC8333a.MILLI_OF_DAY);
        hashMap.put('n', enumC8333a3);
        hashMap.put('N', EnumC8333a.NANO_OF_DAY);
    }

    public C8313p() {
        this.f22334a = this;
        this.f22336c = new ArrayList();
        this.f22338e = -1;
        this.f22335b = null;
        this.f22337d = false;
    }

    private C8313p(C8313p c8313p) {
        this.f22334a = this;
        this.f22336c = new ArrayList();
        this.f22338e = -1;
        this.f22335b = c8313p;
        this.f22337d = true;
    }

    /* renamed from: d */
    private int m17878d(InterfaceC8304g interfaceC8304g) {
        if (interfaceC8304g != null) {
            C8313p c8313p = this.f22334a;
            c8313p.getClass();
            c8313p.f22336c.add(interfaceC8304g);
            C8313p c8313p2 = this.f22334a;
            c8313p2.f22338e = -1;
            return c8313p2.f22336c.size() - 1;
        }
        throw new NullPointerException("pp");
    }

    /* renamed from: k */
    private void m17871k(C8307j c8307j) {
        C8307j m17884c;
        EnumC8319v enumC8319v;
        C8313p c8313p = this.f22334a;
        int i = c8313p.f22338e;
        if (i < 0) {
            c8313p.f22338e = m17878d(c8307j);
            return;
        }
        C8307j c8307j2 = (C8307j) c8313p.f22336c.get(i);
        int i2 = c8307j.f22317b;
        int i3 = c8307j.f22318c;
        if (i2 == i3) {
            enumC8319v = c8307j.f22319d;
            if (enumC8319v == EnumC8319v.NOT_NEGATIVE) {
                m17884c = c8307j2.m17883d(i3);
                m17878d(c8307j.m17884c());
                this.f22334a.f22338e = i;
                this.f22334a.f22336c.set(i, m17884c);
            }
        }
        m17884c = c8307j2.m17884c();
        this.f22334a.f22338e = m17878d(c8307j);
        this.f22334a.f22336c.set(i, m17884c);
    }

    /* renamed from: a */
    public final void m17881a(DateTimeFormatter dateTimeFormatter) {
        m17878d(dateTimeFormatter.m17888f());
    }

    /* renamed from: b */
    public final void m17880b(EnumC8333a enumC8333a) {
        m17878d(new C8305h(enumC8333a));
    }

    /* renamed from: c */
    public final void m17879c() {
        m17878d(new C8306i());
    }

    /* renamed from: e */
    public final void m17877e(char c) {
        m17878d(new C8302e(c));
    }

    /* renamed from: f */
    public final void m17876f(String str) {
        if (str.length() > 0) {
            m17878d(str.length() == 1 ? new C8302e(str.charAt(0)) : new C8310m(str));
        }
    }

    /* renamed from: g */
    public final void m17875g(String str, String str2) {
        m17878d(new C8308k(str, str2));
    }

    /* renamed from: h */
    public final void m17874h() {
        m17878d(C8308k.f22322d);
    }

    /* renamed from: i */
    public final void m17873i(EnumC8333a enumC8333a, HashMap hashMap) {
        if (enumC8333a == null) {
            throw new NullPointerException("field");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        EnumC8320w enumC8320w = EnumC8320w.FULL;
        m17878d(new C8311n(enumC8333a, enumC8320w, new C8299b(new C8316s(Collections.singletonMap(enumC8320w, linkedHashMap)))));
    }

    /* renamed from: j */
    public final C8313p m17872j(InterfaceC8344l interfaceC8344l, int i, int i2, EnumC8319v enumC8319v) {
        if (i == i2 && enumC8319v == EnumC8319v.NOT_NEGATIVE) {
            m17870l(interfaceC8344l, i2);
            return this;
        } else if (interfaceC8344l != null) {
            if (enumC8319v != null) {
                if (i < 1 || i > 19) {
                    throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
                } else if (i2 < 1 || i2 > 19) {
                    throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
                } else if (i2 >= i) {
                    m17871k(new C8307j(interfaceC8344l, i, i2, enumC8319v));
                    return this;
                } else {
                    throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
                }
            }
            throw new NullPointerException("signStyle");
        } else {
            throw new NullPointerException("field");
        }
    }

    /* renamed from: l */
    public final void m17870l(InterfaceC8344l interfaceC8344l, int i) {
        if (interfaceC8344l == null) {
            throw new NullPointerException("field");
        }
        if (i >= 1 && i <= 19) {
            m17871k(new C8307j(interfaceC8344l, i, i, EnumC8319v.NOT_NEGATIVE));
            return;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
    }

    /* renamed from: m */
    public final void m17869m() {
        m17878d(new C8312o(f22332f));
    }

    /* renamed from: n */
    public final void m17868n() {
        C8313p c8313p = this.f22334a;
        if (c8313p.f22335b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (c8313p.f22336c.size() <= 0) {
            this.f22334a = this.f22334a.f22335b;
            return;
        }
        C8313p c8313p2 = this.f22334a;
        C8303f c8303f = new C8303f(c8313p2.f22336c, c8313p2.f22337d);
        this.f22334a = this.f22334a.f22335b;
        m17878d(c8303f);
    }

    /* renamed from: o */
    public final void m17867o() {
        C8313p c8313p = this.f22334a;
        c8313p.f22338e = -1;
        this.f22334a = new C8313p(c8313p);
    }

    /* renamed from: p */
    public final void m17866p() {
        m17878d(EnumC8309l.INSENSITIVE);
    }

    /* renamed from: q */
    public final void m17865q() {
        m17878d(EnumC8309l.SENSITIVE);
    }

    /* renamed from: r */
    public final void m17864r() {
        m17878d(EnumC8309l.LENIENT);
    }

    /* renamed from: s */
    public final DateTimeFormatter m17863s(EnumC8318u enumC8318u, C8294h c8294h) {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            while (this.f22334a.f22335b != null) {
                m17868n();
            }
            C8303f c8303f = new C8303f(this.f22336c, false);
            C8317t c8317t = C8317t.f22347a;
            return new DateTimeFormatter(c8303f, locale, enumC8318u, c8294h);
        }
        throw new NullPointerException("locale");
    }
}