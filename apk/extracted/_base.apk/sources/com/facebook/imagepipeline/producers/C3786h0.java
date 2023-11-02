package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.InputStream;
import java.util.Map;
import p006a5.C0025b;
import p380v4.C13065e;
import p380v4.EnumC13066f;
import p455z2.AbstractC14082j;
import p455z2.InterfaceC14072a;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3786h0 implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    protected final InterfaceC14080h f10633a;

    /* renamed from: b */
    private final InterfaceC14072a f10634b;

    /* renamed from: c */
    private final NetworkFetcher f10635c;

    /* renamed from: com.facebook.imagepipeline.producers.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3787a implements NetworkFetcher.Callback {

        /* renamed from: a */
        final /* synthetic */ FetchState f10636a;

        C3787a(FetchState fetchState) {
            this.f10636a = fetchState;
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        /* renamed from: a */
        public void mo30776a() {
            C3786h0.this.m30780k(this.f10636a);
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        /* renamed from: b */
        public void mo30775b(InputStream inputStream, int i) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("NetworkFetcher->onResponse");
            }
            C3786h0.this.m30778m(this.f10636a, inputStream, i);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
        public void onFailure(Throwable th2) {
            C3786h0.this.m30779l(this.f10636a, th2);
        }
    }

    public C3786h0(InterfaceC14080h interfaceC14080h, InterfaceC14072a interfaceC14072a, NetworkFetcher networkFetcher) {
        this.f10633a = interfaceC14080h;
        this.f10634b = interfaceC14072a;
        this.f10635c = networkFetcher;
    }

    /* renamed from: e */
    protected static float m30786e(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp((-i) / 50000.0d));
    }

    /* renamed from: f */
    private Map<String, String> m30785f(FetchState fetchState, int i) {
        if (!fetchState.m30914d().mo1809f(fetchState.m30916b(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f10635c.getExtraMap(fetchState, i);
    }

    /* renamed from: j */
    protected static void m30781j(AbstractC14082j abstractC14082j, int i, BytesRange bytesRange, Consumer<C13065e> consumer, ProducerContext producerContext) {
        C13065e c13065e;
        CloseableReference m31726R = CloseableReference.m31726R(abstractC14082j.mo716a());
        C13065e c13065e2 = null;
        try {
            c13065e = new C13065e(m31726R);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            c13065e.m3355C0(bytesRange);
            c13065e.m3327t0();
            producerContext.mo30855h(EnumC13066f.NETWORK);
            consumer.mo30891b(c13065e, i);
            C13065e.m3335i(c13065e);
            CloseableReference.m31715v(m31726R);
        } catch (Throwable th3) {
            th = th3;
            c13065e2 = c13065e;
            C13065e.m3335i(c13065e2);
            CloseableReference.m31715v(m31726R);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m30780k(FetchState fetchState) {
        fetchState.m30914d().mo1811c(fetchState.m30916b(), "NetworkFetchProducer", null);
        fetchState.m30917a().mo30892a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m30779l(FetchState fetchState, Throwable th2) {
        fetchState.m30914d().mo1806k(fetchState.m30916b(), "NetworkFetchProducer", th2, null);
        fetchState.m30914d().mo1812b(fetchState.m30916b(), "NetworkFetchProducer", false);
        fetchState.m30916b().mo30856g("network");
        fetchState.m30917a().onFailure(th2);
    }

    /* renamed from: n */
    private boolean m30777n(FetchState fetchState) {
        if (!fetchState.m30916b().mo30853j()) {
            return false;
        }
        return this.f10635c.shouldPropagate(fetchState);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        producerContext.mo30854i().mo1810d(producerContext, "NetworkFetchProducer");
        FetchState createFetchState = this.f10635c.createFetchState(consumer, producerContext);
        this.f10635c.fetch(createFetchState, new C3787a(createFetchState));
    }

    /* renamed from: g */
    protected long m30784g() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    protected void m30783h(AbstractC14082j abstractC14082j, FetchState fetchState) {
        Map<String, String> m30785f = m30785f(fetchState, abstractC14082j.size());
        InterfaceC3820n0 m30914d = fetchState.m30914d();
        m30914d.mo1807j(fetchState.m30916b(), "NetworkFetchProducer", m30785f);
        m30914d.mo1812b(fetchState.m30916b(), "NetworkFetchProducer", true);
        fetchState.m30916b().mo30856g("network");
        m30781j(abstractC14082j, fetchState.m30913e() | 1, fetchState.m30912f(), fetchState.m30917a(), fetchState.m30916b());
    }

    /* renamed from: i */
    protected void m30782i(AbstractC14082j abstractC14082j, FetchState fetchState) {
        long m30784g = m30784g();
        if (m30777n(fetchState) && m30784g - fetchState.m30915c() >= 100) {
            fetchState.m30910h(m30784g);
            fetchState.m30914d().mo1808h(fetchState.m30916b(), "NetworkFetchProducer", "intermediate_result");
            m30781j(abstractC14082j, fetchState.m30913e(), fetchState.m30912f(), fetchState.m30917a(), fetchState.m30916b());
        }
    }

    /* renamed from: m */
    protected void m30778m(FetchState fetchState, InputStream inputStream, int i) {
        AbstractC14082j mo719c;
        if (i > 0) {
            mo719c = this.f10633a.mo717e(i);
        } else {
            mo719c = this.f10633a.mo719c();
        }
        byte[] bArr = this.f10634b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    if (read > 0) {
                        mo719c.write(bArr, 0, read);
                        m30782i(mo719c, fetchState);
                        fetchState.m30917a().mo30890c(m30786e(mo719c.size(), i));
                    }
                } else {
                    this.f10635c.onFetchCompletion(fetchState, mo719c.size());
                    m30783h(mo719c, fetchState);
                    return;
                }
            } finally {
                this.f10634b.release(bArr);
                mo719c.close();
            }
        }
    }
}
