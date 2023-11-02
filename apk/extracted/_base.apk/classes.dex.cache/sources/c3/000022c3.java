package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p380v4.AbstractC13063c;

/* renamed from: com.facebook.imagepipeline.producers.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3774f extends C3784h {
    public C3774f(InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11392f interfaceC11392f, InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        super(interfaceC11413s, interfaceC11392f, interfaceC3810l0);
    }

    @Override // com.facebook.imagepipeline.producers.C3784h
    /* renamed from: d */
    protected String mo30793d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C3784h
    /* renamed from: e */
    protected String mo30792e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C3784h
    /* renamed from: g */
    protected Consumer<CloseableReference<AbstractC13063c>> mo30790g(Consumer<CloseableReference<AbstractC13063c>> consumer, CacheKey cacheKey, boolean z) {
        return consumer;
    }
}