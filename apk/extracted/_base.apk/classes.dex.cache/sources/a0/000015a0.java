package com.discord.chat.reactevents;

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
import p045cj.C2578e0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/reactevents/VoiceMessagePlaybackEndedData.$serializer", "Lcj/f0;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class VoiceMessagePlaybackEndedData$$serializer implements InterfaceC2582f0<VoiceMessagePlaybackEndedData> {
    public static final VoiceMessagePlaybackEndedData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VoiceMessagePlaybackEndedData$$serializer voiceMessagePlaybackEndedData$$serializer = new VoiceMessagePlaybackEndedData$$serializer();
        INSTANCE = voiceMessagePlaybackEndedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.VoiceMessagePlaybackEndedData", voiceMessagePlaybackEndedData$$serializer, 5);
        pluginGeneratedSerialDescriptor.m12856l("messageId", false);
        pluginGeneratedSerialDescriptor.m12856l("totalDurationSecs", false);
        pluginGeneratedSerialDescriptor.m12856l("endDurationSecs", false);
        pluginGeneratedSerialDescriptor.m12856l("senderUserId", false);
        pluginGeneratedSerialDescriptor.m12856l("durationListeningSecs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VoiceMessagePlaybackEndedData$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2578e0 c2578e0 = C2578e0.f7038a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, c2578e0, c2578e0, UserId$$serializer.INSTANCE, c2578e0};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VoiceMessagePlaybackEndedData deserialize(Decoder decoder) {
        float f;
        Object obj;
        Object obj2;
        float f2;
        float f3;
        int i;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            obj = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            float mo12863u = mo12920b.mo12863u(descriptor2, 1);
            float mo12863u2 = mo12920b.mo12863u(descriptor2, 2);
            obj2 = mo12920b.mo12862y(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            f = mo12920b.mo12863u(descriptor2, 4);
            f2 = mo12863u2;
            i = 31;
            f3 = mo12863u;
        } else {
            f = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            boolean z = true;
            int i2 = 0;
            obj = null;
            Object obj3 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    f5 = mo12920b.mo12863u(descriptor2, 1);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    f4 = mo12920b.mo12863u(descriptor2, 2);
                    i2 |= 4;
                } else if (mo12866o == 3) {
                    obj3 = mo12920b.mo12862y(descriptor2, 3, UserId$$serializer.INSTANCE, obj3);
                    i2 |= 8;
                } else if (mo12866o != 4) {
                    throw new C14289n(mo12866o);
                } else {
                    f = mo12920b.mo12863u(descriptor2, 4);
                    i2 |= 16;
                }
            }
            obj2 = obj3;
            f2 = f4;
            f3 = f5;
            i = i2;
        }
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj;
        return new VoiceMessagePlaybackEndedData(i, messageId != null ? messageId.m42081unboximpl() : null, f3, f2, (UserId) obj2, f, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, VoiceMessagePlaybackEndedData value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        VoiceMessagePlaybackEndedData.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}