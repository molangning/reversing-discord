package io.sentry;

import io.sentry.EnumC8021m4;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Date;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7901e implements InterfaceC8026n1 {

    /* renamed from: j */
    private final Date f21529j;

    /* renamed from: k */
    private String f21530k;

    /* renamed from: l */
    private String f21531l;

    /* renamed from: m */
    private Map<String, Object> f21532m;

    /* renamed from: n */
    private String f21533n;

    /* renamed from: o */
    private EnumC8021m4 f21534o;

    /* renamed from: p */
    private Map<String, Object> f21535p;

    /* renamed from: io.sentry.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7902a implements InterfaceC7894d1<C7901e> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7901e mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            Date m19088c = C7991j.m19088c();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = null;
            String str2 = null;
            String str3 = null;
            EnumC8021m4 enumC8021m4 = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case 3076010:
                        if (m18105R.equals("data")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
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
                    case 55126294:
                        if (m18105R.equals("timestamp")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 102865796:
                        if (m18105R.equals("level")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 954925063:
                        if (m18105R.equals("message")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        ?? m18238b = C8212b.m18238b((Map) c7993j1.m19063R0());
                        if (m18238b == 0) {
                            break;
                        } else {
                            concurrentHashMap = m18238b;
                            break;
                        }
                    case 1:
                        str2 = c7993j1.m19061T0();
                        break;
                    case 2:
                        str3 = c7993j1.m19061T0();
                        break;
                    case 3:
                        Date m19071J0 = c7993j1.m19071J0(interfaceC8040o0);
                        if (m19071J0 == null) {
                            break;
                        } else {
                            m19088c = m19071J0;
                            break;
                        }
                    case 4:
                        try {
                            enumC8021m4 = new EnumC8021m4.C8022a().mo18130a(c7993j1, interfaceC8040o0);
                            break;
                        } catch (Exception e) {
                            interfaceC8040o0.mo18137a(EnumC8021m4.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case 5:
                        str = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap2, m18105R);
                        break;
                }
            }
            C7901e c7901e = new C7901e(m19088c);
            c7901e.f21530k = str;
            c7901e.f21531l = str2;
            c7901e.f21532m = concurrentHashMap;
            c7901e.f21533n = str3;
            c7901e.f21534o = enumC8021m4;
            c7901e.m19324q(concurrentHashMap2);
            c7993j1.m18091q();
            return c7901e;
        }
    }

    public C7901e(Date date) {
        this.f21532m = new ConcurrentHashMap();
        this.f21529j = date;
    }

    /* renamed from: r */
    public static C7901e m19323r(String str, String str2, String str3, String str4, Map<String, Object> map) {
        C7901e c7901e = new C7901e();
        c7901e.m19325p("user");
        c7901e.m19329l("ui." + str);
        if (str2 != null) {
            c7901e.m19328m("view.id", str2);
        }
        if (str3 != null) {
            c7901e.m19328m("view.class", str3);
        }
        if (str4 != null) {
            c7901e.m19328m("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            c7901e.m19334g().put(entry.getKey(), entry.getValue());
        }
        c7901e.m19327n(EnumC8021m4.INFO);
        return c7901e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7901e.class != obj.getClass()) {
            return false;
        }
        C7901e c7901e = (C7901e) obj;
        if (this.f21529j.getTime() == c7901e.f21529j.getTime() && C8229o.m18171a(this.f21530k, c7901e.f21530k) && C8229o.m18171a(this.f21531l, c7901e.f21531l) && C8229o.m18171a(this.f21533n, c7901e.f21533n) && this.f21534o == c7901e.f21534o) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m19335f() {
        return this.f21533n;
    }

    /* renamed from: g */
    public Map<String, Object> m19334g() {
        return this.f21532m;
    }

    /* renamed from: h */
    public EnumC8021m4 m19333h() {
        return this.f21534o;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21529j, this.f21530k, this.f21531l, this.f21533n, this.f21534o);
    }

    /* renamed from: i */
    public String m19332i() {
        return this.f21530k;
    }

    /* renamed from: j */
    public Date m19331j() {
        return (Date) this.f21529j.clone();
    }

    /* renamed from: k */
    public String m19330k() {
        return this.f21531l;
    }

    /* renamed from: l */
    public void m19329l(String str) {
        this.f21533n = str;
    }

    /* renamed from: m */
    public void m19328m(String str, Object obj) {
        this.f21532m.put(str, obj);
    }

    /* renamed from: n */
    public void m19327n(EnumC8021m4 enumC8021m4) {
        this.f21534o = enumC8021m4;
    }

    /* renamed from: o */
    public void m19326o(String str) {
        this.f21530k = str;
    }

    /* renamed from: p */
    public void m19325p(String str) {
        this.f21531l = str;
    }

    /* renamed from: q */
    public void m19324q(Map<String, Object> map) {
        this.f21535p = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("timestamp").mo18188j(interfaceC8040o0, this.f21529j);
        if (this.f21530k != null) {
            interfaceC7919f2.mo18193e("message").mo18191g(this.f21530k);
        }
        if (this.f21531l != null) {
            interfaceC7919f2.mo18193e("type").mo18191g(this.f21531l);
        }
        interfaceC7919f2.mo18193e("data").mo18188j(interfaceC8040o0, this.f21532m);
        if (this.f21533n != null) {
            interfaceC7919f2.mo18193e("category").mo18191g(this.f21533n);
        }
        if (this.f21534o != null) {
            interfaceC7919f2.mo18193e("level").mo18188j(interfaceC8040o0, this.f21534o);
        }
        Map<String, Object> map = this.f21535p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21535p.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7901e(C7901e c7901e) {
        this.f21532m = new ConcurrentHashMap();
        this.f21529j = c7901e.f21529j;
        this.f21530k = c7901e.f21530k;
        this.f21531l = c7901e.f21531l;
        this.f21533n = c7901e.f21533n;
        Map<String, Object> m18238b = C8212b.m18238b(c7901e.f21532m);
        if (m18238b != null) {
            this.f21532m = m18238b;
        }
        this.f21535p = C8212b.m18238b(c7901e.f21535p);
        this.f21534o = c7901e.f21534o;
    }

    public C7901e() {
        this(C7991j.m19088c());
    }

    public C7901e(String str) {
        this();
        this.f21530k = str;
    }
}
