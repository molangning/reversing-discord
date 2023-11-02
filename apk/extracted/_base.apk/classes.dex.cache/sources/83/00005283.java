package p438y5;

import javax.inject.Provider;
import p417x5.InterfaceC13690a;

/* renamed from: y5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13906a<T> implements Provider<T>, InterfaceC13690a<T> {

    /* renamed from: c */
    private static final Object f35785c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f35786a;

    /* renamed from: b */
    private volatile Object f35787b = f35785c;

    private C13906a(Provider<T> provider) {
        this.f35786a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> InterfaceC13690a<T> m1225a(P p) {
        if (p instanceof InterfaceC13690a) {
            return (InterfaceC13690a) p;
        }
        return new C13906a((Provider) C13909d.m1220b(p));
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m1224b(P p) {
        C13909d.m1220b(p);
        if (p instanceof C13906a) {
            return p;
        }
        return new C13906a(p);
    }

    /* renamed from: c */
    public static Object m1223c(Object obj, Object obj2) {
        boolean z;
        if (obj != f35785c) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f35787b;
        Object obj = f35785c;
        if (t == obj) {
            synchronized (this) {
                t = this.f35787b;
                if (t == obj) {
                    t = this.f35786a.get();
                    this.f35787b = m1223c(this.f35787b, t);
                    this.f35786a = null;
                }
            }
        }
        return t;
    }
}