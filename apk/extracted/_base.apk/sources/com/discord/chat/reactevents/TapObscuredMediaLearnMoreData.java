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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapObscuredMediaLearnMoreData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "", "channelId", "attachmentId", "embedId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttachmentId", "()Ljava/lang/String;", "getChannelId", "getEmbedId", "getMessageId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapObscuredMediaLearnMoreData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String attachmentId;
    private final String channelId;
    private final String embedId;
    private final String messageId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapObscuredMediaLearnMoreData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapObscuredMediaLearnMoreData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapObscuredMediaLearnMoreData> serializer() {
            return TapObscuredMediaLearnMoreData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapObscuredMediaLearnMoreData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, TapObscuredMediaLearnMoreData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.channelId = str2;
        this.attachmentId = str3;
        this.embedId = str4;
    }

    public static /* synthetic */ TapObscuredMediaLearnMoreData copy$default(TapObscuredMediaLearnMoreData tapObscuredMediaLearnMoreData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapObscuredMediaLearnMoreData.messageId;
        }
        if ((i & 2) != 0) {
            str2 = tapObscuredMediaLearnMoreData.channelId;
        }
        if ((i & 4) != 0) {
            str3 = tapObscuredMediaLearnMoreData.attachmentId;
        }
        if ((i & 8) != 0) {
            str4 = tapObscuredMediaLearnMoreData.embedId;
        }
        return tapObscuredMediaLearnMoreData.copy(str, str2, str3, str4);
    }

    public static final void write$Self(TapObscuredMediaLearnMoreData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.messageId);
        output.mo12880y(serialDesc, 1, self.channelId);
        output.mo12880y(serialDesc, 2, self.attachmentId);
        output.mo12880y(serialDesc, 3, self.embedId);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.channelId;
    }

    public final String component3() {
        return this.attachmentId;
    }

    public final String component4() {
        return this.embedId;
    }

    public final TapObscuredMediaLearnMoreData copy(String messageId, String channelId, String attachmentId, String embedId) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(attachmentId, "attachmentId");
        C9612q.m13917h(embedId, "embedId");
        return new TapObscuredMediaLearnMoreData(messageId, channelId, attachmentId, embedId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapObscuredMediaLearnMoreData) {
            TapObscuredMediaLearnMoreData tapObscuredMediaLearnMoreData = (TapObscuredMediaLearnMoreData) obj;
            return C9612q.m13922c(this.messageId, tapObscuredMediaLearnMoreData.messageId) && C9612q.m13922c(this.channelId, tapObscuredMediaLearnMoreData.channelId) && C9612q.m13922c(this.attachmentId, tapObscuredMediaLearnMoreData.attachmentId) && C9612q.m13922c(this.embedId, tapObscuredMediaLearnMoreData.embedId);
        }
        return false;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getEmbedId() {
        return this.embedId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((this.messageId.hashCode() * 31) + this.channelId.hashCode()) * 31) + this.attachmentId.hashCode()) * 31) + this.embedId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.channelId;
        String str3 = this.attachmentId;
        String str4 = this.embedId;
        return "TapObscuredMediaLearnMoreData(messageId=" + str + ", channelId=" + str2 + ", attachmentId=" + str3 + ", embedId=" + str4 + ")";
    }

    public TapObscuredMediaLearnMoreData(String messageId, String channelId, String attachmentId, String embedId) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(attachmentId, "attachmentId");
        C9612q.m13917h(embedId, "embedId");
        this.messageId = messageId;
        this.channelId = channelId;
        this.attachmentId = attachmentId;
        this.embedId = embedId;
    }
}
