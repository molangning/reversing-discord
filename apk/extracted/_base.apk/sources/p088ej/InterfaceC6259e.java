package p088ej;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016JB\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\u000b\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\tH&JF\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u0001\"\b\b\u0001\u0010\u000e*\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&J<\u0010\u0015\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00130\tH&J>\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00170\tH&¨\u0006\u001a"}, m14357d2 = {"Lej/e;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "c", "Lkotlin/Function1;", "", "provider", "e", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "a", "Lzi/h;", "defaultSerializerProvider", "d", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "b", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ej.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC6259e {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: ej.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6260a {

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkotlinx/serialization/KSerializer;", "it", "a", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: ej.e$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C6261a extends AbstractC9614s implements Function1<List<? extends KSerializer<?>>, KSerializer<?>> {

            /* renamed from: j */
            final /* synthetic */ KSerializer<T> f17706j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6261a(KSerializer<T> kSerializer) {
                super(1);
                this.f17706j = kSerializer;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final KSerializer<?> invoke(List<? extends KSerializer<?>> it) {
                C9612q.m13917h(it, "it");
                return this.f17706j;
            }
        }

        /* renamed from: a */
        public static <T> void m23134a(InterfaceC6259e interfaceC6259e, KClass<T> kClass, KSerializer<T> serializer) {
            C9612q.m13917h(kClass, "kClass");
            C9612q.m13917h(serializer, "serializer");
            interfaceC6259e.mo23135e(kClass, new C6261a(serializer));
        }
    }

    /* renamed from: a */
    <Base, Sub extends Base> void mo23139a(KClass<Base> kClass, KClass<Sub> kClass2, KSerializer<Sub> kSerializer);

    /* renamed from: b */
    <Base> void mo23138b(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1);

    /* renamed from: c */
    <T> void mo23137c(KClass<T> kClass, KSerializer<T> kSerializer);

    /* renamed from: d */
    <Base> void mo23136d(KClass<Base> kClass, Function1<? super Base, ? extends InterfaceC14279h<? super Base>> function1);

    /* renamed from: e */
    <T> void mo23135e(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);
}
