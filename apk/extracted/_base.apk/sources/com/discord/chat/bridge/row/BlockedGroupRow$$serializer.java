package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.facebook.react.uimanager.ViewProps;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/row/BlockedGroupRow.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BlockedGroupRow$$serializer implements InterfaceC2582f0<BlockedGroupRow> {
    public static final BlockedGroupRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BlockedGroupRow$$serializer blockedGroupRow$$serializer = new BlockedGroupRow$$serializer();
        INSTANCE = blockedGroupRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", blockedGroupRow$$serializer, 9);
        pluginGeneratedSerialDescriptor.m12856l("index", false);
        pluginGeneratedSerialDescriptor.m12856l("changeType", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.BORDER_COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("text", false);
        pluginGeneratedSerialDescriptor.m12856l("revealed", false);
        pluginGeneratedSerialDescriptor.m12856l("button", false);
        pluginGeneratedSerialDescriptor.m12856l("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BlockedGroupRow$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{c2615m0, ChangeType.Serializer.INSTANCE, c2615m0, c2615m0, c2615m0, C2560a2.f7013a, C2590h.f7055a, BlockedGroupButton$$serializer.INSTANCE, C0213a.m40920u(new C2581f(BlockedGroupContent$$serializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BlockedGroupRow deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i;
        int i2;
        int i3;
        Object obj3;
        boolean z;
        int i4;
        int i5;
        String str;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i6 = 7;
        int i7 = 6;
        int i8 = 5;
        int i9 = 4;
        int i10 = 0;
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            obj3 = mo12920b.mo12862y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 2);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 3);
            int mo12870i4 = mo12920b.mo12870i(descriptor2, 4);
            String mo12868m = mo12920b.mo12868m(descriptor2, 5);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 6);
            obj2 = mo12920b.mo12862y(descriptor2, 7, BlockedGroupButton$$serializer.INSTANCE, null);
            obj = mo12920b.mo12867n(descriptor2, 8, new C2581f(BlockedGroupContent$$serializer.INSTANCE), null);
            z = mo12876C;
            str = mo12868m;
            i4 = mo12870i3;
            i5 = mo12870i4;
            i = 511;
            i2 = mo12870i2;
            i3 = mo12870i;
        } else {
            boolean z2 = true;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            String str2 = null;
            boolean z3 = false;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 0:
                        i11 = mo12920b.mo12870i(descriptor2, 0);
                        i10 |= 1;
                        i6 = 7;
                        i7 = 6;
                        i8 = 5;
                        break;
                    case 1:
                        i10 |= 2;
                        obj6 = mo12920b.mo12862y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj6);
                        i6 = 7;
                        i7 = 6;
                        i8 = 5;
                        break;
                    case 2:
                        i10 |= 4;
                        i14 = mo12920b.mo12870i(descriptor2, 2);
                        break;
                    case 3:
                        i12 = mo12920b.mo12870i(descriptor2, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        i13 = mo12920b.mo12870i(descriptor2, i9);
                        i10 |= 16;
                        break;
                    case 5:
                        str2 = mo12920b.mo12868m(descriptor2, i8);
                        i10 |= 32;
                        i9 = 4;
                        break;
                    case 6:
                        z3 = mo12920b.mo12876C(descriptor2, i7);
                        i10 |= 64;
                        i9 = 4;
                        break;
                    case 7:
                        obj5 = mo12920b.mo12862y(descriptor2, i6, BlockedGroupButton$$serializer.INSTANCE, obj5);
                        i10 |= 128;
                        i9 = 4;
                        break;
                    case 8:
                        obj4 = mo12920b.mo12867n(descriptor2, 8, new C2581f(BlockedGroupContent$$serializer.INSTANCE), obj4);
                        i10 |= 256;
                        i9 = 4;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj4;
            obj2 = obj5;
            i = i10;
            i2 = i14;
            i3 = i11;
            obj3 = obj6;
            z = z3;
            i4 = i12;
            i5 = i13;
            str = str2;
        }
        mo12920b.mo12872c(descriptor2);
        return new BlockedGroupRow(i, i3, (ChangeType) obj3, i2, i4, i5, str, z, (BlockedGroupButton) obj2, (List) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, BlockedGroupRow value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        BlockedGroupRow.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
