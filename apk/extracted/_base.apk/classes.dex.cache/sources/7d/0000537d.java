package p465zd;

import android.hardware.camera2.CameraCharacteristics;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m14357d2 = {"Lzd/e;", "", "", "", "c", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "d", "", "j", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "k", "a", "l", "m", "n", "o", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zd.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC14156e {
    PORTRAIT("portrait"),
    LANDSCAPE_RIGHT("landscape-right"),
    PORTRAIT_UPSIDE_DOWN("portrait-upside-down"),
    LANDSCAPE_LEFT("landscape-left");
    

    /* renamed from: k */
    public static final C14157a f36425k = new C14157a(null);

    /* renamed from: j */
    private final String f36431j;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, m14357d2 = {"Lzd/e$a;", "", "Lzd/e;", "", "unionValue", "b", "", "rotationDegrees", "a", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zd.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14157a {
        private C14157a() {
        }

        public /* synthetic */ C14157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC14156e m549a(int i) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (45 <= i && i < 136) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return EnumC14156e.LANDSCAPE_RIGHT;
            }
            if (135 <= i && i < 226) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return EnumC14156e.PORTRAIT_UPSIDE_DOWN;
            }
            if (225 > i || i >= 316) {
                z3 = false;
            }
            if (z3) {
                return EnumC14156e.LANDSCAPE_LEFT;
            }
            return EnumC14156e.PORTRAIT;
        }

        /* renamed from: b */
        public EnumC14156e m548b(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1510435861:
                        if (str.equals("portrait-upside-down")) {
                            return EnumC14156e.PORTRAIT_UPSIDE_DOWN;
                        }
                        break;
                    case 687313034:
                        if (str.equals("landscape-right")) {
                            return EnumC14156e.LANDSCAPE_RIGHT;
                        }
                        break;
                    case 729267099:
                        if (str.equals("portrait")) {
                            return EnumC14156e.PORTRAIT;
                        }
                        break;
                    case 1684556761:
                        if (str.equals("landscape-left")) {
                            return EnumC14156e.LANDSCAPE_LEFT;
                        }
                        break;
                }
            }
            return null;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: zd.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C14158b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36432a;

        static {
            int[] iArr = new int[EnumC14156e.values().length];
            try {
                iArr[EnumC14156e.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14156e.LANDSCAPE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14156e.PORTRAIT_UPSIDE_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14156e.LANDSCAPE_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f36432a = iArr;
        }
    }

    EnumC14156e(String str) {
        this.f36431j = str;
    }

    /* renamed from: b */
    public String m552b() {
        return this.f36431j;
    }

    /* renamed from: c */
    public final int m551c() {
        int i = C14158b.f36432a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 270;
                    }
                    throw new C11581q();
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    /* renamed from: d */
    public final EnumC14156e m550d(CameraCharacteristics cameraCharacteristics) {
        boolean z;
        C9612q.m13917h(cameraCharacteristics, "cameraCharacteristics");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        C9612q.m13920e(obj);
        int intValue = ((Number) obj).intValue();
        int m551c = m551c();
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m551c = -m551c;
        }
        return f36425k.m549a(((intValue + m551c) + 360) % 360);
    }
}