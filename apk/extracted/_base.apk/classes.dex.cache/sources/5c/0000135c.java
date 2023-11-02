package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.fonts.DiscordFont;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class FlaggedMessageEmbedView$configureMessageContent$1$12 extends AbstractC9614s implements Function1<LinkContentNode, LinkStyle> {
    public static final FlaggedMessageEmbedView$configureMessageContent$1$12 INSTANCE = new FlaggedMessageEmbedView$configureMessageContent$1$12();

    FlaggedMessageEmbedView$configureMessageContent$1$12() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LinkStyle invoke(LinkContentNode it) {
        C9612q.m13917h(it, "it");
        return new LinkStyle(DiscordFont.PrimaryNormal, ThemeManagerKt.getTheme().getTextNormal());
    }
}