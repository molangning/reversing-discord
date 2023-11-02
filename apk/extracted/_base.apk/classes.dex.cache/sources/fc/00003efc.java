package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.reflect.Member;
import kg.AbstractC9231c0;
import kg.C9271j0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p140hg.InterfaceC7139h;
import p305qg.InterfaceC11989u0;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB+\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001b\u0010\"J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0007R:\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u000b*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n0\n0\t8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m14357d2 = {"Lkg/y;", "T", "V", "Lhg/h;", "Lkg/c0;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkg/j0$b;", "Lkg/y$a;", "kotlin.jvm.PlatformType", "v", "Lkg/j0$b;", "_getter", "Lkotlin/Lazy;", "Ljava/lang/reflect/Member;", "w", "Lkotlin/Lazy;", "delegateSource", "H", "()Lkg/y$a;", "getter", "Lkg/p;", "container", "Lqg/u0;", "descriptor", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", ZeroconfModule.KEY_SERVICE_NAME, "signature", "", "boundReceiver", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9368y<T, V> extends AbstractC9231c0<V> implements InterfaceC7139h<T, V> {

    /* renamed from: v */
    private final C9271j0.C9273b<C9369a<T, V>> f24495v;

    /* renamed from: w */
    private final Lazy<Member> f24496w;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkg/y$a;", "T", "V", "Lkg/c0$c;", "Lhg/h$a;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkg/y;", "q", "Lkg/y;", "D", "()Lkg/y;", "property", "<init>", "(Lkg/y;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9369a<T, V> extends AbstractC9231c0.AbstractC9234c<V> implements InterfaceC7139h.InterfaceC7140a<T, V> {

        /* renamed from: q */
        private final C9368y<T, V> f24497q;

        /* JADX WARN: Multi-variable type inference failed */
        public C9369a(C9368y<T, ? extends V> property) {
            C9612q.m13917h(property, "property");
            this.f24497q = property;
        }

        @Override // kotlin.reflect.KProperty.InterfaceC9629a
        /* renamed from: D */
        public C9368y<T, V> mo13881e() {
            return this.f24497q;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T t) {
            return mo13881e().get(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"T", "V", "Lkg/y$a;", "kotlin.jvm.PlatformType", "a", "()Lkg/y$a;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9370b extends AbstractC9614s implements Function0<C9369a<T, ? extends V>> {

        /* renamed from: j */
        final /* synthetic */ C9368y<T, V> f24498j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9370b(C9368y<T, ? extends V> c9368y) {
            super(0);
            this.f24498j = c9368y;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C9369a<T, V> invoke() {
            return new C9369a<>(this.f24498j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"T", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.y$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9371c extends AbstractC9614s implements Function0<Member> {

        /* renamed from: j */
        final /* synthetic */ C9368y<T, V> f24499j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9371c(C9368y<T, ? extends V> c9368y) {
            super(0);
            this.f24499j = c9368y;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Member invoke() {
            return this.f24499j.m16023A();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9368y(AbstractC9327p container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Lazy<Member> m7600b;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signature, "signature");
        C9271j0.C9273b<C9369a<T, V>> m15970b = C9271j0.m15970b(new C9370b(this));
        C9612q.m13918g(m15970b, "lazy { Getter(this) }");
        this.f24495v = m15970b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9371c(this));
        this.f24496w = m7600b;
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: H */
    public C9369a<T, V> mo13882f() {
        C9369a<T, V> invoke = this.f24495v.invoke();
        C9612q.m13918g(invoke, "_getter()");
        return invoke;
    }

    @Override // p140hg.InterfaceC7139h
    public V get(T t) {
        return mo13882f().call(t);
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T t) {
        return get(t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9368y(AbstractC9327p container, InterfaceC11989u0 descriptor) {
        super(container, descriptor);
        Lazy<Member> m7600b;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(descriptor, "descriptor");
        C9271j0.C9273b<C9369a<T, V>> m15970b = C9271j0.m15970b(new C9370b(this));
        C9612q.m13918g(m15970b, "lazy { Getter(this) }");
        this.f24495v = m15970b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9371c(this));
        this.f24496w = m7600b;
    }
}