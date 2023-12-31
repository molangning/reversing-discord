package com.discord.chat.bridge.contentnode;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.Ba\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBS\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J!\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006/"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "seen1", "", "channelId", "", "guildId", "messageId", "originalLink", "inContent", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getChannelId", "()Ljava/lang/String;", "getContent", "()Ljava/util/List;", "getGuildId", "getInContent", "getMessageId", "getOriginalLink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelMentionContentNode extends MentionContentNode {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final List<ContentNode> content;
    private final String guildId;
    private final List<ContentNode> inContent;
    private final String messageId;
    private final String originalLink;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelMentionContentNode> serializer() {
            return ChannelMentionContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelMentionContentNode(int i, String str, String str2, String str3, String str4, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (33 != (i & 33)) {
            C2620n1.m32836b(i, 33, ChannelMentionContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        if ((i & 2) == 0) {
            this.guildId = null;
        } else {
            this.guildId = str2;
        }
        if ((i & 4) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str3;
        }
        if ((i & 8) == 0) {
            this.originalLink = null;
        } else {
            this.originalLink = str4;
        }
        if ((i & 16) == 0) {
            this.inContent = null;
        } else {
            this.inContent = list;
        }
        this.content = list2;
    }

    public static /* synthetic */ ChannelMentionContentNode copy$default(ChannelMentionContentNode channelMentionContentNode, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelMentionContentNode.channelId;
        }
        if ((i & 2) != 0) {
            str2 = channelMentionContentNode.guildId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = channelMentionContentNode.messageId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = channelMentionContentNode.originalLink;
        }
        String str7 = str4;
        List<ContentNode> list3 = list;
        if ((i & 16) != 0) {
            list3 = channelMentionContentNode.inContent;
        }
        List list4 = list3;
        List<ContentNode> list5 = list2;
        if ((i & 32) != 0) {
            list5 = channelMentionContentNode.getContent();
        }
        return channelMentionContentNode.copy(str, str5, str6, str7, list4, list5);
    }

    public static final void write$Self(ChannelMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        MentionContentNode.write$Self(self, output, serialDesc);
        boolean z4 = false;
        output.mo12880y(serialDesc, 0, self.channelId);
        if (output.mo12879z(serialDesc, 1) || self.guildId != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.guildId);
        }
        if (output.mo12879z(serialDesc, 2) || self.messageId != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.messageId);
        }
        if (output.mo12879z(serialDesc, 3) || self.originalLink != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.originalLink);
        }
        if (output.mo12879z(serialDesc, 4) || self.inContent != null) {
            z4 = true;
        }
        if (z4) {
            output.mo12904E(serialDesc, 4, new C2581f(ContentNodeSerializer.INSTANCE), self.inContent);
        }
        output.mo12904E(serialDesc, 5, new C2581f(ContentNodeSerializer.INSTANCE), self.getContent());
    }

    public final String component1() {
        return this.channelId;
    }

    public final String component2() {
        return this.guildId;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String component4() {
        return this.originalLink;
    }

    public final List<ContentNode> component5() {
        return this.inContent;
    }

    public final List<ContentNode> component6() {
        return getContent();
    }

    public final ChannelMentionContentNode copy(String channelId, String str, String str2, String str3, List<? extends ContentNode> list, List<? extends ContentNode> list2) {
        C9612q.m13917h(channelId, "channelId");
        return new ChannelMentionContentNode(channelId, str, str2, str3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelMentionContentNode) {
            ChannelMentionContentNode channelMentionContentNode = (ChannelMentionContentNode) obj;
            return C9612q.m13922c(this.channelId, channelMentionContentNode.channelId) && C9612q.m13922c(this.guildId, channelMentionContentNode.guildId) && C9612q.m13922c(this.messageId, channelMentionContentNode.messageId) && C9612q.m13922c(this.originalLink, channelMentionContentNode.originalLink) && C9612q.m13922c(this.inContent, channelMentionContentNode.inContent) && C9612q.m13922c(getContent(), channelMentionContentNode.getContent());
        }
        return false;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    public List<ContentNode> getContent() {
        return this.content;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final List<ContentNode> getInContent() {
        return this.inContent;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getOriginalLink() {
        return this.originalLink;
    }

    public int hashCode() {
        int hashCode = this.channelId.hashCode() * 31;
        String str = this.guildId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalLink;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ContentNode> list = this.inContent;
        return ((hashCode4 + (list == null ? 0 : list.hashCode())) * 31) + (getContent() != null ? getContent().hashCode() : 0);
    }

    public String toString() {
        String str = this.channelId;
        String str2 = this.guildId;
        String str3 = this.messageId;
        String str4 = this.originalLink;
        List<ContentNode> list = this.inContent;
        List<ContentNode> content = getContent();
        return "ChannelMentionContentNode(channelId=" + str + ", guildId=" + str2 + ", messageId=" + str3 + ", originalLink=" + str4 + ", inContent=" + list + ", content=" + content + ")";
    }

    public /* synthetic */ ChannelMentionContentNode(String str, String str2, String str3, String str4, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelMentionContentNode(String channelId, String str, String str2, String str3, List<? extends ContentNode> list, List<? extends ContentNode> list2) {
        super(null);
        C9612q.m13917h(channelId, "channelId");
        this.channelId = channelId;
        this.guildId = str;
        this.messageId = str2;
        this.originalLink = str3;
        this.inContent = list;
        this.content = list2;
    }
}