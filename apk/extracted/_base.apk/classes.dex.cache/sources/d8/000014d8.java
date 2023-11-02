package com.discord.chat.presentation.textutils;

import com.discord.chat.bridge.contentnode.EmojiContentNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TextUtilsKt$toSpannable$9 extends AbstractC9614s implements Function1<EmojiContentNode, Unit> {
    public static final TextUtilsKt$toSpannable$9 INSTANCE = new TextUtilsKt$toSpannable$9();

    TextUtilsKt$toSpannable$9() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EmojiContentNode emojiContentNode) {
        invoke2(emojiContentNode);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(EmojiContentNode it) {
        C9612q.m13917h(it, "it");
    }
}