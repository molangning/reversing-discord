package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1899v extends C1898u {

    /* renamed from: d */
    private static boolean f5216d = true;

    /* renamed from: e */
    private static boolean f5217e = true;

    @Override // androidx.transition.C1903z
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo35081g(View view, Matrix matrix) {
        if (f5216d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5216d = false;
            }
        }
    }

    @Override // androidx.transition.C1903z
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo35080h(View view, Matrix matrix) {
        if (f5217e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5217e = false;
            }
        }
    }
}
