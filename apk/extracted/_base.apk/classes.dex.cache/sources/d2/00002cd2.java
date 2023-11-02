package com.google.firebase.installations;

import ac.AbstractC0145d;
import ac.C0142b;
import ac.C0143c;
import android.text.TextUtils;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.C5048c;
import com.google.firebase.installations.C5051d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lb.C10106d;
import p029b9.C2198p;
import p030bc.AbstractC2263d;
import p030bc.AbstractC2267f;
import p030bc.C2262c;
import p386vb.InterfaceC13238j;
import p423xb.InterfaceC13776b;
import p444yb.C13971f;
import p444yb.InterfaceC13969d;
import p463zb.InterfaceC14144a;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5048c implements InterfaceC13969d {

    /* renamed from: m */
    private static final Object f14235m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f14236n = new ThreadFactoryC5049a();

    /* renamed from: a */
    private final C10106d f14237a;

    /* renamed from: b */
    private final C2262c f14238b;

    /* renamed from: c */
    private final C0143c f14239c;

    /* renamed from: d */
    private final C5058i f14240d;

    /* renamed from: e */
    private final C0142b f14241e;

    /* renamed from: f */
    private final C13971f f14242f;

    /* renamed from: g */
    private final Object f14243g;

    /* renamed from: h */
    private final ExecutorService f14244h;

    /* renamed from: i */
    private final ExecutorService f14245i;

    /* renamed from: j */
    private String f14246j;

    /* renamed from: k */
    private Set<InterfaceC14144a> f14247k;

    /* renamed from: l */
    private final List<InterfaceC5057h> f14248l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class ThreadFactoryC5049a implements ThreadFactory {

        /* renamed from: j */
        private final AtomicInteger f14249j = new AtomicInteger(1);

        ThreadFactoryC5049a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f14249j.getAndIncrement())));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5050b {

        /* renamed from: a */
        static final /* synthetic */ int[] f14250a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14251b;

        static {
            int[] iArr = new int[AbstractC2267f.EnumC2269b.values().length];
            f14251b = iArr;
            try {
                iArr[AbstractC2267f.EnumC2269b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14251b[AbstractC2267f.EnumC2269b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14251b[AbstractC2267f.EnumC2269b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2263d.EnumC2265b.values().length];
            f14250a = iArr2;
            try {
                iArr2[AbstractC2263d.EnumC2265b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14250a[AbstractC2263d.EnumC2265b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C5048c(C10106d c10106d, InterfaceC13776b<InterfaceC13238j> interfaceC13776b) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f14236n), c10106d, new C2262c(c10106d.m12296j(), interfaceC13776b), new C0143c(c10106d), C5058i.m26396c(), new C0142b(c10106d), new C13971f());
    }

    /* renamed from: A */
    private synchronized void m26435A(String str) {
        this.f14246j = str;
    }

    /* renamed from: B */
    private synchronized void m26434B(AbstractC0145d abstractC0145d, AbstractC0145d abstractC0145d2) {
        if (this.f14247k.size() != 0 && !abstractC0145d.mo41095d().equals(abstractC0145d2.mo41095d())) {
            for (InterfaceC14144a interfaceC14144a : this.f14247k) {
                interfaceC14144a.m588a(abstractC0145d2.mo41095d());
            }
        }
    }

    /* renamed from: e */
    private Task<AbstractC5055g> m26430e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m26428g(new C5053e(this.f14240d, taskCompletionSource));
        return taskCompletionSource.m28013a();
    }

    /* renamed from: f */
    private Task<String> m26429f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m26428g(new C5054f(taskCompletionSource));
        return taskCompletionSource.m28013a();
    }

    /* renamed from: g */
    private void m26428g(InterfaceC5057h interfaceC5057h) {
        synchronized (this.f14243g) {
            this.f14248l.add(interfaceC5057h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26416s(boolean r3) {
        /*
            r2 = this;
            ac.d r0 = r2.m26420o()
            boolean r1 = r0.m41090i()     // Catch: com.google.firebase.installations.C5051d -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.m41087l()     // Catch: com.google.firebase.installations.C5051d -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f14240d     // Catch: com.google.firebase.installations.C5051d -> L5f
            boolean r3 = r3.m26393f(r0)     // Catch: com.google.firebase.installations.C5051d -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            ac.d r3 = r2.m26425j(r0)     // Catch: com.google.firebase.installations.C5051d -> L5f
            goto L26
        L22:
            ac.d r3 = r2.m26411x(r0)     // Catch: com.google.firebase.installations.C5051d -> L5f
        L26:
            r2.m26417r(r3)
            r2.m26434B(r0, r3)
            boolean r0 = r3.m41088k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo41095d()
            r2.m26435A(r0)
        L39:
            boolean r0 = r3.m41090i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.C5051d.EnumC5052a.BAD_CONFIG
            r3.<init>(r0)
            r2.m26410y(r3)
            goto L5e
        L4a:
            boolean r0 = r3.m41089j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m26410y(r3)
            goto L5e
        L5b:
            r2.m26409z(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.m26410y(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C5048c.m26416s(boolean):void");
    }

    /* renamed from: i */
    public final void m26414u(final boolean z) {
        AbstractC0145d m26419p = m26419p();
        if (z) {
            m26419p = m26419p.m41083p();
        }
        m26409z(m26419p);
        this.f14245i.execute(new Runnable() { // from class: yb.c
            @Override // java.lang.Runnable
            public final void run() {
                C5048c.this.m26416s(z);
            }
        });
    }

    /* renamed from: j */
    private AbstractC0145d m26425j(AbstractC0145d abstractC0145d) {
        AbstractC2267f m33747e = this.f14238b.m33747e(m26424k(), abstractC0145d.mo41095d(), m26418q(), abstractC0145d.mo41093f());
        int i = C5050b.f14251b[m33747e.mo33713b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m26435A(null);
                    return abstractC0145d.m41081r();
                }
                throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
            }
            return abstractC0145d.m41082q("BAD CONFIG");
        }
        return abstractC0145d.m41084o(m33747e.mo33712c(), m33747e.mo33711d(), this.f14240d.m26397b());
    }

    /* renamed from: m */
    private synchronized String m26422m() {
        return this.f14246j;
    }

    /* renamed from: n */
    public static C5048c m26421n(C10106d c10106d) {
        boolean z;
        if (c10106d != null) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33993b(z, "Null is not a valid value of FirebaseApp.");
        return (C5048c) c10106d.m12297i(InterfaceC13969d.class);
    }

    /* renamed from: o */
    private AbstractC0145d m26420o() {
        AbstractC0145d m41099d;
        synchronized (f14235m) {
            C5047b m26437a = C5047b.m26437a(this.f14237a.m12296j(), "generatefid.lock");
            m41099d = this.f14239c.m41099d();
            if (m26437a != null) {
                m26437a.m26436b();
            }
        }
        return m41099d;
    }

    /* renamed from: p */
    private AbstractC0145d m26419p() {
        AbstractC0145d m41099d;
        synchronized (f14235m) {
            C5047b m26437a = C5047b.m26437a(this.f14237a.m12296j(), "generatefid.lock");
            m41099d = this.f14239c.m41099d();
            if (m41099d.m41089j()) {
                m41099d = this.f14239c.m41101b(m41099d.m41079t(m26412w(m41099d)));
            }
            if (m26437a != null) {
                m26437a.m26436b();
            }
        }
        return m41099d;
    }

    /* renamed from: r */
    private void m26417r(AbstractC0145d abstractC0145d) {
        synchronized (f14235m) {
            C5047b m26437a = C5047b.m26437a(this.f14237a.m12296j(), "generatefid.lock");
            this.f14239c.m41101b(abstractC0145d);
            if (m26437a != null) {
                m26437a.m26436b();
            }
        }
    }

    /* renamed from: t */
    public /* synthetic */ void m26415t() {
        m26414u(false);
    }

    /* renamed from: v */
    private void m26413v() {
        C2198p.m33988g(m26423l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2198p.m33988g(m26418q(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2198p.m33988g(m26424k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2198p.m33993b(C5058i.m26391h(m26423l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2198p.m33993b(C5058i.m26392g(m26424k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: w */
    private String m26412w(AbstractC0145d abstractC0145d) {
        if ((!this.f14237a.m12294l().equals("CHIME_ANDROID_SDK") && !this.f14237a.m12286t()) || !abstractC0145d.m41086m()) {
            return this.f14242f.m1054a();
        }
        String m41106f = this.f14241e.m41106f();
        if (TextUtils.isEmpty(m41106f)) {
            return this.f14242f.m1054a();
        }
        return m41106f;
    }

    /* renamed from: x */
    private AbstractC0145d m26411x(AbstractC0145d abstractC0145d) {
        String str;
        if (abstractC0145d.mo41095d() != null && abstractC0145d.mo41095d().length() == 11) {
            str = this.f14241e.m41103i();
        } else {
            str = null;
        }
        AbstractC2263d m33748d = this.f14238b.m33748d(m26424k(), abstractC0145d.mo41095d(), m26418q(), m26423l(), str);
        int i = C5050b.f14250a[m33748d.mo33728e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return abstractC0145d.m41082q("BAD CONFIG");
            }
            throw new C5051d("Firebase Installations Service is unavailable. Please try again later.", C5051d.EnumC5052a.UNAVAILABLE);
        }
        return abstractC0145d.m41080s(m33748d.mo33730c(), m33748d.mo33729d(), this.f14240d.m26397b(), m33748d.mo33731b().mo33712c(), m33748d.mo33731b().mo33711d());
    }

    /* renamed from: y */
    private void m26410y(Exception exc) {
        synchronized (this.f14243g) {
            Iterator<InterfaceC5057h> it = this.f14248l.iterator();
            while (it.hasNext()) {
                if (it.next().mo26400a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    private void m26409z(AbstractC0145d abstractC0145d) {
        synchronized (this.f14243g) {
            Iterator<InterfaceC5057h> it = this.f14248l.iterator();
            while (it.hasNext()) {
                if (it.next().mo26399b(abstractC0145d)) {
                    it.remove();
                }
            }
        }
    }

    @Override // p444yb.InterfaceC13969d
    /* renamed from: a */
    public Task<AbstractC5055g> mo1056a(final boolean z) {
        m26413v();
        Task<AbstractC5055g> m26430e = m26430e();
        this.f14244h.execute(new Runnable() { // from class: yb.a
            @Override // java.lang.Runnable
            public final void run() {
                C5048c.this.m26414u(z);
            }
        });
        return m26430e;
    }

    @Override // p444yb.InterfaceC13969d
    public Task<String> getId() {
        m26413v();
        String m26422m = m26422m();
        if (m26422m != null) {
            return C4713b.m28004e(m26422m);
        }
        Task<String> m26429f = m26429f();
        this.f14244h.execute(new Runnable() { // from class: yb.b
            @Override // java.lang.Runnable
            public final void run() {
                C5048c.this.m26415t();
            }
        });
        return m26429f;
    }

    /* renamed from: k */
    String m26424k() {
        return this.f14237a.m12293m().m12271b();
    }

    /* renamed from: l */
    String m26423l() {
        return this.f14237a.m12293m().m12270c();
    }

    /* renamed from: q */
    String m26418q() {
        return this.f14237a.m12293m().m12268e();
    }

    C5048c(ExecutorService executorService, C10106d c10106d, C2262c c2262c, C0143c c0143c, C5058i c5058i, C0142b c0142b, C13971f c13971f) {
        this.f14243g = new Object();
        this.f14247k = new HashSet();
        this.f14248l = new ArrayList();
        this.f14237a = c10106d;
        this.f14238b = c2262c;
        this.f14239c = c0143c;
        this.f14240d = c5058i;
        this.f14241e = c0142b;
        this.f14242f = c13971f;
        this.f14244h = executorService;
        this.f14245i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f14236n);
    }
}