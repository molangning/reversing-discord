package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.ChannelType;
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

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB3\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006*"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "channelType", "Lcom/discord/chat/bridge/ChannelType;", "iconType", "", "icon", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/ChannelType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/ChannelType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getChannelType", "()Lcom/discord/chat/bridge/ChannelType;", "getContent", "()Ljava/util/List;", "getIcon", "()Ljava/lang/String;", "getIconType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelNameContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final ChannelType channelType;
    private final List<ContentNode> content;
    private final String icon;
    private final String iconType;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelNameContentNode> serializer() {
            return ChannelNameContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelNameContentNode(int i, ChannelType channelType, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (10 != (i & 10)) {
            C2620n1.m32836b(i, 10, ChannelNameContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.channelType = null;
        } else {
            this.channelType = channelType;
        }
        this.iconType = str;
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        this.content = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelNameContentNode copy$default(ChannelNameContentNode channelNameContentNode, ChannelType channelType, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            channelType = channelNameContentNode.channelType;
        }
        if ((i & 2) != 0) {
            str = channelNameContentNode.iconType;
        }
        if ((i & 4) != 0) {
            str2 = channelNameContentNode.icon;
        }
        if ((i & 8) != 0) {
            list = channelNameContentNode.content;
        }
        return channelNameContentNode.copy(channelType, str, str2, list);
    }

    public static final void write$Self(ChannelNameContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo12879z(serialDesc, 0) || self.channelType != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, ChannelType.Serializer.INSTANCE, self.channelType);
        }
        output.mo12880y(serialDesc, 1, self.iconType);
        if (output.mo12879z(serialDesc, 2) || self.icon != null) {
            z2 = true;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.icon);
        }
        output.mo12894i(serialDesc, 3, new C2581f(ContentNodeSerializer.INSTANCE), self.content);
    }

    public final ChannelType component1() {
        return this.channelType;
    }

    public final String component2() {
        return this.iconType;
    }

    public final String component3() {
        return this.icon;
    }

    public final List<ContentNode> component4() {
        return this.content;
    }

    public final ChannelNameContentNode copy(ChannelType channelType, String iconType, String str, List<? extends ContentNode> content) {
        C9612q.m13917h(iconType, "iconType");
        C9612q.m13917h(content, "content");
        return new ChannelNameContentNode(channelType, iconType, str, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelNameContentNode) {
            ChannelNameContentNode channelNameContentNode = (ChannelNameContentNode) obj;
            return this.channelType == channelNameContentNode.channelType && C9612q.m13922c(this.iconType, channelNameContentNode.iconType) && C9612q.m13922c(this.icon, channelNameContentNode.icon) && C9612q.m13922c(this.content, channelNameContentNode.content);
        }
        return false;
    }

    public final ChannelType getChannelType() {
        return this.channelType;
    }

    public final List<ContentNode> getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconType() {
        return this.iconType;
    }

    public int hashCode() {
        ChannelType channelType = this.channelType;
        int hashCode = (((channelType == null ? 0 : channelType.hashCode()) * 31) + this.iconType.hashCode()) * 31;
        String str = this.icon;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.content.hashCode();
    }

    public String toString() {
        ChannelType channelType = this.channelType;
        String str = this.iconType;
        String str2 = this.icon;
        List<ContentNode> list = this.content;
        return "ChannelNameContentNode(channelType=" + channelType + ", iconType=" + str + ", icon=" + str2 + ", content=" + list + ")";
    }

    public /* synthetic */ ChannelNameContentNode(ChannelType channelType, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : channelType, str, (i & 4) != 0 ? null : str2, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelNameContentNode(ChannelType channelType, String iconType, String str, List<? extends ContentNode> content) {
        super(null);
        C9612q.m13917h(iconType, "iconType");
        C9612q.m13917h(content, "content");
        this.channelType = channelType;
        this.iconType = iconType;
        this.icon = str;
        this.content = content;
    }
}