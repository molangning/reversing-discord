package p030bc;

import p030bc.AbstractC2267f;

/* renamed from: bc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2259b extends AbstractC2267f {

    /* renamed from: a */
    private final String f6362a;

    /* renamed from: b */
    private final long f6363b;

    /* renamed from: c */
    private final AbstractC2267f.EnumC2269b f6364c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2261b extends AbstractC2267f.AbstractC2268a {

        /* renamed from: a */
        private String f6365a;

        /* renamed from: b */
        private Long f6366b;

        /* renamed from: c */
        private AbstractC2267f.EnumC2269b f6367c;

        @Override // p030bc.AbstractC2267f.AbstractC2268a
        /* renamed from: a */
        public AbstractC2267f mo33710a() {
            String str = "";
            if (this.f6366b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2259b(this.f6365a, this.f6366b.longValue(), this.f6367c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p030bc.AbstractC2267f.AbstractC2268a
        /* renamed from: b */
        public AbstractC2267f.AbstractC2268a mo33709b(AbstractC2267f.EnumC2269b enumC2269b) {
            this.f6367c = enumC2269b;
            return this;
        }

        @Override // p030bc.AbstractC2267f.AbstractC2268a
        /* renamed from: c */
        public AbstractC2267f.AbstractC2268a mo33708c(String str) {
            this.f6365a = str;
            return this;
        }

        @Override // p030bc.AbstractC2267f.AbstractC2268a
        /* renamed from: d */
        public AbstractC2267f.AbstractC2268a mo33707d(long j) {
            this.f6366b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p030bc.AbstractC2267f
    /* renamed from: b */
    public AbstractC2267f.EnumC2269b mo33713b() {
        return this.f6364c;
    }

    @Override // p030bc.AbstractC2267f
    /* renamed from: c */
    public String mo33712c() {
        return this.f6362a;
    }

    @Override // p030bc.AbstractC2267f
    /* renamed from: d */
    public long mo33711d() {
        return this.f6363b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2267f)) {
            return false;
        }
        AbstractC2267f abstractC2267f = (AbstractC2267f) obj;
        String str = this.f6362a;
        if (str != null ? str.equals(abstractC2267f.mo33712c()) : abstractC2267f.mo33712c() == null) {
            if (this.f6363b == abstractC2267f.mo33711d()) {
                AbstractC2267f.EnumC2269b enumC2269b = this.f6364c;
                if (enumC2269b == null) {
                    if (abstractC2267f.mo33713b() == null) {
                        return true;
                    }
                } else if (enumC2269b.equals(abstractC2267f.mo33713b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f6362a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f6363b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC2267f.EnumC2269b enumC2269b = this.f6364c;
        if (enumC2269b != null) {
            i = enumC2269b.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f6362a + ", tokenExpirationTimestamp=" + this.f6363b + ", responseCode=" + this.f6364c + "}";
    }

    private C2259b(String str, long j, AbstractC2267f.EnumC2269b enumC2269b) {
        this.f6362a = str;
        this.f6363b = j;
        this.f6364c = enumC2269b;
    }
}
