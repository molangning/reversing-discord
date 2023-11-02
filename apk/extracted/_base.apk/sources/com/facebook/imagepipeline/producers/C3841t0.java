package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3841t0<T> implements InterfaceC3810l0<Void> {

    /* renamed from: a */
    private final InterfaceC3810l0<T> f10803a;

    /* renamed from: com.facebook.imagepipeline.producers.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3842a extends AbstractC3821o<T, Void> {
        C3842a(Consumer consumer) {
            super(consumer);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: h */
        protected void mo30605h(T t, int i) {
            if (AbstractC3761b.m30889d(i)) {
                m30692o().mo30891b(null, i);
            }
        }
    }

    public C3841t0(InterfaceC3810l0<T> interfaceC3810l0) {
        this.f10803a = interfaceC3810l0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<Void> consumer, ProducerContext producerContext) {
        this.f10803a.mo30610b(new C3842a(consumer), producerContext);
    }
}
