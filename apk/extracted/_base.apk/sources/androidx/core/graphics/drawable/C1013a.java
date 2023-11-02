package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1013a {

    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1014a {
        /* renamed from: a */
        static int m38079a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m38078b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m38077c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m38076d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m38075e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1015b {
        /* renamed from: a */
        static void m38074a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m38073b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m38072c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m38071d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m38070e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m38069f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m38068g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m38067h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m38066i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1016c {
        /* renamed from: a */
        static int m38065a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m38064b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m38097a(Drawable drawable, Resources.Theme theme) {
        C1015b.m38074a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m38096b(Drawable drawable) {
        return C1015b.m38073b(drawable);
    }

    /* renamed from: c */
    public static void m38095c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m38094d(Drawable drawable) {
        return C1014a.m38079a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m38093e(Drawable drawable) {
        return C1015b.m38072c(drawable);
    }

    /* renamed from: f */
    public static int m38092f(Drawable drawable) {
        return C1016c.m38065a(drawable);
    }

    /* renamed from: g */
    public static void m38091g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1015b.m38071d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m38090h(Drawable drawable) {
        return C1014a.m38076d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m38089i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m38088j(Drawable drawable, boolean z) {
        C1014a.m38075e(drawable, z);
    }

    /* renamed from: k */
    public static void m38087k(Drawable drawable, float f, float f2) {
        C1015b.m38070e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m38086l(Drawable drawable, int i, int i2, int i3, int i4) {
        C1015b.m38069f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m38085m(Drawable drawable, int i) {
        return C1016c.m38064b(drawable, i);
    }

    /* renamed from: n */
    public static void m38084n(Drawable drawable, int i) {
        C1015b.m38068g(drawable, i);
    }

    /* renamed from: o */
    public static void m38083o(Drawable drawable, ColorStateList colorStateList) {
        C1015b.m38067h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m38082p(Drawable drawable, PorterDuff.Mode mode) {
        C1015b.m38066i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m38081q(Drawable drawable) {
        if (drawable instanceof InterfaceC1023h) {
            return (T) ((InterfaceC1023h) drawable).m38057a();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m38080r(Drawable drawable) {
        return drawable;
    }
}
