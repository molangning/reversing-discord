package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C7926g;
import io.sentry.C7961i0;
import io.sentry.C8002k2;
import io.sentry.C8027n2;
import io.sentry.C8042o2;
import io.sentry.C8156s1;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8259w0;
import io.sentry.InterfaceC8265x0;
import io.sentry.android.core.internal.util.C7764f;
import io.sentry.android.core.internal.util.C7777r;
import io.sentry.profilemeasurements.C8055a;
import io.sentry.profilemeasurements.C8057b;
import io.sentry.util.C8229o;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7708b0 implements InterfaceC8265x0 {

    /* renamed from: a */
    private int f21130a;

    /* renamed from: b */
    private File f21131b;

    /* renamed from: c */
    private File f21132c;

    /* renamed from: d */
    private Future<?> f21133d;

    /* renamed from: e */
    private volatile C8027n2 f21134e;

    /* renamed from: f */
    private final Context f21135f;

    /* renamed from: g */
    private final SentryAndroidOptions f21136g;

    /* renamed from: h */
    private final InterfaceC8025n0 f21137h;

    /* renamed from: i */
    private final C7798o0 f21138i;

    /* renamed from: j */
    private long f21139j;

    /* renamed from: k */
    private long f21140k;

    /* renamed from: l */
    private boolean f21141l;

    /* renamed from: m */
    private int f21142m;

    /* renamed from: n */
    private String f21143n;

    /* renamed from: o */
    private final C7777r f21144o;

    /* renamed from: p */
    private C8042o2 f21145p;

    /* renamed from: q */
    private final ArrayDeque<C8057b> f21146q;

    /* renamed from: r */
    private final ArrayDeque<C8057b> f21147r;

    /* renamed from: s */
    private final ArrayDeque<C8057b> f21148s;

    /* renamed from: t */
    private final Map<String, C8055a> f21149t;

    /* renamed from: u */
    private InterfaceC8259w0 f21150u;

    /* renamed from: io.sentry.android.core.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C7709a implements C7777r.InterfaceC7779b {

        /* renamed from: a */
        final long f21151a = TimeUnit.SECONDS.toNanos(1);

        /* renamed from: b */
        final long f21152b = TimeUnit.MILLISECONDS.toNanos(700);

        /* renamed from: c */
        float f21153c = 0.0f;

        C7709a() {
            C7708b0.this = r3;
        }

        @Override // io.sentry.android.core.internal.util.C7777r.InterfaceC7779b
        /* renamed from: a */
        public void mo19733a(long j, long j2, float f) {
            boolean z;
            long nanoTime = ((j - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - C7708b0.this.f21139j;
            if (nanoTime < 0) {
                return;
            }
            if (((float) j2) > ((float) this.f21151a) / (f - 1.0f)) {
                z = true;
            } else {
                z = false;
            }
            float f2 = ((int) (f * 100.0f)) / 100.0f;
            if (j2 > this.f21152b) {
                C7708b0.this.f21148s.addLast(new C8057b(Long.valueOf(nanoTime), Long.valueOf(j2)));
            } else if (z) {
                C7708b0.this.f21147r.addLast(new C8057b(Long.valueOf(nanoTime), Long.valueOf(j2)));
            }
            if (f2 != this.f21153c) {
                this.f21153c = f2;
                C7708b0.this.f21146q.addLast(new C8057b(Long.valueOf(nanoTime), Float.valueOf(f2)));
            }
        }
    }

    public C7708b0(Context context, SentryAndroidOptions sentryAndroidOptions, C7798o0 c7798o0, C7777r c7777r) {
        this(context, sentryAndroidOptions, c7798o0, c7777r, C7961i0.m19149a());
    }

    /* renamed from: i */
    private ActivityManager.MemoryInfo m19934i() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f21135f.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f21136g.getLogger().mo18135c(EnumC8021m4.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            this.f21136g.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    /* renamed from: j */
    private void m19933j() {
        if (this.f21141l) {
            return;
        }
        this.f21141l = true;
        String profilingTracesDirPath = this.f21136g.getProfilingTracesDirPath();
        if (!this.f21136g.isProfilingEnabled()) {
            this.f21136g.getLogger().mo18135c(EnumC8021m4.INFO, "Profiling is disabled in options.", new Object[0]);
        } else if (profilingTracesDirPath == null) {
            this.f21136g.getLogger().mo18135c(EnumC8021m4.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
        } else {
            int profilingTracesHz = this.f21136g.getProfilingTracesHz();
            if (profilingTracesHz <= 0) {
                this.f21136g.getLogger().mo18135c(EnumC8021m4.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(profilingTracesHz));
                return;
            }
            this.f21130a = ((int) TimeUnit.SECONDS.toMicros(1L)) / profilingTracesHz;
            this.f21132c = new File(profilingTracesDirPath);
        }
    }

    /* renamed from: k */
    public /* synthetic */ void m19932k(InterfaceC8259w0 interfaceC8259w0) {
        this.f21134e = m19929n(interfaceC8259w0, true, null);
    }

    /* renamed from: l */
    public static /* synthetic */ List m19931l() {
        return C7764f.m19767a().m19765c();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: m */
    private boolean m19930m(final InterfaceC8259w0 interfaceC8259w0) {
        File file = this.f21132c;
        this.f21131b = new File(file, UUID.randomUUID() + ".trace");
        this.f21149t.clear();
        this.f21146q.clear();
        this.f21147r.clear();
        this.f21148s.clear();
        this.f21143n = this.f21144o.m19737j(new C7709a());
        this.f21150u = interfaceC8259w0;
        try {
            this.f21133d = this.f21136g.getExecutorService().mo18039b(new Runnable() { // from class: io.sentry.android.core.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C7708b0.this.m19932k(interfaceC8259w0);
                }
            }, 30000L);
        } catch (RejectedExecutionException e) {
            this.f21136g.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
        }
        this.f21139j = SystemClock.elapsedRealtimeNanos();
        this.f21140k = Process.getElapsedCpuTime();
        this.f21145p = new C8042o2(interfaceC8259w0, Long.valueOf(this.f21139j), Long.valueOf(this.f21140k));
        try {
            Debug.startMethodTracingSampling(this.f21131b.getPath(), 3000000, this.f21130a);
            return true;
        } catch (Throwable th2) {
            mo18048b(interfaceC8259w0, null);
            this.f21136g.getLogger().mo18136b(EnumC8021m4.ERROR, "Unable to start a profile: ", th2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x01d5, code lost:
        if (r0.m18981C().equals(r32.mo17947e().toString()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01d7, code lost:
        r31.f21134e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01da, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01db, code lost:
        r31.f21136g.getLogger().mo18135c(io.sentry.EnumC8021m4.INFO, "A timed out profiling data exists, but the finishing transaction %s (%s) is not part of it", r32.getName(), r32.mo17936p().m19295k().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0200, code lost:
        return null;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized io.sentry.C8027n2 m19929n(io.sentry.InterfaceC8259w0 r32, boolean r33, java.util.List<io.sentry.C8002k2> r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C7708b0.m19929n(io.sentry.w0, boolean, java.util.List):io.sentry.n2");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: o */
    private void m19928o(List<C8002k2> list) {
        if (this.f21138i.m19703d() < 21) {
            return;
        }
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f21139j) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            for (C8002k2 c8002k2 : list) {
                C7926g m19031c = c8002k2.m19031c();
                C8156s1 m19030d = c8002k2.m19030d();
                if (m19031c != null) {
                    arrayDeque3.add(new C8057b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(m19031c.m19184b()) + elapsedRealtimeNanos), Double.valueOf(m19031c.m19185a())));
                }
                if (m19030d != null && m19030d.m18377b() > -1) {
                    arrayDeque.add(new C8057b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(m19030d.m18378a()) + elapsedRealtimeNanos), Long.valueOf(m19030d.m18377b())));
                }
                if (m19030d != null && m19030d.m18376c() > -1) {
                    arrayDeque2.add(new C8057b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(m19030d.m18378a()) + elapsedRealtimeNanos), Long.valueOf(m19030d.m18376c())));
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f21149t.put("cpu_usage", new C8055a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f21149t.put("memory_footprint", new C8055a("byte", arrayDeque));
            }
            if (!arrayDeque2.isEmpty()) {
                this.f21149t.put("memory_native_footprint", new C8055a("byte", arrayDeque2));
            }
        }
    }

    @Override // io.sentry.InterfaceC8265x0
    /* renamed from: a */
    public synchronized void mo18049a(InterfaceC8259w0 interfaceC8259w0) {
        if (this.f21138i.m19703d() < 21) {
            return;
        }
        m19933j();
        if (this.f21132c != null && this.f21130a != 0) {
            int i = this.f21142m + 1;
            this.f21142m = i;
            if (i == 1) {
                if (m19930m(interfaceC8259w0)) {
                    this.f21136g.getLogger().mo18135c(EnumC8021m4.DEBUG, "Transaction %s (%s) started and being profiled.", interfaceC8259w0.getName(), interfaceC8259w0.mo17936p().m19295k().toString());
                }
            } else {
                this.f21142m = i - 1;
                this.f21136g.getLogger().mo18135c(EnumC8021m4.WARNING, "A transaction is already being profiled. Transaction %s (%s) will be ignored.", interfaceC8259w0.getName(), interfaceC8259w0.mo17936p().m19295k().toString());
            }
        }
    }

    @Override // io.sentry.InterfaceC8265x0
    /* renamed from: b */
    public synchronized C8027n2 mo18048b(InterfaceC8259w0 interfaceC8259w0, List<C8002k2> list) {
        return m19929n(interfaceC8259w0, false, list);
    }

    @Override // io.sentry.InterfaceC8265x0
    public void close() {
        Future<?> future = this.f21133d;
        if (future != null) {
            future.cancel(true);
            this.f21133d = null;
        }
        InterfaceC8259w0 interfaceC8259w0 = this.f21150u;
        if (interfaceC8259w0 != null) {
            m19929n(interfaceC8259w0, true, null);
        }
    }

    public C7708b0(Context context, SentryAndroidOptions sentryAndroidOptions, C7798o0 c7798o0, C7777r c7777r, InterfaceC8025n0 interfaceC8025n0) {
        this.f21131b = null;
        this.f21132c = null;
        this.f21133d = null;
        this.f21134e = null;
        this.f21139j = 0L;
        this.f21140k = 0L;
        this.f21141l = false;
        this.f21142m = 0;
        this.f21146q = new ArrayDeque<>();
        this.f21147r = new ArrayDeque<>();
        this.f21148s = new ArrayDeque<>();
        this.f21149t = new HashMap();
        this.f21150u = null;
        this.f21135f = (Context) C8229o.m18169c(context, "The application context is required");
        this.f21136g = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21137h = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
        this.f21144o = (C7777r) C8229o.m18169c(c7777r, "SentryFrameMetricsCollector is required");
        this.f21138i = (C7798o0) C8229o.m18169c(c7798o0, "The BuildInfoProvider is required.");
    }
}