package p443ya;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0544n1;
import p071e.C6029a;

/* renamed from: ya.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13957c {
    /* renamed from: a */
    public static ColorStateList m1089a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m23854a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m23854a = C6029a.m23854a(context, resourceId)) != null) {
            return m23854a;
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static ColorStateList m1088b(Context context, C0544n1 c0544n1, int i) {
        int m39788n;
        ColorStateList m23854a;
        if (c0544n1.m39783s(i) && (m39788n = c0544n1.m39788n(i, 0)) != 0 && (m23854a = C6029a.m23854a(context, m39788n)) != null) {
            return m23854a;
        }
        return c0544n1.m39799c(i);
    }

    /* renamed from: c */
    public static int m1087c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    /* renamed from: d */
    public static Drawable m1086d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m23853b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m23853b = C6029a.m23853b(context, resourceId)) != null) {
            return m23853b;
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: e */
    public static int m1085e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C13958d m1084f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return new C13958d(context, resourceId);
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m1083g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m1082h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}