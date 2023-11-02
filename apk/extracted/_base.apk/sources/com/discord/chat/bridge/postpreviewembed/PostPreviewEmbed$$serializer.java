package com.discord.chat.bridge.postpreviewembed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostPreviewEmbed$$serializer implements InterfaceC2582f0<PostPreviewEmbed> {
    public static final PostPreviewEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 19);
        pluginGeneratedSerialDescriptor.m12856l("parentChannelId", false);
        pluginGeneratedSerialDescriptor.m12856l("threadId", false);
        pluginGeneratedSerialDescriptor.m12856l("messageId", false);
        pluginGeneratedSerialDescriptor.m12856l("guildId", false);
        pluginGeneratedSerialDescriptor.m12856l("title", false);
        pluginGeneratedSerialDescriptor.m12856l("ctaText", false);
        pluginGeneratedSerialDescriptor.m12856l("ctaButtonColor", false);
        pluginGeneratedSerialDescriptor.m12856l("footer", false);
        pluginGeneratedSerialDescriptor.m12856l("subtitle", true);
        pluginGeneratedSerialDescriptor.m12856l("coverImage", true);
        pluginGeneratedSerialDescriptor.m12856l("blurredCoverImage", true);
        pluginGeneratedSerialDescriptor.m12856l("coverImageOverlayText", true);
        pluginGeneratedSerialDescriptor.m12856l("backgroundImage", true);
        pluginGeneratedSerialDescriptor.m12856l("spoiler", true);
        pluginGeneratedSerialDescriptor.m12856l("obscure", true);
        pluginGeneratedSerialDescriptor.m12856l("obscureAwaitingScan", true);
        pluginGeneratedSerialDescriptor.m12856l("shouldSpoiler", true);
        pluginGeneratedSerialDescriptor.m12856l("spoilerOrNull", true);
        pluginGeneratedSerialDescriptor.m12856l("obscureOrNull", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, c2560a2, c2560a2, C2615m0.f7088a, StructurableTextSerializer.INSTANCE, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2590h), c2590h, C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PostPreviewEmbed deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str;
        boolean z;
        int i;
        String str2;
        Object obj9;
        Object obj10;
        Object obj11;
        int i2;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        Object obj20 = null;
        if (mo12920b.mo12865p()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            Object mo12862y = mo12920b.mo12862y(descriptor2, 0, channelId$$serializer, null);
            Object mo12862y2 = mo12920b.mo12862y(descriptor2, 1, channelId$$serializer, null);
            obj9 = mo12920b.mo12862y(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj7 = mo12920b.mo12862y(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 4);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 5);
            int mo12870i = mo12920b.mo12870i(descriptor2, 6);
            obj15 = mo12920b.mo12862y(descriptor2, 7, StructurableTextSerializer.INSTANCE, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj12 = mo12920b.mo12867n(descriptor2, 8, c2560a2, null);
            obj13 = mo12920b.mo12867n(descriptor2, 9, c2560a2, null);
            obj8 = mo12920b.mo12867n(descriptor2, 10, c2560a2, null);
            obj14 = mo12920b.mo12867n(descriptor2, 11, c2560a2, null);
            Object mo12867n = mo12920b.mo12867n(descriptor2, 12, c2560a2, null);
            obj6 = mo12920b.mo12867n(descriptor2, 13, c2560a2, null);
            obj5 = mo12920b.mo12867n(descriptor2, 14, c2560a2, null);
            Object mo12867n2 = mo12920b.mo12867n(descriptor2, 15, C2590h.f7055a, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 16);
            Object mo12867n3 = mo12920b.mo12867n(descriptor2, 17, c2560a2, null);
            Object mo12867n4 = mo12920b.mo12867n(descriptor2, 18, c2560a2, null);
            obj3 = mo12867n3;
            z = mo12876C;
            i = mo12870i;
            str2 = mo12868m2;
            i2 = 524287;
            obj2 = mo12867n2;
            obj4 = mo12867n;
            obj11 = mo12862y2;
            str = mo12868m;
            obj = mo12867n4;
            obj10 = mo12862y;
        } else {
            int i3 = 18;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            boolean z3 = true;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            obj = null;
            Object obj27 = null;
            obj2 = null;
            String str3 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            String str4 = null;
            while (z3) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        obj16 = obj31;
                        obj17 = obj21;
                        z3 = false;
                        obj23 = obj23;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 0:
                        obj18 = obj22;
                        obj19 = obj23;
                        obj16 = obj31;
                        obj17 = obj21;
                        obj30 = mo12920b.mo12862y(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj30);
                        i4 |= 1;
                        obj23 = obj19;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 1:
                        obj18 = obj22;
                        obj19 = obj23;
                        obj16 = obj31;
                        obj17 = obj21;
                        obj20 = mo12920b.mo12862y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj20);
                        i4 |= 2;
                        obj23 = obj19;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 2:
                        obj18 = obj22;
                        obj16 = obj31;
                        obj17 = obj21;
                        obj19 = obj23;
                        obj28 = mo12920b.mo12862y(descriptor2, 2, MessageId$$serializer.INSTANCE, obj28);
                        i4 |= 4;
                        obj23 = obj19;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 3:
                        obj18 = obj22;
                        obj16 = obj31;
                        obj17 = obj21;
                        obj29 = mo12920b.mo12862y(descriptor2, 3, GuildId$$serializer.INSTANCE, obj29);
                        i4 |= 8;
                        obj32 = obj32;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 4:
                        obj18 = obj22;
                        obj16 = obj31;
                        obj17 = obj21;
                        str3 = mo12920b.mo12868m(descriptor2, 4);
                        i4 |= 16;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 5:
                        obj18 = obj22;
                        obj16 = obj31;
                        obj17 = obj21;
                        str4 = mo12920b.mo12868m(descriptor2, 5);
                        i4 |= 32;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 6:
                        obj18 = obj22;
                        obj16 = obj31;
                        obj17 = obj21;
                        i5 = mo12920b.mo12870i(descriptor2, 6);
                        i4 |= 64;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 7:
                        obj16 = obj31;
                        obj17 = obj21;
                        obj18 = obj22;
                        obj32 = mo12920b.mo12862y(descriptor2, 7, StructurableTextSerializer.INSTANCE, obj32);
                        i4 |= 128;
                        obj22 = obj18;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 8:
                        obj16 = obj31;
                        obj17 = obj21;
                        obj27 = mo12920b.mo12867n(descriptor2, 8, C2560a2.f7013a, obj27);
                        i4 |= 256;
                        obj21 = obj17;
                        i3 = 18;
                        obj31 = obj16;
                        break;
                    case 9:
                        i4 |= 512;
                        obj21 = obj21;
                        obj31 = mo12920b.mo12867n(descriptor2, 9, C2560a2.f7013a, obj31);
                        i3 = 18;
                        break;
                    case 10:
                        obj23 = mo12920b.mo12867n(descriptor2, 10, C2560a2.f7013a, obj23);
                        i4 |= 1024;
                        i3 = 18;
                        break;
                    case 11:
                        obj26 = mo12920b.mo12867n(descriptor2, 11, C2560a2.f7013a, obj26);
                        i4 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i3 = 18;
                        break;
                    case 12:
                        obj21 = mo12920b.mo12867n(descriptor2, 12, C2560a2.f7013a, obj21);
                        i4 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i3 = 18;
                        break;
                    case 13:
                        obj25 = mo12920b.mo12867n(descriptor2, 13, C2560a2.f7013a, obj25);
                        i4 |= 8192;
                        i3 = 18;
                        break;
                    case 14:
                        obj24 = mo12920b.mo12867n(descriptor2, 14, C2560a2.f7013a, obj24);
                        i4 |= 16384;
                        i3 = 18;
                        break;
                    case 15:
                        obj2 = mo12920b.mo12867n(descriptor2, 15, C2590h.f7055a, obj2);
                        i4 |= 32768;
                        i3 = 18;
                        break;
                    case 16:
                        z2 = mo12920b.mo12876C(descriptor2, 16);
                        i4 |= 65536;
                        i3 = 18;
                        break;
                    case 17:
                        obj22 = mo12920b.mo12867n(descriptor2, 17, C2560a2.f7013a, obj22);
                        i4 |= 131072;
                        i3 = 18;
                        break;
                    case 18:
                        obj = mo12920b.mo12867n(descriptor2, i3, C2560a2.f7013a, obj);
                        i4 |= 262144;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj3 = obj22;
            Object obj33 = obj31;
            obj4 = obj21;
            obj5 = obj24;
            obj6 = obj25;
            obj7 = obj29;
            obj8 = obj23;
            str = str3;
            z = z2;
            i = i5;
            str2 = str4;
            obj9 = obj28;
            obj10 = obj30;
            obj11 = obj20;
            i2 = i4;
            obj12 = obj27;
            obj13 = obj33;
            obj14 = obj26;
            obj15 = obj32;
        }
        mo12920b.mo12872c(descriptor2);
        MessageId messageId = (MessageId) obj9;
        return new PostPreviewEmbed(i2, (ChannelId) obj10, (ChannelId) obj11, messageId != null ? messageId.m42081unboximpl() : null, (GuildId) obj7, str, str2, i, (StructurableText) obj15, (String) obj12, (String) obj13, (String) obj8, (String) obj14, (String) obj4, (String) obj6, (String) obj5, (Boolean) obj2, z, (String) obj3, (String) obj, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, PostPreviewEmbed value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        PostPreviewEmbed.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
