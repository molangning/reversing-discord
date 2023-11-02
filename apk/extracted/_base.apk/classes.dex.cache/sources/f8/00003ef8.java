package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kg.AbstractC9231c0;
import kg.C9271j0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p140hg.InterfaceC7137g;
import p305qg.InterfaceC11989u0;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB+\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001fJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0005R.\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \t*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\b0\u00078\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m14357d2 = {"Lkg/x;", "V", "Lhg/g;", "Lkg/c0;", "get", "()Ljava/lang/Object;", "invoke", "Lkg/j0$b;", "Lkg/x$a;", "kotlin.jvm.PlatformType", "v", "Lkg/j0$b;", "_getter", "Lkotlin/Lazy;", "", "w", "Lkotlin/Lazy;", "delegateValue", "H", "()Lkg/x$a;", "getter", "Lkg/p;", "container", "Lqg/u0;", "descriptor", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", ZeroconfModule.KEY_SERVICE_NAME, "signature", "boundReceiver", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9364x<V> extends AbstractC9231c0<V> implements InterfaceC7137g<V> {

    /* renamed from: v */
    private final C9271j0.C9273b<C9365a<V>> f24490v;

    /* renamed from: w */
    private final Lazy<Object> f24491w;

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lkg/x$a;", "R", "Lkg/c0$c;", "Lhg/g$a;", "invoke", "()Ljava/lang/Object;", "Lkg/x;", "q", "Lkg/x;", "D", "()Lkg/x;", "property", "<init>", "(Lkg/x;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9365a<R> extends AbstractC9231c0.AbstractC9234c<R> implements InterfaceC7137g.InterfaceC7138a<R> {

        /* renamed from: q */
        private final C9364x<R> f24492q;

        /* JADX WARN: Multi-variable type inference failed */
        public C9365a(C9364x<? extends R> property) {
            C9612q.m13917h(property, "property");
            this.f24492q = property;
        }

        @Override // kotlin.reflect.KProperty.InterfaceC9629a
        /* renamed from: D */
        public C9364x<R> mo13881e() {
            return this.f24492q;
        }

        @Override // kotlin.jvm.functions.Function0
        public R invoke() {
            return mo13881e().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"V", "Lkg/x$a;", "kotlin.jvm.PlatformType", "a", "()Lkg/x$a;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9366b extends AbstractC9614s implements Function0<C9365a<? extends V>> {

        /* renamed from: j */
        final /* synthetic */ C9364x<V> f24493j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9366b(C9364x<? extends V> c9364x) {
            super(0);
            this.f24493j = c9364x;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C9365a<V> invoke() {
            return new C9365a<>(this.f24493j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "V", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.x$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9367c extends AbstractC9614s implements Function0<Object> {

        /* renamed from: j */
        final /* synthetic */ C9364x<V> f24494j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9367c(C9364x<? extends V> c9364x) {
            super(0);
            this.f24494j = c9364x;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C9364x<V> c9364x = this.f24494j;
            return c9364x.m16021C(c9364x.m16023A(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9364x(AbstractC9327p container, InterfaceC11989u0 descriptor) {
        super(container, descriptor);
        Lazy<Object> m7600b;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(descriptor, "descriptor");
        C9271j0.C9273b<C9365a<V>> m15970b = C9271j0.m15970b(new C9366b(this));
        C9612q.m13918g(m15970b, "lazy { Getter(this) }");
        this.f24490v = m15970b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9367c(this));
        this.f24491w = m7600b;
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: H */
    public C9365a<V> mo13882f() {
        C9365a<V> invoke = this.f24490v.invoke();
        C9612q.m13918g(invoke, "_getter()");
        return invoke;
    }

    @Override // p140hg.InterfaceC7137g
    public V get() {
        return mo13882f().call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public V invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9364x(AbstractC9327p container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Lazy<Object> m7600b;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signature, "signature");
        C9271j0.C9273b<C9365a<V>> m15970b = C9271j0.m15970b(new C9366b(this));
        C9612q.m13918g(m15970b, "lazy { Getter(this) }");
        this.f24490v = m15970b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9367c(this));
        this.f24491w = m7600b;
    }
}