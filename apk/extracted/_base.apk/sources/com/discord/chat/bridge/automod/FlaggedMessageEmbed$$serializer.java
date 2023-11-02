package com.discord.chat.bridge.automod;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/automod/FlaggedMessageEmbed.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FlaggedMessageEmbed$$serializer implements InterfaceC2582f0<FlaggedMessageEmbed> {
    public static final FlaggedMessageEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FlaggedMessageEmbed$$serializer flaggedMessageEmbed$$serializer = new FlaggedMessageEmbed$$serializer();
        INSTANCE = flaggedMessageEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.FlaggedMessageEmbed", flaggedMessageEmbed$$serializer, 12);
        pluginGeneratedSerialDescriptor.m12856l("id", false);
        pluginGeneratedSerialDescriptor.m12856l("channelId", false);
        pluginGeneratedSerialDescriptor.m12856l("guildId", true);
        pluginGeneratedSerialDescriptor.m12856l("userId", true);
        pluginGeneratedSerialDescriptor.m12856l("content", true);
        pluginGeneratedSerialDescriptor.m12856l("channelName", true);
        pluginGeneratedSerialDescriptor.m12856l("username", true);
        pluginGeneratedSerialDescriptor.m12856l("usernameColor", false);
        pluginGeneratedSerialDescriptor.m12856l("roleColor", true);
        pluginGeneratedSerialDescriptor.m12856l("shouldShowRoleDot", false);
        pluginGeneratedSerialDescriptor.m12856l("avatarURL", true);
        pluginGeneratedSerialDescriptor.m12856l("communicationDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FlaggedMessageEmbed$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, C0213a.m40920u(GuildId$$serializer.INSTANCE), C0213a.m40920u(UserId$$serializer.INSTANCE), C0213a.m40920u(StructurableTextSerializer.INSTANCE), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), c2615m0, C0213a.m40920u(c2615m0), c2590h, C0213a.m40920u(c2560a2), C0213a.m40920u(c2590h)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public FlaggedMessageEmbed deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        Object obj7;
        int i2;
        Object obj8;
        Object obj9;
        Object obj10;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        Object obj11 = null;
        if (mo12920b.mo12865p()) {
            obj9 = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj6 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj5 = mo12920b.mo12867n(descriptor2, 2, GuildId$$serializer.INSTANCE, null);
            obj4 = mo12920b.mo12867n(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            obj8 = mo12920b.mo12867n(descriptor2, 4, StructurableTextSerializer.INSTANCE, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj2 = mo12920b.mo12867n(descriptor2, 5, c2560a2, null);
            obj3 = mo12920b.mo12867n(descriptor2, 6, c2560a2, null);
            int mo12870i = mo12920b.mo12870i(descriptor2, 7);
            obj10 = mo12920b.mo12867n(descriptor2, 8, C2615m0.f7088a, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 9);
            obj7 = mo12920b.mo12867n(descriptor2, 10, c2560a2, null);
            obj = mo12920b.mo12867n(descriptor2, 11, C2590h.f7055a, null);
            z = mo12876C;
            i2 = mo12870i;
            i = 4095;
        } else {
            int i7 = 11;
            boolean z2 = true;
            int i8 = 0;
            boolean z3 = false;
            int i9 = 0;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        break;
                    case 0:
                        obj12 = mo12920b.mo12862y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj12);
                        i8 |= 1;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        break;
                    case 1:
                        obj20 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj20);
                        i8 |= 2;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        break;
                    case 2:
                        obj19 = mo12920b.mo12867n(descriptor2, 2, GuildId$$serializer.INSTANCE, obj19);
                        i8 |= 4;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 3:
                        i8 |= 8;
                        obj17 = mo12920b.mo12867n(descriptor2, 3, UserId$$serializer.INSTANCE, obj17);
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        i8 |= 16;
                        obj18 = mo12920b.mo12867n(descriptor2, 4, StructurableTextSerializer.INSTANCE, obj18);
                        i7 = 11;
                        i3 = 10;
                        break;
                    case 5:
                        obj14 = mo12920b.mo12867n(descriptor2, 5, C2560a2.f7013a, obj14);
                        i8 |= 32;
                        i7 = 11;
                        continue;
                    case 6:
                        obj15 = mo12920b.mo12867n(descriptor2, i6, C2560a2.f7013a, obj15);
                        i8 |= 64;
                        break;
                    case 7:
                        i9 = mo12920b.mo12870i(descriptor2, i5);
                        i8 |= 128;
                        break;
                    case 8:
                        obj11 = mo12920b.mo12867n(descriptor2, 8, C2615m0.f7088a, obj11);
                        i8 |= 256;
                        break;
                    case 9:
                        z3 = mo12920b.mo12876C(descriptor2, i4);
                        i8 |= 512;
                        break;
                    case 10:
                        obj16 = mo12920b.mo12867n(descriptor2, i3, C2560a2.f7013a, obj16);
                        i8 |= 1024;
                        break;
                    case 11:
                        obj13 = mo12920b.mo12867n(descriptor2, i7, C2590h.f7055a, obj13);
                        i8 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj13;
            obj2 = obj14;
            obj3 = obj15;
            z = z3;
            obj4 = obj17;
            obj5 = obj19;
            obj6 = obj20;
            i = i8;
            obj7 = obj16;
            i2 = i9;
            obj8 = obj18;
            obj9 = obj12;
            obj10 = obj11;
        }
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj9;
        return new FlaggedMessageEmbed(i, messageId != null ? messageId.m42081unboximpl() : null, (ChannelId) obj6, (GuildId) obj5, (UserId) obj4, (StructurableText) obj8, (String) obj2, (String) obj3, i2, (Integer) obj10, z, (String) obj7, (Boolean) obj, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, FlaggedMessageEmbed value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        FlaggedMessageEmbed.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
