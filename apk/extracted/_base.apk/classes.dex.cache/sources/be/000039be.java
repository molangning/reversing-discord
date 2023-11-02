package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8078f implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21885j;

    /* renamed from: k */
    private String f21886k;

    /* renamed from: l */
    private String f21887l;

    /* renamed from: m */
    private Map<String, Object> f21888m;

    /* renamed from: io.sentry.protocol.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8079a implements InterfaceC7894d1<C8078f> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8078f mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8078f c8078f = new C8078f();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -934795532:
                        if (m18105R.equals("region")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3053931:
                        if (m18105R.equals("city")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1481071862:
                        if (m18105R.equals("country_code")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8078f.f21887l = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8078f.f21885j = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8078f.f21886k = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8078f.m18683d(concurrentHashMap);
            c7993j1.m18091q();
            return c8078f;
        }
    }

    /* renamed from: d */
    public void m18683d(Map<String, Object> map) {
        this.f21888m = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21885j != null) {
            interfaceC7919f2.mo18193e("city").mo18191g(this.f21885j);
        }
        if (this.f21886k != null) {
            interfaceC7919f2.mo18193e("country_code").mo18191g(this.f21886k);
        }
        if (this.f21887l != null) {
            interfaceC7919f2.mo18193e("region").mo18191g(this.f21887l);
        }
        Map<String, Object> map = this.f21888m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21888m.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}