package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p391w.InterfaceMenuItemC13352b;

/* renamed from: androidx.core.view.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1296m0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.m0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1297a {
        /* renamed from: a */
        static int m37389a(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        /* renamed from: b */
        static CharSequence m37388b(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        /* renamed from: c */
        static ColorStateList m37387c(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        /* renamed from: d */
        static PorterDuff.Mode m37386d(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        /* renamed from: e */
        static int m37385e(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        /* renamed from: f */
        static CharSequence m37384f(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        /* renamed from: g */
        static MenuItem m37383g(MenuItem menuItem, char c, int i) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c, i);
            return alphabeticShortcut;
        }

        /* renamed from: h */
        static MenuItem m37382h(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        /* renamed from: i */
        static MenuItem m37381i(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        /* renamed from: j */
        static MenuItem m37380j(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        /* renamed from: k */
        static MenuItem m37379k(MenuItem menuItem, char c, int i) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c, i);
            return numericShortcut;
        }

        /* renamed from: l */
        static MenuItem m37378l(MenuItem menuItem, char c, char c2, int i, int i2) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c, c2, i, i2);
            return shortcut;
        }

        /* renamed from: m */
        static MenuItem m37377m(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    /* renamed from: a */
    public static MenuItem m37396a(MenuItem menuItem, AbstractC1228b abstractC1228b) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            return ((InterfaceMenuItemC13352b) menuItem).mo2719b(abstractC1228b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m37395b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            ((InterfaceMenuItemC13352b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1297a.m37383g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m37394c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            ((InterfaceMenuItemC13352b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1297a.m37382h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m37393d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            ((InterfaceMenuItemC13352b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1297a.m37381i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m37392e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            ((InterfaceMenuItemC13352b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1297a.m37380j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m37391f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            ((InterfaceMenuItemC13352b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1297a.m37379k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m37390g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            ((InterfaceMenuItemC13352b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1297a.m37377m(menuItem, charSequence);
        }
    }
}