package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8116y implements InterfaceC8026n1 {

    /* renamed from: j */
    private final String f22019j;

    /* renamed from: k */
    private Map<String, Object> f22020k;

    /* renamed from: io.sentry.protocol.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8117a implements InterfaceC7894d1<C8116y> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8116y mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("source")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                } else {
                    str = c7993j1.m19061T0();
                }
            }
            C8116y c8116y = new C8116y(str);
            c8116y.m18481a(concurrentHashMap);
            c7993j1.m18091q();
            return c8116y;
        }
    }

    public C8116y(String str) {
        this.f22019j = str;
    }

    /* renamed from: a */
    public void m18481a(Map<String, Object> map) {
        this.f22020k = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f22019j != null) {
            interfaceC7919f2.mo18193e("source").mo18188j(interfaceC8040o0, this.f22019j);
        }
        Map<String, Object> map = this.f22020k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f22020k.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
