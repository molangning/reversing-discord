package com.discord.mobile_voice_overlay.utils;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/utils/WindowUtils;", "", "()V", "canDrawOverlay", "", "context", "Landroid/content/Context;", "createWindowLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "getCenterPointOnScreen", "", "view", "Landroid/view/View;", "outLocation", "getScreenSize", "Landroid/graphics/Rect;", "addFlag", "", "flag", "", "removeFlag", "setFlagTouchable", "isTouchable", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class WindowUtils {
    public static final WindowUtils INSTANCE = new WindowUtils();

    private WindowUtils() {
    }

    public final void addFlag(WindowManager.LayoutParams layoutParams, int i) {
        C9612q.m13917h(layoutParams, "<this>");
        layoutParams.flags = i | layoutParams.flags;
    }

    public final boolean canDrawOverlay(Context context) {
        C9612q.m13917h(context, "context");
        return Settings.canDrawOverlays(context);
    }

    public final WindowManager.LayoutParams createWindowLayoutParams() {
        int i;
        if (Build.VERSION.SDK_INT <= 25) {
            i = 2007;
        } else {
            i = 2038;
        }
        return new WindowManager.LayoutParams(-2, -2, i, 16777768, -3);
    }

    public final int[] getCenterPointOnScreen(View view, int[] outLocation) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(outLocation, "outLocation");
        view.getLocationOnScreen(outLocation);
        outLocation[0] = outLocation[0] + (view.getWidth() / 2);
        outLocation[1] = outLocation[1] + (view.getHeight() / 2);
        return outLocation;
    }

    public final Rect getScreenSize(Context context) {
        C9612q.m13917h(context, "context");
        return new Rect(0, 0, context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final void removeFlag(WindowManager.LayoutParams layoutParams, int i) {
        C9612q.m13917h(layoutParams, "<this>");
        layoutParams.flags = (~i) & layoutParams.flags;
    }

    public final void setFlagTouchable(WindowManager.LayoutParams layoutParams, boolean z) {
        C9612q.m13917h(layoutParams, "<this>");
        if (z) {
            removeFlag(layoutParams, 16);
        } else {
            addFlag(layoutParams, 16);
        }
    }
}
