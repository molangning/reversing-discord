package p138he;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.bridge.ReactApplicationContext;
import ie.EnumC7505a;
import ie.EnumC7506b;

@TargetApi(24)
/* renamed from: he.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7093k extends AbstractC7087e {

    /* renamed from: j */
    private final C7094a f19387j;

    /* renamed from: k */
    private Network f19388k;

    /* renamed from: l */
    private NetworkCapabilities f19389l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: he.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C7094a extends ConnectivityManager.NetworkCallback {
        private C7094a() {
            C7093k.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C7093k.this.f19388k = network;
            C7093k.this.m21425q(ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C7093k.this.f19388k = network;
            C7093k.this.f19389l = networkCapabilities;
            C7093k.this.m21423s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (C7093k.this.f19388k != null) {
                C7093k.this.f19388k = network;
            }
            C7093k.this.m21425q(ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            C7093k.this.f19388k = network;
            C7093k.this.m21423s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C7093k.this.f19388k = null;
            C7093k.this.f19389l = null;
            C7093k.this.m21423s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            C7093k.this.f19388k = null;
            C7093k.this.f19389l = null;
            C7093k.this.m21423s();
        }
    }

    public C7093k(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f19388k = null;
        this.f19389l = null;
        this.f19387j = new C7094a();
    }

    /* renamed from: q */
    public void m21425q(int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: he.i
            @Override // java.lang.Runnable
            public final void run() {
                C7093k.this.m21424r();
            }
        }, i);
    }

    /* renamed from: r */
    public /* synthetic */ void m21424r() {
        this.f19389l = m21442c().getNetworkCapabilities(this.f19388k);
        m21423s();
    }

    @Override // p138he.AbstractC7087e
    @SuppressLint({"MissingPermission"})
    /* renamed from: g */
    public void mo21432g() {
        try {
            this.f19388k = m21442c().getActiveNetwork();
            m21425q(0);
            m21442c().registerDefaultNetworkCallback(this.f19387j);
        } catch (SecurityException unused) {
        }
    }

    @Override // p138he.AbstractC7087e
    /* renamed from: j */
    public void mo21431j() {
        try {
            m21442c().unregisterNetworkCallback(this.f19387j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: s */
    void m21423s() {
        NetworkInfo networkInfo;
        boolean z;
        EnumC7506b enumC7506b = EnumC7506b.UNKNOWN;
        Network network = this.f19388k;
        NetworkCapabilities networkCapabilities = this.f19389l;
        EnumC7505a enumC7505a = null;
        boolean z2 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                enumC7506b = EnumC7506b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                enumC7506b = EnumC7506b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                enumC7506b = EnumC7506b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                enumC7506b = EnumC7506b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                enumC7506b = EnumC7506b.VPN;
            }
            if (network != null) {
                networkInfo = m21442c().getNetworkInfo(network);
            } else {
                networkInfo = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z = !networkCapabilities.hasCapability(21);
            } else if (network != null && networkInfo != null && !networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) {
                z = true;
            } else {
                z = false;
            }
            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z) {
                z2 = true;
            }
            if (network != null && enumC7506b == EnumC7506b.CELLULAR && z2) {
                enumC7505a = EnumC7505a.m20556a(networkInfo);
            }
        } else {
            enumC7506b = EnumC7506b.NONE;
        }
        m21436k(enumC7506b, enumC7505a, z2);
    }
}