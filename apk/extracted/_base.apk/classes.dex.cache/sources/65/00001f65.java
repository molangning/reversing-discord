package com.discord.segmented.control;

import com.discord.reactevents.ReactEvents;
import com.discord.segmented.control.events.ValueChangeEvent;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "index", "", "label", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SegmentedControlViewManager$createViewInstance$1$1 extends AbstractC9614s implements Function2<Integer, String, Unit> {
    final /* synthetic */ ThemedReactContext $reactContext;
    final /* synthetic */ SegmentedControlView $this_apply;
    final /* synthetic */ SegmentedControlViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedControlViewManager$createViewInstance$1$1(SegmentedControlViewManager segmentedControlViewManager, ThemedReactContext themedReactContext, SegmentedControlView segmentedControlView) {
        super(2);
        this.this$0 = segmentedControlViewManager;
        this.$reactContext = themedReactContext;
        this.$this_apply = segmentedControlView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.f25302a;
    }

    public final void invoke(int i, String label) {
        ReactEvents reactEvents;
        C9612q.m13917h(label, "label");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$reactContext, this.$this_apply, new ValueChangeEvent(label, i));
    }
}