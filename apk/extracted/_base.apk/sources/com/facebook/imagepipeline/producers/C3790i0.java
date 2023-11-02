package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p170j4.C8793c;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p380v4.C13065e;
import p394w2.C13372f;
import p394w2.C13379j;
import p414x2.C13677a;
import p433y0.C13857f;
import p433y0.InterfaceC13855d;
import p455z2.AbstractC14082j;
import p455z2.InterfaceC14072a;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3790i0 implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final C11386e f10644a;

    /* renamed from: b */
    private final InterfaceC11392f f10645b;

    /* renamed from: c */
    private final InterfaceC14080h f10646c;

    /* renamed from: d */
    private final InterfaceC14072a f10647d;

    /* renamed from: e */
    private final InterfaceC3810l0<C13065e> f10648e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.i0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3791a implements InterfaceC13855d<C13065e, Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3820n0 f10649a;

        /* renamed from: b */
        final /* synthetic */ ProducerContext f10650b;

        /* renamed from: c */
        final /* synthetic */ Consumer f10651c;

        /* renamed from: d */
        final /* synthetic */ CacheKey f10652d;

        C3791a(InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, Consumer consumer, CacheKey cacheKey) {
            this.f10649a = interfaceC3820n0;
            this.f10650b = producerContext;
            this.f10651c = consumer;
            this.f10652d = cacheKey;
        }

        @Override // p433y0.InterfaceC13855d
        /* renamed from: b */
        public Void mo1375a(C13857f<C13065e> c13857f) {
            if (C3790i0.m30768g(c13857f)) {
                this.f10649a.mo1811c(this.f10650b, "PartialDiskCacheProducer", null);
                this.f10651c.mo30892a();
            } else if (c13857f.m1380n()) {
                this.f10649a.mo1806k(this.f10650b, "PartialDiskCacheProducer", c13857f.m1385i(), null);
                C3790i0.this.m30766i(this.f10651c, this.f10650b, this.f10652d, null);
            } else {
                C13065e m1384j = c13857f.m1384j();
                if (m1384j != null) {
                    InterfaceC3820n0 interfaceC3820n0 = this.f10649a;
                    ProducerContext producerContext = this.f10650b;
                    interfaceC3820n0.mo1807j(producerContext, "PartialDiskCacheProducer", C3790i0.m30769f(interfaceC3820n0, producerContext, true, m1384j.m3344R()));
                    BytesRange m31196e = BytesRange.m31196e(m1384j.m3344R() - 1);
                    m1384j.m3355C0(m31196e);
                    int m3344R = m1384j.m3344R();
                    ImageRequest mo30851l = this.f10650b.mo30851l();
                    if (m31196e.m31200a(mo30851l.getBytesRange())) {
                        this.f10650b.mo30858e("disk", "partial");
                        this.f10649a.mo1812b(this.f10650b, "PartialDiskCacheProducer", true);
                        this.f10651c.mo30891b(m1384j, 9);
                    } else {
                        this.f10651c.mo30891b(m1384j, 8);
                        C3790i0.this.m30766i(this.f10651c, new C3835r0(ImageRequestBuilder.m30584b(mo30851l).m30565u(BytesRange.m31199b(m3344R - 1)).m30585a(), this.f10650b), this.f10652d, m1384j);
                    }
                } else {
                    InterfaceC3820n0 interfaceC3820n02 = this.f10649a;
                    ProducerContext producerContext2 = this.f10650b;
                    interfaceC3820n02.mo1807j(producerContext2, "PartialDiskCacheProducer", C3790i0.m30769f(interfaceC3820n02, producerContext2, false, 0));
                    C3790i0.this.m30766i(this.f10651c, this.f10650b, this.f10652d, m1384j);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.i0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3792b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f10654a;

        C3792b(AtomicBoolean atomicBoolean) {
            this.f10654a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            this.f10654a.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.i0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3793c extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final C11386e f10656c;

        /* renamed from: d */
        private final CacheKey f10657d;

        /* renamed from: e */
        private final InterfaceC14080h f10658e;

        /* renamed from: f */
        private final InterfaceC14072a f10659f;

        /* renamed from: g */
        private final C13065e f10660g;

        /* synthetic */ C3793c(Consumer consumer, C11386e c11386e, CacheKey cacheKey, InterfaceC14080h interfaceC14080h, InterfaceC14072a interfaceC14072a, C13065e c13065e, C3791a c3791a) {
            this(consumer, c11386e, cacheKey, interfaceC14080h, interfaceC14072a, c13065e);
        }

        /* renamed from: p */
        private void m30763p(InputStream inputStream, OutputStream outputStream, int i) {
            byte[] bArr = this.f10659f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } finally {
                    this.f10659f.release(bArr);
                }
            }
            if (i2 <= 0) {
                return;
            }
            throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* renamed from: q */
        private AbstractC14082j m30762q(C13065e c13065e, C13065e c13065e2) {
            int i = ((BytesRange) C13379j.m2677g(c13065e2.m3331o())).f10282a;
            AbstractC14082j mo717e = this.f10658e.mo717e(c13065e2.m3344R() + i);
            m30763p(c13065e.m3349H(), mo717e, i);
            m30763p(c13065e2.m3349H(), mo717e, c13065e2.m3344R());
            return mo717e;
        }

        /* renamed from: s */
        private void m30760s(AbstractC14082j abstractC14082j) {
            C13065e c13065e;
            Throwable th2;
            CloseableReference m31726R = CloseableReference.m31726R(abstractC14082j.mo716a());
            try {
                c13065e = new C13065e(m31726R);
            } catch (Throwable th3) {
                c13065e = null;
                th2 = th3;
            }
            try {
                c13065e.m3327t0();
                m30692o().mo30891b(c13065e, 1);
                C13065e.m3335i(c13065e);
                CloseableReference.m31715v(m31726R);
            } catch (Throwable th4) {
                th2 = th4;
                C13065e.m3335i(c13065e);
                CloseableReference.m31715v(m31726R);
                throw th2;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: r */
        public void mo30605h(C13065e c13065e, int i) {
            if (AbstractC3761b.m30888e(i)) {
                return;
            }
            if (this.f10660g != null && c13065e != null && c13065e.m3331o() != null) {
                try {
                    try {
                        m30760s(m30762q(this.f10660g, c13065e));
                    } catch (IOException e) {
                        C13677a.m1853k("PartialDiskCacheProducer", "Error while merging image data", e);
                        m30692o().onFailure(e);
                    }
                    this.f10656c.m8171r(this.f10657d);
                } finally {
                    c13065e.close();
                    this.f10660g.close();
                }
            } else if (AbstractC3761b.m30884m(i, 8) && AbstractC3761b.m30889d(i) && c13065e != null && c13065e.m3358A() != C8793c.f23093c) {
                this.f10656c.m8173p(this.f10657d, c13065e);
                m30692o().mo30891b(c13065e, i);
            } else {
                m30692o().mo30891b(c13065e, i);
            }
        }

        private C3793c(Consumer<C13065e> consumer, C11386e c11386e, CacheKey cacheKey, InterfaceC14080h interfaceC14080h, InterfaceC14072a interfaceC14072a, C13065e c13065e) {
            super(consumer);
            this.f10656c = c11386e;
            this.f10657d = cacheKey;
            this.f10658e = interfaceC14080h;
            this.f10659f = interfaceC14072a;
            this.f10660g = c13065e;
        }
    }

    public C3790i0(C11386e c11386e, InterfaceC11392f interfaceC11392f, InterfaceC14080h interfaceC14080h, InterfaceC14072a interfaceC14072a, InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10644a = c11386e;
        this.f10645b = interfaceC11392f;
        this.f10646c = interfaceC14080h;
        this.f10647d = interfaceC14072a;
        this.f10648e = interfaceC3810l0;
    }

    /* renamed from: e */
    private static Uri m30770e(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: f */
    static Map<String, String> m30769f(InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, boolean z, int i) {
        if (!interfaceC3820n0.mo1809f(producerContext, "PartialDiskCacheProducer")) {
            return null;
        }
        if (z) {
            return C13372f.m2694of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C13372f.m2695of("cached_value_found", String.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static boolean m30768g(C13857f<?> c13857f) {
        if (!c13857f.m1382l() && (!c13857f.m1380n() || !(c13857f.m1385i() instanceof CancellationException))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private InterfaceC13855d<C13065e, Void> m30767h(Consumer<C13065e> consumer, ProducerContext producerContext, CacheKey cacheKey) {
        return new C3791a(producerContext.mo30854i(), producerContext, consumer, cacheKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m30766i(Consumer<C13065e> consumer, ProducerContext producerContext, CacheKey cacheKey, C13065e c13065e) {
        this.f10648e.mo30610b(new C3793c(consumer, this.f10644a, cacheKey, this.f10646c, this.f10647d, c13065e, null), producerContext);
    }

    /* renamed from: j */
    private void m30765j(AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.mo30860c(new C3792b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        ImageRequest mo30851l = producerContext.mo30851l();
        if (!mo30851l.isDiskCacheEnabled()) {
            this.f10648e.mo30610b(consumer, producerContext);
            return;
        }
        producerContext.mo30854i().mo1810d(producerContext, "PartialDiskCacheProducer");
        CacheKey mo8151b = this.f10645b.mo8151b(mo30851l, m30770e(mo30851l), producerContext.mo30862a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f10644a.m8175n(mo8151b, atomicBoolean).m1389e(m30767h(consumer, producerContext, mo8151b));
        m30765j(atomicBoolean, producerContext);
    }
}
