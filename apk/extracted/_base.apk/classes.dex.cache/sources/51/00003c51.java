package p164j$.util.stream;

/* renamed from: j$.util.stream.k2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8686k2 extends AbstractC8641b2 {

    /* renamed from: b */
    long f22883b;

    /* renamed from: c */
    long f22884c;

    /* renamed from: d */
    final /* synthetic */ C8691l2 f22885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8686k2(C8691l2 c8691l2, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22885d = c8691l2;
        this.f22883b = c8691l2.f22888s;
        long j = c8691l2.f22889t;
        this.f22884c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p164j$.util.stream.InterfaceC8661f2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        long j = this.f22883b;
        if (j != 0) {
            this.f22883b = j - 1;
            return;
        }
        long j2 = this.f22884c;
        if (j2 > 0) {
            this.f22884c = j2 - 1;
            this.f22822a.accept(i);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        this.f22822a.mo17302g(AbstractC8744w0.m17367L0(j, this.f22885d.f22888s, this.f22884c));
    }

    @Override // p164j$.util.stream.AbstractC8641b2, p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final boolean mo17301i() {
        return this.f22884c == 0 || this.f22822a.mo17301i();
    }
}