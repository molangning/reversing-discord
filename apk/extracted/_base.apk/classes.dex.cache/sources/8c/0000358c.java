package p132h8;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.Player;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p132h8.C7027a;
import p132h8.View$OnTouchListenerC7038i;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: h8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7036h extends GLSurfaceView {

    /* renamed from: j */
    private final SensorManager f19266j;

    /* renamed from: k */
    private final Sensor f19267k;

    /* renamed from: l */
    private final C7027a f19268l;

    /* renamed from: m */
    private final Handler f19269m;

    /* renamed from: n */
    private final View$OnTouchListenerC7038i f19270n;

    /* renamed from: o */
    private final C7032d f19271o;

    /* renamed from: p */
    private SurfaceTexture f19272p;

    /* renamed from: q */
    private Surface f19273q;

    /* renamed from: r */
    private Player.InterfaceC4373c f19274r;

    /* renamed from: s */
    private boolean f19275s;

    /* renamed from: t */
    private boolean f19276t;

    /* renamed from: u */
    private boolean f19277u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C7037a implements GLSurfaceView.Renderer, View$OnTouchListenerC7038i.InterfaceC7039a, C7027a.InterfaceC7028a {

        /* renamed from: j */
        private final C7032d f19278j;

        /* renamed from: m */
        private final float[] f19281m;

        /* renamed from: n */
        private final float[] f19282n;

        /* renamed from: o */
        private final float[] f19283o;

        /* renamed from: p */
        private float f19284p;

        /* renamed from: q */
        private float f19285q;

        /* renamed from: k */
        private final float[] f19279k = new float[16];

        /* renamed from: l */
        private final float[] f19280l = new float[16];

        /* renamed from: r */
        private final float[] f19286r = new float[16];

        /* renamed from: s */
        private final float[] f19287s = new float[16];

        public C7037a(C7032d c7032d) {
            C7036h.this = r5;
            float[] fArr = new float[16];
            this.f19281m = fArr;
            float[] fArr2 = new float[16];
            this.f19282n = fArr2;
            float[] fArr3 = new float[16];
            this.f19283o = fArr3;
            this.f19278j = c7032d;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f19285q = 3.1415927f;
        }

        /* renamed from: c */
        private float m21493c(float f) {
            boolean z;
            if (f > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        /* renamed from: d */
        private void m21492d() {
            Matrix.setRotateM(this.f19282n, 0, -this.f19284p, (float) Math.cos(this.f19285q), (float) Math.sin(this.f19285q), 0.0f);
        }

        @Override // p132h8.C7027a.InterfaceC7028a
        /* renamed from: a */
        public synchronized void mo21491a(float[] fArr, float f) {
            float[] fArr2 = this.f19281m;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f19285q = -f;
            m21492d();
        }

        @Override // p132h8.View$OnTouchListenerC7038i.InterfaceC7039a
        /* renamed from: b */
        public synchronized void mo21489b(PointF pointF) {
            this.f19284p = pointF.y;
            m21492d();
            Matrix.setRotateM(this.f19283o, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f19287s, 0, this.f19281m, 0, this.f19283o, 0);
                Matrix.multiplyMM(this.f19286r, 0, this.f19282n, 0, this.f19287s, 0);
            }
            Matrix.multiplyMM(this.f19280l, 0, this.f19279k, 0, this.f19286r, 0);
            this.f19278j.m21506e(this.f19280l, false);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f19279k, 0, m21493c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C7036h.this.m21496f(this.f19278j.m21505f());
        }
    }

    public C7036h(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    public /* synthetic */ void m21498d() {
        Surface surface = this.f19273q;
        if (surface != null) {
            Player.InterfaceC4373c interfaceC4373c = this.f19274r;
            if (interfaceC4373c != null) {
                interfaceC4373c.mo29802f(surface);
            }
            m21495g(this.f19272p, this.f19273q);
            this.f19272p = null;
            this.f19273q = null;
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m21497e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f19272p;
        Surface surface = this.f19273q;
        this.f19272p = surfaceTexture;
        Surface surface2 = new Surface(surfaceTexture);
        this.f19273q = surface2;
        Player.InterfaceC4373c interfaceC4373c = this.f19274r;
        if (interfaceC4373c != null) {
            interfaceC4373c.mo29810a(surface2);
        }
        m21495g(surfaceTexture2, surface);
    }

    /* renamed from: f */
    public void m21496f(final SurfaceTexture surfaceTexture) {
        this.f19269m.post(new Runnable() { // from class: h8.g
            @Override // java.lang.Runnable
            public final void run() {
                C7036h.this.m21497e(surfaceTexture);
            }
        });
    }

    /* renamed from: g */
    private static void m21495g(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: h */
    private void m21494h() {
        boolean z;
        if (this.f19275s && this.f19276t) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.f19267k;
        if (sensor != null && z != this.f19277u) {
            if (z) {
                this.f19266j.registerListener(this.f19268l, sensor, 0);
            } else {
                this.f19266j.unregisterListener(this.f19268l);
            }
            this.f19277u = z;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19269m.post(new Runnable() { // from class: h8.f
            @Override // java.lang.Runnable
            public final void run() {
                C7036h.this.m21498d();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f19276t = false;
        m21494h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f19276t = true;
        m21494h();
    }

    public void setDefaultStereoMode(int i) {
        this.f19271o.m21503h(i);
    }

    public void setSingleTapListener(InterfaceC7033e interfaceC7033e) {
        this.f19270n.m21490b(interfaceC7033e);
    }

    public void setUseSensorRotation(boolean z) {
        this.f19275s = z;
        m21494h();
    }

    public void setVideoComponent(Player.InterfaceC4373c interfaceC4373c) {
        Player.InterfaceC4373c interfaceC4373c2 = this.f19274r;
        if (interfaceC4373c == interfaceC4373c2) {
            return;
        }
        if (interfaceC4373c2 != null) {
            Surface surface = this.f19273q;
            if (surface != null) {
                interfaceC4373c2.mo29802f(surface);
            }
            this.f19274r.mo29821R(this.f19271o);
            this.f19274r.mo29772y(this.f19271o);
        }
        this.f19274r = interfaceC4373c;
        if (interfaceC4373c != null) {
            interfaceC4373c.mo29785p(this.f19271o);
            this.f19274r.mo29780s(this.f19271o);
            this.f19274r.mo29810a(this.f19273q);
        }
    }

    public C7036h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19269m = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C9149a.m16448e(context.getSystemService("sensor"));
        this.f19266j = sensorManager;
        Sensor defaultSensor = C9191p0.f24171a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f19267k = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C7032d c7032d = new C7032d();
        this.f19271o = c7032d;
        C7037a c7037a = new C7037a(c7032d);
        View$OnTouchListenerC7038i view$OnTouchListenerC7038i = new View$OnTouchListenerC7038i(context, c7037a, 25.0f);
        this.f19270n = view$OnTouchListenerC7038i;
        this.f19268l = new C7027a(((WindowManager) C9149a.m16448e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), view$OnTouchListenerC7038i, c7037a);
        this.f19275s = true;
        setEGLContextClientVersion(2);
        setRenderer(c7037a);
        setOnTouchListener(view$OnTouchListenerC7038i);
    }
}