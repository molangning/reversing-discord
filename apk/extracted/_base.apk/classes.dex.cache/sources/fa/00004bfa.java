package p326rh;

/* renamed from: rh.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12234z {

    /* renamed from: a */
    static final int f31808a = m5679c(1, 3);

    /* renamed from: b */
    static final int f31809b = m5679c(1, 4);

    /* renamed from: c */
    static final int f31810c = m5679c(2, 0);

    /* renamed from: d */
    static final int f31811d = m5679c(3, 2);

    /* renamed from: rh.z$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class EnumC12236b {

        /* renamed from: A */
        public static final EnumC12236b f31812A;

        /* renamed from: B */
        public static final EnumC12236b f31813B;

        /* renamed from: C */
        public static final EnumC12236b f31814C;

        /* renamed from: D */
        private static final /* synthetic */ EnumC12236b[] f31815D;

        /* renamed from: l */
        public static final EnumC12236b f31816l;

        /* renamed from: m */
        public static final EnumC12236b f31817m;

        /* renamed from: n */
        public static final EnumC12236b f31818n;

        /* renamed from: o */
        public static final EnumC12236b f31819o;

        /* renamed from: p */
        public static final EnumC12236b f31820p;

        /* renamed from: q */
        public static final EnumC12236b f31821q;

        /* renamed from: r */
        public static final EnumC12236b f31822r;

        /* renamed from: s */
        public static final EnumC12236b f31823s;

        /* renamed from: t */
        public static final EnumC12236b f31824t;

        /* renamed from: u */
        public static final EnumC12236b f31825u;

        /* renamed from: v */
        public static final EnumC12236b f31826v;

        /* renamed from: w */
        public static final EnumC12236b f31827w;

        /* renamed from: x */
        public static final EnumC12236b f31828x;

        /* renamed from: y */
        public static final EnumC12236b f31829y;

        /* renamed from: z */
        public static final EnumC12236b f31830z;

        /* renamed from: j */
        private final EnumC12241c f31831j;

        /* renamed from: k */
        private final int f31832k;

        /* renamed from: rh.z$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        enum C12237a extends EnumC12236b {
            C12237a(String str, int i, EnumC12241c enumC12241c, int i2) {
                super(str, i, enumC12241c, i2);
            }

            @Override // p326rh.C12234z.EnumC12236b
            /* renamed from: c */
            public boolean mo5676c() {
                return false;
            }
        }

        /* renamed from: rh.z$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        enum C12238b extends EnumC12236b {
            C12238b(String str, int i, EnumC12241c enumC12241c, int i2) {
                super(str, i, enumC12241c, i2);
            }

            @Override // p326rh.C12234z.EnumC12236b
            /* renamed from: c */
            public boolean mo5676c() {
                return false;
            }
        }

        /* renamed from: rh.z$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        enum C12239c extends EnumC12236b {
            C12239c(String str, int i, EnumC12241c enumC12241c, int i2) {
                super(str, i, enumC12241c, i2);
            }

            @Override // p326rh.C12234z.EnumC12236b
            /* renamed from: c */
            public boolean mo5676c() {
                return false;
            }
        }

        /* renamed from: rh.z$b$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        enum C12240d extends EnumC12236b {
            C12240d(String str, int i, EnumC12241c enumC12241c, int i2) {
                super(str, i, enumC12241c, i2);
            }

            @Override // p326rh.C12234z.EnumC12236b
            /* renamed from: c */
            public boolean mo5676c() {
                return false;
            }
        }

        static {
            EnumC12236b enumC12236b = new EnumC12236b("DOUBLE", 0, EnumC12241c.DOUBLE, 1);
            f31816l = enumC12236b;
            EnumC12236b enumC12236b2 = new EnumC12236b("FLOAT", 1, EnumC12241c.FLOAT, 5);
            f31817m = enumC12236b2;
            EnumC12241c enumC12241c = EnumC12241c.LONG;
            EnumC12236b enumC12236b3 = new EnumC12236b("INT64", 2, enumC12241c, 0);
            f31818n = enumC12236b3;
            EnumC12236b enumC12236b4 = new EnumC12236b("UINT64", 3, enumC12241c, 0);
            f31819o = enumC12236b4;
            EnumC12241c enumC12241c2 = EnumC12241c.INT;
            EnumC12236b enumC12236b5 = new EnumC12236b("INT32", 4, enumC12241c2, 0);
            f31820p = enumC12236b5;
            EnumC12236b enumC12236b6 = new EnumC12236b("FIXED64", 5, enumC12241c, 1);
            f31821q = enumC12236b6;
            EnumC12236b enumC12236b7 = new EnumC12236b("FIXED32", 6, enumC12241c2, 5);
            f31822r = enumC12236b7;
            EnumC12236b enumC12236b8 = new EnumC12236b("BOOL", 7, EnumC12241c.BOOLEAN, 0);
            f31823s = enumC12236b8;
            C12237a c12237a = new C12237a("STRING", 8, EnumC12241c.STRING, 2);
            f31824t = c12237a;
            EnumC12241c enumC12241c3 = EnumC12241c.MESSAGE;
            C12238b c12238b = new C12238b("GROUP", 9, enumC12241c3, 3);
            f31825u = c12238b;
            C12239c c12239c = new C12239c("MESSAGE", 10, enumC12241c3, 2);
            f31826v = c12239c;
            C12240d c12240d = new C12240d("BYTES", 11, EnumC12241c.BYTE_STRING, 2);
            f31827w = c12240d;
            EnumC12236b enumC12236b9 = new EnumC12236b("UINT32", 12, enumC12241c2, 0);
            f31828x = enumC12236b9;
            EnumC12236b enumC12236b10 = new EnumC12236b("ENUM", 13, EnumC12241c.ENUM, 0);
            f31829y = enumC12236b10;
            EnumC12236b enumC12236b11 = new EnumC12236b("SFIXED32", 14, enumC12241c2, 5);
            f31830z = enumC12236b11;
            EnumC12236b enumC12236b12 = new EnumC12236b("SFIXED64", 15, enumC12241c, 1);
            f31812A = enumC12236b12;
            EnumC12236b enumC12236b13 = new EnumC12236b("SINT32", 16, enumC12241c2, 0);
            f31813B = enumC12236b13;
            EnumC12236b enumC12236b14 = new EnumC12236b("SINT64", 17, enumC12241c, 0);
            f31814C = enumC12236b14;
            f31815D = new EnumC12236b[]{enumC12236b, enumC12236b2, enumC12236b3, enumC12236b4, enumC12236b5, enumC12236b6, enumC12236b7, enumC12236b8, c12237a, c12238b, c12239c, c12240d, enumC12236b9, enumC12236b10, enumC12236b11, enumC12236b12, enumC12236b13, enumC12236b14};
        }

        public static EnumC12236b valueOf(String str) {
            return (EnumC12236b) Enum.valueOf(EnumC12236b.class, str);
        }

        public static EnumC12236b[] values() {
            return (EnumC12236b[]) f31815D.clone();
        }

        /* renamed from: a */
        public EnumC12241c m5678a() {
            return this.f31831j;
        }

        /* renamed from: b */
        public int m5677b() {
            return this.f31832k;
        }

        /* renamed from: c */
        public boolean mo5676c() {
            return true;
        }

        private EnumC12236b(String str, int i, EnumC12241c enumC12241c, int i2) {
            super(str, i);
            this.f31831j = enumC12241c;
            this.f31832k = i2;
        }
    }

    /* renamed from: rh.z$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC12241c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC12177d.f31693j),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: j */
        private final Object f31843j;

        EnumC12241c(Object obj) {
            this.f31843j = obj;
        }
    }

    /* renamed from: a */
    public static int m5681a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m5680b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    public static int m5679c(int i, int i2) {
        return (i << 3) | i2;
    }
}