package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, m14357d2 = {"renderable", "Lcom/discord/emoji/RenderableEmoji;", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "setEmojiOrHide", "", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "componentEmoji", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ComponentViewKt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x000b, code lost:
        r0 = kotlin.text.C9652n.m13767o(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.discord.emoji.RenderableEmoji renderable(com.discord.chat.bridge.botuikit.ComponentEmoji r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = r5.getId()
            if (r0 == 0) goto L26
            java.lang.Long r0 = kotlin.text.C9642f.m13800o(r0)
            if (r0 == 0) goto L26
            long r0 = r0.longValue()
            com.discord.emoji.RenderableEmoji$Companion r2 = com.discord.emoji.RenderableEmoji.Companion
            boolean r3 = r5.getAnimated()
            java.lang.String r4 = r5.getName()
            com.discord.emoji.RenderableEmoji$CustomWithEmojiId r0 = r2.customWithEmojiId(r0, r3, r4)
            if (r0 == 0) goto L26
            goto L36
        L26:
            com.discord.emoji.RenderableEmoji$Companion r0 = com.discord.emoji.RenderableEmoji.Companion
            java.lang.String r1 = r5.getSurrogates()
            if (r1 != 0) goto L32
            java.lang.String r1 = r5.getName()
        L32:
            com.discord.emoji.RenderableEmoji$Unicode r0 = r0.unicode(r1)
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.ComponentViewKt.renderable(com.discord.chat.bridge.botuikit.ComponentEmoji):com.discord.emoji.RenderableEmoji");
    }

    public static final void setEmojiOrHide(SimpleDraweeSpanTextView simpleDraweeSpanTextView, ComponentEmoji componentEmoji) {
        C9612q.m13917h(simpleDraweeSpanTextView, "<this>");
        if (componentEmoji == null) {
            simpleDraweeSpanTextView.setVisibility(8);
            return;
        }
        simpleDraweeSpanTextView.setVisibility(0);
        RenderableEmoji renderable = renderable(componentEmoji);
        Context context = simpleDraweeSpanTextView.getContext();
        C9612q.m13918g(context, "context");
        simpleDraweeSpanTextView.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(renderable, context, SizeUtilsKt.getDpToPx(20), componentEmoji.getAnimated(), 1, null, 32, null));
    }
}