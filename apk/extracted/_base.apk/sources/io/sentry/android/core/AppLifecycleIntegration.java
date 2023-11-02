package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C7687a1;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7759b;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {

    /* renamed from: j */
    volatile LifecycleWatcher f21062j;

    /* renamed from: k */
    private SentryAndroidOptions f21063k;

    /* renamed from: l */
    private final C7723e1 f21064l;

    public AppLifecycleIntegration() {
        this(new C7723e1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m19981s(InterfaceC8025n0 interfaceC8025n0) {
        SentryAndroidOptions sentryAndroidOptions = this.f21063k;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f21062j = new LifecycleWatcher(interfaceC8025n0, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f21063k.isEnableAutoSessionTracking(), this.f21063k.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.m36087h().getLifecycle().mo36125a(this.f21062j);
            this.f21063k.getLogger().mo18135c(EnumC8021m4.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            m19984m();
        } catch (Throwable th2) {
            this.f21062j = null;
            this.f21063k.getLogger().mo18136b(EnumC8021m4.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m19982q() {
        LifecycleWatcher lifecycleWatcher = this.f21062j;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.m36087h().getLifecycle().mo36123c(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.f21063k;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f21062j = null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:20:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0085 -> B:20:0x0090). Please submit an issue!!! */
    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(final InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21063k = sentryAndroidOptions2;
        InterfaceC8040o0 logger = sentryAndroidOptions2.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f21063k.isEnableAutoSessionTracking()));
        this.f21063k.getLogger().mo18135c(enumC8021m4, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f21063k.isEnableAppLifecycleBreadcrumbs()));
        if (this.f21063k.isEnableAutoSessionTracking() || this.f21063k.isEnableAppLifecycleBreadcrumbs()) {
            try {
                int i = ProcessLifecycleOwner.f4426s;
                if (C7759b.m19778d().mo18150a()) {
                    m19981s(interfaceC8025n0);
                    c8132r4 = c8132r4;
                } else {
                    this.f21064l.m19901b(new Runnable() { // from class: io.sentry.android.core.l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLifecycleIntegration.this.m19981s(interfaceC8025n0);
                        }
                    });
                    c8132r4 = c8132r4;
                }
            } catch (ClassNotFoundException e) {
                InterfaceC8040o0 logger2 = c8132r4.getLogger();
                logger2.mo18136b(EnumC8021m4.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e);
                c8132r4 = logger2;
            } catch (IllegalStateException e2) {
                InterfaceC8040o0 logger3 = c8132r4.getLogger();
                logger3.mo18136b(EnumC8021m4.ERROR, "AppLifecycleIntegration could not be installed", e2);
                c8132r4 = logger3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f21062j == null) {
            return;
        }
        if (C7759b.m19778d().mo18150a()) {
            m19982q();
        } else {
            this.f21064l.m19901b(new Runnable() { // from class: io.sentry.android.core.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AppLifecycleIntegration.this.m19982q();
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: m */
    public /* synthetic */ void m19984m() {
        C7687a1.m20046a(this);
    }

    AppLifecycleIntegration(C7723e1 c7723e1) {
        this.f21064l = c7723e1;
    }
}
