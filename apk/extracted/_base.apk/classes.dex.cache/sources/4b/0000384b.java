package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.transport.InterfaceC8189o;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7711c extends Thread {

    /* renamed from: j */
    private final boolean f21155j;

    /* renamed from: k */
    private final InterfaceC7712a f21156k;

    /* renamed from: l */
    private final C7723e1 f21157l;

    /* renamed from: m */
    private final InterfaceC8189o f21158m;

    /* renamed from: n */
    private long f21159n;

    /* renamed from: o */
    private final long f21160o;

    /* renamed from: p */
    private final InterfaceC8040o0 f21161p;

    /* renamed from: q */
    private volatile long f21162q;

    /* renamed from: r */
    private final AtomicBoolean f21163r;

    /* renamed from: s */
    private final Context f21164s;

    /* renamed from: t */
    private final Runnable f21165t;

    /* renamed from: io.sentry.android.core.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7712a {
        /* renamed from: a */
        void mo19907a(ApplicationNotResponding applicationNotResponding);
    }

    public C7711c(long j, boolean z, InterfaceC7712a interfaceC7712a, InterfaceC8040o0 interfaceC8040o0, Context context) {
        this(new InterfaceC8189o() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.InterfaceC8189o
            /* renamed from: a */
            public final long mo18303a() {
                long m19916d;
                m19916d = C7711c.m19916d();
                return m19916d;
            }
        }, j, 500L, z, interfaceC7712a, interfaceC8040o0, new C7723e1(), context);
    }

    /* renamed from: c */
    private boolean m19917c() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        ActivityManager activityManager = (ActivityManager) this.f21164s.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            list = activityManager.getProcessesInErrorState();
        } catch (Throwable th2) {
            this.f21161p.mo18136b(EnumC8021m4.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
            list = null;
        }
        if (list != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.condition == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public static /* synthetic */ long m19916d() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    public /* synthetic */ void m19915e(InterfaceC8189o interfaceC8189o) {
        this.f21162q = interfaceC8189o.mo18303a();
        this.f21163r.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f21165t.run();
        while (!isInterrupted()) {
            this.f21157l.m19901b(this.f21165t);
            try {
                Thread.sleep(this.f21159n);
                if (this.f21158m.mo18303a() - this.f21162q > this.f21160o) {
                    if (!this.f21155j && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f21161p.mo18135c(EnumC8021m4.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f21163r.set(true);
                    } else if (m19917c() && this.f21163r.compareAndSet(false, true)) {
                        this.f21156k.mo19907a(new ApplicationNotResponding("Application Not Responding for at least " + this.f21160o + " ms.", this.f21157l.m19902a()));
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.f21161p.mo18135c(EnumC8021m4.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f21161p.mo18135c(EnumC8021m4.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }

    C7711c(final InterfaceC8189o interfaceC8189o, long j, long j2, boolean z, InterfaceC7712a interfaceC7712a, InterfaceC8040o0 interfaceC8040o0, C7723e1 c7723e1, Context context) {
        super("|ANR-WatchDog|");
        this.f21162q = 0L;
        this.f21163r = new AtomicBoolean(false);
        this.f21158m = interfaceC8189o;
        this.f21160o = j;
        this.f21159n = j2;
        this.f21155j = z;
        this.f21156k = interfaceC7712a;
        this.f21161p = interfaceC8040o0;
        this.f21157l = c7723e1;
        this.f21164s = context;
        this.f21165t = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                C7711c.this.m19915e(interfaceC8189o);
            }
        };
        if (j < this.f21159n * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f21159n * 2)));
        }
    }
}