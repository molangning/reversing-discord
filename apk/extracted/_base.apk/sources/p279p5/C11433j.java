package p279p5;

import p279p5.C11434k;

/* renamed from: p5.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C11433j implements InterfaceC11429f {

    /* renamed from: a */
    private final C11434k.InterfaceC11435a f29743a;

    /* renamed from: b */
    private final InterfaceC11429f f29744b;

    /* renamed from: c */
    private boolean f29745c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11433j(C11434k.InterfaceC11435a interfaceC11435a, InterfaceC11429f interfaceC11429f) {
        this.f29743a = interfaceC11435a;
        this.f29744b = interfaceC11429f;
    }

    @Override // p279p5.InterfaceC11430g
    public void stop() {
        this.f29744b.stop();
        synchronized (this) {
            if (!this.f29745c) {
                this.f29743a.mo8060a();
                this.f29745c = true;
            }
        }
    }
}
