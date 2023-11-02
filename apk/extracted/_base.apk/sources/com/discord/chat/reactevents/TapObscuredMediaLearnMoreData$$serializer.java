package com.discord.chat.reactevents;

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
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/reactevents/TapObscuredMediaLearnMoreData.$serializer", "Lcj/f0;", "Lcom/discord/chat/reactevents/TapObscuredMediaLearnMoreData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapObscuredMediaLearnMoreData$$serializer implements InterfaceC2582f0<TapObscuredMediaLearnMoreData> {
    public static final TapObscuredMediaLearnMoreData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TapObscuredMediaLearnMoreData$$serializer tapObscuredMediaLearnMoreData$$serializer = new TapObscuredMediaLearnMoreData$$serializer();
        INSTANCE = tapObscuredMediaLearnMoreData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapObscuredMediaLearnMoreData", tapObscuredMediaLearnMoreData$$serializer, 4);
        pluginGeneratedSerialDescriptor.m12856l("messageId", false);
        pluginGeneratedSerialDescriptor.m12856l("channelId", false);
        pluginGeneratedSerialDescriptor.m12856l("attachmentId", false);
        pluginGeneratedSerialDescriptor.m12856l("embedId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TapObscuredMediaLearnMoreData$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{c2560a2, c2560a2, c2560a2, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TapObscuredMediaLearnMoreData deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 1);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 2);
            str = mo12868m;
            str2 = mo12920b.mo12868m(descriptor2, 3);
            str3 = mo12868m3;
            str4 = mo12868m2;
            i = 15;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    str5 = mo12920b.mo12868m(descriptor2, 0);
                    i2 |= 1;
                } else if (mo12866o == 1) {
                    str8 = mo12920b.mo12868m(descriptor2, 1);
                    i2 |= 2;
                } else if (mo12866o == 2) {
                    str7 = mo12920b.mo12868m(descriptor2, 2);
                    i2 |= 4;
                } else if (mo12866o != 3) {
                    throw new C14289n(mo12866o);
                } else {
                    str6 = mo12920b.mo12868m(descriptor2, 3);
                    i2 |= 8;
                }
            }
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            i = i2;
        }
        mo12920b.mo12872c(descriptor2);
        return new TapObscuredMediaLearnMoreData(i, str, str4, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, TapObscuredMediaLearnMoreData value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        TapObscuredMediaLearnMoreData.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
