package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.C10768k;
import net.time4j.base.AbstractC10617d;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import p162ij.AbstractC7638f0;
import p162ij.AbstractC7654k0;
import p162ij.AbstractC7665q;
import p162ij.C7644h0;
import p162ij.C7672x;
import p162ij.EnumC7661n0;
import p162ij.InterfaceC7633d;
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
/* renamed from: net.time4j.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10711g0 extends AbstractC7654k0<InterfaceC10841v, C10711g0> implements InterfaceC10621g, InterfaceC8982h {

    /* renamed from: A */
    public static final InterfaceC10622c<Integer, C10711g0> f27932A;

    /* renamed from: B */
    public static final InterfaceC10622c<Integer, C10711g0> f27933B;

    /* renamed from: C */
    public static final InterfaceC10773k0<Integer, C10711g0> f27934C;

    /* renamed from: D */
    public static final InterfaceC10773k0<Integer, C10711g0> f27935D;

    /* renamed from: E */
    public static final InterfaceC10773k0<Integer, C10711g0> f27936E;

    /* renamed from: F */
    public static final InterfaceC10773k0<Integer, C10711g0> f27937F;

    /* renamed from: G */
    public static final InterfaceC10773k0<Integer, C10711g0> f27938G;

    /* renamed from: H */
    public static final InterfaceC10773k0<Integer, C10711g0> f27939H;

    /* renamed from: I */
    public static final InterfaceC10773k0<Integer, C10711g0> f27940I;

    /* renamed from: J */
    public static final InterfaceC10773k0<Integer, C10711g0> f27941J;

    /* renamed from: K */
    public static final InterfaceC10773k0<Integer, C10711g0> f27942K;

    /* renamed from: L */
    public static final InterfaceC10773k0<Integer, C10711g0> f27943L;

    /* renamed from: M */
    public static final InterfaceC10773k0<Integer, C10711g0> f27944M;

    /* renamed from: N */
    public static final InterfaceC10773k0<Long, C10711g0> f27945N;

    /* renamed from: O */
    public static final InterfaceC10773k0<Long, C10711g0> f27946O;

    /* renamed from: P */
    public static final InterfaceC10624c1<BigDecimal> f27947P;

    /* renamed from: Q */
    public static final InterfaceC10624c1<BigDecimal> f27948Q;

    /* renamed from: R */
    public static final InterfaceC10624c1<BigDecimal> f27949R;

    /* renamed from: S */
    public static final InterfaceC7664p<EnumC10704g> f27950S;

    /* renamed from: T */
    private static final Map<String, Object> f27951T;

    /* renamed from: U */
    private static final InterfaceC7676z<C10711g0, BigDecimal> f27952U;

    /* renamed from: V */
    private static final InterfaceC7676z<C10711g0, BigDecimal> f27953V;

    /* renamed from: W */
    private static final InterfaceC7676z<C10711g0, BigDecimal> f27954W;

    /* renamed from: X */
    private static final C7644h0<InterfaceC10841v, C10711g0> f27955X;

    /* renamed from: n */
    static final char f27956n;

    /* renamed from: o */
    private static final BigDecimal f27957o;

    /* renamed from: p */
    private static final BigDecimal f27958p;

    /* renamed from: q */
    private static final BigDecimal f27959q;

    /* renamed from: r */
    private static final BigDecimal f27960r;

    /* renamed from: s */
    private static final BigDecimal f27961s;
    private static final long serialVersionUID = 2780881537313863339L;

    /* renamed from: t */
    private static final BigDecimal f27962t;

    /* renamed from: u */
    private static final C10711g0[] f27963u;

    /* renamed from: v */
    static final C10711g0 f27964v;

    /* renamed from: w */
    static final C10711g0 f27965w;

    /* renamed from: x */
    static final InterfaceC7664p<C10711g0> f27966x;

    /* renamed from: y */
    public static final InterfaceC10840u0 f27967y;

    /* renamed from: z */
    public static final InterfaceC10624c1<EnumC10851z> f27968z;

    /* renamed from: j */
    private final transient byte f27969j;

    /* renamed from: k */
    private final transient byte f27970k;

    /* renamed from: l */
    private final transient byte f27971l;

    /* renamed from: m */
    private final transient int f27972m;

    /* renamed from: net.time4j.g0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10712a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27973a;

        static {
            int[] iArr = new int[EnumC10704g.values().length];
            f27973a = iArr;
            try {
                iArr[EnumC10704g.f27924j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27973a[EnumC10704g.f27925k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27973a[EnumC10704g.f27926l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27973a[EnumC10704g.f27927m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27973a[EnumC10704g.f27928n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27973a[EnumC10704g.f27929o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: net.time4j.g0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10713b implements InterfaceC7676z<C10711g0, BigDecimal> {

        /* renamed from: j */
        private final InterfaceC7664p<BigDecimal> f27974j;

        /* renamed from: k */
        private final BigDecimal f27975k;

        C10713b(InterfaceC7664p<BigDecimal> interfaceC7664p, BigDecimal bigDecimal) {
            this.f27974j = interfaceC7664p;
            this.f27975k = bigDecimal;
        }

        /* renamed from: a */
        private static BigDecimal m10567a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
        }

        /* renamed from: q */
        private static int m10560q(BigDecimal bigDecimal) {
            return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public BigDecimal mo9922f(C10711g0 c10711g0) {
            InterfaceC7664p<BigDecimal> interfaceC7664p;
            if (c10711g0.f27969j == 24 && ((interfaceC7664p = this.f27974j) == C10711g0.f27948Q || interfaceC7664p == C10711g0.f27949R)) {
                return BigDecimal.ZERO;
            }
            return this.f27975k;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public BigDecimal mo9917l(C10711g0 c10711g0) {
            return BigDecimal.ZERO;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public BigDecimal mo9915o(C10711g0 c10711g0) {
            BigDecimal add;
            InterfaceC7664p<BigDecimal> interfaceC7664p = this.f27974j;
            if (interfaceC7664p == C10711g0.f27947P) {
                if (c10711g0.equals(C10711g0.f27964v)) {
                    return BigDecimal.ZERO;
                }
                if (c10711g0.f27969j == 24) {
                    return C10711g0.f27960r;
                }
                add = BigDecimal.valueOf(c10711g0.f27969j).add(m10567a(BigDecimal.valueOf(c10711g0.f27970k), C10711g0.f27957o)).add(m10567a(BigDecimal.valueOf(c10711g0.f27971l), C10711g0.f27958p)).add(m10567a(BigDecimal.valueOf(c10711g0.f27972m), C10711g0.f27958p.multiply(C10711g0.f27959q)));
            } else if (interfaceC7664p == C10711g0.f27948Q) {
                if (c10711g0.m10620D0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(c10711g0.f27970k).add(m10567a(BigDecimal.valueOf(c10711g0.f27971l), C10711g0.f27957o)).add(m10567a(BigDecimal.valueOf(c10711g0.f27972m), C10711g0.f27957o.multiply(C10711g0.f27959q)));
            } else if (interfaceC7664p == C10711g0.f27949R) {
                if (c10711g0.m10619E0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(c10711g0.f27971l).add(m10567a(BigDecimal.valueOf(c10711g0.f27972m), C10711g0.f27959q));
            } else {
                throw new UnsupportedOperationException(this.f27974j.name());
            }
            return add.setScale(15, RoundingMode.FLOOR).stripTrailingZeros();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(C10711g0 c10711g0, BigDecimal bigDecimal) {
            InterfaceC7664p<BigDecimal> interfaceC7664p;
            if (bigDecimal == null) {
                return false;
            }
            if (c10711g0.f27969j == 24 && ((interfaceC7664p = this.f27974j) == C10711g0.f27948Q || interfaceC7664p == C10711g0.f27949R)) {
                if (BigDecimal.ZERO.compareTo(bigDecimal) != 0) {
                    return false;
                }
                return true;
            } else if (BigDecimal.ZERO.compareTo(bigDecimal) > 0 || this.f27975k.compareTo(bigDecimal) < 0) {
                return false;
            } else {
                return true;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        public C10711g0 mo9916n(C10711g0 c10711g0, BigDecimal bigDecimal, boolean z) {
            int i;
            int i2;
            long j;
            int i3;
            int i4;
            int i5;
            if (bigDecimal != null) {
                InterfaceC7664p<BigDecimal> interfaceC7664p = this.f27974j;
                if (interfaceC7664p == C10711g0.f27947P) {
                    BigDecimal scale = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply = bigDecimal.subtract(scale).multiply(C10711g0.f27957o);
                    BigDecimal scale2 = multiply.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply2 = multiply.subtract(scale2).multiply(C10711g0.f27957o);
                    BigDecimal scale3 = multiply2.setScale(0, RoundingMode.FLOOR);
                    j = scale.longValueExact();
                    i = scale2.intValue();
                    i3 = scale3.intValue();
                    i4 = m10560q(multiply2.subtract(scale3));
                } else if (interfaceC7664p == C10711g0.f27948Q) {
                    BigDecimal scale4 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    BigDecimal multiply3 = bigDecimal.subtract(scale4).multiply(C10711g0.f27957o);
                    BigDecimal scale5 = multiply3.setScale(0, RoundingMode.FLOOR);
                    int intValue = scale5.intValue();
                    int m10560q = m10560q(multiply3.subtract(scale5));
                    long longValueExact = scale4.longValueExact();
                    long j2 = c10711g0.f27969j;
                    if (z) {
                        j2 += C10616c.m11040b(longValueExact, 60);
                        i = C10616c.m11038d(longValueExact, 60);
                    } else {
                        C10711g0.m10579o0(longValueExact);
                        i = (int) longValueExact;
                    }
                    i4 = m10560q;
                    i3 = intValue;
                    j = j2;
                } else if (interfaceC7664p == C10711g0.f27949R) {
                    BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                    int m10560q2 = m10560q(bigDecimal.subtract(scale6));
                    long longValueExact2 = scale6.longValueExact();
                    long j3 = c10711g0.f27969j;
                    i = c10711g0.f27970k;
                    if (z) {
                        i2 = C10616c.m11038d(longValueExact2, 60);
                        long m11040b = i + C10616c.m11040b(longValueExact2, 60);
                        j3 += C10616c.m11040b(m11040b, 60);
                        i = C10616c.m11038d(m11040b, 60);
                    } else {
                        C10711g0.m10577q0(longValueExact2);
                        i2 = (int) longValueExact2;
                    }
                    j = j3;
                    i3 = i2;
                    i4 = m10560q2;
                } else {
                    throw new UnsupportedOperationException(this.f27974j.name());
                }
                if (z) {
                    i5 = C10616c.m11038d(j, 24);
                    if (j > 0 && (i5 | i | i3 | i4) == 0) {
                        return C10711g0.f27965w;
                    }
                } else if (j >= 0 && j <= 24) {
                    i5 = (int) j;
                } else {
                    throw new IllegalArgumentException("Value out of range: " + bigDecimal);
                }
                return C10711g0.m10609N0(i5, i, i3, i4);
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* renamed from: net.time4j.g0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10714c implements InterfaceC7659m0<C10711g0> {

        /* renamed from: a */
        private final EnumC10704g f27976a;

        /* synthetic */ C10714c(EnumC10704g enumC10704g, C10712a c10712a) {
            this(enumC10704g);
        }

        /* renamed from: e */
        public static C10766j m10556e(C10711g0 c10711g0, long j, EnumC10704g enumC10704g) {
            if (j == 0 && c10711g0.f27969j < 24) {
                return new C10766j(0L, c10711g0);
            }
            return (C10766j) m10554g(C10766j.class, enumC10704g, c10711g0, j);
        }

        /* renamed from: g */
        private static <R> R m10554g(Class<R> cls, EnumC10704g enumC10704g, C10711g0 c10711g0, long j) {
            long m11036f;
            C10711g0 m10609N0;
            int i = c10711g0.f27970k;
            int i2 = c10711g0.f27971l;
            int i3 = c10711g0.f27972m;
            switch (C10712a.f27973a[enumC10704g.ordinal()]) {
                case 1:
                    m11036f = C10616c.m11036f(c10711g0.f27969j, j);
                    break;
                case 2:
                    long m11036f2 = C10616c.m11036f(c10711g0.f27970k, j);
                    m11036f = C10616c.m11036f(c10711g0.f27969j, C10616c.m11040b(m11036f2, 60));
                    i = C10616c.m11038d(m11036f2, 60);
                    break;
                case 3:
                    long m11036f3 = C10616c.m11036f(c10711g0.f27971l, j);
                    long m11036f4 = C10616c.m11036f(c10711g0.f27970k, C10616c.m11040b(m11036f3, 60));
                    m11036f = C10616c.m11036f(c10711g0.f27969j, C10616c.m11040b(m11036f4, 60));
                    int m11038d = C10616c.m11038d(m11036f4, 60);
                    i2 = C10616c.m11038d(m11036f3, 60);
                    i = m11038d;
                    break;
                case 4:
                    return (R) m10554g(cls, EnumC10704g.f27929o, c10711g0, C10616c.m11033i(j, 1000000L));
                case 5:
                    return (R) m10554g(cls, EnumC10704g.f27929o, c10711g0, C10616c.m11033i(j, 1000L));
                case 6:
                    long m11036f5 = C10616c.m11036f(c10711g0.f27972m, j);
                    long m11036f6 = C10616c.m11036f(c10711g0.f27971l, C10616c.m11040b(m11036f5, 1000000000));
                    long m11036f7 = C10616c.m11036f(c10711g0.f27970k, C10616c.m11040b(m11036f6, 60));
                    m11036f = C10616c.m11036f(c10711g0.f27969j, C10616c.m11040b(m11036f7, 60));
                    int m11038d2 = C10616c.m11038d(m11036f7, 60);
                    int m11038d3 = C10616c.m11038d(m11036f6, 60);
                    int m11038d4 = C10616c.m11038d(m11036f5, 1000000000);
                    i = m11038d2;
                    i2 = m11038d3;
                    i3 = m11038d4;
                    break;
                default:
                    throw new UnsupportedOperationException(enumC10704g.name());
            }
            int m11038d5 = C10616c.m11038d(m11036f, 24);
            if ((m11038d5 | i | i2 | i3) == 0) {
                if (j > 0 && cls == C10711g0.class) {
                    m10609N0 = C10711g0.f27965w;
                } else {
                    m10609N0 = C10711g0.f27964v;
                }
            } else {
                m10609N0 = C10711g0.m10609N0(m11038d5, i, i2, i3);
            }
            if (cls == C10711g0.class) {
                return cls.cast(m10609N0);
            }
            return cls.cast(new C10766j(C10616c.m11040b(m11036f, 24), m10609N0));
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: d */
        public C10711g0 mo10475b(C10711g0 c10711g0, long j) {
            return j == 0 ? c10711g0 : (C10711g0) m10554g(C10711g0.class, this.f27976a, c10711g0, j);
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: f */
        public long mo10476a(C10711g0 c10711g0, C10711g0 c10711g02) {
            long j;
            long m10568z0 = c10711g02.m10568z0() - c10711g0.m10568z0();
            switch (C10712a.f27973a[this.f27976a.ordinal()]) {
                case 1:
                    j = 3600000000000L;
                    break;
                case 2:
                    j = 60000000000L;
                    break;
                case 3:
                    j = 1000000000;
                    break;
                case 4:
                    j = 1000000;
                    break;
                case 5:
                    j = 1000;
                    break;
                case 6:
                    j = 1;
                    break;
                default:
                    throw new UnsupportedOperationException(this.f27976a.name());
            }
            return m10568z0 / j;
        }

        private C10714c(EnumC10704g enumC10704g) {
            this.f27976a = enumC10704g;
        }
    }

    /* renamed from: net.time4j.g0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10715d implements InterfaceC7676z<C10711g0, Integer> {

        /* renamed from: j */
        private final InterfaceC7664p<Integer> f27977j;

        /* renamed from: k */
        private final int f27978k;

        /* renamed from: l */
        private final int f27979l;

        /* renamed from: m */
        private final int f27980m;

        C10715d(InterfaceC7664p<Integer> interfaceC7664p, int i, int i2) {
            this.f27977j = interfaceC7664p;
            if (interfaceC7664p instanceof C10796t) {
                this.f27978k = ((C10796t) interfaceC7664p).m10185D();
            } else {
                this.f27978k = -1;
            }
            this.f27979l = i;
            this.f27980m = i2;
        }

        /* renamed from: a */
        private InterfaceC7664p<?> m10553a(C10711g0 c10711g0) {
            switch (this.f27978k) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return C10711g0.f27937F;
                case 6:
                case 7:
                    return C10711g0.f27939H;
                case 8:
                case 9:
                    return C10711g0.f27943L;
                default:
                    return null;
            }
        }

        /* renamed from: p */
        private static boolean m10547p(C10711g0 c10711g0) {
            return c10711g0.f27969j < 12 || c10711g0.f27969j == 24;
        }

        /* renamed from: s */
        private C10711g0 m10544s(C10711g0 c10711g0, int i) {
            InterfaceC7664p<Integer> interfaceC7664p = this.f27977j;
            if (interfaceC7664p != C10711g0.f27936E && interfaceC7664p != C10711g0.f27935D && interfaceC7664p != C10711g0.f27934C) {
                if (interfaceC7664p == C10711g0.f27937F) {
                    return c10711g0.m20145L(C10616c.m11030l(i, c10711g0.f27970k), EnumC10704g.f27925k);
                }
                if (interfaceC7664p == C10711g0.f27939H) {
                    return c10711g0.m20145L(C10616c.m11030l(i, c10711g0.f27971l), EnumC10704g.f27926l);
                }
                InterfaceC10773k0<Integer, C10711g0> interfaceC10773k0 = C10711g0.f27941J;
                if (interfaceC7664p == interfaceC10773k0) {
                    return c10711g0.m20145L(C10616c.m11030l(i, ((Integer) c10711g0.mo10212i(interfaceC10773k0)).intValue()), EnumC10704g.f27927m);
                }
                InterfaceC10773k0<Integer, C10711g0> interfaceC10773k02 = C10711g0.f27942K;
                if (interfaceC7664p == interfaceC10773k02) {
                    return c10711g0.m20145L(C10616c.m11030l(i, ((Integer) c10711g0.mo10212i(interfaceC10773k02)).intValue()), EnumC10704g.f27928n);
                }
                if (interfaceC7664p == C10711g0.f27943L) {
                    return c10711g0.m20145L(C10616c.m11030l(i, c10711g0.f27972m), EnumC10704g.f27929o);
                }
                if (interfaceC7664p == C10711g0.f27944M) {
                    int m11039c = C10616c.m11039c(i, 86400000);
                    int i2 = c10711g0.f27972m % 1000000;
                    if (m11039c == 0 && i2 == 0) {
                        if (i > 0) {
                            return C10711g0.f27965w;
                        }
                        return C10711g0.f27964v;
                    }
                    return C10711g0.m10574t0(m11039c, i2);
                } else if (interfaceC7664p == C10711g0.f27938G) {
                    int m11039c2 = C10616c.m11039c(i, 1440);
                    if (m11039c2 == 0 && c10711g0.m10619E0()) {
                        if (i > 0) {
                            return C10711g0.f27965w;
                        }
                        return C10711g0.f27964v;
                    }
                    return mo9916n(c10711g0, Integer.valueOf(m11039c2), false);
                } else if (interfaceC7664p == C10711g0.f27940I) {
                    int m11039c3 = C10616c.m11039c(i, 86400);
                    if (m11039c3 == 0 && c10711g0.f27972m == 0) {
                        if (i > 0) {
                            return C10711g0.f27965w;
                        }
                        return C10711g0.f27964v;
                    }
                    return mo9916n(c10711g0, Integer.valueOf(m11039c3), false);
                } else {
                    throw new UnsupportedOperationException(this.f27977j.name());
                }
            }
            return c10711g0.m20145L(C10616c.m11030l(i, ((Integer) c10711g0.mo10212i(interfaceC7664p)).intValue()), EnumC10704g.f27924j);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(C10711g0 c10711g0) {
            return m10553a(c10711g0);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(C10711g0 c10711g0) {
            return m10553a(c10711g0);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Integer mo9922f(C10711g0 c10711g0) {
            if (c10711g0.f27969j == 24) {
                switch (this.f27978k) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return 0;
                }
            }
            if (c10711g0.m10623A0(this.f27977j)) {
                return Integer.valueOf(this.f27980m - 1);
            }
            return Integer.valueOf(this.f27980m);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9917l(C10711g0 c10711g0) {
            return Integer.valueOf(this.f27979l);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9915o(C10711g0 c10711g0) {
            int i;
            byte b;
            int i2 = 24;
            switch (this.f27978k) {
                case 1:
                    i2 = c10711g0.f27969j % 12;
                    if (i2 == 0) {
                        i2 = 12;
                        break;
                    }
                    break;
                case 2:
                    int i3 = c10711g0.f27969j % 24;
                    if (i3 != 0) {
                        i2 = i3;
                        break;
                    }
                    break;
                case 3:
                    i2 = c10711g0.f27969j % 12;
                    break;
                case 4:
                    i2 = c10711g0.f27969j % 24;
                    break;
                case 5:
                    i2 = c10711g0.f27969j;
                    break;
                case 6:
                    i2 = c10711g0.f27970k;
                    break;
                case 7:
                    i = c10711g0.f27969j * 60;
                    b = c10711g0.f27970k;
                    i2 = i + b;
                    break;
                case 8:
                    i2 = c10711g0.f27971l;
                    break;
                case 9:
                    i = (c10711g0.f27969j * 3600) + (c10711g0.f27970k * 60);
                    b = c10711g0.f27971l;
                    i2 = i + b;
                    break;
                case 10:
                    i2 = c10711g0.f27972m / 1000000;
                    break;
                case 11:
                    i2 = c10711g0.f27972m / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    break;
                case 12:
                    i2 = c10711g0.f27972m;
                    break;
                case 13:
                    i2 = (int) (c10711g0.m10568z0() / 1000000);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f27977j.name());
            }
            return Integer.valueOf(i2);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public boolean mo9920i(C10711g0 c10711g0, Integer num) {
            int intValue;
            int i;
            if (num == null || (intValue = num.intValue()) < this.f27979l || intValue > (i = this.f27980m)) {
                return false;
            }
            if (intValue == i) {
                int i2 = this.f27978k;
                if (i2 != 5) {
                    if (i2 != 7) {
                        if (i2 != 9) {
                            if (i2 == 13) {
                                if (c10711g0.f27972m % 1000000 != 0) {
                                    return false;
                                }
                                return true;
                            }
                        } else if (c10711g0.f27972m != 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        return c10711g0.m10619E0();
                    }
                } else {
                    return c10711g0.m10620D0();
                }
            }
            if (c10711g0.f27969j == 24) {
                switch (this.f27978k) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        if (intValue != 0) {
                            return false;
                        }
                        return true;
                }
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0072, code lost:
            if (m10547p(r7) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
            r8 = r8 + 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0087, code lost:
            if (m10547p(r7) != false) goto L24;
         */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public net.time4j.C10711g0 mo9916n(net.time4j.C10711g0 r7, java.lang.Integer r8, boolean r9) {
            /*
                r6 = this;
                if (r8 == 0) goto La6
                if (r9 == 0) goto Ld
                int r8 = r8.intValue()
                net.time4j.g0 r7 = r6.m10544s(r7, r8)
                return r7
            Ld:
                boolean r9 = r6.mo9920i(r7, r8)
                if (r9 == 0) goto L8f
                byte r9 = net.time4j.C10711g0.m10585i0(r7)
                byte r0 = net.time4j.C10711g0.m10584j0(r7)
                byte r1 = net.time4j.C10711g0.m10583k0(r7)
                int r2 = net.time4j.C10711g0.m10610N(r7)
                int r8 = r8.intValue()
                int r3 = r6.f27978k
                r4 = 0
                r5 = 1000000(0xf4240, float:1.401298E-39)
                switch(r3) {
                    case 1: goto L7e;
                    case 2: goto L78;
                    case 3: goto L6e;
                    case 4: goto L6c;
                    case 5: goto L6c;
                    case 6: goto L6a;
                    case 7: goto L65;
                    case 8: goto L63;
                    case 9: goto L5a;
                    case 10: goto L51;
                    case 11: goto L48;
                    case 12: goto L46;
                    case 13: goto L3c;
                    default: goto L30;
                }
            L30:
                java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                ij.p<java.lang.Integer> r8 = r6.f27977j
                java.lang.String r8 = r8.name()
                r7.<init>(r8)
                throw r7
            L3c:
                int r7 = net.time4j.C10711g0.m10610N(r7)
                int r7 = r7 % r5
                net.time4j.g0 r7 = net.time4j.C10711g0.m10606Q(r8, r7)
                return r7
            L46:
                r2 = r8
                goto L8a
            L48:
                int r8 = r8 * 1000
                int r7 = net.time4j.C10711g0.m10610N(r7)
                int r7 = r7 % 1000
                goto L57
            L51:
                int r8 = r8 * r5
                int r7 = net.time4j.C10711g0.m10610N(r7)
                int r7 = r7 % r5
            L57:
                int r2 = r8 + r7
                goto L8a
            L5a:
                int r9 = r8 / 3600
                int r8 = r8 % 3600
                int r0 = r8 / 60
                int r1 = r8 % 60
                goto L8a
            L63:
                r1 = r8
                goto L8a
            L65:
                int r9 = r8 / 60
                int r0 = r8 % 60
                goto L8a
            L6a:
                r0 = r8
                goto L8a
            L6c:
                r9 = r8
                goto L8a
            L6e:
                boolean r7 = m10547p(r7)
                if (r7 == 0) goto L75
                goto L6c
            L75:
                int r8 = r8 + 12
                goto L6c
            L78:
                r7 = 24
                if (r8 != r7) goto L6c
                r9 = r4
                goto L8a
            L7e:
                r9 = 12
                if (r8 != r9) goto L83
                r8 = r4
            L83:
                boolean r7 = m10547p(r7)
                if (r7 == 0) goto L75
                goto L6c
            L8a:
                net.time4j.g0 r7 = net.time4j.C10711g0.m10609N0(r9, r0, r1, r2)
                return r7
            L8f:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Value out of range: "
                r9.append(r0)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r7.<init>(r8)
                throw r7
            La6:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "Missing element value."
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10711g0.C10715d.mo9916n(net.time4j.g0, java.lang.Integer, boolean):net.time4j.g0");
        }
    }

    /* renamed from: net.time4j.g0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10716e implements InterfaceC7676z<C10711g0, Long> {

        /* renamed from: j */
        private final InterfaceC7664p<Long> f27981j;

        /* renamed from: k */
        private final long f27982k;

        /* renamed from: l */
        private final long f27983l;

        C10716e(InterfaceC7664p<Long> interfaceC7664p, long j, long j2) {
            this.f27981j = interfaceC7664p;
            this.f27982k = j;
            this.f27983l = j2;
        }

        /* renamed from: q */
        private C10711g0 m10536q(C10711g0 c10711g0, long j) {
            if (this.f27981j == C10711g0.f27945N) {
                long m10570x0 = C10711g0.m10570x0(j, 86400000000L);
                int i = c10711g0.f27972m % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                if (m10570x0 == 0 && i == 0 && j > 0) {
                    return C10711g0.f27965w;
                }
                return C10711g0.m10575s0(m10570x0, i);
            }
            long m10570x02 = C10711g0.m10570x0(j, 86400000000000L);
            if (m10570x02 == 0 && j > 0) {
                return C10711g0.f27965w;
            }
            return C10711g0.m10573u0(m10570x02);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public Long mo9922f(C10711g0 c10711g0) {
            if (this.f27981j == C10711g0.f27945N && c10711g0.f27972m % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA != 0) {
                return Long.valueOf(this.f27983l - 1);
            }
            return Long.valueOf(this.f27983l);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Long mo9917l(C10711g0 c10711g0) {
            return Long.valueOf(this.f27982k);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Long mo9915o(C10711g0 c10711g0) {
            long m10568z0;
            if (this.f27981j == C10711g0.f27945N) {
                m10568z0 = c10711g0.m10568z0() / 1000;
            } else {
                m10568z0 = c10711g0.m10568z0();
            }
            return Long.valueOf(m10568z0);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C10711g0 c10711g0, Long l) {
            if (l == null) {
                return false;
            }
            if (this.f27981j == C10711g0.f27945N && l.longValue() == this.f27983l) {
                if (c10711g0.f27972m % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA != 0) {
                    return false;
                }
                return true;
            } else if (this.f27982k > l.longValue() || l.longValue() > this.f27983l) {
                return false;
            } else {
                return true;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C10711g0 mo9916n(C10711g0 c10711g0, Long l, boolean z) {
            if (l != null) {
                if (z) {
                    return m10536q(c10711g0, l.longValue());
                }
                if (mo9920i(c10711g0, l)) {
                    long longValue = l.longValue();
                    if (this.f27981j == C10711g0.f27945N) {
                        return C10711g0.m10575s0(longValue, c10711g0.f27972m % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                    }
                    return C10711g0.m10573u0(longValue);
                }
                throw new IllegalArgumentException("Value out of range: " + l);
            }
            throw new IllegalArgumentException("Missing element value.");
        }
    }

    /* renamed from: net.time4j.g0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10717f implements InterfaceC7669u<C10711g0> {
        private C10717f() {
        }

        /* synthetic */ C10717f(C10712a c10712a) {
            this();
        }

        /* renamed from: d */
        private static void m10534d(AbstractC7665q<?> abstractC7665q, String str) {
            EnumC7661n0 enumC7661n0 = EnumC7661n0.ERROR_MESSAGE;
            if (abstractC7665q.mo14421C(enumC7661n0, str)) {
                abstractC7665q.mo14419F(enumC7661n0, str);
            }
        }

        /* renamed from: h */
        private static int m10532h(AbstractC7665q<?> abstractC7665q) {
            int mo10218c = abstractC7665q.mo10218c(C10711g0.f27935D);
            if (mo10218c != Integer.MIN_VALUE) {
                return mo10218c;
            }
            int mo10218c2 = abstractC7665q.mo10218c(C10711g0.f27933B);
            if (mo10218c2 == 0) {
                return -1;
            }
            int i = 0;
            if (mo10218c2 == 24) {
                return 0;
            }
            if (mo10218c2 != Integer.MIN_VALUE) {
                return mo10218c2;
            }
            InterfaceC10624c1<EnumC10851z> interfaceC10624c1 = C10711g0.f27968z;
            if (abstractC7665q.mo10210q(interfaceC10624c1)) {
                EnumC10851z enumC10851z = (EnumC10851z) abstractC7665q.mo10212i(interfaceC10624c1);
                int mo10218c3 = abstractC7665q.mo10218c(C10711g0.f27932A);
                if (mo10218c3 != Integer.MIN_VALUE) {
                    if (mo10218c3 == 0) {
                        if (enumC10851z == EnumC10851z.AM) {
                            return -1;
                        }
                        return -2;
                    }
                    if (mo10218c3 != 12) {
                        i = mo10218c3;
                    }
                    if (enumC10851z != EnumC10851z.AM) {
                        return i + 12;
                    }
                    return i;
                }
                int mo10218c4 = abstractC7665q.mo10218c(C10711g0.f27934C);
                if (mo10218c4 != Integer.MIN_VALUE) {
                    if (enumC10851z != EnumC10851z.AM) {
                        return mo10218c4 + 12;
                    }
                    return mo10218c4;
                }
            }
            return Integer.MIN_VALUE;
        }

        /* renamed from: k */
        private static C10711g0 m10531k(AbstractC7665q<?> abstractC7665q) {
            int i;
            int i2;
            int i3;
            InterfaceC10773k0<Long, C10711g0> interfaceC10773k0 = C10711g0.f27946O;
            if (abstractC7665q.mo10210q(interfaceC10773k0)) {
                long longValue = ((Long) abstractC7665q.mo10212i(interfaceC10773k0)).longValue();
                if (longValue >= 0 && longValue <= 86400000000000L) {
                    return C10711g0.m10573u0(longValue);
                }
                m10534d(abstractC7665q, "NANO_OF_DAY out of range: " + longValue);
                return null;
            }
            InterfaceC10773k0<Long, C10711g0> interfaceC10773k02 = C10711g0.f27945N;
            int i4 = 0;
            if (abstractC7665q.mo10210q(interfaceC10773k02)) {
                InterfaceC10773k0<Integer, C10711g0> interfaceC10773k03 = C10711g0.f27943L;
                if (abstractC7665q.mo10210q(interfaceC10773k03)) {
                    i4 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k03)).intValue() % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                }
                return C10711g0.m10575s0(((Long) abstractC7665q.mo10212i(interfaceC10773k02)).longValue(), i4);
            }
            InterfaceC10773k0<Integer, C10711g0> interfaceC10773k04 = C10711g0.f27944M;
            if (abstractC7665q.mo10210q(interfaceC10773k04)) {
                InterfaceC10773k0<Integer, C10711g0> interfaceC10773k05 = C10711g0.f27943L;
                if (abstractC7665q.mo10210q(interfaceC10773k05)) {
                    int intValue = ((Integer) abstractC7665q.mo10212i(interfaceC10773k05)).intValue();
                    if (intValue >= 0 && intValue < 1000000000) {
                        i4 = intValue % 1000000;
                    } else {
                        m10534d(abstractC7665q, "NANO_OF_SECOND out of range: " + intValue);
                        return null;
                    }
                } else {
                    InterfaceC10773k0<Integer, C10711g0> interfaceC10773k06 = C10711g0.f27942K;
                    if (abstractC7665q.mo10210q(interfaceC10773k06)) {
                        int intValue2 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k06)).intValue();
                        if (intValue2 >= 0 && intValue2 < 1000000) {
                            i4 = intValue2 % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                        } else {
                            m10534d(abstractC7665q, "MICRO_OF_SECOND out of range: " + intValue2);
                            return null;
                        }
                    }
                }
                int intValue3 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k04)).intValue();
                if (intValue3 >= 0 && intValue3 <= 86400000) {
                    return C10711g0.m10574t0(intValue3, i4);
                }
                m10534d(abstractC7665q, "MILLI_OF_DAY out of range: " + intValue3);
                return null;
            }
            InterfaceC10773k0<Integer, C10711g0> interfaceC10773k07 = C10711g0.f27940I;
            if (abstractC7665q.mo10210q(interfaceC10773k07)) {
                InterfaceC10773k0<Integer, C10711g0> interfaceC10773k08 = C10711g0.f27943L;
                if (abstractC7665q.mo10210q(interfaceC10773k08)) {
                    i3 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k08)).intValue();
                } else {
                    InterfaceC10773k0<Integer, C10711g0> interfaceC10773k09 = C10711g0.f27942K;
                    if (abstractC7665q.mo10210q(interfaceC10773k09)) {
                        i3 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k09)).intValue() * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    } else {
                        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k010 = C10711g0.f27941J;
                        if (abstractC7665q.mo10210q(interfaceC10773k010)) {
                            i3 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k010)).intValue() * 1000000;
                        } else {
                            i3 = 0;
                        }
                    }
                }
                return (C10711g0) C10711g0.m10609N0(0, 0, 0, i3).mo14419F(interfaceC10773k07, abstractC7665q.mo10212i(interfaceC10773k07));
            }
            InterfaceC10773k0<Integer, C10711g0> interfaceC10773k011 = C10711g0.f27938G;
            if (!abstractC7665q.mo10210q(interfaceC10773k011)) {
                return null;
            }
            InterfaceC10773k0<Integer, C10711g0> interfaceC10773k012 = C10711g0.f27943L;
            if (abstractC7665q.mo10210q(interfaceC10773k012)) {
                i = ((Integer) abstractC7665q.mo10212i(interfaceC10773k012)).intValue();
            } else {
                InterfaceC10773k0<Integer, C10711g0> interfaceC10773k013 = C10711g0.f27942K;
                if (abstractC7665q.mo10210q(interfaceC10773k013)) {
                    i = ((Integer) abstractC7665q.mo10212i(interfaceC10773k013)).intValue() * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                } else {
                    InterfaceC10773k0<Integer, C10711g0> interfaceC10773k014 = C10711g0.f27941J;
                    if (abstractC7665q.mo10210q(interfaceC10773k014)) {
                        i = ((Integer) abstractC7665q.mo10212i(interfaceC10773k014)).intValue() * 1000000;
                    } else {
                        i = 0;
                    }
                }
            }
            InterfaceC10773k0<Integer, C10711g0> interfaceC10773k015 = C10711g0.f27939H;
            if (abstractC7665q.mo10210q(interfaceC10773k015)) {
                i2 = ((Integer) abstractC7665q.mo10212i(interfaceC10773k015)).intValue();
            } else {
                i2 = 0;
            }
            return (C10711g0) C10711g0.m10609N0(0, 0, i2, i).mo14419F(interfaceC10773k011, abstractC7665q.mo10212i(interfaceC10773k011));
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: a */
        public C10711g0 mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
            if (abstractC7665q instanceof InterfaceC10620f) {
                return C10722h0.m10499W().mo10453j(abstractC7665q, interfaceC7633d, z, z2).m10493b0();
            }
            InterfaceC7664p<?> interfaceC7664p = C10711g0.f27966x;
            if (abstractC7665q.mo10210q(interfaceC7664p)) {
                return (C10711g0) abstractC7665q.mo10212i(interfaceC7664p);
            }
            InterfaceC10624c1<BigDecimal> interfaceC10624c1 = C10711g0.f27947P;
            if (abstractC7665q.mo10210q(interfaceC10624c1)) {
                return C10711g0.m10607P0((BigDecimal) abstractC7665q.mo10212i(interfaceC10624c1));
            }
            int mo10218c = abstractC7665q.mo10218c(C10711g0.f27936E);
            if (mo10218c == Integer.MIN_VALUE) {
                mo10218c = m10532h(abstractC7665q);
                if (mo10218c == Integer.MIN_VALUE) {
                    return m10531k(abstractC7665q);
                }
                if (mo10218c != -1 && mo10218c != -2) {
                    if (mo10218c == 24 && !z) {
                        m10534d(abstractC7665q, "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead.");
                        return null;
                    }
                } else if (z) {
                    mo10218c = mo10218c == -1 ? 0 : 12;
                } else {
                    m10534d(abstractC7665q, "Clock hour cannot be zero.");
                    return null;
                }
            }
            InterfaceC10624c1<BigDecimal> interfaceC10624c12 = C10711g0.f27948Q;
            if (abstractC7665q.mo10210q(interfaceC10624c12)) {
                return (C10711g0) C10711g0.f27953V.mo9916n(C10711g0.m10613K0(mo10218c), abstractC7665q.mo10212i(interfaceC10624c12), false);
            }
            int mo10218c2 = abstractC7665q.mo10218c(C10711g0.f27937F);
            if (mo10218c2 == Integer.MIN_VALUE) {
                mo10218c2 = 0;
            }
            InterfaceC10624c1<BigDecimal> interfaceC10624c13 = C10711g0.f27949R;
            if (abstractC7665q.mo10210q(interfaceC10624c13)) {
                return (C10711g0) C10711g0.f27954W.mo9916n(C10711g0.m10612L0(mo10218c, mo10218c2), abstractC7665q.mo10212i(interfaceC10624c13), false);
            }
            int mo10218c3 = abstractC7665q.mo10218c(C10711g0.f27939H);
            if (mo10218c3 == Integer.MIN_VALUE) {
                mo10218c3 = 0;
            }
            int mo10218c4 = abstractC7665q.mo10218c(C10711g0.f27943L);
            if (mo10218c4 == Integer.MIN_VALUE) {
                int mo10218c5 = abstractC7665q.mo10218c(C10711g0.f27942K);
                if (mo10218c5 == Integer.MIN_VALUE) {
                    int mo10218c6 = abstractC7665q.mo10218c(C10711g0.f27941J);
                    if (mo10218c6 == Integer.MIN_VALUE) {
                        mo10218c4 = 0;
                    } else {
                        mo10218c4 = C10616c.m11034h(mo10218c6, 1000000);
                    }
                } else {
                    mo10218c4 = C10616c.m11034h(mo10218c5, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                }
            }
            if (z) {
                long m11036f = C10616c.m11036f(C10616c.m11033i(C10616c.m11036f(C10616c.m11036f(C10616c.m11033i(mo10218c, 3600L), C10616c.m11033i(mo10218c2, 60L)), mo10218c3), 1000000000L), mo10218c4);
                long m10570x0 = C10711g0.m10570x0(m11036f, 86400000000000L);
                long m10571w0 = C10711g0.m10571w0(m11036f, 86400000000000L);
                int i = (m10571w0 > 0L ? 1 : (m10571w0 == 0L ? 0 : -1));
                if (i != 0) {
                    InterfaceC7664p<Long> interfaceC7664p2 = C10845x.f28300p;
                    if (abstractC7665q.m20122B(interfaceC7664p2, m10571w0)) {
                        abstractC7665q.m20121E(interfaceC7664p2, m10571w0);
                    }
                }
                if (m10570x0 == 0 && i > 0) {
                    return C10711g0.f27965w;
                }
                return C10711g0.m10573u0(m10570x0);
            } else if ((mo10218c >= 0 && mo10218c2 >= 0 && mo10218c3 >= 0 && mo10218c4 >= 0 && mo10218c == 24 && (mo10218c2 | mo10218c3 | mo10218c4) == 0) || (mo10218c < 24 && mo10218c2 <= 59 && mo10218c3 <= 59 && mo10218c4 <= 1000000000)) {
                return C10711g0.m10608O0(mo10218c, mo10218c2, mo10218c3, mo10218c4, false);
            } else {
                m10534d(abstractC7665q, "Time component out of range.");
                return null;
            }
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: c */
        public AbstractC7638f0 mo10458c() {
            return AbstractC7638f0.f20937a;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: e */
        public InterfaceC7662o mo10459b(C10711g0 c10711g0, InterfaceC7633d interfaceC7633d) {
            return c10711g0;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: f */
        public C7672x<?> mo10456f() {
            return null;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: g */
        public int mo10455g() {
            return C10697f0.m10673w0().mo10455g();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: i */
        public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
            return C8972b.m16898t(EnumC8979e.m16890b(interfaceC7675y.mo16891a()), locale);
        }
    }

    /* renamed from: net.time4j.g0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10718g implements InterfaceC7676z<C10711g0, EnumC10851z> {
        private C10718g() {
        }

        /* synthetic */ C10718g(C10712a c10712a) {
            this();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C10711g0 c10711g0) {
            return C10711g0.f27934C;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C10711g0 c10711g0) {
            return C10711g0.f27934C;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public EnumC10851z mo9922f(C10711g0 c10711g0) {
            return EnumC10851z.PM;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10851z mo9917l(C10711g0 c10711g0) {
            return EnumC10851z.AM;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10851z mo9915o(C10711g0 c10711g0) {
            return EnumC10851z.m9980c(c10711g0.f27969j);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C10711g0 c10711g0, EnumC10851z enumC10851z) {
            return enumC10851z != null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C10711g0 mo9916n(C10711g0 c10711g0, EnumC10851z enumC10851z, boolean z) {
            int i;
            if (c10711g0.f27969j == 24) {
                i = 0;
            } else {
                i = c10711g0.f27969j;
            }
            if (enumC10851z != null) {
                if (enumC10851z == EnumC10851z.AM) {
                    if (i >= 12) {
                        i -= 12;
                    }
                } else if (enumC10851z == EnumC10851z.PM && i < 12) {
                    i += 12;
                }
                return C10711g0.m10609N0(i, c10711g0.f27970k, c10711g0.f27971l, c10711g0.f27972m);
            }
            throw new IllegalArgumentException("Missing am/pm-value.");
        }
    }

    /* renamed from: net.time4j.g0$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10719h implements InterfaceC7676z<C10711g0, EnumC10704g> {
        private C10719h() {
        }

        /* synthetic */ C10719h(C10712a c10712a) {
            this();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public EnumC10704g mo9922f(C10711g0 c10711g0) {
            return EnumC10704g.f27929o;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10704g mo9917l(C10711g0 c10711g0) {
            return EnumC10704g.f27924j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10704g mo9915o(C10711g0 c10711g0) {
            if (c10711g0.f27972m != 0) {
                if (c10711g0.f27972m % 1000000 == 0) {
                    return EnumC10704g.f27927m;
                }
                if (c10711g0.f27972m % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                    return EnumC10704g.f27928n;
                }
                return EnumC10704g.f27929o;
            } else if (c10711g0.f27971l != 0) {
                return EnumC10704g.f27926l;
            } else {
                if (c10711g0.f27970k != 0) {
                    return EnumC10704g.f27925k;
                }
                return EnumC10704g.f27924j;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C10711g0 c10711g0, EnumC10704g enumC10704g) {
            return enumC10704g != null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C10711g0 mo9916n(C10711g0 c10711g0, EnumC10704g enumC10704g, boolean z) {
            if (enumC10704g != null) {
                if (enumC10704g.ordinal() >= mo9915o(c10711g0).ordinal()) {
                    return c10711g0;
                }
                switch (C10712a.f27973a[enumC10704g.ordinal()]) {
                    case 1:
                        return C10711g0.m10613K0(c10711g0.f27969j);
                    case 2:
                        return C10711g0.m10612L0(c10711g0.f27969j, c10711g0.f27970k);
                    case 3:
                        return C10711g0.m10611M0(c10711g0.f27969j, c10711g0.f27970k, c10711g0.f27971l);
                    case 4:
                        return C10711g0.m10609N0(c10711g0.f27969j, c10711g0.f27970k, c10711g0.f27971l, (c10711g0.f27972m / 1000000) * 1000000);
                    case 5:
                        return C10711g0.m10609N0(c10711g0.f27969j, c10711g0.f27970k, c10711g0.f27971l, (c10711g0.f27972m / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                    case 6:
                        return c10711g0;
                    default:
                        throw new UnsupportedOperationException(enumC10704g.name());
                }
            }
            throw new IllegalArgumentException("Missing precision value.");
        }
    }

    /* renamed from: net.time4j.g0$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10720i implements InterfaceC7676z<C10711g0, C10711g0> {
        private C10720i() {
        }

        /* synthetic */ C10720i(C10712a c10712a) {
            this();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C10711g0 c10711g0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public C10711g0 mo9922f(C10711g0 c10711g0) {
            return C10711g0.f27965w;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public C10711g0 mo9917l(C10711g0 c10711g0) {
            return C10711g0.f27964v;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public C10711g0 mo9915o(C10711g0 c10711g0) {
            return c10711g0;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C10711g0 c10711g0, C10711g0 c10711g02) {
            return c10711g02 != null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C10711g0 mo9916n(C10711g0 c10711g0, C10711g0 c10711g02, boolean z) {
            if (c10711g02 != null) {
                return c10711g02;
            }
            throw new IllegalArgumentException("Missing time value.");
        }
    }

    static {
        char c;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f27956n = c;
        f27957o = new BigDecimal(60);
        f27958p = new BigDecimal(3600);
        f27959q = new BigDecimal(1000000000);
        f27960r = new BigDecimal("24");
        f27961s = new BigDecimal("23.999999999999999");
        f27962t = new BigDecimal("59.999999999999999");
        f27963u = new C10711g0[25];
        for (int i = 0; i <= 24; i++) {
            f27963u[i] = new C10711g0(i, 0, 0, 0, false);
        }
        C10711g0[] c10711g0Arr = f27963u;
        C10711g0 c10711g0 = c10711g0Arr[0];
        f27964v = c10711g0;
        C10711g0 c10711g02 = c10711g0Arr[24];
        f27965w = c10711g02;
        C10789q0 c10789q0 = C10789q0.f28163j;
        f27966x = c10789q0;
        f27967y = c10789q0;
        EnumC10682d enumC10682d = EnumC10682d.AM_PM_OF_DAY;
        f27968z = enumC10682d;
        C10796t m10184x = C10796t.m10184x("CLOCK_HOUR_OF_AMPM", false);
        f27932A = m10184x;
        C10796t m10184x2 = C10796t.m10184x("CLOCK_HOUR_OF_DAY", true);
        f27933B = m10184x2;
        C10796t m10183y = C10796t.m10183y("DIGITAL_HOUR_OF_AMPM", 3, 0, 11, 'K');
        f27934C = m10183y;
        C10796t m10183y2 = C10796t.m10183y("DIGITAL_HOUR_OF_DAY", 4, 0, 23, 'H');
        f27935D = m10183y2;
        C10796t m10183y3 = C10796t.m10183y("HOUR_FROM_0_TO_24", 5, 0, 23, 'H');
        f27936E = m10183y3;
        C10796t m10183y4 = C10796t.m10183y("MINUTE_OF_HOUR", 6, 0, 59, 'm');
        f27937F = m10183y4;
        C10796t m10183y5 = C10796t.m10183y("MINUTE_OF_DAY", 7, 0, 1439, f27956n);
        f27938G = m10183y5;
        C10796t m10183y6 = C10796t.m10183y("SECOND_OF_MINUTE", 8, 0, 59, 's');
        f27939H = m10183y6;
        C10796t m10183y7 = C10796t.m10183y("SECOND_OF_DAY", 9, 0, 86399, f27956n);
        f27940I = m10183y7;
        C10796t m10183y8 = C10796t.m10183y("MILLI_OF_SECOND", 10, 0, 999, f27956n);
        f27941J = m10183y8;
        C10796t m10183y9 = C10796t.m10183y("MICRO_OF_SECOND", 11, 0, 999999, f27956n);
        f27942K = m10183y9;
        C10796t m10183y10 = C10796t.m10183y("NANO_OF_SECOND", 12, 0, 999999999, 'S');
        f27943L = m10183y10;
        C10796t m10183y11 = C10796t.m10183y("MILLI_OF_DAY", 13, 0, 86399999, 'A');
        f27944M = m10183y11;
        C10845x m10001x = C10845x.m10001x("MICRO_OF_DAY", 0L, 86399999999L);
        f27945N = m10001x;
        C10845x m10001x2 = C10845x.m10001x("NANO_OF_DAY", 0L, 86399999999999L);
        f27946O = m10001x2;
        C10774l c10774l = new C10774l("DECIMAL_HOUR", f27961s);
        f27947P = c10774l;
        BigDecimal bigDecimal = f27962t;
        C10774l c10774l2 = new C10774l("DECIMAL_MINUTE", bigDecimal);
        f27948Q = c10774l2;
        C10774l c10774l3 = new C10774l("DECIMAL_SECOND", bigDecimal);
        f27949R = c10774l3;
        InterfaceC7664p<EnumC10704g> interfaceC7664p = C10765i0.f28084m;
        f27950S = interfaceC7664p;
        HashMap hashMap = new HashMap();
        m10572v0(hashMap, c10789q0);
        m10572v0(hashMap, enumC10682d);
        m10572v0(hashMap, m10184x);
        m10572v0(hashMap, m10184x2);
        m10572v0(hashMap, m10183y);
        m10572v0(hashMap, m10183y2);
        m10572v0(hashMap, m10183y3);
        m10572v0(hashMap, m10183y4);
        m10572v0(hashMap, m10183y5);
        m10572v0(hashMap, m10183y6);
        m10572v0(hashMap, m10183y7);
        m10572v0(hashMap, m10183y8);
        m10572v0(hashMap, m10183y9);
        m10572v0(hashMap, m10183y10);
        m10572v0(hashMap, m10183y11);
        m10572v0(hashMap, m10001x);
        m10572v0(hashMap, m10001x2);
        m10572v0(hashMap, c10774l);
        m10572v0(hashMap, c10774l2);
        m10572v0(hashMap, c10774l3);
        f27951T = Collections.unmodifiableMap(hashMap);
        C10713b c10713b = new C10713b(c10774l, f27960r);
        f27952U = c10713b;
        C10713b c10713b2 = new C10713b(c10774l2, bigDecimal);
        f27953V = c10713b2;
        C10713b c10713b3 = new C10713b(c10774l3, bigDecimal);
        f27954W = c10713b3;
        C7644h0.C7646b m20167d = C7644h0.C7646b.m20160k(InterfaceC10841v.class, C10711g0.class, new C10717f(null), c10711g0, c10711g02).m20167d(c10789q0, new C10720i(null)).m20167d(enumC10682d, new C10718g(null));
        C10715d c10715d = new C10715d(m10184x, 1, 12);
        EnumC10704g enumC10704g = EnumC10704g.f27924j;
        C7644h0.C7646b m20166e = m20167d.m20166e(m10184x, c10715d, enumC10704g).m20166e(m10184x2, new C10715d(m10184x2, 1, 24), enumC10704g).m20166e(m10183y, new C10715d(m10183y, 0, 11), enumC10704g).m20166e(m10183y2, new C10715d(m10183y2, 0, 23), enumC10704g).m20166e(m10183y3, new C10715d(m10183y3, 0, 24), enumC10704g);
        C10715d c10715d2 = new C10715d(m10183y4, 0, 59);
        EnumC10704g enumC10704g2 = EnumC10704g.f27925k;
        C7644h0.C7646b m20166e2 = m20166e.m20166e(m10183y4, c10715d2, enumC10704g2).m20166e(m10183y5, new C10715d(m10183y5, 0, 1440), enumC10704g2);
        C10715d c10715d3 = new C10715d(m10183y6, 0, 59);
        EnumC10704g enumC10704g3 = EnumC10704g.f27926l;
        C7644h0.C7646b m20166e3 = m20166e2.m20166e(m10183y6, c10715d3, enumC10704g3).m20166e(m10183y7, new C10715d(m10183y7, 0, 86400), enumC10704g3);
        C10715d c10715d4 = new C10715d(m10183y8, 0, 999);
        EnumC10704g enumC10704g4 = EnumC10704g.f27927m;
        C7644h0.C7646b m20166e4 = m20166e3.m20166e(m10183y8, c10715d4, enumC10704g4);
        C10715d c10715d5 = new C10715d(m10183y9, 0, 999999);
        EnumC10704g enumC10704g5 = EnumC10704g.f27928n;
        C7644h0.C7646b m20166e5 = m20166e4.m20166e(m10183y9, c10715d5, enumC10704g5);
        C10715d c10715d6 = new C10715d(m10183y10, 0, 999999999);
        EnumC10704g enumC10704g6 = EnumC10704g.f27929o;
        C7644h0.C7646b m20167d2 = m20166e5.m20166e(m10183y10, c10715d6, enumC10704g6).m20166e(m10183y11, new C10715d(m10183y11, 0, 86400000), enumC10704g4).m20166e(m10001x, new C10716e(m10001x, 0L, 86400000000L), enumC10704g5).m20166e(m10001x2, new C10716e(m10001x2, 0L, 86400000000000L), enumC10704g6).m20167d(c10774l, c10713b).m20167d(c10774l2, c10713b2).m20167d(c10774l3, c10713b3).m20167d(interfaceC7664p, new C10719h(null));
        m10603R0(m20167d2);
        m10601S0(m20167d2);
        f27955X = m20167d2.m20163h();
    }

    private C10711g0(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            m10580n0(i);
            m10579o0(i2);
            m10577q0(i3);
            m10578p0(i4);
            if (i == 24 && (i2 | i3 | i4) != 0) {
                throw new IllegalArgumentException("T24:00:00 exceeded.");
            }
        }
        this.f27969j = (byte) i;
        this.f27970k = (byte) i2;
        this.f27971l = (byte) i3;
        this.f27972m = i4;
    }

    /* renamed from: D0 */
    public boolean m10620D0() {
        return ((this.f27970k | this.f27971l) | this.f27972m) == 0;
    }

    /* renamed from: E0 */
    public boolean m10619E0() {
        return (this.f27971l | this.f27972m) == 0;
    }

    /* renamed from: H0 */
    public static Object m10616H0(String str) {
        return f27951T.get(str);
    }

    /* renamed from: I0 */
    public static C10711g0 m10615I0() {
        return f27965w;
    }

    /* renamed from: J0 */
    public static C10711g0 m10614J0() {
        return f27964v;
    }

    /* renamed from: K0 */
    public static C10711g0 m10613K0(int i) {
        m10580n0(i);
        return f27963u[i];
    }

    /* renamed from: L0 */
    public static C10711g0 m10612L0(int i, int i2) {
        if (i2 == 0) {
            return m10613K0(i);
        }
        return new C10711g0(i, i2, 0, 0, true);
    }

    /* renamed from: M0 */
    public static C10711g0 m10611M0(int i, int i2, int i3) {
        if ((i2 | i3) == 0) {
            return m10613K0(i);
        }
        return new C10711g0(i, i2, i3, 0, true);
    }

    /* renamed from: N0 */
    public static C10711g0 m10609N0(int i, int i2, int i3, int i4) {
        return m10608O0(i, i2, i3, i4, true);
    }

    /* renamed from: O0 */
    public static C10711g0 m10608O0(int i, int i2, int i3, int i4, boolean z) {
        if ((i2 | i3 | i4) == 0) {
            if (z) {
                return m10613K0(i);
            }
            return f27963u[i];
        }
        return new C10711g0(i, i2, i3, i4, z);
    }

    /* renamed from: P0 */
    public static C10711g0 m10607P0(BigDecimal bigDecimal) {
        return f27952U.mo9916n(null, bigDecimal, false);
    }

    /* renamed from: Q0 */
    public static void m10605Q0(StringBuilder sb2, int i) {
        int i2;
        sb2.append(f27956n);
        String num = Integer.toString(i);
        if (i % 1000000 == 0) {
            i2 = 3;
        } else if (i % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
            i2 = 6;
        } else {
            i2 = 9;
        }
        for (int length = num.length(); length < 9; length++) {
            sb2.append('0');
        }
        int length2 = (i2 + num.length()) - 9;
        for (int i3 = 0; i3 < length2; i3++) {
            sb2.append(num.charAt(i3));
        }
    }

    /* renamed from: R0 */
    private static void m10603R0(C7644h0.C7646b<InterfaceC10841v, C10711g0> c7646b) {
        for (InterfaceC7667s interfaceC7667s : AbstractC10617d.m11026c().mo11022g(InterfaceC7667s.class)) {
            if (interfaceC7667s.mo9072d(C10711g0.class)) {
                c7646b.m20165f(interfaceC7667s);
            }
        }
        c7646b.m20165f(new C10768k.C10771c());
    }

    /* renamed from: S0 */
    private static void m10601S0(C7644h0.C7646b<InterfaceC10841v, C10711g0> c7646b) {
        EnumC10704g[] values;
        Set<? extends InterfaceC10841v> allOf = EnumSet.allOf(EnumC10704g.class);
        for (EnumC10704g enumC10704g : EnumC10704g.values()) {
            c7646b.m20164g(enumC10704g, new C10714c(enumC10704g, null), enumC10704g.getLength(), allOf);
        }
    }

    /* renamed from: l0 */
    private static void m10582l0(int i, StringBuilder sb2) {
        if (i < 10) {
            sb2.append('0');
        }
        sb2.append(i);
    }

    /* renamed from: m0 */
    public static C7644h0<InterfaceC10841v, C10711g0> m10581m0() {
        return f27955X;
    }

    /* renamed from: n0 */
    private static void m10580n0(long j) {
        if (j < 0 || j > 24) {
            throw new IllegalArgumentException("HOUR_OF_DAY out of range: " + j);
        }
    }

    /* renamed from: o0 */
    public static void m10579o0(long j) {
        if (j < 0 || j > 59) {
            throw new IllegalArgumentException("MINUTE_OF_HOUR out of range: " + j);
        }
    }

    /* renamed from: p0 */
    private static void m10578p0(int i) {
        if (i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException("NANO_OF_SECOND out of range: " + i);
        }
    }

    /* renamed from: q0 */
    public static void m10577q0(long j) {
        if (j < 0 || j > 59) {
            throw new IllegalArgumentException("SECOND_OF_MINUTE out of range: " + j);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s0 */
    public static C10711g0 m10575s0(long j, int i) {
        int i2 = (((int) (j % 1000000)) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + i;
        int i3 = (int) (j / 1000000);
        int i4 = i3 % 60;
        int i5 = i3 / 60;
        return m10609N0(i5 / 60, i5 % 60, i4, i2);
    }

    /* renamed from: t0 */
    public static C10711g0 m10574t0(int i, int i2) {
        int i3 = ((i % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * 1000000) + i2;
        int i4 = i / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        int i5 = i4 % 60;
        int i6 = i4 / 60;
        return m10609N0(i6 / 60, i6 % 60, i5, i3);
    }

    /* renamed from: u0 */
    public static C10711g0 m10573u0(long j) {
        int i = (int) (j / 1000000000);
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 % 60;
        return m10609N0(i3 / 60, i4, i2, (int) (j % 1000000000));
    }

    /* renamed from: v0 */
    private static void m10572v0(Map<String, Object> map, InterfaceC7664p<?> interfaceC7664p) {
        map.put(interfaceC7664p.name(), interfaceC7664p);
    }

    /* renamed from: w0 */
    public static long m10571w0(long j, long j2) {
        if (j >= 0) {
            return j / j2;
        }
        return ((j + 1) / j2) - 1;
    }

    private Object writeReplace() {
        return new SPX(this, 2);
    }

    /* renamed from: x0 */
    public static long m10570x0(long j, long j2) {
        long j3;
        if (j >= 0) {
            j3 = j / j2;
        } else {
            j3 = ((j + 1) / j2) - 1;
        }
        Long.signum(j2);
        return j - (j2 * j3);
    }

    /* renamed from: z0 */
    public long m10568z0() {
        return this.f27972m + (this.f27971l * 1000000000) + (this.f27970k * 60 * 1000000000) + (this.f27969j * 3600 * 1000000000);
    }

    /* renamed from: A0 */
    public boolean m10623A0(InterfaceC7664p<?> interfaceC7664p) {
        if ((interfaceC7664p == f27944M && this.f27972m % 1000000 != 0) || ((interfaceC7664p == f27936E && !m10620D0()) || ((interfaceC7664p == f27938G && !m10619E0()) || ((interfaceC7664p == f27940I && this.f27972m != 0) || (interfaceC7664p == f27945N && this.f27972m % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA != 0))))) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public boolean m10622B0(C10711g0 c10711g0) {
        return compareTo(c10711g0) > 0;
    }

    /* renamed from: C0 */
    public boolean m10621C0(C10711g0 c10711g0) {
        return compareTo(c10711g0) < 0;
    }

    /* renamed from: F0 */
    public boolean m10618F0() {
        return m10620D0() && this.f27969j % 24 == 0;
    }

    /* renamed from: G0 */
    public boolean m10617G0(C10711g0 c10711g0) {
        return compareTo(c10711g0) == 0;
    }

    @Override // p162ij.AbstractC7654k0, p162ij.AbstractC7665q
    /* renamed from: I */
    public C7644h0<InterfaceC10841v, C10711g0> mo10478v() {
        return f27955X;
    }

    /* renamed from: T0 */
    public C10766j m10600T0(long j, EnumC10704g enumC10704g) {
        return C10714c.m10556e(this, j, enumC10704g);
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: a */
    public int mo10495a() {
        return this.f27972m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10711g0)) {
            return false;
        }
        C10711g0 c10711g0 = (C10711g0) obj;
        if (this.f27969j == c10711g0.f27969j && this.f27970k == c10711g0.f27970k && this.f27971l == c10711g0.f27971l && this.f27972m == c10711g0.f27972m) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: h */
    public int mo10487h() {
        return this.f27971l;
    }

    public int hashCode() {
        return this.f27969j + (this.f27970k * 60) + (this.f27971l * 3600) + (this.f27972m * 37);
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: m */
    public int mo10483m() {
        return this.f27970k;
    }

    @Override // p162ij.AbstractC7654k0, java.lang.Comparable
    /* renamed from: r0 */
    public int compareTo(C10711g0 c10711g0) {
        int i = this.f27969j - c10711g0.f27969j;
        if (i == 0 && (i = this.f27970k - c10711g0.f27970k) == 0 && (i = this.f27971l - c10711g0.f27971l) == 0) {
            i = this.f27972m - c10711g0.f27972m;
        }
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: s */
    public int mo10479s() {
        return this.f27969j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append('T');
        m10582l0(this.f27969j, sb2);
        if ((this.f27970k | this.f27971l | this.f27972m) != 0) {
            sb2.append(':');
            m10582l0(this.f27970k, sb2);
            if ((this.f27971l | this.f27972m) != 0) {
                sb2.append(':');
                m10582l0(this.f27971l, sb2);
                int i = this.f27972m;
                if (i != 0) {
                    m10605Q0(sb2, i);
                }
            }
        }
        return sb2.toString();
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: y0 */
    public C10711g0 mo10477w() {
        return this;
    }
}