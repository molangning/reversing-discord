package p389vh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.C7303o1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import pf.C11577n;
import pf.C11581q;

/* renamed from: vh.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13312n implements InterfaceC7265g1 {

    /* renamed from: f */
    public static final C13313a f34386f = new C13313a(null);

    /* renamed from: a */
    private final long f34387a;

    /* renamed from: b */
    private final InterfaceC11928h0 f34388b;

    /* renamed from: c */
    private final Set<AbstractC7264g0> f34389c;

    /* renamed from: d */
    private final AbstractC7302o0 f34390d;

    /* renamed from: e */
    private final Lazy f34391e;

    /* renamed from: vh.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13313a {

        /* renamed from: vh.n$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public enum EnumC13314a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* renamed from: vh.n$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public /* synthetic */ class C13315b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f34395a;

            static {
                int[] iArr = new int[EnumC13314a.values().length];
                try {
                    iArr[EnumC13314a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13314a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f34395a = iArr;
            }
        }

        private C13313a() {
        }

        public /* synthetic */ C13313a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final AbstractC7302o0 m2799a(Collection<? extends AbstractC7302o0> collection, EnumC13314a enumC13314a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    C13313a c13313a = C13312n.f34386f;
                    next = c13313a.m2797c((AbstractC7302o0) next, (AbstractC7302o0) it.next(), enumC13314a);
                }
                return (AbstractC7302o0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        /* renamed from: c */
        private final AbstractC7302o0 m2797c(AbstractC7302o0 abstractC7302o0, AbstractC7302o0 abstractC7302o02, EnumC13314a enumC13314a) {
            if (abstractC7302o0 == null || abstractC7302o02 == null) {
                return null;
            }
            InterfaceC7265g1 mo3564N0 = abstractC7302o0.mo3564N0();
            InterfaceC7265g1 mo3564N02 = abstractC7302o02.mo3564N0();
            boolean z = mo3564N0 instanceof C13312n;
            if (z && (mo3564N02 instanceof C13312n)) {
                return m2795e((C13312n) mo3564N0, (C13312n) mo3564N02, enumC13314a);
            }
            if (z) {
                return m2796d((C13312n) mo3564N0, abstractC7302o02);
            }
            if (!(mo3564N02 instanceof C13312n)) {
                return null;
            }
            return m2796d((C13312n) mo3564N02, abstractC7302o0);
        }

        /* renamed from: d */
        private final AbstractC7302o0 m2796d(C13312n c13312n, AbstractC7302o0 abstractC7302o0) {
            if (c13312n.m2803g().contains(abstractC7302o0)) {
                return abstractC7302o0;
            }
            return null;
        }

        /* renamed from: e */
        private final AbstractC7302o0 m2795e(C13312n c13312n, C13312n c13312n2, EnumC13314a enumC13314a) {
            Set m14050Z;
            int i = C13315b.f34395a[enumC13314a.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m14050Z = C9553r.m14070H0(c13312n.m2803g(), c13312n2.m2803g());
                } else {
                    throw new C11581q();
                }
            } else {
                m14050Z = C9553r.m14050Z(c13312n.m2803g(), c13312n2.m2803g());
            }
            return C7267h0.m21103e(C7226c1.f19622k.m21197h(), new C13312n(c13312n.f34387a, c13312n.f34388b, m14050Z, null), false);
        }

        /* renamed from: b */
        public final AbstractC7302o0 m2798b(Collection<? extends AbstractC7302o0> types) {
            C9612q.m13917h(types, "types");
            return m2799a(types, EnumC13314a.INTERSECTION_TYPE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vh.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13316b extends AbstractC9614s implements Function0<List<AbstractC7302o0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13316b() {
            super(0);
            C13312n.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<AbstractC7302o0> invoke() {
            List m14109d;
            List<AbstractC7302o0> m14098o;
            AbstractC7302o0 mo4224p = C13312n.this.mo2790n().m9781x().mo4224p();
            C9612q.m13918g(mo4224p, "builtIns.comparable.defaultType");
            m14109d = C9544i.m14109d(new C7294m1(EnumC7336w1.IN_VARIANCE, C13312n.this.f34390d));
            m14098o = C9545j.m14098o(C7303o1.m21042f(mo4224p, m14109d, null, 2, null));
            if (!C13312n.this.m2801i()) {
                m14098o.add(C13312n.this.mo2790n().m9839L());
            }
            return m14098o;
        }
    }

    /* renamed from: vh.n$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13317c extends AbstractC9614s implements Function1<AbstractC7264g0, CharSequence> {

        /* renamed from: j */
        public static final C13317c f34397j = new C13317c();

        C13317c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(AbstractC7264g0 it) {
            C9612q.m13917h(it, "it");
            return it.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13312n(long j, InterfaceC11928h0 interfaceC11928h0, Set<? extends AbstractC7264g0> set) {
        Lazy m7601a;
        this.f34390d = C7267h0.m21103e(C7226c1.f19622k.m21197h(), this, false);
        m7601a = C11577n.m7601a(new C13316b());
        this.f34391e = m7601a;
        this.f34387a = j;
        this.f34388b = interfaceC11928h0;
        this.f34389c = set;
    }

    public /* synthetic */ C13312n(long j, InterfaceC11928h0 interfaceC11928h0, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, interfaceC11928h0, set);
    }

    /* renamed from: h */
    private final List<AbstractC7264g0> m2802h() {
        return (List) this.f34391e.getValue();
    }

    /* renamed from: i */
    public final boolean m2801i() {
        Collection<AbstractC7264g0> m2778a = C13327t.m2778a(this.f34388b);
        if ((m2778a instanceof Collection) && m2778a.isEmpty()) {
            return true;
        }
        for (AbstractC7264g0 abstractC7264g0 : m2778a) {
            if (!(!this.f34389c.contains(abstractC7264g0))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private final String m2800j() {
        String m14046d0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        m14046d0 = C9553r.m14046d0(this.f34389c, ",", null, null, 0, null, C13317c.f34397j, 30, null);
        sb2.append(m14046d0);
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: g */
    public final Set<AbstractC7264g0> m2803g() {
        return this.f34389c;
    }

    @Override // p142hi.InterfaceC7265g1
    public List<InterfaceC11920f1> getParameters() {
        List<InterfaceC11920f1> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: m */
    public Collection<AbstractC7264g0> mo2791m() {
        return m2802h();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        return this.f34388b.mo4194n();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: o */
    public InterfaceC7265g1 mo2789o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
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
        return "IntegerLiteralType" + m2800j();
    }
}