package tg;

import ai.InterfaceC0194h;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7276i0;
import p142hi.C7320s1;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.AbstractC11988u;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11966p;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import tg.C12707j0;

/* renamed from: tg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12687d extends AbstractC12710k implements InterfaceC11917e1 {

    /* renamed from: n */
    private final AbstractC11988u f32907n;

    /* renamed from: o */
    private List<? extends InterfaceC11920f1> f32908o;

    /* renamed from: p */
    private final C12690c f32909p;

    /* renamed from: tg.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12688a extends AbstractC9614s implements Function1<AbstractC7592g, AbstractC7302o0> {
        C12688a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7302o0 invoke(AbstractC7592g abstractC7592g) {
            InterfaceC11927h mo20278f = abstractC7592g.mo20278f(AbstractC12687d.this);
            if (mo20278f != null) {
                return mo20278f.mo4224p();
            }
            return null;
        }
    }

    /* renamed from: tg.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12689b extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {
        C12689b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 type) {
            boolean z;
            C9612q.m13918g(type, "type");
            boolean z2 = false;
            if (!C7276i0.m21083a(type)) {
                AbstractC12687d abstractC12687d = AbstractC12687d.this;
                InterfaceC11927h mo2788p = type.mo3564N0().mo2788p();
                if ((mo2788p instanceof InterfaceC11920f1) && !C9612q.m13922c(((InterfaceC11920f1) mo2788p).mo4163b(), abstractC12687d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: tg.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12690c implements InterfaceC7265g1 {
        C12690c() {
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: c */
        public InterfaceC11917e1 mo2788p() {
            return AbstractC12687d.this;
        }

        @Override // p142hi.InterfaceC7265g1
        public List<InterfaceC11920f1> getParameters() {
            return AbstractC12687d.this.mo4476M0();
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: m */
        public Collection<AbstractC7264g0> mo2791m() {
            Collection<AbstractC7264g0> mo2791m = mo2788p().mo6719t0().mo3564N0().mo2791m();
            C9612q.m13918g(mo2791m, "declarationDescriptor.un…pe.constructor.supertypes");
            return mo2791m;
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: n */
        public AbstractC10870h mo2790n() {
            return C13801c.m1505j(mo2788p());
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: o */
        public InterfaceC7265g1 mo2789o(AbstractC7592g kotlinTypeRefiner) {
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: q */
        public boolean mo2787q() {
            return true;
        }

        public String toString() {
            return "[typealias " + mo2788p().getName().m7426b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12687d(InterfaceC11947m containingDeclaration, InterfaceC12155g annotations, C11638f name, InterfaceC11900a1 sourceElement, AbstractC11988u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(sourceElement, "sourceElement");
        C9612q.m13917h(visibilityImpl, "visibilityImpl");
        this.f32907n = visibilityImpl;
        this.f32909p = new C12690c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final AbstractC7302o0 m4480G0() {
        InterfaceC0194h interfaceC0194h;
        InterfaceC11914e mo6720s = mo6720s();
        if (mo6720s == null || (interfaceC0194h = mo6720s.mo4227T()) == null) {
            interfaceC0194h = InterfaceC0194h.C0197b.f649b;
        }
        AbstractC7302o0 m20973v = C7320s1.m20973v(this, interfaceC0194h, new C12688a());
        C9612q.m13918g(m20973v, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return m20973v;
    }

    /* renamed from: J */
    protected abstract InterfaceC6821n mo4479J();

    @Override // tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: K0 */
    public InterfaceC11917e1 mo4221a() {
        InterfaceC11966p mo4221a = super.mo4221a();
        C9612q.m13919f(mo4221a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (InterfaceC11917e1) mo4221a;
    }

    /* renamed from: L0 */
    public final Collection<InterfaceC12705i0> m4477L0() {
        List m14104i;
        InterfaceC11914e mo6720s = mo6720s();
        if (mo6720s == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        Collection<InterfaceC11910d> mo4171l = mo6720s.mo4171l();
        C9612q.m13918g(mo4171l, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC11910d it : mo4171l) {
            C12707j0.C12708a c12708a = C12707j0.f32948R;
            InterfaceC6821n mo4479J = mo4479J();
            C9612q.m13918g(it, "it");
            InterfaceC12705i0 m4410b = c12708a.m4410b(mo4479J, this, it);
            if (m4410b != null) {
                arrayList.add(m4410b);
            }
        }
        return arrayList;
    }

    /* renamed from: M0 */
    protected abstract List<InterfaceC11920f1> mo4476M0();

    /* renamed from: N0 */
    public final void m4475N0(List<? extends InterfaceC11920f1> declaredTypeParameters) {
        C9612q.m13917h(declaredTypeParameters, "declaredTypeParameters");
        this.f32908o = declaredTypeParameters;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return false;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> visitor, D d) {
        C9612q.m13917h(visitor, "visitor");
        return visitor.mo4383l(this, d);
    }

    @Override // p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        return this.f32907n;
    }

    @Override // p305qg.InterfaceC11911d0
    public boolean isExternal() {
        return false;
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        return this.f32909p;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return false;
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: q */
    public List<InterfaceC11920f1> mo4168q() {
        List list = this.f32908o;
        if (list == null) {
            C9612q.m13900y("declaredTypeParametersImpl");
            return null;
        }
        return list;
    }

    @Override // tg.AbstractC12706j
    public String toString() {
        return "typealias " + getName().m7426b();
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: z */
    public boolean mo4164z() {
        return C7320s1.m20992c(mo6719t0(), new C12689b());
    }
}
