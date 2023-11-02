package p381v5;

import java.util.Map;
import p381v5.AbstractC13093i;

/* renamed from: v5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13078b extends AbstractC13093i {

    /* renamed from: a */
    private final String f33895a;

    /* renamed from: b */
    private final Integer f33896b;

    /* renamed from: c */
    private final C13092h f33897c;

    /* renamed from: d */
    private final long f33898d;

    /* renamed from: e */
    private final long f33899e;

    /* renamed from: f */
    private final Map<String, String> f33900f;

    /* renamed from: v5.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13080b extends AbstractC13093i.AbstractC13094a {

        /* renamed from: a */
        private String f33901a;

        /* renamed from: b */
        private Integer f33902b;

        /* renamed from: c */
        private C13092h f33903c;

        /* renamed from: d */
        private Long f33904d;

        /* renamed from: e */
        private Long f33905e;

        /* renamed from: f */
        private Map<String, String> f33906f;

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: d */
        public AbstractC13093i mo3290d() {
            String str = "";
            if (this.f33901a == null) {
                str = " transportName";
            }
            if (this.f33903c == null) {
                str = str + " encodedPayload";
            }
            if (this.f33904d == null) {
                str = str + " eventMillis";
            }
            if (this.f33905e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f33906f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C13078b(this.f33901a, this.f33902b, this.f33903c, this.f33904d.longValue(), this.f33905e.longValue(), this.f33906f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: e */
        protected Map<String, String> mo3289e() {
            Map<String, String> map = this.f33906f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: f */
        public AbstractC13093i.AbstractC13094a mo3288f(Map<String, String> map) {
            if (map != null) {
                this.f33906f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: g */
        public AbstractC13093i.AbstractC13094a mo3287g(Integer num) {
            this.f33902b = num;
            return this;
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: h */
        public AbstractC13093i.AbstractC13094a mo3286h(C13092h c13092h) {
            if (c13092h != null) {
                this.f33903c = c13092h;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: i */
        public AbstractC13093i.AbstractC13094a mo3285i(long j) {
            this.f33904d = Long.valueOf(j);
            return this;
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: j */
        public AbstractC13093i.AbstractC13094a mo3284j(String str) {
            if (str != null) {
                this.f33901a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // p381v5.AbstractC13093i.AbstractC13094a
        /* renamed from: k */
        public AbstractC13093i.AbstractC13094a mo3283k(long j) {
            this.f33905e = Long.valueOf(j);
            return this;
        }
    }

    @Override // p381v5.AbstractC13093i
    /* renamed from: c */
    public Map<String, String> mo3303c() {
        return this.f33900f;
    }

    @Override // p381v5.AbstractC13093i
    /* renamed from: d */
    public Integer mo3302d() {
        return this.f33896b;
    }

    @Override // p381v5.AbstractC13093i
    /* renamed from: e */
    public C13092h mo3301e() {
        return this.f33897c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13093i)) {
            return false;
        }
        AbstractC13093i abstractC13093i = (AbstractC13093i) obj;
        if (this.f33895a.equals(abstractC13093i.mo3296j()) && ((num = this.f33896b) != null ? num.equals(abstractC13093i.mo3302d()) : abstractC13093i.mo3302d() == null) && this.f33897c.equals(abstractC13093i.mo3301e()) && this.f33898d == abstractC13093i.mo3300f() && this.f33899e == abstractC13093i.mo3295k() && this.f33900f.equals(abstractC13093i.mo3303c())) {
            return true;
        }
        return false;
    }

    @Override // p381v5.AbstractC13093i
    /* renamed from: f */
    public long mo3300f() {
        return this.f33898d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f33895a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f33896b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f33898d;
        long j2 = this.f33899e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f33897c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f33900f.hashCode();
    }

    @Override // p381v5.AbstractC13093i
    /* renamed from: j */
    public String mo3296j() {
        return this.f33895a;
    }

    @Override // p381v5.AbstractC13093i
    /* renamed from: k */
    public long mo3295k() {
        return this.f33899e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f33895a + ", code=" + this.f33896b + ", encodedPayload=" + this.f33897c + ", eventMillis=" + this.f33898d + ", uptimeMillis=" + this.f33899e + ", autoMetadata=" + this.f33900f + "}";
    }

    private C13078b(String str, Integer num, C13092h c13092h, long j, long j2, Map<String, String> map) {
        this.f33895a = str;
        this.f33896b = num;
        this.f33897c = c13092h;
        this.f33898d = j;
        this.f33899e = j2;
        this.f33900f = map;
    }
}