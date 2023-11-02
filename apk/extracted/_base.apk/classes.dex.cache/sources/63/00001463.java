package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildInviteDisabledViewHolder$bind$1$1 extends AbstractC9614s implements Function1<String, Unit> {
    final /* synthetic */ GuildInviteDisabledMessageAccessory $inviteAccessory;
    final /* synthetic */ GuildInviteDisabledViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledViewHolder$bind$1$1(GuildInviteDisabledViewHolder guildInviteDisabledViewHolder, GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory) {
        super(1);
        this.this$0 = guildInviteDisabledViewHolder;
        this.$inviteAccessory = guildInviteDisabledMessageAccessory;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String it) {
        C9612q.m13917h(it, "it");
        ChatEventHandler.DefaultImpls.m41618onLinkClickedu7_MRrM$default(this.this$0.getEventHandler(), this.$inviteAccessory.mo41659getMessageId3Eiw7ao(), it, null, 4, null);
    }
}