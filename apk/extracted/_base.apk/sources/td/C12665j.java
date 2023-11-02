package td;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: td.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C12665j implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: j */
    private SurfaceTexture f32827j;

    /* renamed from: k */
    private Surface f32828k;

    /* renamed from: n */
    private boolean f32831n;

    /* renamed from: m */
    private final Object f32830m = new Object();

    /* renamed from: l */
    private int f32829l = m4581b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12665j(int i, int i2) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f32829l);
        this.f32827j = surfaceTexture;
        if (i != -1 && i2 != -1) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.f32828k = new Surface(this.f32827j);
        this.f32827j.setOnFrameAvailableListener(this);
    }

    /* renamed from: b */
    private int m4581b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        C12661f.m4594a("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C12661f.m4594a("glTexParameter");
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4582a() {
        synchronized (this.f32830m) {
            while (!this.f32831n) {
                try {
                    this.f32830m.wait(10000L);
                    if (!this.f32831n) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f32831n = false;
        }
        C12661f.m4594a("before updateTexImage");
        this.f32827j.updateTexImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Surface m4580c() {
        return this.f32828k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m4579d() {
        return this.f32829l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float[] m4578e() {
        float[] fArr = new float[16];
        this.f32827j.getTransformMatrix(fArr);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m4577f() {
        Surface surface = this.f32828k;
        if (surface != null) {
            surface.release();
            this.f32828k = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f32830m) {
            if (!this.f32831n) {
                this.f32831n = true;
                this.f32830m.notifyAll();
            } else {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
        }
    }
}
