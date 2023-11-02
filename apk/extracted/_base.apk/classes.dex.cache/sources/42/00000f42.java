package com.discord.chat.bridge.automod;

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
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/automod/AutoModerationContext.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AutoModerationContext$$serializer implements InterfaceC2582f0<AutoModerationContext> {
    public static final AutoModerationContext$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AutoModerationContext$$serializer autoModerationContext$$serializer = new AutoModerationContext$$serializer();
        INSTANCE = autoModerationContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.AutoModerationContext", autoModerationContext$$serializer, 9);
        pluginGeneratedSerialDescriptor.m12856l("headerText", false);
        pluginGeneratedSerialDescriptor.m12856l("headerBadgeText", false);
        pluginGeneratedSerialDescriptor.m12856l("ruleDisplayText", true);
        pluginGeneratedSerialDescriptor.m12856l("keywordDisplayText", true);
        pluginGeneratedSerialDescriptor.m12856l("actionsIconURL", true);
        pluginGeneratedSerialDescriptor.m12856l("actionsText", false);
        pluginGeneratedSerialDescriptor.m12856l("feedbackText", false);
        pluginGeneratedSerialDescriptor.m12856l("message", false);
        pluginGeneratedSerialDescriptor.m12856l("notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AutoModerationContext$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, c2560a2, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2560a2, c2560a2, FlaggedMessageEmbed$$serializer.INSTANCE, C0213a.m40920u(AutoModerationNotification$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AutoModerationContext deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        String str;
        int i;
        Object obj3;
        Object obj4;
        String str2;
        String str3;
        Object obj5;
        String str4;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 7;
        String str5 = null;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            str3 = mo12920b.mo12868m(descriptor2, 1);
            C2560a2 c2560a2 = C2560a2.f7013a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 2, c2560a2, null);
            obj5 = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            Object mo12867n2 = mo12920b.mo12867n(descriptor2, 4, c2560a2, null);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 5);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 6);
            obj4 = mo12920b.mo12862y(descriptor2, 7, FlaggedMessageEmbed$$serializer.INSTANCE, null);
            obj3 = mo12920b.mo12867n(descriptor2, 8, AutoModerationNotification$$serializer.INSTANCE, null);
            str4 = mo12868m3;
            str = mo12868m2;
            obj2 = mo12867n;
            str2 = mo12868m;
            obj = mo12867n2;
            i = 511;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj6 = null;
            Object obj7 = null;
            obj = null;
            String str6 = null;
            obj2 = null;
            Object obj8 = null;
            str = null;
            String str7 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        str5 = mo12920b.mo12868m(descriptor2, 0);
                        i2 = 7;
                        break;
                    case 1:
                        str6 = mo12920b.mo12868m(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        obj2 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj2);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        obj8 = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj8);
                        i3 |= 8;
                        i2 = 7;
                        continue;
                    case 4:
                        obj = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj);
                        i3 |= 16;
                        break;
                    case 5:
                        str = mo12920b.mo12868m(descriptor2, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        str7 = mo12920b.mo12868m(descriptor2, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        obj7 = mo12920b.mo12862y(descriptor2, i2, FlaggedMessageEmbed$$serializer.INSTANCE, obj7);
                        i3 |= 128;
                        break;
                    case 8:
                        obj6 = mo12920b.mo12867n(descriptor2, 8, AutoModerationNotification$$serializer.INSTANCE, obj6);
                        i3 |= 256;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i3;
            obj3 = obj6;
            obj4 = obj7;
            str2 = str5;
            str3 = str6;
            obj5 = obj8;
            str4 = str7;
        }
        mo12920b.mo12872c(descriptor2);
        return new AutoModerationContext(i, str2, str3, (String) obj2, (String) obj5, (String) obj, str, str4, (FlaggedMessageEmbed) obj4, (AutoModerationNotification) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, AutoModerationContext value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        AutoModerationContext.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}