package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8078f;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8062a0 implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21820j;

    /* renamed from: k */
    private String f21821k;

    /* renamed from: l */
    private String f21822l;

    /* renamed from: m */
    private String f21823m;

    /* renamed from: n */
    private String f21824n;

    /* renamed from: o */
    private String f21825o;

    /* renamed from: p */
    private C8078f f21826p;

    /* renamed from: q */
    private Map<String, String> f21827q;

    /* renamed from: r */
    private Map<String, Object> f21828r;

    /* renamed from: io.sentry.protocol.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8063a implements InterfaceC7894d1<C8062a0> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8062a0 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8062a0 c8062a0 = new C8062a0();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -265713450:
                        if (m18105R.equals("username")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3355:
                        if (m18105R.equals("id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 102225:
                        if (m18105R.equals("geo")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3076010:
                        if (m18105R.equals("data")) {
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
                    case 96619420:
                        if (m18105R.equals("email")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 106069776:
                        if (m18105R.equals("other")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1480014044:
                        if (m18105R.equals("ip_address")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1973722931:
                        if (m18105R.equals("segment")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8062a0.f21822l = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8062a0.f21821k = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8062a0.f21826p = new C8078f.C8079a().mo18130a(c7993j1, interfaceC8040o0);
                        break;
                    case 3:
                        c8062a0.f21827q = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 4:
                        c8062a0.f21825o = c7993j1.m19061T0();
                        break;
                    case 5:
                        c8062a0.f21820j = c7993j1.m19061T0();
                        break;
                    case 6:
                        if (c8062a0.f21827q != null && !c8062a0.f21827q.isEmpty()) {
                            break;
                        } else {
                            c8062a0.f21827q = C8212b.m18238b((Map) c7993j1.m19063R0());
                            break;
                        }
                    case 7:
                        c8062a0.f21824n = c7993j1.m19061T0();
                        break;
                    case '\b':
                        c8062a0.f21823m = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8062a0.m18811u(concurrentHashMap);
            c7993j1.m18091q();
            return c8062a0;
        }
    }

    public C8062a0() {
    }

    public C8062a0(C8062a0 c8062a0) {
        this.f21820j = c8062a0.f21820j;
        this.f21822l = c8062a0.f21822l;
        this.f21821k = c8062a0.f21821k;
        this.f21824n = c8062a0.f21824n;
        this.f21823m = c8062a0.f21823m;
        this.f21825o = c8062a0.f21825o;
        this.f21826p = c8062a0.f21826p;
        this.f21827q = C8212b.m18238b(c8062a0.f21827q);
        this.f21828r = C8212b.m18238b(c8062a0.f21828r);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8062a0.class != obj.getClass()) {
            return false;
        }
        C8062a0 c8062a0 = (C8062a0) obj;
        if (C8229o.m18171a(this.f21820j, c8062a0.f21820j) && C8229o.m18171a(this.f21821k, c8062a0.f21821k) && C8229o.m18171a(this.f21822l, c8062a0.f21822l) && C8229o.m18171a(this.f21823m, c8062a0.f21823m) && C8229o.m18171a(this.f21824n, c8062a0.f21824n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21820j, this.f21821k, this.f21822l, this.f21823m, this.f21824n);
    }

    /* renamed from: j */
    public Map<String, String> m18822j() {
        return this.f21827q;
    }

    /* renamed from: k */
    public String m18821k() {
        return this.f21820j;
    }

    /* renamed from: l */
    public String m18820l() {
        return this.f21821k;
    }

    /* renamed from: m */
    public String m18819m() {
        return this.f21824n;
    }

    /* renamed from: n */
    public String m18818n() {
        return this.f21823m;
    }

    /* renamed from: o */
    public String m18817o() {
        return this.f21822l;
    }

    /* renamed from: p */
    public void m18816p(Map<String, String> map) {
        this.f21827q = C8212b.m18238b(map);
    }

    /* renamed from: q */
    public void m18815q(String str) {
        this.f21820j = str;
    }

    /* renamed from: r */
    public void m18814r(String str) {
        this.f21821k = str;
    }

    /* renamed from: s */
    public void m18813s(String str) {
        this.f21824n = str;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21820j != null) {
            interfaceC7919f2.mo18193e("email").mo18191g(this.f21820j);
        }
        if (this.f21821k != null) {
            interfaceC7919f2.mo18193e("id").mo18191g(this.f21821k);
        }
        if (this.f21822l != null) {
            interfaceC7919f2.mo18193e("username").mo18191g(this.f21822l);
        }
        if (this.f21823m != null) {
            interfaceC7919f2.mo18193e("segment").mo18191g(this.f21823m);
        }
        if (this.f21824n != null) {
            interfaceC7919f2.mo18193e("ip_address").mo18191g(this.f21824n);
        }
        if (this.f21825o != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21825o);
        }
        if (this.f21826p != null) {
            interfaceC7919f2.mo18193e("geo");
            this.f21826p.serialize(interfaceC7919f2, interfaceC8040o0);
        }
        if (this.f21827q != null) {
            interfaceC7919f2.mo18193e("data").mo18188j(interfaceC8040o0, this.f21827q);
        }
        Map<String, Object> map = this.f21828r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21828r.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* renamed from: t */
    public void m18812t(String str) {
        this.f21823m = str;
    }

    /* renamed from: u */
    public void m18811u(Map<String, Object> map) {
        this.f21828r = map;
    }

    /* renamed from: v */
    public void m18810v(String str) {
        this.f21822l = str;
    }
}