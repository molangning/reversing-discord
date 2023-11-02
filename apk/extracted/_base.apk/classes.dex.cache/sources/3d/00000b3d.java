package p045cj;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lcj/n2;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/Unit;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.n2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2621n2 implements KSerializer<Unit> {

    /* renamed from: b */
    public static final C2621n2 f7095b = new C2621n2();

    /* renamed from: a */
    private final /* synthetic */ C2592h1<Unit> f7096a = new C2592h1<>("kotlin.Unit", Unit.f25302a);

    private C2621n2() {
    }

    /* renamed from: a */
    public void m32835a(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        this.f7096a.deserialize(decoder);
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: b */
    public void serialize(Encoder encoder, Unit value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        this.f7096a.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        m32835a(decoder);
        return Unit.f25302a;
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7096a.getDescriptor();
    }
}