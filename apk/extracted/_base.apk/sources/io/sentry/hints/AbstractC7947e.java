package io.sentry.hints;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.hints.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7947e implements InterfaceC7949g, InterfaceC7951i {

    /* renamed from: a */
    private final CountDownLatch f21631a = new CountDownLatch(1);

    /* renamed from: b */
    private final long f21632b;

    /* renamed from: c */
    private final InterfaceC8040o0 f21633c;

    public AbstractC7947e(long j, InterfaceC8040o0 interfaceC8040o0) {
        this.f21632b = j;
        this.f21633c = interfaceC8040o0;
    }

    @Override // io.sentry.hints.InterfaceC7949g
    /* renamed from: b */
    public void mo19150b() {
        this.f21631a.countDown();
    }

    @Override // io.sentry.hints.InterfaceC7951i
    /* renamed from: e */
    public boolean mo18899e() {
        try {
            return this.f21631a.await(this.f21632b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f21633c.mo18136b(EnumC8021m4.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }
}
