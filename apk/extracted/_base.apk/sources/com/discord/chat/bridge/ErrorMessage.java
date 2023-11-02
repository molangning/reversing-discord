package com.discord.chat.bridge;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m14357d2 = {"Lcom/discord/chat/bridge/ErrorMessage;", "Lcom/discord/chat/bridge/MessageBase;", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "stackTrace", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getStackTrace", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/ErrorMessage;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ErrorMessage extends MessageBase {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id */
    private final String f8298id;
    private final String stackTrace;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/ErrorMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/ErrorMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ErrorMessage> serializer() {
            return ErrorMessage$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ErrorMessage(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, ErrorMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f8298id = str;
        this.stackTrace = str2;
    }

    public /* synthetic */ ErrorMessage(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, serializationConstructorMarker);
    }

    public /* synthetic */ ErrorMessage(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: copy-ntcYbpo$default  reason: not valid java name */
    public static /* synthetic */ ErrorMessage m41422copyntcYbpo$default(ErrorMessage errorMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorMessage.f8298id;
        }
        if ((i & 2) != 0) {
            str2 = errorMessage.stackTrace;
        }
        return errorMessage.m41424copyntcYbpo(str, str2);
    }

    public static final void write$Self(ErrorMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        MessageBase.write$Self(self, output, serialDesc);
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.f8298id));
        output.mo12880y(serialDesc, 1, self.stackTrace);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41423component13Eiw7ao() {
        return this.f8298id;
    }

    public final String component2() {
        return this.stackTrace;
    }

    /* renamed from: copy-ntcYbpo  reason: not valid java name */
    public final ErrorMessage m41424copyntcYbpo(String id2, String stackTrace) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(stackTrace, "stackTrace");
        return new ErrorMessage(id2, stackTrace, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorMessage) {
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return MessageId.m42077equalsimpl0(this.f8298id, errorMessage.f8298id) && C9612q.m13922c(this.stackTrace, errorMessage.stackTrace);
        }
        return false;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m41425getId3Eiw7ao() {
        return this.f8298id;
    }

    public final String getStackTrace() {
        return this.stackTrace;
    }

    public int hashCode() {
        return (MessageId.m42078hashCodeimpl(this.f8298id) * 31) + this.stackTrace.hashCode();
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.f8298id);
        String str = this.stackTrace;
        return "ErrorMessage(id=" + m42079toStringimpl + ", stackTrace=" + str + ")";
    }

    private ErrorMessage(String str, String str2) {
        super(null);
        this.f8298id = str;
        this.stackTrace = str2;
    }
}
