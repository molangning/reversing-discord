package p202kj;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.C10711g0;
import net.time4j.C10852z0;
import net.time4j.InterfaceC10622c;
import net.time4j.history.C10736d;
import p162ij.AbstractC7655l;
import p162ij.AbstractC7658m;
import p162ij.C7672x;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p184jj.C8969a;
import p184jj.EnumC8979e;
import p184jj.EnumC8985j;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC8977c;
import p184jj.InterfaceC9014t;
import p202kj.C9479c;
import p220lj.InterfaceC10214a;

/* renamed from: kj.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC9525w {
    CLDR,
    SIMPLE_DATE_FORMAT,
    CLDR_24,
    CLDR_DATE,
    DYNAMIC;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kj.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C9526a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25289a;

        static {
            int[] iArr = new int[EnumC9525w.values().length];
            f25289a = iArr;
            try {
                iArr[EnumC9525w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25289a[EnumC9525w.SIMPLE_DATE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25289a[EnumC9525w.CLDR_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25289a[EnumC9525w.CLDR_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25289a[EnumC9525w.DYNAMIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: A */
    private static boolean m14392A(char c) {
        if (c == 'L' || c == 'M' || c == 'U' || c == 'W' || c == 'g' || c == 'r' || c == 'w' || c == 'y') {
            return true;
        }
        switch (c) {
            case 'D':
            case 'E':
            case 'F':
            case 'G':
                return true;
            default:
                switch (c) {
                    case 'c':
                    case 'd':
                    case 'e':
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: B */
    private static boolean m14391B(C7672x<?> c7672x) {
        return m14370t(c7672x).equals("iso8601");
    }

    /* renamed from: D */
    private Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14389D(C9479c.C9483d<?> c9483d, C7672x<?> c7672x, Locale locale, char c, int i) {
        if (c != 'B' && c != 'O' && c != 'Q') {
            if (c != 'S') {
                if (c != 'Z') {
                    if (c != 'e' && c != 'g') {
                        if (c != 'u') {
                            if (c != 'x' && c != 'b' && c != 'c' && c != 'q' && c != 'r') {
                                switch (c) {
                                    case 'U':
                                    case 'V':
                                        break;
                                    case 'W':
                                        c9483d.m14580g(C10852z0.m9969j(locale).m9978a(), i);
                                        break;
                                    case 'X':
                                        if (i < 4) {
                                            return m14377m(c9483d, c7672x, locale, 'X', i, true);
                                        }
                                        throw new IllegalArgumentException("Too many pattern letters (X): " + i);
                                    default:
                                        return m14377m(c9483d, c7672x, locale, c, i, true);
                                }
                            }
                        } else {
                            c9483d.m14579h(C10697f0.f27889E, i);
                        }
                    }
                } else {
                    m14383f(c9483d, c, 2, false);
                }
            } else {
                c9483d.m14580g(C10711g0.f27941J, i);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("CLDR pattern symbol not supported in SimpleDateFormat-style: " + c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static void m14388a(C9479c.C9483d<?> c9483d, InterfaceC7664p<? extends Enum> interfaceC7664p, int i) {
        c9483d.m14566u(interfaceC7664p, i, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static void m14387b(C9479c.C9483d<?> c9483d, InterfaceC7664p<? extends Enum> interfaceC7664p) {
        c9483d.m14561z(interfaceC7664p);
    }

    /* renamed from: c */
    private static void m14386c(C9479c.C9483d<?> c9483d, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            c9483d.m14585b0(C8969a.f23566g, EnumC9016v.NARROW);
                            c9483d.m14561z(C10697f0.f27886B);
                            c9483d.m14603L();
                            return;
                        }
                        throw new IllegalArgumentException("Too many pattern letters for month: " + i);
                    }
                    c9483d.m14585b0(C8969a.f23566g, EnumC9016v.WIDE);
                    c9483d.m14561z(C10697f0.f27886B);
                    c9483d.m14603L();
                    return;
                }
                c9483d.m14585b0(C8969a.f23566g, EnumC9016v.ABBREVIATED);
                c9483d.m14561z(C10697f0.f27886B);
                c9483d.m14603L();
                return;
            }
            c9483d.m14580g(C10697f0.f27887C, 2);
            return;
        }
        c9483d.m14577j(C10697f0.f27887C, 1, 2);
    }

    /* renamed from: d */
    private static <V extends Enum<V>> void m14385d(C9479c.C9483d<?> c9483d, int i, InterfaceC9014t<?> interfaceC9014t) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        c9483d.m14585b0(C8969a.f23566g, EnumC9016v.NARROW);
                        c9483d.m14614A(interfaceC9014t);
                        c9483d.m14603L();
                        return;
                    }
                    throw new IllegalArgumentException("Too many pattern letters for month: " + i);
                }
                c9483d.m14585b0(C8969a.f23566g, EnumC9016v.WIDE);
                c9483d.m14614A(interfaceC9014t);
                c9483d.m14603L();
                return;
            }
            c9483d.m14585b0(C8969a.f23566g, EnumC9016v.ABBREVIATED);
            c9483d.m14614A(interfaceC9014t);
            c9483d.m14603L();
        } else if (Enum.class.isAssignableFrom(interfaceC9014t.getType())) {
            InterfaceC7664p<V> interfaceC7664p = (InterfaceC7664p) m14380i(interfaceC9014t);
            if (i == 1) {
                c9483d.m14566u(interfaceC7664p, 1, 2);
            } else if (i == 2) {
                c9483d.m14579h(interfaceC7664p, 2);
            }
        } else {
            c9483d.m14587a0(InterfaceC10214a.f26520d, i);
            c9483d.m14614A(interfaceC9014t);
            c9483d.m14603L();
        }
    }

    /* renamed from: e */
    private static void m14384e(InterfaceC7664p<Integer> interfaceC7664p, char c, C9479c.C9483d<?> c9483d, int i, boolean z) {
        if (i == 1) {
            c9483d.m14577j(interfaceC7664p, 1, 2);
        } else if (i != 2 && !z) {
            throw new IllegalArgumentException("Too many pattern letters (" + c + "): " + i);
        } else {
            c9483d.m14580g(interfaceC7664p, i);
        }
    }

    /* renamed from: f */
    private static void m14383f(C9479c.C9483d<?> c9483d, char c, int i, boolean z) {
        String str = "Z";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            EnumC8979e enumC8979e = EnumC8979e.LONG;
                            if (!z) {
                                str = "+00:00";
                            }
                            c9483d.m14612C(enumC8979e, true, Collections.singletonList(str));
                            return;
                        }
                        throw new IllegalArgumentException("Too many pattern letters (" + c + "): " + i);
                    }
                    EnumC8979e enumC8979e2 = EnumC8979e.LONG;
                    if (!z) {
                        str = "+0000";
                    }
                    c9483d.m14612C(enumC8979e2, false, Collections.singletonList(str));
                    return;
                }
                EnumC8979e enumC8979e3 = EnumC8979e.MEDIUM;
                if (!z) {
                    str = "+00:00";
                }
                c9483d.m14612C(enumC8979e3, true, Collections.singletonList(str));
                return;
            }
            EnumC8979e enumC8979e4 = EnumC8979e.MEDIUM;
            if (!z) {
                str = "+0000";
            }
            c9483d.m14612C(enumC8979e4, false, Collections.singletonList(str));
            return;
        }
        EnumC8979e enumC8979e5 = EnumC8979e.SHORT;
        if (!z) {
            str = "+00";
        }
        c9483d.m14612C(enumC8979e5, false, Collections.singletonList(str));
    }

    /* renamed from: g */
    private static void m14382g(C9479c.C9483d<?> c9483d, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        c9483d.m14585b0(C8969a.f23566g, EnumC9016v.NARROW);
                        c9483d.m14561z(C10697f0.f27885A);
                        c9483d.m14603L();
                        return;
                    }
                    throw new IllegalArgumentException("Too many pattern letters for quarter-of-year: " + i);
                }
                c9483d.m14585b0(C8969a.f23566g, EnumC9016v.WIDE);
                c9483d.m14561z(C10697f0.f27885A);
                c9483d.m14603L();
                return;
            }
            c9483d.m14585b0(C8969a.f23566g, EnumC9016v.ABBREVIATED);
            c9483d.m14561z(C10697f0.f27885A);
            c9483d.m14603L();
            return;
        }
        c9483d.m14579h(C10697f0.f27885A, i);
    }

    /* renamed from: h */
    private static int m14381h(int i) {
        return (i < 65 || i > 90) ? (i + 65) - 97 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private static <T> T m14380i(Object obj) {
        return obj;
    }

    /* renamed from: k */
    private Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14379k(C9479c.C9483d<?> c9483d, Locale locale, char c, int i) {
        C7672x<?> m14369v = m14369v(c9483d);
        if (m14392A(c) && !m14391B(m14369v)) {
            return m14371s(c9483d, m14369v, c, i, locale);
        }
        if (c == 'h' && m14370t(m14369v).equals("ethiopic")) {
            InterfaceC7664p<Integer> m14372r = m14372r(m14369v);
            if (m14372r != null) {
                m14384e(m14372r, c, c9483d, i, false);
                return Collections.emptyMap();
            }
            throw new IllegalArgumentException("Ethiopian time not available.");
        }
        return m14377m(c9483d, m14369v, locale, c, i, false);
    }

    /* renamed from: l */
    private Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14378l(C9479c.C9483d<?> c9483d, Locale locale, char c, int i) {
        if (c == 'H') {
            m14384e(C10711g0.f27936E, c, c9483d, i, false);
            return Collections.emptyMap();
        }
        return m14379k(c9483d, locale, c, i);
    }

    /* renamed from: m */
    private Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14377m(C9479c.C9483d<?> c9483d, C7672x<?> c7672x, Locale locale, char c, int i, boolean z) {
        EnumC9016v enumC9016v;
        EnumC9016v enumC9016v2;
        switch (c) {
            case 'A':
                c9483d.m14577j(C10711g0.f27944M, i, 8);
                break;
            case 'B':
                c9483d.m14585b0(C8969a.f23566g, m14367z(i));
                c9483d.m14582e();
                c9483d.m14603L();
                break;
            case 'C':
            case 'I':
            case 'J':
            case 'N':
            case 'P':
            case 'R':
            case 'T':
            case 'U':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'f':
            case 'i':
            case 'j':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 't':
            case 'v':
            default:
                throw new IllegalArgumentException("Unsupported pattern symbol: " + c);
            case 'D':
                if (i < 3) {
                    c9483d.m14577j(C10697f0.f27890F, i, 3);
                    break;
                } else if (i != 3 && !z) {
                    throw new IllegalArgumentException("Too many pattern letters (D): " + i);
                } else {
                    c9483d.m14580g(C10697f0.f27890F, i);
                    break;
                }
            case 'E':
                if (i <= 3) {
                    enumC9016v = EnumC9016v.ABBREVIATED;
                } else if (i == 4 || z) {
                    enumC9016v = EnumC9016v.WIDE;
                } else if (i == 5) {
                    enumC9016v = EnumC9016v.NARROW;
                } else if (i == 6) {
                    enumC9016v = EnumC9016v.SHORT;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (E): " + i);
                }
                c9483d.m14585b0(C8969a.f23566g, enumC9016v);
                c9483d.m14561z(C10697f0.f27889E);
                c9483d.m14603L();
                break;
            case 'F':
                if (i != 1 && !z) {
                    throw new IllegalArgumentException("Too many pattern letters (F): " + i);
                }
                c9483d.m14580g(C10697f0.f27892H, i);
                break;
            case 'G':
                if (i <= 3) {
                    enumC9016v2 = EnumC9016v.ABBREVIATED;
                } else if (i == 4 || z) {
                    enumC9016v2 = EnumC9016v.WIDE;
                } else if (i == 5) {
                    enumC9016v2 = EnumC9016v.NARROW;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (G): " + i);
                }
                c9483d.m14585b0(C8969a.f23566g, enumC9016v2);
                C10736d m10430D = C10736d.m10430D(locale);
                c9483d.m14614A((InterfaceC9014t) InterfaceC9014t.class.cast(m10430D.m10412i()));
                c9483d.m14603L();
                HashMap hashMap = new HashMap();
                hashMap.put(C10697f0.f27908y, m10430D.m10421M());
                hashMap.put(C10697f0.f27886B, m10430D.m10431C());
                hashMap.put(C10697f0.f27887C, m10430D.m10431C());
                hashMap.put(C10697f0.f27888D, m10430D.m10414g());
                hashMap.put(C10697f0.f27890F, m10430D.m10413h());
                return hashMap;
            case 'H':
                m14384e(C10711g0.f27935D, c, c9483d, i, z);
                break;
            case 'K':
                m14384e(C10711g0.f27934C, c, c9483d, i, z);
                break;
            case 'L':
                c9483d.m14585b0(C8969a.f23567h, EnumC9003m.STANDALONE);
                m14386c(c9483d, Math.min(i, z ? 4 : i));
                c9483d.m14603L();
                break;
            case 'M':
                m14386c(c9483d, Math.min(i, z ? 4 : i));
                break;
            case 'O':
                if (i == 1) {
                    c9483d.m14563x();
                    break;
                } else if (i == 4) {
                    c9483d.m14571p();
                    break;
                } else {
                    throw new IllegalArgumentException("Count of pattern letters is not 1 or 4: " + i);
                }
            case 'Q':
                m14382g(c9483d, i);
                break;
            case 'S':
                c9483d.m14578i(C10711g0.f27943L, i, i, false);
                break;
            case 'V':
                if (i == 2) {
                    try {
                        c9483d.m14613B();
                        break;
                    } catch (IllegalStateException e) {
                        throw new IllegalArgumentException(e.getMessage());
                    }
                } else {
                    throw new IllegalArgumentException("Count of pattern letters is not 2: " + i);
                }
            case 'W':
                if (i == 1) {
                    c9483d.m14580g(C10852z0.m9969j(locale).m9966m(), 1);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i);
                }
            case 'X':
                m14383f(c9483d, c, i, true);
                break;
            case 'Y':
                if (i == 2) {
                    c9483d.m14611D(C10697f0.f27909z);
                    break;
                } else {
                    c9483d.m14610E(C10697f0.f27909z, i, false);
                    break;
                }
            case 'Z':
                if (i < 4) {
                    c9483d.m14612C(EnumC8979e.LONG, false, Collections.singletonList("+0000"));
                    break;
                } else if (i == 4) {
                    c9483d.m14571p();
                    break;
                } else if (i == 5) {
                    c9483d.m14612C(EnumC8979e.LONG, true, Collections.singletonList("Z"));
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (Z): " + i);
                }
            case 'a':
                c9483d.m14585b0(C8969a.f23566g, z ? EnumC9016v.ABBREVIATED : m14367z(i));
                c9483d.m14561z(C10711g0.f27968z);
                c9483d.m14603L();
                if (m14370t(c7672x).equals("ethiopic")) {
                    InterfaceC7664p<Integer> m14372r = m14372r(c7672x);
                    if (m14372r != null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(m14372r, C10711g0.f27932A);
                        return hashMap2;
                    }
                    throw new IllegalArgumentException("Ethiopian time not available.");
                }
                break;
            case 'b':
                c9483d.m14585b0(C8969a.f23566g, m14367z(i));
                c9483d.m14581f();
                c9483d.m14603L();
                break;
            case 'c':
                if (i != 2) {
                    c9483d.m14585b0(C8969a.f23567h, EnumC9003m.STANDALONE);
                    if (i == 1) {
                        c9483d.m14579h(C10852z0.m9969j(locale).m9970i(), 1);
                    } else {
                        m14377m(c9483d, c7672x, locale, 'E', i, z);
                    }
                    c9483d.m14603L();
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                }
            case 'd':
                m14384e(C10697f0.f27888D, c, c9483d, i, z);
                break;
            case 'e':
                if (i <= 2) {
                    c9483d.m14579h(C10852z0.m9969j(locale).m9970i(), i);
                    break;
                } else {
                    m14377m(c9483d, c7672x, locale, 'E', i, z);
                    break;
                }
            case 'g':
                c9483d.m14570q(EnumC7627a0.MODIFIED_JULIAN_DATE, i, 18, EnumC9527x.SHOW_WHEN_NEGATIVE);
                break;
            case 'h':
                m14384e(C10711g0.f27932A, c, c9483d, i, z);
                break;
            case 'k':
                m14384e(C10711g0.f27933B, c, c9483d, i, z);
                break;
            case 'm':
                m14384e(C10711g0.f27937F, c, c9483d, i, z);
                break;
            case 'q':
                c9483d.m14585b0(C8969a.f23567h, EnumC9003m.STANDALONE);
                m14382g(c9483d, i);
                c9483d.m14603L();
                break;
            case 'r':
                c9483d.m14585b0(C8969a.f23571l, EnumC8985j.f23622j);
                c9483d.m14589Z(C8969a.f23572m, '0');
                c9483d.m14610E(C10697f0.f27908y, i, true);
                c9483d.m14603L();
                c9483d.m14603L();
                break;
            case 's':
                m14384e(C10711g0.f27939H, c, c9483d, i, z);
                break;
            case 'u':
                c9483d.m14610E(C10697f0.f27908y, i, true);
                break;
            case 'w':
                if (i <= 2) {
                    InterfaceC10622c<Integer, C10697f0> m9965n = C10852z0.m9969j(locale).m9965n();
                    Iterator<InterfaceC7664p<?>> it = c7672x.m20109u().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC7664p<?> next = it.next();
                            if (next.mo9552a() == c) {
                                C10852z0 c10852z0 = C10852z0.f28326v;
                                if (next.equals(c10852z0.m9965n())) {
                                    m9965n = c10852z0.m9965n();
                                }
                            }
                        }
                    }
                    m14384e(m9965n, c, c9483d, i, z);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (w): " + i);
                }
            case 'x':
                m14383f(c9483d, c, i, false);
                break;
            case 'y':
                if (i == 2) {
                    c9483d.m14611D(C10697f0.f27908y);
                    break;
                } else {
                    c9483d.m14610E(C10697f0.f27908y, i, false);
                    break;
                }
            case 'z':
                try {
                    if (i < 4) {
                        c9483d.m14562y();
                        break;
                    } else {
                        if (i != 4 && !z) {
                            throw new IllegalArgumentException("Too many pattern letters (z): " + i);
                        }
                        c9483d.m14569r();
                    }
                } catch (IllegalStateException e2) {
                    throw new IllegalArgumentException(e2.getMessage());
                }
        }
        return Collections.emptyMap();
    }

    /* renamed from: n */
    private Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14376n(C9479c.C9483d<?> c9483d, char c, int i, Locale locale) {
        boolean z;
        boolean z2;
        if (c >= 'A' && c <= 'Z') {
            z = true;
        } else {
            z = false;
        }
        InterfaceC7664p<?> m14374p = m14374p(m14369v(c9483d), locale, c);
        if (m14374p != null) {
            if (z && (((z2 = m14374p instanceof InterfaceC9014t)) || Enum.class.isAssignableFrom(m14374p.getType()))) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                c9483d.m14585b0(C8969a.f23566g, EnumC9016v.WIDE);
                            } else {
                                throw new IllegalArgumentException("Illegal count of symbols: " + c);
                            }
                        } else {
                            c9483d.m14585b0(C8969a.f23566g, EnumC9016v.ABBREVIATED);
                        }
                    } else {
                        c9483d.m14585b0(C8969a.f23566g, EnumC9016v.SHORT);
                    }
                } else {
                    c9483d.m14585b0(C8969a.f23566g, EnumC9016v.NARROW);
                }
                if (z2) {
                    c9483d.m14614A((InterfaceC9014t) m14380i(m14374p));
                } else {
                    m14387b(c9483d, (InterfaceC7664p) m14380i(m14374p));
                }
                c9483d.m14603L();
            } else if (m14374p.getType() == Integer.class) {
                c9483d.m14577j((InterfaceC7664p) m14380i(m14374p), i, 9);
            } else if (Enum.class.isAssignableFrom(m14374p.getType())) {
                m14388a(c9483d, (InterfaceC7664p) m14380i(m14374p), i);
            } else {
                throw new IllegalArgumentException("Can only handle enum or integer elements in a numerical way: " + m14374p);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("Cannot resolve symbol: " + c);
    }

    /* renamed from: o */
    private static InterfaceC7664p<?> m14375o(Set<InterfaceC7664p<?>> set, char c, String str) {
        char c2;
        if (c == 'L') {
            c2 = 'M';
        } else if (c == 'c') {
            c2 = 'e';
        } else {
            c2 = c;
        }
        for (InterfaceC7664p<?> interfaceC7664p : set) {
            if (interfaceC7664p.mo9555M() && interfaceC7664p.mo9552a() == c2 && (c2 != 'M' || !interfaceC7664p.name().equals("MONTH_AS_NUMBER"))) {
                return interfaceC7664p;
            }
        }
        if (c == 'y' && str.equals("net.time4j.PlainDate")) {
            return C10697f0.f27908y;
        }
        throw new IllegalArgumentException("Cannot find any chronological date element for symbol " + c + " in \"" + str + "\".");
    }

    /* renamed from: p */
    private static InterfaceC7664p<?> m14374p(C7672x<?> c7672x, Locale locale, int i) {
        InterfaceC7664p<?> m14373q = m14373q(c7672x, locale, i, false);
        if (m14373q == null) {
            return m14373q(c7672x, locale, i, true);
        }
        return m14373q;
    }

    /* renamed from: q */
    private static InterfaceC7664p<?> m14373q(C7672x<?> c7672x, Locale locale, int i, boolean z) {
        if (z) {
            i = m14381h(i);
        }
        for (InterfaceC7664p<?> interfaceC7664p : c7672x.m20109u()) {
            int mo9552a = interfaceC7664p.mo9552a();
            if (z) {
                mo9552a = m14381h(mo9552a);
                continue;
            }
            if (mo9552a == i) {
                return interfaceC7664p;
            }
        }
        for (InterfaceC7667s interfaceC7667s : c7672x.m20111s()) {
            for (InterfaceC7664p<?> interfaceC7664p2 : interfaceC7667s.mo9074b(locale, C8969a.m16927f())) {
                int mo9552a2 = interfaceC7664p2.mo9552a();
                if (z) {
                    mo9552a2 = m14381h(mo9552a2);
                    continue;
                }
                if (mo9552a2 == i) {
                    return interfaceC7664p2;
                }
            }
        }
        return null;
    }

    /* renamed from: r */
    private static InterfaceC7664p<Integer> m14372r(C7672x<?> c7672x) {
        for (InterfaceC7667s interfaceC7667s : c7672x.m20111s()) {
            for (InterfaceC7664p<?> interfaceC7664p : interfaceC7667s.mo9074b(Locale.ROOT, C8969a.m16927f())) {
                if (interfaceC7664p.name().equals("ETHIOPIAN_HOUR")) {
                    return (InterfaceC7664p) m14380i(interfaceC7664p);
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    private Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14371s(C9479c.C9483d<?> c9483d, C7672x<?> c7672x, char c, int i, Locale locale) {
        InterfaceC7664p<Integer> interfaceC7664p;
        EnumC9016v enumC9016v;
        EnumC9016v enumC9016v2;
        EnumC9016v enumC9016v3;
        if (c == 'g') {
            c9483d.m14570q(EnumC7627a0.MODIFIED_JULIAN_DATE, i, 18, EnumC9527x.SHOW_WHEN_NEGATIVE);
            return Collections.emptyMap();
        } else if (c == 'G' && c7672x == C10697f0.m10673w0()) {
            return m14377m(c9483d, c7672x, locale, c, i, false);
        } else {
            Set<InterfaceC7664p<?>> m14368w = m14368w(c7672x, c, locale);
            String name = c9483d.m14599P().m20113p().getName();
            InterfaceC7664p<?> m14375o = m14375o(m14368w, c, name);
            InterfaceC9014t<?> interfaceC9014t = null;
            if (Integer.class.isAssignableFrom(m14375o.getType())) {
                if (m14375o instanceof InterfaceC10214a) {
                    interfaceC9014t = (InterfaceC9014t) m14380i(m14375o);
                }
                interfaceC7664p = (InterfaceC7664p) m14380i(m14375o);
            } else if (m14375o instanceof InterfaceC9014t) {
                interfaceC9014t = (InterfaceC9014t) m14380i(m14375o);
                interfaceC7664p = null;
            } else {
                throw new IllegalStateException("Implementation error: " + m14375o + " in \"" + name + "\"");
            }
            if (c != 'L') {
                if (c != 'M') {
                    if (c != 'U') {
                        boolean z = true;
                        if (c != 'W') {
                            if (c != 'r') {
                                if (c != 'w') {
                                    if (c != 'y') {
                                        switch (c) {
                                            case 'D':
                                                if (i < 3) {
                                                    c9483d.m14577j(interfaceC7664p, i, 3);
                                                    break;
                                                } else if (i == 3) {
                                                    c9483d.m14580g(interfaceC7664p, i);
                                                    break;
                                                } else {
                                                    throw new IllegalArgumentException("Too many pattern letters (D): " + i);
                                                }
                                            case 'E':
                                                if (i <= 3) {
                                                    enumC9016v2 = EnumC9016v.ABBREVIATED;
                                                } else if (i == 4) {
                                                    enumC9016v2 = EnumC9016v.WIDE;
                                                } else if (i == 5) {
                                                    enumC9016v2 = EnumC9016v.NARROW;
                                                } else if (i == 6) {
                                                    enumC9016v2 = EnumC9016v.SHORT;
                                                } else {
                                                    throw new IllegalArgumentException("Too many pattern letters (E): " + i);
                                                }
                                                c9483d.m14585b0(C8969a.f23566g, enumC9016v2);
                                                c9483d.m14614A(interfaceC9014t);
                                                c9483d.m14603L();
                                                break;
                                            case 'F':
                                                if (i == 1) {
                                                    c9483d.m14580g(interfaceC7664p, i);
                                                    break;
                                                } else {
                                                    throw new IllegalArgumentException("Too many pattern letters (F): " + i);
                                                }
                                            case 'G':
                                                if (i <= 3) {
                                                    enumC9016v3 = EnumC9016v.ABBREVIATED;
                                                } else if (i == 4) {
                                                    enumC9016v3 = EnumC9016v.WIDE;
                                                } else if (i == 5) {
                                                    enumC9016v3 = EnumC9016v.NARROW;
                                                } else {
                                                    throw new IllegalArgumentException("Too many pattern letters (G): " + i);
                                                }
                                                c9483d.m14585b0(C8969a.f23566g, enumC9016v3);
                                                c9483d.m14614A(interfaceC9014t);
                                                c9483d.m14603L();
                                                break;
                                            default:
                                                switch (c) {
                                                    case 'c':
                                                        if (i != 2) {
                                                            c9483d.m14585b0(C8969a.f23567h, EnumC9003m.STANDALONE);
                                                            if (i == 1) {
                                                                c9483d.m14579h((InterfaceC7664p) m14380i(m14375o), 1);
                                                            } else {
                                                                m14371s(c9483d, c7672x, 'E', i, locale);
                                                            }
                                                            c9483d.m14603L();
                                                            break;
                                                        } else {
                                                            throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                                                        }
                                                    case 'd':
                                                        if (interfaceC7664p == null) {
                                                            if (i <= 2) {
                                                                c9483d.m14587a0(InterfaceC10214a.f26520d, i);
                                                                c9483d.m14614A(interfaceC9014t);
                                                                c9483d.m14603L();
                                                                break;
                                                            } else {
                                                                throw new IllegalArgumentException("Too many pattern letters for day-of-month: " + i);
                                                            }
                                                        } else {
                                                            m14384e(interfaceC7664p, c, c9483d, i, false);
                                                            break;
                                                        }
                                                    case 'e':
                                                        if (i <= 2) {
                                                            c9483d.m14579h((InterfaceC7664p) m14380i(m14375o), i);
                                                            break;
                                                        } else {
                                                            m14371s(c9483d, c7672x, 'E', i, locale);
                                                            break;
                                                        }
                                                    default:
                                                        throw new IllegalArgumentException("Unsupported pattern symbol: " + c);
                                                }
                                        }
                                    } else {
                                        if (locale.getLanguage().equals("am") && m14370t(c7672x).equals("ethiopic")) {
                                            c9483d.m14585b0(C8969a.f23571l, EnumC8985j.f23628p);
                                        } else {
                                            z = false;
                                        }
                                        if (i == 2) {
                                            c9483d.m14611D(interfaceC7664p);
                                        } else {
                                            c9483d.m14610E(interfaceC7664p, i, false);
                                        }
                                        if (z) {
                                            c9483d.m14603L();
                                        }
                                    }
                                } else {
                                    m14384e(interfaceC7664p, c, c9483d, i, false);
                                }
                            } else {
                                c9483d.m14585b0(C8969a.f23571l, EnumC8985j.f23622j);
                                c9483d.m14589Z(C8969a.f23572m, '0');
                                c9483d.m14610E(interfaceC7664p, i, true);
                                c9483d.m14603L();
                                c9483d.m14603L();
                            }
                        } else if (i == 1) {
                            c9483d.m14580g(interfaceC7664p, 1);
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters (W): " + i);
                        }
                    } else if (interfaceC9014t != null) {
                        if (i <= 3) {
                            enumC9016v = EnumC9016v.ABBREVIATED;
                        } else if (i == 4) {
                            enumC9016v = EnumC9016v.WIDE;
                        } else if (i == 5) {
                            enumC9016v = EnumC9016v.NARROW;
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters (U): " + i);
                        }
                        c9483d.m14585b0(C8969a.f23566g, enumC9016v);
                        c9483d.m14614A(interfaceC9014t);
                        c9483d.m14603L();
                    } else {
                        throw new IllegalStateException("Implementation error: " + m14375o + " in \"" + name + "\"");
                    }
                } else {
                    m14385d(c9483d, i, interfaceC9014t);
                }
            } else {
                c9483d.m14585b0(C8969a.f23567h, EnumC9003m.STANDALONE);
                m14385d(c9483d, i, interfaceC9014t);
                c9483d.m14603L();
            }
            return Collections.emptyMap();
        }
    }

    /* renamed from: t */
    private static String m14370t(C7672x<?> c7672x) {
        InterfaceC8977c interfaceC8977c = (InterfaceC8977c) c7672x.m20113p().getAnnotation(InterfaceC8977c.class);
        if (interfaceC8977c == null) {
            return "iso8601";
        }
        return interfaceC8977c.value();
    }

    /* renamed from: v */
    private static C7672x<?> m14369v(C9479c.C9483d<?> c9483d) {
        return c9483d.m14599P();
    }

    /* renamed from: w */
    private static Set<InterfaceC7664p<?>> m14368w(C7672x<?> c7672x, char c, Locale locale) {
        if (c != 'w' && c != 'W' && c != 'e' && c != 'c') {
            return c7672x.m20109u();
        }
        for (InterfaceC7667s interfaceC7667s : c7672x.m20111s()) {
            for (InterfaceC7664p<?> interfaceC7664p : interfaceC7667s.mo9074b(locale, C8969a.m16927f())) {
                if (((c == 'e' || c == 'c') && interfaceC7664p.name().equals("LOCAL_DAY_OF_WEEK")) || ((c == 'w' && interfaceC7664p.name().equals("WEEK_OF_YEAR")) || (c == 'W' && interfaceC7664p.name().equals("WEEK_OF_MONTH")))) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(interfaceC7664p);
                    return hashSet;
                }
            }
        }
        return Collections.emptySet();
    }

    /* renamed from: z */
    private static EnumC9016v m14367z(int i) {
        if (i <= 3) {
            return EnumC9016v.ABBREVIATED;
        }
        if (i == 4) {
            return EnumC9016v.WIDE;
        }
        if (i == 5) {
            return EnumC9016v.NARROW;
        }
        throw new IllegalArgumentException("Too many pattern letters: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14390C(C9479c.C9483d<?> c9483d, Locale locale, char c, int i) {
        C7672x<?> m14369v = m14369v(c9483d);
        int i2 = C9526a.f25289a[ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return m14376n(c9483d, c, i, locale);
                        }
                        throw new UnsupportedOperationException(name());
                    }
                    Class<?> m20113p = m14369v.m20113p();
                    if (!AbstractC7658m.class.isAssignableFrom(m20113p) && !AbstractC7655l.class.isAssignableFrom(m20113p)) {
                        throw new IllegalArgumentException("No calendar chronology.");
                    }
                    return m14371s(c9483d, m14369v, c, i, locale);
                }
                return m14378l(c9483d, locale, c, i);
            }
            return m14389D(c9483d, m14369v, locale, c, i);
        }
        return m14379k(c9483d, locale, c, i);
    }
}
