package com.discord.chat.bridge.botuikit;

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
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/botuikit/SearchableSelectItem.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SearchableSelectItem$$serializer implements InterfaceC2582f0<SearchableSelectItem> {
    public static final SearchableSelectItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SearchableSelectItem$$serializer searchableSelectItem$$serializer = new SearchableSelectItem$$serializer();
        INSTANCE = searchableSelectItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.SearchableSelectItem", searchableSelectItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("label", false);
        pluginGeneratedSerialDescriptor.m12856l("value", false);
        pluginGeneratedSerialDescriptor.m12856l("emoji", true);
        pluginGeneratedSerialDescriptor.m12856l("type", false);
        pluginGeneratedSerialDescriptor.m12856l("iconSrc", true);
        pluginGeneratedSerialDescriptor.m12856l("iconColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchableSelectItem$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{c2560a2, c2560a2, C0213a.m40920u(ComponentEmoji$$serializer.INSTANCE), c2615m0, C0213a.m40920u(c2560a2), C0213a.m40920u(c2615m0)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SearchableSelectItem deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        String str;
        String str2;
        int i2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            obj = mo12920b.mo12867n(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 3);
            obj2 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, null);
            obj3 = mo12920b.mo12867n(descriptor2, 5, C2615m0.f7088a, null);
            str2 = mo12868m;
            i = mo12870i;
            str = mo12868m2;
            i2 = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            String str3 = null;
            String str4 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i4 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str3 = mo12920b.mo12868m(descriptor2, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        str4 = mo12920b.mo12868m(descriptor2, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        obj4 = mo12920b.mo12867n(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, obj4);
                        i4 |= 4;
                        break;
                    case 3:
                        i3 = mo12920b.mo12870i(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        obj5 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj5);
                        i4 |= 16;
                        break;
                    case 5:
                        obj6 = mo12920b.mo12867n(descriptor2, 5, C2615m0.f7088a, obj6);
                        i4 |= 32;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
            i = i3;
            str = str4;
            str2 = str3;
            i2 = i4;
        }
        mo12920b.mo12872c(descriptor2);
        return new SearchableSelectItem(i2, str2, str, (ComponentEmoji) obj, i, (String) obj2, (Integer) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, SearchableSelectItem value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        SearchableSelectItem.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}