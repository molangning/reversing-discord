package com.discord.bundle_updater.react.events;

import com.discord.bundle_updater.BundleUpdater;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p045cj.C2581f;
import p045cj.InterfaceC2582f0;
import p470zi.C14272c;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/bundle_updater/react/events/OtaCheckAttemptEvent.$serializer", "Lcj/f0;", "Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class OtaCheckAttemptEvent$$serializer implements InterfaceC2582f0<OtaCheckAttemptEvent> {
    public static final OtaCheckAttemptEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OtaCheckAttemptEvent$$serializer otaCheckAttemptEvent$$serializer = new OtaCheckAttemptEvent$$serializer();
        INSTANCE = otaCheckAttemptEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.react.events.OtaCheckAttemptEvent", otaCheckAttemptEvent$$serializer, 1);
        pluginGeneratedSerialDescriptor.m12856l("metrics", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OtaCheckAttemptEvent$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{new C2581f(new C14272c(C9591f0.m13969b(BundleUpdater.OtaMetric.class), new Annotation[0]))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OtaCheckAttemptEvent deserialize(Decoder decoder) {
        Object obj;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i = 1;
        if (mo12920b.mo12865p()) {
            obj = mo12920b.mo12862y(descriptor2, 0, new C2581f(new C14272c(C9591f0.m13969b(BundleUpdater.OtaMetric.class), new Annotation[0])), null);
        } else {
            int i2 = 0;
            obj = null;
            while (i != 0) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                if (mo12866o == -1) {
                    i = 0;
                } else if (mo12866o != 0) {
                    throw new C14289n(mo12866o);
                } else {
                    obj = mo12920b.mo12862y(descriptor2, 0, new C2581f(new C14272c(C9591f0.m13969b(BundleUpdater.OtaMetric.class), new Annotation[0])), obj);
                    i2 |= 1;
                }
            }
            i = i2;
        }
        mo12920b.mo12872c(descriptor2);
        return new OtaCheckAttemptEvent(i, (List) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, OtaCheckAttemptEvent value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        OtaCheckAttemptEvent.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
