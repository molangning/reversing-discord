package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8070c0 implements InterfaceC8026n1 {

    /* renamed from: j */
    private String f21835j;

    /* renamed from: k */
    private String f21836k;

    /* renamed from: l */
    private String f21837l;

    /* renamed from: m */
    private String f21838m;

    /* renamed from: n */
    private Double f21839n;

    /* renamed from: o */
    private Double f21840o;

    /* renamed from: p */
    private Double f21841p;

    /* renamed from: q */
    private Double f21842q;

    /* renamed from: r */
    private String f21843r;

    /* renamed from: s */
    private Double f21844s;

    /* renamed from: t */
    private List<C8070c0> f21845t;

    /* renamed from: u */
    private Map<String, Object> f21846u;

    /* renamed from: io.sentry.protocol.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8071a implements InterfaceC7894d1<C8070c0> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8070c0 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8070c0 c8070c0 = new C8070c0();
            c7993j1.m18097h();
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1784982718:
                        if (m18105R.equals("rendering_system")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1618432855:
                        if (m18105R.equals("identifier")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1221029593:
                        if (m18105R.equals("height")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 120:
                        if (m18105R.equals("x")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 121:
                        if (m18105R.equals("y")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 114586:
                        if (m18105R.equals("tag")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 92909918:
                        if (m18105R.equals("alpha")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 113126854:
                        if (m18105R.equals("width")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1659526655:
                        if (m18105R.equals("children")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1941332754:
                        if (m18105R.equals("visibility")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8070c0.f21835j = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8070c0.f21837l = c7993j1.m19061T0();
                        break;
                    case 2:
                        c8070c0.f21840o = c7993j1.m19070K0();
                        break;
                    case 3:
                        c8070c0.f21841p = c7993j1.m19070K0();
                        break;
                    case 4:
                        c8070c0.f21842q = c7993j1.m19070K0();
                        break;
                    case 5:
                        c8070c0.f21838m = c7993j1.m19061T0();
                        break;
                    case 6:
                        c8070c0.f21836k = c7993j1.m19061T0();
                        break;
                    case 7:
                        c8070c0.f21844s = c7993j1.m19070K0();
                        break;
                    case '\b':
                        c8070c0.f21839n = c7993j1.m19070K0();
                        break;
                    case '\t':
                        c8070c0.f21845t = c7993j1.m19066O0(interfaceC8040o0, this);
                        break;
                    case '\n':
                        c8070c0.f21843r = c7993j1.m19061T0();
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
            c8070c0.m18771q(hashMap);
            return c8070c0;
        }
    }

    /* renamed from: l */
    public void m18776l(Double d) {
        this.f21844s = d;
    }

    /* renamed from: m */
    public void m18775m(List<C8070c0> list) {
        this.f21845t = list;
    }

    /* renamed from: n */
    public void m18774n(Double d) {
        this.f21840o = d;
    }

    /* renamed from: o */
    public void m18773o(String str) {
        this.f21837l = str;
    }

    /* renamed from: p */
    public void m18772p(String str) {
        this.f21836k = str;
    }

    /* renamed from: q */
    public void m18771q(Map<String, Object> map) {
        this.f21846u = map;
    }

    /* renamed from: r */
    public void m18770r(String str) {
        this.f21843r = str;
    }

    /* renamed from: s */
    public void m18769s(Double d) {
        this.f21839n = d;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21835j != null) {
            interfaceC7919f2.mo18193e("rendering_system").mo18191g(this.f21835j);
        }
        if (this.f21836k != null) {
            interfaceC7919f2.mo18193e("type").mo18191g(this.f21836k);
        }
        if (this.f21837l != null) {
            interfaceC7919f2.mo18193e("identifier").mo18191g(this.f21837l);
        }
        if (this.f21838m != null) {
            interfaceC7919f2.mo18193e("tag").mo18191g(this.f21838m);
        }
        if (this.f21839n != null) {
            interfaceC7919f2.mo18193e("width").mo18189i(this.f21839n);
        }
        if (this.f21840o != null) {
            interfaceC7919f2.mo18193e("height").mo18189i(this.f21840o);
        }
        if (this.f21841p != null) {
            interfaceC7919f2.mo18193e("x").mo18189i(this.f21841p);
        }
        if (this.f21842q != null) {
            interfaceC7919f2.mo18193e("y").mo18189i(this.f21842q);
        }
        if (this.f21843r != null) {
            interfaceC7919f2.mo18193e("visibility").mo18191g(this.f21843r);
        }
        if (this.f21844s != null) {
            interfaceC7919f2.mo18193e("alpha").mo18189i(this.f21844s);
        }
        List<C8070c0> list = this.f21845t;
        if (list != null && !list.isEmpty()) {
            interfaceC7919f2.mo18193e("children").mo18188j(interfaceC8040o0, this.f21845t);
        }
        Map<String, Object> map = this.f21846u;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21846u.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* renamed from: t */
    public void m18768t(Double d) {
        this.f21841p = d;
    }

    /* renamed from: u */
    public void m18767u(Double d) {
        this.f21842q = d;
    }
}