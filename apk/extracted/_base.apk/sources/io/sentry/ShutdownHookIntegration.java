package io.sentry;

import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {

    /* renamed from: j */
    private final Runtime f21009j;

    /* renamed from: k */
    private Thread f21010k;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f21009j = (Runtime) C8229o.m18169c(runtime, "Runtime is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m20051m(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        interfaceC8025n0.mo18270b(c8132r4.getFlushTimeoutMillis());
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(final InterfaceC8025n0 interfaceC8025n0, final C8132r4 c8132r4) {
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        C8229o.m18169c(c8132r4, "SentryOptions is required");
        if (c8132r4.isEnableShutdownHook()) {
            Thread thread = new Thread(new Runnable() { // from class: io.sentry.c5
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.m20051m(InterfaceC8025n0.this, c8132r4);
                }
            });
            this.f21010k = thread;
            this.f21009j.addShutdownHook(thread);
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            m20052j();
            return;
        }
        c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Thread thread = this.f21010k;
        if (thread != null) {
            try {
                this.f21009j.removeShutdownHook(thread);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !message.equals("Shutdown in progress")) {
                    throw e;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: j */
    public /* synthetic */ void m20052j() {
        C7687a1.m20046a(this);
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
