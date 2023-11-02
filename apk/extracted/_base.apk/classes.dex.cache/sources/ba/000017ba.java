package com.discord.friend_finder;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
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
import p045cj.C2647v1;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/friend_finder/ContactsDataEntry.$serializer", "Lcj/f0;", "Lcom/discord/friend_finder/ContactsDataEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "friend_finder_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ContactsDataEntry$$serializer implements InterfaceC2582f0<ContactsDataEntry> {
    public static final ContactsDataEntry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContactsDataEntry$$serializer contactsDataEntry$$serializer = new ContactsDataEntry$$serializer();
        INSTANCE = contactsDataEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.friend_finder.ContactsDataEntry", contactsDataEntry$$serializer, 6);
        pluginGeneratedSerialDescriptor.m12856l("contactMethod", false);
        pluginGeneratedSerialDescriptor.m12856l("contactMethodLabel", false);
        pluginGeneratedSerialDescriptor.m12856l("contactMethodType", false);
        pluginGeneratedSerialDescriptor.m12856l("contactNames", false);
        pluginGeneratedSerialDescriptor.m12856l("hasImageData", false);
        pluginGeneratedSerialDescriptor.m12856l("deviceContactIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContactsDataEntry$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, c2560a2, c2560a2, new C2647v1(C9591f0.m13969b(ContactName.class), ContactName$$serializer.INSTANCE), C2590h.f7055a, new C2647v1(C9591f0.m13969b(String.class), c2560a2)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContactsDataEntry deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        Object obj;
        boolean z;
        Object obj2;
        int i;
        char c;
        int i2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        char c2 = 3;
        int i3 = 2;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 2);
            obj2 = mo12920b.mo12862y(descriptor2, 3, new C2647v1(C9591f0.m13969b(ContactName.class), ContactName$$serializer.INSTANCE), null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 4);
            obj = mo12920b.mo12862y(descriptor2, 5, new C2647v1(C9591f0.m13969b(String.class), C2560a2.f7013a), null);
            str = mo12868m;
            i = 63;
            z = mo12876C;
            str3 = mo12868m3;
            str2 = mo12868m2;
        } else {
            boolean z2 = true;
            int i4 = 0;
            str = null;
            str2 = null;
            str3 = null;
            Object obj3 = null;
            Object obj4 = null;
            boolean z3 = false;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        int i5 = i3;
                        c = c2;
                        i2 = i5;
                        char c3 = c;
                        i3 = i2;
                        c2 = c3;
                    case 0:
                        int i6 = i3;
                        c = c2;
                        i2 = i6;
                        i4 |= 1;
                        str = mo12920b.mo12868m(descriptor2, 0);
                        char c32 = c;
                        i3 = i2;
                        c2 = c32;
                    case 1:
                        int i7 = i3;
                        c = c2;
                        i2 = i7;
                        str2 = mo12920b.mo12868m(descriptor2, 1);
                        i4 |= 2;
                        char c322 = c;
                        i3 = i2;
                        c2 = c322;
                    case 2:
                        int i8 = i3;
                        c = c2;
                        i2 = i8;
                        str3 = mo12920b.mo12868m(descriptor2, i2);
                        i4 |= 4;
                        char c3222 = c;
                        i3 = i2;
                        c2 = c3222;
                    case 3:
                        obj3 = mo12920b.mo12862y(descriptor2, 3, new C2647v1(C9591f0.m13969b(ContactName.class), ContactName$$serializer.INSTANCE), obj3);
                        i4 |= 8;
                        c2 = 3;
                        i3 = 2;
                    case 4:
                        z3 = mo12920b.mo12876C(descriptor2, 4);
                        i4 |= 16;
                        c2 = 3;
                        i3 = 2;
                    case 5:
                        obj4 = mo12920b.mo12862y(descriptor2, 5, new C2647v1(C9591f0.m13969b(String.class), C2560a2.f7013a), obj4);
                        i4 |= 32;
                        c2 = 3;
                        i3 = 2;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj4;
            z = z3;
            obj2 = obj3;
            i = i4;
        }
        mo12920b.mo12872c(descriptor2);
        return new ContactsDataEntry(i, str, str2, str3, (ContactName[]) obj2, z, (String[]) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ContactsDataEntry value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ContactsDataEntry.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}