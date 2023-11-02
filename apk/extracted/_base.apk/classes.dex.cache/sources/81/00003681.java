package p142hi;

import gg.C6759j;
import gi.C6795f;
import gi.InterfaceC6813g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.collections.C9559v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7272h1;
import p161ii.C7586d;
import p183ji.C8964h;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p234mi.C10472a;
import p304qf.C11888u;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import pf.C11577n;
import pf.C11591x;

/* renamed from: hi.j1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7281j1 {

    /* renamed from: f */
    public static final C7282a f19711f = new C7282a(null);

    /* renamed from: a */
    private final C7337x f19712a;

    /* renamed from: b */
    private final C7277i1 f19713b;

    /* renamed from: c */
    private final C6795f f19714c;

    /* renamed from: d */
    private final Lazy f19715d;

    /* renamed from: e */
    private final InterfaceC6813g<C7283b, AbstractC7264g0> f19716e;

    /* renamed from: hi.j1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7282a {
        private C7282a() {
        }

        public /* synthetic */ C7282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:225:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:229:0x014e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:233:0x01f0 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p142hi.AbstractC7264g0 m21064a(p142hi.AbstractC7264g0 r17, p142hi.C7307p1 r18, java.util.Set<? extends p305qg.InterfaceC11920f1> r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 529
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p142hi.C7281j1.C7282a.m21064a(hi.g0, hi.p1, java.util.Set, boolean):hi.g0");
        }
    }

    /* renamed from: hi.j1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7283b {

        /* renamed from: a */
        private final InterfaceC11920f1 f19717a;

        /* renamed from: b */
        private final C7341y f19718b;

        public C7283b(InterfaceC11920f1 typeParameter, C7341y typeAttr) {
            C9612q.m13917h(typeParameter, "typeParameter");
            C9612q.m13917h(typeAttr, "typeAttr");
            this.f19717a = typeParameter;
            this.f19718b = typeAttr;
        }

        /* renamed from: a */
        public final C7341y m21063a() {
            return this.f19718b;
        }

        /* renamed from: b */
        public final InterfaceC11920f1 m21062b() {
            return this.f19717a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7283b)) {
                return false;
            }
            C7283b c7283b = (C7283b) obj;
            if (!C9612q.m13922c(c7283b.f19717a, this.f19717a) || !C9612q.m13922c(c7283b.f19718b, this.f19718b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f19717a.hashCode();
            return hashCode + (hashCode * 31) + this.f19718b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f19717a + ", typeAttr=" + this.f19718b + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hi.j1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7284c extends AbstractC9614s implements Function0<C8964h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7284c() {
            super(0);
            C7281j1.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C8964h invoke() {
            return C8967k.m16945d(EnumC8966j.CANNOT_COMPUTE_ERASED_BOUND, C7281j1.this.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hi.j1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7285d extends AbstractC9614s implements Function1<C7283b, AbstractC7264g0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7285d() {
            super(1);
            C7281j1.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(C7283b c7283b) {
            return C7281j1.this.m21067d(c7283b.m21062b(), c7283b.m21063a());
        }
    }

    public C7281j1(C7337x projectionComputer, C7277i1 options) {
        Lazy m7601a;
        C9612q.m13917h(projectionComputer, "projectionComputer");
        C9612q.m13917h(options, "options");
        this.f19712a = projectionComputer;
        this.f19713b = options;
        C6795f c6795f = new C6795f("Type parameter upper bound erasure results");
        this.f19714c = c6795f;
        m7601a = C11577n.m7601a(new C7284c());
        this.f19715d = m7601a;
        InterfaceC6813g<C7283b, AbstractC7264g0> mo21861i = c6795f.mo21861i(new C7285d());
        C9612q.m13918g(mo21861i, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.f19716e = mo21861i;
    }

    /* renamed from: b */
    private final AbstractC7264g0 m21069b(C7341y c7341y) {
        AbstractC7264g0 m11435w;
        AbstractC7302o0 mo20913a = c7341y.mo20913a();
        return (mo20913a == null || (m11435w = C10472a.m11435w(mo20913a)) == null) ? m21066e() : m11435w;
    }

    /* renamed from: d */
    public final AbstractC7264g0 m21067d(InterfaceC11920f1 interfaceC11920f1, C7341y c7341y) {
        int m14093t;
        int m6758d;
        int m21930c;
        List<AbstractC7264g0> m14075C0;
        int m14093t2;
        Object m14034p0;
        InterfaceC7288k1 mo20933a;
        Set<InterfaceC11920f1> mo20911c = c7341y.mo20911c();
        if (mo20911c != null && mo20911c.contains(interfaceC11920f1.mo4221a())) {
            return m21069b(c7341y);
        }
        AbstractC7302o0 mo4224p = interfaceC11920f1.mo4224p();
        C9612q.m13918g(mo4224p, "typeParameter.defaultType");
        Set<InterfaceC11920f1> m11451g = C10472a.m11451g(mo4224p, mo20911c);
        m14093t = C9546k.m14093t(m11451g, 10);
        m6758d = C11888u.m6758d(m14093t);
        m21930c = C6759j.m21930c(m6758d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
        for (InterfaceC11920f1 interfaceC11920f12 : m11451g) {
            if (mo20911c != null && mo20911c.contains(interfaceC11920f12)) {
                mo20933a = C7320s1.m20975t(interfaceC11920f12, c7341y);
                C9612q.m13918g(mo20933a, "makeStarProjection(it, typeAttr)");
            } else {
                mo20933a = this.f19712a.mo20933a(interfaceC11920f12, c7341y, this, m21068c(interfaceC11920f12, c7341y.mo20910d(interfaceC11920f1)));
            }
            Pair m7577a = C11591x.m7577a(interfaceC11920f12.mo4173k(), mo20933a);
            linkedHashMap.put(m7577a.m14349c(), m7577a.m14348d());
        }
        boolean z = false;
        C7307p1 m21027g = C7307p1.m21027g(AbstractC7272h1.C7273a.m21084e(AbstractC7272h1.f19700c, linkedHashMap, false, 2, null));
        C9612q.m13918g(m21027g, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List<AbstractC7264g0> upperBounds = interfaceC11920f1.getUpperBounds();
        C9612q.m13918g(upperBounds, "typeParameter.upperBounds");
        Set<AbstractC7264g0> m21065f = m21065f(m21027g, upperBounds, c7341y);
        if (!m21065f.isEmpty()) {
            if (!this.f19713b.m21081a()) {
                if (m21065f.size() == 1) {
                    z = true;
                }
                if (z) {
                    m14034p0 = C9553r.m14034p0(m21065f);
                    return (AbstractC7264g0) m14034p0;
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
            }
            m14075C0 = C9553r.m14075C0(m21065f);
            m14093t2 = C9546k.m14093t(m14075C0, 10);
            ArrayList arrayList = new ArrayList(m14093t2);
            for (AbstractC7264g0 abstractC7264g0 : m14075C0) {
                arrayList.add(abstractC7264g0.mo20916Q0());
            }
            return C7586d.m20288a(arrayList);
        }
        return m21069b(c7341y);
    }

    /* renamed from: e */
    private final C8964h m21066e() {
        return (C8964h) this.f19715d.getValue();
    }

    /* renamed from: f */
    private final Set<AbstractC7264g0> m21065f(C7307p1 c7307p1, List<? extends AbstractC7264g0> list, C7341y c7341y) {
        Set m14009b;
        Set<AbstractC7264g0> m14010a;
        m14009b = C9559v.m14009b();
        for (AbstractC7264g0 abstractC7264g0 : list) {
            InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
            if (mo2788p instanceof InterfaceC11914e) {
                m14009b.add(f19711f.m21064a(abstractC7264g0, c7307p1, c7341y.mo20911c(), this.f19713b.m21080b()));
            } else if (mo2788p instanceof InterfaceC11920f1) {
                Set<InterfaceC11920f1> mo20911c = c7341y.mo20911c();
                boolean z = false;
                if (mo20911c != null && mo20911c.contains(mo2788p)) {
                    z = true;
                }
                if (z) {
                    m14009b.add(m21069b(c7341y));
                } else {
                    List<AbstractC7264g0> upperBounds = ((InterfaceC11920f1) mo2788p).getUpperBounds();
                    C9612q.m13918g(upperBounds, "declaration.upperBounds");
                    m14009b.addAll(m21065f(c7307p1, upperBounds, c7341y));
                }
            }
            if (!this.f19713b.m21081a()) {
                break;
            }
        }
        m14010a = C9559v.m14010a(m14009b);
        return m14010a;
    }

    /* renamed from: c */
    public final AbstractC7264g0 m21068c(InterfaceC11920f1 typeParameter, C7341y typeAttr) {
        C9612q.m13917h(typeParameter, "typeParameter");
        C9612q.m13917h(typeAttr, "typeAttr");
        AbstractC7264g0 invoke = this.f19716e.invoke(new C7283b(typeParameter, typeAttr));
        C9612q.m13918g(invoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return invoke;
    }

    public /* synthetic */ C7281j1(C7337x c7337x, C7277i1 c7277i1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7337x, (i & 2) != 0 ? new C7277i1(false, false) : c7277i1);
    }
}