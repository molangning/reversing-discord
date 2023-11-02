package p269og;

import ai.InterfaceC0194h;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import ng.C10884k;
import p142hi.AbstractC7219b;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p304qf.AbstractC11883p;
import p305qg.AbstractC11930h1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.C11994x;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p325rg.InterfaceC12155g;
import pf.C11581q;
import ph.C11632b;
import ph.C11638f;
import tg.AbstractC12674a;
import tg.C12711k0;

/* renamed from: og.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11098b extends AbstractC12674a {

    /* renamed from: v */
    public static final C11099a f29048v = new C11099a(null);

    /* renamed from: w */
    private static final C11632b f29049w = new C11632b(C10884k.f28428u, C11638f.m7422f("Function"));

    /* renamed from: x */
    private static final C11632b f29050x = new C11632b(C10884k.f28425r, C11638f.m7422f("KFunction"));

    /* renamed from: o */
    private final InterfaceC6821n f29051o;

    /* renamed from: p */
    private final InterfaceC11945l0 f29052p;

    /* renamed from: q */
    private final EnumC11102c f29053q;

    /* renamed from: r */
    private final int f29054r;

    /* renamed from: s */
    private final C11100b f29055s;

    /* renamed from: t */
    private final C11105d f29056t;

    /* renamed from: u */
    private final List<InterfaceC11920f1> f29057u;

    /* renamed from: og.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11099a {
        private C11099a() {
        }

        public /* synthetic */ C11099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: og.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public final class C11100b extends AbstractC7219b {

        /* renamed from: og.b$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public /* synthetic */ class C11101a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f29059a;

            static {
                int[] iArr = new int[EnumC11102c.values().length];
                try {
                    iArr[EnumC11102c.f29061o.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC11102c.f29063q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC11102c.f29062p.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC11102c.f29064r.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f29059a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11100b() {
            super(r1.f29051o);
            C11098b.this = r1;
        }

        @Override // p142hi.InterfaceC7265g1
        public List<InterfaceC11920f1> getParameters() {
            return C11098b.this.f29057u;
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: h */
        protected Collection<AbstractC7264g0> mo4458h() {
            List<C11632b> m14109d;
            int m14093t;
            List m14075C0;
            List<InterfaceC11920f1> m14026x0;
            int m14093t2;
            int i = C11101a.f29059a[C11098b.this.m9172U0().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            m14109d = C9545j.m14101l(C11098b.f29050x, new C11632b(C10884k.f28420m, EnumC11102c.f29062p.m9162d(C11098b.this.m9176Q0())));
                        } else {
                            throw new C11581q();
                        }
                    } else {
                        m14109d = C9544i.m14109d(C11098b.f29049w);
                    }
                } else {
                    m14109d = C9545j.m14101l(C11098b.f29050x, new C11632b(C10884k.f28428u, EnumC11102c.f29061o.m9162d(C11098b.this.m9176Q0())));
                }
            } else {
                m14109d = C9544i.m14109d(C11098b.f29049w);
            }
            InterfaceC11928h0 mo4163b = C11098b.this.f29052p.mo4163b();
            m14093t = C9546k.m14093t(m14109d, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (C11632b c11632b : m14109d) {
                InterfaceC11914e m6652a = C11994x.m6652a(mo4163b, c11632b);
                if (m6652a != null) {
                    m14026x0 = C9553r.m14026x0(getParameters(), m6652a.mo4173k().getParameters().size());
                    m14093t2 = C9546k.m14093t(m14026x0, 10);
                    ArrayList arrayList2 = new ArrayList(m14093t2);
                    for (InterfaceC11920f1 interfaceC11920f1 : m14026x0) {
                        arrayList2.add(new C7294m1(interfaceC11920f1.mo4224p()));
                    }
                    arrayList.add(C7267h0.m21101g(C7226c1.f19622k.m21197h(), m6652a, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + c11632b + " not found").toString());
                }
            }
            m14075C0 = C9553r.m14075C0(arrayList);
            return m14075C0;
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: l */
        protected InterfaceC11912d1 mo4456l() {
            return InterfaceC11912d1.C11913a.f30912a;
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: q */
        public boolean mo2787q() {
            return true;
        }

        public String toString() {
            return mo9167w().toString();
        }

        @Override // p142hi.AbstractC7219b
        /* renamed from: x */
        public C11098b mo9167w() {
            return C11098b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11098b(InterfaceC6821n storageManager, InterfaceC11945l0 containingDeclaration, EnumC11102c functionKind, int i) {
        super(storageManager, functionKind.m9162d(i));
        int m14093t;
        List<InterfaceC11920f1> m14075C0;
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(functionKind, "functionKind");
        this.f29051o = storageManager;
        this.f29052p = containingDeclaration;
        this.f29053q = functionKind;
        this.f29054r = i;
        this.f29055s = new C11100b();
        this.f29056t = new C11105d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i);
        m14093t = C9546k.m14093t(intRange, 10);
        ArrayList arrayList2 = new ArrayList(m14093t);
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11883p) it).nextInt();
            EnumC7336w1 enumC7336w1 = EnumC7336w1.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(nextInt);
            m9182K0(arrayList, this, enumC7336w1, sb2.toString());
            arrayList2.add(Unit.f25302a);
        }
        m9182K0(arrayList, this, EnumC7336w1.OUT_VARIANCE, "R");
        m14075C0 = C9553r.m14075C0(arrayList);
        this.f29057u = m14075C0;
    }

    /* renamed from: K0 */
    private static final void m9182K0(ArrayList<InterfaceC11920f1> arrayList, C11098b c11098b, EnumC7336w1 enumC7336w1, String str) {
        arrayList.add(C12711k0.m4399R0(c11098b, InterfaceC12155g.f31603f.m6037b(), false, enumC7336w1, C11638f.m7422f(str), arrayList.size(), c11098b.f29051o));
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: C */
    public /* bridge */ /* synthetic */ InterfaceC11910d mo4187C() {
        return (InterfaceC11910d) m9168Y0();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: I0 */
    public boolean mo4185I0() {
        return false;
    }

    /* renamed from: Q0 */
    public final int m9176Q0() {
        return this.f29054r;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: R */
    public AbstractC11930h1<AbstractC7302o0> mo4179R() {
        return null;
    }

    /* renamed from: R0 */
    public Void m9175R0() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: S0 */
    public List<InterfaceC11910d> mo4171l() {
        List<InterfaceC11910d> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11959n, p305qg.InterfaceC11947m
    /* renamed from: T0 */
    public InterfaceC11945l0 mo4163b() {
        return this.f29052p;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return false;
    }

    /* renamed from: U0 */
    public final EnumC11102c m9172U0() {
        return this.f29053q;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: V0 */
    public List<InterfaceC11914e> mo4165y() {
        List<InterfaceC11914e> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: W0 */
    public InterfaceC0194h.C0197b mo4170l0() {
        return InterfaceC0194h.C0197b.f649b;
    }

    @Override // tg.AbstractC12739t
    /* renamed from: X0 */
    public C11105d mo4166r0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f29056t;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Y */
    public boolean mo4177Y() {
        return false;
    }

    /* renamed from: Y0 */
    public Void m9168Y0() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: c0 */
    public boolean mo4176c0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: g */
    public EnumC11918f mo4175g() {
        return EnumC11918f.INTERFACE;
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        return InterfaceC12155g.f31603f.m6037b();
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u PUBLIC = C11974t.f30970e;
        C9612q.m13918g(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // p305qg.InterfaceC11911d0
    public boolean isExternal() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    public boolean isInline() {
        return false;
    }

    @Override // p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
        C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: j0 */
    public boolean mo4174j0() {
        return false;
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        return this.f29055s;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: m0 */
    public /* bridge */ /* synthetic */ InterfaceC11914e mo4169m0() {
        return (InterfaceC11914e) m9175R0();
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11931i
    /* renamed from: q */
    public List<InterfaceC11920f1> mo4168q() {
        return this.f29057u;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        return EnumC11915e0.ABSTRACT;
    }

    public String toString() {
        String m7426b = getName().m7426b();
        C9612q.m13918g(m7426b, "name.asString()");
        return m7426b;
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: z */
    public boolean mo4164z() {
        return false;
    }
}