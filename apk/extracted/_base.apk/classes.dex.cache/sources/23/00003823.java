package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.C7687a1;
import io.sentry.C7923f4;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.C7711c;
import io.sentry.exception.C7913a;
import io.sentry.hints.C7943a;
import io.sentry.hints.InterfaceC7944b;
import io.sentry.hints.InterfaceC7959q;
import io.sentry.protocol.C8084i;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AnrIntegration implements Integration, Closeable {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: l */
    private static C7711c f21040l;

    /* renamed from: m */
    private static final Object f21041m = new Object();

    /* renamed from: j */
    private final Context f21042j;

    /* renamed from: k */
    private C8132r4 f21043k;

    /* renamed from: io.sentry.android.core.AnrIntegration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7692a implements InterfaceC7944b, InterfaceC7959q {

        /* renamed from: a */
        private final boolean f21044a;

        C7692a(boolean z) {
            this.f21044a = z;
        }

        @Override // io.sentry.hints.InterfaceC7944b
        /* renamed from: c */
        public /* synthetic */ Long mo19154c() {
            return C7943a.m19155b(this);
        }

        @Override // io.sentry.hints.InterfaceC7944b
        /* renamed from: d */
        public boolean mo19153d() {
            return true;
        }

        @Override // io.sentry.hints.InterfaceC7944b
        /* renamed from: f */
        public String mo19152f() {
            return this.f21044a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f21042j = context;
    }

    /* renamed from: m */
    private Throwable m19997m(boolean z, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.m19979a());
        C8084i c8084i = new C8084i();
        c8084i.m18659j("ANR");
        return new C7913a(c8084i, applicationNotResponding2, applicationNotResponding2.m19979a(), true);
    }

    /* renamed from: q */
    private void m19995q(final InterfaceC8025n0 interfaceC8025n0, final SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC8040o0 logger = sentryAndroidOptions.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f21041m) {
                if (f21040l == null) {
                    sentryAndroidOptions.getLogger().mo18135c(enumC8021m4, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C7711c c7711c = new C7711c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C7711c.InterfaceC7712a() { // from class: io.sentry.android.core.d0
                        @Override // io.sentry.android.core.C7711c.InterfaceC7712a
                        /* renamed from: a */
                        public final void mo19907a(ApplicationNotResponding applicationNotResponding) {
                            AnrIntegration.this.m19996o(interfaceC8025n0, sentryAndroidOptions, applicationNotResponding);
                        }
                    }, sentryAndroidOptions.getLogger(), this.f21042j);
                    f21040l = c7711c;
                    c7711c.start();
                    sentryAndroidOptions.getLogger().mo18135c(enumC8021m4, "AnrIntegration installed.", new Object[0]);
                    m19998j();
                }
            }
        }
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public final void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        this.f21043k = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required");
        m19995q(interfaceC8025n0, (SentryAndroidOptions) c8132r4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (f21041m) {
            C7711c c7711c = f21040l;
            if (c7711c != null) {
                c7711c.interrupt();
                f21040l = null;
                C8132r4 c8132r4 = this.f21043k;
                if (c8132r4 != null) {
                    c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "AnrIntegration removed.", new Object[0]);
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
    public /* synthetic */ void m19998j() {
        C7687a1.m20046a(this);
    }

    /* renamed from: s */
    public void m19996o(InterfaceC8025n0 interfaceC8025n0, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean equals = Boolean.TRUE.equals(C7795n0.m19709a().m19708b());
        C7923f4 c7923f4 = new C7923f4(m19997m(equals, sentryAndroidOptions, applicationNotResponding));
        c7923f4.m19187z0(EnumC8021m4.ERROR);
        interfaceC8025n0.mo18257o(c7923f4, C8220j.m18225e(new C7692a(equals)));
    }
}