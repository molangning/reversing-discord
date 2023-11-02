package com.discord.notifications.api;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.notifications.api.StickerFormatType;
import com.discord.notifications.api.StickerType;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.StickerId;
import com.discord.primitives.StickerId$$serializer;
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
import p045cj.C2590h;
import p045cj.C2649w0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/notifications/api/Sticker.$serializer", "Lcj/f0;", "Lcom/discord/notifications/api/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Sticker$$serializer implements InterfaceC2582f0<Sticker> {
    public static final Sticker$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.Sticker", sticker$$serializer, 9);
        pluginGeneratedSerialDescriptor.m12856l("id", true);
        pluginGeneratedSerialDescriptor.m12856l(ZeroconfModule.KEY_SERVICE_NAME, false);
        pluginGeneratedSerialDescriptor.m12856l("pack_id", true);
        pluginGeneratedSerialDescriptor.m12856l("guild_id", true);
        pluginGeneratedSerialDescriptor.m12856l("description", true);
        pluginGeneratedSerialDescriptor.m12856l("format_type", true);
        pluginGeneratedSerialDescriptor.m12856l("tags", true);
        pluginGeneratedSerialDescriptor.m12856l("type", true);
        pluginGeneratedSerialDescriptor.m12856l("available", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sticker$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{StickerId$$serializer.INSTANCE, c2560a2, C0213a.m40920u(C2649w0.f7129a), C0213a.m40920u(GuildId$$serializer.INSTANCE), c2560a2, StickerFormatType.Serializer.INSTANCE, c2560a2, StickerType.Serializer.INSTANCE, C0213a.m40920u(C2590h.f7055a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Sticker deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        String str2;
        String str3;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        Object obj7 = null;
        if (mo12920b.mo12865p()) {
            obj5 = mo12920b.mo12862y(descriptor2, 0, StickerId$$serializer.INSTANCE, null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 1);
            Object mo12867n = mo12920b.mo12867n(descriptor2, 2, C2649w0.f7129a, null);
            obj6 = mo12920b.mo12867n(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 4);
            Object mo12862y = mo12920b.mo12862y(descriptor2, 5, StickerFormatType.Serializer.INSTANCE, null);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 6);
            obj4 = mo12920b.mo12862y(descriptor2, 7, StickerType.Serializer.INSTANCE, null);
            str3 = mo12868m3;
            obj3 = mo12867n;
            obj = mo12920b.mo12867n(descriptor2, 8, C2590h.f7055a, null);
            str = mo12868m;
            str2 = mo12868m2;
            obj2 = mo12862y;
            i = 511;
        } else {
            boolean z = true;
            int i4 = 0;
            obj = null;
            Object obj8 = null;
            obj2 = null;
            String str4 = null;
            obj3 = null;
            Object obj9 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i3 = 6;
                        break;
                    case 0:
                        obj7 = mo12920b.mo12862y(descriptor2, 0, StickerId$$serializer.INSTANCE, obj7);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        str4 = mo12920b.mo12868m(descriptor2, 1);
                        i4 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        obj3 = mo12920b.mo12867n(descriptor2, 2, C2649w0.f7129a, obj3);
                        i4 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        obj9 = mo12920b.mo12867n(descriptor2, 3, GuildId$$serializer.INSTANCE, obj9);
                        i4 |= 8;
                        i2 = 7;
                        continue;
                    case 4:
                        str5 = mo12920b.mo12868m(descriptor2, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        obj2 = mo12920b.mo12862y(descriptor2, 5, StickerFormatType.Serializer.INSTANCE, obj2);
                        i4 |= 32;
                        break;
                    case 6:
                        str6 = mo12920b.mo12868m(descriptor2, i3);
                        i4 |= 64;
                        break;
                    case 7:
                        obj8 = mo12920b.mo12862y(descriptor2, i2, StickerType.Serializer.INSTANCE, obj8);
                        i4 |= 128;
                        break;
                    case 8:
                        obj = mo12920b.mo12867n(descriptor2, 8, C2590h.f7055a, obj);
                        i4 |= 256;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i4;
            obj4 = obj8;
            obj5 = obj7;
            str = str4;
            obj6 = obj9;
            str2 = str5;
            str3 = str6;
        }
        mo12920b.mo12872c(descriptor2);
        return new Sticker(i, (StickerId) obj5, str, (Long) obj3, (GuildId) obj6, str2, (StickerFormatType) obj2, str3, (StickerType) obj4, (Boolean) obj, null, null);
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
