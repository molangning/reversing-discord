package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: androidx.transition.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1892q {

    /* renamed from: a */
    private static boolean f5210a = true;

    /* renamed from: a */
    public static InterfaceC1891p m35106a(ViewGroup viewGroup) {
        return new C1890o(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m35105b(ViewGroup viewGroup, boolean z) {
        if (f5210a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5210a = false;
            }
        }
    }

    /* renamed from: c */
    public static void m35104c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m35105b(viewGroup, z);
        }
    }
}