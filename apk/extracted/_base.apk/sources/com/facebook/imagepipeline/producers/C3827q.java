package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import p170j4.C8793c;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p380v4.C13065e;

/* renamed from: com.facebook.imagepipeline.producers.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3827q implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final C11386e f10755a;

    /* renamed from: b */
    private final C11386e f10756b;

    /* renamed from: c */
    private final InterfaceC11392f f10757c;

    /* renamed from: d */
    private final InterfaceC3810l0<C13065e> f10758d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3829b extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final ProducerContext f10759c;

        /* renamed from: d */
        private final C11386e f10760d;

        /* renamed from: e */
        private final C11386e f10761e;

        /* renamed from: f */
        private final InterfaceC11392f f10762f;

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            this.f10759c.mo30854i().mo1810d(this.f10759c, "DiskCacheWriteProducer");
            if (!AbstractC3761b.m30888e(i) && c13065e != null && !AbstractC3761b.m30885l(i, 10) && c13065e.m3358A() != C8793c.f23093c) {
                ImageRequest mo30851l = this.f10759c.mo30851l();
                CacheKey mo8149d = this.f10762f.mo8149d(mo30851l, this.f10759c.mo30862a());
                if (mo30851l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                    this.f10761e.m8173p(mo8149d, c13065e);
                } else {
                    this.f10760d.m8173p(mo8149d, c13065e);
                }
                this.f10759c.mo30854i().mo1807j(this.f10759c, "DiskCacheWriteProducer", null);
                m30692o().mo30891b(c13065e, i);
                return;
            }
            this.f10759c.mo30854i().mo1807j(this.f10759c, "DiskCacheWriteProducer", null);
            m30692o().mo30891b(c13065e, i);
        }

        private C3829b(Consumer<C13065e> consumer, ProducerContext producerContext, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f) {
            super(consumer);
            this.f10759c = producerContext;
            this.f10760d = c11386e;
            this.f10761e = c11386e2;
            this.f10762f = interfaceC11392f;
        }
    }

    public C3827q(C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10755a = c11386e;
        this.f10756b = c11386e2;
        this.f10757c = interfaceC11392f;
        this.f10758d = interfaceC3810l0;
    }

    /* renamed from: c */
    private void m30683c(Consumer<C13065e> consumer, ProducerContext producerContext) {
        if (producerContext.mo30847p().m30597b() >= ImageRequest.RequestLevel.DISK_CACHE.m30597b()) {
            producerContext.mo30858e("disk", "nil-result_write");
            consumer.mo30891b(null, 1);
            return;
        }
        if (producerContext.mo30851l().isDiskCacheEnabled()) {
            consumer = new C3829b(consumer, producerContext, this.f10755a, this.f10756b, this.f10757c);
        }
        this.f10758d.mo30610b(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        m30683c(consumer, producerContext);
    }
}
