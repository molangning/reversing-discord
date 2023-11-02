package com.discord.chat.input.bridge;

import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.common.BackgroundStyle$$serializer;
import com.facebook.react.uimanager.ViewProps;
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
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/input/bridge/ChatInputNodeStyle.$serializer", "Lcj/f0;", "Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputNodeStyle$$serializer implements InterfaceC2582f0<ChatInputNodeStyle> {
    public static final ChatInputNodeStyle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChatInputNodeStyle$$serializer chatInputNodeStyle$$serializer = new ChatInputNodeStyle$$serializer();
        INSTANCE = chatInputNodeStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNodeStyle", chatInputNodeStyle$$serializer, 4);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.FONT_SIZE, true);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("backgroundStyle", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.FONT_WEIGHT, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChatInputNodeStyle$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{C0213a.m40920u(c2615m0), c2615m0, C0213a.m40920u(BackgroundStyle$$serializer.INSTANCE), C0213a.m40920u(ChatInputNodeFontWeight.Companion.serializer())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChatInputNodeStyle deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            obj3 = mo12920b.mo12867n(descriptor2, 0, C2615m0.f7088a, null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            obj = mo12920b.mo12867n(descriptor2, 2, BackgroundStyle$$serializer.INSTANCE, null);
            obj2 = mo12920b.mo12867n(descriptor2, 3, ChatInputNodeFontWeight.Companion.serializer(), null);
            i = 15;
            i2 = mo12870i;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i4 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj4 = mo12920b.mo12867n(descriptor2, 0, C2615m0.f7088a, obj4);
                    i4 |= 1;
                } else if (mo12866o == 1) {
                    i3 = mo12920b.mo12870i(descriptor2, 1);
                    i4 |= 2;
                } else if (mo12866o == 2) {
                    obj5 = mo12920b.mo12867n(descriptor2, 2, BackgroundStyle$$serializer.INSTANCE, obj5);
                    i4 |= 4;
                } else if (mo12866o != 3) {
                    throw new C14289n(mo12866o);
                } else {
                    obj6 = mo12920b.mo12867n(descriptor2, 3, ChatInputNodeFontWeight.Companion.serializer(), obj6);
                    i4 |= 8;
                }
            }
            i = i4;
            obj = obj5;
            obj2 = obj6;
            Object obj7 = obj4;
            i2 = i3;
            obj3 = obj7;
        }
        mo12920b.mo12872c(descriptor2);
        return new ChatInputNodeStyle(i, (Integer) obj3, i2, (BackgroundStyle) obj, (ChatInputNodeFontWeight) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ChatInputNodeStyle value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ChatInputNodeStyle.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
