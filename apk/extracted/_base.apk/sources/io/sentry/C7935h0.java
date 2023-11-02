package io.sentry;

import io.sentry.C7997j5;
import io.sentry.Scope;
import io.sentry.clientreport.EnumC7875e;
import io.sentry.hints.C7955m;
import io.sentry.hints.C7957o;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8214d;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import io.sentry.util.C8230p;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p164j$.util.DesugarCollections;

/* renamed from: io.sentry.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7935h0 implements InterfaceC8025n0 {

    /* renamed from: a */
    private volatile C8100q f21614a;

    /* renamed from: b */
    private final C8132r4 f21615b;

    /* renamed from: c */
    private volatile boolean f21616c;

    /* renamed from: d */
    private final C7997j5 f21617d;

    /* renamed from: e */
    private final C8046o5 f21618e;

    /* renamed from: f */
    private final Map<Throwable, C8230p<WeakReference<ISpan>, String>> f21619f;

    /* renamed from: g */
    private final InterfaceC8167t5 f21620g;

    public C7935h0(C8132r4 c8132r4) {
        this(c8132r4, m19171E(c8132r4));
    }

    /* renamed from: A */
    private Scope m19175A(Scope scope, InterfaceC8164t2 interfaceC8164t2) {
        if (interfaceC8164t2 != null) {
            try {
                Scope scope2 = new Scope(scope);
                interfaceC8164t2.mo18044a(scope2);
                return scope2;
            } catch (Throwable th2) {
                this.f21615b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return scope;
    }

    /* renamed from: B */
    private C8100q m19174B(C7923f4 c7923f4, C7831b0 c7831b0, InterfaceC8164t2 interfaceC8164t2) {
        C8100q c8100q = C8100q.f21957k;
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c8100q;
        } else if (c7923f4 == null) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return c8100q;
        } else {
            try {
                m19162z(c7923f4);
                C7997j5.C7998a m19044a = this.f21617d.m19044a();
                c8100q = m19044a.m19041a().mo18359c(c7923f4, m19175A(m19044a.m19039c(), interfaceC8164t2), c7831b0);
                this.f21614a = c8100q;
                return c8100q;
            } catch (Throwable th2) {
                InterfaceC8040o0 logger = this.f21615b.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
                logger.mo18136b(enumC8021m4, "Error while capturing event with id: " + c7923f4.m19266G(), th2);
                return c8100q;
            }
        }
    }

    /* renamed from: C */
    private C8100q m19173C(Throwable th2, C7831b0 c7831b0, InterfaceC8164t2 interfaceC8164t2) {
        C8100q c8100q = C8100q.f21957k;
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                C7997j5.C7998a m19044a = this.f21617d.m19044a();
                C7923f4 c7923f4 = new C7923f4(th2);
                m19162z(c7923f4);
                c8100q = m19044a.m19041a().mo18359c(c7923f4, m19175A(m19044a.m19039c(), interfaceC8164t2), c7831b0);
            } catch (Throwable th3) {
                InterfaceC8040o0 logger = this.f21615b.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
                logger.mo18136b(enumC8021m4, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        this.f21614a = c8100q;
        return c8100q;
    }

    /* renamed from: D */
    private C8100q m19172D(String str, EnumC8021m4 enumC8021m4, InterfaceC8164t2 interfaceC8164t2) {
        C8100q c8100q = C8100q.f21957k;
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                C7997j5.C7998a m19044a = this.f21617d.m19044a();
                c8100q = m19044a.m19041a().mo18355g(str, enumC8021m4, m19175A(m19044a.m19039c(), interfaceC8164t2));
            } catch (Throwable th2) {
                InterfaceC8040o0 logger = this.f21615b.getLogger();
                EnumC8021m4 enumC8021m42 = EnumC8021m4.ERROR;
                logger.mo18136b(enumC8021m42, "Error while capturing message: " + str, th2);
            }
        }
        this.f21614a = c8100q;
        return c8100q;
    }

    /* renamed from: E */
    private static C7997j5.C7998a m19171E(C8132r4 c8132r4) {
        m19165K(c8132r4);
        return new C7997j5.C7998a(c8132r4, new C7971i3(c8132r4), new Scope(c8132r4));
    }

    /* renamed from: F */
    private InterfaceC8259w0 m19170F(C8125q5 c8125q5, C8160s5 c8160s5) {
        final InterfaceC8259w0 interfaceC8259w0;
        C8229o.m18169c(c8125q5, "transactionContext is required");
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC8259w0 = C7833b2.m19587t();
        } else if (!this.f21615b.getInstrumenter().equals(c8125q5.m18461s())) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c8125q5.m18461s(), this.f21615b.getInstrumenter());
            interfaceC8259w0 = C7833b2.m19587t();
        } else if (!this.f21615b.isTracingEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC8259w0 = C7833b2.m19587t();
        } else {
            c8160s5.m18373e();
            C8054p5 m18907a = this.f21618e.m18907a(new C8157s2(c8125q5, null));
            c8125q5.m19292n(m18907a);
            C8281z4 c8281z4 = new C8281z4(c8125q5, this, c8160s5, this.f21620g);
            if (m18907a.m18860c().booleanValue() && m18907a.m18862a().booleanValue()) {
                this.f21615b.getTransactionProfiler().mo18049a(c8281z4);
            }
            interfaceC8259w0 = c8281z4;
        }
        if (c8160s5.m18369i()) {
            mo18265g(new InterfaceC8164t2() { // from class: io.sentry.g0
                @Override // io.sentry.InterfaceC8164t2
                /* renamed from: a */
                public final void mo18044a(Scope scope) {
                    scope.m20087C(InterfaceC8259w0.this);
                }
            });
        }
        return interfaceC8259w0;
    }

    /* renamed from: K */
    private static void m19165K(C8132r4 c8132r4) {
        C8229o.m18169c(c8132r4, "SentryOptions is required.");
        if (c8132r4.getDsn() != null && !c8132r4.getDsn().isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
    }

    /* renamed from: z */
    private void m19162z(C7923f4 c7923f4) {
        C8230p<WeakReference<ISpan>, String> c8230p;
        ISpan iSpan;
        if (this.f21615b.isTracingEnabled() && c7923f4.m19258O() != null && (c8230p = this.f21619f.get(C8214d.m18232a(c7923f4.m19258O()))) != null) {
            WeakReference<ISpan> m18168a = c8230p.m18168a();
            if (c7923f4.m19270C().m18798f() == null && m18168a != null && (iSpan = m18168a.get()) != null) {
                c7923f4.m19270C().m18790n(iSpan.mo17936p());
            }
            String m18167b = c8230p.m18167b();
            if (c7923f4.m19193t0() == null && m18167b != null) {
                c7923f4.m19209E0(m18167b);
            }
        }
    }

    /* renamed from: I */
    public void m19167I() {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
        } else {
            this.f21617d.m19043b();
        }
    }

    /* renamed from: J */
    public void m19166J() {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
            return;
        }
        C7997j5.C7998a m19044a = this.f21617d.m19044a();
        this.f21617d.m19042c(new C7997j5.C7998a(this.f21615b, m19044a.m19041a(), new Scope(m19044a.m19039c())));
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: b */
    public void mo18270b(long j) {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f21617d.m19044a().m19041a().mo18360b(j);
        } catch (Throwable th2) {
            this.f21615b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: c */
    public /* synthetic */ void mo18269c(C7901e c7901e) {
        C8017m0.m19000a(this, c7901e);
    }

    @Override // io.sentry.InterfaceC8025n0
    public void close() {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : this.f21615b.getIntegrations()) {
                if (integration instanceof Closeable) {
                    ((Closeable) integration).close();
                }
            }
            mo18265g(new InterfaceC8164t2() { // from class: io.sentry.f0
                @Override // io.sentry.InterfaceC8164t2
                /* renamed from: a */
                public final void mo18044a(Scope scope) {
                    scope.m20079c();
                }
            });
            this.f21615b.getTransactionProfiler().close();
            this.f21615b.getTransactionPerformanceCollector().close();
            this.f21615b.getExecutorService().mo18040a(this.f21615b.getShutdownTimeoutMillis());
            this.f21617d.m19044a().m19041a().close();
        } catch (Throwable th2) {
            this.f21615b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error while closing the Hub.", th2);
        }
        this.f21616c = false;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: d */
    public C8100q mo18268d(C8020m3 c8020m3, C7831b0 c7831b0) {
        C8229o.m18169c(c8020m3, "SentryEnvelope is required.");
        C8100q c8100q = C8100q.f21957k;
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c8100q;
        }
        try {
            C8100q mo18358d = this.f21617d.m19044a().m19041a().mo18358d(c8020m3, c7831b0);
            if (mo18358d != null) {
                return mo18358d;
            }
            return c8100q;
        } catch (Throwable th2) {
            this.f21615b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error while capturing envelope.", th2);
            return c8100q;
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: e */
    public /* synthetic */ C8100q mo18267e(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0) {
        return C8017m0.m18997d(this, c8114x, c8034n5, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: f */
    public void mo18266f(C7901e c7901e, C7831b0 c7831b0) {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c7901e == null) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f21617d.m19044a().m19039c().m20080b(c7901e, c7831b0);
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: g */
    public void mo18265g(InterfaceC8164t2 interfaceC8164t2) {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC8164t2.mo18044a(this.f21617d.m19044a().m19039c());
        } catch (Throwable th2) {
            this.f21615b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: h */
    public InterfaceC8259w0 mo18264h(C8125q5 c8125q5, C7934h c7934h, boolean z) {
        C8160s5 c8160s5 = new C8160s5();
        c8160s5.m18366l(c7934h);
        c8160s5.m18367k(z);
        return m19170F(c8125q5, c8160s5);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: i */
    public void mo18263i(Throwable th2, ISpan iSpan, String str) {
        C8229o.m18169c(th2, "throwable is required");
        C8229o.m18169c(iSpan, "span is required");
        C8229o.m18169c(str, "transactionName is required");
        Throwable m18232a = C8214d.m18232a(th2);
        if (!this.f21619f.containsKey(m18232a)) {
            this.f21619f.put(m18232a, new C8230p<>(new WeakReference(iSpan), str));
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    public boolean isEnabled() {
        return this.f21616c;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: j */
    public C8132r4 mo18262j() {
        return this.f21617d.m19044a().m19040b();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: k */
    public C8100q mo18261k(String str, EnumC8021m4 enumC8021m4) {
        return m19172D(str, enumC8021m4, null);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: l */
    public /* synthetic */ InterfaceC8259w0 mo18260l(String str, String str2, C7934h c7934h) {
        return C8017m0.m18995f(this, str, str2, c7934h);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: m */
    public void mo18259m() {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C7997j5.C7998a m19044a = this.f21617d.m19044a();
        C7836b5 m20074h = m19044a.m19039c().m20074h();
        if (m20074h != null) {
            m19044a.m19041a().mo18357e(m20074h, C8220j.m18225e(new C7955m()));
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: n */
    public /* synthetic */ C8100q mo18258n(C8020m3 c8020m3) {
        return C8017m0.m18999b(this, c8020m3);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: o */
    public C8100q mo18257o(C7923f4 c7923f4, C7831b0 c7831b0) {
        return m19174B(c7923f4, c7831b0, null);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: p */
    public /* synthetic */ InterfaceC8259w0 mo18256p(String str, String str2) {
        return C8017m0.m18996e(this, str, str2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: q */
    public InterfaceC8259w0 mo18255q(C8125q5 c8125q5, C8160s5 c8160s5) {
        return m19170F(c8125q5, c8160s5);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: r */
    public Boolean mo18254r() {
        return C7995j3.m19047a().m19046b(this.f21615b.getCacheDirPath(), !this.f21615b.isEnableAutoSessionTracking());
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: s */
    public void mo18253s(InterfaceC8164t2 interfaceC8164t2) {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'withScope' call is a no-op.", new Object[0]);
            return;
        }
        m19166J();
        try {
            interfaceC8164t2.mo18044a(this.f21617d.m19044a().m19039c());
        } catch (Throwable th2) {
            this.f21615b.getLogger().mo18136b(EnumC8021m4.ERROR, "Error in the 'withScope' callback.", th2);
        }
        m19167I();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: t */
    public /* synthetic */ C8100q mo18252t(Throwable th2) {
        return C8017m0.m18998c(this, th2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: u */
    public /* synthetic */ InterfaceC8259w0 mo18251u(String str, String str2, C7934h c7934h, boolean z) {
        return C8017m0.m18994g(this, str, str2, c7934h, z);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: v */
    public C8100q mo18250v(Throwable th2, C7831b0 c7831b0) {
        return m19173C(th2, c7831b0, null);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: w */
    public C8100q mo18249w(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0, C8027n2 c8027n2) {
        C8229o.m18169c(c8114x, "transaction is required");
        C8100q c8100q = C8100q.f21957k;
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c8100q;
        } else if (!c8114x.m18485p0()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c8114x.m19266G());
            return c8100q;
        } else if (!Boolean.TRUE.equals(Boolean.valueOf(c8114x.m18484q0()))) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.DEBUG, "Transaction %s was dropped due to sampling decision.", c8114x.m19266G());
            this.f21615b.getClientReportRecorder().mo19474a(EnumC7875e.SAMPLE_RATE, EnumC7960i.Transaction);
            return c8100q;
        } else {
            try {
                C7997j5.C7998a m19044a = this.f21617d.m19044a();
                return m19044a.m19041a().mo18356f(c8114x, c8034n5, m19044a.m19039c(), c7831b0, c8027n2);
            } catch (Throwable th2) {
                InterfaceC8040o0 logger = this.f21615b.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
                logger.mo18136b(enumC8021m4, "Error while capturing transaction with id: " + c8114x.m19266G(), th2);
                return c8100q;
            }
        }
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: x */
    public void mo18248x() {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C7997j5.C7998a m19044a = this.f21617d.m19044a();
        Scope.C7682d m20085E = m19044a.m19039c().m20085E();
        if (m20085E != null) {
            if (m20085E.m20054b() != null) {
                m19044a.m19041a().mo18357e(m20085E.m20054b(), C8220j.m18225e(new C7955m()));
            }
            m19044a.m19041a().mo18357e(m20085E.m20055a(), C8220j.m18225e(new C7957o()));
            return;
        }
        this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Session could not be started.", new Object[0]);
    }

    private C7935h0(C8132r4 c8132r4, C7997j5 c7997j5) {
        this.f21619f = DesugarCollections.synchronizedMap(new WeakHashMap());
        m19165K(c8132r4);
        this.f21615b = c8132r4;
        this.f21618e = new C8046o5(c8132r4);
        this.f21617d = c7997j5;
        this.f21614a = C8100q.f21957k;
        this.f21620g = c8132r4.getTransactionPerformanceCollector();
        this.f21616c = true;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: clone */
    public InterfaceC8025n0 m42127clone() {
        if (!isEnabled()) {
            this.f21615b.getLogger().mo18135c(EnumC8021m4.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new C7935h0(this.f21615b, new C7997j5(this.f21617d));
    }

    private C7935h0(C8132r4 c8132r4, C7997j5.C7998a c7998a) {
        this(c8132r4, new C7997j5(c8132r4.getLogger(), c7998a));
    }
}
