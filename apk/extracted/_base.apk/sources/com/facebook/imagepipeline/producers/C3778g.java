package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import p278p4.InterfaceC11392f;
import p380v4.AbstractC13063c;

/* renamed from: com.facebook.imagepipeline.producers.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3778g extends AbstractC3779g0<Pair<CacheKey, ImageRequest.RequestLevel>, CloseableReference<AbstractC13063c>> {

    /* renamed from: f */
    private final InterfaceC11392f f10610f;

    public C3778g(InterfaceC11392f interfaceC11392f, InterfaceC3810l0 interfaceC3810l0) {
        super(interfaceC3810l0, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f10610f = interfaceC11392f;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3779g0
    /* renamed from: l */
    public CloseableReference<AbstractC13063c> mo30661g(CloseableReference<AbstractC13063c> closeableReference) {
        return CloseableReference.m31717s(closeableReference);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.AbstractC3779g0
    /* renamed from: m */
    public Pair<CacheKey, ImageRequest.RequestLevel> mo30660j(ProducerContext producerContext) {
        return Pair.create(this.f10610f.mo8152a(producerContext.mo30851l(), producerContext.mo30862a()), producerContext.mo30847p());
    }
}
