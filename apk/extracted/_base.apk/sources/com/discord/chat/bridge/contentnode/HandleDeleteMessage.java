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

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BF\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0002\u0010\u000eB,\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0016\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "loggingName", "", "author", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAuthor", "()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getLoggingName", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "copy", "copy-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;)Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class HandleDeleteMessage {
    public static final Companion Companion = new Companion(null);
    private final HandleDeleteMessageAuthor author;
    private final long channelId;

    /* renamed from: id */
    private final String f8305id;
    private final String loggingName;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandleDeleteMessage> serializer() {
            return HandleDeleteMessage$$serializer.INSTANCE;
        }
    }

    private HandleDeleteMessage(int i, String str, ChannelId channelId, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            C2620n1.m32836b(i, 11, HandleDeleteMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f8305id = str;
        this.channelId = channelId.m42056unboximpl();
        if ((i & 4) == 0) {
            this.loggingName = null;
        } else {
            this.loggingName = str2;
        }
        this.author = handleDeleteMessageAuthor;
    }

    public /* synthetic */ HandleDeleteMessage(int i, String str, ChannelId channelId, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, str2, handleDeleteMessageAuthor, serializationConstructorMarker);
    }

    public /* synthetic */ HandleDeleteMessage(String str, long j, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, handleDeleteMessageAuthor);
    }

    /* renamed from: copy-8a0ehIg$default  reason: not valid java name */
    public static /* synthetic */ HandleDeleteMessage m41476copy8a0ehIg$default(HandleDeleteMessage handleDeleteMessage, String str, long j, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, int i, Object obj) {
        if ((i & 1) != 0) {
            str = handleDeleteMessage.f8305id;
        }
        if ((i & 2) != 0) {
            j = handleDeleteMessage.channelId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = handleDeleteMessage.loggingName;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            handleDeleteMessageAuthor = handleDeleteMessage.author;
        }
        return handleDeleteMessage.m41480copy8a0ehIg(str, j2, str3, handleDeleteMessageAuthor);
    }

    /* renamed from: getChannelId-o4g7jtM$annotations  reason: not valid java name */
    public static /* synthetic */ void m41477getChannelIdo4g7jtM$annotations() {
    }

    public static final void write$Self(HandleDeleteMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = false;
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.f8305id));
        output.mo12894i(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
        if (output.mo12879z(serialDesc, 2) || self.loggingName != null) {
            z = true;
        }
        if (z) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.loggingName);
        }
        output.mo12894i(serialDesc, 3, HandleDeleteMessageAuthor$$serializer.INSTANCE, self.author);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41478component13Eiw7ao() {
        return this.f8305id;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41479component2o4g7jtM() {
        return this.channelId;
    }

    public final String component3() {
        return this.loggingName;
    }

    public final HandleDeleteMessageAuthor component4() {
        return this.author;
    }

    /* renamed from: copy-8a0ehIg  reason: not valid java name */
    public final HandleDeleteMessage m41480copy8a0ehIg(String id2, long j, String str, HandleDeleteMessageAuthor author) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(author, "author");
        return new HandleDeleteMessage(id2, j, str, author, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HandleDeleteMessage) {
            HandleDeleteMessage handleDeleteMessage = (HandleDeleteMessage) obj;
            return MessageId.m42077equalsimpl0(this.f8305id, handleDeleteMessage.f8305id) && ChannelId.m42051equalsimpl0(this.channelId, handleDeleteMessage.channelId) && C9612q.m13922c(this.loggingName, handleDeleteMessage.loggingName) && C9612q.m13922c(this.author, handleDeleteMessage.author);
        }
        return false;
    }

    public final HandleDeleteMessageAuthor getAuthor() {
        return this.author;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41481getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m41482getId3Eiw7ao() {
        return this.f8305id;
    }

    public final String getLoggingName() {
        return this.loggingName;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(this.f8305id) * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31;
        String str = this.loggingName;
        return ((m42078hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31) + this.author.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.f8305id);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        String str = this.loggingName;
        HandleDeleteMessageAuthor handleDeleteMessageAuthor = this.author;
        return "HandleDeleteMessage(id=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ", loggingName=" + str + ", author=" + handleDeleteMessageAuthor + ")";
    }

    private HandleDeleteMessage(String str, long j, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor) {
        this.f8305id = str;
        this.channelId = j;
        this.loggingName = str2;
        this.author = handleDeleteMessageAuthor;
    }

    public /* synthetic */ HandleDeleteMessage(String str, long j, String str2, HandleDeleteMessageAuthor handleDeleteMessageAuthor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : str2, handleDeleteMessageAuthor, null);
    }
}
