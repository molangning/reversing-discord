package com.discord.misc.utilities.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.core.view.C1326r2;
import androidx.core.view.WindowInsetsControllerCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.misc.utilities.coroutines.MainImmediateScopeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9818l;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002¨\u0006\n"}, m14357d2 = {"getInsetsController", "Landroidx/core/view/WindowInsetsControllerCompat;", "Landroid/view/Window;", "view", "Landroid/view/View;", "hideKeyboard", "", "Landroid/app/Activity;", "window", "showKeyboard", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class KeyboardExtensionsKt {
    public static final WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        WindowInsetsControllerCompat m37341a = C1326r2.m37341a(window, view);
        C9612q.m13918g(m37341a, "getInsetsController(this, view)");
        return m37341a;
    }

    public static final void hideKeyboard(Activity activity) {
        C9612q.m13917h(activity, "<this>");
        View contentView = ActivityExtensionsKt.getContentView(activity);
        if (contentView != null) {
            Window window = activity.getWindow();
            C9612q.m13918g(window, "window");
            hideKeyboard(contentView, window);
        }
    }

    public static final void showKeyboard(Activity activity) {
        C9612q.m13917h(activity, "<this>");
        View contentView = ActivityExtensionsKt.getContentView(activity);
        if (contentView != null) {
            Window window = activity.getWindow();
            C9612q.m13918g(window, "window");
            showKeyboard(contentView, window);
        }
    }

    public static final void hideKeyboard(View view, Window window) {
        C9612q.m13917h(view, "<this>");
        C9612q.m13917h(window, "window");
        C9818l.m13179d(MainImmediateScopeKt.MainImmediateScope(), null, null, new KeyboardExtensionsKt$hideKeyboard$1(window, view, null), 3, null);
    }

    public static final void showKeyboard(View view, Window window) {
        C9612q.m13917h(view, "<this>");
        C9612q.m13917h(window, "window");
        C9818l.m13179d(MainImmediateScopeKt.MainImmediateScope(), null, null, new KeyboardExtensionsKt$showKeyboard$1(window, view, null), 3, null);
    }
}