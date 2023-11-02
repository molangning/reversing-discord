package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"sealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "getSealedClassSerializer$annotations", "()V", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ContentNodeKt {
    private static final SealedClassSerializer<ContentNode> sealedClassSerializer = new SealedClassSerializer<>("ContentNode", C9591f0.m13969b(ContentNode.class), new KClass[]{C9591f0.m13969b(BlockQuoteContentNode.class), C9591f0.m13969b(BulletListContentNode.class), C9591f0.m13969b(ChannelMentionContentNode.class), C9591f0.m13969b(ChannelNameContentNode.class), C9591f0.m13969b(CodeBlockContentNode.class), C9591f0.m13969b(CommandMentionContentNode.class), C9591f0.m13969b(CustomEmojiContentNode.class), C9591f0.m13969b(EmojiContentNode.class), C9591f0.m13969b(EmphasisContentNode.class), C9591f0.m13969b(GuildNameContentNode.class), C9591f0.m13969b(HeadingContentNode.class), C9591f0.m13969b(InlineCodeContentNode.class), C9591f0.m13969b(LineBreakContentNode.class), C9591f0.m13969b(LinkContentNode.class), C9591f0.m13969b(MentionContentNode.class), C9591f0.m13969b(NewLineContentNode.class), C9591f0.m13969b(ParagraphContentNode.class), C9591f0.m13969b(SoundmojiContentNode.class), C9591f0.m13969b(SpoilerContentNode.class), C9591f0.m13969b(StaticChannelMentionContentNode.class), C9591f0.m13969b(StrikethroughContentNode.class), C9591f0.m13969b(StrongContentNode.class), C9591f0.m13969b(TextContentNode.class), C9591f0.m13969b(TimestampContentNode.class), C9591f0.m13969b(UnderlineContentNode.class), C9591f0.m13969b(UnicodeEmojiContentNode.class), C9591f0.m13969b(UserOrRoleMentionContentNode.class)}, new KSerializer[]{BlockQuoteContentNode.Companion.serializer(), BulletListContentNode.Companion.serializer(), ChannelMentionContentNode.Companion.serializer(), ChannelNameContentNode.Companion.serializer(), CodeBlockContentNode.Companion.serializer(), CommandMentionContentNode.Companion.serializer(), CustomEmojiContentNode.Companion.serializer(), EmojiContentNode.Companion.serializer(), EmphasisContentNode.Companion.serializer(), GuildNameContentNode.Companion.serializer(), HeadingContentNode.Companion.serializer(), InlineCodeContentNode.Companion.serializer(), LineBreakContentNode.Companion.serializer(), LinkContentNode.Companion.serializer(), MentionContentNode.Companion.serializer(), NewLineContentNode.Companion.serializer(), ParagraphContentNode.Companion.serializer(), SoundmojiContentNode.Companion.serializer(), SpoilerContentNode.Companion.serializer(), StaticChannelMentionContentNode.Companion.serializer(), StrikethroughContentNode.Companion.serializer(), StrongContentNode.Companion.serializer(), TextContentNode.Companion.serializer(), TimestampContentNode.Companion.serializer(), UnderlineContentNode.Companion.serializer(), UnicodeEmojiContentNode.Companion.serializer(), UserOrRoleMentionContentNode.Companion.serializer()});

    private static /* synthetic */ void getSealedClassSerializer$annotations() {
    }
}