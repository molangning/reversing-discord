package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.events.TouchesHelper;
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
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/contentnode/LinkContentNode.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LinkContentNode$$serializer implements InterfaceC2582f0<LinkContentNode> {
    public static final LinkContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LinkContentNode$$serializer linkContentNode$$serializer = new LinkContentNode$$serializer();
        INSTANCE = linkContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", linkContentNode$$serializer, 5);
        pluginGeneratedSerialDescriptor.m12856l("content", false);
        pluginGeneratedSerialDescriptor.m12856l(TouchesHelper.TARGET_KEY, false);
        pluginGeneratedSerialDescriptor.m12856l("context", true);
        pluginGeneratedSerialDescriptor.m12856l("textContent", true);
        pluginGeneratedSerialDescriptor.m12856l("isUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkContentNode$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{new C2581f(ContentNodeSerializer.INSTANCE), c2560a2, C0213a.m40920u(LinkContext$$serializer.INSTANCE), c2560a2, C2590h.f7055a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public LinkContentNode deserialize(Decoder decoder) {
        int i;
        String str;
        Object obj;
        String str2;
        boolean z;
        Object obj2;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            obj2 = mo12920b.mo12862y(descriptor2, 0, new C2581f(ContentNodeSerializer.INSTANCE), null);
            str = mo12920b.mo12868m(descriptor2, 1);
            obj = mo12920b.mo12867n(descriptor2, 2, LinkContext$$serializer.INSTANCE, null);
            str2 = mo12920b.mo12868m(descriptor2, 3);
            z = mo12920b.mo12876C(descriptor2, 4);
            i = 31;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj3 = null;
            String str3 = null;
            Object obj4 = null;
            String str4 = null;
            int i2 = 0;
            while (z2) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z2 = false;
                } else if (mo12866o == 0) {
                    obj3 = mo12920b.mo12862y(descriptor2, 0, new C2581f(ContentNodeSerializer.INSTANCE), obj3);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    str3 = mo12920b.mo12868m(descriptor2, 1);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    obj4 = mo12920b.mo12867n(descriptor2, 2, LinkContext$$serializer.INSTANCE, obj4);
                    i2 |= 4;
                } else if (mo12866o == 3) {
                    str4 = mo12920b.mo12868m(descriptor2, 3);
                    i2 |= 8;
                } else if (mo12866o != 4) {
                    throw new C14289n(mo12866o);
                } else {
                    z3 = mo12920b.mo12876C(descriptor2, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            obj = obj4;
            str2 = str4;
            Object obj5 = obj3;
            z = z3;
            obj2 = obj5;
        }
        mo12920b.mo12872c(descriptor2);
        return new LinkContentNode(i, (List) obj2, str, (LinkContext) obj, str2, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, LinkContentNode value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        LinkContentNode.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}