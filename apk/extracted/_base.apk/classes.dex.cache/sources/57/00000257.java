package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0995a;
import p052d.C5715j;

/* renamed from: androidx.appcompat.widget.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0528i1 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1862a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1863b = {-16842910};

    /* renamed from: c */
    static final int[] f1864c = {16842908};

    /* renamed from: d */
    static final int[] f1865d = {16843518};

    /* renamed from: e */
    static final int[] f1866e = {16842919};

    /* renamed from: f */
    static final int[] f1867f = {16842912};

    /* renamed from: g */
    static final int[] f1868g = {16842913};

    /* renamed from: h */
    static final int[] f1869h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1870i = new int[0];

    /* renamed from: j */
    private static final int[] f1871j = new int[1];

    /* renamed from: a */
    public static void m39846a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C5715j.f16466y0);
        try {
            if (!obtainStyledAttributes.hasValue(C5715j.f16239D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m39845b(Context context, int i) {
        ColorStateList m39842e = m39842e(context, i);
        if (m39842e != null && m39842e.isStateful()) {
            return m39842e.getColorForState(f1863b, m39842e.getDefaultColor());
        }
        TypedValue m39841f = m39841f();
        context.getTheme().resolveAttribute(16842803, m39841f, true);
        return m39843d(context, i, m39841f.getFloat());
    }

    /* renamed from: c */
    public static int m39844c(Context context, int i) {
        int[] iArr = f1871j;
        iArr[0] = i;
        C0544n1 m39781u = C0544n1.m39781u(context, null, iArr);
        try {
            return m39781u.m39800b(0, 0);
        } finally {
            m39781u.m39779w();
        }
    }

    /* renamed from: d */
    static int m39843d(Context context, int i, float f) {
        int m39844c = m39844c(context, i);
        return C0995a.m38177k(m39844c, Math.round(Color.alpha(m39844c) * f));
    }

    /* renamed from: e */
    public static ColorStateList m39842e(Context context, int i) {
        int[] iArr = f1871j;
        iArr[0] = i;
        C0544n1 m39781u = C0544n1.m39781u(context, null, iArr);
        try {
            return m39781u.m39799c(0);
        } finally {
            m39781u.m39779w();
        }
    }

    /* renamed from: f */
    private static TypedValue m39841f() {
        ThreadLocal<TypedValue> threadLocal = f1862a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}