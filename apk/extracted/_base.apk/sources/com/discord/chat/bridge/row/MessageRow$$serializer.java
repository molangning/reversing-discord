package com.discord.chat.bridge.row;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.BackgroundHighlight$$serializer;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameSerializer;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.reaction.ReactionsTheme$$serializer;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.bridge.truncation.Truncation$$serializer;
import com.discord.nearby.NearbyManager;
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
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/row/MessageRow.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/row/MessageRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageRow$$serializer implements InterfaceC2582f0<MessageRow> {
    public static final MessageRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageRow$$serializer messageRow$$serializer = new MessageRow$$serializer();
        INSTANCE = messageRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(NearbyManager.PERMISSION_DENIED, messageRow$$serializer, 19);
        pluginGeneratedSerialDescriptor.m12856l("index", false);
        pluginGeneratedSerialDescriptor.m12856l("changeType", false);
        pluginGeneratedSerialDescriptor.m12856l("jumped", true);
        pluginGeneratedSerialDescriptor.m12856l("highlightJumpedOnceOnly", true);
        pluginGeneratedSerialDescriptor.m12856l("message", false);
        pluginGeneratedSerialDescriptor.m12856l("scrollTo", true);
        pluginGeneratedSerialDescriptor.m12856l("animated", true);
        pluginGeneratedSerialDescriptor.m12856l("canAddNewReactions", true);
        pluginGeneratedSerialDescriptor.m12856l("addReactionLabel", true);
        pluginGeneratedSerialDescriptor.m12856l("addNewReactionAccessibilityLabel", true);
        pluginGeneratedSerialDescriptor.m12856l("addNewBurstReactionAccessibilityLabel", true);
        pluginGeneratedSerialDescriptor.m12856l("reactionsTheme", true);
        pluginGeneratedSerialDescriptor.m12856l("isHighlight", true);
        pluginGeneratedSerialDescriptor.m12856l("renderContentOnly", true);
        pluginGeneratedSerialDescriptor.m12856l("messageFrame", true);
        pluginGeneratedSerialDescriptor.m12856l("reactTag", true);
        pluginGeneratedSerialDescriptor.m12856l("truncation", true);
        pluginGeneratedSerialDescriptor.m12856l("backgroundHighlight", true);
        pluginGeneratedSerialDescriptor.m12856l("swipeActions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageRow$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2615m0 c2615m0 = C2615m0.f7088a;
        C2590h c2590h = C2590h.f7055a;
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2615m0, ChangeType.Serializer.INSTANCE, C0213a.m40920u(c2590h), C0213a.m40920u(c2590h), MessageSerializer.INSTANCE, C0213a.m40920u(c2590h), C0213a.m40920u(c2590h), C0213a.m40920u(c2590h), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(c2560a2), C0213a.m40920u(ReactionsTheme$$serializer.INSTANCE), c2590h, c2590h, C0213a.m40920u(MessageFrameSerializer.INSTANCE), C0213a.m40920u(c2615m0), C0213a.m40920u(Truncation$$serializer.INSTANCE), C0213a.m40920u(BackgroundHighlight$$serializer.INSTANCE), SwipeActionsType.Serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageRow deserialize(Decoder decoder) {
        Object obj;
        boolean z;
        boolean z2;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        SwipeActionsType swipeActionsType;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        SwipeActionsType swipeActionsType2;
        SwipeActionsType swipeActionsType3;
        Object obj17;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            Object mo12862y = mo12920b.mo12862y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            C2590h c2590h = C2590h.f7055a;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 2, c2590h, null);
            Object mo12867n2 = mo12920b.mo12867n(descriptor2, 3, c2590h, null);
            Object mo12862y2 = mo12920b.mo12862y(descriptor2, 4, MessageSerializer.INSTANCE, null);
            Object mo12867n3 = mo12920b.mo12867n(descriptor2, 5, c2590h, null);
            Object mo12867n4 = mo12920b.mo12867n(descriptor2, 6, c2590h, null);
            Object mo12867n5 = mo12920b.mo12867n(descriptor2, 7, c2590h, null);
            C2560a2 c2560a2 = C2560a2.f7013a;
            Object mo12867n6 = mo12920b.mo12867n(descriptor2, 8, c2560a2, null);
            Object mo12867n7 = mo12920b.mo12867n(descriptor2, 9, c2560a2, null);
            Object mo12867n8 = mo12920b.mo12867n(descriptor2, 10, c2560a2, null);
            Object mo12867n9 = mo12920b.mo12867n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, null);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 12);
            boolean mo12876C2 = mo12920b.mo12876C(descriptor2, 13);
            obj13 = mo12867n5;
            Object mo12867n10 = mo12920b.mo12867n(descriptor2, 14, MessageFrameSerializer.INSTANCE, null);
            Object mo12867n11 = mo12920b.mo12867n(descriptor2, 15, C2615m0.f7088a, null);
            Object mo12867n12 = mo12920b.mo12867n(descriptor2, 16, Truncation$$serializer.INSTANCE, null);
            obj6 = mo12862y;
            obj2 = mo12867n;
            z = mo12876C2;
            z2 = mo12876C;
            obj9 = mo12920b.mo12867n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, null);
            obj7 = mo12867n6;
            obj11 = mo12867n3;
            obj15 = mo12867n12;
            i2 = mo12870i;
            obj3 = mo12867n10;
            obj5 = mo12867n8;
            obj4 = mo12867n9;
            obj10 = mo12867n4;
            obj8 = mo12867n2;
            obj = mo12862y2;
            i = 524287;
            swipeActionsType = mo12920b.mo12862y(descriptor2, 18, SwipeActionsType.Serializer.INSTANCE, null);
            obj12 = mo12867n11;
            obj14 = mo12867n7;
        } else {
            SwipeActionsType swipeActionsType4 = null;
            boolean z3 = true;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            obj = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            int i3 = 0;
            z = false;
            int i4 = 0;
            z2 = false;
            Object obj31 = null;
            while (z3) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z3 = false;
                        swipeActionsType4 = swipeActionsType4;
                        break;
                    case 0:
                        obj16 = obj18;
                        swipeActionsType2 = swipeActionsType4;
                        i4 = mo12920b.mo12870i(descriptor2, 0);
                        i3 |= 1;
                        swipeActionsType4 = swipeActionsType2;
                        obj18 = obj16;
                        break;
                    case 1:
                        swipeActionsType2 = swipeActionsType4;
                        obj16 = obj18;
                        obj31 = mo12920b.mo12862y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj31);
                        i3 |= 2;
                        swipeActionsType4 = swipeActionsType2;
                        obj18 = obj16;
                        break;
                    case 2:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj18 = mo12920b.mo12867n(descriptor2, 2, C2590h.f7055a, obj18);
                        i3 |= 4;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 3:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj21 = mo12920b.mo12867n(descriptor2, 3, C2590h.f7055a, obj21);
                        i3 |= 8;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 4:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj = mo12920b.mo12862y(descriptor2, 4, MessageSerializer.INSTANCE, obj);
                        i3 |= 16;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 5:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj19 = mo12920b.mo12867n(descriptor2, 5, C2590h.f7055a, obj19);
                        i3 |= 32;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 6:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj26 = mo12920b.mo12867n(descriptor2, 6, C2590h.f7055a, obj26);
                        i3 |= 64;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 7:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj25 = mo12920b.mo12867n(descriptor2, 7, C2590h.f7055a, obj25);
                        i3 |= 128;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 8:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj24 = mo12920b.mo12867n(descriptor2, 8, C2560a2.f7013a, obj24);
                        i3 |= 256;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 9:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj20 = mo12920b.mo12867n(descriptor2, 9, C2560a2.f7013a, obj20);
                        i3 |= 512;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 10:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj23 = mo12920b.mo12867n(descriptor2, 10, C2560a2.f7013a, obj23);
                        i3 |= 1024;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 11:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        obj22 = mo12920b.mo12867n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, obj22);
                        i3 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 12:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        z2 = mo12920b.mo12876C(descriptor2, 12);
                        i3 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 13:
                        swipeActionsType3 = swipeActionsType4;
                        obj17 = obj31;
                        z = mo12920b.mo12876C(descriptor2, 13);
                        i3 |= 8192;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 14:
                        obj17 = obj31;
                        obj27 = mo12920b.mo12867n(descriptor2, 14, MessageFrameSerializer.INSTANCE, obj27);
                        i3 |= 16384;
                        swipeActionsType4 = swipeActionsType4;
                        obj28 = obj28;
                        obj31 = obj17;
                        break;
                    case 15:
                        obj17 = obj31;
                        obj28 = mo12920b.mo12867n(descriptor2, 15, C2615m0.f7088a, obj28);
                        i3 |= 32768;
                        swipeActionsType4 = swipeActionsType4;
                        obj29 = obj29;
                        obj31 = obj17;
                        break;
                    case 16:
                        obj17 = obj31;
                        obj29 = mo12920b.mo12867n(descriptor2, 16, Truncation$$serializer.INSTANCE, obj29);
                        i3 |= 65536;
                        swipeActionsType4 = swipeActionsType4;
                        obj30 = obj30;
                        obj31 = obj17;
                        break;
                    case 17:
                        obj17 = obj31;
                        swipeActionsType3 = swipeActionsType4;
                        obj30 = mo12920b.mo12867n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, obj30);
                        i3 |= 131072;
                        swipeActionsType4 = swipeActionsType3;
                        obj31 = obj17;
                        break;
                    case 18:
                        swipeActionsType4 = mo12920b.mo12862y(descriptor2, 18, SwipeActionsType.Serializer.INSTANCE, swipeActionsType4);
                        i3 |= 262144;
                        obj31 = obj31;
                        continue;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj2 = obj18;
            obj3 = obj27;
            i = i3;
            obj4 = obj22;
            obj5 = obj23;
            swipeActionsType = swipeActionsType4;
            i2 = i4;
            obj6 = obj31;
            obj7 = obj24;
            obj8 = obj21;
            obj9 = obj30;
            obj10 = obj26;
            obj11 = obj19;
            obj12 = obj28;
            obj13 = obj25;
            obj14 = obj20;
            obj15 = obj29;
        }
        mo12920b.mo12872c(descriptor2);
        return new MessageRow(i, i2, (ChangeType) obj6, (Boolean) obj2, (Boolean) obj8, (MessageBase) obj, (Boolean) obj11, (Boolean) obj10, (Boolean) obj13, (String) obj7, (String) obj14, (String) obj5, (ReactionsTheme) obj4, z2, z, (MessageFrame) obj3, (Integer) obj12, (Truncation) obj15, (BackgroundHighlight) obj9, swipeActionsType, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MessageRow value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MessageRow.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
