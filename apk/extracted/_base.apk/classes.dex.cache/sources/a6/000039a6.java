package io.sentry.profilemeasurements;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.profilemeasurements.C8057b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.profilemeasurements.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8055a implements InterfaceC8026n1 {

    /* renamed from: j */
    private Map<String, Object> f21804j;

    /* renamed from: k */
    private String f21805k;

    /* renamed from: l */
    private Collection<C8057b> f21806l;

    /* renamed from: io.sentry.profilemeasurements.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8056a implements InterfaceC7894d1<C8055a> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8055a mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8055a c8055a = new C8055a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("values")) {
                    if (!m18105R.equals("unit")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                    } else {
                        String m19061T0 = c7993j1.m19061T0();
                        if (m19061T0 != null) {
                            c8055a.f21805k = m19061T0;
                        }
                    }
                } else {
                    List m19066O0 = c7993j1.m19066O0(interfaceC8040o0, new C8057b.C8058a());
                    if (m19066O0 != null) {
                        c8055a.f21806l = m19066O0;
                    }
                }
            }
            c8055a.m18857c(concurrentHashMap);
            c7993j1.m18091q();
            return c8055a;
        }
    }

    public C8055a() {
        this("unknown", new ArrayList());
    }

    /* renamed from: c */
    public void m18857c(Map<String, Object> map) {
        this.f21804j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8055a.class != obj.getClass()) {
            return false;
        }
        C8055a c8055a = (C8055a) obj;
        if (C8229o.m18171a(this.f21804j, c8055a.f21804j) && this.f21805k.equals(c8055a.f21805k) && new ArrayList(this.f21806l).equals(new ArrayList(c8055a.f21806l))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21804j, this.f21805k, this.f21806l);
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("unit").mo18188j(interfaceC8040o0, this.f21805k);
        interfaceC7919f2.mo18193e("values").mo18188j(interfaceC8040o0, this.f21806l);
        Map<String, Object> map = this.f21804j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21804j.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8055a(String str, Collection<C8057b> collection) {
        this.f21805k = str;
        this.f21806l = collection;
    }
}