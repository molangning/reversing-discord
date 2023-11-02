package kotlinx.serialization;

import bj.AbstractC2322d;
import bj.AbstractC2342h;
import bj.C2319a;
import bj.C2340g;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p014aj.C0213a;
import p045cj.AbstractC2561b;
import p304qf.C11888u;
import p304qf.C11889v;
import p304qf.InterfaceC11879l;
import p470zi.InterfaceC14279h;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00100&\u0012\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0&¢\u0006\u0004\b)\u0010*BY\b\u0011\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00100&\u0012\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0&\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170&¢\u0006\u0004\b)\u0010,J\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J'\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR0\u0010#\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R(\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006-"}, m14357d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "", "T", "Lcj/b;", "Lkotlinx/serialization/encoding/c;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "c", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzi/h;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lzi/h;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "serialName", "", "subclasses", "subclassSerializers", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "classAnnotations", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class SealedClassSerializer<T> extends AbstractC2561b<T> {

    /* renamed from: a */
    private final KClass<T> f25777a;

    /* renamed from: b */
    private List<? extends Annotation> f25778b;

    /* renamed from: c */
    private final Lazy f25779c;

    /* renamed from: d */
    private final Map<KClass<? extends T>, KSerializer<? extends T>> f25780d;

    /* renamed from: e */
    private final Map<String, KSerializer<? extends T>> f25781e;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.SealedClassSerializer$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9923a extends AbstractC9614s implements Function0<SerialDescriptor> {

        /* renamed from: j */
        final /* synthetic */ String f25782j;

        /* renamed from: k */
        final /* synthetic */ SealedClassSerializer<T> f25783k;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "T", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.SealedClassSerializer$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9924a extends AbstractC9614s implements Function1<C2319a, Unit> {

            /* renamed from: j */
            final /* synthetic */ SealedClassSerializer<T> f25784j;

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "T", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
            /* renamed from: kotlinx.serialization.SealedClassSerializer$a$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
            public static final class C9925a extends AbstractC9614s implements Function1<C2319a, Unit> {

                /* renamed from: j */
                final /* synthetic */ SealedClassSerializer<T> f25785j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C9925a(SealedClassSerializer<T> sealedClassSerializer) {
                    super(1);
                    this.f25785j = sealedClassSerializer;
                }

                /* renamed from: a */
                public final void m12941a(C2319a buildSerialDescriptor) {
                    C9612q.m13917h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : ((SealedClassSerializer) this.f25785j).f25781e.entrySet()) {
                        C2319a.m33654b(buildSerialDescriptor, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), null, false, 12, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
                    m12941a(c2319a);
                    return Unit.f25302a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9924a(SealedClassSerializer<T> sealedClassSerializer) {
                super(1);
                this.f25784j = sealedClassSerializer;
            }

            /* renamed from: a */
            public final void m12942a(C2319a buildSerialDescriptor) {
                C9612q.m13917h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C2319a.m33654b(buildSerialDescriptor, "type", C0213a.m40946E(C9602k0.f25351a).getDescriptor(), null, false, 12, null);
                C2319a.m33654b(buildSerialDescriptor, "value", C2340g.m33638c("kotlinx.serialization.Sealed<" + this.f25784j.mo271e().mo13883l() + '>', AbstractC2342h.C2343a.f6453a, new SerialDescriptor[0], new C9925a(this.f25784j)), null, false, 12, null);
                buildSerialDescriptor.m33648h(((SealedClassSerializer) this.f25784j).f25778b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
                m12942a(c2319a);
                return Unit.f25302a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9923a(String str, SealedClassSerializer<T> sealedClassSerializer) {
            super(0);
            this.f25782j = str;
            this.f25783k = sealedClassSerializer;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SerialDescriptor invoke() {
            return C2340g.m33638c(this.f25782j, AbstractC2322d.C2324b.f6436a, new SerialDescriptor[0], new C9924a(this.f25783k));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"kotlinx/serialization/SealedClassSerializer$b", "Lqf/l;", "", "b", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.SealedClassSerializer$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9926b implements InterfaceC11879l<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> {

        /* renamed from: a */
        final /* synthetic */ Iterable f25786a;

        public C9926b(Iterable iterable) {
            this.f25786a = iterable;
        }

        @Override // p304qf.InterfaceC11879l
        /* renamed from: a */
        public String mo6784a(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry) {
            return entry.getValue().getDescriptor().mo12682i();
        }

        @Override // p304qf.InterfaceC11879l
        /* renamed from: b */
        public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> mo6783b() {
            return this.f25786a.iterator();
        }
    }

    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers) {
        List<? extends Annotation> m14104i;
        Lazy m7600b;
        List m14236J0;
        Map<KClass<? extends T>, KSerializer<? extends T>> m6744r;
        int m6758d;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(subclasses, "subclasses");
        C9612q.m13917h(subclassSerializers, "subclassSerializers");
        this.f25777a = baseClass;
        m14104i = C9545j.m14104i();
        this.f25778b = m14104i;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9923a(serialName, this));
        this.f25779c = m7600b;
        if (subclasses.length == subclassSerializers.length) {
            m14236J0 = C9538f.m14236J0(subclasses, subclassSerializers);
            m6744r = C11889v.m6744r(m14236J0);
            this.f25780d = m6744r;
            InterfaceC11879l c9926b = new C9926b(m6744r.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> mo6783b = c9926b.mo6783b();
            while (mo6783b.hasNext()) {
                T next = mo6783b.next();
                Object mo6784a = c9926b.mo6784a(next);
                Object obj = linkedHashMap.get(mo6784a);
                if (obj == null) {
                    linkedHashMap.containsKey(mo6784a);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str = (String) mo6784a;
                if (entry2 != null) {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + mo271e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
                linkedHashMap.put(mo6784a, entry);
            }
            m6758d = C11888u.m6758d(linkedHashMap.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(m6758d);
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f25781e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + mo271e().mo13883l() + " should be marked @Serializable");
    }

    @Override // p045cj.AbstractC2561b
    /* renamed from: c */
    public DeserializationStrategy<T> mo12947c(InterfaceC9936c decoder, String str) {
        C9612q.m13917h(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.f25781e.get(str);
        if (kSerializer == null) {
            return super.mo12947c(decoder, str);
        }
        return kSerializer;
    }

    @Override // p045cj.AbstractC2561b
    /* renamed from: d */
    public InterfaceC14279h<T> mo12946d(Encoder encoder, T value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        KSerializer<? extends T> kSerializer = this.f25780d.get(C9591f0.m13969b(value.getClass()));
        if (kSerializer == null) {
            kSerializer = super.mo12946d(encoder, value);
        }
        if (kSerializer == null) {
            return null;
        }
        return kSerializer;
    }

    @Override // p045cj.AbstractC2561b
    /* renamed from: e */
    public KClass<T> mo271e() {
        return this.f25777a;
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f25779c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        List<? extends Annotation> m14274d;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(subclasses, "subclasses");
        C9612q.m13917h(subclassSerializers, "subclassSerializers");
        C9612q.m13917h(classAnnotations, "classAnnotations");
        m14274d = C9536e.m14274d(classAnnotations);
        this.f25778b = m14274d;
    }
}
