package com.discord.chat.bridge.contentnode;

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
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/contentnode/LinkContext.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LinkContext$$serializer implements InterfaceC2582f0<LinkContext> {
    public static final LinkContext$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LinkContext$$serializer linkContext$$serializer = new LinkContext$$serializer();
        INSTANCE = linkContext$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.LinkContext", linkContext$$serializer, 10);
        pluginGeneratedSerialDescriptor.m12856l("usernameOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("otherUsernameOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("commandNameOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("actorHook", true);
        pluginGeneratedSerialDescriptor.m12856l("threadOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("pinsOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("webhookNameOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("handleDelete", true);
        pluginGeneratedSerialDescriptor.m12856l("roleSubscriptionOnClick", true);
        pluginGeneratedSerialDescriptor.m12856l("handleMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkContext$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        UserNameOnClick$$serializer userNameOnClick$$serializer = UserNameOnClick$$serializer.INSTANCE;
        return new KSerializer[]{C0213a.m40920u(userNameOnClick$$serializer), C0213a.m40920u(userNameOnClick$$serializer), C0213a.m40920u(CommandOnClick$$serializer.INSTANCE), C0213a.m40920u(ActorHook$$serializer.INSTANCE), C0213a.m40920u(ThreadOnClick$$serializer.INSTANCE), C0213a.m40920u(PinsOnClick$$serializer.INSTANCE), C0213a.m40920u(WebhookNameOnClick$$serializer.INSTANCE), C0213a.m40920u(HandleDelete$$serializer.INSTANCE), C0213a.m40920u(RoleSubscriptionOnClick$$serializer.INSTANCE), C0213a.m40920u(HandleMessage$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public LinkContext deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i;
        Object obj9;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 9;
        Object obj10 = null;
        if (mo12920b.mo12865p()) {
            UserNameOnClick$$serializer userNameOnClick$$serializer = UserNameOnClick$$serializer.INSTANCE;
            Object mo12867n = mo12920b.mo12867n(descriptor2, 0, userNameOnClick$$serializer, null);
            obj9 = mo12920b.mo12867n(descriptor2, 1, userNameOnClick$$serializer, null);
            obj8 = mo12920b.mo12867n(descriptor2, 2, CommandOnClick$$serializer.INSTANCE, null);
            obj7 = mo12920b.mo12867n(descriptor2, 3, ActorHook$$serializer.INSTANCE, null);
            obj6 = mo12920b.mo12867n(descriptor2, 4, ThreadOnClick$$serializer.INSTANCE, null);
            obj5 = mo12920b.mo12867n(descriptor2, 5, PinsOnClick$$serializer.INSTANCE, null);
            obj3 = mo12920b.mo12867n(descriptor2, 6, WebhookNameOnClick$$serializer.INSTANCE, null);
            obj4 = mo12920b.mo12867n(descriptor2, 7, HandleDelete$$serializer.INSTANCE, null);
            obj2 = mo12920b.mo12867n(descriptor2, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, null);
            obj = mo12920b.mo12867n(descriptor2, 9, HandleMessage$$serializer.INSTANCE, null);
            obj10 = mo12867n;
            i = 1023;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        obj10 = mo12920b.mo12867n(descriptor2, 0, UserNameOnClick$$serializer.INSTANCE, obj10);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        obj18 = mo12920b.mo12867n(descriptor2, 1, UserNameOnClick$$serializer.INSTANCE, obj18);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        obj19 = mo12920b.mo12867n(descriptor2, 2, CommandOnClick$$serializer.INSTANCE, obj19);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        obj17 = mo12920b.mo12867n(descriptor2, 3, ActorHook$$serializer.INSTANCE, obj17);
                        i3 |= 8;
                        i2 = 9;
                        break;
                    case 4:
                        obj16 = mo12920b.mo12867n(descriptor2, 4, ThreadOnClick$$serializer.INSTANCE, obj16);
                        i3 |= 16;
                        i2 = 9;
                        break;
                    case 5:
                        obj15 = mo12920b.mo12867n(descriptor2, 5, PinsOnClick$$serializer.INSTANCE, obj15);
                        i3 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        obj13 = mo12920b.mo12867n(descriptor2, 6, WebhookNameOnClick$$serializer.INSTANCE, obj13);
                        i3 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        obj14 = mo12920b.mo12867n(descriptor2, 7, HandleDelete$$serializer.INSTANCE, obj14);
                        i3 |= 128;
                        i2 = 9;
                        continue;
                    case 8:
                        obj12 = mo12920b.mo12867n(descriptor2, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, obj12);
                        i3 |= 256;
                        break;
                    case 9:
                        obj11 = mo12920b.mo12867n(descriptor2, i2, HandleMessage$$serializer.INSTANCE, obj11);
                        i3 |= 512;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj11;
            obj2 = obj12;
            obj3 = obj13;
            obj4 = obj14;
            obj5 = obj15;
            obj6 = obj16;
            obj7 = obj17;
            obj8 = obj19;
            i = i3;
            obj9 = obj18;
        }
        mo12920b.mo12872c(descriptor2);
        return new LinkContext(i, (UserNameOnClick) obj10, (UserNameOnClick) obj9, (CommandOnClick) obj8, (ActorHook) obj7, (ThreadOnClick) obj6, (PinsOnClick) obj5, (WebhookNameOnClick) obj3, (HandleDelete) obj4, (RoleSubscriptionOnClick) obj2, (HandleMessage) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, LinkContext value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        LinkContext.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}