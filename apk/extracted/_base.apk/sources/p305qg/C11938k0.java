package p305qg;

import ai.InterfaceC0194h;
import gg.C6759j;
import gi.InterfaceC6813g;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9559v;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p142hi.AbstractC7302o0;
import p142hi.C7289l;
import p142hi.EnumC7336w1;
import p161ii.AbstractC7592g;
import p304qf.AbstractC11883p;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import tg.AbstractC12700g;
import tg.C12711k0;
import tg.C12717m;

/* renamed from: qg.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11938k0 {

    /* renamed from: a */
    private final InterfaceC6821n f30934a;

    /* renamed from: b */
    private final InterfaceC11928h0 f30935b;

    /* renamed from: c */
    private final InterfaceC6813g<C11633c, InterfaceC11945l0> f30936c;

    /* renamed from: d */
    private final InterfaceC6813g<C11939a, InterfaceC11914e> f30937d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qg.k0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11939a {

        /* renamed from: a */
        private final C11632b f30938a;

        /* renamed from: b */
        private final List<Integer> f30939b;

        public C11939a(C11632b classId, List<Integer> typeParametersCount) {
            C9612q.m13917h(classId, "classId");
            C9612q.m13917h(typeParametersCount, "typeParametersCount");
            this.f30938a = classId;
            this.f30939b = typeParametersCount;
        }

        /* renamed from: a */
        public final C11632b m6699a() {
            return this.f30938a;
        }

        /* renamed from: b */
        public final List<Integer> m6698b() {
            return this.f30939b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11939a) {
                C11939a c11939a = (C11939a) obj;
                return C9612q.m13922c(this.f30938a, c11939a.f30938a) && C9612q.m13922c(this.f30939b, c11939a.f30939b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f30938a.hashCode() * 31) + this.f30939b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f30938a + ", typeParametersCount=" + this.f30939b + ')';
        }
    }

    /* renamed from: qg.k0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11940b extends AbstractC12700g {

        /* renamed from: r */
        private final boolean f30940r;

        /* renamed from: s */
        private final List<InterfaceC11920f1> f30941s;

        /* renamed from: t */
        private final C7289l f30942t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11940b(InterfaceC6821n storageManager, InterfaceC11947m container, C11638f name, boolean z, int i) {
            super(storageManager, container, name, InterfaceC11900a1.f30901a, false);
            IntRange m21916q;
            int m14093t;
            Set m14008c;
            C9612q.m13917h(storageManager, "storageManager");
            C9612q.m13917h(container, "container");
            C9612q.m13917h(name, "name");
            this.f30940r = z;
            m21916q = C6759j.m21916q(0, i);
            m14093t = C9546k.m14093t(m21916q, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            Iterator<Integer> it = m21916q.iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC11883p) it).nextInt();
                InterfaceC12155g m6037b = InterfaceC12155g.f31603f.m6037b();
                EnumC7336w1 enumC7336w1 = EnumC7336w1.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(nextInt);
                arrayList.add(C12711k0.m4399R0(this, m6037b, false, enumC7336w1, C11638f.m7422f(sb2.toString()), nextInt, storageManager));
            }
            this.f30941s = arrayList;
            List<InterfaceC11920f1> m6712d = C11923g1.m6712d(this);
            m14008c = C9559v.m14008c(C13801c.m1499p(this).mo4194n().m9810i());
            this.f30942t = new C7289l(this, m6712d, m14008c, storageManager);
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

        @Override // p305qg.InterfaceC11914e
        /* renamed from: K0 */
        public InterfaceC0194h.C0197b mo4170l0() {
            return InterfaceC0194h.C0197b.f649b;
        }

        @Override // p305qg.InterfaceC11927h
        /* renamed from: L0 */
        public C7289l mo4173k() {
            return this.f30942t;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // tg.AbstractC12739t
        /* renamed from: M0 */
        public InterfaceC0194h.C0197b mo4166r0(AbstractC7592g kotlinTypeRefiner) {
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return InterfaceC0194h.C0197b.f649b;
        }

        @Override // p305qg.InterfaceC11914e
        /* renamed from: R */
        public AbstractC11930h1<AbstractC7302o0> mo4179R() {
            return null;
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
            return EnumC11918f.CLASS;
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

        @Override // tg.AbstractC12700g, p305qg.InterfaceC11911d0
        public boolean isExternal() {
            return false;
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

        @Override // p305qg.InterfaceC11911d0
        /* renamed from: k0 */
        public boolean mo4172k0() {
            return false;
        }

        @Override // p305qg.InterfaceC11914e
        /* renamed from: l */
        public Collection<InterfaceC11910d> mo4171l() {
            Set m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }

        @Override // p305qg.InterfaceC11914e
        /* renamed from: m0 */
        public InterfaceC11914e mo4169m0() {
            return null;
        }

        @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11931i
        /* renamed from: q */
        public List<InterfaceC11920f1> mo4168q() {
            return this.f30941s;
        }

        @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11911d0
        /* renamed from: r */
        public EnumC11915e0 mo4167r() {
            return EnumC11915e0.FINAL;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // p305qg.InterfaceC11914e
        /* renamed from: y */
        public Collection<InterfaceC11914e> mo4165y() {
            List m14104i;
            m14104i = C9545j.m14104i();
            return m14104i;
        }

        @Override // p305qg.InterfaceC11931i
        /* renamed from: z */
        public boolean mo4164z() {
            return this.f30940r;
        }
    }

    /* renamed from: qg.k0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11941c extends AbstractC9614s implements Function1<C11939a, InterfaceC11914e> {
        C11941c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
            if (r1 != null) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p305qg.InterfaceC11914e invoke(p305qg.C11938k0.C11939a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.C9612q.m13917h(r9, r0)
                ph.b r0 = r9.m6699a()
                java.util.List r9 = r9.m6698b()
                boolean r1 = r0.m7462k()
                if (r1 != 0) goto L66
                ph.b r1 = r0.m7466g()
                if (r1 == 0) goto L27
                qg.k0 r2 = p305qg.C11938k0.this
                r3 = 1
                java.util.List r3 = kotlin.collections.C9543h.m14167N(r9, r3)
                qg.e r1 = r2.m6700d(r1, r3)
                if (r1 == 0) goto L27
                goto L3c
            L27:
                qg.k0 r1 = p305qg.C11938k0.this
                gi.g r1 = p305qg.C11938k0.m6702b(r1)
                ph.c r2 = r0.m7465h()
                java.lang.String r3 = "classId.packageFqName"
                kotlin.jvm.internal.C9612q.m13918g(r2, r3)
                java.lang.Object r1 = r1.invoke(r2)
                qg.g r1 = (p305qg.InterfaceC11921g) r1
            L3c:
                r4 = r1
                boolean r6 = r0.m7461l()
                qg.k0$b r1 = new qg.k0$b
                qg.k0 r2 = p305qg.C11938k0.this
                gi.n r3 = p305qg.C11938k0.m6701c(r2)
                ph.f r5 = r0.m7463j()
                java.lang.String r0 = "classId.shortClassName"
                kotlin.jvm.internal.C9612q.m13918g(r5, r0)
                java.lang.Object r9 = kotlin.collections.C9543h.m14160V(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L5f
                int r9 = r9.intValue()
                goto L60
            L5f:
                r9 = 0
            L60:
                r7 = r9
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L66:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p305qg.C11938k0.C11941c.invoke(qg.k0$a):qg.e");
        }
    }

    /* renamed from: qg.k0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11942d extends AbstractC9614s implements Function1<C11633c, InterfaceC11945l0> {
        C11942d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11945l0 invoke(C11633c fqName) {
            C9612q.m13917h(fqName, "fqName");
            return new C12717m(C11938k0.this.f30935b, fqName);
        }
    }

    public C11938k0(InterfaceC6821n storageManager, InterfaceC11928h0 module) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(module, "module");
        this.f30934a = storageManager;
        this.f30935b = module;
        this.f30936c = storageManager.mo21861i(new C11942d());
        this.f30937d = storageManager.mo21861i(new C11941c());
    }

    /* renamed from: d */
    public final InterfaceC11914e m6700d(C11632b classId, List<Integer> typeParametersCount) {
        C9612q.m13917h(classId, "classId");
        C9612q.m13917h(typeParametersCount, "typeParametersCount");
        return this.f30937d.invoke(new C11939a(classId, typeParametersCount));
    }
}
