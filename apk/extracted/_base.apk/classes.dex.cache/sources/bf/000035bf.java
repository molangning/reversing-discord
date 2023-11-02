package p138he;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import ie.EnumC7505a;
import ie.EnumC7506b;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;

/* renamed from: he.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7087e {

    /* renamed from: a */
    private final ConnectivityManager f19377a;

    /* renamed from: b */
    private final WifiManager f19378b;

    /* renamed from: c */
    private final TelephonyManager f19379c;

    /* renamed from: d */
    private final ReactApplicationContext f19380d;

    /* renamed from: e */
    public boolean f19381e = false;

    /* renamed from: f */
    private EnumC7506b f19382f = EnumC7506b.UNKNOWN;

    /* renamed from: g */
    private EnumC7505a f19383g = null;

    /* renamed from: h */
    private boolean f19384h = false;

    /* renamed from: i */
    private Boolean f19385i;

    public AbstractC7087e(ReactApplicationContext reactApplicationContext) {
        this.f19380d = reactApplicationContext;
        this.f19377a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f19378b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f19379c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* renamed from: b */
    private WritableMap m21443b(String str) {
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1419358249:
                if (str.equals("ethernet")) {
                    c = 0;
                    break;
                }
                break;
            case -916596374:
                if (str.equals("cellular")) {
                    c = 1;
                    break;
                }
                break;
            case 3649301:
                if (str.equals("wifi")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                createMap.putString("ipAddress", nextElement.getHostAddress());
                                createMap.putString("subnet", m21439f(nextElement));
                                return createMap;
                            }
                        }
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            case 1:
                EnumC7505a enumC7505a = this.f19383g;
                if (enumC7505a != null) {
                    createMap.putString("cellularGeneration", enumC7505a.f20732j);
                }
                String networkOperatorName = this.f19379c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    createMap.putString("carrier", networkOperatorName);
                    break;
                }
                break;
            case 2:
                if (C7089g.m21435a(m21440e()) && (connectionInfo = this.f19378b.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            createMap.putString("ssid", ssid.replace("\"", ""));
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            createMap.putString("bssid", bssid);
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    } catch (Exception unused3) {
                    }
                    try {
                        createMap.putInt("frequency", connectionInfo.getFrequency());
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        C7089g.m21434b(byteArray);
                        createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        C7089g.m21434b(byteArray2);
                        createMap.putString("subnet", m21439f(InetAddress.getByAddress(byteArray2)));
                        break;
                    } catch (Exception unused6) {
                        break;
                    }
                }
                break;
        }
        return createMap;
    }

    /* renamed from: f */
    private static String m21439f(InetAddress inetAddress) {
        int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().get(1).getNetworkPrefixLength());
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255));
    }

    /* renamed from: a */
    protected WritableMap m21444a(String str) {
        String str2;
        boolean z;
        WritableMap createMap = Arguments.createMap();
        if (C7089g.m21435a(m21440e())) {
            createMap.putBoolean("isWifiEnabled", this.f19378b.isWifiEnabled());
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = this.f19382f.f20742j;
        }
        createMap.putString("type", str2);
        boolean z2 = false;
        boolean z3 = true;
        if (!this.f19382f.equals(EnumC7506b.NONE) && !this.f19382f.equals(EnumC7506b.UNKNOWN)) {
            z = true;
        } else {
            z = false;
        }
        createMap.putBoolean("isConnected", z);
        if (this.f19384h && (str == null || str.equals(this.f19382f.f20742j))) {
            z2 = true;
        }
        createMap.putBoolean("isInternetReachable", z2);
        if (str == null) {
            str = this.f19382f.f20742j;
        }
        WritableMap m21443b = m21443b(str);
        if (z) {
            if (m21442c() != null) {
                z3 = m21442c().isActiveNetworkMetered();
            }
            m21443b.putBoolean("isConnectionExpensive", z3);
        }
        createMap.putMap("details", m21443b);
        return createMap;
    }

    /* renamed from: c */
    public ConnectivityManager m21442c() {
        return this.f19377a;
    }

    /* renamed from: d */
    public void m21441d(String str, Promise promise) {
        promise.resolve(m21444a(str));
    }

    /* renamed from: e */
    public ReactApplicationContext m21440e() {
        return this.f19380d;
    }

    /* renamed from: g */
    public abstract void mo21432g();

    /* renamed from: h */
    protected void m21438h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) m21440e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", m21444a(null));
    }

    /* renamed from: i */
    public void m21437i(boolean z) {
        this.f19385i = Boolean.valueOf(z);
        m21436k(this.f19382f, this.f19383g, this.f19384h);
    }

    /* renamed from: j */
    public abstract void mo21431j();

    /* renamed from: k */
    public void m21436k(EnumC7506b enumC7506b, EnumC7505a enumC7505a, boolean z) {
        boolean z2;
        boolean z3;
        Boolean bool = this.f19385i;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z4 = true;
        if (enumC7506b != this.f19382f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (enumC7505a != this.f19383g) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z == this.f19384h) {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            this.f19382f = enumC7506b;
            this.f19383g = enumC7505a;
            this.f19384h = z;
            if (this.f19381e) {
                m21438h();
            }
        }
    }
}