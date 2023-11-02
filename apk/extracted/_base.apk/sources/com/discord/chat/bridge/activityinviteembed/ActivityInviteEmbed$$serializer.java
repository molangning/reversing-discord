package com.discord.chat.bridge.activityinviteembed;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ActivityInviteEmbed$$serializer implements InterfaceC2582f0<ActivityInviteEmbed> {
    public static final ActivityInviteEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ActivityInviteEmbed$$serializer activityInviteEmbed$$serializer = new ActivityInviteEmbed$$serializer();
        INSTANCE = activityInviteEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed", activityInviteEmbed$$serializer, 10);
        pluginGeneratedSerialDescriptor.m12856l("coverImage", true);
        pluginGeneratedSerialDescriptor.m12856l("isListening", false);
        pluginGeneratedSerialDescriptor.m12856l("headerText", false);
        pluginGeneratedSerialDescriptor.m12856l("partyStatus", false);
        pluginGeneratedSerialDescriptor.m12856l("avatarsToRender", true);
        pluginGeneratedSerialDescriptor.m12856l("maxPartySize", false);
        pluginGeneratedSerialDescriptor.m12856l(ZeroconfModule.KEY_SERVICE_NAME, true);
        pluginGeneratedSerialDescriptor.m12856l("subtext", true);
        pluginGeneratedSerialDescriptor.m12856l("joinable", false);
        pluginGeneratedSerialDescriptor.m12856l("ctaText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityInviteEmbed$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{C0213a.m40920u(c2560a2), c2590h, c2560a2, c2560a2, C0213a.m40920u(new C2581f(C0213a.m40920u(c2560a2))), C2615m0.f7088a, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2590h, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ActivityInviteEmbed deserialize(Decoder decoder) {
        Object obj;
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        boolean z2;
        Object obj4;
        int i2;
        char c;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        if (mo12920b.mo12865p()) {
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj2 = mo12920b.mo12867n(descriptor2, 0, c2560a2, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 1);
            String mo12868m = mo12920b.mo12868m(descriptor2, 2);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 3);
            obj = mo12920b.mo12867n(descriptor2, 4, new C2581f(C0213a.m40920u(c2560a2)), null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 5);
            obj3 = mo12920b.mo12867n(descriptor2, 6, c2560a2, null);
            obj4 = mo12920b.mo12867n(descriptor2, 7, c2560a2, null);
            boolean mo12876C2 = mo12920b.mo12876C(descriptor2, 8);
            str3 = mo12920b.mo12868m(descriptor2, 9);
            z2 = mo12876C2;
            i = 1023;
            str2 = mo12868m2;
            str = mo12868m;
            i2 = mo12870i;
            z = mo12876C;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i6 = 0;
            boolean z5 = false;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj8 = null;
            int i7 = 0;
            while (z3) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z3 = false;
                        i4 = 7;
                        i5 = 6;
                    case 0:
                        obj7 = mo12920b.mo12867n(descriptor2, 0, C2560a2.f7013a, obj7);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        i6 |= 2;
                        z5 = mo12920b.mo12876C(descriptor2, 1);
                        i3 = 9;
                    case 2:
                        c = 3;
                        str4 = mo12920b.mo12868m(descriptor2, 2);
                        i6 |= 4;
                        i3 = 9;
                    case 3:
                        c = 3;
                        str5 = mo12920b.mo12868m(descriptor2, 3);
                        i6 |= 8;
                        i3 = 9;
                    case 4:
                        obj8 = mo12920b.mo12867n(descriptor2, 4, new C2581f(C0213a.m40920u(C2560a2.f7013a)), obj8);
                        i6 |= 16;
                        i3 = 9;
                    case 5:
                        i7 = mo12920b.mo12870i(descriptor2, 5);
                        i6 |= 32;
                    case 6:
                        obj6 = mo12920b.mo12867n(descriptor2, i5, C2560a2.f7013a, obj6);
                        i6 |= 64;
                    case 7:
                        obj5 = mo12920b.mo12867n(descriptor2, i4, C2560a2.f7013a, obj5);
                        i6 |= 128;
                    case 8:
                        z4 = mo12920b.mo12876C(descriptor2, 8);
                        i6 |= 256;
                    case 9:
                        str6 = mo12920b.mo12868m(descriptor2, i3);
                        i6 |= 512;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj8;
            i = i6;
            z = z5;
            str = str4;
            str2 = str5;
            str3 = str6;
            obj2 = obj7;
            obj3 = obj6;
            int i8 = i7;
            z2 = z4;
            obj4 = obj5;
            i2 = i8;
        }
        mo12920b.mo12872c(descriptor2);
        return new ActivityInviteEmbed(i, (String) obj2, z, str, str2, (List) obj, i2, (String) obj3, (String) obj4, z2, str3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ActivityInviteEmbed value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ActivityInviteEmbed.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
