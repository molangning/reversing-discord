package io.sentry;

import io.sentry.C7836b5;
import io.sentry.C8132r4;
import io.sentry.Scope;
import io.sentry.clientreport.EnumC7875e;
import io.sentry.exception.C7914b;
import io.sentry.hints.InterfaceC7944b;
import io.sentry.hints.InterfaceC7946d;
import io.sentry.hints.InterfaceC7959q;
import io.sentry.protocol.C8068c;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;
import io.sentry.transport.InterfaceC8190p;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import io.sentry.util.C8241w;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.i3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7971i3 implements InterfaceC8162t0 {

    /* renamed from: b */
    private final C8132r4 f21642b;

    /* renamed from: c */
    private final InterfaceC8190p f21643c;

    /* renamed from: d */
    private final SecureRandom f21644d;

    /* renamed from: e */
    private final C7973b f21645e = new C7973b();

    /* renamed from: a */
    private boolean f21641a = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.i3$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7973b implements Comparator<C7901e> {
        private C7973b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C7901e c7901e, C7901e c7901e2) {
            return c7901e.m19331j().compareTo(c7901e2.m19331j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7971i3(C8132r4 c8132r4) {
        this.f21642b = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required.");
        InterfaceC8271y0 transportFactory = c8132r4.getTransportFactory();
        if (transportFactory instanceof C7907e2) {
            transportFactory = new C7684a();
            c8132r4.setTransportFactory(transportFactory);
        }
        this.f21643c = transportFactory.mo18041a(c8132r4, new C8130r2(c8132r4).m18444a());
        this.f21644d = c8132r4.getSampleRate() != null ? new SecureRandom() : null;
    }

    /* renamed from: j */
    private void m19128j(Scope scope, C7831b0 c7831b0) {
        if (scope != null) {
            c7831b0.m19601a(scope.m20073i());
        }
    }

    /* renamed from: k */
    private <T extends AbstractC7920f3> T m19127k(T t, Scope scope) {
        if (scope != null) {
            if (t.m19262K() == null) {
                t.m19247Z(scope.m20065q());
            }
            if (t.m19256Q() == null) {
                t.m19237e0(scope.m20059w());
            }
            if (t.m19259N() == null) {
                t.m19239d0(new HashMap(scope.m20062t()));
            } else {
                for (Map.Entry<String, String> entry : scope.m20062t().entrySet()) {
                    if (!t.m19259N().containsKey(entry.getKey())) {
                        t.m19259N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t.m19271B() == null) {
                t.m19255R(new ArrayList(scope.m20072j()));
            } else {
                m19113y(t, scope.m20072j());
            }
            if (t.m19265H() == null) {
                t.m19250W(new HashMap(scope.m20069m()));
            } else {
                for (Map.Entry<String, Object> entry2 : scope.m20069m().entrySet()) {
                    if (!t.m19265H().containsKey(entry2.getKey())) {
                        t.m19265H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C8068c m19270C = t.m19270C();
            for (Map.Entry<String, Object> entry3 : new C8068c(scope.m20071k()).entrySet()) {
                if (!m19270C.containsKey(entry3.getKey())) {
                    m19270C.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t;
    }

    /* renamed from: l */
    private C7923f4 m19126l(C7923f4 c7923f4, Scope scope, C7831b0 c7831b0) {
        if (scope != null) {
            m19127k(c7923f4, scope);
            if (c7923f4.m19193t0() == null) {
                c7923f4.m19209E0(scope.m20060v());
            }
            if (c7923f4.m19197p0() == null) {
                c7923f4.m19188y0(scope.m20068n());
            }
            if (scope.m20067o() != null) {
                c7923f4.m19187z0(scope.m20067o());
            }
            ISpan m20063s = scope.m20063s();
            if (c7923f4.m19270C().m18798f() == null) {
                if (m20063s == null) {
                    c7923f4.m19270C().m18790n(C8125q5.m18463q(scope.m20066p()));
                } else {
                    c7923f4.m19270C().m18790n(m20063s.mo17936p());
                }
            }
            return m19118t(c7923f4, c7831b0, scope.m20070l());
        }
        return c7923f4;
    }

    /* renamed from: m */
    private C8020m3 m19125m(AbstractC7920f3 abstractC7920f3, List<C7830b> list, C7836b5 c7836b5, C8034n5 c8034n5, C8027n2 c8027n2) {
        C8100q c8100q;
        ArrayList arrayList = new ArrayList();
        if (abstractC7920f3 != null) {
            arrayList.add(C7898d4.m19365s(this.f21642b.getSerializer(), abstractC7920f3));
            c8100q = abstractC7920f3.m19266G();
        } else {
            c8100q = null;
        }
        if (c7836b5 != null) {
            arrayList.add(C7898d4.m19363u(this.f21642b.getSerializer(), c7836b5));
        }
        if (c8027n2 != null) {
            arrayList.add(C7898d4.m19364t(c8027n2, this.f21642b.getMaxTraceFileSize(), this.f21642b.getSerializer()));
            if (c8100q == null) {
                c8100q = new C8100q(c8027n2.m18983A());
            }
        }
        if (list != null) {
            for (C7830b c7830b : list) {
                arrayList.add(C7898d4.m19367q(this.f21642b.getSerializer(), this.f21642b.getLogger(), c7830b, this.f21642b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C8020m3(new C8030n3(c8100q, this.f21642b.getSdkVersion(), c8034n5), arrayList);
    }

    /* renamed from: n */
    private C7923f4 m19124n(C7923f4 c7923f4, C7831b0 c7831b0) {
        C8132r4.InterfaceC8134b beforeSend = this.f21642b.getBeforeSend();
        if (beforeSend != null) {
            try {
                return beforeSend.mo18434a(c7923f4, c7831b0);
            } catch (Throwable th2) {
                this.f21642b.getLogger().mo18136b(EnumC8021m4.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
                return null;
            }
        }
        return c7923f4;
    }

    /* renamed from: o */
    private C8114x m19123o(C8114x c8114x, C7831b0 c7831b0) {
        this.f21642b.getBeforeSendTransaction();
        return c8114x;
    }

    /* renamed from: p */
    private List<C7830b> m19122p(List<C7830b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C7830b c7830b : list) {
            if (c7830b.m19602j()) {
                arrayList.add(c7830b);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private List<C7830b> m19121q(C7831b0 c7831b0) {
        List<C7830b> m19597e = c7831b0.m19597e();
        C7830b m19596f = c7831b0.m19596f();
        if (m19596f != null) {
            m19597e.add(m19596f);
        }
        C7830b m19594h = c7831b0.m19594h();
        if (m19594h != null) {
            m19597e.add(m19594h);
        }
        C7830b m19595g = c7831b0.m19595g();
        if (m19595g != null) {
            m19597e.add(m19595g);
        }
        return m19597e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m19120r(C7836b5 c7836b5) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m19119s(C7923f4 c7923f4, C7831b0 c7831b0, C7836b5 c7836b5) {
        C7836b5.EnumC7838b enumC7838b;
        String str;
        boolean z = false;
        if (c7836b5 != null) {
            String str2 = null;
            if (c7923f4.m19191v0()) {
                enumC7838b = C7836b5.EnumC7838b.Crashed;
            } else {
                enumC7838b = null;
            }
            z = (C7836b5.EnumC7838b.Crashed == enumC7838b || c7923f4.m19190w0()) ? true : true;
            if (c7923f4.m19262K() != null && c7923f4.m19262K().m18625l() != null && c7923f4.m19262K().m18625l().containsKey("user-agent")) {
                str = c7923f4.m19262K().m18625l().get("user-agent");
            } else {
                str = null;
            }
            Object m18223g = C8220j.m18223g(c7831b0);
            if (m18223g instanceof InterfaceC7944b) {
                str2 = ((InterfaceC7944b) m18223g).mo19152f();
                enumC7838b = C7836b5.EnumC7838b.Abnormal;
            }
            if (c7836b5.m19570q(enumC7838b, str, z, str2) && c7836b5.m19574m()) {
                c7836b5.m19584c();
                return;
            }
            return;
        }
        this.f21642b.getLogger().mo18135c(EnumC8021m4.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    /* renamed from: t */
    private C7923f4 m19118t(C7923f4 c7923f4, C7831b0 c7831b0, List<InterfaceC8270y> list) {
        Iterator<InterfaceC8270y> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8270y next = it.next();
            try {
                boolean z = next instanceof InterfaceC7839c;
                boolean m18222h = C8220j.m18222h(c7831b0, InterfaceC7946d.class);
                if (m18222h && z) {
                    c7923f4 = next.mo18043i(c7923f4, c7831b0);
                    continue;
                } else if (!m18222h && !z) {
                    c7923f4 = next.mo18043i(c7923f4, c7831b0);
                    continue;
                }
            } catch (Throwable th2) {
                this.f21642b.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "An exception occurred while processing event by processor: %s", next.getClass().getName());
                continue;
            }
            if (c7923f4 == null) {
                this.f21642b.getLogger().mo18135c(EnumC8021m4.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.f21642b.getClientReportRecorder().mo19474a(EnumC7875e.EVENT_PROCESSOR, EnumC7960i.Error);
                break;
            }
        }
        return c7923f4;
    }

    /* renamed from: u */
    private C8114x m19117u(C8114x c8114x, C7831b0 c7831b0, List<InterfaceC8270y> list) {
        Iterator<InterfaceC8270y> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8270y next = it.next();
            try {
                c8114x = next.mo18042j(c8114x, c7831b0);
                continue;
            } catch (Throwable th2) {
                this.f21642b.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
                continue;
            }
            if (c8114x == null) {
                this.f21642b.getLogger().mo18135c(EnumC8021m4.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                this.f21642b.getClientReportRecorder().mo19474a(EnumC7875e.EVENT_PROCESSOR, EnumC7960i.Transaction);
                break;
            }
        }
        return c8114x;
    }

    /* renamed from: v */
    private boolean m19116v() {
        if (this.f21642b.getSampleRate() == null || this.f21644d == null || this.f21642b.getSampleRate().doubleValue() >= this.f21644d.nextDouble()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private boolean m19115w(AbstractC7920f3 abstractC7920f3, C7831b0 c7831b0) {
        if (C8220j.m18209u(c7831b0)) {
            return true;
        }
        this.f21642b.getLogger().mo18135c(EnumC8021m4.DEBUG, "Event was cached so not applying scope: %s", abstractC7920f3.m19266G());
        return false;
    }

    /* renamed from: x */
    private boolean m19114x(C7836b5 c7836b5, C7836b5 c7836b52) {
        boolean z;
        boolean z2;
        if (c7836b52 == null) {
            return false;
        }
        if (c7836b5 == null) {
            return true;
        }
        C7836b5.EnumC7838b m19575l = c7836b52.m19575l();
        C7836b5.EnumC7838b enumC7838b = C7836b5.EnumC7838b.Crashed;
        if (m19575l == enumC7838b && c7836b5.m19575l() != enumC7838b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (c7836b52.m19582e() > 0 && c7836b5.m19582e() <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m19113y(AbstractC7920f3 abstractC7920f3, Collection<C7901e> collection) {
        List<C7901e> m19271B = abstractC7920f3.m19271B();
        if (m19271B != null && !collection.isEmpty()) {
            m19271B.addAll(collection);
            Collections.sort(m19271B, this.f21645e);
        }
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: a */
    public /* synthetic */ C8100q mo18361a(C7923f4 c7923f4, Scope scope) {
        return C8155s0.m18380a(this, c7923f4, scope);
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: b */
    public void mo18360b(long j) {
        this.f21643c.mo18298b(j);
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: c */
    public C8100q mo18359c(C7923f4 c7923f4, Scope scope, C7831b0 c7831b0) {
        C7836b5 c7836b5;
        C7836b5 m19112z;
        C7923f4 c7923f42;
        InterfaceC8259w0 m20061u;
        C8034n5 m18868h;
        C8034n5 c8034n5;
        boolean z;
        C8229o.m18169c(c7923f4, "SentryEvent is required.");
        if (c7831b0 == null) {
            c7831b0 = new C7831b0();
        }
        if (m19115w(c7923f4, c7831b0)) {
            m19128j(scope, c7831b0);
        }
        InterfaceC8040o0 logger = this.f21642b.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "Capturing event: %s", c7923f4.m19266G());
        Throwable m19258O = c7923f4.m19258O();
        if (m19258O != null && this.f21642b.containsIgnoredExceptionForType(m19258O)) {
            this.f21642b.getLogger().mo18135c(enumC8021m4, "Event was dropped as the exception %s is ignored", m19258O.getClass());
            this.f21642b.getClientReportRecorder().mo19474a(EnumC7875e.EVENT_PROCESSOR, EnumC7960i.Error);
            return C8100q.f21957k;
        } else if (m19115w(c7923f4, c7831b0) && (c7923f4 = m19126l(c7923f4, scope, c7831b0)) == null) {
            this.f21642b.getLogger().mo18135c(enumC8021m4, "Event was dropped by applyScope", new Object[0]);
            return C8100q.f21957k;
        } else {
            C7923f4 m19118t = m19118t(c7923f4, c7831b0, this.f21642b.getEventProcessors());
            if (m19118t != null && (m19118t = m19124n(m19118t, c7831b0)) == null) {
                this.f21642b.getLogger().mo18135c(enumC8021m4, "Event was dropped by beforeSend", new Object[0]);
                this.f21642b.getClientReportRecorder().mo19474a(EnumC7875e.BEFORE_SEND, EnumC7960i.Error);
            }
            if (m19118t == null) {
                return C8100q.f21957k;
            }
            List<C7830b> list = null;
            if (scope != null) {
                c7836b5 = scope.m20083G(new Scope.InterfaceC7680b() { // from class: io.sentry.g3
                    @Override // io.sentry.Scope.InterfaceC7680b
                    /* renamed from: a */
                    public final void mo19161a(C7836b5 c7836b52) {
                        C7971i3.m19120r(c7836b52);
                    }
                });
            } else {
                c7836b5 = null;
            }
            if (c7836b5 != null && c7836b5.m19574m()) {
                m19112z = null;
            } else {
                m19112z = m19112z(m19118t, c7831b0, scope);
            }
            if (!m19116v()) {
                this.f21642b.getLogger().mo18135c(enumC8021m4, "Event %s was dropped due to sampling decision.", m19118t.m19266G());
                this.f21642b.getClientReportRecorder().mo19474a(EnumC7875e.SAMPLE_RATE, EnumC7960i.Error);
                c7923f42 = null;
            } else {
                c7923f42 = m19118t;
            }
            boolean m19114x = m19114x(c7836b5, m19112z);
            if (c7923f42 == null && !m19114x) {
                this.f21642b.getLogger().mo18135c(enumC8021m4, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
                return C8100q.f21957k;
            }
            C8100q c8100q = C8100q.f21957k;
            if (c7923f42 != null && c7923f42.m19266G() != null) {
                c8100q = c7923f42.m19266G();
            }
            try {
                if (C8220j.m18222h(c7831b0, InterfaceC7946d.class)) {
                    if (c7923f42 != null) {
                        m18868h = C7891d.m19452b(c7923f42, this.f21642b).m19454C();
                        c8034n5 = m18868h;
                    }
                    c8034n5 = null;
                } else {
                    if (scope != null) {
                        InterfaceC8259w0 m20061u2 = scope.m20061u();
                        if (m20061u2 != null) {
                            m18868h = m20061u2.mo17944h();
                        } else {
                            m18868h = C8241w.m18139g(scope, this.f21642b).m18868h();
                        }
                        c8034n5 = m18868h;
                    }
                    c8034n5 = null;
                }
                if (c7923f42 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = m19121q(c7831b0);
                }
                C8020m3 m19125m = m19125m(c7923f42, list, m19112z, c8034n5, null);
                c7831b0.m19600b();
                if (m19125m != null) {
                    this.f21643c.mo18297y(m19125m, c7831b0);
                }
            } catch (C7914b | IOException e) {
                this.f21642b.getLogger().mo18137a(EnumC8021m4.WARNING, e, "Capturing event %s failed.", c8100q);
                c8100q = C8100q.f21957k;
            }
            if (scope != null && (m20061u = scope.m20061u()) != null && C8220j.m18222h(c7831b0, InterfaceC7959q.class)) {
                m20061u.mo17941k(EnumC7975i5.ABORTED, false);
            }
            return c8100q;
        }
    }

    @Override // io.sentry.InterfaceC8162t0
    public void close() {
        this.f21642b.getLogger().mo18135c(EnumC8021m4.INFO, "Closing SentryClient.", new Object[0]);
        try {
            mo18360b(this.f21642b.getShutdownTimeoutMillis());
            this.f21643c.close();
        } catch (IOException e) {
            this.f21642b.getLogger().mo18136b(EnumC8021m4.WARNING, "Failed to close the connection to the Sentry Server.", e);
        }
        for (InterfaceC8270y interfaceC8270y : this.f21642b.getEventProcessors()) {
            if (interfaceC8270y instanceof Closeable) {
                try {
                    ((Closeable) interfaceC8270y).close();
                } catch (IOException e2) {
                    this.f21642b.getLogger().mo18135c(EnumC8021m4.WARNING, "Failed to close the event processor {}.", interfaceC8270y, e2);
                }
            }
        }
        this.f21641a = false;
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: d */
    public C8100q mo18358d(C8020m3 c8020m3, C7831b0 c7831b0) {
        C8229o.m18169c(c8020m3, "SentryEnvelope is required.");
        if (c7831b0 == null) {
            c7831b0 = new C7831b0();
        }
        try {
            c7831b0.m19600b();
            this.f21643c.mo18297y(c8020m3, c7831b0);
            C8100q m18948a = c8020m3.m18987b().m18948a();
            if (m18948a != null) {
                return m18948a;
            }
            return C8100q.f21957k;
        } catch (IOException e) {
            this.f21642b.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to capture envelope.", e);
            return C8100q.f21957k;
        }
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: e */
    public void mo18357e(C7836b5 c7836b5, C7831b0 c7831b0) {
        C8229o.m18169c(c7836b5, "Session is required.");
        if (c7836b5.m19579h() != null && !c7836b5.m19579h().isEmpty()) {
            try {
                mo18358d(C8020m3.m18988a(this.f21642b.getSerializer(), c7836b5, this.f21642b.getSdkVersion()), c7831b0);
                return;
            } catch (IOException e) {
                this.f21642b.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to capture session.", e);
                return;
            }
        }
        this.f21642b.getLogger().mo18135c(EnumC8021m4.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: f */
    public C8100q mo18356f(C8114x c8114x, C8034n5 c8034n5, Scope scope, C7831b0 c7831b0, C8027n2 c8027n2) {
        C7831b0 c7831b02;
        C8100q c8100q;
        C8114x c8114x2 = c8114x;
        C8229o.m18169c(c8114x, "Transaction is required.");
        if (c7831b0 == null) {
            c7831b02 = new C7831b0();
        } else {
            c7831b02 = c7831b0;
        }
        if (m19115w(c8114x, c7831b02)) {
            m19128j(scope, c7831b02);
        }
        InterfaceC8040o0 logger = this.f21642b.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "Capturing transaction: %s", c8114x.m19266G());
        C8100q c8100q2 = C8100q.f21957k;
        if (c8114x.m19266G() != null) {
            c8100q = c8114x.m19266G();
        } else {
            c8100q = c8100q2;
        }
        if (m19115w(c8114x, c7831b02)) {
            c8114x2 = (C8114x) m19127k(c8114x, scope);
            if (c8114x2 != null && scope != null) {
                c8114x2 = m19117u(c8114x2, c7831b02, scope.m20070l());
            }
            if (c8114x2 == null) {
                this.f21642b.getLogger().mo18135c(enumC8021m4, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c8114x2 != null) {
            c8114x2 = m19117u(c8114x2, c7831b02, this.f21642b.getEventProcessors());
        }
        if (c8114x2 == null) {
            this.f21642b.getLogger().mo18135c(enumC8021m4, "Transaction was dropped by Event processors.", new Object[0]);
            return c8100q2;
        }
        C8114x m19123o = m19123o(c8114x2, c7831b02);
        if (m19123o == null) {
            this.f21642b.getLogger().mo18135c(enumC8021m4, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            this.f21642b.getClientReportRecorder().mo19474a(EnumC7875e.BEFORE_SEND, EnumC7960i.Transaction);
            return c8100q2;
        }
        try {
            C8020m3 m19125m = m19125m(m19123o, m19122p(m19121q(c7831b02)), null, c8034n5, c8027n2);
            c7831b02.m19600b();
            if (m19125m != null) {
                this.f21643c.mo18297y(m19125m, c7831b02);
                return c8100q;
            }
            return c8100q2;
        } catch (C7914b | IOException e) {
            this.f21642b.getLogger().mo18137a(EnumC8021m4.WARNING, e, "Capturing transaction %s failed.", c8100q);
            return C8100q.f21957k;
        }
    }

    @Override // io.sentry.InterfaceC8162t0
    /* renamed from: g */
    public /* synthetic */ C8100q mo18355g(String str, EnumC8021m4 enumC8021m4, Scope scope) {
        return C8155s0.m18379b(this, str, enumC8021m4, scope);
    }

    /* renamed from: z */
    C7836b5 m19112z(final C7923f4 c7923f4, final C7831b0 c7831b0, Scope scope) {
        if (C8220j.m18209u(c7831b0)) {
            if (scope != null) {
                return scope.m20083G(new Scope.InterfaceC7680b() { // from class: io.sentry.h3
                    @Override // io.sentry.Scope.InterfaceC7680b
                    /* renamed from: a */
                    public final void mo19161a(C7836b5 c7836b5) {
                        C7971i3.this.m19119s(c7923f4, c7831b0, c7836b5);
                    }
                });
            }
            this.f21642b.getLogger().mo18135c(EnumC8021m4.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }
}
