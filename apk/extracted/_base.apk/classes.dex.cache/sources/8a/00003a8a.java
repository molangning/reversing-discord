package io.sentry;

import io.sentry.Scope;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8068c;
import io.sentry.protocol.C8082h;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;
import io.sentry.protocol.EnumC8118z;
import io.sentry.util.C8229o;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.z4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8281z4 implements InterfaceC8259w0 {

    /* renamed from: b */
    private final C7900d5 f22255b;

    /* renamed from: d */
    private final InterfaceC8025n0 f22257d;

    /* renamed from: e */
    private String f22258e;

    /* renamed from: g */
    private volatile TimerTask f22260g;

    /* renamed from: h */
    private volatile Timer f22261h;

    /* renamed from: k */
    private final C7891d f22264k;

    /* renamed from: l */
    private EnumC8118z f22265l;

    /* renamed from: m */
    private final Map<String, C8082h> f22266m;

    /* renamed from: n */
    private final EnumC8277z0 f22267n;

    /* renamed from: p */
    private final InterfaceC8167t5 f22269p;

    /* renamed from: q */
    private final C8160s5 f22270q;

    /* renamed from: a */
    private final C8100q f22254a = new C8100q();

    /* renamed from: c */
    private final List<C7900d5> f22256c = new CopyOnWriteArrayList();

    /* renamed from: f */
    private C8283b f22259f = C8283b.f22272c;

    /* renamed from: i */
    private final Object f22262i = new Object();

    /* renamed from: j */
    private final AtomicBoolean f22263j = new AtomicBoolean(false);

    /* renamed from: o */
    private final C8068c f22268o = new C8068c();

    /* renamed from: io.sentry.z4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C8282a extends TimerTask {
        C8282a() {
            C8281z4.this = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C8281z4.this.m17971D();
        }
    }

    /* renamed from: io.sentry.z4$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8283b {

        /* renamed from: c */
        static final C8283b f22272c = m17922d();

        /* renamed from: a */
        private final boolean f22273a;

        /* renamed from: b */
        private final EnumC7975i5 f22274b;

        private C8283b(boolean z, EnumC7975i5 enumC7975i5) {
            this.f22273a = z;
            this.f22274b = enumC7975i5;
        }

        /* renamed from: c */
        static C8283b m17923c(EnumC7975i5 enumC7975i5) {
            return new C8283b(true, enumC7975i5);
        }

        /* renamed from: d */
        private static C8283b m17922d() {
            return new C8283b(false, null);
        }
    }

    public C8281z4(C8125q5 c8125q5, InterfaceC8025n0 interfaceC8025n0, C8160s5 c8160s5, InterfaceC8167t5 interfaceC8167t5) {
        this.f22261h = null;
        C8229o.m18169c(c8125q5, "context is required");
        C8229o.m18169c(interfaceC8025n0, "hub is required");
        this.f22266m = new ConcurrentHashMap();
        this.f22255b = new C7900d5(c8125q5, this, interfaceC8025n0, c8160s5.m18371g(), c8160s5);
        this.f22258e = c8125q5.m18460t();
        this.f22267n = c8125q5.m18461s();
        this.f22257d = interfaceC8025n0;
        this.f22269p = interfaceC8167t5;
        this.f22265l = c8125q5.m18458v();
        this.f22270q = c8160s5;
        if (c8125q5.m18462r() != null) {
            this.f22264k = c8125q5.m18462r();
        } else {
            this.f22264k = new C7891d(interfaceC8025n0.mo18262j().getLogger());
        }
        if (interfaceC8167t5 != null && Boolean.TRUE.equals(m17963L())) {
            interfaceC8167t5.mo18349b(this);
        }
        if (c8160s5.m18372f() != null) {
            this.f22261h = new Timer(true);
            mo17937o();
        }
    }

    /* renamed from: A */
    private ISpan m17974A(C7932g5 c7932g5, String str, String str2, C7942h5 c7942h5) {
        return m17926z(c7932g5, str, str2, null, EnumC8277z0.SENTRY, c7942h5);
    }

    /* renamed from: B */
    private ISpan m17973B(String str, String str2, AbstractC8003k3 abstractC8003k3, EnumC8277z0 enumC8277z0, C7942h5 c7942h5) {
        if (this.f22255b.mo17951a()) {
            return C7688a2.m20044t();
        }
        if (!this.f22267n.equals(enumC8277z0)) {
            return C7688a2.m20044t();
        }
        if (this.f22256c.size() < this.f22257d.mo18262j().getMaxSpans()) {
            return this.f22255b.m19349G(str, str2, abstractC8003k3, enumC8277z0, c7942h5);
        }
        this.f22257d.mo18262j().getLogger().mo18135c(EnumC8021m4.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return C7688a2.m20044t();
    }

    /* renamed from: D */
    public void m17971D() {
        EnumC7975i5 mo17950b = mo17950b();
        if (mo17950b == null) {
            mo17950b = EnumC7975i5.OK;
        }
        mo17942j(mo17950b);
        this.f22263j.set(false);
    }

    /* renamed from: K */
    private boolean m17964K() {
        ArrayList<C7900d5> arrayList = new ArrayList(this.f22256c);
        if (!arrayList.isEmpty()) {
            for (C7900d5 c7900d5 : arrayList) {
                if (!c7900d5.mo17951a()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: N */
    public /* synthetic */ void m17961N(C7900d5 c7900d5) {
        C8283b c8283b = this.f22259f;
        if (this.f22270q.m18372f() != null) {
            if (!this.f22270q.m18368j() || m17964K()) {
                mo17937o();
            }
        } else if (c8283b.f22273a) {
            mo17942j(c8283b.f22274b);
        }
    }

    /* renamed from: O */
    public /* synthetic */ void m17960O(Scope scope, InterfaceC8259w0 interfaceC8259w0) {
        if (interfaceC8259w0 == this) {
            scope.m20076f();
        }
    }

    /* renamed from: P */
    public /* synthetic */ void m17959P(final Scope scope) {
        scope.m20082H(new Scope.InterfaceC7681c() { // from class: io.sentry.y4
            @Override // io.sentry.Scope.InterfaceC7681c
            /* renamed from: a */
            public final void mo18033a(InterfaceC8259w0 interfaceC8259w0) {
                C8281z4.this.m17960O(scope, interfaceC8259w0);
            }
        });
    }

    /* renamed from: Q */
    public static /* synthetic */ void m17958Q(AtomicReference atomicReference, Scope scope) {
        atomicReference.set(scope.m20059w());
    }

    /* renamed from: W */
    private void m17952W() {
        synchronized (this) {
            if (this.f22264k.m19438p()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f22257d.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.x4
                    @Override // io.sentry.InterfaceC8164t2
                    /* renamed from: a */
                    public final void mo18044a(Scope scope) {
                        C8281z4.m17958Q(atomicReference, scope);
                    }
                });
                this.f22264k.m19455B(this, (C8062a0) atomicReference.get(), this.f22257d.mo18262j(), m17966I());
                this.f22264k.m19453a();
            }
        }
    }

    /* renamed from: y */
    private void m17927y() {
        synchronized (this.f22262i) {
            if (this.f22260g != null) {
                this.f22260g.cancel();
                this.f22263j.set(false);
                this.f22260g = null;
            }
        }
    }

    /* renamed from: z */
    private ISpan m17926z(C7932g5 c7932g5, String str, String str2, AbstractC8003k3 abstractC8003k3, EnumC8277z0 enumC8277z0, C7942h5 c7942h5) {
        if (this.f22255b.mo17951a()) {
            return C7688a2.m20044t();
        }
        if (!this.f22267n.equals(enumC8277z0)) {
            return C7688a2.m20044t();
        }
        C8229o.m18169c(c7932g5, "parentSpanId is required");
        C8229o.m18169c(str, "operation is required");
        m17927y();
        C7900d5 c7900d5 = new C7900d5(this.f22255b.m19354B(), c7932g5, this, str, this.f22257d, abstractC8003k3, c7942h5, new InterfaceC7925f5() { // from class: io.sentry.w4
            @Override // io.sentry.InterfaceC7925f5
            /* renamed from: a */
            public final void mo18051a(C7900d5 c7900d52) {
                C8281z4.this.m17961N(c7900d52);
            }
        });
        c7900d5.mo17948d(str2);
        this.f22256c.add(c7900d5);
        return c7900d5;
    }

    /* renamed from: C */
    public void m17972C(EnumC7975i5 enumC7975i5, AbstractC8003k3 abstractC8003k3, boolean z) {
        List<C8002k2> list;
        C8027n2 c8027n2;
        EnumC7975i5 enumC7975i52;
        AbstractC8003k3 mo17935q = this.f22255b.mo17935q();
        if (abstractC8003k3 == null) {
            abstractC8003k3 = mo17935q;
        }
        if (abstractC8003k3 == null) {
            abstractC8003k3 = this.f22257d.mo18262j().getDateProvider().now();
        }
        for (C7900d5 c7900d5 : this.f22256c) {
            if (c7900d5.m19344w().m19160a()) {
                if (enumC7975i5 != null) {
                    enumC7975i52 = enumC7975i5;
                } else {
                    enumC7975i52 = mo17936p().f21562p;
                }
                c7900d5.mo17934r(enumC7975i52, abstractC8003k3);
            }
        }
        this.f22259f = C8283b.m17923c(enumC7975i5);
        if (!this.f22255b.mo17951a()) {
            if (!this.f22270q.m18368j() || m17964K()) {
                InterfaceC8167t5 interfaceC8167t5 = this.f22269p;
                if (interfaceC8167t5 != null) {
                    list = interfaceC8167t5.mo18350a(this);
                } else {
                    list = null;
                }
                Boolean bool = Boolean.TRUE;
                if (bool.equals(m17962M()) && bool.equals(m17963L())) {
                    c8027n2 = this.f22257d.mo18262j().getTransactionProfiler().mo18048b(this, list);
                } else {
                    c8027n2 = null;
                }
                if (list != null) {
                    list.clear();
                }
                for (C7900d5 c7900d52 : this.f22256c) {
                    if (!c7900d52.mo17951a()) {
                        c7900d52.m19351E(null);
                        c7900d52.mo17934r(EnumC7975i5.DEADLINE_EXCEEDED, abstractC8003k3);
                    }
                }
                this.f22255b.mo17934r(this.f22259f.f22274b, abstractC8003k3);
                this.f22257d.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.v4
                    @Override // io.sentry.InterfaceC8164t2
                    /* renamed from: a */
                    public final void mo18044a(Scope scope) {
                        C8281z4.this.m17959P(scope);
                    }
                });
                C8114x c8114x = new C8114x(this);
                InterfaceC8140r5 m18370h = this.f22270q.m18370h();
                if (m18370h != null) {
                    m18370h.mo18439a(this);
                }
                if (this.f22261h != null) {
                    synchronized (this.f22262i) {
                        if (this.f22261h != null) {
                            this.f22261h.cancel();
                            this.f22261h = null;
                        }
                    }
                }
                if (z && this.f22256c.isEmpty() && this.f22270q.m18372f() != null) {
                    this.f22257d.mo18262j().getLogger().mo18135c(EnumC8021m4.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f22258e);
                    return;
                }
                c8114x.m18488m0().putAll(this.f22266m);
                this.f22257d.mo18249w(c8114x, mo17944h(), null, c8027n2);
            }
        }
    }

    /* renamed from: E */
    public List<C7900d5> m17970E() {
        return this.f22256c;
    }

    /* renamed from: F */
    public C8068c m17969F() {
        return this.f22268o;
    }

    /* renamed from: G */
    public Map<String, Object> m17968G() {
        return this.f22255b.m19347t();
    }

    /* renamed from: H */
    public C7900d5 m17967H() {
        return this.f22255b;
    }

    /* renamed from: I */
    public C8054p5 m17966I() {
        return this.f22255b.m19342y();
    }

    /* renamed from: J */
    public List<C7900d5> m17965J() {
        return this.f22256c;
    }

    /* renamed from: L */
    public Boolean m17963L() {
        return this.f22255b.m19353C();
    }

    /* renamed from: M */
    public Boolean m17962M() {
        return this.f22255b.m19352D();
    }

    /* renamed from: R */
    public ISpan m17957R(C7932g5 c7932g5, String str, String str2) {
        return m17955T(c7932g5, str, str2, new C7942h5());
    }

    /* renamed from: S */
    public ISpan m17956S(C7932g5 c7932g5, String str, String str2, AbstractC8003k3 abstractC8003k3, EnumC8277z0 enumC8277z0, C7942h5 c7942h5) {
        return m17926z(c7932g5, str, str2, abstractC8003k3, enumC8277z0, c7942h5);
    }

    /* renamed from: T */
    ISpan m17955T(C7932g5 c7932g5, String str, String str2, C7942h5 c7942h5) {
        return m17974A(c7932g5, str, str2, c7942h5);
    }

    /* renamed from: U */
    public ISpan m17954U(String str, String str2) {
        return m17953V(str, str2, null, EnumC8277z0.SENTRY, new C7942h5());
    }

    /* renamed from: V */
    public ISpan m17953V(String str, String str2, AbstractC8003k3 abstractC8003k3, EnumC8277z0 enumC8277z0, C7942h5 c7942h5) {
        return m17973B(str, str2, abstractC8003k3, enumC8277z0, c7942h5);
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo17951a() {
        return this.f22255b.mo17951a();
    }

    @Override // io.sentry.ISpan
    /* renamed from: b */
    public EnumC7975i5 mo17950b() {
        return this.f22255b.mo17950b();
    }

    @Override // io.sentry.ISpan
    /* renamed from: c */
    public void mo17949c() {
        mo17942j(mo17950b());
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo17948d(String str) {
        if (this.f22255b.mo17951a()) {
            return;
        }
        this.f22255b.mo17948d(str);
    }

    @Override // io.sentry.InterfaceC8259w0
    /* renamed from: e */
    public C8100q mo17947e() {
        return this.f22254a;
    }

    @Override // io.sentry.ISpan
    /* renamed from: f */
    public ISpan mo17946f(String str) {
        return m17954U(str, null);
    }

    @Override // io.sentry.InterfaceC8259w0
    /* renamed from: g */
    public EnumC8118z mo17945g() {
        return this.f22265l;
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return this.f22255b.getDescription();
    }

    @Override // io.sentry.InterfaceC8259w0
    public String getName() {
        return this.f22258e;
    }

    @Override // io.sentry.ISpan
    /* renamed from: h */
    public C8034n5 mo17944h() {
        if (this.f22257d.mo18262j().isTraceSampling()) {
            m17952W();
            return this.f22264k.m19454C();
        }
        return null;
    }

    @Override // io.sentry.ISpan
    /* renamed from: i */
    public boolean mo17943i(AbstractC8003k3 abstractC8003k3) {
        return this.f22255b.mo17943i(abstractC8003k3);
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo17942j(EnumC7975i5 enumC7975i5) {
        mo17934r(enumC7975i5, null);
    }

    @Override // io.sentry.InterfaceC8259w0
    /* renamed from: k */
    public void mo17941k(EnumC7975i5 enumC7975i5, boolean z) {
        if (mo17951a()) {
            return;
        }
        AbstractC8003k3 now = this.f22257d.mo18262j().getDateProvider().now();
        List<C7900d5> list = this.f22256c;
        ListIterator<C7900d5> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C7900d5 previous = listIterator.previous();
            previous.m19351E(null);
            previous.mo17934r(enumC7975i5, now);
        }
        m17972C(enumC7975i5, now, z);
    }

    @Override // io.sentry.ISpan
    /* renamed from: l */
    public ISpan mo17940l(String str, String str2, AbstractC8003k3 abstractC8003k3, EnumC8277z0 enumC8277z0) {
        return m17953V(str, str2, abstractC8003k3, enumC8277z0, new C7942h5());
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public void mo17939m(String str, Number number, InterfaceC8128r1 interfaceC8128r1) {
        if (this.f22255b.mo17951a()) {
            return;
        }
        this.f22266m.put(str, new C8082h(number, interfaceC8128r1.apiName()));
    }

    @Override // io.sentry.InterfaceC8259w0
    /* renamed from: n */
    public C7900d5 mo17938n() {
        ArrayList arrayList = new ArrayList(this.f22256c);
        if (!arrayList.isEmpty()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C7900d5) arrayList.get(size)).mo17951a()) {
                    return (C7900d5) arrayList.get(size);
                }
            }
            return null;
        }
        return null;
    }

    @Override // io.sentry.InterfaceC8259w0
    /* renamed from: o */
    public void mo17937o() {
        synchronized (this.f22262i) {
            m17927y();
            if (this.f22261h != null) {
                this.f22263j.set(true);
                this.f22260g = new C8282a();
                this.f22261h.schedule(this.f22260g, this.f22270q.m18372f().longValue());
            }
        }
    }

    @Override // io.sentry.ISpan
    /* renamed from: p */
    public C7911e5 mo17936p() {
        return this.f22255b.mo17936p();
    }

    @Override // io.sentry.ISpan
    /* renamed from: q */
    public AbstractC8003k3 mo17935q() {
        return this.f22255b.mo17935q();
    }

    @Override // io.sentry.ISpan
    /* renamed from: r */
    public void mo17934r(EnumC7975i5 enumC7975i5, AbstractC8003k3 abstractC8003k3) {
        m17972C(enumC7975i5, abstractC8003k3, true);
    }

    @Override // io.sentry.ISpan
    /* renamed from: s */
    public AbstractC8003k3 mo17933s() {
        return this.f22255b.mo17933s();
    }
}