package p362u5;

import java.util.List;
import p362u5.AbstractC12863m;

/* renamed from: u5.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12850g extends AbstractC12863m {

    /* renamed from: a */
    private final long f33418a;

    /* renamed from: b */
    private final long f33419b;

    /* renamed from: c */
    private final AbstractC12858k f33420c;

    /* renamed from: d */
    private final Integer f33421d;

    /* renamed from: e */
    private final String f33422e;

    /* renamed from: f */
    private final List<AbstractC12861l> f33423f;

    /* renamed from: g */
    private final EnumC12870p f33424g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u5.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12852b extends AbstractC12863m.AbstractC12864a {

        /* renamed from: a */
        private Long f33425a;

        /* renamed from: b */
        private Long f33426b;

        /* renamed from: c */
        private AbstractC12858k f33427c;

        /* renamed from: d */
        private Integer f33428d;

        /* renamed from: e */
        private String f33429e;

        /* renamed from: f */
        private List<AbstractC12861l> f33430f;

        /* renamed from: g */
        private EnumC12870p f33431g;

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: a */
        public AbstractC12863m mo3776a() {
            String str = "";
            if (this.f33425a == null) {
                str = " requestTimeMs";
            }
            if (this.f33426b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C12850g(this.f33425a.longValue(), this.f33426b.longValue(), this.f33427c, this.f33428d, this.f33429e, this.f33430f, this.f33431g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: b */
        public AbstractC12863m.AbstractC12864a mo3775b(AbstractC12858k abstractC12858k) {
            this.f33427c = abstractC12858k;
            return this;
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: c */
        public AbstractC12863m.AbstractC12864a mo3774c(List<AbstractC12861l> list) {
            this.f33430f = list;
            return this;
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: d */
        AbstractC12863m.AbstractC12864a mo3773d(Integer num) {
            this.f33428d = num;
            return this;
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: e */
        AbstractC12863m.AbstractC12864a mo3772e(String str) {
            this.f33429e = str;
            return this;
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: f */
        public AbstractC12863m.AbstractC12864a mo3771f(EnumC12870p enumC12870p) {
            this.f33431g = enumC12870p;
            return this;
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: g */
        public AbstractC12863m.AbstractC12864a mo3770g(long j) {
            this.f33425a = Long.valueOf(j);
            return this;
        }

        @Override // p362u5.AbstractC12863m.AbstractC12864a
        /* renamed from: h */
        public AbstractC12863m.AbstractC12864a mo3769h(long j) {
            this.f33426b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: b */
    public AbstractC12858k mo3783b() {
        return this.f33420c;
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: c */
    public List<AbstractC12861l> mo3782c() {
        return this.f33423f;
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: d */
    public Integer mo3781d() {
        return this.f33421d;
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: e */
    public String mo3780e() {
        return this.f33422e;
    }

    public boolean equals(Object obj) {
        AbstractC12858k abstractC12858k;
        Integer num;
        String str;
        List<AbstractC12861l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12863m)) {
            return false;
        }
        AbstractC12863m abstractC12863m = (AbstractC12863m) obj;
        if (this.f33418a == abstractC12863m.mo3778g() && this.f33419b == abstractC12863m.mo3777h() && ((abstractC12858k = this.f33420c) != null ? abstractC12858k.equals(abstractC12863m.mo3783b()) : abstractC12863m.mo3783b() == null) && ((num = this.f33421d) != null ? num.equals(abstractC12863m.mo3781d()) : abstractC12863m.mo3781d() == null) && ((str = this.f33422e) != null ? str.equals(abstractC12863m.mo3780e()) : abstractC12863m.mo3780e() == null) && ((list = this.f33423f) != null ? list.equals(abstractC12863m.mo3782c()) : abstractC12863m.mo3782c() == null)) {
            EnumC12870p enumC12870p = this.f33424g;
            if (enumC12870p == null) {
                if (abstractC12863m.mo3779f() == null) {
                    return true;
                }
            } else if (enumC12870p.equals(abstractC12863m.mo3779f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: f */
    public EnumC12870p mo3779f() {
        return this.f33424g;
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: g */
    public long mo3778g() {
        return this.f33418a;
    }

    @Override // p362u5.AbstractC12863m
    /* renamed from: h */
    public long mo3777h() {
        return this.f33419b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.f33418a;
        long j2 = this.f33419b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC12858k abstractC12858k = this.f33420c;
        int i2 = 0;
        if (abstractC12858k == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC12858k.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.f33421d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.f33422e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List<AbstractC12861l> list = this.f33423f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        EnumC12870p enumC12870p = this.f33424g;
        if (enumC12870p != null) {
            i2 = enumC12870p.hashCode();
        }
        return i6 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f33418a + ", requestUptimeMs=" + this.f33419b + ", clientInfo=" + this.f33420c + ", logSource=" + this.f33421d + ", logSourceName=" + this.f33422e + ", logEvents=" + this.f33423f + ", qosTier=" + this.f33424g + "}";
    }

    private C12850g(long j, long j2, AbstractC12858k abstractC12858k, Integer num, String str, List<AbstractC12861l> list, EnumC12870p enumC12870p) {
        this.f33418a = j;
        this.f33419b = j2;
        this.f33420c = abstractC12858k;
        this.f33421d = num;
        this.f33422e = str;
        this.f33423f = list;
        this.f33424g = enumC12870p;
    }
}
