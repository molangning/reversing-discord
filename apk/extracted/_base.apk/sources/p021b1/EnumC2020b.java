package p021b1;

/* renamed from: b1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public enum EnumC2020b {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT;

    /* renamed from: b1.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C2021a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5549a;

        static {
            int[] iArr = new int[EnumC2020b.values().length];
            f5549a = iArr;
            try {
                iArr[EnumC2020b.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5549a[EnumC2020b.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5549a[EnumC2020b.CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5549a[EnumC2020b.ATTRIBUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5549a[EnumC2020b.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5549a[EnumC2020b.GDPR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5549a[EnumC2020b.DISABLE_THIRD_PARTY_SHARING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5549a[EnumC2020b.AD_REVENUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5549a[EnumC2020b.SUBSCRIPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5549a[EnumC2020b.THIRD_PARTY_SHARING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5549a[EnumC2020b.MEASUREMENT_CONSENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C2021a.f5549a[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return "attribution";
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "disable_third_party_sharing";
            case 8:
                return "ad_revenue";
            case 9:
                return "subscription";
            case 10:
                return "third_party_sharing";
            case 11:
                return "measurement_consent";
            default:
                return "unknown";
        }
    }
}
