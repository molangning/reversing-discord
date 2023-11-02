package p069dh;

import ai.AbstractC0182c;
import ai.AbstractC0198i;
import ai.C0185d;
import ai.InterfaceC0194h;
import bh.C2302e;
import bh.C2306f;
import ch.C2537a;
import ch.C2545e;
import ch.C2548g;
import gh.InterfaceC6763b0;
import gh.InterfaceC6769f;
import gh.InterfaceC6777n;
import gh.InterfaceC6781r;
import gh.InterfaceC6787x;
import gh.InterfaceC6788y;
import gi.C6820m;
import gi.InterfaceC6813g;
import gi.InterfaceC6814h;
import gi.InterfaceC6815i;
import gi.InterfaceC6816j;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import ng.AbstractC10870h;
import p086eh.C6224a;
import p086eh.C6225b;
import p108fh.InterfaceC6424a;
import p142hi.AbstractC7264g0;
import p142hi.C7320s1;
import p142hi.EnumC7317r1;
import p160ih.C7575w;
import p304qf.C11880m;
import p304qf.C11888u;
import p304qf.C11889v;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12155g;
import p327ri.C12242a;
import p389vh.AbstractC13301g;
import p448yg.EnumC14023d;
import p448yg.InterfaceC14020b;
import p468zg.C14239j0;
import pf.C11591x;
import ph.C11638f;
import tg.C12685c0;
import tg.C12713l0;
import th.C12756d;
import th.C12758e;
import th.C12779m;

