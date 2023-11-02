package p251nj;

/* renamed from: nj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC10916b {
    PROLEPTIC_JULIAN,
    PROLEPTIC_GREGORIAN,
    SWEDEN,
    INTRODUCTION_ON_1582_10_15,
    SINGLE_CUTOVER_DATE,
    PROLEPTIC_BYZANTINE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nj.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C10917a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28653a;

        static {
            int[] iArr = new int[EnumC10916b.values().length];
            f28653a = iArr;
            try {
                iArr[EnumC10916b.PROLEPTIC_JULIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28653a[EnumC10916b.PROLEPTIC_GREGORIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28653a[EnumC10916b.SWEDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28653a[EnumC10916b.INTRODUCTION_ON_1582_10_15.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28653a[EnumC10916b.PROLEPTIC_BYZANTINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public int m9556a() {
        int i = C10917a.f28653a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return i != 5 ? 0 : 3;
                    }
                    return 7;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }
}