package p164j$.util.stream;

/* renamed from: j$.util.stream.m2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8696m2 extends AbstractC8646c2 {

    /* renamed from: b */
    long f22892b;

    /* renamed from: c */
    long f22893c;

    /* renamed from: d */
    final /* synthetic */ C8701n2 f22894d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8696m2(C8701n2 c8701n2, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22894d = c8701n2;
        this.f22892b = c8701n2.f22897s;
        long j = c8701n2.f22898t;
        this.f22893c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p164j$.util.stream.InterfaceC8666g2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        long j2 = this.f22892b;
        if (j2 != 0) {
            this.f22892b = j2 - 1;
            return;
        }
        long j3 = this.f22893c;
        if (j3 > 0) {
            this.f22893c = j3 - 1;
            this.f22835a.accept(j);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        this.f22835a.mo17302g(AbstractC8744w0.m17367L0(j, this.f22894d.f22897s, this.f22893c));
    }

    @Override // p164j$.util.stream.AbstractC8646c2, p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final boolean mo17301i() {
        return this.f22893c == 0 || this.f22835a.mo17301i();
    }
}