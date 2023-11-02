package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$44 extends C9609n implements Function2<MessageId, ChannelId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$44(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId) {
        m41642invokepfaIj0E(messageId.m42081unboximpl(), channelId.m42056unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-pfaIj0E  reason: not valid java name */
    public final void m41642invokepfaIj0E(String p0, long j) {
        C9612q.m13917h(p0, "p0");
        ((ChatEventHandler) this.receiver).mo41584onTapAutoModerationActionspfaIj0E(p0, j);
    }
}
