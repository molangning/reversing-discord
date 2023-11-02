package p059d6;

import java.util.Set;
import p059d6.AbstractC5751f;

/* renamed from: d6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5746c extends AbstractC5751f.AbstractC5753b {

    /* renamed from: a */
    private final long f16529a;

    /* renamed from: b */
    private final long f16530b;

    /* renamed from: c */
    private final Set<AbstractC5751f.EnumC5755c> f16531c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d6.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5748b extends AbstractC5751f.AbstractC5753b.AbstractC5754a {

        /* renamed from: a */
        private Long f16532a;

        /* renamed from: b */
        private Long f16533b;

        /* renamed from: c */
        private Set<AbstractC5751f.EnumC5755c> f16534c;

        @Override // p059d6.AbstractC5751f.AbstractC5753b.AbstractC5754a
        /* renamed from: a */
        public AbstractC5751f.AbstractC5753b mo24561a() {
            String str = "";
            if (this.f16532a == null) {
                str = " delta";
            }
            if (this.f16533b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f16534c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C5746c(this.f16532a.longValue(), this.f16533b.longValue(), this.f16534c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p059d6.AbstractC5751f.AbstractC5753b.AbstractC5754a
        /* renamed from: b */
        public AbstractC5751f.AbstractC5753b.AbstractC5754a mo24560b(long j) {
            this.f16532a = Long.valueOf(j);
            return this;
        }

        @Override // p059d6.AbstractC5751f.AbstractC5753b.AbstractC5754a
        /* renamed from: c */
        public AbstractC5751f.AbstractC5753b.AbstractC5754a mo24559c(Set<AbstractC5751f.EnumC5755c> set) {
            if (set != null) {
                this.f16534c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // p059d6.AbstractC5751f.AbstractC5753b.AbstractC5754a
        /* renamed from: d */
        public AbstractC5751f.AbstractC5753b.AbstractC5754a mo24558d(long j) {
            this.f16533b = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p059d6.AbstractC5751f.AbstractC5753b
    /* renamed from: b */
    public long mo24564b() {
        return this.f16529a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p059d6.AbstractC5751f.AbstractC5753b
    /* renamed from: c */
    public Set<AbstractC5751f.EnumC5755c> mo24563c() {
        return this.f16531c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p059d6.AbstractC5751f.AbstractC5753b
    /* renamed from: d */
    public long mo24562d() {
        return this.f16530b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5751f.AbstractC5753b)) {
            return false;
        }
        AbstractC5751f.AbstractC5753b abstractC5753b = (AbstractC5751f.AbstractC5753b) obj;
        if (this.f16529a == abstractC5753b.mo24564b() && this.f16530b == abstractC5753b.mo24562d() && this.f16531c.equals(abstractC5753b.mo24563c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f16529a;
        long j2 = this.f16530b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f16531c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f16529a + ", maxAllowedDelay=" + this.f16530b + ", flags=" + this.f16531c + "}";
    }

    private C5746c(long j, long j2, Set<AbstractC5751f.EnumC5755c> set) {
        this.f16529a = j;
        this.f16530b = j2;
        this.f16531c = set;
    }
}