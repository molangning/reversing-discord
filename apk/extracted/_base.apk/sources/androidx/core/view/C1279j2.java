package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.j2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1279j2 {

    /* renamed from: androidx.core.view.j2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1280a {
        /* renamed from: a */
        static int m37426a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m37425b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m37424c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m37427a(ViewGroup viewGroup) {
        return C1280a.m37425b(viewGroup);
    }
}
