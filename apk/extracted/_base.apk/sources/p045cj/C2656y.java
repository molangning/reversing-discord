package p045cj;

import bj.AbstractC2325e;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m14357d2 = {"Lcj/y;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "(Lkotlinx/serialization/encoding/Encoder;J)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)J", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2656y implements KSerializer<Duration> {

    /* renamed from: a */
    public static final C2656y f7141a = new C2656y();

    /* renamed from: b */
    private static final SerialDescriptor f7142b = new C2641t1("kotlin.time.Duration", AbstractC2325e.C2334i.f6445a);

    private C2656y() {
    }

    /* renamed from: a */
    public long m32769a(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return Duration.f25397k.m13623c(decoder.mo12909z());
    }

    /* renamed from: b */
    public void m32768b(Encoder encoder, long j) {
        C9612q.m13917h(encoder, "encoder");
        encoder.mo12903F(Duration.m13652I(j));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return Duration.m13643e(m32769a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f7142b;
    }

    @Override // p470zi.InterfaceC14279h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m32768b(encoder, ((Duration) obj).m13648M());
    }
}
