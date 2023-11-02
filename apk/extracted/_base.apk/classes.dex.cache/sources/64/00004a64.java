package p302qd;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p266od.C11084d;
import p266od.InterfaceC11083c;
import p286pd.C11499a;
import p323rd.AbstractC12123a;
import td.C12661f;

/* renamed from: qd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11828b implements InterfaceC11083c {

    /* renamed from: a */
    private final String f30815a;

    /* renamed from: b */
    private final String f30816b;

    /* renamed from: c */
    private final AbstractC12123a[] f30817c;

    /* renamed from: d */
    private final C11084d f30818d;

    /* renamed from: e */
    private float[] f30819e = new float[16];

    /* renamed from: f */
    private float[] f30820f = new float[16];

    /* renamed from: g */
    private int f30821g;

    /* renamed from: h */
    private FloatBuffer f30822h;

    /* renamed from: i */
    private final float[] f30823i;

    /* renamed from: j */
    private int f30824j;

    /* renamed from: k */
    private int f30825k;

    /* renamed from: l */
    private int f30826l;

    /* renamed from: m */
    private int f30827m;

    /* renamed from: n */
    private int f30828n;

    /* renamed from: o */
    private int f30829o;

    /* renamed from: p */
    private int f30830p;

    /* renamed from: q */
    private int f30831q;

    public C11828b(String str, String str2, AbstractC12123a[] abstractC12123aArr, C11084d c11084d) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f30823i = fArr;
        this.f30815a = str;
        this.f30816b = str2;
        this.f30817c = abstractC12123aArr;
        this.f30818d = c11084d == null ? new C11084d(new PointF(1.0f, 1.0f), new PointF(0.5f, 0.5f), 0.0f) : c11084d;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f30822h = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
    }

    @Override // p266od.InterfaceC11082b
    /* renamed from: a */
    public void mo6815a(float[] fArr, int i) {
        this.f30819e = C11499a.m7973a(fArr, this.f30818d);
        this.f30821g = i;
    }

    @Override // p266od.InterfaceC11082b
    public void apply(long j) {
        this.f30822h.position(0);
        GLES20.glVertexAttribPointer(this.f30830p, 3, 5126, false, 20, (Buffer) this.f30822h);
        C12661f.m4594a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f30830p);
        C12661f.m4594a("glEnableVertexAttribArray aPositionHandle");
        this.f30822h.position(3);
        GLES20.glVertexAttribPointer(this.f30831q, 2, 5126, false, 20, (Buffer) this.f30822h);
        C12661f.m4594a("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f30831q);
        C12661f.m4594a("glEnableVertexAttribArray aTextureHandle");
        C12661f.m4594a("onDrawFrame start");
        GLES20.glUseProgram(this.f30826l);
        C12661f.m4594a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f30829o);
        AbstractC12123a[] abstractC12123aArr = this.f30817c;
        if (abstractC12123aArr != null && abstractC12123aArr.length > 0) {
            AbstractC12123a abstractC12123a = abstractC12123aArr[0];
            throw null;
        }
        GLES20.glUniformMatrix4fv(this.f30827m, 1, false, this.f30819e, this.f30821g);
        GLES20.glUniformMatrix4fv(this.f30828n, 1, false, this.f30820f, 0);
        GLES20.glDrawArrays(5, 0, 4);
        C12661f.m4594a("glDrawArrays");
    }

    @Override // p266od.InterfaceC11083c
    /* renamed from: b */
    public void mo6814b(int i, float[] fArr) {
        this.f30829o = i;
        this.f30820f = fArr;
    }

    @Override // p266od.InterfaceC11082b
    /* renamed from: c */
    public void mo6813c() {
        Matrix.setIdentityM(this.f30820f, 0);
        int m4592c = C12661f.m4592c(35633, this.f30815a);
        this.f30824j = m4592c;
        if (m4592c != 0) {
            int m4592c2 = C12661f.m4592c(35632, this.f30816b);
            this.f30825k = m4592c2;
            if (m4592c2 != 0) {
                int m4593b = C12661f.m4593b(this.f30824j, m4592c2);
                this.f30826l = m4593b;
                if (m4593b != 0) {
                    this.f30830p = GLES20.glGetAttribLocation(m4593b, "aPosition");
                    C12661f.m4594a("glGetAttribLocation aPosition");
                    if (this.f30830p != -1) {
                        this.f30831q = GLES20.glGetAttribLocation(this.f30826l, "aTextureCoord");
                        C12661f.m4594a("glGetAttribLocation aTextureCoord");
                        if (this.f30831q != -1) {
                            this.f30827m = GLES20.glGetUniformLocation(this.f30826l, "uMVPMatrix");
                            C12661f.m4594a("glGetUniformLocation uMVPMatrix");
                            if (this.f30827m != -1) {
                                this.f30828n = GLES20.glGetUniformLocation(this.f30826l, "uSTMatrix");
                                C12661f.m4594a("glGetUniformLocation uSTMatrix");
                                if (this.f30828n != -1) {
                                    return;
                                }
                                throw new RuntimeException("Could not get attrib location for uSTMatrix");
                            }
                            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                        }
                        throw new RuntimeException("Could not get attrib location for aTextureCoord");
                    }
                    throw new RuntimeException("Could not get attrib location for aPosition");
                }
                release();
                throw new RuntimeException("failed creating glProgram");
            }
            release();
            throw new RuntimeException("failed loading fragment shader");
        }
        throw new RuntimeException("failed loading vertex shader");
    }

    @Override // p266od.InterfaceC11082b
    public void release() {
        GLES20.glDeleteProgram(this.f30826l);
        GLES20.glDeleteShader(this.f30824j);
        GLES20.glDeleteShader(this.f30825k);
        GLES20.glDeleteBuffers(1, new int[]{this.f30831q}, 0);
        this.f30826l = 0;
        this.f30824j = 0;
        this.f30825k = 0;
        this.f30831q = 0;
    }
}