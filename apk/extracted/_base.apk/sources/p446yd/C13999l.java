package p446yd;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import com.mrousavy.camera.C5292a;
import com.mrousavy.camera.C5294b;
import com.mrousavy.camera.C5308g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.CancellableContinuation;
import p388vf.C13272c;
import p388vf.C13277d;
import p465zd.EnumC14148a;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\n\u0010\f\u001a\u00020\u0006*\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m14357d2 = {"Landroid/hardware/camera2/CameraManager;", "", "cameraId", "Lkotlin/Function2;", "Landroid/hardware/camera2/CameraDevice;", "", "", "onDisconnected", "Lcom/mrousavy/camera/g$a;", "queue", "a", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/mrousavy/camera/g$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13999l {

    @Metadata(m14358d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, m14357d2 = {"yd/l$a", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "camera", "", "onOpened", "onDisconnected", "", "errorCode", "onError", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: yd.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14000a extends CameraDevice.StateCallback {

        /* renamed from: a */
        final /* synthetic */ String f35996a;

        /* renamed from: b */
        final /* synthetic */ CancellableContinuation<CameraDevice> f35997b;

        /* renamed from: c */
        final /* synthetic */ Function2<CameraDevice, Throwable, Unit> f35998c;

        /* JADX WARN: Multi-variable type inference failed */
        C14000a(String str, CancellableContinuation<? super CameraDevice> cancellableContinuation, Function2<? super CameraDevice, ? super Throwable, Unit> function2) {
            this.f35996a = str;
            this.f35997b = cancellableContinuation;
            this.f35998c = function2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice camera) {
            C9612q.m13917h(camera, "camera");
            Log.i("CameraManager", "Camera " + this.f35996a + ": Disconnected!");
            if (this.f35997b.mo13140a()) {
                CancellableContinuation<CameraDevice> cancellableContinuation = this.f35997b;
                C11583s.C11584a c11584a = C11583s.f30090k;
                cancellableContinuation.resumeWith(C11583s.m7596b(C11586t.m7587a(new C5292a(this.f35996a, EnumC14148a.DISCONNECTED))));
            } else {
                this.f35998c.invoke(camera, new C5294b(this.f35996a, EnumC14148a.DISCONNECTED));
            }
            C13999l.m940b(camera);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice camera, int i) {
            C9612q.m13917h(camera, "camera");
            Log.e("CameraManager", "Camera " + this.f35996a + ": Error! " + i);
            EnumC14148a m562a = EnumC14148a.f36396k.m562a(i);
            if (this.f35997b.mo13140a()) {
                CancellableContinuation<CameraDevice> cancellableContinuation = this.f35997b;
                C11583s.C11584a c11584a = C11583s.f30090k;
                cancellableContinuation.resumeWith(C11583s.m7596b(C11586t.m7587a(new C5292a(this.f35996a, m562a))));
            } else {
                this.f35998c.invoke(camera, new C5294b(this.f35996a, m562a));
            }
            C13999l.m940b(camera);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice camera) {
            C9612q.m13917h(camera, "camera");
            Log.i("CameraManager", "Camera " + this.f35996a + ": Opened!");
            this.f35997b.resumeWith(C11583s.m7596b(camera));
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static final Object m941a(CameraManager cameraManager, String str, Function2<? super CameraDevice, ? super Throwable, Unit> function2, C5308g.C5309a c5309a, Continuation<? super CameraDevice> continuation) {
        Continuation m2870c;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        Log.i("CameraManager", "Camera " + str + ": Opening...");
        C14000a c14000a = new C14000a(str, c9838p, function2);
        if (Build.VERSION.SDK_INT >= 28) {
            cameraManager.openCamera(str, c5309a.m25513b(), c14000a);
        } else {
            cameraManager.openCamera(str, c14000a, c5309a.m25512c());
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }

    /* renamed from: b */
    public static final void m940b(CameraDevice cameraDevice) {
        C9612q.m13917h(cameraDevice, "<this>");
        try {
            Log.i("CameraManager", "Camera " + cameraDevice.getId() + ": Closing...");
            cameraDevice.close();
        } catch (Throwable th2) {
            Log.e("CameraManager", "Camera " + cameraDevice.getId() + ": Failed to close!", th2);
        }
    }
}
