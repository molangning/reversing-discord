package p279p5;

/* renamed from: p5.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C11434k implements InterfaceC11430g {

    /* renamed from: a */
    private final InterfaceC11435a f29746a;

    /* renamed from: b */
    private final InterfaceC11430g f29747b;

    /* renamed from: c */
    private boolean f29748c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11435a {
        /* renamed from: a */
        void mo8060a();
    }

    public C11434k(InterfaceC11435a interfaceC11435a, InterfaceC11430g interfaceC11430g) {
        this.f29746a = interfaceC11435a;
        this.f29747b = interfaceC11430g;
    }

    @Override // p279p5.InterfaceC11430g
    public void stop() {
        this.f29747b.stop();
        synchronized (this) {
            if (!this.f29748c) {
                this.f29746a.mo8060a();
                this.f29748c = true;
            }
        }
    }
}