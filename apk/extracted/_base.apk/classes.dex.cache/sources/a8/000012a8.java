package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$52 extends C9609n implements Function2<ChannelId, MessageId, Unit> {
    public MessageAccessoriesAdapter$onBindViewHolder$52(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapPollSubmitVote", "onTapPollSubmitVote-0eiqbug(JLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId, MessageId messageId) {
        m41648invoke0eiqbug(channelId.m42056unboximpl(), messageId.m42081unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-0eiqbug */
    public final void m41648invoke0eiqbug(long j, String p1) {
        C9612q.m13917h(p1, "p1");
        ((ChatEventHandler) this.receiver).mo41600onTapPollSubmitVote0eiqbug(j, p1);
    }
}