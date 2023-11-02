package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1898u extends C1903z {

    /* renamed from: c */
    private static boolean f5215c = true;

    @Override // androidx.transition.C1903z
    /* renamed from: a */
    public void mo35087a(View view) {
    }

    @Override // androidx.transition.C1903z
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo35086b(View view) {
        float transitionAlpha;
        if (f5215c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f5215c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.C1903z
    /* renamed from: c */
    public void mo35085c(View view) {
    }

    @Override // androidx.transition.C1903z
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo35083e(View view, float f) {
        if (f5215c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5215c = false;
            }
        }
        view.setAlpha(f);
    }
}