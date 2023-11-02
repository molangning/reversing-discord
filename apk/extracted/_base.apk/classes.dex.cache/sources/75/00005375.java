package p465zd;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m14357d2 = {"Lzd/a;", "", "", "", "j", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "o", "p", "q", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14148a {
    CAMERA_ALREADY_IN_USE("camera-already-in-use"),
    TOO_MANY_OPEN_CAMERAS("too-many-open-cameras"),
    CAMERA_IS_DISABLED_BY_ANDROID("camera-is-disabled-by-android"),
    UNKNOWN_CAMERA_DEVICE_ERROR("unknown-camera-device-error"),
    UNKNOWN_FATAL_CAMERA_SERVICE_ERROR("unknown-fatal-camera-service-error"),
    DISCONNECTED("camera-has-been-disconnected");
    

    /* renamed from: k */
    public static final C14149a f36396k = new C14149a(null);

    /* renamed from: j */
    private final String f36404j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m14357d2 = {"Lzd/a$a;", "", "", "cameraDeviceError", "Lzd/a;", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14149a {
        private C14149a() {
        }

        public /* synthetic */ C14149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14148a m562a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return EnumC14148a.UNKNOWN_CAMERA_DEVICE_ERROR;
                            }
                            return EnumC14148a.UNKNOWN_FATAL_CAMERA_SERVICE_ERROR;
                        }
                        return EnumC14148a.UNKNOWN_CAMERA_DEVICE_ERROR;
                    }
                    return EnumC14148a.CAMERA_IS_DISABLED_BY_ANDROID;
                }
                return EnumC14148a.TOO_MANY_OPEN_CAMERAS;
            }
            return EnumC14148a.CAMERA_ALREADY_IN_USE;
        }
    }

    EnumC14148a(String str) {
        this.f36404j = str;
    }
}