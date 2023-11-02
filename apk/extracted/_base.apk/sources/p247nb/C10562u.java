package p247nb;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p164j$.util.concurrent.ConcurrentHashMap;
import p367ub.C12942a;
import p367ub.InterfaceC12943b;
import p367ub.InterfaceC12944c;
import p367ub.InterfaceC12945d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nb.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10562u implements InterfaceC12945d, InterfaceC12944c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC12943b<Object>, Executor>> f27563a = new HashMap();

    /* renamed from: b */
    private Queue<C12942a<?>> f27564b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f27565c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10562u(Executor executor) {
        this.f27565c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<InterfaceC12943b<Object>, Executor>> m11229d(C12942a<?> c12942a) {
        Set<Map.Entry<InterfaceC12943b<Object>, Executor>> entrySet;
        ConcurrentHashMap<InterfaceC12943b<Object>, Executor> concurrentHashMap = this.f27563a.get(c12942a.m3637a());
        if (concurrentHashMap == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = concurrentHashMap.entrySet();
        }
        return entrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m11228e(Map.Entry entry, C12942a c12942a) {
        ((InterfaceC12943b) entry.getKey()).mo3636a(c12942a);
    }

    @Override // p367ub.InterfaceC12945d
    /* renamed from: a */
    public <T> void mo3635a(Class<T> cls, InterfaceC12943b<? super T> interfaceC12943b) {
        m11226g(cls, this.f27565c, interfaceC12943b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m11230c() {
        Queue<C12942a<?>> queue;
        synchronized (this) {
            queue = this.f27564b;
            if (queue != null) {
                this.f27564b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C12942a<?> c12942a : queue) {
                m11227f(c12942a);
            }
        }
    }

    /* renamed from: f */
    public void m11227f(final C12942a<?> c12942a) {
        C10532c0.m11313b(c12942a);
        synchronized (this) {
            Queue<C12942a<?>> queue = this.f27564b;
            if (queue != null) {
                queue.add(c12942a);
                return;
            }
            for (final Map.Entry<InterfaceC12943b<Object>, Executor> entry : m11229d(c12942a)) {
                entry.getValue().execute(new Runnable() { // from class: nb.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10562u.m11228e(entry, c12942a);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public synchronized <T> void m11226g(Class<T> cls, Executor executor, InterfaceC12943b<? super T> interfaceC12943b) {
        C10532c0.m11313b(cls);
        C10532c0.m11313b(interfaceC12943b);
        C10532c0.m11313b(executor);
        if (!this.f27563a.containsKey(cls)) {
            this.f27563a.put(cls, new ConcurrentHashMap<>());
        }
        this.f27563a.get(cls).put(interfaceC12943b, executor);
    }
}
