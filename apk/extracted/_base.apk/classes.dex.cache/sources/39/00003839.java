package io.sentry.android.core;

import android.app.Activity;
import io.sentry.C7687a1;
import io.sentry.C7830b;
import io.sentry.C7831b0;
import io.sentry.C7923f4;
import io.sentry.C8264x;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7832b1;
import io.sentry.InterfaceC8270y;
import io.sentry.android.core.internal.util.C7758a;
import io.sentry.android.core.internal.util.C7765g;
import io.sentry.android.core.internal.util.C7773n;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScreenshotEventProcessor implements InterfaceC8270y, InterfaceC7832b1 {

    /* renamed from: j */
    private final SentryAndroidOptions f21099j;

    /* renamed from: k */
    private final C7798o0 f21100k;

    /* renamed from: l */
    private final C7765g f21101l = new C7765g(C7758a.m19779b(), 2000);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C7798o0 c7798o0) {
        this.f21099j = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21100k = (C7798o0) C8229o.m18169c(c7798o0, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            m19958b();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m19958b() {
        C7687a1.m20046a(this);
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        if (!c7923f4.m19190w0()) {
            return c7923f4;
        }
        if (!this.f21099j.isAttachScreenshot()) {
            this.f21099j.getLogger().mo18135c(EnumC8021m4.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return c7923f4;
        }
        Activity m19681b = C7806r0.m19680c().m19681b();
        if (m19681b != null && !C8220j.m18221i(c7831b0)) {
            boolean m19764a = this.f21101l.m19764a();
            this.f21099j.getBeforeScreenshotCaptureCallback();
            if (m19764a) {
                return c7923f4;
            }
            byte[] m19747e = C7773n.m19747e(m19681b, this.f21099j.getMainThreadChecker(), this.f21099j.getLogger(), this.f21100k);
            if (m19747e == null) {
                return c7923f4;
            }
            c7831b0.m19591k(C7830b.m19611a(m19747e));
            c7831b0.m19592j("android:activity", m19681b);
        }
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public /* synthetic */ C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        return C8264x.m18050a(this, c8114x, c7831b0);
    }
}