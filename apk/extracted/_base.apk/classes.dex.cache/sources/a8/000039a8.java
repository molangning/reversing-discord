package io.sentry.profilemeasurements;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.profilemeasurements.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8057b implements InterfaceC8026n1 {

    /* renamed from: j */
    private Map<String, Object> f21807j;

    /* renamed from: k */
    private String f21808k;

    /* renamed from: l */
    private double f21809l;

    /* renamed from: io.sentry.profilemeasurements.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8058a implements InterfaceC7894d1<C8057b> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8057b mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8057b c8057b = new C8057b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("elapsed_since_start_ns")) {
                    if (!m18105R.equals("value")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                    } else {
                        Double m19070K0 = c7993j1.m19070K0();
                        if (m19070K0 != null) {
                            c8057b.f21809l = m19070K0.doubleValue();
                        }
                    }
                } else {
                    String m19061T0 = c7993j1.m19061T0();
                    if (m19061T0 != null) {
                        c8057b.f21808k = m19061T0;
                    }
                }
            }
            c8057b.m18853c(concurrentHashMap);
            c7993j1.m18091q();
            return c8057b;
        }
    }

    public C8057b() {
        this(0L, 0);
    }

    /* renamed from: c */
    public void m18853c(Map<String, Object> map) {
        this.f21807j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8057b.class != obj.getClass()) {
            return false;
        }
        C8057b c8057b = (C8057b) obj;
        if (C8229o.m18171a(this.f21807j, c8057b.f21807j) && this.f21808k.equals(c8057b.f21808k) && this.f21809l == c8057b.f21809l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21807j, this.f21808k, Double.valueOf(this.f21809l));
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("value").mo18188j(interfaceC8040o0, Double.valueOf(this.f21809l));
        interfaceC7919f2.mo18193e("elapsed_since_start_ns").mo18188j(interfaceC8040o0, this.f21808k);
        Map<String, Object> map = this.f21807j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21807j.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8057b(Long l, Number number) {
        this.f21808k = l.toString();
        this.f21809l = number.doubleValue();
    }
}