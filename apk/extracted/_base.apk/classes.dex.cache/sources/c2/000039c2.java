package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8082h implements InterfaceC8026n1 {

    /* renamed from: j */
    private final Number f21899j;

    /* renamed from: k */
    private final String f21900k;

    /* renamed from: l */
    private Map<String, Object> f21901l;

    /* renamed from: io.sentry.protocol.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8083a implements InterfaceC7894d1<C8082h> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8082h mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("unit")) {
                    if (!m18105R.equals("value")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                    } else {
                        number = (Number) c7993j1.m19063R0();
                    }
                } else {
                    str = c7993j1.m19061T0();
                }
            }
            c7993j1.m18091q();
            if (number != null) {
                C8082h c8082h = new C8082h(number, str);
                c8082h.m18670a(concurrentHashMap);
                return c8082h;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C8082h(Number number, String str) {
        this.f21899j = number;
        this.f21900k = str;
    }

    /* renamed from: a */
    public void m18670a(Map<String, Object> map) {
        this.f21901l = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("value").mo18189i(this.f21899j);
        if (this.f21900k != null) {
            interfaceC7919f2.mo18193e("unit").mo18191g(this.f21900k);
        }
        Map<String, Object> map = this.f21901l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21901l.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}