package com.facebook.imagepipeline.producers;

import java.util.Map;
import p359u2.AbstractRunnableC12826g;

/* renamed from: com.facebook.imagepipeline.producers.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3838s0<T> extends AbstractRunnableC12826g<T> {

    /* renamed from: k */
    private final Consumer<T> f10787k;

    /* renamed from: l */
    private final InterfaceC3820n0 f10788l;

    /* renamed from: m */
    private final String f10789m;

    /* renamed from: n */
    private final ProducerContext f10790n;

    public AbstractC3838s0(Consumer<T> consumer, InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, String str) {
        this.f10787k = consumer;
        this.f10788l = interfaceC3820n0;
        this.f10789m = str;
        this.f10790n = producerContext;
        interfaceC3820n0.mo1810d(producerContext, str);
    }

    @Override // p359u2.AbstractRunnableC12826g
    /* renamed from: d */
    public void mo3856d() {
        Map<String, String> map;
        InterfaceC3820n0 interfaceC3820n0 = this.f10788l;
        ProducerContext producerContext = this.f10790n;
        String str = this.f10789m;
        if (interfaceC3820n0.mo1809f(producerContext, str)) {
            map = m30656g();
        } else {
            map = null;
        }
        interfaceC3820n0.mo1811c(producerContext, str, map);
        this.f10787k.mo30892a();
    }

    @Override // p359u2.AbstractRunnableC12826g
    /* renamed from: e */
    public void mo3855e(Exception exc) {
        Map<String, String> map;
        InterfaceC3820n0 interfaceC3820n0 = this.f10788l;
        ProducerContext producerContext = this.f10790n;
        String str = this.f10789m;
        if (interfaceC3820n0.mo1809f(producerContext, str)) {
            map = m30655h(exc);
        } else {
            map = null;
        }
        interfaceC3820n0.mo1806k(producerContext, str, exc, map);
        this.f10787k.onFailure(exc);
    }

    @Override // p359u2.AbstractRunnableC12826g
    /* renamed from: f */
    public void mo3854f(T t) {
        Map<String, String> map;
        InterfaceC3820n0 interfaceC3820n0 = this.f10788l;
        ProducerContext producerContext = this.f10790n;
        String str = this.f10789m;
        if (interfaceC3820n0.mo1809f(producerContext, str)) {
            map = mo30654i(t);
        } else {
            map = null;
        }
        interfaceC3820n0.mo1807j(producerContext, str, map);
        this.f10787k.mo30891b(t, 1);
    }

    /* renamed from: g */
    protected Map<String, String> m30656g() {
        return null;
    }

    /* renamed from: h */
    protected Map<String, String> m30655h(Exception exc) {
        return null;
    }

    /* renamed from: i */
    protected Map<String, String> mo30654i(T t) {
        return null;
    }
}