package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.listener.RequestListener;
import p416x4.InterfaceC13689d;

/* renamed from: com.facebook.imagepipeline.producers.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3854x extends C3852w implements InterfaceC13689d {

    /* renamed from: c */
    private final RequestListener f10833c;

    /* renamed from: d */
    private final InterfaceC13689d f10834d;

    public C3854x(RequestListener requestListener, InterfaceC13689d interfaceC13689d) {
        super(requestListener, interfaceC13689d);
        this.f10833c = requestListener;
        this.f10834d = interfaceC13689d;
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: a */
    public void mo1802a(ProducerContext producerContext) {
        RequestListener requestListener = this.f10833c;
        if (requestListener != null) {
            requestListener.onRequestStart(producerContext.mo30851l(), producerContext.mo30862a(), producerContext.getId(), producerContext.mo30849n());
        }
        InterfaceC13689d interfaceC13689d = this.f10834d;
        if (interfaceC13689d != null) {
            interfaceC13689d.mo1802a(producerContext);
        }
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: e */
    public void mo1801e(ProducerContext producerContext) {
        RequestListener requestListener = this.f10833c;
        if (requestListener != null) {
            requestListener.onRequestSuccess(producerContext.mo30851l(), producerContext.getId(), producerContext.mo30849n());
        }
        InterfaceC13689d interfaceC13689d = this.f10834d;
        if (interfaceC13689d != null) {
            interfaceC13689d.mo1801e(producerContext);
        }
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: g */
    public void mo1800g(ProducerContext producerContext) {
        RequestListener requestListener = this.f10833c;
        if (requestListener != null) {
            requestListener.onRequestCancellation(producerContext.getId());
        }
        InterfaceC13689d interfaceC13689d = this.f10834d;
        if (interfaceC13689d != null) {
            interfaceC13689d.mo1800g(producerContext);
        }
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: i */
    public void mo1799i(ProducerContext producerContext, Throwable th2) {
        RequestListener requestListener = this.f10833c;
        if (requestListener != null) {
            requestListener.onRequestFailure(producerContext.mo30851l(), producerContext.getId(), th2, producerContext.mo30849n());
        }
        InterfaceC13689d interfaceC13689d = this.f10834d;
        if (interfaceC13689d != null) {
            interfaceC13689d.mo1799i(producerContext, th2);
        }
    }
}
