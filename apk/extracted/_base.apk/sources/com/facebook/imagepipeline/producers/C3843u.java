package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.producers.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3843u implements InterfaceC3851v0 {

    /* renamed from: a */
    private final Executor f10805a;

    public C3843u(Executor executor) {
        this.f10805a = (Executor) C13379j.m2677g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3851v0
    /* renamed from: a */
    public void mo30631a(Runnable runnable) {
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3851v0
    /* renamed from: b */
    public void mo30630b(Runnable runnable) {
        this.f10805a.execute(runnable);
    }
}
