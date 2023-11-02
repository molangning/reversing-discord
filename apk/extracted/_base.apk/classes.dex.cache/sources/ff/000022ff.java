package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import p278p4.InterfaceC11392f;
import p380v4.C13065e;

/* renamed from: com.facebook.imagepipeline.producers.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3834r extends AbstractC3779g0<Pair<CacheKey, ImageRequest.RequestLevel>, C13065e> {

    /* renamed from: f */
    private final InterfaceC11392f f10779f;

    public C3834r(InterfaceC11392f interfaceC11392f, boolean z, InterfaceC3810l0 interfaceC3810l0) {
        super(interfaceC3810l0, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f10779f = interfaceC11392f;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3779g0
    /* renamed from: l */
    public C13065e mo30661g(C13065e c13065e) {
        return C13065e.m3336h(c13065e);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3779g0
    /* renamed from: m */
    public Pair<CacheKey, ImageRequest.RequestLevel> mo30660j(ProducerContext producerContext) {
        return Pair.create(this.f10779f.mo8149d(producerContext.mo30851l(), producerContext.mo30862a()), producerContext.mo30847p());
    }
}