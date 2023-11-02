package p247nb;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import p164j$.util.concurrent.ConcurrentHashMap;
import p423xb.InterfaceC13776b;

/* renamed from: nb.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10565x<T> implements InterfaceC13776b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f27570b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC13776b<T>> f27569a = Collections.newSetFromMap(new ConcurrentHashMap());

    C10565x(Collection<InterfaceC13776b<T>> collection) {
        this.f27569a.addAll(collection);
    }

    /* renamed from: b */
    public static C10565x<?> m11224b(Collection<InterfaceC13776b<?>> collection) {
        return new C10565x<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m11222d() {
        for (InterfaceC13776b<T> interfaceC13776b : this.f27569a) {
            this.f27570b.add(interfaceC13776b.get());
        }
        this.f27569a = null;
    }

    /* renamed from: a */
    public synchronized void m11225a(InterfaceC13776b<T> interfaceC13776b) {
        if (this.f27570b == null) {
            this.f27569a.add(interfaceC13776b);
        } else {
            this.f27570b.add(interfaceC13776b.get());
        }
    }

    @Override // p423xb.InterfaceC13776b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f27570b == null) {
            synchronized (this) {
                if (this.f27570b == null) {
                    this.f27570b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m11222d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f27570b);
    }
}