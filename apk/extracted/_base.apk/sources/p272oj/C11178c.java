package p272oj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import p184jj.EnumC8979e;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9015u;
import p220lj.InterfaceC10216c;

/* renamed from: oj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C11178c implements InterfaceC9015u, InterfaceC10216c {

    /* renamed from: a */
    private static final Set<String> f29210a;

    /* renamed from: b */
    private static final Set<Locale> f29211b;

    static {
        String[] split = C11180e.m9040h("calendar/names/iso8601/iso8601", Locale.ROOT).m9042f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f29210a = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            hashSet2.add(new Locale(str));
        }
        for (EnumC11179d enumC11179d : EnumC11179d.values()) {
            hashSet2.add(new Locale(enumC11179d.name()));
        }
        f29211b = Collections.unmodifiableSet(hashSet2);
    }

    /* renamed from: l */
    private static String[] m9058l(Locale locale, EnumC9016v enumC9016v) {
        EnumC9016v enumC9016v2;
        C11180e m9057m = m9057m(locale);
        String[] strArr = null;
        EnumC9016v enumC9016v3 = null;
        if (m9057m != null) {
            if (enumC9016v == EnumC9016v.SHORT) {
                enumC9016v = EnumC9016v.ABBREVIATED;
            }
            String m9056n = m9056n(m9057m, "ERA");
            if (enumC9016v == EnumC9016v.NARROW) {
                enumC9016v3 = EnumC9016v.ABBREVIATED;
            }
            strArr = m9055o(m9057m, 5, m9056n, enumC9016v, enumC9016v3, EnumC9003m.FORMAT, 0);
            if (strArr == null && enumC9016v != (enumC9016v2 = EnumC9016v.ABBREVIATED)) {
                strArr = m9058l(locale, enumC9016v2);
            }
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for era and locale: " + locale, C11178c.class.getName(), locale.toString());
    }

    /* renamed from: m */
    private static C11180e m9057m(Locale locale) {
        return C11180e.m9040h("calendar/names/iso8601/iso8601", locale);
    }

    /* renamed from: n */
    private static String m9056n(C11180e c11180e, String str) {
        if (c11180e.m9046b("useShortKeys") && "true".equals(c11180e.m9042f("useShortKeys"))) {
            return str.substring(0, 1);
        }
        return str;
    }

    /* renamed from: o */
    private static String[] m9055o(C11180e c11180e, int i, String str, EnumC9016v enumC9016v, EnumC9016v enumC9016v2, EnumC9003m enumC9003m, int i2) {
        boolean z;
        String[] m9055o;
        String[] strArr = new String[i];
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('(');
            if (z) {
                char charAt = enumC9016v.name().charAt(0);
                if (enumC9003m != EnumC9003m.STANDALONE) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb2.append(charAt);
            } else {
                sb2.append(enumC9016v.name());
                if (enumC9003m == EnumC9003m.STANDALONE) {
                    sb2.append('|');
                    sb2.append(enumC9003m.name());
                }
            }
            sb2.append(')');
            sb2.append('_');
            sb2.append(i3 + i2);
            String sb3 = sb2.toString();
            if (c11180e.m9046b(sb3)) {
                strArr[i3] = c11180e.m9042f(sb3);
            } else if (enumC9016v2 == null || (m9055o = m9055o(c11180e, i, str, enumC9016v2, null, enumC9003m, i2)) == null) {
                return null;
            } else {
                strArr[i3] = m9055o[i3];
            }
        }
        return strArr;
    }

    /* renamed from: p */
    private static String m9054p(String str, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        char charAt = enumC9016v.name().charAt(0);
        if (enumC9003m == EnumC9003m.FORMAT) {
            charAt = Character.toLowerCase(charAt);
        }
        return "P(" + String.valueOf(charAt) + ")_" + str;
    }

    /* renamed from: q */
    private static String[] m9053q(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        C11180e m9057m = m9057m(locale);
        if (m9057m != null) {
            if (enumC9016v == EnumC9016v.SHORT) {
                enumC9016v = EnumC9016v.ABBREVIATED;
            }
            String m9054p = m9054p("am", enumC9016v, enumC9003m);
            String m9054p2 = m9054p("pm", enumC9016v, enumC9003m);
            if (m9057m.m9046b(m9054p) && m9057m.m9046b(m9054p2)) {
                return new String[]{m9057m.m9042f(m9054p), m9057m.m9042f(m9054p2)};
            }
            if (enumC9003m == EnumC9003m.STANDALONE) {
                EnumC9016v enumC9016v2 = EnumC9016v.ABBREVIATED;
                if (enumC9016v == enumC9016v2) {
                    return m9053q(locale, enumC9016v, EnumC9003m.FORMAT);
                }
                return m9053q(locale, enumC9016v2, enumC9003m);
            }
            EnumC9016v enumC9016v3 = EnumC9016v.ABBREVIATED;
            if (enumC9016v != enumC9016v3) {
                return m9053q(locale, enumC9016v3, enumC9003m);
            }
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for am/pm and locale: " + locale, C11178c.class.getName(), locale.toString());
    }

    /* renamed from: r */
    private static String[] m9052r(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        String[] strArr;
        C11180e m9057m = m9057m(locale);
        if (m9057m != null) {
            if (enumC9016v == EnumC9016v.SHORT) {
                enumC9016v = EnumC9016v.ABBREVIATED;
            }
            strArr = m9055o(m9057m, 12, m9056n(m9057m, "MONTH_OF_YEAR"), enumC9016v, null, enumC9003m, 1);
            if (strArr == null) {
                EnumC9003m enumC9003m2 = EnumC9003m.STANDALONE;
                if (enumC9003m == enumC9003m2) {
                    if (enumC9016v != EnumC9016v.NARROW) {
                        strArr = m9052r(locale, enumC9016v, EnumC9003m.FORMAT);
                    }
                } else if (enumC9016v == EnumC9016v.ABBREVIATED) {
                    strArr = m9052r(locale, EnumC9016v.WIDE, EnumC9003m.FORMAT);
                } else if (enumC9016v == EnumC9016v.NARROW) {
                    strArr = m9052r(locale, enumC9016v, enumC9003m2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-month for locale: " + locale, C11178c.class.getName(), locale.toString());
    }

    /* renamed from: s */
    private static String[] m9051s(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        String[] strArr;
        C11180e m9057m = m9057m(locale);
        if (m9057m != null) {
            if (enumC9016v == EnumC9016v.SHORT) {
                enumC9016v = EnumC9016v.ABBREVIATED;
            }
            strArr = m9055o(m9057m, 4, m9056n(m9057m, "QUARTER_OF_YEAR"), enumC9016v, null, enumC9003m, 1);
            if (strArr == null) {
                EnumC9003m enumC9003m2 = EnumC9003m.STANDALONE;
                if (enumC9003m == enumC9003m2) {
                    if (enumC9016v != EnumC9016v.NARROW) {
                        strArr = m9051s(locale, enumC9016v, EnumC9003m.FORMAT);
                    }
                } else if (enumC9016v == EnumC9016v.ABBREVIATED) {
                    strArr = m9051s(locale, EnumC9016v.WIDE, EnumC9003m.FORMAT);
                } else if (enumC9016v == EnumC9016v.NARROW) {
                    strArr = m9051s(locale, enumC9016v, enumC9003m2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-quarter-of-year for locale: " + locale, C11178c.class.getName(), locale.toString());
    }

    /* renamed from: t */
    private static char m9050t(EnumC8979e enumC8979e) {
        return Character.toLowerCase(enumC8979e.name().charAt(0));
    }

    /* renamed from: u */
    private static String[] m9049u(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        String[] strArr;
        C11180e m9057m = m9057m(locale);
        if (m9057m != null) {
            strArr = m9055o(m9057m, 7, m9056n(m9057m, "DAY_OF_WEEK"), enumC9016v, null, enumC9003m, 1);
            if (strArr == null) {
                EnumC9003m enumC9003m2 = EnumC9003m.STANDALONE;
                if (enumC9003m == enumC9003m2) {
                    if (enumC9016v != EnumC9016v.NARROW) {
                        strArr = m9049u(locale, enumC9016v, EnumC9003m.FORMAT);
                    }
                } else {
                    EnumC9016v enumC9016v2 = EnumC9016v.ABBREVIATED;
                    if (enumC9016v == enumC9016v2) {
                        strArr = m9049u(locale, EnumC9016v.WIDE, EnumC9003m.FORMAT);
                    } else if (enumC9016v == EnumC9016v.SHORT) {
                        strArr = m9049u(locale, enumC9016v2, EnumC9003m.FORMAT);
                    } else if (enumC9016v == EnumC9016v.NARROW) {
                        strArr = m9049u(locale, enumC9016v, enumC9003m2);
                    }
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-day-of-week for locale: " + locale, C11178c.class.getName(), locale.toString());
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: a */
    public String[] mo9069a(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, boolean z) {
        return m9052r(locale, enumC9016v, enumC9003m);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: b */
    public boolean mo9068b(Locale locale) {
        return f29210a.contains(EnumC11179d.m9048a(locale));
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: c */
    public String[] mo9067c(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return m9051s(locale, enumC9016v, enumC9003m);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: d */
    public String[] mo9066d(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return m9049u(locale, enumC9016v, enumC9003m);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: e */
    public String[] mo9065e(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return m9053q(locale, enumC9016v, enumC9003m);
    }

    @Override // p220lj.InterfaceC10216c
    /* renamed from: f */
    public String mo9064f(EnumC8979e enumC8979e, Locale locale, boolean z) {
        String str;
        if (z && enumC8979e == EnumC8979e.FULL) {
            str = "F(alt)";
        } else {
            str = "F(" + m9050t(enumC8979e) + ")_t";
        }
        return m9057m(locale).m9042f(str);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: g */
    public boolean mo9063g(String str) {
        return "iso8601".equals(str);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: h */
    public String[] mo9062h(String str, Locale locale, EnumC9016v enumC9016v) {
        return m9058l(locale, enumC9016v);
    }

    @Override // p184jj.InterfaceC8980f
    /* renamed from: i */
    public String mo9061i(EnumC8979e enumC8979e, EnumC8979e enumC8979e2, Locale locale) {
        if (enumC8979e.compareTo(enumC8979e2) < 0) {
            enumC8979e = enumC8979e2;
        }
        return m9057m(locale).m9042f("F(" + m9050t(enumC8979e) + ")_dt");
    }

    @Override // p184jj.InterfaceC8980f
    /* renamed from: j */
    public String mo9060j(EnumC8979e enumC8979e, Locale locale) {
        return m9057m(locale).m9042f("F(" + m9050t(enumC8979e) + ")_d");
    }

    @Override // p184jj.InterfaceC8980f
    /* renamed from: k */
    public String mo9059k(EnumC8979e enumC8979e, Locale locale) {
        return mo9064f(enumC8979e, locale, false);
    }

    public String toString() {
        return "IsoTextProviderSPI";
    }
}
