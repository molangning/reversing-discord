package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.contentnode.ChannelMentionContentNode;
import com.discord.chat.bridge.contentnode.ContentNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TextUtilsKt$toSpannable$12$click$4 extends AbstractC9614s implements Function1<View, Boolean> {
    final /* synthetic */ ContentNode $contentNode;
    final /* synthetic */ RenderContext $rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUtilsKt$toSpannable$12$click$4(RenderContext renderContext, ContentNode contentNode) {
        super(1);
        this.$rc = renderContext;
        this.$contentNode = contentNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View it) {
        C9612q.m13917h(it, "it");
        this.$rc.getOnLongPressChannel().invoke(((ChannelMentionContentNode) this.$contentNode).getChannelId(), ((ChannelMentionContentNode) this.$contentNode).getGuildId(), ((ChannelMentionContentNode) this.$contentNode).getMessageId(), ((ChannelMentionContentNode) this.$contentNode).getOriginalLink());
        return Boolean.TRUE;
    }
}