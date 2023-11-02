package com.facebook.imagepipeline.producers;

import p006a5.C0025b;
import p394w2.C13379j;
import p396w4.C13388a;

/* renamed from: com.facebook.imagepipeline.producers.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3844u0<T> implements InterfaceC3810l0<T> {

    /* renamed from: a */
    private final InterfaceC3810l0<T> f10806a;

    /* renamed from: b */
    private final InterfaceC3851v0 f10807b;

    /* renamed from: com.facebook.imagepipeline.producers.u0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3845a extends AbstractC3838s0<T> {

        /* renamed from: o */
        final /* synthetic */ InterfaceC3820n0 f10808o;

        /* renamed from: p */
        final /* synthetic */ ProducerContext f10809p;

        /* renamed from: q */
        final /* synthetic */ Consumer f10810q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3845a(Consumer consumer, InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, String str, InterfaceC3820n0 interfaceC3820n02, ProducerContext producerContext2, Consumer consumer2) {
            super(consumer, interfaceC3820n0, producerContext, str);
            this.f10808o = interfaceC3820n02;
            this.f10809p = producerContext2;
            this.f10810q = consumer2;
        }

        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: b */
        protected void mo3858b(T t) {
        }

        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: c */
        protected T mo3857c() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0, p359u2.AbstractRunnableC12826g
        /* renamed from: f */
        public void mo3854f(T t) {
            this.f10808o.mo1807j(this.f10809p, "BackgroundThreadHandoffProducer", null);
            C3844u0.this.f10806a.mo30610b(this.f10810q, this.f10809p);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.u0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3846b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ AbstractC3838s0 f10812a;

        C3846b(AbstractC3838s0 abstractC3838s0) {
            this.f10812a = abstractC3838s0;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            this.f10812a.m3859a();
            C3844u0.this.f10807b.mo30631a(this.f10812a);
        }
    }

    public C3844u0(InterfaceC3810l0<T> interfaceC3810l0, InterfaceC3851v0 interfaceC3851v0) {
        this.f10806a = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
        this.f10807b = interfaceC3851v0;
    }

    /* renamed from: e */
    private static String m30649e(ProducerContext producerContext) {
        if (C13388a.m2662b()) {
            return "ThreadHandoffProducer_produceResults_" + producerContext.getId();
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<T> consumer, ProducerContext producerContext) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ThreadHandoffProducer#produceResults");
            }
            InterfaceC3820n0 mo30854i = producerContext.mo30854i();
            C3845a c3845a = new C3845a(consumer, mo30854i, producerContext, "BackgroundThreadHandoffProducer", mo30854i, producerContext, consumer);
            producerContext.mo30860c(new C3846b(c3845a));
            this.f10807b.mo30630b(C13388a.m2663a(c3845a, m30649e(producerContext)));
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }
}
