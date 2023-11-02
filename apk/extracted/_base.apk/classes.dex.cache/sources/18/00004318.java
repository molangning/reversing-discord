package p230m8;

import android.opengl.Matrix;
import p195k8.C9181k0;

/* renamed from: m8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10358c {

    /* renamed from: a */
    private final float[] f27096a = new float[16];

    /* renamed from: b */
    private final float[] f27097b = new float[16];

    /* renamed from: c */
    private final C9181k0<float[]> f27098c = new C9181k0<>();

    /* renamed from: d */
    private boolean f27099d;

    /* renamed from: a */
    public static void m11674a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }

    /* renamed from: b */
    private static void m11673b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    /* renamed from: c */
    public boolean m11672c(float[] fArr, long j) {
        float[] m16359j = this.f27098c.m16359j(j);
        if (m16359j == null) {
            return false;
        }
        m11673b(this.f27097b, m16359j);
        if (!this.f27099d) {
            m11674a(this.f27096a, this.f27097b);
            this.f27099d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f27096a, 0, this.f27097b, 0);
        return true;
    }

    /* renamed from: d */
    public void m11671d() {
        this.f27098c.m16366c();
        this.f27099d = false;
    }

    /* renamed from: e */
    public void m11670e(long j, float[] fArr) {
        this.f27098c.m16368a(j, fArr);
    }
}