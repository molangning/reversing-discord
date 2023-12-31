package com.discord.chat.bridge.threads;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.Message$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m14357d2 = {"Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;", "", "seen1", "", "message", "Lcom/discord/chat/bridge/Message;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/Message;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/Message;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ThreadEmbedMessage {
    public static final Companion Companion = new Companion(null);
    private final Message message;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/threads/ThreadEmbedMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/threads/ThreadEmbedMessage;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ThreadEmbedMessage> serializer() {
            return ThreadEmbedMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ThreadEmbedMessage(int i, Message message, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, ThreadEmbedMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.message = message;
    }

    public static /* synthetic */ ThreadEmbedMessage copy$default(ThreadEmbedMessage threadEmbedMessage, Message message, int i, Object obj) {
        if ((i & 1) != 0) {
            message = threadEmbedMessage.message;
        }
        return threadEmbedMessage.copy(message);
    }

    public static final void write$Self(ThreadEmbedMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, Message$$serializer.INSTANCE, self.message);
    }

    public final Message component1() {
        return this.message;
    }

    public final ThreadEmbedMessage copy(Message message) {
        C9612q.m13917h(message, "message");
        return new ThreadEmbedMessage(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreadEmbedMessage) && C9612q.m13922c(this.message, ((ThreadEmbedMessage) obj).message);
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        Message message = this.message;
        return "ThreadEmbedMessage(message=" + message + ")";
    }

    public ThreadEmbedMessage(Message message) {
        C9612q.m13917h(message, "message");
        this.message = message;
    }
}