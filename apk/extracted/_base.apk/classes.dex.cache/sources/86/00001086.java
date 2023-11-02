package com.discord.chat.bridge.policynotice;

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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SafetyPolicyNoticeEmbed$$serializer implements InterfaceC2582f0<SafetyPolicyNoticeEmbed> {
    public static final SafetyPolicyNoticeEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SafetyPolicyNoticeEmbed$$serializer safetyPolicyNoticeEmbed$$serializer = new SafetyPolicyNoticeEmbed$$serializer();
        INSTANCE = safetyPolicyNoticeEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed", safetyPolicyNoticeEmbed$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("classificationId", false);
        pluginGeneratedSerialDescriptor.m12856l("titleText", false);
        pluginGeneratedSerialDescriptor.m12856l("titleIcon", false);
        pluginGeneratedSerialDescriptor.m12856l("subtitleText", false);
        pluginGeneratedSerialDescriptor.m12856l("descriptionText", false);
        pluginGeneratedSerialDescriptor.m12856l("ctaText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SafetyPolicyNoticeEmbed$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, c2560a2, c2560a2, c2560a2, c2560a2, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SafetyPolicyNoticeEmbed deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 2);
            String mo12868m4 = mo12920b.mo12868m(descriptor2, 3);
            String mo12868m5 = mo12920b.mo12868m(descriptor2, 4);
            str3 = mo12868m;
            str = mo12920b.mo12868m(descriptor2, 5);
            str4 = mo12868m4;
            str2 = mo12868m5;
            str5 = mo12868m3;
            str6 = mo12868m2;
            i = 63;
        } else {
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str7 = mo12920b.mo12868m(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str12 = mo12920b.mo12868m(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str11 = mo12920b.mo12868m(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str9 = mo12920b.mo12868m(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str10 = mo12920b.mo12868m(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str8 = mo12920b.mo12868m(descriptor2, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            str = str8;
            str2 = str10;
            str3 = str7;
            int i3 = i2;
            str4 = str9;
            i = i3;
            String str13 = str12;
            str5 = str11;
            str6 = str13;
        }
        mo12920b.mo12872c(descriptor2);
        return new SafetyPolicyNoticeEmbed(i, str3, str6, str5, str4, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, SafetyPolicyNoticeEmbed value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        SafetyPolicyNoticeEmbed.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}