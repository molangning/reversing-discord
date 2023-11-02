package p045cj;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p045cj.AbstractC2632q1;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b/\u00100J\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0001H$¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H$¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00061"}, m14357d2 = {"Lcj/s1;", "Element", "Array", "Lcj/q1;", "Builder", "Lcj/s;", "", "p", "(Lcj/q1;)I", "t", "(Lcj/q1;)Ljava/lang/Object;", "size", "", "q", "(Lcj/q1;I)V", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "s", "(Lcj/q1;ILjava/lang/Object;)V", "o", "()Lcj/q1;", "r", "()Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "u", "(Lkotlinx/serialization/encoding/CompositeEncoder;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.s1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2638s1<Element, Array, Builder extends AbstractC2632q1<Array>> extends AbstractC2636s<Element, Array, Builder> {

    /* renamed from: b */
    private final SerialDescriptor f7112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2638s1(KSerializer<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        C9612q.m13917h(primitiveSerializer, "primitiveSerializer");
        this.f7112b = new C2635r1(primitiveSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: d */
    public final Iterator<Element> mo32795d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // p045cj.AbstractC2556a, kotlinx.serialization.DeserializationStrategy
    public final Array deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        return m32986f(decoder, null);
    }

    @Override // p045cj.AbstractC2636s, kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f7112b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: o */
    public final Builder mo32798a() {
        return (Builder) mo12789k(mo12788r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: p */
    public final int mo32797b(Builder builder) {
        C9612q.m13917h(builder, "<this>");
        return builder.mo32765d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: q */
    public final void mo32796c(Builder builder, int i) {
        C9612q.m13917h(builder, "<this>");
        builder.mo32766b(i);
    }

    /* renamed from: r */
    protected abstract Array mo12788r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2636s
    /* renamed from: s */
    public final void mo32793n(Builder builder, int i, Element element) {
        C9612q.m13917h(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // p045cj.AbstractC2636s, p470zi.InterfaceC14279h
    public final void serialize(Encoder encoder, Array array) {
        C9612q.m13917h(encoder, "encoder");
        int mo12791e = mo12791e(array);
        SerialDescriptor serialDescriptor = this.f7112b;
        CompositeEncoder mo12893j = encoder.mo12893j(serialDescriptor, mo12791e);
        mo12787u(mo12893j, array, mo12791e);
        mo12893j.mo12899c(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: t */
    public final Array mo32794l(Builder builder) {
        C9612q.m13917h(builder, "<this>");
        return (Array) builder.mo32767a();
    }

    /* renamed from: u */
    protected abstract void mo12787u(CompositeEncoder compositeEncoder, Array array, int i);
}
