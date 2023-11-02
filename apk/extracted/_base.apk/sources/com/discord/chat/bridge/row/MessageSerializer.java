package com.discord.chat.bridge.row;

import bj.AbstractC2325e;
import bj.C2340g;
import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.crash_reporting.CrashReporting;
import com.discord.primitives.MessageId;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/bridge/row/MessageSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/MessageBase;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageSerializer implements KSerializer<MessageBase> {
    public static final MessageSerializer INSTANCE = new MessageSerializer();

    private MessageSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return C2340g.m33640a("Message", AbstractC2325e.C2334i.f6445a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageBase deserialize(Decoder decoder) {
        String m7636b;
        C9612q.m13917h(decoder, "decoder");
        try {
            return (MessageBase) decoder.mo12924G(Message.Companion.serializer());
        } catch (Exception e) {
            CrashReporting.INSTANCE.captureException(e);
            UUID randomUUID = UUID.randomUUID();
            String m42074constructorimpl = MessageId.m42074constructorimpl("RENDERING_ERROR_" + randomUUID);
            m7636b = C11560f.m7636b(e);
            return new ErrorMessage(m42074constructorimpl, m7636b, null);
        }
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MessageBase value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        throw new UnsupportedOperationException();
    }
}
