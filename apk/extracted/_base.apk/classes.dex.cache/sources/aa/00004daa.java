package td;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import org.webrtc.EglBase;

/* renamed from: td.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C12666k {

    /* renamed from: a */
    private EGLDisplay f32832a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f32833b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLSurface f32834c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private Surface f32835d;

    public C12666k(Surface surface) {
        this.f32835d = surface;
        m4575b();
        m4574c();
    }

    /* renamed from: a */
    private void m4576a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* renamed from: b */
    private void m4575b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f32832a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f32832a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    this.f32833b = EGL14.eglCreateContext(this.f32832a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    m4576a("eglCreateContext");
                    if (this.f32833b != null) {
                        this.f32834c = EGL14.eglCreateWindowSurface(this.f32832a, eGLConfigArr[0], this.f32835d, new int[]{12344}, 0);
                        m4576a("eglCreateWindowSurface");
                        if (this.f32834c != null) {
                            return;
                        }
                        throw new RuntimeException("surface was null");
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.f32832a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    /* renamed from: c */
    private void m4574c() {
        EGLDisplay eGLDisplay = this.f32832a;
        EGLSurface eGLSurface = this.f32834c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f32833b)) {
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }

    /* renamed from: d */
    public void m4573d() {
        EGLDisplay eGLDisplay = this.f32832a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, this.f32834c);
            EGL14.eglDestroyContext(this.f32832a, this.f32833b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f32832a);
            this.f32832a = EGL14.EGL_NO_DISPLAY;
            this.f32833b = EGL14.EGL_NO_CONTEXT;
            this.f32834c = EGL14.EGL_NO_SURFACE;
        }
        Surface surface = this.f32835d;
        if (surface != null) {
            surface.release();
            this.f32835d = null;
        }
    }

    /* renamed from: e */
    public void m4572e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f32832a, this.f32834c, j);
    }

    /* renamed from: f */
    public boolean m4571f() {
        return EGL14.eglSwapBuffers(this.f32832a, this.f32834c);
    }
}