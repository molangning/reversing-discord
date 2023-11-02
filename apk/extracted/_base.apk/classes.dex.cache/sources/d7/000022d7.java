package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import p006a5.C0025b;
import p278p4.C11385d;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p380v4.AbstractC13063c;
import p455z2.InterfaceC14078g;

/* renamed from: com.facebook.imagepipeline.producers.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3794j implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC11413s<CacheKey, InterfaceC14078g> f10661a;

    /* renamed from: b */
    private final C11386e f10662b;

    /* renamed from: c */
    private final C11386e f10663c;

    /* renamed from: d */
    private final InterfaceC11392f f10664d;

    /* renamed from: e */
    private final InterfaceC3810l0<CloseableReference<AbstractC13063c>> f10665e;

    /* renamed from: f */
    private final C11385d<CacheKey> f10666f;

    /* renamed from: g */
    private final C11385d<CacheKey> f10667g;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3795a extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> {

        /* renamed from: c */
        private final ProducerContext f10668c;

        /* renamed from: d */
        private final InterfaceC11413s<CacheKey, InterfaceC14078g> f10669d;

        /* renamed from: e */
        private final C11386e f10670e;

        /* renamed from: f */
        private final C11386e f10671f;

        /* renamed from: g */
        private final InterfaceC11392f f10672g;

        /* renamed from: h */
        private final C11385d<CacheKey> f10673h;

        /* renamed from: i */
        private final C11385d<CacheKey> f10674i;

        public C3795a(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext, InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, C11385d<CacheKey> c11385d, C11385d<CacheKey> c11385d2) {
            super(consumer);
            this.f10668c = producerContext;
            this.f10669d = interfaceC11413s;
            this.f10670e = c11386e;
            this.f10671f = c11386e2;
            this.f10672g = interfaceC11392f;
            this.f10673h = c11385d;
            this.f10674i = c11385d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            boolean m41375d;
            boolean z;
            C11386e c11386e;
            try {
                if (C0025b.m41375d()) {
                    C0025b.m41378a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC3761b.m30888e(i) && closeableReference != null && !AbstractC3761b.m30885l(i, 8)) {
                    ImageRequest mo30851l = this.f10668c.mo30851l();
                    CacheKey mo8149d = this.f10672g.mo8149d(mo30851l, this.f10668c.mo30862a());
                    String str = (String) this.f10668c.mo30848o("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f10668c.mo30859d().mo6448D().m31084r() && !this.f10673h.m8189b(mo8149d)) {
                            this.f10669d.mo8110b(mo8149d);
                            this.f10673h.m8190a(mo8149d);
                        }
                        if (this.f10668c.mo30859d().mo6448D().m31086p() && !this.f10674i.m8189b(mo8149d)) {
                            if (mo30851l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c11386e = this.f10671f;
                            } else {
                                c11386e = this.f10670e;
                            }
                            c11386e.m8181h(mo8149d);
                            this.f10674i.m8190a(mo8149d);
                        }
                    }
                    m30692o().mo30891b(closeableReference, i);
                    if (m41375d) {
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

    public C3794j(InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, C11385d<CacheKey> c11385d, C11385d<CacheKey> c11385d2, InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        this.f10661a = interfaceC11413s;
        this.f10662b = c11386e;
        this.f10663c = c11386e2;
        this.f10664d = interfaceC11392f;
        this.f10666f = c11385d;
        this.f10667g = c11385d2;
        this.f10665e = interfaceC3810l0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("BitmapProbeProducer#produceResults");
            }
            InterfaceC3820n0 mo30854i = producerContext.mo30854i();
            mo30854i.mo1810d(producerContext, m30759c());
            C3795a c3795a = new C3795a(consumer, producerContext, this.f10661a, this.f10662b, this.f10663c, this.f10664d, this.f10666f, this.f10667g);
            mo30854i.mo1807j(producerContext, "BitmapProbeProducer", null);
            if (C0025b.m41375d()) {
                C0025b.m41378a("mInputProducer.produceResult");
            }
            this.f10665e.mo30610b(c3795a, producerContext);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: c */
    protected String m30759c() {
        return "BitmapProbeProducer";
    }
}