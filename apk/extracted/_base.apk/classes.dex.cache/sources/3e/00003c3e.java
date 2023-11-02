package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8667g3 extends AbstractC8624X2 implements InterfaceC8356D {
    C8667g3(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        super(abstractC8744w0, spliterator, z);
    }

    public C8667g3(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        super(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17604l(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC8483n interfaceC8483n) {
        if (this.f22810h != null || this.f22811i) {
            do {
            } while (tryAdvance(interfaceC8483n));
            return;
        }
        interfaceC8483n.getClass();
        m17529h();
        C8662f3 c8662f3 = new C8662f3(interfaceC8483n, 1);
        this.f22804b.mo17321w1(this.f22806d, c8662f3);
        this.f22811i = true;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17609e(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: i */
    final void mo17436i() {
        C8573K2 c8573k2 = new C8573K2();
        this.f22810h = c8573k2;
        this.f22807e = this.f22804b.mo17319x1(new C8662f3(c8573k2, 0));
        this.f22808f = new C8633a(4, this);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: j */
    final AbstractC8624X2 mo17435j(Spliterator spliterator) {
        return new C8667g3(this.f22804b, spliterator, this.f22803a);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        boolean m17531e = m17531e();
        if (m17531e) {
            C8573K2 c8573k2 = (C8573K2) this.f22810h;
            long j = this.f22809g;
            int m17553u = c8573k2.m17553u(j);
            interfaceC8483n.accept((c8573k2.f22843c == 0 && m17553u == 0) ? ((double[]) c8573k2.f22745e)[(int) j] : ((double[][]) c8573k2.f22746f)[m17553u][(int) (j - c8573k2.f22844d[m17553u])]);
        }
        return m17531e;
    }

    @Override // p164j$.util.stream.AbstractC8624X2, p164j$.util.Spliterator
    public final InterfaceC8356D trySplit() {
        return (InterfaceC8356D) super.trySplit();
    }
}