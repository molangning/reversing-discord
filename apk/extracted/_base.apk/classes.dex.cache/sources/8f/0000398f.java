package io.sentry;

import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.n4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8032n4 implements InterfaceC8026n1 {

    /* renamed from: j */
    private int f21745j;

    /* renamed from: k */
    private String f21746k;

    /* renamed from: l */
    private String f21747l;

    /* renamed from: m */
    private String f21748m;

    /* renamed from: n */
    private Long f21749n;

    /* renamed from: o */
    private Map<String, Object> f21750o;

    /* renamed from: io.sentry.n4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8033a implements InterfaceC7894d1<C8032n4> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8032n4 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8032n4 c8032n4 = new C8032n4();
            c7993j1.m18097h();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1877165340:
                        if (m18105R.equals("package_name")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1562235024:
                        if (m18105R.equals("thread_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1147692044:
                        if (m18105R.equals("address")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -290474766:
                        if (m18105R.equals("class_name")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8032n4.f21747l = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8032n4.f21749n = c7993j1.m19065P0();
                        break;
                    case 2:
                        c8032n4.f21746k = c7993j1.m19061T0();
                        break;
                    case 3:
                        c8032n4.f21748m = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8032n4.f21745j = c7993j1.m18107I();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8032n4.m18930m(concurrentHashMap);
            c7993j1.m18091q();
            return c8032n4;
        }
    }

    public C8032n4() {
    }

    public C8032n4(C8032n4 c8032n4) {
        this.f21745j = c8032n4.f21745j;
        this.f21746k = c8032n4.f21746k;
        this.f21747l = c8032n4.f21747l;
        this.f21748m = c8032n4.f21748m;
        this.f21749n = c8032n4.f21749n;
        this.f21750o = C8212b.m18238b(c8032n4.f21750o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8032n4.class == obj.getClass()) {
            return C8229o.m18171a(this.f21746k, ((C8032n4) obj).f21746k);
        }
        return false;
    }

    /* renamed from: f */
    public String m18937f() {
        return this.f21746k;
    }

    /* renamed from: g */
    public int m18936g() {
        return this.f21745j;
    }

    /* renamed from: h */
    public void m18935h(String str) {
        this.f21746k = str;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21746k);
    }

    /* renamed from: i */
    public void m18934i(String str) {
        this.f21748m = str;
    }

    /* renamed from: j */
    public void m18933j(String str) {
        this.f21747l = str;
    }

    /* renamed from: k */
    public void m18932k(Long l) {
        this.f21749n = l;
    }

    /* renamed from: l */
    public void m18931l(int i) {
        this.f21745j = i;
    }

    /* renamed from: m */
    public void m18930m(Map<String, Object> map) {
        this.f21750o = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("type").mo18197a(this.f21745j);
        if (this.f21746k != null) {
            interfaceC7919f2.mo18193e("address").mo18191g(this.f21746k);
        }
        if (this.f21747l != null) {
            interfaceC7919f2.mo18193e("package_name").mo18191g(this.f21747l);
        }
        if (this.f21748m != null) {
            interfaceC7919f2.mo18193e("class_name").mo18191g(this.f21748m);
        }
        if (this.f21749n != null) {
            interfaceC7919f2.mo18193e("thread_id").mo18189i(this.f21749n);
        }
        Map<String, Object> map = this.f21750o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21750o.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }
}