package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/botuikit/ChannelSelectComponent.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/botuikit/ChannelSelectComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelSelectComponent$$serializer implements InterfaceC2582f0<ChannelSelectComponent> {
    public static final ChannelSelectComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelSelectComponent$$serializer channelSelectComponent$$serializer = new ChannelSelectComponent$$serializer();
        INSTANCE = channelSelectComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("8", channelSelectComponent$$serializer, 12);
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
        pluginGeneratedSerialDescriptor.m12856l("channelTypes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelSelectComponent$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C0213a.m40920u(new C2581f(SearchableSelectItem$$serializer.INSTANCE)), c2615m0, new C2581f(c2615m0), c2560a2, c2560a2, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2615m0, c2615m0, C2590h.f7055a, ActionComponentState.Serializer.INSTANCE, C0213a.m40920u(new C2581f(c2615m0))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChannelSelectComponent deserialize(Decoder decoder) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        int i3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i4;
        boolean z;
        String str;
        String str2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i5 = 10;
        int i6 = 9;
        int i7 = 7;
        int i8 = 0;
        if (mo12920b.mo12865p()) {
            obj4 = mo12920b.mo12867n(descriptor2, 0, new C2581f(SearchableSelectItem$$serializer.INSTANCE), null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            C2615m0 c2615m0 = C2615m0.f7088a;
            Object mo12862y = mo12920b.mo12862y(descriptor2, 2, new C2581f(c2615m0), null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 3);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 4);
            C2560a2 c2560a2 = C2560a2.f7013a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 5, c2560a2, null);
            obj6 = mo12920b.mo12867n(descriptor2, 6, c2560a2, null);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 7);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 8);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 9);
            Object mo12862y2 = mo12920b.mo12862y(descriptor2, 10, ActionComponentState.Serializer.INSTANCE, null);
            i = mo12870i2;
            i2 = mo12870i3;
            i3 = mo12870i;
            obj5 = mo12920b.mo12867n(descriptor2, 11, new C2581f(c2615m0), null);
            obj3 = mo12862y;
            obj2 = mo12867n;
            str = mo12868m;
            str2 = mo12868m2;
            obj = mo12862y2;
            i4 = 4095;
            z = mo12876C;
        } else {
            int i9 = 11;
            boolean z2 = true;
            int i10 = 0;
            i = 0;
            i2 = 0;
            Object obj7 = null;
            Object obj8 = null;
            obj = null;
            obj2 = null;
            obj3 = null;
            Object obj9 = null;
            String str3 = null;
            String str4 = null;
            boolean z3 = false;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 0:
                        obj9 = mo12920b.mo12867n(descriptor2, 0, new C2581f(SearchableSelectItem$$serializer.INSTANCE), obj9);
                        i8 |= 1;
                        i9 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        i10 = mo12920b.mo12870i(descriptor2, 1);
                        i8 |= 2;
                        i9 = 11;
                        i5 = 10;
                        break;
                    case 2:
                        obj3 = mo12920b.mo12862y(descriptor2, 2, new C2581f(C2615m0.f7088a), obj3);
                        i8 |= 4;
                        i9 = 11;
                        i5 = 10;
                        break;
                    case 3:
                        str3 = mo12920b.mo12868m(descriptor2, 3);
                        i8 |= 8;
                        i9 = 11;
                        break;
                    case 4:
                        str4 = mo12920b.mo12868m(descriptor2, 4);
                        i8 |= 16;
                        i9 = 11;
                        break;
                    case 5:
                        obj2 = mo12920b.mo12867n(descriptor2, 5, C2560a2.f7013a, obj2);
                        i8 |= 32;
                        i9 = 11;
                        break;
                    case 6:
                        obj8 = mo12920b.mo12867n(descriptor2, 6, C2560a2.f7013a, obj8);
                        i8 |= 64;
                        i9 = 11;
                        continue;
                    case 7:
                        i = mo12920b.mo12870i(descriptor2, i7);
                        i8 |= 128;
                        break;
                    case 8:
                        i2 = mo12920b.mo12870i(descriptor2, 8);
                        i8 |= 256;
                        i7 = 7;
                        break;
                    case 9:
                        z3 = mo12920b.mo12876C(descriptor2, i6);
                        i8 |= 512;
                        i7 = 7;
                        break;
                    case 10:
                        obj = mo12920b.mo12862y(descriptor2, i5, ActionComponentState.Serializer.INSTANCE, obj);
                        i8 |= 1024;
                        i7 = 7;
                        break;
                    case 11:
                        obj7 = mo12920b.mo12867n(descriptor2, i9, new C2581f(C2615m0.f7088a), obj7);
                        i8 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i7 = 7;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i3 = i10;
            obj4 = obj9;
            obj5 = obj7;
            obj6 = obj8;
            i4 = i8;
            z = z3;
            str = str3;
            str2 = str4;
        }
        mo12920b.mo12872c(descriptor2);
        return new ChannelSelectComponent(i4, (List) obj4, i3, (List) obj3, str, str2, (String) obj2, (String) obj6, i, i2, z, (ActionComponentState) obj, (List) obj5, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ChannelSelectComponent value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ChannelSelectComponent.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}