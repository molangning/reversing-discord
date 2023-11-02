package net.time4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10617d;
import p164j$.util.concurrent.ConcurrentHashMap;
import p184jj.EnumC9004n;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9012r;
import p184jj.InterfaceC9028x;

/* renamed from: net.time4j.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10793s0 {

    /* renamed from: n */
    private static final ConcurrentMap<Locale, C10793s0> f28173n = new ConcurrentHashMap();

    /* renamed from: o */
    private static final InterfaceC10843w[] f28174o = {EnumC10686f.f27874m, EnumC10686f.f27876o, EnumC10686f.f27877p, EnumC10686f.f27878q, EnumC10704g.f27924j, EnumC10704g.f27925k, EnumC10704g.f27926l, EnumC10704g.f27927m, EnumC10704g.f27928n, EnumC10704g.f27929o};

    /* renamed from: p */
    private static final InterfaceC9028x f28175p;

    /* renamed from: q */
    private static final InterfaceC9028x f28176q;

    /* renamed from: a */
    private final Locale f28177a;

    /* renamed from: b */
    private final Map<InterfaceC10843w, Map<EnumC9016v, Map<EnumC9004n, String>>> f28178b;

    /* renamed from: c */
    private final Map<InterfaceC10843w, Map<EnumC9004n, String>> f28179c;

    /* renamed from: d */
    private final Map<InterfaceC10843w, Map<EnumC9004n, String>> f28180d;

    /* renamed from: e */
    private final Map<InterfaceC10843w, Map<EnumC9004n, String>> f28181e;

    /* renamed from: f */
    private final Map<InterfaceC10843w, Map<EnumC9004n, String>> f28182f;

    /* renamed from: g */
    private final Map<Integer, Map<EnumC9016v, String>> f28183g;

    /* renamed from: h */
    private final String f28184h;

    /* renamed from: i */
    private final String f28185i;

    /* renamed from: j */
    private final String f28186j;

    /* renamed from: k */
    private final String f28187k;

    /* renamed from: l */
    private final Map<EnumC10846x0, String> f28188l;

    /* renamed from: m */
    private final Map<EnumC10846x0, String> f28189m;

    /* renamed from: net.time4j.s0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10794a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28190a;

        static {
            int[] iArr = new int[EnumC9016v.values().length];
            f28190a = iArr;
            try {
                iArr[EnumC9016v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28190a[EnumC9016v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28190a[EnumC9016v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28190a[EnumC9016v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: net.time4j.s0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10795b implements InterfaceC9028x {
        private C10795b() {
        }

        /* synthetic */ C10795b(C10794a c10794a) {
            this();
        }

        /* renamed from: F */
        private static String m10192F(String str, String str2, String str3, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            int i = C10794a.f28190a[enumC9016v.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        return "{0}" + str3;
                    }
                    throw new UnsupportedOperationException(enumC9016v.name());
                }
                return m10191G(str2, enumC9004n);
            }
            return m10191G(str, enumC9004n);
        }

        /* renamed from: G */
        private static String m10191G(String str, EnumC9004n enumC9004n) {
            String str2;
            if (enumC9004n == EnumC9004n.ONE) {
                str2 = "";
            } else {
                str2 = "s";
            }
            return "{0} " + str + str2;
        }

        /* renamed from: H */
        private static String m10190H(String str, boolean z, EnumC9004n enumC9004n) {
            String str2;
            if (enumC9004n == EnumC9004n.ONE) {
                str2 = "";
            } else {
                str2 = "s";
            }
            if (z) {
                return "in {0} " + str + str2;
            }
            return "{0} " + str + str2 + " ago";
        }

        /* renamed from: I */
        private static String m10189I(String str, boolean z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "+" : "-");
            sb2.append("{0} ");
            sb2.append(str);
            return sb2.toString();
        }

        /* renamed from: J */
        private static String m10188J(String str) {
            return "{0} " + str;
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: A */
        public String mo9024A(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("week", "wk", "w", enumC9016v, enumC9004n);
            }
            return m10188J("w");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: C */
        public String mo9022C(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("week", z, enumC9004n);
            }
            return m10189I("w", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: D */
        public String mo9021D(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("nanosecond", "nsec", "ns", enumC9016v, enumC9004n);
            }
            return m10188J("ns");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: b */
        public String mo9010b(Locale locale) {
            return "now";
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: c */
        public String mo9009c(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("year", z, enumC9004n);
            }
            return m10189I("y", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: d */
        public String mo9008d(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("minute", "min", "m", enumC9016v, enumC9004n);
            }
            return m10188J("min");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: f */
        public String mo9006f(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("microsecond", "µsec", "µs", enumC9016v, enumC9004n);
            }
            return m10188J("µs");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: g */
        public String mo9005g(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("hour", z, enumC9004n);
            }
            return m10189I("h", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: k */
        public String mo9001k(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("second", z, enumC9004n);
            }
            return m10189I("s", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: o */
        public String mo8997o(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("hour", "hr", "h", enumC9016v, enumC9004n);
            }
            return m10188J("h");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: p */
        public String mo8996p(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("day", "day", "d", enumC9016v, enumC9004n);
            }
            return m10188J("d");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: r */
        public String mo8994r(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("minute", z, enumC9004n);
            }
            return m10189I("min", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: s */
        public String mo8993s(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("day", z, enumC9004n);
            }
            return m10189I("d", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: t */
        public String mo8992t(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("second", "sec", "s", enumC9016v, enumC9004n);
            }
            return m10188J("s");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: u */
        public String mo8991u(Locale locale, EnumC9016v enumC9016v, int i) {
            if (i >= 2) {
                StringBuilder sb2 = new StringBuilder(i * 5);
                for (int i2 = 0; i2 < i; i2++) {
                    sb2.append('{');
                    sb2.append(i2);
                    sb2.append('}');
                    if (i2 < i - 1) {
                        sb2.append(", ");
                    }
                }
                return sb2.toString();
            }
            throw new IllegalArgumentException("Size must be greater than 1.");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: v */
        public String mo8990v(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("month", "mth", "m", enumC9016v, enumC9004n);
            }
            return m10188J("m");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: w */
        public String mo8989w(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("millisecond", "msec", "ms", enumC9016v, enumC9004n);
            }
            return m10188J("ms");
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: y */
        public String mo8987y(Locale locale, boolean z, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10190H("month", z, enumC9004n);
            }
            return m10189I("m", z);
        }

        @Override // p184jj.InterfaceC9028x
        /* renamed from: z */
        public String mo8986z(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
            if (locale.getLanguage().equals("en")) {
                return m10192F("year", "yr", "y", enumC9016v, enumC9004n);
            }
            return m10188J("y");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [jj.x] */
    static {
        C10795b c10795b = null;
        C10795b c10795b2 = new C10795b(null);
        f28176q = c10795b2;
        Iterator it = AbstractC10617d.m11026c().mo11022g(InterfaceC9028x.class).iterator();
        if (it.hasNext()) {
            c10795b = (InterfaceC9028x) it.next();
        }
        if (c10795b != null) {
            c10795b2 = c10795b;
        }
        f28175p = c10795b2;
    }

    private C10793s0(Locale locale) {
        String str;
        String str2;
        String str3;
        String str4;
        EnumC10846x0[] values;
        EnumC9016v[] values2;
        EnumC9004n[] values3;
        this.f28177a = locale;
        HashMap hashMap = new HashMap(10);
        HashMap hashMap2 = new HashMap(10);
        HashMap hashMap3 = new HashMap(10);
        HashMap hashMap4 = new HashMap(10);
        HashMap hashMap5 = new HashMap(10);
        HashMap hashMap6 = new HashMap(10);
        InterfaceC10843w[] interfaceC10843wArr = f28174o;
        int length = interfaceC10843wArr.length;
        int i = 0;
        while (i < length) {
            InterfaceC10843w interfaceC10843w = interfaceC10843wArr[i];
            EnumMap enumMap = new EnumMap(EnumC9016v.class);
            EnumC9016v[] values4 = EnumC9016v.values();
            int length2 = values4.length;
            InterfaceC10843w[] interfaceC10843wArr2 = interfaceC10843wArr;
            int i2 = 0;
            while (i2 < length2) {
                int i3 = length;
                EnumC9016v enumC9016v = values4[i2];
                EnumC9016v[] enumC9016vArr = values4;
                EnumMap enumMap2 = new EnumMap(EnumC9004n.class);
                EnumC9004n[] values5 = EnumC9004n.values();
                int i4 = length2;
                int length3 = values5.length;
                int i5 = 0;
                while (i5 < length3) {
                    int i6 = length3;
                    EnumC9004n enumC9004n = values5[i5];
                    enumMap2.put((EnumMap) enumC9004n, (EnumC9004n) m10197d(locale, interfaceC10843w, enumC9016v, enumC9004n));
                    i5++;
                    length3 = i6;
                    values5 = values5;
                }
                enumMap.put((EnumMap) enumC9016v, (EnumC9016v) Collections.unmodifiableMap(enumMap2));
                i2++;
                length = i3;
                values4 = enumC9016vArr;
                length2 = i4;
            }
            int i7 = length;
            hashMap.put(interfaceC10843w, Collections.unmodifiableMap(enumMap));
            if (!Character.isDigit(interfaceC10843w.mo10005a())) {
                EnumMap enumMap3 = new EnumMap(EnumC9004n.class);
                EnumC9004n[] values6 = EnumC9004n.values();
                int length4 = values6.length;
                int i8 = 0;
                while (i8 < length4) {
                    EnumC9004n enumC9004n2 = values6[i8];
                    enumMap3.put((EnumMap) enumC9004n2, (EnumC9004n) m10196e(locale, interfaceC10843w, false, false, enumC9004n2));
                    i8++;
                    values6 = values6;
                }
                hashMap2.put(interfaceC10843w, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(EnumC9004n.class);
                EnumC9004n[] values7 = EnumC9004n.values();
                int length5 = values7.length;
                int i9 = 0;
                while (i9 < length5) {
                    EnumC9004n enumC9004n3 = values7[i9];
                    enumMap4.put((EnumMap) enumC9004n3, (EnumC9004n) m10196e(locale, interfaceC10843w, false, true, enumC9004n3));
                    i9++;
                    values7 = values7;
                }
                hashMap4.put(interfaceC10843w, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(EnumC9004n.class);
                EnumC9004n[] values8 = EnumC9004n.values();
                int length6 = values8.length;
                int i10 = 0;
                while (i10 < length6) {
                    EnumC9004n enumC9004n4 = values8[i10];
                    enumMap5.put((EnumMap) enumC9004n4, (EnumC9004n) m10196e(locale, interfaceC10843w, true, false, enumC9004n4));
                    i10++;
                    length6 = length6;
                    values8 = values8;
                }
                hashMap3.put(interfaceC10843w, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(EnumC9004n.class);
                for (EnumC9004n enumC9004n5 : EnumC9004n.values()) {
                    enumMap6.put((EnumMap) enumC9004n5, (EnumC9004n) m10196e(locale, interfaceC10843w, true, true, enumC9004n5));
                }
                hashMap5.put(interfaceC10843w, Collections.unmodifiableMap(enumMap6));
            }
            i++;
            interfaceC10843wArr = interfaceC10843wArr2;
            length = i7;
        }
        for (int i11 = 2; i11 <= 7; i11++) {
            Integer valueOf = Integer.valueOf(i11);
            EnumMap enumMap7 = new EnumMap(EnumC9016v.class);
            for (EnumC9016v enumC9016v2 : EnumC9016v.values()) {
                enumMap7.put((EnumMap) enumC9016v2, (EnumC9016v) m10198c(locale, enumC9016v2, valueOf.intValue()));
            }
            hashMap6.put(valueOf, Collections.unmodifiableMap(enumMap7));
        }
        this.f28178b = Collections.unmodifiableMap(hashMap);
        this.f28179c = Collections.unmodifiableMap(hashMap2);
        this.f28180d = Collections.unmodifiableMap(hashMap3);
        this.f28181e = Collections.unmodifiableMap(hashMap4);
        this.f28182f = Collections.unmodifiableMap(hashMap5);
        this.f28183g = Collections.unmodifiableMap(hashMap6);
        EnumMap enumMap8 = new EnumMap(EnumC10846x0.class);
        EnumMap enumMap9 = new EnumMap(EnumC10846x0.class);
        EnumC10846x0[] values9 = EnumC10846x0.values();
        int length7 = values9.length;
        int i12 = 0;
        while (true) {
            str = "";
            if (i12 >= length7) {
                try {
                    break;
                } catch (MissingResourceException unused) {
                    str2 = "";
                    str3 = str2;
                }
            } else {
                EnumC10846x0 enumC10846x0 = values9[i12];
                enumMap8.put((EnumMap) enumC10846x0, (EnumC10846x0) "");
                enumMap9.put((EnumMap) enumC10846x0, (EnumC10846x0) "");
                i12++;
            }
        }
        InterfaceC9028x interfaceC9028x = f28175p;
        String mo9010b = interfaceC9028x.mo9010b(locale);
        if (!(interfaceC9028x instanceof InterfaceC9012r)) {
            str4 = "";
            str3 = str4;
        } else {
            InterfaceC9012r interfaceC9012r = (InterfaceC9012r) InterfaceC9012r.class.cast(interfaceC9028x);
            String mo9011a = interfaceC9012r.mo9011a(locale);
            try {
                str3 = interfaceC9012r.mo8988x(locale);
            } catch (MissingResourceException unused2) {
                str2 = "";
                str3 = str2;
            }
            try {
                str = interfaceC9012r.mo9007e(locale);
                for (EnumC10846x0 enumC10846x02 : EnumC10846x0.values()) {
                    enumMap8.put((EnumMap) enumC10846x02, (EnumC10846x0) interfaceC9012r.mo8999m(enumC10846x02, locale));
                    enumMap9.put((EnumMap) enumC10846x02, (EnumC10846x0) interfaceC9012r.mo9023B(enumC10846x02, locale));
                }
                str4 = str;
                str = mo9011a;
            } catch (MissingResourceException unused3) {
                str2 = str;
                str = mo9011a;
                mo9010b = f28176q.mo9010b(locale);
                str4 = str2;
                this.f28184h = mo9010b;
                this.f28185i = str;
                this.f28186j = str3;
                this.f28187k = str4;
                this.f28188l = Collections.unmodifiableMap(enumMap8);
                this.f28189m = Collections.unmodifiableMap(enumMap9);
            }
        }
        this.f28184h = mo9010b;
        this.f28185i = str;
        this.f28186j = str3;
        this.f28187k = str4;
        this.f28188l = Collections.unmodifiableMap(enumMap8);
        this.f28189m = Collections.unmodifiableMap(enumMap9);
    }

    /* renamed from: a */
    private static char m10200a(InterfaceC10843w interfaceC10843w) {
        char mo10005a = interfaceC10843w.mo10005a();
        if (interfaceC10843w == EnumC10704g.f27925k) {
            return 'N';
        }
        return mo10005a;
    }

    /* renamed from: c */
    private static String m10198c(Locale locale, EnumC9016v enumC9016v, int i) {
        try {
            return f28175p.mo8991u(locale, enumC9016v, i);
        } catch (MissingResourceException unused) {
            return f28176q.mo8991u(locale, enumC9016v, i);
        }
    }

    /* renamed from: d */
    private static String m10197d(Locale locale, InterfaceC10843w interfaceC10843w, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        try {
            return m10195f(f28175p, locale, m10200a(interfaceC10843w), enumC9016v, enumC9004n);
        } catch (MissingResourceException unused) {
            return m10195f(f28176q, locale, m10200a(interfaceC10843w), enumC9016v, enumC9004n);
        }
    }

    /* renamed from: e */
    private static String m10196e(Locale locale, InterfaceC10843w interfaceC10843w, boolean z, boolean z2, EnumC9004n enumC9004n) {
        try {
            return m10194g(f28175p, locale, m10200a(interfaceC10843w), z, z2, enumC9004n);
        } catch (MissingResourceException unused) {
            return m10194g(f28176q, locale, m10200a(interfaceC10843w), z, z2, enumC9004n);
        }
    }

    /* renamed from: f */
    private static String m10195f(InterfaceC9028x interfaceC9028x, Locale locale, char c, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        if (c != '3') {
            if (c != '6') {
                if (c != '9') {
                    if (c != 'D') {
                        if (c != 'H') {
                            if (c != 'S') {
                                if (c != 'W') {
                                    if (c != 'Y') {
                                        if (c != 'M') {
                                            if (c == 'N') {
                                                return interfaceC9028x.mo9008d(locale, enumC9016v, enumC9004n);
                                            }
                                            throw new UnsupportedOperationException("Unit-ID: " + c);
                                        }
                                        return interfaceC9028x.mo8990v(locale, enumC9016v, enumC9004n);
                                    }
                                    return interfaceC9028x.mo8986z(locale, enumC9016v, enumC9004n);
                                }
                                return interfaceC9028x.mo9024A(locale, enumC9016v, enumC9004n);
                            }
                            return interfaceC9028x.mo8992t(locale, enumC9016v, enumC9004n);
                        }
                        return interfaceC9028x.mo8997o(locale, enumC9016v, enumC9004n);
                    }
                    return interfaceC9028x.mo8996p(locale, enumC9016v, enumC9004n);
                }
                return interfaceC9028x.mo9021D(locale, enumC9016v, enumC9004n);
            }
            return interfaceC9028x.mo9006f(locale, enumC9016v, enumC9004n);
        }
        return interfaceC9028x.mo8989w(locale, enumC9016v, enumC9004n);
    }

    /* renamed from: g */
    private static String m10194g(InterfaceC9028x interfaceC9028x, Locale locale, char c, boolean z, boolean z2, EnumC9004n enumC9004n) {
        if (z2 && (interfaceC9028x instanceof InterfaceC9012r)) {
            InterfaceC9012r interfaceC9012r = (InterfaceC9012r) InterfaceC9012r.class.cast(interfaceC9028x);
            if (c != 'D') {
                if (c != 'H') {
                    if (c != 'S') {
                        if (c != 'W') {
                            if (c != 'Y') {
                                if (c != 'M') {
                                    if (c == 'N') {
                                        return interfaceC9012r.mo9004h(locale, z, enumC9004n);
                                    }
                                    throw new UnsupportedOperationException("Unit-ID: " + c);
                                }
                                return interfaceC9012r.mo8998n(locale, z, enumC9004n);
                            }
                            return interfaceC9012r.mo9003i(locale, z, enumC9004n);
                        }
                        return interfaceC9012r.mo9002j(locale, z, enumC9004n);
                    }
                    return interfaceC9012r.mo8995q(locale, z, enumC9004n);
                }
                return interfaceC9012r.mo9020E(locale, z, enumC9004n);
            }
            return interfaceC9012r.mo9000l(locale, z, enumC9004n);
        } else if (c != 'D') {
            if (c != 'H') {
                if (c != 'S') {
                    if (c != 'W') {
                        if (c != 'Y') {
                            if (c != 'M') {
                                if (c == 'N') {
                                    return interfaceC9028x.mo8994r(locale, z, enumC9004n);
                                }
                                throw new UnsupportedOperationException("Unit-ID: " + c);
                            }
                            return interfaceC9028x.mo8987y(locale, z, enumC9004n);
                        }
                        return interfaceC9028x.mo9009c(locale, z, enumC9004n);
                    }
                    return interfaceC9028x.mo9022C(locale, z, enumC9004n);
                }
                return interfaceC9028x.mo9001k(locale, z, enumC9004n);
            }
            return interfaceC9028x.mo9005g(locale, z, enumC9004n);
        } else {
            return interfaceC9028x.mo8993s(locale, z, enumC9004n);
        }
    }

    /* renamed from: h */
    public static C10793s0 m10193h(Locale locale) {
        if (locale != null) {
            ConcurrentMap<Locale, C10793s0> concurrentMap = f28173n;
            C10793s0 c10793s0 = concurrentMap.get(locale);
            if (c10793s0 == null) {
                C10793s0 c10793s02 = new C10793s0(locale);
                C10793s0 putIfAbsent = concurrentMap.putIfAbsent(locale, c10793s02);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return c10793s02;
            }
            return c10793s0;
        }
        throw new NullPointerException("Missing language.");
    }

    /* renamed from: b */
    public String m10199b() {
        return this.f28186j;
    }
}