package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import p006a5.C0025b;
import p170j4.C8793c;
import p278p4.C11385d;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p380v4.C13065e;

/* renamed from: com.facebook.imagepipeline.producers.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3839t implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final C11386e f10791a;

    /* renamed from: b */
    private final C11386e f10792b;

    /* renamed from: c */
    private final InterfaceC11392f f10793c;

    /* renamed from: d */
    private final InterfaceC3810l0<C13065e> f10794d;

    /* renamed from: e */
    private final C11385d<CacheKey> f10795e;

    /* renamed from: f */
    private final C11385d<CacheKey> f10796f;

    /* renamed from: com.facebook.imagepipeline.producers.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3840a extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final ProducerContext f10797c;

        /* renamed from: d */
        private final C11386e f10798d;

        /* renamed from: e */
        private final C11386e f10799e;

        /* renamed from: f */
        private final InterfaceC11392f f10800f;

        /* renamed from: g */
        private final C11385d<CacheKey> f10801g;

        /* renamed from: h */
        private final C11385d<CacheKey> f10802h;

        public C3840a(Consumer<C13065e> consumer, ProducerContext producerContext, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, C11385d<CacheKey> c11385d, C11385d<CacheKey> c11385d2) {
            super(consumer);
            this.f10797c = producerContext;
            this.f10798d = c11386e;
            this.f10799e = c11386e2;
            this.f10800f = interfaceC11392f;
            this.f10801g = c11385d;
            this.f10802h = c11385d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            boolean m41375d;
            boolean z;
            C11386e c11386e;
            try {
                if (C0025b.m41375d()) {
                    C0025b.m41378a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC3761b.m30888e(i) && c13065e != null && !AbstractC3761b.m30885l(i, 10) && c13065e.m3358A() != C8793c.f23093c) {
                    ImageRequest mo30851l = this.f10797c.mo30851l();
                    CacheKey mo8149d = this.f10800f.mo8149d(mo30851l, this.f10797c.mo30862a());
                    this.f10801g.m8190a(mo8149d);
                    if ("memory_encoded".equals(this.f10797c.mo30848o("origin"))) {
                        if (!this.f10802h.m8189b(mo8149d)) {
                            if (mo30851l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c11386e = this.f10799e;
                            } else {
                                c11386e = this.f10798d;
                            }
                            c11386e.m8181h(mo8149d);
                            this.f10802h.m8190a(mo8149d);
                        }
                    } else if ("disk".equals(this.f10797c.mo30848o("origin"))) {
                        this.f10802h.m8190a(mo8149d);
                    }
                    m30692o().mo30891b(c13065e, i);
                    if (m41375d) {
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

    public C3839t(C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, C11385d c11385d, C11385d c11385d2, InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10791a = c11386e;
        this.f10792b = c11386e2;
        this.f10793c = interfaceC11392f;
        this.f10795e = c11385d;
        this.f10796f = c11385d2;
        this.f10794d = interfaceC3810l0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("EncodedProbeProducer#produceResults");
            }
            InterfaceC3820n0 mo30854i = producerContext.mo30854i();
            mo30854i.mo1810d(producerContext, m30653c());
            C3840a c3840a = new C3840a(consumer, producerContext, this.f10791a, this.f10792b, this.f10793c, this.f10795e, this.f10796f);
            mo30854i.mo1807j(producerContext, "EncodedProbeProducer", null);
            if (C0025b.m41375d()) {
                C0025b.m41378a("mInputProducer.produceResult");
            }
            this.f10794d.mo30610b(c3840a, producerContext);
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
    protected String m30653c() {
        return "EncodedProbeProducer";
    }
}
