package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.core.widget.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1432j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1433a {
        /* renamed from: a */
        static void m36885a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1434b {
        /* renamed from: a */
        static boolean m36884a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m36883b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m36882c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        static void m36881d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m36888a(PopupWindow popupWindow, boolean z) {
        C1434b.m36882c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m36887b(PopupWindow popupWindow, int i) {
        C1434b.m36881d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m36886c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C1433a.m36885a(popupWindow, view, i, i2, i3);
    }
}