package p069dh;

import ai.C0185d;
import ai.InterfaceC0194h;
import bh.C2308h;
import bh.InterfaceC2300c;
import ch.C2548g;
import gh.InterfaceC6770g;
import gh.InterfaceC6780q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import ng.C10884k;
import p013ah.C0158a;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p327ri.C12242a;
import p327ri.C12243b;
import p448yg.EnumC14023d;
import p448yg.InterfaceC14020b;
import ph.C11638f;
import si.C12552o;
import th.C12756d;

/* renamed from: dh.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5900l extends AbstractC5906m {

    /* renamed from: n */
    private final InterfaceC6770g f16841n;

    /* renamed from: o */
    private final InterfaceC2300c f16842o;

    /* renamed from: dh.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5901a extends AbstractC9614s implements Function1<InterfaceC6780q, Boolean> {

        /* renamed from: j */
        public static final C5901a f16843j = new C5901a();

        C5901a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC6780q it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(it.mo2173g());
        }
    }

    /* renamed from: dh.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5902b extends AbstractC9614s implements Function1<InterfaceC0194h, Collection<? extends InterfaceC11989u0>> {

        /* renamed from: j */
        final /* synthetic */ C11638f f16844j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5902b(C11638f c11638f) {
            super(1);
            this.f16844j = c11638f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<? extends InterfaceC11989u0> invoke(InterfaceC0194h it) {
            C9612q.m13917h(it, "it");
            return it.mo4360c(this.f16844j, EnumC14023d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* renamed from: dh.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5903c extends AbstractC9614s implements Function1<InterfaceC0194h, Collection<? extends C11638f>> {

        /* renamed from: j */
        public static final C5903c f16845j = new C5903c();

        C5903c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Collection<C11638f> invoke(InterfaceC0194h it) {
            C9612q.m13917h(it, "it");
            return it.mo4359d();
        }
    }

    /* renamed from: dh.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5904d extends AbstractC9614s implements Function1<AbstractC7264g0, InterfaceC11914e> {

        /* renamed from: j */
        public static final C5904d f16846j = new C5904d();

        C5904d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11914e invoke(AbstractC7264g0 abstractC7264g0) {
            InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
            if (mo2788p instanceof InterfaceC11914e) {
                return (InterfaceC11914e) mo2788p;
            }
            return null;
        }
    }

    /* renamed from: dh.l$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5905e extends C12243b.AbstractC12245b<InterfaceC11914e, Unit> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11914e f16847a;

        /* renamed from: b */
        final /* synthetic */ Set<R> f16848b;

        /* renamed from: c */
        final /* synthetic */ Function1<InterfaceC0194h, Collection<R>> f16849c;

        /* JADX WARN: Multi-variable type inference failed */
        C5905e(InterfaceC11914e interfaceC11914e, Set<R> set, Function1<? super InterfaceC0194h, ? extends Collection<? extends R>> function1) {
            this.f16847a = interfaceC11914e;
            this.f16848b = set;
            this.f16849c = function1;
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo1491a() {
            m24198e();
            return Unit.f25302a;
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: d */
        public boolean mo1489c(InterfaceC11914e current) {
            C9612q.m13917h(current, "current");
            if (current == this.f16847a) {
                return true;
            }
            InterfaceC0194h mo4170l0 = current.mo4170l0();
            C9612q.m13918g(mo4170l0, "current.staticScope");
            if (!(mo4170l0 instanceof AbstractC5906m)) {
                return true;
            }
            this.f16848b.addAll((Collection) this.f16849c.invoke(mo4170l0));
            return false;
        }

        /* renamed from: e */
        public void m24198e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5900l(C2548g c, InterfaceC6770g jClass, InterfaceC2300c ownerDescriptor) {
        super(c);
        C9612q.m13917h(c, "c");
        C9612q.m13917h(jClass, "jClass");
        C9612q.m13917h(ownerDescriptor, "ownerDescriptor");
        this.f16841n = jClass;
        this.f16842o = ownerDescriptor;
    }

    /* renamed from: O */
    private final <R> Set<R> m24214O(InterfaceC11914e interfaceC11914e, Set<R> set, Function1<? super InterfaceC0194h, ? extends Collection<? extends R>> function1) {
        List m14109d;
        m14109d = C9544i.m14109d(interfaceC11914e);
        C12243b.m5667b(m14109d, C5899k.f16840a, new C5905e(interfaceC11914e, set, function1));
        return set;
    }

    /* renamed from: P */
    public static final Iterable m24213P(InterfaceC11914e interfaceC11914e) {
        Sequence m14066K;
        Sequence m4850z;
        Iterable m4864l;
        Collection<AbstractC7264g0> mo2791m = interfaceC11914e.mo4173k().mo2791m();
        C9612q.m13918g(mo2791m, "it.typeConstructor.supertypes");
        m14066K = C9553r.m14066K(mo2791m);
        m4850z = C12552o.m4850z(m14066K, C5904d.f16846j);
        m4864l = C12552o.m4864l(m4850z);
        return m4864l;
    }

    /* renamed from: R */
    private final InterfaceC11989u0 m24211R(InterfaceC11989u0 interfaceC11989u0) {
        int m14093t;
        List m14063M;
        Object m14033q0;
        if (interfaceC11989u0.mo4305g().m6727a()) {
            return interfaceC11989u0;
        }
        Collection<? extends InterfaceC11989u0> mo4310d = interfaceC11989u0.mo4310d();
        C9612q.m13918g(mo4310d, "this.overriddenDescriptors");
        m14093t = C9546k.m14093t(mo4310d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11989u0 it : mo4310d) {
            C9612q.m13918g(it, "it");
            arrayList.add(m24211R(it));
        }
        m14063M = C9553r.m14063M(arrayList);
        m14033q0 = C9553r.m14033q0(m14063M);
        return (InterfaceC11989u0) m14033q0;
    }

    /* renamed from: S */
    private final Set<InterfaceC12005z0> m24210S(C11638f c11638f, InterfaceC11914e interfaceC11914e) {
        Set<InterfaceC12005z0> m14071G0;
        Set<InterfaceC12005z0> m14007d;
        C5900l m33664b = C2308h.m33664b(interfaceC11914e);
        if (m33664b == null) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        m14071G0 = C9553r.m14071G0(m33664b.mo4362a(c11638f, EnumC14023d.WHEN_GET_SUPER_MEMBERS));
        return m14071G0;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: N */
    public C5839a mo24206p() {
        return new C5839a(this.f16841n, C5901a.f16843j);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: Q */
    public InterfaceC2300c mo24217C() {
        return this.f16842o;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return null;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: l */
    protected Set<C11638f> mo24209l(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        Set<C11638f> m14007d;
        C9612q.m13917h(kindFilter, "kindFilter");
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: n */
    protected Set<C11638f> mo24208n(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        Set<C11638f> m14072F0;
        Set<C11638f> set;
        List m14101l;
        C9612q.m13917h(kindFilter, "kindFilter");
        m14072F0 = C9553r.m14072F0(m24238y().invoke().mo24384a());
        C5900l m33664b = C2308h.m33664b(mo24217C());
        if (m33664b != null) {
            set = m33664b.mo4361b();
        } else {
            set = null;
        }
        if (set == null) {
            set = C9560w.m14007d();
        }
        m14072F0.addAll(set);
        if (this.f16841n.mo2202v()) {
            m14101l = C9545j.m14101l(C10884k.f28413f, C10884k.f28411d);
            m14072F0.addAll(m14101l);
        }
        m14072F0.addAll(m24240w().m33014a().m33027w().mo873a(m24240w(), mo24217C()));
        return m14072F0;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: o */
    protected void mo24207o(Collection<InterfaceC12005z0> result, C11638f name) {
        C9612q.m13917h(result, "result");
        C9612q.m13917h(name, "name");
        m24240w().m33014a().m33027w().mo870d(m24240w(), mo24217C(), name, result);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: r */
    protected void mo24205r(Collection<InterfaceC12005z0> result, C11638f name) {
        C9612q.m13917h(result, "result");
        C9612q.m13917h(name, "name");
        Collection<? extends InterfaceC12005z0> m41047e = C0158a.m41047e(name, m24210S(name, mo24217C()), result, mo24217C(), m24240w().m33014a().m33047c(), m24240w().m33014a().m33039k().mo20257a());
        C9612q.m13918g(m41047e, "resolveOverridesForStati…rridingUtil\n            )");
        result.addAll(m41047e);
        if (this.f16841n.mo2202v()) {
            if (C9612q.m13922c(name, C10884k.f28413f)) {
                InterfaceC12005z0 m4136g = C12756d.m4136g(mo24217C());
                C9612q.m13918g(m4136g, "createEnumValueOfMethod(ownerDescriptor)");
                result.add(m4136g);
            } else if (C9612q.m13922c(name, C10884k.f28411d)) {
                InterfaceC12005z0 m4135h = C12756d.m4135h(mo24217C());
                C9612q.m13918g(m4135h, "createEnumValuesMethod(ownerDescriptor)");
                result.add(m4135h);
            }
        }
    }

    @Override // p069dh.AbstractC5906m, p069dh.AbstractC5884j
    /* renamed from: s */
    protected void mo24196s(C11638f name, Collection<InterfaceC11989u0> result) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(result, "result");
        Set m24214O = m24214O(mo24217C(), new LinkedHashSet(), new C5902b(name));
        if (!result.isEmpty()) {
            Collection<? extends InterfaceC11989u0> m41047e = C0158a.m41047e(name, m24214O, result, mo24217C(), m24240w().m33014a().m33047c(), m24240w().m33014a().m33039k().mo20257a());
            C9612q.m13918g(m41047e, "resolveOverridesForStati…ingUtil\n                )");
            result.addAll(m41047e);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : m24214O) {
                InterfaceC11989u0 m24211R = m24211R((InterfaceC11989u0) obj);
                Object obj2 = linkedHashMap.get(m24211R);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m24211R, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Collection m41047e2 = C0158a.m41047e(name, (Collection) entry.getValue(), result, mo24217C(), m24240w().m33014a().m33047c(), m24240w().m33014a().m33039k().mo20257a());
                C9612q.m13918g(m41047e2, "resolveOverridesForStati…ingUtil\n                )");
                C9550o.m14085y(arrayList, m41047e2);
            }
            result.addAll(arrayList);
        }
        if (this.f16841n.mo2202v() && C9612q.m13922c(name, C10884k.f28412e)) {
            C12242a.m5675a(result, C12756d.m4137f(mo24217C()));
        }
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: t */
    protected Set<C11638f> mo24204t(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        Set<C11638f> m14072F0;
        C9612q.m13917h(kindFilter, "kindFilter");
        m14072F0 = C9553r.m14072F0(m24238y().invoke().mo24382c());
        m24214O(mo24217C(), m14072F0, C5903c.f16845j);
        if (this.f16841n.mo2202v()) {
            m14072F0.add(C10884k.f28412e);
        }
        return m14072F0;
    }
}