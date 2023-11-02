package p362u5;

import java.util.Arrays;
import p362u5.AbstractC12861l;

/* renamed from: u5.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12847f extends AbstractC12861l {

    /* renamed from: a */
    private final long f33404a;

    /* renamed from: b */
    private final Integer f33405b;

    /* renamed from: c */
    private final long f33406c;

    /* renamed from: d */
    private final byte[] f33407d;

    /* renamed from: e */
    private final String f33408e;

    /* renamed from: f */
    private final long f33409f;

    /* renamed from: g */
    private final AbstractC12866o f33410g;

    /* renamed from: u5.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12849b extends AbstractC12861l.AbstractC12862a {

        /* renamed from: a */
        private Long f33411a;

        /* renamed from: b */
        private Integer f33412b;

        /* renamed from: c */
        private Long f33413c;

        /* renamed from: d */
        private byte[] f33414d;

        /* renamed from: e */
        private String f33415e;

        /* renamed from: f */
        private Long f33416f;

        /* renamed from: g */
        private AbstractC12866o f33417g;

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: a */
        public AbstractC12861l mo3792a() {
            String str = "";
            if (this.f33411a == null) {
                str = " eventTimeMs";
            }
            if (this.f33413c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f33416f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C12847f(this.f33411a.longValue(), this.f33412b, this.f33413c.longValue(), this.f33414d, this.f33415e, this.f33416f.longValue(), this.f33417g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: b */
        public AbstractC12861l.AbstractC12862a mo3791b(Integer num) {
            this.f33412b = num;
            return this;
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: c */
        public AbstractC12861l.AbstractC12862a mo3790c(long j) {
            this.f33411a = Long.valueOf(j);
            return this;
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: d */
        public AbstractC12861l.AbstractC12862a mo3789d(long j) {
            this.f33413c = Long.valueOf(j);
            return this;
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: e */
        public AbstractC12861l.AbstractC12862a mo3788e(AbstractC12866o abstractC12866o) {
            this.f33417g = abstractC12866o;
            return this;
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: f */
        AbstractC12861l.AbstractC12862a mo3787f(byte[] bArr) {
            this.f33414d = bArr;
            return this;
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: g */
        AbstractC12861l.AbstractC12862a mo3786g(String str) {
            this.f33415e = str;
            return this;
        }

        @Override // p362u5.AbstractC12861l.AbstractC12862a
        /* renamed from: h */
        public AbstractC12861l.AbstractC12862a mo3785h(long j) {
            this.f33416f = Long.valueOf(j);
            return this;
        }
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: b */
    public Integer mo3801b() {
        return this.f33405b;
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: c */
    public long mo3800c() {
        return this.f33404a;
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: d */
    public long mo3799d() {
        return this.f33406c;
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: e */
    public AbstractC12866o mo3798e() {
        return this.f33410g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] mo3797f;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12861l)) {
            return false;
        }
        AbstractC12861l abstractC12861l = (AbstractC12861l) obj;
        if (this.f33404a == abstractC12861l.mo3800c() && ((num = this.f33405b) != null ? num.equals(abstractC12861l.mo3801b()) : abstractC12861l.mo3801b() == null) && this.f33406c == abstractC12861l.mo3799d()) {
            byte[] bArr = this.f33407d;
            if (abstractC12861l instanceof C12847f) {
                mo3797f = ((C12847f) abstractC12861l).f33407d;
            } else {
                mo3797f = abstractC12861l.mo3797f();
            }
            if (Arrays.equals(bArr, mo3797f) && ((str = this.f33408e) != null ? str.equals(abstractC12861l.mo3796g()) : abstractC12861l.mo3796g() == null) && this.f33409f == abstractC12861l.mo3795h()) {
                AbstractC12866o abstractC12866o = this.f33410g;
                if (abstractC12866o == null) {
                    if (abstractC12861l.mo3798e() == null) {
                        return true;
                    }
                } else if (abstractC12866o.equals(abstractC12861l.mo3798e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: f */
    public byte[] mo3797f() {
        return this.f33407d;
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: g */
    public String mo3796g() {
        return this.f33408e;
    }

    @Override // p362u5.AbstractC12861l
    /* renamed from: h */
    public long mo3795h() {
        return this.f33409f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f33404a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f33405b;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.f33406c;
        int hashCode3 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f33407d)) * 1000003;
        String str = this.f33408e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j3 = this.f33409f;
        int i3 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC12866o abstractC12866o = this.f33410g;
        if (abstractC12866o != null) {
            i2 = abstractC12866o.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f33404a + ", eventCode=" + this.f33405b + ", eventUptimeMs=" + this.f33406c + ", sourceExtension=" + Arrays.toString(this.f33407d) + ", sourceExtensionJsonProto3=" + this.f33408e + ", timezoneOffsetSeconds=" + this.f33409f + ", networkConnectionInfo=" + this.f33410g + "}";
    }

    private C12847f(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC12866o abstractC12866o) {
        this.f33404a = j;
        this.f33405b = num;
        this.f33406c = j2;
        this.f33407d = bArr;
        this.f33408e = str;
        this.f33409f = j3;
        this.f33410g = abstractC12866o;
    }
}