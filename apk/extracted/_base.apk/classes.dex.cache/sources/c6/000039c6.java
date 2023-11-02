package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8086j implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21911j;

    /* renamed from: k */
    private String f21912k;

    /* renamed from: l */
    private List<String> f21913l;

    /* renamed from: m */
    private Map<String, Object> f21914m;

    /* renamed from: io.sentry.protocol.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8087a implements InterfaceC7894d1<C8086j> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8086j mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8086j c8086j = new C8086j();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -995427962:
                        if (m18105R.equals("params")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 954925063:
                        if (m18105R.equals("message")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1811591356:
                        if (m18105R.equals("formatted")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        List list = (List) c7993j1.m19063R0();
                        if (list == null) {
                            break;
                        } else {
                            c8086j.f21913l = list;
                            break;
                        }
                    case 1:
                        c8086j.f21912k = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8086j.f21911j = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8086j.m18652e(concurrentHashMap);
            c7993j1.m18091q();
            return c8086j;
        }
    }

    /* renamed from: d */
    public void m18653d(String str) {
        this.f21911j = str;
    }

    /* renamed from: e */
    public void m18652e(Map<String, Object> map) {
        this.f21914m = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21911j != null) {
            interfaceC7919f2.mo18193e("formatted").mo18191g(this.f21911j);
        }
        if (this.f21912k != null) {
            interfaceC7919f2.mo18193e("message").mo18191g(this.f21912k);
        }
        List<String> list = this.f21913l;
        if (list != null && !list.isEmpty()) {
            interfaceC7919f2.mo18193e("params").mo18188j(interfaceC8040o0, this.f21913l);
        }
        Map<String, Object> map = this.f21914m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21914m.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}