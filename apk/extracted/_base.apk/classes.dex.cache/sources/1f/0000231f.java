package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import p380v4.C13065e;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.producers.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3866y0 implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final InterfaceC3869z0<C13065e>[] f10862a;

    /* renamed from: com.facebook.imagepipeline.producers.y0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3867a extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final ProducerContext f10863c;

        /* renamed from: d */
        private final int f10864d;

        /* renamed from: e */
        private final ResizeOptions f10865e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3867a(Consumer<C13065e> consumer, ProducerContext producerContext, int i) {
            super(consumer);
            C3866y0.this = r1;
            this.f10863c = producerContext;
            this.f10864d = i;
            this.f10865e = producerContext.mo30851l().getResizeOptions();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        protected void mo30606g(Throwable th2) {
            if (!C3866y0.this.m30607e(this.f10864d + 1, m30692o(), this.f10863c)) {
                m30692o().onFailure(th2);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            if (c13065e != null && (AbstractC3761b.m30888e(i) || C3760a1.m30893c(c13065e, this.f10865e))) {
                m30692o().mo30891b(c13065e, i);
            } else if (AbstractC3761b.m30889d(i)) {
                C13065e.m3335i(c13065e);
                if (!C3866y0.this.m30607e(this.f10864d + 1, m30692o(), this.f10863c)) {
                    m30692o().mo30891b(null, 1);
                }
            }
        }
    }

    public C3866y0(InterfaceC3869z0<C13065e>... interfaceC3869z0Arr) {
        InterfaceC3869z0<C13065e>[] interfaceC3869z0Arr2 = (InterfaceC3869z0[]) C13379j.m2677g(interfaceC3869z0Arr);
        this.f10862a = interfaceC3869z0Arr2;
        C13379j.m2679e(0, interfaceC3869z0Arr2.length);
    }

    /* renamed from: d */
    private int m30608d(int i, ResizeOptions resizeOptions) {
        while (true) {
            InterfaceC3869z0<C13065e>[] interfaceC3869z0Arr = this.f10862a;
            if (i < interfaceC3869z0Arr.length) {
                if (interfaceC3869z0Arr[i].mo30599a(resizeOptions)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: e */
    public boolean m30607e(int i, Consumer<C13065e> consumer, ProducerContext producerContext) {
        int m30608d = m30608d(i, producerContext.mo30851l().getResizeOptions());
        if (m30608d == -1) {
            return false;
        }
        this.f10862a[m30608d].mo30610b(new C3867a(consumer, producerContext, m30608d), producerContext);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        if (producerContext.mo30851l().getResizeOptions() == null) {
            consumer.mo30891b(null, 1);
        } else if (!m30607e(0, consumer, producerContext)) {
            consumer.mo30891b(null, 1);
        }
    }
}