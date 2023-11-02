package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.bridge.summaries.Summary$$serializer;
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
import p045cj.C2560a2;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/row/SeparatorRow.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SeparatorRow$$serializer implements InterfaceC2582f0<SeparatorRow> {
    public static final SeparatorRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SeparatorRow$$serializer separatorRow$$serializer = new SeparatorRow$$serializer();
        INSTANCE = separatorRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", separatorRow$$serializer, 8);
        pluginGeneratedSerialDescriptor.m12856l("changeType", false);
        pluginGeneratedSerialDescriptor.m12856l("index", false);
        pluginGeneratedSerialDescriptor.m12856l("text", false);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("scrollTo", true);
        pluginGeneratedSerialDescriptor.m12856l("isBeforeContent", true);
        pluginGeneratedSerialDescriptor.m12856l("summary", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SeparatorRow$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{ChangeType.Serializer.INSTANCE, c2615m0, c2560a2, c2560a2, c2615m0, C0213a.m40920u(c2590h), C0213a.m40920u(c2590h), C0213a.m40920u(Summary$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SeparatorRow deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        Object obj4;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i4 = 7;
        int i5 = 6;
        if (mo12920b.mo12865p()) {
            obj4 = mo12920b.mo12862y(descriptor2, 0, ChangeType.Serializer.INSTANCE, null);
            i = mo12920b.mo12870i(descriptor2, 1);
            String mo12868m = mo12920b.mo12868m(descriptor2, 2);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 3);
            int mo12870i = mo12920b.mo12870i(descriptor2, 4);
            C2590h c2590h = C2590h.f7055a;
            obj3 = mo12920b.mo12867n(descriptor2, 5, c2590h, null);
            obj2 = mo12920b.mo12867n(descriptor2, 6, c2590h, null);
            obj = mo12920b.mo12867n(descriptor2, 7, Summary$$serializer.INSTANCE, null);
            str2 = mo12868m2;
            i3 = mo12870i;
            i2 = 255;
            str = mo12868m;
        } else {
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str3 = null;
            String str4 = null;
            Object obj8 = null;
            int i8 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i5 = 6;
                        break;
                    case 0:
                        obj7 = mo12920b.mo12862y(descriptor2, 0, ChangeType.Serializer.INSTANCE, obj7);
                        i7 |= 1;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        i7 |= 2;
                        i8 = mo12920b.mo12870i(descriptor2, 1);
                        break;
                    case 2:
                        i7 |= 4;
                        str3 = mo12920b.mo12868m(descriptor2, 2);
                        break;
                    case 3:
                        str4 = mo12920b.mo12868m(descriptor2, 3);
                        i7 |= 8;
                        break;
                    case 4:
                        i6 = mo12920b.mo12870i(descriptor2, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        obj8 = mo12920b.mo12867n(descriptor2, 5, C2590h.f7055a, obj8);
                        i7 |= 32;
                        break;
                    case 6:
                        obj6 = mo12920b.mo12867n(descriptor2, i5, C2590h.f7055a, obj6);
                        i7 |= 64;
                        break;
                    case 7:
                        obj5 = mo12920b.mo12867n(descriptor2, i4, Summary$$serializer.INSTANCE, obj5);
                        i7 |= 128;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj5;
            obj2 = obj6;
            obj3 = obj8;
            i = i8;
            i2 = i7;
            str = str3;
            str2 = str4;
            i3 = i6;
            obj4 = obj7;
        }
        mo12920b.mo12872c(descriptor2);
        return new SeparatorRow(i2, (ChangeType) obj4, i, str, str2, i3, (Boolean) obj3, (Boolean) obj2, (Summary) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, SeparatorRow value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        SeparatorRow.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
