package com.discord.chat.input.views;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/input/views/ChatInputRootView;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputRootViewMeasurer$measureHeight$1 extends AbstractC9614s implements Function1<ChatInputRootView, Unit> {
    final /* synthetic */ ChatInputRootViewMeasurer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootViewMeasurer$measureHeight$1(ChatInputRootViewMeasurer chatInputRootViewMeasurer) {
        super(1);
        this.this$0 = chatInputRootViewMeasurer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatInputRootView chatInputRootView) {
        invoke2(chatInputRootView);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatInputRootView it) {
        ChatInputRootView chatInputRootView;
        C9612q.m13917h(it, "it");
        chatInputRootView = this.this$0.chatInputRootView;
        it.setText(chatInputRootView.getText());
    }
}
