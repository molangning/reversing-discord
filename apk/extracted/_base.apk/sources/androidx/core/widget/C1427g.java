package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1427g {

    /* renamed from: androidx.core.widget.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1428a {
        /* renamed from: a */
        static ColorStateList m36899a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m36898b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m36897c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m36896d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m36903a(ImageView imageView) {
        return C1428a.m36899a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m36902b(ImageView imageView) {
        return C1428a.m36898b(imageView);
    }

    /* renamed from: c */
    public static void m36901c(ImageView imageView, ColorStateList colorStateList) {
        C1428a.m36897c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m36900d(ImageView imageView, PorterDuff.Mode mode) {
        C1428a.m36896d(imageView, mode);
    }
}
