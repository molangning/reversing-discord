package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p380v4.C13065e;
import p394w2.C13368b;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3767c0 implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final Executor f10578a;

    /* renamed from: b */
    private final InterfaceC14080h f10579b;

    /* renamed from: com.facebook.imagepipeline.producers.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3768a extends AbstractC3838s0<C13065e> {

        /* renamed from: o */
        final /* synthetic */ ImageRequest f10580o;

        /* renamed from: p */
        final /* synthetic */ InterfaceC3820n0 f10581p;

        /* renamed from: q */
        final /* synthetic */ ProducerContext f10582q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3768a(Consumer consumer, InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, String str, ImageRequest imageRequest, InterfaceC3820n0 interfaceC3820n02, ProducerContext producerContext2) {
            super(consumer, interfaceC3820n0, producerContext, str);
            this.f10580o = imageRequest;
            this.f10581p = interfaceC3820n02;
            this.f10582q = producerContext2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: j */
        public void mo3858b(C13065e c13065e) {
            C13065e.m3335i(c13065e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: k */
        public C13065e mo3857c() {
            C13065e mo30603d = AbstractC3767c0.this.mo30603d(this.f10580o);
            if (mo30603d == null) {
                this.f10581p.mo1812b(this.f10582q, AbstractC3767c0.this.mo30602f(), false);
                this.f10582q.mo30856g("local");
                return null;
            }
            mo30603d.m3327t0();
            this.f10581p.mo1812b(this.f10582q, AbstractC3767c0.this.mo30602f(), true);
            this.f10582q.mo30856g("local");
            return mo30603d;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3769b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ AbstractC3838s0 f10584a;

        C3769b(AbstractC3838s0 abstractC3838s0) {
            this.f10584a = abstractC3838s0;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            this.f10584a.m3859a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3767c0(Executor executor, InterfaceC14080h interfaceC14080h) {
        this.f10578a = executor;
        this.f10579b = interfaceC14080h;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        InterfaceC3820n0 mo30854i = producerContext.mo30854i();
        ImageRequest mo30851l = producerContext.mo30851l();
        producerContext.mo30858e("local", "fetch");
        C3768a c3768a = new C3768a(consumer, mo30854i, producerContext, mo30602f(), mo30851l, mo30854i, producerContext);
        producerContext.mo30860c(new C3769b(c3768a));
        this.f10578a.execute(c3768a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C13065e m30866c(InputStream inputStream, int i) {
        CloseableReference m31726R;
        CloseableReference closeableReference = null;
        try {
            if (i <= 0) {
                m31726R = CloseableReference.m31726R(this.f10579b.mo721a(inputStream));
            } else {
                m31726R = CloseableReference.m31726R(this.f10579b.mo720b(inputStream, i));
            }
            closeableReference = m31726R;
            return new C13065e(closeableReference);
        } finally {
            C13368b.m2699b(inputStream);
            CloseableReference.m31715v(closeableReference);
        }
    }

    /* renamed from: d */
    protected abstract C13065e mo30603d(ImageRequest imageRequest);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C13065e m30865e(InputStream inputStream, int i) {
        return m30866c(inputStream, i);
    }

    /* renamed from: f */
    protected abstract String mo30602f();
}
