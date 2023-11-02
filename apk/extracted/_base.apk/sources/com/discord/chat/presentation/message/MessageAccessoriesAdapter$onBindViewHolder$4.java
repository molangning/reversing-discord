package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$4 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ MessageAccessory $part;
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$4(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory) {
        super(0);
        this.this$0 = messageAccessoriesAdapter;
        this.$part = messageAccessory;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatEventHandler chatEventHandler;
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            C9612q.m13900y("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.mo41598onTapObscuredMediaLearnMore8a0ehIg(this.$part.mo41659getMessageId3Eiw7ao(), ((InfoLinkMessageAccessory) this.$part).m41711getChannelIdo4g7jtM(), ((InfoLinkMessageAccessory) this.$part).getAttachmentId(), ((InfoLinkMessageAccessory) this.$part).getEmbedId());
    }
}
