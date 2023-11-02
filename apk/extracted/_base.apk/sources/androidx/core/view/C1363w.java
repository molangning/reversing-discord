package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1363w {

    /* renamed from: androidx.core.view.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1364a {
        /* renamed from: a */
        static int m37268a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m37267b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m37266c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m37265d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m37264e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        static void m37263f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        static void m37262g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        static void m37261h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m37272a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C1364a.m37267b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m37271b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C1364a.m37266c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m37270c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C1364a.m37262g(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m37269d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C1364a.m37261h(marginLayoutParams, i);
    }
}
