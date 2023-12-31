package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0016\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ContentNode;", "", "()V", "Companion", "Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;", "Lcom/discord/chat/bridge/contentnode/ErrorContentNode;", "Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;", "Lcom/discord/chat/bridge/contentnode/HeadingContentNode;", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "Lcom/discord/chat/bridge/contentnode/LineBreakContentNode;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "Lcom/discord/chat/bridge/contentnode/NewLineContentNode;", "Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;", "Lcom/discord/chat/bridge/contentnode/StrongContentNode;", "Lcom/discord/chat/bridge/contentnode/TextContentNode;", "Lcom/discord/chat/bridge/contentnode/TimestampContentNode;", "Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = ContentNodeSerializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class ContentNode {
    public static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentNode> serializer() {
            return ContentNodeSerializer.INSTANCE;
        }
    }

    private ContentNode() {
    }

    public /* synthetic */ ContentNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}