package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
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
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/botuikit/ButtonComponent.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ButtonComponent$$serializer implements InterfaceC2582f0<ButtonComponent> {
    public static final ButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", buttonComponent$$serializer, 10);
        pluginGeneratedSerialDescriptor.m12856l("type", false);
        pluginGeneratedSerialDescriptor.m12856l("indices", false);
        pluginGeneratedSerialDescriptor.m12856l("applicationId", false);
        pluginGeneratedSerialDescriptor.m12856l("customId", true);
        pluginGeneratedSerialDescriptor.m12856l("label", true);
        pluginGeneratedSerialDescriptor.m12856l("style", false);
        pluginGeneratedSerialDescriptor.m12856l("disabled", true);
        pluginGeneratedSerialDescriptor.m12856l("emoji", true);
        pluginGeneratedSerialDescriptor.m12856l("url", true);
        pluginGeneratedSerialDescriptor.m12856l("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonComponent$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2615m0, new C2581f(c2615m0), ApplicationId$$serializer.INSTANCE, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), ButtonStyle.Serializer.INSTANCE, C2590h.f7055a, C0213a.m40920u(ComponentEmoji$$serializer.INSTANCE), C0213a.m40920u(c2560a2), ActionComponentState.Serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ButtonComponent deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i;
        int i2;
        Object obj8;
        char c;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 9;
        int i4 = 8;
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            Object mo12862y = mo12920b.mo12862y(descriptor2, 1, new C2581f(C2615m0.f7088a), null);
            obj7 = mo12920b.mo12862y(descriptor2, 2, ApplicationId$$serializer.INSTANCE, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            obj6 = mo12920b.mo12867n(descriptor2, 4, c2560a2, null);
            Object mo12862y2 = mo12920b.mo12862y(descriptor2, 5, ButtonStyle.Serializer.INSTANCE, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 6);
            obj5 = mo12920b.mo12867n(descriptor2, 7, ComponentEmoji$$serializer.INSTANCE, null);
            obj4 = mo12920b.mo12867n(descriptor2, 8, c2560a2, null);
            obj3 = mo12920b.mo12862y(descriptor2, 9, ActionComponentState.Serializer.INSTANCE, null);
            z = mo12876C;
            obj2 = mo12862y;
            obj = mo12867n;
            i2 = mo12870i;
            obj8 = mo12862y2;
            i = 1023;
        } else {
            boolean z2 = true;
            int i5 = 0;
            int i6 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            obj = null;
            obj2 = null;
            Object obj14 = null;
            z = false;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i3 = 9;
                        i4 = 8;
                    case 0:
                        i5 = mo12920b.mo12870i(descriptor2, 0);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 8;
                    case 1:
                        obj2 = mo12920b.mo12862y(descriptor2, 1, new C2581f(C2615m0.f7088a), obj2);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        obj14 = mo12920b.mo12862y(descriptor2, 2, ApplicationId$$serializer.INSTANCE, obj14);
                        i6 |= 4;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        obj = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj);
                        i6 |= 8;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        obj13 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj13);
                        i6 |= 16;
                        i3 = 9;
                        i4 = 8;
                    case 5:
                        obj11 = mo12920b.mo12862y(descriptor2, 5, ButtonStyle.Serializer.INSTANCE, obj11);
                        i6 |= 32;
                        i3 = 9;
                        i4 = 8;
                    case 6:
                        c = 7;
                        z = mo12920b.mo12876C(descriptor2, 6);
                        i6 |= 64;
                        i3 = 9;
                    case 7:
                        c = 7;
                        obj12 = mo12920b.mo12867n(descriptor2, 7, ComponentEmoji$$serializer.INSTANCE, obj12);
                        i6 |= 128;
                        i3 = 9;
                    case 8:
                        obj10 = mo12920b.mo12867n(descriptor2, i4, C2560a2.f7013a, obj10);
                        i6 |= 256;
                    case 9:
                        obj9 = mo12920b.mo12862y(descriptor2, i3, ActionComponentState.Serializer.INSTANCE, obj9);
                        i6 |= 512;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj3 = obj9;
            obj4 = obj10;
            obj5 = obj12;
            obj6 = obj13;
            obj7 = obj14;
            i = i6;
            Object obj15 = obj11;
            i2 = i5;
            obj8 = obj15;
        }
        mo12920b.mo12872c(descriptor2);
        return new ButtonComponent(i, i2, (List) obj2, (ApplicationId) obj7, (String) obj, (String) obj6, (ButtonStyle) obj8, z, (ComponentEmoji) obj5, (String) obj4, (ActionComponentState) obj3, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ButtonComponent value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ButtonComponent.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
