package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$1 extends C9609n implements Function2<MessageId, LinkContentNode, Unit> {
    public EmbeddedActivityInviteViewHolder$bind$1$1(Object obj) {
        super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m41792invokentcYbpo(messageId.m42081unboximpl(), linkContentNode);
        return Unit.f25302a;
    }

    /* renamed from: invoke-ntcYbpo */
    public final void m41792invokentcYbpo(String p0, LinkContentNode p1) {
        C9612q.m13917h(p0, "p0");
        C9612q.m13917h(p1, "p1");
        ((ChatEventHandler) this.receiver).mo41576onLinkClickedntcYbpo(p0, p1);
    }
}