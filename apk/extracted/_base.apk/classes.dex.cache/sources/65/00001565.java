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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapPollAnswer;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "channelId", "", "messageId", "answerId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnswerId", "()Ljava/lang/String;", "getChannelId", "getMessageId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapPollAnswer implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String answerId;
    private final String channelId;
    private final String messageId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapPollAnswer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapPollAnswer;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapPollAnswer> serializer() {
            return TapPollAnswer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapPollAnswer(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, TapPollAnswer$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.messageId = str2;
        this.answerId = str3;
    }

    public static /* synthetic */ TapPollAnswer copy$default(TapPollAnswer tapPollAnswer, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapPollAnswer.channelId;
        }
        if ((i & 2) != 0) {
            str2 = tapPollAnswer.messageId;
        }
        if ((i & 4) != 0) {
            str3 = tapPollAnswer.answerId;
        }
        return tapPollAnswer.copy(str, str2, str3);
    }

    public static final void write$Self(TapPollAnswer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.channelId);
        output.mo12880y(serialDesc, 1, self.messageId);
        output.mo12880y(serialDesc, 2, self.answerId);
    }

    public final String component1() {
        return this.channelId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.answerId;
    }

    public final TapPollAnswer copy(String channelId, String messageId, String answerId) {
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(answerId, "answerId");
        return new TapPollAnswer(channelId, messageId, answerId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapPollAnswer) {
            TapPollAnswer tapPollAnswer = (TapPollAnswer) obj;
            return C9612q.m13922c(this.channelId, tapPollAnswer.channelId) && C9612q.m13922c(this.messageId, tapPollAnswer.messageId) && C9612q.m13922c(this.answerId, tapPollAnswer.answerId);
        }
        return false;
    }

    public final String getAnswerId() {
        return this.answerId;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + this.messageId.hashCode()) * 31) + this.answerId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.channelId;
        String str2 = this.messageId;
        String str3 = this.answerId;
        return "TapPollAnswer(channelId=" + str + ", messageId=" + str2 + ", answerId=" + str3 + ")";
    }

    public TapPollAnswer(String channelId, String messageId, String answerId) {
        C9612q.m13917h(channelId, "channelId");
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(answerId, "answerId");
        this.channelId = channelId;
        this.messageId = messageId;
        this.answerId = answerId;
    }
}