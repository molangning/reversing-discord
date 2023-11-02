package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8070c0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8066b0 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final String f21832j;

    /* renamed from: k */
    private final List<C8070c0> f21833k;

    /* renamed from: l */
    private Map<String, Object> f21834l;

    /* renamed from: io.sentry.protocol.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8067a implements InterfaceC7894d1<C8066b0> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8066b0 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            String str = null;
            List list = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("rendering_system")) {
                    if (!m18105R.equals("windows")) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                    } else {
                        list = c7993j1.m19066O0(interfaceC8040o0, new C8070c0.C8071a());
                    }
                } else {
                    str = c7993j1.m19061T0();
                }
            }
            c7993j1.m18091q();
            C8066b0 c8066b0 = new C8066b0(str, list);
            c8066b0.m18804a(hashMap);
            return c8066b0;
        }
    }

    public C8066b0(String str, List<C8070c0> list) {
        this.f21832j = str;
        this.f21833k = list;
    }

    /* renamed from: a */
    public void m18804a(Map<String, Object> map) {
        this.f21834l = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21832j != null) {
            interfaceC7919f2.mo18193e("rendering_system").mo18191g(this.f21832j);
        }
        if (this.f21833k != null) {
            interfaceC7919f2.mo18193e("windows").mo18188j(interfaceC8040o0, this.f21833k);
        }
        Map<String, Object> map = this.f21834l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21834l.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
