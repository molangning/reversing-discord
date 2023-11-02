package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.AbstractC8003k3;
import io.sentry.C7685a0;
import io.sentry.C7687a1;
import io.sentry.C7831b0;
import io.sentry.C7833b2;
import io.sentry.C7901e;
import io.sentry.C8125q5;
import io.sentry.C8132r4;
import io.sentry.C8160s5;
import io.sentry.EnumC7975i5;
import io.sentry.EnumC8021m4;
import io.sentry.EnumC8277z0;
import io.sentry.ISpan;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8128r1;
import io.sentry.InterfaceC8140r5;
import io.sentry.InterfaceC8164t2;
import io.sentry.InterfaceC8259w0;
import io.sentry.Scope;
import io.sentry.android.core.internal.util.ViewTreeObserver$OnDrawListenerC7768j;
import io.sentry.protocol.EnumC8118z;
import io.sentry.util.C8229o;
import io.sentry.util.C8241w;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: A */
    private final C7730h f21022A;

    /* renamed from: j */
    private final Application f21023j;

    /* renamed from: k */
    private final C7798o0 f21024k;

    /* renamed from: l */
    private InterfaceC8025n0 f21025l;

    /* renamed from: m */
    private SentryAndroidOptions f21026m;

    /* renamed from: p */
    private boolean f21029p;

    /* renamed from: r */
    private final boolean f21031r;

    /* renamed from: t */
    private ISpan f21033t;

    /* renamed from: n */
    private boolean f21027n = false;

    /* renamed from: o */
    private boolean f21028o = false;

    /* renamed from: q */
    private boolean f21030q = false;

    /* renamed from: s */
    private C7685a0 f21032s = null;

    /* renamed from: u */
    private final WeakHashMap<Activity, ISpan> f21034u = new WeakHashMap<>();

    /* renamed from: v */
    private final WeakHashMap<Activity, ISpan> f21035v = new WeakHashMap<>();

    /* renamed from: w */
    private AbstractC8003k3 f21036w = C7807s.m19678a();

    /* renamed from: x */
    private final Handler f21037x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    private Future<?> f21038y = null;

    /* renamed from: z */
    private final WeakHashMap<Activity, InterfaceC8259w0> f21039z = new WeakHashMap<>();

    public ActivityLifecycleIntegration(Application application, C7798o0 c7798o0, C7730h c7730h) {
        Application application2 = (Application) C8229o.m18169c(application, "Application is required");
        this.f21023j = application2;
        this.f21024k = (C7798o0) C8229o.m18169c(c7798o0, "BuildInfoProvider is required");
        this.f21022A = (C7730h) C8229o.m18169c(c7730h, "ActivityFramesTracker is required");
        if (c7798o0.m19703d() >= 29) {
            this.f21029p = true;
        }
        this.f21031r = C7803q0.m19687m(application2);
    }

    /* renamed from: A */
    private void m20041A(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f21026m;
        if (sentryAndroidOptions != null && this.f21025l != null && sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            C7901e c7901e = new C7901e();
            c7901e.m19325p("navigation");
            c7901e.m19328m("state", str);
            c7901e.m19328m("screen", m20008j0(activity));
            c7901e.m19329l("ui.lifecycle");
            c7901e.m19327n(EnumC8021m4.INFO);
            C7831b0 c7831b0 = new C7831b0();
            c7831b0.m19592j("android:activity", activity);
            this.f21025l.mo18266f(c7901e, c7831b0);
        }
    }

    /* renamed from: A0 */
    private String m20040A0(ISpan iSpan) {
        String description = iSpan.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return iSpan.getDescription() + " - Deadline Exceeded";
    }

    /* renamed from: B0 */
    private String m20039B0(String str) {
        return str + " full display";
    }

    /* renamed from: C0 */
    private String m20038C0(String str) {
        return str + " initial display";
    }

    /* renamed from: D0 */
    private boolean m20036D0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    /* renamed from: E0 */
    private boolean m20035E0(Activity activity) {
        return this.f21039z.containsKey(activity);
    }

    /* renamed from: F0 */
    public /* synthetic */ void m20034F0(Scope scope, InterfaceC8259w0 interfaceC8259w0, InterfaceC8259w0 interfaceC8259w02) {
        if (interfaceC8259w02 == null) {
            scope.m20087C(interfaceC8259w0);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f21026m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC8259w0.getName());
        }
    }

    /* renamed from: G0 */
    public static /* synthetic */ void m20033G0(InterfaceC8259w0 interfaceC8259w0, Scope scope, InterfaceC8259w0 interfaceC8259w02) {
        if (interfaceC8259w02 == interfaceC8259w0) {
            scope.m20076f();
        }
    }

    /* renamed from: I */
    private void m20030I() {
        Future<?> future = this.f21038y;
        if (future != null) {
            future.cancel(false);
            this.f21038y = null;
        }
    }

    /* renamed from: K0 */
    public /* synthetic */ void m20027K0(WeakReference weakReference, String str, InterfaceC8259w0 interfaceC8259w0) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.f21022A.m19842n(activity, interfaceC8259w0.mo17947e());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f21026m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    /* renamed from: N0 */
    public void m20028J0(ISpan iSpan, ISpan iSpan2) {
        SentryAndroidOptions sentryAndroidOptions = this.f21026m;
        if (sentryAndroidOptions != null && iSpan2 != null) {
            AbstractC8003k3 now = sentryAndroidOptions.getDateProvider().now();
            long millis = TimeUnit.NANOSECONDS.toMillis(now.mo18866b(iSpan2.mo17933s()));
            Long valueOf = Long.valueOf(millis);
            InterfaceC8128r1.EnumC8129a enumC8129a = InterfaceC8128r1.EnumC8129a.MILLISECOND;
            iSpan2.mo17939m("time_to_initial_display", valueOf, enumC8129a);
            if (iSpan != null && iSpan.mo17951a()) {
                iSpan.mo17943i(now);
                iSpan2.mo17939m("time_to_full_display", Long.valueOf(millis), enumC8129a);
            }
            m20014V(iSpan2, now);
            return;
        }
        m20015U(iSpan2);
    }

    /* renamed from: O0 */
    private void m20023O0(Bundle bundle) {
        boolean z;
        if (!this.f21030q) {
            C7792m0 m19723e = C7792m0.m19723e();
            if (bundle == null) {
                z = true;
            } else {
                z = false;
            }
            m19723e.m19718j(z);
        }
    }

    /* renamed from: P0 */
    private void m20022P0(ISpan iSpan) {
        if (iSpan != null) {
            iSpan.mo17936p().m19293m("auto.ui.activity");
        }
    }

    /* renamed from: Q0 */
    private void m20020Q0(Activity activity) {
        AbstractC8003k3 abstractC8003k3;
        AbstractC8003k3 abstractC8003k32;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f21025l != null && !m20035E0(activity)) {
            boolean z = this.f21027n;
            if (!z) {
                this.f21039z.put(activity, C7833b2.m19587t());
                C8241w.m18138h(this.f21025l);
            } else if (z) {
                m20018R0();
                final String m20008j0 = m20008j0(activity);
                if (this.f21031r) {
                    abstractC8003k3 = C7792m0.m19723e().m19724d();
                } else {
                    abstractC8003k3 = null;
                }
                Boolean m19722f = C7792m0.m19723e().m19722f();
                C8160s5 c8160s5 = new C8160s5();
                if (this.f21026m.isEnableActivityLifecycleTracingAutoFinish()) {
                    c8160s5.m18365m(this.f21026m.getIdleTimeout());
                    c8160s5.m19157d(true);
                }
                c8160s5.m18362p(true);
                c8160s5.m18363o(new InterfaceC8140r5() { // from class: io.sentry.android.core.n
                    @Override // io.sentry.InterfaceC8140r5
                    /* renamed from: a */
                    public final void mo18439a(InterfaceC8259w0 interfaceC8259w0) {
                        ActivityLifecycleIntegration.this.m20027K0(weakReference, m20008j0, interfaceC8259w0);
                    }
                });
                if (!this.f21030q && abstractC8003k3 != null && m19722f != null) {
                    abstractC8003k32 = abstractC8003k3;
                } else {
                    abstractC8003k32 = this.f21036w;
                }
                c8160s5.m18364n(abstractC8003k32);
                final InterfaceC8259w0 mo18255q = this.f21025l.mo18255q(new C8125q5(m20008j0, EnumC8118z.COMPONENT, "ui.load"), c8160s5);
                m20022P0(mo18255q);
                if (!this.f21030q && abstractC8003k3 != null && m19722f != null) {
                    ISpan mo17940l = mo18255q.mo17940l(m20000w0(m19722f.booleanValue()), m20002t0(m19722f.booleanValue()), abstractC8003k3, EnumC8277z0.SENTRY);
                    this.f21033t = mo17940l;
                    m20022P0(mo17940l);
                    m20019R();
                }
                String m20038C0 = m20038C0(m20008j0);
                EnumC8277z0 enumC8277z0 = EnumC8277z0.SENTRY;
                final ISpan mo17940l2 = mo18255q.mo17940l("ui.load.initial_display", m20038C0, abstractC8003k32, enumC8277z0);
                this.f21034u.put(activity, mo17940l2);
                m20022P0(mo17940l2);
                if (this.f21028o && this.f21032s != null && this.f21026m != null) {
                    final ISpan mo17940l3 = mo18255q.mo17940l("ui.load.full_display", m20039B0(m20008j0), abstractC8003k32, enumC8277z0);
                    m20022P0(mo17940l3);
                    try {
                        this.f21035v.put(activity, mo17940l3);
                        this.f21038y = this.f21026m.getExecutorService().mo18039b(new Runnable() { // from class: io.sentry.android.core.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityLifecycleIntegration.this.m20026L0(mo17940l3, mo17940l2);
                            }
                        }, 30000L);
                    } catch (RejectedExecutionException e) {
                        this.f21026m.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                    }
                }
                this.f21025l.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.p
                    @Override // io.sentry.InterfaceC8164t2
                    /* renamed from: a */
                    public final void mo18044a(Scope scope) {
                        ActivityLifecycleIntegration.this.m20025M0(mo18255q, scope);
                    }
                });
                this.f21039z.put(activity, mo18255q);
            }
        }
    }

    /* renamed from: R */
    private void m20019R() {
        AbstractC8003k3 m19727a = C7792m0.m19723e().m19727a();
        if (this.f21027n && m19727a != null) {
            m20014V(this.f21033t, m19727a);
        }
    }

    /* renamed from: R0 */
    private void m20018R0() {
        for (Map.Entry<Activity, InterfaceC8259w0> entry : this.f21039z.entrySet()) {
            m20011e0(entry.getValue(), this.f21034u.get(entry.getKey()), this.f21035v.get(entry.getKey()));
        }
    }

    /* renamed from: S */
    public void m20026L0(ISpan iSpan, ISpan iSpan2) {
        AbstractC8003k3 abstractC8003k3;
        if (iSpan != null && !iSpan.mo17951a()) {
            iSpan.mo17948d(m20040A0(iSpan));
            if (iSpan2 != null) {
                abstractC8003k3 = iSpan2.mo17935q();
            } else {
                abstractC8003k3 = null;
            }
            if (abstractC8003k3 == null) {
                abstractC8003k3 = iSpan.mo17933s();
            }
            m20013Y(iSpan, abstractC8003k3, EnumC7975i5.DEADLINE_EXCEEDED);
        }
    }

    /* renamed from: S0 */
    private void m20016S0(Activity activity, boolean z) {
        if (this.f21027n && z) {
            m20011e0(this.f21039z.get(activity), null, null);
        }
    }

    /* renamed from: U */
    private void m20015U(ISpan iSpan) {
        if (iSpan != null && !iSpan.mo17951a()) {
            iSpan.mo17949c();
        }
    }

    /* renamed from: V */
    private void m20014V(ISpan iSpan, AbstractC8003k3 abstractC8003k3) {
        m20013Y(iSpan, abstractC8003k3, null);
    }

    /* renamed from: Y */
    private void m20013Y(ISpan iSpan, AbstractC8003k3 abstractC8003k3, EnumC7975i5 enumC7975i5) {
        if (iSpan != null && !iSpan.mo17951a()) {
            if (enumC7975i5 == null) {
                if (iSpan.mo17950b() != null) {
                    enumC7975i5 = iSpan.mo17950b();
                } else {
                    enumC7975i5 = EnumC7975i5.OK;
                }
            }
            iSpan.mo17934r(enumC7975i5, abstractC8003k3);
        }
    }

    /* renamed from: b0 */
    private void m20012b0(ISpan iSpan, EnumC7975i5 enumC7975i5) {
        if (iSpan != null && !iSpan.mo17951a()) {
            iSpan.mo17942j(enumC7975i5);
        }
    }

    /* renamed from: e0 */
    private void m20011e0(final InterfaceC8259w0 interfaceC8259w0, ISpan iSpan, ISpan iSpan2) {
        if (interfaceC8259w0 == null || interfaceC8259w0.mo17951a()) {
            return;
        }
        m20012b0(iSpan, EnumC7975i5.DEADLINE_EXCEEDED);
        m20026L0(iSpan2, iSpan);
        m20030I();
        EnumC7975i5 mo17950b = interfaceC8259w0.mo17950b();
        if (mo17950b == null) {
            mo17950b = EnumC7975i5.OK;
        }
        interfaceC8259w0.mo17942j(mo17950b);
        InterfaceC8025n0 interfaceC8025n0 = this.f21025l;
        if (interfaceC8025n0 != null) {
            interfaceC8025n0.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.k
                @Override // io.sentry.InterfaceC8164t2
                /* renamed from: a */
                public final void mo18044a(Scope scope) {
                    ActivityLifecycleIntegration.this.m20031H0(interfaceC8259w0, scope);
                }
            });
        }
    }

    /* renamed from: j0 */
    private String m20008j0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* renamed from: t0 */
    private String m20002t0(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    /* renamed from: w0 */
    private String m20000w0(boolean z) {
        return z ? "app.start.cold" : "app.start.warm";
    }

    /* renamed from: D */
    public /* synthetic */ void m20037D() {
        C7687a1.m20046a(this);
    }

    /* renamed from: H */
    public void m20025M0(final Scope scope, final InterfaceC8259w0 interfaceC8259w0) {
        scope.m20082H(new Scope.InterfaceC7681c() { // from class: io.sentry.android.core.q
            @Override // io.sentry.Scope.InterfaceC7681c
            /* renamed from: a */
            public final void mo18033a(InterfaceC8259w0 interfaceC8259w02) {
                ActivityLifecycleIntegration.this.m20034F0(scope, interfaceC8259w0, interfaceC8259w02);
            }
        });
    }

    /* renamed from: Q */
    public void m20031H0(final Scope scope, final InterfaceC8259w0 interfaceC8259w0) {
        scope.m20082H(new Scope.InterfaceC7681c() { // from class: io.sentry.android.core.m
            @Override // io.sentry.Scope.InterfaceC7681c
            /* renamed from: a */
            public final void mo18033a(InterfaceC8259w0 interfaceC8259w02) {
                ActivityLifecycleIntegration.m20033G0(InterfaceC8259w0.this, scope, interfaceC8259w02);
            }
        });
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        this.f21026m = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21025l = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
        InterfaceC8040o0 logger = this.f21026m.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f21026m.isEnableActivityLifecycleBreadcrumbs()));
        this.f21027n = m20036D0(this.f21026m);
        this.f21032s = this.f21026m.getFullyDisplayedReporter();
        this.f21028o = this.f21026m.isEnableTimeToFullDisplayTracing();
        this.f21023j.registerActivityLifecycleCallbacks(this);
        this.f21026m.getLogger().mo18135c(enumC8021m4, "ActivityLifecycleIntegration installed.", new Object[0]);
        m20037D();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21023j.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f21026m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f21022A.m19840p();
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m20023O0(bundle);
        m20041A(activity, "created");
        m20020Q0(activity);
        final ISpan iSpan = this.f21035v.get(activity);
        this.f21030q = true;
        C7685a0 c7685a0 = this.f21032s;
        if (c7685a0 != null) {
            c7685a0.m20047b(new C7685a0.InterfaceC7686a() { // from class: io.sentry.android.core.l
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        if (this.f21027n || this.f21026m.isEnableActivityLifecycleBreadcrumbs()) {
            m20041A(activity, "destroyed");
            m20012b0(this.f21033t, EnumC7975i5.CANCELLED);
            ISpan iSpan = this.f21034u.get(activity);
            m20012b0(iSpan, EnumC7975i5.DEADLINE_EXCEEDED);
            m20026L0(this.f21035v.get(activity), iSpan);
            m20030I();
            m20016S0(activity, true);
            this.f21033t = null;
            this.f21034u.remove(activity);
            this.f21035v.remove(activity);
        }
        this.f21039z.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        if (!this.f21029p) {
            InterfaceC8025n0 interfaceC8025n0 = this.f21025l;
            if (interfaceC8025n0 == null) {
                this.f21036w = C7807s.m19678a();
            } else {
                this.f21036w = interfaceC8025n0.mo18262j().getDateProvider().now();
            }
        }
        m20041A(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (this.f21029p) {
            InterfaceC8025n0 interfaceC8025n0 = this.f21025l;
            if (interfaceC8025n0 == null) {
                this.f21036w = C7807s.m19678a();
            } else {
                this.f21036w = interfaceC8025n0.mo18262j().getDateProvider().now();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"NewApi"})
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f21027n) {
            AbstractC8003k3 m19724d = C7792m0.m19723e().m19724d();
            AbstractC8003k3 m19727a = C7792m0.m19723e().m19727a();
            if (m19724d != null && m19727a == null) {
                C7792m0.m19723e().m19721g();
            }
            m20019R();
            final ISpan iSpan = this.f21034u.get(activity);
            final ISpan iSpan2 = this.f21035v.get(activity);
            View findViewById = activity.findViewById(16908290);
            if (this.f21024k.m19703d() >= 16 && findViewById != null) {
                ViewTreeObserver$OnDrawListenerC7768j.m19758e(findViewById, new Runnable() { // from class: io.sentry.android.core.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.m20029I0(iSpan2, iSpan);
                    }
                }, this.f21024k);
            } else {
                this.f21037x.post(new Runnable() { // from class: io.sentry.android.core.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.m20028J0(iSpan2, iSpan);
                    }
                });
            }
        }
        m20041A(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m20041A(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (this.f21027n) {
            this.f21022A.m19851e(activity);
        }
        m20041A(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        m20041A(activity, "stopped");
    }
}