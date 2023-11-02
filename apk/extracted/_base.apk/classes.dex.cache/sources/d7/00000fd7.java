package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/contentnode/HandleDeleteMessage.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class HandleDeleteMessage$$serializer implements InterfaceC2582f0<HandleDeleteMessage> {
    public static final HandleDeleteMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HandleDeleteMessage$$serializer handleDeleteMessage$$serializer = new HandleDeleteMessage$$serializer();
        INSTANCE = handleDeleteMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleDeleteMessage", handleDeleteMessage$$serializer, 4);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l("channel_id", false);
        pluginGeneratedSerialDescriptor.m12856l("loggingName", true);
        pluginGeneratedSerialDescriptor.m12856l("author", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HandleDeleteMessage$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, C0213a.m40920u(C2560a2.f7013a), HandleDeleteMessageAuthor$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public HandleDeleteMessage deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            obj = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj4 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj3 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, null);
            obj2 = mo12920b.mo12862y(descriptor2, 3, HandleDeleteMessageAuthor$$serializer.INSTANCE, null);
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            obj = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    obj7 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj7);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    obj6 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj6);
                    i2 |= 4;
                } else if (mo12866o != 3) {
                    throw new C14289n(mo12866o);
                } else {
                    obj5 = mo12920b.mo12862y(descriptor2, 3, HandleDeleteMessageAuthor$$serializer.INSTANCE, obj5);
                    i2 |= 8;
                }
            }
            obj2 = obj5;
            obj3 = obj6;
            obj4 = obj7;
            i = i2;
        }
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj;
        return new HandleDeleteMessage(i, messageId != null ? messageId.m42081unboximpl() : null, (ChannelId) obj4, (String) obj3, (HandleDeleteMessageAuthor) obj2, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, HandleDeleteMessage value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        HandleDeleteMessage.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}