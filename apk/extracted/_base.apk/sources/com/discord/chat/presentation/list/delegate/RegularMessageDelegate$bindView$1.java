package com.discord.chat.presentation.list.delegate;

import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.MessageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RegularMessageDelegate$bindView$1 extends AbstractC9614s implements Function0<MessageView.ChainPart> {
    final /* synthetic */ MessageItem $item;
    final /* synthetic */ BaseChatListItemDelegate.Metadata<MessageView> $metadata;
    final /* synthetic */ RegularMessageDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularMessageDelegate$bindView$1(RegularMessageDelegate regularMessageDelegate, MessageItem messageItem, BaseChatListItemDelegate.Metadata<MessageView> metadata) {
        super(0);
        this.this$0 = regularMessageDelegate;
        this.$item = messageItem;
        this.$metadata = metadata;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MessageView.ChainPart invoke() {
        MessageView.ChainPart chainPart;
        chainPart = this.this$0.getChainPart(this.$item, this.$metadata);
        return chainPart;
    }
}
