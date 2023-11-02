package p030bc;

import p030bc.AbstractC2263d;

/* renamed from: bc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2256a extends AbstractC2263d {

    /* renamed from: a */
    private final String f6352a;

    /* renamed from: b */
    private final String f6353b;

    /* renamed from: c */
    private final String f6354c;

    /* renamed from: d */
    private final AbstractC2267f f6355d;

    /* renamed from: e */
    private final AbstractC2263d.EnumC2265b f6356e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2258b extends AbstractC2263d.AbstractC2264a {

        /* renamed from: a */
        private String f6357a;

        /* renamed from: b */
        private String f6358b;

        /* renamed from: c */
        private String f6359c;

        /* renamed from: d */
        private AbstractC2267f f6360d;

        /* renamed from: e */
        private AbstractC2263d.EnumC2265b f6361e;

        @Override // p030bc.AbstractC2263d.AbstractC2264a
        /* renamed from: a */
        public AbstractC2263d mo33726a() {
            return new C2256a(this.f6357a, this.f6358b, this.f6359c, this.f6360d, this.f6361e);
        }

        @Override // p030bc.AbstractC2263d.AbstractC2264a
        /* renamed from: b */
        public AbstractC2263d.AbstractC2264a mo33725b(AbstractC2267f abstractC2267f) {
            this.f6360d = abstractC2267f;
            return this;
        }

        @Override // p030bc.AbstractC2263d.AbstractC2264a
        /* renamed from: c */
        public AbstractC2263d.AbstractC2264a mo33724c(String str) {
            this.f6358b = str;
            return this;
        }

        @Override // p030bc.AbstractC2263d.AbstractC2264a
        /* renamed from: d */
        public AbstractC2263d.AbstractC2264a mo33723d(String str) {
            this.f6359c = str;
            return this;
        }

        @Override // p030bc.AbstractC2263d.AbstractC2264a
        /* renamed from: e */
        public AbstractC2263d.AbstractC2264a mo33722e(AbstractC2263d.EnumC2265b enumC2265b) {
            this.f6361e = enumC2265b;
            return this;
        }

        @Override // p030bc.AbstractC2263d.AbstractC2264a
        /* renamed from: f */
        public AbstractC2263d.AbstractC2264a mo33721f(String str) {
            this.f6357a = str;
            return this;
        }
    }

    @Override // p030bc.AbstractC2263d
    /* renamed from: b */
    public AbstractC2267f mo33731b() {
        return this.f6355d;
    }

    @Override // p030bc.AbstractC2263d
    /* renamed from: c */
    public String mo33730c() {
        return this.f6353b;
    }

    @Override // p030bc.AbstractC2263d
    /* renamed from: d */
    public String mo33729d() {
        return this.f6354c;
    }

    @Override // p030bc.AbstractC2263d
    /* renamed from: e */
    public AbstractC2263d.EnumC2265b mo33728e() {
        return this.f6356e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2263d)) {
            return false;
        }
        AbstractC2263d abstractC2263d = (AbstractC2263d) obj;
        String str = this.f6352a;
        if (str != null ? str.equals(abstractC2263d.mo33727f()) : abstractC2263d.mo33727f() == null) {
            String str2 = this.f6353b;
            if (str2 != null ? str2.equals(abstractC2263d.mo33730c()) : abstractC2263d.mo33730c() == null) {
                String str3 = this.f6354c;
                if (str3 != null ? str3.equals(abstractC2263d.mo33729d()) : abstractC2263d.mo33729d() == null) {
                    AbstractC2267f abstractC2267f = this.f6355d;
                    if (abstractC2267f != null ? abstractC2267f.equals(abstractC2263d.mo33731b()) : abstractC2263d.mo33731b() == null) {
                        AbstractC2263d.EnumC2265b enumC2265b = this.f6356e;
                        if (enumC2265b == null) {
                            if (abstractC2263d.mo33728e() == null) {
                                return true;
                            }
                        } else if (enumC2265b.equals(abstractC2263d.mo33728e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p030bc.AbstractC2263d
    /* renamed from: f */
    public String mo33727f() {
        return this.f6352a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f6352a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f6353b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f6354c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        AbstractC2267f abstractC2267f = this.f6355d;
        if (abstractC2267f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC2267f.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        AbstractC2263d.EnumC2265b enumC2265b = this.f6356e;
        if (enumC2265b != null) {
            i = enumC2265b.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f6352a + ", fid=" + this.f6353b + ", refreshToken=" + this.f6354c + ", authToken=" + this.f6355d + ", responseCode=" + this.f6356e + "}";
    }

    private C2256a(String str, String str2, String str3, AbstractC2267f abstractC2267f, AbstractC2263d.EnumC2265b enumC2265b) {
        this.f6352a = str;
        this.f6353b = str2;
        this.f6354c = str3;
        this.f6355d = abstractC2267f;
        this.f6356e = enumC2265b;
    }
}
