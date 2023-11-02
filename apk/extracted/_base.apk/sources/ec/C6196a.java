package ec;

import p353tb.InterfaceC12628c;
import p353tb.InterfaceC12629d;

/* renamed from: ec.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6196a {

    /* renamed from: p */
    private static final C6196a f17525p = new C6197a().m23301a();

    /* renamed from: a */
    private final long f17526a;

    /* renamed from: b */
    private final String f17527b;

    /* renamed from: c */
    private final String f17528c;

    /* renamed from: d */
    private final EnumC6199c f17529d;

    /* renamed from: e */
    private final EnumC6200d f17530e;

    /* renamed from: f */
    private final String f17531f;

    /* renamed from: g */
    private final String f17532g;

    /* renamed from: h */
    private final int f17533h;

    /* renamed from: i */
    private final int f17534i;

    /* renamed from: j */
    private final String f17535j;

    /* renamed from: k */
    private final long f17536k;

    /* renamed from: l */
    private final EnumC6198b f17537l;

    /* renamed from: m */
    private final String f17538m;

    /* renamed from: n */
    private final long f17539n;

    /* renamed from: o */
    private final String f17540o;

    /* renamed from: ec.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6197a {

        /* renamed from: a */
        private long f17541a = 0;

        /* renamed from: b */
        private String f17542b = "";

        /* renamed from: c */
        private String f17543c = "";

        /* renamed from: d */
        private EnumC6199c f17544d = EnumC6199c.UNKNOWN;

        /* renamed from: e */
        private EnumC6200d f17545e = EnumC6200d.UNKNOWN_OS;

        /* renamed from: f */
        private String f17546f = "";

        /* renamed from: g */
        private String f17547g = "";

        /* renamed from: h */
        private int f17548h = 0;

        /* renamed from: i */
        private int f17549i = 0;

        /* renamed from: j */
        private String f17550j = "";

        /* renamed from: k */
        private long f17551k = 0;

        /* renamed from: l */
        private EnumC6198b f17552l = EnumC6198b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f17553m = "";

        /* renamed from: n */
        private long f17554n = 0;

        /* renamed from: o */
        private String f17555o = "";

        C6197a() {
        }

        /* renamed from: a */
        public C6196a m23301a() {
            return new C6196a(this.f17541a, this.f17542b, this.f17543c, this.f17544d, this.f17545e, this.f17546f, this.f17547g, this.f17548h, this.f17549i, this.f17550j, this.f17551k, this.f17552l, this.f17553m, this.f17554n, this.f17555o);
        }

        /* renamed from: b */
        public C6197a m23300b(String str) {
            this.f17553m = str;
            return this;
        }

        /* renamed from: c */
        public C6197a m23299c(String str) {
            this.f17547g = str;
            return this;
        }

        /* renamed from: d */
        public C6197a m23298d(String str) {
            this.f17555o = str;
            return this;
        }

        /* renamed from: e */
        public C6197a m23297e(EnumC6198b enumC6198b) {
            this.f17552l = enumC6198b;
            return this;
        }

        /* renamed from: f */
        public C6197a m23296f(String str) {
            this.f17543c = str;
            return this;
        }

        /* renamed from: g */
        public C6197a m23295g(String str) {
            this.f17542b = str;
            return this;
        }

        /* renamed from: h */
        public C6197a m23294h(EnumC6199c enumC6199c) {
            this.f17544d = enumC6199c;
            return this;
        }

        /* renamed from: i */
        public C6197a m23293i(String str) {
            this.f17546f = str;
            return this;
        }

        /* renamed from: j */
        public C6197a m23292j(long j) {
            this.f17541a = j;
            return this;
        }

        /* renamed from: k */
        public C6197a m23291k(EnumC6200d enumC6200d) {
            this.f17545e = enumC6200d;
            return this;
        }

        /* renamed from: l */
        public C6197a m23290l(String str) {
            this.f17550j = str;
            return this;
        }

        /* renamed from: m */
        public C6197a m23289m(int i) {
            this.f17549i = i;
            return this;
        }
    }

    /* renamed from: ec.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC6198b implements InterfaceC12628c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: j */
        private final int f17560j;

        EnumC6198b(int i) {
            this.f17560j = i;
        }

        @Override // p353tb.InterfaceC12628c
        public int getNumber() {
            return this.f17560j;
        }
    }

    /* renamed from: ec.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC6199c implements InterfaceC12628c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: j */
        private final int f17566j;

        EnumC6199c(int i) {
            this.f17566j = i;
        }

        @Override // p353tb.InterfaceC12628c
        public int getNumber() {
            return this.f17566j;
        }
    }

    /* renamed from: ec.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC6200d implements InterfaceC12628c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: j */
        private final int f17572j;

        EnumC6200d(int i) {
            this.f17572j = i;
        }

        @Override // p353tb.InterfaceC12628c
        public int getNumber() {
            return this.f17572j;
        }
    }

    C6196a(long j, String str, String str2, EnumC6199c enumC6199c, EnumC6200d enumC6200d, String str3, String str4, int i, int i2, String str5, long j2, EnumC6198b enumC6198b, String str6, long j3, String str7) {
        this.f17526a = j;
        this.f17527b = str;
        this.f17528c = str2;
        this.f17529d = enumC6199c;
        this.f17530e = enumC6200d;
        this.f17531f = str3;
        this.f17532g = str4;
        this.f17533h = i;
        this.f17534i = i2;
        this.f17535j = str5;
        this.f17536k = j2;
        this.f17537l = enumC6198b;
        this.f17538m = str6;
        this.f17539n = j3;
        this.f17540o = str7;
    }

    /* renamed from: p */
    public static C6197a m23302p() {
        return new C6197a();
    }

    @InterfaceC12629d(tag = 13)
    /* renamed from: a */
    public String m23317a() {
        return this.f17538m;
    }

    @InterfaceC12629d(tag = 11)
    /* renamed from: b */
    public long m23316b() {
        return this.f17536k;
    }

    @InterfaceC12629d(tag = 14)
    /* renamed from: c */
    public long m23315c() {
        return this.f17539n;
    }

    @InterfaceC12629d(tag = 7)
    /* renamed from: d */
    public String m23314d() {
        return this.f17532g;
    }

    @InterfaceC12629d(tag = 15)
    /* renamed from: e */
    public String m23313e() {
        return this.f17540o;
    }

    @InterfaceC12629d(tag = 12)
    /* renamed from: f */
    public EnumC6198b m23312f() {
        return this.f17537l;
    }

    @InterfaceC12629d(tag = 3)
    /* renamed from: g */
    public String m23311g() {
        return this.f17528c;
    }

    @InterfaceC12629d(tag = 2)
    /* renamed from: h */
    public String m23310h() {
        return this.f17527b;
    }

    @InterfaceC12629d(tag = 4)
    /* renamed from: i */
    public EnumC6199c m23309i() {
        return this.f17529d;
    }

    @InterfaceC12629d(tag = 6)
    /* renamed from: j */
    public String m23308j() {
        return this.f17531f;
    }

    @InterfaceC12629d(tag = 8)
    /* renamed from: k */
    public int m23307k() {
        return this.f17533h;
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: l */
    public long m23306l() {
        return this.f17526a;
    }

    @InterfaceC12629d(tag = 5)
    /* renamed from: m */
    public EnumC6200d m23305m() {
        return this.f17530e;
    }

    @InterfaceC12629d(tag = 10)
    /* renamed from: n */
    public String m23304n() {
        return this.f17535j;
    }

    @InterfaceC12629d(tag = 9)
    /* renamed from: o */
    public int m23303o() {
        return this.f17534i;
    }
}
