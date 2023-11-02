package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8362J;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.k3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8687k3 extends AbstractC8624X2 implements InterfaceC8362J {
    C8687k3(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        super(abstractC8744w0, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8687k3(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        super(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17602n(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC8468f0 interfaceC8468f0) {
        if (this.f22810h != null || this.f22811i) {
            do {
            } while (tryAdvance(interfaceC8468f0));
            return;
        }
        interfaceC8468f0.getClass();
        m17529h();
        C8682j3 c8682j3 = new C8682j3(interfaceC8468f0, 1);
        this.f22804b.mo17321w1(this.f22806d, c8682j3);
        this.f22811i = true;
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        boolean m17531e = m17531e();
        if (m17531e) {
            C8589O2 c8589o2 = (C8589O2) this.f22810h;
            long j = this.f22809g;
            int m17553u = c8589o2.m17553u(j);
            interfaceC8468f0.accept((c8589o2.f22843c == 0 && m17553u == 0) ? ((long[]) c8589o2.f22745e)[(int) j] : ((long[][]) c8589o2.f22746f)[m17553u][(int) (j - c8589o2.f22844d[m17553u])]);
        }
        return m17531e;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17607h(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: i */
    final void mo17436i() {
        C8589O2 c8589o2 = new C8589O2();
        this.f22810h = c8589o2;
        this.f22807e = this.f22804b.mo17319x1(new C8682j3(c8589o2, 0));
        this.f22808f = new C8633a(6, this);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: j */
    final AbstractC8624X2 mo17435j(Spliterator spliterator) {
        return new C8687k3(this.f22804b, spliterator, this.f22803a);
    }

    @Override // p164j$.util.stream.AbstractC8624X2, p164j$.util.Spliterator
    public final InterfaceC8362J trySplit() {
        return (InterfaceC8362J) super.trySplit();
    }
}
