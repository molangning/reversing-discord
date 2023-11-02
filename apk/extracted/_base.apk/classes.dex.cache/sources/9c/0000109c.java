package com.discord.chat.bridge.reaction;

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
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/reaction/MessageReaction.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageReaction$$serializer implements InterfaceC2582f0<MessageReaction> {
    public static final MessageReaction$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageReaction$$serializer messageReaction$$serializer = new MessageReaction$$serializer();
        INSTANCE = messageReaction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.MessageReaction", messageReaction$$serializer, 7);
        pluginGeneratedSerialDescriptor.m12856l("count", false);
        pluginGeneratedSerialDescriptor.m12856l("me", false);
        pluginGeneratedSerialDescriptor.m12856l("me_burst", true);
        pluginGeneratedSerialDescriptor.m12856l("emoji", false);
        pluginGeneratedSerialDescriptor.m12856l("burst_count", true);
        pluginGeneratedSerialDescriptor.m12856l("themedBurstColors", true);
        pluginGeneratedSerialDescriptor.m12856l("isMe", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageReaction$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{c2615m0, c2590h, c2590h, MessageReactionEmoji$$serializer.INSTANCE, c2615m0, C0213a.m40920u(ThemedBurstReactionColorPalette$$serializer.INSTANCE), c2590h};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageReaction deserialize(Decoder decoder) {
        Object obj;
        boolean z;
        int i;
        Object obj2;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 1);
            boolean mo12876C2 = mo12920b.mo12876C(descriptor2, 2);
            obj2 = mo12920b.mo12862y(descriptor2, 3, MessageReactionEmoji$$serializer.INSTANCE, null);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 4);
            obj = mo12920b.mo12867n(descriptor2, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, null);
            i3 = mo12870i;
            z = mo12920b.mo12876C(descriptor2, 6);
            i2 = mo12870i2;
            z2 = mo12876C2;
            z3 = mo12876C;
            i = 127;
        } else {
            boolean z4 = true;
            int i4 = 0;
            int i5 = 0;
            boolean z5 = false;
            boolean z6 = false;
            int i6 = 0;
            Object obj3 = null;
            Object obj4 = null;
            boolean z7 = false;
            while (z4) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i6 |= 1;
                        i4 = mo12920b.mo12870i(descriptor2, 0);
                        continue;
                    case 1:
                        z6 = mo12920b.mo12876C(descriptor2, 1);
                        i6 |= 2;
                        continue;
                    case 2:
                        z5 = mo12920b.mo12876C(descriptor2, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        obj3 = mo12920b.mo12862y(descriptor2, 3, MessageReactionEmoji$$serializer.INSTANCE, obj3);
                        i6 |= 8;
                        break;
                    case 4:
                        i5 = mo12920b.mo12870i(descriptor2, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        obj4 = mo12920b.mo12867n(descriptor2, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, obj4);
                        i6 |= 32;
                        break;
                    case 6:
                        z7 = mo12920b.mo12876C(descriptor2, 6);
                        i6 |= 64;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj4;
            z = z7;
            i = i6;
            obj2 = obj3;
            i2 = i5;
            i3 = i4;
            boolean z8 = z6;
            z2 = z5;
            z3 = z8;
        }
        mo12920b.mo12872c(descriptor2);
        return new MessageReaction(i, i3, z3, z2, (MessageReactionEmoji) obj2, i2, (ThemedBurstReactionColorPalette) obj, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MessageReaction value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MessageReaction.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}