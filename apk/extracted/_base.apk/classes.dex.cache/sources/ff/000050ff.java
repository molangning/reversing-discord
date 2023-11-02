package p405wd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p068dg.C5838c;
import p446yd.C13990f;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014R\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m14357d2 = {"Lwd/i;", "Landroid/view/SurfaceView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Lkotlin/Function1;", "Landroid/view/Surface;", "j", "Lkotlin/jvm/functions/Function1;", "onSurfaceChanged", "Landroid/util/Size;", "k", "Landroid/util/Size;", "targetSize", "", "getAspectRatio", "()F", ViewProps.ASPECT_RATIO, "Landroid/content/Context;", "context", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "", "cameraId", "<init>", "(Landroid/content/Context;Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "l", "b", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* renamed from: wd.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13519i extends SurfaceView {

    /* renamed from: l */
    public static final C13521b f34872l = new C13521b(null);

    /* renamed from: j */
    private final Function1<Surface, Unit> f34873j;

    /* renamed from: k */
    private final Size f34874k;

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, m14357d2 = {"wd/i$a", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceCreated", "", "format", "width", "height", "surfaceChanged", "surfaceDestroyed", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wd.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class SurfaceHolder$CallbackC13520a implements SurfaceHolder.Callback {
        SurfaceHolder$CallbackC13520a() {
            C13519i.this = r1;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
            C9612q.m13917h(holder, "holder");
            Log.i("NativePreviewView", "Surface resized! " + holder.getSurface() + " (" + i2 + " x " + i3 + " in format #" + i + ')');
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            C9612q.m13917h(holder, "holder");
            Log.i("NativePreviewView", "Surface created! " + holder.getSurface());
            C13519i.this.f34873j.invoke(holder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            C9612q.m13917h(holder, "holder");
            Log.i("NativePreviewView", "Surface destroyed! " + holder.getSurface());
            C13519i.this.f34873j.invoke(null);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lwd/i$b;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wd.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13521b {
        private C13521b() {
        }

        public /* synthetic */ C13521b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13519i(Context context, CameraManager cameraManager, String cameraId, Function1<? super Surface, Unit> onSurfaceChanged) {
        super(context);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(cameraManager, "cameraManager");
        C9612q.m13917h(cameraId, "cameraId");
        C9612q.m13917h(onSurfaceChanged, "onSurfaceChanged");
        this.f34873j = onSurfaceChanged;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
        C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(cameraId)");
        Size m951d = C13990f.m951d(cameraCharacteristics);
        this.f34874k = m951d;
        Log.i("NativePreviewView", "Using Preview Size " + m951d.getWidth() + " x " + m951d.getHeight() + '.');
        getHolder().setFixedSize(m951d.getWidth(), m951d.getHeight());
        getHolder().addCallback(new SurfaceHolder$CallbackC13520a());
    }

    private final float getAspectRatio() {
        return this.f34874k.getWidth() / this.f34874k.getHeight();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        float aspectRatio;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Log.d("NativePreviewView", "onMeasure(" + size + ", " + size2 + ')');
        if (size > size2) {
            aspectRatio = getAspectRatio();
        } else {
            aspectRatio = 1.0f / getAspectRatio();
        }
        float f = size;
        float f2 = size2 * aspectRatio;
        if (f < f2) {
            size = C5838c.m24388b(f2);
        } else {
            size2 = C5838c.m24388b(f / aspectRatio);
        }
        Log.d("NativePreviewView", "Measured dimensions set: " + size + " x " + size2);
        setMeasuredDimension(size, size2);
    }
}