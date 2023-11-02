package p272oj;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p184jj.EnumC8985j;
import p184jj.InterfaceC8983i;

/* renamed from: oj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C11183f implements InterfaceC8983i {

    /* renamed from: b */
    private static final Locale[] f29227b = new Locale[0];

    /* renamed from: c */
    public static final Set<String> f29228c;

    /* renamed from: d */
    public static final C11183f f29229d;

    /* renamed from: e */
    private static final Map<String, EnumC8985j> f29230e;

    static {
        EnumC8985j[] values;
        String[] split = C11180e.m9040h("i18n/numbers/symbol", Locale.ROOT).m9042f("locales").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        f29228c = Collections.unmodifiableSet(hashSet);
        f29229d = new C11183f();
        HashMap hashMap = new HashMap();
        for (EnumC8985j enumC8985j : EnumC8985j.values()) {
            hashMap.put(enumC8985j.m16878i(), enumC8985j);
        }
        f29230e = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: g */
    private static C11180e m9029g(Locale locale) {
        if (f29228c.contains(EnumC11179d.m9048a(locale))) {
            return C11180e.m9040h("i18n/numbers/symbol", locale);
        }
        return null;
    }

    /* renamed from: h */
    private static char m9028h(Locale locale, String str, char c) {
        C11180e m9029g = m9029g(locale);
        if (m9029g != null && m9029g.m9046b(str)) {
            return m9029g.m9042f(str).charAt(0);
        }
        return c;
    }

    /* renamed from: i */
    private static String m9027i(Locale locale, String str, String str2) {
        C11180e m9029g = m9029g(locale);
        if (m9029g != null && m9029g.m9046b(str)) {
            return m9029g.m9042f(str);
        }
        return str2;
    }

    @Override // p184jj.InterfaceC8983i
    /* renamed from: a */
    public Locale[] mo9035a() {
        return f29227b;
    }

    @Override // p184jj.InterfaceC8983i
    /* renamed from: b */
    public char mo9034b(Locale locale) {
        return m9028h(locale, "separator", InterfaceC8983i.f23619a.mo9034b(locale));
    }

    @Override // p184jj.InterfaceC8983i
    /* renamed from: c */
    public String mo9033c(Locale locale) {
        return m9027i(locale, "plus", InterfaceC8983i.f23619a.mo9033c(locale));
    }

    @Override // p184jj.InterfaceC8983i
    /* renamed from: d */
    public EnumC8985j mo9032d(Locale locale) {
        String m9027i = m9027i(locale, "numsys", EnumC8985j.f23622j.m16878i());
        EnumC8985j enumC8985j = f29230e.get(m9027i);
        if (enumC8985j != null) {
            return enumC8985j;
        }
        throw new IllegalStateException("Unrecognized number system: " + m9027i + " (locale=" + locale + ')');
    }

    @Override // p184jj.InterfaceC8983i
    /* renamed from: e */
    public String mo9031e(Locale locale) {
        return m9027i(locale, "minus", InterfaceC8983i.f23619a.mo9031e(locale));
    }

    @Override // p184jj.InterfaceC8983i
    /* renamed from: f */
    public char mo9030f(Locale locale) {
        return m9028h(locale, "zero", InterfaceC8983i.f23619a.mo9030f(locale));
    }

    public String toString() {
        return "SymbolProviderSPI";
    }
}
