package p416x4;

import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p414x2.C13677a;

/* renamed from: x4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13687b implements InterfaceC13689d {

    /* renamed from: a */
    private final List<InterfaceC13689d> f35214a;

    public C13687b(Set<InterfaceC13689d> set) {
        this.f35214a = new ArrayList(set.size());
        for (InterfaceC13689d interfaceC13689d : set) {
            if (interfaceC13689d != null) {
                this.f35214a.add(interfaceC13689d);
            }
        }
    }

    /* renamed from: l */
    private void m1805l(String str, Throwable th2) {
        C13677a.m1853k("ForwardingRequestListener2", str, th2);
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: a */
    public void mo1802a(ProducerContext producerContext) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1802a(producerContext);
            } catch (Exception e) {
                m1805l("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: b */
    public void mo1812b(ProducerContext producerContext, String str, boolean z) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1812b(producerContext, str, z);
            } catch (Exception e) {
                m1805l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: c */
    public void mo1811c(ProducerContext producerContext, String str, Map<String, String> map) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1811c(producerContext, str, map);
            } catch (Exception e) {
                m1805l("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: d */
    public void mo1810d(ProducerContext producerContext, String str) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1810d(producerContext, str);
            } catch (Exception e) {
                m1805l("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: e */
    public void mo1801e(ProducerContext producerContext) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1801e(producerContext);
            } catch (Exception e) {
                m1805l("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: f */
    public boolean mo1809f(ProducerContext producerContext, String str) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            if (this.f35214a.get(i).mo1809f(producerContext, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: g */
    public void mo1800g(ProducerContext producerContext) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1800g(producerContext);
            } catch (Exception e) {
                m1805l("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: h */
    public void mo1808h(ProducerContext producerContext, String str, String str2) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1808h(producerContext, str, str2);
            } catch (Exception e) {
                m1805l("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // p416x4.InterfaceC13689d
    /* renamed from: i */
    public void mo1799i(ProducerContext producerContext, Throwable th2) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1799i(producerContext, th2);
            } catch (Exception e) {
                m1805l("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: j */
    public void mo1807j(ProducerContext producerContext, String str, Map<String, String> map) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1807j(producerContext, str, map);
            } catch (Exception e) {
                m1805l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3820n0
    /* renamed from: k */
    public void mo1806k(ProducerContext producerContext, String str, Throwable th2, Map<String, String> map) {
        int size = this.f35214a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f35214a.get(i).mo1806k(producerContext, str, th2, map);
            } catch (Exception e) {
                m1805l("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }
}