package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import p380v4.AbstractC13063c;
import p380v4.C13064d;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.producers.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3788i implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC3810l0<CloseableReference<AbstractC13063c>> f10638a;

    /* renamed from: b */
    private final int f10639b;

    /* renamed from: c */
    private final int f10640c;

    /* renamed from: d */
    private final boolean f10641d;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C3789a extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> {

        /* renamed from: c */
        private final int f10642c;

        /* renamed from: d */
        private final int f10643d;

        C3789a(Consumer<CloseableReference<AbstractC13063c>> consumer, int i, int i2) {
            super(consumer);
            this.f10642c = i;
            this.f10643d = i2;
        }

        /* renamed from: p */
        private void m30774p(CloseableReference<AbstractC13063c> closeableReference) {
            AbstractC13063c m31730D;
            Bitmap mo3363o;
            int rowBytes;
            if (closeableReference == null || !closeableReference.m31728I() || (m31730D = closeableReference.m31730D()) == null || m31730D.isClosed() || !(m31730D instanceof C13064d) || (mo3363o = ((C13064d) m31730D).mo3363o()) == null || (rowBytes = mo3363o.getRowBytes() * mo3363o.getHeight()) < this.f10642c || rowBytes > this.f10643d) {
                return;
            }
            mo3363o.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: q */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            m30774p(closeableReference);
            m30692o().mo30891b(closeableReference, i);
        }
    }

    public C3788i(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        this.f10638a = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
        this.f10639b = i;
        this.f10640c = i2;
        this.f10641d = z;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        if (producerContext.mo30849n() && !this.f10641d) {
            this.f10638a.mo30610b(consumer, producerContext);
        } else {
            this.f10638a.mo30610b(new C3789a(consumer, this.f10639b, this.f10640c), producerContext);
        }
    }
}
