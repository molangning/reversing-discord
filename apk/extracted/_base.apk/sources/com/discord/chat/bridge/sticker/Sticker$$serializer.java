package com.discord.chat.bridge.sticker;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.sticker.StickerFormatType;
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
import p045cj.C2649w0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/sticker/Sticker.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/sticker/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class Sticker$$serializer implements InterfaceC2582f0<Sticker> {
    public static final Sticker$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.sticker.Sticker", sticker$$serializer, 8);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l("format_type", false);
        pluginGeneratedSerialDescriptor.m12856l(ZeroconfModule.KEY_SERVICE_NAME, false);
        pluginGeneratedSerialDescriptor.m12856l("asset", false);
        pluginGeneratedSerialDescriptor.m12856l("url", false);
        pluginGeneratedSerialDescriptor.m12856l("width", true);
        pluginGeneratedSerialDescriptor.m12856l("height", true);
        pluginGeneratedSerialDescriptor.m12856l("renderMode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sticker$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{C2649w0.f7129a, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, c2560a2, c2560a2, c2560a2, C0213a.m40920u(c2615m0), C0213a.m40920u(c2615m0), c2615m0};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Sticker deserialize(Decoder decoder) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        int i;
        String str3;
        long j;
        int i2;
        Object obj3;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 7;
        int i4 = 6;
        if (mo12920b.mo12865p()) {
            long mo12871f = mo12920b.mo12871f(descriptor2, 0);
            obj3 = mo12920b.mo12862y(descriptor2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, null);
            str3 = mo12920b.mo12868m(descriptor2, 2);
            String mo12868m = mo12920b.mo12868m(descriptor2, 3);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 4);
            C2615m0 c2615m0 = C2615m0.f7088a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 5, c2615m0, null);
            Object mo12867n2 = mo12920b.mo12867n(descriptor2, 6, c2615m0, null);
            obj2 = mo12867n;
            str = mo12868m;
            str2 = mo12868m2;
            j = mo12871f;
            i2 = mo12920b.mo12870i(descriptor2, 7);
            obj = mo12867n2;
            i = 255;
        } else {
            boolean z = true;
            int i5 = 0;
            obj = null;
            str = null;
            str2 = null;
            long j2 = 0;
            Object obj4 = null;
            String str4 = null;
            obj2 = null;
            int i6 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        j2 = mo12920b.mo12871f(descriptor2, 0);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        obj4 = mo12920b.mo12862y(descriptor2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, obj4);
                        i6 |= 2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        str4 = mo12920b.mo12868m(descriptor2, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        str = mo12920b.mo12868m(descriptor2, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        str2 = mo12920b.mo12868m(descriptor2, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        obj2 = mo12920b.mo12867n(descriptor2, 5, C2615m0.f7088a, obj2);
                        i6 |= 32;
                        break;
                    case 6:
                        obj = mo12920b.mo12867n(descriptor2, i4, C2615m0.f7088a, obj);
                        i6 |= 64;
                        break;
                    case 7:
                        i5 = mo12920b.mo12870i(descriptor2, i3);
                        i6 |= 128;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i6;
            str3 = str4;
            j = j2;
            i2 = i5;
            obj3 = obj4;
        }
        mo12920b.mo12872c(descriptor2);
        return new Sticker(i, j, (StickerFormatType) obj3, str3, str, str2, (Integer) obj2, (Integer) obj, i2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, Sticker value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        Sticker.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
