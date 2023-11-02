package p164j$.util.stream;

/* renamed from: j$.util.stream.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8708p extends AbstractC8651d2 {

    /* renamed from: b */
    boolean f22909b;

    /* renamed from: c */
    Object f22910c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8708p(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC8671h2 interfaceC8671h2 = this.f22839a;
        if (obj != null) {
            Object obj2 = this.f22910c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else if (this.f22909b) {
            return;
        } else {
            this.f22909b = true;
            obj = null;
        }
        this.f22910c = obj;
        interfaceC8671h2.accept(obj);
    }

    @Override // p164j$.util.stream.AbstractC8651d2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        this.f22909b = false;
        this.f22910c = null;
        this.f22839a.end();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        this.f22909b = false;
        this.f22910c = null;
        this.f22839a.mo17302g(-1L);
    }
}
