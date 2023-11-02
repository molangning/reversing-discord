package com.discord.chat.bridge.channelprompt;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/channelprompt/ChannelPromptData.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelPromptData$$serializer implements InterfaceC2582f0<ChannelPromptData> {
    public static final ChannelPromptData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelPromptData$$serializer channelPromptData$$serializer = new ChannelPromptData$$serializer();
        INSTANCE = channelPromptData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.channelprompt.ChannelPromptData", channelPromptData$$serializer, 7);
        pluginGeneratedSerialDescriptor.m12856l("cameraButtonIcon", true);
        pluginGeneratedSerialDescriptor.m12856l("gifButtonIcon", true);
        pluginGeneratedSerialDescriptor.m12856l("emojiButtonIcon", true);
        pluginGeneratedSerialDescriptor.m12856l("gamingStatsButtonText", true);
        pluginGeneratedSerialDescriptor.m12856l("cameraButtonText", true);
        pluginGeneratedSerialDescriptor.m12856l("gifButtonText", true);
        pluginGeneratedSerialDescriptor.m12856l("emojiButtonText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelPromptData$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChannelPromptData deserialize(Decoder decoder) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 6;
        Object obj8 = null;
        if (mo12920b.mo12865p()) {
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj3 = mo12920b.mo12867n(descriptor2, 0, c2560a2, null);
            obj4 = mo12920b.mo12867n(descriptor2, 1, c2560a2, null);
            obj5 = mo12920b.mo12867n(descriptor2, 2, c2560a2, null);
            obj6 = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            obj7 = mo12920b.mo12867n(descriptor2, 4, c2560a2, null);
            Object mo12867n = mo12920b.mo12867n(descriptor2, 5, c2560a2, null);
            obj2 = mo12920b.mo12867n(descriptor2, 6, c2560a2, null);
            obj = mo12867n;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            obj = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        obj8 = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, obj8);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        obj10 = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, obj10);
                        i3 |= 2;
                        i2 = 6;
                        continue;
                    case 2:
                        obj11 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj11);
                        i3 |= 4;
                        break;
                    case 3:
                        obj12 = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj12);
                        i3 |= 8;
                        break;
                    case 4:
                        obj13 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj13);
                        i3 |= 16;
                        break;
                    case 5:
                        obj = mo12920b.mo12867n(descriptor2, 5, C2560a2.f7013a, obj);
                        i3 |= 32;
                        break;
                    case 6:
                        obj9 = mo12920b.mo12867n(descriptor2, i2, C2560a2.f7013a, obj9);
                        i3 |= 64;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i3;
            obj2 = obj9;
            obj3 = obj8;
            obj4 = obj10;
            obj5 = obj11;
            obj6 = obj12;
            obj7 = obj13;
        }
        mo12920b.mo12872c(descriptor2);
        return new ChannelPromptData(i, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj, (String) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ChannelPromptData value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ChannelPromptData.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
