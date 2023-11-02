package p446yd;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import p465zd.EnumC14150b;
import p465zd.EnumC14156e;
import p465zd.EnumC14164h;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001aJ\u0010\u0014\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0015"}, m14357d2 = {"Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "b", "Landroid/hardware/camera2/CameraDevice;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/view/Surface;", "surface", "", "zoom", "Lzd/h;", "qualityPrioritization", "Lzd/b;", "flashMode", "enableRedEyeReduction", "enableAutoStabilization", "Lzd/e;", "orientation", "Landroid/hardware/camera2/CaptureRequest;", "a", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13996j {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: yd.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C13997a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35994a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f35995b;

        static {
            int[] iArr = new int[EnumC14164h.values().length];
            try {
                iArr[EnumC14164h.SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14164h.BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14164h.QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35994a = iArr;
            int[] iArr2 = new int[EnumC14150b.values().length];
            try {
                iArr2[EnumC14150b.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC14150b.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC14150b.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f35995b = iArr2;
        }
    }

    /* renamed from: a */
    public static final CaptureRequest m944a(CameraDevice cameraDevice, CameraManager cameraManager, Surface surface, float f, EnumC14164h qualityPrioritization, EnumC14150b flashMode, boolean z, boolean z2, EnumC14156e orientation) {
        int i;
        int i2;
        CaptureRequest.Key key;
        boolean z3;
        boolean z4;
        C9612q.m13917h(cameraDevice, "<this>");
        C9612q.m13917h(cameraManager, "cameraManager");
        C9612q.m13917h(surface, "surface");
        C9612q.m13917h(qualityPrioritization, "qualityPrioritization");
        C9612q.m13917h(flashMode, "flashMode");
        C9612q.m13917h(orientation, "orientation");
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraDevice.getId());
        C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(this.id)");
        if (qualityPrioritization == EnumC14164h.SPEED && m943b(cameraCharacteristics)) {
            i = 4;
        } else {
            i = 2;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i);
        C9612q.m13918g(createCaptureRequest, "this.createCaptureRequest(template)");
        int i3 = C13997a.f35994a[qualityPrioritization.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = 100;
                } else {
                    throw new C11581q();
                }
            } else {
                i2 = 92;
            }
        } else {
            i2 = 85;
        }
        createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) i2));
        createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(orientation.m551c()));
        int i4 = C13997a.f35995b[flashMode.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    if (z) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 4);
                    } else {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    }
                }
            } else {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            }
        } else {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        if (z2) {
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr != null) {
                z3 = C9538f.m14194w(iArr, 1);
            } else {
                z3 = false;
            }
            int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr2 != null) {
                z4 = C9538f.m14194w(iArr2, 1);
            } else {
                z4 = false;
            }
            if (z4) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                createCaptureRequest.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
            } else if (z3) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            key = CaptureRequest.CONTROL_ZOOM_RATIO;
            createCaptureRequest.set(key, Float.valueOf(f));
        } else {
            Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            C9612q.m13920e(obj);
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, C14003o.m936a((Rect) obj, f));
        }
        createCaptureRequest.addTarget(surface);
        CaptureRequest build = createCaptureRequest.build();
        C9612q.m13918g(build, "captureRequest.build()");
        return build;
    }

    /* renamed from: b */
    private static final boolean m943b(CameraCharacteristics cameraCharacteristics) {
        boolean m14194w;
        boolean m14194w2;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C9612q.m13920e(obj);
        if (((Number) obj).intValue() == 2) {
            return false;
        }
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        C9612q.m13920e(obj2);
        int[] iArr = (int[]) obj2;
        m14194w = C9538f.m14194w(iArr, 8);
        m14194w2 = C9538f.m14194w(iArr, 0);
        boolean z = !m14194w2;
        if (m14194w && !z) {
            return false;
        }
        return true;
    }
}
