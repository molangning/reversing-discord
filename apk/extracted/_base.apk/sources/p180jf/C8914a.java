package p180jf;

import androidx.lifecycle.C1696m;
import bf.C2275a;
import bf.InterfaceC2276b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p085ef.C6216d;
import p085ef.EnumC6215c;
import ye.AbstractC14015g;

/* renamed from: jf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8914a extends AbstractC14015g {

    /* renamed from: d */
    static final C8916b f23316d;

    /* renamed from: e */
    static final ThreadFactoryC8924e f23317e;

    /* renamed from: f */
    static final int f23318f = m17051b(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C8917c f23319g;

    /* renamed from: b */
    final ThreadFactory f23320b;

    /* renamed from: c */
    final AtomicReference<C8916b> f23321c;

    /* renamed from: jf.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8915a extends AbstractC14015g.AbstractC14016a {

        /* renamed from: j */
        private final C6216d f23322j;

        /* renamed from: k */
        private final C2275a f23323k;

        /* renamed from: l */
        private final C6216d f23324l;

        /* renamed from: m */
        private final C8917c f23325m;

        /* renamed from: n */
        volatile boolean f23326n;

        C8915a(C8917c c8917c) {
            this.f23325m = c8917c;
            C6216d c6216d = new C6216d();
            this.f23322j = c6216d;
            C2275a c2275a = new C2275a();
            this.f23323k = c2275a;
            C6216d c6216d2 = new C6216d();
            this.f23324l = c6216d2;
            c6216d2.mo23232c(c6216d);
            c6216d2.mo23232c(c2275a);
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return this.f23326n;
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        /* renamed from: c */
        public InterfaceC2276b mo901c(Runnable runnable) {
            if (this.f23326n) {
                return EnumC6215c.INSTANCE;
            }
            return this.f23325m.m17039e(runnable, 0L, TimeUnit.MILLISECONDS, this.f23322j);
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        /* renamed from: d */
        public InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f23326n) {
                return EnumC6215c.INSTANCE;
            }
            return this.f23325m.m17039e(runnable, j, timeUnit, this.f23323k);
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            if (!this.f23326n) {
                this.f23326n = true;
                this.f23324l.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jf.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8916b {

        /* renamed from: a */
        final int f23327a;

        /* renamed from: b */
        final C8917c[] f23328b;

        /* renamed from: c */
        long f23329c;

        C8916b(int i, ThreadFactory threadFactory) {
            this.f23327a = i;
            this.f23328b = new C8917c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f23328b[i2] = new C8917c(threadFactory);
            }
        }

        /* renamed from: a */
        public C8917c m17049a() {
            int i = this.f23327a;
            if (i == 0) {
                return C8914a.f23319g;
            }
            C8917c[] c8917cArr = this.f23328b;
            long j = this.f23329c;
            this.f23329c = 1 + j;
            return c8917cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m17048b() {
            for (C8917c c8917c : this.f23328b) {
                c8917c.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jf.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8917c extends C8923d {
        C8917c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C8917c c8917c = new C8917c(new ThreadFactoryC8924e("RxComputationShutdown"));
        f23319g = c8917c;
        c8917c.dispose();
        ThreadFactoryC8924e threadFactoryC8924e = new ThreadFactoryC8924e("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f23317e = threadFactoryC8924e;
        C8916b c8916b = new C8916b(0, threadFactoryC8924e);
        f23316d = c8916b;
        c8916b.m17048b();
    }

    public C8914a() {
        this(f23317e);
    }

    /* renamed from: b */
    static int m17051b(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // ye.AbstractC14015g
    /* renamed from: a */
    public AbstractC14015g.AbstractC14016a mo903a() {
        return new C8915a(this.f23321c.get().m17049a());
    }

    /* renamed from: c */
    public void m17050c() {
        C8916b c8916b = new C8916b(f23318f, this.f23320b);
        if (!C1696m.m36034a(this.f23321c, f23316d, c8916b)) {
            c8916b.m17048b();
        }
    }

    public C8914a(ThreadFactory threadFactory) {
        this.f23320b = threadFactory;
        this.f23321c = new AtomicReference<>(f23316d);
        m17050c();
    }
}
