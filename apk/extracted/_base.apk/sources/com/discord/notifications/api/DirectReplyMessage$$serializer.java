package com.discord.notifications.api;

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
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/notifications/api/DirectReplyMessage.$serializer", "Lcj/f0;", "Lcom/discord/notifications/api/DirectReplyMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class DirectReplyMessage$$serializer implements InterfaceC2582f0<DirectReplyMessage> {
    public static final DirectReplyMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DirectReplyMessage$$serializer directReplyMessage$$serializer = new DirectReplyMessage$$serializer();
        INSTANCE = directReplyMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyMessage", directReplyMessage$$serializer, 8);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l("channel_id", false);
        pluginGeneratedSerialDescriptor.m12856l("author", false);
        pluginGeneratedSerialDescriptor.m12856l("content", true);
        pluginGeneratedSerialDescriptor.m12856l("type", true);
        pluginGeneratedSerialDescriptor.m12856l("channelType", true);
        pluginGeneratedSerialDescriptor.m12856l("channelName", true);
        pluginGeneratedSerialDescriptor.m12856l("guildName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DirectReplyMessage$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, DirectReplyUser$$serializer.INSTANCE, C0213a.m40920u(c2560a2), C0213a.m40920u(c2615m0), C0213a.m40920u(c2615m0), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DirectReplyMessage deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        Object obj7;
        Object obj8;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        Object obj9 = null;
        if (mo12920b.mo12865p()) {
            obj = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj7 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = mo12920b.mo12862y(descriptor2, 2, DirectReplyUser$$serializer.INSTANCE, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj6 = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            C2615m0 c2615m0 = C2615m0.f7088a;
            obj3 = mo12920b.mo12867n(descriptor2, 4, c2615m0, null);
            obj5 = mo12920b.mo12867n(descriptor2, 5, c2615m0, null);
            obj4 = mo12920b.mo12867n(descriptor2, 6, c2560a2, null);
            obj8 = mo12920b.mo12867n(descriptor2, 7, c2560a2, null);
            i = 255;
        } else {
            boolean z = true;
            int i4 = 0;
            obj = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        obj = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        i4 |= 2;
                        obj15 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj15);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        obj10 = mo12920b.mo12862y(descriptor2, 2, DirectReplyUser$$serializer.INSTANCE, obj10);
                        i4 |= 4;
                        i2 = 7;
                        continue;
                    case 3:
                        obj14 = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj14);
                        i4 |= 8;
                        break;
                    case 4:
                        obj9 = mo12920b.mo12867n(descriptor2, 4, C2615m0.f7088a, obj9);
                        i4 |= 16;
                        break;
                    case 5:
                        obj13 = mo12920b.mo12867n(descriptor2, 5, C2615m0.f7088a, obj13);
                        i4 |= 32;
                        break;
                    case 6:
                        obj12 = mo12920b.mo12867n(descriptor2, i3, C2560a2.f7013a, obj12);
                        i4 |= 64;
                        break;
                    case 7:
                        obj11 = mo12920b.mo12867n(descriptor2, i2, C2560a2.f7013a, obj11);
                        i4 |= 128;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj2 = obj10;
            obj3 = obj9;
            obj4 = obj12;
            obj5 = obj13;
            obj6 = obj14;
            i = i4;
            obj7 = obj15;
            obj8 = obj11;
        }
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj;
        return new DirectReplyMessage(i, messageId != null ? messageId.m42081unboximpl() : null, (ChannelId) obj7, (DirectReplyUser) obj2, (String) obj6, (Integer) obj3, (Integer) obj5, (String) obj4, (String) obj8, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, DirectReplyMessage value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        DirectReplyMessage.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
