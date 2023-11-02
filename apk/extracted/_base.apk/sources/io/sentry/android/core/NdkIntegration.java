package io.sentry.android.core;

import io.sentry.C7687a1;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class NdkIntegration implements Integration, Closeable {

    /* renamed from: j */
    private final Class<?> f21079j;

    /* renamed from: k */
    private SentryAndroidOptions f21080k;

    public NdkIntegration(Class<?> cls) {
        this.f21079j = cls;
    }

    /* renamed from: j */
    private void m19964j(C8132r4 c8132r4) {
        c8132r4.setEnableNdk(false);
        c8132r4.setEnableScopeSync(false);
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public final void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21080k = sentryAndroidOptions2;
        boolean isEnableNdk = sentryAndroidOptions2.isEnableNdk();
        InterfaceC8040o0 logger = this.f21080k.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (isEnableNdk && this.f21079j != null) {
            if (this.f21080k.getCacheDirPath() == null) {
                this.f21080k.getLogger().mo18135c(EnumC8021m4.ERROR, "No cache dir path is defined in options.", new Object[0]);
                m19964j(this.f21080k);
                return;
            }
            try {
                this.f21079j.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f21080k);
                this.f21080k.getLogger().mo18135c(enumC8021m4, "NdkIntegration installed.", new Object[0]);
                m19965i();
                return;
            } catch (NoSuchMethodException e) {
                m19964j(this.f21080k);
                this.f21080k.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to invoke the SentryNdk.init method.", e);
                return;
            } catch (Throwable th2) {
                m19964j(this.f21080k);
                this.f21080k.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to initialize SentryNdk.", th2);
                return;
            }
        }
        m19964j(this.f21080k);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Class<?> cls;
        SentryAndroidOptions sentryAndroidOptions = this.f21080k;
        if (sentryAndroidOptions != null && sentryAndroidOptions.isEnableNdk() && (cls = this.f21079j) != null) {
            try {
                try {
                    cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                    this.f21080k.getLogger().mo18135c(EnumC8021m4.DEBUG, "NdkIntegration removed.", new Object[0]);
                }
            } catch (NoSuchMethodException e) {
                this.f21080k.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to invoke the SentryNdk.close method.", e);
            }
            m19964j(this.f21080k);
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19965i() {
        C7687a1.m20046a(this);
    }
}
