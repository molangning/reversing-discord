package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory;
import com.discord.chat.presentation.message.view.InteractionStatusView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/InteractionStatusViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "interactionStatusView", "Lcom/discord/chat/presentation/message/view/InteractionStatusView;", "(Lcom/discord/chat/presentation/message/view/InteractionStatusView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class InteractionStatusViewHolder extends MessagePartViewHolder {
    private final InteractionStatusView interactionStatusView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionStatusViewHolder(InteractionStatusView interactionStatusView) {
        super(interactionStatusView, null);
        C9612q.m13917h(interactionStatusView, "interactionStatusView");
        this.interactionStatusView = interactionStatusView;
    }

    public final void bind(InteractionStatusMessageAccessory accessory) {
        C9612q.m13917h(accessory, "accessory");
        this.interactionStatusView.m41772setInteractionStatusntcYbpo(accessory.mo41659getMessageId3Eiw7ao(), accessory.getInteractionStatus());
    }
}