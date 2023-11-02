package p213l8;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p195k8.C9149a;
import p195k8.C9182l;

/* renamed from: l8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C10077i implements GLSurfaceView.Renderer, InterfaceC10080l {

    /* renamed from: t */
    private static final float[] f26248t = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

    /* renamed from: u */
    private static final float[] f26249u = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* renamed from: v */
    private static final float[] f26250v = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

    /* renamed from: w */
    private static final String[] f26251w = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: x */
    private static final FloatBuffer f26252x = C9182l.m16351f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: j */
    private final GLSurfaceView f26253j;

    /* renamed from: n */
    private int f26257n;

    /* renamed from: p */
    private int f26259p;

    /* renamed from: s */
    private C10079k f26262s;

    /* renamed from: k */
    private final int[] f26254k = new int[3];

    /* renamed from: l */
    private final AtomicReference<C10079k> f26255l = new AtomicReference<>();

    /* renamed from: m */
    private FloatBuffer[] f26256m = new FloatBuffer[3];

    /* renamed from: o */
    private int[] f26258o = new int[3];

    /* renamed from: q */
    private int[] f26260q = new int[3];

    /* renamed from: r */
    private int[] f26261r = new int[3];

    public C10077i(GLSurfaceView gLSurfaceView) {
        this.f26253j = gLSurfaceView;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f26260q;
            this.f26261r[i] = -1;
            iArr[i] = -1;
        }
    }

    /* renamed from: a */
    private void m12342a() {
        GLES20.glGenTextures(3, this.f26254k, 0);
        for (int i = 0; i < 3; i++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f26257n, f26251w[i]), i);
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.f26254k[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        C9182l.m16355b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z;
        int i;
        C10079k andSet = this.f26255l.getAndSet(null);
        if (andSet == null && this.f26262s == null) {
            return;
        }
        if (andSet != null) {
            C10079k c10079k = this.f26262s;
            if (c10079k != null) {
                c10079k.mo2498o();
            }
            this.f26262s = andSet;
        }
        C10079k c10079k2 = (C10079k) C9149a.m16448e(this.f26262s);
        float[] fArr = f26249u;
        int i2 = c10079k2.f26268q;
        if (i2 != 1) {
            if (i2 == 3) {
                fArr = f26250v;
            }
        } else {
            fArr = f26248t;
        }
        GLES20.glUniformMatrix3fv(this.f26259p, 1, false, fArr, 0);
        int[] iArr = (int[]) C9149a.m16448e(c10079k2.f26267p);
        ByteBuffer[] byteBufferArr = (ByteBuffer[]) C9149a.m16448e(c10079k2.f26266o);
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0) {
                i = c10079k2.f26265n;
            } else {
                i = (c10079k2.f26265n + 1) / 2;
            }
            GLES20.glActiveTexture(33984 + i3);
            GLES20.glBindTexture(3553, this.f26254k[i3]);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i, 0, 6409, 5121, byteBufferArr[i3]);
        }
        int i4 = c10079k2.f26264m;
        int i5 = (i4 + 1) / 2;
        int[] iArr2 = {i4, i5, i5};
        for (int i6 = 0; i6 < 3; i6++) {
            if (this.f26260q[i6] != iArr2[i6] || this.f26261r[i6] != iArr[i6]) {
                if (iArr[i6] != 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9149a.m16447f(z);
                float f = iArr2[i6] / iArr[i6];
                this.f26256m[i6] = C9182l.m16351f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                GLES20.glVertexAttribPointer(this.f26258o[i6], 2, 5126, false, 0, (Buffer) this.f26256m[i6]);
                this.f26260q[i6] = iArr2[i6];
                this.f26261r[i6] = iArr[i6];
            }
        }
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
        C9182l.m16355b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int m16354c = C9182l.m16354c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f26257n = m16354c;
        GLES20.glUseProgram(m16354c);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f26257n, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f26252x);
        this.f26258o[0] = GLES20.glGetAttribLocation(this.f26257n, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f26258o[0]);
        this.f26258o[1] = GLES20.glGetAttribLocation(this.f26257n, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f26258o[1]);
        this.f26258o[2] = GLES20.glGetAttribLocation(this.f26257n, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f26258o[2]);
        C9182l.m16355b();
        this.f26259p = GLES20.glGetUniformLocation(this.f26257n, "mColorConversion");
        C9182l.m16355b();
        m12342a();
        C9182l.m16355b();
    }
}
