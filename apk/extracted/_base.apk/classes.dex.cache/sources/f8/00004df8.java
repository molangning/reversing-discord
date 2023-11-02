package tg;

import gi.InterfaceC6813g;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p305qg.C11904b0;
import p305qg.C11922g0;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11948m0;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11969q0;
import p306qh.C12006a;
import p325rg.InterfaceC12155g;
import pf.C11577n;
import ph.C11633c;
import ph.C11638f;
import tg.InterfaceC12679a0;

/* renamed from: tg.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12744x extends AbstractC12706j implements InterfaceC11928h0 {

    /* renamed from: l */
    private final InterfaceC6821n f33068l;

    /* renamed from: m */
    private final AbstractC10870h f33069m;

    /* renamed from: n */
    private final C11638f f33070n;

    /* renamed from: o */
    private final Map<C11922g0<?>, Object> f33071o;

    /* renamed from: p */
    private final InterfaceC12679a0 f33072p;

    /* renamed from: q */
    private InterfaceC12742v f33073q;

    /* renamed from: r */
    private InterfaceC11948m0 f33074r;

    /* renamed from: s */
    private boolean f33075s;

    /* renamed from: t */
    private final InterfaceC6813g<C11633c, InterfaceC11969q0> f33076t;

    /* renamed from: u */
    private final Lazy f33077u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12745a extends AbstractC9614s implements Function0<C12704i> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12745a() {
            super(0);
            C12744x.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C12704i invoke() {
            int m14093t;
            InterfaceC12742v interfaceC12742v = C12744x.this.f33073q;
            C12744x c12744x = C12744x.this;
            if (interfaceC12742v != null) {
                List<C12744x> mo4215a = interfaceC12742v.mo4215a();
                C12744x.this.m4205O0();
                mo4215a.contains(C12744x.this);
                for (C12744x c12744x2 : mo4215a) {
                    c12744x2.m4200T0();
                }
                m14093t = C9546k.m14093t(mo4215a, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (C12744x c12744x3 : mo4215a) {
                    InterfaceC11948m0 interfaceC11948m0 = c12744x3.f33074r;
                    C9612q.m13920e(interfaceC11948m0);
                    arrayList.add(interfaceC11948m0);
                }
                return new C12704i(arrayList, "CompositeProvider@ModuleDescriptor for " + C12744x.this.getName());
            }
            throw new AssertionError("Dependencies of module " + c12744x.m4204P0() + " were not set before querying module content");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12746b extends AbstractC9614s implements Function1<C11633c, InterfaceC11969q0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12746b() {
            super(1);
            C12744x.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11969q0 invoke(C11633c fqName) {
            C9612q.m13917h(fqName, "fqName");
            InterfaceC12679a0 interfaceC12679a0 = C12744x.this.f33072p;
            C12744x c12744x = C12744x.this;
            return interfaceC12679a0.mo4543a(c12744x, fqName, c12744x.f33068l);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12744x(C11638f moduleName, InterfaceC6821n storageManager, AbstractC10870h builtIns, C12006a c12006a) {
        this(moduleName, storageManager, builtIns, c12006a, null, null, 48, null);
        C9612q.m13917h(moduleName, "moduleName");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(builtIns, "builtIns");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C12744x(ph.C11638f r10, gi.InterfaceC6821n r11, ng.AbstractC10870h r12, p306qh.C12006a r13, java.util.Map r14, ph.C11638f r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = p304qf.C11886s.m6771h()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C12744x.<init>(ph.f, gi.n, ng.h, qh.a, java.util.Map, ph.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: P0 */
    public final String m4204P0() {
        String c11638f = getName().toString();
        C9612q.m13918g(c11638f, "name.toString()");
        return c11638f;
    }

    /* renamed from: R0 */
    private final C12704i m4202R0() {
        return (C12704i) this.f33077u.getValue();
    }

    /* renamed from: T0 */
    public final boolean m4200T0() {
        return this.f33074r != null;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: H0 */
    public InterfaceC11969q0 mo4210H0(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        m4205O0();
        return this.f33076t.invoke(fqName);
    }

    /* renamed from: O0 */
    public void m4205O0() {
        if (!m4199U0()) {
            C11904b0.m6726a(this);
        }
    }

    /* renamed from: Q0 */
    public final InterfaceC11948m0 m4203Q0() {
        m4205O0();
        return m4202R0();
    }

    /* renamed from: S0 */
    public final void m4201S0(InterfaceC11948m0 providerForModuleContent) {
        C9612q.m13917h(providerForModuleContent, "providerForModuleContent");
        m4200T0();
        this.f33074r = providerForModuleContent;
    }

    /* renamed from: U0 */
    public boolean m4199U0() {
        return this.f33075s;
    }

    /* renamed from: V0 */
    public final void m4198V0(List<C12744x> descriptors) {
        Set<C12744x> m14007d;
        C9612q.m13917h(descriptors, "descriptors");
        m14007d = C9560w.m14007d();
        m4197W0(descriptors, m14007d);
    }

    /* renamed from: W0 */
    public final void m4197W0(List<C12744x> descriptors, Set<C12744x> friends) {
        List m14104i;
        Set m14007d;
        C9612q.m13917h(descriptors, "descriptors");
        C9612q.m13917h(friends, "friends");
        m14104i = C9545j.m14104i();
        m14007d = C9560w.m14007d();
        m4196X0(new C12743w(descriptors, friends, m14104i, m14007d));
    }

    /* renamed from: X0 */
    public final void m4196X0(InterfaceC12742v dependencies) {
        C9612q.m13917h(dependencies, "dependencies");
        this.f33073q = dependencies;
    }

    /* renamed from: Y0 */
    public final void m4195Y0(C12744x... descriptors) {
        List<C12744x> m14197u0;
        C9612q.m13917h(descriptors, "descriptors");
        m14197u0 = C9538f.m14197u0(descriptors);
        m4198V0(m14197u0);
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        return InterfaceC11928h0.C11929a.m6707b(this);
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return (R) InterfaceC11928h0.C11929a.m6708a(this, interfaceC11964o, d);
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: n */
    public AbstractC10870h mo4194n() {
        return this.f33069m;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: t */
    public Collection<C11633c> mo4193t(C11633c fqName, Function1<? super C11638f, Boolean> nameFilter) {
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(nameFilter, "nameFilter");
        m4205O0();
        return m4203Q0().mo4424t(fqName, nameFilter);
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: u0 */
    public boolean mo4192u0(InterfaceC11928h0 targetModule) {
        boolean m14064L;
        C9612q.m13917h(targetModule, "targetModule");
        if (C9612q.m13922c(this, targetModule)) {
            return true;
        }
        InterfaceC12742v interfaceC12742v = this.f33073q;
        C9612q.m13920e(interfaceC12742v);
        m14064L = C9553r.m14064L(interfaceC12742v.mo4213c(), targetModule);
        if (m14064L || mo4190z0().contains(targetModule) || targetModule.mo4190z0().contains(this)) {
            return true;
        }
        return false;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: w */
    public <T> T mo4191w(C11922g0<T> capability) {
        C9612q.m13917h(capability, "capability");
        T t = (T) this.f33071o.get(capability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: z0 */
    public List<InterfaceC11928h0> mo4190z0() {
        InterfaceC12742v interfaceC12742v = this.f33073q;
        if (interfaceC12742v != null) {
            return interfaceC12742v.mo4214b();
        }
        throw new AssertionError("Dependencies of module " + m4204P0() + " were not set");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12744x(C11638f moduleName, InterfaceC6821n storageManager, AbstractC10870h builtIns, C12006a c12006a, Map<C11922g0<?>, ? extends Object> capabilities, C11638f c11638f) {
        super(InterfaceC12155g.f31603f.m6037b(), moduleName);
        Lazy m7601a;
        C9612q.m13917h(moduleName, "moduleName");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(builtIns, "builtIns");
        C9612q.m13917h(capabilities, "capabilities");
        this.f33068l = storageManager;
        this.f33069m = builtIns;
        this.f33070n = c11638f;
        if (moduleName.m7421g()) {
            this.f33071o = capabilities;
            InterfaceC12679a0 interfaceC12679a0 = (InterfaceC12679a0) mo4191w(InterfaceC12679a0.f32862a.m4544a());
            this.f33072p = interfaceC12679a0 == null ? InterfaceC12679a0.C12681b.f32865b : interfaceC12679a0;
            this.f33075s = true;
            this.f33076t = storageManager.mo21861i(new C12746b());
            m7601a = C11577n.m7601a(new C12745a());
            this.f33077u = m7601a;
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}