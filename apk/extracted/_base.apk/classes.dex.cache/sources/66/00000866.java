package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1900w extends C1899v {

    /* renamed from: f */
    private static boolean f5218f = true;

    @Override // androidx.transition.C1903z
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo35084d(View view, int i, int i2, int i3, int i4) {
        if (f5218f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5218f = false;
            }
        }
    }
}