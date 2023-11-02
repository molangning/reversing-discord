package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$51 extends C9609n implements Function3<ChannelId, MessageId, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$51(Object obj) {
        super(3, obj, ChatEventHandler.class, "onTapPollAnswer", "onTapPollAnswer-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ChannelId channelId, MessageId messageId, String str) {
        m41647invokesekaTiM(channelId.m42056unboximpl(), messageId.m42081unboximpl(), str);
        return Unit.f25302a;
    }

    /* renamed from: invoke-sekaTiM  reason: not valid java name */
    public final void m41647invokesekaTiM(long j, String p1, String p2) {
        C9612q.m13917h(p1, "p1");
        C9612q.m13917h(p2, "p2");
        ((ChatEventHandler) this.receiver).mo41599onTapPollAnswersekaTiM(j, p1, p2);
    }
}
