package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C1365w0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1895t {

    /* renamed from: a */
    private static final C1903z f5212a;

    /* renamed from: b */
    static final Property<View, Float> f5213b;

    /* renamed from: c */
    static final Property<View, Rect> f5214c;

    /* renamed from: androidx.transition.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1896a extends Property<View, Float> {
        C1896a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1895t.m35099c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C1895t.m35095g(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.t$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1897b extends Property<View, Rect> {
        C1897b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return C1365w0.m37178u(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            C1365w0.m37171x0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f5212a = new C1902y();
        } else {
            f5212a = new C1901x();
        }
        f5213b = new C1896a(Float.class, "translationAlpha");
        f5214c = new C1897b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35101a(View view) {
        f5212a.mo35087a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1894s m35100b(View view) {
        return new C1893r(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m35099c(View view) {
        return f5212a.mo35086b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC1870c0 m35098d(View view) {
        return new C1866b0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m35097e(View view) {
        f5212a.mo35085c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m35096f(View view, int i, int i2, int i3, int i4) {
        f5212a.mo35084d(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m35095g(View view, float f) {
        f5212a.mo35083e(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m35094h(View view, int i) {
        f5212a.mo35082f(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m35093i(View view, Matrix matrix) {
        f5212a.mo35081g(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m35092j(View view, Matrix matrix) {
        f5212a.mo35080h(view, matrix);
    }
}
