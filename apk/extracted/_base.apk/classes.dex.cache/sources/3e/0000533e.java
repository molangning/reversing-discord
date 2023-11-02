package p458z5;

import p353tb.InterfaceC12628c;
import p353tb.InterfaceC12629d;

/* renamed from: z5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14093c {

    /* renamed from: c */
    private static final C14093c f36258c = new C14094a().m684a();

    /* renamed from: a */
    private final long f36259a;

    /* renamed from: b */
    private final EnumC14095b f36260b;

    /* renamed from: z5.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14094a {

        /* renamed from: a */
        private long f36261a = 0;

        /* renamed from: b */
        private EnumC14095b f36262b = EnumC14095b.REASON_UNKNOWN;

        C14094a() {
        }

        /* renamed from: a */
        public C14093c m684a() {
            return new C14093c(this.f36261a, this.f36262b);
        }

        /* renamed from: b */
        public C14094a m683b(long j) {
            this.f36261a = j;
            return this;
        }

        /* renamed from: c */
        public C14094a m682c(EnumC14095b enumC14095b) {
            this.f36262b = enumC14095b;
            return this;
        }
    }

    /* renamed from: z5.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC14095b implements InterfaceC12628c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: j */
        private final int f36271j;

        EnumC14095b(int i) {
            this.f36271j = i;
        }

        @Override // p353tb.InterfaceC12628c
        public int getNumber() {
            return this.f36271j;
        }
    }

    C14093c(long j, EnumC14095b enumC14095b) {
        this.f36259a = j;
        this.f36260b = enumC14095b;
    }

    /* renamed from: c */
    public static C14094a m685c() {
        return new C14094a();
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: a */
    public long m687a() {
        return this.f36259a;
    }

    @InterfaceC12629d(tag = 3)
    /* renamed from: b */
    public EnumC14095b m686b() {
        return this.f36260b;
    }
}