/* renamed from: dh.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC5884j extends AbstractC0198i {

    /* renamed from: m */
    static final /* synthetic */ KProperty<Object>[] f16804m = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC5884j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC5884j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC5884j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b */
    private final C2548g f16805b;

    /* renamed from: c */
    private final AbstractC5884j f16806c;

    /* renamed from: d */
    private final InterfaceC6815i<Collection<InterfaceC11947m>> f16807d;

    /* renamed from: e */
    private final InterfaceC6815i<InterfaceC5841b> f16808e;

    /* renamed from: f */
    private final InterfaceC6813g<C11638f, Collection<InterfaceC12005z0>> f16809f;

    /* renamed from: g */
    private final InterfaceC6814h<C11638f, InterfaceC11989u0> f16810g;

    /* renamed from: h */
    private final InterfaceC6813g<C11638f, Collection<InterfaceC12005z0>> f16811h;

    /* renamed from: i */
    private final InterfaceC6815i f16812i;

    /* renamed from: j */
    private final InterfaceC6815i f16813j;

    /* renamed from: k */
    private final InterfaceC6815i f16814k;

    /* renamed from: l */
    private final InterfaceC6813g<C11638f, List<InterfaceC11989u0>> f16815l;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: dh.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5885a {

        /* renamed from: a */
        private final AbstractC7264g0 f16816a;

        /* renamed from: b */
        private final AbstractC7264g0 f16817b;

        /* renamed from: c */
        private final List<InterfaceC11936j1> f16818c;

        /* renamed from: d */
        private final List<InterfaceC11920f1> f16819d;

        /* renamed from: e */
        private final boolean f16820e;

        /* renamed from: f */
        private final List<String> f16821f;

        /* JADX WARN: Multi-variable type inference failed */
        public C5885a(AbstractC7264g0 returnType, AbstractC7264g0 abstractC7264g0, List<? extends InterfaceC11936j1> valueParameters, List<? extends InterfaceC11920f1> typeParameters, boolean z, List<String> errors) {
            C9612q.m13917h(returnType, "returnType");
            C9612q.m13917h(valueParameters, "valueParameters");
            C9612q.m13917h(typeParameters, "typeParameters");
            C9612q.m13917h(errors, "errors");
            this.f16816a = returnType;
            this.f16817b = abstractC7264g0;
            this.f16818c = valueParameters;
            this.f16819d = typeParameters;
            this.f16820e = z;
            this.f16821f = errors;
        }

        /* renamed from: a */
        public final List<String> m24237a() {
            return this.f16821f;
        }

        /* renamed from: b */
        public final boolean m24236b() {
            return this.f16820e;
        }

        /* renamed from: c */
        public final AbstractC7264g0 m24235c() {
            return this.f16817b;
        }

        /* renamed from: d */
        public final AbstractC7264g0 m24234d() {
            return this.f16816a;
        }

        /* renamed from: e */
        public final List<InterfaceC11920f1> m24233e() {
            return this.f16819d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5885a) {
                C5885a c5885a = (C5885a) obj;
                return C9612q.m13922c(this.f16816a, c5885a.f16816a) && C9612q.m13922c(this.f16817b, c5885a.f16817b) && C9612q.m13922c(this.f16818c, c5885a.f16818c) && C9612q.m13922c(this.f16819d, c5885a.f16819d) && this.f16820e == c5885a.f16820e && C9612q.m13922c(this.f16821f, c5885a.f16821f);
            }
            return false;
        }

        /* renamed from: f */
        public final List<InterfaceC11936j1> m24232f() {
            return this.f16818c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f16816a.hashCode() * 31;
            AbstractC7264g0 abstractC7264g0 = this.f16817b;
            int hashCode2 = (((((hashCode + (abstractC7264g0 == null ? 0 : abstractC7264g0.hashCode())) * 31) + this.f16818c.hashCode()) * 31) + this.f16819d.hashCode()) * 31;
            boolean z = this.f16820e;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode2 + i) * 31) + this.f16821f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f16816a + ", receiverType=" + this.f16817b + ", valueParameters=" + this.f16818c + ", typeParameters=" + this.f16819d + ", hasStableParameterNames=" + this.f16820e + ", errors=" + this.f16821f + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: dh.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5886b {

        /* renamed from: a */
        private final List<InterfaceC11936j1> f16822a;

        /* renamed from: b */
        private final boolean f16823b;

        /* JADX WARN: Multi-variable type inference failed */
        public C5886b(List<? extends InterfaceC11936j1> descriptors, boolean z) {
            C9612q.m13917h(descriptors, "descriptors");
            this.f16822a = descriptors;
            this.f16823b = z;
        }

        /* renamed from: a */
        public final List<InterfaceC11936j1> m24231a() {
            return this.f16822a;
        }

        /* renamed from: b */
        public final boolean m24230b() {
            return this.f16823b;
        }
    }

    /* renamed from: dh.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5887c extends AbstractC9614s implements Function0<Collection<? extends InterfaceC11947m>> {
        C5887c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Collection<InterfaceC11947m> invoke() {
            return AbstractC5884j.this.m24244m(C0185d.f620o, InterfaceC0194h.f645a.m40973a());
        }
    }

    /* renamed from: dh.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5888d extends AbstractC9614s implements Function0<Set<? extends C11638f>> {
        C5888d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            return AbstractC5884j.this.mo24209l(C0185d.f625t, null);
        }
    }

    /* renamed from: dh.j$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5889e extends AbstractC9614s implements Function1<C11638f, InterfaceC11989u0> {
        C5889e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11989u0 invoke(C11638f name) {
            C9612q.m13917h(name, "name");
            if (AbstractC5884j.this.m24257B() != null) {
                return (InterfaceC11989u0) AbstractC5884j.this.m24257B().f16810g.invoke(name);
            }
            InterfaceC6777n mo24379f = AbstractC5884j.this.m24238y().invoke().mo24379f(name);
            if (mo24379f != null && !mo24379f.mo2181I()) {
                return AbstractC5884j.this.m24251J(mo24379f);
            }
            return null;
        }
    }

    /* renamed from: dh.j$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5890f extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
        C5890f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<InterfaceC12005z0> invoke(C11638f name) {
            C9612q.m13917h(name, "name");
            if (AbstractC5884j.this.m24257B() != null) {
                return (Collection) AbstractC5884j.this.m24257B().f16809f.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC6781r interfaceC6781r : AbstractC5884j.this.m24238y().invoke().mo24380e(name)) {
                C2302e m24252I = AbstractC5884j.this.m24252I(interfaceC6781r);
                if (AbstractC5884j.this.mo24253G(m24252I)) {
                    AbstractC5884j.this.m24240w().m33014a().m33042h().mo41026c(interfaceC6781r, m24252I);
                    arrayList.add(m24252I);
                }
            }
            AbstractC5884j.this.mo24207o(arrayList, name);
            return arrayList;
        }
    }

    /* renamed from: dh.j$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5891g extends AbstractC9614s implements Function0<InterfaceC5841b> {
        C5891g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC5841b invoke() {
            return AbstractC5884j.this.mo24206p();
        }
    }

    /* renamed from: dh.j$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5892h extends AbstractC9614s implements Function0<Set<? extends C11638f>> {
        C5892h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            return AbstractC5884j.this.mo24208n(C0185d.f627v, null);
        }
    }

    /* renamed from: dh.j$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5893i extends AbstractC9614s implements Function1<C11638f, Collection<? extends InterfaceC12005z0>> {
        C5893i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<InterfaceC12005z0> invoke(C11638f name) {
            List m14075C0;
            C9612q.m13917h(name, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) AbstractC5884j.this.f16809f.invoke(name));
            AbstractC5884j.this.m24249L(linkedHashSet);
            AbstractC5884j.this.mo24205r(linkedHashSet, name);
            m14075C0 = C9553r.m14075C0(AbstractC5884j.this.m24240w().m33014a().m33032r().m21279g(AbstractC5884j.this.m24240w(), linkedHashSet));
            return m14075C0;
        }
    }

    /* renamed from: dh.j$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5894j extends AbstractC9614s implements Function1<C11638f, List<? extends InterfaceC11989u0>> {
        C5894j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<InterfaceC11989u0> invoke(C11638f name) {
            List<InterfaceC11989u0> m14075C0;
            List<InterfaceC11989u0> m14075C02;
            C9612q.m13917h(name, "name");
            ArrayList arrayList = new ArrayList();
            C12242a.m5675a(arrayList, AbstractC5884j.this.f16810g.invoke(name));
            AbstractC5884j.this.mo24196s(name, arrayList);
            if (C12758e.m4092t(AbstractC5884j.this.mo24217C())) {
                m14075C02 = C9553r.m14075C0(arrayList);
                return m14075C02;
            }
            m14075C0 = C9553r.m14075C0(AbstractC5884j.this.m24240w().m33014a().m33032r().m21279g(AbstractC5884j.this.m24240w(), arrayList));
            return m14075C0;
        }
    }

    /* renamed from: dh.j$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5895k extends AbstractC9614s implements Function0<Set<? extends C11638f>> {
        C5895k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<C11638f> invoke() {
            return AbstractC5884j.this.mo24204t(C0185d.f628w, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.j$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5896l extends AbstractC9614s implements Function0<InterfaceC6816j<? extends AbstractC13301g<?>>> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC6777n f16834k;

        /* renamed from: l */
        final /* synthetic */ C12685c0 f16835l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: dh.j$l$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C5897a extends AbstractC9614s implements Function0<AbstractC13301g<?>> {

            /* renamed from: j */
            final /* synthetic */ AbstractC5884j f16836j;

            /* renamed from: k */
            final /* synthetic */ InterfaceC6777n f16837k;

            /* renamed from: l */
            final /* synthetic */ C12685c0 f16838l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5897a(AbstractC5884j abstractC5884j, InterfaceC6777n interfaceC6777n, C12685c0 c12685c0) {
                super(0);
                this.f16836j = abstractC5884j;
                this.f16837k = interfaceC6777n;
                this.f16838l = c12685c0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final AbstractC13301g<?> invoke() {
                return this.f16836j.m24240w().m33014a().m33043g().mo41029a(this.f16837k, this.f16838l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5896l(InterfaceC6777n interfaceC6777n, C12685c0 c12685c0) {
            super(0);
            this.f16834k = interfaceC6777n;
            this.f16835l = c12685c0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC6816j<AbstractC13301g<?>> invoke() {
            return AbstractC5884j.this.m24240w().m33010e().mo21865e(new C5897a(AbstractC5884j.this, this.f16834k, this.f16835l));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.j$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5898m extends AbstractC9614s implements Function1<InterfaceC12005z0, InterfaceC11897a> {

        /* renamed from: j */
        public static final C5898m f16839j = new C5898m();

        C5898m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11897a invoke(InterfaceC12005z0 selectMostSpecificInEachOverridableGroup) {
            C9612q.m13917h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ AbstractC5884j(C2548g c2548g, AbstractC5884j abstractC5884j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2548g, (i & 2) != 0 ? null : abstractC5884j);
    }

    /* renamed from: A */
    private final Set<C11638f> m24258A() {
        return (Set) C6820m.m21871a(this.f16812i, this, f16804m[0]);
    }

    /* renamed from: D */
    private final Set<C11638f> m24256D() {
        return (Set) C6820m.m21871a(this.f16813j, this, f16804m[1]);
    }

    /* renamed from: E */
    private final AbstractC7264g0 m24255E(InterfaceC6777n interfaceC6777n) {
        boolean z;
        AbstractC7264g0 m23194o = this.f16805b.m33008g().m23194o(interfaceC6777n.getType(), C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 7, null));
        if ((AbstractC10870h.m9791r0(m23194o) || AbstractC10870h.m9785u0(m23194o)) && m24254F(interfaceC6777n) && interfaceC6777n.mo2180N()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC7264g0 m20981n = C7320s1.m20981n(m23194o);
            C9612q.m13918g(m20981n, "makeNotNullable(propertyType)");
            return m20981n;
        }
        return m23194o;
    }

    /* renamed from: F */
    private final boolean m24254F(InterfaceC6777n interfaceC6777n) {
        return interfaceC6777n.isFinal() && interfaceC6777n.mo2173g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final InterfaceC11989u0 m24251J(InterfaceC6777n interfaceC6777n) {
        List<? extends InterfaceC11920f1> m14104i;
        List<InterfaceC11997x0> m14104i2;
        C12685c0 m24242u = m24242u(interfaceC6777n);
        m24242u.m4520V0(null, null, null, null);
        AbstractC7264g0 m24255E = m24255E(interfaceC6777n);
        m14104i = C9545j.m14104i();
        InterfaceC11997x0 mo24195z = mo24195z();
        m14104i2 = C9545j.m14104i();
        m24242u.m4513b1(m24255E, m14104i, mo24195z, null, m14104i2);
        if (C12758e.m4114K(m24242u, m24242u.getType())) {
            m24242u.m4341L0(new C5896l(interfaceC6777n, m24242u));
        }
        this.f16805b.m33014a().m33042h().mo41024e(interfaceC6777n, m24242u);
        return m24242u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m24249L(Set<InterfaceC12005z0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String m20385c = C7575w.m20385c((InterfaceC12005z0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(m20385c);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m20385c, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends InterfaceC12005z0> m3933a = C12779m.m3933a(list, C5898m.f16839j);
                set.removeAll(list);
                set.addAll(m3933a);
            }
        }
    }

    /* renamed from: u */
    private final C12685c0 m24242u(InterfaceC6777n interfaceC6777n) {
        C2306f m33668f1 = C2306f.m33668f1(mo24217C(), C2545e.m33019a(this.f16805b, interfaceC6777n), EnumC11915e0.FINAL, C14239j0.m337d(interfaceC6777n.getVisibility()), !interfaceC6777n.isFinal(), interfaceC6777n.getName(), this.f16805b.m33014a().m33030t().mo2836a(interfaceC6777n), m24254F(interfaceC6777n));
        C9612q.m13918g(m33668f1, "create(\n            owne…d.isFinalStatic\n        )");
        return m33668f1;
    }

    /* renamed from: x */
    private final Set<C11638f> m24239x() {
        return (Set) C6820m.m21871a(this.f16814k, this, f16804m[2]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final AbstractC5884j m24257B() {
        return this.f16806c;
    }

    /* renamed from: C */
    protected abstract InterfaceC11947m mo24217C();

    /* renamed from: G */
    protected boolean mo24253G(C2302e c2302e) {
        C9612q.m13917h(c2302e, "<this>");
        return true;
    }

    /* renamed from: H */
    protected abstract C5885a mo24197H(InterfaceC6781r interfaceC6781r, List<? extends InterfaceC11920f1> list, AbstractC7264g0 abstractC7264g0, List<? extends InterfaceC11936j1> list2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final C2302e m24252I(InterfaceC6781r method) {
        boolean z;
        int m14093t;
        InterfaceC11997x0 interfaceC11997x0;
        List<InterfaceC11997x0> m14104i;
        Map<? extends InterfaceC11897a.InterfaceC11898a<?>, ?> m6754h;
        Object m14056T;
        C9612q.m13917h(method, "method");
        InterfaceC12155g m33019a = C2545e.m33019a(this.f16805b, method);
        InterfaceC11947m mo24217C = mo24217C();
        C11638f name = method.getName();
        InterfaceC6424a mo2836a = this.f16805b.m33014a().m33030t().mo2836a(method);
        if (this.f16808e.invoke().mo24381d(method.getName()) != null && method.mo2168i().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C2302e m33674p1 = C2302e.m33674p1(mo24217C, m33019a, name, mo2836a, z);
        C9612q.m13918g(m33674p1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        C2548g m33055f = C2537a.m33055f(this.f16805b, m33674p1, method, 0, 4, null);
        List<InterfaceC6788y> typeParameters = method.getTypeParameters();
        m14093t = C9546k.m14093t(typeParameters, 10);
        List<? extends InterfaceC11920f1> arrayList = new ArrayList<>(m14093t);
        for (InterfaceC6788y interfaceC6788y : typeParameters) {
            InterfaceC11920f1 mo32999a = m33055f.m33009f().mo32999a(interfaceC6788y);
            C9612q.m13920e(mo32999a);
            arrayList.add(mo32999a);
        }
        C5886b m24250K = m24250K(m33055f, m33674p1, method.mo2168i());
        C5885a mo24197H = mo24197H(method, arrayList, m24243q(method, m33055f), m24250K.m24231a());
        AbstractC7264g0 m24235c = mo24197H.m24235c();
        if (m24235c != null) {
            interfaceC11997x0 = C12756d.m4134i(m33674p1, m24235c, InterfaceC12155g.f31603f.m6037b());
        } else {
            interfaceC11997x0 = null;
        }
        InterfaceC11997x0 interfaceC11997x02 = interfaceC11997x0;
        InterfaceC11997x0 mo24195z = mo24195z();
        m14104i = C9545j.m14104i();
        List<InterfaceC11920f1> m24233e = mo24197H.m24233e();
        List<InterfaceC11936j1> m24232f = mo24197H.m24232f();
        AbstractC7264g0 m24234d = mo24197H.m24234d();
        EnumC11915e0 m6722a = EnumC11915e0.f30913j.m6722a(false, method.isAbstract(), !method.isFinal());
        AbstractC11988u m337d = C14239j0.m337d(method.getVisibility());
        if (mo24197H.m24235c() != null) {
            InterfaceC11897a.InterfaceC11898a<InterfaceC11936j1> interfaceC11898a = C2302e.f6401P;
            m14056T = C9553r.m14056T(m24250K.m24231a());
            m6754h = C11888u.m6757e(C11591x.m7577a(interfaceC11898a, m14056T));
        } else {
            m6754h = C11889v.m6754h();
        }
        m33674p1.mo4431o1(interfaceC11997x02, mo24195z, m14104i, m24233e, m24232f, m24234d, m6722a, m337d, m6754h);
        m33674p1.m33671s1(mo24197H.m24236b(), m24250K.m24230b());
        if (!mo24197H.m24237a().isEmpty()) {
            m33055f.m33014a().m33031s().mo41019b(m33674p1, mo24197H.m24237a());
        }
        return m33674p1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final C5886b m24250K(C2548g c2548g, InterfaceC11998y function, List<? extends InterfaceC6763b0> jValueParameters) {
        Iterable<C11880m> m14069I0;
        int m14093t;
        List m14075C0;
        Pair m7577a;
        C11638f name;
        C2548g c = c2548g;
        C9612q.m13917h(c, "c");
        C9612q.m13917h(function, "function");
        C9612q.m13917h(jValueParameters, "jValueParameters");
        m14069I0 = C9553r.m14069I0(jValueParameters);
        m14093t = C9546k.m14093t(m14069I0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        boolean z = false;
        for (C11880m c11880m : m14069I0) {
            int m6782a = c11880m.m6782a();
            InterfaceC6763b0 interfaceC6763b0 = (InterfaceC6763b0) c11880m.m6781b();
            InterfaceC12155g m33019a = C2545e.m33019a(c, interfaceC6763b0);
            C6224a m23210b = C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 7, null);
            InterfaceC6769f interfaceC6769f = null;
            if (interfaceC6763b0.mo2255a()) {
                InterfaceC6787x type = interfaceC6763b0.getType();
                if (type instanceof InterfaceC6769f) {
                    interfaceC6769f = (InterfaceC6769f) type;
                }
                if (interfaceC6769f != null) {
                    AbstractC7264g0 m23198k = c2548g.m33008g().m23198k(interfaceC6769f, m23210b, true);
                    m7577a = C11591x.m7577a(m23198k, c2548g.m33011d().mo4194n().m9806k(m23198k));
                } else {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC6763b0);
                }
            } else {
                m7577a = C11591x.m7577a(c2548g.m33008g().m23194o(interfaceC6763b0.getType(), m23210b), null);
            }
            AbstractC7264g0 abstractC7264g0 = (AbstractC7264g0) m7577a.m14351a();
            AbstractC7264g0 abstractC7264g02 = (AbstractC7264g0) m7577a.m14350b();
            if (C9612q.m13922c(function.getName().m7426b(), "equals") && jValueParameters.size() == 1 && C9612q.m13922c(c2548g.m33011d().mo4194n().m9842I(), abstractC7264g0)) {
                name = C11638f.m7422f("other");
            } else {
                name = interfaceC6763b0.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(m6782a);
                    name = C11638f.m7422f(sb2.toString());
                    C9612q.m13918g(name, "identifier(\"p$index\")");
                }
            }
            C11638f c11638f = name;
            C9612q.m13918g(c11638f, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C12713l0(function, null, m6782a, m33019a, c11638f, abstractC7264g0, false, false, false, abstractC7264g02, c2548g.m33014a().m33030t().mo2836a(interfaceC6763b0)));
            arrayList = arrayList2;
            z = z;
            c = c2548g;
        }
        m14075C0 = C9553r.m14075C0(arrayList);
        return new C5886b(m14075C0, z);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        List m14104i;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        if (!mo4361b().contains(name)) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return this.f16811h.invoke(name);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        return m24258A();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        List m14104i;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        if (!mo4359d().contains(name)) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return this.f16815l.invoke(name);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        return m24256D();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        return this.f16807d.invoke();
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        return m24239x();
    }

    /* renamed from: l */
    protected abstract Set<C11638f> mo24209l(C0185d c0185d, Function1<? super C11638f, Boolean> function1);

    /* renamed from: m */
    protected final List<InterfaceC11947m> m24244m(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List<InterfaceC11947m> m14075C0;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        EnumC14023d enumC14023d = EnumC14023d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.m41005a(C0185d.f608c.m40989c())) {
            for (C11638f c11638f : mo24209l(kindFilter, nameFilter)) {
                if (nameFilter.invoke(c11638f).booleanValue()) {
                    C12242a.m5675a(linkedHashSet, mo16932g(c11638f, enumC14023d));
                }
            }
        }
        if (kindFilter.m41005a(C0185d.f608c.m40988d()) && !kindFilter.m40994l().contains(AbstractC0182c.C0183a.f605a)) {
            for (C11638f c11638f2 : mo24208n(kindFilter, nameFilter)) {
                if (nameFilter.invoke(c11638f2).booleanValue()) {
                    linkedHashSet.addAll(mo4362a(c11638f2, enumC14023d));
                }
            }
        }
        if (kindFilter.m41005a(C0185d.f608c.m40983i()) && !kindFilter.m40994l().contains(AbstractC0182c.C0183a.f605a)) {
            for (C11638f c11638f3 : mo24204t(kindFilter, nameFilter)) {
                if (nameFilter.invoke(c11638f3).booleanValue()) {
                    linkedHashSet.addAll(mo4360c(c11638f3, enumC14023d));
                }
            }
        }
        m14075C0 = C9553r.m14075C0(linkedHashSet);
        return m14075C0;
    }

    /* renamed from: n */
    protected abstract Set<C11638f> mo24208n(C0185d c0185d, Function1<? super C11638f, Boolean> function1);

    /* renamed from: o */
    protected void mo24207o(Collection<InterfaceC12005z0> result, C11638f name) {
        C9612q.m13917h(result, "result");
        C9612q.m13917h(name, "name");
    }

    /* renamed from: p */
    protected abstract InterfaceC5841b mo24206p();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final AbstractC7264g0 m24243q(InterfaceC6781r method, C2548g c) {
        C9612q.m13917h(method, "method");
        C9612q.m13917h(c, "c");
        return c.m33008g().m23194o(method.getReturnType(), C6225b.m23210b(EnumC7317r1.COMMON, method.mo2177O().mo2205q(), false, null, 6, null));
    }

    /* renamed from: r */
    protected abstract void mo24205r(Collection<InterfaceC12005z0> collection, C11638f c11638f);

    /* renamed from: s */
    protected abstract void mo24196s(C11638f c11638f, Collection<InterfaceC11989u0> collection);

    /* renamed from: t */
    protected abstract Set<C11638f> mo24204t(C0185d c0185d, Function1<? super C11638f, Boolean> function1);

    public String toString() {
        return "Lazy scope for " + mo24217C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final InterfaceC6815i<Collection<InterfaceC11947m>> m24241v() {
        return this.f16807d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final C2548g m24240w() {
        return this.f16805b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final InterfaceC6815i<InterfaceC5841b> m24238y() {
        return this.f16808e;
    }

    /* renamed from: z */
    protected abstract InterfaceC11997x0 mo24195z();

    public AbstractC5884j(C2548g c, AbstractC5884j abstractC5884j) {
        List m14104i;
        C9612q.m13917h(c, "c");
        this.f16805b = c;
        this.f16806c = abstractC5884j;
        InterfaceC6821n m33010e = c.m33010e();
        C5887c c5887c = new C5887c();
        m14104i = C9545j.m14104i();
        this.f16807d = m33010e.mo21868b(c5887c, m14104i);
        this.f16808e = c.m33010e().mo21867c(new C5891g());
        this.f16809f = c.m33010e().mo21861i(new C5890f());
        this.f16810g = c.m33010e().mo21863g(new C5889e());
        this.f16811h = c.m33010e().mo21861i(new C5893i());
        this.f16812i = c.m33010e().mo21867c(new C5892h());
        this.f16813j = c.m33010e().mo21867c(new C5895k());
        this.f16814k = c.m33010e().mo21867c(new C5888d());
        this.f16815l = c.m33010e().mo21861i(new C5894j());
    }
}
