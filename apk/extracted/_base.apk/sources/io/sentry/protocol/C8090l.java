package io.sentry.protocol;

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

/* renamed from: io.sentry.protocol.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8090l implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21922j;

    /* renamed from: k */
    private String f21923k;

    /* renamed from: l */
    private String f21924l;

    /* renamed from: m */
    private Object f21925m;

    /* renamed from: n */
    private String f21926n;

    /* renamed from: o */
    private Map<String, String> f21927o;

    /* renamed from: p */
    private Map<String, String> f21928p;

    /* renamed from: q */
    private Long f21929q;

    /* renamed from: r */
    private Map<String, String> f21930r;

    /* renamed from: s */
    private String f21931s;

    /* renamed from: t */
    private String f21932t;

    /* renamed from: u */
    private Map<String, Object> f21933u;

    /* renamed from: io.sentry.protocol.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8091a implements InterfaceC7894d1<C8090l> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8090l mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8090l c8090l = new C8090l();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1650269616:
                        if (m18105R.equals("fragment")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1077554975:
                        if (m18105R.equals("method")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 100589:
                        if (m18105R.equals("env")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 116079:
                        if (m18105R.equals("url")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3076010:
                        if (m18105R.equals("data")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 106069776:
                        if (m18105R.equals("other")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 795307910:
                        if (m18105R.equals("headers")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 952189583:
                        if (m18105R.equals("cookies")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1252988030:
                        if (m18105R.equals("body_size")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1595298664:
                        if (m18105R.equals("query_string")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1980646230:
                        if (m18105R.equals("api_target")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8090l.f21931s = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8090l.f21923k = c7993j1.m19061T0();
                        break;
                    case 2:
                        Map map = (Map) c7993j1.m19063R0();
                        if (map == null) {
                            break;
                        } else {
                            c8090l.f21928p = C8212b.m18238b(map);
                            break;
                        }
                    case 3:
                        c8090l.f21922j = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8090l.f21925m = c7993j1.m19063R0();
                        break;
                    case 5:
                        Map map2 = (Map) c7993j1.m19063R0();
                        if (map2 == null) {
                            break;
                        } else {
                            c8090l.f21930r = C8212b.m18238b(map2);
                            break;
                        }
                    case 6:
                        Map map3 = (Map) c7993j1.m19063R0();
                        if (map3 == null) {
                            break;
                        } else {
                            c8090l.f21927o = C8212b.m18238b(map3);
                            break;
                        }
                    case 7:
                        c8090l.f21926n = c7993j1.m19061T0();
                        break;
                    case '\b':
                        c8090l.f21929q = c7993j1.m19065P0();
                        break;
                    case '\t':
                        c8090l.f21924l = c7993j1.m19061T0();
                        break;
                    case '\n':
                        c8090l.f21932t = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8090l.m18624m(concurrentHashMap);
            c7993j1.m18091q();
            return c8090l;
        }
    }

    public C8090l() {
    }

    public C8090l(C8090l c8090l) {
        this.f21922j = c8090l.f21922j;
        this.f21926n = c8090l.f21926n;
        this.f21923k = c8090l.f21923k;
        this.f21924l = c8090l.f21924l;
        this.f21927o = C8212b.m18238b(c8090l.f21927o);
        this.f21928p = C8212b.m18238b(c8090l.f21928p);
        this.f21930r = C8212b.m18238b(c8090l.f21930r);
        this.f21933u = C8212b.m18238b(c8090l.f21933u);
        this.f21925m = c8090l.f21925m;
        this.f21931s = c8090l.f21931s;
        this.f21929q = c8090l.f21929q;
        this.f21932t = c8090l.f21932t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8090l.class != obj.getClass()) {
            return false;
        }
        C8090l c8090l = (C8090l) obj;
        if (C8229o.m18171a(this.f21922j, c8090l.f21922j) && C8229o.m18171a(this.f21923k, c8090l.f21923k) && C8229o.m18171a(this.f21924l, c8090l.f21924l) && C8229o.m18171a(this.f21926n, c8090l.f21926n) && C8229o.m18171a(this.f21927o, c8090l.f21927o) && C8229o.m18171a(this.f21928p, c8090l.f21928p) && C8229o.m18171a(this.f21929q, c8090l.f21929q) && C8229o.m18171a(this.f21931s, c8090l.f21931s) && C8229o.m18171a(this.f21932t, c8090l.f21932t)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21922j, this.f21923k, this.f21924l, this.f21926n, this.f21927o, this.f21928p, this.f21929q, this.f21931s, this.f21932t);
    }

    /* renamed from: l */
    public Map<String, String> m18625l() {
        return this.f21927o;
    }

    /* renamed from: m */
    public void m18624m(Map<String, Object> map) {
        this.f21933u = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21922j != null) {
            interfaceC7919f2.mo18193e("url").mo18191g(this.f21922j);
        }
        if (this.f21923k != null) {
            interfaceC7919f2.mo18193e("method").mo18191g(this.f21923k);
        }
        if (this.f21924l != null) {
            interfaceC7919f2.mo18193e("query_string").mo18191g(this.f21924l);
        }
        if (this.f21925m != null) {
            interfaceC7919f2.mo18193e("data").mo18188j(interfaceC8040o0, this.f21925m);
        }
        if (this.f21926n != null) {
            interfaceC7919f2.mo18193e("cookies").mo18191g(this.f21926n);
        }
        if (this.f21927o != null) {
            interfaceC7919f2.mo18193e("headers").mo18188j(interfaceC8040o0, this.f21927o);
        }
        if (this.f21928p != null) {
            interfaceC7919f2.mo18193e("env").mo18188j(interfaceC8040o0, this.f21928p);
        }
        if (this.f21930r != null) {
            interfaceC7919f2.mo18193e("other").mo18188j(interfaceC8040o0, this.f21930r);
        }
        if (this.f21931s != null) {
            interfaceC7919f2.mo18193e("fragment").mo18188j(interfaceC8040o0, this.f21931s);
        }
        if (this.f21929q != null) {
            interfaceC7919f2.mo18193e("body_size").mo18188j(interfaceC8040o0, this.f21929q);
        }
        if (this.f21932t != null) {
            interfaceC7919f2.mo18193e("api_target").mo18188j(interfaceC8040o0, this.f21932t);
        }
        Map<String, Object> map = this.f21933u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21933u.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
