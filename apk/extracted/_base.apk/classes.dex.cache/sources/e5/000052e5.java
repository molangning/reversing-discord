package p446yd;

import kotlin.Metadata;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m14357d2 = {"Lyd/p;", "", "", "b", "<init>", "(Ljava/lang/String;I)V", "j", "k", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: yd.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14004p {
    REGULAR,
    HIGH_SPEED;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: yd.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C14005a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36003a;

        static {
            int[] iArr = new int[EnumC14004p.values().length];
            try {
                iArr[EnumC14004p.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14004p.HIGH_SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36003a = iArr;
        }
    }

    /* renamed from: b */
    public final int m934b() {
        int i = C14005a.f36003a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new C11581q();
        }
        return 0;
    }
}