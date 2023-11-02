package tg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7264g0;
import p142hi.C7307p1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p325rg.InterfaceC12155g;
import p389vh.AbstractC13301g;
import pf.C11577n;
import ph.C11638f;

/* renamed from: tg.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12713l0 extends AbstractC12718m0 implements InterfaceC11936j1 {

    /* renamed from: u */
    public static final C12714a f32961u = new C12714a(null);

    /* renamed from: o */
    private final int f32962o;

    /* renamed from: p */
    private final boolean f32963p;

    /* renamed from: q */
    private final boolean f32964q;

    /* renamed from: r */
    private final boolean f32965r;

    /* renamed from: s */
    private final AbstractC7264g0 f32966s;

    /* renamed from: t */
    private final InterfaceC11936j1 f32967t;

    /* renamed from: tg.l0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12714a {
        private C12714a() {
        }

        public /* synthetic */ C12714a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12713l0 m4372a(InterfaceC11897a containingDeclaration, InterfaceC11936j1 interfaceC11936j1, int i, InterfaceC12155g annotations, C11638f name, AbstractC7264g0 outType, boolean z, boolean z2, boolean z3, AbstractC7264g0 abstractC7264g0, InterfaceC11900a1 source, Function0<? extends List<? extends InterfaceC11943k1>> function0) {
            C9612q.m13917h(containingDeclaration, "containingDeclaration");
            C9612q.m13917h(annotations, "annotations");
            C9612q.m13917h(name, "name");
            C9612q.m13917h(outType, "outType");
            C9612q.m13917h(source, "source");
            if (function0 == null) {
                return new C12713l0(containingDeclaration, interfaceC11936j1, i, annotations, name, outType, z, z2, z3, abstractC7264g0, source);
            }
            return new C12715b(containingDeclaration, interfaceC11936j1, i, annotations, name, outType, z, z2, z3, abstractC7264g0, source, function0);
        }
    }

    /* renamed from: tg.l0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12715b extends C12713l0 {

        /* renamed from: v */
        private final Lazy f32968v;

        /* renamed from: tg.l0$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C12716a extends AbstractC9614s implements Function0<List<? extends InterfaceC11943k1>> {
            C12716a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC11943k1> invoke() {
                return C12715b.this.m4371N0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12715b(InterfaceC11897a containingDeclaration, InterfaceC11936j1 interfaceC11936j1, int i, InterfaceC12155g annotations, C11638f name, AbstractC7264g0 outType, boolean z, boolean z2, boolean z3, AbstractC7264g0 abstractC7264g0, InterfaceC11900a1 source, Function0<? extends List<? extends InterfaceC11943k1>> destructuringVariables) {
            super(containingDeclaration, interfaceC11936j1, i, annotations, name, outType, z, z2, z3, abstractC7264g0, source);
            Lazy m7601a;
            C9612q.m13917h(containingDeclaration, "containingDeclaration");
            C9612q.m13917h(annotations, "annotations");
            C9612q.m13917h(name, "name");
            C9612q.m13917h(outType, "outType");
            C9612q.m13917h(source, "source");
            C9612q.m13917h(destructuringVariables, "destructuringVariables");
            m7601a = C11577n.m7601a(destructuringVariables);
            this.f32968v = m7601a;
        }

        /* renamed from: N0 */
        public final List<InterfaceC11943k1> m4371N0() {
            return (List) this.f32968v.getValue();
        }

        @Override // tg.C12713l0, p305qg.InterfaceC11936j1
        /* renamed from: W */
        public InterfaceC11936j1 mo4370W(InterfaceC11897a newOwner, C11638f newName, int i) {
            C9612q.m13917h(newOwner, "newOwner");
            C9612q.m13917h(newName, "newName");
            InterfaceC12155g annotations = getAnnotations();
            C9612q.m13918g(annotations, "annotations");
            AbstractC7264g0 type = getType();
            C9612q.m13918g(type, "type");
            boolean mo4379A0 = mo4379A0();
            boolean mo4374q0 = mo4374q0();
            boolean mo4375o0 = mo4375o0();
            AbstractC7264g0 mo4373v0 = mo4373v0();
            InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
            C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
            return new C12715b(newOwner, null, i, annotations, newName, type, mo4379A0, mo4374q0, mo4375o0, mo4373v0, NO_SOURCE, new C12716a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12713l0(InterfaceC11897a containingDeclaration, InterfaceC11936j1 interfaceC11936j1, int i, InterfaceC12155g annotations, C11638f name, AbstractC7264g0 outType, boolean z, boolean z2, boolean z3, AbstractC7264g0 abstractC7264g0, InterfaceC11900a1 source) {
        super(containingDeclaration, annotations, name, outType, source);
        InterfaceC11936j1 interfaceC11936j12;
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(outType, "outType");
        C9612q.m13917h(source, "source");
        this.f32962o = i;
        this.f32963p = z;
        this.f32964q = z2;
        this.f32965r = z3;
        this.f32966s = abstractC7264g0;
        if (interfaceC11936j1 == null) {
            interfaceC11936j12 = this;
        } else {
            interfaceC11936j12 = interfaceC11936j1;
        }
        this.f32967t = interfaceC11936j12;
    }

    /* renamed from: K0 */
    public static final C12713l0 m4378K0(InterfaceC11897a interfaceC11897a, InterfaceC11936j1 interfaceC11936j1, int i, InterfaceC12155g interfaceC12155g, C11638f c11638f, AbstractC7264g0 abstractC7264g0, boolean z, boolean z2, boolean z3, AbstractC7264g0 abstractC7264g02, InterfaceC11900a1 interfaceC11900a1, Function0<? extends List<? extends InterfaceC11943k1>> function0) {
        return f32961u.m4372a(interfaceC11897a, interfaceC11936j1, i, interfaceC12155g, c11638f, abstractC7264g0, z, z2, z3, abstractC7264g02, interfaceC11900a1, function0);
    }

    @Override // p305qg.InterfaceC11936j1
    /* renamed from: A0 */
    public boolean mo4379A0() {
        if (this.f32963p) {
            InterfaceC11897a mo4163b = mo4163b();
            C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((InterfaceC11902b) mo4163b).mo4305g().m6727a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p305qg.InterfaceC11943k1
    /* renamed from: L */
    public boolean mo4342L() {
        return false;
    }

    /* renamed from: L0 */
    public Void m4377L0() {
        return null;
    }

    @Override // p305qg.InterfaceC11909c1
    /* renamed from: M0 */
    public InterfaceC11936j1 mo4225c(C7307p1 substitutor) {
        C9612q.m13917h(substitutor, "substitutor");
        if (substitutor.m21023k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p305qg.InterfaceC11936j1
    /* renamed from: W */
    public InterfaceC11936j1 mo4370W(InterfaceC11897a newOwner, C11638f newName, int i) {
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(newName, "newName");
        InterfaceC12155g annotations = getAnnotations();
        C9612q.m13918g(annotations, "annotations");
        AbstractC7264g0 type = getType();
        C9612q.m13918g(type, "type");
        boolean mo4379A0 = mo4379A0();
        boolean mo4374q0 = mo4374q0();
        boolean mo4375o0 = mo4375o0();
        AbstractC7264g0 mo4373v0 = mo4373v0();
        InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
        C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
        return new C12713l0(newOwner, null, i, annotations, newName, type, mo4379A0, mo4374q0, mo4375o0, mo4373v0, NO_SOURCE);
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: d */
    public Collection<InterfaceC11936j1> mo4310d() {
        int m14093t;
        Collection<? extends InterfaceC11897a> mo4310d = mo4163b().mo4310d();
        C9612q.m13918g(mo4310d, "containingDeclaration.overriddenDescriptors");
        m14093t = C9546k.m14093t(mo4310d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11897a interfaceC11897a : mo4310d) {
            arrayList.add(interfaceC11897a.mo4301i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> visitor, D d) {
        C9612q.m13917h(visitor, "visitor");
        return visitor.mo4391d(this, d);
    }

    @Override // p305qg.InterfaceC11936j1
    public int getIndex() {
        return this.f32962o;
    }

    @Override // p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u LOCAL = C11974t.f30971f;
        C9612q.m13918g(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // p305qg.InterfaceC11943k1
    /* renamed from: n0 */
    public /* bridge */ /* synthetic */ AbstractC13301g mo4339n0() {
        return (AbstractC13301g) m4377L0();
    }

    @Override // p305qg.InterfaceC11936j1
    /* renamed from: o0 */
    public boolean mo4375o0() {
        return this.f32965r;
    }

    @Override // p305qg.InterfaceC11936j1
    /* renamed from: q0 */
    public boolean mo4374q0() {
        return this.f32964q;
    }

    @Override // p305qg.InterfaceC11936j1
    /* renamed from: v0 */
    public AbstractC7264g0 mo4373v0() {
        return this.f32966s;
    }

    @Override // tg.AbstractC12710k, p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11897a mo4163b() {
        InterfaceC11947m mo4163b = super.mo4163b();
        C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC11897a) mo4163b;
    }

    @Override // tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11936j1 mo4221a() {
        InterfaceC11936j1 interfaceC11936j1 = this.f32967t;
        return interfaceC11936j1 == this ? this : interfaceC11936j1.mo4221a();
    }
}
