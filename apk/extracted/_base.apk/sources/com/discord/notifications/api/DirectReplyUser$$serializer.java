package com.discord.notifications.api;

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
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/notifications/api/DirectReplyUser.$serializer", "Lcj/f0;", "Lcom/discord/notifications/api/DirectReplyUser;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class DirectReplyUser$$serializer implements InterfaceC2582f0<DirectReplyUser> {
    public static final DirectReplyUser$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DirectReplyUser$$serializer directReplyUser$$serializer = new DirectReplyUser$$serializer();
        INSTANCE = directReplyUser$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyUser", directReplyUser$$serializer, 4);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l("username", true);
        pluginGeneratedSerialDescriptor.m12856l("discriminator", true);
        pluginGeneratedSerialDescriptor.m12856l("avatar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DirectReplyUser$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{UserId$$serializer.INSTANCE, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DirectReplyUser deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        Object obj5 = null;
        if (mo12920b.mo12865p()) {
            obj4 = mo12920b.mo12862y(descriptor2, 0, UserId$$serializer.INSTANCE, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj = mo12920b.mo12867n(descriptor2, 1, c2560a2, null);
            obj2 = mo12920b.mo12867n(descriptor2, 2, c2560a2, null);
            obj3 = mo12920b.mo12867n(descriptor2, 3, c2560a2, null);
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj5 = mo12920b.mo12862y(descriptor2, 0, UserId$$serializer.INSTANCE, obj5);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    obj6 = mo12920b.mo12867n(descriptor2, 1, C2560a2.f7013a, obj6);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    obj7 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj7);
                    i2 |= 4;
                } else if (mo12866o != 3) {
                    throw new C14289n(mo12866o);
                } else {
                    obj8 = mo12920b.mo12867n(descriptor2, 3, C2560a2.f7013a, obj8);
                    i2 |= 8;
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            Object obj9 = obj5;
            i = i2;
            obj4 = obj9;
        }
        mo12920b.mo12872c(descriptor2);
        return new DirectReplyUser(i, (UserId) obj4, (String) obj, (String) obj2, (String) obj3, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, DirectReplyUser value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        DirectReplyUser.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
