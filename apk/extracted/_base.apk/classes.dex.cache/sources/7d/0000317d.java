package dj;

import bj.AbstractC2322d;
import bj.AbstractC2325e;
import bj.AbstractC2342h;
import bj.AbstractC2345i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p088ej.InterfaceC6259e;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002JB\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016JF\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016J<\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\fH\u0016J>\u0010\u001c\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u0010\u001b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\fH\u0016R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006$"}, m14357d2 = {"Ldj/m0;", "Lej/e;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/reflect/KClass;", "actualClass", "", "g", "f", "", "T", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "provider", "e", "Base", "Sub", "baseClass", "actualSerializer", "a", "Lzi/h;", "defaultSerializerProvider", "d", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "b", "", "Z", "useArrayPolymorphism", "Ljava/lang/String;", "discriminator", "<init>", "(ZLjava/lang/String;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6001m0 implements InterfaceC6259e {

    /* renamed from: a */
    private final boolean f17057a;

    /* renamed from: b */
    private final String f17058b;

    public C6001m0(boolean z, String discriminator) {
        C9612q.m13917h(discriminator, "discriminator");
        this.f17057a = z;
        this.f17058b = discriminator;
    }

    /* renamed from: f */
    private final void m23910f(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        int mo12687d = serialDescriptor.mo12687d();
        for (int i = 0; i < mo12687d; i++) {
            String mo12686e = serialDescriptor.mo12686e(i);
            if (C9612q.m13922c(mo12686e, this.f17058b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + mo12686e + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: g */
    private final void m23909g(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        AbstractC2342h mo12684g = serialDescriptor.mo12684g();
        if (!(mo12684g instanceof AbstractC2322d) && !C9612q.m13922c(mo12684g, AbstractC2342h.C2343a.f6453a)) {
            if (this.f17057a) {
                return;
            }
            if (!C9612q.m13922c(mo12684g, AbstractC2345i.C2347b.f6456a) && !C9612q.m13922c(mo12684g, AbstractC2345i.C2348c.f6457a) && !(mo12684g instanceof AbstractC2325e) && !(mo12684g instanceof AbstractC2342h.C2344b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + kClass.mo13883l() + " of kind " + mo12684g + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + kClass.mo13883l() + " can't be registered as a subclass for polymorphic serialization because its kind " + mo12684g + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // p088ej.InterfaceC6259e
    /* renamed from: a */
    public <Base, Sub extends Base> void mo23139a(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(actualClass, "actualClass");
        C9612q.m13917h(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        m23909g(descriptor, actualClass);
        if (!this.f17057a) {
            m23910f(descriptor, actualClass);
        }
    }

    @Override // p088ej.InterfaceC6259e
    /* renamed from: b */
    public <Base> void mo23138b(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // p088ej.InterfaceC6259e
    /* renamed from: c */
    public <T> void mo23137c(KClass<T> kClass, KSerializer<T> kSerializer) {
        InterfaceC6259e.C6260a.m23134a(this, kClass, kSerializer);
    }

    @Override // p088ej.InterfaceC6259e
    /* renamed from: d */
    public <Base> void mo23136d(KClass<Base> baseClass, Function1<? super Base, ? extends InterfaceC14279h<? super Base>> defaultSerializerProvider) {
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // p088ej.InterfaceC6259e
    /* renamed from: e */
    public <T> void mo23135e(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        C9612q.m13917h(kClass, "kClass");
        C9612q.m13917h(provider, "provider");
    }
}