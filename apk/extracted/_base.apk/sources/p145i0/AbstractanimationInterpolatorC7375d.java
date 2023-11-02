package p145i0;

import android.view.animation.Interpolator;

/* renamed from: i0.d  reason: invalid class name */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
abstract class AbstractanimationInterpolatorC7375d implements Interpolator {

    /* renamed from: a */
    private final float[] f19848a;

    /* renamed from: b */
    private final float f19849b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractanimationInterpolatorC7375d(float[] fArr) {
        this.f19848a = fArr;
        this.f19849b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19848a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f19849b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f19848a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
