package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.EnumC10686f;
import net.time4j.base.AbstractC10617d;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import p162ij.AbstractC7638f0;
import p162ij.AbstractC7658m;
import p162ij.AbstractC7665q;
import p162ij.C7644h0;
import p162ij.C7672x;
import p162ij.EnumC7627a0;
import p162ij.EnumC7661n0;
import p162ij.InterfaceC7632c0;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7634d0;
import p162ij.InterfaceC7641g;
import p162ij.InterfaceC7653k;
import p162ij.InterfaceC7659m0;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p162ij.InterfaceC7669u;
import p162ij.InterfaceC7675y;
import p162ij.InterfaceC7676z;
import p184jj.C8972b;
import p184jj.EnumC8979e;
import p184jj.InterfaceC8977c;
import p184jj.InterfaceC8982h;

@InterfaceC8977c("iso8601")
/* renamed from: net.time4j.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10697f0 extends AbstractC7658m<InterfaceC10839u, C10697f0> implements InterfaceC10614a, InterfaceC7634d0<EnumC10686f>, InterfaceC8982h {

    /* renamed from: A */
    public static final InterfaceC10623c0<EnumC10777m0> f27885A;

    /* renamed from: B */
    public static final InterfaceC10623c0<EnumC10612b0> f27886B;

    /* renamed from: C */
    public static final InterfaceC10773k0<Integer, C10697f0> f27887C;

    /* renamed from: D */
    public static final InterfaceC10773k0<Integer, C10697f0> f27888D;

    /* renamed from: E */
    public static final InterfaceC10623c0<EnumC10846x0> f27889E;

    /* renamed from: F */
    public static final InterfaceC10773k0<Integer, C10697f0> f27890F;

    /* renamed from: G */
    public static final InterfaceC10773k0<Integer, C10697f0> f27891G;

    /* renamed from: H */
    public static final InterfaceC10683d0 f27892H;

    /* renamed from: I */
    private static final Map<String, Object> f27893I;

    /* renamed from: J */
    private static final InterfaceC7653k<C10697f0> f27894J;

    /* renamed from: K */
    private static final C7644h0<InterfaceC10839u, C10697f0> f27895K;
    private static final long serialVersionUID = -6698431452072325688L;

    /* renamed from: u */
    private static final int[] f27904u;

    /* renamed from: v */
    private static final int[] f27905v;

    /* renamed from: w */
    static final InterfaceC7664p<C10697f0> f27906w;

    /* renamed from: x */
    public static final InterfaceC10684e f27907x;

    /* renamed from: y */
    public static final InterfaceC10622c<Integer, C10697f0> f27908y;

    /* renamed from: z */
    public static final InterfaceC10622c<Integer, C10697f0> f27909z;

    /* renamed from: j */
    private final transient int f27910j;

    /* renamed from: k */
    private final transient byte f27911k;

    /* renamed from: l */
    private final transient byte f27912l;

    /* renamed from: m */
    static final C10697f0 f27896m = new C10697f0(-999999999, 1, 1);

    /* renamed from: n */
    static final C10697f0 f27897n = new C10697f0(999999999, 12, 31);

    /* renamed from: o */
    static final Integer f27898o = -999999999;

    /* renamed from: p */
    static final Integer f27899p = 999999999;

    /* renamed from: q */
    private static final Integer f27900q = 1;

    /* renamed from: r */
    private static final Integer f27901r = 12;

    /* renamed from: s */
    private static final Integer f27902s = 365;

    /* renamed from: t */
    private static final Integer f27903t = 366;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10698a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27913a;

        /* renamed from: b */
        static final /* synthetic */ int[] f27914b;

        static {
            int[] iArr = new int[EnumC10777m0.values().length];
            f27914b = iArr;
            try {
                iArr[EnumC10777m0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27914b[EnumC10777m0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC10686f.values().length];
            f27913a = iArr2;
            try {
                iArr2[EnumC10686f.f27871j.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27913a[EnumC10686f.f27872k.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27913a[EnumC10686f.f27873l.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27913a[EnumC10686f.f27874m.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27913a[EnumC10686f.f27875n.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27913a[EnumC10686f.f27876o.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27913a[EnumC10686f.f27877p.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27913a[EnumC10686f.f27878q.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: net.time4j.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10699b implements InterfaceC7676z<C10697f0, C10697f0> {
        private C10699b() {
        }

        /* synthetic */ C10699b(C10698a c10698a) {
            this();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C10697f0 c10697f0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C10697f0 c10697f0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public C10697f0 mo9922f(C10697f0 c10697f0) {
            return C10697f0.f27897n;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public C10697f0 mo9917l(C10697f0 c10697f0) {
            return C10697f0.f27896m;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public C10697f0 mo9915o(C10697f0 c10697f0) {
            return c10697f0;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C10697f0 c10697f0, C10697f0 c10697f02) {
            return c10697f02 != null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C10697f0 mo9916n(C10697f0 c10697f0, C10697f0 c10697f02, boolean z) {
            if (c10697f02 != null) {
                return c10697f02;
            }
            throw new IllegalArgumentException("Missing date value.");
        }
    }

    /* renamed from: net.time4j.f0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10700c<V extends Enum<V>> implements InterfaceC7676z<C10697f0, V> {

        /* renamed from: j */
        private final String f27915j;

        /* renamed from: k */
        private final Class<V> f27916k;

        /* renamed from: l */
        private final V f27917l;

        /* renamed from: m */
        private final V f27918m;

        /* renamed from: n */
        private final int f27919n;

        C10700c(String str, Class<V> cls, V v, V v2, int i) {
            this.f27915j = str;
            this.f27916k = cls;
            this.f27917l = v;
            this.f27918m = v2;
            this.f27919n = i;
        }

        /* renamed from: a */
        private InterfaceC7664p<?> m10662a() {
            switch (this.f27919n) {
                case 101:
                    return C10697f0.f27888D;
                case 102:
                    return null;
                case 103:
                    return C10697f0.f27891G;
                default:
                    throw new UnsupportedOperationException(this.f27915j);
            }
        }

        /* renamed from: q */
        static <V extends Enum<V>> C10700c<V> m10655q(InterfaceC7664p<V> interfaceC7664p) {
            return new C10700c<>(interfaceC7664p.name(), interfaceC7664p.getType(), interfaceC7664p.mo9554U(), interfaceC7664p.mo9551e(), ((C10784p) interfaceC7664p).m10235C());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(C10697f0 c10697f0) {
            return m10662a();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(C10697f0 c10697f0) {
            return m10662a();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public V mo9922f(C10697f0 c10697f0) {
            if (this.f27919n == 102 && c10697f0.f27910j == 999999999 && c10697f0.f27911k == 12 && c10697f0.f27912l >= 27) {
                return this.f27916k.cast(EnumC10846x0.FRIDAY);
            }
            return this.f27918m;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public V mo9917l(C10697f0 c10697f0) {
            return this.f27917l;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public V mo9915o(C10697f0 c10697f0) {
            Object m11058d;
            switch (this.f27919n) {
                case 101:
                    m11058d = EnumC10612b0.m11058d(c10697f0.f27911k);
                    break;
                case 102:
                    m11058d = c10697f0.m10720F0();
                    break;
                case 103:
                    m11058d = EnumC10777m0.m10258d(((c10697f0.f27911k - 1) / 3) + 1);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f27915j);
            }
            return this.f27916k.cast(m11058d);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(C10697f0 c10697f0, V v) {
            if (v == null) {
                return false;
            }
            if (this.f27919n == 102 && c10697f0.f27910j == 999999999) {
                try {
                    mo9916n(c10697f0, v, false);
                    return true;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public C10697f0 mo9916n(C10697f0 c10697f0, V v, boolean z) {
            if (v != null) {
                switch (this.f27919n) {
                    case 101:
                        return c10697f0.m10700Y0(((EnumC10612b0) EnumC10612b0.class.cast(v)).m11060b());
                    case 102:
                        return c10697f0.m10703V0((EnumC10846x0) EnumC10846x0.class.cast(v));
                    case 103:
                        return (C10697f0) c10697f0.m20145L(((EnumC10777m0) EnumC10777m0.class.cast(v)).m10260b() - (((c10697f0.f27911k - 1) / 3) + 1), EnumC10686f.f27875n);
                    default:
                        throw new UnsupportedOperationException(this.f27915j);
                }
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* renamed from: net.time4j.f0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10701d implements InterfaceC7632c0<C10697f0> {

        /* renamed from: j */
        private final InterfaceC7664p<?> f27920j;

        /* renamed from: k */
        private final String f27921k;

        /* renamed from: l */
        private final int f27922l;

        C10701d(InterfaceC7664p<Integer> interfaceC7664p) {
            this(((C10792s) interfaceC7664p).m10203C(), interfaceC7664p);
        }

        /* renamed from: a */
        private InterfaceC7664p<?> m10653a() {
            switch (this.f27922l) {
                case 14:
                    return C10697f0.f27887C;
                case 15:
                    return C10697f0.f27888D;
                case 16:
                case 17:
                case 18:
                case 19:
                    return null;
                default:
                    throw new UnsupportedOperationException(this.f27921k);
            }
        }

        /* renamed from: k */
        private static int m10647k(C10697f0 c10697f0) {
            int i = ((c10697f0.f27911k - 1) / 3) + 1;
            if (i == 1) {
                if (C10615b.m11050e(c10697f0.f27910j)) {
                    return 91;
                }
                return 90;
            } else if (i == 2) {
                return 91;
            } else {
                return 92;
            }
        }

        /* renamed from: p */
        private int m10645p(C10697f0 c10697f0) {
            int m11051d = C10615b.m11051d(c10697f0.f27910j, c10697f0.f27911k);
            byte b = c10697f0.f27912l;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if ((i2 * 7) + b <= m11051d) {
                    i = i2;
                } else {
                    return (((b + (i * 7)) - 1) / 7) + 1;
                }
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(C10697f0 c10697f0) {
            return m10653a();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(C10697f0 c10697f0) {
            return m10653a();
        }

        @Override // p162ij.InterfaceC7632c0
        /* renamed from: h */
        public int mo10646m(C10697f0 c10697f0) {
            switch (this.f27922l) {
                case 14:
                    return c10697f0.f27910j;
                case 15:
                    return c10697f0.f27911k;
                case 16:
                    return c10697f0.f27912l;
                case 17:
                    return c10697f0.m10719G0();
                case 18:
                    return c10697f0.m10721E0();
                case 19:
                    return ((c10697f0.f27912l - 1) / 7) + 1;
                default:
                    throw new UnsupportedOperationException(this.f27921k);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9922f(C10697f0 c10697f0) {
            switch (this.f27922l) {
                case 14:
                    return C10697f0.f27899p;
                case 15:
                    return C10697f0.f27901r;
                case 16:
                    return Integer.valueOf(C10615b.m11051d(c10697f0.f27910j, c10697f0.f27911k));
                case 17:
                    if (C10615b.m11050e(c10697f0.f27910j)) {
                        return C10697f0.f27903t;
                    }
                    return C10697f0.f27902s;
                case 18:
                    return Integer.valueOf(m10647k(c10697f0));
                case 19:
                    return Integer.valueOf(m10645p(c10697f0));
                default:
                    throw new UnsupportedOperationException(this.f27921k);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public Integer mo9917l(C10697f0 c10697f0) {
            switch (this.f27922l) {
                case 14:
                    return C10697f0.f27898o;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return C10697f0.f27900q;
                default:
                    throw new UnsupportedOperationException(this.f27921k);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public Integer mo9915o(C10697f0 c10697f0) {
            return Integer.valueOf(mo10646m(c10697f0));
        }

        /* renamed from: s */
        public boolean m10642s(C10697f0 c10697f0, int i) {
            int i2;
            switch (this.f27922l) {
                case 14:
                    if (i < -999999999 || i > 999999999) {
                        return false;
                    }
                    return true;
                case 15:
                    if (i < 1 || i > 12) {
                        return false;
                    }
                    return true;
                case 16:
                    if (i < 1 || i > C10615b.m11051d(c10697f0.f27910j, c10697f0.f27911k)) {
                        return false;
                    }
                    return true;
                case 17:
                    if (i < 1) {
                        return false;
                    }
                    if (C10615b.m11050e(c10697f0.f27910j)) {
                        i2 = 366;
                    } else {
                        i2 = 365;
                    }
                    if (i > i2) {
                        return false;
                    }
                    return true;
                case 18:
                    if (i < 1 || i > m10647k(c10697f0)) {
                        return false;
                    }
                    return true;
                case 19:
                    if (i < 1 || i > m10645p(c10697f0)) {
                        return false;
                    }
                    return true;
                default:
                    throw new UnsupportedOperationException(this.f27921k);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: t */
        public boolean mo9920i(C10697f0 c10697f0, Integer num) {
            return num != null && m10642s(c10697f0, num.intValue());
        }

        @Override // p162ij.InterfaceC7632c0
        /* renamed from: u */
        public C10697f0 mo10650g(C10697f0 c10697f0, int i, boolean z) {
            if (z) {
                return (C10697f0) c10697f0.m20145L(C10616c.m11030l(i, mo10646m(c10697f0)), (InterfaceC10839u) C10697f0.f27895K.m20173K(this.f27920j));
            }
            switch (this.f27922l) {
                case 14:
                    return c10697f0.m10698Z0(i);
                case 15:
                    return c10697f0.m10700Y0(i);
                case 16:
                    return c10697f0.m10704U0(i);
                case 17:
                    return c10697f0.m10702W0(i);
                case 18:
                    if (i >= 1 && i <= m10647k(c10697f0)) {
                        return (C10697f0) c10697f0.m20145L(i - c10697f0.m10721E0(), EnumC10686f.f27878q);
                    }
                    throw new IllegalArgumentException("Out of range: " + i);
                case 19:
                    if (!z && (i < 1 || i > m10645p(c10697f0))) {
                        throw new IllegalArgumentException("Out of range: " + i);
                    }
                    return (C10697f0) c10697f0.m20145L(i - (((c10697f0.f27912l - 1) / 7) + 1), EnumC10686f.f27877p);
                default:
                    throw new UnsupportedOperationException(this.f27921k);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: v */
        public C10697f0 mo9916n(C10697f0 c10697f0, Integer num, boolean z) {
            if (num != null) {
                return mo10650g(c10697f0, num.intValue(), z);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        C10701d(int i, InterfaceC7664p<?> interfaceC7664p) {
            this.f27920j = interfaceC7664p;
            this.f27921k = interfaceC7664p.name();
            this.f27922l = i;
        }
    }

    /* renamed from: net.time4j.f0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10702e implements InterfaceC7669u<C10697f0> {

        /* renamed from: j */
        private static final int f27923j = C10615b.m11046i(C10615b.m11043l(EnumC7627a0.MODIFIED_JULIAN_DATE.m20216i(C10616c.m11040b(System.currentTimeMillis(), 86400000), EnumC7627a0.UNIX))) + 20;

        private C10702e() {
        }

        /* synthetic */ C10702e(C10698a c10698a) {
            this();
        }

        /* renamed from: d */
        private static void m10637d(AbstractC7665q<?> abstractC7665q, String str) {
            EnumC7661n0 enumC7661n0 = EnumC7661n0.ERROR_MESSAGE;
            if (abstractC7665q.mo14421C(enumC7661n0, str)) {
                abstractC7665q.mo14419F(enumC7661n0, str);
            }
        }

        /* renamed from: h */
        private static boolean m10635h(AbstractC7665q<?> abstractC7665q, int i, int i2, int i3) {
            if (i3 >= 1 && (i3 <= 28 || i3 <= C10615b.m11051d(i, i2))) {
                return true;
            }
            m10637d(abstractC7665q, "DAY_OF_MONTH out of range: " + i3);
            return false;
        }

        /* renamed from: k */
        private static boolean m10634k(AbstractC7665q<?> abstractC7665q, boolean z, EnumC10777m0 enumC10777m0, int i) {
            int i2 = C10698a.f27914b[enumC10777m0.ordinal()];
            int i3 = 91;
            if (i2 != 1) {
                if (i2 != 2) {
                    i3 = 92;
                }
            } else if (!z) {
                i3 = 90;
            }
            if (i >= 1 && i <= i3) {
                return true;
            }
            m10637d(abstractC7665q, "DAY_OF_QUARTER out of range: " + i);
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r4 > r1) goto L11;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m10633l(p162ij.AbstractC7665q<?> r2, int r3, int r4) {
            /*
                r0 = 1
                if (r4 < r0) goto L13
                r1 = 365(0x16d, float:5.11E-43)
                if (r4 <= r1) goto L12
                boolean r3 = net.time4j.base.C10615b.m11050e(r3)
                if (r3 == 0) goto Lf
                r1 = 366(0x16e, float:5.13E-43)
            Lf:
                if (r4 <= r1) goto L12
                goto L13
            L12:
                return r0
            L13:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "DAY_OF_YEAR out of range: "
                r3.append(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                m10637d(r2, r3)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10697f0.C10702e.m10633l(ij.q, int, int):boolean");
        }

        /* renamed from: m */
        private static boolean m10632m(AbstractC7665q<?> abstractC7665q, int i) {
            if (i < 1 || i > 12) {
                m10637d(abstractC7665q, "MONTH_OF_YEAR out of range: " + i);
                return false;
            }
            return true;
        }

        /* renamed from: n */
        private static boolean m10631n(AbstractC7665q<?> abstractC7665q, int i) {
            if (i < -999999999 || i > 999999999) {
                m10637d(abstractC7665q, "YEAR out of range: " + i);
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: a */
        public C10697f0 mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
            EnumC10846x0 enumC10846x0;
            int i;
            InterfaceC10773k0<Integer, C10697f0> interfaceC10773k0;
            int mo10218c;
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            if (abstractC7665q.mo10210q(interfaceC7664p)) {
                return (C10697f0) abstractC7665q.mo10212i(interfaceC7664p);
            }
            int mo10218c2 = abstractC7665q.mo10218c(C10697f0.f27908y);
            if (mo10218c2 != Integer.MIN_VALUE) {
                InterfaceC10773k0<Integer, C10697f0> interfaceC10773k02 = C10697f0.f27887C;
                int mo10218c3 = abstractC7665q.mo10218c(interfaceC10773k02);
                if (mo10218c3 == Integer.MIN_VALUE) {
                    InterfaceC10623c0<EnumC10612b0> interfaceC10623c0 = C10697f0.f27886B;
                    if (abstractC7665q.mo10210q(interfaceC10623c0)) {
                        mo10218c3 = ((EnumC10612b0) abstractC7665q.mo10212i(interfaceC10623c0)).m11060b();
                    }
                }
                if (mo10218c3 != Integer.MIN_VALUE && (mo10218c = abstractC7665q.mo10218c((interfaceC10773k0 = C10697f0.f27888D))) != Integer.MIN_VALUE) {
                    if (z) {
                        return (C10697f0) ((C10697f0) C10697f0.m10713M0(mo10218c2, 1, 1).m20120G(interfaceC10773k02.mo9999z(Integer.valueOf(mo10218c3)))).m20120G(interfaceC10773k0.mo9999z(Integer.valueOf(mo10218c)));
                    }
                    if (!m10631n(abstractC7665q, mo10218c2) || !m10632m(abstractC7665q, mo10218c3) || !m10635h(abstractC7665q, mo10218c2, mo10218c3, mo10218c)) {
                        return null;
                    }
                    return C10697f0.m10711N0(mo10218c2, mo10218c3, mo10218c, false);
                }
                InterfaceC10773k0<Integer, C10697f0> interfaceC10773k03 = C10697f0.f27890F;
                int mo10218c4 = abstractC7665q.mo10218c(interfaceC10773k03);
                if (mo10218c4 != Integer.MIN_VALUE) {
                    if (z) {
                        return (C10697f0) C10697f0.m10714L0(mo10218c2, 1).m20120G(interfaceC10773k03.mo9999z(Integer.valueOf(mo10218c4)));
                    }
                    if (!m10631n(abstractC7665q, mo10218c2) || !m10633l(abstractC7665q, mo10218c2, mo10218c4)) {
                        return null;
                    }
                    return C10697f0.m10714L0(mo10218c2, mo10218c4);
                }
                int mo10218c5 = abstractC7665q.mo10218c(C10697f0.f27891G);
                if (mo10218c5 != Integer.MIN_VALUE) {
                    InterfaceC10623c0<EnumC10777m0> interfaceC10623c02 = C10697f0.f27885A;
                    if (abstractC7665q.mo10210q(interfaceC10623c02)) {
                        EnumC10777m0 enumC10777m0 = (EnumC10777m0) abstractC7665q.mo10212i(interfaceC10623c02);
                        boolean m11050e = C10615b.m11050e(mo10218c2);
                        if (m11050e) {
                            i = 91;
                        } else {
                            i = 90;
                        }
                        int i2 = i + mo10218c5;
                        if (enumC10777m0 == EnumC10777m0.Q1) {
                            i2 = mo10218c5;
                        } else if (enumC10777m0 == EnumC10777m0.Q3) {
                            i2 += 91;
                        } else if (enumC10777m0 == EnumC10777m0.Q4) {
                            i2 += 183;
                        }
                        if (z) {
                            return (C10697f0) C10697f0.m10714L0(mo10218c2, 1).m20120G(interfaceC10773k03.mo9999z(Integer.valueOf(i2)));
                        }
                        if (!m10631n(abstractC7665q, mo10218c2) || !m10634k(abstractC7665q, m11050e, enumC10777m0, mo10218c5)) {
                            return null;
                        }
                        return C10697f0.m10714L0(mo10218c2, i2);
                    }
                }
            }
            int mo10218c6 = abstractC7665q.mo10218c(C10697f0.f27909z);
            if (mo10218c6 != Integer.MIN_VALUE) {
                C10852z0 c10852z0 = C10852z0.f28326v;
                if (abstractC7665q.mo10210q(c10852z0.m9965n())) {
                    int intValue = ((Integer) abstractC7665q.mo10212i(c10852z0.m9965n())).intValue();
                    InterfaceC10623c0<EnumC10846x0> interfaceC10623c03 = C10697f0.f27889E;
                    if (abstractC7665q.mo10210q(interfaceC10623c03)) {
                        enumC10846x0 = (EnumC10846x0) abstractC7665q.mo10212i(interfaceC10623c03);
                    } else {
                        if (abstractC7665q.mo10210q(c10852z0.m9970i())) {
                            enumC10846x0 = (EnumC10846x0) abstractC7665q.mo10212i(c10852z0.m9970i());
                        }
                        return null;
                    }
                    if (mo10218c6 >= -999999999 && mo10218c6 <= 999999999) {
                        C10697f0 m10709P0 = C10697f0.m10709P0(mo10218c6, intValue, enumC10846x0, false);
                        if (m10709P0 == null) {
                            m10637d(abstractC7665q, C10697f0.m10696a1(intValue));
                        }
                        return m10709P0;
                    }
                    m10637d(abstractC7665q, C10697f0.m10694b1(mo10218c6));
                    return null;
                }
            }
            EnumC7627a0 enumC7627a0 = EnumC7627a0.MODIFIED_JULIAN_DATE;
            if (abstractC7665q.mo10210q(enumC7627a0)) {
                return (C10697f0) C10697f0.f27894J.mo10629b(EnumC7627a0.UTC.m20216i(((Long) abstractC7665q.mo10212i(enumC7627a0)).longValue(), enumC7627a0));
            }
            if (!(abstractC7665q instanceof InterfaceC10620f)) {
                return null;
            }
            return C10722h0.m10499W().mo10453j(abstractC7665q, interfaceC7633d, z, z2).m10496Z();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: c */
        public AbstractC7638f0 mo10458c() {
            return AbstractC7638f0.f20937a;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: e */
        public InterfaceC7662o mo10459b(C10697f0 c10697f0, InterfaceC7633d interfaceC7633d) {
            return c10697f0;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: f */
        public C7672x<?> mo10456f() {
            return null;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: g */
        public int mo10455g() {
            return f27923j;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: i */
        public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
            return C8972b.m16900r(EnumC8979e.m16890b(interfaceC7675y.mo16891a()), locale);
        }
    }

    /* renamed from: net.time4j.f0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10703f implements InterfaceC7653k<C10697f0> {
        private C10703f() {
        }

        /* synthetic */ C10703f(C10698a c10698a) {
            this();
        }

        @Override // p162ij.InterfaceC7653k
        /* renamed from: a */
        public long mo10630a() {
            return 365241779741L;
        }

        @Override // p162ij.InterfaceC7653k
        /* renamed from: d */
        public long mo10627d() {
            return -365243219892L;
        }

        @Override // p162ij.InterfaceC7653k
        /* renamed from: e */
        public long mo10628c(C10697f0 c10697f0) {
            return EnumC7627a0.UTC.m20216i(C10615b.m11044k(c10697f0), EnumC7627a0.MODIFIED_JULIAN_DATE);
        }

        @Override // p162ij.InterfaceC7653k
        /* renamed from: f */
        public C10697f0 mo10629b(long j) {
            if (j == -365243219892L) {
                return C10697f0.f27896m;
            }
            if (j == 365241779741L) {
                return C10697f0.f27897n;
            }
            long m11043l = C10615b.m11043l(EnumC7627a0.MODIFIED_JULIAN_DATE.m20216i(j, EnumC7627a0.UTC));
            return C10697f0.m10713M0(C10615b.m11046i(m11043l), C10615b.m11047h(m11043l), C10615b.m11048g(m11043l));
        }
    }

    static {
        f27904u = r7;
        f27905v = r8;
        int[] iArr = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int[] iArr2 = {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
        C10721h c10721h = C10721h.f27984j;
        f27906w = c10721h;
        f27907x = c10721h;
        C10792s m10202x = C10792s.m10202x("YEAR", 14, -999999999, 999999999, 'u');
        f27908y = m10202x;
        C10591a1 c10591a1 = C10591a1.f27656p;
        f27909z = c10591a1;
        C10784p c10784p = new C10784p("QUARTER_OF_YEAR", EnumC10777m0.class, EnumC10777m0.Q1, EnumC10777m0.Q4, 103, 'Q');
        f27885A = c10784p;
        C10784p c10784p2 = new C10784p("MONTH_OF_YEAR", EnumC10612b0.class, EnumC10612b0.JANUARY, EnumC10612b0.DECEMBER, 101, 'M');
        f27886B = c10784p2;
        C10792s m10202x2 = C10792s.m10202x("MONTH_AS_NUMBER", 15, 1, 12, 'M');
        f27887C = m10202x2;
        C10792s m10202x3 = C10792s.m10202x("DAY_OF_MONTH", 16, 1, 31, 'd');
        f27888D = m10202x3;
        C10784p c10784p3 = new C10784p("DAY_OF_WEEK", EnumC10846x0.class, EnumC10846x0.MONDAY, EnumC10846x0.SUNDAY, 102, 'E');
        f27889E = c10784p3;
        C10792s m10202x4 = C10792s.m10202x("DAY_OF_YEAR", 17, 1, 365, 'D');
        f27890F = m10202x4;
        C10792s m10202x5 = C10792s.m10202x("DAY_OF_QUARTER", 18, 1, 92, (char) 0);
        f27891G = m10202x5;
        C10850y0 c10850y0 = C10850y0.f28321m;
        f27892H = c10850y0;
        HashMap hashMap = new HashMap();
        m10671y0(hashMap, c10721h);
        m10671y0(hashMap, m10202x);
        m10671y0(hashMap, c10591a1);
        m10671y0(hashMap, c10784p);
        m10671y0(hashMap, c10784p2);
        m10671y0(hashMap, m10202x2);
        m10671y0(hashMap, m10202x3);
        m10671y0(hashMap, c10784p3);
        m10671y0(hashMap, m10202x4);
        m10671y0(hashMap, m10202x5);
        m10671y0(hashMap, c10850y0);
        f27893I = Collections.unmodifiableMap(hashMap);
        C10703f c10703f = new C10703f(null);
        f27894J = c10703f;
        C7644h0.C7646b m20161j = C7644h0.C7646b.m20161j(InterfaceC10839u.class, C10697f0.class, new C10702e(null), c10703f);
        C10699b c10699b = new C10699b(null);
        EnumC10686f enumC10686f = EnumC10686f.f27878q;
        C7644h0.C7646b m20166e = m20161j.m20166e(c10721h, c10699b, enumC10686f).m20166e(m10202x, new C10701d(m10202x), EnumC10686f.f27874m).m20166e(c10591a1, C10591a1.m11100D(C10697f0.class), C10844w0.f28299j).m20166e(c10784p, C10700c.m10655q(c10784p), EnumC10686f.f27875n);
        C10700c m10655q = C10700c.m10655q(c10784p2);
        EnumC10686f enumC10686f2 = EnumC10686f.f27876o;
        C7644h0.C7646b m20166e2 = m20166e.m20166e(c10784p2, m10655q, enumC10686f2).m20166e(m10202x2, new C10701d(m10202x2), enumC10686f2).m20166e(m10202x3, new C10701d(m10202x3), enumC10686f).m20166e(c10784p3, C10700c.m10655q(c10784p3), enumC10686f).m20166e(m10202x4, new C10701d(m10202x4), enumC10686f).m20166e(m10202x5, new C10701d(m10202x5), enumC10686f).m20166e(c10850y0, new C10701d(19, c10850y0), EnumC10686f.f27877p);
        m10705T0(m20166e2);
        m10706S0(m20166e2);
        f27895K = m20166e2.m20163h();
    }

    private C10697f0(int i, int i2, int i3) {
        this.f27910j = i;
        this.f27911k = (byte) i2;
        this.f27912l = (byte) i3;
    }

    /* renamed from: A0 */
    private static void m10725A0(StringBuilder sb2, int i) {
        int i2;
        if (i < 0) {
            sb2.append('-');
            i2 = C10616c.m11032j(i);
        } else {
            i2 = i;
        }
        if (i2 >= 10000) {
            if (i > 0) {
                sb2.append('+');
            }
        } else if (i2 < 1000) {
            sb2.append('0');
            if (i2 < 100) {
                sb2.append('0');
                if (i2 < 10) {
                    sb2.append('0');
                }
            }
        }
        sb2.append(i2);
    }

    /* renamed from: B0 */
    public static C10697f0 m10724B0(InterfaceC10614a interfaceC10614a) {
        if (interfaceC10614a instanceof C10697f0) {
            return (C10697f0) interfaceC10614a;
        }
        return m10713M0(interfaceC10614a.mo10482o(), interfaceC10614a.mo10481p(), interfaceC10614a.mo10480r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r11 == 2) goto L19;
     */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.time4j.C10697f0 m10723C0(net.time4j.C10697f0 r7, long r8, int r10, int r11) {
        /*
            r0 = 5
            r1 = 2
            if (r11 != r0) goto Ld
            byte r0 = r7.f27912l
            int r2 = r7.lengthOfMonth()
            if (r0 != r2) goto Ld
            r11 = r1
        Ld:
            r0 = 12
            long r2 = net.time4j.base.C10616c.m11040b(r8, r0)
            r4 = 1970(0x7b2, double:9.733E-321)
            long r2 = net.time4j.base.C10616c.m11036f(r2, r4)
            int r2 = net.time4j.base.C10616c.m11035g(r2)
            int r0 = net.time4j.base.C10616c.m11038d(r8, r0)
            r3 = 1
            int r0 = r0 + r3
            int r4 = net.time4j.base.C10615b.m11051d(r2, r0)
            if (r10 <= r4) goto L77
            r5 = 1
            switch(r11) {
                case 0: goto L7b;
                case 1: goto L6e;
                case 2: goto L7b;
                case 3: goto L64;
                case 4: goto L45;
                case 5: goto L7b;
                case 6: goto L7b;
                default: goto L2e;
            }
        L2e:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Overflow policy not implemented: "
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 32
            r7.<init>(r8)
            java.lang.String r8 = "Day of month out of range: "
            r7.append(r8)
            m10725A0(r7, r2)
            m10670z0(r7, r0)
            m10670z0(r7, r10)
            ij.r r8 = new ij.r
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L64:
            long r8 = net.time4j.base.C10616c.m11036f(r8, r5)
            int r10 = r10 - r4
            net.time4j.f0 r7 = m10723C0(r7, r8, r10, r11)
            return r7
        L6e:
            long r8 = net.time4j.base.C10616c.m11036f(r8, r5)
            net.time4j.f0 r7 = m10723C0(r7, r8, r3, r11)
            return r7
        L77:
            if (r10 >= r4) goto L7c
            if (r11 != r1) goto L7c
        L7b:
            r10 = r4
        L7c:
            net.time4j.f0 r7 = m10713M0(r2, r0, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10697f0.m10723C0(net.time4j.f0, long, int, int):net.time4j.f0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public int m10721E0() {
        byte b;
        switch (this.f27911k) {
            case 1:
            case 4:
            case 7:
            case 10:
                return this.f27912l;
            case 2:
            case 8:
            case 11:
                return this.f27912l + 31;
            case 3:
                if (C10615b.m11050e(this.f27910j)) {
                    b = 60;
                } else {
                    b = 59;
                }
                return b + this.f27912l;
            case 5:
                return this.f27912l + 30;
            case 6:
            case 12:
                return this.f27912l + 61;
            case 9:
                return this.f27912l + 62;
            default:
                throw new AssertionError("Unknown month: " + ((int) this.f27911k));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public static Object m10715K0(String str) {
        return f27893I.get(str);
    }

    /* renamed from: L0 */
    public static C10697f0 m10714L0(int i, int i2) {
        int[] iArr;
        int i3;
        if (i2 >= 1) {
            if (i2 <= 31) {
                return m10713M0(i, 1, i2);
            }
            if (C10615b.m11050e(i)) {
                iArr = f27905v;
            } else {
                iArr = f27904u;
            }
            if (i2 > iArr[6]) {
                i3 = 7;
            } else {
                i3 = 1;
            }
            while (i3 < 12) {
                if (i2 <= iArr[i3]) {
                    return m10711N0(i, i3 + 1, i2 - iArr[i3 - 1], false);
                }
                i3++;
            }
            throw new IllegalArgumentException("Day of year out of range: " + i2);
        }
        throw new IllegalArgumentException("Day of year out of range: " + i2);
    }

    /* renamed from: M0 */
    public static C10697f0 m10713M0(int i, int i2, int i3) {
        return m10711N0(i, i2, i3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static C10697f0 m10711N0(int i, int i2, int i3, boolean z) {
        if (z) {
            C10615b.m11054a(i, i2, i3);
        }
        return new C10697f0(i, i2, i3);
    }

    /* renamed from: O0 */
    public static C10697f0 m10710O0(int i, int i2, EnumC10846x0 enumC10846x0) {
        return m10709P0(i, i2, enumC10846x0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static C10697f0 m10709P0(int i, int i2, EnumC10846x0 enumC10846x0, boolean z) {
        int i3;
        if (i2 >= 1 && i2 <= 53) {
            if (z && (i < f27898o.intValue() || i > f27899p.intValue())) {
                throw new IllegalArgumentException(m10694b1(i));
            }
            int m9997b = EnumC10846x0.m9993f(C10615b.m11052c(i, 1, 1)).m9997b();
            if (m9997b <= 4) {
                i3 = 2 - m9997b;
            } else {
                i3 = 9 - m9997b;
            }
            int m9997b2 = ((i3 + ((i2 - 1) * 7)) + enumC10846x0.m9997b()) - 1;
            int i4 = 366;
            if (m9997b2 <= 0) {
                i--;
                if (!C10615b.m11050e(i)) {
                    i4 = 365;
                }
                m9997b2 += i4;
            } else {
                if (!C10615b.m11050e(i)) {
                    i4 = 365;
                }
                if (m9997b2 > i4) {
                    m9997b2 -= i4;
                    i++;
                }
            }
            C10697f0 m10714L0 = m10714L0(i, m9997b2);
            if (i2 == 53 && m10714L0.m10716J0() != 53) {
                if (!z) {
                    return null;
                }
                throw new IllegalArgumentException(m10696a1(i2));
            }
            return m10714L0;
        } else if (!z) {
            return null;
        } else {
            throw new IllegalArgumentException(m10696a1(i2));
        }
    }

    /* renamed from: Q0 */
    public static C10697f0 m10708Q0(int i, EnumC10612b0 enumC10612b0, int i2) {
        return m10711N0(i, enumC10612b0.m11060b(), i2, true);
    }

    /* renamed from: R0 */
    public static C10697f0 m10707R0(long j, EnumC7627a0 enumC7627a0) {
        return f27894J.mo10629b(EnumC7627a0.UTC.m20216i(j, enumC7627a0));
    }

    /* renamed from: S0 */
    private static void m10706S0(C7644h0.C7646b<InterfaceC10839u, C10697f0> c7646b) {
        for (InterfaceC7667s interfaceC7667s : AbstractC10617d.m11026c().mo11022g(InterfaceC7667s.class)) {
            if (interfaceC7667s.mo9072d(C10697f0.class)) {
                c7646b.m20165f(interfaceC7667s);
            }
        }
        c7646b.m20165f(new C10842v0());
    }

    /* renamed from: T0 */
    private static void m10705T0(C7644h0.C7646b<InterfaceC10839u, C10697f0> c7646b) {
        EnumC10686f[] values;
        Set<? extends InterfaceC10839u> set;
        Set<? extends InterfaceC10839u> range = EnumSet.range(EnumC10686f.f27871j, EnumC10686f.f27876o);
        Set<? extends InterfaceC10839u> range2 = EnumSet.range(EnumC10686f.f27877p, EnumC10686f.f27878q);
        for (EnumC10686f enumC10686f : EnumC10686f.values()) {
            InterfaceC7659m0<C10697f0> c10696j = new EnumC10686f.C10696j<>(enumC10686f);
            double length = enumC10686f.getLength();
            if (enumC10686f.compareTo(EnumC10686f.f27877p) < 0) {
                set = range;
            } else {
                set = range2;
            }
            c7646b.m20164g(enumC10686f, c10696j, length, set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public C10697f0 m10704U0(int i) {
        if (this.f27912l == i) {
            return this;
        }
        return m10713M0(this.f27910j, this.f27911k, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public C10697f0 m10703V0(EnumC10846x0 enumC10846x0) {
        EnumC10846x0 m10720F0 = m10720F0();
        if (m10720F0 == enumC10846x0) {
            return this;
        }
        return f27894J.mo10629b(C10616c.m11036f(m10718H0(), enumC10846x0.m9997b() - m10720F0.m9997b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public C10697f0 m10702W0(int i) {
        if (m10719G0() == i) {
            return this;
        }
        return m10714L0(this.f27910j, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public C10697f0 m10700Y0(int i) {
        if (this.f27911k == i) {
            return this;
        }
        return m10713M0(this.f27910j, i, Math.min(C10615b.m11051d(this.f27910j, i), (int) this.f27912l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public C10697f0 m10698Z0(int i) {
        if (this.f27910j == i) {
            return this;
        }
        return m10713M0(i, this.f27911k, Math.min(C10615b.m11051d(i, this.f27911k), (int) this.f27912l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static String m10696a1(int i) {
        return "WEEK_OF_YEAR (ISO) out of range: " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static String m10694b1(int i) {
        return "YEAR_OF_WEEKDATE (ISO) out of range: " + i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s0 */
    private static C10697f0 m10677s0(C10697f0 c10697f0, long j) {
        long m11036f = C10616c.m11036f(c10697f0.f27912l, j);
        if (m11036f >= 1 && m11036f <= 28) {
            return m10713M0(c10697f0.f27910j, c10697f0.f27911k, (int) m11036f);
        }
        long m11036f2 = C10616c.m11036f(c10697f0.m10719G0(), j);
        if (m11036f2 >= 1 && m11036f2 <= 365) {
            return m10714L0(c10697f0.f27910j, (int) m11036f2);
        }
        return f27894J.mo10629b(C10616c.m11036f(c10697f0.m10718H0(), j));
    }

    /* renamed from: w0 */
    public static C7644h0<InterfaceC10839u, C10697f0> m10673w0() {
        return f27895K;
    }

    private Object writeReplace() {
        return new SPX(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public static C10697f0 m10672x0(EnumC10686f enumC10686f, C10697f0 c10697f0, long j, int i) {
        switch (C10698a.f27913a[enumC10686f.ordinal()]) {
            case 1:
                return m10672x0(EnumC10686f.f27876o, c10697f0, C10616c.m11033i(j, 12000L), i);
            case 2:
                return m10672x0(EnumC10686f.f27876o, c10697f0, C10616c.m11033i(j, 1200L), i);
            case 3:
                return m10672x0(EnumC10686f.f27876o, c10697f0, C10616c.m11033i(j, 120L), i);
            case 4:
                return m10672x0(EnumC10686f.f27876o, c10697f0, C10616c.m11033i(j, 12L), i);
            case 5:
                return m10672x0(EnumC10686f.f27876o, c10697f0, C10616c.m11033i(j, 3L), i);
            case 6:
                return m10723C0(c10697f0, C10616c.m11036f(c10697f0.m10717I0(), j), c10697f0.f27912l, i);
            case 7:
                return m10672x0(EnumC10686f.f27878q, c10697f0, C10616c.m11033i(j, 7L), i);
            case 8:
                return m10677s0(c10697f0, j);
            default:
                throw new UnsupportedOperationException(enumC10686f.name());
        }
    }

    /* renamed from: y0 */
    private static void m10671y0(Map<String, Object> map, InterfaceC7664p<?> interfaceC7664p) {
        map.put(interfaceC7664p.name(), interfaceC7664p);
    }

    /* renamed from: z0 */
    private static void m10670z0(StringBuilder sb2, int i) {
        sb2.append('-');
        if (i < 10) {
            sb2.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7665q
    /* renamed from: D0 */
    public C10697f0 mo10477w() {
        return this;
    }

    /* renamed from: F0 */
    public EnumC10846x0 m10720F0() {
        return EnumC10846x0.m9993f(C10615b.m11052c(this.f27910j, this.f27911k, this.f27912l));
    }

    /* renamed from: G0 */
    public int m10719G0() {
        byte b = this.f27911k;
        if (b != 1) {
            if (b != 2) {
                return f27904u[b - 2] + this.f27912l + (C10615b.m11050e(this.f27910j) ? 1 : 0);
            }
            return this.f27912l + 31;
        }
        return this.f27912l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public long m10718H0() {
        return f27894J.mo10628c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7654k0, p162ij.AbstractC7665q
    /* renamed from: I */
    public C7644h0<InterfaceC10839u, C10697f0> mo10478v() {
        return f27895K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public long m10717I0() {
        return (((this.f27910j - 1970) * 12) + this.f27911k) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public int m10716J0() {
        return ((Integer) mo10212i(C10852z0.f28326v.m9965n())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7658m
    /* renamed from: N */
    public int mo10712N(InterfaceC7641g interfaceC7641g) {
        if (interfaceC7641g instanceof C10697f0) {
            C10697f0 c10697f0 = (C10697f0) interfaceC7641g;
            int i = this.f27910j - c10697f0.f27910j;
            if (i == 0) {
                int i2 = this.f27911k - c10697f0.f27911k;
                if (i2 == 0) {
                    return this.f27912l - c10697f0.f27912l;
                }
                return i2;
            }
            return i;
        }
        return super.mo10712N(interfaceC7641g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public C10697f0 m10701X0(long j) {
        return f27894J.mo10629b(j);
    }

    @Override // p162ij.AbstractC7658m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10697f0)) {
            return false;
        }
        C10697f0 c10697f0 = (C10697f0) obj;
        if (this.f27912l == c10697f0.f27912l && this.f27911k == c10697f0.f27911k && this.f27910j == c10697f0.f27910j) {
            return true;
        }
        return false;
    }

    @Override // p162ij.AbstractC7658m
    public int hashCode() {
        int i = this.f27910j;
        return (((i << 11) + (this.f27911k << 6)) + this.f27912l) ^ (i & (-2048));
    }

    public int lengthOfMonth() {
        return C10615b.m11051d(this.f27910j, this.f27911k);
    }

    @Override // net.time4j.base.InterfaceC10614a
    /* renamed from: o */
    public int mo10482o() {
        return this.f27910j;
    }

    @Override // net.time4j.base.InterfaceC10614a
    /* renamed from: p */
    public int mo10481p() {
        return this.f27911k;
    }

    @Override // net.time4j.base.InterfaceC10614a
    /* renamed from: r */
    public int mo10480r() {
        return this.f27912l;
    }

    /* renamed from: t0 */
    public C10722h0 m10676t0(C10711g0 c10711g0) {
        return C10722h0.m10489f0(this, c10711g0);
    }

    @Override // net.time4j.base.InterfaceC10614a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        m10725A0(sb2, this.f27910j);
        m10670z0(sb2, this.f27911k);
        m10670z0(sb2, this.f27912l);
        return sb2.toString();
    }

    /* renamed from: u0 */
    public C10722h0 m10675u0() {
        return m10676t0(C10711g0.f27964v);
    }

    /* renamed from: v0 */
    public C10722h0 m10674v0(int i, int i2, int i3) {
        return m10676t0(C10711g0.m10611M0(i, i2, i3));
    }
}
