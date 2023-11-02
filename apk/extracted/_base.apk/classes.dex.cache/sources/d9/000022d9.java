package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.InterfaceC3872a;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p380v4.AbstractC13063c;
import p394w2.C13372f;

/* renamed from: com.facebook.imagepipeline.producers.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3796j0 implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC11413s<CacheKey, AbstractC13063c> f10675a;

    /* renamed from: b */
    private final InterfaceC11392f f10676b;

    /* renamed from: c */
    private final InterfaceC3810l0<CloseableReference<AbstractC13063c>> f10677c;

    /* renamed from: com.facebook.imagepipeline.producers.j0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3797a extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> {

        /* renamed from: c */
        private final CacheKey f10678c;

        /* renamed from: d */
        private final boolean f10679d;

        /* renamed from: e */
        private final InterfaceC11413s<CacheKey, AbstractC13063c> f10680e;

        /* renamed from: f */
        private final boolean f10681f;

        public C3797a(Consumer<CloseableReference<AbstractC13063c>> consumer, CacheKey cacheKey, boolean z, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, boolean z2) {
            super(consumer);
            this.f10678c = cacheKey;
            this.f10679d = z;
            this.f10680e = interfaceC11413s;
            this.f10681f = z2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            CloseableReference<AbstractC13063c> closeableReference2 = null;
            if (closeableReference == null) {
                if (AbstractC3761b.m30889d(i)) {
                    m30692o().mo30891b(null, i);
                }
            } else if (AbstractC3761b.m30888e(i) && !this.f10679d) {
            } else {
                if (this.f10681f) {
                    closeableReference2 = this.f10680e.mo8109c(this.f10678c, closeableReference);
                }
                try {
                    m30692o().mo30890c(1.0f);
                    Consumer<CloseableReference<AbstractC13063c>> m30692o = m30692o();
                    if (closeableReference2 != null) {
                        closeableReference = closeableReference2;
                    }
                    m30692o.mo30891b(closeableReference, i);
                } finally {
                    CloseableReference.m31715v(closeableReference2);
                }
            }
        }
    }

    public C3796j0(InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11392f interfaceC11392f, InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        this.f10675a = interfaceC11413s;
        this.f10676b = interfaceC11392f;
        this.f10677c = interfaceC3810l0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        InterfaceC3820n0 mo30854i = producerContext.mo30854i();
        ImageRequest mo30851l = producerContext.mo30851l();
        Object mo30862a = producerContext.mo30862a();
        Postprocessor postprocessor = mo30851l.getPostprocessor();
        if (postprocessor != null && postprocessor.getPostprocessorCacheKey() != null) {
            mo30854i.mo1810d(producerContext, m30757c());
            CacheKey mo8150c = this.f10676b.mo8150c(mo30851l, mo30862a);
            CloseableReference<AbstractC13063c> closeableReference = this.f10675a.get(mo8150c);
            Map<String, String> map = null;
            if (closeableReference != null) {
                String m30757c = m30757c();
                if (mo30854i.mo1809f(producerContext, m30757c())) {
                    map = C13372f.m2695of("cached_value_found", "true");
                }
                mo30854i.mo1807j(producerContext, m30757c, map);
                mo30854i.mo1812b(producerContext, "PostprocessedBitmapMemoryCacheProducer", true);
                producerContext.mo30858e("memory_bitmap", "postprocessed");
                consumer.mo30890c(1.0f);
                consumer.mo30891b(closeableReference, 1);
                closeableReference.close();
                return;
            }
            C3797a c3797a = new C3797a(consumer, mo8150c, postprocessor instanceof InterfaceC3872a, this.f10675a, producerContext.mo30851l().isMemoryCacheEnabled());
            String m30757c2 = m30757c();
            if (mo30854i.mo1809f(producerContext, m30757c())) {
                map = C13372f.m2695of("cached_value_found", "false");
            }
            mo30854i.mo1807j(producerContext, m30757c2, map);
            this.f10677c.mo30610b(c3797a, producerContext);
            return;
        }
        this.f10677c.mo30610b(consumer, producerContext);
    }

    /* renamed from: c */
    protected String m30757c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}