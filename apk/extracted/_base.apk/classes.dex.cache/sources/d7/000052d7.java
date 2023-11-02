package p446yd;

import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import p340sf.C12466c;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007\u001a\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, m14357d2 = {"Landroid/util/Size;", "a", "Landroid/hardware/camera2/CameraCharacteristics;", "d", "", "cameraId", "b", "", "format", "", "e", "c", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13990f {

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: yd.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13991a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m5209d;
            Size size = (Size) t2;
            Size size2 = (Size) t;
            m5209d = C12466c.m5209d(Integer.valueOf(size.getWidth() * size.getHeight()), Integer.valueOf(size2.getWidth() * size2.getHeight()));
            return m5209d;
        }
    }

    /* renamed from: a */
    private static final Size m954a() {
        boolean z;
        Size size = new Size(1920, 1080);
        Size size2 = new Size(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
        if (C14006q.m931c(size2) < C14006q.m931c(size) && C14006q.m930d(size2) < C14006q.m930d(size)) {
            z = false;
        } else {
            z = true;
        }
        Log.i("PreviewSize", "Phone has a " + size2.getWidth() + " x " + size2.getHeight() + " screen.");
        if (!z) {
            return size2;
        }
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0008, code lost:
        r0 = android.media.CamcorderProfile.getAll(r8, 1);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.util.Size m953b(java.lang.String r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L6a
            android.media.EncoderProfiles r0 = p446yd.C13986b.m958a(r8, r3)
            if (r0 == 0) goto L6a
            java.util.List r0 = p446yd.C13987c.m957a(r0)
            java.lang.String r1 = "profiles.videoProfiles"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            java.util.List r0 = kotlin.collections.C9543h.m14164Q(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L27
            r1 = r2
            goto L58
        L27:
            java.lang.Object r1 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L32
            goto L58
        L32:
            r4 = r1
            android.media.EncoderProfiles$VideoProfile r4 = (android.media.EncoderProfiles.VideoProfile) r4
            int r5 = p446yd.C13988d.m956a(r4)
            int r4 = p446yd.C13989e.m955a(r4)
            int r5 = r5 * r4
        L3e:
            java.lang.Object r4 = r0.next()
            r6 = r4
            android.media.EncoderProfiles$VideoProfile r6 = (android.media.EncoderProfiles.VideoProfile) r6
            int r7 = p446yd.C13988d.m956a(r6)
            int r6 = p446yd.C13989e.m955a(r6)
            int r7 = r7 * r6
            if (r5 >= r7) goto L52
            r1 = r4
            r5 = r7
        L52:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L3e
        L58:
            android.media.EncoderProfiles$VideoProfile r1 = (android.media.EncoderProfiles.VideoProfile) r1
            if (r1 == 0) goto L6a
            android.util.Size r8 = new android.util.Size
            int r0 = p446yd.C13988d.m956a(r1)
            int r1 = p446yd.C13989e.m955a(r1)
            r8.<init>(r0, r1)
            return r8
        L6a:
            java.lang.Integer r8 = kotlin.text.C9642f.m13801m(r8)
            if (r8 == 0) goto L82
            int r8 = r8.intValue()
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r8, r3)
            android.util.Size r0 = new android.util.Size
            int r1 = r8.videoFrameWidth
            int r8 = r8.videoFrameHeight
            r0.<init>(r1, r8)
            return r0
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p446yd.C13990f.m953b(java.lang.String):android.util.Size");
    }

    /* renamed from: c */
    public static final List<Size> m952c(CameraCharacteristics cameraCharacteristics, int i) {
        Object[] m14262p;
        List<Size> m14197u0;
        C9612q.m13917h(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        C9612q.m13920e(obj);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) obj;
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null) {
            outputSizes = new Size[0];
        }
        Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
        if (highResolutionOutputSizes == null) {
            highResolutionOutputSizes = new Size[0];
        }
        m14262p = C9536e.m14262p(outputSizes, highResolutionOutputSizes);
        m14197u0 = C9538f.m14197u0(m14262p);
        return m14197u0;
    }

    /* renamed from: d */
    public static final Size m951d(CameraCharacteristics cameraCharacteristics) {
        List m14209k0;
        boolean z;
        C9612q.m13917h(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        C9612q.m13920e(obj);
        Size m954a = m954a();
        Size[] outputSizes = ((StreamConfigurationMap) obj).getOutputSizes(SurfaceHolder.class);
        C9612q.m13918g(outputSizes, "config.getOutputSizes(SurfaceHolder::class.java)");
        m14209k0 = C9538f.m14209k0(outputSizes, new C13991a());
        for (Object obj2 : m14209k0) {
            Size it = (Size) obj2;
            C9612q.m13918g(it, "it");
            if (C14006q.m931c(it) <= C14006q.m931c(m954a) && C14006q.m930d(it) <= C14006q.m930d(m954a)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                C9612q.m13918g(obj2, "outputSizes.first { it.b… <= previewSize.smaller }");
                return it;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: e */
    public static final List<Size> m950e(CameraCharacteristics cameraCharacteristics, String cameraId, int i) {
        List<Size> m14197u0;
        boolean z;
        C9612q.m13917h(cameraCharacteristics, "<this>");
        C9612q.m13917h(cameraId, "cameraId");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        C9612q.m13920e(obj);
        Size[] outputSizes = ((StreamConfigurationMap) obj).getOutputSizes(i);
        if (outputSizes == null) {
            outputSizes = new Size[0];
        }
        Size m953b = m953b(cameraId);
        if (m953b != null) {
            ArrayList arrayList = new ArrayList();
            for (Size it : outputSizes) {
                C9612q.m13918g(it, "it");
                if (C14006q.m931c(it) <= C14006q.m931c(m953b)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(it);
                }
            }
            return arrayList;
        }
        m14197u0 = C9538f.m14197u0(outputSizes);
        return m14197u0;
    }
}