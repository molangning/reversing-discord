package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8080g implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21889j;

    /* renamed from: k */
    private Integer f21890k;

    /* renamed from: l */
    private String f21891l;

    /* renamed from: m */
    private String f21892m;

    /* renamed from: n */
    private Integer f21893n;

    /* renamed from: o */
    private String f21894o;

    /* renamed from: p */
    private Boolean f21895p;

    /* renamed from: q */
    private String f21896q;

    /* renamed from: r */
    private String f21897r;

    /* renamed from: s */
    private Map<String, Object> f21898s;

    /* renamed from: io.sentry.protocol.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8081a implements InterfaceC7894d1<C8080g> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8080g mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8080g c8080g = new C8080g();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1421884745:
                        if (m18105R.equals("npot_support")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1085970574:
                        if (m18105R.equals("vendor_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1009234244:
                        if (m18105R.equals("multi_threaded_rendering")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3355:
                        if (m18105R.equals("id")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 59480866:
                        if (m18105R.equals("vendor_name")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 351608024:
                        if (m18105R.equals("version")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 967446079:
                        if (m18105R.equals("api_type")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (m18105R.equals("memory_size")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8080g.f21897r = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8080g.f21891l = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8080g.f21895p = c7993j1.m19072I0();
                        break;
                    case 3:
                        c8080g.f21890k = c7993j1.m19067N0();
                        break;
                    case 4:
                        c8080g.f21889j = c7993j1.m19061T0();
                        break;
                    case 5:
                        c8080g.f21892m = c7993j1.m19061T0();
                        break;
                    case 6:
                        c8080g.f21896q = c7993j1.m19061T0();
                        break;
                    case 7:
                        c8080g.f21894o = c7993j1.m19061T0();
                        break;
                    case '\b':
                        c8080g.f21893n = c7993j1.m19067N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8080g.m18672j(concurrentHashMap);
            c7993j1.m18091q();
            return c8080g;
        }
    }

    public C8080g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8080g(C8080g c8080g) {
        this.f21889j = c8080g.f21889j;
        this.f21890k = c8080g.f21890k;
        this.f21891l = c8080g.f21891l;
        this.f21892m = c8080g.f21892m;
        this.f21893n = c8080g.f21893n;
        this.f21894o = c8080g.f21894o;
        this.f21895p = c8080g.f21895p;
        this.f21896q = c8080g.f21896q;
        this.f21897r = c8080g.f21897r;
        this.f21898s = C8212b.m18238b(c8080g.f21898s);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8080g.class != obj.getClass()) {
            return false;
        }
        C8080g c8080g = (C8080g) obj;
        if (C8229o.m18171a(this.f21889j, c8080g.f21889j) && C8229o.m18171a(this.f21890k, c8080g.f21890k) && C8229o.m18171a(this.f21891l, c8080g.f21891l) && C8229o.m18171a(this.f21892m, c8080g.f21892m) && C8229o.m18171a(this.f21893n, c8080g.f21893n) && C8229o.m18171a(this.f21894o, c8080g.f21894o) && C8229o.m18171a(this.f21895p, c8080g.f21895p) && C8229o.m18171a(this.f21896q, c8080g.f21896q) && C8229o.m18171a(this.f21897r, c8080g.f21897r)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21889j, this.f21890k, this.f21891l, this.f21892m, this.f21893n, this.f21894o, this.f21895p, this.f21896q, this.f21897r);
    }

    /* renamed from: j */
    public void m18672j(Map<String, Object> map) {
        this.f21898s = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21889j != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21889j);
        }
        if (this.f21890k != null) {
            interfaceC7919f2.mo18193e("id").mo18189i(this.f21890k);
        }
        if (this.f21891l != null) {
            interfaceC7919f2.mo18193e("vendor_id").mo18191g(this.f21891l);
        }
        if (this.f21892m != null) {
            interfaceC7919f2.mo18193e("vendor_name").mo18191g(this.f21892m);
        }
        if (this.f21893n != null) {
            interfaceC7919f2.mo18193e("memory_size").mo18189i(this.f21893n);
        }
        if (this.f21894o != null) {
            interfaceC7919f2.mo18193e("api_type").mo18191g(this.f21894o);
        }
        if (this.f21895p != null) {
            interfaceC7919f2.mo18193e("multi_threaded_rendering").mo18187k(this.f21895p);
        }
        if (this.f21896q != null) {
            interfaceC7919f2.mo18193e("version").mo18191g(this.f21896q);
        }
        if (this.f21897r != null) {
            interfaceC7919f2.mo18193e("npot_support").mo18191g(this.f21897r);
        }
        Map<String, Object> map = this.f21898s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21898s.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
