package p443ya;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: ya.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13956b {
    /* renamed from: a */
    public static TypedValue m1094a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m1093b(Context context, int i, boolean z) {
        TypedValue m1094a = m1094a(context, i);
        if (m1094a != null && m1094a.type == 18) {
            if (m1094a.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    /* renamed from: c */
    public static int m1092c(Context context, int i, int i2) {
        TypedValue m1094a = m1094a(context, i);
        if (m1094a != null && m1094a.type == 16) {
            return m1094a.data;
        }
        return i2;
    }

    /* renamed from: d */
    public static int m1091d(Context context, int i, String str) {
        TypedValue m1094a = m1094a(context, i);
        if (m1094a != null) {
            return m1094a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: e */
    public static int m1090e(View view, int i) {
        return m1091d(view.getContext(), i, view.getClass().getCanonicalName());
    }
}