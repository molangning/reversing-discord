package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$31 extends C9609n implements Function1<MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$31(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m41638invoke1xi1bu0(messageId.m42081unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-1xi1bu0  reason: not valid java name */
    public final void m41638invoke1xi1bu0(String p0) {
        C9612q.m13917h(p0, "p0");
        ((ChatEventHandler) this.receiver).mo41611onTapThreadEmbed1xi1bu0(p0);
    }
}
