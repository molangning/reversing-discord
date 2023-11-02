package io.sentry;

/* renamed from: io.sentry.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7841c1 implements InterfaceC7992j0 {

    /* renamed from: a */
    private final Runtime f21430a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC7992j0
    /* renamed from: a */
    public void mo19075a() {
    }

    @Override // io.sentry.InterfaceC7992j0
    /* renamed from: b */
    public void mo19074b(C8002k2 c8002k2) {
        c8002k2.m19032b(new C8156s1(System.currentTimeMillis(), this.f21430a.totalMemory() - this.f21430a.freeMemory()));
    }
}
