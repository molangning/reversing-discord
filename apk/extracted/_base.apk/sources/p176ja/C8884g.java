package p176ja;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: ja.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8884g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f23270a = new float[9];

    /* renamed from: b */
    private final float[] f23271b = new float[9];

    /* renamed from: c */
    private final Matrix f23272c = new Matrix();

    /* renamed from: a */
    public Matrix mo17100a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f23270a);
        matrix2.getValues(this.f23271b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f23271b;
            float f2 = fArr[i];
            float f3 = this.f23270a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f23272c.setValues(this.f23271b);
        return this.f23272c;
    }
}
