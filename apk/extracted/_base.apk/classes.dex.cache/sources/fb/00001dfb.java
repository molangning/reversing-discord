package com.discord.react_gesture_handler.nested_touch;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$handleTouch$2", m13986f = "NestedScrollOnTouchTracker.kt", m13985l = {76, 84}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class NestedScrollOnTouchTracker$handleTouch$2 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ NestedScrollOnTouchTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollOnTouchTracker$handleTouch$2(NestedScrollOnTouchTracker nestedScrollOnTouchTracker, View view, Continuation<? super NestedScrollOnTouchTracker$handleTouch$2> continuation) {
        super(2, continuation);
        this.this$0 = nestedScrollOnTouchTracker;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NestedScrollOnTouchTracker$handleTouch$2(this.this$0, this.$view, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NestedScrollOnTouchTracker$handleTouch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p388vf.C13271b.m2873d()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            pf.C11586t.m7586b(r9)
            goto L61
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            pf.C11586t.m7586b(r9)
            goto L32
        L1e:
            pf.C11586t.m7586b(r9)
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$Companion r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getCompanion$p()
            long r4 = r9.getCLICK_MAX_DOWN_TIME()
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.C9904v0.m12985a(r4, r8)
            if (r9 != r0) goto L32
            return r0
        L32:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedClickableSpan r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(r9)
            if (r9 != 0) goto L47
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            android.view.View$OnLongClickListener r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getOnLongClickListener$p(r9)
            if (r9 == 0) goto L47
            android.view.View r9 = r8.$view
            r9.setPressed(r3)
        L47:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$Companion r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getCompanion$p()
            long r4 = r9.getLONG_PRESS_DOWN_TIME()
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$Companion r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getCompanion$p()
            long r6 = r9.getCLICK_MAX_DOWN_TIME()
            long r4 = r4 - r6
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.C9904v0.m12985a(r4, r8)
            if (r9 != r0) goto L61
            return r0
        L61:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedClickableSpan r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(r9)
            if (r9 == 0) goto L74
            android.view.View r0 = r8.$view
            boolean r9 = r9.onLongClick(r0)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C9568b.m13991a(r9)
            goto L75
        L74:
            r9 = 0
        L75:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C9568b.m13991a(r3)
            boolean r9 = kotlin.jvm.internal.C9612q.m13922c(r9, r0)
            r0 = 0
            if (r9 == 0) goto L86
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$setDoClickOnUp$p(r9, r0)
            goto L9f
        L86:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            android.view.View$OnLongClickListener r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getOnLongClickListener$p(r9)
            if (r9 == 0) goto L97
            android.view.View r1 = r8.$view
            boolean r9 = r9.onLongClick(r1)
            if (r9 != r3) goto L97
            goto L98
        L97:
            r3 = r0
        L98:
            if (r3 == 0) goto L9f
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$setDoClickOnUp$p(r9, r0)
        L9f:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            android.view.View r0 = r8.$view
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$cleanUp(r9, r0)
            kotlin.Unit r9 = kotlin.Unit.f25302a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$handleTouch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}