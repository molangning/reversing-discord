package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1903z {

    /* renamed from: a */
    private static Field f5220a;

    /* renamed from: b */
    private static boolean f5221b;

    /* renamed from: a */
    public void mo35087a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo35086b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo35085c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo35084d(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: e */
    public void mo35083e(View view, float f) {
        throw null;
    }

    /* renamed from: f */
    public void mo35082f(View view, int i) {
        if (!f5221b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5220a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5221b = true;
        }
        Field field = f5220a;
        if (field != null) {
            try {
                f5220a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo35081g(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: h */
    public void mo35080h(View view, Matrix matrix) {
        throw null;
    }
}