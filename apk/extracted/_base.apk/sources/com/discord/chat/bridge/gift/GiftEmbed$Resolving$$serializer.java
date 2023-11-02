package com.discord.chat.bridge.gift;

import com.discord.chat.bridge.gift.GiftEmbed;
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
import p045cj.C2560a2;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolving.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GiftEmbed$Resolving$$serializer implements InterfaceC2582f0<GiftEmbed.Resolving> {
    public static final GiftEmbed$Resolving$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolving$$serializer giftEmbed$Resolving$$serializer = new GiftEmbed$Resolving$$serializer();
        INSTANCE = giftEmbed$Resolving$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolving", giftEmbed$Resolving$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("headerText", false);
        pluginGeneratedSerialDescriptor.m12856l("headerColor", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.m12856l("resolvingGradientStart", false);
        pluginGeneratedSerialDescriptor.m12856l("resolvingGradientEnd", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolving$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{C2560a2.f7013a, c2615m0, c2615m0, c2615m0, c2615m0, c2615m0};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GiftEmbed.Resolving deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 2);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 3);
            int mo12870i4 = mo12920b.mo12870i(descriptor2, 4);
            str = mo12868m;
            i = mo12920b.mo12870i(descriptor2, 5);
            i3 = mo12870i3;
            i2 = mo12870i4;
            i5 = mo12870i2;
            i6 = mo12870i;
            i4 = 63;
        } else {
            String str2 = null;
            boolean z = true;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str2 = mo12920b.mo12868m(descriptor2, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        i11 = mo12920b.mo12870i(descriptor2, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        i10 = mo12920b.mo12870i(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        i8 = mo12920b.mo12870i(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        i9 = mo12920b.mo12870i(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        i7 = mo12920b.mo12870i(descriptor2, 5);
                        i12 |= 32;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i7;
            i2 = i9;
            str = str2;
            int i13 = i12;
            i3 = i8;
            i4 = i13;
            int i14 = i11;
            i5 = i10;
            i6 = i14;
        }
        mo12920b.mo12872c(descriptor2);
        return new GiftEmbed.Resolving(i4, str, i6, i5, i3, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, GiftEmbed.Resolving value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        GiftEmbed.Resolving.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
