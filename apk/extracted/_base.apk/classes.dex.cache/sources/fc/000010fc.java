package com.discord.chat.bridge.summaries;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/summaries/Summary.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/summaries/Summary;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class Summary$$serializer implements InterfaceC2582f0<Summary> {
    public static final Summary$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Summary$$serializer summary$$serializer = new Summary$$serializer();
        INSTANCE = summary$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.summaries.Summary", summary$$serializer, 8);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l("topic", false);
        pluginGeneratedSerialDescriptor.m12856l("summShort", false);
        pluginGeneratedSerialDescriptor.m12856l("people", false);
        pluginGeneratedSerialDescriptor.m12856l("startId", false);
        pluginGeneratedSerialDescriptor.m12856l("endId", false);
        pluginGeneratedSerialDescriptor.m12856l("count", false);
        pluginGeneratedSerialDescriptor.m12856l("channelId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Summary$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        return new KSerializer[]{c2560a2, c2560a2, c2560a2, new C2581f(UserId$$serializer.INSTANCE), messageId$$serializer, messageId$$serializer, C2615m0.f7088a, ChannelId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Summary deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        String str3;
        boolean z;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 7;
        int i3 = 0;
        Object obj5 = null;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 2);
            obj4 = mo12920b.mo12862y(descriptor2, 3, new C2581f(UserId$$serializer.INSTANCE), null);
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            obj = mo12920b.mo12862y(descriptor2, 4, messageId$$serializer, null);
            obj3 = mo12920b.mo12862y(descriptor2, 5, messageId$$serializer, null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 6);
            obj2 = mo12920b.mo12862y(descriptor2, 7, ChannelId$$serializer.INSTANCE, null);
            i3 = 255;
            str3 = mo12868m;
            i = mo12870i;
            str = mo12868m3;
            str2 = mo12868m2;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str4 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            String str5 = null;
            String str6 = null;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                    case 0:
                        z = true;
                        str4 = mo12920b.mo12868m(descriptor2, 0);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        z = true;
                        str6 = mo12920b.mo12868m(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str5 = mo12920b.mo12868m(descriptor2, 2);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        obj8 = mo12920b.mo12862y(descriptor2, 3, new C2581f(UserId$$serializer.INSTANCE), obj8);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        obj5 = mo12920b.mo12862y(descriptor2, 4, MessageId$$serializer.INSTANCE, obj5);
                        i3 |= 16;
                    case 5:
                        obj7 = mo12920b.mo12862y(descriptor2, 5, MessageId$$serializer.INSTANCE, obj7);
                        i3 |= 32;
                    case 6:
                        i4 = mo12920b.mo12870i(descriptor2, 6);
                        i3 |= 64;
                    case 7:
                        obj6 = mo12920b.mo12862y(descriptor2, i2, ChannelId$$serializer.INSTANCE, obj6);
                        i3 |= 128;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj5;
            obj2 = obj6;
            i = i4;
            obj3 = obj7;
            obj4 = obj8;
            str = str5;
            str2 = str6;
            str3 = str4;
        }
        int i5 = i3;
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj;
        MessageId messageId2 = (MessageId) obj3;
        return new Summary(i5, str3, str2, str, (List) obj4, messageId != null ? messageId.m42081unboximpl() : null, messageId2 != null ? messageId2.m42081unboximpl() : null, i, (ChannelId) obj2, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, Summary value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        Summary.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}