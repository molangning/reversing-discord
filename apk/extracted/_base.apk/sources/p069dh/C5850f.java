package p069dh;

import ai.C0191f;
import ai.InterfaceC0194h;
import bh.InterfaceC2300c;
import ch.C2537a;
import ch.C2545e;
import ch.C2548g;
import gh.InterfaceC6760a;
import gh.InterfaceC6770g;
import gh.InterfaceC6773j;
import gh.InterfaceC6787x;
import gh.InterfaceC6788y;
import gi.InterfaceC6815i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p013ah.InterfaceC0170g;
import p070di.InterfaceC5950r;
import p086eh.C6224a;
import p086eh.C6225b;
import p142hi.AbstractC7219b;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.EnumC7317r1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.AbstractC11930h1;
import p305qg.AbstractC11963n1;
import p305qg.AbstractC11988u;
import p305qg.C11923g1;
import p305qg.C11938k0;
import p305qg.C11974t;
import p305qg.C12000y0;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p327ri.C12242a;
import p340sf.C12466c;
import p389vh.C13329v;
import p429xh.C13801c;
import p468zg.C14208b0;
import p468zg.C14239j0;
import p468zg.C14252s;
import pf.C11577n;
import pg.C11629l;
import ph.C11632b;
import ph.C11633c;
import ph.C11636e;
import tg.AbstractC12700g;

