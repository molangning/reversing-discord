package com.discord.chat.bridge.contentnode;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/contentnode/ChannelMentionContentNode.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelMentionContentNode$$serializer implements InterfaceC2582f0<ChannelMentionContentNode> {
    public static final ChannelMentionContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelMentionContentNode$$serializer channelMentionContentNode$$serializer = new ChannelMentionContentNode$$serializer();
        INSTANCE = channelMentionContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("channelMention", channelMentionContentNode$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("channelId", false);
        pluginGeneratedSerialDescriptor.m12856l("guildId", true);
        pluginGeneratedSerialDescriptor.m12856l("messageId", true);
        pluginGeneratedSerialDescriptor.m12856l("originalLink", true);
        pluginGeneratedSerialDescriptor.m12856l("inContent", true);
        pluginGeneratedSerialDescriptor.m12856l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelMentionContentNode$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        ContentNodeSerializer contentNodeSerializer = ContentNodeSerializer.INSTANCE;
        return new KSerializer[]{c2560a2, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(new C2581f(contentNodeSerializer)), C0213a.m40920u(new C2581f(contentNodeSerializer))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChannelMentionContentNode deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        String str;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        boolean z = true;
        String str2 = null;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj = mo12920b.mo12867n(descriptor2, 1, c2560a2, null);
            obj2 = mo12920b.mo12867n(descriptor2, 2, c2560a2, null);
            obj3 = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            ContentNodeSerializer contentNodeSerializer = ContentNodeSerializer.INSTANCE;
            obj4 = mo12920b.mo12867n(descriptor2, 4, new C2581f(contentNodeSerializer), null);
            obj5 = mo12920b.mo12867n(descriptor2, 5, new C2581f(contentNodeSerializer), null);
            str = mo12868m;
            i = 63;
        } else {
            boolean z2 = true;
            int i2 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        z = z;
                        continue;
                    case 0:
                        str2 = mo12920b.mo12868m(descriptor2, 0);
                        i2 |= 1;
                        z = z;
                        continue;
                    case 1:
                        obj6 = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, obj6);
                        i2 |= 2;
                        z = true;
                        break;
                    case 2:
                        obj7 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj7);
                        i2 |= 4;
                        z = true;
                        break;
                    case 3:
                        obj8 = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj8);
                        i2 |= 8;
                        z = true;
                        break;
                    case 4:
                        obj9 = mo12920b.mo12867n(descriptor2, 4, new C2581f(ContentNodeSerializer.INSTANCE), obj9);
                        i2 |= 16;
                        z = true;
                        break;
                    case 5:
                        obj10 = mo12920b.mo12867n(descriptor2, 5, new C2581f(ContentNodeSerializer.INSTANCE), obj10);
                        i2 |= 32;
                        z = true;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            i = i2;
            str = str2;
        }
        mo12920b.mo12872c(descriptor2);
        return new ChannelMentionContentNode(i, str, (String) obj, (String) obj2, (String) obj3, (List) obj4, (List) obj5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ChannelMentionContentNode value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ChannelMentionContentNode.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}