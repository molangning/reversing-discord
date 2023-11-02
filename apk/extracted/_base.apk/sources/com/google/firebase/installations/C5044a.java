package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC5055g;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5044a extends AbstractC5055g {

    /* renamed from: a */
    private final String f14227a;

    /* renamed from: b */
    private final long f14228b;

    /* renamed from: c */
    private final long f14229c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5046b extends AbstractC5055g.AbstractC5056a {

        /* renamed from: a */
        private String f14230a;

        /* renamed from: b */
        private Long f14231b;

        /* renamed from: c */
        private Long f14232c;

        @Override // com.google.firebase.installations.AbstractC5055g.AbstractC5056a
        /* renamed from: a */
        public AbstractC5055g mo26404a() {
            String str = "";
            if (this.f14230a == null) {
                str = " token";
            }
            if (this.f14231b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f14232c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5044a(this.f14230a, this.f14231b.longValue(), this.f14232c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC5055g.AbstractC5056a
        /* renamed from: b */
        public AbstractC5055g.AbstractC5056a mo26403b(String str) {
            if (str != null) {
                this.f14230a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.AbstractC5055g.AbstractC5056a
        /* renamed from: c */
        public AbstractC5055g.AbstractC5056a mo26402c(long j) {
            this.f14232c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC5055g.AbstractC5056a
        /* renamed from: d */
        public AbstractC5055g.AbstractC5056a mo26401d(long j) {
            this.f14231b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC5055g
    /* renamed from: b */
    public String mo26407b() {
        return this.f14227a;
    }

    @Override // com.google.firebase.installations.AbstractC5055g
    /* renamed from: c */
    public long mo26406c() {
        return this.f14229c;
    }

    @Override // com.google.firebase.installations.AbstractC5055g
    /* renamed from: d */
    public long mo26405d() {
        return this.f14228b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5055g)) {
            return false;
        }
        AbstractC5055g abstractC5055g = (AbstractC5055g) obj;
        if (this.f14227a.equals(abstractC5055g.mo26407b()) && this.f14228b == abstractC5055g.mo26405d() && this.f14229c == abstractC5055g.mo26406c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f14228b;
        long j2 = this.f14229c;
        return ((((this.f14227a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f14227a + ", tokenExpirationTimestamp=" + this.f14228b + ", tokenCreationTimestamp=" + this.f14229c + "}";
    }

    private C5044a(String str, long j, long j2) {
        this.f14227a = str;
        this.f14228b = j;
        this.f14229c = j2;
    }
}