/* renamed from: dh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5850f extends AbstractC12700g implements InterfaceC2300c {

    /* renamed from: H */
    public static final C5851a f16733H = new C5851a(null);

    /* renamed from: I */
    private static final Set<String> f16734I;

    /* renamed from: A */
    private final C5852b f16735A;

    /* renamed from: B */
    private final C5858g f16736B;

    /* renamed from: C */
    private final C12000y0<C5858g> f16737C;

    /* renamed from: D */
    private final C0191f f16738D;

    /* renamed from: E */
    private final C5900l f16739E;

    /* renamed from: F */
    private final InterfaceC12155g f16740F;

    /* renamed from: G */
    private final InterfaceC6815i<List<InterfaceC11920f1>> f16741G;

    /* renamed from: r */
    private final C2548g f16742r;

    /* renamed from: s */
    private final InterfaceC6770g f16743s;

    /* renamed from: t */
    private final InterfaceC11914e f16744t;

    /* renamed from: u */
    private final C2548g f16745u;

    /* renamed from: v */
    private final Lazy f16746v;

    /* renamed from: w */
    private final EnumC11918f f16747w;

    /* renamed from: x */
    private final EnumC11915e0 f16748x;

    /* renamed from: y */
    private final AbstractC11963n1 f16749y;

    /* renamed from: z */
    private final boolean f16750z;

    /* renamed from: dh.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5851a {
        private C5851a() {
        }

        public /* synthetic */ C5851a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dh.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public final class C5852b extends AbstractC7219b {

        /* renamed from: d */
        private final InterfaceC6815i<List<InterfaceC11920f1>> f16751d;

        /* renamed from: dh.f$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C5853a extends AbstractC9614s implements Function0<List<? extends InterfaceC11920f1>> {

            /* renamed from: j */
            final /* synthetic */ C5850f f16753j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5853a(C5850f c5850f) {
                super(0);
                this.f16753j = c5850f;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC11920f1> invoke() {
                return C11923g1.m6712d(this.f16753j);
            }
        }

        public C5852b() {
            super(C5850f.this.f16745u.m33010e());
            this.f16751d = C5850f.this.f16745u.m33010e().mo21867c(new C5853a(C5850f.this));
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
            if (r3 != false) goto L9;
         */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final p142hi.AbstractC7264g0 m24343x() {
            /*
                r8 = this;
                ph.c r0 = r8.m24342y()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                boolean r3 = r0.m7456d()
                if (r3 != 0) goto L18
                ph.f r3 = ng.C10884k.f28427t
                boolean r3 = r0.m7451i(r3)
                if (r3 == 0) goto L18
                r3 = r1
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 != 0) goto L2e
                zg.m r3 = p468zg.C14244m.f36635a
                dh.f r4 = p069dh.C5850f.this
                ph.c r4 = p429xh.C13801c.m1503l(r4)
                ph.c r3 = r3.m329b(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                dh.f r4 = p069dh.C5850f.this
                ch.g r4 = p069dh.C5850f.m24352L0(r4)
                qg.h0 r4 = r4.m33011d()
                yg.d r5 = p448yg.EnumC14023d.FROM_JAVA_LOADER
                qg.e r3 = p429xh.C13801c.m1493v(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                hi.g1 r4 = r3.mo4173k()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                dh.f r5 = p069dh.C5850f.this
                hi.g1 r5 = r5.mo4173k()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.C9612q.m13918g(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L8d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.C9543h.m14124t(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L72:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lc7
                java.lang.Object r2 = r1.next()
                qg.f1 r2 = (p305qg.InterfaceC11920f1) r2
                hi.m1 r4 = new hi.m1
                hi.w1 r5 = p142hi.EnumC7336w1.INVARIANT
                hi.o0 r2 = r2.mo4224p()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L72
            L8d:
                if (r6 != r1) goto Ld2
                if (r4 <= r1) goto Ld2
                if (r0 != 0) goto Ld2
                hi.m1 r0 = new hi.m1
                hi.w1 r2 = p142hi.EnumC7336w1.INVARIANT
                java.lang.Object r5 = kotlin.collections.C9543h.m14129q0(r5)
                qg.f1 r5 = (p305qg.InterfaceC11920f1) r5
                hi.o0 r5 = r5.mo4224p()
                r0.<init>(r2, r5)
                kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.C9543h.m14124t(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lb6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lc6
                r4 = r2
                qf.p r4 = (p304qf.AbstractC11883p) r4
                r4.nextInt()
                r1.add(r0)
                goto Lb6
            Lc6:
                r0 = r1
            Lc7:
                hi.c1$a r1 = p142hi.C7226c1.f19622k
                hi.c1 r1 = r1.m21197h()
                hi.o0 r0 = p142hi.C7267h0.m21101g(r1, r3, r0)
                return r0
            Ld2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p069dh.C5850f.C5852b.m24343x():hi.g0");
        }

        /* renamed from: y */
        private final C11633c m24342y() {
            Object m14032r0;
            C13329v c13329v;
            String mo2813b;
            InterfaceC12155g annotations = C5850f.this.getAnnotations();
            C11633c PURELY_IMPLEMENTS_ANNOTATION = C14208b0.f36548q;
            C9612q.m13918g(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            InterfaceC12149c mo6024b = annotations.mo6024b(PURELY_IMPLEMENTS_ANNOTATION);
            if (mo6024b == null) {
                return null;
            }
            m14032r0 = C9553r.m14032r0(mo6024b.mo6032a().values());
            if (m14032r0 instanceof C13329v) {
                c13329v = (C13329v) m14032r0;
            } else {
                c13329v = null;
            }
            if (c13329v == null || (mo2813b = c13329v.mo2813b()) == null || !C11636e.m7430e(mo2813b)) {
                return null;
            }
            return new C11633c(mo2813b);
        }

        @Override // p142hi.InterfaceC7265g1
        public List<InterfaceC11920f1> getParameters() {
            return this.f16751d.invoke();
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: h */
        protected Collection<AbstractC7264g0> mo4458h() {
            Object obj;
            List m14109d;
            List m14075C0;
            int m14093t;
            Collection<InterfaceC6773j> mo2208m = C5850f.this.m24348P0().mo2208m();
            ArrayList arrayList = new ArrayList(mo2208m.size());
            ArrayList<InterfaceC6787x> arrayList2 = new ArrayList(0);
            AbstractC7264g0 m24343x = m24343x();
            Iterator<InterfaceC6773j> it = mo2208m.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC6773j next = it.next();
                AbstractC7264g0 m21278h = C5850f.this.f16745u.m33014a().m33032r().m21278h(C5850f.this.f16745u.m33008g().m23194o(next, C6225b.m23210b(EnumC7317r1.SUPERTYPE, false, false, null, 7, null)), C5850f.this.f16745u);
                if (m21278h.mo3564N0().mo2788p() instanceof C11938k0.C11940b) {
                    arrayList2.add(next);
                }
                InterfaceC7265g1 mo3564N0 = m21278h.mo3564N0();
                if (m24343x != null) {
                    obj = m24343x.mo3564N0();
                }
                if (!C9612q.m13922c(mo3564N0, obj) && !AbstractC10870h.m9822b0(m21278h)) {
                    arrayList.add(m21278h);
                }
            }
            InterfaceC11914e interfaceC11914e = C5850f.this.f16744t;
            if (interfaceC11914e != null) {
                obj = C11629l.m7473a(interfaceC11914e, C5850f.this).m21051c().m21018p(interfaceC11914e.mo4224p(), EnumC7336w1.INVARIANT);
            }
            C12242a.m5675a(arrayList, obj);
            C12242a.m5675a(arrayList, m24343x);
            if (!arrayList2.isEmpty()) {
                InterfaceC5950r m33047c = C5850f.this.f16745u.m33014a().m33047c();
                InterfaceC11914e mo2788p = mo2788p();
                m14093t = C9546k.m14093t(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(m14093t);
                for (InterfaceC6787x interfaceC6787x : arrayList2) {
                    C9612q.m13919f(interfaceC6787x, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((InterfaceC6773j) interfaceC6787x).mo2190E());
                }
                m33047c.mo2842a(mo2788p, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                m14075C0 = C9553r.m14075C0(arrayList);
                return m14075C0;
            }
            m14109d = C9544i.m14109d(C5850f.this.f16745u.m33011d().mo4194n().m9810i());
            return m14109d;
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: l */
        protected InterfaceC11912d1 mo4456l() {
            return C5850f.this.f16745u.m33014a().m33028v();
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: q */
        public boolean mo2787q() {
            return true;
        }

        public String toString() {
            String m7426b = C5850f.this.getName().m7426b();
            C9612q.m13918g(m7426b, "name.asString()");
            return m7426b;
        }

        @Override // p142hi.AbstractC7292m, p142hi.InterfaceC7265g1
        /* renamed from: w */
        public InterfaceC11914e mo2788p() {
            return C5850f.this;
        }
    }

    /* renamed from: dh.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5854c extends AbstractC9614s implements Function0<List<? extends InterfaceC11920f1>> {
        C5854c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC11920f1> invoke() {
            int m14093t;
            List<InterfaceC6788y> typeParameters = C5850f.this.m24348P0().getTypeParameters();
            C5850f c5850f = C5850f.this;
            m14093t = C9546k.m14093t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC6788y interfaceC6788y : typeParameters) {
                InterfaceC11920f1 mo32999a = c5850f.f16745u.m33009f().mo32999a(interfaceC6788y);
                if (mo32999a != null) {
                    arrayList.add(mo32999a);
                } else {
                    throw new AssertionError("Parameter " + interfaceC6788y + " surely belongs to class " + c5850f.m24348P0() + ", so it must be resolved");
                }
            }
            return arrayList;
        }
    }

    /* renamed from: dh.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5855d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m5209d;
            m5209d = C12466c.m5209d(C13801c.m1503l((InterfaceC11914e) t).m7458b(), C13801c.m1503l((InterfaceC11914e) t2).m7458b());
            return m5209d;
        }
    }

    /* renamed from: dh.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5856e extends AbstractC9614s implements Function0<List<? extends InterfaceC6760a>> {
        C5856e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC6760a> invoke() {
            C11632b m1504k = C13801c.m1504k(C5850f.this);
            if (m1504k != null) {
                return C5850f.this.m24346R0().m33014a().m33044f().mo299a(m1504k);
            }
            return null;
        }
    }

    /* renamed from: dh.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C5857f extends AbstractC9614s implements Function1<AbstractC7592g, C5858g> {
        C5857f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C5858g invoke(AbstractC7592g it) {
            boolean z;
            C9612q.m13917h(it, "it");
            C2548g c2548g = C5850f.this.f16745u;
            C5850f c5850f = C5850f.this;
            InterfaceC6770g m24348P0 = c5850f.m24348P0();
            if (C5850f.this.f16744t != null) {
                z = true;
            } else {
                z = false;
            }
            return new C5858g(c2548g, c5850f, m24348P0, z, C5850f.this.f16736B);
        }
    }

    static {
        Set<String> m14002i;
        m14002i = C9560w.m14002i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
        f16734I = m14002i;
    }

    public /* synthetic */ C5850f(C2548g c2548g, InterfaceC11947m interfaceC11947m, InterfaceC6770g interfaceC6770g, InterfaceC11914e interfaceC11914e, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2548g, interfaceC11947m, interfaceC6770g, (i & 8) != 0 ? null : interfaceC11914e);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: C */
    public InterfaceC11910d mo4187C() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: I0 */
    public boolean mo4185I0() {
        return false;
    }

    /* renamed from: N0 */
    public final C5850f m24350N0(InterfaceC0170g javaResolverCache, InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(javaResolverCache, "javaResolverCache");
        C2548g c2548g = this.f16745u;
        C2548g m33052i = C2537a.m33052i(c2548g, c2548g.m33014a().m33026x(javaResolverCache));
        InterfaceC11947m containingDeclaration = mo4163b();
        C9612q.m13918g(containingDeclaration, "containingDeclaration");
        return new C5850f(m33052i, containingDeclaration, this.f16743s, interfaceC11914e);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: O0 */
    public List<InterfaceC11910d> mo4171l() {
        return this.f16736B.m24291x0().invoke();
    }

    /* renamed from: P0 */
    public final InterfaceC6770g m24348P0() {
        return this.f16743s;
    }

    @Override // tg.AbstractC12674a, p305qg.InterfaceC11914e
    /* renamed from: Q */
    public InterfaceC0194h mo4228Q() {
        return this.f16738D;
    }

    /* renamed from: Q0 */
    public final List<InterfaceC6760a> m24347Q0() {
        return (List) this.f16746v.getValue();
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: R */
    public AbstractC11930h1<AbstractC7302o0> mo4179R() {
        return null;
    }

    /* renamed from: R0 */
    public final C2548g m24346R0() {
        return this.f16742r;
    }

    @Override // tg.AbstractC12674a, p305qg.InterfaceC11914e
    /* renamed from: S0 */
    public C5858g mo4227T() {
        InterfaceC0194h mo4227T = super.mo4227T();
        C9612q.m13919f(mo4227T, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C5858g) mo4227T;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC12739t
    /* renamed from: T0 */
    public C5858g mo4166r0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f16737C.m6644c(kotlinTypeRefiner);
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Y */
    public boolean mo4177Y() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: c0 */
    public boolean mo4176c0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: g */
    public EnumC11918f mo4175g() {
        return this.f16747w;
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        return this.f16740F;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        if (C9612q.m13922c(this.f16749y, C11974t.f30966a) && this.f16743s.mo2207o() == null) {
            AbstractC11988u abstractC11988u = C14252s.f36645a;
            C9612q.m13918g(abstractC11988u, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return abstractC11988u;
        }
        return C14239j0.m337d(this.f16749y);
    }

    @Override // p305qg.InterfaceC11914e
    public boolean isInline() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: j0 */
    public boolean mo4174j0() {
        return false;
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        return this.f16735A;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: l0 */
    public InterfaceC0194h mo4170l0() {
        return this.f16739E;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: m0 */
    public InterfaceC11914e mo4169m0() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11931i
    /* renamed from: q */
    public List<InterfaceC11920f1> mo4168q() {
        return this.f16741G.invoke();
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        return this.f16748x;
    }

    public String toString() {
        return "Lazy Java class " + C13801c.m1502m(this);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: y */
    public Collection<InterfaceC11914e> mo4165y() {
        List m14104i;
        List m14028v0;
        InterfaceC11914e interfaceC11914e;
        if (this.f16748x == EnumC11915e0.SEALED) {
            C6224a m23210b = C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 7, null);
            Collection<InterfaceC6773j> mo2221C = this.f16743s.mo2221C();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC6773j interfaceC6773j : mo2221C) {
                InterfaceC11927h mo2788p = this.f16745u.m33008g().m23194o(interfaceC6773j, m23210b).mo3564N0().mo2788p();
                if (mo2788p instanceof InterfaceC11914e) {
                    interfaceC11914e = (InterfaceC11914e) mo2788p;
                } else {
                    interfaceC11914e = null;
                }
                if (interfaceC11914e != null) {
                    arrayList.add(interfaceC11914e);
                }
            }
            m14028v0 = C9553r.m14028v0(arrayList, new C5855d());
            return m14028v0;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: z */
    public boolean mo4164z() {
        return this.f16750z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5850f(C2548g outerContext, InterfaceC11947m containingDeclaration, InterfaceC6770g jClass, InterfaceC11914e interfaceC11914e) {
        super(outerContext.m33010e(), containingDeclaration, jClass.getName(), outerContext.m33014a().m33030t().mo2836a(jClass), false);
        Lazy m7601a;
        EnumC11918f enumC11918f;
        EnumC11915e0 enumC11915e0;
        C9612q.m13917h(outerContext, "outerContext");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(jClass, "jClass");
        this.f16742r = outerContext;
        this.f16743s = jClass;
        this.f16744t = interfaceC11914e;
        C2548g m33057d = C2537a.m33057d(outerContext, this, jClass, 0, 4, null);
        this.f16745u = m33057d;
        m33057d.m33014a().m33042h().mo41028a(jClass, this);
        jClass.mo2219K();
        m7601a = C11577n.m7601a(new C5856e());
        this.f16746v = m7601a;
        if (jClass.mo2205q()) {
            enumC11918f = EnumC11918f.ANNOTATION_CLASS;
        } else if (jClass.mo2220J()) {
            enumC11918f = EnumC11918f.INTERFACE;
        } else {
            enumC11918f = jClass.mo2202v() ? EnumC11918f.ENUM_CLASS : EnumC11918f.CLASS;
        }
        this.f16747w = enumC11918f;
        if (!jClass.mo2205q() && !jClass.mo2202v()) {
            enumC11915e0 = EnumC11915e0.f30913j.m6722a(jClass.mo2200y(), jClass.mo2200y() || jClass.isAbstract() || jClass.mo2220J(), !jClass.isFinal());
        } else {
            enumC11915e0 = EnumC11915e0.FINAL;
        }
        this.f16748x = enumC11915e0;
        this.f16749y = jClass.getVisibility();
        this.f16750z = (jClass.mo2207o() == null || jClass.mo2173g()) ? false : true;
        this.f16735A = new C5852b();
        C5858g c5858g = new C5858g(m33057d, this, jClass, interfaceC11914e != null, null, 16, null);
        this.f16736B = c5858g;
        this.f16737C = C12000y0.f30986e.m6642a(this, m33057d.m33010e(), m33057d.m33014a().m33039k().mo20254d(), new C5857f());
        this.f16738D = new C0191f(c5858g);
        this.f16739E = new C5900l(m33057d, jClass, this);
        this.f16740F = C2545e.m33019a(m33057d, jClass);
        this.f16741G = m33057d.m33010e().mo21867c(new C5854c());
    }
}
