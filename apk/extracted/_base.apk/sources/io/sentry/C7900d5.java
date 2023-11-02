package io.sentry;

import io.sentry.protocol.C8100q;
import io.sentry.util.C8229o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.d5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7900d5 implements ISpan {

    /* renamed from: a */
    private AbstractC8003k3 f21519a;

    /* renamed from: b */
    private AbstractC8003k3 f21520b;

    /* renamed from: c */
    private final C7911e5 f21521c;

    /* renamed from: d */
    private final C8281z4 f21522d;

    /* renamed from: e */
    private Throwable f21523e;

    /* renamed from: f */
    private final InterfaceC8025n0 f21524f;

    /* renamed from: g */
    private final AtomicBoolean f21525g;

    /* renamed from: h */
    private final C7942h5 f21526h;

    /* renamed from: i */
    private InterfaceC7925f5 f21527i;

    /* renamed from: j */
    private final Map<String, Object> f21528j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7900d5(C8100q c8100q, C7932g5 c7932g5, C8281z4 c8281z4, String str, InterfaceC8025n0 interfaceC8025n0, AbstractC8003k3 abstractC8003k3, C7942h5 c7942h5, InterfaceC7925f5 interfaceC7925f5) {
        this.f21525g = new AtomicBoolean(false);
        this.f21528j = new ConcurrentHashMap();
        this.f21521c = new C7911e5(c8100q, new C7932g5(), str, c7932g5, c8281z4.m17966I());
        this.f21522d = (C8281z4) C8229o.m18169c(c8281z4, "transaction is required");
        this.f21524f = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "hub is required");
        this.f21526h = c7942h5;
        this.f21527i = interfaceC7925f5;
        if (abstractC8003k3 != null) {
            this.f21519a = abstractC8003k3;
        } else {
            this.f21519a = interfaceC8025n0.mo18262j().getDateProvider().now();
        }
    }

    /* renamed from: H */
    private void m19348H(AbstractC8003k3 abstractC8003k3) {
        this.f21519a = abstractC8003k3;
    }

    /* renamed from: u */
    private List<C7900d5> m19346u() {
        ArrayList arrayList = new ArrayList();
        for (C7900d5 c7900d5 : this.f21522d.m17965J()) {
            if (c7900d5.m19343x() != null && c7900d5.m19343x().equals(m19341z())) {
                arrayList.add(c7900d5);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public Map<String, String> m19355A() {
        return this.f21521c.m19296j();
    }

    /* renamed from: B */
    public C8100q m19354B() {
        return this.f21521c.m19295k();
    }

    /* renamed from: C */
    public Boolean m19353C() {
        return this.f21521c.m19301e();
    }

    /* renamed from: D */
    public Boolean m19352D() {
        return this.f21521c.m19300f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m19351E(InterfaceC7925f5 interfaceC7925f5) {
        this.f21527i = interfaceC7925f5;
    }

    /* renamed from: F */
    public ISpan m19350F(String str, String str2) {
        if (this.f21525g.get()) {
            return C7688a2.m20044t();
        }
        return this.f21522d.m17957R(this.f21521c.m19298h(), str, str2);
    }

    /* renamed from: G */
    public ISpan m19349G(String str, String str2, AbstractC8003k3 abstractC8003k3, EnumC8277z0 enumC8277z0, C7942h5 c7942h5) {
        if (this.f21525g.get()) {
            return C7688a2.m20044t();
        }
        return this.f21522d.m17956S(this.f21521c.m19298h(), str, str2, abstractC8003k3, enumC8277z0, c7942h5);
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo17951a() {
        return this.f21525g.get();
    }

    @Override // io.sentry.ISpan
    /* renamed from: b */
    public EnumC7975i5 mo17950b() {
        return this.f21521c.m19297i();
    }

    @Override // io.sentry.ISpan
    /* renamed from: c */
    public void mo17949c() {
        mo17942j(this.f21521c.m19297i());
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo17948d(String str) {
        if (this.f21525g.get()) {
            return;
        }
        this.f21521c.m19294l(str);
    }

    @Override // io.sentry.ISpan
    /* renamed from: f */
    public ISpan mo17946f(String str) {
        return m19350F(str, null);
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return this.f21521c.m19305a();
    }

    @Override // io.sentry.ISpan
    /* renamed from: i */
    public boolean mo17943i(AbstractC8003k3 abstractC8003k3) {
        if (this.f21520b != null) {
            this.f21520b = abstractC8003k3;
            return true;
        }
        return false;
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo17942j(EnumC7975i5 enumC7975i5) {
        mo17934r(enumC7975i5, this.f21524f.mo18262j().getDateProvider().now());
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public void mo17939m(String str, Number number, InterfaceC8128r1 interfaceC8128r1) {
        this.f21522d.mo17939m(str, number, interfaceC8128r1);
    }

    @Override // io.sentry.ISpan
    /* renamed from: p */
    public C7911e5 mo17936p() {
        return this.f21521c;
    }

    @Override // io.sentry.ISpan
    /* renamed from: q */
    public AbstractC8003k3 mo17935q() {
        return this.f21520b;
    }

    @Override // io.sentry.ISpan
    /* renamed from: r */
    public void mo17934r(EnumC7975i5 enumC7975i5, AbstractC8003k3 abstractC8003k3) {
        List<C7900d5> m19346u;
        AbstractC8003k3 abstractC8003k32;
        if (!this.f21525g.compareAndSet(false, true)) {
            return;
        }
        this.f21521c.m19291o(enumC7975i5);
        if (abstractC8003k3 == null) {
            abstractC8003k3 = this.f21524f.mo18262j().getDateProvider().now();
        }
        this.f21520b = abstractC8003k3;
        if (this.f21526h.m19158c() || this.f21526h.m19159b()) {
            if (this.f21522d.m17967H().m19341z().equals(m19341z())) {
                m19346u = this.f21522d.m17970E();
            } else {
                m19346u = m19346u();
            }
            AbstractC8003k3 abstractC8003k33 = null;
            AbstractC8003k3 abstractC8003k34 = null;
            for (C7900d5 c7900d5 : m19346u) {
                if (abstractC8003k33 == null || c7900d5.mo17933s().m19028d(abstractC8003k33)) {
                    abstractC8003k33 = c7900d5.mo17933s();
                }
                if (abstractC8003k34 == null || (c7900d5.mo17935q() != null && c7900d5.mo17935q().m19029c(abstractC8003k34))) {
                    abstractC8003k34 = c7900d5.mo17935q();
                }
            }
            if (this.f21526h.m19158c() && abstractC8003k33 != null && this.f21519a.m19028d(abstractC8003k33)) {
                m19348H(abstractC8003k33);
            }
            if (this.f21526h.m19159b() && abstractC8003k34 != null && ((abstractC8003k32 = this.f21520b) == null || abstractC8003k32.m19029c(abstractC8003k34))) {
                mo17943i(abstractC8003k34);
            }
        }
        Throwable th2 = this.f21523e;
        if (th2 != null) {
            this.f21524f.mo18263i(th2, this, this.f21522d.getName());
        }
        InterfaceC7925f5 interfaceC7925f5 = this.f21527i;
        if (interfaceC7925f5 != null) {
            interfaceC7925f5.mo18051a(this);
        }
    }

    @Override // io.sentry.ISpan
    /* renamed from: s */
    public AbstractC8003k3 mo17933s() {
        return this.f21519a;
    }

    /* renamed from: t */
    public Map<String, Object> m19347t() {
        return this.f21528j;
    }

    /* renamed from: v */
    public String m19345v() {
        return this.f21521c.m19304b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C7942h5 m19344w() {
        return this.f21526h;
    }

    /* renamed from: x */
    public C7932g5 m19343x() {
        return this.f21521c.m19302d();
    }

    /* renamed from: y */
    public C8054p5 m19342y() {
        return this.f21521c.m19299g();
    }

    /* renamed from: z */
    public C7932g5 m19341z() {
        return this.f21521c.m19298h();
    }

    public C7900d5(C8125q5 c8125q5, C8281z4 c8281z4, InterfaceC8025n0 interfaceC8025n0, AbstractC8003k3 abstractC8003k3, C7942h5 c7942h5) {
        this.f21525g = new AtomicBoolean(false);
        this.f21528j = new ConcurrentHashMap();
        this.f21521c = (C7911e5) C8229o.m18169c(c8125q5, "context is required");
        this.f21522d = (C8281z4) C8229o.m18169c(c8281z4, "sentryTracer is required");
        this.f21524f = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "hub is required");
        this.f21527i = null;
        if (abstractC8003k3 != null) {
            this.f21519a = abstractC8003k3;
        } else {
            this.f21519a = interfaceC8025n0.mo18262j().getDateProvider().now();
        }
        this.f21526h = c7942h5;
    }
}
