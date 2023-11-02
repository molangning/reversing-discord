package com.discord.animatable_underlay;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "e", "Landroid/view/MotionEvent;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class AnimatableUnderlay$onAttachedToWindow$1 extends AbstractC9614s implements Function1<MotionEvent, Unit> {
    final /* synthetic */ AnimatableUnderlay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatableUnderlay$onAttachedToWindow$1(AnimatableUnderlay animatableUnderlay) {
        super(1);
        this.this$0 = animatableUnderlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return Unit.f25302a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
        if (r7 <= (r3 + (r4 - r6.this$0.getShapeHeight()))) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L13
            r7 = 3
            if (r0 == r7) goto L13
            goto Ld1
        L13:
            com.discord.animatable_underlay.AnimatableUnderlay r7 = r6.this$0
            com.facebook.react.uimanager.PointerEvents r0 = com.facebook.react.uimanager.PointerEvents.AUTO
            com.facebook.react.views.view.ReactViewGroupExtensionsKt.setPointerEventsInternal(r7, r0)
            goto Ld1
        L1c:
            float r0 = r7.getX()
            com.discord.animatable_underlay.AnimatableUnderlay r2 = r6.this$0
            float r2 = r2.getX()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            if (r0 < 0) goto L42
            float r0 = r7.getX()
            com.discord.animatable_underlay.AnimatableUnderlay r3 = r6.this$0
            float r3 = r3.getX()
            com.discord.animatable_underlay.AnimatableUnderlay r4 = r6.this$0
            float r4 = com.discord.animatable_underlay.AnimatableUnderlay.access$getWidth$p(r4)
            float r3 = r3 + r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L42
            r0 = r1
            goto L43
        L42:
            r0 = r2
        L43:
            float r3 = r7.getY()
            com.discord.animatable_underlay.AnimatableUnderlay r4 = r6.this$0
            float r4 = r4.getY()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L68
            float r3 = r7.getY()
            com.discord.animatable_underlay.AnimatableUnderlay r4 = r6.this$0
            float r4 = r4.getY()
            com.discord.animatable_underlay.AnimatableUnderlay r5 = r6.this$0
            float r5 = com.discord.animatable_underlay.AnimatableUnderlay.access$getHeight$p(r5)
            float r4 = r4 + r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L68
            r3 = r1
            goto L69
        L68:
            r3 = r2
        L69:
            if (r3 == 0) goto Ld1
            if (r0 == 0) goto Ld1
            float r0 = r7.getX()
            com.discord.animatable_underlay.AnimatableUnderlay r3 = r6.this$0
            float r3 = r3.getX()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L99
            float r0 = r7.getX()
            com.discord.animatable_underlay.AnimatableUnderlay r3 = r6.this$0
            float r3 = r3.getX()
            com.discord.animatable_underlay.AnimatableUnderlay r4 = r6.this$0
            float r4 = com.discord.animatable_underlay.AnimatableUnderlay.access$getWidth$p(r4)
            com.discord.animatable_underlay.AnimatableUnderlay r5 = r6.this$0
            float r5 = r5.getShapeWidth()
            float r4 = r4 - r5
            float r3 = r3 + r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L99
            r0 = r1
            goto L9a
        L99:
            r0 = r2
        L9a:
            float r3 = r7.getY()
            com.discord.animatable_underlay.AnimatableUnderlay r4 = r6.this$0
            float r4 = r4.getY()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto Lc5
            float r7 = r7.getY()
            com.discord.animatable_underlay.AnimatableUnderlay r3 = r6.this$0
            float r3 = r3.getY()
            com.discord.animatable_underlay.AnimatableUnderlay r4 = r6.this$0
            float r4 = com.discord.animatable_underlay.AnimatableUnderlay.access$getHeight$p(r4)
            com.discord.animatable_underlay.AnimatableUnderlay r5 = r6.this$0
            float r5 = r5.getShapeHeight()
            float r4 = r4 - r5
            float r3 = r3 + r4
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 > 0) goto Lc5
            goto Lc6
        Lc5:
            r1 = r2
        Lc6:
            if (r1 != 0) goto Lca
            if (r0 == 0) goto Ld1
        Lca:
            com.discord.animatable_underlay.AnimatableUnderlay r7 = r6.this$0
            com.facebook.react.uimanager.PointerEvents r0 = com.facebook.react.uimanager.PointerEvents.NONE
            com.facebook.react.views.view.ReactViewGroupExtensionsKt.setPointerEventsInternal(r7, r0)
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.animatable_underlay.AnimatableUnderlay$onAttachedToWindow$1.invoke2(android.view.MotionEvent):void");
    }
}