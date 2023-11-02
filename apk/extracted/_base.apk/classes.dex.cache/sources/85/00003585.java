package p132h8;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p195k8.C9182l;
import p230m8.C10359d;

/* renamed from: h8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7029b {

    /* renamed from: j */
    private static final String[] f19229j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k */
    private static final String[] f19230k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l */
    private static final float[] f19231l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    private static final float[] f19232m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    private static final float[] f19233n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o */
    private static final float[] f19234o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p */
    private static final float[] f19235p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f19236a;

    /* renamed from: b */
    private C7030a f19237b;

    /* renamed from: c */
    private C7030a f19238c;

    /* renamed from: d */
    private int f19239d;

    /* renamed from: e */
    private int f19240e;

    /* renamed from: f */
    private int f19241f;

    /* renamed from: g */
    private int f19242g;

    /* renamed from: h */
    private int f19243h;

    /* renamed from: i */
    private int f19244i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7030a {

        /* renamed from: a */
        private final int f19245a;

        /* renamed from: b */
        private final FloatBuffer f19246b;

        /* renamed from: c */
        private final FloatBuffer f19247c;

        /* renamed from: d */
        private final int f19248d;

        public C7030a(C10359d.C10361b c10361b) {
            this.f19245a = c10361b.m11665a();
            this.f19246b = C9182l.m16351f(c10361b.f27107c);
            this.f19247c = C9182l.m16351f(c10361b.f27108d);
            int i = c10361b.f27106b;
            if (i != 1) {
                if (i != 2) {
                    this.f19248d = 4;
                    return;
                } else {
                    this.f19248d = 6;
                    return;
                }
            }
            this.f19248d = 5;
        }
    }

    /* renamed from: c */
    public static boolean m21513c(C10359d c10359d) {
        C10359d.C10360a c10360a = c10359d.f27100a;
        C10359d.C10360a c10360a2 = c10359d.f27101b;
        if (c10360a.m11666b() != 1 || c10360a.m11667a(0).f27105a != 0 || c10360a2.m11666b() != 1 || c10360a2.m11667a(0).f27105a != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m21515a(int i, float[] fArr, boolean z) {
        C7030a c7030a;
        float[] fArr2;
        if (z) {
            c7030a = this.f19238c;
        } else {
            c7030a = this.f19237b;
        }
        if (c7030a == null) {
            return;
        }
        GLES20.glUseProgram(this.f19239d);
        C9182l.m16355b();
        GLES20.glEnableVertexAttribArray(this.f19242g);
        GLES20.glEnableVertexAttribArray(this.f19243h);
        C9182l.m16355b();
        int i2 = this.f19236a;
        if (i2 == 1) {
            if (z) {
                fArr2 = f19233n;
            } else {
                fArr2 = f19232m;
            }
        } else if (i2 == 2) {
            if (z) {
                fArr2 = f19235p;
            } else {
                fArr2 = f19234o;
            }
        } else {
            fArr2 = f19231l;
        }
        GLES20.glUniformMatrix3fv(this.f19241f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f19240e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f19244i, 0);
        C9182l.m16355b();
        GLES20.glVertexAttribPointer(this.f19242g, 3, 5126, false, 12, (Buffer) c7030a.f19246b);
        C9182l.m16355b();
        GLES20.glVertexAttribPointer(this.f19243h, 2, 5126, false, 8, (Buffer) c7030a.f19247c);
        C9182l.m16355b();
        GLES20.glDrawArrays(c7030a.f19248d, 0, c7030a.f19245a);
        C9182l.m16355b();
        GLES20.glDisableVertexAttribArray(this.f19242g);
        GLES20.glDisableVertexAttribArray(this.f19243h);
    }

    /* renamed from: b */
    public void m21514b() {
        int m16353d = C9182l.m16353d(f19229j, f19230k);
        this.f19239d = m16353d;
        this.f19240e = GLES20.glGetUniformLocation(m16353d, "uMvpMatrix");
        this.f19241f = GLES20.glGetUniformLocation(this.f19239d, "uTexMatrix");
        this.f19242g = GLES20.glGetAttribLocation(this.f19239d, "aPosition");
        this.f19243h = GLES20.glGetAttribLocation(this.f19239d, "aTexCoords");
        this.f19244i = GLES20.glGetUniformLocation(this.f19239d, "uTexture");
    }

    /* renamed from: d */
    public void m21512d(C10359d c10359d) {
        if (!m21513c(c10359d)) {
            return;
        }
        this.f19236a = c10359d.f27102c;
        C7030a c7030a = new C7030a(c10359d.f27100a.m11667a(0));
        this.f19237b = c7030a;
        if (!c10359d.f27103d) {
            c7030a = new C7030a(c10359d.f27101b.m11667a(0));
        }
        this.f19238c = c7030a;
    }
}