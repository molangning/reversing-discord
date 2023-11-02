package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* renamed from: com.google.android.material.textfield.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5000g {
    /* renamed from: a */
    public static void m26622a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C1013a.m38080r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                C1013a.m38083o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m26621b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                C1013a.m38083o(drawable, colorStateList);
            }
            if (mode != null) {
                C1013a.m38082p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    private static int[] m26621b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: c */
    public static void m26620c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m26621b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C1013a.m38080r(drawable).mutate();
            C1013a.m38083o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: d */
    private static void m26619d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean m37230P = C1365w0.m37230P(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (m37230P || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m37230P);
        checkableImageButton.setPressable(m37230P);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C1365w0.m37259A0(checkableImageButton, i);
    }

    /* renamed from: e */
    public static void m26618e(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m26619d(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f */
    public static void m26617f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m26619d(checkableImageButton, onLongClickListener);
    }
}