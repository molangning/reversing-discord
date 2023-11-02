package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1902y extends C1901x {
    @Override // androidx.transition.C1898u, androidx.transition.C1903z
    /* renamed from: b */
    public float mo35086b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.C1900w, androidx.transition.C1903z
    /* renamed from: d */
    public void mo35084d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.C1898u, androidx.transition.C1903z
    /* renamed from: e */
    public void mo35083e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.C1901x, androidx.transition.C1903z
    /* renamed from: f */
    public void mo35082f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.C1899v, androidx.transition.C1903z
    /* renamed from: g */
    public void mo35081g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.C1899v, androidx.transition.C1903z
    /* renamed from: h */
    public void mo35080h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}