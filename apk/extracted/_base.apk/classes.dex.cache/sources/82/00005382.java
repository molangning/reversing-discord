package p465zd;

import com.mrousavy.camera.C5340x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0004\u001a\u00020\u0003R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m14357d2 = {"Lzd/g;", "", "", "", "c", "", "j", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "o", "p", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14161g {
    YUV("yuv"),
    RGB("rgb"),
    DNG("dng"),
    NATIVE("native"),
    UNKNOWN("unknown");
    

    /* renamed from: k */
    public static final C14162a f36439k = new C14162a(null);

    /* renamed from: j */
    private final String f36446j;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, m14357d2 = {"Lzd/g$a;", "", "Lzd/g;", "", "imageFormat", "a", "", "unionValue", "b", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14162a {
        private C14162a() {
        }

        public /* synthetic */ C14162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14161g m541a(int i) {
            if (i != 32) {
                if (i != 256 && i != 1768253795) {
                    if (i != 34) {
                        if (i != 35) {
                            return EnumC14161g.UNKNOWN;
                        }
                        return EnumC14161g.YUV;
                    }
                    return EnumC14161g.NATIVE;
                }
                return EnumC14161g.RGB;
            }
            return EnumC14161g.DNG;
        }

        /* renamed from: b */
        public EnumC14161g m540b(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1052618729:
                        if (str.equals("native")) {
                            return EnumC14161g.NATIVE;
                        }
                        break;
                    case -284840886:
                        if (str.equals("unknown")) {
                            return EnumC14161g.UNKNOWN;
                        }
                        break;
                    case 99613:
                        if (str.equals("dng")) {
                            return EnumC14161g.DNG;
                        }
                        break;
                    case 112845:
                        if (str.equals("rgb")) {
                            return EnumC14161g.RGB;
                        }
                        break;
                    case 120026:
                        if (str.equals("yuv")) {
                            return EnumC14161g.YUV;
                        }
                        break;
                }
            }
            return null;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: zd.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C14163b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36447a;

        static {
            int[] iArr = new int[EnumC14161g.values().length];
            try {
                iArr[EnumC14161g.YUV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14161g.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14161g.DNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14161g.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC14161g.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f36447a = iArr;
        }
    }

    EnumC14161g(String str) {
        this.f36446j = str;
    }

    /* renamed from: b */
    public String m543b() {
        return this.f36446j;
    }

    /* renamed from: c */
    public final int m542c() {
        Integer num;
        int i = C14163b.f36447a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            num = null;
                        } else {
                            throw new C11581q();
                        }
                    } else {
                        num = 34;
                    }
                } else {
                    num = 32;
                }
            } else {
                num = 256;
            }
        } else {
            num = 35;
        }
        if (num != null) {
            return num.intValue();
        }
        throw new C5340x(m543b());
    }
}