package com.discord.theme.utils;

import android.app.Activity;
import android.view.View;
import androidx.core.view.C1326r2;
import androidx.core.view.WindowInsetsControllerCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.theme.DarkTheme;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0007H\u0000¨\u0006\b"}, m14357d2 = {"setLightTheme", "", "Landroidx/core/view/WindowInsetsControllerCompat;", "isLightTheme", "", "updateSystemUi", "Landroid/app/Activity;", "Landroid/view/View;", "theme_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UpdateSystemUiKt {
    private static final void setLightTheme(WindowInsetsControllerCompat windowInsetsControllerCompat, boolean z) {
        windowInsetsControllerCompat.m37671c(z);
        windowInsetsControllerCompat.m37672b(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001c, code lost:
        r3 = r3.getWindowInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void updateSystemUi(android.view.View r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            com.discord.theme.ThemeManager r0 = com.discord.theme.ThemeManager.INSTANCE
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Le
            return
        Le:
            com.discord.theme.DiscordTheme r0 = com.discord.theme.ThemeManagerKt.getTheme()
            boolean r0 = r0 instanceof com.discord.theme.DarkTheme
            r0 = r0 ^ 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L2e
            android.view.WindowInsetsController r3 = p255o2.C10977a.m9429a(r3)
            if (r3 == 0) goto L2e
            androidx.core.view.WindowInsetsControllerCompat r3 = androidx.core.view.WindowInsetsControllerCompat.m37668f(r3)
            java.lang.String r1 = "toWindowInsetsControllerCompat(it)"
            kotlin.jvm.internal.C9612q.m13918g(r3, r1)
            setLightTheme(r3, r0)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.theme.utils.UpdateSystemUiKt.updateSystemUi(android.view.View):void");
    }

    public static final void updateSystemUi(Activity activity) {
        C9612q.m13917h(activity, "<this>");
        if (ThemeManager.INSTANCE.isInitialized()) {
            boolean z = !(ThemeManagerKt.getTheme() instanceof DarkTheme);
            View rootView = ActivityExtensionsKt.getRootView(activity);
            if (rootView != null) {
                WindowInsetsControllerCompat m37341a = C1326r2.m37341a(activity.getWindow(), rootView);
                C9612q.m13918g(m37341a, "getInsetsController(window, root)");
                setLightTheme(m37341a, z);
            }
        }
    }
}