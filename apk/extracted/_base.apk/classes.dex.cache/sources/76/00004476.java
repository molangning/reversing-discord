package net.time4j;

import p162ij.AbstractC7654k0;

/* renamed from: net.time4j.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class EnumC10704g implements InterfaceC10841v {

    /* renamed from: j */
    public static final EnumC10704g f27924j;

    /* renamed from: k */
    public static final EnumC10704g f27925k;

    /* renamed from: l */
    public static final EnumC10704g f27926l;

    /* renamed from: m */
    public static final EnumC10704g f27927m;

    /* renamed from: n */
    public static final EnumC10704g f27928n;

    /* renamed from: o */
    public static final EnumC10704g f27929o;

    /* renamed from: p */
    private static final long[] f27930p;

    /* renamed from: q */
    private static final /* synthetic */ EnumC10704g[] f27931q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum C10705a extends EnumC10704g {
        C10705a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.InterfaceC10843w
        /* renamed from: a */
        public char mo10005a() {
            return 'H';
        }

        @Override // p162ij.InterfaceC7671w
        public double getLength() {
            return 3600.0d;
        }
    }

    static {
        C10705a c10705a = new C10705a("HOURS", 0);
        f27924j = c10705a;
        EnumC10704g enumC10704g = new EnumC10704g("MINUTES", 1) { // from class: net.time4j.g.b
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'M';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 60.0d;
            }
        };
        f27925k = enumC10704g;
        EnumC10704g enumC10704g2 = new EnumC10704g("SECONDS", 2) { // from class: net.time4j.g.c
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return 'S';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 1.0d;
            }
        };
        f27926l = enumC10704g2;
        EnumC10704g enumC10704g3 = new EnumC10704g("MILLIS", 3) { // from class: net.time4j.g.d
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return '3';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 0.001d;
            }
        };
        f27927m = enumC10704g3;
        EnumC10704g enumC10704g4 = new EnumC10704g("MICROS", 4) { // from class: net.time4j.g.e
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return '6';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 1.0E-6d;
            }
        };
        f27928n = enumC10704g4;
        EnumC10704g enumC10704g5 = new EnumC10704g("NANOS", 5) { // from class: net.time4j.g.f
            @Override // net.time4j.InterfaceC10843w
            /* renamed from: a */
            public char mo10005a() {
                return '9';
            }

            @Override // p162ij.InterfaceC7671w
            public double getLength() {
                return 1.0E-9d;
            }
        };
        f27929o = enumC10704g5;
        f27931q = new EnumC10704g[]{c10705a, enumC10704g, enumC10704g2, enumC10704g3, enumC10704g4, enumC10704g5};
        f27930p = new long[]{1, 60, 3600, 3600000, 3600000000L, 3600000000000L};
    }

    private EnumC10704g(String str, int i) {
        super(str, i);
    }

    public static EnumC10704g valueOf(String str) {
        return (EnumC10704g) Enum.valueOf(EnumC10704g.class, str);
    }

    public static EnumC10704g[] values() {
        return (EnumC10704g[]) f27931q.clone();
    }

    @Override // p162ij.InterfaceC7671w
    /* renamed from: b */
    public boolean mo10004b() {
        return false;
    }

    /* renamed from: c */
    public <T extends AbstractC7654k0<? super EnumC10704g, T>> long m10624c(T t, T t2) {
        return t.m20144M(t2, this);
    }

    /* synthetic */ EnumC10704g(String str, int i, C10705a c10705a) {
        this(str, i);
    }
}