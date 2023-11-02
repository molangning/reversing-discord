package p433y0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: y0.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13857f<TResult> {

    /* renamed from: i */
    public static final ExecutorService f35660i = C13851b.m1398a();

    /* renamed from: j */
    private static final Executor f35661j = C13851b.m1397b();

    /* renamed from: k */
    public static final Executor f35662k = C13848a.m1399c();

    /* renamed from: l */
    private static C13857f<?> f35663l = new C13857f<>((Object) null);

    /* renamed from: m */
    private static C13857f<Boolean> f35664m = new C13857f<>(Boolean.TRUE);

    /* renamed from: n */
    private static C13857f<Boolean> f35665n = new C13857f<>(Boolean.FALSE);

    /* renamed from: o */
    private static C13857f<?> f35666o = new C13857f<>(true);

    /* renamed from: b */
    private boolean f35668b;

    /* renamed from: c */
    private boolean f35669c;

    /* renamed from: d */
    private TResult f35670d;

    /* renamed from: e */
    private Exception f35671e;

    /* renamed from: f */
    private boolean f35672f;

    /* renamed from: g */
    private C13863h f35673g;

    /* renamed from: a */
    private final Object f35667a = new Object();

    /* renamed from: h */
    private List<InterfaceC13855d<TResult, Void>> f35674h = new ArrayList();

    /* renamed from: y0.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C13858a implements InterfaceC13855d<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ C13862g f35675a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC13855d f35676b;

        /* renamed from: c */
        final /* synthetic */ Executor f35677c;

        C13858a(C13862g c13862g, InterfaceC13855d interfaceC13855d, Executor executor, C13854c c13854c) {
            C13857f.this = r1;
            this.f35675a = c13862g;
            this.f35676b = interfaceC13855d;
            this.f35677c = executor;
        }

        @Override // p433y0.InterfaceC13855d
        /* renamed from: b */
        public Void mo1375a(C13857f<TResult> c13857f) {
            C13857f.m1390d(this.f35675a, this.f35676b, c13857f, this.f35677c, null);
            return null;
        }
    }

    /* renamed from: y0.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RunnableC13859b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C13862g f35679j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC13855d f35680k;

        /* renamed from: l */
        final /* synthetic */ C13857f f35681l;

        RunnableC13859b(C13854c c13854c, C13862g c13862g, InterfaceC13855d interfaceC13855d, C13857f c13857f) {
            this.f35679j = c13862g;
            this.f35680k = interfaceC13855d;
            this.f35681l = c13857f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35679j.m1370d(this.f35680k.mo1375a(this.f35681l));
            } catch (CancellationException unused) {
                this.f35679j.m1372b();
            } catch (Exception e) {
                this.f35679j.m1371c(e);
            }
        }
    }

    /* renamed from: y0.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RunnableC13860c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C13862g f35682j;

        /* renamed from: k */
        final /* synthetic */ Callable f35683k;

        RunnableC13860c(C13854c c13854c, C13862g c13862g, Callable callable) {
            this.f35682j = c13862g;
            this.f35683k = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35682j.m1370d(this.f35683k.call());
            } catch (CancellationException unused) {
                this.f35682j.m1372b();
            } catch (Exception e) {
                this.f35682j.m1371c(e);
            }
        }
    }

    /* renamed from: y0.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC13861d {
    }

    public C13857f() {
    }

    /* renamed from: b */
    public static <TResult> C13857f<TResult> m1392b(Callable<TResult> callable, Executor executor) {
        return m1391c(callable, executor, null);
    }

    /* renamed from: c */
    public static <TResult> C13857f<TResult> m1391c(Callable<TResult> callable, Executor executor, C13854c c13854c) {
        C13862g c13862g = new C13862g();
        try {
            executor.execute(new RunnableC13860c(c13854c, c13862g, callable));
        } catch (Exception e) {
            c13862g.m1371c(new C13856e(e));
        }
        return c13862g.m1373a();
    }

    /* renamed from: d */
    public static <TContinuationResult, TResult> void m1390d(C13862g<TContinuationResult> c13862g, InterfaceC13855d<TResult, TContinuationResult> interfaceC13855d, C13857f<TResult> c13857f, Executor executor, C13854c c13854c) {
        try {
            executor.execute(new RunnableC13859b(c13854c, c13862g, interfaceC13855d, c13857f));
        } catch (Exception e) {
            c13862g.m1371c(new C13856e(e));
        }
    }

    /* renamed from: g */
    public static <TResult> C13857f<TResult> m1387g(Exception exc) {
        C13862g c13862g = new C13862g();
        c13862g.m1371c(exc);
        return c13862g.m1373a();
    }

    /* renamed from: h */
    public static <TResult> C13857f<TResult> m1386h(TResult tresult) {
        if (tresult == null) {
            return (C13857f<TResult>) f35663l;
        }
        if (tresult instanceof Boolean) {
            if (((Boolean) tresult).booleanValue()) {
                return (C13857f<TResult>) f35664m;
            }
            return (C13857f<TResult>) f35665n;
        }
        C13862g c13862g = new C13862g();
        c13862g.m1370d(tresult);
        return c13862g.m1373a();
    }

    /* renamed from: k */
    public static InterfaceC13861d m1383k() {
        return null;
    }

    /* renamed from: o */
    private void m1379o() {
        synchronized (this.f35667a) {
            for (InterfaceC13855d<TResult, Void> interfaceC13855d : this.f35674h) {
                try {
                    interfaceC13855d.mo1375a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f35674h = null;
        }
    }

    /* renamed from: e */
    public <TContinuationResult> C13857f<TContinuationResult> m1389e(InterfaceC13855d<TResult, TContinuationResult> interfaceC13855d) {
        return m1388f(interfaceC13855d, f35661j, null);
    }

    /* renamed from: f */
    public <TContinuationResult> C13857f<TContinuationResult> m1388f(InterfaceC13855d<TResult, TContinuationResult> interfaceC13855d, Executor executor, C13854c c13854c) {
        boolean m1381m;
        C13862g c13862g = new C13862g();
        synchronized (this.f35667a) {
            m1381m = m1381m();
            if (!m1381m) {
                this.f35674h.add(new C13858a(c13862g, interfaceC13855d, executor, c13854c));
            }
        }
        if (m1381m) {
            m1390d(c13862g, interfaceC13855d, this, executor, c13854c);
        }
        return c13862g.m1373a();
    }

    /* renamed from: i */
    public Exception m1385i() {
        Exception exc;
        synchronized (this.f35667a) {
            if (this.f35671e != null) {
                this.f35672f = true;
                C13863h c13863h = this.f35673g;
                if (c13863h != null) {
                    c13863h.m1366a();
                    this.f35673g = null;
                }
            }
            exc = this.f35671e;
        }
        return exc;
    }

    /* renamed from: j */
    public TResult m1384j() {
        TResult tresult;
        synchronized (this.f35667a) {
            tresult = this.f35670d;
        }
        return tresult;
    }

    /* renamed from: l */
    public boolean m1382l() {
        boolean z;
        synchronized (this.f35667a) {
            z = this.f35669c;
        }
        return z;
    }

    /* renamed from: m */
    public boolean m1381m() {
        boolean z;
        synchronized (this.f35667a) {
            z = this.f35668b;
        }
        return z;
    }

    /* renamed from: n */
    public boolean m1380n() {
        boolean z;
        synchronized (this.f35667a) {
            if (m1385i() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: p */
    public boolean m1378p() {
        synchronized (this.f35667a) {
            if (this.f35668b) {
                return false;
            }
            this.f35668b = true;
            this.f35669c = true;
            this.f35667a.notifyAll();
            m1379o();
            return true;
        }
    }

    /* renamed from: q */
    public boolean m1377q(Exception exc) {
        synchronized (this.f35667a) {
            if (this.f35668b) {
                return false;
            }
            this.f35668b = true;
            this.f35671e = exc;
            this.f35672f = false;
            this.f35667a.notifyAll();
            m1379o();
            if (!this.f35672f) {
                m1383k();
            }
            return true;
        }
    }

    /* renamed from: r */
    public boolean m1376r(TResult tresult) {
        synchronized (this.f35667a) {
            if (this.f35668b) {
                return false;
            }
            this.f35668b = true;
            this.f35670d = tresult;
            this.f35667a.notifyAll();
            m1379o();
            return true;
        }
    }

    private C13857f(TResult tresult) {
        m1376r(tresult);
    }

    private C13857f(boolean z) {
        if (z) {
            m1378p();
        } else {
            m1376r(null);
        }
    }
}