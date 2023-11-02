package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10620f;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.EnumC10804g;
import net.time4j.p249tz.InterfaceC10808k;
import net.time4j.p249tz.InterfaceC10834o;
import p162ij.AbstractC7638f0;
import p162ij.AbstractC7654k0;
import p162ij.AbstractC7655l;
import p162ij.AbstractC7658m;
import p162ij.AbstractC7665q;
import p162ij.C7644h0;
import p162ij.C7651j;
import p162ij.C7666r;
import p162ij.C7672x;
import p162ij.EnumC7627a0;
import p162ij.EnumC7630b0;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7650i0;
import p162ij.InterfaceC7659m0;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7669u;
import p162ij.InterfaceC7670v;
import p162ij.InterfaceC7675y;
import p162ij.InterfaceC7676z;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC8979e;
import p184jj.InterfaceC8977c;
import p288pj.C11648d;
import p288pj.EnumC11651f;
import p288pj.InterfaceC11646b;
import p288pj.InterfaceC11652g;

@InterfaceC8977c("iso8601")
/* renamed from: net.time4j.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10582a0 extends AbstractC7654k0<TimeUnit, C10582a0> implements InterfaceC11652g {

    /* renamed from: l */
    private static final long f27631l;

    /* renamed from: m */
    private static final long f27632m;

    /* renamed from: n */
    private static final C10582a0 f27633n;

    /* renamed from: o */
    private static final C10582a0 f27634o;

    /* renamed from: p */
    private static final C10582a0 f27635p;

    /* renamed from: q */
    private static final Set<InterfaceC7664p<?>> f27636q;

    /* renamed from: r */
    private static final Map<InterfaceC7664p<?>, Integer> f27637r;

    /* renamed from: s */
    private static final Map<TimeUnit, Double> f27638s;
    private static final long serialVersionUID = -3192884724477742274L;

    /* renamed from: t */
    private static final C7644h0<TimeUnit, C10582a0> f27639t;

    /* renamed from: u */
    public static final C10582a0 f27640u;

    /* renamed from: v */
    public static final InterfaceC7664p<Long> f27641v;

    /* renamed from: w */
    public static final InterfaceC7664p<Integer> f27642w;

    /* renamed from: x */
    public static final InterfaceC7664p<TimeUnit> f27643x;

    /* renamed from: y */
    private static final InterfaceC7670v<C10582a0> f27644y;

    /* renamed from: j */
    private final transient long f27645j;

    /* renamed from: k */
    private final transient int f27646k;

    /* renamed from: net.time4j.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10583a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27647a;

        /* renamed from: b */
        static final /* synthetic */ int[] f27648b;

        /* renamed from: c */
        static final /* synthetic */ int[] f27649c;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f27649c = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27649c[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27649c[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27649c[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27649c[TimeUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27649c[TimeUnit.MICROSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27649c[TimeUnit.NANOSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC10781n0.values().length];
            f27648b = iArr2;
            try {
                iArr2[EnumC10781n0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27648b[EnumC10781n0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[EnumC11651f.values().length];
            f27647a = iArr3;
            try {
                iArr3[EnumC11651f.POSIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27647a[EnumC11651f.UTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27647a[EnumC11651f.TAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27647a[EnumC11651f.GPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f27647a[EnumC11651f.TT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f27647a[EnumC11651f.UT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: net.time4j.a0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10584b implements InterfaceC7650i0<C10582a0> {
        private C10584b() {
        }

        /* synthetic */ C10584b(C10583a c10583a) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C10582a0 c10582a0, C10582a0 c10582a02) {
            return c10582a0.compareTo(c10582a02);
        }
    }

    /* renamed from: net.time4j.a0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC10585c implements InterfaceC7664p<Integer>, InterfaceC7676z<C10582a0, Integer> {
        FRACTION;

        @Override // p162ij.InterfaceC7676z
        /* renamed from: B */
        public Integer mo9917l(C10582a0 c10582a0) {
            return mo9554U();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: C */
        public Integer mo9915o(C10582a0 c10582a0) {
            return Integer.valueOf(c10582a0.mo10166a());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: D */
        public boolean mo9920i(C10582a0 c10582a0, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 0 && intValue < 1000000000;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: E */
        public C10582a0 mo9916n(C10582a0 c10582a0, Integer num, boolean z) {
            if (num != null) {
                if (C11648d.m7361w().m7373C()) {
                    EnumC11651f enumC11651f = EnumC11651f.UTC;
                    return C10582a0.m11146p0(c10582a0.mo7349e(enumC11651f), num.intValue(), enumC11651f);
                }
                return C10582a0.m11146p0(c10582a0.mo10164k(), num.intValue(), EnumC11651f.POSIX);
            }
            throw new IllegalArgumentException("Missing fraction value.");
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return false;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: V */
        public boolean mo9553V() {
            return false;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: a */
        public char mo9552a() {
            return (char) 0;
        }

        @Override // p162ij.InterfaceC7664p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: k */
        public boolean mo9930k() {
            return false;
        }

        @Override // java.util.Comparator
        /* renamed from: p */
        public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
            return ((Integer) interfaceC7662o.mo10212i(this)).compareTo((Integer) interfaceC7662o2.mo10212i(this));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public InterfaceC7664p<?> mo9926b(C10582a0 c10582a0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: s */
        public InterfaceC7664p<?> mo9925c(C10582a0 c10582a0) {
            return null;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: t */
        public Integer mo9551e() {
            return 999999999;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: v */
        public Integer mo9554U() {
            return 0;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: w */
        public Integer mo9922f(C10582a0 c10582a0) {
            return mo9551e();
        }
    }

    /* renamed from: net.time4j.a0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC10586d implements InterfaceC7664p<Long>, InterfaceC7676z<C10582a0, Long> {
        POSIX_TIME;

        @Override // p162ij.InterfaceC7676z
        /* renamed from: B */
        public Long mo9917l(C10582a0 c10582a0) {
            return Long.valueOf(C10582a0.f27631l);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: C */
        public Long mo9915o(C10582a0 c10582a0) {
            return Long.valueOf(c10582a0.mo10164k());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: D */
        public boolean mo9920i(C10582a0 c10582a0, Long l) {
            if (l == null) {
                return false;
            }
            long longValue = l.longValue();
            if (longValue < C10582a0.f27631l || longValue > C10582a0.f27632m) {
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: E */
        public C10582a0 mo9916n(C10582a0 c10582a0, Long l, boolean z) {
            if (l != null) {
                return C10582a0.m11146p0(l.longValue(), c10582a0.mo10166a(), EnumC11651f.POSIX);
            }
            throw new IllegalArgumentException("Missing elapsed seconds.");
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return false;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: V */
        public boolean mo9553V() {
            return false;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: a */
        public char mo9552a() {
            return (char) 0;
        }

        @Override // p162ij.InterfaceC7664p
        public Class<Long> getType() {
            return Long.class;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: k */
        public boolean mo9930k() {
            return false;
        }

        @Override // java.util.Comparator
        /* renamed from: p */
        public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
            return ((Long) interfaceC7662o.mo10212i(this)).compareTo((Long) interfaceC7662o2.mo10212i(this));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public InterfaceC7664p<?> mo9926b(C10582a0 c10582a0) {
            return EnumC10585c.FRACTION;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: s */
        public InterfaceC7664p<?> mo9925c(C10582a0 c10582a0) {
            return EnumC10585c.FRACTION;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: t */
        public Long mo9551e() {
            return Long.valueOf(C10582a0.f27632m);
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: v */
        public Long mo9554U() {
            return Long.valueOf(C10582a0.f27631l);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: w */
        public Long mo9922f(C10582a0 c10582a0) {
            return Long.valueOf(C10582a0.f27632m);
        }
    }

    /* renamed from: net.time4j.a0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10587e implements InterfaceC7669u<C10582a0> {
        private C10587e() {
        }

        /* synthetic */ C10587e(C10583a c10583a) {
            this();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: a */
        public C10582a0 mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
            C10722h0 mo10453j;
            InterfaceC10808k interfaceC10808k;
            C10582a0 c10582a0;
            C10835p mo10161B;
            C10582a0 c10582a02;
            EnumC10804g enumC10804g;
            EnumC11651f enumC11651f = (EnumC11651f) interfaceC7633d.mo14441b(C8969a.f23582w, EnumC11651f.UTC);
            if (abstractC7665q instanceof InterfaceC10620f) {
                return C10582a0.m11157e0((InterfaceC10620f) InterfaceC10620f.class.cast(abstractC7665q)).m11137y0(enumC11651f);
            }
            EnumC10586d enumC10586d = EnumC10586d.POSIX_TIME;
            int i = 0;
            if (abstractC7665q.mo10210q(enumC10586d)) {
                long longValue = ((Long) abstractC7665q.mo10212i(enumC10586d)).longValue();
                EnumC10585c enumC10585c = EnumC10585c.FRACTION;
                if (abstractC7665q.mo10210q(enumC10585c)) {
                    i = ((Integer) abstractC7665q.mo10212i(enumC10585c)).intValue();
                }
                return C10582a0.m11146p0(longValue, i, EnumC11651f.POSIX).m11137y0(enumC11651f);
            }
            if (abstractC7665q.mo10210q(EnumC7630b0.LEAP_SECOND)) {
                abstractC7665q.mo14420D(C10711g0.f27939H, 60);
                i = 1;
            }
            InterfaceC7664p<?> m20174I = C10722h0.m10499W().m20174I();
            if (abstractC7665q.mo10210q(m20174I)) {
                mo10453j = (C10722h0) abstractC7665q.mo10212i(m20174I);
            } else {
                mo10453j = C10722h0.m10499W().mo10453j(abstractC7665q, interfaceC7633d, z, z2);
            }
            if (mo10453j == null) {
                return null;
            }
            if (abstractC7665q.mo10217d()) {
                interfaceC10808k = abstractC7665q.mo10209t();
            } else {
                InterfaceC7631c<InterfaceC10808k> interfaceC7631c = C8969a.f23563d;
                if (interfaceC7633d.mo14442a(interfaceC7631c)) {
                    interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14440c(interfaceC7631c);
                } else {
                    interfaceC10808k = null;
                }
            }
            if (interfaceC10808k != null) {
                EnumC7630b0 enumC7630b0 = EnumC7630b0.DAYLIGHT_SAVING;
                if (abstractC7665q.mo10210q(enumC7630b0)) {
                    boolean booleanValue = ((Boolean) abstractC7665q.mo10212i(enumC7630b0)).booleanValue();
                    InterfaceC10834o interfaceC10834o = (InterfaceC10834o) interfaceC7633d.mo14441b(C8969a.f23564e, AbstractC10809l.f28231m);
                    if (booleanValue) {
                        enumC10804g = EnumC10804g.EARLIER_OFFSET;
                    } else {
                        enumC10804g = EnumC10804g.LATER_OFFSET;
                    }
                    c10582a0 = mo10453j.m10492c0(AbstractC10809l.m10149N(interfaceC10808k).mo10146Q(interfaceC10834o.mo10037a(enumC10804g)));
                } else {
                    InterfaceC7631c<InterfaceC10834o> interfaceC7631c2 = C8969a.f23564e;
                    if (interfaceC7633d.mo14442a(interfaceC7631c2)) {
                        c10582a0 = mo10453j.m10492c0(AbstractC10809l.m10149N(interfaceC10808k).mo10146Q((InterfaceC10834o) interfaceC7633d.mo14440c(interfaceC7631c2)));
                    } else {
                        c10582a0 = mo10453j.m10491d0(interfaceC10808k);
                    }
                }
            } else {
                c10582a0 = null;
            }
            if (c10582a0 == null) {
                return null;
            }
            if (i != 0) {
                if (interfaceC10808k instanceof C10835p) {
                    mo10161B = (C10835p) interfaceC10808k;
                } else {
                    mo10161B = AbstractC10809l.m10149N(interfaceC10808k).mo10161B(c10582a0);
                }
                if (mo10161B.m10027i() == 0 && mo10161B.m10028h() % 60 == 0) {
                    if (c10582a0.m11155g0().mo10482o() >= 1972) {
                        c10582a02 = c10582a0.m11144r0(1L, EnumC10781n0.SECONDS);
                    } else {
                        c10582a02 = new C10582a0(c10582a0.mo10166a(), c10582a0.mo10164k() + 1, (C10583a) null);
                    }
                    if (!z) {
                        if (C11648d.m7361w().m7373C()) {
                            if (!c10582a02.m11147o0()) {
                                throw new IllegalArgumentException("SECOND_OF_MINUTE parsed as invalid leapsecond before " + c10582a02);
                            }
                        }
                    }
                    c10582a0 = c10582a02;
                } else {
                    throw new IllegalArgumentException("Leap second is only allowed  with timezone-offset in full minutes: " + mo10161B);
                }
            }
            return c10582a0.m11137y0(enumC11651f);
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: c */
        public AbstractC7638f0 mo10458c() {
            return AbstractC7638f0.f20937a;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: d */
        public InterfaceC7662o mo10459b(C10582a0 c10582a0, InterfaceC7633d interfaceC7633d) {
            InterfaceC7631c<InterfaceC10808k> interfaceC7631c = C8969a.f23563d;
            if (interfaceC7633d.mo14442a(interfaceC7631c)) {
                return c10582a0.m11136z0((EnumC11651f) interfaceC7633d.mo14441b(C8969a.f23582w, EnumC11651f.UTC)).m11150l0((InterfaceC10808k) interfaceC7633d.mo14440c(interfaceC7631c));
            }
            throw new IllegalArgumentException("Cannot print moment without timezone.");
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: f */
        public C7672x<?> mo10456f() {
            return C10722h0.m10499W();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: g */
        public int mo10455g() {
            return C10697f0.m10673w0().mo10455g();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: i */
        public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
            EnumC8979e m16890b = EnumC8979e.m16890b(interfaceC7675y.mo16891a());
            return C8972b.m16899s(m16890b, m16890b, locale);
        }
    }

    /* renamed from: net.time4j.a0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10588f implements InterfaceC7670v<C10582a0> {
        private C10588f() {
        }

        /* synthetic */ C10588f(C10583a c10583a) {
            this();
        }

        @Override // p162ij.InterfaceC7670v
        /* renamed from: a */
        public C10582a0 apply(C10582a0 c10582a0) {
            InterfaceC11646b m7360x;
            C11648d m7361w = C11648d.m7361w();
            if (m7361w.m7373C() && (m7360x = m7361w.m7360x(c10582a0.mo7349e(EnumC11651f.UTC))) != null) {
                return C10697f0.m10724B0(m7360x.mo7356c()).m10674v0(23, 59, 59).m10500V().m11144r0(m7360x.mo7358a(), EnumC10781n0.SECONDS);
            }
            return null;
        }
    }

    /* renamed from: net.time4j.a0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10589g implements InterfaceC7676z<C10582a0, TimeUnit> {
        private C10589g() {
        }

        /* synthetic */ C10589g(C10583a c10583a) {
            this();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C10582a0 c10582a0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C10582a0 c10582a0) {
            return null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public TimeUnit mo9922f(C10582a0 c10582a0) {
            return TimeUnit.NANOSECONDS;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public TimeUnit mo9917l(C10582a0 c10582a0) {
            return TimeUnit.DAYS;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public TimeUnit mo9915o(C10582a0 c10582a0) {
            int mo10166a = c10582a0.mo10166a();
            if (mo10166a != 0) {
                if (mo10166a % 1000000 == 0) {
                    return TimeUnit.MILLISECONDS;
                }
                if (mo10166a % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                    return TimeUnit.MICROSECONDS;
                }
                return TimeUnit.NANOSECONDS;
            }
            long j = c10582a0.f27645j;
            if (C10616c.m11038d(j, 86400) == 0) {
                return TimeUnit.DAYS;
            }
            if (C10616c.m11038d(j, 3600) == 0) {
                return TimeUnit.HOURS;
            }
            if (C10616c.m11038d(j, 60) == 0) {
                return TimeUnit.MINUTES;
            }
            return TimeUnit.SECONDS;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C10582a0 c10582a0, TimeUnit timeUnit) {
            return timeUnit != null;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C10582a0 mo9916n(C10582a0 c10582a0, TimeUnit timeUnit, boolean z) {
            C10582a0 m11146p0;
            if (timeUnit != null) {
                switch (C10583a.f27649c[timeUnit.ordinal()]) {
                    case 1:
                        return C10582a0.m11145q0(C10616c.m11040b(c10582a0.f27645j, 86400) * 86400, EnumC11651f.POSIX);
                    case 2:
                        return C10582a0.m11145q0(C10616c.m11040b(c10582a0.f27645j, 3600) * 3600, EnumC11651f.POSIX);
                    case 3:
                        return C10582a0.m11145q0(C10616c.m11040b(c10582a0.f27645j, 60) * 60, EnumC11651f.POSIX);
                    case 4:
                        m11146p0 = C10582a0.m11146p0(c10582a0.f27645j, 0, EnumC11651f.POSIX);
                        break;
                    case 5:
                        m11146p0 = C10582a0.m11146p0(c10582a0.f27645j, (c10582a0.mo10166a() / 1000000) * 1000000, EnumC11651f.POSIX);
                        break;
                    case 6:
                        m11146p0 = C10582a0.m11146p0(c10582a0.f27645j, (c10582a0.mo10166a() / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, EnumC11651f.POSIX);
                        break;
                    case 7:
                        return c10582a0;
                    default:
                        throw new UnsupportedOperationException(timeUnit.name());
                }
                if (c10582a0.m11148n0() && C11648d.m7361w().m7373C()) {
                    return m11146p0.m11144r0(1L, EnumC10781n0.SECONDS);
                }
                return m11146p0;
            }
            throw new IllegalArgumentException("Missing precision.");
        }
    }

    /* renamed from: net.time4j.a0$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10590h implements InterfaceC7659m0<C10582a0> {

        /* renamed from: a */
        private final TimeUnit f27654a;

        C10590h(TimeUnit timeUnit) {
            this.f27654a = timeUnit;
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: c */
        public C10582a0 mo10475b(C10582a0 c10582a0, long j) {
            if (this.f27654a.compareTo(TimeUnit.SECONDS) >= 0) {
                return C10582a0.m11146p0(C10616c.m11036f(c10582a0.mo10164k(), C10616c.m11033i(j, this.f27654a.toSeconds(1L))), c10582a0.mo10166a(), EnumC11651f.POSIX);
            }
            long m11036f = C10616c.m11036f(c10582a0.mo10166a(), C10616c.m11033i(j, this.f27654a.toNanos(1L)));
            return C10582a0.m11146p0(C10616c.m11036f(c10582a0.mo10164k(), C10616c.m11040b(m11036f, 1000000000)), C10616c.m11038d(m11036f, 1000000000), EnumC11651f.POSIX);
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: d */
        public long mo10476a(C10582a0 c10582a0, C10582a0 c10582a02) {
            long m11036f;
            if (this.f27654a.compareTo(TimeUnit.SECONDS) >= 0) {
                m11036f = c10582a02.mo10164k() - c10582a0.mo10164k();
                int i = (m11036f > 0L ? 1 : (m11036f == 0L ? 0 : -1));
                if (i < 0) {
                    if (c10582a02.mo10166a() > c10582a0.mo10166a()) {
                        m11036f++;
                    }
                } else if (i > 0 && c10582a02.mo10166a() < c10582a0.mo10166a()) {
                    m11036f--;
                }
            } else {
                m11036f = C10616c.m11036f(C10616c.m11033i(C10616c.m11029m(c10582a02.mo10164k(), c10582a0.mo10164k()), 1000000000L), c10582a02.mo10166a() - c10582a0.mo10166a());
            }
            switch (C10583a.f27649c[this.f27654a.ordinal()]) {
                case 1:
                    return m11036f / 86400;
                case 2:
                    return m11036f / 3600;
                case 3:
                    return m11036f / 60;
                case 4:
                case 7:
                    return m11036f;
                case 5:
                    return m11036f / 1000000;
                case 6:
                    return m11036f / 1000;
                default:
                    throw new UnsupportedOperationException(this.f27654a.name());
            }
        }
    }

    static {
        TimeUnit[] values;
        long m11045j = C10615b.m11045j(-999999999, 1, 1);
        long m11045j2 = C10615b.m11045j(999999999, 12, 31);
        EnumC7627a0 enumC7627a0 = EnumC7627a0.UNIX;
        EnumC7627a0 enumC7627a02 = EnumC7627a0.MODIFIED_JULIAN_DATE;
        long m20216i = enumC7627a0.m20216i(m11045j, enumC7627a02) * 86400;
        f27631l = m20216i;
        long m20216i2 = (enumC7627a0.m20216i(m11045j2, enumC7627a02) * 86400) + 86399;
        f27632m = m20216i2;
        EnumC11651f enumC11651f = EnumC11651f.POSIX;
        C10582a0 c10582a0 = new C10582a0(m20216i, 0, enumC11651f);
        f27633n = c10582a0;
        C10582a0 c10582a02 = new C10582a0(m20216i2, 999999999, enumC11651f);
        f27634o = c10582a02;
        f27635p = new C10582a0(63158400L, 0, enumC11651f);
        HashSet hashSet = new HashSet();
        hashSet.add(C10711g0.f27936E);
        hashSet.add(C10711g0.f27935D);
        hashSet.add(C10711g0.f27934C);
        hashSet.add(C10711g0.f27933B);
        hashSet.add(C10711g0.f27932A);
        hashSet.add(C10711g0.f27968z);
        hashSet.add(C10711g0.f27937F);
        hashSet.add(C10711g0.f27938G);
        f27636q = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        hashMap.put(C10711g0.f27939H, 1);
        hashMap.put(C10711g0.f27940I, 1);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k0 = C10711g0.f27941J;
        Integer valueOf = Integer.valueOf((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        hashMap.put(interfaceC10773k0, valueOf);
        hashMap.put(C10711g0.f27944M, valueOf);
        hashMap.put(C10711g0.f27942K, 1000000);
        hashMap.put(C10711g0.f27945N, 1000000);
        hashMap.put(C10711g0.f27943L, 1000000000);
        hashMap.put(C10711g0.f27946O, 1000000000);
        f27637r = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put((EnumMap) TimeUnit.DAYS, (TimeUnit) Double.valueOf(86400.0d));
        enumMap.put((EnumMap) TimeUnit.HOURS, (TimeUnit) Double.valueOf(3600.0d));
        enumMap.put((EnumMap) TimeUnit.MINUTES, (TimeUnit) Double.valueOf(60.0d));
        enumMap.put((EnumMap) TimeUnit.SECONDS, (TimeUnit) Double.valueOf(1.0d));
        enumMap.put((EnumMap) TimeUnit.MILLISECONDS, (TimeUnit) Double.valueOf(0.001d));
        enumMap.put((EnumMap) TimeUnit.MICROSECONDS, (TimeUnit) Double.valueOf(1.0E-6d));
        enumMap.put((EnumMap) TimeUnit.NANOSECONDS, (TimeUnit) Double.valueOf(1.0E-9d));
        f27638s = Collections.unmodifiableMap(enumMap);
        C7644h0.C7646b m20160k = C7644h0.C7646b.m20160k(TimeUnit.class, C10582a0.class, new C10587e(null), c10582a0, c10582a02);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            C10590h c10590h = new C10590h(timeUnit);
            Map<TimeUnit, Double> map = f27638s;
            m20160k.m20164g(timeUnit, c10590h, map.get(timeUnit).doubleValue(), map.keySet());
        }
        EnumC10586d enumC10586d = EnumC10586d.POSIX_TIME;
        m20160k.m20166e(enumC10586d, enumC10586d, TimeUnit.SECONDS);
        EnumC10585c enumC10585c = EnumC10585c.FRACTION;
        m20160k.m20166e(enumC10585c, enumC10585c, TimeUnit.NANOSECONDS);
        InterfaceC7664p<TimeUnit> interfaceC7664p = C10765i0.f28085n;
        m20160k.m20167d(interfaceC7664p, new C10589g(null));
        f27639t = m20160k.m20159l(new C10584b(null)).m20163h();
        f27640u = new C10582a0(0L, 0, EnumC11651f.POSIX);
        f27641v = enumC10586d;
        f27642w = enumC10585c;
        f27643x = interfaceC7664p;
        f27644y = new C10588f(null);
    }

    /* synthetic */ C10582a0(int i, long j, C10583a c10583a) {
        this(i, j);
    }

    /* renamed from: X */
    public static C7644h0<TimeUnit, C10582a0> m11164X() {
        return f27639t;
    }

    /* renamed from: Y */
    static void m11163Y(C10582a0 c10582a0) {
        if (c10582a0.f27645j >= 63072000) {
            return;
        }
        throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
    }

    /* renamed from: Z */
    private static void m11162Z(int i) {
        if (i >= 1000000000 || i < 0) {
            throw new IllegalArgumentException("Nanosecond out of range: " + i);
        }
    }

    /* renamed from: a0 */
    public static void m11161a0(long j, C10722h0 c10722h0) {
        C11648d m7361w = C11648d.m7361w();
        if (m7361w.m7370F() && m7361w.m7371E(m7361w.m7366p(j)) > j) {
            throw new C7666r("Illegal local timestamp due to negative leap second: " + c10722h0);
        }
    }

    /* renamed from: b0 */
    private static void m11160b0(long j) {
        if (j <= f27632m && j >= f27631l) {
            return;
        }
        throw new IllegalArgumentException("UNIX time (UT) out of supported range: " + j);
    }

    /* renamed from: d0 */
    private static void m11158d0(int i, int i2, StringBuilder sb2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2 - 1; i4++) {
            i3 *= 10;
        }
        while (i < i3 && i3 >= 10) {
            sb2.append('0');
            i3 /= 10;
        }
        sb2.append(String.valueOf(i));
    }

    /* renamed from: e0 */
    public static C10582a0 m11157e0(InterfaceC10620f interfaceC10620f) {
        if (interfaceC10620f instanceof C10582a0) {
            return (C10582a0) C10582a0.class.cast(interfaceC10620f);
        }
        if ((interfaceC10620f instanceof InterfaceC11652g) && C11648d.m7361w().m7373C()) {
            InterfaceC11652g interfaceC11652g = (InterfaceC11652g) InterfaceC11652g.class.cast(interfaceC10620f);
            EnumC11651f enumC11651f = EnumC11651f.UTC;
            return m11146p0(interfaceC11652g.mo7349e(enumC11651f), interfaceC11652g.mo7348g(enumC11651f), enumC11651f);
        }
        return m11146p0(interfaceC10620f.mo10164k(), interfaceC10620f.mo10166a(), EnumC11651f.POSIX);
    }

    /* renamed from: g0 */
    public C10697f0 m11155g0() {
        return C10697f0.m10707R0(C10616c.m11040b(this.f27645j, 86400), EnumC7627a0.UNIX);
    }

    /* renamed from: h0 */
    private long m11154h0() {
        if (C11648d.m7361w().m7373C()) {
            long m7366p = C11648d.m7361w().m7366p(this.f27645j);
            if (m11147o0()) {
                return m7366p + 1;
            }
            return m7366p;
        }
        return this.f27645j - 63072000;
    }

    /* renamed from: i0 */
    private double m11153i0() {
        double m11154h0 = ((m11154h0() + 42.184d) + (mo10166a() / 1.0E9d)) - EnumC11651f.m7350c(m11155g0());
        long floor = (long) Math.floor(m11154h0);
        if (Double.compare(1.0E9d - ((m11154h0 - floor) * 1.0E9d), 1.0d) < 0) {
            return floor + 1;
        }
        return m11154h0;
    }

    /* renamed from: j0 */
    private static int m11152j0(C10582a0 c10582a0) {
        return C10616c.m11038d(c10582a0.f27645j, 86400);
    }

    /* renamed from: k0 */
    private C10722h0 m11151k0(AbstractC10809l abstractC10809l) {
        return C10722h0.m10497Y(this, abstractC10809l.mo10161B(this));
    }

    /* renamed from: o0 */
    public boolean m11147o0() {
        return (this.f27646k >>> 30) != 0;
    }

    /* renamed from: p0 */
    public static C10582a0 m11146p0(long j, int i, EnumC11651f enumC11651f) {
        if (j == 0 && i == 0 && enumC11651f == EnumC11651f.POSIX) {
            return f27640u;
        }
        return new C10582a0(j, i, enumC11651f);
    }

    /* renamed from: q0 */
    public static C10582a0 m11145q0(long j, EnumC11651f enumC11651f) {
        return m11146p0(j, 0, enumC11651f);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s0 */
    public static C10582a0 m11143s0(DataInput dataInput, boolean z, boolean z2) {
        int i;
        String str;
        long readLong = dataInput.readLong();
        if (z2) {
            i = dataInput.readInt();
        } else {
            i = 0;
        }
        if (readLong == 0) {
            if (!z) {
                if (i == 0) {
                    return f27640u;
                }
            } else {
                throw new InvalidObjectException("UTC epoch is no leap second.");
            }
        }
        if (readLong == f27631l && i == 0) {
            if (!z) {
                return f27633n;
            }
            throw new InvalidObjectException("Minimum is no leap second.");
        } else if (readLong == f27632m && i == 999999999) {
            if (!z) {
                return f27634o;
            }
            throw new InvalidObjectException("Maximum is no leap second.");
        } else {
            m11162Z(i);
            if (z) {
                C11648d m7361w = C11648d.m7361w();
                if (m7361w.m7373C() && !m7361w.m7372D(m7361w.m7366p(readLong) + 1)) {
                    long m11043l = C10615b.m11043l(readLong);
                    int m11047h = C10615b.m11047h(m11043l);
                    int m11048g = C10615b.m11048g(m11043l);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Not registered as leap second event: ");
                    sb2.append(C10615b.m11046i(m11043l));
                    sb2.append("-");
                    String str2 = "0";
                    if (m11047h < 10) {
                        str = "0";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(m11047h);
                    if (m11048g >= 10) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    sb2.append(m11048g);
                    sb2.append(" [Please check leap second configurations ");
                    sb2.append("either of emitter vm or this target vm]");
                    throw new InvalidObjectException(sb2.toString());
                }
                i |= 1073741824;
            }
            return new C10582a0(i, readLong);
        }
    }

    /* renamed from: v0 */
    private static int m11140v0(double d, long j) {
        try {
            return (int) ((d * 1.0E9d) - C10616c.m11033i(j, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d - j) * 1.0E9d);
        }
    }

    /* renamed from: w0 */
    private String m11139w0(boolean z) {
        C10697f0 m11155g0 = m11155g0();
        int m11152j0 = m11152j0(this);
        int i = m11152j0 / 60;
        int i2 = i / 60;
        int i3 = i % 60;
        int m7359y = (m11152j0 % 60) + C11648d.m7361w().m7359y(m11154h0());
        int mo10166a = mo10166a();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(m11155g0);
        sb2.append('T');
        m11158d0(i2, 2, sb2);
        if (z || (i3 | m7359y | mo10166a) != 0) {
            sb2.append(':');
            m11158d0(i3, 2, sb2);
            if (z || (m7359y | mo10166a) != 0) {
                sb2.append(':');
                m11158d0(m7359y, 2, sb2);
                if (mo10166a > 0) {
                    sb2.append(',');
                    m11158d0(mo10166a, 9, sb2);
                }
            }
        }
        sb2.append('Z');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new SPX(this, 4);
    }

    /* renamed from: y0 */
    public C10582a0 m11137y0(EnumC11651f enumC11651f) {
        if (enumC11651f == EnumC11651f.UTC) {
            return this;
        }
        if (!m11148n0()) {
            int i = C10583a.f27647a[enumC11651f.ordinal()];
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5 && i != 6) {
                            throw new UnsupportedOperationException(enumC11651f.name());
                        }
                        return new C10582a0(C10616c.m11029m(this.f27645j, 63072000L), mo10166a(), enumC11651f);
                    }
                    return new C10582a0(C10616c.m11029m(this.f27645j, 315964800L), mo10166a(), enumC11651f);
                }
                return new C10582a0(C10616c.m11029m(this.f27645j, -378691200L), mo10166a(), enumC11651f);
            }
            return this;
        }
        throw new IllegalArgumentException("Leap seconds do not exist on continuous time scale: " + enumC11651f);
    }

    /* renamed from: z0 */
    public C10582a0 m11136z0(EnumC11651f enumC11651f) {
        switch (C10583a.f27647a[enumC11651f.ordinal()]) {
            case 1:
                if (m11148n0()) {
                    return new C10582a0(mo10166a(), this.f27645j);
                }
                return this;
            case 2:
                return this;
            case 3:
                return new C10582a0(mo7348g(enumC11651f), C10616c.m11036f(mo7349e(enumC11651f), -378691200L));
            case 4:
                return new C10582a0(mo10166a(), C10616c.m11036f(mo7349e(EnumC11651f.GPS), 315964800L));
            case 5:
            case 6:
                return new C10582a0(mo7348g(enumC11651f), C10616c.m11036f(mo7349e(enumC11651f), 63072000L));
            default:
                throw new UnsupportedOperationException(enumC11651f.name());
        }
    }

    /* renamed from: A0 */
    public void m11172A0(DataOutput dataOutput) {
        int i;
        if (m11147o0()) {
            i = 65;
        } else {
            i = 64;
        }
        int mo10166a = mo10166a();
        if (mo10166a > 0) {
            i |= 2;
        }
        dataOutput.writeByte(i);
        dataOutput.writeLong(this.f27645j);
        if (mo10166a > 0) {
            dataOutput.writeInt(mo10166a);
        }
    }

    @Override // p162ij.AbstractC7654k0, p162ij.AbstractC7665q
    /* renamed from: I */
    public C7644h0<TimeUnit, C10582a0> mo10478v() {
        return f27639t;
    }

    @Override // net.time4j.base.InterfaceC10620f
    /* renamed from: a */
    public int mo10166a() {
        return this.f27646k & (-1073741825);
    }

    @Override // p162ij.AbstractC7654k0, java.lang.Comparable
    /* renamed from: c0 */
    public int compareTo(C10582a0 c10582a0) {
        int mo10166a;
        int i = (m11154h0() > c10582a0.m11154h0() ? 1 : (m11154h0() == c10582a0.m11154h0() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i <= 0 && (mo10166a = mo10166a() - c10582a0.mo10166a()) <= 0) {
            if (mo10166a < 0) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    @Override // p288pj.InterfaceC11652g
    /* renamed from: e */
    public long mo7349e(EnumC11651f enumC11651f) {
        long m11154h0;
        int m11140v0;
        switch (C10583a.f27647a[enumC11651f.ordinal()]) {
            case 1:
                return this.f27645j;
            case 2:
                return m11154h0();
            case 3:
                if (m11154h0() < 0) {
                    double mo10166a = (mo10166a() / 1.0E9d) + EnumC11651f.m7350c(m11155g0()) + (this.f27645j - 63072000);
                    long floor = (long) Math.floor(mo10166a);
                    if (Double.compare(1.0E9d - ((mo10166a - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        m11140v0 = 0;
                    } else {
                        m11140v0 = m11140v0(mo10166a, floor);
                    }
                    m11154h0 = (floor - 32) + 441763200;
                    if (m11140v0 - 184000000 < 0) {
                        m11154h0--;
                    }
                } else {
                    m11154h0 = m11154h0() + 441763200 + 10;
                }
                if (m11154h0 >= 0) {
                    return m11154h0;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                long m11154h02 = m11154h0();
                if (C11648d.m7361w().m7371E(m11154h02) >= 315964800) {
                    if (!C11648d.m7361w().m7373C()) {
                        m11154h02 += 9;
                    }
                    return m11154h02 - 252892809;
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f27645j < 63072000) {
                    double m7350c = EnumC11651f.m7350c(m11155g0()) + (this.f27645j - 63072000) + (mo10166a() / 1.0E9d);
                    long floor2 = (long) Math.floor(m7350c);
                    if (Double.compare(1.0E9d - ((m7350c - floor2) * 1.0E9d), 1.0d) < 0) {
                        return floor2 + 1;
                    }
                    return floor2;
                }
                long m11154h03 = m11154h0() + 42;
                if (mo10166a() + 184000000 >= 1000000000) {
                    return m11154h03 + 1;
                }
                return m11154h03;
            case 6:
                long j = this.f27645j;
                if (j < 63072000) {
                    return j - 63072000;
                }
                return (long) Math.floor(m11153i0());
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + enumC11651f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10582a0)) {
            return false;
        }
        C10582a0 c10582a0 = (C10582a0) obj;
        if (this.f27645j != c10582a0.f27645j) {
            return false;
        }
        if (C11648d.m7361w().m7373C()) {
            if (this.f27646k == c10582a0.f27646k) {
                return true;
            }
            return false;
        } else if (mo10166a() == c10582a0.mo10166a()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: f0 */
    public C10582a0 mo10477w() {
        return this;
    }

    @Override // p288pj.InterfaceC11652g
    /* renamed from: g */
    public int mo7348g(EnumC11651f enumC11651f) {
        long m11154h0;
        int mo10166a;
        int m11140v0;
        switch (C10583a.f27647a[enumC11651f.ordinal()]) {
            case 1:
            case 2:
                return mo10166a();
            case 3:
                if (m11154h0() < 0) {
                    double mo10166a2 = (mo10166a() / 1.0E9d) + EnumC11651f.m7350c(m11155g0()) + (this.f27645j - 63072000);
                    long floor = (long) Math.floor(mo10166a2);
                    if (Double.compare(1.0E9d - ((mo10166a2 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        m11140v0 = 0;
                    } else {
                        m11140v0 = m11140v0(mo10166a2, floor);
                    }
                    m11154h0 = (floor - 32) + 441763200;
                    mo10166a = m11140v0 - 184000000;
                    if (mo10166a < 0) {
                        m11154h0--;
                        mo10166a += 1000000000;
                    }
                } else {
                    m11154h0 = m11154h0() + 441763200;
                    mo10166a = mo10166a();
                }
                if (m11154h0 >= 0) {
                    return mo10166a;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                if (C11648d.m7361w().m7371E(m11154h0()) >= 315964800) {
                    return mo10166a();
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f27645j < 63072000) {
                    double m7350c = EnumC11651f.m7350c(m11155g0()) + (this.f27645j - 63072000) + (mo10166a() / 1.0E9d);
                    long floor2 = (long) Math.floor(m7350c);
                    if (Double.compare(1.0E9d - ((m7350c - floor2) * 1.0E9d), 1.0d) < 0) {
                        return 0;
                    }
                    return m11140v0(m7350c, floor2);
                }
                int mo10166a3 = mo10166a() + 184000000;
                if (mo10166a3 >= 1000000000) {
                    return mo10166a3 - 1000000000;
                }
                return mo10166a3;
            case 6:
                if (this.f27645j < 63072000) {
                    return mo10166a();
                }
                double m11153i0 = m11153i0();
                return m11140v0(m11153i0, (long) Math.floor(m11153i0));
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + enumC11651f);
        }
    }

    public int hashCode() {
        long j = this.f27645j;
        return (((int) (j ^ (j >>> 32))) * 19) + (mo10166a() * 37);
    }

    @Override // net.time4j.base.InterfaceC10620f
    /* renamed from: k */
    public long mo10164k() {
        return this.f27645j;
    }

    /* renamed from: l0 */
    public C10613b1 m11150l0(InterfaceC10808k interfaceC10808k) {
        return C10613b1.m11055j(this, AbstractC10809l.m10149N(interfaceC10808k));
    }

    /* renamed from: m0 */
    public boolean m11149m0(InterfaceC11652g interfaceC11652g) {
        if (compareTo(m11157e0(interfaceC11652g)) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public boolean m11148n0() {
        return m11147o0() && C11648d.m7361w().m7373C();
    }

    /* renamed from: r0 */
    public C10582a0 m11144r0(long j, EnumC10781n0 enumC10781n0) {
        C10582a0 m11146p0;
        m11163Y(this);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return this;
        }
        try {
            int i2 = C10583a.f27648b[enumC10781n0.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    long m11036f = C10616c.m11036f(mo10166a(), j);
                    int m11038d = C10616c.m11038d(m11036f, 1000000000);
                    long m11040b = C10616c.m11040b(m11036f, 1000000000);
                    if (C11648d.m7361w().m7373C()) {
                        m11146p0 = new C10582a0(C10616c.m11036f(m11154h0(), m11040b), m11038d, EnumC11651f.UTC);
                    } else {
                        m11146p0 = m11146p0(C10616c.m11036f(this.f27645j, m11040b), m11038d, EnumC11651f.POSIX);
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } else if (C11648d.m7361w().m7373C()) {
                m11146p0 = new C10582a0(C10616c.m11036f(m11154h0(), j), mo10166a(), EnumC11651f.UTC);
            } else {
                m11146p0 = m11146p0(C10616c.m11036f(this.f27645j, j), mo10166a(), EnumC11651f.POSIX);
            }
            if (i < 0) {
                m11163Y(m11146p0);
            }
            return m11146p0;
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: t0 */
    public <C extends AbstractC7655l<C>> C10790r<C> m11142t0(C7651j<C> c7651j, String str, InterfaceC10808k interfaceC10808k, AbstractC7638f0 abstractC7638f0) {
        C10722h0 m11138x0 = m11138x0(interfaceC10808k);
        return C10790r.m10219b(m11138x0.m20146K(abstractC7638f0.mo20199b(m11138x0.m10496Z(), interfaceC10808k), EnumC10704g.f27926l).m10496Z().m20129W(c7651j.m20113p(), str), m11138x0.m10493b0());
    }

    public String toString() {
        return m11139w0(true);
    }

    /* renamed from: u0 */
    public <C extends AbstractC7658m<?, C>> C10790r<C> m11141u0(C7672x<C> c7672x, InterfaceC10808k interfaceC10808k, AbstractC7638f0 abstractC7638f0) {
        C10722h0 m11138x0 = m11138x0(interfaceC10808k);
        return C10790r.m10216e(m11138x0.m20146K(abstractC7638f0.mo20199b(m11138x0.m10496Z(), interfaceC10808k), EnumC10704g.f27926l).m10496Z().m20128X(c7672x.m20113p()), m11138x0.m10493b0());
    }

    /* renamed from: x0 */
    public C10722h0 m11138x0(InterfaceC10808k interfaceC10808k) {
        return m11151k0(AbstractC10809l.m10149N(interfaceC10808k));
    }

    private C10582a0(long j, int i, EnumC11651f enumC11651f) {
        int i2;
        long j2;
        long m7366p;
        long j3 = j;
        int i3 = i;
        if (enumC11651f == EnumC11651f.POSIX) {
            this.f27645j = j3;
            this.f27646k = i3;
        } else {
            C11648d m7361w = C11648d.m7361w();
            if (m7361w.m7373C()) {
                if (enumC11651f != EnumC11651f.UTC) {
                    if (enumC11651f == EnumC11651f.TAI) {
                        if (j3 < 0) {
                            throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + j3);
                        } else if (j3 < 441763200) {
                            long m11036f = C10616c.m11036f(j3, -441763168L);
                            int m11037e = C10616c.m11037e(i3, 184000000);
                            if (m11037e >= 1000000000) {
                                m11036f = C10616c.m11036f(m11036f, 1L);
                                m11037e = C10616c.m11030l(m11037e, 1000000000);
                            }
                            double d = m11036f + (m11037e / 1.0E9d);
                            double m7350c = d - EnumC11651f.m7350c(C10697f0.m10707R0(C10616c.m11040b((long) (d - 42.184d), 86400), EnumC7627a0.UTC));
                            j2 = (long) Math.floor(m7350c);
                            i2 = m11140v0(m7350c, j2);
                        } else {
                            i2 = i3;
                            j2 = C10616c.m11029m(j3, 441763210L);
                        }
                    } else if (enumC11651f == EnumC11651f.GPS) {
                        long m11036f2 = C10616c.m11036f(j3, 252892809L);
                        if (m11036f2 < 252892809) {
                            throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + j3);
                        }
                        i2 = i3;
                        j2 = m11036f2;
                    } else if (enumC11651f == EnumC11651f.TT) {
                        int i4 = (j3 > 42L ? 1 : (j3 == 42L ? 0 : -1));
                        if (i4 >= 0 && (i4 != 0 || i3 >= 184000000)) {
                            j3 = C10616c.m11029m(j3, 42L);
                            i3 = C10616c.m11030l(i3, 184000000);
                            if (i3 < 0) {
                                j3 = C10616c.m11029m(j3, 1L);
                                i3 = C10616c.m11037e(i3, 1000000000);
                            }
                        } else {
                            double d2 = j3 + (i3 / 1.0E9d);
                            double m7350c2 = d2 - EnumC11651f.m7350c(C10697f0.m10707R0(C10616c.m11040b((long) (d2 - 42.184d), 86400), EnumC7627a0.UTC));
                            j2 = (long) Math.floor(m7350c2);
                            i2 = m11140v0(m7350c2, j2);
                        }
                    } else if (enumC11651f != EnumC11651f.UT) {
                        throw new UnsupportedOperationException("Not yet implemented: " + enumC11651f.name());
                    } else if (j3 >= 0) {
                        double m7350c3 = ((j3 + (i3 / 1.0E9d)) + EnumC11651f.m7350c(C10697f0.m10707R0(C10616c.m11040b(j3, 86400), EnumC7627a0.UTC))) - 42.184d;
                        j2 = (long) Math.floor(m7350c3);
                        i2 = m11140v0(m7350c3, j2);
                    }
                    long m7371E = m7361w.m7371E(j2);
                    m7366p = j2 - m7361w.m7366p(m7371E);
                    this.f27645j = m7371E;
                    if (m7366p != 0 || m7371E == f27632m) {
                        this.f27646k = i2;
                    } else if (m7366p == 1) {
                        this.f27646k = 1073741824 | i2;
                    } else {
                        throw new IllegalStateException("Cannot handle leap shift of " + j3 + ".");
                    }
                    i3 = i2;
                }
                i2 = i3;
                j2 = j3;
                long m7371E2 = m7361w.m7371E(j2);
                m7366p = j2 - m7361w.m7366p(m7371E2);
                this.f27645j = m7371E2;
                if (m7366p != 0) {
                }
                this.f27646k = i2;
                i3 = i2;
            } else {
                throw new IllegalStateException("Leap seconds are not supported by configuration.");
            }
        }
        m11160b0(this.f27645j);
        m11162Z(i3);
    }

    private C10582a0(int i, long j) {
        m11160b0(j);
        this.f27645j = j;
        this.f27646k = i;
    }
}