package p286pd;

import android.graphics.PointF;
import android.opengl.Matrix;
import p266od.C11084d;

/* renamed from: pd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11499a {
    /* renamed from: a */
    public static float[] m7973a(float[] fArr, C11084d c11084d) {
        boolean z;
        float abs;
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = fArr[0];
        if (f5 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abs = Math.abs(fArr[4]);
        } else {
            abs = Math.abs(f5);
        }
        float f6 = 1.0f / abs;
        if (z) {
            PointF pointF = c11084d.f29034a;
            f = pointF.x;
            f2 = pointF.y * f6;
        } else {
            PointF pointF2 = c11084d.f29034a;
            f = pointF2.x * f6;
            f2 = pointF2.y;
        }
        if (z) {
            PointF pointF3 = c11084d.f29035b;
            f3 = (pointF3.x * 2.0f) - 1.0f;
            f4 = (1.0f - (pointF3.y * 2.0f)) * f6;
        } else {
            PointF pointF4 = c11084d.f29035b;
            f3 = ((pointF4.x * 2.0f) - 1.0f) * f6;
            f4 = 1.0f - (pointF4.y * 2.0f);
        }
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, f3, f4, 0.0f);
        Matrix.rotateM(fArr2, 0, c11084d.f29036c, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr2, 0, f, f2, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }
}