package ac;

import ac.AbstractC0145d;
import ac.C0143c;

/* renamed from: ac.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0139a extends AbstractC0145d {

    /* renamed from: b */
    private final String f521b;

    /* renamed from: c */
    private final C0143c.EnumC0144a f522c;

    /* renamed from: d */
    private final String f523d;

    /* renamed from: e */
    private final String f524e;

    /* renamed from: f */
    private final long f525f;

    /* renamed from: g */
    private final long f526g;

    /* renamed from: h */
    private final String f527h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0141b extends AbstractC0145d.AbstractC0146a {

        /* renamed from: a */
        private String f528a;

        /* renamed from: b */
        private C0143c.EnumC0144a f529b;

        /* renamed from: c */
        private String f530c;

        /* renamed from: d */
        private String f531d;

        /* renamed from: e */
        private Long f532e;

        /* renamed from: f */
        private Long f533f;

        /* renamed from: g */
        private String f534g;

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: a */
        public AbstractC0145d mo41078a() {
            String str = "";
            if (this.f529b == null) {
                str = " registrationStatus";
            }
            if (this.f532e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f533f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C0139a(this.f528a, this.f529b, this.f530c, this.f531d, this.f532e.longValue(), this.f533f.longValue(), this.f534g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: b */
        public AbstractC0145d.AbstractC0146a mo41077b(String str) {
            this.f530c = str;
            return this;
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: c */
        public AbstractC0145d.AbstractC0146a mo41076c(long j) {
            this.f532e = Long.valueOf(j);
            return this;
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: d */
        public AbstractC0145d.AbstractC0146a mo41075d(String str) {
            this.f528a = str;
            return this;
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: e */
        public AbstractC0145d.AbstractC0146a mo41074e(String str) {
            this.f534g = str;
            return this;
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: f */
        public AbstractC0145d.AbstractC0146a mo41073f(String str) {
            this.f531d = str;
            return this;
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: g */
        public AbstractC0145d.AbstractC0146a mo41072g(C0143c.EnumC0144a enumC0144a) {
            if (enumC0144a != null) {
                this.f529b = enumC0144a;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // ac.AbstractC0145d.AbstractC0146a
        /* renamed from: h */
        public AbstractC0145d.AbstractC0146a mo41071h(long j) {
            this.f533f = Long.valueOf(j);
            return this;
        }

        public C0141b() {
        }

        private C0141b(AbstractC0145d abstractC0145d) {
            this.f528a = abstractC0145d.mo41095d();
            this.f529b = abstractC0145d.mo41092g();
            this.f530c = abstractC0145d.mo41097b();
            this.f531d = abstractC0145d.mo41093f();
            this.f532e = Long.valueOf(abstractC0145d.mo41096c());
            this.f533f = Long.valueOf(abstractC0145d.mo41091h());
            this.f534g = abstractC0145d.mo41094e();
        }
    }

    @Override // ac.AbstractC0145d
    /* renamed from: b */
    public String mo41097b() {
        return this.f523d;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: c */
    public long mo41096c() {
        return this.f525f;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: d */
    public String mo41095d() {
        return this.f521b;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: e */
    public String mo41094e() {
        return this.f527h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0145d)) {
            return false;
        }
        AbstractC0145d abstractC0145d = (AbstractC0145d) obj;
        String str3 = this.f521b;
        if (str3 != null ? str3.equals(abstractC0145d.mo41095d()) : abstractC0145d.mo41095d() == null) {
            if (this.f522c.equals(abstractC0145d.mo41092g()) && ((str = this.f523d) != null ? str.equals(abstractC0145d.mo41097b()) : abstractC0145d.mo41097b() == null) && ((str2 = this.f524e) != null ? str2.equals(abstractC0145d.mo41093f()) : abstractC0145d.mo41093f() == null) && this.f525f == abstractC0145d.mo41096c() && this.f526g == abstractC0145d.mo41091h()) {
                String str4 = this.f527h;
                if (str4 == null) {
                    if (abstractC0145d.mo41094e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC0145d.mo41094e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: f */
    public String mo41093f() {
        return this.f524e;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: g */
    public C0143c.EnumC0144a mo41092g() {
        return this.f522c;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: h */
    public long mo41091h() {
        return this.f526g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f521b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f522c.hashCode()) * 1000003;
        String str2 = this.f523d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f524e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f525f;
        long j2 = this.f526g;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f527h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // ac.AbstractC0145d
    /* renamed from: n */
    public AbstractC0145d.AbstractC0146a mo41085n() {
        return new C0141b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f521b + ", registrationStatus=" + this.f522c + ", authToken=" + this.f523d + ", refreshToken=" + this.f524e + ", expiresInSecs=" + this.f525f + ", tokenCreationEpochInSecs=" + this.f526g + ", fisError=" + this.f527h + "}";
    }

    private C0139a(String str, C0143c.EnumC0144a enumC0144a, String str2, String str3, long j, long j2, String str4) {
        this.f521b = str;
        this.f522c = enumC0144a;
        this.f523d = str2;
        this.f524e = str3;
        this.f525f = j;
        this.f526g = j2;
        this.f527h = str4;
    }
}