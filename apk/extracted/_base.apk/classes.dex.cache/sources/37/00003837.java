package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.C7687a1;
import io.sentry.C7901e;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7770k;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class PhoneStateBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: j */
    private final Context f21094j;

    /* renamed from: k */
    private SentryAndroidOptions f21095k;

    /* renamed from: l */
    C7701a f21096l;

    /* renamed from: m */
    private TelephonyManager f21097m;

    /* renamed from: io.sentry.android.core.PhoneStateBreadcrumbsIntegration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7701a extends PhoneStateListener {

        /* renamed from: a */
        private final InterfaceC8025n0 f21098a;

        C7701a(InterfaceC8025n0 interfaceC8025n0) {
            this.f21098a = interfaceC8025n0;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i == 1) {
                C7901e c7901e = new C7901e();
                c7901e.m19325p("system");
                c7901e.m19329l("device.event");
                c7901e.m19328m("action", "CALL_STATE_RINGING");
                c7901e.m19326o("Device ringing");
                c7901e.m19327n(EnumC8021m4.INFO);
                this.f21098a.mo18269c(c7901e);
            }
        }
    }

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.f21094j = (Context) C8229o.m18169c(context, "Context is required");
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
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21095k = sentryAndroidOptions2;
        InterfaceC8040o0 logger = sentryAndroidOptions2.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f21095k.isEnableSystemEventBreadcrumbs()));
        if (this.f21095k.isEnableSystemEventBreadcrumbs() && C7770k.m19757a(this.f21094j, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f21094j.getSystemService("phone");
            this.f21097m = telephonyManager;
            if (telephonyManager != null) {
                try {
                    C7701a c7701a = new C7701a(interfaceC8025n0);
                    this.f21096l = c7701a;
                    this.f21097m.listen(c7701a, 32);
                    c8132r4.getLogger().mo18135c(enumC8021m4, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                    m19959i();
                    return;
                } catch (Throwable th2) {
                    this.f21095k.getLogger().mo18137a(EnumC8021m4.INFO, th2, "TelephonyManager is not available or ready to use.", new Object[0]);
                    return;
                }
            }
            this.f21095k.getLogger().mo18135c(EnumC8021m4.INFO, "TelephonyManager is not available", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C7701a c7701a;
        TelephonyManager telephonyManager = this.f21097m;
        if (telephonyManager != null && (c7701a = this.f21096l) != null) {
            telephonyManager.listen(c7701a, 0);
            this.f21096l = null;
            SentryAndroidOptions sentryAndroidOptions = this.f21095k;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19959i() {
        C7687a1.m20046a(this);
    }
}