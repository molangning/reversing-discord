package p075e3;

/* renamed from: e3.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC6102e {
    YES,
    NO,
    UNSET;

    /* renamed from: e3.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C6103a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17363a;

        static {
            int[] iArr = new int[EnumC6102e.values().length];
            f17363a = iArr;
            try {
                iArr[EnumC6102e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17363a[EnumC6102e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17363a[EnumC6102e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: c */
    public static EnumC6102e m23573c(boolean z) {
        return z ? YES : NO;
    }

    /* renamed from: a */
    public boolean m23575a() {
        int i = C6103a.f17363a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        return false;
    }

    /* renamed from: b */
    public boolean m23574b() {
        return this != UNSET;
    }
}
