package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p006a5.C0025b;
import p075e3.EnumC6102e;
import p394w2.C13379j;
import p394w2.C13381l;

/* renamed from: com.facebook.imagepipeline.producers.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3779g0<K, T extends Closeable> implements InterfaceC3810l0<T> {

    /* renamed from: a */
    final Map<K, AbstractC3779g0<K, T>.C3781b> f10611a;

    /* renamed from: b */
    private final InterfaceC3810l0<T> f10612b;

    /* renamed from: c */
    private final boolean f10613c;

    /* renamed from: d */
    private final String f10614d;

    /* renamed from: e */
    private final String f10615e;

    /* renamed from: com.facebook.imagepipeline.producers.g0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3781b {

        /* renamed from: a */
        private final K f10616a;

        /* renamed from: b */
        private final CopyOnWriteArraySet<Pair<Consumer<T>, ProducerContext>> f10617b = C13381l.m2672a();

        /* renamed from: c */
        private T f10618c;

        /* renamed from: d */
        private float f10619d;

        /* renamed from: e */
        private int f10620e;

        /* renamed from: f */
        private C3770d f10621f;

        /* renamed from: g */
        private AbstractC3779g0<K, T>.C3781b.C3783b f10622g;

        /* renamed from: com.facebook.imagepipeline.producers.g0$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3782a extends C3772e {

            /* renamed from: a */
            final /* synthetic */ Pair f10624a;

            C3782a(Pair pair) {
                C3781b.this = r1;
                this.f10624a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.C3772e, com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: a */
            public void mo30662a() {
                C3770d.m30845r(C3781b.this.m30798r());
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: b */
            public void mo30638b() {
                boolean remove;
                List list;
                C3770d c3770d;
                List list2;
                List list3;
                synchronized (C3781b.this) {
                    remove = C3781b.this.f10617b.remove(this.f10624a);
                    list = null;
                    if (remove) {
                        if (C3781b.this.f10617b.isEmpty()) {
                            c3770d = C3781b.this.f10621f;
                            list2 = null;
                        } else {
                            List m30797s = C3781b.this.m30797s();
                            list2 = C3781b.this.m30796t();
                            list3 = C3781b.this.m30798r();
                            c3770d = null;
                            list = m30797s;
                        }
                    } else {
                        c3770d = null;
                        list2 = null;
                    }
                    list3 = list2;
                }
                C3770d.m30844s(list);
                C3770d.m30843t(list2);
                C3770d.m30845r(list3);
                if (c3770d != null) {
                    if (AbstractC3779g0.this.f10613c && !c3770d.mo30849n()) {
                        C3770d.m30843t(c3770d.m30838y(Priority.LOW));
                    } else {
                        c3770d.m30842u();
                    }
                }
                if (remove) {
                    ((Consumer) this.f10624a.first).mo30892a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.C3772e, com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: c */
            public void mo30696c() {
                C3770d.m30843t(C3781b.this.m30796t());
            }

            @Override // com.facebook.imagepipeline.producers.C3772e, com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: d */
            public void mo30695d() {
                C3770d.m30844s(C3781b.this.m30797s());
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.g0$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3783b extends AbstractC3761b<T> {
            private C3783b() {
                C3781b.this = r1;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3761b
            /* renamed from: f */
            protected void mo30625f() {
                try {
                    if (C0025b.m41375d()) {
                        C0025b.m41378a("MultiplexProducer#onCancellation");
                    }
                    C3781b.this.m30803m(this);
                } finally {
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3761b
            /* renamed from: g */
            protected void mo30606g(Throwable th2) {
                try {
                    if (C0025b.m41375d()) {
                        C0025b.m41378a("MultiplexProducer#onFailure");
                    }
                    C3781b.this.m30802n(this, th2);
                } finally {
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3761b
            /* renamed from: i */
            protected void mo30693i(float f) {
                try {
                    if (C0025b.m41375d()) {
                        C0025b.m41378a("MultiplexProducer#onProgressUpdate");
                    }
                    C3781b.this.m30800p(this, f);
                } finally {
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3761b
            /* renamed from: o */
            public void mo30605h(T t, int i) {
                try {
                    if (C0025b.m41375d()) {
                        C0025b.m41378a("MultiplexProducer#onNewResult");
                    }
                    C3781b.this.m30801o(this, t, i);
                } finally {
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                    }
                }
            }
        }

        public C3781b(K k) {
            AbstractC3779g0.this = r1;
            this.f10616a = k;
        }

        /* renamed from: g */
        private void m30809g(Pair<Consumer<T>, ProducerContext> pair, ProducerContext producerContext) {
            producerContext.mo30860c(new C3782a(pair));
        }

        /* renamed from: i */
        private void m30807i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: j */
        private synchronized boolean m30806j() {
            Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f10617b.iterator();
            while (it.hasNext()) {
                if (((ProducerContext) it.next().second).mo30853j()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: k */
        private synchronized boolean m30805k() {
            Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f10617b.iterator();
            while (it.hasNext()) {
                if (!((ProducerContext) it.next().second).mo30849n()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: l */
        private synchronized Priority m30804l() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f10617b.iterator();
            while (it.hasNext()) {
                priority = Priority.m31191a(priority, ((ProducerContext) it.next().second).mo30852k());
            }
            return priority;
        }

        /* renamed from: q */
        public void m30799q(EnumC6102e enumC6102e) {
            boolean z;
            synchronized (this) {
                boolean z2 = true;
                if (this.f10621f == null) {
                    z = true;
                } else {
                    z = false;
                }
                C13379j.m2682b(Boolean.valueOf(z));
                if (this.f10622g != null) {
                    z2 = false;
                }
                C13379j.m2682b(Boolean.valueOf(z2));
                if (this.f10617b.isEmpty()) {
                    AbstractC3779g0.this.m30816k(this.f10616a, this);
                    return;
                }
                ProducerContext producerContext = (ProducerContext) this.f10617b.iterator().next().second;
                C3770d c3770d = new C3770d(producerContext.mo30851l(), producerContext.getId(), producerContext.mo30854i(), producerContext.mo30862a(), producerContext.mo30847p(), m30805k(), m30806j(), m30804l(), producerContext.mo30859d());
                this.f10621f = c3770d;
                c3770d.mo30850m(producerContext.getExtras());
                if (enumC6102e.m23574b()) {
                    this.f10621f.mo30861b("started_as_prefetch", Boolean.valueOf(enumC6102e.m23575a()));
                }
                AbstractC3779g0<K, T>.C3781b.C3783b c3783b = new C3783b();
                this.f10622g = c3783b;
                AbstractC3779g0.this.f10612b.mo30610b(c3783b, this.f10621f);
            }
        }

        /* renamed from: r */
        public synchronized List<InterfaceC3817m0> m30798r() {
            C3770d c3770d = this.f10621f;
            if (c3770d == null) {
                return null;
            }
            return c3770d.m30840w(m30806j());
        }

        /* renamed from: s */
        public synchronized List<InterfaceC3817m0> m30797s() {
            C3770d c3770d = this.f10621f;
            if (c3770d == null) {
                return null;
            }
            return c3770d.m30839x(m30805k());
        }

        /* renamed from: t */
        public synchronized List<InterfaceC3817m0> m30796t() {
            C3770d c3770d = this.f10621f;
            if (c3770d == null) {
                return null;
            }
            return c3770d.m30838y(m30804l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        public boolean m30808h(Consumer<T> consumer, ProducerContext producerContext) {
            Pair<Consumer<T>, ProducerContext> create = Pair.create(consumer, producerContext);
            synchronized (this) {
                if (AbstractC3779g0.this.m30817i(this.f10616a) != this) {
                    return false;
                }
                this.f10617b.add(create);
                List<InterfaceC3817m0> m30797s = m30797s();
                List<InterfaceC3817m0> m30796t = m30796t();
                List<InterfaceC3817m0> m30798r = m30798r();
                Closeable closeable = this.f10618c;
                float f = this.f10619d;
                int i = this.f10620e;
                C3770d.m30844s(m30797s);
                C3770d.m30843t(m30796t);
                C3770d.m30845r(m30798r);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f10618c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = AbstractC3779g0.this.mo30661g(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f > 0.0f) {
                            consumer.mo30890c(f);
                        }
                        consumer.mo30891b(closeable, i);
                        m30807i(closeable);
                    }
                }
                m30809g(create, producerContext);
                return true;
            }
        }

        /* renamed from: m */
        public void m30803m(AbstractC3779g0<K, T>.C3781b.C3783b c3783b) {
            synchronized (this) {
                if (this.f10622g != c3783b) {
                    return;
                }
                this.f10622g = null;
                this.f10621f = null;
                m30807i(this.f10618c);
                this.f10618c = null;
                m30799q(EnumC6102e.UNSET);
            }
        }

        /* renamed from: n */
        public void m30802n(AbstractC3779g0<K, T>.C3781b.C3783b c3783b, Throwable th2) {
            synchronized (this) {
                if (this.f10622g != c3783b) {
                    return;
                }
                Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f10617b.iterator();
                this.f10617b.clear();
                AbstractC3779g0.this.m30816k(this.f10616a, this);
                m30807i(this.f10618c);
                this.f10618c = null;
                while (it.hasNext()) {
                    Pair<Consumer<T>, ProducerContext> next = it.next();
                    synchronized (next) {
                        ((ProducerContext) next.second).mo30854i().mo1806k((ProducerContext) next.second, AbstractC3779g0.this.f10614d, th2, null);
                        ((Consumer) next.first).onFailure(th2);
                    }
                }
            }
        }

        /* renamed from: o */
        public void m30801o(AbstractC3779g0<K, T>.C3781b.C3783b c3783b, T t, int i) {
            synchronized (this) {
                if (this.f10622g != c3783b) {
                    return;
                }
                m30807i(this.f10618c);
                this.f10618c = null;
                Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f10617b.iterator();
                int size = this.f10617b.size();
                if (AbstractC3761b.m30888e(i)) {
                    this.f10618c = (T) AbstractC3779g0.this.mo30661g(t);
                    this.f10620e = i;
                } else {
                    this.f10617b.clear();
                    AbstractC3779g0.this.m30816k(this.f10616a, this);
                }
                while (it.hasNext()) {
                    Pair<Consumer<T>, ProducerContext> next = it.next();
                    synchronized (next) {
                        if (AbstractC3761b.m30889d(i)) {
                            ((ProducerContext) next.second).mo30854i().mo1807j((ProducerContext) next.second, AbstractC3779g0.this.f10614d, null);
                            C3770d c3770d = this.f10621f;
                            if (c3770d != null) {
                                ((ProducerContext) next.second).mo30850m(c3770d.getExtras());
                            }
                            ((ProducerContext) next.second).mo30861b(AbstractC3779g0.this.f10615e, Integer.valueOf(size));
                        }
                        ((Consumer) next.first).mo30891b(t, i);
                    }
                }
            }
        }

        /* renamed from: p */
        public void m30800p(AbstractC3779g0<K, T>.C3781b.C3783b c3783b, float f) {
            synchronized (this) {
                if (this.f10622g != c3783b) {
                    return;
                }
                this.f10619d = f;
                Iterator<Pair<Consumer<T>, ProducerContext>> it = this.f10617b.iterator();
                while (it.hasNext()) {
                    Pair<Consumer<T>, ProducerContext> next = it.next();
                    synchronized (next) {
                        ((Consumer) next.first).mo30890c(f);
                    }
                }
            }
        }
    }

    public AbstractC3779g0(InterfaceC3810l0<T> interfaceC3810l0, String str, String str2) {
        this(interfaceC3810l0, str, str2, false);
    }

    /* renamed from: h */
    private synchronized AbstractC3779g0<K, T>.C3781b m30818h(K k) {
        AbstractC3779g0<K, T>.C3781b c3781b;
        c3781b = new C3781b(k);
        this.f10611a.put(k, c3781b);
        return c3781b;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<T> consumer, ProducerContext producerContext) {
        AbstractC3779g0<K, T>.C3781b m30817i;
        boolean z;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("MultiplexProducer#produceResults");
            }
            producerContext.mo30854i().mo1810d(producerContext, this.f10614d);
            K mo30660j = mo30660j(producerContext);
            do {
                synchronized (this) {
                    m30817i = m30817i(mo30660j);
                    if (m30817i == null) {
                        m30817i = m30818h(mo30660j);
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } while (!m30817i.m30808h(consumer, producerContext));
            if (z) {
                m30817i.m30799q(EnumC6102e.m23573c(producerContext.mo30849n()));
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: g */
    protected abstract T mo30661g(T t);

    /* renamed from: i */
    protected synchronized AbstractC3779g0<K, T>.C3781b m30817i(K k) {
        return this.f10611a.get(k);
    }

    /* renamed from: j */
    protected abstract K mo30660j(ProducerContext producerContext);

    /* renamed from: k */
    protected synchronized void m30816k(K k, AbstractC3779g0<K, T>.C3781b c3781b) {
        if (this.f10611a.get(k) == c3781b) {
            this.f10611a.remove(k);
        }
    }

    public AbstractC3779g0(InterfaceC3810l0<T> interfaceC3810l0, String str, String str2, boolean z) {
        this.f10612b = interfaceC3810l0;
        this.f10611a = new HashMap();
        this.f10613c = z;
        this.f10614d = str;
        this.f10615e = str2;
    }
}