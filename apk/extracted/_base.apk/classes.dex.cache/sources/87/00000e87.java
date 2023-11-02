package com.discord.bundle_updater;

import java.util.List;
import java.util.Map;
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
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.C2634r0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/bundle_updater/BuildOverrideCookieMeta.$serializer", "Lcj/f0;", "Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BuildOverrideCookieMeta$$serializer implements InterfaceC2582f0<BuildOverrideCookieMeta> {
    public static final BuildOverrideCookieMeta$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuildOverrideCookieMeta$$serializer buildOverrideCookieMeta$$serializer = new BuildOverrideCookieMeta$$serializer();
        INSTANCE = buildOverrideCookieMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.BuildOverrideCookieMeta", buildOverrideCookieMeta$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("expiresAt", true);
        pluginGeneratedSerialDescriptor.m12856l("releaseChannel", true);
        pluginGeneratedSerialDescriptor.m12856l("validForUserIds", true);
        pluginGeneratedSerialDescriptor.m12856l("allowedVersions", true);
        pluginGeneratedSerialDescriptor.m12856l("allowLoggedOut", true);
        pluginGeneratedSerialDescriptor.m12856l("experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BuildOverrideCookieMeta$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(new C2581f(c2560a2)), C0213a.m40920u(new C2581f(c2560a2)), C0213a.m40920u(C2590h.f7055a), C0213a.m40920u(new C2634r0(c2560a2, C2615m0.f7088a))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BuildOverrideCookieMeta deserialize(Decoder decoder) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 5;
        char c = 2;
        boolean z = true;
        Object obj7 = null;
        if (mo12920b.mo12865p()) {
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj2 = mo12920b.mo12867n(descriptor2, 0, c2560a2, null);
            obj3 = mo12920b.mo12867n(descriptor2, 1, c2560a2, null);
            obj4 = mo12920b.mo12867n(descriptor2, 2, new C2581f(c2560a2), null);
            Object mo12867n = mo12920b.mo12867n(descriptor2, 3, new C2581f(c2560a2), null);
            obj5 = mo12920b.mo12867n(descriptor2, 4, C2590h.f7055a, null);
            obj6 = mo12920b.mo12867n(descriptor2, 5, new C2634r0(c2560a2, C2615m0.f7088a), null);
            obj = mo12867n;
            i = 63;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Object obj8 = null;
            Object obj9 = null;
            obj = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i2 = 5;
                    case 0:
                        obj7 = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, obj7);
                        i3 |= 1;
                        c = c;
                        z = z;
                        i2 = 5;
                    case 1:
                        obj8 = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, obj8);
                        i3 |= 2;
                        c = c;
                        z = true;
                    case 2:
                        obj9 = mo12920b.mo12867n(descriptor2, 2, new C2581f(C2560a2.f7013a), obj9);
                        i3 |= 4;
                        c = 2;
                        z = true;
                    case 3:
                        obj = mo12920b.mo12867n(descriptor2, 3, new C2581f(C2560a2.f7013a), obj);
                        i3 |= 8;
                        c = 2;
                        z = true;
                    case 4:
                        obj10 = mo12920b.mo12867n(descriptor2, 4, C2590h.f7055a, obj10);
                        i3 |= 16;
                        c = 2;
                        z = true;
                    case 5:
                        obj11 = mo12920b.mo12867n(descriptor2, i2, new C2634r0(C2560a2.f7013a, C2615m0.f7088a), obj11);
                        i3 |= 32;
                        c = 2;
                        z = true;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i3;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
        }
        mo12920b.mo12872c(descriptor2);
        return new BuildOverrideCookieMeta(i, (String) obj2, (String) obj3, (List) obj4, (List) obj, (Boolean) obj5, (Map) obj6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, BuildOverrideCookieMeta value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        BuildOverrideCookieMeta.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}