package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.C8032n4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8110v;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8112w implements InterfaceC8026n1 {

    /* renamed from: j */
    private Long f22000j;

    /* renamed from: k */
    private Integer f22001k;

    /* renamed from: l */
    private String f22002l;

    /* renamed from: m */
    private String f22003m;

    /* renamed from: n */
    private Boolean f22004n;

    /* renamed from: o */
    private Boolean f22005o;

    /* renamed from: p */
    private Boolean f22006p;

    /* renamed from: q */
    private Boolean f22007q;

    /* renamed from: r */
    private C8110v f22008r;

    /* renamed from: s */
    private Map<String, C8032n4> f22009s;

    /* renamed from: t */
    private Map<String, Object> f22010t;

    /* renamed from: io.sentry.protocol.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8113a implements InterfaceC7894d1<C8112w> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8112w mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8112w c8112w = new C8112w();
            c7993j1.m18097h();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1339353468:
                        if (m18105R.equals("daemon")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1165461084:
                        if (m18105R.equals("priority")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -502917346:
                        if (m18105R.equals("held_locks")) {
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
                    case 3343801:
                        if (m18105R.equals("main")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 109757585:
                        if (m18105R.equals("state")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1025385094:
                        if (m18105R.equals("crashed")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1126940025:
                        if (m18105R.equals("current")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 2055832509:
                        if (m18105R.equals("stacktrace")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8112w.f22006p = c7993j1.m19072I0();
                        break;
                    case 1:
                        c8112w.f22001k = c7993j1.m19067N0();
                        break;
                    case 2:
                        Map m19064Q0 = c7993j1.m19064Q0(interfaceC8040o0, new C8032n4.C8033a());
                        if (m19064Q0 == null) {
                            break;
                        } else {
                            c8112w.f22009s = new HashMap(m19064Q0);
                            break;
                        }
                    case 3:
                        c8112w.f22000j = c7993j1.m19065P0();
                        break;
                    case 4:
                        c8112w.f22007q = c7993j1.m19072I0();
                        break;
                    case 5:
                        c8112w.f22002l = c7993j1.m19061T0();
                        break;
                    case 6:
                        c8112w.f22003m = c7993j1.m19061T0();
                        break;
                    case 7:
                        c8112w.f22004n = c7993j1.m19072I0();
                        break;
                    case '\b':
                        c8112w.f22005o = c7993j1.m19072I0();
                        break;
                    case '\t':
                        c8112w.f22008r = (C8110v) c7993j1.m19062S0(interfaceC8040o0, new C8110v.C8111a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8112w.m18523A(concurrentHashMap);
            c7993j1.m18091q();
            return c8112w;
        }
    }

    /* renamed from: A */
    public void m18523A(Map<String, Object> map) {
        this.f22010t = map;
    }

    /* renamed from: k */
    public Map<String, C8032n4> m18512k() {
        return this.f22009s;
    }

    /* renamed from: l */
    public Long m18511l() {
        return this.f22000j;
    }

    /* renamed from: m */
    public String m18510m() {
        return this.f22002l;
    }

    /* renamed from: n */
    public C8110v m18509n() {
        return this.f22008r;
    }

    /* renamed from: o */
    public Boolean m18508o() {
        return this.f22005o;
    }

    /* renamed from: p */
    public Boolean m18507p() {
        return this.f22007q;
    }

    /* renamed from: q */
    public void m18506q(Boolean bool) {
        this.f22004n = bool;
    }

    /* renamed from: r */
    public void m18505r(Boolean bool) {
        this.f22005o = bool;
    }

    /* renamed from: s */
    public void m18504s(Boolean bool) {
        this.f22006p = bool;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f22000j != null) {
            interfaceC7919f2.mo18193e("id").mo18189i(this.f22000j);
        }
        if (this.f22001k != null) {
            interfaceC7919f2.mo18193e("priority").mo18189i(this.f22001k);
        }
        if (this.f22002l != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f22002l);
        }
        if (this.f22003m != null) {
            interfaceC7919f2.mo18193e("state").mo18191g(this.f22003m);
        }
        if (this.f22004n != null) {
            interfaceC7919f2.mo18193e("crashed").mo18187k(this.f22004n);
        }
        if (this.f22005o != null) {
            interfaceC7919f2.mo18193e("current").mo18187k(this.f22005o);
        }
        if (this.f22006p != null) {
            interfaceC7919f2.mo18193e("daemon").mo18187k(this.f22006p);
        }
        if (this.f22007q != null) {
            interfaceC7919f2.mo18193e("main").mo18187k(this.f22007q);
        }
        if (this.f22008r != null) {
            interfaceC7919f2.mo18193e("stacktrace").mo18188j(interfaceC8040o0, this.f22008r);
        }
        if (this.f22009s != null) {
            interfaceC7919f2.mo18193e("held_locks").mo18188j(interfaceC8040o0, this.f22009s);
        }
        Map<String, Object> map = this.f22010t;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f22010t.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* renamed from: t */
    public void m18503t(Map<String, C8032n4> map) {
        this.f22009s = map;
    }

    /* renamed from: u */
    public void m18502u(Long l) {
        this.f22000j = l;
    }

    /* renamed from: v */
    public void m18501v(Boolean bool) {
        this.f22007q = bool;
    }

    /* renamed from: w */
    public void m18500w(String str) {
        this.f22002l = str;
    }

    /* renamed from: x */
    public void m18499x(Integer num) {
        this.f22001k = num;
    }

    /* renamed from: y */
    public void m18498y(C8110v c8110v) {
        this.f22008r = c8110v;
    }

    /* renamed from: z */
    public void m18497z(String str) {
        this.f22003m = str;
    }
}
