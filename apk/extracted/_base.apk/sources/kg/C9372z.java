package kg;

import java.lang.reflect.Member;
import kg.AbstractC9231c0;
import kg.C9271j0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11989u0;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\tRF\u0010\u0010\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \r*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f0\f0\u000b8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m14357d2 = {"Lkg/z;", "D", "E", "V", "", "Lkg/c0;", "receiver1", "receiver2", "H", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkg/j0$b;", "Lkg/z$a;", "kotlin.jvm.PlatformType", "v", "Lkg/j0$b;", "_getter", "Lkotlin/Lazy;", "Ljava/lang/reflect/Member;", "w", "Lkotlin/Lazy;", "delegateSource", "I", "()Lkg/z$a;", "getter", "Lkg/p;", "container", "Lqg/u0;", "descriptor", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9372z<D, E, V> extends AbstractC9231c0<V> implements Function2 {

    /* renamed from: v */
    private final C9271j0.C9273b<C9373a<D, E, V>> f24500v;

    /* renamed from: w */
    private final Lazy<Member> f24501w;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0001\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lkg/z$a;", "D", "E", "V", "Lkg/c0$c;", "", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkg/z;", "q", "Lkg/z;", "()Lkg/z;", "property", "<init>", "(Lkg/z;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9373a<D, E, V> extends AbstractC9231c0.AbstractC9234c<V> implements Function2 {

        /* renamed from: q */
        private final C9372z<D, E, V> f24502q;

        /* JADX WARN: Multi-variable type inference failed */
        public C9373a(C9372z<D, E, ? extends V> property) {
            C9612q.m13917h(property, "property");
            this.f24502q = property;
        }

        @Override // kotlin.reflect.KProperty.InterfaceC9629a
        /* renamed from: D */
        public C9372z<D, E, V> mo13881e() {
            return this.f24502q;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D d, E e) {
            return mo13881e().m15771H(d, e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9372z(AbstractC9327p container, InterfaceC11989u0 descriptor) {
        super(container, descriptor);
        Lazy<Member> m7600b;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(descriptor, "descriptor");
        C9271j0.C9273b<C9373a<D, E, V>> m15970b = C9271j0.m15970b(new C9222a0(this));
        C9612q.m13918g(m15970b, "lazy { Getter(this) }");
        this.f24500v = m15970b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9224b0(this));
        this.f24501w = m7600b;
    }

    /* renamed from: H */
    public V m15771H(D d, E e) {
        return mo13882f().call(d, e);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: I */
    public C9373a<D, E, V> mo13882f() {
        C9373a<D, E, V> invoke = this.f24500v.invoke();
        C9612q.m13918g(invoke, "_getter()");
        return invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D d, E e) {
        return m15771H(d, e);
    }
}
