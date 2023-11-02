package com.discord.chat.bridge.reaction;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
import p045cj.C2590h;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/reaction/MessageReactionEmoji.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageReactionEmoji$$serializer implements InterfaceC2582f0<MessageReactionEmoji> {
    public static final MessageReactionEmoji$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageReactionEmoji$$serializer messageReactionEmoji$$serializer = new MessageReactionEmoji$$serializer();
        INSTANCE = messageReactionEmoji$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.MessageReactionEmoji", messageReactionEmoji$$serializer, 5);
        pluginGeneratedSerialDescriptor.m12856l(ZeroconfModule.KEY_SERVICE_NAME, true);
        pluginGeneratedSerialDescriptor.m12856l("src", false);
        pluginGeneratedSerialDescriptor.m12856l("displayName", false);
        pluginGeneratedSerialDescriptor.m12856l("id", true);
        pluginGeneratedSerialDescriptor.m12856l("animated", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageReactionEmoji$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C0213a.m40920u(c2560a2), c2560a2, c2560a2, C0213a.m40920u(c2560a2), C0213a.m40920u(C2590h.f7055a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageReactionEmoji deserialize(Decoder decoder) {
        String str;
        int i;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        Object obj4 = null;
        if (mo12920b.mo12865p()) {
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj = mo12920b.mo12867n(descriptor2, 0, c2560a2, null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 1);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 2);
            obj2 = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            obj3 = mo12920b.mo12867n(descriptor2, 4, C2590h.f7055a, null);
            str2 = mo12868m2;
            str = mo12868m;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            String str3 = null;
            Object obj5 = null;
            Object obj6 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj4 = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, obj4);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    str = mo12920b.mo12868m(descriptor2, 1);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    str3 = mo12920b.mo12868m(descriptor2, 2);
                    i2 |= 4;
                } else if (mo12866o == 3) {
                    obj5 = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj5);
                    i2 |= 8;
                } else if (mo12866o != 4) {
                    throw new C14289n(mo12866o);
                } else {
                    obj6 = mo12920b.mo12867n(descriptor2, 4, C2590h.f7055a, obj6);
                    i2 |= 16;
                }
            }
            i = i2;
            obj = obj4;
            str2 = str3;
            obj2 = obj5;
            obj3 = obj6;
        }
        mo12920b.mo12872c(descriptor2);
        return new MessageReactionEmoji(i, (String) obj, str, str2, (String) obj2, (Boolean) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MessageReactionEmoji value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MessageReactionEmoji.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}