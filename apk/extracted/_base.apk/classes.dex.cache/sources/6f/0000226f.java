package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.producers.C3835r0;
import com.facebook.imagepipeline.producers.InterfaceC3810l0;
import com.facebook.imagepipeline.producers.ProducerContext;
import p006a5.C0025b;
import p416x4.InterfaceC13689d;

/* renamed from: com.facebook.imagepipeline.datasource.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3716c<T> extends AbstractC3713a<CloseableReference<T>> {
    private C3716c(InterfaceC3810l0<CloseableReference<T>> interfaceC3810l0, C3835r0 c3835r0, InterfaceC13689d interfaceC13689d) {
        super(interfaceC3810l0, c3835r0, interfaceC13689d);
    }

    /* renamed from: I */
    public static <T> DataSource<CloseableReference<T>> m31021I(InterfaceC3810l0<CloseableReference<T>> interfaceC3810l0, C3835r0 c3835r0, InterfaceC13689d interfaceC13689d) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("CloseableProducerToDataSourceAdapter#create");
        }
        C3716c c3716c = new C3716c(interfaceC3810l0, c3835r0, interfaceC13689d);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return c3716c;
    }

    @Override // com.facebook.datasource.AbstractC3569a
    /* renamed from: H */
    public void mo31017h(CloseableReference<T> closeableReference) {
        CloseableReference.m31715v(closeableReference);
    }

    @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
    /* renamed from: J */
    public CloseableReference<T> mo31018g() {
        return CloseableReference.m31717s((CloseableReference) super.mo31018g());
    }

    @Override // com.facebook.imagepipeline.datasource.AbstractC3713a
    /* renamed from: K */
    public void mo31023F(CloseableReference<T> closeableReference, int i, ProducerContext producerContext) {
        super.mo31023F(CloseableReference.m31717s(closeableReference), i, producerContext);
    }
}