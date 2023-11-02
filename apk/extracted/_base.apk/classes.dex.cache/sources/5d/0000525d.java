package p434y1;

import af.C0150a;
import android.net.wifi.WifiManager;
import android.util.Log;
import bf.InterfaceC2276b;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p067df.InterfaceC5832c;
import p268of.C11088a;
import p295q5.C11702a;
import p295q5.C11707d;
import p295q5.InterfaceC11706c;
import p393w1.InterfaceC13365b;

/* renamed from: y1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13868e implements InterfaceC13365b {

    /* renamed from: a */
    private InterfaceC11706c f35689a;

    /* renamed from: b */
    private InterfaceC2276b f35690b;

    /* renamed from: c */
    private Map<String, C11702a> f35691c = new HashMap();

    /* renamed from: d */
    private Map<String, InterfaceC2276b> f35692d = new HashMap();

    /* renamed from: e */
    private ZeroconfModule f35693e;

    /* renamed from: f */
    private ReactApplicationContext f35694f;

    /* renamed from: g */
    private WifiManager.MulticastLock f35695g;

    public C13868e(ZeroconfModule zeroconfModule, ReactApplicationContext reactApplicationContext) {
        this.f35693e = zeroconfModule;
        this.f35694f = reactApplicationContext;
        this.f35689a = new C11707d(reactApplicationContext);
    }

    /* renamed from: h */
    private String m1358h(String str, String str2) {
        return String.format("_%s._%s", str, str2);
    }

    /* renamed from: i */
    private Map<String, String> m1357i(ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    /* renamed from: j */
    public /* synthetic */ void m1356j(C11702a c11702a, C11702a c11702a2) {
        Log.i("TAG", "Register successfully " + c11702a2.toString());
        this.f35691c.put(c11702a.m7136M(), c11702a);
        this.f35693e.sendEvent(this.f35694f, ZeroconfModule.EVENT_PUBLISHED, m1352n(c11702a2));
    }

    /* renamed from: l */
    public /* synthetic */ void m1354l(C11702a c11702a) {
        WritableMap m1352n = m1352n(c11702a);
        Log.d(getClass().getName(), m1352n.toString());
        this.f35693e.sendEvent(this.f35694f, ZeroconfModule.EVENT_RESOLVE, m1352n);
    }

    /* renamed from: m */
    public /* synthetic */ void m1353m(Throwable th2) {
        Log.e(getClass().getName(), "Error resolving service: ", th2);
        this.f35693e.sendEvent(this.f35694f, ZeroconfModule.EVENT_ERROR, th2.getMessage());
    }

    /* renamed from: n */
    private WritableMap m1352n(C11702a c11702a) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_NAME, c11702a.m7136M());
        List<InetAddress> m7139G = c11702a.m7139G();
        Log.d("TAG", c11702a.m7136M());
        String m7136M = c11702a.m7136M();
        writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_HOST, m7136M);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (InetAddress inetAddress : m7139G) {
            writableNativeArray.pushString(inetAddress.getHostAddress());
        }
        writableNativeMap.putArray(ZeroconfModule.KEY_SERVICE_ADDRESSES, writableNativeArray);
        writableNativeMap.putString(ZeroconfModule.KEY_SERVICE_FULL_NAME, m7136M);
        writableNativeMap.putInt(ZeroconfModule.KEY_SERVICE_PORT, c11702a.m7138H());
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        Map<String, String> m7135O = c11702a.m7135O();
        for (String str : m7135O.keySet()) {
            String str2 = m7135O.get(str);
            String format = String.format(Locale.getDefault(), "%s", str);
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[1];
            if (str2 == null) {
                str2 = "";
            }
            objArr[0] = str2;
            writableNativeMap2.putString(format, String.format(locale, "%s", objArr));
        }
        writableNativeMap.putMap(ZeroconfModule.KEY_SERVICE_TXT, writableNativeMap2);
        return writableNativeMap;
    }

    @Override // p393w1.InterfaceC13365b
    /* renamed from: a */
    public void mo1365a(String str, String str2, String str3) {
        stop();
        if (this.f35695g == null) {
            WifiManager.MulticastLock createMulticastLock = ((WifiManager) this.f35694f.getSystemService("wifi")).createMulticastLock("multicastLock");
            this.f35695g = createMulticastLock;
            createMulticastLock.setReferenceCounted(true);
            this.f35695g.acquire();
        }
        this.f35690b = this.f35689a.mo7104a(m1358h(str, str2), "local.").m926c(this.f35689a.mo7101d()).m926c(this.f35689a.mo7102c()).m908u(C11088a.m9187a()).m914o(C0150a.m41058a()).m912q(new InterfaceC5832c() { // from class: y1.a
            @Override // p067df.InterfaceC5832c
            public final void accept(Object obj) {
                C13868e.this.m1354l((C11702a) obj);
            }
        }, new InterfaceC5832c() { // from class: y1.b
            @Override // p067df.InterfaceC5832c
            public final void accept(Object obj) {
                C13868e.this.m1353m((Throwable) obj);
            }
        });
    }

    @Override // p393w1.InterfaceC13365b
    /* renamed from: b */
    public void mo1364b(String str, String str2, String str3, String str4, int i, ReadableMap readableMap) {
        final C11702a m7107j = new C11702a.C11704b(0, 0, str4, m1358h(str, str2), null).m7105l(i).m7106k(m1357i(readableMap)).m7107j();
        this.f35692d.put(str4, this.f35689a.mo7103b(m7107j).m908u(C11088a.m9187a()).m914o(C0150a.m41058a()).m912q(new InterfaceC5832c() { // from class: y1.c
            @Override // p067df.InterfaceC5832c
            public final void accept(Object obj) {
                C13868e.this.m1356j(m7107j, (C11702a) obj);
            }
        }, new InterfaceC5832c() { // from class: y1.d
            @Override // p067df.InterfaceC5832c
            public final void accept(Object obj) {
                Log.e("TAG", "error", (Throwable) obj);
            }
        }));
    }

    @Override // p393w1.InterfaceC13365b
    /* renamed from: c */
    public void mo1363c(String str) {
        C11702a c11702a = this.f35691c.get(str);
        if (c11702a != null) {
            this.f35693e.sendEvent(this.f35694f, ZeroconfModule.EVENT_UNREGISTERED, m1352n(c11702a));
            this.f35691c.remove(str);
        }
        InterfaceC2276b interfaceC2276b = this.f35692d.get(str);
        if (interfaceC2276b != null && !interfaceC2276b.mo16034b()) {
            interfaceC2276b.dispose();
            this.f35692d.remove(str);
        }
    }

    @Override // p393w1.InterfaceC13365b
    public void stop() {
        InterfaceC2276b interfaceC2276b = this.f35690b;
        if (interfaceC2276b != null) {
            interfaceC2276b.dispose();
            this.f35693e.sendEvent(this.f35694f, ZeroconfModule.EVENT_STOP, null);
        }
        WifiManager.MulticastLock multicastLock = this.f35695g;
        if (multicastLock != null) {
            multicastLock.release();
        }
        this.f35690b = null;
        this.f35695g = null;
    }
}