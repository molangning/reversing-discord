package p164j$.util.stream;

import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8359G;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.i3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8677i3 extends AbstractC8624X2 implements InterfaceC8359G {
    C8677i3(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        super(abstractC8744w0, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8677i3(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        super(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17603m(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC8437K interfaceC8437K) {
        if (this.f22810h != null || this.f22811i) {
            do {
            } while (tryAdvance(interfaceC8437K));
            return;
        }
        interfaceC8437K.getClass();
        m17529h();
        C8672h3 c8672h3 = new C8672h3(interfaceC8437K, 1);
        this.f22804b.mo17321w1(this.f22806d, c8672h3);
        this.f22811i = true;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17608g(this, consumer);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: i */
    final void mo17436i() {
        C8581M2 c8581m2 = new C8581M2();
        this.f22810h = c8581m2;
        this.f22807e = this.f22804b.mo17319x1(new C8672h3(c8581m2, 0));
        this.f22808f = new C8633a(5, this);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: j */
    final AbstractC8624X2 mo17435j(Spliterator spliterator) {
        return new C8677i3(this.f22804b, spliterator, this.f22803a);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: k */
    public final boolean tryAdvance(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        boolean m17531e = m17531e();
        if (m17531e) {
            C8581M2 c8581m2 = (C8581M2) this.f22810h;
            long j = this.f22809g;
            int m17553u = c8581m2.m17553u(j);
            interfaceC8437K.accept((c8581m2.f22843c == 0 && m17553u == 0) ? ((int[]) c8581m2.f22745e)[(int) j] : ((int[][]) c8581m2.f22746f)[m17553u][(int) (j - c8581m2.f22844d[m17553u])]);
        }
        return m17531e;
    }

    @Override // p164j$.util.stream.AbstractC8624X2, p164j$.util.Spliterator
    public final InterfaceC8359G trySplit() {
        return (InterfaceC8359G) super.trySplit();
    }
}
