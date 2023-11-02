package com.discord.chat.reactevents;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/reactevents/ChatScrollPositionEvent.$serializer", "Lcj/f0;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatScrollPositionEvent$$serializer implements InterfaceC2582f0<ChatScrollPositionEvent> {
    public static final ChatScrollPositionEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatScrollPositionEvent$$serializer chatScrollPositionEvent$$serializer = new ChatScrollPositionEvent$$serializer();
        INSTANCE = chatScrollPositionEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.ChatScrollPositionEvent", chatScrollPositionEvent$$serializer, 9);
        pluginGeneratedSerialDescriptor.m12856l("isAtBottom", false);
        pluginGeneratedSerialDescriptor.m12856l("isNearBottom", false);
        pluginGeneratedSerialDescriptor.m12856l("isNearTop", false);
        pluginGeneratedSerialDescriptor.m12856l("dragging", false);
        pluginGeneratedSerialDescriptor.m12856l("decelerating", false);
        pluginGeneratedSerialDescriptor.m12856l("shouldShowJumpToPresent", false);
        pluginGeneratedSerialDescriptor.m12856l("isFirstMessageVisible", false);
        pluginGeneratedSerialDescriptor.m12856l("firstVisibleMessageIndex", false);
        pluginGeneratedSerialDescriptor.m12856l("lastVisibleMessageIndex", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatScrollPositionEvent$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2590h c2590h = C2590h.f7055a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{c2590h, c2590h, c2590h, c2590h, c2590h, c2590h, c2590h, c2615m0, c2615m0};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatScrollPositionEvent deserialize(Decoder decoder) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i4 = 0;
        if (mo12920b.mo12865p()) {
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 0);
            boolean mo12876C2 = mo12920b.mo12876C(descriptor2, 1);
            boolean mo12876C3 = mo12920b.mo12876C(descriptor2, 2);
            boolean mo12876C4 = mo12920b.mo12876C(descriptor2, 3);
            boolean mo12876C5 = mo12920b.mo12876C(descriptor2, 4);
            boolean mo12876C6 = mo12920b.mo12876C(descriptor2, 5);
            boolean mo12876C7 = mo12920b.mo12876C(descriptor2, 6);
            z7 = mo12876C;
            i = mo12920b.mo12870i(descriptor2, 7);
            z6 = mo12876C7;
            z4 = mo12876C6;
            z2 = mo12876C4;
            i2 = mo12920b.mo12870i(descriptor2, 8);
            z = mo12876C5;
            z3 = mo12876C3;
            z5 = mo12876C2;
            i3 = 511;
        } else {
            boolean z8 = true;
            boolean z9 = false;
            int i5 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i6 = 0;
            z = false;
            boolean z13 = false;
            boolean z14 = false;
            while (z8) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z8 = false;
                        break;
                    case 0:
                        i4 |= 1;
                        z9 = mo12920b.mo12876C(descriptor2, 0);
                        continue;
                    case 1:
                        z14 = mo12920b.mo12876C(descriptor2, 1);
                        i4 |= 2;
                        continue;
                    case 2:
                        z13 = mo12920b.mo12876C(descriptor2, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        z12 = mo12920b.mo12876C(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        z = mo12920b.mo12876C(descriptor2, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        z11 = mo12920b.mo12876C(descriptor2, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        z10 = mo12920b.mo12876C(descriptor2, 6);
                        i4 |= 64;
                        break;
                    case 7:
                        i5 = mo12920b.mo12870i(descriptor2, 7);
                        i4 |= 128;
                        break;
                    case 8:
                        i6 = mo12920b.mo12870i(descriptor2, 8);
                        i4 |= 256;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i5;
            i2 = i6;
            i3 = i4;
            z2 = z12;
            z3 = z13;
            z4 = z11;
            z5 = z14;
            z6 = z10;
            z7 = z9;
        }
        mo12920b.mo12872c(descriptor2);
        return new ChatScrollPositionEvent(i3, z7, z5, z3, z2, z, z4, z6, i, i2, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ChatScrollPositionEvent value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ChatScrollPositionEvent.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
