package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.C7687a1;
import io.sentry.C7831b0;
import io.sentry.C7901e;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7761d;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: j */
    private final Context f21081j;

    /* renamed from: k */
    private final C7798o0 f21082k;

    /* renamed from: l */
    private final InterfaceC8040o0 f21083l;

    /* renamed from: m */
    C7700b f21084m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.NetworkBreadcrumbsIntegration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7699a {

        /* renamed from: a */
        final int f21085a;

        /* renamed from: b */
        final int f21086b;

        /* renamed from: c */
        final int f21087c;

        /* renamed from: d */
        final boolean f21088d;

        /* renamed from: e */
        final String f21089e;

        @SuppressLint({"NewApi", "ObsoleteSdkInt"})
        C7699a(NetworkCapabilities networkCapabilities, C7798o0 c7798o0) {
            int i;
            C8229o.m18169c(networkCapabilities, "NetworkCapabilities is required");
            C8229o.m18169c(c7798o0, "BuildInfoProvider is required");
            this.f21085a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f21086b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            if (c7798o0.m19703d() >= 29) {
                i = networkCapabilities.getSignalStrength();
            } else {
                i = 0;
            }
            this.f21087c = i > -100 ? i : 0;
            this.f21088d = networkCapabilities.hasTransport(4);
            String m19772d = C7761d.m19772d(networkCapabilities, c7798o0);
            this.f21089e = m19772d == null ? "" : m19772d;
        }

        /* renamed from: a */
        boolean m19962a(C7699a c7699a) {
            if (this.f21088d == c7699a.f21088d && this.f21089e.equals(c7699a.f21089e)) {
                int i = this.f21087c;
                int i2 = c7699a.f21087c;
                if (-5 <= i - i2 && i - i2 <= 5) {
                    int i3 = this.f21085a;
                    int i4 = c7699a.f21085a;
                    if (-1000 <= i3 - i4 && i3 - i4 <= 1000) {
                        int i5 = this.f21086b;
                        int i6 = c7699a.f21086b;
                        if (-1000 <= i5 - i6 && i5 - i6 <= 1000) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: io.sentry.android.core.NetworkBreadcrumbsIntegration$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7700b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final InterfaceC8025n0 f21090a;

        /* renamed from: b */
        final C7798o0 f21091b;

        /* renamed from: c */
        Network f21092c = null;

        /* renamed from: d */
        NetworkCapabilities f21093d = null;

        C7700b(InterfaceC8025n0 interfaceC8025n0, C7798o0 c7798o0) {
            this.f21090a = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
            this.f21091b = (C7798o0) C8229o.m18169c(c7798o0, "BuildInfoProvider is required");
        }

        /* renamed from: a */
        private C7901e m19961a(String str) {
            C7901e c7901e = new C7901e();
            c7901e.m19325p("system");
            c7901e.m19329l("network.event");
            c7901e.m19328m("action", str);
            c7901e.m19327n(EnumC8021m4.INFO);
            return c7901e;
        }

        /* renamed from: b */
        private C7699a m19960b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            if (networkCapabilities == null) {
                return new C7699a(networkCapabilities2, this.f21091b);
            }
            C7699a c7699a = new C7699a(networkCapabilities, this.f21091b);
            C7699a c7699a2 = new C7699a(networkCapabilities2, this.f21091b);
            if (c7699a2.m19962a(c7699a)) {
                return null;
            }
            return c7699a2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.f21092c)) {
                return;
            }
            this.f21090a.mo18269c(m19961a("NETWORK_AVAILABLE"));
            this.f21092c = network;
            this.f21093d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C7699a m19960b;
            if (!network.equals(this.f21092c) || (m19960b = m19960b(this.f21093d, networkCapabilities)) == null) {
                return;
            }
            this.f21093d = networkCapabilities;
            C7901e m19961a = m19961a("NETWORK_CAPABILITIES_CHANGED");
            m19961a.m19328m("download_bandwidth", Integer.valueOf(m19960b.f21085a));
            m19961a.m19328m("upload_bandwidth", Integer.valueOf(m19960b.f21086b));
            m19961a.m19328m("vpn_active", Boolean.valueOf(m19960b.f21088d));
            m19961a.m19328m("network_type", m19960b.f21089e);
            int i = m19960b.f21087c;
            if (i != 0) {
                m19961a.m19328m("signal_strength", Integer.valueOf(i));
            }
            C7831b0 c7831b0 = new C7831b0();
            c7831b0.m19592j("android:networkCapabilities", m19960b);
            this.f21090a.mo18266f(m19961a, c7831b0);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (!network.equals(this.f21092c)) {
                return;
            }
            this.f21090a.mo18269c(m19961a("NETWORK_LOST"));
            this.f21092c = null;
            this.f21093d = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, C7798o0 c7798o0, InterfaceC8040o0 interfaceC8040o0) {
        this.f21081j = (Context) C8229o.m18169c(context, "Context is required");
        this.f21082k = (C7798o0) C8229o.m18169c(c7798o0, "BuildInfoProvider is required");
        this.f21083l = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "ILogger is required");
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
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
        InterfaceC8040o0 interfaceC8040o0 = this.f21083l;
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        interfaceC8040o0.mo18135c(enumC8021m4, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions2.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions2.isEnableNetworkEventBreadcrumbs()) {
            if (this.f21082k.m19703d() < 21) {
                this.f21084m = null;
                this.f21083l.mo18135c(enumC8021m4, "NetworkBreadcrumbsIntegration requires Android 5+", new Object[0]);
                return;
            }
            C7700b c7700b = new C7700b(interfaceC8025n0, this.f21082k);
            this.f21084m = c7700b;
            if (!C7761d.m19770f(this.f21081j, this.f21083l, this.f21082k, c7700b)) {
                this.f21084m = null;
                this.f21083l.mo18135c(enumC8021m4, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                return;
            }
            this.f21083l.mo18135c(enumC8021m4, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
            m19963i();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C7700b c7700b = this.f21084m;
        if (c7700b != null) {
            C7761d.m19769g(this.f21081j, this.f21083l, this.f21082k, c7700b);
            this.f21083l.mo18135c(EnumC8021m4.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f21084m = null;
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19963i() {
        C7687a1.m20046a(this);
    }
}
