package p278p4;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a5.C0025b;
import p276p2.InterfaceC11373a;
import p292q2.InterfaceC11695i;
import p312r2.InterfaceC12045h;
import p380v4.C13065e;
import p394w2.C13379j;
import p396w4.C13388a;
import p414x2.C13677a;
import p433y0.C13857f;
import p455z2.C14083k;
import p455z2.InterfaceC14078g;
import p455z2.InterfaceC14080h;

/* renamed from: p4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11386e {

    /* renamed from: h */
    private static final Class<?> f29664h = C11386e.class;

    /* renamed from: a */
    private final InterfaceC12045h f29665a;

    /* renamed from: b */
    private final InterfaceC14080h f29666b;

    /* renamed from: c */
    private final C14083k f29667c;

    /* renamed from: d */
    private final Executor f29668d;

    /* renamed from: e */
    private final Executor f29669e;

    /* renamed from: f */
    private final C11418w f29670f = C11418w.m8086d();

    /* renamed from: g */
    private final InterfaceC11406o f29671g;

    /* renamed from: p4.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class CallableC11387a implements Callable<C13065e> {

        /* renamed from: j */
        final /* synthetic */ Object f29672j;

        /* renamed from: k */
        final /* synthetic */ AtomicBoolean f29673k;

        /* renamed from: l */
        final /* synthetic */ CacheKey f29674l;

        CallableC11387a(Object obj, AtomicBoolean atomicBoolean, CacheKey cacheKey) {
            C11386e.this = r1;
            this.f29672j = obj;
            this.f29673k = atomicBoolean;
            this.f29674l = cacheKey;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C13065e call() {
            Object m2659e = C13388a.m2659e(this.f29672j, null);
            try {
                if (!this.f29673k.get()) {
                    C13065e m8087c = C11386e.this.f29670f.m8087c(this.f29674l);
                    if (m8087c != null) {
                        C13677a.m1840x(C11386e.f29664h, "Found image for %s in staging area", this.f29674l.mo714a());
                        C11386e.this.f29671g.mo8098g(this.f29674l);
                    } else {
                        C13677a.m1840x(C11386e.f29664h, "Did not find image for %s in staging area", this.f29674l.mo714a());
                        C11386e.this.f29671g.mo8093l(this.f29674l);
                        try {
                            InterfaceC14078g m8172q = C11386e.this.m8172q(this.f29674l);
                            if (m8172q == null) {
                                return null;
                            }
                            CloseableReference m31726R = CloseableReference.m31726R(m8172q);
                            try {
                                m8087c = new C13065e(m31726R);
                            } finally {
                                CloseableReference.m31715v(m31726R);
                            }
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    if (!Thread.interrupted()) {
                        return m8087c;
                    }
                    C13677a.m1841w(C11386e.f29664h, "Host thread was interrupted, decreasing reference count");
                    m8087c.close();
                    throw new InterruptedException();
                }
                throw new CancellationException();
            } catch (Throwable th2) {
                try {
                    C13388a.m2661c(this.f29672j, th2);
                    throw th2;
                } finally {
                    C13388a.m2658f(m2659e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC11388b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Object f29676j;

        /* renamed from: k */
        final /* synthetic */ CacheKey f29677k;

        /* renamed from: l */
        final /* synthetic */ C13065e f29678l;

        RunnableC11388b(Object obj, CacheKey cacheKey, C13065e c13065e) {
            C11386e.this = r1;
            this.f29676j = obj;
            this.f29677k = cacheKey;
            this.f29678l = c13065e;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object m2659e = C13388a.m2659e(this.f29676j, null);
            try {
                C11386e.this.m8170s(this.f29677k, this.f29678l);
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class CallableC11389c implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ Object f29680j;

        /* renamed from: k */
        final /* synthetic */ CacheKey f29681k;

        CallableC11389c(Object obj, CacheKey cacheKey) {
            C11386e.this = r1;
            this.f29680j = obj;
            this.f29681k = cacheKey;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Object m2659e = C13388a.m2659e(this.f29680j, null);
            try {
                C11386e.this.f29670f.m8083g(this.f29681k);
                C11386e.this.f29665a.mo6492f(this.f29681k);
                return null;
            } finally {
            }
        }
    }

    /* renamed from: p4.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class CallableC11390d implements Callable<Void> {

        /* renamed from: j */
        final /* synthetic */ Object f29683j;

        CallableC11390d(Object obj) {
            C11386e.this = r1;
            this.f29683j = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Object m2659e = C13388a.m2659e(this.f29683j, null);
            try {
                C11386e.this.f29670f.m8089a();
                C11386e.this.f29665a.mo6497a();
                return null;
            } finally {
            }
        }
    }

    /* renamed from: p4.e$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11391e implements InterfaceC11695i {

        /* renamed from: a */
        final /* synthetic */ C13065e f29685a;

        C11391e(C13065e c13065e) {
            C11386e.this = r1;
            this.f29685a = c13065e;
        }

        @Override // p292q2.InterfaceC11695i
        /* renamed from: a */
        public void mo7159a(OutputStream outputStream) {
            InputStream m3354D = this.f29685a.m3354D();
            C13379j.m2677g(m3354D);
            C11386e.this.f29667c.m715a(m3354D, outputStream);
        }
    }

    public C11386e(InterfaceC12045h interfaceC12045h, InterfaceC14080h interfaceC14080h, C14083k c14083k, Executor executor, Executor executor2, InterfaceC11406o interfaceC11406o) {
        this.f29665a = interfaceC12045h;
        this.f29666b = interfaceC14080h;
        this.f29667c = c14083k;
        this.f29668d = executor;
        this.f29669e = executor2;
        this.f29671g = interfaceC11406o;
    }

    /* renamed from: i */
    private boolean m8180i(CacheKey cacheKey) {
        C13065e m8087c = this.f29670f.m8087c(cacheKey);
        if (m8087c != null) {
            m8087c.close();
            C13677a.m1840x(f29664h, "Found image for %s in staging area", cacheKey.mo714a());
            this.f29671g.mo8098g(cacheKey);
            return true;
        }
        C13677a.m1840x(f29664h, "Did not find image for %s in staging area", cacheKey.mo714a());
        this.f29671g.mo8093l(cacheKey);
        try {
            return this.f29665a.mo6491g(cacheKey);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    private C13857f<C13065e> m8176m(CacheKey cacheKey, C13065e c13065e) {
        C13677a.m1840x(f29664h, "Found image for %s in staging area", cacheKey.mo714a());
        this.f29671g.mo8098g(cacheKey);
        return C13857f.m1386h(c13065e);
    }

    /* renamed from: o */
    private C13857f<C13065e> m8174o(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            return C13857f.m1392b(new CallableC11387a(C13388a.m2660d("BufferedDiskCache_getAsync"), atomicBoolean, cacheKey), this.f29668d);
        } catch (Exception e) {
            C13677a.m1871G(f29664h, e, "Failed to schedule disk-cache read for %s", cacheKey.mo714a());
            return C13857f.m1387g(e);
        }
    }

    /* renamed from: q */
    public InterfaceC14078g m8172q(CacheKey cacheKey) {
        try {
            Class<?> cls = f29664h;
            C13677a.m1840x(cls, "Disk cache read for %s", cacheKey.mo714a());
            InterfaceC11373a mo6495c = this.f29665a.mo6495c(cacheKey);
            if (mo6495c == null) {
                C13677a.m1840x(cls, "Disk cache miss for %s", cacheKey.mo714a());
                this.f29671g.mo8102c(cacheKey);
                return null;
            }
            C13677a.m1840x(cls, "Found entry in disk cache for %s", cacheKey.mo714a());
            this.f29671g.mo8095j(cacheKey);
            InputStream mo8210a = mo6495c.mo8210a();
            InterfaceC14078g mo720b = this.f29666b.mo720b(mo8210a, (int) mo6495c.size());
            mo8210a.close();
            C13677a.m1840x(cls, "Successful read from disk cache for %s", cacheKey.mo714a());
            return mo720b;
        } catch (IOException e) {
            C13677a.m1871G(f29664h, e, "Exception reading from cache for %s", cacheKey.mo714a());
            this.f29671g.mo8091n(cacheKey);
            throw e;
        }
    }

    /* renamed from: s */
    public void m8170s(CacheKey cacheKey, C13065e c13065e) {
        Class<?> cls = f29664h;
        C13677a.m1840x(cls, "About to write to disk-cache for key %s", cacheKey.mo714a());
        try {
            this.f29665a.mo6494d(cacheKey, new C11391e(c13065e));
            this.f29671g.mo8100e(cacheKey);
            C13677a.m1840x(cls, "Successful disk-cache write for key %s", cacheKey.mo714a());
        } catch (IOException e) {
            C13677a.m1871G(f29664h, e, "Failed to write to disk-cache for key %s", cacheKey.mo714a());
        }
    }

    /* renamed from: h */
    public void m8181h(CacheKey cacheKey) {
        C13379j.m2677g(cacheKey);
        this.f29665a.mo6496b(cacheKey);
    }

    /* renamed from: j */
    public C13857f<Void> m8179j() {
        this.f29670f.m8089a();
        try {
            return C13857f.m1392b(new CallableC11390d(C13388a.m2660d("BufferedDiskCache_clearAll")), this.f29669e);
        } catch (Exception e) {
            C13677a.m1871G(f29664h, e, "Failed to schedule disk-cache clear", new Object[0]);
            return C13857f.m1387g(e);
        }
    }

    /* renamed from: k */
    public boolean m8178k(CacheKey cacheKey) {
        return this.f29670f.m8088b(cacheKey) || this.f29665a.mo6493e(cacheKey);
    }

    /* renamed from: l */
    public boolean m8177l(CacheKey cacheKey) {
        if (m8178k(cacheKey)) {
            return true;
        }
        return m8180i(cacheKey);
    }

    /* renamed from: n */
    public C13857f<C13065e> m8175n(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("BufferedDiskCache#get");
            }
            C13065e m8087c = this.f29670f.m8087c(cacheKey);
            if (m8087c != null) {
                return m8176m(cacheKey, m8087c);
            }
            C13857f<C13065e> m8174o = m8174o(cacheKey, atomicBoolean);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return m8174o;
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: p */
    public void m8173p(CacheKey cacheKey, C13065e c13065e) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("BufferedDiskCache#put");
            }
            C13379j.m2677g(cacheKey);
            C13379j.m2682b(Boolean.valueOf(C13065e.m3333j0(c13065e)));
            this.f29670f.m8084f(cacheKey, c13065e);
            C13065e m3336h = C13065e.m3336h(c13065e);
            try {
                this.f29669e.execute(new RunnableC11388b(C13388a.m2660d("BufferedDiskCache_putAsync"), cacheKey, m3336h));
            } catch (Exception e) {
                C13677a.m1871G(f29664h, e, "Failed to schedule disk-cache write for %s", cacheKey.mo714a());
                this.f29670f.m8082h(cacheKey, c13065e);
                C13065e.m3335i(m3336h);
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: r */
    public C13857f<Void> m8171r(CacheKey cacheKey) {
        C13379j.m2677g(cacheKey);
        this.f29670f.m8083g(cacheKey);
        try {
            return C13857f.m1392b(new CallableC11389c(C13388a.m2660d("BufferedDiskCache_remove"), cacheKey), this.f29669e);
        } catch (Exception e) {
            C13677a.m1871G(f29664h, e, "Failed to schedule disk-cache remove for %s", cacheKey.mo714a());
            return C13857f.m1387g(e);
        }
    }
}