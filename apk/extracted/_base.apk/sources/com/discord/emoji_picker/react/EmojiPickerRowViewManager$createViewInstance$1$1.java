package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.react_events.OnPressEmojiEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "emojiName", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class EmojiPickerRowViewManager$createViewInstance$1$1 extends AbstractC9614s implements Function1<String, Unit> {
    final /* synthetic */ ThemedReactContext $reactContext;
    final /* synthetic */ EmojiPickerRowView $view;
    final /* synthetic */ EmojiPickerRowViewManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerRowViewManager$createViewInstance$1$1(EmojiPickerRowViewManager emojiPickerRowViewManager, ThemedReactContext themedReactContext, EmojiPickerRowView emojiPickerRowView) {
        super(1);
        this.this$0 = emojiPickerRowViewManager;
        this.$reactContext = themedReactContext;
        this.$view = emojiPickerRowView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String emojiName) {
        ReactEvents reactEvents;
        C9612q.m13917h(emojiName, "emojiName");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$reactContext, this.$view, new OnPressEmojiEvent(emojiName));
    }
}
