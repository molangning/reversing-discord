package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AspectRatioMeasure {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Spec {

        /* renamed from: a */
        public int f10008a;

        /* renamed from: b */
        public int f10009b;
    }

    /* renamed from: a */
    private static boolean m31365a(int i) {
        return i == 0 || i == -2;
    }

    /* renamed from: b */
    public static void m31364b(Spec spec, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (m31365a(layoutParams.height)) {
                spec.f10009b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.f10008a) - i) / f) + i2), spec.f10009b), 1073741824);
            } else if (m31365a(layoutParams.width)) {
                spec.f10008a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.f10009b) - i2) * f) + i), spec.f10008a), 1073741824);
            }
        }
    }
}