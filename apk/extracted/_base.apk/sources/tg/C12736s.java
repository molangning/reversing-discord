package tg;

import ai.C0205m;
import ai.InterfaceC0194h;
import gi.C6795f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7297n1;
import p142hi.AbstractC7302o0;
import p142hi.C7267h0;
import p142hi.C7289l;
import p142hi.C7301o;
import p142hi.C7307p1;
import p142hi.C7320s1;
import p142hi.C7322t;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.AbstractC11930h1;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11997x0;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import th.C12758e;

/* renamed from: tg.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12736s extends AbstractC12739t {

    /* renamed from: k */
    private final AbstractC12739t f33055k;

    /* renamed from: l */
    private final C7307p1 f33056l;

    /* renamed from: m */
    private C7307p1 f33057m;

    /* renamed from: n */
    private List<InterfaceC11920f1> f33058n;

    /* renamed from: o */
    private List<InterfaceC11920f1> f33059o;

    /* renamed from: p */
    private InterfaceC7265g1 f33060p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12737a implements Function1<InterfaceC11920f1, Boolean> {
        C12737a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public Boolean invoke(InterfaceC11920f1 interfaceC11920f1) {
            return Boolean.valueOf(!interfaceC11920f1.mo4466O());
        }
    }

    /* renamed from: tg.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    class C12738b implements Function1<AbstractC7302o0, AbstractC7302o0> {
        C12738b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public AbstractC7302o0 invoke(AbstractC7302o0 abstractC7302o0) {
            return C12736s.this.m4229M0(abstractC7302o0);
        }
    }

    public C12736s(AbstractC12739t abstractC12739t, C7307p1 c7307p1) {
        this.f33055k = abstractC12739t;
        this.f33056l = c7307p1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[ADDED_TO_REGION] */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m4235E0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C12736s.m4235E0(int):void");
    }

    /* renamed from: K0 */
    private C7307p1 m4231K0() {
        List<InterfaceC11920f1> m14060P;
        if (this.f33057m == null) {
            if (this.f33056l.m21023k()) {
                this.f33057m = this.f33056l;
            } else {
                List<InterfaceC11920f1> parameters = this.f33055k.mo4173k().getParameters();
                this.f33058n = new ArrayList(parameters.size());
                this.f33057m = C7322t.m20965b(parameters, this.f33056l.m21024j(), this, this.f33058n);
                m14060P = C9553r.m14060P(this.f33058n, new C12737a());
                this.f33059o = m14060P;
            }
        }
        return this.f33057m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public AbstractC7302o0 m4229M0(AbstractC7302o0 abstractC7302o0) {
        if (abstractC7302o0 != null && !this.f33056l.m21023k()) {
            return (AbstractC7302o0) m4231K0().m21018p(abstractC7302o0, EnumC7336w1.INVARIANT);
        }
        return abstractC7302o0;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: C */
    public InterfaceC11910d mo4187C() {
        return this.f33055k.mo4187C();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: I0 */
    public boolean mo4185I0() {
        return this.f33055k.mo4185I0();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: J0 */
    public InterfaceC11997x0 mo4233J0() {
        throw new UnsupportedOperationException();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: K */
    public InterfaceC0194h mo4232K(AbstractC7297n1 abstractC7297n1) {
        if (abstractC7297n1 == null) {
            m4235E0(10);
        }
        InterfaceC0194h mo4220g0 = mo4220g0(abstractC7297n1, C13801c.m1500o(C12758e.m4105g(this)));
        if (mo4220g0 == null) {
            m4235E0(11);
        }
        return mo4220g0;
    }

    @Override // p305qg.InterfaceC11909c1
    /* renamed from: L0 */
    public InterfaceC11914e mo4225c(C7307p1 c7307p1) {
        if (c7307p1 == null) {
            m4235E0(23);
        }
        if (c7307p1.m21023k()) {
            return this;
        }
        return new C12736s(this, C7307p1.m21026h(c7307p1.m21024j(), m4231K0().m21024j()));
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Q */
    public InterfaceC0194h mo4228Q() {
        InterfaceC0194h mo4228Q = this.f33055k.mo4228Q();
        if (mo4228Q == null) {
            m4235E0(28);
        }
        return mo4228Q;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: R */
    public AbstractC11930h1<AbstractC7302o0> mo4179R() {
        AbstractC11930h1<AbstractC7302o0> mo4179R = this.f33055k.mo4179R();
        if (mo4179R == null) {
            return null;
        }
        return mo4179R.m6706b(new C12738b());
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: T */
    public InterfaceC0194h mo4227T() {
        InterfaceC0194h mo4166r0 = mo4166r0(C13801c.m1500o(C12758e.m4105g(this.f33055k)));
        if (mo4166r0 == null) {
            m4235E0(12);
        }
        return mo4166r0;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return this.f33055k.mo4178U();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: V */
    public List<InterfaceC11997x0> mo4226V() {
        List<InterfaceC11997x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4235E0(17);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Y */
    public boolean mo4177Y() {
        return this.f33055k.mo4177Y();
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11959n, p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        InterfaceC11947m mo4163b = this.f33055k.mo4163b();
        if (mo4163b == null) {
            m4235E0(22);
        }
        return mo4163b;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: c0 */
    public boolean mo4176c0() {
        return this.f33055k.mo4176c0();
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4386i(this, d);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: g */
    public EnumC11918f mo4175g() {
        EnumC11918f mo4175g = this.f33055k.mo4175g();
        if (mo4175g == null) {
            m4235E0(25);
        }
        return mo4175g;
    }

    @Override // tg.AbstractC12739t
    /* renamed from: g0 */
    public InterfaceC0194h mo4220g0(AbstractC7297n1 abstractC7297n1, AbstractC7592g abstractC7592g) {
        if (abstractC7297n1 == null) {
            m4235E0(5);
        }
        if (abstractC7592g == null) {
            m4235E0(6);
        }
        InterfaceC0194h mo4220g0 = this.f33055k.mo4220g0(abstractC7297n1, abstractC7592g);
        if (this.f33056l.m21023k()) {
            if (mo4220g0 == null) {
                m4235E0(7);
            }
            return mo4220g0;
        }
        return new C0205m(mo4220g0, m4231K0());
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        InterfaceC12155g annotations = this.f33055k.getAnnotations();
        if (annotations == null) {
            m4235E0(19);
        }
        return annotations;
    }

    @Override // p305qg.InterfaceC11935j0
    public C11638f getName() {
        C11638f name = this.f33055k.getName();
        if (name == null) {
            m4235E0(20);
        }
        return name;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u visibility = this.f33055k.getVisibility();
        if (visibility == null) {
            m4235E0(27);
        }
        return visibility;
    }

    @Override // p305qg.InterfaceC11911d0
    public boolean isExternal() {
        return this.f33055k.isExternal();
    }

    @Override // p305qg.InterfaceC11914e
    public boolean isInline() {
        return this.f33055k.isInline();
    }

    @Override // p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        InterfaceC11900a1 interfaceC11900a1 = InterfaceC11900a1.f30901a;
        if (interfaceC11900a1 == null) {
            m4235E0(29);
        }
        return interfaceC11900a1;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: j0 */
    public boolean mo4174j0() {
        return this.f33055k.mo4174j0();
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        InterfaceC7265g1 mo4173k = this.f33055k.mo4173k();
        if (this.f33056l.m21023k()) {
            if (mo4173k == null) {
                m4235E0(0);
            }
            return mo4173k;
        }
        if (this.f33060p == null) {
            C7307p1 m4231K0 = m4231K0();
            Collection<AbstractC7264g0> mo2791m = mo4173k.mo2791m();
            ArrayList arrayList = new ArrayList(mo2791m.size());
            for (AbstractC7264g0 abstractC7264g0 : mo2791m) {
                arrayList.add(m4231K0.m21018p(abstractC7264g0, EnumC7336w1.INVARIANT));
            }
            this.f33060p = new C7289l(this, this.f33058n, arrayList, C6795f.f19003e);
        }
        InterfaceC7265g1 interfaceC7265g1 = this.f33060p;
        if (interfaceC7265g1 == null) {
            m4235E0(1);
        }
        return interfaceC7265g1;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return this.f33055k.mo4172k0();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: l */
    public Collection<InterfaceC11910d> mo4171l() {
        Collection<InterfaceC11910d> mo4171l = this.f33055k.mo4171l();
        ArrayList arrayList = new ArrayList(mo4171l.size());
        for (InterfaceC11910d interfaceC11910d : mo4171l) {
            arrayList.add(((InterfaceC11910d) interfaceC11910d.mo4296u().mo4268c(interfaceC11910d.mo4221a()).mo4252s(interfaceC11910d.mo4167r()).mo4264g(interfaceC11910d.getVisibility()).mo4253r(interfaceC11910d.mo4305g()).mo4258m(false).build()).mo4225c(m4231K0()));
        }
        return arrayList;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: l0 */
    public InterfaceC0194h mo4170l0() {
        InterfaceC0194h mo4170l0 = this.f33055k.mo4170l0();
        if (mo4170l0 == null) {
            m4235E0(15);
        }
        return mo4170l0;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: m0 */
    public InterfaceC11914e mo4169m0() {
        return this.f33055k.mo4169m0();
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11927h
    /* renamed from: p */
    public AbstractC7302o0 mo4224p() {
        AbstractC7302o0 m21097k = C7267h0.m21097k(C7301o.f19732a.mo21048a(getAnnotations(), null, null), mo4173k(), C7320s1.m20988g(mo4173k().getParameters()), false, mo4227T());
        if (m21097k == null) {
            m4235E0(16);
        }
        return m21097k;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11931i
    /* renamed from: q */
    public List<InterfaceC11920f1> mo4168q() {
        m4231K0();
        List<InterfaceC11920f1> list = this.f33059o;
        if (list == null) {
            m4235E0(30);
        }
        return list;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        EnumC11915e0 mo4167r = this.f33055k.mo4167r();
        if (mo4167r == null) {
            m4235E0(26);
        }
        return mo4167r;
    }

    @Override // tg.AbstractC12739t
    /* renamed from: r0 */
    public InterfaceC0194h mo4166r0(AbstractC7592g abstractC7592g) {
        if (abstractC7592g == null) {
            m4235E0(13);
        }
        InterfaceC0194h mo4166r0 = this.f33055k.mo4166r0(abstractC7592g);
        if (this.f33056l.m21023k()) {
            if (mo4166r0 == null) {
                m4235E0(14);
            }
            return mo4166r0;
        }
        return new C0205m(mo4166r0, m4231K0());
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: y */
    public Collection<InterfaceC11914e> mo4165y() {
        Collection<InterfaceC11914e> mo4165y = this.f33055k.mo4165y();
        if (mo4165y == null) {
            m4235E0(31);
        }
        return mo4165y;
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: z */
    public boolean mo4164z() {
        return this.f33055k.mo4164z();
    }

    @Override // tg.AbstractC12739t, p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11914e mo4221a() {
        InterfaceC11914e mo4221a = this.f33055k.mo4221a();
        if (mo4221a == null) {
            m4235E0(21);
        }
        return mo4221a;
    }
}
