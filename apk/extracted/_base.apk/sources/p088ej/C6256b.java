package p088ej;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import p088ej.AbstractC6253a;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B×\u0001\u0012\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u0017\u0012*\u0010\u001b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u0012.\u0010\u001f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001cj\u0006\u0012\u0002\b\u0003`\u001d0\u0017\u0012&\u0010 \u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u00122\u0010\"\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001cj\u0006\u0012\u0002\b\u0003`!0\u0017¢\u0006\u0004\b#\u0010$J9\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R$\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R8\u0010\u001b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R<\u0010\u001f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001cj\u0006\u0012\u0002\b\u0003`\u001d0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R4\u0010 \u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R@\u0010\"\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001cj\u0006\u0012\u0002\b\u0003`!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006%"}, m14357d2 = {"Lej/b;", "Lej/c;", "", "T", "Lkotlin/reflect/KClass;", "baseClass", "value", "Lzi/h;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lzi/h;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "d", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "Lej/e;", "collector", "", "a", "", "Lej/a;", "Ljava/util/Map;", "class2ContextualFactory", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "c", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ej.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6256b extends AbstractC6257c {

    /* renamed from: a */
    private final Map<KClass<?>, AbstractC6253a> f17701a;

    /* renamed from: b */
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> f17702b;

    /* renamed from: c */
    private final Map<KClass<?>, Function1<?, InterfaceC14279h<?>>> f17703c;

    /* renamed from: d */
    private final Map<KClass<?>, Map<String, KSerializer<?>>> f17704d;

    /* renamed from: e */
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> f17705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6256b(Map<KClass<?>, ? extends AbstractC6253a> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> polyBase2Serializers, Map<KClass<?>, ? extends Function1<?, ? extends InterfaceC14279h<?>>> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends Function1<? super String, ? extends DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        C9612q.m13917h(class2ContextualFactory, "class2ContextualFactory");
        C9612q.m13917h(polyBase2Serializers, "polyBase2Serializers");
        C9612q.m13917h(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        C9612q.m13917h(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        C9612q.m13917h(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f17701a = class2ContextualFactory;
        this.f17702b = polyBase2Serializers;
        this.f17703c = polyBase2DefaultSerializerProvider;
        this.f17704d = polyBase2NamedSerializers;
        this.f17705e = polyBase2DefaultDeserializerProvider;
    }

    @Override // p088ej.AbstractC6257c
    /* renamed from: a */
    public void mo23145a(InterfaceC6259e collector) {
        C9612q.m13917h(collector, "collector");
        for (Map.Entry<KClass<?>, AbstractC6253a> entry : this.f17701a.entrySet()) {
            KClass<?> key = entry.getKey();
            AbstractC6253a value = entry.getValue();
            if (value instanceof AbstractC6253a.C6254a) {
                C9612q.m13919f(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> m23148b = ((AbstractC6253a.C6254a) value).m23148b();
                C9612q.m13919f(m23148b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.mo23137c(key, m23148b);
            } else if (value instanceof AbstractC6253a.C6255b) {
                collector.mo23135e(key, ((AbstractC6253a.C6255b) value).m23146b());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>> entry2 : this.f17702b.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                KSerializer<?> value2 = entry3.getValue();
                C9612q.m13919f(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C9612q.m13919f(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C9612q.m13919f(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.mo23139a(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, InterfaceC14279h<?>>> entry4 : this.f17703c.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, InterfaceC14279h<?>> value3 = entry4.getValue();
            C9612q.m13919f(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C9612q.m13919f(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.mo23136d(key4, (Function1) C9604l0.m13938d(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, DeserializationStrategy<?>>> entry5 : this.f17705e.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, DeserializationStrategy<?>> value4 = entry5.getValue();
            C9612q.m13919f(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C9612q.m13919f(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.mo23138b(key5, (Function1) C9604l0.m13938d(value4, 1));
        }
    }

    @Override // p088ej.AbstractC6257c
    /* renamed from: b */
    public <T> KSerializer<T> mo23144b(KClass<T> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers) {
        KSerializer<?> kSerializer;
        C9612q.m13917h(kClass, "kClass");
        C9612q.m13917h(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC6253a abstractC6253a = this.f17701a.get(kClass);
        if (abstractC6253a != null) {
            kSerializer = abstractC6253a.mo23147a(typeArgumentsSerializers);
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            return null;
        }
        return (KSerializer<T>) kSerializer;
    }

    @Override // p088ej.AbstractC6257c
    /* renamed from: d */
    public <T> DeserializationStrategy<T> mo23142d(KClass<? super T> baseClass, String str) {
        KSerializer<?> kSerializer;
        Function1<String, DeserializationStrategy<?>> function1;
        C9612q.m13917h(baseClass, "baseClass");
        Map<String, KSerializer<?>> map = this.f17704d.get(baseClass);
        if (map != null) {
            kSerializer = map.get(str);
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Function1<String, DeserializationStrategy<?>> function12 = this.f17705e.get(baseClass);
        if (C9604l0.m13933i(function12, 1)) {
            function1 = function12;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (DeserializationStrategy<T>) function1.invoke(str);
    }

    @Override // p088ej.AbstractC6257c
    /* renamed from: e */
    public <T> InterfaceC14279h<T> mo23141e(KClass<? super T> baseClass, T value) {
        KSerializer<?> kSerializer;
        Function1<?, InterfaceC14279h<?>> function1;
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(value, "value");
        if (!baseClass.mo13885d(value)) {
            return null;
        }
        Map<KClass<?>, KSerializer<?>> map = this.f17702b.get(baseClass);
        if (map != null) {
            kSerializer = map.get(C9591f0.m13969b(value.getClass()));
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof InterfaceC14279h)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Function1<?, InterfaceC14279h<?>> function12 = this.f17703c.get(baseClass);
        if (C9604l0.m13933i(function12, 1)) {
            function1 = function12;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (InterfaceC14279h<T>) function1.invoke(value);
    }
}
