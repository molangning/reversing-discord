package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B<\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB$\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0017\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J6\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R'\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "loggingName", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getLoggingName", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "copy", "copy-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class HandleSurveyMessage {
    public static final Companion Companion = new Companion(null);
    private final long channelId;

    /* renamed from: id */
    private final String f8306id;
    private final String loggingName;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandleSurveyMessage> serializer() {
            return HandleSurveyMessage$$serializer.INSTANCE;
        }
    }

    private HandleSurveyMessage(int i, String str, ChannelId channelId, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, HandleSurveyMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f8306id = str;
        this.channelId = channelId.m42056unboximpl();
        if ((i & 4) == 0) {
            this.loggingName = null;
        } else {
            this.loggingName = str2;
        }
    }

    public /* synthetic */ HandleSurveyMessage(int i, String str, ChannelId channelId, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, str2, serializationConstructorMarker);
    }

    public /* synthetic */ HandleSurveyMessage(String str, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2);
    }

    /* renamed from: copy-Eqy5D80$default  reason: not valid java name */
    public static /* synthetic */ HandleSurveyMessage m41483copyEqy5D80$default(HandleSurveyMessage handleSurveyMessage, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = handleSurveyMessage.f8306id;
        }
        if ((i & 2) != 0) {
            j = handleSurveyMessage.channelId;
        }
        if ((i & 4) != 0) {
            str2 = handleSurveyMessage.loggingName;
        }
        return handleSurveyMessage.m41487copyEqy5D80(str, j, str2);
    }

    /* renamed from: getChannelId-o4g7jtM$annotations  reason: not valid java name */
    public static /* synthetic */ void m41484getChannelIdo4g7jtM$annotations() {
    }

    public static final void write$Self(HandleSurveyMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = false;
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.f8306id));
        output.mo12894i(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
        if (output.mo12879z(serialDesc, 2) || self.loggingName != null) {
            z = true;
        }
        if (z) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.loggingName);
        }
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41485component13Eiw7ao() {
        return this.f8306id;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41486component2o4g7jtM() {
        return this.channelId;
    }

    public final String component3() {
        return this.loggingName;
    }

    /* renamed from: copy-Eqy5D80  reason: not valid java name */
    public final HandleSurveyMessage m41487copyEqy5D80(String id2, long j, String str) {
        C9612q.m13917h(id2, "id");
        return new HandleSurveyMessage(id2, j, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HandleSurveyMessage) {
            HandleSurveyMessage handleSurveyMessage = (HandleSurveyMessage) obj;
            return MessageId.m42077equalsimpl0(this.f8306id, handleSurveyMessage.f8306id) && ChannelId.m42051equalsimpl0(this.channelId, handleSurveyMessage.channelId) && C9612q.m13922c(this.loggingName, handleSurveyMessage.loggingName);
        }
        return false;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41488getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m41489getId3Eiw7ao() {
        return this.f8306id;
    }

    public final String getLoggingName() {
        return this.loggingName;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(this.f8306id) * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31;
        String str = this.loggingName;
        return m42078hashCodeimpl + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.f8306id);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        String str = this.loggingName;
        return "HandleSurveyMessage(id=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ", loggingName=" + str + ")";
    }

    private HandleSurveyMessage(String str, long j, String str2) {
        this.f8306id = str;
        this.channelId = j;
        this.loggingName = str2;
    }

    public /* synthetic */ HandleSurveyMessage(String str, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : str2, null);
    }
}
