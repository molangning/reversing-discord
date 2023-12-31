package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB%\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "guildId", "", "content", "icon", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getGuildId", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildNameContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String guildId;
    private final String icon;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/GuildNameContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildNameContentNode> serializer() {
            return GuildNameContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuildNameContentNode(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (2 != (i & 2)) {
            C2620n1.m32836b(i, 2, GuildNameContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.guildId = null;
        } else {
            this.guildId = str;
        }
        this.content = str2;
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
    }

    public static /* synthetic */ GuildNameContentNode copy$default(GuildNameContentNode guildNameContentNode, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guildNameContentNode.guildId;
        }
        if ((i & 2) != 0) {
            str2 = guildNameContentNode.content;
        }
        if ((i & 4) != 0) {
            str3 = guildNameContentNode.icon;
        }
        return guildNameContentNode.copy(str, str2, str3);
    }

    public static final void write$Self(GuildNameContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo12879z(serialDesc, 0) || self.guildId != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.guildId);
        }
        output.mo12880y(serialDesc, 1, self.content);
        if (output.mo12879z(serialDesc, 2) || self.icon != null) {
            z2 = true;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.icon);
        }
    }

    public final String component1() {
        return this.guildId;
    }

    public final String component2() {
        return this.content;
    }

    public final String component3() {
        return this.icon;
    }

    public final GuildNameContentNode copy(String str, String content, String str2) {
        C9612q.m13917h(content, "content");
        return new GuildNameContentNode(str, content, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GuildNameContentNode) {
            GuildNameContentNode guildNameContentNode = (GuildNameContentNode) obj;
            return C9612q.m13922c(this.guildId, guildNameContentNode.guildId) && C9612q.m13922c(this.content, guildNameContentNode.content) && C9612q.m13922c(this.icon, guildNameContentNode.icon);
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        String str = this.guildId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str2 = this.icon;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.guildId;
        String str2 = this.content;
        String str3 = this.icon;
        return "GuildNameContentNode(guildId=" + str + ", content=" + str2 + ", icon=" + str3 + ")";
    }

    public /* synthetic */ GuildNameContentNode(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildNameContentNode(String str, String content, String str2) {
        super(null);
        C9612q.m13917h(content, "content");
        this.guildId = str;
        this.content = content;
        this.icon = str2;
    }
}