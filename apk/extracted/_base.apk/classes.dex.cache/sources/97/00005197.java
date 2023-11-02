package p413x1;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p393w1.InterfaceC13365b;

/* renamed from: x1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13671a implements InterfaceC13365b {

    /* renamed from: a */
    private NsdManager f35188a;

    /* renamed from: b */
    private NsdManager.DiscoveryListener f35189b;

    /* renamed from: c */
    private WifiManager.MulticastLock f35190c;

    /* renamed from: d */
    private Map<String, NsdManager.RegistrationListener> f35191d = new HashMap();

    /* renamed from: e */
    private ZeroconfModule f35192e;

    /* renamed from: f */
    private ReactApplicationContext f35193f;

    /* renamed from: x1.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C13672a implements NsdManager.DiscoveryListener {
        C13672a() {
            C13671a.this = r1;
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            System.out.println("On Discovery Started");
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_START, null);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            System.out.println("On Discovery Stopped");
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_STOP, null);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            System.out.println("On Service Found");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_NAME, nsdServiceInfo.getServiceName());
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_FOUND, writableNativeMap);
            C13671a.this.f35188a.resolveService(nsdServiceInfo, new C13674c());
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            System.out.println("On Service Lost");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_NAME, nsdServiceInfo.getServiceName());
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_REMOVE, writableNativeMap);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i) {
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_ERROR, "Starting service discovery failed with code: " + i);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i) {
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_ERROR, "Stopping service discovery failed with code: " + i);
        }
    }

    /* renamed from: x1.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C13673b implements NsdManager.RegistrationListener {
        private C13673b() {
            C13671a.this = r1;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            C13671a.this.f35191d.put(nsdServiceInfo.getServiceName(), this);
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_PUBLISHED, C13671a.this.m1878k(nsdServiceInfo));
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_UNREGISTERED, C13671a.this.m1878k(nsdServiceInfo));
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: x1.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C13674c implements NsdManager.ResolveListener {
        private C13674c() {
            C13671a.this = r1;
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
            if (i == 3) {
                C13671a.this.f35188a.resolveService(nsdServiceInfo, this);
                return;
            }
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_ERROR, "Resolving service failed with code: " + i);
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            C13671a.this.f35192e.sendEvent(C13671a.this.m1879j(), ZeroconfModule.EVENT_RESOLVE, C13671a.this.m1878k(nsdServiceInfo));
        }
    }

    public C13671a(ZeroconfModule zeroconfModule, ReactApplicationContext reactApplicationContext) {
        this.f35192e = zeroconfModule;
        this.f35193f = reactApplicationContext;
    }

    /* renamed from: i */
    private NsdManager m1880i() {
        if (this.f35188a == null) {
            this.f35188a = (NsdManager) m1879j().getSystemService("servicediscovery");
        }
        return this.f35188a;
    }

    /* renamed from: j */
    public ReactApplicationContext m1879j() {
        return this.f35193f;
    }

    /* renamed from: k */
    public WritableMap m1878k(NsdServiceInfo nsdServiceInfo) {
        String str;
        String str2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_NAME, nsdServiceInfo.getServiceName());
        InetAddress host = nsdServiceInfo.getHost();
        if (host == null) {
            str = nsdServiceInfo.getServiceName();
        } else {
            writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_HOST, host.getHostName());
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushString(host.getHostAddress());
            writableNativeMap.putArray(ZeroconfModule.KEY_SERVICE_ADDRESSES, writableNativeArray);
            str = host.getHostName() + nsdServiceInfo.getServiceType();
        }
        writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_FULL_NAME, str);
        writableNativeMap.putInt(ZeroconfModule.KEY_SERVICE_PORT, nsdServiceInfo.getPort());
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        for (String str3 : attributes.keySet()) {
            try {
                byte[] bArr = attributes.get(str3);
                String format = String.format(Locale.getDefault(), "%s", str3);
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[1];
                if (bArr != null) {
                    str2 = new String(bArr, "UTF_8");
                } else {
                    str2 = "";
                }
                objArr[0] = str2;
                writableNativeMap2.putString(format, String.format(locale, "%s", objArr));
            } catch (UnsupportedEncodingException e) {
                this.f35192e.sendEvent(m1879j(), ZeroconfModule.EVENT_ERROR, "Failed to encode txtRecord: " + e);
            }
        }
        writableNativeMap.putMap(ZeroconfModule.KEY_SERVICE_TXT, writableNativeMap2);
        return writableNativeMap;
    }

    @Override // p393w1.InterfaceC13365b
    /* renamed from: a */
    public void mo1365a(String str, String str2, String str3) {
        if (this.f35188a == null) {
            this.f35188a = (NsdManager) m1879j().getSystemService("servicediscovery");
        }
        stop();
        if (this.f35190c == null) {
            WifiManager.MulticastLock createMulticastLock = ((WifiManager) m1879j().getSystemService("wifi")).createMulticastLock("multicastLock");
            this.f35190c = createMulticastLock;
            createMulticastLock.setReferenceCounted(true);
            this.f35190c.acquire();
        }
        this.f35189b = new C13672a();
        this.f35188a.discoverServices(String.format("_%s._%s.", str, str2), 1, this.f35189b);
    }

    @Override // p393w1.InterfaceC13365b
    /* renamed from: b */
    public void mo1364b(String str, String str2, String str3, String str4, int i, ReadableMap readableMap) {
        String format = String.format("_%s._%s.", str, str2);
        NsdManager m1880i = m1880i();
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(str4);
        nsdServiceInfo.setServiceType(format);
        nsdServiceInfo.setPort(i);
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            nsdServiceInfo.setAttribute(nextKey, readableMap.getString(nextKey));
        }
        m1880i.registerService(nsdServiceInfo, 1, new C13673b());
    }

    @Override // p393w1.InterfaceC13365b
    /* renamed from: c */
    public void mo1363c(String str) {
        NsdManager m1880i = m1880i();
        NsdManager.RegistrationListener registrationListener = this.f35191d.get(str);
        if (registrationListener != null) {
            this.f35191d.remove(str);
            m1880i.unregisterService(registrationListener);
        }
    }

    @Override // p393w1.InterfaceC13365b
    public void stop() {
        NsdManager.DiscoveryListener discoveryListener = this.f35189b;
        if (discoveryListener != null) {
            this.f35188a.stopServiceDiscovery(discoveryListener);
        }
        WifiManager.MulticastLock multicastLock = this.f35190c;
        if (multicastLock != null) {
            multicastLock.release();
        }
        this.f35189b = null;
        this.f35190c = null;
    }
}