package p247nb;

import android.util.Log;
import androidx.lifecycle.C1696m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p247nb.C10550n;
import p284pb.InterfaceC11488a;
import p367ub.InterfaceC12944c;
import p367ub.InterfaceC12945d;
import p423xb.InterfaceC13776b;

/* renamed from: nb.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10550n extends AbstractC10527a implements InterfaceC11488a {

    /* renamed from: g */
    private static final InterfaceC13776b<Set<Object>> f27541g = new InterfaceC13776b() { // from class: nb.k
        @Override // p423xb.InterfaceC13776b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map<C10533d<?>, InterfaceC13776b<?>> f27542a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC13776b<?>> f27543b;

    /* renamed from: c */
    private final Map<Class<?>, C10565x<?>> f27544c;

    /* renamed from: d */
    private final List<InterfaceC13776b<InterfaceC10545i>> f27545d;

    /* renamed from: e */
    private final C10562u f27546e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f27547f;

    /* renamed from: nb.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10552b {

        /* renamed from: a */
        private final Executor f27548a;

        /* renamed from: b */
        private final List<InterfaceC13776b<InterfaceC10545i>> f27549b = new ArrayList();

        /* renamed from: c */
        private final List<C10533d<?>> f27550c = new ArrayList();

        C10552b(Executor executor) {
            this.f27548a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ InterfaceC10545i m11254f(InterfaceC10545i interfaceC10545i) {
            return interfaceC10545i;
        }

        /* renamed from: b */
        public C10552b m11258b(C10533d<?> c10533d) {
            this.f27550c.add(c10533d);
            return this;
        }

        /* renamed from: c */
        public C10552b m11257c(final InterfaceC10545i interfaceC10545i) {
            this.f27549b.add(new InterfaceC13776b() { // from class: nb.o
                @Override // p423xb.InterfaceC13776b
                public final Object get() {
                    InterfaceC10545i m11254f;
                    m11254f = C10550n.C10552b.m11254f(InterfaceC10545i.this);
                    return m11254f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public C10552b m11256d(Collection<InterfaceC13776b<InterfaceC10545i>> collection) {
            this.f27549b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C10550n m11255e() {
            return new C10550n(this.f27548a, this.f27549b, this.f27550c);
        }
    }

    /* renamed from: h */
    public static C10552b m11271h(Executor executor) {
        return new C10552b(executor);
    }

    /* renamed from: i */
    private void m11270i(List<C10533d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC13776b<InterfaceC10545i>> it = this.f27545d.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC10545i interfaceC10545i = it.next().get();
                    if (interfaceC10545i != null) {
                        list.addAll(interfaceC10545i.getComponents());
                        it.remove();
                    }
                } catch (C10563v e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f27542a.isEmpty()) {
                C10554p.m11253a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f27542a.keySet());
                arrayList2.addAll(list);
                C10554p.m11253a(arrayList2);
            }
            for (final C10533d<?> c10533d : list) {
                this.f27542a.put(c10533d, new C10564w(new InterfaceC13776b() { // from class: nb.j
                    @Override // p423xb.InterfaceC13776b
                    public final Object get() {
                        Object m11266m;
                        m11266m = C10550n.this.m11266m(c10533d);
                        return m11266m;
                    }
                }));
            }
            arrayList.addAll(m11261r(list));
            arrayList.addAll(m11260s());
            m11262q();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m11263p();
    }

    /* renamed from: j */
    private void m11269j(Map<C10533d<?>, InterfaceC13776b<?>> map, boolean z) {
        for (Map.Entry<C10533d<?>, InterfaceC13776b<?>> entry : map.entrySet()) {
            C10533d<?> key = entry.getKey();
            InterfaceC13776b<?> value = entry.getValue();
            if (key.m11300k() || (key.m11299l() && z)) {
                value.get();
            }
        }
        this.f27546e.m11230c();
    }

    /* renamed from: l */
    private static <T> List<T> m11267l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: m */
    public /* synthetic */ Object m11266m(C10533d c10533d) {
        return c10533d.m11305f().mo1055a(new C10536d0(c10533d, this));
    }

    /* renamed from: p */
    private void m11263p() {
        Boolean bool = this.f27547f.get();
        if (bool != null) {
            m11269j(this.f27542a, bool.booleanValue());
        }
    }

    /* renamed from: q */
    private void m11262q() {
        for (C10533d<?> c10533d : this.f27542a.keySet()) {
            for (C10558q c10558q : c10533d.m11306e()) {
                if (c10558q.m11237f() && !this.f27544c.containsKey(c10558q.m11241b())) {
                    this.f27544c.put(c10558q.m11241b(), C10565x.m11224b(Collections.emptySet()));
                } else if (this.f27543b.containsKey(c10558q.m11241b())) {
                    continue;
                } else if (!c10558q.m11238e()) {
                    if (!c10558q.m11237f()) {
                        this.f27543b.put(c10558q.m11241b(), C10530b0.m11318c());
                    }
                } else {
                    throw new C10566y(String.format("Unsatisfied dependency for component %s: %s", c10533d, c10558q.m11241b()));
                }
            }
        }
    }

    /* renamed from: r */
    private List<Runnable> m11261r(List<C10533d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C10533d<?> c10533d : list) {
            if (c10533d.m11298m()) {
                final InterfaceC13776b<?> interfaceC13776b = this.f27542a.get(c10533d);
                for (Class<? super Object> cls : c10533d.m11304g()) {
                    if (!this.f27543b.containsKey(cls)) {
                        this.f27543b.put(cls, interfaceC13776b);
                    } else {
                        final C10530b0 c10530b0 = (C10530b0) this.f27543b.get(cls);
                        arrayList.add(new Runnable() { // from class: nb.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10530b0.this.m11315f(interfaceC13776b);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private List<Runnable> m11260s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C10533d<?>, InterfaceC13776b<?>> entry : this.f27542a.entrySet()) {
            C10533d<?> key = entry.getKey();
            if (!key.m11298m()) {
                InterfaceC13776b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m11304g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f27544c.containsKey(entry2.getKey())) {
                this.f27544c.put((Class) entry2.getKey(), C10565x.m11224b((Collection) entry2.getValue()));
            } else {
                final C10565x<?> c10565x = this.f27544c.get(entry2.getKey());
                for (final InterfaceC13776b interfaceC13776b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: nb.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10565x.this.m11225a(interfaceC13776b);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // p247nb.AbstractC10527a, p247nb.InterfaceC10538e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo11278a(Class cls) {
        return super.mo11278a(cls);
    }

    @Override // p247nb.InterfaceC10538e
    /* renamed from: b */
    public synchronized <T> InterfaceC13776b<Set<T>> mo11277b(Class<T> cls) {
        C10565x<?> c10565x = this.f27544c.get(cls);
        if (c10565x != null) {
            return c10565x;
        }
        return (InterfaceC13776b<Set<T>>) f27541g;
    }

    @Override // p247nb.AbstractC10527a, p247nb.InterfaceC10538e
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo11276c(Class cls) {
        return super.mo11276c(cls);
    }

    @Override // p247nb.InterfaceC10538e
    /* renamed from: d */
    public synchronized <T> InterfaceC13776b<T> mo11275d(Class<T> cls) {
        C10532c0.m11312c(cls, "Null interface requested.");
        return (InterfaceC13776b<T>) this.f27543b.get(cls);
    }

    /* renamed from: k */
    public void m11268k(boolean z) {
        HashMap hashMap;
        if (!C1696m.m36034a(this.f27547f, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f27542a);
        }
        m11269j(hashMap, z);
    }

    private C10550n(Executor executor, Iterable<InterfaceC13776b<InterfaceC10545i>> iterable, Collection<C10533d<?>> collection) {
        this.f27542a = new HashMap();
        this.f27543b = new HashMap();
        this.f27544c = new HashMap();
        this.f27547f = new AtomicReference<>();
        C10562u c10562u = new C10562u(executor);
        this.f27546e = c10562u;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10533d.m11295p(c10562u, C10562u.class, InterfaceC12945d.class, InterfaceC12944c.class));
        arrayList.add(C10533d.m11295p(this, InterfaceC11488a.class, new Class[0]));
        for (C10533d<?> c10533d : collection) {
            if (c10533d != null) {
                arrayList.add(c10533d);
            }
        }
        this.f27545d = m11267l(iterable);
        m11270i(arrayList);
    }
}