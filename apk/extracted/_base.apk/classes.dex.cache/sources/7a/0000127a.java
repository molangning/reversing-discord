package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.MessageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DecoratedMessageView$setMessage$1 extends AbstractC9614s implements Function0<MessageView.ChainPart> {
    public static final DecoratedMessageView$setMessage$1 INSTANCE = new DecoratedMessageView$setMessage$1();

    DecoratedMessageView$setMessage$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final MessageView.ChainPart invoke() {
        return MessageView.ChainPart.ONLY;
    }
}