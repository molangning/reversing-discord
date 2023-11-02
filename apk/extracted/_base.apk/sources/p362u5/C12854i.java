package p362u5;

import p362u5.AbstractC12866o;

/* renamed from: u5.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12854i extends AbstractC12866o {

    /* renamed from: a */
    private final AbstractC12866o.EnumC12869c f33433a;

    /* renamed from: b */
    private final AbstractC12866o.EnumC12868b f33434b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u5.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12856b extends AbstractC12866o.AbstractC12867a {

        /* renamed from: a */
        private AbstractC12866o.EnumC12869c f33435a;

        /* renamed from: b */
        private AbstractC12866o.EnumC12868b f33436b;

        @Override // p362u5.AbstractC12866o.AbstractC12867a
        /* renamed from: a */
        public AbstractC12866o mo3760a() {
            return new C12854i(this.f33435a, this.f33436b);
        }

        @Override // p362u5.AbstractC12866o.AbstractC12867a
        /* renamed from: b */
        public AbstractC12866o.AbstractC12867a mo3759b(AbstractC12866o.EnumC12868b enumC12868b) {
            this.f33436b = enumC12868b;
            return this;
        }

        @Override // p362u5.AbstractC12866o.AbstractC12867a
        /* renamed from: c */
        public AbstractC12866o.AbstractC12867a mo3758c(AbstractC12866o.EnumC12869c enumC12869c) {
            this.f33435a = enumC12869c;
            return this;
        }
    }

    @Override // p362u5.AbstractC12866o
    /* renamed from: b */
    public AbstractC12866o.EnumC12868b mo3762b() {
        return this.f33434b;
    }

    @Override // p362u5.AbstractC12866o
    /* renamed from: c */
    public AbstractC12866o.EnumC12869c mo3761c() {
        return this.f33433a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12866o)) {
            return false;
        }
        AbstractC12866o abstractC12866o = (AbstractC12866o) obj;
        AbstractC12866o.EnumC12869c enumC12869c = this.f33433a;
        if (enumC12869c != null ? enumC12869c.equals(abstractC12866o.mo3761c()) : abstractC12866o.mo3761c() == null) {
            AbstractC12866o.EnumC12868b enumC12868b = this.f33434b;
            if (enumC12868b == null) {
                if (abstractC12866o.mo3762b() == null) {
                    return true;
                }
            } else if (enumC12868b.equals(abstractC12866o.mo3762b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC12866o.EnumC12869c enumC12869c = this.f33433a;
        int i = 0;
        if (enumC12869c == null) {
            hashCode = 0;
        } else {
            hashCode = enumC12869c.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC12866o.EnumC12868b enumC12868b = this.f33434b;
        if (enumC12868b != null) {
            i = enumC12868b.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f33433a + ", mobileSubtype=" + this.f33434b + "}";
    }

    private C12854i(AbstractC12866o.EnumC12869c enumC12869c, AbstractC12866o.EnumC12868b enumC12868b) {
        this.f33433a = enumC12869c;
        this.f33434b = enumC12868b;
    }
}
