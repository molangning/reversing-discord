package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: androidx.transition.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1901x extends C1900w {

    /* renamed from: g */
    private static boolean f5219g = true;

    @Override // androidx.transition.C1903z
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo35082f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo35082f(view, i);
        } else if (f5219g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5219g = false;
            }
        }
    }
}