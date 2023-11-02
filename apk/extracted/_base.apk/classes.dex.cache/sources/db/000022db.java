package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import p380v4.C13065e;

/* renamed from: com.facebook.imagepipeline.producers.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3798k implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final InterfaceC3810l0<C13065e> f10682a;

    /* renamed from: b */
    private final InterfaceC3810l0<C13065e> f10683b;

    /* renamed from: com.facebook.imagepipeline.producers.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C3800b extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private ProducerContext f10684c;

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        protected void mo30606g(Throwable th2) {
            C3798k.this.f10683b.mo30610b(m30692o(), this.f10684c);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            ImageRequest mo30851l = this.f10684c.mo30851l();
            boolean m30889d = AbstractC3761b.m30889d(i);
            boolean m30893c = C3760a1.m30893c(c13065e, mo30851l.getResizeOptions());
            if (c13065e != null && (m30893c || mo30851l.getLocalThumbnailPreviewsEnabled())) {
                if (m30889d && m30893c) {
                    m30692o().mo30891b(c13065e, i);
                } else {
                    m30692o().mo30891b(c13065e, AbstractC3761b.m30883n(i, 1));
                }
            }
            if (m30889d && !m30893c) {
                C13065e.m3335i(c13065e);
                C3798k.this.f10683b.mo30610b(m30692o(), this.f10684c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C3800b(Consumer<C13065e> consumer, ProducerContext producerContext) {
            super(consumer);
            C3798k.this = r1;
            this.f10684c = producerContext;
        }
    }

    public C3798k(InterfaceC3810l0<C13065e> interfaceC3810l0, InterfaceC3810l0<C13065e> interfaceC3810l02) {
        this.f10682a = interfaceC3810l0;
        this.f10683b = interfaceC3810l02;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        this.f10682a.mo30610b(new C3800b(consumer, producerContext), producerContext);
    }
}