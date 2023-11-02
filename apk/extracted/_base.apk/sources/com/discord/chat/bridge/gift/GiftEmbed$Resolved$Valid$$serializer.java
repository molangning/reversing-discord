package com.discord.chat.bridge.gift;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.facebook.react.uimanager.ViewProps;
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
import p045cj.C2578e0;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolved.Valid.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GiftEmbed$Resolved$Valid$$serializer implements InterfaceC2582f0<GiftEmbed.Resolved.Valid> {
    public static final GiftEmbed$Resolved$Valid$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolved$Valid$$serializer giftEmbed$Resolved$Valid$$serializer = new GiftEmbed$Resolved$Valid$$serializer();
        INSTANCE = giftEmbed$Resolved$Valid$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid", giftEmbed$Resolved$Valid$$serializer, 18);
        pluginGeneratedSerialDescriptor.m12856l("headerText", false);
        pluginGeneratedSerialDescriptor.m12856l("headerColor", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.m12856l("thumbnailUrl", true);
        pluginGeneratedSerialDescriptor.m12856l("titleText", true);
        pluginGeneratedSerialDescriptor.m12856l("titleColor", false);
        pluginGeneratedSerialDescriptor.m12856l("subtitle", true);
        pluginGeneratedSerialDescriptor.m12856l("subtitleColor", false);
        pluginGeneratedSerialDescriptor.m12856l("bodyText", true);
        pluginGeneratedSerialDescriptor.m12856l("bodyTextColor", false);
        pluginGeneratedSerialDescriptor.m12856l("acceptLabelText", true);
        pluginGeneratedSerialDescriptor.m12856l("acceptLabelColor", false);
        pluginGeneratedSerialDescriptor.m12856l("acceptLabelBackgroundColor", false);
        pluginGeneratedSerialDescriptor.m12856l("splashUrl", true);
        pluginGeneratedSerialDescriptor.m12856l("splashOpacity", false);
        pluginGeneratedSerialDescriptor.m12856l("canBeAccepted", false);
        pluginGeneratedSerialDescriptor.m12856l("giftCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolved$Valid$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{c2560a2, c2615m0, c2615m0, c2615m0, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2615m0, C0213a.m40920u(c2560a2), c2615m0, C0213a.m40920u(c2560a2), c2615m0, C0213a.m40920u(c2560a2), c2615m0, c2615m0, C0213a.m40920u(c2560a2), C2578e0.f7038a, C2590h.f7055a, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GiftEmbed.Resolved.Valid deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        Object obj6;
        int i2;
        int i3;
        int i4;
        float f;
        String str;
        int i5;
        String str2;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        char c;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i10 = 8;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 2);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 3);
            C2560a2 c2560a2 = C2560a2.f7013a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 4, c2560a2, null);
            Object mo12867n2 = mo12920b.mo12867n(descriptor2, 5, c2560a2, null);
            int mo12870i4 = mo12920b.mo12870i(descriptor2, 6);
            obj3 = mo12920b.mo12867n(descriptor2, 7, c2560a2, null);
            int mo12870i5 = mo12920b.mo12870i(descriptor2, 8);
            obj5 = mo12920b.mo12867n(descriptor2, 9, c2560a2, null);
            int mo12870i6 = mo12920b.mo12870i(descriptor2, 10);
            obj6 = mo12920b.mo12867n(descriptor2, 11, c2560a2, null);
            int mo12870i7 = mo12920b.mo12870i(descriptor2, 12);
            int mo12870i8 = mo12920b.mo12870i(descriptor2, 13);
            obj4 = mo12920b.mo12867n(descriptor2, 14, c2560a2, null);
            float mo12863u = mo12920b.mo12863u(descriptor2, 15);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 16);
            i9 = mo12870i5;
            str2 = mo12920b.mo12868m(descriptor2, 17);
            f = mo12863u;
            i5 = mo12870i7;
            i6 = mo12870i6;
            obj2 = mo12867n2;
            z = mo12876C;
            obj = mo12867n;
            i3 = mo12870i;
            i8 = 262143;
            i4 = mo12870i3;
            i = mo12870i8;
            str = mo12868m;
            i2 = mo12870i2;
            i7 = mo12870i4;
        } else {
            int i11 = 17;
            boolean z2 = true;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            String str3 = null;
            String str4 = null;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z3 = false;
            float f2 = 0.0f;
            int i19 = 0;
            int i20 = 0;
            obj = null;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i10 = 8;
                    case 0:
                        str3 = mo12920b.mo12868m(descriptor2, 0);
                        i12 |= 1;
                        i10 = 8;
                        i11 = 17;
                    case 1:
                        i14 = mo12920b.mo12870i(descriptor2, 1);
                        i12 |= 2;
                        i10 = 8;
                        i11 = 17;
                    case 2:
                        i13 = mo12920b.mo12870i(descriptor2, 2);
                        i12 |= 4;
                        i10 = 8;
                        i11 = 17;
                    case 3:
                        i15 = mo12920b.mo12870i(descriptor2, 3);
                        i12 |= 8;
                        i10 = 8;
                        i11 = 17;
                    case 4:
                        obj = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj);
                        i12 |= 16;
                        i10 = 8;
                        i11 = 17;
                    case 5:
                        obj7 = mo12920b.mo12867n(descriptor2, 5, C2560a2.f7013a, obj7);
                        i12 |= 32;
                        i10 = 8;
                        i11 = 17;
                    case 6:
                        c = 7;
                        i18 = mo12920b.mo12870i(descriptor2, 6);
                        i12 |= 64;
                        i10 = 8;
                        i11 = 17;
                    case 7:
                        c = 7;
                        obj8 = mo12920b.mo12867n(descriptor2, 7, C2560a2.f7013a, obj8);
                        i12 |= 128;
                        i10 = 8;
                        i11 = 17;
                    case 8:
                        i19 = mo12920b.mo12870i(descriptor2, i10);
                        i12 |= 256;
                        i11 = 17;
                    case 9:
                        obj10 = mo12920b.mo12867n(descriptor2, 9, C2560a2.f7013a, obj10);
                        i12 |= 512;
                        i10 = 8;
                        i11 = 17;
                    case 10:
                        i17 = mo12920b.mo12870i(descriptor2, 10);
                        i12 |= 1024;
                        i10 = 8;
                        i11 = 17;
                    case 11:
                        obj11 = mo12920b.mo12867n(descriptor2, 11, C2560a2.f7013a, obj11);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i10 = 8;
                        i11 = 17;
                    case 12:
                        i16 = mo12920b.mo12870i(descriptor2, 12);
                        i12 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i10 = 8;
                        i11 = 17;
                    case 13:
                        i20 = mo12920b.mo12870i(descriptor2, 13);
                        i12 |= 8192;
                        i10 = 8;
                        i11 = 17;
                    case 14:
                        obj9 = mo12920b.mo12867n(descriptor2, 14, C2560a2.f7013a, obj9);
                        i12 |= 16384;
                        i10 = 8;
                        i11 = 17;
                    case 15:
                        f2 = mo12920b.mo12863u(descriptor2, 15);
                        i12 |= 32768;
                        i11 = 17;
                    case 16:
                        z3 = mo12920b.mo12876C(descriptor2, 16);
                        i12 |= 65536;
                    case 17:
                        str4 = mo12920b.mo12868m(descriptor2, i11);
                        i12 |= 131072;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj2 = obj7;
            obj3 = obj8;
            i = i20;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
            i2 = i13;
            i3 = i14;
            i4 = i15;
            f = f2;
            str = str3;
            i5 = i16;
            str2 = str4;
            i6 = i17;
            i7 = i18;
            z = z3;
            i8 = i12;
            i9 = i19;
        }
        mo12920b.mo12872c(descriptor2);
        return new GiftEmbed.Resolved.Valid(i8, str, i3, i2, i4, (String) obj, (String) obj2, i7, (String) obj3, i9, (String) obj5, i6, (String) obj6, i5, i, (String) obj4, f, z, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, GiftEmbed.Resolved.Valid value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        GiftEmbed.Resolved.Valid.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
