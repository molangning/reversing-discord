package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m14357d2 = {"<anonymous>", "", "index", "", "attachment", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "attachmentViewHolder", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$24 extends AbstractC9614s implements Function3<Integer, MessageAccessory, MessagePartViewHolder, Unit> {
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$24(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(3);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, MessageAccessory messageAccessory, MessagePartViewHolder messagePartViewHolder) {
        invoke(num.intValue(), messageAccessory, messagePartViewHolder);
        return Unit.f25302a;
    }

    public final void invoke(int i, MessageAccessory attachment, MessagePartViewHolder attachmentViewHolder) {
        Double valueOf;
        C9612q.m13917h(attachment, "attachment");
        C9612q.m13917h(attachmentViewHolder, "attachmentViewHolder");
        String mo41659getMessageId3Eiw7ao = attachment.mo41659getMessageId3Eiw7ao();
        if (attachment instanceof ImageAttachmentMessageAccessory) {
            valueOf = null;
        } else if (attachment instanceof VideoAttachmentMessageAccessory) {
            valueOf = Double.valueOf(((VideoAttachmentMessageAccessory) attachment).getPortal());
        } else {
            throw new IllegalStateException(("Unsupported accessory: " + attachment).toString());
        }
        Double d = valueOf;
        this.this$0.m41634onMediaClickedl3ndGo(attachmentViewHolder, mo41659getMessageId3Eiw7ao, i, "attachment", d, null, ViewResizeMode.Cover);
    }
}