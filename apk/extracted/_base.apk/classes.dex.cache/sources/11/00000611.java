package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.core.widget.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1419c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1420a {
        /* renamed from: a */
        static ColorStateList m36918a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m36917b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m36916c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m36915d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1421b {
        /* renamed from: a */
        static Drawable m36914a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m36922a(CompoundButton compoundButton) {
        return C1421b.m36914a(compoundButton);
    }

    /* renamed from: b */
    public static ColorStateList m36921b(CompoundButton compoundButton) {
        return C1420a.m36918a(compoundButton);
    }

    /* renamed from: c */
    public static void m36920c(CompoundButton compoundButton, ColorStateList colorStateList) {
        C1420a.m36916c(compoundButton, colorStateList);
    }

    /* renamed from: d */
    public static void m36919d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C1420a.m36915d(compoundButton, mode);
    }
}