package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8212b;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8092m implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21934j;

    /* renamed from: k */
    private Map<String, String> f21935k;

    /* renamed from: l */
    private Integer f21936l;

    /* renamed from: m */
    private Long f21937m;

    /* renamed from: n */
    private Object f21938n;

    /* renamed from: o */
    private Map<String, Object> f21939o;

    /* renamed from: io.sentry.protocol.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8093a implements InterfaceC7894d1<C8092m> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8092m mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8092m c8092m = new C8092m();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -891699686:
                        if (m18105R.equals("status_code")) {
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
                    case 795307910:
                        if (m18105R.equals("headers")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 952189583:
                        if (m18105R.equals("cookies")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1252988030:
                        if (m18105R.equals("body_size")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8092m.f21936l = c7993j1.m19067N0();
                        break;
                    case 1:
                        c8092m.f21938n = c7993j1.m19063R0();
                        break;
                    case 2:
                        Map map = (Map) c7993j1.m19063R0();
                        if (map == null) {
                            break;
                        } else {
                            c8092m.f21935k = C8212b.m18238b(map);
                            break;
                        }
                    case 3:
                        c8092m.f21934j = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8092m.f21937m = c7993j1.m19065P0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8092m.m18617f(concurrentHashMap);
            c7993j1.m18091q();
            return c8092m;
        }
    }

    public C8092m() {
    }

    public C8092m(C8092m c8092m) {
        this.f21934j = c8092m.f21934j;
        this.f21935k = C8212b.m18238b(c8092m.f21935k);
        this.f21939o = C8212b.m18238b(c8092m.f21939o);
        this.f21936l = c8092m.f21936l;
        this.f21937m = c8092m.f21937m;
        this.f21938n = c8092m.f21938n;
    }

    /* renamed from: f */
    public void m18617f(Map<String, Object> map) {
        this.f21939o = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21934j != null) {
            interfaceC7919f2.mo18193e("cookies").mo18191g(this.f21934j);
        }
        if (this.f21935k != null) {
            interfaceC7919f2.mo18193e("headers").mo18188j(interfaceC8040o0, this.f21935k);
        }
        if (this.f21936l != null) {
            interfaceC7919f2.mo18193e("status_code").mo18188j(interfaceC8040o0, this.f21936l);
        }
        if (this.f21937m != null) {
            interfaceC7919f2.mo18193e("body_size").mo18188j(interfaceC8040o0, this.f21937m);
        }
        if (this.f21938n != null) {
            interfaceC7919f2.mo18193e("data").mo18188j(interfaceC8040o0, this.f21938n);
        }
        Map<String, Object> map = this.f21939o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21939o.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
