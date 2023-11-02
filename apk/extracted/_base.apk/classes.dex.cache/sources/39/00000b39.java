package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9598i0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.C0213a;
import pf.C11563g0;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m14357d2 = {"Lcj/m2;", "Lkotlinx/serialization/KSerializer;", "Lpf/g0;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "(Lkotlinx/serialization/encoding/Encoder;S)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)S", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.m2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2617m2 implements KSerializer<C11563g0> {

    /* renamed from: a */
    public static final C2617m2 f7091a = new C2617m2();

    /* renamed from: b */
    private static final SerialDescriptor f7092b = C2606k0.m32873a("kotlin.UShort", C0213a.m40947D(C9598i0.f25347a));

    private C2617m2() {
    }

    /* renamed from: a */
    public short m32842a(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return C11563g0.m7634b(decoder.mo12915q(getDescriptor()).mo12914s());
    }

    /* renamed from: b */
    public void m32841b(Encoder encoder, short s) {
        C9612q.m13917h(encoder, "encoder");
        encoder.mo12892l(getDescriptor()).mo12888q(s);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C11563g0.m7635a(m32842a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f7092b;
    }

    @Override // p470zi.InterfaceC14279h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m32841b(encoder, ((C11563g0) obj).m7630f());
    }
}