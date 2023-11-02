package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p006a5.C0025b;
import p170j4.C8793c;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p380v4.C13065e;
import p394w2.C13372f;
import p455z2.InterfaceC14078g;

/* renamed from: com.facebook.imagepipeline.producers.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3836s implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final InterfaceC11413s<CacheKey, InterfaceC14078g> f10780a;

    /* renamed from: b */
    private final InterfaceC11392f f10781b;

    /* renamed from: c */
    private final InterfaceC3810l0<C13065e> f10782c;

    /* renamed from: com.facebook.imagepipeline.producers.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3837a extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final InterfaceC11413s<CacheKey, InterfaceC14078g> f10783c;

        /* renamed from: d */
        private final CacheKey f10784d;

        /* renamed from: e */
        private final boolean f10785e;

        /* renamed from: f */
        private final boolean f10786f;

        public C3837a(Consumer<C13065e> consumer, InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s, CacheKey cacheKey, boolean z, boolean z2) {
            super(consumer);
            this.f10783c = interfaceC11413s;
            this.f10784d = cacheKey;
            this.f10785e = z;
            this.f10786f = z2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            CloseableReference<InterfaceC14078g> closeableReference;
            boolean m41375d;
            try {
                if (C0025b.m41375d()) {
                    C0025b.m41378a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC3761b.m30888e(i) && c13065e != null && !AbstractC3761b.m30885l(i, 10) && c13065e.m3358A() != C8793c.f23093c) {
                    CloseableReference<InterfaceC14078g> m3332m = c13065e.m3332m();
                    if (m3332m != null) {
                        if (this.f10786f && this.f10785e) {
                            closeableReference = this.f10783c.mo8109c(this.f10784d, m3332m);
                        } else {
                            closeableReference = null;
                        }
                        CloseableReference.m31715v(m3332m);
                        if (closeableReference != null) {
                            C13065e c13065e2 = new C13065e(closeableReference);
                            c13065e2.m3334j(c13065e);
                            CloseableReference.m31715v(closeableReference);
                            m30692o().mo30890c(1.0f);
                            m30692o().mo30891b(c13065e2, i);
                            C13065e.m3335i(c13065e2);
                            if (m41375d) {
                                return;
                            }
                            return;
                        }
                    }
                    m30692o().mo30891b(c13065e, i);
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                        return;
                    }
                    return;
                }
                m30692o().mo30891b(c13065e, i);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            } finally {
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            }
        }
    }

    public C3836s(InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s, InterfaceC11392f interfaceC11392f, InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10780a = interfaceC11413s;
        this.f10781b = interfaceC11392f;
        this.f10782c = interfaceC3810l0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        Map<String, String> map;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("EncodedMemoryCacheProducer#produceResults");
            }
            InterfaceC3820n0 mo30854i = producerContext.mo30854i();
            mo30854i.mo1810d(producerContext, "EncodedMemoryCacheProducer");
            CacheKey mo8149d = this.f10781b.mo8149d(producerContext.mo30851l(), producerContext.mo30862a());
            CloseableReference<InterfaceC14078g> closeableReference = this.f10780a.get(mo8149d);
            Map<String, String> map2 = null;
            if (closeableReference != null) {
                C13065e c13065e = new C13065e(closeableReference);
                if (mo30854i.mo1809f(producerContext, "EncodedMemoryCacheProducer")) {
                    map2 = C13372f.m2695of("cached_value_found", "true");
                }
                mo30854i.mo1807j(producerContext, "EncodedMemoryCacheProducer", map2);
                mo30854i.mo1812b(producerContext, "EncodedMemoryCacheProducer", true);
                producerContext.mo30856g("memory_encoded");
                consumer.mo30890c(1.0f);
                consumer.mo30891b(c13065e, 1);
                C13065e.m3335i(c13065e);
                CloseableReference.m31715v(closeableReference);
            } else if (producerContext.mo30847p().m30597b() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.m30597b()) {
                if (mo30854i.mo1809f(producerContext, "EncodedMemoryCacheProducer")) {
                    map = C13372f.m2695of("cached_value_found", "false");
                } else {
                    map = null;
                }
                mo30854i.mo1807j(producerContext, "EncodedMemoryCacheProducer", map);
                mo30854i.mo1812b(producerContext, "EncodedMemoryCacheProducer", false);
                producerContext.mo30858e("memory_encoded", "nil-result");
                consumer.mo30891b(null, 1);
                CloseableReference.m31715v(closeableReference);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            } else {
                C3837a c3837a = new C3837a(consumer, this.f10780a, mo8149d, producerContext.mo30851l().isMemoryCacheEnabled(), producerContext.mo30859d().mo6448D().m31085q());
                if (mo30854i.mo1809f(producerContext, "EncodedMemoryCacheProducer")) {
                    map2 = C13372f.m2695of("cached_value_found", "false");
                }
                mo30854i.mo1807j(producerContext, "EncodedMemoryCacheProducer", map2);
                this.f10782c.mo30610b(c3837a, producerContext);
                CloseableReference.m31715v(closeableReference);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }
}
