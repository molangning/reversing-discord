package com.discord.chat.bridge.forums;

import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
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

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/forums/ForumPostActions.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ForumPostActions$$serializer implements InterfaceC2582f0<ForumPostActions> {
    public static final ForumPostActions$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ForumPostActions$$serializer forumPostActions$$serializer = new ForumPostActions$$serializer();
        INSTANCE = forumPostActions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forums.ForumPostActions", forumPostActions$$serializer, 8);
        pluginGeneratedSerialDescriptor.m12856l("numDisplayedReactions", false);
        pluginGeneratedSerialDescriptor.m12856l("isFollowing", false);
        pluginGeneratedSerialDescriptor.m12856l("followIcon", true);
        pluginGeneratedSerialDescriptor.m12856l("followLabel", false);
        pluginGeneratedSerialDescriptor.m12856l("shareIcon", true);
        pluginGeneratedSerialDescriptor.m12856l("shareLabel", false);
        pluginGeneratedSerialDescriptor.m12856l("defaultReaction", true);
        pluginGeneratedSerialDescriptor.m12856l("sharePrompt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ForumPostActions$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C2615m0.f7088a, C2590h.f7055a, C0213a.m40920u(c2560a2), c2560a2, C0213a.m40920u(c2560a2), c2560a2, C0213a.m40920u(MessageReaction$$serializer.INSTANCE), C0213a.m40920u(PostSharePrompt$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ForumPostActions deserialize(Decoder decoder) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        boolean z;
        int i2;
        char c;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i3 = 7;
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 1);
            C2560a2 c2560a2 = C2560a2.f7013a;
            obj3 = mo12920b.mo12867n(descriptor2, 2, c2560a2, null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 3);
            obj4 = mo12920b.mo12867n(descriptor2, 4, c2560a2, null);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 5);
            obj2 = mo12920b.mo12867n(descriptor2, 6, MessageReaction$$serializer.INSTANCE, null);
            obj = mo12920b.mo12867n(descriptor2, 7, PostSharePrompt$$serializer.INSTANCE, null);
            i = 255;
            i2 = mo12870i;
            str2 = mo12868m2;
            str = mo12868m;
            z = mo12876C;
        } else {
            boolean z2 = true;
            int i4 = 0;
            int i5 = 0;
            Object obj5 = null;
            Object obj6 = null;
            str = null;
            Object obj7 = null;
            str2 = null;
            Object obj8 = null;
            boolean z3 = false;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z2 = false;
                    case 0:
                        i5 |= 1;
                        i4 = mo12920b.mo12870i(descriptor2, 0);
                        i3 = 7;
                    case 1:
                        c = 2;
                        z3 = mo12920b.mo12876C(descriptor2, 1);
                        i5 |= 2;
                        i3 = 7;
                    case 2:
                        c = 2;
                        obj6 = mo12920b.mo12867n(descriptor2, 2, C2560a2.f7013a, obj6);
                        i5 |= 4;
                        i3 = 7;
                    case 3:
                        str = mo12920b.mo12868m(descriptor2, 3);
                        i5 |= 8;
                    case 4:
                        obj7 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj7);
                        i5 |= 16;
                    case 5:
                        str2 = mo12920b.mo12868m(descriptor2, 5);
                        i5 |= 32;
                    case 6:
                        obj8 = mo12920b.mo12867n(descriptor2, 6, MessageReaction$$serializer.INSTANCE, obj8);
                        i5 |= 64;
                    case 7:
                        obj5 = mo12920b.mo12867n(descriptor2, i3, PostSharePrompt$$serializer.INSTANCE, obj5);
                        i5 |= 128;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj5;
            obj2 = obj8;
            i = i5;
            obj3 = obj6;
            obj4 = obj7;
            z = z3;
            i2 = i4;
        }
        mo12920b.mo12872c(descriptor2);
        return new ForumPostActions(i, i2, z, (String) obj3, str, (String) obj4, str2, (MessageReaction) obj2, (PostSharePrompt) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, ForumPostActions value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        ForumPostActions.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
