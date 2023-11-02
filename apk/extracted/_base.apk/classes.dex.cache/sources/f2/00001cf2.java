package com.discord.primitives;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import p045cj.C2649w0;
import p045cj.InterfaceC2582f0;

@Metadata(m14358d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m14357d2 = {"com/discord/primitives/StickerId.$serializer", "Lcj/f0;", "Lcom/discord/primitives/StickerId;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-aEuejx8", "(Lkotlinx/serialization/encoding/Decoder;)J", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-Pw5-X2A", "(Lkotlinx/serialization/encoding/Encoder;J)V", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "primitives_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class StickerId$$serializer implements InterfaceC2582f0<StickerId> {
    public static final StickerId$$serializer INSTANCE;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        StickerId$$serializer stickerId$$serializer = new StickerId$$serializer();
        INSTANCE = stickerId$$serializer;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.discord.primitives.StickerId", stickerId$$serializer);
        inlineClassDescriptor.m12856l("snowflake", false);
        descriptor = inlineClassDescriptor;
    }

    private StickerId$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C2649w0.f7129a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return StickerId.m42098boximpl(m42108deserializeaEuejx8(decoder));
    }

    /* renamed from: deserialize-aEuejx8 */
    public long m42108deserializeaEuejx8(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return StickerId.m42099constructorimpl(decoder.mo12915q(getDescriptor()).mo12916l());
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m42109serializePw5X2A(encoder, ((StickerId) obj).m42107unboximpl());
    }

    /* renamed from: serialize-Pw5-X2A */
    public void m42109serializePw5X2A(Encoder encoder, long j) {
        C9612q.m13917h(encoder, "encoder");
        Encoder mo12892l = encoder.mo12892l(getDescriptor());
        if (mo12892l != null) {
            mo12892l.mo12891m(j);
        }
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}