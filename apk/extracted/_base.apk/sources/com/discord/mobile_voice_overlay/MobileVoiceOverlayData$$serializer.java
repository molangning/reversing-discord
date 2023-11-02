package com.discord.mobile_voice_overlay;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayData.$serializer", "Lcj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlayData$$serializer implements InterfaceC2582f0<MobileVoiceOverlayData> {
    public static final MobileVoiceOverlayData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayData$$serializer mobileVoiceOverlayData$$serializer = new MobileVoiceOverlayData$$serializer();
        INSTANCE = mobileVoiceOverlayData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayData", mobileVoiceOverlayData$$serializer, 11);
        pluginGeneratedSerialDescriptor.m12856l("users", false);
        pluginGeneratedSerialDescriptor.m12856l("extraUsers", false);
        pluginGeneratedSerialDescriptor.m12856l("guildId", false);
        pluginGeneratedSerialDescriptor.m12856l("channelId", false);
        pluginGeneratedSerialDescriptor.m12856l("channelName", false);
        pluginGeneratedSerialDescriptor.m12856l("guildName", false);
        pluginGeneratedSerialDescriptor.m12856l("deafened", false);
        pluginGeneratedSerialDescriptor.m12856l("muted", false);
        pluginGeneratedSerialDescriptor.m12856l("connectionQuality", false);
        pluginGeneratedSerialDescriptor.m12856l("canGenerateInvite", false);
        pluginGeneratedSerialDescriptor.m12856l("channelSelectorResults", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayData$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{new C2581f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), C2615m0.f7088a, C0213a.m40920u(GuildId$$serializer.INSTANCE), ChannelId$$serializer.INSTANCE, c2560a2, c2560a2, c2590h, c2590h, ConnectionQuality.Companion.serializer(), c2590h, new C2581f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlayData deserialize(Decoder decoder) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String str2;
        boolean z3;
        Object obj5;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 0;
        if (mo12920b.mo12865p()) {
            obj5 = mo12920b.mo12862y(descriptor2, 0, new C2581f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            obj4 = mo12920b.mo12867n(descriptor2, 2, GuildId$$serializer.INSTANCE, null);
            obj3 = mo12920b.mo12862y(descriptor2, 3, ChannelId$$serializer.INSTANCE, null);
            str2 = mo12920b.mo12868m(descriptor2, 4);
            String mo12868m = mo12920b.mo12868m(descriptor2, 5);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 6);
            boolean mo12876C2 = mo12920b.mo12876C(descriptor2, 7);
            obj = mo12920b.mo12862y(descriptor2, 8, ConnectionQuality.Companion.serializer(), null);
            boolean mo12876C3 = mo12920b.mo12876C(descriptor2, 9);
            obj2 = mo12920b.mo12862y(descriptor2, 10, new C2581f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), null);
            z3 = mo12876C3;
            str = mo12868m;
            i2 = mo12870i;
            z2 = mo12876C;
            z = mo12876C2;
            i = 2047;
        } else {
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            int i8 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            String str3 = null;
            str = null;
            boolean z7 = false;
            while (z4) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z4 = false;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 0:
                        obj10 = mo12920b.mo12862y(descriptor2, 0, new C2581f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), obj10);
                        i7 |= 1;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 1:
                        i8 = mo12920b.mo12870i(descriptor2, 1);
                        i7 |= 2;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        obj9 = mo12920b.mo12867n(descriptor2, 2, GuildId$$serializer.INSTANCE, obj9);
                        i7 |= 4;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        obj8 = mo12920b.mo12862y(descriptor2, 3, ChannelId$$serializer.INSTANCE, obj8);
                        i7 |= 8;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        str3 = mo12920b.mo12868m(descriptor2, 4);
                        i7 |= 16;
                        i3 = 10;
                        break;
                    case 5:
                        str = mo12920b.mo12868m(descriptor2, 5);
                        i7 |= 32;
                        break;
                    case 6:
                        z6 = mo12920b.mo12876C(descriptor2, i6);
                        i7 |= 64;
                        break;
                    case 7:
                        z7 = mo12920b.mo12876C(descriptor2, i5);
                        i7 |= 128;
                        i6 = 6;
                        break;
                    case 8:
                        obj6 = mo12920b.mo12862y(descriptor2, 8, ConnectionQuality.Companion.serializer(), obj6);
                        i7 |= 256;
                        i6 = 6;
                        break;
                    case 9:
                        z5 = mo12920b.mo12876C(descriptor2, i4);
                        i7 |= 512;
                        i6 = 6;
                        break;
                    case 10:
                        obj7 = mo12920b.mo12862y(descriptor2, i3, new C2581f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), obj7);
                        i7 |= 1024;
                        i6 = 6;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            i = i7;
            z = z7;
            z2 = z6;
            i2 = i8;
            str2 = str3;
            z3 = z5;
            obj5 = obj10;
        }
        mo12920b.mo12872c(descriptor2);
        return new MobileVoiceOverlayData(i, (List) obj5, i2, (GuildId) obj4, (ChannelId) obj3, str2, str, z2, z, (ConnectionQuality) obj, z3, (List) obj2, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MobileVoiceOverlayData value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MobileVoiceOverlayData.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
