package io.sentry;

import io.sentry.C8034n5;
import io.sentry.protocol.C8096o;
import io.sentry.protocol.C8100q;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.n3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8030n3 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final C8100q f21740j;

    /* renamed from: k */
    private final C8096o f21741k;

    /* renamed from: l */
    private final C8034n5 f21742l;

    /* renamed from: m */
    private Date f21743m;

    /* renamed from: n */
    private Map<String, Object> f21744n;

    /* renamed from: io.sentry.n3$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8031a implements InterfaceC7894d1<C8030n3> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8030n3 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8100q c8100q = null;
            C8096o c8096o = null;
            C8034n5 c8034n5 = null;
            Date date = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case 113722:
                        if (m18105R.equals("sdk")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 110620997:
                        if (m18105R.equals("trace")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 278118624:
                        if (m18105R.equals("event_id")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1980389946:
                        if (m18105R.equals("sent_at")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8096o = (C8096o) c7993j1.m19062S0(interfaceC8040o0, new C8096o.C8097a());
                        break;
                    case 1:
                        c8034n5 = (C8034n5) c7993j1.m19062S0(interfaceC8040o0, new C8034n5.C8036b());
                        break;
                    case 2:
                        c8100q = (C8100q) c7993j1.m19062S0(interfaceC8040o0, new C8100q.C8101a());
                        break;
                    case 3:
                        date = c7993j1.m19071J0(interfaceC8040o0);
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                        break;
                }
            }
            C8030n3 c8030n3 = new C8030n3(c8100q, c8096o, c8034n5);
            c8030n3.m18945d(date);
            c8030n3.m18944e(hashMap);
            c7993j1.m18091q();
            return c8030n3;
        }
    }

    public C8030n3(C8100q c8100q, C8096o c8096o) {
        this(c8100q, c8096o, null);
    }

    /* renamed from: a */
    public C8100q m18948a() {
        return this.f21740j;
    }

    /* renamed from: b */
    public C8096o m18947b() {
        return this.f21741k;
    }

    /* renamed from: c */
    public C8034n5 m18946c() {
        return this.f21742l;
    }

    /* renamed from: d */
    public void m18945d(Date date) {
        this.f21743m = date;
    }

    /* renamed from: e */
    public void m18944e(Map<String, Object> map) {
        this.f21744n = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21740j != null) {
            interfaceC7919f2.mo18193e("event_id").mo18188j(interfaceC8040o0, this.f21740j);
        }
        if (this.f21741k != null) {
            interfaceC7919f2.mo18193e("sdk").mo18188j(interfaceC8040o0, this.f21741k);
        }
        if (this.f21742l != null) {
            interfaceC7919f2.mo18193e("trace").mo18188j(interfaceC8040o0, this.f21742l);
        }
        if (this.f21743m != null) {
            interfaceC7919f2.mo18193e("sent_at").mo18188j(interfaceC8040o0, C7991j.m19084g(this.f21743m));
        }
        Map<String, Object> map = this.f21744n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21744n.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8030n3(C8100q c8100q, C8096o c8096o, C8034n5 c8034n5) {
        this.f21740j = c8100q;
        this.f21741k = c8096o;
        this.f21742l = c8034n5;
    }

    public C8030n3(C8100q c8100q) {
        this(c8100q, null);
    }

    public C8030n3() {
        this(new C8100q());
    }
}
