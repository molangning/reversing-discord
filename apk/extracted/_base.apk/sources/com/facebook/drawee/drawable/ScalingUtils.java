package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ScalingUtils {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ScaleType {

        /* renamed from: a */
        public static final ScaleType f9836a = C3603j.f9855l;

        /* renamed from: b */
        public static final ScaleType f9837b = C3602i.f9854l;

        /* renamed from: c */
        public static final ScaleType f9838c = C3604k.f9856l;

        /* renamed from: d */
        public static final ScaleType f9839d = C3601h.f9853l;

        /* renamed from: e */
        public static final ScaleType f9840e = C3599f.f9851l;

        /* renamed from: f */
        public static final ScaleType f9841f = C3600g.f9852l;

        /* renamed from: g */
        public static final ScaleType f9842g = C3595b.f9847l;

        /* renamed from: h */
        public static final ScaleType f9843h = C3597d.f9849l;

        /* renamed from: i */
        public static final ScaleType f9844i = C3596c.f9848l;

        /* renamed from: j */
        public static final ScaleType f9845j = C3605l.f9857l;

        /* renamed from: k */
        public static final ScaleType f9846k = C3598e.f9850l;

        Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC3594a implements ScaleType {
        @Override // com.facebook.drawee.drawable.ScalingUtils.ScaleType
        public Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            getTransformImpl(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        public abstract void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3595b extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9847l = new C3595b();

        private C3595b() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3596c extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9848l = new C3596c();

        private C3596c() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float height;
            float f5;
            if (f4 > f3) {
                f5 = rect.left + ((rect.width() - (i * f4)) * 0.5f);
                height = rect.top;
                f3 = f4;
            } else {
                height = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                f5 = rect.left;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3597d extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9849l = new C3597d();

        private C3597d() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3598e extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9850l = new C3598e();

        private C3598e() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3599f extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9851l = new C3599f();

        private C3599f() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3600g extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9852l = new C3600g();

        private C3600g() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i * min)) + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3601h extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9853l = new C3601h();

        private C3601h() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3602i extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9854l = new C3602i();

        private C3602i() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float height = rect.top + ((rect.height() - (i2 * f3)) * 0.5f);
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3603j extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9855l = new C3603j();

        private C3603j() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3604k extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9856l = new C3604k();

        private C3604k() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (rect.left + ((rect.width() - (i * f4)) * 0.5f) + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3605l extends AbstractC3594a {

        /* renamed from: l */
        public static final ScaleType f9857l = new C3605l();

        private C3605l() {
        }

        @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractC3594a
        public void getTransformImpl(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float max;
            if (f4 > f3) {
                float f6 = i * f4;
                f5 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f6), 0.0f), rect.width() - f6);
                max = rect.top;
                f3 = f4;
            } else {
                f5 = rect.left;
                float f7 = i2 * f3;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), 0.0f), rect.height() - f7) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3606m {
        Object getState();
    }

    /* renamed from: a */
    public static C3624n m31535a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof C3624n) {
            return (C3624n) drawable;
        }
        if (drawable instanceof InterfaceC3610c) {
            return m31535a(((InterfaceC3610c) drawable).getDrawable());
        }
        if (drawable instanceof C3607a) {
            C3607a c3607a = (C3607a) drawable;
            int m31531d = c3607a.m31531d();
            for (int i = 0; i < m31531d; i++) {
                C3624n m31535a = m31535a(c3607a.m31533b(i));
                if (m31535a != null) {
                    return m31535a;
                }
            }
        }
        return null;
    }
}
