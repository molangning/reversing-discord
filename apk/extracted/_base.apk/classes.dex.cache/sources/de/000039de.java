package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8108u;
import io.sentry.util.C8212b;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8110v implements InterfaceC8026n1 {

    /* renamed from: j */
    private List<C8108u> f21996j;

    /* renamed from: k */
    private Map<String, String> f21997k;

    /* renamed from: l */
    private Boolean f21998l;

    /* renamed from: m */
    private Map<String, Object> f21999m;

    /* renamed from: io.sentry.protocol.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8111a implements InterfaceC7894d1<C8110v> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8110v mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8110v c8110v = new C8110v();
            c7993j1.m18097h();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1266514778:
                        if (m18105R.equals("frames")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 78226992:
                        if (m18105R.equals("registers")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 284874180:
                        if (m18105R.equals("snapshot")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8110v.f21996j = c7993j1.m19066O0(interfaceC8040o0, new C8108u.C8109a());
                        break;
                    case 1:
                        c8110v.f21997k = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 2:
                        c8110v.f21998l = c7993j1.m19072I0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8110v.m18525f(concurrentHashMap);
            c7993j1.m18091q();
            return c8110v;
        }
    }

    public C8110v() {
    }

    public C8110v(List<C8108u> list) {
        this.f21996j = list;
    }

    /* renamed from: d */
    public List<C8108u> m18527d() {
        return this.f21996j;
    }

    /* renamed from: e */
    public void m18526e(Boolean bool) {
        this.f21998l = bool;
    }

    /* renamed from: f */
    public void m18525f(Map<String, Object> map) {
        this.f21999m = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21996j != null) {
            interfaceC7919f2.mo18193e("frames").mo18188j(interfaceC8040o0, this.f21996j);
        }
        if (this.f21997k != null) {
            interfaceC7919f2.mo18193e("registers").mo18188j(interfaceC8040o0, this.f21997k);
        }
        if (this.f21998l != null) {
            interfaceC7919f2.mo18193e("snapshot").mo18187k(this.f21998l);
        }
        Map<String, Object> map = this.f21999m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21999m.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}