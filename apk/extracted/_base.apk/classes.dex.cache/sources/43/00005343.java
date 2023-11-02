package p458z5;

import p353tb.InterfaceC12629d;

/* renamed from: z5.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14098e {

    /* renamed from: c */
    private static final C14098e f36277c = new C14099a().m672a();

    /* renamed from: a */
    private final long f36278a;

    /* renamed from: b */
    private final long f36279b;

    /* renamed from: z5.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14099a {

        /* renamed from: a */
        private long f36280a = 0;

        /* renamed from: b */
        private long f36281b = 0;

        C14099a() {
        }

        /* renamed from: a */
        public C14098e m672a() {
            return new C14098e(this.f36280a, this.f36281b);
        }

        /* renamed from: b */
        public C14099a m671b(long j) {
            this.f36280a = j;
            return this;
        }

        /* renamed from: c */
        public C14099a m670c(long j) {
            this.f36281b = j;
            return this;
        }
    }

    C14098e(long j, long j2) {
        this.f36278a = j;
        this.f36279b = j2;
    }

    /* renamed from: c */
    public static C14099a m673c() {
        return new C14099a();
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: a */
    public long m675a() {
        return this.f36278a;
    }

    @InterfaceC12629d(tag = 2)
    /* renamed from: b */
    public long m674b() {
        return this.f36279b;
    }
}