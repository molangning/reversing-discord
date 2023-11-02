package io.sentry.android.core;

import io.sentry.C7687a1;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8206u2;
import io.sentry.InterfaceC8273y2;
import io.sentry.util.C8225l;
import io.sentry.util.C8229o;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SendCachedEnvelopeIntegration implements Integration {

    /* renamed from: j */
    private final InterfaceC8273y2 f21102j;

    /* renamed from: k */
    private final C8225l<Boolean> f21103k;

    public SendCachedEnvelopeIntegration(InterfaceC8273y2 interfaceC8273y2, C8225l<Boolean> c8225l) {
        this.f21102j = (InterfaceC8273y2) C8229o.m18169c(interfaceC8273y2, "SendFireAndForgetFactory is required");
        this.f21103k = c8225l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m19956c(InterfaceC8206u2 interfaceC8206u2, SentryAndroidOptions sentryAndroidOptions) {
        try {
            interfaceC8206u2.mo18052a();
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        final SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (!this.f21102j.mo17976b(c8132r4.getCacheDirPath(), c8132r4.getLogger())) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final InterfaceC8206u2 mo17977a = this.f21102j.mo17977a(interfaceC8025n0, sentryAndroidOptions2);
        if (mo17977a == null) {
            sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future<?> submit = sentryAndroidOptions2.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.j1
                @Override // java.lang.Runnable
                public final void run() {
                    SendCachedEnvelopeIntegration.m19956c(InterfaceC8206u2.this, sentryAndroidOptions2);
                }
            });
            if (this.f21103k.m18204a().booleanValue()) {
                sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    submit.get(sentryAndroidOptions2.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions2.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th2) {
            sentryAndroidOptions2.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }
}
