package p446yd;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaActionSound;
import com.mrousavy.camera.C5295b0;
import com.mrousavy.camera.C5308g;
import com.mrousavy.camera.C5333q;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.internal.C9612q;
import p371uf.C12968g;
import p388vf.C13272c;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m14357d2 = {"Landroid/hardware/camera2/CameraCaptureSession;", "Landroid/hardware/camera2/CaptureRequest;", "captureRequest", "", "enableShutterSound", "Landroid/hardware/camera2/TotalCaptureResult;", "a", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13984a {

    @Metadata(m14358d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, m14357d2 = {"yd/a$a", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "", "onCaptureCompleted", "", "timestamp", "frameNumber", "onCaptureStarted", "Landroid/hardware/camera2/CaptureFailure;", "failure", "onCaptureFailed", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: yd.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13985a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final /* synthetic */ Continuation<TotalCaptureResult> f35986a;

        /* renamed from: b */
        final /* synthetic */ boolean f35987b;

        /* JADX WARN: Multi-variable type inference failed */
        C13985a(Continuation<? super TotalCaptureResult> continuation, boolean z) {
            this.f35986a = continuation;
            this.f35987b = z;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
            C9612q.m13917h(session, "session");
            C9612q.m13917h(request, "request");
            C9612q.m13917h(result, "result");
            super.onCaptureCompleted(session, request, result);
            this.f35986a.resumeWith(C11583s.m7596b(result));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
            Throwable c5295b0;
            C9612q.m13917h(session, "session");
            C9612q.m13917h(request, "request");
            C9612q.m13917h(failure, "failure");
            super.onCaptureFailed(session, request, failure);
            boolean wasImageCaptured = failure.wasImageCaptured();
            int reason = failure.getReason();
            if (reason != 0) {
                if (reason != 1) {
                    c5295b0 = new C5295b0(wasImageCaptured);
                } else {
                    c5295b0 = new C5333q(wasImageCaptured);
                }
            } else {
                c5295b0 = new C5295b0(wasImageCaptured);
            }
            Continuation<TotalCaptureResult> continuation = this.f35986a;
            C11583s.C11584a c11584a = C11583s.f30090k;
            continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(c5295b0)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j, long j2) {
            C9612q.m13917h(session, "session");
            C9612q.m13917h(request, "request");
            super.onCaptureStarted(session, request, j, j2);
            if (this.f35987b) {
                new MediaActionSound().play(0);
            }
        }
    }

    /* renamed from: a */
    public static final Object m959a(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, boolean z, Continuation<? super TotalCaptureResult> continuation) {
        Continuation m2870c;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        C12968g c12968g = new C12968g(m2870c);
        cameraCaptureSession.capture(captureRequest, new C13985a(c12968g, z), C5308g.f15086a.m25511a().m25512c());
        Object m3570b = c12968g.m3570b();
        m2869d = C13277d.m2869d();
        if (m3570b == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m3570b;
    }
}