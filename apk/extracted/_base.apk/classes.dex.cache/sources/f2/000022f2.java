package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3821o<I, O> extends AbstractC3761b<I> {

    /* renamed from: b */
    private final Consumer<O> f10743b;

    public AbstractC3821o(Consumer<O> consumer) {
        this.f10743b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3761b
    /* renamed from: f */
    protected void mo30625f() {
        this.f10743b.mo30892a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3761b
    /* renamed from: g */
    protected void mo30606g(Throwable th2) {
        this.f10743b.onFailure(th2);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3761b
    /* renamed from: i */
    public void mo30693i(float f) {
        this.f10743b.mo30890c(f);
    }

    /* renamed from: o */
    public Consumer<O> m30692o() {
        return this.f10743b;
    }
}