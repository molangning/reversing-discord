package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$49 extends C9609n implements Function3<MessageId, ChannelId, String, Unit> {
    public MessageAccessoriesAdapter$onBindViewHolder$49(Object obj) {
        super(3, obj, ChatEventHandler.class, "onTapChannelPromptButton", "onTapChannelPromptButton-Eqy5D80(Ljava/lang/String;JLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId, String str) {
        m41646invokeEqy5D80(messageId.m42081unboximpl(), channelId.m42056unboximpl(), str);
        return Unit.f25302a;
    }

    /* renamed from: invoke-Eqy5D80 */
    public final void m41646invokeEqy5D80(String p0, long j, String p2) {
        C9612q.m13917h(p0, "p0");
        C9612q.m13917h(p2, "p2");
        ((ChatEventHandler) this.receiver).mo41589onTapChannelPromptButtonEqy5D80(p0, j, p2);
    }
}