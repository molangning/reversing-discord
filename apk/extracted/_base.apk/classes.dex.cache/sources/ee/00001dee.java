package com.discord.react_gesture_handler.blocking_touch;

import android.content.Context;
import android.view.MotionEvent;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m14357d2 = {"Lcom/discord/react_gesture_handler/blocking_touch/BlockingGestureViewGroup;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onInterceptTouchEvent", "", "event", "Landroid/view/MotionEvent;", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class BlockingGestureViewGroup extends ReactViewGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingGestureViewGroup(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        C9612q.m13917h(event, "event");
        if (event.getAction() == 0) {
            GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(event);
    }
}