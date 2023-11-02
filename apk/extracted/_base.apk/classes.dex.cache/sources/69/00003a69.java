package io.sentry;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.protocol.C8100q;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.v5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8248v5 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final C8100q f22167j;

    /* renamed from: k */
    private String f22168k;

    /* renamed from: l */
    private String f22169l;

    /* renamed from: m */
    private String f22170m;

    /* renamed from: n */
    private Map<String, Object> f22171n;

    /* renamed from: io.sentry.v5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8249a implements InterfaceC7894d1<C8248v5> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8248v5 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8100q c8100q = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -602415628:
                        if (m18105R.equals("comments")) {
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
                    case 96619420:
                        if (m18105R.equals("email")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 278118624:
                        if (m18105R.equals("event_id")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str3 = c7993j1.m19061T0();
                        break;
                    case 1:
                        str = c7993j1.m19061T0();
                        break;
                    case 2:
                        str2 = c7993j1.m19061T0();
                        break;
                    case 3:
                        c8100q = new C8100q.C8101a().mo18130a(c7993j1, interfaceC8040o0);
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
            if (c8100q != null) {
                C8248v5 c8248v5 = new C8248v5(c8100q, str, str2, str3);
                c8248v5.m18131a(hashMap);
                return c8248v5;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C8248v5(C8100q c8100q, String str, String str2, String str3) {
        this.f22167j = c8100q;
        this.f22168k = str;
        this.f22169l = str2;
        this.f22170m = str3;
    }

    /* renamed from: a */
    public void m18131a(Map<String, Object> map) {
        this.f22171n = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("event_id");
        this.f22167j.serialize(interfaceC7919f2, interfaceC8040o0);
        if (this.f22168k != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f22168k);
        }
        if (this.f22169l != null) {
            interfaceC7919f2.mo18193e("email").mo18191g(this.f22169l);
        }
        if (this.f22170m != null) {
            interfaceC7919f2.mo18193e("comments").mo18191g(this.f22170m);
        }
        Map<String, Object> map = this.f22171n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f22171n.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f22167j + ", name='" + this.f22168k + "', email='" + this.f22169l + "', comments='" + this.f22170m + "'}";
    }
}