package com.discord.chat.presentation.textutils;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "<anonymous parameter 0>", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TextUtilsKt$toSpannable$10 extends AbstractC9614s implements Function1<LinkContentNode, LinkStyle> {
    public static final TextUtilsKt$toSpannable$10 INSTANCE = new TextUtilsKt$toSpannable$10();

    TextUtilsKt$toSpannable$10() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LinkStyle invoke(LinkContentNode linkContentNode) {
        C9612q.m13917h(linkContentNode, "<anonymous parameter 0>");
        return new LinkStyle(null, 0, 3, null);
    }
}