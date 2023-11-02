package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p380v4.AbstractC13063c;

/* renamed from: com.facebook.imagepipeline.producers.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3818n implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC3810l0<CloseableReference<AbstractC13063c>> f10738a;

    /* renamed from: b */
    private final ScheduledExecutorService f10739b;

    /* renamed from: com.facebook.imagepipeline.producers.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC3819a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Consumer f10740j;

        /* renamed from: k */
        final /* synthetic */ ProducerContext f10741k;

        RunnableC3819a(Consumer consumer, ProducerContext producerContext) {
            this.f10740j = consumer;
            this.f10741k = producerContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3818n.this.f10738a.mo30610b(this.f10740j, this.f10741k);
        }
    }

    public C3818n(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0, ScheduledExecutorService scheduledExecutorService) {
        this.f10738a = interfaceC3810l0;
        this.f10739b = scheduledExecutorService;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        ImageRequest mo30851l = producerContext.mo30851l();
        ScheduledExecutorService scheduledExecutorService = this.f10739b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new RunnableC3819a(consumer, producerContext), mo30851l.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.f10738a.mo30610b(consumer, producerContext);
        }
    }
}
