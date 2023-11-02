package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.sentry.protocol.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8102r implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21959j;

    /* renamed from: k */
    private String f21960k;

    /* renamed from: l */
    private Map<String, Object> f21961l;

    /* renamed from: io.sentry.protocol.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8103a implements InterfaceC7894d1<C8102r> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8102r mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                    if (!m18105R.equals("version")) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                    } else {
                        str2 = c7993j1.m18101Y();
                    }
                } else {
                    str = c7993j1.m18101Y();
                }
            }
            c7993j1.m18091q();
            if (str != null) {
                if (str2 != null) {
                    C8102r c8102r = new C8102r(str, str2);
                    c8102r.m18573c(hashMap);
                    return c8102r;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"version\"");
                interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"version\"", illegalStateException);
                throw illegalStateException;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"name\"");
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"name\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public C8102r(String str, String str2) {
        this.f21959j = (String) C8229o.m18169c(str, "name is required.");
        this.f21960k = (String) C8229o.m18169c(str2, "version is required.");
    }

    /* renamed from: a */
    public String m18575a() {
        return this.f21959j;
    }

    /* renamed from: b */
    public String m18574b() {
        return this.f21960k;
    }

    /* renamed from: c */
    public void m18573c(Map<String, Object> map) {
        this.f21961l = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8102r.class != obj.getClass()) {
            return false;
        }
        C8102r c8102r = (C8102r) obj;
        if (Objects.equals(this.f21959j, c8102r.f21959j) && Objects.equals(this.f21960k, c8102r.f21960k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f21959j, this.f21960k);
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21959j);
        interfaceC7919f2.mo18193e("version").mo18191g(this.f21960k);
        Map<String, Object> map = this.f21961l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21961l.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
