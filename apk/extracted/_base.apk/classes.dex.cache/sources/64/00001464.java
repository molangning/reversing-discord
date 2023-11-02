package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.view.GuildInviteView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "guildInviteView", "Lcom/discord/chat/presentation/message/view/GuildInviteView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/GuildInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "inviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildInviteViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final GuildInviteView guildInviteView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteViewHolder(GuildInviteView guildInviteView, ChatEventHandler eventHandler) {
        super(guildInviteView, null);
        C9612q.m13917h(guildInviteView, "guildInviteView");
        C9612q.m13917h(eventHandler, "eventHandler");
        this.guildInviteView = guildInviteView;
        this.eventHandler = eventHandler;
    }

    public static final void bind$lambda$1$lambda$0(GuildInviteViewHolder this$0, GuildInviteMessageAccessory inviteAccessory, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(inviteAccessory, "$inviteAccessory");
        this$0.eventHandler.mo41594onTapInviteEmbedAFFcxXc(inviteAccessory.mo41659getMessageId3Eiw7ao(), inviteAccessory.getCodedLinkIndex(), null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
        if (r2 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind(final com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory r7) {
        /*
            r6 = this;
            java.lang.String r0 = "inviteAccessory"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl r0 = r7.getInvite()
            com.discord.chat.presentation.message.view.GuildInviteView r1 = r6.guildInviteView
            java.lang.String r2 = r0.getSubtitle()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            boolean r2 = kotlin.text.C9642f.m13789w(r2)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = r3
            goto L1d
        L1c:
            r2 = r4
        L1d:
            if (r2 != 0) goto L24
            java.lang.String r2 = r0.getSubtitle()
            goto L39
        L24:
            java.lang.String r2 = r0.getChannelIcon()
            if (r2 == 0) goto L30
            boolean r2 = kotlin.text.C9642f.m13789w(r2)
            if (r2 == 0) goto L31
        L30:
            r3 = r4
        L31:
            if (r3 != 0) goto L38
            java.lang.String r2 = r0.getChannelName()
            goto L39
        L38:
            r2 = 0
        L39:
            java.lang.String r3 = r0.getInviteSplash()
            r1.setInviteSplash(r3)
            java.lang.String r3 = r0.getHeaderText()
            r1.setHeaderText(r3)
            int r3 = r0.getHeaderColor()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.setHeaderColor(r3)
            java.lang.String r3 = r0.getTitleText()
            r1.setTitleText(r3)
            java.lang.Integer r3 = r0.getTitleColor()
            r1.setTitleColor(r3)
            java.lang.String r3 = r0.getOnlineText()
            java.lang.String r4 = r0.getMemberText()
            r1.setPresence(r3, r4)
            java.lang.String r3 = r0.getThumbnailUrl()
            java.lang.String r4 = r0.getThumbnailText()
            java.lang.Integer r5 = r0.getThumbnailBackgroundColor()
            r1.setGuildImage(r3, r4, r5)
            r1.setSubtitle(r2)
            java.lang.Integer r2 = r0.getSubtitleColor()
            r1.setSubtitleColor(r2)
            java.lang.String r2 = r0.getChannelIcon()
            r1.setSubtitleIcon(r2)
            com.discord.chat.presentation.message.viewholder.n r2 = new com.discord.chat.presentation.message.viewholder.n
            r2.<init>()
            r1.setOnButtonClickListener(r2)
            java.lang.String r7 = r0.getAcceptLabelText()
            r1.setButtonText(r7)
            java.lang.Integer r7 = r0.getAcceptLabelColor()
            r1.setButtonTextColor(r7)
            java.lang.Integer r7 = r0.getAcceptLabelBackgroundColor()
            r1.setButtonBackgroundColor(r7)
            int r7 = r0.getBackgroundColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.setBackgroundRectangleColor(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder.bind(com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory):void");
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}