package p073e1;

/* renamed from: e1.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public enum EnumC6090w0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: e1.w0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C6091a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17345a;

        static {
            int[] iArr = new int[EnumC6090w0.values().length];
            f17345a = iArr;
            try {
                iArr[EnumC6090w0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17345a[EnumC6090w0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17345a[EnumC6090w0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: b */
    public boolean m23588b(int i, boolean z, int i2) {
        int i3 = C6091a.f17345a[ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return (z && i < 28) || i2 > 4 || i <= 25;
            }
            return true;
        }
        return false;
    }
}
