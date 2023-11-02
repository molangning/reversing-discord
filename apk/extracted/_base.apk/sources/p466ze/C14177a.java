package p466ze;

import cf.C2528b;
import java.util.concurrent.Callable;
import p067df.InterfaceC5833d;
import ye.AbstractC14015g;

/* renamed from: ze.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14177a {

    /* renamed from: a */
    private static volatile InterfaceC5833d<Callable<AbstractC14015g>, AbstractC14015g> f36479a;

    /* renamed from: b */
    private static volatile InterfaceC5833d<AbstractC14015g, AbstractC14015g> f36480b;

    /* renamed from: a */
    static <T, R> R m522a(InterfaceC5833d<T, R> interfaceC5833d, T t) {
        try {
            return interfaceC5833d.apply(t);
        } catch (Throwable th2) {
            throw C2528b.m33062a(th2);
        }
    }

    /* renamed from: b */
    static AbstractC14015g m521b(InterfaceC5833d<Callable<AbstractC14015g>, AbstractC14015g> interfaceC5833d, Callable<AbstractC14015g> callable) {
        AbstractC14015g abstractC14015g = (AbstractC14015g) m522a(interfaceC5833d, callable);
        if (abstractC14015g != null) {
            return abstractC14015g;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    static AbstractC14015g m520c(Callable<AbstractC14015g> callable) {
        try {
            AbstractC14015g call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw C2528b.m33062a(th2);
        }
    }

    /* renamed from: d */
    public static AbstractC14015g m519d(Callable<AbstractC14015g> callable) {
        if (callable != null) {
            InterfaceC5833d<Callable<AbstractC14015g>, AbstractC14015g> interfaceC5833d = f36479a;
            if (interfaceC5833d == null) {
                return m520c(callable);
            }
            return m521b(interfaceC5833d, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public static AbstractC14015g m518e(AbstractC14015g abstractC14015g) {
        if (abstractC14015g != null) {
            InterfaceC5833d<AbstractC14015g, AbstractC14015g> interfaceC5833d = f36480b;
            if (interfaceC5833d == null) {
                return abstractC14015g;
            }
            return (AbstractC14015g) m522a(interfaceC5833d, abstractC14015g);
        }
        throw new NullPointerException("scheduler == null");
    }
}
