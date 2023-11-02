package io.sentry.clientreport;

import io.sentry.C7993j1;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.clientreport.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7876f implements InterfaceC8026n1 {

    /* renamed from: j */
    private final String f21489j;

    /* renamed from: k */
    private final String f21490k;

    /* renamed from: l */
    private final Long f21491l;

    /* renamed from: m */
    private Map<String, Object> f21492m;

    /* renamed from: io.sentry.clientreport.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7877a implements InterfaceC7894d1<C7876f> {
        /* renamed from: c */
        private Exception m19477c(String str, InterfaceC8040o0 interfaceC8040o0) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7876f mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            String str = null;
            String str2 = null;
            Long l = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1285004149:
                        if (m18105R.equals("quantity")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -934964668:
                        if (m18105R.equals("reason")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 50511102:
                        if (m18105R.equals("category")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        l = c7993j1.m19065P0();
                        break;
                    case 1:
                        str = c7993j1.m19061T0();
                        break;
                    case 2:
                        str2 = c7993j1.m19061T0();
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
            if (str != null) {
                if (str2 != null) {
                    if (l != null) {
                        C7876f c7876f = new C7876f(str, str2, l);
                        c7876f.m19479d(hashMap);
                        return c7876f;
                    }
                    throw m19477c("quantity", interfaceC8040o0);
                }
                throw m19477c("category", interfaceC8040o0);
            }
            throw m19477c("reason", interfaceC8040o0);
        }
    }

    public C7876f(String str, String str2, Long l) {
        this.f21489j = str;
        this.f21490k = str2;
        this.f21491l = l;
    }

    /* renamed from: a */
    public String m19482a() {
        return this.f21490k;
    }

    /* renamed from: b */
    public Long m19481b() {
        return this.f21491l;
    }

    /* renamed from: c */
    public String m19480c() {
        return this.f21489j;
    }

    /* renamed from: d */
    public void m19479d(Map<String, Object> map) {
        this.f21492m = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("reason").mo18191g(this.f21489j);
        interfaceC7919f2.mo18193e("category").mo18191g(this.f21490k);
        interfaceC7919f2.mo18193e("quantity").mo18189i(this.f21491l);
        Map<String, Object> map = this.f21492m;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21492m.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f21489j + "', category='" + this.f21490k + "', quantity=" + this.f21491l + '}';
    }
}