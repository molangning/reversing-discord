package p446yd;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import com.mrousavy.camera.C5308g;
import com.mrousavy.camera.C5311h;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.CancellableContinuation;
import p388vf.C13272c;
import p388vf.C13277d;
import p425xd.C13781b;
import p425xd.C13787c;
import p425xd.C13788d;
import p425xd.C13792e;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001aK\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"Landroid/hardware/camera2/CameraDevice;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lyd/p;", "sessionType", "Lxd/b;", "outputs", "Lkotlin/Function1;", "Landroid/hardware/camera2/CameraCaptureSession;", "", "onClosed", "Lcom/mrousavy/camera/g$a;", "queue", "c", "(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/CameraManager;Lyd/p;Lxd/b;Lkotlin/jvm/functions/Function1;Lcom/mrousavy/camera/g$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "I", "sessionId", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13994i {

    /* renamed from: a */
    private static int f35988a = 1000;

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"yd/i$a", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "", "onConfigured", "onConfigureFailed", "onClosed", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: yd.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13995a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final /* synthetic */ CameraDevice f35989a;

        /* renamed from: b */
        final /* synthetic */ int f35990b;

        /* renamed from: c */
        final /* synthetic */ CancellableContinuation<CameraCaptureSession> f35991c;

        /* renamed from: d */
        final /* synthetic */ C13781b f35992d;

        /* renamed from: e */
        final /* synthetic */ Function1<CameraCaptureSession, Unit> f35993e;

        /* JADX WARN: Multi-variable type inference failed */
        C13995a(CameraDevice cameraDevice, int i, CancellableContinuation<? super CameraCaptureSession> cancellableContinuation, C13781b c13781b, Function1<? super CameraCaptureSession, Unit> function1) {
            this.f35989a = cameraDevice;
            this.f35990b = i;
            this.f35991c = cancellableContinuation;
            this.f35992d = c13781b;
            this.f35993e = function1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession session) {
            C9612q.m13917h(session, "session");
            super.onClosed(session);
            Log.i("CreateCaptureSession", "Camera " + this.f35989a.getId() + ": Capture Session #" + this.f35990b + " closed!");
            this.f35993e.invoke(session);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            C9612q.m13917h(session, "session");
            Log.e("CreateCaptureSession", "Camera " + this.f35989a.getId() + ": Failed to configure Capture Session #" + this.f35990b + '!');
            CancellableContinuation<CameraCaptureSession> cancellableContinuation = this.f35991c;
            String id2 = this.f35989a.getId();
            C9612q.m13918g(id2, "id");
            C5311h c5311h = new C5311h(id2, this.f35992d);
            C11583s.C11584a c11584a = C11583s.f30090k;
            cancellableContinuation.resumeWith(C11583s.m7596b(C11586t.m7587a(c5311h)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            C9612q.m13917h(session, "session");
            Log.i("CreateCaptureSession", "Camera " + this.f35989a.getId() + ": Capture Session #" + this.f35990b + " configured!");
            this.f35991c.resumeWith(C11583s.m7596b(session));
        }
    }

    /* renamed from: c */
    public static final Object m945c(CameraDevice cameraDevice, CameraManager cameraManager, EnumC14004p enumC14004p, C13781b c13781b, Function1<? super CameraCaptureSession, Unit> function1, C5308g.C5309a c5309a, Continuation<? super CameraCaptureSession> continuation) {
        Continuation m2870c;
        Object m2869d;
        Long l;
        Set supportedProfiles;
        Object m14055U;
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraDevice.getId());
        C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(id)");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C9612q.m13920e(obj);
        int intValue = ((Number) obj).intValue();
        int i = f35988a;
        f35988a = i + 1;
        Log.i("CreateCaptureSession", "Camera " + cameraDevice.getId() + ": Creating Capture Session #" + i + "... Hardware Level: " + intValue + "} | Outputs: " + c13781b);
        C13995a c13995a = new C13995a(cameraDevice, i, c9838p, c13781b, function1);
        ArrayList<OutputConfiguration> arrayList = new ArrayList();
        C13788d m1541s = c13781b.m1541s();
        if (m1541s != null) {
            C9568b.m13991a(arrayList.add(m1541s.m1528j(cameraCharacteristics)));
        }
        C13787c m1543o = c13781b.m1543o();
        if (m1543o != null) {
            C9568b.m13991a(arrayList.add(m1543o.m1528j(cameraCharacteristics)));
        }
        C13792e m1549A = c13781b.m1549A();
        if (m1549A != null) {
            C9568b.m13991a(arrayList.add(m1549A.m1528j(cameraCharacteristics)));
        }
        if (C9612q.m13922c(c13781b.m1545j(), C9568b.m13991a(true)) && Build.VERSION.SDK_INT >= 33) {
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
            if (dynamicRangeProfiles == null || (l = C14001m.m938b(dynamicRangeProfiles)) == null) {
                if (dynamicRangeProfiles != null && (supportedProfiles = dynamicRangeProfiles.getSupportedProfiles()) != null) {
                    C9612q.m13918g(supportedProfiles, "supportedProfiles");
                    m14055U = C9553r.m14055U(supportedProfiles);
                    l = (Long) m14055U;
                } else {
                    l = null;
                }
            }
            if (l != null) {
                Log.i("CreateCaptureSession", "Camera " + cameraDevice.getId() + ": Using HDR Profile " + l + "...");
                for (OutputConfiguration outputConfiguration : arrayList) {
                    outputConfiguration.setDynamicRangeProfile(l.longValue());
                }
            } else {
                Log.w("CreateCaptureSession", "Camera " + cameraDevice.getId() + ": HDR was enabled, but the device does not support any matching HDR profile!");
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Log.i("CreateCaptureSession", "Using new API (>=28)");
            cameraDevice.createCaptureSession(new SessionConfiguration(enumC14004p.m934b(), arrayList, c5309a.m25513b(), c13995a));
        } else {
            Log.i("CreateCaptureSession", "Using legacy API (<28)");
            cameraDevice.createCaptureSessionByOutputConfigurations(arrayList, c13995a, c5309a.m25512c());
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }
}
