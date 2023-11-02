package pa;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0995a;
import p443ya.C13956b;

/* renamed from: pa.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11487a {
    /* renamed from: a */
    public static int m8019a(int i, int i2) {
        return C0995a.m38177k(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: b */
    public static int m8018b(Context context, int i, int i2) {
        TypedValue m1094a = C13956b.m1094a(context, i);
        if (m1094a != null) {
            return m1094a.data;
        }
        return i2;
    }

    /* renamed from: c */
    public static int m8017c(Context context, int i, String str) {
        return C13956b.m1091d(context, i, str);
    }

    /* renamed from: d */
    public static int m8016d(View view, int i) {
        return C13956b.m1090e(view, i);
    }

    /* renamed from: e */
    public static int m8015e(View view, int i, int i2) {
        return m8018b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static boolean m8014f(int i) {
        return i != 0 && C0995a.m38184d(i) > 0.5d;
    }

    /* renamed from: g */
    public static int m8013g(int i, int i2) {
        return C0995a.m38181g(i2, i);
    }

    /* renamed from: h */
    public static int m8012h(int i, int i2, float f) {
        return m8013g(i, C0995a.m38177k(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: i */
    public static int m8011i(View view, int i, int i2, float f) {
        return m8012h(m8016d(view, i), m8016d(view, i2), f);
    }
}
