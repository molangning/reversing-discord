package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "holder", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageAccessoriesAdapter$onCreateViewHolder$1 extends AbstractC9614s implements Function1<MessagePartViewHolder, Unit> {
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onCreateViewHolder$1(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(1);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessagePartViewHolder messagePartViewHolder) {
        invoke2(messagePartViewHolder);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(MessagePartViewHolder holder) {
        Function1 function1;
        C9612q.m13917h(holder, "holder");
        function1 = this.this$0.onTapSpoiler;
        function1.invoke(holder);
    }
}