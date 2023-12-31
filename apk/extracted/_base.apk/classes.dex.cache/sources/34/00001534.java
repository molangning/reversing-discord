package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapConnectionsRoleTagData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "userId", "", "guildId", "channelId", "roleId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getGuildId", "getRoleId", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapConnectionsRoleTagData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String guildId;
    private final String roleId;
    private final String userId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapConnectionsRoleTagData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapConnectionsRoleTagData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapConnectionsRoleTagData> serializer() {
            return TapConnectionsRoleTagData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapConnectionsRoleTagData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, TapConnectionsRoleTagData$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.guildId = str2;
        this.channelId = str3;
        this.roleId = str4;
    }

    public static /* synthetic */ TapConnectionsRoleTagData copy$default(TapConnectionsRoleTagData tapConnectionsRoleTagData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapConnectionsRoleTagData.userId;
        }
        if ((i & 2) != 0) {
            str2 = tapConnectionsRoleTagData.guildId;
        }
        if ((i & 4) != 0) {
            str3 = tapConnectionsRoleTagData.channelId;
        }
        if ((i & 8) != 0) {
            str4 = tapConnectionsRoleTagData.roleId;
        }
        return tapConnectionsRoleTagData.copy(str, str2, str3, str4);
    }

    public static final void write$Self(TapConnectionsRoleTagData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.userId);
        output.mo12880y(serialDesc, 1, self.guildId);
        output.mo12880y(serialDesc, 2, self.channelId);
        output.mo12880y(serialDesc, 3, self.roleId);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.guildId;
    }

    public final String component3() {
        return this.channelId;
    }

    public final String component4() {
        return this.roleId;
    }

    public final TapConnectionsRoleTagData copy(String userId, String guildId, String channelId, String roleId) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(guildId, "guildId");
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(roleId, "roleId");
        return new TapConnectionsRoleTagData(userId, guildId, channelId, roleId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapConnectionsRoleTagData) {
            TapConnectionsRoleTagData tapConnectionsRoleTagData = (TapConnectionsRoleTagData) obj;
            return C9612q.m13922c(this.userId, tapConnectionsRoleTagData.userId) && C9612q.m13922c(this.guildId, tapConnectionsRoleTagData.guildId) && C9612q.m13922c(this.channelId, tapConnectionsRoleTagData.channelId) && C9612q.m13922c(this.roleId, tapConnectionsRoleTagData.roleId);
        }
        return false;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final String getRoleId() {
        return this.roleId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.guildId.hashCode()) * 31) + this.channelId.hashCode()) * 31) + this.roleId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.guildId;
        String str3 = this.channelId;
        String str4 = this.roleId;
        return "TapConnectionsRoleTagData(userId=" + str + ", guildId=" + str2 + ", channelId=" + str3 + ", roleId=" + str4 + ")";
    }

    public TapConnectionsRoleTagData(String userId, String guildId, String channelId, String roleId) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(guildId, "guildId");
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(roleId, "roleId");
        this.userId = userId;
        this.guildId = guildId;
        this.channelId = channelId;
        this.roleId = roleId;
    }
}