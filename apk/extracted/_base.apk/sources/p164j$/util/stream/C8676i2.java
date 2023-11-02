package p164j$.util.stream;

/* renamed from: j$.util.stream.i2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8676i2 extends AbstractC8651d2 {

    /* renamed from: b */
    long f22867b;

    /* renamed from: c */
    long f22868c;

    /* renamed from: d */
    final /* synthetic */ C8681j2 f22869d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8676i2(C8681j2 c8681j2, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22869d = c8681j2;
        this.f22867b = c8681j2.f22876s;
        long j = c8681j2.f22877t;
        this.f22868c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.f22867b;
        if (j != 0) {
            this.f22867b = j - 1;
            return;
        }
        long j2 = this.f22868c;
        if (j2 > 0) {
            this.f22868c = j2 - 1;
            this.f22839a.accept(obj);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        this.f22839a.mo17302g(AbstractC8744w0.m17367L0(j, this.f22869d.f22876s, this.f22868c));
    }

    @Override // p164j$.util.stream.AbstractC8651d2, p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final boolean mo17301i() {
        return this.f22868c == 0 || this.f22839a.mo17301i();
    }
}
