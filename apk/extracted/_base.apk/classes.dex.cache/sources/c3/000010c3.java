package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
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
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/row/EmbeddedActivityRow.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/row/EmbeddedActivityRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbeddedActivityRow$$serializer implements InterfaceC2582f0<EmbeddedActivityRow> {
    public static final EmbeddedActivityRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbeddedActivityRow$$serializer embeddedActivityRow$$serializer = new EmbeddedActivityRow$$serializer();
        INSTANCE = embeddedActivityRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("5", embeddedActivityRow$$serializer, 7);
        pluginGeneratedSerialDescriptor.m12856l("index", false);
        pluginGeneratedSerialDescriptor.m12856l("changeType", false);
        pluginGeneratedSerialDescriptor.m12856l("content", false);
        pluginGeneratedSerialDescriptor.m12856l("avatarUrls", false);
        pluginGeneratedSerialDescriptor.m12856l("buttonText", false);
        pluginGeneratedSerialDescriptor.m12856l("embeddedActivityKey", false);
        pluginGeneratedSerialDescriptor.m12856l("dismissButtonAccessibilityLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbeddedActivityRow$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C2615m0.f7088a, ChangeType.Serializer.INSTANCE, c2560a2, new C2581f(c2560a2), c2560a2, c2560a2, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbeddedActivityRow deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 6;
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            obj = mo12920b.mo12862y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 2);
            obj2 = mo12920b.mo12862y(descriptor2, 3, new C2581f(C2560a2.f7013a), null);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 4);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 5);
            i2 = mo12870i;
            str2 = mo12920b.mo12868m(descriptor2, 6);
            str = mo12868m3;
            str3 = mo12868m2;
            str4 = mo12868m;
            i = 127;
        } else {
            boolean z = true;
            int i4 = 0;
            Object obj3 = null;
            String str5 = null;
            Object obj4 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i5 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        i4 = mo12920b.mo12870i(descriptor2, 0);
                        i5 |= 1;
                        i3 = 6;
                    case 1:
                        obj3 = mo12920b.mo12862y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj3);
                        i5 |= 2;
                        i3 = 6;
                    case 2:
                        str5 = mo12920b.mo12868m(descriptor2, 2);
                        i5 |= 4;
                        i3 = 6;
                    case 3:
                        obj4 = mo12920b.mo12862y(descriptor2, 3, new C2581f(C2560a2.f7013a), obj4);
                        i5 |= 8;
                        i3 = 6;
                    case 4:
                        str6 = mo12920b.mo12868m(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        str7 = mo12920b.mo12868m(descriptor2, 5);
                        i5 |= 32;
                    case 6:
                        str8 = mo12920b.mo12868m(descriptor2, i3);
                        i5 |= 64;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj3;
            obj2 = obj4;
            str = str7;
            str2 = str8;
            i = i5;
            str3 = str6;
            str4 = str5;
            i2 = i4;
        }
        mo12920b.mo12872c(descriptor2);
        return new EmbeddedActivityRow(i, i2, (ChangeType) obj, str4, (List) obj2, str3, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, EmbeddedActivityRow value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        EmbeddedActivityRow.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}