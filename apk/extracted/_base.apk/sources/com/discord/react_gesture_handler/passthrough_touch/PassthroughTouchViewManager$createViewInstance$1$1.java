package com.discord.react_gesture_handler.passthrough_touch;

import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PassthroughTouchViewManager$createViewInstance$1$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ ThemedReactContext $reactContext;
    final /* synthetic */ PassthroughTouchViewGroup $this_apply;
    final /* synthetic */ PassthroughTouchViewManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughTouchViewManager$createViewInstance$1$1(PassthroughTouchViewManager passthroughTouchViewManager, ThemedReactContext themedReactContext, PassthroughTouchViewGroup passthroughTouchViewGroup) {
        super(0);
        this.this$0 = passthroughTouchViewManager;
        this.$reactContext = themedReactContext;
        this.$this_apply = passthroughTouchViewGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$reactContext, this.$this_apply, new OnTouchDownData());
    }
}
