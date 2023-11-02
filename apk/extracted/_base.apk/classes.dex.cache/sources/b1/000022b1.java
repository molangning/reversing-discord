package com.facebook.imagepipeline.producers;

import p380v4.C13065e;

/* renamed from: com.facebook.imagepipeline.producers.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3756a implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final InterfaceC3810l0<C13065e> f10560a;

    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3758b extends AbstractC3821o<C13065e, C13065e> {
        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            if (c13065e == null) {
                m30692o().mo30891b(null, i);
                return;
            }
            if (!C13065e.m3338b0(c13065e)) {
                c13065e.m3327t0();
            }
            m30692o().mo30891b(c13065e, i);
        }

        private C3758b(Consumer<C13065e> consumer) {
            super(consumer);
        }
    }

    public C3756a(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10560a = interfaceC3810l0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        this.f10560a.mo30610b(new C3758b(consumer), producerContext);
    }
}