package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$6 extends C9609n implements Function1<CommandMentionContentNode, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbeddedActivityInviteViewHolder$bind$1$6(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommandMentionContentNode commandMentionContentNode) {
        invoke2(commandMentionContentNode);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CommandMentionContentNode p0) {
        C9612q.m13917h(p0, "p0");
        ((ChatEventHandler) this.receiver).onTapCommand(p0);
    }
}
