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

/* renamed from: io.sentry.protocol.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8088k implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21915j;

    /* renamed from: k */
    private String f21916k;

    /* renamed from: l */
    private String f21917l;

    /* renamed from: m */
    private String f21918m;

    /* renamed from: n */
    private String f21919n;

    /* renamed from: o */
    private Boolean f21920o;

    /* renamed from: p */
    private Map<String, Object> f21921p;

    /* renamed from: io.sentry.protocol.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8089a implements InterfaceC7894d1<C8088k> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8088k mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8088k c8088k = new C8088k();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -925311743:
                        if (m18105R.equals("rooted")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -339173787:
                        if (m18105R.equals("raw_description")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 94094958:
                        if (m18105R.equals("build")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 351608024:
                        if (m18105R.equals("version")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2015527638:
                        if (m18105R.equals("kernel_version")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8088k.f21920o = c7993j1.m19072I0();
                        break;
                    case 1:
                        c8088k.f21917l = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8088k.f21915j = c7993j1.m19061T0();
                        break;
                    case 3:
                        c8088k.f21918m = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8088k.f21916k = c7993j1.m19061T0();
                        break;
                    case 5:
                        c8088k.f21919n = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8088k.m18639l(concurrentHashMap);
            c7993j1.m18091q();
            return c8088k;
        }
    }

    public C8088k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8088k(C8088k c8088k) {
        this.f21915j = c8088k.f21915j;
        this.f21916k = c8088k.f21916k;
        this.f21917l = c8088k.f21917l;
        this.f21918m = c8088k.f21918m;
        this.f21919n = c8088k.f21919n;
        this.f21920o = c8088k.f21920o;
        this.f21921p = C8212b.m18238b(c8088k.f21921p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8088k.class != obj.getClass()) {
            return false;
        }
        C8088k c8088k = (C8088k) obj;
        if (C8229o.m18171a(this.f21915j, c8088k.f21915j) && C8229o.m18171a(this.f21916k, c8088k.f21916k) && C8229o.m18171a(this.f21917l, c8088k.f21917l) && C8229o.m18171a(this.f21918m, c8088k.f21918m) && C8229o.m18171a(this.f21919n, c8088k.f21919n) && C8229o.m18171a(this.f21920o, c8088k.f21920o)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String m18644g() {
        return this.f21915j;
    }

    /* renamed from: h */
    public void m18643h(String str) {
        this.f21918m = str;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21915j, this.f21916k, this.f21917l, this.f21918m, this.f21919n, this.f21920o);
    }

    /* renamed from: i */
    public void m18642i(String str) {
        this.f21919n = str;
    }

    /* renamed from: j */
    public void m18641j(String str) {
        this.f21915j = str;
    }

    /* renamed from: k */
    public void m18640k(Boolean bool) {
        this.f21920o = bool;
    }

    /* renamed from: l */
    public void m18639l(Map<String, Object> map) {
        this.f21921p = map;
    }

    /* renamed from: m */
    public void m18638m(String str) {
        this.f21916k = str;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21915j != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21915j);
        }
        if (this.f21916k != null) {
            interfaceC7919f2.mo18193e("version").mo18191g(this.f21916k);
        }
        if (this.f21917l != null) {
            interfaceC7919f2.mo18193e("raw_description").mo18191g(this.f21917l);
        }
        if (this.f21918m != null) {
            interfaceC7919f2.mo18193e("build").mo18191g(this.f21918m);
        }
        if (this.f21919n != null) {
            interfaceC7919f2.mo18193e("kernel_version").mo18191g(this.f21919n);
        }
        if (this.f21920o != null) {
            interfaceC7919f2.mo18193e("rooted").mo18187k(this.f21920o);
        }
        Map<String, Object> map = this.f21921p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21921p.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
