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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/HandleMessage;", "", "seen1", "", "action", "", "message", "Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;", "notificationType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getMessage", "()Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;", "getNotificationType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class HandleMessage {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final HandleSurveyMessage message;
    private final String notificationType;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/HandleMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/HandleMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandleMessage> serializer() {
            return HandleMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HandleMessage(int i, String str, HandleSurveyMessage handleSurveyMessage, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, HandleMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.message = handleSurveyMessage;
        if ((i & 4) == 0) {
            this.notificationType = null;
        } else {
            this.notificationType = str2;
        }
    }

    public static /* synthetic */ HandleMessage copy$default(HandleMessage handleMessage, String str, HandleSurveyMessage handleSurveyMessage, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = handleMessage.action;
        }
        if ((i & 2) != 0) {
            handleSurveyMessage = handleMessage.message;
        }
        if ((i & 4) != 0) {
            str2 = handleMessage.notificationType;
        }
        return handleMessage.copy(str, handleSurveyMessage, str2);
    }

    public static final void write$Self(HandleMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = false;
        output.mo12880y(serialDesc, 0, self.action);
        output.mo12894i(serialDesc, 1, HandleSurveyMessage$$serializer.INSTANCE, self.message);
        if (output.mo12879z(serialDesc, 2) || self.notificationType != null) {
            z = true;
        }
        if (z) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.notificationType);
        }
    }

    public final String component1() {
        return this.action;
    }

    public final HandleSurveyMessage component2() {
        return this.message;
    }

    public final String component3() {
        return this.notificationType;
    }

    public final HandleMessage copy(String action, HandleSurveyMessage message, String str) {
        C9612q.m13917h(action, "action");
        C9612q.m13917h(message, "message");
        return new HandleMessage(action, message, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HandleMessage) {
            HandleMessage handleMessage = (HandleMessage) obj;
            return C9612q.m13922c(this.action, handleMessage.action) && C9612q.m13922c(this.message, handleMessage.message) && C9612q.m13922c(this.notificationType, handleMessage.notificationType);
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final HandleSurveyMessage getMessage() {
        return this.message;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public int hashCode() {
        int hashCode = ((this.action.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.notificationType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.action;
        HandleSurveyMessage handleSurveyMessage = this.message;
        String str2 = this.notificationType;
        return "HandleMessage(action=" + str + ", message=" + handleSurveyMessage + ", notificationType=" + str2 + ")";
    }

    public HandleMessage(String action, HandleSurveyMessage message, String str) {
        C9612q.m13917h(action, "action");
        C9612q.m13917h(message, "message");
        this.action = action;
        this.message = message;
        this.notificationType = str;
    }

    public /* synthetic */ HandleMessage(String str, HandleSurveyMessage handleSurveyMessage, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, handleSurveyMessage, (i & 4) != 0 ? null : str2);
    }
}
