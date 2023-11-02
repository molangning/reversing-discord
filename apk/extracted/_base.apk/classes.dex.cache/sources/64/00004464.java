package net.time4j;

import p162ij.AbstractC7654k0;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7659m0;
import p162ij.InterfaceC7664p;

/* renamed from: net.time4j.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class EnumC10686f implements InterfaceC10839u {

    /* renamed from: j */
    public static final EnumC10686f f27871j;

    /* renamed from: k */
    public static final EnumC10686f f27872k;

    /* renamed from: l */
    public static final EnumC10686f f27873l;

    /* renamed from: m */
    public static final EnumC10686f f27874m;

    /* renamed from: n */
    public static final EnumC10686f f27875n;

    /* renamed from: o */
    public static final EnumC10686f f27876o;

    /* renamed from: p */
    public static final EnumC10686f f27877p;

    /* renamed from: q */
    public static final EnumC10686f f27878q;

    /* renamed from: r */
    private static final /* synthetic */ EnumC10686f[] f27879r;

    /* renamed from: co */
    private final InterfaceC10839u f27880co;
    private final InterfaceC10839u eof;
    private final InterfaceC10839u joda;
    private final InterfaceC10839u kld;
    private final InterfaceC10839u nvd;

    /* renamed from: ui */
    private final InterfaceC10839u f27881ui;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum C10687a extends EnumC10686f {
        C10687a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.InterfaceC10843w
        /* renamed from: a */
        public char mo10005a() {
            return 'I';
        }

        @Override // p162ij.InterfaceC7671w
        public double getLength() {
            return 3.1556952E10d;
        }
    }

    /* renamed from: net.time4j.f$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10695i {

        /* renamed from: a */
        static final /* synthetic */ int[] f27882a;

        static {
            int[] iArr = new int[EnumC10686f.values().length];
            f27882a = iArr;
            try {
                iArr[EnumC10686f.f27877p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27882a[EnumC10686f.f27878q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27882a[EnumC10686f.f27871j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27882a[EnumC10686f.f27872k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27882a[EnumC10686f.f27873l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27882a[EnumC10686f.f27874m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27882a[EnumC10686f.f27875n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27882a[EnumC10686f.f27876o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: net.time4j.f$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10696j<T extends AbstractC7665q<T>> implements InterfaceC7659m0<T> {

        /* renamed from: a */
        private final EnumC10686f f27883a;

        /* renamed from: b */
        private final int f27884b;

        public C10696j(EnumC10686f enumC10686f) {
            this(enumC10686f, 0);
        }

        /* renamed from: e */
        private static long m10727e(C10697f0 c10697f0, C10697f0 c10697f02) {
            if (c10697f0.mo10482o() == c10697f02.mo10482o()) {
                return c10697f02.m10719G0() - c10697f0.m10719G0();
            }
            return c10697f02.m10718H0() - c10697f0.m10718H0();
        }

        /* renamed from: f */
        private long m10726f(C10697f0 c10697f0, C10697f0 c10697f02) {
            long m10717I0 = c10697f02.m10717I0() - c10697f0.m10717I0();
            int i = this.f27884b;
            if (i != 5 && i != 2 && i != 6) {
                int i2 = (m10717I0 > 0L ? 1 : (m10717I0 == 0L ? 0 : -1));
                if (i2 <= 0 || c10697f02.mo10480r() >= c10697f0.mo10480r()) {
                    if (i2 >= 0 || c10697f02.mo10480r() <= c10697f0.mo10480r()) {
                        return m10717I0;
                    }
                    return m10717I0 + 1;
                }
                return m10717I0 - 1;
            }
            EnumC10686f enumC10686f = EnumC10686f.f27876o;
            int i3 = (m10717I0 > 0L ? 1 : (m10717I0 == 0L ? 0 : -1));
            if (i3 <= 0 || !C10697f0.m10672x0(enumC10686f, c10697f0, m10717I0, i).m20132S(c10697f02)) {
                if (i3 >= 0 || !C10697f0.m10672x0(enumC10686f, c10697f0, m10717I0, this.f27884b).m20131U(c10697f02)) {
                    return m10717I0;
                }
                return m10717I0 + 1;
            }
            return m10717I0 - 1;
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: c */
        public T mo10475b(T t, long j) {
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            return (T) t.mo14419F(interfaceC7664p, C10697f0.m10672x0(this.f27883a, (C10697f0) t.mo10212i(interfaceC7664p), j, this.f27884b));
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: d */
        public long mo10476a(T t, T t2) {
            long m10727e;
            InterfaceC7664p<C10697f0> interfaceC7664p = C10697f0.f27906w;
            C10697f0 c10697f0 = (C10697f0) t.mo10212i(interfaceC7664p);
            C10697f0 c10697f02 = (C10697f0) t2.mo10212i(interfaceC7664p);
            switch (C10695i.f27882a[this.f27883a.ordinal()]) {
                case 1:
                    m10727e = m10727e(c10697f0, c10697f02) / 7;
                    break;
                case 2:
                    m10727e = m10727e(c10697f0, c10697f02);
                    break;
                case 3:
                    m10727e = m10726f(c10697f0, c10697f02) / 12000;
                    break;
                case 4:
                    m10727e = m10726f(c10697f0, c10697f02) / 1200;
                    break;
                case 5:
                    m10727e = m10726f(c10697f0, c10697f02) / 120;
                    break;
                case 6:
                    m10727e = m10726f(c10697f0, c10697f02) / 12;
                    break;
                case 7:
                    m10727e = m10726f(c10697f0, c10697f02) / 3;
                    break;
                case 8:
                    m10727e = m10726f(c10697f0, c10697f02);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f27883a.name());
            }
            int i = (m10727e > 0L ? 1 : (m10727e == 0L ? 0 : -1));
            if (i != 0) {
                InterfaceC7664p<C10711g0> interfaceC7664p2 = C10711g0.f27966x;
                if (t.mo10210q(interfaceC7664p2) && t2.mo10210q(interfaceC7664p2)) {
                    EnumC10686f enumC10686f = this.f27883a;
                    boolean z = true;
                    if (enumC10686f != EnumC10686f.f27878q && ((C10697f0) c10697f0.m20145L(m10727e, enumC10686f)).mo10712N(c10697f02) != 0) {
                        z = false;
                    }
                    if (z) {
                        C10711g0 c10711g0 = (C10711g0) t.mo10212i(interfaceC7664p2);
                        C10711g0 c10711g02 = (C10711g0) t2.mo10212i(interfaceC7664p2);
                        if (i > 0 && c10711g0.m10622B0(c10711g02)) {
                            return m10727e - 1;
                        }
                        if (i < 0 && c10711g0.m10621C0(c10711g02)) {
                            return m10727e + 1;
                        }
                        return m10727e;
                    }
                    return m10727e;
                }
                return m10727e;
            }
            return m10727e;
        }

        public C10696j(EnumC10686f enumC10686f, int i) {
            this.f27883a = enumC10686f;
            this.f27884b = i;
        }
    }

    static {
        C10687a c10687a = new C10687a("MILLENNIA", 0);
        f27871j = c10687a;
        EnumC10686f enumC10686f = new EnumC10686f("CENTURIES", 1) { // from class: net.time4j.f.b
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'C';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 3.1556952E9d;
            }
        };
        f27872k = enumC10686f;
        EnumC10686f enumC10686f2 = new EnumC10686f("DECADES", 2) { // from class: net.time4j.f.c
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'E';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 3.1556952E8d;
            }
        };
        f27873l = enumC10686f2;
        EnumC10686f enumC10686f3 = new EnumC10686f("YEARS", 3) { // from class: net.time4j.f.d
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'Y';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 3.1556952E7d;
            }
        };
        f27874m = enumC10686f3;
        EnumC10686f enumC10686f4 = new EnumC10686f("QUARTERS", 4) { // from class: net.time4j.f.e
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'Q';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 7889238.0d;
            }
        };
        f27875n = enumC10686f4;
        EnumC10686f enumC10686f5 = new EnumC10686f("MONTHS", 5) { // from class: net.time4j.f.f
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'M';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 2629746.0d;
            }
        };
        f27876o = enumC10686f5;
        EnumC10686f enumC10686f6 = new EnumC10686f("WEEKS", 6) { // from class: net.time4j.f.g
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'W';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 604800.0d;
            }
        };
        f27877p = enumC10686f6;
        EnumC10686f enumC10686f7 = new EnumC10686f("DAYS", 7) { // from class: net.time4j.f.h
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'D';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 86400.0d;
            }
        };
        f27878q = enumC10686f7;
        f27879r = new EnumC10686f[]{c10687a, enumC10686f, enumC10686f2, enumC10686f3, enumC10686f4, enumC10686f5, enumC10686f6, enumC10686f7};
    }

    private EnumC10686f(String str, int i) {
        super(str, i);
        this.eof = new C10685e0(this, 2);
        this.kld = new C10685e0(this, 5);
        this.f27881ui = new C10685e0(this, 4);
        this.nvd = new C10685e0(this, 1);
        this.f27880co = new C10685e0(this, 3);
        this.joda = new C10685e0(this, 6);
    }

    /* renamed from: d */
    public static InterfaceC10839u m10730d() {
        return C10844w0.f28299j;
    }

    public static EnumC10686f valueOf(String str) {
        return (EnumC10686f) Enum.valueOf(EnumC10686f.class, str);
    }

    public static EnumC10686f[] values() {
        return (EnumC10686f[]) f27879r.clone();
    }

    @Override // p162ij.InterfaceC7671w
    /* renamed from: b */
    public boolean mo10004b() {
        return true;
    }

    /* renamed from: c */
    public <T extends AbstractC7654k0<? super EnumC10686f, T>> long m10731c(T t, T t2) {
        return t.m20144M(t2, this);
    }

    /* synthetic */ EnumC10686f(String str, int i, C10687a c10687a) {
        this(str, i);
    }
}