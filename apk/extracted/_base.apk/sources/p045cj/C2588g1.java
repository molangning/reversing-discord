package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lcj/g1;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "other", "", "equals", "", "hashCode", "a", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2588g1<T> implements KSerializer<T> {

    /* renamed from: a */
    private final KSerializer<T> f7051a;

    /* renamed from: b */
    private final SerialDescriptor f7052b;

    public C2588g1(KSerializer<T> serializer) {
        C9612q.m13917h(serializer, "serializer");
        this.f7051a = serializer;
        this.f7052b = new C2650w1(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        if (decoder.mo12925D()) {
            return (T) decoder.mo12924G(this.f7051a);
        }
        return (T) decoder.mo12917j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2588g1.class == obj.getClass() && C9612q.m13922c(this.f7051a, ((C2588g1) obj).f7051a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7052b;
    }

    public int hashCode() {
        return this.f7051a.hashCode();
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, T t) {
        C9612q.m13917h(encoder, "encoder");
        if (t != null) {
            encoder.mo12883v();
            encoder.mo12895h(this.f7051a, t);
            return;
        }
        encoder.mo12930o();
    }
}
