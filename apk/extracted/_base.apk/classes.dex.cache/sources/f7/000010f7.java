package com.discord.chat.bridge.structurabletext;

import bj.AbstractC2325e;
import bj.C2340g;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableTextSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PrimitiveStructurableTextSerializer implements KSerializer<PrimitiveStructurableText> {
    public static final PrimitiveStructurableTextSerializer INSTANCE = new PrimitiveStructurableTextSerializer();
    private static final SerialDescriptor descriptor = C2340g.m33640a("PrimitiveStructurableText", AbstractC2325e.C2334i.f6445a);

    private PrimitiveStructurableTextSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PrimitiveStructurableText deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return new PrimitiveStructurableText(decoder.mo12909z());
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, PrimitiveStructurableText value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        throw new UnsupportedOperationException();
    }
}