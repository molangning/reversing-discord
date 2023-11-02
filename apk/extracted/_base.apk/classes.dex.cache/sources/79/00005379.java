package p465zd;

import android.hardware.camera2.CameraCharacteristics;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m14357d2 = {"Lzd/c;", "", "", "", "j", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "o", "p", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14152c {
    LEGACY("legacy"),
    LIMITED("limited"),
    EXTERNAL("external"),
    FULL("full"),
    LEVEL_3("level-3");
    

    /* renamed from: k */
    public static final C14153a f36411k = new C14153a(null);

    /* renamed from: j */
    private final String f36418j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m14357d2 = {"Lzd/c$a;", "", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "Lzd/c;", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14153a {
        private C14153a() {
        }

        public /* synthetic */ C14153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14152c m557a(CameraCharacteristics cameraCharacteristics) {
            C9612q.m13917h(cameraCharacteristics, "cameraCharacteristics");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null && num.intValue() == 2) {
                return EnumC14152c.LEGACY;
            }
            if (num != null && num.intValue() == 0) {
                return EnumC14152c.LIMITED;
            }
            if (num != null && num.intValue() == 4) {
                return EnumC14152c.EXTERNAL;
            }
            if (num != null && num.intValue() == 1) {
                return EnumC14152c.FULL;
            }
            if (num != null && num.intValue() == 3) {
                return EnumC14152c.LEVEL_3;
            }
            return EnumC14152c.LEGACY;
        }
    }

    EnumC14152c(String str) {
        this.f36418j = str;
    }

    /* renamed from: b */
    public String m558b() {
        return this.f36418j;
    }
}