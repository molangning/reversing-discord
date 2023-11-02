package p405wd;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p446yd.C13990f;
import p446yd.C14006q;
import p465zd.EnumC14152c;
import p465zd.EnumC14154d;
import p465zd.EnumC14156e;
import p465zd.EnumC14161g;
import p465zd.EnumC14174l;

@Metadata(m14358d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b^\u0010_J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\fH\u0002J&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0014\u0010-\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010.\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0014\u00103\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u001dR\"\u0010E\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010A0A0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010P\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010\u00030\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010DR\u0014\u0010R\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010&R\u0014\u0010T\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010&R\u0014\u0010V\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010*R\u0014\u0010X\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010*R\u0014\u0010Z\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bY\u0010=R\u0014\u0010]\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, m14357d2 = {"Lwd/e;", "", "", "", "i", "", "g", "Lcom/facebook/react/bridge/ReadableArray;", "c", "d", "", "e", "Landroid/util/Size;", "j", "h", "f", "size", "b", "photoSize", "videoSize", "Landroid/util/Range;", "fpsRange", "Lcom/facebook/react/bridge/ReadableMap;", "a", "k", "Landroid/hardware/camera2/CameraManager;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "", "Ljava/lang/String;", "cameraId", "Landroid/hardware/camera2/CameraCharacteristics;", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "Lzd/c;", "Lzd/c;", "hardwareLevel", "", "[I", "capabilities", "Ljava/util/List;", "extensions", "Z", "isMultiCam", "supportsDepthCapture", "supportsRawCapture", "supportsLowLightBoost", "Lzd/d;", "Lzd/d;", "lensFacing", "l", "hasFlash", "", "m", "[F", "focalLengths", "Landroid/util/SizeF;", "n", "Landroid/util/SizeF;", "sensorSize", "o", "I", "sensorOrientation", "p", ZeroconfModule.KEY_SERVICE_NAME, "", "kotlin.jvm.PlatformType", "q", "Landroid/util/Range;", "zoomRange", "r", "D", "minZoom", "s", "maxZoom", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "t", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "cameraConfig", "u", "isoRange", "v", "digitalStabilizationModes", "w", "opticalStabilizationModes", "x", "supportsPhotoHdr", "y", "supportsVideoHdr", "z", "videoFormat", "A", "Landroid/util/Size;", "size35mm", "<init>", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: wd.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13493e {

    /* renamed from: A */
    private final Size f34730A;

    /* renamed from: a */
    private final CameraManager f34731a;

    /* renamed from: b */
    private final String f34732b;

    /* renamed from: c */
    private final CameraCharacteristics f34733c;

    /* renamed from: d */
    private final EnumC14152c f34734d;

    /* renamed from: e */
    private final int[] f34735e;

    /* renamed from: f */
    private final List<Integer> f34736f;

    /* renamed from: g */
    private final boolean f34737g;

    /* renamed from: h */
    private final boolean f34738h;

    /* renamed from: i */
    private final boolean f34739i;

    /* renamed from: j */
    private final boolean f34740j;

    /* renamed from: k */
    private final EnumC14154d f34741k;

    /* renamed from: l */
    private final boolean f34742l;

    /* renamed from: m */
    private final float[] f34743m;

    /* renamed from: n */
    private final SizeF f34744n;

    /* renamed from: o */
    private final int f34745o;

    /* renamed from: p */
    private final String f34746p;

    /* renamed from: q */
    private final Range<Float> f34747q;

    /* renamed from: r */
    private final double f34748r;

    /* renamed from: s */
    private final double f34749s;

    /* renamed from: t */
    private final StreamConfigurationMap f34750t;

    /* renamed from: u */
    private final Range<Integer> f34751u;

    /* renamed from: v */
    private final int[] f34752v;

    /* renamed from: w */
    private final int[] f34753w;

    /* renamed from: x */
    private final boolean f34754x;

    /* renamed from: y */
    private final boolean f34755y;

    /* renamed from: z */
    private final int f34756z;

    public C13493e(CameraManager cameraManager, String cameraId) {
        boolean m14194w;
        boolean m14194w2;
        boolean m14194w3;
        String str;
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        C9612q.m13917h(cameraManager, "cameraManager");
        C9612q.m13917h(cameraId, "cameraId");
        this.f34731a = cameraManager;
        this.f34732b = cameraId;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
        C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(cameraId)");
        this.f34733c = cameraCharacteristics;
        this.f34734d = EnumC14152c.f36411k.m557a(cameraCharacteristics);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        iArr = iArr == null ? new int[0] : iArr;
        this.f34735e = iArr;
        List<Integer> m2358i = m2358i();
        this.f34736f = m2358i;
        m14194w = C9538f.m14194w(iArr, 11);
        this.f34737g = m14194w;
        m14194w2 = C9538f.m14194w(iArr, 8);
        this.f34738h = m14194w2;
        m14194w3 = C9538f.m14194w(iArr, 3);
        this.f34739i = m14194w3;
        this.f34740j = m2358i.contains(4);
        EnumC14154d m554a = EnumC14154d.f36419k.m554a(cameraCharacteristics);
        this.f34741k = m554a;
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f34742l = (bool == null ? Boolean.FALSE : bool).booleanValue();
        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        this.f34743m = fArr == null ? new float[]{35.0f} : fArr;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        C9612q.m13920e(obj);
        this.f34744n = (SizeF) obj;
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        C9612q.m13920e(obj2);
        this.f34745o = ((Number) obj2).intValue();
        int i = Build.VERSION.SDK_INT;
        Range<Float> range = null;
        if (i >= 28) {
            key2 = CameraCharacteristics.INFO_VERSION;
            str = (String) cameraCharacteristics.get(key2);
        } else {
            str = null;
        }
        if (str == null) {
            str = m554a + " (" + cameraId + ')';
        }
        C9612q.m13918g(str, "(if (Build.VERSION.SDK_I…lensFacing (${cameraId})\"");
        this.f34746p = str;
        if (i >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            range = (Range) cameraCharacteristics.get(key);
        }
        if (range == null) {
            Float valueOf = Float.valueOf(1.0f);
            Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            range = new Range<>(valueOf, f == null ? Float.valueOf(1.0f) : f);
        }
        this.f34747q = range;
        this.f34748r = range.getLower().floatValue();
        this.f34749s = range.getUpper().floatValue();
        Object obj3 = cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        C9612q.m13920e(obj3);
        this.f34750t = (StreamConfigurationMap) obj3;
        Range<Integer> range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        this.f34751u = range2 == null ? new Range<>(0, 0) : range2;
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        this.f34752v = iArr2 == null ? new int[0] : iArr2;
        int[] iArr3 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        this.f34753w = iArr3 == null ? new int[0] : iArr3;
        this.f34754x = m2358i.contains(3);
        this.f34755y = m2360g();
        this.f34756z = 35;
        this.f34730A = new Size(36, 24);
    }

    /* renamed from: a */
    private final ReadableMap m2366a(Size size, Size size2, Range<Integer> range) {
        WritableMap map = Arguments.createMap();
        map.putInt("photoHeight", size.getHeight());
        map.putInt("photoWidth", size.getWidth());
        map.putInt("videoHeight", size2.getHeight());
        map.putInt("videoWidth", size2.getWidth());
        Integer lower = this.f34751u.getLower();
        C9612q.m13918g(lower, "isoRange.lower");
        map.putInt("minISO", lower.intValue());
        Integer upper = this.f34751u.getUpper();
        C9612q.m13918g(upper, "isoRange.upper");
        map.putInt("maxISO", upper.intValue());
        Integer lower2 = range.getLower();
        C9612q.m13918g(lower2, "fpsRange.lower");
        map.putInt("minFps", lower2.intValue());
        Integer upper2 = range.getUpper();
        C9612q.m13918g(upper2, "fpsRange.upper");
        map.putInt("maxFps", upper2.intValue());
        map.putDouble("fieldOfView", m2362e());
        map.putBoolean("supportsVideoHDR", this.f34755y);
        map.putBoolean("supportsPhotoHDR", this.f34754x);
        map.putString("autoFocusSystem", "contrast-detection");
        map.putArray("videoStabilizationModes", m2364c());
        map.putArray("pixelFormats", m2365b(size2));
        C9612q.m13918g(map, "map");
        return map;
    }

    /* renamed from: b */
    private final ReadableArray m2365b(Size size) {
        boolean z;
        boolean z2;
        int[] formats = this.f34750t.getOutputFormats();
        WritableArray array = Arguments.createArray();
        C9612q.m13918g(formats, "formats");
        for (int i : formats) {
            Size[] sizes = this.f34750t.getOutputSizes(i);
            C9612q.m13918g(sizes, "sizes");
            int length = sizes.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    Size size2 = sizes[i2];
                    z = true;
                    if (size2.getWidth() == size.getWidth() && size2.getHeight() == size.getHeight()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                array.pushString(EnumC14161g.f36439k.m541a(i).m543b());
            }
        }
        C9612q.m13918g(array, "array");
        return array;
    }

    /* renamed from: c */
    private final ReadableArray m2364c() {
        WritableArray array = Arguments.createArray();
        for (int i : this.f34752v) {
            array.pushString(EnumC14174l.f36471k.m525a(i).m528b());
        }
        for (int i2 : this.f34753w) {
            array.pushString(EnumC14174l.f36471k.m524b(i2).m528b());
        }
        C9612q.m13918g(array, "array");
        return array;
    }

    /* renamed from: d */
    private final ReadableArray m2363d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float m931c = C14006q.m931c(this.f34730A) / C14006q.m932b(this.f34744n);
        WritableArray deviceTypes = Arguments.createArray();
        float[] fArr = this.f34743m;
        int length = fArr.length;
        boolean z6 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (fArr[i] * m931c > 35.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        float[] fArr2 = this.f34743m;
        int length2 = fArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length2) {
                float f = fArr2[i2] * m931c;
                if (f >= 24.0f && f <= 35.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                z2 = false;
                break;
            }
        }
        float[] fArr3 = this.f34743m;
        int length3 = fArr3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            if (fArr3[i3] * m931c < 24.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z6 = true;
                break;
            }
            i3++;
        }
        if (z) {
            deviceTypes.pushString("telephoto-camera");
        }
        if (z2) {
            deviceTypes.pushString("wide-angle-camera");
        }
        if (z6) {
            deviceTypes.pushString("ultra-wide-angle-camera");
        }
        C9612q.m13918g(deviceTypes, "deviceTypes");
        return deviceTypes;
    }

    /* renamed from: e */
    private final double m2362e() {
        float f = 2;
        return f * ((float) Math.atan(C14006q.m932b(this.f34744n) / (this.f34743m[0] * f))) * 57.29577951308232d;
    }

    /* renamed from: f */
    private final ReadableArray m2361f() {
        WritableArray array = Arguments.createArray();
        List<Size> m2357j = m2357j();
        List<Size> m2359h = m2359h();
        for (Size size : m2357j) {
            int outputMinFrameDuration = (int) (1.0d / (this.f34750t.getOutputMinFrameDuration(this.f34756z, size) / 1000000000));
            for (Size size2 : m2359h) {
                array.pushMap(m2366a(size2, size, new Range<>(1, Integer.valueOf(outputMinFrameDuration))));
            }
        }
        C9612q.m13918g(array, "array");
        return array;
    }

    /* renamed from: g */
    private final boolean m2360g() {
        boolean m14194w;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        m14194w = C9538f.m14194w(this.f34735e, 18);
        if (!m14194w) {
            return false;
        }
        DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) this.f34733c.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
        if (dynamicRangeProfiles == null) {
            dynamicRangeProfiles = new DynamicRangeProfiles(new long[0]);
        }
        if (!dynamicRangeProfiles.getSupportedProfiles().contains(2L) && !dynamicRangeProfiles.getSupportedProfiles().contains(4L)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final List<Size> m2359h() {
        return C13990f.m952c(this.f34733c, 256);
    }

    /* renamed from: i */
    private final List<Integer> m2358i() {
        List<Integer> m14104i;
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        List<Integer> supportedExtensions;
        if (Build.VERSION.SDK_INT >= 31) {
            cameraExtensionCharacteristics = this.f34731a.getCameraExtensionCharacteristics(this.f34732b);
            C9612q.m13918g(cameraExtensionCharacteristics, "cameraManager.getCameraE…Characteristics(cameraId)");
            supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
            C9612q.m13918g(supportedExtensions, "{\n      val extensions =…supportedExtensions\n    }");
            return supportedExtensions;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: j */
    private final List<Size> m2357j() {
        return C13990f.m950e(this.f34733c, this.f34732b, this.f34756z);
    }

    /* renamed from: k */
    public final ReadableMap m2356k() {
        String str;
        WritableMap map = Arguments.createMap();
        map.putString("id", this.f34732b);
        map.putArray("devices", m2363d());
        map.putString(ViewProps.POSITION, this.f34741k.m555b());
        map.putString(ZeroconfModule.KEY_SERVICE_NAME, this.f34746p);
        map.putBoolean("hasFlash", this.f34742l);
        map.putBoolean("hasTorch", this.f34742l);
        map.putBoolean("isMultiCam", this.f34737g);
        map.putBoolean("supportsRawCapture", this.f34739i);
        map.putBoolean("supportsDepthCapture", this.f34738h);
        map.putBoolean("supportsLowLightBoost", this.f34740j);
        map.putBoolean("supportsFocus", true);
        map.putDouble("minZoom", this.f34748r);
        map.putDouble("maxZoom", this.f34749s);
        map.putDouble("neutralZoom", 1.0d);
        map.putString("hardwareLevel", this.f34734d.m558b());
        map.putString("sensorOrientation", EnumC14156e.f36425k.m549a(this.f34745o).m552b());
        WritableArray createArray = Arguments.createArray();
        int[] outputFormats = this.f34750t.getOutputFormats();
        C9612q.m13918g(outputFormats, "cameraConfig.outputFormats");
        for (int i : outputFormats) {
            if (i != 0) {
                if (i != 20) {
                    if (i != 32) {
                        if (i != 54) {
                            if (i != 256) {
                                if (i != 538982489) {
                                    if (i != 842094169) {
                                        if (i != 1144402265) {
                                            if (i != 1212500294) {
                                                if (i != 1768253795) {
                                                    if (i != 16) {
                                                        if (i != 17) {
                                                            switch (i) {
                                                                case 34:
                                                                    str = "PRIVATE";
                                                                    continue;
                                                                case 35:
                                                                    str = "YUV_420_888";
                                                                    continue;
                                                                case 36:
                                                                    str = "RAW_PRIVATE";
                                                                    continue;
                                                                case 37:
                                                                    str = "RAW10";
                                                                    continue;
                                                                case 38:
                                                                    str = "RAW12";
                                                                    continue;
                                                                case 39:
                                                                    str = "YUV_422_888";
                                                                    continue;
                                                                case 40:
                                                                    str = "YUV_444_888";
                                                                    continue;
                                                                case 41:
                                                                    str = "FLEX_RGB_888";
                                                                    continue;
                                                                case 42:
                                                                    str = "FLEX_RGBA_8888";
                                                                    continue;
                                                                default:
                                                                    str = "unknown (" + i + ')';
                                                                    continue;
                                                            }
                                                        } else {
                                                            str = "NV21";
                                                        }
                                                    } else {
                                                        str = "NV16";
                                                    }
                                                } else {
                                                    str = "DEPTH_JPEG";
                                                }
                                            } else {
                                                str = "HEIC";
                                            }
                                        } else {
                                            str = "DEPTH16";
                                        }
                                    } else {
                                        str = "YV12";
                                    }
                                } else {
                                    str = "Y8";
                                }
                            } else {
                                str = "JPEG";
                            }
                        } else {
                            str = "YCBCR_P010";
                        }
                    } else {
                        str = "RAW_SENSOR";
                    }
                } else {
                    str = "YUY2";
                }
            } else {
                str = "UNKNOWN";
            }
            createArray.pushString(str);
        }
        map.putArray("pixelFormats", createArray);
        map.putArray("formats", m2361f());
        C9612q.m13918g(map, "map");
        return map;
    }
}