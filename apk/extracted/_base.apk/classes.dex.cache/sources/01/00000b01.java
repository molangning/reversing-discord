package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p470zi.C14275d;
import p470zi.C14278g;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m14357d2 = {"Lcj/b;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/c;", "compositeDecoder", "b", "(Lkotlinx/serialization/encoding/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "c", "Lzi/h;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lzi/h;", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2561b<T> implements KSerializer<T> {
    /* renamed from: b */
    public final T m32977b(InterfaceC9936c interfaceC9936c) {
        return (T) InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 1, C14275d.m267a(this, interfaceC9936c, interfaceC9936c.mo12868m(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public DeserializationStrategy<T> mo12947c(InterfaceC9936c decoder, String str) {
        C9612q.m13917h(decoder, "decoder");
        return decoder.mo12873a().mo23142d(mo271e(), str);
    }

    /* renamed from: d */
    public InterfaceC14279h<T> mo12946d(Encoder encoder, T value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        return encoder.mo12932a().mo23141e(mo271e(), value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        T t;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (mo12920b.mo12865p()) {
            t = (T) m32977b(mo12920b);
        } else {
            t = null;
            while (true) {
                int mo12866o = mo12920b.mo12866o(getDescriptor());
                if (mo12866o != -1) {
                    if (mo12866o != 0) {
                        if (mo12866o != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.f25329j;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(mo12866o);
                            throw new C14278g(sb2.toString());
                        }
                        T t2 = ref$ObjectRef.f25329j;
                        if (t2 != null) {
                            ref$ObjectRef.f25329j = t2;
                            t = (T) InterfaceC9936c.C9937a.m12859c(mo12920b, getDescriptor(), mo12866o, C14275d.m267a(this, mo12920b, (String) t2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    } else {
                        ref$ObjectRef.f25329j = (T) mo12920b.mo12868m(getDescriptor(), mo12866o);
                    }
                } else if (t != null) {
                    C9612q.m13919f(t, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f25329j)).toString());
                }
            }
        }
        mo12920b.mo12872c(descriptor);
        return t;
    }

    /* renamed from: e */
    public abstract KClass<T> mo271e();

    @Override // p470zi.InterfaceC14279h
    public final void serialize(Encoder encoder, T value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        InterfaceC14279h<? super T> m266b = C14275d.m266b(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor);
        mo12900b.mo12880y(getDescriptor(), 0, m266b.getDescriptor().mo12682i());
        SerialDescriptor descriptor2 = getDescriptor();
        C9612q.m13919f(m266b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        mo12900b.mo12894i(descriptor2, 1, m266b, value);
        mo12900b.mo12899c(descriptor);
    }
}