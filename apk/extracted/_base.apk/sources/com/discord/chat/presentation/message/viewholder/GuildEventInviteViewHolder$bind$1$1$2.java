package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
/* synthetic */ class GuildEventInviteViewHolder$bind$1$1$2 extends C9609n implements Function1<LinkContentNode, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GuildEventInviteViewHolder$bind$1$1$2(Object obj) {
        super(1, obj, ChatEventHandler.class, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkContentNode p0) {
        C9612q.m13917h(p0, "p0");
        ((ChatEventHandler) this.receiver).onLinkLongClicked(p0);
    }
}
