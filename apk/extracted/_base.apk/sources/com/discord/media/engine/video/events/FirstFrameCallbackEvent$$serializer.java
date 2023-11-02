package com.discord.media.engine.video.events;

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
import p045cj.C2615m0;
import p045cj.C2649w0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/media/engine/video/events/FirstFrameCallbackEvent.$serializer", "Lcj/f0;", "Lcom/discord/media/engine/video/events/FirstFrameCallbackEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class FirstFrameCallbackEvent$$serializer implements InterfaceC2582f0<FirstFrameCallbackEvent> {
    public static final FirstFrameCallbackEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FirstFrameCallbackEvent$$serializer firstFrameCallbackEvent$$serializer = new FirstFrameCallbackEvent$$serializer();
        INSTANCE = firstFrameCallbackEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.FirstFrameCallbackEvent", firstFrameCallbackEvent$$serializer, 4);
        pluginGeneratedSerialDescriptor.m12856l("connectionId", false);
        pluginGeneratedSerialDescriptor.m12856l("userId", false);
        pluginGeneratedSerialDescriptor.m12856l("ssrc", false);
        pluginGeneratedSerialDescriptor.m12856l("streamId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FirstFrameCallbackEvent$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        return new KSerializer[]{C2615m0.f7088a, c2560a2, C2649w0.f7129a, c2560a2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public FirstFrameCallbackEvent deserialize(Decoder decoder) {
        int i;
        String str;
        int i2;
        String str2;
        long j;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        if (mo12920b.mo12865p()) {
            int mo12870i = mo12920b.mo12870i(descriptor2, 0);
            String mo12868m = mo12920b.mo12868m(descriptor2, 1);
            long mo12871f = mo12920b.mo12871f(descriptor2, 2);
            i = mo12870i;
            str = mo12920b.mo12868m(descriptor2, 3);
            i2 = 15;
            str2 = mo12868m;
            j = mo12871f;
        } else {
            String str3 = null;
            boolean z = true;
            long j2 = 0;
            String str4 = null;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    z = false;
                } else if (mo12866o == 0) {
                    i3 = mo12920b.mo12870i(descriptor2, 0);
                    i4 |= 1;
                } else if (mo12866o == 1) {
                    str3 = mo12920b.mo12868m(descriptor2, 1);
                    i4 |= 2;
                } else if (mo12866o == 2) {
                    j2 = mo12920b.mo12871f(descriptor2, 2);
                    i4 |= 4;
                } else if (mo12866o != 3) {
                    throw new C14289n(mo12866o);
                } else {
                    str4 = mo12920b.mo12868m(descriptor2, 3);
                    i4 |= 8;
                }
            }
            i = i3;
            str = str4;
            i2 = i4;
            str2 = str3;
            j = j2;
        }
        mo12920b.mo12872c(descriptor2);
        return new FirstFrameCallbackEvent(i2, i, str2, j, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, FirstFrameCallbackEvent value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        FirstFrameCallbackEvent.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
