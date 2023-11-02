package td;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import md.C10438c;
import p266od.InterfaceC11082b;
import p266od.InterfaceC11083c;
import p302qd.C11827a;

/* renamed from: td.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12662g implements InterfaceC12664i {

    /* renamed from: g */
    protected static final String f32820g = "rotation-degrees";

    /* renamed from: a */
    private final boolean f32821a;

    /* renamed from: b */
    private C12665j f32822b;

    /* renamed from: c */
    private C12666k f32823c;

    /* renamed from: f */
    private boolean f32826f;

    /* renamed from: e */
    private float[] f32825e = new float[16];

    /* renamed from: d */
    private List<InterfaceC11082b> f32824d = new ArrayList();

    public C12662g(List<InterfaceC11082b> list) {
        boolean z;
        boolean z2 = true;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.f32821a = z;
        if (list == null) {
            this.f32824d.add(new C11827a());
            return;
        }
        Iterator<InterfaceC11082b> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof InterfaceC11083c) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            this.f32824d.add(new C11827a());
        }
        this.f32824d.addAll(list);
    }

    /* renamed from: e */
    private void m4591e(long j) {
        m4589g();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        for (InterfaceC11082b interfaceC11082b : this.f32824d) {
            interfaceC11082b.apply(j);
        }
        GLES20.glFinish();
    }

    /* renamed from: g */
    private void m4589g() {
        if (!this.f32826f) {
            for (InterfaceC11082b interfaceC11082b : this.f32824d) {
                if (interfaceC11082b instanceof InterfaceC11083c) {
                    ((InterfaceC11083c) interfaceC11082b).mo6814b(this.f32822b.m4579d(), this.f32822b.m4578e());
                }
            }
            this.f32826f = true;
        }
    }

    /* renamed from: h */
    private void m4588h(int i, float f) {
        float f2;
        float f3;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.orthoM(fArr, 0, -f, f, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (i != 0) {
            if (i != 90) {
                f4 = -1.0f;
                if (i != 180) {
                    if (i != 270) {
                        double d = (i / 180) * 3.141592653589793d;
                        f5 = (float) Math.sin(d);
                        f2 = (float) Math.cos(d);
                        f3 = f5;
                        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f3, f2, 0.0f);
                        Matrix.setIdentityM(this.f32825e, 0);
                        Matrix.multiplyMM(this.f32825e, 0, fArr, 0, fArr2, 0);
                    }
                }
            }
            f3 = f4;
            f2 = 0.0f;
            Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f3, f2, 0.0f);
            Matrix.setIdentityM(this.f32825e, 0);
            Matrix.multiplyMM(this.f32825e, 0, fArr, 0, fArr2, 0);
        }
        f2 = f4;
        f3 = f5;
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f3, f2, 0.0f);
        Matrix.setIdentityM(this.f32825e, 0);
        Matrix.multiplyMM(this.f32825e, 0, fArr, 0, fArr2, 0);
    }

    @Override // td.InterfaceC12664i
    /* renamed from: a */
    public boolean mo4586a() {
        return this.f32821a;
    }

    @Override // td.InterfaceC12664i
    /* renamed from: b */
    public void mo4585b(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        int i;
        float f;
        int i2;
        if (surface != null) {
            if (mediaFormat2 != null) {
                String str = f32820g;
                if (mediaFormat2.containsKey(str)) {
                    i = mediaFormat2.getInteger(str);
                } else if (mediaFormat != null && mediaFormat.containsKey(str)) {
                    i = mediaFormat.getInteger(str);
                } else {
                    i = 0;
                }
                if (mediaFormat2.containsKey("width") && mediaFormat2.containsKey("height")) {
                    f = mediaFormat2.getInteger("width") / mediaFormat2.getInteger("height");
                } else {
                    f = 1.0f;
                }
                this.f32823c = new C12666k(surface);
                int i3 = -1;
                if (mediaFormat != null && mediaFormat.containsKey("width")) {
                    i2 = mediaFormat.getInteger("width");
                } else {
                    i2 = -1;
                }
                if (mediaFormat != null && mediaFormat.containsKey("height")) {
                    i3 = mediaFormat.getInteger("height");
                }
                this.f32822b = new C12665j(i2, i3);
                m4588h(i, f);
                for (InterfaceC11082b interfaceC11082b : this.f32824d) {
                    interfaceC11082b.mo6813c();
                    float[] fArr = this.f32825e;
                    interfaceC11082b.mo6815a(Arrays.copyOf(fArr, fArr.length), 0);
                }
                return;
            }
            throw new IllegalArgumentException("GlVideoRenderer requires target media format");
        }
        throw new IllegalArgumentException("GlVideoRenderer requires an output surface");
    }

    @Override // td.InterfaceC12664i
    /* renamed from: c */
    public void mo4584c(C10438c c10438c, long j) {
        this.f32822b.m4582a();
        m4591e(j);
        this.f32823c.m4572e(j);
        this.f32823c.m4571f();
    }

    @Override // td.InterfaceC12664i
    /* renamed from: d */
    public void mo4583d(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
    }

    /* renamed from: f */
    public Surface m4590f() {
        C12665j c12665j = this.f32822b;
        if (c12665j != null) {
            return c12665j.m4580c();
        }
        return null;
    }

    @Override // td.InterfaceC12664i
    public void release() {
        for (InterfaceC11082b interfaceC11082b : this.f32824d) {
            interfaceC11082b.release();
        }
        this.f32822b.m4577f();
        this.f32823c.m4573d();
    }
}
