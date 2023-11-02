package com.discord.user_search_worker;

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
import p045cj.C2615m0;
import p045cj.C2634r0;
import p045cj.C2651x;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/user_search_worker/UserSearchQuerySetPayload.$serializer", "Lcj/f0;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchQuerySetPayload$$serializer implements InterfaceC2582f0<UserSearchQuerySetPayload> {
    public static final UserSearchQuerySetPayload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSearchQuerySetPayload$$serializer userSearchQuerySetPayload$$serializer = new UserSearchQuerySetPayload$$serializer();
        INSTANCE = userSearchQuerySetPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetPayload", userSearchQuerySetPayload$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("query", false);
        pluginGeneratedSerialDescriptor.m12856l("filters", true);
        pluginGeneratedSerialDescriptor.m12856l("blacklist", true);
        pluginGeneratedSerialDescriptor.m12856l("whitelist", true);
        pluginGeneratedSerialDescriptor.m12856l("boosters", false);
        pluginGeneratedSerialDescriptor.m12856l("limit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSearchQuerySetPayload$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, C0213a.m40920u(UserSearchQuerySetFilters$$serializer.INSTANCE), C0213a.m40920u(new C2581f(c2560a2)), C0213a.m40920u(new C2581f(c2560a2)), new C2634r0(c2560a2, C2651x.f7134a), C2615m0.f7088a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSearchQuerySetPayload deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        int i2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 5;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            obj = mo12920b.mo12867n(descriptor2, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj2 = mo12920b.mo12867n(descriptor2, 2, new C2581f(c2560a2), null);
            obj3 = mo12920b.mo12867n(descriptor2, 3, new C2581f(c2560a2), null);
            obj4 = mo12920b.mo12862y(descriptor2, 4, new C2634r0(c2560a2, C2651x.f7134a), null);
            str = mo12868m;
            i = mo12920b.mo12870i(descriptor2, 5);
            i2 = 63;
        } else {
            boolean z = true;
            int i4 = 0;
            String str2 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i5 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        str2 = mo12920b.mo12868m(descriptor2, 0);
                        i5 |= 1;
                        i3 = 5;
                    case 1:
                        obj5 = mo12920b.mo12867n(descriptor2, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, obj5);
                        i5 |= 2;
                        i3 = 5;
                    case 2:
                        obj6 = mo12920b.mo12867n(descriptor2, 2, new C2581f(C2560a2.f7013a), obj6);
                        i5 |= 4;
                        i3 = 5;
                    case 3:
                        obj7 = mo12920b.mo12867n(descriptor2, 3, new C2581f(C2560a2.f7013a), obj7);
                        i5 |= 8;
                        i3 = 5;
                    case 4:
                        obj8 = mo12920b.mo12862y(descriptor2, 4, new C2634r0(C2560a2.f7013a, C2651x.f7134a), obj8);
                        i5 |= 16;
                        i3 = 5;
                    case 5:
                        i4 = mo12920b.mo12870i(descriptor2, i3);
                        i5 |= 32;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i4;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            str = str2;
            i2 = i5;
        }
        mo12920b.mo12872c(descriptor2);
        return new UserSearchQuerySetPayload(i2, str, (UserSearchQuerySetFilters) obj, (List) obj2, (List) obj3, (Map) obj4, i, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, UserSearchQuerySetPayload value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        UserSearchQuerySetPayload.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
