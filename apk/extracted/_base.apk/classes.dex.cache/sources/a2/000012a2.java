package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$47 extends C9609n implements Function4<GuildId, ChannelId, ChannelId, MessageId, Unit> {
    public MessageAccessoriesAdapter$onBindViewHolder$47(Object obj) {
        super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(GuildId guildId, ChannelId channelId, ChannelId channelId2, MessageId messageId) {
        m41645invokekUTrps(guildId.m42069unboximpl(), channelId.m42056unboximpl(), channelId2.m42056unboximpl(), messageId.m42081unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-kUTrp-s */
    public final void m41645invokekUTrps(long j, long j2, long j3, String p3) {
        C9612q.m13917h(p3, "p3");
        ((ChatEventHandler) this.receiver).mo41601onTapPostPreviewEmbedkUTrps(j, j2, j3, p3);
    }
}