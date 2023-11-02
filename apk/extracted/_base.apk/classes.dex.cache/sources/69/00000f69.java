package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/botuikit/RoleSelectComponent.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/botuikit/RoleSelectComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RoleSelectComponent$$serializer implements InterfaceC2582f0<RoleSelectComponent> {
    public static final RoleSelectComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RoleSelectComponent$$serializer roleSelectComponent$$serializer = new RoleSelectComponent$$serializer();
        INSTANCE = roleSelectComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("6", roleSelectComponent$$serializer, 11);
        pluginGeneratedSerialDescriptor.m12856l("selectedOptions", true);
        pluginGeneratedSerialDescriptor.m12856l("type", false);
        pluginGeneratedSerialDescriptor.m12856l("indices", false);
        pluginGeneratedSerialDescriptor.m12856l("applicationId", false);
        pluginGeneratedSerialDescriptor.m12856l("customId", false);
        pluginGeneratedSerialDescriptor.m12856l(ReactTextInputShadowNode.PROP_PLACEHOLDER, true);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.ACCESSIBILITY_LABEL, true);
        pluginGeneratedSerialDescriptor.m12856l("minValues", false);
        pluginGeneratedSerialDescriptor.m12856l("maxValues", false);
        pluginGeneratedSerialDescriptor.m12856l("disabled", true);
        pluginGeneratedSerialDescriptor.m12856l("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RoleSelectComponent$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C0213a.m40920u(new C2581f(SearchableSelectItem$$serializer.INSTANCE)), c2615m0, new C2581f(c2615m0), c2560a2, c2560a2, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2615m0, c2615m0, C2590h.f7055a, ActionComponentState.Serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public RoleSelectComponent deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        boolean z;
        Object obj5;
        char c;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i5 = 10;
        int i6 = 9;
        int i7 = 7;
        int i8 = 0;
        if (mo12920b.mo12865p()) {
            obj5 = mo12920b.mo12867n(descriptor2, 0, new C2581f(SearchableSelectItem$$serializer.INSTANCE), null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            Object mo12862y = mo12920b.mo12862y(descriptor2, 2, new C2581f(C2615m0.f7088a), null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 3);
            str2 = mo12920b.mo12868m(descriptor2, 4);
            C2560a2 c2560a2 = C2560a2.f7013a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 5, c2560a2, null);
            obj3 = mo12920b.mo12867n(descriptor2, 6, c2560a2, null);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 7);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 8);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 9);
            obj4 = mo12920b.mo12862y(descriptor2, 10, ActionComponentState.Serializer.INSTANCE, null);
            z = mo12876C;
            i3 = mo12870i3;
            str = mo12868m;
            i2 = mo12870i2;
            i = 2047;
            obj = mo12867n;
            i4 = mo12870i;
            obj2 = mo12862y;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i9 = 0;
            int i10 = 0;
            Object obj6 = null;
            Object obj7 = null;
            obj = null;
            obj2 = null;
            Object obj8 = null;
            String str3 = null;
            String str4 = null;
            int i11 = 0;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i6 = 9;
                        i7 = 7;
                    case 0:
                        obj8 = mo12920b.mo12867n(descriptor2, 0, new C2581f(SearchableSelectItem$$serializer.INSTANCE), obj8);
                        i8 |= 1;
                        i5 = 10;
                        i6 = 9;
                        i7 = 7;
                    case 1:
                        i10 = mo12920b.mo12870i(descriptor2, 1);
                        i8 |= 2;
                        i5 = 10;
                        i6 = 9;
                    case 2:
                        obj2 = mo12920b.mo12862y(descriptor2, 2, new C2581f(C2615m0.f7088a), obj2);
                        i8 |= 4;
                        i5 = 10;
                        i6 = 9;
                    case 3:
                        str3 = mo12920b.mo12868m(descriptor2, 3);
                        i8 |= 8;
                        i5 = 10;
                    case 4:
                        c = 5;
                        str4 = mo12920b.mo12868m(descriptor2, 4);
                        i8 |= 16;
                        i5 = 10;
                    case 5:
                        c = 5;
                        obj = mo12920b.mo12867n(descriptor2, 5, C2560a2.f7013a, obj);
                        i8 |= 32;
                        i5 = 10;
                    case 6:
                        obj6 = mo12920b.mo12867n(descriptor2, 6, C2560a2.f7013a, obj6);
                        i8 |= 64;
                    case 7:
                        i11 = mo12920b.mo12870i(descriptor2, i7);
                        i8 |= 128;
                    case 8:
                        i9 = mo12920b.mo12870i(descriptor2, 8);
                        i8 |= 256;
                    case 9:
                        z3 = mo12920b.mo12876C(descriptor2, i6);
                        i8 |= 512;
                    case 10:
                        obj7 = mo12920b.mo12862y(descriptor2, i5, ActionComponentState.Serializer.INSTANCE, obj7);
                        i8 |= 1024;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj3 = obj6;
            obj4 = obj7;
            i = i8;
            i2 = i11;
            i3 = i9;
            i4 = i10;
            str = str3;
            str2 = str4;
            z = z3;
            obj5 = obj8;
        }
        mo12920b.mo12872c(descriptor2);
        return new RoleSelectComponent(i, (List) obj5, i4, (List) obj2, str, str2, (String) obj, (String) obj3, i2, i3, z, (ActionComponentState) obj4, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, RoleSelectComponent value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        RoleSelectComponent.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}