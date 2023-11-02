package com.discord.mobile_voice_overlay;

import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser.$serializer", "Lcj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlayDataUser$$serializer implements InterfaceC2582f0<MobileVoiceOverlayDataUser> {
    public static final MobileVoiceOverlayDataUser$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayDataUser$$serializer mobileVoiceOverlayDataUser$$serializer = new MobileVoiceOverlayDataUser$$serializer();
        INSTANCE = mobileVoiceOverlayDataUser$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser", mobileVoiceOverlayDataUser$$serializer, 4);
        pluginGeneratedSerialDescriptor.m12856l("userId", false);
        pluginGeneratedSerialDescriptor.m12856l("avatar", false);
        pluginGeneratedSerialDescriptor.m12856l("speaking", false);
        pluginGeneratedSerialDescriptor.m12856l("discriminator", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayDataUser$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{UserId$$serializer.INSTANCE, C0213a.m40920u(C2560a2.f7013a), C2590h.f7055a, C2615m0.f7088a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlayDataUser deserialize(Decoder decoder) {
        boolean z;
        int i;
        Object obj;
        int i2;
        Object obj2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            obj2 = mo12920b.mo12862y(descriptor2, 0, UserId$$serializer.INSTANCE, null);
            obj = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 2);
            i2 = mo12920b.mo12870i(descriptor2, 3);
            z = mo12876C;
            i = 15;
        } else {
            boolean z2 = true;
            int i3 = 0;
            int i4 = 0;
            Object obj3 = null;
            Object obj4 = null;
            z = false;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z2 = false;
                } else if (mo12866o == 0) {
                    obj3 = mo12920b.mo12862y(descriptor2, 0, UserId$$serializer.INSTANCE, obj3);
                    i4 |= 1;
                } else if (mo12866o == 1) {
                    obj4 = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, obj4);
                    i4 |= 2;
                } else if (mo12866o == 2) {
                    z = mo12920b.mo12876C(descriptor2, 2);
                    i4 |= 4;
                } else if (mo12866o != 3) {
                    throw new C14289n(mo12866o);
                } else {
                    i3 = mo12920b.mo12870i(descriptor2, 3);
                    i4 |= 8;
                }
            }
            i = i4;
            obj = obj4;
            i2 = i3;
            obj2 = obj3;
        }
        mo12920b.mo12872c(descriptor2);
        return new MobileVoiceOverlayDataUser(i, (UserId) obj2, (String) obj, z, i2, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MobileVoiceOverlayDataUser value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MobileVoiceOverlayDataUser.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}