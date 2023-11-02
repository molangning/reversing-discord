package p202kj;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.InterfaceC10620f;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.EnumC10803f;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p164j$.util.concurrent.ConcurrentHashMap;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC8981g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9511n implements InterfaceC9500h<InterfaceC10808k> {

    /* renamed from: r */
    private static final C10835p f25224r = C10835p.m10020q(64800);

    /* renamed from: s */
    private static final ConcurrentMap<Locale, String> f25225s = new ConcurrentHashMap();

    /* renamed from: t */
    private static final ConcurrentMap<Locale, C9512a> f25226t = new ConcurrentHashMap();

    /* renamed from: j */
    private final boolean f25227j;

    /* renamed from: k */
    private final boolean f25228k;

    /* renamed from: l */
    private final boolean f25229l;

    /* renamed from: m */
    private final Locale f25230m;

    /* renamed from: n */
    private final String f25231n;

    /* renamed from: o */
    private final String f25232o;

    /* renamed from: p */
    private final char f25233p;

    /* renamed from: q */
    private final EnumC8981g f25234q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kj.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9512a {

        /* renamed from: a */
        private final String f25235a;

        /* renamed from: b */
        private final String f25236b;

        /* renamed from: c */
        private final int f25237c;

        /* renamed from: d */
        private final int f25238d;

        C9512a(String str, String str2, int i, int i2) {
            this.f25235a = str;
            this.f25236b = str2;
            this.f25237c = i;
            this.f25238d = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9511n(boolean z) {
        this(z, true, false, Locale.ROOT, "+", "-", '0', EnumC8981g.SMART);
    }

    /* renamed from: a */
    private static boolean m14456a(char c, char c2) {
        if (c != c2 && Character.toUpperCase(c) != Character.toUpperCase(c2) && Character.toLowerCase(c) != Character.toLowerCase(c2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m14455b(Locale locale) {
        ConcurrentMap<Locale, String> concurrentMap = f25225s;
        String str = concurrentMap.get(locale);
        if (str == null) {
            String m10023n = C10835p.f28295t.m10023n(locale);
            String putIfAbsent = concurrentMap.putIfAbsent(locale, m10023n);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return m10023n;
        }
        return str;
    }

    /* renamed from: i */
    private static C10835p m14454i(InterfaceC7662o interfaceC7662o, InterfaceC7633d interfaceC7633d) {
        InterfaceC7631c<InterfaceC10808k> interfaceC7631c = C8969a.f23563d;
        if (interfaceC7633d.mo14442a(interfaceC7631c)) {
            InterfaceC10808k interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14440c(interfaceC7631c);
            if (interfaceC10808k instanceof C10835p) {
                return (C10835p) interfaceC10808k;
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + interfaceC7662o);
    }

    /* renamed from: j */
    private static C9512a m14453j(Locale locale) {
        C9512a c9512a = f25226t.get(locale);
        if (c9512a == null) {
            String m10023n = f25224r.m10023n(locale);
            int length = m10023n.length();
            for (int i = 0; i < length; i++) {
                if (m10023n.charAt(i) == 177) {
                    int indexOf = m10023n.indexOf("hh", i) + 2;
                    int indexOf2 = m10023n.indexOf("mm", indexOf);
                    C9512a c9512a2 = new C9512a(m10023n, m10023n.substring(indexOf, indexOf2), i, indexOf2 + 2);
                    C9512a putIfAbsent = f25226t.putIfAbsent(locale, c9512a2);
                    if (putIfAbsent == null) {
                        return c9512a2;
                    }
                    return putIfAbsent;
                }
            }
            return c9512a;
        }
        return c9512a;
    }

    /* renamed from: k */
    private static int m14452k(CharSequence charSequence, int i, char c) {
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length()) {
                if (i3 == 0) {
                    return -1000;
                }
                return ~i2;
            }
            int charAt = charSequence.charAt(i4) - c;
            if (charAt >= 0 && charAt <= 9) {
                i2 = (i2 * 10) + charAt;
            } else if (i3 == 0) {
                return -1000;
            } else {
                return ~i2;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static int m14451l(CharSequence charSequence, int i, char c) {
        int charAt;
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length() || (charAt = charSequence.charAt(i4) - c) < 0 || charAt > 9) {
                return -1000;
            }
            i2 = (i2 * 10) + charAt;
        }
        return i2;
    }

    /* renamed from: m */
    private static int m14450m(CharSequence charSequence, int i, int i2, Locale locale, boolean z) {
        String[] strArr = {"GMT", m14455b(locale), "UTC", "UT"};
        for (int i3 = 0; i3 < 4; i3++) {
            String str = strArr[i3];
            int length = str.length();
            if (i - i2 >= length) {
                String charSequence2 = charSequence.subSequence(i2, i2 + length).toString();
                if ((z && charSequence2.equalsIgnoreCase(str)) || (!z && charSequence2.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<InterfaceC10808k> mo14365c() {
        return EnumC9478b0.TIMEZONE_OFFSET;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        int i;
        InterfaceC10808k interfaceC10808k;
        C10835p mo10161B;
        Locale locale;
        char charValue;
        String str;
        String str2;
        boolean booleanValue;
        int i2;
        C10835p c10835p;
        char c;
        int length;
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        if (interfaceC7662o.mo10217d()) {
            interfaceC10808k = interfaceC7662o.mo10209t();
        } else {
            interfaceC10808k = null;
        }
        if (interfaceC10808k == null) {
            mo10161B = m14454i(interfaceC7662o, interfaceC7633d);
        } else if (interfaceC10808k instanceof C10835p) {
            mo10161B = (C10835p) interfaceC10808k;
        } else if (interfaceC7662o instanceof InterfaceC10620f) {
            mo10161B = AbstractC10809l.m10149N(interfaceC10808k).mo10161B((InterfaceC10620f) interfaceC7662o);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + interfaceC7662o);
        }
        if (z) {
            locale = this.f25230m;
        } else {
            locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
        }
        char c2 = '0';
        if (z) {
            charValue = this.f25233p;
        } else {
            charValue = ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue();
        }
        if (z) {
            str = this.f25231n;
        } else {
            str = (String) interfaceC7633d.mo14441b(C9476b.f25071g, "+");
        }
        if (z) {
            str2 = this.f25232o;
        } else {
            str2 = (String) interfaceC7633d.mo14441b(C9476b.f25072h, "-");
        }
        if (z) {
            booleanValue = this.f25229l;
        } else {
            booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23573n, Boolean.FALSE)).booleanValue();
        }
        int m10026k = mo10161B.m10026k();
        int m10027i = mo10161B.m10027i();
        if (!booleanValue && m10026k == 0 && m10027i == 0) {
            String m14455b = m14455b(locale);
            appendable.append(m14455b);
            i2 = m14455b.length();
        } else {
            C9512a m14453j = m14453j(locale);
            int length2 = m14453j.f25235a.length();
            int i3 = 0;
            int i4 = 0;
            while (i4 < length2) {
                char charAt = m14453j.f25235a.charAt(i4);
                if (m14453j.f25237c <= i4 && m14453j.f25238d > i4) {
                    if (mo10161B.m10024m() == EnumC10803f.BEHIND_UTC) {
                        appendable.append(str2);
                        length = str2.length();
                    } else {
                        appendable.append(str);
                        length = str.length();
                    }
                    i3 += length;
                    int m10030f = mo10161B.m10030f();
                    int m10029g = mo10161B.m10029g();
                    int m10028h = mo10161B.m10028h();
                    if (m10030f < 10 && !this.f25227j) {
                        appendable.append(charValue);
                        i3++;
                    }
                    String valueOf = String.valueOf(m10030f);
                    c10835p = mo10161B;
                    for (int i5 = 0; i5 < valueOf.length(); i5++) {
                        appendable.append((char) ((valueOf.charAt(i5) - '0') + charValue));
                        i3++;
                    }
                    if (m10029g != 0 || m10028h != 0 || !this.f25227j) {
                        appendable.append(m14453j.f25236b);
                        i3 += m14453j.f25236b.length();
                        if (m10029g < 10) {
                            appendable.append(charValue);
                            i3++;
                        }
                        String valueOf2 = String.valueOf(m10029g);
                        for (int i6 = 0; i6 < valueOf2.length(); i6++) {
                            appendable.append((char) ((valueOf2.charAt(i6) - '0') + charValue));
                            i3++;
                        }
                        if (m10028h != 0) {
                            appendable.append(m14453j.f25236b);
                            i3 += m14453j.f25236b.length();
                            if (m10028h < 10) {
                                appendable.append(charValue);
                                i3++;
                            }
                            String valueOf3 = String.valueOf(m10028h);
                            for (int i7 = 0; i7 < valueOf3.length(); i7++) {
                                appendable.append((char) ((valueOf3.charAt(i7) - '0') + charValue));
                                i3++;
                            }
                        }
                    }
                    c = '0';
                    i4 = m14453j.f25238d - 1;
                } else {
                    c10835p = mo10161B;
                    c = c2;
                    if (!booleanValue) {
                        appendable.append(charAt);
                        i3++;
                    }
                }
                i4++;
                c2 = c;
                mo10161B = c10835p;
            }
            i2 = i3;
        }
        if (i != -1 && i2 > 0 && set != null) {
            set.add(new C9496g(EnumC9478b0.TIMEZONE_ID, i, i + i2));
        }
        return i2;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        Locale locale;
        boolean booleanValue;
        boolean booleanValue2;
        char charValue;
        String str;
        String str2;
        int i;
        Locale locale2;
        boolean z2;
        String str3;
        String str4;
        char c;
        EnumC10803f enumC10803f;
        int i2;
        EnumC8981g enumC8981g;
        int i3;
        int i4;
        C10835p m10021p;
        int m14457n;
        int length = charSequence.length();
        int m14430f = c9518s.m14430f();
        if (m14430f >= length) {
            c9518s.m14425k(m14430f, "Missing localized time zone offset.");
            return;
        }
        if (z) {
            locale = this.f25230m;
        } else {
            locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
        }
        boolean m16901q = C8972b.m16901q(locale);
        if (z) {
            booleanValue = this.f25229l;
        } else {
            booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23573n, Boolean.FALSE)).booleanValue();
        }
        if (z) {
            booleanValue2 = this.f25228k;
        } else {
            booleanValue2 = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            charValue = this.f25233p;
        } else {
            charValue = ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue();
        }
        if (z) {
            str = this.f25231n;
        } else {
            str = (String) interfaceC7633d.mo14441b(C9476b.f25071g, "+");
        }
        if (z) {
            str2 = this.f25232o;
        } else {
            str2 = (String) interfaceC7633d.mo14441b(C9476b.f25072h, "-");
        }
        C9512a m14453j = m14453j(locale);
        int length2 = m14453j.f25235a.length();
        int i5 = 0;
        int i6 = m14430f;
        int i7 = 0;
        C10835p c10835p = null;
        while (i7 < length2) {
            int i8 = length2;
            char charAt = m14453j.f25235a.charAt(i7);
            if (m14453j.f25237c <= i7 && m14453j.f25238d > i7) {
                int m14457n2 = C9510m.m14457n(charSequence, i6, str, booleanValue2, m16901q);
                if (m14457n2 == -1) {
                    m14457n2 = C9510m.m14457n(charSequence, i6, str2, booleanValue2, m16901q);
                    if (m14457n2 == -1) {
                        if (!booleanValue) {
                            i5 = m14450m(charSequence, length, m14430f, locale, booleanValue2);
                        }
                        if (i5 > 0) {
                            abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, C10835p.f28295t);
                            c9518s.m14424l(m14430f + i5);
                            return;
                        }
                        c9518s.m14425k(m14430f, "Missing sign in localized time zone offset.");
                        return;
                    }
                    enumC10803f = EnumC10803f.BEHIND_UTC;
                } else {
                    enumC10803f = EnumC10803f.AHEAD_OF_UTC;
                }
                EnumC10803f enumC10803f2 = enumC10803f;
                int i9 = i6 + m14457n2;
                int m14452k = m14452k(charSequence, i9, charValue);
                str3 = str;
                if (m14452k == -1000) {
                    c9518s.m14425k(i9, "Missing hour part in localized time zone offset.");
                    return;
                }
                if (m14452k < 0) {
                    m14452k = ~m14452k;
                    i2 = i9 + 1;
                } else {
                    i2 = i9 + 2;
                }
                if (i2 >= length) {
                    if (this.f25227j) {
                        abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, C10835p.m10022o(enumC10803f2, m14452k));
                        c9518s.m14424l(i2);
                        return;
                    }
                    c9518s.m14425k(i2, "Missing minute part in localized time zone offset.");
                    return;
                }
                str4 = str2;
                if (z) {
                    enumC8981g = this.f25234q;
                    i = m14430f;
                    locale2 = locale;
                } else {
                    i = m14430f;
                    locale2 = locale;
                    enumC8981g = (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART);
                }
                int m14457n3 = C9510m.m14457n(charSequence, i2, m14453j.f25236b, booleanValue2, m16901q);
                if (m14457n3 != -1) {
                    i2 += m14457n3;
                } else if (this.f25227j) {
                    abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, C10835p.m10022o(enumC10803f2, m14452k));
                    c9518s.m14424l(i2);
                    return;
                } else if (enumC8981g.m16887c()) {
                    c9518s.m14425k(i2, "Mismatch of localized time zone offset separator.");
                    return;
                }
                int m14451l = m14451l(charSequence, i2, charValue);
                if (m14451l == -1000) {
                    c9518s.m14425k(i2, "Minute part in localized time zone offset does not match expected pattern mm.");
                    return;
                }
                i6 = i2 + 2;
                if (i6 < length && (m14457n = C9510m.m14457n(charSequence, i6, m14453j.f25236b, booleanValue2, m16901q)) != -1) {
                    int i10 = i6 + m14457n;
                    i4 = m14451l(charSequence, i10, charValue);
                    z2 = m16901q;
                    i3 = -1000;
                    if (i4 == -1000) {
                        i6 = i10 - m14457n;
                    } else {
                        i6 = i10 + 2;
                    }
                } else {
                    z2 = m16901q;
                    i3 = -1000;
                    i4 = 0;
                }
                if (i4 != 0 && i4 != i3) {
                    int i11 = (m14452k * 3600) + (m14451l * 60) + i4;
                    if (enumC10803f2 == EnumC10803f.BEHIND_UTC) {
                        i11 = -i11;
                    }
                    m10021p = C10835p.m10020q(i11);
                } else {
                    m10021p = C10835p.m10021p(enumC10803f2, m14452k, m14451l);
                }
                c10835p = m10021p;
                i7 = m14453j.f25238d - 1;
            } else {
                i = m14430f;
                locale2 = locale;
                z2 = m16901q;
                str3 = str;
                str4 = str2;
                if (booleanValue) {
                    continue;
                } else {
                    if (i6 < length) {
                        c = charSequence.charAt(i6);
                    } else {
                        c = 0;
                    }
                    if ((!booleanValue2 && charAt == c) || (booleanValue2 && m14456a(charAt, c))) {
                        i6++;
                    } else {
                        int m14450m = m14450m(charSequence, length, i, locale2, booleanValue2);
                        if (m14450m > 0) {
                            abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, C10835p.f28295t);
                            c9518s.m14424l(i + m14450m);
                            return;
                        }
                        c9518s.m14425k(i, "Literal mismatched in localized time zone offset.");
                        return;
                    }
                }
            }
            m14430f = i;
            locale = locale2;
            i7++;
            length2 = i8;
            str = str3;
            str2 = str4;
            m16901q = z2;
        }
        C10835p c10835p2 = c10835p;
        if (c10835p2 == null) {
            c9518s.m14425k(i6, "Unable to determine localized time zone offset.");
            return;
        }
        abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, c10835p2);
        c9518s.m14424l(i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C9511n) && this.f25227j == ((C9511n) obj).f25227j) {
            return true;
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<InterfaceC10808k> mo14361g(InterfaceC7664p<InterfaceC10808k> interfaceC7664p) {
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<InterfaceC10808k> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return new C9511n(this.f25227j, ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue(), ((Boolean) interfaceC7633d.mo14441b(C8969a.f23573n, Boolean.FALSE)).booleanValue(), (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT), (String) interfaceC7633d.mo14441b(C9476b.f25071g, "+"), (String) interfaceC7633d.mo14441b(C9476b.f25072h, "-"), ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue(), (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART));
    }

    public int hashCode() {
        return this.f25227j ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9511n.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f25227j);
        sb2.append(']');
        return sb2.toString();
    }

    private C9511n(boolean z, boolean z2, boolean z3, Locale locale, String str, String str2, char c, EnumC8981g enumC8981g) {
        this.f25227j = z;
        this.f25228k = z2;
        this.f25229l = z3;
        this.f25230m = locale;
        this.f25231n = str;
        this.f25232o = str2;
        this.f25233p = c;
        this.f25234q = enumC8981g;
    }
}
