package p078e6;

import p078e6.AbstractC6119e;

/* renamed from: e6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6109a extends AbstractC6119e {

    /* renamed from: b */
    private final long f17367b;

    /* renamed from: c */
    private final int f17368c;

    /* renamed from: d */
    private final int f17369d;

    /* renamed from: e */
    private final long f17370e;

    /* renamed from: f */
    private final int f17371f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e6.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6111b extends AbstractC6119e.AbstractC6120a {

        /* renamed from: a */
        private Long f17372a;

        /* renamed from: b */
        private Integer f17373b;

        /* renamed from: c */
        private Integer f17374c;

        /* renamed from: d */
        private Long f17375d;

        /* renamed from: e */
        private Integer f17376e;

        @Override // p078e6.AbstractC6119e.AbstractC6120a
        /* renamed from: a */
        AbstractC6119e mo23545a() {
            String str = "";
            if (this.f17372a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f17373b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f17374c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f17375d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f17376e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C6109a(this.f17372a.longValue(), this.f17373b.intValue(), this.f17374c.intValue(), this.f17375d.longValue(), this.f17376e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p078e6.AbstractC6119e.AbstractC6120a
        /* renamed from: b */
        AbstractC6119e.AbstractC6120a mo23544b(int i) {
            this.f17374c = Integer.valueOf(i);
            return this;
        }

        @Override // p078e6.AbstractC6119e.AbstractC6120a
        /* renamed from: c */
        AbstractC6119e.AbstractC6120a mo23543c(long j) {
            this.f17375d = Long.valueOf(j);
            return this;
        }

        @Override // p078e6.AbstractC6119e.AbstractC6120a
        /* renamed from: d */
        AbstractC6119e.AbstractC6120a mo23542d(int i) {
            this.f17373b = Integer.valueOf(i);
            return this;
        }

        @Override // p078e6.AbstractC6119e.AbstractC6120a
        /* renamed from: e */
        AbstractC6119e.AbstractC6120a mo23541e(int i) {
            this.f17376e = Integer.valueOf(i);
            return this;
        }

        @Override // p078e6.AbstractC6119e.AbstractC6120a
        /* renamed from: f */
        AbstractC6119e.AbstractC6120a mo23540f(long j) {
            this.f17372a = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p078e6.AbstractC6119e
    /* renamed from: b */
    public int mo23550b() {
        return this.f17369d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p078e6.AbstractC6119e
    /* renamed from: c */
    public long mo23549c() {
        return this.f17370e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p078e6.AbstractC6119e
    /* renamed from: d */
    public int mo23548d() {
        return this.f17368c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p078e6.AbstractC6119e
    /* renamed from: e */
    public int mo23547e() {
        return this.f17371f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6119e)) {
            return false;
        }
        AbstractC6119e abstractC6119e = (AbstractC6119e) obj;
        if (this.f17367b == abstractC6119e.mo23546f() && this.f17368c == abstractC6119e.mo23548d() && this.f17369d == abstractC6119e.mo23550b() && this.f17370e == abstractC6119e.mo23549c() && this.f17371f == abstractC6119e.mo23547e()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p078e6.AbstractC6119e
    /* renamed from: f */
    public long mo23546f() {
        return this.f17367b;
    }

    public int hashCode() {
        long j = this.f17367b;
        long j2 = this.f17370e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17368c) * 1000003) ^ this.f17369d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f17371f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f17367b + ", loadBatchSize=" + this.f17368c + ", criticalSectionEnterTimeoutMs=" + this.f17369d + ", eventCleanUpAge=" + this.f17370e + ", maxBlobByteSizePerRow=" + this.f17371f + "}";
    }

    private C6109a(long j, int i, int i2, long j2, int i3) {
        this.f17367b = j;
        this.f17368c = i;
        this.f17369d = i2;
        this.f17370e = j2;
        this.f17371f = i3;
    }
}
