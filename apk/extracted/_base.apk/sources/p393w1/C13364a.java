package p393w1;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import p163ik.C7678b;
import p413x1.C13671a;
import p434y1.C13868e;

/* renamed from: w1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13364a {

    /* renamed from: a */
    private Map<String, InterfaceC13365b> f34452a = new HashMap();

    /* renamed from: b */
    private ZeroconfModule f34453b;

    /* renamed from: c */
    private ReactApplicationContext f34454c;

    public C13364a(ZeroconfModule zeroconfModule, ReactApplicationContext reactApplicationContext) {
        this.f34453b = zeroconfModule;
        this.f34454c = reactApplicationContext;
    }

    /* renamed from: a */
    private InterfaceC13365b m2704a(String str) {
        if (!this.f34452a.containsKey(str)) {
            str.hashCode();
            if (!str.equals("NSD")) {
                if (str.equals("DNSSD")) {
                    this.f34452a.put("DNSSD", new C13868e(this.f34453b, this.f34454c));
                } else {
                    throw new IllegalArgumentException(String.format("%s implType is not supported. Only %s and %s are supported", str, "NSD", "DNSSD"));
                }
            } else {
                this.f34452a.put("NSD", new C13671a(this.f34453b, this.f34454c));
            }
        }
        return this.f34452a.get(str);
    }

    /* renamed from: b */
    public InterfaceC13365b m2703b(String str) {
        if (C7678b.m20093c(str)) {
            str = "NSD";
        }
        return m2704a(str);
    }
}
