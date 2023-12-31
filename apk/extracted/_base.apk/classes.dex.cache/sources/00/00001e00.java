package com.discord.react_gesture_handler.passthrough_touch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/react_gesture_handler/passthrough_touch/PassthroughTouchViewGroup;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onTouchDown", "Lkotlin/Function0;", "", "getOnTouchDown", "()Lkotlin/jvm/functions/Function0;", "setOnTouchDown", "(Lkotlin/jvm/functions/Function0;)V", "onInterceptTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "ev", "react_gesture_handler_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PassthroughTouchViewGroup extends ReactViewGroup {
    private Function0<Unit> onTouchDown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughTouchViewGroup(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        Field declaredField = ReactViewGroup.class.getDeclaredField("mPointerEvents");
        declaredField.setAccessible(true);
        declaredField.set(this, PointerEvents.BOX_NONE);
        this.onTouchDown = PassthroughTouchViewGroup$onTouchDown$1.INSTANCE;
    }

    public final Function0<Unit> getOnTouchDown() {
        return this.onTouchDown;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        C9612q.m13917h(event, "event");
        return false;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        if (ev.getAction() == 0) {
            this.onTouchDown.invoke();
            return false;
        }
        return false;
    }

    public final void setOnTouchDown(Function0<Unit> function0) {
        C9612q.m13917h(function0, "<set-?>");
        this.onTouchDown = function0;
    }
}