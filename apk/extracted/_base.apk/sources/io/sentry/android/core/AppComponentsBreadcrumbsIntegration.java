package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C7687a1;
import io.sentry.C7831b0;
import io.sentry.C7901e;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7766h;
import io.sentry.protocol.C8074e;
import io.sentry.util.C8229o;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {

    /* renamed from: j */
    private final Context f21059j;

    /* renamed from: k */
    private InterfaceC8025n0 f21060k;

    /* renamed from: l */
    private SentryAndroidOptions f21061l;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f21059j = (Context) C8229o.m18169c(context, "Context is required");
    }

    /* renamed from: j */
    private void m19987j(Integer num) {
        if (this.f21060k != null) {
            C7901e c7901e = new C7901e();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                }
                c7901e.m19328m("level", num);
            }
            c7901e.m19325p("system");
            c7901e.m19329l("device.event");
            c7901e.m19326o("Low memory");
            c7901e.m19328m("action", "LOW_MEMORY");
            c7901e.m19327n(EnumC8021m4.WARNING);
            this.f21060k.mo18269c(c7901e);
        }
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        this.f21060k = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21061l = sentryAndroidOptions2;
        InterfaceC8040o0 logger = sentryAndroidOptions2.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f21061l.isEnableAppComponentBreadcrumbs()));
        if (this.f21061l.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f21059j.registerComponentCallbacks(this);
                c8132r4.getLogger().mo18135c(enumC8021m4, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                m19988i();
            } catch (Throwable th2) {
                this.f21061l.setEnableAppComponentBreadcrumbs(false);
                c8132r4.getLogger().mo18137a(EnumC8021m4.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f21059j.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f21061l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18137a(EnumC8021m4.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f21061l;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19988i() {
        C7687a1.m20046a(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        String str;
        if (this.f21060k != null) {
            C8074e.EnumC8076b m19763a = C7766h.m19763a(this.f21059j.getResources().getConfiguration().orientation);
            if (m19763a != null) {
                str = m19763a.name().toLowerCase(Locale.ROOT);
            } else {
                str = "undefined";
            }
            C7901e c7901e = new C7901e();
            c7901e.m19325p("navigation");
            c7901e.m19329l("device.orientation");
            c7901e.m19328m(ViewProps.POSITION, str);
            c7901e.m19327n(EnumC8021m4.INFO);
            C7831b0 c7831b0 = new C7831b0();
            c7831b0.m19592j("android:configuration", configuration);
            this.f21060k.mo18266f(c7901e, c7831b0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m19987j(null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m19987j(Integer.valueOf(i));
    }
}
