package kg;

import kg.AbstractC9231c0;
import kg.C9271j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import p140hg.InterfaceC7131d;
import p305qg.InterfaceC11989u0;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bRF\u0010\u0011\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000e*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m14357d2 = {"Lkg/t;", "D", "E", "V", "Lkg/z;", "", "receiver1", "receiver2", "value", "", "K", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkg/j0$b;", "Lkg/t$a;", "kotlin.jvm.PlatformType", "x", "Lkg/j0$b;", "_setter", "J", "()Lkg/t$a;", "setter", "Lkg/p;", "container", "Lqg/u0;", "descriptor", "<init>", "(Lkg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9349t<D, E, V> extends C9372z<D, E, V> implements InterfaceC7131d {

    /* renamed from: x */
    private final C9271j0.C9273b<C9350a<D, E, V>> f24461x;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u00042\u0006\u0010\b\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\nR,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0001\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkg/t$a;", "D", "E", "V", "Lkg/c0$d;", "", "receiver1", "receiver2", "value", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkg/t;", "q", "Lkg/t;", "()Lkg/t;", "property", "<init>", "(Lkg/t;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9350a<D, E, V> extends AbstractC9231c0.AbstractC9237d<V> implements Function3 {

        /* renamed from: q */
        private final C9349t<D, E, V> f24462q;

        public C9350a(C9349t<D, E, V> property) {
            C9612q.m13917h(property, "property");
            this.f24462q = property;
        }

        @Override // kotlin.reflect.KProperty.InterfaceC9629a
        /* renamed from: D */
        public C9349t<D, E, V> mo13881e() {
            return this.f24462q;
        }

        /* renamed from: E */
        public void m15807E(D d, E e, V v) {
            mo13881e().m15809K(d, e, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m15807E(obj, obj2, obj3);
            return Unit.f25302a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9349t(AbstractC9327p container, InterfaceC11989u0 descriptor) {
        super(container, descriptor);
        C9612q.m13917h(container, "container");
        C9612q.m13917h(descriptor, "descriptor");
        C9271j0.C9273b<C9350a<D, E, V>> m15970b = C9271j0.m15970b(new C9351u(this));
        C9612q.m13918g(m15970b, "lazy { Setter(this) }");
        this.f24461x = m15970b;
    }

    @Override // p140hg.InterfaceC7131d
    /* renamed from: J */
    public C9350a<D, E, V> mo13897h() {
        C9350a<D, E, V> invoke = this.f24461x.invoke();
        C9612q.m13918g(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: K */
    public void m15809K(D d, E e, V v) {
        mo13897h().call(d, e, v);
    }
}