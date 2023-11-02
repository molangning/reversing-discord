package tg;

import bi.InterfaceC2314f;
import bi.InterfaceC2315g;
import gi.InterfaceC6816j;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7229d0;
import p142hi.C7307p1;
import p142hi.C7319s0;
import p142hi.EnumC7336w1;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import ph.C11640h;
import th.C12756d;

/* renamed from: tg.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12707j0 extends AbstractC12727p implements InterfaceC12705i0 {

    /* renamed from: N */
    private final InterfaceC6821n f32950N;

    /* renamed from: O */
    private final InterfaceC11917e1 f32951O;

    /* renamed from: P */
    private final InterfaceC6816j f32952P;

    /* renamed from: Q */
    private InterfaceC11910d f32953Q;

    /* renamed from: S */
    static final /* synthetic */ KProperty<Object>[] f32949S = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C12707j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: R */
    public static final C12708a f32948R = new C12708a(null);

    /* renamed from: tg.j0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12708a {
        private C12708a() {
        }

        public /* synthetic */ C12708a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C7307p1 m4409c(InterfaceC11917e1 interfaceC11917e1) {
            if (interfaceC11917e1.mo6720s() == null) {
                return null;
            }
            return C7307p1.m21028f(interfaceC11917e1.mo6721F());
        }

        /* renamed from: b */
        public final InterfaceC12705i0 m4410b(InterfaceC6821n storageManager, InterfaceC11917e1 typeAliasDescriptor, InterfaceC11910d constructor) {
            InterfaceC11910d mo4225c;
            List<InterfaceC11997x0> m14104i;
            List<InterfaceC11997x0> list;
            int m14093t;
            C9612q.m13917h(storageManager, "storageManager");
            C9612q.m13917h(typeAliasDescriptor, "typeAliasDescriptor");
            C9612q.m13917h(constructor, "constructor");
            C7307p1 m4409c = m4409c(typeAliasDescriptor);
            InterfaceC11997x0 interfaceC11997x0 = null;
            if (m4409c == null || (mo4225c = constructor.mo4225c(m4409c)) == null) {
                return null;
            }
            InterfaceC12155g annotations = constructor.getAnnotations();
            InterfaceC11902b.EnumC11903a mo4305g = constructor.mo4305g();
            C9612q.m13918g(mo4305g, "constructor.kind");
            InterfaceC11900a1 mo4160j = typeAliasDescriptor.mo4160j();
            C9612q.m13918g(mo4160j, "typeAliasDescriptor.source");
            C12707j0 c12707j0 = new C12707j0(storageManager, typeAliasDescriptor, mo4225c, null, annotations, mo4305g, mo4160j, null);
            List<InterfaceC11936j1> m4326O0 = AbstractC12727p.m4326O0(c12707j0, constructor.mo4301i(), m4409c);
            if (m4326O0 == null) {
                return null;
            }
            AbstractC7302o0 m21191c = C7229d0.m21191c(mo4225c.getReturnType().mo20916Q0());
            AbstractC7302o0 mo4224p = typeAliasDescriptor.mo4224p();
            C9612q.m13918g(mo4224p, "typeAliasDescriptor.defaultType");
            AbstractC7302o0 m20996j = C7319s0.m20996j(m21191c, mo4224p);
            InterfaceC11997x0 mo4332I = constructor.mo4332I();
            if (mo4332I != null) {
                interfaceC11997x0 = C12756d.m4134i(c12707j0, m4409c.m21020n(mo4332I.getType(), EnumC7336w1.INVARIANT), InterfaceC12155g.f31603f.m6037b());
            }
            InterfaceC11997x0 interfaceC11997x02 = interfaceC11997x0;
            InterfaceC11914e mo6720s = typeAliasDescriptor.mo6720s();
            if (mo6720s != null) {
                List<InterfaceC11997x0> mo4295x0 = constructor.mo4295x0();
                C9612q.m13918g(mo4295x0, "constructor.contextReceiverParameters");
                m14093t = C9546k.m14093t(mo4295x0, 10);
                list = new ArrayList<>(m14093t);
                for (InterfaceC11997x0 interfaceC11997x03 : mo4295x0) {
                    AbstractC7264g0 m21020n = m4409c.m21020n(interfaceC11997x03.getType(), EnumC7336w1.INVARIANT);
                    InterfaceC2315g value = interfaceC11997x03.getValue();
                    C9612q.m13919f(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    list.add(C12756d.m4140c(mo6720s, m21020n, ((InterfaceC2314f) value).mo33659a(), InterfaceC12155g.f31603f.m6037b()));
                }
            } else {
                m14104i = C9545j.m14104i();
                list = m14104i;
            }
            c12707j0.mo4323R0(interfaceC11997x02, null, list, typeAliasDescriptor.mo4168q(), m4326O0, m20996j, EnumC11915e0.FINAL, typeAliasDescriptor.getVisibility());
            return c12707j0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.j0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12709b extends AbstractC9614s implements Function0<C12707j0> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC11910d f32955k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12709b(InterfaceC11910d interfaceC11910d) {
            super(0);
            C12707j0.this = r1;
            this.f32955k = interfaceC11910d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C12707j0 invoke() {
            int m14093t;
            InterfaceC6821n m4421J = C12707j0.this.m4421J();
            InterfaceC11917e1 m4413o1 = C12707j0.this.m4413o1();
            InterfaceC11910d interfaceC11910d = this.f32955k;
            C12707j0 c12707j0 = C12707j0.this;
            InterfaceC12155g annotations = interfaceC11910d.getAnnotations();
            InterfaceC11902b.EnumC11903a mo4305g = this.f32955k.mo4305g();
            C9612q.m13918g(mo4305g, "underlyingConstructorDescriptor.kind");
            InterfaceC11900a1 mo4160j = C12707j0.this.m4413o1().mo4160j();
            C9612q.m13918g(mo4160j, "typeAliasDescriptor.source");
            C12707j0 c12707j02 = new C12707j0(m4421J, m4413o1, interfaceC11910d, c12707j0, annotations, mo4305g, mo4160j, null);
            C12707j0 c12707j03 = C12707j0.this;
            InterfaceC11910d interfaceC11910d2 = this.f32955k;
            C7307p1 m4409c = C12707j0.f32948R.m4409c(c12707j03.m4413o1());
            InterfaceC11997x0 interfaceC11997x0 = null;
            if (m4409c == null) {
                return null;
            }
            InterfaceC11997x0 mo4332I = interfaceC11910d2.mo4332I();
            if (mo4332I != null) {
                interfaceC11997x0 = mo4332I.mo4225c(m4409c);
            }
            List<InterfaceC11997x0> mo4295x0 = interfaceC11910d2.mo4295x0();
            C9612q.m13918g(mo4295x0, "underlyingConstructorDes…contextReceiverParameters");
            m14093t = C9546k.m14093t(mo4295x0, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC11997x0 interfaceC11997x02 : mo4295x0) {
                arrayList.add(interfaceC11997x02.mo4225c(m4409c));
            }
            c12707j02.mo4323R0(null, interfaceC11997x0, arrayList, c12707j03.m4413o1().mo4168q(), c12707j03.mo4301i(), c12707j03.getReturnType(), EnumC11915e0.FINAL, c12707j03.m4413o1().getVisibility());
            return c12707j02;
        }
    }

    private C12707j0(InterfaceC6821n interfaceC6821n, InterfaceC11917e1 interfaceC11917e1, InterfaceC11910d interfaceC11910d, InterfaceC12705i0 interfaceC12705i0, InterfaceC12155g interfaceC12155g, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11917e1, interfaceC12705i0, interfaceC12155g, C11640h.f30226j, enumC11903a, interfaceC11900a1);
        this.f32950N = interfaceC6821n;
        this.f32951O = interfaceC11917e1;
        m4319V0(m4413o1().mo4178U());
        this.f32952P = interfaceC6821n.mo21865e(new C12709b(interfaceC11910d));
        this.f32953Q = interfaceC11910d;
    }

    public /* synthetic */ C12707j0(InterfaceC6821n interfaceC6821n, InterfaceC11917e1 interfaceC11917e1, InterfaceC11910d interfaceC11910d, InterfaceC12705i0 interfaceC12705i0, InterfaceC12155g interfaceC12155g, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6821n, interfaceC11917e1, interfaceC11910d, interfaceC12705i0, interfaceC12155g, enumC11903a, interfaceC11900a1);
    }

    /* renamed from: J */
    public final InterfaceC6821n m4421J() {
        return this.f32950N;
    }

    @Override // tg.InterfaceC12705i0
    /* renamed from: P */
    public InterfaceC11910d mo4420P() {
        return this.f32953Q;
    }

    @Override // p305qg.InterfaceC11944l
    /* renamed from: a0 */
    public boolean mo4419a0() {
        return mo4420P().mo4419a0();
    }

    @Override // p305qg.InterfaceC11944l
    /* renamed from: b0 */
    public InterfaceC11914e mo4418b0() {
        InterfaceC11914e mo4418b0 = mo4420P().mo4418b0();
        C9612q.m13918g(mo4418b0, "underlyingConstructorDescriptor.constructedClass");
        return mo4418b0;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11897a
    public AbstractC7264g0 getReturnType() {
        AbstractC7264g0 returnType = super.getReturnType();
        C9612q.m13920e(returnType);
        return returnType;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11902b
    /* renamed from: k1 */
    public InterfaceC12705i0 mo4317X(InterfaceC11947m newOwner, EnumC11915e0 modality, AbstractC11988u visibility, InterfaceC11902b.EnumC11903a kind, boolean z) {
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(modality, "modality");
        C9612q.m13917h(visibility, "visibility");
        C9612q.m13917h(kind, "kind");
        InterfaceC11998y build = mo4296u().mo4266e(newOwner).mo4252s(modality).mo4264g(visibility).mo4253r(kind).mo4258m(z).build();
        C9612q.m13919f(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC12705i0) build;
    }

    @Override // tg.AbstractC12727p
    /* renamed from: l1 */
    public C12707j0 mo4330L0(InterfaceC11947m newOwner, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a kind, C11638f c11638f, InterfaceC12155g annotations, InterfaceC11900a1 source) {
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(source, "source");
        InterfaceC11902b.EnumC11903a enumC11903a = InterfaceC11902b.EnumC11903a.DECLARATION;
        if (kind != enumC11903a) {
            InterfaceC11902b.EnumC11903a enumC11903a2 = InterfaceC11902b.EnumC11903a.SYNTHESIZED;
        }
        return new C12707j0(this.f32950N, m4413o1(), mo4420P(), this, annotations, enumC11903a, source);
    }

    @Override // tg.AbstractC12710k, p305qg.InterfaceC11947m
    /* renamed from: m1 */
    public InterfaceC11917e1 mo4163b() {
        return m4413o1();
    }

    @Override // tg.AbstractC12727p, tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: n1 */
    public InterfaceC12705i0 mo4221a() {
        InterfaceC11998y mo4221a = super.mo4221a();
        C9612q.m13919f(mo4221a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC12705i0) mo4221a;
    }

    /* renamed from: o1 */
    public InterfaceC11917e1 m4413o1() {
        return this.f32951O;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y, p305qg.InterfaceC11909c1
    /* renamed from: p1 */
    public InterfaceC12705i0 mo4225c(C7307p1 substitutor) {
        C9612q.m13917h(substitutor, "substitutor");
        InterfaceC11998y mo4225c = super.mo4225c(substitutor);
        C9612q.m13919f(mo4225c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C12707j0 c12707j0 = (C12707j0) mo4225c;
        C7307p1 m21028f = C7307p1.m21028f(c12707j0.getReturnType());
        C9612q.m13918g(m21028f, "create(substitutedTypeAliasConstructor.returnType)");
        InterfaceC11910d mo4225c2 = mo4420P().mo4221a().mo4225c(m21028f);
        if (mo4225c2 == null) {
            return null;
        }
        c12707j0.f32953Q = mo4225c2;
        return c12707j0;
    }
}