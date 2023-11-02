package com.discord.safearea.extensions;

import android.app.Activity;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u000bH\u0000¨\u0006\f"}, m14357d2 = {"getDisplayCutoutInsets", "Landroidx/core/graphics/Insets;", "Landroidx/core/view/WindowInsetsCompat;", "ignoringVisibility", "", "getImeInsets", "getInsets", "type", "", "getSystemBarInsets", "getWindowInsetsCompat", "Landroid/app/Activity;", "safe_area_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class WindowInsetsCompatExtensionsKt {
    public static final Insets getDisplayCutoutInsets(WindowInsetsCompat windowInsetsCompat, boolean z) {
        C9612q.m13917h(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, WindowInsetsCompat.C1163m.m37681a(), z);
    }

    public static /* synthetic */ Insets getDisplayCutoutInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getDisplayCutoutInsets(windowInsetsCompat, z);
    }

    public static final Insets getImeInsets(WindowInsetsCompat windowInsetsCompat, boolean z) {
        C9612q.m13917h(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, WindowInsetsCompat.C1163m.m37680b(), z);
    }

    public static /* synthetic */ Insets getImeInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getImeInsets(windowInsetsCompat, z);
    }

    private static final Insets getInsets(WindowInsetsCompat windowInsetsCompat, int i, boolean z) {
        Insets m37741f;
        if (z) {
            m37741f = windowInsetsCompat.m37740g(i);
        } else {
            m37741f = windowInsetsCompat.m37741f(i);
        }
        C9612q.m13918g(m37741f, "if (ignoringVisibility) …    getInsets(type)\n    }");
        return m37741f;
    }

    static /* synthetic */ Insets getInsets$default(WindowInsetsCompat windowInsetsCompat, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return getInsets(windowInsetsCompat, i, z);
    }

    public static final Insets getSystemBarInsets(WindowInsetsCompat windowInsetsCompat, boolean z) {
        C9612q.m13917h(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, WindowInsetsCompat.C1163m.m37675g(), z);
    }

    public static /* synthetic */ Insets getSystemBarInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getSystemBarInsets(windowInsetsCompat, z);
    }

    public static final WindowInsetsCompat getWindowInsetsCompat(Activity activity) {
        C9612q.m13917h(activity, "<this>");
        View rootView = ActivityExtensionsKt.getRootView(activity);
        if (rootView != null) {
            return WindowInsetsCompat.m37722y(rootView.getRootWindowInsets());
        }
        return null;
    }
}
