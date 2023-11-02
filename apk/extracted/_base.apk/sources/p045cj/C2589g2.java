package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9585d;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.C0213a;
import pf.C11593z;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m14357d2 = {"Lcj/g2;", "Lkotlinx/serialization/KSerializer;", "Lpf/z;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "b", "(Lkotlinx/serialization/encoding/Encoder;B)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)B", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.g2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2589g2 implements KSerializer<C11593z> {

    /* renamed from: a */
    public static final C2589g2 f7053a = new C2589g2();

    /* renamed from: b */
    private static final SerialDescriptor f7054b = C2606k0.m32873a("kotlin.UByte", C0213a.m40917x(C9585d.f25333a));

    private C2589g2() {
    }

    /* renamed from: a */
    public byte m32908a(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return C11593z.m7575b(decoder.mo12915q(getDescriptor()).mo12923H());
    }

    /* renamed from: b */
    public void m32907b(Encoder encoder, byte b) {
        C9612q.m13917h(encoder, "encoder");
        encoder.mo12892l(getDescriptor()).mo12896g(b);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C11593z.m7576a(m32908a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f7054b;
    }

    @Override // p470zi.InterfaceC14279h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m32907b(encoder, ((C11593z) obj).m7571f());
    }
}
