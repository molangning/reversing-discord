package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002&'BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006("}, m14357d2 = {"Lcom/discord/chat/reactevents/LongPressChannelData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "guildId", "", "channelId", "messageId", "originalLink", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getGuildId", "getMessageId", "getOriginalLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LongPressChannelData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String guildId;
    private final String messageId;
    private final String originalLink;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/LongPressChannelData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/LongPressChannelData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LongPressChannelData> serializer() {
            return LongPressChannelData$$serializer.INSTANCE;
        }
    }

    public LongPressChannelData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ LongPressChannelData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, LongPressChannelData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.guildId = null;
        } else {
            this.guildId = str;
        }
        if ((i & 2) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
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
    }

    public static /* synthetic */ LongPressChannelData copy$default(LongPressChannelData longPressChannelData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = longPressChannelData.guildId;
        }
        if ((i & 2) != 0) {
            str2 = longPressChannelData.channelId;
        }
        if ((i & 4) != 0) {
            str3 = longPressChannelData.messageId;
        }
        if ((i & 8) != 0) {
            str4 = longPressChannelData.originalLink;
        }
        return longPressChannelData.copy(str, str2, str3, str4);
    }

    public static final void write$Self(LongPressChannelData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z4 = false;
        if (output.mo12879z(serialDesc, 0) || self.guildId != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.guildId);
        }
        if (output.mo12879z(serialDesc, 1) || self.channelId != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.channelId);
        }
        if (output.mo12879z(serialDesc, 2) || self.messageId != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.messageId);
        }
        if (output.mo12879z(serialDesc, 3) || self.originalLink != null) {
            z4 = true;
        }
        if (z4) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.originalLink);
        }
    }

    public final String component1() {
        return this.guildId;
    }

    public final String component2() {
        return this.channelId;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String component4() {
        return this.originalLink;
    }

    public final LongPressChannelData copy(String str, String str2, String str3, String str4) {
        return new LongPressChannelData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LongPressChannelData) {
            LongPressChannelData longPressChannelData = (LongPressChannelData) obj;
            return C9612q.m13922c(this.guildId, longPressChannelData.guildId) && C9612q.m13922c(this.channelId, longPressChannelData.channelId) && C9612q.m13922c(this.messageId, longPressChannelData.messageId) && C9612q.m13922c(this.originalLink, longPressChannelData.originalLink);
        }
        return false;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getOriginalLink() {
        return this.originalLink;
    }

    public int hashCode() {
        String str = this.guildId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originalLink;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("data", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("guildId", this.guildId), C11591x.m7577a("channelId", this.channelId), C11591x.m7577a("messageId", this.messageId), C11591x.m7577a("originalLink", this.originalLink))));
    }

    public String toString() {
        String str = this.guildId;
        String str2 = this.channelId;
        String str3 = this.messageId;
        String str4 = this.originalLink;
        return "LongPressChannelData(guildId=" + str + ", channelId=" + str2 + ", messageId=" + str3 + ", originalLink=" + str4 + ")";
    }

    public LongPressChannelData(String str, String str2, String str3, String str4) {
        this.guildId = str;
        this.channelId = str2;
        this.messageId = str3;
        this.originalLink = str4;
    }

    public /* synthetic */ LongPressChannelData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}