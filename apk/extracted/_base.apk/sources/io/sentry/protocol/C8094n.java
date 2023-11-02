package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8094n implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21940j;

    /* renamed from: k */
    private Integer f21941k;

    /* renamed from: l */
    private Integer f21942l;

    /* renamed from: m */
    private Integer f21943m;

    /* renamed from: n */
    private Map<String, Object> f21944n;

    /* renamed from: io.sentry.protocol.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8095a implements InterfaceC7894d1<C8094n> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8094n mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8094n c8094n = new C8094n();
            c7993j1.m18097h();
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case 270207856:
                        if (m18105R.equals("sdk_name")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 696101379:
                        if (m18105R.equals("version_patchlevel")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1111241618:
                        if (m18105R.equals("version_major")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1111483790:
                        if (m18105R.equals("version_minor")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8094n.f21940j = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8094n.f21943m = c7993j1.m19067N0();
                        break;
                    case 2:
                        c8094n.f21941k = c7993j1.m19067N0();
                        break;
                    case 3:
                        c8094n.f21942l = c7993j1.m19067N0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                        break;
                }
            }
            c7993j1.m18091q();
            c8094n.m18611e(hashMap);
            return c8094n;
        }
    }

    /* renamed from: e */
    public void m18611e(Map<String, Object> map) {
        this.f21944n = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21940j != null) {
            interfaceC7919f2.mo18193e("sdk_name").mo18191g(this.f21940j);
        }
        if (this.f21941k != null) {
            interfaceC7919f2.mo18193e("version_major").mo18189i(this.f21941k);
        }
        if (this.f21942l != null) {
            interfaceC7919f2.mo18193e("version_minor").mo18189i(this.f21942l);
        }
        if (this.f21943m != null) {
            interfaceC7919f2.mo18193e("version_patchlevel").mo18189i(this.f21943m);
        }
        Map<String, Object> map = this.f21944n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21944n.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
