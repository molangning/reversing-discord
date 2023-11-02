package com.discord.chat.presentation.message.viewholder;

import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ReactionsViewHolder$bind$1 extends AbstractC9614s implements Function1<ReactionView.Reaction, Unit> {
    final /* synthetic */ Function1<ReactionView.Reaction, Unit> $onReactionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReactionsViewHolder$bind$1(Function1<? super ReactionView.Reaction, Unit> function1) {
        super(1);
        this.$onReactionClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReactionView.Reaction reaction) {
        invoke2(reaction);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(ReactionView.Reaction reaction) {
        C9612q.m13917h(reaction, "reaction");
        this.$onReactionClick.invoke(reaction);
    }
}