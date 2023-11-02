package kg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kg.AbstractC9231c0;
import kg.C9271j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p140hg.InterfaceC7133e;
import p305qg.InterfaceC11989u0;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m14357d2 = {"Lkg/s;", "T", "V", "Lkg/y;", "Lhg/e;", "receiver", "value", "", "J", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkg/j0$b;", "Lkg/s$a;", "kotlin.jvm.PlatformType", "x", "Lkg/j0$b;", "_setter", "I", "()Lkg/s$a;", "setter", "Lkg/p;", "container", "Lqg/u0;", "descriptor", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", ZeroconfModule.KEY_SERVICE_NAME, "signature", "", "boundReceiver", "(Lkg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9346s<T, V> extends C9368y<T, V> implements InterfaceC7133e<T, V> {

    /* renamed from: x */
    private final C9271j0.C9273b<C9347a<T, V>> f24458x;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkg/s$a;", "T", "V", "Lkg/c0$d;", "Lhg/e$a;", "receiver", "value", "", "E", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkg/s;", "q", "Lkg/s;", "D", "()Lkg/s;", "property", "<init>", "(Lkg/s;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9347a<T, V> extends AbstractC9231c0.AbstractC9237d<V> implements InterfaceC7133e.InterfaceC7134a<T, V> {

        /* renamed from: q */
        private final C9346s<T, V> f24459q;

        public C9347a(C9346s<T, V> property) {
            C9612q.m13917h(property, "property");
            this.f24459q = property;
        }

        @Override // kotlin.reflect.KProperty.InterfaceC9629a
        /* renamed from: D */
        public C9346s<T, V> mo13881e() {
            return this.f24459q;
        }

        /* renamed from: E */
        public void m15812E(T t, V v) {
            mo13881e().m15814J(t, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m15812E(obj, obj2);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"T", "V", "Lkg/s$a;", "kotlin.jvm.PlatformType", "a", "()Lkg/s$a;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9348b extends AbstractC9614s implements Function0<C9347a<T, V>> {

        /* renamed from: j */
        final /* synthetic */ C9346s<T, V> f24460j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9348b(C9346s<T, V> c9346s) {
            super(0);
            this.f24460j = c9346s;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C9347a<T, V> invoke() {
            return new C9347a<>(this.f24460j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9346s(AbstractC9327p container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        C9612q.m13917h(container, "container");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signature, "signature");
        C9271j0.C9273b<C9347a<T, V>> m15970b = C9271j0.m15970b(new C9348b(this));
        C9612q.m13918g(m15970b, "lazy { Setter(this) }");
        this.f24458x = m15970b;
    }

    @Override // p140hg.InterfaceC7133e, p140hg.InterfaceC7131d
    /* renamed from: I */
    public C9347a<T, V> mo13897h() {
        C9347a<T, V> invoke = this.f24458x.invoke();
        C9612q.m13918g(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: J */
    public void m15814J(T t, V v) {
        mo13897h().call(t, v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9346s(AbstractC9327p container, InterfaceC11989u0 descriptor) {
        super(container, descriptor);
        C9612q.m13917h(container, "container");
        C9612q.m13917h(descriptor, "descriptor");
        C9271j0.C9273b<C9347a<T, V>> m15970b = C9271j0.m15970b(new C9348b(this));
        C9612q.m13918g(m15970b, "lazy { Setter(this) }");
        this.f24458x = m15970b;
    }
}