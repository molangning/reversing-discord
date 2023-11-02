package p401w9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC13433a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);
    

    /* renamed from: y */
    private static final AbstractC13442e0 f34662y;

    /* renamed from: j */
    private final int f34664j;

    static {
        EnumC13433a[] values;
        C13440d0 c13440d0 = new C13440d0();
        for (EnumC13433a enumC13433a : values()) {
            c13440d0.m2487a(Integer.valueOf(enumC13433a.f34664j), enumC13433a);
        }
        f34662y = c13440d0.m2486b();
    }

    EnumC13433a(int i) {
        this.f34664j = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC13433a m2497a(int i) {
        AbstractC13442e0 abstractC13442e0 = f34662y;
        Integer valueOf = Integer.valueOf(i);
        if (!abstractC13442e0.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (EnumC13433a) abstractC13442e0.get(valueOf);
    }
}
