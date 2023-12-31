package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.presentation.message.view.PostPreviewEmbedView;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2$\u0010\t\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "postPreviewEmbedView", "Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;", "(Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;)V", "bind", "", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "onTapPostPreviewEmbed", "Lkotlin/Function4;", "Lcom/discord/primitives/GuildId;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostPreviewEmbedViewHolder extends MessagePartViewHolder {
    private final PostPreviewEmbedView postPreviewEmbedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPreviewEmbedViewHolder(PostPreviewEmbedView postPreviewEmbedView) {
        super(postPreviewEmbedView, null);
        C9612q.m13917h(postPreviewEmbedView, "postPreviewEmbedView");
        this.postPreviewEmbedView = postPreviewEmbedView;
    }

    public static final void bind$lambda$0(Function4 onTapPostPreviewEmbed, PostPreviewEmbed postPreviewEmbed, View view) {
        C9612q.m13917h(onTapPostPreviewEmbed, "$onTapPostPreviewEmbed");
        C9612q.m13917h(postPreviewEmbed, "$postPreviewEmbed");
        onTapPostPreviewEmbed.invoke(GuildId.m42060boximpl(postPreviewEmbed.m41536getGuildIdfYKD8eg()), ChannelId.m42047boximpl(postPreviewEmbed.m41538getParentChannelIdo4g7jtM()), ChannelId.m42047boximpl(postPreviewEmbed.m41539getThreadIdo4g7jtM()), MessageId.m42073boximpl(postPreviewEmbed.m41537getMessageId3Eiw7ao()));
    }

    public final void bind(final PostPreviewEmbed postPreviewEmbed, final Function4<? super GuildId, ? super ChannelId, ? super ChannelId, ? super MessageId, Unit> onTapPostPreviewEmbed, SpoilerConfig spoilerConfig) {
        boolean z;
        C9612q.m13917h(postPreviewEmbed, "postPreviewEmbed");
        C9612q.m13917h(onTapPostPreviewEmbed, "onTapPostPreviewEmbed");
        PostPreviewEmbedView postPreviewEmbedView = this.postPreviewEmbedView;
        String title = postPreviewEmbed.getTitle();
        String subtitle = postPreviewEmbed.getSubtitle();
        String ctaText = postPreviewEmbed.getCtaText();
        int ctaButtonColor = postPreviewEmbed.getCtaButtonColor();
        String coverImage = postPreviewEmbed.getCoverImage();
        String blurredCoverImage = postPreviewEmbed.getBlurredCoverImage();
        String m41537getMessageId3Eiw7ao = postPreviewEmbed.m41537getMessageId3Eiw7ao();
        StructurableText footer = postPreviewEmbed.getFooter();
        String coverImageOverlayText = postPreviewEmbed.getCoverImageOverlayText();
        String backgroundImage = postPreviewEmbed.getBackgroundImage();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostPreviewEmbedViewHolder.bind$lambda$0(Function4.this, postPreviewEmbed, view);
            }
        };
        boolean shouldSpoiler = postPreviewEmbed.getShouldSpoiler();
        Boolean obscureAwaitingScan = postPreviewEmbed.getObscureAwaitingScan();
        if (obscureAwaitingScan != null) {
            z = obscureAwaitingScan.booleanValue();
        } else {
            z = false;
        }
        postPreviewEmbedView.m41777setPostPreviewEmbed6_IDHbM(title, subtitle, ctaText, ctaButtonColor, footer, m41537getMessageId3Eiw7ao, coverImage, blurredCoverImage, coverImageOverlayText, backgroundImage, onClickListener, shouldSpoiler, z, spoilerConfig);
    }
}