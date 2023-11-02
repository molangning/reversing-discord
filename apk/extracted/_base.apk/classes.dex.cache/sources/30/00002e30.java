package com.mrousavy.camera.core;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.mrousavy.camera.core.VideoPipeline;
import com.mrousavy.camera.frameprocessor.Frame;
import com.mrousavy.camera.frameprocessor.FrameProcessor;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p405wd.C13526n;
import p465zd.EnumC14156e;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001CB+\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\b\b\u0002\u0010+\u001a\u00020(¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\t\u0010\b\u001a\u00020\u0007H\u0082 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0082 J\t\u0010\u000f\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0082 J\t\u0010\u0011\u001a\u00020\u0007H\u0082 J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0082 J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010'\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00109R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010\r\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b/\u0010?¨\u0006D"}, m14357d2 = {"Lcom/mrousavy/camera/core/VideoPipeline;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "Ljava/io/Closeable;", "Landroid/media/ImageReader;", "j", "", "getInputTextureId", "", "onBeforeFrame", "", Snapshot.TRANSFORM_MATRIX, "onFrame", "", "surface", "setFrameProcessorOutputSurface", "removeFrameProcessorOutputSurface", "setRecordingSessionOutputSurface", "removeRecordingSessionOutputSurface", "width", "height", "Lcom/facebook/jni/HybridData;", "initHybrid", "close", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "onFrameAvailable", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "frameProcessor", "s", "Lwd/n;", "recordingSession", "t", "I", "q", "()I", "k", "i", "l", "h", "format", "", "m", "Z", "isMirrored", "n", "Lcom/facebook/jni/HybridData;", "mHybridData", "o", "Ljava/lang/Integer;", "openGLTextureId", "p", "[F", "isActive", "r", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "Landroid/media/ImageReader;", "imageReader", "Lwd/n;", "u", "Landroid/graphics/SurfaceTexture;", "Landroid/view/Surface;", "v", "Landroid/view/Surface;", "()Landroid/view/Surface;", "<init>", "(IIIZ)V", "w", "a", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class VideoPipeline implements SurfaceTexture.OnFrameAvailableListener, Closeable {

    /* renamed from: w */
    public static final C5298a f15057w = new C5298a(null);

    /* renamed from: j */
    private final int f15058j;

    /* renamed from: k */
    private final int f15059k;

    /* renamed from: l */
    private final int f15060l;

    /* renamed from: m */
    private final boolean f15061m;

    /* renamed from: n */
    private final HybridData f15062n;

    /* renamed from: o */
    private Integer f15063o;

    /* renamed from: p */
    private float[] f15064p = new float[16];

    /* renamed from: q */
    private boolean f15065q = true;

    /* renamed from: r */
    private FrameProcessor f15066r;

    /* renamed from: s */
    private ImageReader f15067s;

    /* renamed from: t */
    private C13526n f15068t;

    /* renamed from: u */
    private final SurfaceTexture f15069u;

    /* renamed from: v */
    private final Surface f15070v;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lcom/mrousavy/camera/core/VideoPipeline$a;", "", "", "MAX_IMAGES", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.core.VideoPipeline$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5298a {
        private C5298a() {
        }

        public /* synthetic */ C5298a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VideoPipeline(int i, int i2, int i3, boolean z) {
        this.f15058j = i;
        this.f15059k = i2;
        this.f15060l = i3;
        this.f15061m = z;
        this.f15062n = initHybrid(i, i2);
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        this.f15069u = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i, i2);
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f15070v = new Surface(surfaceTexture);
    }

    private final native int getInputTextureId();

    private final native HybridData initHybrid(int i, int i2);

    /* renamed from: j */
    private final ImageReader m25529j() {
        ImageReader newInstance = ImageReader.newInstance(this.f15058j, this.f15059k, this.f15060l, 3);
        C9612q.m13918g(newInstance, "newInstance(width, height, format, MAX_IMAGES)");
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: wd.o
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                VideoPipeline.m25528m(VideoPipeline.this, imageReader);
            }
        }, null);
        return newInstance;
    }

    /* renamed from: m */
    public static final void m25528m(VideoPipeline this$0, ImageReader imageReader) {
        C9612q.m13917h(this$0, "this$0");
        Log.i("VideoPipeline", "ImageReader::onImageAvailable!");
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage == null) {
            return;
        }
        Frame frame = new Frame(acquireLatestImage, acquireLatestImage.getTimestamp(), EnumC14156e.PORTRAIT, this$0.f15061m);
        frame.incrementRefCount();
        FrameProcessor frameProcessor = this$0.f15066r;
        if (frameProcessor != null) {
            frameProcessor.call(frame);
        }
        frame.decrementRefCount();
    }

    private final native void onBeforeFrame();

    private final native void onFrame(float[] fArr);

    private final native void removeFrameProcessorOutputSurface();

    private final native void removeRecordingSessionOutputSurface();

    private final native void setFrameProcessorOutputSurface(Object obj);

    private final native void setRecordingSessionOutputSurface(Object obj);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f15065q = false;
            ImageReader imageReader = this.f15067s;
            if (imageReader != null) {
                imageReader.close();
            }
            this.f15067s = null;
            this.f15066r = null;
            this.f15068t = null;
            this.f15069u.release();
            this.f15062n.resetNative();
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: h */
    public final int m25531h() {
        return this.f15060l;
    }

    /* renamed from: i */
    public final int m25530i() {
        return this.f15059k;
    }

    /* renamed from: o */
    public final Surface m25527o() {
        return this.f15070v;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C9612q.m13917h(surfaceTexture, "surfaceTexture");
        synchronized (this) {
            if (this.f15065q) {
                if (this.f15063o == null) {
                    Integer valueOf = Integer.valueOf(getInputTextureId());
                    this.f15063o = valueOf;
                    C9612q.m13920e(valueOf);
                    surfaceTexture.attachToGLContext(valueOf.intValue());
                    Log.i("VideoPipeline", "Attached Texture to Context " + this.f15063o);
                }
                onBeforeFrame();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.f15064p);
                onFrame(this.f15064p);
            }
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: q */
    public final int m25526q() {
        return this.f15058j;
    }

    /* renamed from: s */
    public final void m25525s(FrameProcessor frameProcessor) {
        synchronized (this) {
            Log.i("VideoPipeline", "Setting " + this.f15058j + " x " + this.f15059k + " FrameProcessor Output...");
            this.f15066r = frameProcessor;
            if (frameProcessor != null) {
                if (this.f15067s == null) {
                    this.f15067s = m25529j();
                }
                ImageReader imageReader = this.f15067s;
                C9612q.m13920e(imageReader);
                Surface surface = imageReader.getSurface();
                C9612q.m13918g(surface, "imageReader!!.surface");
                setFrameProcessorOutputSurface(surface);
            } else {
                removeFrameProcessorOutputSurface();
                ImageReader imageReader2 = this.f15067s;
                if (imageReader2 != null) {
                    imageReader2.close();
                }
                this.f15067s = null;
            }
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: t */
    public final void m25524t(C13526n c13526n) {
        synchronized (this) {
            Log.i("VideoPipeline", "Setting " + this.f15058j + " x " + this.f15059k + " RecordingSession Output...");
            if (c13526n != null) {
                setRecordingSessionOutputSurface(c13526n.m2300e());
                this.f15068t = c13526n;
            } else {
                removeRecordingSessionOutputSurface();
                this.f15068t = null;
            }
            Unit unit = Unit.f25302a;
        }
    }
}