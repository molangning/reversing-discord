package p045cj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import p045cj.InterfaceC2582f0;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¨\u0006\u0007"}, m14357d2 = {"T", "", ZeroconfModule.KEY_SERVICE_NAME, "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2606k0 {

    @Metadata(m14358d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m14357d2 = {"cj/k0$a", "Lcj/f0;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: cj.k0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2607a<T> implements InterfaceC2582f0<T> {

        /* renamed from: a */
        final /* synthetic */ KSerializer<T> f7080a;

        C2607a(KSerializer<T> kSerializer) {
            this.f7080a = kSerializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p045cj.InterfaceC2582f0
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.f7080a};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public T deserialize(Decoder decoder) {
            C9612q.m13917h(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p470zi.InterfaceC14279h
        public void serialize(Encoder encoder, T t) {
            C9612q.m13917h(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p045cj.InterfaceC2582f0
        public KSerializer<?>[] typeParametersSerializers() {
            return InterfaceC2582f0.C2583a.m32915a(this);
        }
    }

    /* renamed from: a */
    public static final <T> SerialDescriptor m32873a(String name, KSerializer<T> primitiveSerializer) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new C2607a(primitiveSerializer));
    }
}