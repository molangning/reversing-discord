package p458z5;

import p353tb.InterfaceC12629d;

/* renamed from: z5.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14100f {

    /* renamed from: c */
    private static final C14100f f36282c = new C14101a().m666a();

    /* renamed from: a */
    private final long f36283a;

    /* renamed from: b */
    private final long f36284b;

    /* renamed from: z5.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14101a {

        /* renamed from: a */
        private long f36285a = 0;

        /* renamed from: b */
        private long f36286b = 0;

        C14101a() {
        }

        /* renamed from: a */
        public C14100f m666a() {
            return new C14100f(this.f36285a, this.f36286b);
        }

        /* renamed from: b */
        public C14101a m665b(long j) {
            this.f36286b = j;
            return this;
        }

        /* renamed from: c */
        public C14101a m664c(long j) {
            this.f36285a = j;
            return this;
        }
    }

    C14100f(long j, long j2) {
        this.f36283a = j;
        this.f36284b = j2;
    }

    /* renamed from: c */
    public static C14101a m667c() {
        return new C14101a();
    }

    @InterfaceC12629d(tag = 2)
    /* renamed from: a */
    public long m669a() {
        return this.f36284b;
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: b */
    public long m668b() {
        return this.f36283a;
    }
}