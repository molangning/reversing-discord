package com.discord.device.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m14357d2 = {"isGestureNavigationEnabled", "", "Landroid/content/Context;", "device_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class IsGestureNavigationEnabledKt {
    @SuppressLint({"DiscouragedApi"})
    public static final boolean isGestureNavigationEnabled(Context context) {
        int i;
        C9612q.m13917h(context, "<this>");
        int identifier = context.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier > 0) {
            i = context.getResources().getInteger(identifier);
        } else {
            i = 0;
        }
        if (i != NavigationType.GESTURE.getValue()) {
            return false;
        }
        return true;
    }
}