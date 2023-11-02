package com.discord.chat.reactevents;

import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m14357d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "invoke-pfaIj0E", "(Ljava/lang/String;J)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatViewEventHandler$onMessageTapped$1 extends AbstractC9614s implements Function2<MessageId, ChannelId, Unit> {
    final /* synthetic */ ChatViewEventHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewEventHandler$onMessageTapped$1(ChatViewEventHandler chatViewEventHandler) {
        super(2);
        this.this$0 = chatViewEventHandler;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId) {
        m41806invokepfaIj0E(messageId.m42081unboximpl(), channelId.m42056unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-pfaIj0E  reason: not valid java name */
    public final void m41806invokepfaIj0E(String messageId, long j) {
        Function1 function1;
        C9612q.m13917h(messageId, "messageId");
        function1 = this.this$0.emitReactEvent;
        function1.invoke(new TapMessageData(MessageId.m42079toStringimpl(messageId), ChannelId.m42054toStringimpl(j)));
    }
}
