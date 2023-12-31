package com.discord.react_gesture_handler.nested_touch;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class NestedScrollOnTouchListener$viewTouchTracker$1 extends AbstractC9614s implements Function1<View, Unit> {
    final /* synthetic */ NestedScrollOnTouchListener this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollOnTouchListener$viewTouchTracker$1(NestedScrollOnTouchListener nestedScrollOnTouchListener) {
        super(1);
        this.this$0 = nestedScrollOnTouchListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Function1<? super MotionEvent, Unit> function1;
        C9612q.m13917h(view, "view");
        Function2<View, Function1<? super MotionEvent, Unit>, Unit> onAddNativeEventListener = NestedScrollOnTouchListener.Companion.getOnAddNativeEventListener();
        if (onAddNativeEventListener != null) {
            function1 = this.this$0.onSupplementalMotionEventReceived;
            onAddNativeEventListener.invoke(view, function1);
        }
    }
}
