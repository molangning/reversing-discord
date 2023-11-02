package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.core.widget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1416b {

    /* renamed from: androidx.core.widget.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1417a {
        /* renamed from: a */
        static Drawable m36925a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1418b {
        /* renamed from: a */
        static void m36924a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m36923b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m36928a(CheckedTextView checkedTextView) {
        return C1417a.m36925a(checkedTextView);
    }

    /* renamed from: b */
    public static void m36927b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C1418b.m36924a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m36926c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C1418b.m36923b(checkedTextView, mode);
    }
}
