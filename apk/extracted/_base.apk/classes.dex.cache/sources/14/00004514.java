package nf;

import cf.C2523a;
import cf.C2529c;
import cf.C2530d;
import cf.C2532f;
import java.util.concurrent.Callable;
import lk.InterfaceC10220b;
import p067df.InterfaceC5832c;
import p067df.InterfaceC5833d;
import p106ff.C6421b;
import p233mf.C10449c;
import ye.AbstractC14010b;
import ye.AbstractC14015g;

/* renamed from: nf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10859a {

    /* renamed from: a */
    static volatile InterfaceC5832c<? super Throwable> f28345a;

    /* renamed from: b */
    static volatile InterfaceC5833d<? super Runnable, ? extends Runnable> f28346b;

    /* renamed from: c */
    static volatile InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> f28347c;

    /* renamed from: d */
    static volatile InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> f28348d;

    /* renamed from: e */
    static volatile InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> f28349e;

    /* renamed from: f */
    static volatile InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> f28350f;

    /* renamed from: g */
    static volatile InterfaceC5833d<? super AbstractC14015g, ? extends AbstractC14015g> f28351g;

    /* renamed from: h */
    static volatile InterfaceC5833d<? super AbstractC14010b, ? extends AbstractC14010b> f28352h;

    /* renamed from: a */
    static <T, R> R m9896a(InterfaceC5833d<T, R> interfaceC5833d, T t) {
        try {
            return interfaceC5833d.apply(t);
        } catch (Throwable th2) {
            throw C10449c.m11523c(th2);
        }
    }

    /* renamed from: b */
    static AbstractC14015g m9895b(InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> interfaceC5833d, Callable<AbstractC14015g> callable) {
        return (AbstractC14015g) C6421b.m22784c(m9896a(interfaceC5833d, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: c */
    static AbstractC14015g m9894c(Callable<AbstractC14015g> callable) {
        try {
            return (AbstractC14015g) C6421b.m22784c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw C10449c.m11523c(th2);
        }
    }

    /* renamed from: d */
    public static AbstractC14015g m9893d(Callable<AbstractC14015g> callable) {
        C6421b.m22784c(callable, "Scheduler Callable can't be null");
        InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> interfaceC5833d = f28347c;
        if (interfaceC5833d == null) {
            return m9894c(callable);
        }
        return m9895b(interfaceC5833d, callable);
    }

    /* renamed from: e */
    public static AbstractC14015g m9892e(Callable<AbstractC14015g> callable) {
        C6421b.m22784c(callable, "Scheduler Callable can't be null");
        InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> interfaceC5833d = f28349e;
        if (interfaceC5833d == null) {
            return m9894c(callable);
        }
        return m9895b(interfaceC5833d, callable);
    }

    /* renamed from: f */
    public static AbstractC14015g m9891f(Callable<AbstractC14015g> callable) {
        C6421b.m22784c(callable, "Scheduler Callable can't be null");
        InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> interfaceC5833d = f28350f;
        if (interfaceC5833d == null) {
            return m9894c(callable);
        }
        return m9895b(interfaceC5833d, callable);
    }

    /* renamed from: g */
    public static AbstractC14015g m9890g(Callable<AbstractC14015g> callable) {
        C6421b.m22784c(callable, "Scheduler Callable can't be null");
        InterfaceC5833d<? super Callable<AbstractC14015g>, ? extends AbstractC14015g> interfaceC5833d = f28348d;
        if (interfaceC5833d == null) {
            return m9894c(callable);
        }
        return m9895b(interfaceC5833d, callable);
    }

    /* renamed from: h */
    static boolean m9889h(Throwable th2) {
        if ((th2 instanceof C2530d) || (th2 instanceof C2529c) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof C2523a)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static <T> AbstractC14010b<T> m9888i(AbstractC14010b<T> abstractC14010b) {
        InterfaceC5833d<? super AbstractC14010b, ? extends AbstractC14010b> interfaceC5833d = f28352h;
        if (interfaceC5833d != null) {
            return (AbstractC14010b) m9896a(interfaceC5833d, abstractC14010b);
        }
        return abstractC14010b;
    }

    /* renamed from: j */
    public static void m9887j(Throwable th2) {
        InterfaceC5832c<? super Throwable> interfaceC5832c = f28345a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m9889h(th2)) {
            th2 = new C2532f(th2);
        }
        if (interfaceC5832c != null) {
            try {
                interfaceC5832c.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                m9883n(th3);
            }
        }
        th2.printStackTrace();
        m9883n(th2);
    }

    /* renamed from: k */
    public static AbstractC14015g m9886k(AbstractC14015g abstractC14015g) {
        InterfaceC5833d<? super AbstractC14015g, ? extends AbstractC14015g> interfaceC5833d = f28351g;
        if (interfaceC5833d == null) {
            return abstractC14015g;
        }
        return (AbstractC14015g) m9896a(interfaceC5833d, abstractC14015g);
    }

    /* renamed from: l */
    public static Runnable m9885l(Runnable runnable) {
        C6421b.m22784c(runnable, "run is null");
        InterfaceC5833d<? super Runnable, ? extends Runnable> interfaceC5833d = f28346b;
        if (interfaceC5833d == null) {
            return runnable;
        }
        return (Runnable) m9896a(interfaceC5833d, runnable);
    }

    /* renamed from: m */
    public static <T> InterfaceC10220b<? super T> m9884m(AbstractC14010b<T> abstractC14010b, InterfaceC10220b<? super T> interfaceC10220b) {
        return interfaceC10220b;
    }

    /* renamed from: n */
    static void m9883n(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}