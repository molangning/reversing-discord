package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.producers.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3855x0<T> implements InterfaceC3810l0<T> {

    /* renamed from: a */
    private final InterfaceC3810l0<T> f10835a;

    /* renamed from: b */
    private final int f10836b;

    /* renamed from: e */
    private final Executor f10839e;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<Pair<Consumer<T>, ProducerContext>> f10838d = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private int f10837c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.x0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3857b extends AbstractC3821o<T, T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.x0$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class RunnableC3858a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ Pair f10841j;

            RunnableC3858a(Pair pair) {
                this.f10841j = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3855x0 c3855x0 = C3855x0.this;
                Pair pair = this.f10841j;
                c3855x0.m30626f((Consumer) pair.first, (ProducerContext) pair.second);
            }
        }

        /* renamed from: p */
        private void m30624p() {
            Pair pair;
            synchronized (C3855x0.this) {
                pair = (Pair) C3855x0.this.f10838d.poll();
                if (pair == null) {
                    C3855x0.m30628d(C3855x0.this);
                }
            }
            if (pair != null) {
                C3855x0.this.f10839e.execute(new RunnableC3858a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: f */
        protected void mo30625f() {
            m30692o().mo30892a();
            m30624p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        protected void mo30606g(Throwable th2) {
            m30692o().onFailure(th2);
            m30624p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: h */
        protected void mo30605h(T t, int i) {
            m30692o().mo30891b(t, i);
            if (AbstractC3761b.m30889d(i)) {
                m30624p();
            }
        }

        private C3857b(Consumer<T> consumer) {
            super(consumer);
        }
    }

    public C3855x0(int i, Executor executor, InterfaceC3810l0<T> interfaceC3810l0) {
        this.f10836b = i;
        this.f10839e = (Executor) C13379j.m2677g(executor);
        this.f10835a = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
    }

    /* renamed from: d */
    static /* synthetic */ int m30628d(C3855x0 c3855x0) {
        int i = c3855x0.f10837c;
        c3855x0.f10837c = i - 1;
        return i;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<T> consumer, ProducerContext producerContext) {
        boolean z;
        producerContext.mo30854i().mo1810d(producerContext, "ThrottlingProducer");
        synchronized (this) {
            int i = this.f10837c;
            z = true;
            if (i >= this.f10836b) {
                this.f10838d.add(Pair.create(consumer, producerContext));
            } else {
                this.f10837c = i + 1;
                z = false;
            }
        }
        if (!z) {
            m30626f(consumer, producerContext);
        }
    }

    /* renamed from: f */
    void m30626f(Consumer<T> consumer, ProducerContext producerContext) {
        producerContext.mo30854i().mo1807j(producerContext, "ThrottlingProducer", null);
        this.f10835a.mo30610b(new C3857b(consumer), producerContext);
    }
}
