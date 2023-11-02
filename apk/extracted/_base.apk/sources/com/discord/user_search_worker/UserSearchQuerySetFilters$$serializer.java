package com.discord.user_search_worker;

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
import p045cj.C2590h;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/user_search_worker/UserSearchQuerySetFilters.$serializer", "Lcj/f0;", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchQuerySetFilters$$serializer implements InterfaceC2582f0<UserSearchQuerySetFilters> {
    public static final UserSearchQuerySetFilters$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSearchQuerySetFilters$$serializer userSearchQuerySetFilters$$serializer = new UserSearchQuerySetFilters$$serializer();
        INSTANCE = userSearchQuerySetFilters$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetFilters", userSearchQuerySetFilters$$serializer, 3);
        pluginGeneratedSerialDescriptor.m12856l("guild", true);
        pluginGeneratedSerialDescriptor.m12856l("friends", true);
        pluginGeneratedSerialDescriptor.m12856l("strict", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSearchQuerySetFilters$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{C0213a.m40920u(C2560a2.f7013a), C0213a.m40920u(c2590h), C0213a.m40920u(c2590h)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSearchQuerySetFilters deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        Object obj4 = null;
        if (mo12920b.mo12865p()) {
            obj3 = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, null);
            C2590h c2590h = C2590h.f7055a;
            obj = mo12920b.mo12867n(descriptor2, 1, c2590h, null);
            obj2 = mo12920b.mo12867n(descriptor2, 2, c2590h, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj4 = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, obj4);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    obj5 = mo12920b.mo12867n(descriptor2, 1, C2590h.f7055a, obj5);
                    i2 |= 2;
                } else if (mo12866o != 2) {
                    throw new C14289n(mo12866o);
                } else {
                    obj6 = mo12920b.mo12867n(descriptor2, 2, C2590h.f7055a, obj6);
                    i2 |= 4;
                }
            }
            obj = obj5;
            obj2 = obj6;
            Object obj7 = obj4;
            i = i2;
            obj3 = obj7;
        }
        mo12920b.mo12872c(descriptor2);
        return new UserSearchQuerySetFilters(i, (String) obj3, (Boolean) obj, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, UserSearchQuerySetFilters value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        UserSearchQuerySetFilters.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
