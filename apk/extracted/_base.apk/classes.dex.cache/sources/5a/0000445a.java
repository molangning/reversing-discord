package net.time4j.calendar.service;

import com.discord.nearby.NearbyManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import p184jj.C8972b;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9015u;
import p272oj.C11180e;
import p272oj.EnumC11179d;

/* renamed from: net.time4j.calendar.service.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10676b implements InterfaceC9015u {

    /* renamed from: a */
    private static final String[] f27854a = new String[0];

    /* renamed from: b */
    private static final Set<String> f27855b;

    /* renamed from: c */
    private static final Set<String> f27856c;

    /* renamed from: d */
    private static final Set<Locale> f27857d;

    static {
        String[] split = C11180e.m9040h("calendar/names/generic/generic", Locale.ROOT).m9042f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        hashSet.add("");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f27856c = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            if (str.isEmpty()) {
                hashSet2.add(Locale.ROOT);
            } else {
                hashSet2.add(new Locale(str));
            }
        }
        f27857d = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("buddhist");
        hashSet3.add("chinese");
        hashSet3.add("coptic");
        hashSet3.add("dangi");
        hashSet3.add("ethiopic");
        hashSet3.add("frenchrev");
        hashSet3.add("hindu");
        hashSet3.add("generic");
        hashSet3.add("hebrew");
        hashSet3.add("indian");
        hashSet3.add("islamic");
        hashSet3.add("japanese");
        hashSet3.add("juche");
        hashSet3.add("persian");
        hashSet3.add("roc");
        hashSet3.add("vietnam");
        f27855b = Collections.unmodifiableSet(hashSet3);
    }

    /* renamed from: f */
    private static int m10764f(String str) {
        if (str.equals("hindu")) {
            return 6;
        }
        if (!str.equals("ethiopic") && !str.equals("generic") && !str.equals("roc") && !str.equals("buddhist") && !str.equals("korean")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: i */
    private static int m10763i(String str) {
        if (!str.equals("coptic") && !str.equals("ethiopic") && !str.equals("generic") && !str.equals("hebrew")) {
            return 12;
        }
        return 13;
    }

    /* renamed from: j */
    public static C11180e m10762j(String str, Locale locale) {
        String str2 = "calendar/names/" + str + "/" + str;
        if (!f27856c.contains(EnumC11179d.m9048a(locale))) {
            locale = Locale.ROOT;
        }
        return C11180e.m9040h(str2, locale);
    }

    /* renamed from: k */
    private static String m10761k(C11180e c11180e, String str) {
        if (c11180e.m9046b("useShortKeys") && "true".equals(c11180e.m9042f("useShortKeys"))) {
            return str.substring(0, 1);
        }
        return str;
    }

    /* renamed from: l */
    private static String[] m10760l(C11180e c11180e, String str, String str2, int i, String str3, EnumC9016v enumC9016v, EnumC9003m enumC9003m, boolean z, int i2) {
        String[] strArr = new String[i];
        boolean z2 = true;
        if (str3.length() != 1) {
            z2 = false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append('(');
            if (z2) {
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
                if (z) {
                    sb2.append('|');
                    sb2.append("LEAP");
                }
            }
            sb2.append(')');
            sb2.append('_');
            sb2.append(i3 + i2);
            if (z && i3 == 6 && str.equals("hebrew")) {
                sb2.append('L');
            }
            String sb3 = sb2.toString();
            if (c11180e.m9046b(sb3)) {
                String m9042f = c11180e.m9042f(sb3);
                if (z && str.equals("chinese")) {
                    m9042f = m10759m(m9042f, str2, enumC9016v, enumC9003m);
                }
                strArr[i3] = m9042f;
            } else {
                return null;
            }
        }
        return strArr;
    }

    /* renamed from: m */
    private static String m10759m(String str, String str2, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        String str3;
        if (str2.equals("en")) {
            if (enumC9016v == EnumC9016v.NARROW) {
                return "i" + str;
            }
            return "(leap) " + str;
        } else if (!str2.equals("de") && !str2.equals("es") && !str2.equals("fr") && !str2.equals("it") && !str2.equals("pt") && !str2.equals("ro")) {
            if (str2.equals("ja")) {
                return "閏" + str;
            } else if (str2.equals("ko")) {
                return "윤" + str;
            } else if (str2.equals("zh")) {
                return "閏" + str;
            } else if (str2.equals("vi")) {
                if (enumC9016v == EnumC9016v.NARROW) {
                    return str + "n";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (enumC9003m == EnumC9003m.STANDALONE) {
                    str3 = " Nhuận";
                } else {
                    str3 = " nhuận";
                }
                sb2.append(str3);
                return sb2.toString();
            } else {
                return "*" + str;
            }
        } else if (enumC9016v == EnumC9016v.NARROW) {
            return "i" + str;
        } else {
            return "(i) " + str;
        }
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: a */
    public String[] mo9069a(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, boolean z) {
        String str2 = str;
        EnumC9016v enumC9016v2 = enumC9016v;
        if (!str2.equals("roc") && !str2.equals("buddhist")) {
            if (str2.equals("japanese")) {
                return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
            }
            if (!str2.equals("dangi") && !str2.equals("vietnam")) {
                if (str2.equals("hindu")) {
                    str2 = "indian";
                } else if (str2.equals("juche")) {
                    return (String[]) C8972b.m16914d(locale).m16906l(enumC9016v2, enumC9003m).m16859b().toArray(new String[12]);
                }
            } else {
                str2 = "chinese";
            }
            String str3 = str2;
            C11180e m10762j = m10762j(str3, locale);
            if (enumC9016v2 == EnumC9016v.SHORT) {
                enumC9016v2 = EnumC9016v.ABBREVIATED;
            }
            EnumC9016v enumC9016v3 = enumC9016v2;
            String[] m10760l = m10760l(m10762j, str3, locale.getLanguage(), m10763i(str3), m10761k(m10762j, "MONTH_OF_YEAR"), enumC9016v3, enumC9003m, z, 1);
            if (m10760l == null) {
                EnumC9003m enumC9003m2 = EnumC9003m.STANDALONE;
                if (enumC9003m == enumC9003m2) {
                    if (enumC9016v3 != EnumC9016v.NARROW) {
                        m10760l = mo9069a(str3, locale, enumC9016v3, EnumC9003m.FORMAT, z);
                    }
                } else if (enumC9016v3 == EnumC9016v.ABBREVIATED) {
                    m10760l = mo9069a(str3, locale, EnumC9016v.WIDE, EnumC9003m.FORMAT, z);
                } else if (enumC9016v3 == EnumC9016v.NARROW) {
                    m10760l = mo9069a(str3, locale, enumC9016v3, enumC9003m2, z);
                }
            }
            if (m10760l != null) {
                return m10760l;
            }
            throw new MissingResourceException("Cannot find calendar month.", C10676b.class.getName(), locale.toString());
        }
        List<String> m16859b = C8972b.m16914d(locale).m16906l(enumC9016v2, enumC9003m).m16859b();
        return (String[]) m16859b.toArray(new String[m16859b.size()]);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: b */
    public boolean mo9068b(Locale locale) {
        return true;
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: c */
    public String[] mo9067c(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return f27854a;
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: d */
    public String[] mo9066d(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return f27854a;
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: e */
    public String[] mo9065e(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return f27854a;
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: g */
    public boolean mo9063g(String str) {
        return f27855b.contains(str);
    }

    @Override // p184jj.InterfaceC9015u
    /* renamed from: h */
    public String[] mo9062h(String str, Locale locale, EnumC9016v enumC9016v) {
        String str2;
        EnumC9016v enumC9016v2;
        if (!str.equals("chinese") && !str.equals("vietnam")) {
            if (str.equals("japanese")) {
                if (enumC9016v == EnumC9016v.NARROW) {
                    return new String[]{"M", "T", "S", "H"};
                }
                return new String[]{"Meiji", "Taishō", "Shōwa", "Heisei"};
            } else if (!str.equals("dangi") && !str.equals("juche")) {
                C11180e m10762j = m10762j(str, locale);
                if (enumC9016v == EnumC9016v.SHORT) {
                    enumC9016v = EnumC9016v.ABBREVIATED;
                }
                String[] m10760l = m10760l(m10762j, str, locale.getLanguage(), m10764f(str), m10761k(m10762j, "ERA"), enumC9016v, EnumC9003m.FORMAT, false, 0);
                if (m10760l == null && enumC9016v != (enumC9016v2 = EnumC9016v.ABBREVIATED)) {
                    m10760l = mo9062h(str, locale, enumC9016v2);
                }
                if (m10760l != null) {
                    return m10760l;
                }
                throw new MissingResourceException("Cannot find calendar resource for era.", C10676b.class.getName(), locale.toString());
            } else {
                String[] mo9062h = mo9062h("korean", locale, enumC9016v);
                String[] strArr = new String[1];
                if (str.equals("dangi")) {
                    str2 = mo9062h[0];
                } else {
                    str2 = mo9062h[1];
                }
                strArr[0] = str2;
                return strArr;
            }
        }
        return f27854a;
    }

    public String toString() {
        return "GenericTextProviderSPI";
    }
}