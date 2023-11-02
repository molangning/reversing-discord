package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8212b;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8084i implements InterfaceC8026n1 {

    /* renamed from: j */
    private final transient Thread f21902j;

    /* renamed from: k */
    private String f21903k;

    /* renamed from: l */
    private String f21904l;

    /* renamed from: m */
    private String f21905m;

    /* renamed from: n */
    private Boolean f21906n;

    /* renamed from: o */
    private Map<String, Object> f21907o;

    /* renamed from: p */
    private Map<String, Object> f21908p;

    /* renamed from: q */
    private Boolean f21909q;

    /* renamed from: r */
    private Map<String, Object> f21910r;

    /* renamed from: io.sentry.protocol.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8085a implements InterfaceC7894d1<C8084i> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8084i mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8084i c8084i = new C8084i();
            c7993j1.m18097h();
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1724546052:
                        if (m18105R.equals("description")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3076010:
                        if (m18105R.equals("data")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3347973:
                        if (m18105R.equals("meta")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 692803388:
                        if (m18105R.equals("handled")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 989128517:
                        if (m18105R.equals("synthetic")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1297152568:
                        if (m18105R.equals("help_link")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8084i.f21904l = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8084i.f21908p = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 2:
                        c8084i.f21907o = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 3:
                        c8084i.f21903k = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8084i.f21906n = c7993j1.m19072I0();
                        break;
                    case 5:
                        c8084i.f21909q = c7993j1.m19072I0();
                        break;
                    case 6:
                        c8084i.f21905m = c7993j1.m19061T0();
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
            c8084i.m18658k(hashMap);
            return c8084i;
        }
    }

    public C8084i() {
        this(null);
    }

    /* renamed from: h */
    public Boolean m18661h() {
        return this.f21906n;
    }

    /* renamed from: i */
    public void m18660i(Boolean bool) {
        this.f21906n = bool;
    }

    /* renamed from: j */
    public void m18659j(String str) {
        this.f21903k = str;
    }

    /* renamed from: k */
    public void m18658k(Map<String, Object> map) {
        this.f21910r = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21903k != null) {
            interfaceC7919f2.mo18193e("type").mo18191g(this.f21903k);
        }
        if (this.f21904l != null) {
            interfaceC7919f2.mo18193e("description").mo18191g(this.f21904l);
        }
        if (this.f21905m != null) {
            interfaceC7919f2.mo18193e("help_link").mo18191g(this.f21905m);
        }
        if (this.f21906n != null) {
            interfaceC7919f2.mo18193e("handled").mo18187k(this.f21906n);
        }
        if (this.f21907o != null) {
            interfaceC7919f2.mo18193e("meta").mo18188j(interfaceC8040o0, this.f21907o);
        }
        if (this.f21908p != null) {
            interfaceC7919f2.mo18193e("data").mo18188j(interfaceC8040o0, this.f21908p);
        }
        if (this.f21909q != null) {
            interfaceC7919f2.mo18193e("synthetic").mo18187k(this.f21909q);
        }
        Map<String, Object> map = this.f21910r;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21910r.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8084i(Thread thread) {
        this.f21902j = thread;
    }
}
