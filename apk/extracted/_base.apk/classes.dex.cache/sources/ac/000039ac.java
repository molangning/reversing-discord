package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Date;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8060a implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21810j;

    /* renamed from: k */
    private Date f21811k;

    /* renamed from: l */
    private String f21812l;

    /* renamed from: m */
    private String f21813m;

    /* renamed from: n */
    private String f21814n;

    /* renamed from: o */
    private String f21815o;

    /* renamed from: p */
    private String f21816p;

    /* renamed from: q */
    private Map<String, String> f21817q;

    /* renamed from: r */
    private Boolean f21818r;

    /* renamed from: s */
    private Map<String, Object> f21819s;

    /* renamed from: io.sentry.protocol.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8061a implements InterfaceC7894d1<C8060a> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8060a mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8060a c8060a = new C8060a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1898053579:
                        if (m18105R.equals("device_app_hash")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -901870406:
                        if (m18105R.equals("app_version")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -650544995:
                        if (m18105R.equals("in_foreground")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -470395285:
                        if (m18105R.equals("build_type")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 746297735:
                        if (m18105R.equals("app_identifier")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 791585128:
                        if (m18105R.equals("app_start_time")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1133704324:
                        if (m18105R.equals("permissions")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1167648233:
                        if (m18105R.equals("app_name")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1826866896:
                        if (m18105R.equals("app_build")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8060a.f21812l = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8060a.f21815o = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8060a.f21818r = c7993j1.m19072I0();
                        break;
                    case 3:
                        c8060a.f21813m = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8060a.f21810j = c7993j1.m19061T0();
                        break;
                    case 5:
                        c8060a.f21811k = c7993j1.m19071J0(interfaceC8040o0);
                        break;
                    case 6:
                        c8060a.f21817q = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 7:
                        c8060a.f21814n = c7993j1.m19061T0();
                        break;
                    case '\b':
                        c8060a.f21816p = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8060a.m18833r(concurrentHashMap);
            c7993j1.m18091q();
            return c8060a;
        }
    }

    public C8060a() {
    }

    public C8060a(C8060a c8060a) {
        this.f21816p = c8060a.f21816p;
        this.f21810j = c8060a.f21810j;
        this.f21814n = c8060a.f21814n;
        this.f21811k = c8060a.f21811k;
        this.f21815o = c8060a.f21815o;
        this.f21813m = c8060a.f21813m;
        this.f21812l = c8060a.f21812l;
        this.f21817q = C8212b.m18238b(c8060a.f21817q);
        this.f21818r = c8060a.f21818r;
        this.f21819s = C8212b.m18238b(c8060a.f21819s);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8060a.class != obj.getClass()) {
            return false;
        }
        C8060a c8060a = (C8060a) obj;
        if (C8229o.m18171a(this.f21810j, c8060a.f21810j) && C8229o.m18171a(this.f21811k, c8060a.f21811k) && C8229o.m18171a(this.f21812l, c8060a.f21812l) && C8229o.m18171a(this.f21813m, c8060a.f21813m) && C8229o.m18171a(this.f21814n, c8060a.f21814n) && C8229o.m18171a(this.f21815o, c8060a.f21815o) && C8229o.m18171a(this.f21816p, c8060a.f21816p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21810j, this.f21811k, this.f21812l, this.f21813m, this.f21814n, this.f21815o, this.f21816p);
    }

    /* renamed from: j */
    public Boolean m18841j() {
        return this.f21818r;
    }

    /* renamed from: k */
    public void m18840k(String str) {
        this.f21816p = str;
    }

    /* renamed from: l */
    public void m18839l(String str) {
        this.f21810j = str;
    }

    /* renamed from: m */
    public void m18838m(String str) {
        this.f21814n = str;
    }

    /* renamed from: n */
    public void m18837n(Date date) {
        this.f21811k = date;
    }

    /* renamed from: o */
    public void m18836o(String str) {
        this.f21815o = str;
    }

    /* renamed from: p */
    public void m18835p(Boolean bool) {
        this.f21818r = bool;
    }

    /* renamed from: q */
    public void m18834q(Map<String, String> map) {
        this.f21817q = map;
    }

    /* renamed from: r */
    public void m18833r(Map<String, Object> map) {
        this.f21819s = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21810j != null) {
            interfaceC7919f2.mo18193e("app_identifier").mo18191g(this.f21810j);
        }
        if (this.f21811k != null) {
            interfaceC7919f2.mo18193e("app_start_time").mo18188j(interfaceC8040o0, this.f21811k);
        }
        if (this.f21812l != null) {
            interfaceC7919f2.mo18193e("device_app_hash").mo18191g(this.f21812l);
        }
        if (this.f21813m != null) {
            interfaceC7919f2.mo18193e("build_type").mo18191g(this.f21813m);
        }
        if (this.f21814n != null) {
            interfaceC7919f2.mo18193e("app_name").mo18191g(this.f21814n);
        }
        if (this.f21815o != null) {
            interfaceC7919f2.mo18193e("app_version").mo18191g(this.f21815o);
        }
        if (this.f21816p != null) {
            interfaceC7919f2.mo18193e("app_build").mo18191g(this.f21816p);
        }
        Map<String, String> map = this.f21817q;
        if (map != null && !map.isEmpty()) {
            interfaceC7919f2.mo18193e("permissions").mo18188j(interfaceC8040o0, this.f21817q);
        }
        if (this.f21818r != null) {
            interfaceC7919f2.mo18193e("in_foreground").mo18187k(this.f21818r);
        }
        Map<String, Object> map2 = this.f21819s;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21819s.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}