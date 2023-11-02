package p195k8;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: k8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RunnableC9173i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: p */
    private static final int[] f24145p = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: j */
    private final Handler f24146j;

    /* renamed from: k */
    private final int[] f24147k;

    /* renamed from: l */
    private EGLDisplay f24148l;

    /* renamed from: m */
    private EGLContext f24149m;

    /* renamed from: n */
    private EGLSurface f24150n;

    /* renamed from: o */
    private SurfaceTexture f24151o;

    /* renamed from: k8.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9175b extends RuntimeException {
        private C9175b(String str) {
            super(str);
        }
    }

    /* renamed from: k8.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9176c {
    }

    public RunnableC9173i(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    private static EGLConfig m16383a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f24145p, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        throw new C9175b(C9191p0.m16307D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: b */
    private static EGLContext m16382b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C9175b("eglCreateContext failed");
    }

    /* renamed from: c */
    private static EGLSurface m16381c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eglCreatePbufferSurface == null) {
                throw new C9175b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new C9175b("eglMakeCurrent failed");
    }

    /* renamed from: d */
    private void m16380d() {
    }

    /* renamed from: e */
    private static void m16379e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C9182l.m16355b();
    }

    /* renamed from: f */
    private static EGLDisplay m16378f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C9175b("eglInitialize failed");
        }
        throw new C9175b("eglGetDisplay failed");
    }

    /* renamed from: g */
    public SurfaceTexture m16377g() {
        return (SurfaceTexture) C9149a.m16448e(this.f24151o);
    }

    /* renamed from: h */
    public void m16376h(int i) {
        EGLDisplay m16378f = m16378f();
        this.f24148l = m16378f;
        EGLConfig m16383a = m16383a(m16378f);
        EGLContext m16382b = m16382b(this.f24148l, m16383a, i);
        this.f24149m = m16382b;
        this.f24150n = m16381c(this.f24148l, m16383a, m16382b, i);
        m16379e(this.f24147k);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f24147k[0]);
        this.f24151o = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    /* renamed from: i */
    public void m16375i() {
        this.f24146j.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f24151o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f24147k, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f24148l;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f24148l;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f24150n;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f24148l, this.f24150n);
            }
            EGLContext eGLContext = this.f24149m;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f24148l, eGLContext);
            }
            if (C9191p0.f24171a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f24148l;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f24148l);
            }
            this.f24148l = null;
            this.f24149m = null;
            this.f24150n = null;
            this.f24151o = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f24146j.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m16380d();
        SurfaceTexture surfaceTexture = this.f24151o;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC9173i(Handler handler, InterfaceC9176c interfaceC9176c) {
        this.f24146j = handler;
        this.f24147k = new int[1];
    }
}
