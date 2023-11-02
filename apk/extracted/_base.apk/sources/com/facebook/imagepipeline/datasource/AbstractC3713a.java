package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.AbstractC3569a;
import com.facebook.imagepipeline.producers.AbstractC3761b;
import com.facebook.imagepipeline.producers.C3835r0;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.InterfaceC3810l0;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.Map;
import p006a5.C0025b;
import p394w2.C13379j;
import p416x4.InterfaceC13689d;

/* renamed from: com.facebook.imagepipeline.datasource.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3713a<T> extends AbstractC3569a<T> {

    /* renamed from: h */
    private final C3835r0 f10484h;

    /* renamed from: i */
    private final InterfaceC13689d f10485i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.datasource.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3714a extends AbstractC3761b<T> {
        C3714a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: f */
        protected void mo30625f() {
            AbstractC3713a.this.m31029D();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        protected void mo30606g(Throwable th2) {
            AbstractC3713a.this.m31028E(th2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: h */
        protected void mo30605h(T t, int i) {
            AbstractC3713a abstractC3713a = AbstractC3713a.this;
            abstractC3713a.mo31023F(t, i, abstractC3713a.f10484h);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: i */
        protected void mo30693i(float f) {
            AbstractC3713a.this.m31698s(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3713a(InterfaceC3810l0<T> interfaceC3810l0, C3835r0 c3835r0, InterfaceC13689d interfaceC13689d) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractProducerToDataSourceAdapter()");
        }
        this.f10484h = c3835r0;
        this.f10485i = interfaceC13689d;
        m31027G();
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        interfaceC13689d.mo1802a(c3835r0);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        interfaceC3810l0.mo30610b(m31031B(), c3835r0);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: B */
    private Consumer<T> m31031B() {
        return new C3714a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public synchronized void m31029D() {
        C13379j.m2675i(m31705k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m31028E(Throwable th2) {
        if (super.m31700q(th2, m31030C(this.f10484h))) {
            this.f10485i.mo1799i(this.f10484h, th2);
        }
    }

    /* renamed from: G */
    private void m31027G() {
        m31701o(this.f10484h.getExtras());
    }

    /* renamed from: C */
    protected Map<String, Object> m31030C(ProducerContext producerContext) {
        return producerContext.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo31023F(T t, int i, ProducerContext producerContext) {
        boolean m30889d = AbstractC3761b.m30889d(i);
        if (super.m31696u(t, m30889d, m31030C(producerContext)) && m30889d) {
            this.f10485i.mo1801e(this.f10484h);
        }
    }

    @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!super.mo31712a()) {
            this.f10485i.mo1800g(this.f10484h);
            this.f10484h.m30842u();
            return true;
        }
        return true;
    }
}
