package com.discord.chat.bridge.contentnode;

import bj.AbstractC2325e;
import bj.C2340g;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.InterfaceC9962e;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/ContentNodeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ContentNodeSerializer implements KSerializer<ContentNode> {
    public static final ContentNodeSerializer INSTANCE = new ContentNodeSerializer();

    private ContentNodeSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return C2340g.m33640a("ContentNode", AbstractC2325e.C2334i.f6445a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContentNode deserialize(Decoder decoder) {
        SealedClassSerializer sealedClassSerializer;
        C9612q.m13917h(decoder, "decoder");
        try {
            if (decoder instanceof InterfaceC9962e) {
                JsonElement mo12743g = ((InterfaceC9962e) decoder).mo12743g();
                if (mo12743g instanceof JsonPrimitive) {
                    return new TextContentNode(((JsonPrimitive) mo12743g).mo12700a());
                }
                Json mo12744d = ((InterfaceC9962e) decoder).mo12744d();
                sealedClassSerializer = ContentNodeKt.sealedClassSerializer;
                return (ContentNode) mo12744d.m12781d(sealedClassSerializer, mo12743g);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (Exception e) {
            return new ErrorContentNode(e);
        }
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ContentNode value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        throw new UnsupportedOperationException();
    }
}