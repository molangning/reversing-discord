package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/contentnode/CommandOnClick.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CommandOnClick$$serializer implements InterfaceC2582f0<CommandOnClick> {
    public static final CommandOnClick$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CommandOnClick$$serializer commandOnClick$$serializer = new CommandOnClick$$serializer();
        INSTANCE = commandOnClick$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.CommandOnClick", commandOnClick$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("action", true);
        pluginGeneratedSerialDescriptor.m12856l("userId", true);
        pluginGeneratedSerialDescriptor.m12856l("messageId", true);
        pluginGeneratedSerialDescriptor.m12856l("applicationUserId", true);
        pluginGeneratedSerialDescriptor.m12856l("messageType", true);
        pluginGeneratedSerialDescriptor.m12856l("messageChannelId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommandOnClick$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        return new KSerializer[]{C0213a.m40920u(C2560a2.f7013a), C0213a.m40920u(userId$$serializer), C0213a.m40920u(MessageId$$serializer.INSTANCE), C0213a.m40920u(userId$$serializer), C0213a.m40920u(MessageType.Serializer.INSTANCE), C0213a.m40920u(ChannelId$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CommandOnClick deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            obj = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, null);
            UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
            obj6 = mo12920b.mo12867n(descriptor2, 1, userId$$serializer, null);
            obj5 = mo12920b.mo12867n(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj3 = mo12920b.mo12867n(descriptor2, 3, userId$$serializer, null);
            obj4 = mo12920b.mo12867n(descriptor2, 4, MessageType.Serializer.INSTANCE, null);
            obj2 = mo12920b.mo12867n(descriptor2, 5, ChannelId$$serializer.INSTANCE, null);
            i = 63;
        } else {
            boolean z = true;
            int i2 = 0;
            obj = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        obj = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, obj);
                        i2 |= 1;
                        break;
                    case 1:
                        obj11 = mo12920b.mo12867n(descriptor2, 1, UserId$$serializer.INSTANCE, obj11);
                        i2 |= 2;
                        break;
                    case 2:
                        obj10 = mo12920b.mo12867n(descriptor2, 2, MessageId$$serializer.INSTANCE, obj10);
                        i2 |= 4;
                        break;
                    case 3:
                        obj8 = mo12920b.mo12867n(descriptor2, 3, UserId$$serializer.INSTANCE, obj8);
                        i2 |= 8;
                        break;
                    case 4:
                        obj9 = mo12920b.mo12867n(descriptor2, 4, MessageType.Serializer.INSTANCE, obj9);
                        i2 |= 16;
                        break;
                    case 5:
                        obj7 = mo12920b.mo12867n(descriptor2, 5, ChannelId$$serializer.INSTANCE, obj7);
                        i2 |= 32;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
            i = i2;
        }
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj5;
        return new CommandOnClick(i, (String) obj, (UserId) obj6, messageId != null ? messageId.m42081unboximpl() : null, (UserId) obj3, (MessageType) obj4, (ChannelId) obj2, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, CommandOnClick value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        CommandOnClick.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}