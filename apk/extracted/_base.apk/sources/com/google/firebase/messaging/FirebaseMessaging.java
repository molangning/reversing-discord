package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.C5103o0;
import com.google.firebase.messaging.C5114t0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lb.C10103a;
import lb.C10106d;
import p029b9.C2198p;
import p120gc.InterfaceC6727i;
import p133h9.ThreadFactoryC7041b;
import p134ha.InterfaceC7048f;
import p134ha.InterfaceC7050h;
import p347t5.InterfaceC12593g;
import p367ub.C12942a;
import p367ub.InterfaceC12943b;
import p367ub.InterfaceC12945d;
import p386vb.InterfaceC13239k;
import p403wb.InterfaceC13467a;
import p423xb.InterfaceC13776b;
import p444yb.InterfaceC13969d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    private static final long f14265n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    private static C5114t0 f14266o;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: p */
    static InterfaceC12593g f14267p;

    /* renamed from: q */
    static ScheduledExecutorService f14268q;

    /* renamed from: a */
    private final C10106d f14269a;

    /* renamed from: b */
    private final InterfaceC13467a f14270b;

    /* renamed from: c */
    private final InterfaceC13969d f14271c;

    /* renamed from: d */
    private final Context f14272d;

    /* renamed from: e */
    private final C5127z f14273e;

    /* renamed from: f */
    private final C5103o0 f14274f;

    /* renamed from: g */
    private final C5060a f14275g;

    /* renamed from: h */
    private final Executor f14276h;

    /* renamed from: i */
    private final Executor f14277i;

    /* renamed from: j */
    private final Task<C5126y0> f14278j;

    /* renamed from: k */
    private final C5080e0 f14279k;

    /* renamed from: l */
    private boolean f14280l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f14281m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5060a {

        /* renamed from: a */
        private final InterfaceC12945d f14282a;

        /* renamed from: b */
        private boolean f14283b;

        /* renamed from: c */
        private InterfaceC12943b<C10103a> f14284c;

        /* renamed from: d */
        private Boolean f14285d;

        C5060a(InterfaceC12945d interfaceC12945d) {
            this.f14282a = interfaceC12945d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m26354d(C12942a c12942a) {
            if (m26355c()) {
                FirebaseMessaging.this.m26386C();
            }
        }

        /* renamed from: e */
        private Boolean m26353e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m12296j = FirebaseMessaging.this.f14269a.m12296j();
            SharedPreferences sharedPreferences = m12296j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m12296j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m12296j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: b */
        synchronized void m26356b() {
            if (this.f14283b) {
                return;
            }
            Boolean m26353e = m26353e();
            this.f14285d = m26353e;
            if (m26353e == null) {
                InterfaceC12943b<C10103a> interfaceC12943b = new InterfaceC12943b() { // from class: com.google.firebase.messaging.w
                    @Override // p367ub.InterfaceC12943b
                    /* renamed from: a */
                    public final void mo3636a(C12942a c12942a) {
                        FirebaseMessaging.C5060a.this.m26354d(c12942a);
                    }
                };
                this.f14284c = interfaceC12943b;
                this.f14282a.mo3635a(C10103a.class, interfaceC12943b);
            }
            this.f14283b = true;
        }

        /* renamed from: c */
        synchronized boolean m26355c() {
            boolean m12287s;
            m26356b();
            Boolean bool = this.f14285d;
            if (bool != null) {
                m12287s = bool.booleanValue();
            } else {
                m12287s = FirebaseMessaging.this.f14269a.m12287s();
            }
            return m12287s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(C10106d c10106d, InterfaceC13467a interfaceC13467a, InterfaceC13776b<InterfaceC6727i> interfaceC13776b, InterfaceC13776b<InterfaceC13239k> interfaceC13776b2, InterfaceC13969d interfaceC13969d, InterfaceC12593g interfaceC12593g, InterfaceC12945d interfaceC12945d) {
        this(c10106d, interfaceC13467a, interfaceC13776b, interfaceC13776b2, interfaceC13969d, interfaceC12593g, interfaceC12945d, new C5080e0(c10106d.m12296j()));
    }

    /* renamed from: B */
    private synchronized void m26387B() {
        if (!this.f14280l) {
            m26385D(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m26386C() {
        InterfaceC13467a interfaceC13467a = this.f14270b;
        if (interfaceC13467a != null) {
            interfaceC13467a.m2424a();
        } else if (m26384E(m26368p())) {
            m26387B();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C10106d c10106d) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c10106d.m12297i(FirebaseMessaging.class);
            C2198p.m33984k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: l */
    public static synchronized FirebaseMessaging m26372l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C10106d.m12295k());
        }
        return firebaseMessaging;
    }

    /* renamed from: m */
    private static synchronized C5114t0 m26371m(Context context) {
        C5114t0 c5114t0;
        synchronized (FirebaseMessaging.class) {
            if (f14266o == null) {
                f14266o = new C5114t0(context);
            }
            c5114t0 = f14266o;
        }
        return c5114t0;
    }

    /* renamed from: n */
    private String m26370n() {
        if ("[DEFAULT]".equals(this.f14269a.m12294l())) {
            return "";
        }
        return this.f14269a.m12292n();
    }

    /* renamed from: q */
    public static InterfaceC12593g m26367q() {
        return f14267p;
    }

    /* renamed from: r */
    private void m26366r(String str) {
        if ("[DEFAULT]".equals(this.f14269a.m12294l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f14269a.m12294l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C5096l(this.f14272d).m26215k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Task m26363u(final String str, final C5114t0.C5115a c5115a) {
        return this.f14273e.m26134e().mo27968p(new ExecutorC5082f(), new InterfaceC7050h() { // from class: com.google.firebase.messaging.v
            @Override // p134ha.InterfaceC7050h
            /* renamed from: a */
            public final Task mo1607a(Object obj) {
                Task m26362v;
                m26362v = FirebaseMessaging.this.m26362v(str, c5115a, (String) obj);
                return m26362v;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Task m26362v(String str, C5114t0.C5115a c5115a, String str2) {
        m26371m(this.f14272d).m26174f(m26370n(), str, str2, this.f14279k.m26280a());
        if (c5115a == null || !str2.equals(c5115a.f14390a)) {
            m26366r(str2);
        }
        return C4713b.m28004e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m26361w(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.m28011c(m26375i());
        } catch (Exception e) {
            taskCompletionSource.m28012b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m26360x() {
        if (m26365s()) {
            m26386C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m26359y(C5126y0 c5126y0) {
        if (m26365s()) {
            c5126y0.m26141o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m26358z() {
        C5095k0.m26229c(this.f14272d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public synchronized void m26388A(boolean z) {
        this.f14280l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized void m26385D(long j) {
        m26374j(new RunnableC5117u0(this, Math.min(Math.max(30L, 2 * j), f14265n)), j);
        this.f14280l = true;
    }

    /* renamed from: E */
    boolean m26384E(C5114t0.C5115a c5115a) {
        return c5115a == null || c5115a.m26172b(this.f14279k.m26280a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m26375i() {
        InterfaceC13467a interfaceC13467a = this.f14270b;
        if (interfaceC13467a != null) {
            try {
                return (String) C4713b.m28008a(interfaceC13467a.m2422c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final C5114t0.C5115a m26368p = m26368p();
        if (!m26384E(m26368p)) {
            return m26368p.f14390a;
        }
        final String m26278c = C5080e0.m26278c(this.f14269a);
        try {
            return (String) C4713b.m28008a(this.f14274f.m26198b(m26278c, new C5103o0.InterfaceC5104a() { // from class: com.google.firebase.messaging.t
                @Override // com.google.firebase.messaging.C5103o0.InterfaceC5104a
                public final Task start() {
                    Task m26363u;
                    m26363u = FirebaseMessaging.this.m26363u(m26278c, m26368p);
                    return m26363u;
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m26374j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f14268q == null) {
                f14268q = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7041b("TAG"));
            }
            f14268q.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Context m26373k() {
        return this.f14272d;
    }

    /* renamed from: o */
    public Task<String> m26369o() {
        InterfaceC13467a interfaceC13467a = this.f14270b;
        if (interfaceC13467a != null) {
            return interfaceC13467a.m2422c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14276h.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m26361w(taskCompletionSource);
            }
        });
        return taskCompletionSource.m28013a();
    }

    /* renamed from: p */
    C5114t0.C5115a m26368p() {
        return m26371m(this.f14272d).m26176d(m26370n(), C5080e0.m26278c(this.f14269a));
    }

    /* renamed from: s */
    public boolean m26365s() {
        return this.f14275g.m26355c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m26364t() {
        return this.f14279k.m26274g();
    }

    FirebaseMessaging(C10106d c10106d, InterfaceC13467a interfaceC13467a, InterfaceC13776b<InterfaceC6727i> interfaceC13776b, InterfaceC13776b<InterfaceC13239k> interfaceC13776b2, InterfaceC13969d interfaceC13969d, InterfaceC12593g interfaceC12593g, InterfaceC12945d interfaceC12945d, C5080e0 c5080e0) {
        this(c10106d, interfaceC13467a, interfaceC13969d, interfaceC12593g, interfaceC12945d, c5080e0, new C5127z(c10106d, c5080e0, interfaceC13776b, interfaceC13776b2, interfaceC13969d), C5098m.m26207d(), C5098m.m26210a());
    }

    FirebaseMessaging(C10106d c10106d, InterfaceC13467a interfaceC13467a, InterfaceC13969d interfaceC13969d, InterfaceC12593g interfaceC12593g, InterfaceC12945d interfaceC12945d, C5080e0 c5080e0, C5127z c5127z, Executor executor, Executor executor2) {
        this.f14280l = false;
        f14267p = interfaceC12593g;
        this.f14269a = c10106d;
        this.f14270b = interfaceC13467a;
        this.f14271c = interfaceC13969d;
        this.f14275g = new C5060a(interfaceC12945d);
        Context m12296j = c10106d.m12296j();
        this.f14272d = m12296j;
        C5102o c5102o = new C5102o();
        this.f14281m = c5102o;
        this.f14279k = c5080e0;
        this.f14277i = executor;
        this.f14273e = c5127z;
        this.f14274f = new C5103o0(executor);
        this.f14276h = executor2;
        Context m12296j2 = c10106d.m12296j();
        if (m12296j2 instanceof Application) {
            ((Application) m12296j2).registerActivityLifecycleCallbacks(c5102o);
        } else {
            Log.w("FirebaseMessaging", "Context " + m12296j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC13467a != null) {
            interfaceC13467a.m2423b(new InterfaceC13467a.InterfaceC13468a() { // from class: com.google.firebase.messaging.p
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m26360x();
            }
        });
        Task<C5126y0> m26151e = C5126y0.m26151e(this, c5080e0, c5127z, m12296j, C5098m.m26206e());
        this.f14278j = m26151e;
        m26151e.mo27977g(executor2, new InterfaceC7048f() { // from class: com.google.firebase.messaging.r
            @Override // p134ha.InterfaceC7048f
            /* renamed from: b */
            public final void mo21486b(Object obj) {
                FirebaseMessaging.this.m26359y((C5126y0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m26358z();
            }
        });
    }
}
