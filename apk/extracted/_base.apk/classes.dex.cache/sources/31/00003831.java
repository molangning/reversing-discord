package io.sentry.android.core;

import androidx.lifecycle.C1678c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C7836b5;
import io.sentry.C7901e;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8164t2;
import io.sentry.Scope;
import io.sentry.android.core.internal.util.C7760c;
import io.sentry.transport.C8187m;
import io.sentry.transport.InterfaceC8189o;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class LifecycleWatcher implements DefaultLifecycleObserver {

    /* renamed from: j */
    private final AtomicLong f21069j;

    /* renamed from: k */
    private final long f21070k;

    /* renamed from: l */
    private TimerTask f21071l;

    /* renamed from: m */
    private final Timer f21072m;

    /* renamed from: n */
    private final Object f21073n;

    /* renamed from: o */
    private final InterfaceC8025n0 f21074o;

    /* renamed from: p */
    private final boolean f21075p;

    /* renamed from: q */
    private final boolean f21076q;

    /* renamed from: r */
    private final InterfaceC8189o f21077r;

    /* renamed from: io.sentry.android.core.LifecycleWatcher$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C7698a extends TimerTask {
        C7698a() {
            LifecycleWatcher.this = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LifecycleWatcher.this.m19970f(ViewProps.END);
            LifecycleWatcher.this.f21074o.mo18259m();
        }
    }

    public LifecycleWatcher(InterfaceC8025n0 interfaceC8025n0, long j, boolean z, boolean z2) {
        this(interfaceC8025n0, j, z, z2, C8187m.m18313b());
    }

    /* renamed from: e */
    private void m19971e(String str) {
        if (this.f21076q) {
            C7901e c7901e = new C7901e();
            c7901e.m19325p("navigation");
            c7901e.m19328m("state", str);
            c7901e.m19329l("app.lifecycle");
            c7901e.m19327n(EnumC8021m4.INFO);
            this.f21074o.mo18269c(c7901e);
        }
    }

    /* renamed from: f */
    public void m19970f(String str) {
        this.f21074o.mo18269c(C7760c.m19776a(str));
    }

    /* renamed from: g */
    private void m19969g() {
        synchronized (this.f21073n) {
            TimerTask timerTask = this.f21071l;
            if (timerTask != null) {
                timerTask.cancel();
                this.f21071l = null;
            }
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m19968h(Scope scope) {
        C7836b5 m20064r;
        if (this.f21069j.get() == 0 && (m20064r = scope.m20064r()) != null && m20064r.m19576k() != null) {
            this.f21069j.set(m20064r.m19576k().getTime());
        }
    }

    /* renamed from: i */
    private void m19967i() {
        synchronized (this.f21073n) {
            m19969g();
            if (this.f21072m != null) {
                C7698a c7698a = new C7698a();
                this.f21071l = c7698a;
                this.f21072m.schedule(c7698a, this.f21070k);
            }
        }
    }

    /* renamed from: j */
    private void m19966j() {
        if (this.f21075p) {
            m19969g();
            long mo18303a = this.f21077r.mo18303a();
            this.f21074o.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.c1
                @Override // io.sentry.InterfaceC8164t2
                /* renamed from: a */
                public final void mo18044a(Scope scope) {
                    LifecycleWatcher.this.m19968h(scope);
                }
            });
            long j = this.f21069j.get();
            if (j == 0 || j + this.f21070k <= mo18303a) {
                m19970f(ViewProps.START);
                this.f21074o.mo18248x();
            }
            this.f21069j.set(mo18303a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C1678c.m36056a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C1678c.m36055b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C1678c.m36054c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C1678c.m36053d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
    public void onStart(LifecycleOwner lifecycleOwner) {
        m19966j();
        m19971e("foreground");
        C7795n0.m19709a().m19707c(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
    public void onStop(LifecycleOwner lifecycleOwner) {
        if (this.f21075p) {
            this.f21069j.set(this.f21077r.mo18303a());
            m19967i();
        }
        C7795n0.m19709a().m19707c(true);
        m19971e(AppStateModule.APP_STATE_BACKGROUND);
    }

    LifecycleWatcher(InterfaceC8025n0 interfaceC8025n0, long j, boolean z, boolean z2, InterfaceC8189o interfaceC8189o) {
        this.f21069j = new AtomicLong(0L);
        this.f21073n = new Object();
        this.f21070k = j;
        this.f21075p = z;
        this.f21076q = z2;
        this.f21074o = interfaceC8025n0;
        this.f21077r = interfaceC8189o;
        if (z) {
            this.f21072m = new Timer(true);
        } else {
            this.f21072m = null;
        }
    }
}