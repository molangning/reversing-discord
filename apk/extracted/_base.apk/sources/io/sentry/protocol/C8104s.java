package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8212b;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8104s implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21962j;

    /* renamed from: k */
    private String f21963k;

    /* renamed from: l */
    private String f21964l;

    /* renamed from: m */
    private Map<String, Object> f21965m;

    /* renamed from: io.sentry.protocol.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8105a implements InterfaceC7894d1<C8104s> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8104s mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8104s c8104s = new C8104s();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -339173787:
                        if (m18105R.equals("raw_description")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 351608024:
                        if (m18105R.equals("version")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8104s.f21964l = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8104s.f21962j = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8104s.f21963k = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8104s.m18565g(concurrentHashMap);
            c7993j1.m18091q();
            return c8104s;
        }
    }

    public C8104s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8104s(C8104s c8104s) {
        this.f21962j = c8104s.f21962j;
        this.f21963k = c8104s.f21963k;
        this.f21964l = c8104s.f21964l;
        this.f21965m = C8212b.m18238b(c8104s.f21965m);
    }

    /* renamed from: d */
    public String m18568d() {
        return this.f21962j;
    }

    /* renamed from: e */
    public String m18567e() {
        return this.f21963k;
    }

    /* renamed from: f */
    public void m18566f(String str) {
        this.f21962j = str;
    }

    /* renamed from: g */
    public void m18565g(Map<String, Object> map) {
        this.f21965m = map;
    }

    /* renamed from: h */
    public void m18564h(String str) {
        this.f21963k = str;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21962j != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21962j);
        }
        if (this.f21963k != null) {
            interfaceC7919f2.mo18193e("version").mo18191g(this.f21963k);
        }
        if (this.f21964l != null) {
            interfaceC7919f2.mo18193e("raw_description").mo18191g(this.f21964l);
        }
        Map<String, Object> map = this.f21965m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21965m.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
