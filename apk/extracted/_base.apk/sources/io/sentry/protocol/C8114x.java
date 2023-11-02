package io.sentry.protocol;

import io.sentry.AbstractC7920f3;
import io.sentry.C7900d5;
import io.sentry.C7911e5;
import io.sentry.C7991j;
import io.sentry.C7993j1;
import io.sentry.C8054p5;
import io.sentry.C8281z4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8082h;
import io.sentry.protocol.C8106t;
import io.sentry.protocol.C8116y;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8114x extends AbstractC7920f3 implements InterfaceC8026n1 {

    /* renamed from: A */
    private Double f22011A;

    /* renamed from: B */
    private final List<C8106t> f22012B;

    /* renamed from: C */
    private final String f22013C;

    /* renamed from: D */
    private final Map<String, C8082h> f22014D;

    /* renamed from: E */
    private C8116y f22015E;

    /* renamed from: F */
    private Map<String, Object> f22016F;

    /* renamed from: y */
    private String f22017y;

    /* renamed from: z */
    private Double f22018z;

    /* renamed from: io.sentry.protocol.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8115a implements InterfaceC7894d1<C8114x> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8114x mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8114x c8114x = new C8114x("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new C8116y(EnumC8118z.CUSTOM.apiName()));
            AbstractC7920f3.C7921a c7921a = new AbstractC7920f3.C7921a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1526966919:
                        if (m18105R.equals("start_timestamp")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -362243017:
                        if (m18105R.equals("measurements")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
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
                    case 109638249:
                        if (m18105R.equals("spans")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 508716399:
                        if (m18105R.equals("transaction_info")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2141246174:
                        if (m18105R.equals("transaction")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        try {
                            Double m19070K0 = c7993j1.m19070K0();
                            if (m19070K0 == null) {
                                break;
                            } else {
                                c8114x.f22018z = m19070K0;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date m19071J0 = c7993j1.m19071J0(interfaceC8040o0);
                            if (m19071J0 == null) {
                                break;
                            } else {
                                c8114x.f22018z = Double.valueOf(C7991j.m19089b(m19071J0));
                                break;
                            }
                        }
                    case 1:
                        Map m19064Q0 = c7993j1.m19064Q0(interfaceC8040o0, new C8082h.C8083a());
                        if (m19064Q0 == null) {
                            break;
                        } else {
                            c8114x.f22014D.putAll(m19064Q0);
                            break;
                        }
                    case 2:
                        c7993j1.m18101Y();
                        break;
                    case 3:
                        try {
                            Double m19070K02 = c7993j1.m19070K0();
                            if (m19070K02 == null) {
                                break;
                            } else {
                                c8114x.f22011A = m19070K02;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date m19071J02 = c7993j1.m19071J0(interfaceC8040o0);
                            if (m19071J02 == null) {
                                break;
                            } else {
                                c8114x.f22011A = Double.valueOf(C7991j.m19089b(m19071J02));
                                break;
                            }
                        }
                    case 4:
                        List m19066O0 = c7993j1.m19066O0(interfaceC8040o0, new C8106t.C8107a());
                        if (m19066O0 == null) {
                            break;
                        } else {
                            c8114x.f22012B.addAll(m19066O0);
                            break;
                        }
                    case 5:
                        c8114x.f22015E = new C8116y.C8117a().mo18130a(c7993j1, interfaceC8040o0);
                        break;
                    case 6:
                        c8114x.f22017y = c7993j1.m19061T0();
                        break;
                    default:
                        if (!c7921a.m19215a(c8114x, m18105R, c7993j1, interfaceC8040o0)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                            break;
                        } else {
                            break;
                        }
                }
            }
            c8114x.m18483r0(concurrentHashMap);
            c7993j1.m18091q();
            return c8114x;
        }
    }

    public C8114x(C8281z4 c8281z4) {
        super(c8281z4.mo17947e());
        this.f22012B = new ArrayList();
        this.f22013C = "transaction";
        this.f22014D = new HashMap();
        C8229o.m18169c(c8281z4, "sentryTracer is required");
        this.f22018z = Double.valueOf(C7991j.m19079l(c8281z4.mo17933s().mo18864f()));
        this.f22011A = Double.valueOf(C7991j.m19079l(c8281z4.mo17933s().mo18865e(c8281z4.mo17935q())));
        this.f22017y = c8281z4.getName();
        for (C7900d5 c7900d5 : c8281z4.m17970E()) {
            if (Boolean.TRUE.equals(c7900d5.m19352D())) {
                this.f22012B.add(new C8106t(c7900d5));
            }
        }
        C8068c m19270C = m19270C();
        m19270C.putAll(c8281z4.m17969F());
        C7911e5 mo17936p = c8281z4.mo17936p();
        m19270C.m18790n(new C7911e5(mo17936p.m19295k(), mo17936p.m19298h(), mo17936p.m19302d(), mo17936p.m19304b(), mo17936p.m19305a(), mo17936p.m19299g(), mo17936p.m19297i(), mo17936p.m19303c()));
        for (Map.Entry<String, String> entry : mo17936p.m19296j().entrySet()) {
            m19241c0(entry.getKey(), entry.getValue());
        }
        Map<String, Object> m17968G = c8281z4.m17968G();
        if (m17968G != null) {
            for (Map.Entry<String, Object> entry2 : m17968G.entrySet()) {
                m19251V(entry2.getKey(), entry2.getValue());
            }
        }
        this.f22015E = new C8116y(c8281z4.mo17945g().apiName());
    }

    /* renamed from: l0 */
    private BigDecimal m18489l0(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: m0 */
    public Map<String, C8082h> m18488m0() {
        return this.f22014D;
    }

    /* renamed from: n0 */
    public C8054p5 m18487n0() {
        C7911e5 m18798f = m19270C().m18798f();
        if (m18798f == null) {
            return null;
        }
        return m18798f.m19299g();
    }

    /* renamed from: o0 */
    public List<C8106t> m18486o0() {
        return this.f22012B;
    }

    /* renamed from: p0 */
    public boolean m18485p0() {
        return this.f22011A != null;
    }

    /* renamed from: q0 */
    public boolean m18484q0() {
        C8054p5 m18487n0 = m18487n0();
        if (m18487n0 == null) {
            return false;
        }
        return m18487n0.m18860c().booleanValue();
    }

    /* renamed from: r0 */
    public void m18483r0(Map<String, Object> map) {
        this.f22016F = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f22017y != null) {
            interfaceC7919f2.mo18193e("transaction").mo18191g(this.f22017y);
        }
        interfaceC7919f2.mo18193e("start_timestamp").mo18188j(interfaceC8040o0, m18489l0(this.f22018z));
        if (this.f22011A != null) {
            interfaceC7919f2.mo18193e("timestamp").mo18188j(interfaceC8040o0, m18489l0(this.f22011A));
        }
        if (!this.f22012B.isEmpty()) {
            interfaceC7919f2.mo18193e("spans").mo18188j(interfaceC8040o0, this.f22012B);
        }
        interfaceC7919f2.mo18193e("type").mo18191g("transaction");
        if (!this.f22014D.isEmpty()) {
            interfaceC7919f2.mo18193e("measurements").mo18188j(interfaceC8040o0, this.f22014D);
        }
        interfaceC7919f2.mo18193e("transaction_info").mo18188j(interfaceC8040o0, this.f22015E);
        new AbstractC7920f3.C7922b().m19214a(this, interfaceC7919f2, interfaceC8040o0);
        Map<String, Object> map = this.f22016F;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f22016F.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8114x(String str, Double d, Double d2, List<C8106t> list, Map<String, C8082h> map, C8116y c8116y) {
        ArrayList arrayList = new ArrayList();
        this.f22012B = arrayList;
        this.f22013C = "transaction";
        HashMap hashMap = new HashMap();
        this.f22014D = hashMap;
        this.f22017y = str;
        this.f22018z = d;
        this.f22011A = d2;
        arrayList.addAll(list);
        hashMap.putAll(map);
        this.f22015E = c8116y;
    }
}
