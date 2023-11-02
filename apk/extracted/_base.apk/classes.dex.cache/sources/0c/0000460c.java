package p269og;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.C10869g;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7307p1;
import p142hi.EnumC7336w1;
import p271oi.C11158q;
import p304qf.C11880m;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.AbstractC12727p;
import tg.C12701g0;
import tg.C12713l0;

/* renamed from: og.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11107e extends C12701g0 {

    /* renamed from: N */
    public static final C11108a f29073N = new C11108a(null);

    /* renamed from: og.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11108a {
        private C11108a() {
        }

        public /* synthetic */ C11108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final InterfaceC11936j1 m9152b(C11107e c11107e, int i, InterfaceC11920f1 interfaceC11920f1) {
            String lowerCase;
            String m7426b = interfaceC11920f1.getName().m7426b();
            C9612q.m13918g(m7426b, "typeParameter.name.asString()");
            if (C9612q.m13922c(m7426b, "T")) {
                lowerCase = "instance";
            } else if (C9612q.m13922c(m7426b, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = m7426b.toLowerCase(Locale.ROOT);
                C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            InterfaceC12155g m6037b = InterfaceC12155g.f31603f.m6037b();
            C11638f m7422f = C11638f.m7422f(lowerCase);
            C9612q.m13918g(m7422f, "identifier(name)");
            AbstractC7302o0 mo4224p = interfaceC11920f1.mo4224p();
            C9612q.m13918g(mo4224p, "typeParameter.defaultType");
            InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
            C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
            return new C12713l0(c11107e, null, i, m6037b, m7422f, mo4224p, false, false, false, null, NO_SOURCE);
        }

        /* renamed from: a */
        public final C11107e m9153a(C11098b functionClass, boolean z) {
            List<InterfaceC11997x0> m14104i;
            List<? extends InterfaceC11920f1> m14104i2;
            Iterable<C11880m> m14069I0;
            int m14093t;
            Object m14044f0;
            boolean z2;
            C9612q.m13917h(functionClass, "functionClass");
            List<InterfaceC11920f1> mo4168q = functionClass.mo4168q();
            C11107e c11107e = new C11107e(functionClass, null, InterfaceC11902b.EnumC11903a.DECLARATION, z, null);
            InterfaceC11997x0 mo4233J0 = functionClass.mo4233J0();
            m14104i = C9545j.m14104i();
            m14104i2 = C9545j.m14104i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo4168q) {
                if (((InterfaceC11920f1) obj).mo4464m() == EnumC7336w1.IN_VARIANCE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                arrayList.add(obj);
            }
            m14069I0 = C9553r.m14069I0(arrayList);
            m14093t = C9546k.m14093t(m14069I0, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (C11880m c11880m : m14069I0) {
                arrayList2.add(C11107e.f29073N.m9152b(c11107e, c11880m.m6780c(), (InterfaceC11920f1) c11880m.m6779d()));
            }
            m14044f0 = C9553r.m14044f0(mo4168q);
            c11107e.mo4323R0(null, mo4233J0, m14104i, m14104i2, arrayList2, ((InterfaceC11920f1) m14044f0).mo4224p(), EnumC11915e0.ABSTRACT, C11974t.f30970e);
            c11107e.mo4314Z0(true);
            return c11107e;
        }
    }

    private C11107e(InterfaceC11947m interfaceC11947m, C11107e c11107e, InterfaceC11902b.EnumC11903a enumC11903a, boolean z) {
        super(interfaceC11947m, c11107e, InterfaceC12155g.f31603f.m6037b(), C11158q.f29168i, enumC11903a, InterfaceC11900a1.f30901a);
        m4306f1(true);
        m4302h1(z);
        mo4315Y0(false);
    }

    public /* synthetic */ C11107e(InterfaceC11947m interfaceC11947m, C11107e c11107e, InterfaceC11902b.EnumC11903a enumC11903a, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11947m, c11107e, enumC11903a, z);
    }

    /* renamed from: p1 */
    private final InterfaceC11998y m9154p1(List<C11638f> list) {
        int m14093t;
        boolean z;
        C11638f c11638f;
        List<Pair> m14067J0;
        boolean z2;
        int size = mo4301i().size() - list.size();
        boolean z3 = true;
        if (size == 0) {
            List<InterfaceC11936j1> valueParameters = mo4301i();
            C9612q.m13918g(valueParameters, "valueParameters");
            m14067J0 = C9553r.m14067J0(list, valueParameters);
            if (!(m14067J0 instanceof Collection) || !m14067J0.isEmpty()) {
                for (Pair pair : m14067J0) {
                    if (!C9612q.m13922c((C11638f) pair.m14351a(), ((InterfaceC11936j1) pair.m14350b()).getName())) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return this;
            }
        }
        List<InterfaceC11936j1> valueParameters2 = mo4301i();
        C9612q.m13918g(valueParameters2, "valueParameters");
        m14093t = C9546k.m14093t(valueParameters2, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11936j1 interfaceC11936j1 : valueParameters2) {
            C11638f name = interfaceC11936j1.getName();
            C9612q.m13918g(name, "it.name");
            int index = interfaceC11936j1.getIndex();
            int i = index - size;
            if (i >= 0 && (c11638f = list.get(i)) != null) {
                name = c11638f;
            }
            arrayList.add(interfaceC11936j1.mo4370W(this, name, index));
        }
        AbstractC12727p.C12730c m4322S0 = m4322S0(C7307p1.f19741b);
        if (!list.isEmpty()) {
            for (C11638f c11638f2 : list) {
                if (c11638f2 == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z3 = false;
        AbstractC12727p.C12730c mo4268c = m4322S0.m4286G(z3).mo4269b(arrayList).mo4268c(mo4221a());
        C9612q.m13918g(mo4268c, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        InterfaceC11998y mo4328M0 = super.mo4328M0(mo4268c);
        C9612q.m13920e(mo4328M0);
        return mo4328M0;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y
    /* renamed from: B */
    public boolean mo4338B() {
        return false;
    }

    @Override // tg.C12701g0, tg.AbstractC12727p
    /* renamed from: L0 */
    protected AbstractC12727p mo4330L0(InterfaceC11947m newOwner, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a kind, C11638f c11638f, InterfaceC12155g annotations, InterfaceC11900a1 source) {
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(source, "source");
        return new C11107e(newOwner, (C11107e) interfaceC11998y, kind, isSuspend());
    }

    @Override // tg.AbstractC12727p
    /* renamed from: M0 */
    public InterfaceC11998y mo4328M0(AbstractC12727p.C12730c configuration) {
        boolean z;
        int m14093t;
        C9612q.m13917h(configuration, "configuration");
        C11107e c11107e = (C11107e) super.mo4328M0(configuration);
        if (c11107e == null) {
            return null;
        }
        List<InterfaceC11936j1> mo4301i = c11107e.mo4301i();
        C9612q.m13918g(mo4301i, "substituted.valueParameters");
        boolean z2 = true;
        if (!(mo4301i instanceof Collection) || !mo4301i.isEmpty()) {
            Iterator<T> it = mo4301i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC7264g0 type = ((InterfaceC11936j1) it.next()).getType();
                C9612q.m13918g(type, "it.type");
                if (C10869g.m9871d(type) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return c11107e;
        }
        List<InterfaceC11936j1> mo4301i2 = c11107e.mo4301i();
        C9612q.m13918g(mo4301i2, "substituted.valueParameters");
        m14093t = C9546k.m14093t(mo4301i2, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11936j1 interfaceC11936j1 : mo4301i2) {
            AbstractC7264g0 type2 = interfaceC11936j1.getType();
            C9612q.m13918g(type2, "it.type");
            arrayList.add(C10869g.m9871d(type2));
        }
        return c11107e.m9154p1(arrayList);
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11911d0
    public boolean isExternal() {
        return false;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y
    public boolean isInline() {
        return false;
    }
}