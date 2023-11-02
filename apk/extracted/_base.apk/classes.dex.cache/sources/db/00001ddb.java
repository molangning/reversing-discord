package com.discord.react_gesture_handler;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m14357d2 = {"getDiscordGestureHandlerEnabledRootView", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "react_gesture_handler_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class GetDiscordGestureHandlerEnabledRootViewKt {
    public static final ViewGroup getDiscordGestureHandlerEnabledRootView(View view) {
        C9612q.m13917h(view, "view");
        return DiscordGestureHandlerEnabledRootView.Companion.get$react_gesture_handler_release(view);
    }
}