package p202kj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10617d;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7662o;
import p164j$.util.concurrent.ConcurrentHashMap;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p184jj.EnumC8985j;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC8983i;
import p272oj.C11183f;
import p272oj.EnumC11179d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9476b implements InterfaceC7633d {

    /* renamed from: g */
    static final InterfaceC7631c<String> f25071g = C8969a.m16928e("PLUS_SIGN", String.class);

    /* renamed from: h */
    static final InterfaceC7631c<String> f25072h = C8969a.m16928e("MINUS_SIGN", String.class);

    /* renamed from: i */
    private static final InterfaceC8983i f25073i;

    /* renamed from: j */
    private static final char f25074j;

    /* renamed from: k */
    private static final ConcurrentMap<String, C9477a> f25075k;

    /* renamed from: l */
    private static final C9477a f25076l;

    /* renamed from: a */
    private final Map<String, Object> f25077a;

    /* renamed from: b */
    private final C8969a f25078b;

    /* renamed from: c */
    private final Locale f25079c;

    /* renamed from: d */
    private final int f25080d;

    /* renamed from: e */
    private final int f25081e;

    /* renamed from: f */
    private final InterfaceC7660n<InterfaceC7662o> f25082f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kj.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9477a {

        /* renamed from: a */
        private final EnumC8985j f25083a;

        /* renamed from: b */
        private final char f25084b;

        /* renamed from: c */
        private final char f25085c;

        /* renamed from: d */
        private final String f25086d;

        /* renamed from: e */
        private final String f25087e;

        C9477a(EnumC8985j enumC8985j, char c, char c2, String str, String str2) {
            this.f25083a = enumC8985j;
            this.f25084b = c;
            this.f25085c = c2;
            this.f25086d = str;
            this.f25087e = str2;
        }
    }

    static {
        char c;
        InterfaceC8983i interfaceC8983i = null;
        int i = 0;
        for (InterfaceC8983i interfaceC8983i2 : AbstractC10617d.m11026c().mo11022g(InterfaceC8983i.class)) {
            int length = interfaceC8983i2.mo9035a().length;
            if (length > i) {
                interfaceC8983i = interfaceC8983i2;
                i = length;
            }
        }
        if (interfaceC8983i == null) {
            interfaceC8983i = C11183f.f29229d;
        }
        f25073i = interfaceC8983i;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        char c2 = c;
        f25074j = c2;
        f25075k = new ConcurrentHashMap();
        f25076l = new C9477a(EnumC8985j.f23622j, '0', c2, "+", "-");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9476b(C8969a c8969a, Locale locale) {
        this(c8969a, locale, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C9476b m14681d(C7672x<?> c7672x, C8969a c8969a, Locale locale) {
        C8969a.C8971b c8971b = new C8969a.C8971b(c7672x);
        c8971b.m16923d(C8969a.f23565f, EnumC8981g.SMART);
        c8971b.m16923d(C8969a.f23566g, EnumC9016v.WIDE);
        c8971b.m16923d(C8969a.f23567h, EnumC9003m.FORMAT);
        c8971b.m16925b(C8969a.f23575p, ' ');
        c8971b.m16921f(c8969a);
        return new C9476b(c8971b.m16926a(), locale).m14671n(locale);
    }

    /* renamed from: j */
    private static boolean m14675j(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C9476b m14674k(C9476b c9476b, C9476b c9476b2) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(c9476b2.f25077a);
        hashMap.putAll(c9476b.f25077a);
        return new C9476b(new C8969a.C8971b().m16921f(c9476b2.f25078b).m16921f(c9476b.f25078b).m16926a(), Locale.ROOT, 0, 0, null, hashMap).m14671n(c9476b.f25079c);
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: a */
    public boolean mo14442a(InterfaceC7631c<?> interfaceC7631c) {
        if (this.f25077a.containsKey(interfaceC7631c.name())) {
            return true;
        }
        return this.f25078b.mo14442a(interfaceC7631c);
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: b */
    public <A> A mo14441b(InterfaceC7631c<A> interfaceC7631c, A a) {
        if (this.f25077a.containsKey(interfaceC7631c.name())) {
            return interfaceC7631c.type().cast(this.f25077a.get(interfaceC7631c.name()));
        }
        return (A) this.f25078b.mo14441b(interfaceC7631c, a);
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: c */
    public <A> A mo14440c(InterfaceC7631c<A> interfaceC7631c) {
        if (this.f25077a.containsKey(interfaceC7631c.name())) {
            return interfaceC7631c.type().cast(this.f25077a.get(interfaceC7631c.name()));
        }
        return (A) this.f25078b.mo14440c(interfaceC7631c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C8969a m14680e() {
        return this.f25078b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9476b)) {
            return false;
        }
        C9476b c9476b = (C9476b) obj;
        if (this.f25078b.equals(c9476b.f25078b) && this.f25079c.equals(c9476b.f25079c) && this.f25080d == c9476b.f25080d && this.f25081e == c9476b.f25081e && m14675j(this.f25082f, c9476b.f25082f) && this.f25077a.equals(c9476b.f25077a)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public InterfaceC7660n<InterfaceC7662o> m14679f() {
        return this.f25082f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m14678g() {
        return this.f25080d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Locale m14677h() {
        return this.f25079c;
    }

    public int hashCode() {
        return (this.f25078b.hashCode() * 7) + (this.f25077a.hashCode() * 37);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m14676i() {
        return this.f25081e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C9476b m14673l(C8969a c8969a) {
        return new C9476b(c8969a, this.f25079c, this.f25080d, this.f25081e, this.f25082f, this.f25077a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public <A> C9476b m14672m(InterfaceC7631c<A> interfaceC7631c, A a) {
        HashMap hashMap = new HashMap(this.f25077a);
        if (a == null) {
            hashMap.remove(interfaceC7631c.name());
        } else {
            hashMap.put(interfaceC7631c.name(), a);
        }
        return new C9476b(this.f25078b, this.f25079c, this.f25080d, this.f25081e, this.f25082f, hashMap);
    }

    /* renamed from: n */
    C9476b m14671n(Locale locale) {
        String str;
        String str2;
        C8969a.C8971b c8971b = new C8969a.C8971b();
        c8971b.m16921f(this.f25078b);
        String m9048a = EnumC11179d.m9048a(locale);
        String country = locale.getCountry();
        if (m9048a.isEmpty() && country.isEmpty()) {
            locale = Locale.ROOT;
            c8971b.m16923d(C8969a.f23571l, EnumC8985j.f23622j);
            c8971b.m16925b(C8969a.f23574o, f25074j);
            str = "+";
            str2 = "-";
        } else {
            if (!country.isEmpty()) {
                m9048a = m9048a + "_" + country;
            }
            C9477a c9477a = f25075k.get(m9048a);
            if (c9477a == null) {
                try {
                    InterfaceC8983i interfaceC8983i = f25073i;
                    c9477a = new C9477a(interfaceC8983i.mo9032d(locale), interfaceC8983i.mo9030f(locale), interfaceC8983i.mo9034b(locale), interfaceC8983i.mo9033c(locale), interfaceC8983i.mo9031e(locale));
                } catch (RuntimeException unused) {
                    c9477a = f25076l;
                }
                C9477a putIfAbsent = f25075k.putIfAbsent(m9048a, c9477a);
                if (putIfAbsent != null) {
                    c9477a = putIfAbsent;
                }
            }
            c8971b.m16923d(C8969a.f23571l, c9477a.f25083a);
            c8971b.m16925b(C8969a.f23572m, c9477a.f25084b);
            c8971b.m16925b(C8969a.f23574o, c9477a.f25085c);
            str = c9477a.f25086d;
            str2 = c9477a.f25087e;
        }
        Locale locale2 = locale;
        c8971b.m16919h(locale2);
        HashMap hashMap = new HashMap(this.f25077a);
        hashMap.put(f25071g.name(), str);
        hashMap.put(f25072h.name(), str2);
        return new C9476b(c8971b.m16926a(), locale2, this.f25080d, this.f25081e, this.f25082f, hashMap);
    }

    public String toString() {
        return C9476b.class.getName() + "[attributes=" + this.f25078b + ",locale=" + this.f25079c + ",level=" + this.f25080d + ",section=" + this.f25081e + ",print-condition=" + this.f25082f + ",other=" + this.f25077a + ']';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9476b(C8969a c8969a, Locale locale, int i, int i2, InterfaceC7660n<InterfaceC7662o> interfaceC7660n) {
        if (c8969a != null) {
            this.f25078b = c8969a;
            this.f25079c = locale == null ? Locale.ROOT : locale;
            this.f25080d = i;
            this.f25081e = i2;
            this.f25082f = interfaceC7660n;
            this.f25077a = Collections.emptyMap();
            return;
        }
        throw new NullPointerException("Missing format attributes.");
    }

    private C9476b(C8969a c8969a, Locale locale, int i, int i2, InterfaceC7660n<InterfaceC7662o> interfaceC7660n, Map<String, Object> map) {
        if (c8969a != null) {
            this.f25078b = c8969a;
            this.f25079c = locale == null ? Locale.ROOT : locale;
            this.f25080d = i;
            this.f25081e = i2;
            this.f25082f = interfaceC7660n;
            this.f25077a = Collections.unmodifiableMap(map);
            return;
        }
        throw new NullPointerException("Missing format attributes.");
    }
}
