package kotlinx.serialization.json;

import bj.AbstractC2322d;
import bj.C2340g;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p470zi.C14278g;
import p470zi.C14285j;
import p470zi.InterfaceC14279h;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0014\u001a\u00020\u0013H$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m14357d2 = {"Lkotlinx/serialization/json/d;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "subClass", "baseClass", "", "throwSubtypeNotRegistered", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlin/reflect/KClass;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9961d<T> implements KSerializer<T> {
    private final KClass<T> baseClass;
    private final SerialDescriptor descriptor;

    public AbstractC9961d(KClass<T> baseClass) {
        C9612q.m13917h(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = C2340g.m33637d("JsonContentPolymorphicSerializer<" + baseClass.mo13883l() + '>', AbstractC2322d.C2324b.f6436a, new SerialDescriptor[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(KClass<?> kClass, KClass<?> kClass2) {
        String mo13883l = kClass.mo13883l();
        if (mo13883l == null) {
            mo13883l = String.valueOf(kClass);
        }
        throw new C14278g("Class '" + mo13883l + "' is not registered for polymorphic serialization " + ("in the scope of '" + kClass2.mo13883l() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        InterfaceC9962e m12711d = C9972i.m12711d(decoder);
        JsonElement mo12743g = m12711d.mo12743g();
        DeserializationStrategy<T> selectDeserializer = selectDeserializer(mo12743g);
        C9612q.m13919f(selectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) m12711d.mo12744d().m12781d((KSerializer) selectDeserializer, mo12743g);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    protected abstract DeserializationStrategy<T> selectDeserializer(JsonElement jsonElement);

    @Override // p470zi.InterfaceC14279h
    public final void serialize(Encoder encoder, T value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        InterfaceC14279h<T> mo23141e = encoder.mo12932a().mo23141e(this.baseClass, value);
        if (mo23141e == null && (mo23141e = C14285j.m252g(C9591f0.m13969b(value.getClass()))) == null) {
            throwSubtypeNotRegistered(C9591f0.m13969b(value.getClass()), this.baseClass);
            throw new C11568i();
        } else {
            ((KSerializer) mo23141e).serialize(encoder, value);
        }
    }
}
