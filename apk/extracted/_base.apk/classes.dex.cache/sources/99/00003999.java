package io.sentry;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.o2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8042o2 implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21767j;

    /* renamed from: k */
    private String f21768k;

    /* renamed from: l */
    private String f21769l;

    /* renamed from: m */
    private Long f21770m;

    /* renamed from: n */
    private Long f21771n;

    /* renamed from: o */
    private Long f21772o;

    /* renamed from: p */
    private Long f21773p;

    /* renamed from: q */
    private Map<String, Object> f21774q;

    /* renamed from: io.sentry.o2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8043a implements InterfaceC7894d1<C8042o2> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8042o2 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8042o2 c8042o2 = new C8042o2();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -112372011:
                        if (m18105R.equals("relative_start_ns")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -84607876:
                        if (m18105R.equals("relative_end_ns")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3355:
                        if (m18105R.equals("id")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (m18105R.equals("trace_id")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1566648660:
                        if (m18105R.equals("relative_cpu_end_ms")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1902256621:
                        if (m18105R.equals("relative_cpu_start_ms")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Long m19065P0 = c7993j1.m19065P0();
                        if (m19065P0 == null) {
                            break;
                        } else {
                            c8042o2.f21770m = m19065P0;
                            break;
                        }
                    case 1:
                        Long m19065P02 = c7993j1.m19065P0();
                        if (m19065P02 == null) {
                            break;
                        } else {
                            c8042o2.f21771n = m19065P02;
                            break;
                        }
                    case 2:
                        String m19061T0 = c7993j1.m19061T0();
                        if (m19061T0 == null) {
                            break;
                        } else {
                            c8042o2.f21767j = m19061T0;
                            break;
                        }
                    case 3:
                        String m19061T02 = c7993j1.m19061T0();
                        if (m19061T02 == null) {
                            break;
                        } else {
                            c8042o2.f21769l = m19061T02;
                            break;
                        }
                    case 4:
                        String m19061T03 = c7993j1.m19061T0();
                        if (m19061T03 == null) {
                            break;
                        } else {
                            c8042o2.f21768k = m19061T03;
                            break;
                        }
                    case 5:
                        Long m19065P03 = c7993j1.m19065P0();
                        if (m19065P03 == null) {
                            break;
                        } else {
                            c8042o2.f21773p = m19065P03;
                            break;
                        }
                    case 6:
                        Long m19065P04 = c7993j1.m19065P0();
                        if (m19065P04 == null) {
                            break;
                        } else {
                            c8042o2.f21772o = m19065P04;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8042o2.m18909j(concurrentHashMap);
            c7993j1.m18091q();
            return c8042o2;
        }
    }

    public C8042o2() {
        this(C7833b2.m19587t(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8042o2.class != obj.getClass()) {
            return false;
        }
        C8042o2 c8042o2 = (C8042o2) obj;
        if (this.f21767j.equals(c8042o2.f21767j) && this.f21768k.equals(c8042o2.f21768k) && this.f21769l.equals(c8042o2.f21769l) && this.f21770m.equals(c8042o2.f21770m) && this.f21772o.equals(c8042o2.f21772o) && C8229o.m18171a(this.f21773p, c8042o2.f21773p) && C8229o.m18171a(this.f21771n, c8042o2.f21771n) && C8229o.m18171a(this.f21774q, c8042o2.f21774q)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public String m18911h() {
        return this.f21767j;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21767j, this.f21768k, this.f21769l, this.f21770m, this.f21771n, this.f21772o, this.f21773p, this.f21774q);
    }

    /* renamed from: i */
    public void m18910i(Long l, Long l2, Long l3, Long l4) {
        if (this.f21771n == null) {
            this.f21771n = Long.valueOf(l.longValue() - l2.longValue());
            this.f21770m = Long.valueOf(this.f21770m.longValue() - l2.longValue());
            this.f21773p = Long.valueOf(l3.longValue() - l4.longValue());
            this.f21772o = Long.valueOf(this.f21772o.longValue() - l4.longValue());
        }
    }

    /* renamed from: j */
    public void m18909j(Map<String, Object> map) {
        this.f21774q = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("id").mo18188j(interfaceC8040o0, this.f21767j);
        interfaceC7919f2.mo18193e("trace_id").mo18188j(interfaceC8040o0, this.f21768k);
        interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18188j(interfaceC8040o0, this.f21769l);
        interfaceC7919f2.mo18193e("relative_start_ns").mo18188j(interfaceC8040o0, this.f21770m);
        interfaceC7919f2.mo18193e("relative_end_ns").mo18188j(interfaceC8040o0, this.f21771n);
        interfaceC7919f2.mo18193e("relative_cpu_start_ms").mo18188j(interfaceC8040o0, this.f21772o);
        interfaceC7919f2.mo18193e("relative_cpu_end_ms").mo18188j(interfaceC8040o0, this.f21773p);
        Map<String, Object> map = this.f21774q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21774q.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8042o2(InterfaceC8259w0 interfaceC8259w0, Long l, Long l2) {
        this.f21767j = interfaceC8259w0.mo17947e().toString();
        this.f21768k = interfaceC8259w0.mo17936p().m19295k().toString();
        this.f21769l = interfaceC8259w0.getName();
        this.f21770m = l;
        this.f21772o = l2;
    }
}