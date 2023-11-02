package com.discord.chat.input.bridge;

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
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/input/bridge/ChatInputNode.$serializer", "Lcj/f0;", "Lcom/discord/chat/input/bridge/ChatInputNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputNode$$serializer implements InterfaceC2582f0<ChatInputNode> {
    public static final ChatInputNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatInputNode$$serializer chatInputNode$$serializer = new ChatInputNode$$serializer();
        INSTANCE = chatInputNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNode", chatInputNode$$serializer, 7);
        pluginGeneratedSerialDescriptor.m12856l("type", false);
        pluginGeneratedSerialDescriptor.m12856l("location", false);
        pluginGeneratedSerialDescriptor.m12856l("length", false);
        pluginGeneratedSerialDescriptor.m12856l("style", true);
        pluginGeneratedSerialDescriptor.m12856l("deleteNodeOnBackspace", true);
        pluginGeneratedSerialDescriptor.m12856l("tapAction", true);
        pluginGeneratedSerialDescriptor.m12856l("editDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatInputNode$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{c2615m0, c2615m0, c2615m0, C0213a.m40920u(ChatInputNodeStyle$$serializer.INSTANCE), c2590h, C0213a.m40920u(TapAction$$serializer.INSTANCE), c2590h};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatInputNode deserialize(Decoder decoder) {
        Object obj;
        boolean z;
        int i;
        Object obj2;
        boolean z2;
        int i2;
        int i3;
        int i4;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 1);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 2);
            obj2 = mo12920b.mo12867n(descriptor2, 3, ChatInputNodeStyle$$serializer.INSTANCE, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 4);
            obj = mo12920b.mo12867n(descriptor2, 5, TapAction$$serializer.INSTANCE, null);
            i2 = mo12870i;
            z = mo12920b.mo12876C(descriptor2, 6);
            z2 = mo12876C;
            i3 = mo12870i3;
            i4 = mo12870i2;
            i = 127;
        } else {
            boolean z3 = true;
            int i5 = 0;
            boolean z4 = false;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            Object obj3 = null;
            Object obj4 = null;
            boolean z5 = false;
            while (z3) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        i8 |= 1;
                        i5 = mo12920b.mo12870i(descriptor2, 0);
                        continue;
                    case 1:
                        i7 = mo12920b.mo12870i(descriptor2, 1);
                        i8 |= 2;
                        continue;
                    case 2:
                        i6 = mo12920b.mo12870i(descriptor2, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        obj3 = mo12920b.mo12867n(descriptor2, 3, ChatInputNodeStyle$$serializer.INSTANCE, obj3);
                        i8 |= 8;
                        break;
                    case 4:
                        z4 = mo12920b.mo12876C(descriptor2, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        obj4 = mo12920b.mo12867n(descriptor2, 5, TapAction$$serializer.INSTANCE, obj4);
                        i8 |= 32;
                        break;
                    case 6:
                        z5 = mo12920b.mo12876C(descriptor2, 6);
                        i8 |= 64;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj4;
            z = z5;
            i = i8;
            obj2 = obj3;
            z2 = z4;
            i2 = i5;
            int i9 = i7;
            i3 = i6;
            i4 = i9;
        }
        mo12920b.mo12872c(descriptor2);
        return new ChatInputNode(i, i2, i4, i3, (ChatInputNodeStyle) obj2, z2, (TapAction) obj, z, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ChatInputNode value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ChatInputNode.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}