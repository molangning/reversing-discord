package com.discord.chat.presentation.list.messagebundling;

import com.discord.chat.bridge.row.MessageRow$$serializer;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;
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
import p045cj.C2578e0;
import p045cj.C2581f;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/presentation/list/messagebundling/MessageBundleView.MessageBundle.$serializer", "Lcj/f0;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleView$MessageBundle$$serializer implements InterfaceC2582f0<MessageBundleView.MessageBundle> {
    public static final MessageBundleView$MessageBundle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageBundleView$MessageBundle$$serializer messageBundleView$MessageBundle$$serializer = new MessageBundleView$MessageBundle$$serializer();
        INSTANCE = messageBundleView$MessageBundle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle", messageBundleView$MessageBundle$$serializer, 5);
        pluginGeneratedSerialDescriptor.m12856l("messageFrame", true);
        pluginGeneratedSerialDescriptor.m12856l("rows", false);
        pluginGeneratedSerialDescriptor.m12856l("truncationThreshold", true);
        pluginGeneratedSerialDescriptor.m12856l("referenceMessageRows", true);
        pluginGeneratedSerialDescriptor.m12856l("viewMoreText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageBundleView$MessageBundle$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        MessageRow$$serializer messageRow$$serializer = MessageRow$$serializer.INSTANCE;
        return new KSerializer[]{C0213a.m40920u(MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE), new C2581f(messageRow$$serializer), C0213a.m40920u(C2578e0.f7038a), new C2581f(messageRow$$serializer), C0213a.m40920u(C2560a2.f7013a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageBundleView.MessageBundle deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        Object obj6 = null;
        if (mo12920b.mo12865p()) {
            obj5 = mo12920b.mo12867n(descriptor2, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE, null);
            MessageRow$$serializer messageRow$$serializer = MessageRow$$serializer.INSTANCE;
            obj = mo12920b.mo12862y(descriptor2, 1, new C2581f(messageRow$$serializer), null);
            obj2 = mo12920b.mo12867n(descriptor2, 2, C2578e0.f7038a, null);
            obj3 = mo12920b.mo12862y(descriptor2, 3, new C2581f(messageRow$$serializer), null);
            obj4 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, null);
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    obj6 = mo12920b.mo12867n(descriptor2, 0, MessageFrameFeedHeaderView$MessageBundleHeader$$serializer.INSTANCE, obj6);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    obj7 = mo12920b.mo12862y(descriptor2, 1, new C2581f(MessageRow$$serializer.INSTANCE), obj7);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    obj8 = mo12920b.mo12867n(descriptor2, 2, C2578e0.f7038a, obj8);
                    i2 |= 4;
                } else if (mo12866o == 3) {
                    obj9 = mo12920b.mo12862y(descriptor2, 3, new C2581f(MessageRow$$serializer.INSTANCE), obj9);
                    i2 |= 8;
                } else if (mo12866o != 4) {
                    throw new C14289n(mo12866o);
                } else {
                    obj10 = mo12920b.mo12867n(descriptor2, 4, C2560a2.f7013a, obj10);
                    i2 |= 16;
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj3 = obj9;
            obj4 = obj10;
            Object obj11 = obj6;
            i = i2;
            obj5 = obj11;
        }
        mo12920b.mo12872c(descriptor2);
        return new MessageBundleView.MessageBundle(i, (MessageFrameFeedHeaderView.MessageBundleHeader) obj5, (List) obj, (Float) obj2, (List) obj3, (String) obj4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, MessageBundleView.MessageBundle value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        MessageBundleView.MessageBundle.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}