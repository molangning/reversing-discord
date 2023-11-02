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

/* renamed from: io.sentry.protocol.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8064b implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21829j;

    /* renamed from: k */
    private String f21830k;

    /* renamed from: l */
    private Map<String, Object> f21831l;

    /* renamed from: io.sentry.protocol.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8065a implements InterfaceC7894d1<C8064b> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8064b mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8064b c8064b = new C8064b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                    if (!m18105R.equals("version")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                    } else {
                        c8064b.f21830k = c7993j1.m19061T0();
                    }
                } else {
                    c8064b.f21829j = c7993j1.m19061T0();
                }
            }
            c8064b.m18806c(concurrentHashMap);
            c7993j1.m18091q();
            return c8064b;
        }
    }

    public C8064b() {
    }

    public C8064b(C8064b c8064b) {
        this.f21829j = c8064b.f21829j;
        this.f21830k = c8064b.f21830k;
        this.f21831l = C8212b.m18238b(c8064b.f21831l);
    }

    /* renamed from: c */
    public void m18806c(Map<String, Object> map) {
        this.f21831l = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8064b.class != obj.getClass()) {
            return false;
        }
        C8064b c8064b = (C8064b) obj;
        if (C8229o.m18171a(this.f21829j, c8064b.f21829j) && C8229o.m18171a(this.f21830k, c8064b.f21830k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21829j, this.f21830k);
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21829j != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21829j);
        }
        if (this.f21830k != null) {
            interfaceC7919f2.mo18193e("version").mo18191g(this.f21830k);
        }
        Map<String, Object> map = this.f21831l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21831l.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}