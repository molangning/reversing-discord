package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.C8004k4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8102r;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.protocol.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8096o implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21945j;

    /* renamed from: k */
    private String f21946k;

    /* renamed from: l */
    private Set<C8102r> f21947l;

    /* renamed from: m */
    private Set<String> f21948m;

    /* renamed from: n */
    private Map<String, Object> f21949n;

    /* renamed from: io.sentry.protocol.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8097a implements InterfaceC7894d1<C8096o> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8096o mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c7993j1.m18097h();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 351608024:
                        if (m18105R.equals("version")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 750867693:
                        if (m18105R.equals("packages")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1487029535:
                        if (m18105R.equals("integrations")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = c7993j1.m18101Y();
                        break;
                    case 1:
                        str2 = c7993j1.m18101Y();
                        break;
                    case 2:
                        List m19066O0 = c7993j1.m19066O0(interfaceC8040o0, new C8102r.C8103a());
                        if (m19066O0 == null) {
                            break;
                        } else {
                            arrayList.addAll(m19066O0);
                            break;
                        }
                    case 3:
                        List list = (List) c7993j1.m19063R0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
                    C8096o c8096o = new C8096o(str, str2);
                    c8096o.f21947l = new CopyOnWriteArraySet(arrayList);
                    c8096o.f21948m = new CopyOnWriteArraySet(arrayList2);
                    c8096o.m18598l(hashMap);
                    return c8096o;
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

    public C8096o(String str, String str2) {
        this.f21945j = (String) C8229o.m18169c(str, "name is required.");
        this.f21946k = (String) C8229o.m18169c(str2, "version is required.");
    }

    /* renamed from: n */
    public static C8096o m18596n(C8096o c8096o, String str, String str2) {
        C8229o.m18169c(str, "name is required.");
        C8229o.m18169c(str2, "version is required.");
        if (c8096o == null) {
            return new C8096o(str, str2);
        }
        c8096o.m18599k(str);
        c8096o.m18597m(str2);
        return c8096o;
    }

    /* renamed from: c */
    public void m18607c(String str) {
        C8004k4.m19025c().m19027a(str);
    }

    /* renamed from: d */
    public void m18606d(String str, String str2) {
        C8004k4.m19025c().m19026b(str, str2);
    }

    /* renamed from: e */
    public Set<String> m18605e() {
        Set<String> set = this.f21948m;
        if (set == null) {
            return C8004k4.m19025c().m19024d();
        }
        return set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8096o.class != obj.getClass()) {
            return false;
        }
        C8096o c8096o = (C8096o) obj;
        if (this.f21945j.equals(c8096o.f21945j) && this.f21946k.equals(c8096o.f21946k)) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public List<String> m18604f() {
        Set<String> set = this.f21948m;
        if (set == null) {
            set = C8004k4.m19025c().m19024d();
        }
        return new CopyOnWriteArrayList(set);
    }

    /* renamed from: g */
    public String m18603g() {
        return this.f21945j;
    }

    /* renamed from: h */
    public Set<C8102r> m18602h() {
        Set<C8102r> set = this.f21947l;
        if (set == null) {
            return C8004k4.m19025c().m19023e();
        }
        return set;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21945j, this.f21946k);
    }

    @Deprecated
    /* renamed from: i */
    public List<C8102r> m18601i() {
        Set<C8102r> set = this.f21947l;
        if (set == null) {
            set = C8004k4.m19025c().m19023e();
        }
        return new CopyOnWriteArrayList(set);
    }

    /* renamed from: j */
    public String m18600j() {
        return this.f21946k;
    }

    /* renamed from: k */
    public void m18599k(String str) {
        this.f21945j = (String) C8229o.m18169c(str, "name is required.");
    }

    /* renamed from: l */
    public void m18598l(Map<String, Object> map) {
        this.f21949n = map;
    }

    /* renamed from: m */
    public void m18597m(String str) {
        this.f21946k = (String) C8229o.m18169c(str, "version is required.");
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21945j);
        interfaceC7919f2.mo18193e("version").mo18191g(this.f21946k);
        Set<C8102r> m18602h = m18602h();
        Set<String> m18605e = m18605e();
        if (!m18602h.isEmpty()) {
            interfaceC7919f2.mo18193e("packages").mo18188j(interfaceC8040o0, m18602h);
        }
        if (!m18605e.isEmpty()) {
            interfaceC7919f2.mo18193e("integrations").mo18188j(interfaceC8040o0, m18605e);
        }
        Map<String, Object> map = this.f21949n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21949n.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}