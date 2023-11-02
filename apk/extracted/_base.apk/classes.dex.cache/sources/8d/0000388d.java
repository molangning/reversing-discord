package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.android.core.C7798o0;
import io.sentry.util.C8229o;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.internal.util.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7777r implements Application.ActivityLifecycleCallbacks {

    /* renamed from: j */
    private final C7798o0 f21285j;

    /* renamed from: k */
    private final Set<Window> f21286k;

    /* renamed from: l */
    private final C8132r4 f21287l;

    /* renamed from: m */
    private Handler f21288m;

    /* renamed from: n */
    private WeakReference<Window> f21289n;

    /* renamed from: o */
    private final Map<String, InterfaceC7779b> f21290o;

    /* renamed from: p */
    private boolean f21291p;

    /* renamed from: q */
    private final InterfaceC7780c f21292q;

    /* renamed from: r */
    private Window.OnFrameMetricsAvailableListener f21293r;

    /* renamed from: s */
    private Choreographer f21294s;

    /* renamed from: t */
    private Field f21295t;

    /* renamed from: u */
    private long f21296u;

    /* renamed from: v */
    private long f21297v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.internal.util.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C7778a implements InterfaceC7780c {
        C7778a() {
        }

        @Override // io.sentry.android.core.internal.util.C7777r.InterfaceC7780c
        /* renamed from: a */
        public /* synthetic */ void mo19732a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            C7781s.m19730a(this, window, onFrameMetricsAvailableListener, handler);
        }

        @Override // io.sentry.android.core.internal.util.C7777r.InterfaceC7780c
        /* renamed from: b */
        public /* synthetic */ void mo19731b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            C7781s.m19729b(this, window, onFrameMetricsAvailableListener);
        }
    }

    /* renamed from: io.sentry.android.core.internal.util.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7779b {
        /* renamed from: a */
        void mo19733a(long j, long j2, float f);
    }

    /* renamed from: io.sentry.android.core.internal.util.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7780c {
        /* renamed from: a */
        void mo19732a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler);

        /* renamed from: b */
        void mo19731b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener);
    }

    @SuppressLint({"NewApi"})
    public C7777r(Context context, C8132r4 c8132r4, C7798o0 c7798o0) {
        this(context, c8132r4, c7798o0, new C7778a());
    }

    /* renamed from: d */
    private long m19743d(FrameMetrics frameMetrics) {
        long metric;
        long metric2;
        long metric3;
        long metric4;
        long metric5;
        long metric6;
        metric = frameMetrics.getMetric(0);
        metric2 = frameMetrics.getMetric(1);
        long j = metric + metric2;
        metric3 = frameMetrics.getMetric(2);
        long j2 = j + metric3;
        metric4 = frameMetrics.getMetric(3);
        long j3 = j2 + metric4;
        metric5 = frameMetrics.getMetric(4);
        long j4 = j3 + metric5;
        metric6 = frameMetrics.getMetric(5);
        return j4 + metric6;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    private long m19742e(FrameMetrics frameMetrics) {
        Field field;
        long metric;
        if (this.f21285j.m19703d() >= 26) {
            metric = frameMetrics.getMetric(10);
            return metric;
        }
        Choreographer choreographer = this.f21294s;
        if (choreographer != null && (field = this.f21295t) != null) {
            try {
                Long l = (Long) field.get(choreographer);
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            } catch (IllegalAccessException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: f */
    public static /* synthetic */ void m19741f(C8132r4 c8132r4, Thread thread, Throwable th2) {
        c8132r4.getLogger().mo18136b(EnumC8021m4.ERROR, "Error during frames measurements.", th2);
    }

    /* renamed from: g */
    public /* synthetic */ void m19740g() {
        this.f21294s = Choreographer.getInstance();
    }

    /* renamed from: h */
    public /* synthetic */ void m19739h(C7798o0 c7798o0, Window window, FrameMetrics frameMetrics, int i) {
        float refreshRate;
        Display display;
        long nanoTime = System.nanoTime();
        if (c7798o0.m19703d() >= 30) {
            display = window.getContext().getDisplay();
            refreshRate = display.getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        long m19743d = m19743d(frameMetrics);
        long m19742e = m19742e(frameMetrics);
        if (m19742e < 0) {
            m19742e = nanoTime - m19743d;
        }
        long max = Math.max(m19742e, this.f21297v);
        if (max == this.f21296u) {
            return;
        }
        this.f21296u = max;
        this.f21297v = max + m19743d;
        for (InterfaceC7779b interfaceC7779b : this.f21290o.values()) {
            interfaceC7779b.mo19733a(this.f21297v, m19743d, refreshRate);
        }
    }

    /* renamed from: i */
    private void m19738i(Window window) {
        WeakReference<Window> weakReference = this.f21289n;
        if (weakReference != null && weakReference.get() == window) {
            return;
        }
        this.f21289n = new WeakReference<>(window);
        m19734m();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: l */
    private void m19735l(Window window) {
        if (this.f21286k.contains(window)) {
            if (this.f21285j.m19703d() >= 24) {
                try {
                    this.f21292q.mo19731b(window, this.f21293r);
                } catch (Exception e) {
                    this.f21287l.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to remove frameMetricsAvailableListener", e);
                }
            }
            this.f21286k.remove(window);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: m */
    private void m19734m() {
        Window window;
        WeakReference<Window> weakReference = this.f21289n;
        if (weakReference != null) {
            window = weakReference.get();
        } else {
            window = null;
        }
        if (window != null && this.f21291p && !this.f21286k.contains(window) && !this.f21290o.isEmpty() && this.f21285j.m19703d() >= 24 && this.f21288m != null) {
            this.f21286k.add(window);
            this.f21292q.mo19732a(window, this.f21293r, this.f21288m);
        }
    }

    /* renamed from: j */
    public String m19737j(InterfaceC7779b interfaceC7779b) {
        if (!this.f21291p) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        this.f21290o.put(uuid, interfaceC7779b);
        m19734m();
        return uuid;
    }

    /* renamed from: k */
    public void m19736k(String str) {
        Window window;
        if (!this.f21291p) {
            return;
        }
        if (str != null) {
            this.f21290o.remove(str);
        }
        WeakReference<Window> weakReference = this.f21289n;
        if (weakReference != null) {
            window = weakReference.get();
        } else {
            window = null;
        }
        if (window != null && this.f21290o.isEmpty()) {
            m19735l(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m19738i(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m19735l(activity.getWindow());
        WeakReference<Window> weakReference = this.f21289n;
        if (weakReference != null && weakReference.get() == activity.getWindow()) {
            this.f21289n = null;
        }
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public C7777r(Context context, final C8132r4 c8132r4, final C7798o0 c7798o0, InterfaceC7780c interfaceC7780c) {
        this.f21286k = new CopyOnWriteArraySet();
        this.f21290o = new ConcurrentHashMap();
        this.f21291p = false;
        this.f21296u = 0L;
        this.f21297v = 0L;
        C8229o.m18169c(context, "The context is required");
        this.f21287l = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required");
        this.f21285j = (C7798o0) C8229o.m18169c(c7798o0, "BuildInfoProvider is required");
        this.f21292q = (InterfaceC7780c) C8229o.m18169c(interfaceC7780c, "WindowFrameMetricsManager is required");
        if ((context instanceof Application) && c7798o0.m19703d() >= 24) {
            this.f21291p = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.o
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    C7777r.m19741f(C8132r4.this, thread, th2);
                }
            });
            handlerThread.start();
            this.f21288m = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.p
                @Override // java.lang.Runnable
                public final void run() {
                    C7777r.this.m19740g();
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f21295t = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                c8132r4.getLogger().mo18136b(EnumC8021m4.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.f21293r = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.q
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    C7777r.this.m19739h(c7798o0, window, frameMetrics, i);
                }
            };
        }
    }
}