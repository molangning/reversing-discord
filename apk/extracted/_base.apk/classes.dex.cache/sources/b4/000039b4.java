package io.sentry.protocol;

import io.sentry.C7911e5;
import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8060a;
import io.sentry.protocol.C8064b;
import io.sentry.protocol.C8074e;
import io.sentry.protocol.C8080g;
import io.sentry.protocol.C8088k;
import io.sentry.protocol.C8092m;
import io.sentry.protocol.C8104s;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8068c extends ConcurrentHashMap<String, Object> implements InterfaceC8026n1 {

    /* renamed from: io.sentry.protocol.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8069a implements InterfaceC7894d1<C8068c> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8068c mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8068c c8068c = new C8068c();
            c7993j1.m18097h();
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1335157162:
                        if (m18105R.equals("device")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -340323263:
                        if (m18105R.equals("response")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3556:
                        if (m18105R.equals("os")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 96801:
                        if (m18105R.equals("app")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 102572:
                        if (m18105R.equals("gpu")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 110620997:
                        if (m18105R.equals("trace")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 150940456:
                        if (m18105R.equals("browser")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1550962648:
                        if (m18105R.equals("runtime")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8068c.m18795i(new C8074e.C8075a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 1:
                        c8068c.m18792l(new C8092m.C8093a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 2:
                        c8068c.m18793k(new C8088k.C8089a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 3:
                        c8068c.m18797g(new C8060a.C8061a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 4:
                        c8068c.m18794j(new C8080g.C8081a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 5:
                        c8068c.m18790n(new C7911e5.C7912a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 6:
                        c8068c.m18796h(new C8064b.C8065a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    case 7:
                        c8068c.m18791m(new C8104s.C8105a().mo18130a(c7993j1, interfaceC8040o0));
                        break;
                    default:
                        Object m19063R0 = c7993j1.m19063R0();
                        if (m19063R0 == null) {
                            break;
                        } else {
                            c8068c.put(m18105R, m19063R0);
                            break;
                        }
                }
            }
            c7993j1.m18091q();
            return c8068c;
        }
    }

    public C8068c() {
    }

    /* renamed from: o */
    private <T> T m18789o(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    /* renamed from: a */
    public C8060a m18802a() {
        return (C8060a) m18789o("app", C8060a.class);
    }

    /* renamed from: b */
    public C8074e m18801b() {
        return (C8074e) m18789o("device", C8074e.class);
    }

    /* renamed from: c */
    public C8088k m18800c() {
        return (C8088k) m18789o("os", C8088k.class);
    }

    /* renamed from: e */
    public C8104s m18799e() {
        return (C8104s) m18789o("runtime", C8104s.class);
    }

    /* renamed from: f */
    public C7911e5 m18798f() {
        return (C7911e5) m18789o("trace", C7911e5.class);
    }

    /* renamed from: g */
    public void m18797g(C8060a c8060a) {
        put("app", c8060a);
    }

    /* renamed from: h */
    public void m18796h(C8064b c8064b) {
        put("browser", c8064b);
    }

    /* renamed from: i */
    public void m18795i(C8074e c8074e) {
        put("device", c8074e);
    }

    /* renamed from: j */
    public void m18794j(C8080g c8080g) {
        put("gpu", c8080g);
    }

    /* renamed from: k */
    public void m18793k(C8088k c8088k) {
        put("os", c8088k);
    }

    /* renamed from: l */
    public void m18792l(C8092m c8092m) {
        put("response", c8092m);
    }

    /* renamed from: m */
    public void m18791m(C8104s c8104s) {
        put("runtime", c8104s);
    }

    /* renamed from: n */
    public void m18790n(C7911e5 c7911e5) {
        C8229o.m18169c(c7911e5, "traceContext is required");
        put("trace", c7911e5);
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8068c(C8068c c8068c) {
        for (Map.Entry<String, Object> entry : c8068c.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C8060a)) {
                    m18797g(new C8060a((C8060a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C8064b)) {
                    m18796h(new C8064b((C8064b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C8074e)) {
                    m18795i(new C8074e((C8074e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof C8088k)) {
                    m18793k(new C8088k((C8088k) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C8104s)) {
                    m18791m(new C8104s((C8104s) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C8080g)) {
                    m18794j(new C8080g((C8080g) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof C7911e5)) {
                    m18790n(new C7911e5((C7911e5) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof C8092m)) {
                    m18792l(new C8092m((C8092m) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}