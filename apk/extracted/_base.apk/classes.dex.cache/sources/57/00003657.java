package p142hi;

import ai.C0208n;
import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10199h;
import ng.AbstractC10870h;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p340sf.C12466c;

/* renamed from: hi.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7239f0 implements InterfaceC7265g1, InterfaceC10199h {

    /* renamed from: a */
    private AbstractC7264g0 f19644a;

    /* renamed from: b */
    private final LinkedHashSet<AbstractC7264g0> f19645b;

    /* renamed from: c */
    private final int f19646c;

    /* renamed from: hi.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7240a extends AbstractC9614s implements Function1<AbstractC7592g, AbstractC7302o0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7240a() {
            super(1);
            C7239f0.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7302o0 invoke(AbstractC7592g kotlinTypeRefiner) {
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return C7239f0.this.mo2789o(kotlinTypeRefiner).m21156d();
        }
    }

    /* renamed from: hi.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7241b<T> implements Comparator {

        /* renamed from: j */
        final /* synthetic */ Function1 f19648j;

        public C7241b(Function1 function1) {
            this.f19648j = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m5209d;
            AbstractC7264g0 it = (AbstractC7264g0) t;
            Function1 function1 = this.f19648j;
            C9612q.m13918g(it, "it");
            String obj = function1.invoke(it).toString();
            AbstractC7264g0 it2 = (AbstractC7264g0) t2;
            Function1 function12 = this.f19648j;
            C9612q.m13918g(it2, "it");
            m5209d = C12466c.m5209d(obj, function12.invoke(it2).toString());
            return m5209d;
        }
    }

    /* renamed from: hi.f0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7242c extends AbstractC9614s implements Function1<AbstractC7264g0, String> {

        /* renamed from: j */
        public static final C7242c f19649j = new C7242c();

        C7242c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(AbstractC7264g0 it) {
            C9612q.m13917h(it, "it");
            return it.toString();
        }
    }

    /* renamed from: hi.f0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7243d extends AbstractC9614s implements Function1<AbstractC7264g0, CharSequence> {

        /* renamed from: j */
        final /* synthetic */ Function1<AbstractC7264g0, Object> f19650j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7243d(Function1<? super AbstractC7264g0, ? extends Object> function1) {
            super(1);
            this.f19650j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(AbstractC7264g0 it) {
            Function1<AbstractC7264g0, Object> function1 = this.f19650j;
            C9612q.m13918g(it, "it");
            return function1.invoke(it).toString();
        }
    }

    public C7239f0(Collection<? extends AbstractC7264g0> typesToIntersect) {
        C9612q.m13917h(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<AbstractC7264g0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f19645b = linkedHashSet;
        this.f19646c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static /* synthetic */ String m21153g(C7239f0 c7239f0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C7242c.f19649j;
        }
        return c7239f0.m21154f(function1);
    }

    /* renamed from: c */
    public final InterfaceC0194h m21157c() {
        return C0208n.f663d.m40954a("member scope for intersection type", this.f19645b);
    }

    /* renamed from: d */
    public final AbstractC7302o0 m21156d() {
        List m14104i;
        C7226c1 m21197h = C7226c1.f19622k.m21197h();
        m14104i = C9545j.m14104i();
        return C7267h0.m21096l(m21197h, this, m14104i, false, m21157c(), new C7240a());
    }

    /* renamed from: e */
    public final AbstractC7264g0 m21155e() {
        return this.f19644a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7239f0)) {
            return false;
        }
        return C9612q.m13922c(this.f19645b, ((C7239f0) obj).f19645b);
    }

    /* renamed from: f */
    public final String m21154f(Function1<? super AbstractC7264g0, ? extends Object> getProperTypeRelatedToStringify) {
        List m14028v0;
        String m14046d0;
        C9612q.m13917h(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        m14028v0 = C9553r.m14028v0(this.f19645b, new C7241b(getProperTypeRelatedToStringify));
        m14046d0 = C9553r.m14046d0(m14028v0, " & ", "{", "}", 0, null, new C7243d(getProperTypeRelatedToStringify), 24, null);
        return m14046d0;
    }

    @Override // p142hi.InterfaceC7265g1
    public List<InterfaceC11920f1> getParameters() {
        List<InterfaceC11920f1> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: h */
    public C7239f0 mo2789o(AbstractC7592g kotlinTypeRefiner) {
        int m14093t;
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<AbstractC7264g0> mo2791m = mo2791m();
        m14093t = C9546k.m14093t(mo2791m, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        boolean z = false;
        for (AbstractC7264g0 abstractC7264g0 : mo2791m) {
            arrayList.add(abstractC7264g0.mo3562P0(kotlinTypeRefiner));
            z = true;
        }
        C7239f0 c7239f0 = null;
        AbstractC7264g0 abstractC7264g02 = null;
        if (z) {
            AbstractC7264g0 m21155e = m21155e();
            if (m21155e != null) {
                abstractC7264g02 = m21155e.mo3562P0(kotlinTypeRefiner);
            }
            c7239f0 = new C7239f0(arrayList).m21151i(abstractC7264g02);
        }
        if (c7239f0 == null) {
            return this;
        }
        return c7239f0;
    }

    public int hashCode() {
        return this.f19646c;
    }

    /* renamed from: i */
    public final C7239f0 m21151i(AbstractC7264g0 abstractC7264g0) {
        return new C7239f0(this.f19645b, abstractC7264g0);
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: m */
    public Collection<AbstractC7264g0> mo2791m() {
        return this.f19645b;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        AbstractC10870h mo2790n = this.f19645b.iterator().next().mo3564N0().mo2790n();
        C9612q.m13918g(mo2790n, "intersectedTypes.iterato…xt().constructor.builtIns");
        return mo2790n;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: p */
    public InterfaceC11927h mo2788p() {
        return null;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: q */
    public boolean mo2787q() {
        return false;
    }

    public String toString() {
        return m21153g(this, null, 1, null);
    }

    private C7239f0(Collection<? extends AbstractC7264g0> collection, AbstractC7264g0 abstractC7264g0) {
        this(collection);
        this.f19644a = abstractC7264g0;
    }
}