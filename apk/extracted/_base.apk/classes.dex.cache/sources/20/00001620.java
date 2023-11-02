package com.discord.contact_sync;

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
import p045cj.C2590h;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/contact_sync/ContactSyncBlobEntry.$serializer", "Lcj/f0;", "Lcom/discord/contact_sync/ContactSyncBlobEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "contact_sync_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ContactSyncBlobEntry$$serializer implements InterfaceC2582f0<ContactSyncBlobEntry> {
    public static final ContactSyncBlobEntry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContactSyncBlobEntry$$serializer contactSyncBlobEntry$$serializer = new ContactSyncBlobEntry$$serializer();
        INSTANCE = contactSyncBlobEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.contact_sync.ContactSyncBlobEntry", contactSyncBlobEntry$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("phone", false);
        pluginGeneratedSerialDescriptor.m12856l("unencryptedName", false);
        pluginGeneratedSerialDescriptor.m12856l("hasImageData", false);
        pluginGeneratedSerialDescriptor.m12856l("deviceContactId", false);
        pluginGeneratedSerialDescriptor.m12856l("givenName", false);
        pluginGeneratedSerialDescriptor.m12856l("familyName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContactSyncBlobEntry$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, c2560a2, C2590h.f7055a, c2560a2, c2560a2, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContactSyncBlobEntry deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z;
        String str5;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 2);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 3);
            String mo12868m4 = mo12920b.mo12868m(descriptor2, 4);
            str3 = mo12868m;
            str = mo12920b.mo12868m(descriptor2, 5);
            str4 = mo12868m3;
            str2 = mo12868m4;
            z = mo12876C;
            str5 = mo12868m2;
            i = 63;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str6 = mo12920b.mo12868m(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str10 = mo12920b.mo12868m(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        z3 = mo12920b.mo12876C(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str8 = mo12920b.mo12868m(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str9 = mo12920b.mo12868m(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str7 = mo12920b.mo12868m(descriptor2, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            str = str7;
            str2 = str9;
            str3 = str6;
            int i3 = i2;
            str4 = str8;
            i = i3;
            String str11 = str10;
            z = z3;
            str5 = str11;
        }
        mo12920b.mo12872c(descriptor2);
        return new ContactSyncBlobEntry(i, str3, str5, z, str4, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ContactSyncBlobEntry value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ContactSyncBlobEntry.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}