package com.discord.chat.presentation.textutils;

import com.discord.chat.bridge.contentnode.CustomEmojiContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.FontManager;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0005¨\u0006\n"}, m14357d2 = {"renderEmoji", "", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "rc", "Lcom/discord/chat/presentation/textutils/RenderContext;", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmojiRendererKt {
    public static final void renderEmoji(DraweeSpanStringBuilder builder, EmojiContentNode emoji, RenderContext rc) {
        int dpToPx;
        int i;
        C9612q.m13917h(builder, "builder");
        C9612q.m13917h(emoji, "emoji");
        C9612q.m13917h(rc, "rc");
        boolean jumboable = emoji.getJumboable();
        Integer emojiSizeOverride = rc.getEmojiSizeOverride();
        if (emojiSizeOverride != null) {
            dpToPx = emojiSizeOverride.intValue();
        } else if (jumboable) {
            dpToPx = SizeUtilsKt.getDpToPx(48);
        } else {
            dpToPx = (int) (SizeUtilsKt.getDpToPx(20) * FontManager.INSTANCE.getFontScale(rc.getContext()));
        }
        if (jumboable) {
            i = 1;
        } else {
            i = 2;
        }
        RenderableEmoji renderable = renderable(emoji);
        Object[] objArr = {new EmojiAccessibilitySpan(renderable.getContentDescription()), new ClickableSpan(null, null, null, new EmojiRendererKt$renderEmoji$clickableSpan$1(rc, emoji), 7, null)};
        int length = builder.length();
        RenderableEmojiKt.renderEmojiInto(builder, renderable, rc.getContext(), dpToPx, rc.getAnimateEmoji(), i, new EmojiRendererKt$renderEmoji$1$1(rc));
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                builder.setSpan(obj, length, builder.length(), 33);
            }
        }
    }

    public static final RenderableEmoji renderable(EmojiContentNode emojiContentNode) {
        boolean m13751w;
        C9612q.m13917h(emojiContentNode, "<this>");
        if (emojiContentNode instanceof CustomEmojiContentNode) {
            RenderableEmoji.Companion companion = RenderableEmoji.Companion;
            CustomEmojiContentNode customEmojiContentNode = (CustomEmojiContentNode) emojiContentNode;
            long id2 = customEmojiContentNode.getId();
            m13751w = C9653o.m13751w(customEmojiContentNode.getSrc());
            boolean z = true;
            return companion.customWithEmojiId(id2, (!(m13751w ^ true) || C9612q.m13922c(customEmojiContentNode.getSrc(), customEmojiContentNode.getFrozenSrc())) ? false : false, customEmojiContentNode.getAlt());
        } else if (emojiContentNode instanceof UnicodeEmojiContentNode) {
            return RenderableEmoji.Companion.unicode(((UnicodeEmojiContentNode) emojiContentNode).getSurrogate());
        } else {
            throw new C11581q();
        }
    }
}
