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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolved.Invalid.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GiftEmbed$Resolved$Invalid$$serializer implements InterfaceC2582f0<GiftEmbed.Resolved.Invalid> {
    public static final GiftEmbed$Resolved$Invalid$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolved$Invalid$$serializer giftEmbed$Resolved$Invalid$$serializer = new GiftEmbed$Resolved$Invalid$$serializer();
        INSTANCE = giftEmbed$Resolved$Invalid$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid", giftEmbed$Resolved$Invalid$$serializer, 10);
        pluginGeneratedSerialDescriptor.m12856l("headerText", false);
        pluginGeneratedSerialDescriptor.m12856l("headerColor", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.m12856l("thumbnailUrl", false);
        pluginGeneratedSerialDescriptor.m12856l("titleText", false);
        pluginGeneratedSerialDescriptor.m12856l("titleColor", false);
        pluginGeneratedSerialDescriptor.m12856l("subtitle", false);
        pluginGeneratedSerialDescriptor.m12856l("subtitleColor", false);
        pluginGeneratedSerialDescriptor.m12856l("thumbnailBackgroundColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolved$Invalid$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{c2560a2, c2615m0, c2615m0, c2615m0, c2560a2, c2560a2, c2615m0, c2560a2, c2615m0, c2615m0};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GiftEmbed.Resolved.Invalid deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        String str3;
        String str4;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i8 = 0;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 2);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 3);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 4);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 5);
            int mo12870i4 = mo12920b.mo12870i(descriptor2, 6);
            String mo12868m4 = mo12920b.mo12868m(descriptor2, 7);
            int mo12870i5 = mo12920b.mo12870i(descriptor2, 8);
            str4 = mo12868m;
            i2 = mo12920b.mo12870i(descriptor2, 9);
            str3 = mo12868m4;
            i6 = mo12870i4;
            str2 = mo12868m3;
            i = mo12870i3;
            i3 = mo12870i5;
            str = mo12868m2;
            i5 = mo12870i2;
            i7 = mo12870i;
            i4 = 1023;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i9 = 0;
            int i10 = 0;
            i = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i8 |= 1;
                        str5 = mo12920b.mo12868m(descriptor2, 0);
                        continue;
                    case 1:
                        i13 = mo12920b.mo12870i(descriptor2, 1);
                        i8 |= 2;
                        continue;
                    case 2:
                        i12 = mo12920b.mo12870i(descriptor2, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        i = mo12920b.mo12870i(descriptor2, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        str8 = mo12920b.mo12868m(descriptor2, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        str7 = mo12920b.mo12868m(descriptor2, 5);
                        i8 |= 32;
                        break;
                    case 6:
                        i10 = mo12920b.mo12870i(descriptor2, 6);
                        i8 |= 64;
                        break;
                    case 7:
                        str6 = mo12920b.mo12868m(descriptor2, 7);
                        i8 |= 128;
                        break;
                    case 8:
                        i11 = mo12920b.mo12870i(descriptor2, 8);
                        i8 |= 256;
                        break;
                    case 9:
                        i9 = mo12920b.mo12870i(descriptor2, 9);
                        i8 |= 512;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i2 = i9;
            i3 = i11;
            str = str8;
            i4 = i8;
            str2 = str7;
            i5 = i12;
            i6 = i10;
            i7 = i13;
            str3 = str6;
            str4 = str5;
        }
        mo12920b.mo12872c(descriptor2);
        return new GiftEmbed.Resolved.Invalid(i4, str4, i7, i5, i, str, str2, i6, str3, i3, i2, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, GiftEmbed.Resolved.Invalid value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        GiftEmbed.Resolved.Invalid.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
