package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p380v4.C13065e;
import p394w2.C13372f;
import p433y0.C13857f;
import p433y0.InterfaceC13855d;

/* renamed from: com.facebook.imagepipeline.producers.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3823p implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final C11386e f10744a;

    /* renamed from: b */
    private final C11386e f10745b;

    /* renamed from: c */
    private final InterfaceC11392f f10746c;

    /* renamed from: d */
    private final InterfaceC3810l0<C13065e> f10747d;

    /* renamed from: com.facebook.imagepipeline.producers.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3824a implements InterfaceC13855d<C13065e, Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3820n0 f10748a;

        /* renamed from: b */
        final /* synthetic */ ProducerContext f10749b;

        /* renamed from: c */
        final /* synthetic */ Consumer f10750c;

        C3824a(InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, Consumer consumer) {
            C3823p.this = r1;
            this.f10748a = interfaceC3820n0;
            this.f10749b = producerContext;
            this.f10750c = consumer;
        }

        @Override // p433y0.InterfaceC13855d
        /* renamed from: b */
        public Void mo1375a(C13857f<C13065e> c13857f) {
            if (C3823p.m30688f(c13857f)) {
                this.f10748a.mo1811c(this.f10749b, "DiskCacheProducer", null);
                this.f10750c.mo30892a();
            } else if (c13857f.m1380n()) {
                this.f10748a.mo1806k(this.f10749b, "DiskCacheProducer", c13857f.m1385i(), null);
                C3823p.this.f10747d.mo30610b(this.f10750c, this.f10749b);
            } else {
                C13065e m1384j = c13857f.m1384j();
                if (m1384j != null) {
                    InterfaceC3820n0 interfaceC3820n0 = this.f10748a;
                    ProducerContext producerContext = this.f10749b;
                    interfaceC3820n0.mo1807j(producerContext, "DiskCacheProducer", C3823p.m30689e(interfaceC3820n0, producerContext, true, m1384j.m3344R()));
                    this.f10748a.mo1812b(this.f10749b, "DiskCacheProducer", true);
                    this.f10749b.mo30856g("disk");
                    this.f10750c.mo30890c(1.0f);
                    this.f10750c.mo30891b(m1384j, 1);
                    m1384j.close();
                } else {
                    InterfaceC3820n0 interfaceC3820n02 = this.f10748a;
                    ProducerContext producerContext2 = this.f10749b;
                    interfaceC3820n02.mo1807j(producerContext2, "DiskCacheProducer", C3823p.m30689e(interfaceC3820n02, producerContext2, false, 0));
                    C3823p.this.f10747d.mo30610b(this.f10750c, this.f10749b);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3825b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f10752a;

        C3825b(AtomicBoolean atomicBoolean) {
            C3823p.this = r1;
            this.f10752a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            this.f10752a.set(true);
        }
    }

    public C3823p(C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10744a = c11386e;
        this.f10745b = c11386e2;
        this.f10746c = interfaceC11392f;
        this.f10747d = interfaceC3810l0;
    }

    /* renamed from: e */
    static Map<String, String> m30689e(InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, boolean z, int i) {
        if (!interfaceC3820n0.mo1809f(producerContext, "DiskCacheProducer")) {
            return null;
        }
        if (z) {
            return C13372f.m2694of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C13372f.m2695of("cached_value_found", String.valueOf(z));
    }

    /* renamed from: f */
    public static boolean m30688f(C13857f<?> c13857f) {
        if (!c13857f.m1382l() && (!c13857f.m1380n() || !(c13857f.m1385i() instanceof CancellationException))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m30687g(Consumer<C13065e> consumer, ProducerContext producerContext) {
        if (producerContext.mo30847p().m30597b() >= ImageRequest.RequestLevel.DISK_CACHE.m30597b()) {
            producerContext.mo30858e("disk", "nil-result_read");
            consumer.mo30891b(null, 1);
            return;
        }
        this.f10747d.mo30610b(consumer, producerContext);
    }

    /* renamed from: h */
    private InterfaceC13855d<C13065e, Void> m30686h(Consumer<C13065e> consumer, ProducerContext producerContext) {
        return new C3824a(producerContext.mo30854i(), producerContext, consumer);
    }

    /* renamed from: i */
    private void m30685i(AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.mo30860c(new C3825b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        boolean z;
        C11386e c11386e;
        ImageRequest mo30851l = producerContext.mo30851l();
        if (!mo30851l.isDiskCacheEnabled()) {
            m30687g(consumer, producerContext);
            return;
        }
        producerContext.mo30854i().mo1810d(producerContext, "DiskCacheProducer");
        CacheKey mo8149d = this.f10746c.mo8149d(mo30851l, producerContext.mo30862a());
        if (mo30851l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c11386e = this.f10745b;
        } else {
            c11386e = this.f10744a;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c11386e.m8175n(mo8149d, atomicBoolean).m1389e(m30686h(consumer, producerContext));
        m30685i(atomicBoolean, producerContext);
    }
}