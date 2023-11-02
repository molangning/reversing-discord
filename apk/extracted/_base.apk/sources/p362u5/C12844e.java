package p362u5;

import p362u5.AbstractC12858k;

/* renamed from: u5.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12844e extends AbstractC12858k {

    /* renamed from: a */
    private final AbstractC12858k.EnumC12860b f33400a;

    /* renamed from: b */
    private final AbstractC12831a f33401b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u5.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12846b extends AbstractC12858k.AbstractC12859a {

        /* renamed from: a */
        private AbstractC12858k.EnumC12860b f33402a;

        /* renamed from: b */
        private AbstractC12831a f33403b;

        @Override // p362u5.AbstractC12858k.AbstractC12859a
        /* renamed from: a */
        public AbstractC12858k mo3805a() {
            return new C12844e(this.f33402a, this.f33403b);
        }

        @Override // p362u5.AbstractC12858k.AbstractC12859a
        /* renamed from: b */
        public AbstractC12858k.AbstractC12859a mo3804b(AbstractC12831a abstractC12831a) {
            this.f33403b = abstractC12831a;
            return this;
        }

        @Override // p362u5.AbstractC12858k.AbstractC12859a
        /* renamed from: c */
        public AbstractC12858k.AbstractC12859a mo3803c(AbstractC12858k.EnumC12860b enumC12860b) {
            this.f33402a = enumC12860b;
            return this;
        }
    }

    @Override // p362u5.AbstractC12858k
    /* renamed from: b */
    public AbstractC12831a mo3807b() {
        return this.f33401b;
    }

    @Override // p362u5.AbstractC12858k
    /* renamed from: c */
    public AbstractC12858k.EnumC12860b mo3806c() {
        return this.f33400a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12858k)) {
            return false;
        }
        AbstractC12858k abstractC12858k = (AbstractC12858k) obj;
        AbstractC12858k.EnumC12860b enumC12860b = this.f33400a;
        if (enumC12860b != null ? enumC12860b.equals(abstractC12858k.mo3806c()) : abstractC12858k.mo3806c() == null) {
            AbstractC12831a abstractC12831a = this.f33401b;
            if (abstractC12831a == null) {
                if (abstractC12858k.mo3807b() == null) {
                    return true;
                }
            } else if (abstractC12831a.equals(abstractC12858k.mo3807b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC12858k.EnumC12860b enumC12860b = this.f33400a;
        int i = 0;
        if (enumC12860b == null) {
            hashCode = 0;
        } else {
            hashCode = enumC12860b.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC12831a abstractC12831a = this.f33401b;
        if (abstractC12831a != null) {
            i = abstractC12831a.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f33400a + ", androidClientInfo=" + this.f33401b + "}";
    }

    private C12844e(AbstractC12858k.EnumC12860b enumC12860b, AbstractC12831a abstractC12831a) {
        this.f33400a = enumC12860b;
        this.f33401b = abstractC12831a;
    }
}
