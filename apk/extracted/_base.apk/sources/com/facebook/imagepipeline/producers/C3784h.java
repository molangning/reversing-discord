package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p006a5.C0025b;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p380v4.AbstractC13063c;
import p380v4.InterfaceC13067g;
import p380v4.InterfaceC13069i;
import p394w2.C13372f;

/* renamed from: com.facebook.imagepipeline.producers.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3784h implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC11413s<CacheKey, AbstractC13063c> f10627a;

    /* renamed from: b */
    private final InterfaceC11392f f10628b;

    /* renamed from: c */
    private final InterfaceC3810l0<CloseableReference<AbstractC13063c>> f10629c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3785a extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> {

        /* renamed from: c */
        final /* synthetic */ CacheKey f10630c;

        /* renamed from: d */
        final /* synthetic */ boolean f10631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3785a(Consumer consumer, CacheKey cacheKey, boolean z) {
            super(consumer);
            this.f10630c = cacheKey;
            this.f10631d = z;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            CloseableReference<AbstractC13063c> closeableReference2;
            boolean m41375d;
            try {
                if (C0025b.m41375d()) {
                    C0025b.m41378a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean m30889d = AbstractC3761b.m30889d(i);
                CloseableReference<AbstractC13063c> closeableReference3 = null;
                if (closeableReference == null) {
                    if (m30889d) {
                        m30692o().mo30891b(null, i);
                    }
                    if (m41375d) {
                        return;
                    }
                    return;
                }
                if (!closeableReference.m31730D().mo3370i() && !AbstractC3761b.m30884m(i, 8)) {
                    if (!m30889d && (closeableReference2 = C3784h.this.f10627a.get(this.f10630c)) != null) {
                        InterfaceC13069i mo3365a = closeableReference.m31730D().mo3365a();
                        InterfaceC13069i mo3365a2 = closeableReference2.m31730D().mo3365a();
                        if (!mo3365a2.mo3323a() && mo3365a2.mo3321c() < mo3365a.mo3321c()) {
                            CloseableReference.m31715v(closeableReference2);
                        } else {
                            m30692o().mo30891b(closeableReference2, i);
                            CloseableReference.m31715v(closeableReference2);
                            if (C0025b.m41375d()) {
                                C0025b.m41377b();
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f10631d) {
                        closeableReference3 = C3784h.this.f10627a.mo8109c(this.f10630c, closeableReference);
                    }
                    if (m30889d) {
                        m30692o().mo30890c(1.0f);
                    }
                    Consumer<CloseableReference<AbstractC13063c>> m30692o = m30692o();
                    if (closeableReference3 != null) {
                        closeableReference = closeableReference3;
                    }
                    m30692o.mo30891b(closeableReference, i);
                    CloseableReference.m31715v(closeableReference3);
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                        return;
                    }
                    return;
                }
                m30692o().mo30891b(closeableReference, i);
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

    public C3784h(InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11392f interfaceC11392f, InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        this.f10627a = interfaceC11413s;
        this.f10628b = interfaceC11392f;
        this.f10629c = interfaceC3810l0;
    }

    /* renamed from: f */
    private static void m30791f(InterfaceC13067g interfaceC13067g, ProducerContext producerContext) {
        producerContext.mo30850m(interfaceC13067g.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        Map<String, String> map;
        boolean m41375d;
        Map<String, String> map2;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("BitmapMemoryCacheProducer#produceResults");
            }
            InterfaceC3820n0 mo30854i = producerContext.mo30854i();
            mo30854i.mo1810d(producerContext, mo30792e());
            CacheKey mo8152a = this.f10628b.mo8152a(producerContext.mo30851l(), producerContext.mo30862a());
            CloseableReference<AbstractC13063c> closeableReference = this.f10627a.get(mo8152a);
            Map<String, String> map3 = null;
            if (closeableReference != null) {
                m30791f(closeableReference.m31730D(), producerContext);
                boolean mo3323a = closeableReference.m31730D().mo3365a().mo3323a();
                if (mo3323a) {
                    String mo30792e = mo30792e();
                    if (mo30854i.mo1809f(producerContext, mo30792e())) {
                        map2 = C13372f.m2695of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    mo30854i.mo1807j(producerContext, mo30792e, map2);
                    mo30854i.mo1812b(producerContext, mo30792e(), true);
                    producerContext.mo30858e("memory_bitmap", mo30793d());
                    consumer.mo30890c(1.0f);
                }
                consumer.mo30891b(closeableReference, AbstractC3761b.m30886k(mo3323a));
                closeableReference.close();
                if (mo3323a) {
                    if (m41375d) {
                        return;
                    }
                    return;
                }
            }
            if (producerContext.mo30847p().m30597b() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.m30597b()) {
                String mo30792e2 = mo30792e();
                if (mo30854i.mo1809f(producerContext, mo30792e())) {
                    map = C13372f.m2695of("cached_value_found", "false");
                } else {
                    map = null;
                }
                mo30854i.mo1807j(producerContext, mo30792e2, map);
                mo30854i.mo1812b(producerContext, mo30792e(), false);
                producerContext.mo30858e("memory_bitmap", mo30793d());
                consumer.mo30891b(null, 1);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                    return;
                }
                return;
            }
            Consumer<CloseableReference<AbstractC13063c>> mo30790g = mo30790g(consumer, mo8152a, producerContext.mo30851l().isMemoryCacheEnabled());
            String mo30792e3 = mo30792e();
            if (mo30854i.mo1809f(producerContext, mo30792e())) {
                map3 = C13372f.m2695of("cached_value_found", "false");
            }
            mo30854i.mo1807j(producerContext, mo30792e3, map3);
            if (C0025b.m41375d()) {
                C0025b.m41378a("mInputProducer.produceResult");
            }
            this.f10629c.mo30610b(mo30790g, producerContext);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: d */
    protected String mo30793d() {
        return "pipe_bg";
    }

    /* renamed from: e */
    protected String mo30792e() {
        return "BitmapMemoryCacheProducer";
    }

    /* renamed from: g */
    protected Consumer<CloseableReference<AbstractC13063c>> mo30790g(Consumer<CloseableReference<AbstractC13063c>> consumer, CacheKey cacheKey, boolean z) {
        return new C3785a(consumer, cacheKey, z);
    }
}
