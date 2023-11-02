package com.discord.chat.bridge.embed;

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
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/embed/EmbedThumbnail.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedThumbnail$$serializer implements InterfaceC2582f0<EmbedThumbnail> {
    public static final EmbedThumbnail$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbedThumbnail$$serializer embedThumbnail$$serializer = new EmbedThumbnail$$serializer();
        INSTANCE = embedThumbnail$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedThumbnail", embedThumbnail$$serializer, 8);
        pluginGeneratedSerialDescriptor.m12856l("url", false);
        pluginGeneratedSerialDescriptor.m12856l("proxyURL", true);
        pluginGeneratedSerialDescriptor.m12856l("videoUrl", true);
        pluginGeneratedSerialDescriptor.m12856l("height", false);
        pluginGeneratedSerialDescriptor.m12856l("width", false);
        pluginGeneratedSerialDescriptor.m12856l("gifv", true);
        pluginGeneratedSerialDescriptor.m12856l("showPlayButton", true);
        pluginGeneratedSerialDescriptor.m12856l("embedUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbedThumbnail$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{c2560a2, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2615m0, c2615m0, C0213a.m40920u(c2590h), C0213a.m40920u(c2590h), c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbedThumbnail deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        String str;
        int i2;
        int i3;
        String str2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i4 = 7;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj3 = mo12920b.mo12867n(descriptor2, 1, c2560a2, null);
            obj4 = mo12920b.mo12867n(descriptor2, 2, c2560a2, null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 3);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 4);
            C2590h c2590h = C2590h.f7055a;
            obj2 = mo12920b.mo12867n(descriptor2, 5, c2590h, null);
            obj = mo12920b.mo12867n(descriptor2, 6, c2590h, null);
            i = 255;
            str2 = mo12868m;
            str = mo12920b.mo12868m(descriptor2, 7);
            i2 = mo12870i;
            i3 = mo12870i2;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            Object obj5 = null;
            String str3 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            Object obj8 = null;
            int i7 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str3 = mo12920b.mo12868m(descriptor2, 0);
                        i6 |= 1;
                        i4 = 7;
                        break;
                    case 1:
                        obj6 = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, obj6);
                        i6 |= 2;
                        i4 = 7;
                        break;
                    case 2:
                        obj7 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj7);
                        i6 |= 4;
                        i4 = 7;
                        continue;
                    case 3:
                        i5 = mo12920b.mo12870i(descriptor2, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        i7 = mo12920b.mo12870i(descriptor2, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        obj8 = mo12920b.mo12867n(descriptor2, 5, C2590h.f7055a, obj8);
                        i6 |= 32;
                        break;
                    case 6:
                        obj5 = mo12920b.mo12867n(descriptor2, 6, C2590h.f7055a, obj5);
                        i6 |= 64;
                        break;
                    case 7:
                        str4 = mo12920b.mo12868m(descriptor2, i4);
                        i6 |= 128;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj5;
            obj2 = obj8;
            i = i6;
            obj3 = obj6;
            obj4 = obj7;
            str = str4;
            i2 = i5;
            i3 = i7;
            str2 = str3;
        }
        mo12920b.mo12872c(descriptor2);
        return new EmbedThumbnail(i, str2, (String) obj3, (String) obj4, i2, i3, (Boolean) obj2, (Boolean) obj, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, EmbedThumbnail value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        EmbedThumbnail.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}