package com.discord.sticker_picker.react;

import com.discord.reactevents.ReactEvents;
import com.discord.sticker_picker.StickerPickerRowView;
import com.discord.sticker_picker.react_events.OnPressStickerEvent;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "stickerId", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class StickerPickerRowViewManager$createViewInstance$1$1 extends AbstractC9614s implements Function1<String, Unit> {
    final /* synthetic */ ThemedReactContext $reactContext;
    final /* synthetic */ StickerPickerRowView $view;
    final /* synthetic */ StickerPickerRowViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPickerRowViewManager$createViewInstance$1$1(StickerPickerRowViewManager stickerPickerRowViewManager, ThemedReactContext themedReactContext, StickerPickerRowView stickerPickerRowView) {
        super(1);
        this.this$0 = stickerPickerRowViewManager;
        this.$reactContext = themedReactContext;
        this.$view = stickerPickerRowView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String stickerId) {
        ReactEvents reactEvents;
        C9612q.m13917h(stickerId, "stickerId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$reactContext, this.$view, new OnPressStickerEvent(stickerId));
    }
}