package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.r2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1326r2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.r2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1327a {
        /* renamed from: a */
        static void m37339a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.r2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1328b {
        /* renamed from: a */
        static void m37338a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static WindowInsetsControllerCompat m37341a(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    /* renamed from: b */
    public static void m37340b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1328b.m37338a(window, z);
        } else {
            C1327a.m37339a(window, z);
        }
    }
}