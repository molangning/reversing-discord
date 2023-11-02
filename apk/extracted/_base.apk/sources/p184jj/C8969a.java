package p184jj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import net.time4j.p249tz.InterfaceC10808k;
import net.time4j.p249tz.InterfaceC10834o;
import p162ij.AbstractC7638f0;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p288pj.EnumC11651f;

/* renamed from: jj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C8969a implements InterfaceC7633d {

    /* renamed from: b */
    public static final InterfaceC7631c<String> f23561b = C9011q.m16861a("CALENDAR_TYPE", String.class);

    /* renamed from: c */
    public static final InterfaceC7631c<Locale> f23562c = C9011q.m16861a("LANGUAGE", Locale.class);

    /* renamed from: d */
    public static final InterfaceC7631c<InterfaceC10808k> f23563d = C9011q.m16861a("TIMEZONE_ID", InterfaceC10808k.class);

    /* renamed from: e */
    public static final InterfaceC7631c<InterfaceC10834o> f23564e = C9011q.m16861a("TRANSITION_STRATEGY", InterfaceC10834o.class);

    /* renamed from: f */
    public static final InterfaceC7631c<EnumC8981g> f23565f = C9011q.m16861a("LENIENCY", EnumC8981g.class);

    /* renamed from: g */
    public static final InterfaceC7631c<EnumC9016v> f23566g = C9011q.m16861a("TEXT_WIDTH", EnumC9016v.class);

    /* renamed from: h */
    public static final InterfaceC7631c<EnumC9003m> f23567h = C9011q.m16861a("OUTPUT_CONTEXT", EnumC9003m.class);

    /* renamed from: i */
    public static final InterfaceC7631c<Boolean> f23568i = C9011q.m16861a("PARSE_CASE_INSENSITIVE", Boolean.class);

    /* renamed from: j */
    public static final InterfaceC7631c<Boolean> f23569j = C9011q.m16861a("PARSE_PARTIAL_COMPARE", Boolean.class);

    /* renamed from: k */
    public static final InterfaceC7631c<Boolean> f23570k = C9011q.m16861a("PARSE_MULTIPLE_CONTEXT", Boolean.class);

    /* renamed from: l */
    public static final InterfaceC7631c<EnumC8985j> f23571l = C9011q.m16861a("NUMBER_SYSTEM", EnumC8985j.class);

    /* renamed from: m */
    public static final InterfaceC7631c<Character> f23572m = C9011q.m16861a("ZERO_DIGIT", Character.class);

    /* renamed from: n */
    public static final InterfaceC7631c<Boolean> f23573n = C9011q.m16861a("NO_GMT_PREFIX", Boolean.class);

    /* renamed from: o */
    public static final InterfaceC7631c<Character> f23574o = C9011q.m16861a("DECIMAL_SEPARATOR", Character.class);

    /* renamed from: p */
    public static final InterfaceC7631c<Character> f23575p = C9011q.m16861a("PAD_CHAR", Character.class);

    /* renamed from: q */
    public static final InterfaceC7631c<Integer> f23576q = C9011q.m16861a("PIVOT_YEAR", Integer.class);

    /* renamed from: r */
    public static final InterfaceC7631c<Boolean> f23577r = C9011q.m16861a("TRAILING_CHARACTERS", Boolean.class);

    /* renamed from: s */
    public static final InterfaceC7631c<Integer> f23578s = C9011q.m16861a("PROTECTED_CHARACTERS", Integer.class);

    /* renamed from: t */
    public static final InterfaceC7631c<String> f23579t = C9011q.m16861a("CALENDAR_VARIANT", String.class);

    /* renamed from: u */
    public static final InterfaceC7631c<AbstractC7638f0> f23580u = C9011q.m16861a("START_OF_DAY", AbstractC7638f0.class);

    /* renamed from: v */
    public static final InterfaceC7631c<Boolean> f23581v = C9011q.m16861a("FOUR_DIGIT_YEAR", Boolean.class);

    /* renamed from: w */
    public static final InterfaceC7631c<EnumC11651f> f23582w = C9011q.m16861a("TIME_SCALE", EnumC11651f.class);

    /* renamed from: x */
    public static final InterfaceC7631c<String> f23583x = C9011q.m16861a("FORMAT_PATTERN", String.class);

    /* renamed from: y */
    private static final C8969a f23584y = new C8969a();

    /* renamed from: a */
    private final Map<String, Object> f23585a;

    /* renamed from: jj.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static /* synthetic */ class C8970a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23586a;

        static {
            int[] iArr = new int[EnumC8981g.values().length];
            f23586a = iArr;
            try {
                iArr[EnumC8981g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23586a[EnumC8981g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23586a[EnumC8981g.LAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* synthetic */ C8969a(Map map, C8970a c8970a) {
        this(map);
    }

    /* renamed from: e */
    public static <A> InterfaceC7631c<A> m16928e(String str, Class<A> cls) {
        return C9011q.m16861a(str, cls);
    }

    /* renamed from: f */
    public static C8969a m16927f() {
        return f23584y;
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: a */
    public boolean mo14442a(InterfaceC7631c<?> interfaceC7631c) {
        return this.f23585a.containsKey(interfaceC7631c.name());
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: b */
    public <A> A mo14441b(InterfaceC7631c<A> interfaceC7631c, A a) {
        Object obj = this.f23585a.get(interfaceC7631c.name());
        if (obj == null) {
            return a;
        }
        return interfaceC7631c.type().cast(obj);
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: c */
    public <A> A mo14440c(InterfaceC7631c<A> interfaceC7631c) {
        Object obj = this.f23585a.get(interfaceC7631c.name());
        if (obj != null) {
            return interfaceC7631c.type().cast(obj);
        }
        throw new NoSuchElementException(interfaceC7631c.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8969a) {
            return this.f23585a.equals(((C8969a) obj).f23585a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23585a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f23585a.size() * 32);
        sb2.append(C8969a.class.getName());
        sb2.append('[');
        sb2.append(this.f23585a);
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: jj.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C8971b {

        /* renamed from: a */
        private final Map<String, Object> f23587a = new HashMap();

        public C8971b() {
        }

        /* renamed from: g */
        private <A> void m16920g(InterfaceC7631c<A> interfaceC7631c, A a) {
            if (a != null) {
                this.f23587a.put(interfaceC7631c.name(), a);
                return;
            }
            throw new NullPointerException("Missing attribute value for key: " + interfaceC7631c);
        }

        /* renamed from: a */
        public C8969a m16926a() {
            return new C8969a(this.f23587a, null);
        }

        /* renamed from: b */
        public C8971b m16925b(InterfaceC7631c<Character> interfaceC7631c, char c) {
            this.f23587a.put(interfaceC7631c.name(), Character.valueOf(c));
            return this;
        }

        /* renamed from: c */
        public C8971b m16924c(InterfaceC7631c<Integer> interfaceC7631c, int i) {
            if (interfaceC7631c == C8969a.f23576q && i < 100) {
                throw new IllegalArgumentException("Pivot year in far past not supported: " + i);
            }
            this.f23587a.put(interfaceC7631c.name(), Integer.valueOf(i));
            return this;
        }

        /* renamed from: d */
        public <A extends Enum<A>> C8971b m16923d(InterfaceC7631c<A> interfaceC7631c, A a) {
            if (a != null) {
                this.f23587a.put(interfaceC7631c.name(), a);
                if (interfaceC7631c == C8969a.f23565f) {
                    int i = C8970a.f23586a[((EnumC8981g) EnumC8981g.class.cast(a)).ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                m16922e(C8969a.f23568i, true);
                                m16922e(C8969a.f23569j, true);
                                m16922e(C8969a.f23577r, true);
                                m16922e(C8969a.f23570k, true);
                            } else {
                                throw new UnsupportedOperationException(a.name());
                            }
                        } else {
                            m16922e(C8969a.f23568i, true);
                            m16922e(C8969a.f23569j, false);
                            m16922e(C8969a.f23577r, false);
                            m16922e(C8969a.f23570k, true);
                        }
                    } else {
                        m16922e(C8969a.f23568i, false);
                        m16922e(C8969a.f23569j, false);
                        m16922e(C8969a.f23577r, false);
                        m16922e(C8969a.f23570k, false);
                    }
                } else if (interfaceC7631c == C8969a.f23571l) {
                    EnumC8985j enumC8985j = (EnumC8985j) EnumC8985j.class.cast(a);
                    if (enumC8985j.mo16872m()) {
                        m16925b(C8969a.f23572m, enumC8985j.mo16873k().charAt(0));
                    }
                }
                return this;
            }
            throw new NullPointerException("Missing attribute value for key: " + interfaceC7631c);
        }

        /* renamed from: e */
        public C8971b m16922e(InterfaceC7631c<Boolean> interfaceC7631c, boolean z) {
            this.f23587a.put(interfaceC7631c.name(), Boolean.valueOf(z));
            return this;
        }

        /* renamed from: f */
        public C8971b m16921f(C8969a c8969a) {
            this.f23587a.putAll(c8969a.f23585a);
            return this;
        }

        /* renamed from: h */
        public C8971b m16919h(Locale locale) {
            m16920g(C8969a.f23562c, locale);
            return this;
        }

        /* renamed from: i */
        public C8971b m16918i(InterfaceC10808k interfaceC10808k) {
            m16920g(C8969a.f23563d, interfaceC10808k);
            return this;
        }

        public C8971b(C7672x<?> c7672x) {
            m16920g(C8969a.f23561b, C8972b.m16917a(c7672x));
        }
    }

    private C8969a() {
        this.f23585a = Collections.emptyMap();
    }

    private C8969a(Map<String, Object> map) {
        this.f23585a = Collections.unmodifiableMap(new HashMap(map));
    }
}
