package p164j$.util.stream;

/* renamed from: j$.util.stream.o2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8706o2 extends AbstractC8636a2 {

    /* renamed from: b */
    long f22906b;

    /* renamed from: c */
    long f22907c;

    /* renamed from: d */
    final /* synthetic */ C8711p2 f22908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8706o2(C8711p2 c8711p2, InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
        this.f22908d = c8711p2;
        this.f22906b = c8711p2.f22914s;
        long j = c8711p2.f22915t;
        this.f22907c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        long j = this.f22906b;
        if (j != 0) {
            this.f22906b = j - 1;
            return;
        }
        long j2 = this.f22907c;
        if (j2 > 0) {
            this.f22907c = j2 - 1;
            this.f22817a.accept(d);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        this.f22817a.mo17302g(AbstractC8744w0.m17367L0(j, this.f22908d.f22914s, this.f22907c));
    }

    @Override // p164j$.util.stream.AbstractC8636a2, p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final boolean mo17301i() {
        return this.f22907c == 0 || this.f22817a.mo17301i();
    }
}