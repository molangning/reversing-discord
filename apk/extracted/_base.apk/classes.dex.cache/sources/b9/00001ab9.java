package com.discord.mobile_voice_overlay;

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
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayAssets.$serializer", "Lcj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlayAssets$$serializer implements InterfaceC2582f0<MobileVoiceOverlayAssets> {
    public static final MobileVoiceOverlayAssets$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayAssets$$serializer mobileVoiceOverlayAssets$$serializer = new MobileVoiceOverlayAssets$$serializer();
        INSTANCE = mobileVoiceOverlayAssets$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets", mobileVoiceOverlayAssets$$serializer, 11);
        pluginGeneratedSerialDescriptor.m12856l("useSpeaker", false);
        pluginGeneratedSerialDescriptor.m12856l("mute", false);
        pluginGeneratedSerialDescriptor.m12856l("disconnectFromVoice", false);
        pluginGeneratedSerialDescriptor.m12856l("getInvite", false);
        pluginGeneratedSerialDescriptor.m12856l("switchChannels", false);
        pluginGeneratedSerialDescriptor.m12856l("openDiscord", false);
        pluginGeneratedSerialDescriptor.m12856l("inviteLinkCopied", false);
        pluginGeneratedSerialDescriptor.m12856l("channelSelect", false);
        pluginGeneratedSerialDescriptor.m12856l("closeWindow", false);
        pluginGeneratedSerialDescriptor.m12856l("searchChannels", false);
        pluginGeneratedSerialDescriptor.m12856l("noResults", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayAssets$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlayAssets deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 0;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 2);
            String mo12868m4 = mo12920b.mo12868m(descriptor2, 3);
            String mo12868m5 = mo12920b.mo12868m(descriptor2, 4);
            String mo12868m6 = mo12920b.mo12868m(descriptor2, 5);
            String mo12868m7 = mo12920b.mo12868m(descriptor2, 6);
            String mo12868m8 = mo12920b.mo12868m(descriptor2, 7);
            String mo12868m9 = mo12920b.mo12868m(descriptor2, 8);
            String mo12868m10 = mo12920b.mo12868m(descriptor2, 9);
            str3 = mo12868m;
            str = mo12920b.mo12868m(descriptor2, 10);
            str2 = mo12868m10;
            str4 = mo12868m8;
            str10 = mo12868m7;
            str7 = mo12868m6;
            str8 = mo12868m4;
            str6 = mo12868m9;
            str9 = mo12868m5;
            str11 = mo12868m3;
            str5 = mo12868m2;
            i = 2047;
        } else {
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            boolean z = true;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i2 |= 1;
                        str12 = mo12920b.mo12868m(descriptor2, 0);
                        continue;
                    case 1:
                        str22 = mo12920b.mo12868m(descriptor2, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        str21 = mo12920b.mo12868m(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str18 = mo12920b.mo12868m(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str20 = mo12920b.mo12868m(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str17 = mo12920b.mo12868m(descriptor2, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        str16 = mo12920b.mo12868m(descriptor2, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        str15 = mo12920b.mo12868m(descriptor2, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        str19 = mo12920b.mo12868m(descriptor2, 8);
                        i2 |= 256;
                        break;
                    case 9:
                        str14 = mo12920b.mo12868m(descriptor2, 9);
                        i2 |= 512;
                        break;
                    case 10:
                        str13 = mo12920b.mo12868m(descriptor2, 10);
                        i2 |= 1024;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            str = str13;
            str2 = str14;
            str3 = str12;
            i = i2;
            String str23 = str21;
            str4 = str15;
            str5 = str22;
            str6 = str19;
            str7 = str17;
            str8 = str18;
            str9 = str20;
            str10 = str16;
            str11 = str23;
        }
        mo12920b.mo12872c(descriptor2);
        return new MobileVoiceOverlayAssets(i, str3, str5, str11, str8, str9, str7, str10, str4, str6, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MobileVoiceOverlayAssets value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MobileVoiceOverlayAssets.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}