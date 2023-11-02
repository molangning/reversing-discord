package p045cj;

import bj.AbstractC2325e;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lcj/x;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Double;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2651x implements KSerializer<Double> {

    /* renamed from: a */
    public static final C2651x f7134a = new C2651x();

    /* renamed from: b */
    private static final SerialDescriptor f7135b = new C2641t1("kotlin.Double", AbstractC2325e.C2329d.f6440a);

    private C2651x() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public Double deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return Double.valueOf(decoder.mo12912v());
    }

    /* renamed from: b */
    public void m32778b(Encoder encoder, double d) {
        C9612q.m13917h(encoder, "encoder");
        encoder.mo12897f(d);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f7135b;
    }

    @Override // p470zi.InterfaceC14279h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m32778b(encoder, ((Number) obj).doubleValue());
    }
}
