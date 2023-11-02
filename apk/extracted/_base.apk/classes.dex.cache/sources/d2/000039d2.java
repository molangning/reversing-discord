package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8084i;
import io.sentry.protocol.C8110v;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8098p implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21950j;

    /* renamed from: k */
    private String f21951k;

    /* renamed from: l */
    private String f21952l;

    /* renamed from: m */
    private Long f21953m;

    /* renamed from: n */
    private C8110v f21954n;

    /* renamed from: o */
    private C8084i f21955o;

    /* renamed from: p */
    private Map<String, Object> f21956p;

    /* renamed from: io.sentry.protocol.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8099a implements InterfaceC7894d1<C8098p> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8098p mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8098p c8098p = new C8098p();
            c7993j1.m18097h();
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1562235024:
                        if (m18105R.equals("thread_id")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (m18105R.equals("module")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 111972721:
                        if (m18105R.equals("value")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1225089881:
                        if (m18105R.equals("mechanism")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2055832509:
                        if (m18105R.equals("stacktrace")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8098p.f21953m = c7993j1.m19065P0();
                        break;
                    case 1:
                        c8098p.f21952l = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8098p.f21950j = c7993j1.m19061T0();
                        break;
                    case 3:
                        c8098p.f21951k = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8098p.f21955o = (C8084i) c7993j1.m19062S0(interfaceC8040o0, new C8084i.C8085a());
                        break;
                    case 5:
                        c8098p.f21954n = (C8110v) c7993j1.m19062S0(interfaceC8040o0, new C8110v.C8111a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                        break;
                }
            }
            c7993j1.m18091q();
            c8098p.m18580o(hashMap);
            return c8098p;
        }
    }

    /* renamed from: g */
    public C8084i m18588g() {
        return this.f21955o;
    }

    /* renamed from: h */
    public Long m18587h() {
        return this.f21953m;
    }

    /* renamed from: i */
    public String m18586i() {
        return this.f21950j;
    }

    /* renamed from: j */
    public void m18585j(C8084i c8084i) {
        this.f21955o = c8084i;
    }

    /* renamed from: k */
    public void m18584k(String str) {
        this.f21952l = str;
    }

    /* renamed from: l */
    public void m18583l(C8110v c8110v) {
        this.f21954n = c8110v;
    }

    /* renamed from: m */
    public void m18582m(Long l) {
        this.f21953m = l;
    }

    /* renamed from: n */
    public void m18581n(String str) {
        this.f21950j = str;
    }

    /* renamed from: o */
    public void m18580o(Map<String, Object> map) {
        this.f21956p = map;
    }

    /* renamed from: p */
    public void m18579p(String str) {
        this.f21951k = str;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21950j != null) {
            interfaceC7919f2.mo18193e("type").mo18191g(this.f21950j);
        }
        if (this.f21951k != null) {
            interfaceC7919f2.mo18193e("value").mo18191g(this.f21951k);
        }
        if (this.f21952l != null) {
            interfaceC7919f2.mo18193e("module").mo18191g(this.f21952l);
        }
        if (this.f21953m != null) {
            interfaceC7919f2.mo18193e("thread_id").mo18189i(this.f21953m);
        }
        if (this.f21954n != null) {
            interfaceC7919f2.mo18193e("stacktrace").mo18188j(interfaceC8040o0, this.f21954n);
        }
        if (this.f21955o != null) {
            interfaceC7919f2.mo18193e("mechanism").mo18188j(interfaceC8040o0, this.f21955o);
        }
        Map<String, Object> map = this.f21956p;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21956p.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}