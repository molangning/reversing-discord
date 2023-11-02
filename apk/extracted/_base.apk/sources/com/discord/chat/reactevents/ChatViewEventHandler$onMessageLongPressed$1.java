package com.discord.chat.reactevents;

import com.discord.chat.bridge.MediaType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, m14357d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "mediaIndex", "", "mediaType", "Lcom/discord/chat/bridge/MediaType;", "invoke-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Integer;Lcom/discord/chat/bridge/MediaType;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatViewEventHandler$onMessageLongPressed$1 extends AbstractC9614s implements Function4<MessageId, ChannelId, Integer, MediaType, Unit> {
    final /* synthetic */ ChatViewEventHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewEventHandler$onMessageLongPressed$1(ChatViewEventHandler chatViewEventHandler) {
        super(4);
        this.this$0 = chatViewEventHandler;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId, Integer num, MediaType mediaType) {
        m41805invoke8a0ehIg(messageId.m42081unboximpl(), channelId.m42056unboximpl(), num, mediaType);
        return Unit.f25302a;
    }

    /* renamed from: invoke-8a0ehIg  reason: not valid java name */
    public final void m41805invoke8a0ehIg(String messageId, long j, Integer num, MediaType mediaType) {
        Function1 function1;
        int i;
        C9612q.m13917h(messageId, "messageId");
        function1 = this.this$0.emitReactEvent;
        String m42079toStringimpl = MessageId.m42079toStringimpl(messageId);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(j);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        function1.invoke(new LongPressMessageEvent(m42079toStringimpl, m42054toStringimpl, i, (mediaType == null || (r6 = mediaType.getType()) == null) ? "" : ""));
    }
}
