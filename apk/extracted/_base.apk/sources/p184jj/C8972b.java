package p184jj;

import com.discord.nearby.NearbyManager;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10617d;
import p162ij.C7672x;
import p162ij.InterfaceC7649i;
import p162ij.InterfaceC7664p;
import p164j$.util.concurrent.ConcurrentHashMap;
import p220lj.C10217d;
import p220lj.InterfaceC10216c;
import p272oj.C11178c;
import p272oj.C11180e;

/* renamed from: jj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C8972b {

    /* renamed from: l */
    private static final Set<String> f23588l;

    /* renamed from: m */
    private static final InterfaceC8980f f23589m;

    /* renamed from: n */
    private static final InterfaceC9015u f23590n;

    /* renamed from: o */
    private static final InterfaceC9015u f23591o;

    /* renamed from: p */
    private static final ConcurrentMap<String, C8972b> f23592p;

    /* renamed from: a */
    private final String f23593a;

    /* renamed from: b */
    private final Map<EnumC9016v, Map<EnumC9003m, C9013s>> f23594b;

    /* renamed from: c */
    private final Map<EnumC9016v, Map<EnumC9003m, C9013s>> f23595c;

    /* renamed from: d */
    private final Map<EnumC9016v, Map<EnumC9003m, C9013s>> f23596d;

    /* renamed from: e */
    private final Map<EnumC9016v, Map<EnumC9003m, C9013s>> f23597e;

    /* renamed from: f */
    private final Map<EnumC9016v, Map<EnumC9003m, C9013s>> f23598f;

    /* renamed from: g */
    private final Map<EnumC9016v, C9013s> f23599g;

    /* renamed from: h */
    private final Map<String, String> f23600h;

    /* renamed from: i */
    private final String f23601i;

    /* renamed from: j */
    private final Locale f23602j;

    /* renamed from: k */
    private final MissingResourceException f23603k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C8973a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23604a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23605b;

        static {
            int[] iArr = new int[EnumC8979e.values().length];
            f23605b = iArr;
            try {
                iArr[EnumC8979e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23605b[EnumC8979e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23605b[EnumC8979e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23605b[EnumC8979e.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC9016v.values().length];
            f23604a = iArr2;
            try {
                iArr2[EnumC9016v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23604a[EnumC9016v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23604a[EnumC9016v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23604a[EnumC9016v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: jj.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C8974b implements InterfaceC9015u {
        private C8974b() {
        }

        /* synthetic */ C8974b(C8973a c8973a) {
            this();
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: a */
        public String[] mo9069a(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, boolean z) {
            if (enumC9016v == EnumC9016v.WIDE) {
                return new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13"};
            }
            return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: b */
        public boolean mo9068b(Locale locale) {
            return true;
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: c */
        public String[] mo9067c(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            if (enumC9016v == EnumC9016v.NARROW) {
                return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4"};
            }
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: d */
        public String[] mo9066d(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            return new String[]{NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7"};
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: e */
        public String[] mo9065e(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            if (enumC9016v == EnumC9016v.NARROW) {
                return new String[]{"A", "P"};
            }
            return new String[]{"AM", "PM"};
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: g */
        public boolean mo9063g(String str) {
            return true;
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: h */
        public String[] mo9062h(String str, Locale locale, EnumC9016v enumC9016v) {
            if (enumC9016v == EnumC9016v.NARROW) {
                return new String[]{"B", "A"};
            }
            return new String[]{"BC", "AD"};
        }

        public String toString() {
            return "FallbackProvider";
        }
    }

    /* renamed from: jj.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C8975c implements InterfaceC8980f {

        /* renamed from: a */
        private final InterfaceC8980f f23606a;

        C8975c(InterfaceC8980f interfaceC8980f) {
            this.f23606a = interfaceC8980f;
        }

        /* renamed from: a */
        private static String m16895a(DateFormat dateFormat) {
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
            }
            throw new IllegalStateException("Cannot retrieve format pattern: " + dateFormat);
        }

        /* renamed from: b */
        private static int m16894b(EnumC8979e enumC8979e) {
            int i = C8973a.f23605b[enumC8979e.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 3) {
                    return 2;
                }
                if (i == 4) {
                    return 3;
                }
                throw new UnsupportedOperationException("Unknown: " + enumC8979e);
            }
            return 0;
        }

        @Override // p184jj.InterfaceC8980f
        /* renamed from: i */
        public String mo9061i(EnumC8979e enumC8979e, EnumC8979e enumC8979e2, Locale locale) {
            InterfaceC8980f interfaceC8980f = this.f23606a;
            if (interfaceC8980f == null) {
                return m16895a(DateFormat.getDateTimeInstance(m16894b(enumC8979e), m16894b(enumC8979e2), locale));
            }
            return this.f23606a.mo9061i(enumC8979e, enumC8979e2, locale).replace("{1}", this.f23606a.mo9060j(enumC8979e, locale)).replace("{0}", interfaceC8980f.mo9059k(enumC8979e2, locale));
        }

        @Override // p184jj.InterfaceC8980f
        /* renamed from: j */
        public String mo9060j(EnumC8979e enumC8979e, Locale locale) {
            InterfaceC8980f interfaceC8980f = this.f23606a;
            if (interfaceC8980f == null) {
                return m16895a(DateFormat.getDateInstance(m16894b(enumC8979e), locale));
            }
            return interfaceC8980f.mo9060j(enumC8979e, locale);
        }

        @Override // p184jj.InterfaceC8980f
        /* renamed from: k */
        public String mo9059k(EnumC8979e enumC8979e, Locale locale) {
            String mo9059k;
            InterfaceC8980f interfaceC8980f = this.f23606a;
            if (interfaceC8980f == null) {
                mo9059k = m16895a(DateFormat.getTimeInstance(m16894b(enumC8979e), locale));
            } else if (interfaceC8980f instanceof InterfaceC10216c) {
                mo9059k = ((InterfaceC10216c) InterfaceC10216c.class.cast(interfaceC8980f)).mo9064f(enumC8979e, locale, true);
            } else {
                mo9059k = interfaceC8980f.mo9059k(enumC8979e, locale);
            }
            return C10217d.m12123a(mo9059k);
        }
    }

    /* renamed from: jj.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C8976d implements InterfaceC9015u {
        private C8976d() {
        }

        /* synthetic */ C8976d(C8973a c8973a) {
            this();
        }

        /* renamed from: f */
        private static String[] m16893f(String[] strArr, int i) {
            String[] strArr2 = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (!strArr[i2].isEmpty()) {
                    strArr2[i2] = m16892i(strArr[i2]);
                } else {
                    strArr2[i2] = String.valueOf(i2 + 1);
                }
            }
            return strArr2;
        }

        /* renamed from: i */
        private static String m16892i(String str) {
            char charAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
            if (charAt >= 'A' && charAt <= 'Z') {
                return String.valueOf(charAt);
            }
            if (charAt >= 'a' && charAt <= 'z') {
                return String.valueOf((char) (charAt - ' '));
            }
            if (charAt >= 1040 && charAt <= 1071) {
                return String.valueOf(charAt);
            }
            if (charAt >= 1072 && charAt <= 1103) {
                return String.valueOf((char) (charAt - ' '));
            }
            return str;
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: a */
        public String[] mo9069a(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, boolean z) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i = C8973a.f23604a[enumC9016v.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        return m16893f(dateFormatSymbols.getShortMonths(), 12);
                    }
                    throw new UnsupportedOperationException(enumC9016v.name());
                }
                return dateFormatSymbols.getShortMonths();
            }
            return dateFormatSymbols.getMonths();
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: b */
        public boolean mo9068b(Locale locale) {
            String language = locale.getLanguage();
            for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                if (locale2.getLanguage().equals(language)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: c */
        public String[] mo9067c(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: d */
        public String[] mo9066d(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            String[] weekdays;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i = C8973a.f23604a[enumC9016v.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        weekdays = m16893f(mo9066d("", locale, EnumC9016v.SHORT, enumC9003m), 7);
                    } else {
                        throw new UnsupportedOperationException("Unknown text width: " + enumC9016v);
                    }
                } else {
                    weekdays = dateFormatSymbols.getShortWeekdays();
                }
            } else {
                weekdays = dateFormatSymbols.getWeekdays();
            }
            if (weekdays.length > 7) {
                String str2 = weekdays[1];
                String[] strArr = new String[7];
                System.arraycopy(weekdays, 2, strArr, 0, 6);
                strArr[6] = str2;
                return strArr;
            }
            return weekdays;
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: e */
        public String[] mo9065e(String str, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            if (enumC9016v == EnumC9016v.NARROW) {
                return new String[]{"A", "P"};
            }
            return DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: g */
        public boolean mo9063g(String str) {
            return "iso8601".equals(str);
        }

        @Override // p184jj.InterfaceC9015u
        /* renamed from: h */
        public String[] mo9062h(String str, Locale locale, EnumC9016v enumC9016v) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            if (enumC9016v == EnumC9016v.NARROW) {
                String[] eras = dateFormatSymbols.getEras();
                String[] strArr = new String[eras.length];
                int length = eras.length;
                for (int i = 0; i < length; i++) {
                    if (!eras[i].isEmpty()) {
                        strArr[i] = m16892i(eras[i]);
                    } else if (i == 0 && eras.length == 2) {
                        strArr[i] = "B";
                    } else if (i == 1 && eras.length == 2) {
                        strArr[i] = "A";
                    } else {
                        strArr[i] = String.valueOf(i);
                    }
                }
                return strArr;
            }
            return dateFormatSymbols.getEras();
        }

        public String toString() {
            return "JDKTextProvider";
        }
    }

    static {
        InterfaceC8980f c11178c;
        HashSet hashSet = new HashSet();
        hashSet.add("ar");
        hashSet.add("dv");
        hashSet.add("fa");
        hashSet.add("ha");
        hashSet.add("he");
        hashSet.add("iw");
        hashSet.add("ji");
        hashSet.add("ps");
        hashSet.add("sd");
        hashSet.add("ug");
        hashSet.add("ur");
        hashSet.add("yi");
        f23588l = Collections.unmodifiableSet(hashSet);
        Iterator it = AbstractC10617d.m11026c().mo11022g(InterfaceC8980f.class).iterator();
        if (it.hasNext()) {
            c11178c = (InterfaceC8980f) it.next();
        } else {
            c11178c = new C11178c();
        }
        f23589m = new C8975c(c11178c);
        f23590n = new C8976d(null);
        f23591o = new C8974b(null);
        f23592p = new ConcurrentHashMap();
    }

    private C8972b(String str, Locale locale, InterfaceC9015u interfaceC9015u) {
        EnumC9016v[] values;
        this.f23593a = interfaceC9015u.toString();
        int i = 0;
        Map<EnumC9016v, Map<EnumC9003m, C9013s>> unmodifiableMap = Collections.unmodifiableMap(m16909i(str, locale, interfaceC9015u, false));
        this.f23594b = unmodifiableMap;
        Map<EnumC9016v, Map<EnumC9003m, C9013s>> m16909i = m16909i(str, locale, interfaceC9015u, true);
        if (m16909i == null) {
            this.f23595c = unmodifiableMap;
        } else {
            this.f23595c = Collections.unmodifiableMap(m16909i);
        }
        EnumMap enumMap = new EnumMap(EnumC9016v.class);
        EnumC9016v[] values2 = EnumC9016v.values();
        int length = values2.length;
        int i2 = 0;
        while (i2 < length) {
            EnumC9016v enumC9016v = values2[i2];
            EnumMap enumMap2 = new EnumMap(EnumC9003m.class);
            EnumC9003m[] values3 = EnumC9003m.values();
            int length2 = values3.length;
            int i3 = i;
            while (i3 < length2) {
                EnumC9003m enumC9003m = values3[i3];
                enumMap2.put((EnumMap) enumC9003m, (EnumC9003m) new C9013s(interfaceC9015u.mo9067c(str, locale, enumC9016v, enumC9003m)));
                i3++;
                values2 = values2;
            }
            enumMap.put((EnumMap) enumC9016v, (EnumC9016v) enumMap2);
            i2++;
            i = 0;
        }
        this.f23596d = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(EnumC9016v.class);
        EnumC9016v[] values4 = EnumC9016v.values();
        int length3 = values4.length;
        for (int i4 = 0; i4 < length3; i4++) {
            EnumC9016v enumC9016v2 = values4[i4];
            EnumMap enumMap4 = new EnumMap(EnumC9003m.class);
            EnumC9003m[] values5 = EnumC9003m.values();
            int length4 = values5.length;
            int i5 = 0;
            while (i5 < length4) {
                EnumC9003m enumC9003m2 = values5[i5];
                enumMap4.put((EnumMap) enumC9003m2, (EnumC9003m) new C9013s(interfaceC9015u.mo9066d(str, locale, enumC9016v2, enumC9003m2)));
                i5++;
                values4 = values4;
                length3 = length3;
            }
            enumMap3.put((EnumMap) enumC9016v2, (EnumC9016v) enumMap4);
        }
        this.f23597e = Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(EnumC9016v.class);
        for (EnumC9016v enumC9016v3 : EnumC9016v.values()) {
            enumMap5.put((EnumMap) enumC9016v3, (EnumC9016v) new C9013s(interfaceC9015u.mo9062h(str, locale, enumC9016v3)));
        }
        this.f23599g = Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(EnumC9016v.class);
        EnumC9016v[] values6 = EnumC9016v.values();
        int length5 = values6.length;
        for (int i6 = 0; i6 < length5; i6++) {
            EnumC9016v enumC9016v4 = values6[i6];
            EnumMap enumMap7 = new EnumMap(EnumC9003m.class);
            EnumC9003m[] values7 = EnumC9003m.values();
            int length6 = values7.length;
            int i7 = 0;
            while (i7 < length6) {
                EnumC9003m enumC9003m3 = values7[i7];
                enumMap7.put((EnumMap) enumC9003m3, (EnumC9003m) new C9013s(interfaceC9015u.mo9065e(str, locale, enumC9016v4, enumC9003m3)));
                i7++;
                values6 = values6;
            }
            enumMap6.put((EnumMap) enumC9016v4, (EnumC9016v) enumMap7);
        }
        this.f23598f = Collections.unmodifiableMap(enumMap6);
        HashMap hashMap = new HashMap();
        try {
            C11180e m9040h = C11180e.m9040h("calendar/names/" + str + "/" + str, locale);
            for (String str2 : m9040h.m9041g()) {
                hashMap.put(str2, m9040h.m9042f(str2));
            }
            e = null;
        } catch (MissingResourceException e) {
            e = e;
        }
        this.f23600h = Collections.unmodifiableMap(hashMap);
        this.f23601i = str;
        this.f23602j = locale;
        this.f23603k = e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m16917a(C7672x<?> c7672x) {
        InterfaceC8977c interfaceC8977c = (InterfaceC8977c) c7672x.m20113p().getAnnotation(InterfaceC8977c.class);
        if (interfaceC8977c == null) {
            return "iso8601";
        }
        return interfaceC8977c.value();
    }

    /* renamed from: c */
    public static C8972b m16915c(String str, Locale locale) {
        InterfaceC9015u interfaceC9015u;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(':');
            sb2.append(locale.getLanguage());
            String country = locale.getCountry();
            if (!country.isEmpty()) {
                sb2.append('-');
                sb2.append(country);
            }
            String sb3 = sb2.toString();
            C8972b c8972b = f23592p.get(sb3);
            if (c8972b == null) {
                if (locale.getLanguage().isEmpty() && str.equals("iso8601")) {
                    interfaceC9015u = f23591o;
                } else {
                    Iterator it = AbstractC10617d.m11026c().mo11022g(InterfaceC9015u.class).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC9015u interfaceC9015u2 = (InterfaceC9015u) it.next();
                            if (interfaceC9015u2.mo9063g(str) && interfaceC9015u2.mo9068b(locale)) {
                                interfaceC9015u = interfaceC9015u2;
                                break;
                            }
                        } else {
                            interfaceC9015u = null;
                            break;
                        }
                    }
                    if (interfaceC9015u == null) {
                        InterfaceC9015u interfaceC9015u3 = f23590n;
                        if (interfaceC9015u3.mo9063g(str) && interfaceC9015u3.mo9068b(locale)) {
                            interfaceC9015u = interfaceC9015u3;
                        }
                        if (interfaceC9015u == null) {
                            interfaceC9015u = f23591o;
                        }
                    }
                }
                C8972b c8972b2 = new C8972b(str, locale, interfaceC9015u);
                C8972b putIfAbsent = f23592p.putIfAbsent(sb3, c8972b2);
                if (putIfAbsent == null) {
                    return c8972b2;
                }
                return putIfAbsent;
            }
            return c8972b;
        }
        throw new NullPointerException("Missing calendar type.");
    }

    /* renamed from: d */
    public static C8972b m16914d(Locale locale) {
        return m16915c("iso8601", locale);
    }

    /* renamed from: e */
    private String m16913e(String str) {
        if (this.f23600h.containsKey("useShortKeys") && "true".equals(this.f23600h.get("useShortKeys"))) {
            if (!str.equals("MONTH_OF_YEAR") && !str.equals("DAY_OF_WEEK") && !str.equals("QUARTER_OF_YEAR") && !str.equals("ERA")) {
                if (str.equals("EVANGELIST")) {
                    return "EV";
                }
                if (str.equals("SANSCULOTTIDES")) {
                    return "S";
                }
                if (str.equals("DAY_OF_DECADE")) {
                    return "D";
                }
                return str;
            }
            return str.substring(0, 1);
        }
        return str;
    }

    /* renamed from: f */
    private static String m16912f(String str, int i, String... strArr) {
        if (strArr != null && strArr.length > 0) {
            if (strArr.length < i) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder(str);
            boolean z = true;
            for (int i2 = 0; i2 < strArr.length - i; i2++) {
                if (z) {
                    sb2.append('(');
                    z = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(strArr[i2]);
            }
            if (!z) {
                sb2.append(')');
            }
            return sb2.toString();
        } else if (i > 0) {
            return null;
        } else {
            return str;
        }
    }

    /* renamed from: i */
    private static Map<EnumC9016v, Map<EnumC9003m, C9013s>> m16909i(String str, Locale locale, InterfaceC9015u interfaceC9015u, boolean z) {
        int i;
        EnumC9003m[] enumC9003mArr;
        EnumMap enumMap;
        EnumC9016v enumC9016v;
        EnumMap enumMap2 = new EnumMap(EnumC9016v.class);
        EnumC9016v[] values = EnumC9016v.values();
        int length = values.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            EnumC9016v enumC9016v2 = values[i2];
            EnumMap enumMap3 = new EnumMap(EnumC9003m.class);
            EnumC9003m[] values2 = EnumC9003m.values();
            int length2 = values2.length;
            boolean z3 = z2;
            int i3 = 0;
            while (i3 < length2) {
                EnumC9003m enumC9003m = values2[i3];
                int i4 = i3;
                String[] mo9069a = interfaceC9015u.mo9069a(str, locale, enumC9016v2, enumC9003m, z);
                if (z && !z3) {
                    i = length2;
                    enumC9003mArr = values2;
                    enumMap = enumMap3;
                    enumC9016v = enumC9016v2;
                    z3 = !Arrays.equals(interfaceC9015u.mo9069a(str, locale, enumC9016v2, enumC9003m, false), mo9069a);
                } else {
                    i = length2;
                    enumC9003mArr = values2;
                    enumMap = enumMap3;
                    enumC9016v = enumC9016v2;
                }
                enumMap.put((EnumMap) enumC9003m, (EnumC9003m) new C9013s(mo9069a));
                i3 = i4 + 1;
                length2 = i;
                values2 = enumC9003mArr;
                enumMap3 = enumMap;
                enumC9016v2 = enumC9016v;
            }
            enumMap2.put((EnumMap) enumC9016v2, (EnumC9016v) enumMap3);
            i2++;
            z2 = z3;
        }
        if (z && !z2) {
            return null;
        }
        return enumMap2;
    }

    /* renamed from: j */
    private C9013s m16908j(EnumC9016v enumC9016v, EnumC9003m enumC9003m, boolean z) {
        if (z) {
            return this.f23595c.get(enumC9016v).get(enumC9003m);
        }
        return this.f23594b.get(enumC9016v).get(enumC9003m);
    }

    /* renamed from: q */
    public static boolean m16901q(Locale locale) {
        return f23588l.contains(locale.getLanguage());
    }

    /* renamed from: r */
    public static String m16900r(EnumC8979e enumC8979e, Locale locale) {
        return f23589m.mo9060j(enumC8979e, locale);
    }

    /* renamed from: s */
    public static String m16899s(EnumC8979e enumC8979e, EnumC8979e enumC8979e2, Locale locale) {
        return f23589m.mo9061i(enumC8979e, enumC8979e2, locale);
    }

    /* renamed from: t */
    public static String m16898t(EnumC8979e enumC8979e, Locale locale) {
        return f23589m.mo9059k(enumC8979e, locale);
    }

    /* renamed from: u */
    public static String m16897u(EnumC8979e enumC8979e, EnumC8979e enumC8979e2, Locale locale) {
        return C10217d.m12123a(f23589m.mo9061i(enumC8979e, enumC8979e2, locale));
    }

    /* renamed from: v */
    private static String m16896v(String str, int i, int i2) {
        return str + '_' + (i + i2);
    }

    /* renamed from: b */
    public C9013s m16916b(EnumC9016v enumC9016v) {
        return this.f23599g.get(enumC9016v);
    }

    /* renamed from: g */
    public C9013s m16911g(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return m16908j(enumC9016v, enumC9003m, true);
    }

    /* renamed from: h */
    public C9013s m16910h(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return this.f23598f.get(enumC9016v).get(enumC9003m);
    }

    /* renamed from: k */
    public C9013s m16907k(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return this.f23596d.get(enumC9016v).get(enumC9003m);
    }

    /* renamed from: l */
    public C9013s m16906l(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return m16908j(enumC9016v, enumC9003m, false);
    }

    /* renamed from: m */
    public Map<String, String> m16905m() {
        return this.f23600h;
    }

    /* renamed from: n */
    public <V extends Enum<V>> C9013s m16904n(InterfaceC7664p<V> interfaceC7664p, String... strArr) {
        return m16903o(interfaceC7664p.name(), interfaceC7664p.getType(), strArr);
    }

    /* renamed from: o */
    public <V extends Enum<V>> C9013s m16903o(String str, Class<V> cls, String... strArr) {
        String str2;
        if (this.f23603k == null) {
            V[] enumConstants = cls.getEnumConstants();
            int length = enumConstants.length;
            String[] strArr2 = new String[length];
            String m16913e = m16913e(str);
            int i = !InterfaceC7649i.class.isAssignableFrom(cls) ? 1 : 0;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = 0;
                while (true) {
                    String m16912f = m16912f(m16913e, i3, strArr);
                    if (m16912f != null) {
                        str2 = m16896v(m16912f, i2, i);
                        if (this.f23600h.containsKey(str2)) {
                            break;
                        }
                        i3++;
                    } else {
                        str2 = null;
                        break;
                    }
                }
                if (str2 == null) {
                    if (this.f23600h.containsKey(str)) {
                        strArr2[i2] = this.f23600h.get(str);
                    } else {
                        strArr2[i2] = enumConstants[i2].name();
                    }
                } else {
                    strArr2[i2] = this.f23600h.get(str2);
                }
            }
            return new C9013s(strArr2);
        }
        throw new MissingResourceException(this.f23603k.getMessage(), this.f23603k.getClassName(), this.f23603k.getKey());
    }

    /* renamed from: p */
    public C9013s m16902p(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return this.f23597e.get(enumC9016v).get(enumC9003m);
    }

    public String toString() {
        return this.f23593a + "(" + this.f23601i + "/" + this.f23602j + ")";
    }
}
