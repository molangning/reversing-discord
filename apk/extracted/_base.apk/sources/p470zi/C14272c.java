package p470zi;

import bj.AbstractC2322d;
import bj.AbstractC2342h;
import bj.C2319a;
import bj.C2320b;
import bj.C2340g;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.C0213a;
import p045cj.AbstractC2561b;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0011\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m14357d2 = {"Lzi/c;", "", "T", "Lcj/b;", "", "toString", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/KClass;)V", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14272c<T> extends AbstractC2561b<T> {

    /* renamed from: a */
    private final KClass<T> f36678a;

    /* renamed from: b */
    private List<? extends Annotation> f36679b;

    /* renamed from: c */
    private final Lazy f36680c;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: zi.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C14273a extends AbstractC9614s implements Function0<SerialDescriptor> {

        /* renamed from: j */
        final /* synthetic */ C14272c<T> f36681j;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "T", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: zi.c$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C14274a extends AbstractC9614s implements Function1<C2319a, Unit> {

            /* renamed from: j */
            final /* synthetic */ C14272c<T> f36682j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14274a(C14272c<T> c14272c) {
                super(1);
                this.f36682j = c14272c;
            }

            /* renamed from: a */
            public final void m268a(C2319a buildSerialDescriptor) {
                C9612q.m13917h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C2319a.m33654b(buildSerialDescriptor, "type", C0213a.m40946E(C9602k0.f25351a).getDescriptor(), null, false, 12, null);
                C2319a.m33654b(buildSerialDescriptor, "value", C2340g.m33637d("kotlinx.serialization.Polymorphic<" + this.f36682j.mo271e().mo13883l() + '>', AbstractC2342h.C2343a.f6453a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.m33648h(((C14272c) this.f36682j).f36679b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
                m268a(c2319a);
                return Unit.f25302a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14273a(C14272c<T> c14272c) {
            super(0);
            this.f36681j = c14272c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SerialDescriptor invoke() {
            return C2320b.m33645c(C2340g.m33638c("kotlinx.serialization.Polymorphic", AbstractC2322d.C2323a.f6435a, new SerialDescriptor[0], new C14274a(this.f36681j)), this.f36681j.mo271e());
        }
    }

    public C14272c(KClass<T> baseClass) {
        List<? extends Annotation> m14104i;
        Lazy m7600b;
        C9612q.m13917h(baseClass, "baseClass");
        this.f36678a = baseClass;
        m14104i = C9545j.m14104i();
        this.f36679b = m14104i;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C14273a(this));
        this.f36680c = m7600b;
    }

    @Override // p045cj.AbstractC2561b
    /* renamed from: e */
    public KClass<T> mo271e() {
        return this.f36678a;
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f36680c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo271e() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14272c(KClass<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        List<? extends Annotation> m14274d;
        C9612q.m13917h(baseClass, "baseClass");
        C9612q.m13917h(classAnnotations, "classAnnotations");
        m14274d = C9536e.m14274d(classAnnotations);
        this.f36679b = m14274d;
    }
}
