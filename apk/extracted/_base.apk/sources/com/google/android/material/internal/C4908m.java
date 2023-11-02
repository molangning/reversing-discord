package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0544n1;
import p155ia.C7480b;
import p155ia.C7489k;

/* renamed from: com.google.android.material.internal.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4908m {

    /* renamed from: a */
    private static final int[] f13777a = {C7480b.f20108k};

    /* renamed from: b */
    private static final int[] f13778b = {C7480b.f20109l};

    /* renamed from: a */
    public static void m26952a(Context context) {
        m26948e(context, f13777a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m26951b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20365J6, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7489k.f20381L6, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C7480b.f20115r, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m26950c(context);
            }
        }
        m26952a(context);
    }

    /* renamed from: c */
    public static void m26950c(Context context) {
        m26948e(context, f13778b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m26949d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20365J6, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C7489k.f20389M6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m26947f(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(C7489k.f20373K6, -1) != -1) {
                z2 = true;
            }
            z = z2;
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    /* renamed from: e */
    private static void m26948e(Context context, int[] iArr, String str) {
        if (m26946g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    private static boolean m26947f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m26946g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m26945h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m26951b(context, attributeSet, i, i2);
        m26949d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C0544n1 m26944i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m26951b(context, attributeSet, i, i2);
        m26949d(context, attributeSet, iArr, i, i2, iArr2);
        return C0544n1.m39780v(context, attributeSet, iArr, i, i2);
    }
}
