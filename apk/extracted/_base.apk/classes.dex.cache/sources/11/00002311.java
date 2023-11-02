package com.facebook.imagepipeline.producers;

import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3852w implements InterfaceC3820n0 {

    /* renamed from: a */
    private final InterfaceC3822o0 f10828a;

    /* renamed from: b */
    private final InterfaceC3820n0 f10829b;

    public C3852w(InterfaceC3822o0 interfaceC3822o0, InterfaceC3820n0 interfaceC3820n0) {
        this.f10828a = interfaceC3822o0;
        this.f10829b = interfaceC3820n0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: b */
    public void mo1812b(ProducerContext producerContext, String str, boolean z) {
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            interfaceC3822o0.onUltimateProducerReached(producerContext.getId(), str, z);
        }
        InterfaceC3820n0 interfaceC3820n0 = this.f10829b;
        if (interfaceC3820n0 != null) {
            interfaceC3820n0.mo1812b(producerContext, str, z);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: c */
    public void mo1811c(ProducerContext producerContext, String str, Map<String, String> map) {
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            interfaceC3822o0.onProducerFinishWithCancellation(producerContext.getId(), str, map);
        }
        InterfaceC3820n0 interfaceC3820n0 = this.f10829b;
        if (interfaceC3820n0 != null) {
            interfaceC3820n0.mo1811c(producerContext, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: d */
    public void mo1810d(ProducerContext producerContext, String str) {
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            interfaceC3822o0.onProducerStart(producerContext.getId(), str);
        }
        InterfaceC3820n0 interfaceC3820n0 = this.f10829b;
        if (interfaceC3820n0 != null) {
            interfaceC3820n0.mo1810d(producerContext, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: f */
    public boolean mo1809f(ProducerContext producerContext, String str) {
        boolean z;
        InterfaceC3820n0 interfaceC3820n0;
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            z = interfaceC3822o0.requiresExtraMap(producerContext.getId());
        } else {
            z = false;
        }
        if (!z && (interfaceC3820n0 = this.f10829b) != null) {
            return interfaceC3820n0.mo1809f(producerContext, str);
        }
        return z;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: h */
    public void mo1808h(ProducerContext producerContext, String str, String str2) {
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            interfaceC3822o0.onProducerEvent(producerContext.getId(), str, str2);
        }
        InterfaceC3820n0 interfaceC3820n0 = this.f10829b;
        if (interfaceC3820n0 != null) {
            interfaceC3820n0.mo1808h(producerContext, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: j */
    public void mo1807j(ProducerContext producerContext, String str, Map<String, String> map) {
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            interfaceC3822o0.onProducerFinishWithSuccess(producerContext.getId(), str, map);
        }
        InterfaceC3820n0 interfaceC3820n0 = this.f10829b;
        if (interfaceC3820n0 != null) {
            interfaceC3820n0.mo1807j(producerContext, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: k */
    public void mo1806k(ProducerContext producerContext, String str, Throwable th2, Map<String, String> map) {
        InterfaceC3822o0 interfaceC3822o0 = this.f10828a;
        if (interfaceC3822o0 != null) {
            interfaceC3822o0.onProducerFinishWithFailure(producerContext.getId(), str, th2, map);
        }
        InterfaceC3820n0 interfaceC3820n0 = this.f10829b;
        if (interfaceC3820n0 != null) {
            interfaceC3820n0.mo1806k(producerContext, str, th2, map);
        }
    }
}