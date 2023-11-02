package io.sentry;

import io.sentry.AbstractC7920f3;
import io.sentry.EnumC8021m4;
import io.sentry.protocol.C8086j;
import io.sentry.protocol.C8098p;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8112w;
import io.sentry.util.C8212b;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.f4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7923f4 extends AbstractC7920f3 implements InterfaceC8026n1 {

    /* renamed from: A */
    private String f21596A;

    /* renamed from: B */
    private C7691a5<C8112w> f21597B;

    /* renamed from: C */
    private C7691a5<C8098p> f21598C;

    /* renamed from: D */
    private EnumC8021m4 f21599D;

    /* renamed from: E */
    private String f21600E;

    /* renamed from: F */
    private List<String> f21601F;

    /* renamed from: G */
    private Map<String, Object> f21602G;

    /* renamed from: H */
    private Map<String, String> f21603H;

    /* renamed from: y */
    private Date f21604y;

    /* renamed from: z */
    private C8086j f21605z;

    /* renamed from: io.sentry.f4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7924a implements InterfaceC7894d1<C7923f4> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7923f4 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C7923f4 c7923f4 = new C7923f4();
            AbstractC7920f3.C7921a c7921a = new AbstractC7920f3.C7921a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1375934236:
                        if (m18105R.equals("fingerprint")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1337936983:
                        if (m18105R.equals("threads")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1097337456:
                        if (m18105R.equals("logger")) {
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
                    case 1227433863:
                        if (m18105R.equals("modules")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1481625679:
                        if (m18105R.equals("exception")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 2141246174:
                        if (m18105R.equals("transaction")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        List list = (List) c7993j1.m19063R0();
                        if (list == null) {
                            break;
                        } else {
                            c7923f4.f21601F = list;
                            break;
                        }
                    case 1:
                        c7993j1.m18097h();
                        c7993j1.m18105R();
                        c7923f4.f21597B = new C7691a5(c7993j1.m19066O0(interfaceC8040o0, new C8112w.C8113a()));
                        c7993j1.m18091q();
                        break;
                    case 2:
                        c7923f4.f21596A = c7993j1.m19061T0();
                        break;
                    case 3:
                        Date m19071J0 = c7993j1.m19071J0(interfaceC8040o0);
                        if (m19071J0 == null) {
                            break;
                        } else {
                            c7923f4.f21604y = m19071J0;
                            break;
                        }
                    case 4:
                        c7923f4.f21599D = (EnumC8021m4) c7993j1.m19062S0(interfaceC8040o0, new EnumC8021m4.C8022a());
                        break;
                    case 5:
                        c7923f4.f21605z = (C8086j) c7993j1.m19062S0(interfaceC8040o0, new C8086j.C8087a());
                        break;
                    case 6:
                        c7923f4.f21603H = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 7:
                        c7993j1.m18097h();
                        c7993j1.m18105R();
                        c7923f4.f21598C = new C7691a5(c7993j1.m19066O0(interfaceC8040o0, new C8098p.C8099a()));
                        c7993j1.m18091q();
                        break;
                    case '\b':
                        c7923f4.f21600E = c7993j1.m19061T0();
                        break;
                    default:
                        if (!c7921a.m19215a(c7923f4, m18105R, c7993j1, interfaceC8040o0)) {
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
            c7923f4.m19208F0(concurrentHashMap);
            c7993j1.m18091q();
            return c7923f4;
        }
    }

    C7923f4(C8100q c8100q, Date date) {
        super(c8100q);
        this.f21604y = date;
    }

    /* renamed from: A0 */
    public void m19213A0(C8086j c8086j) {
        this.f21605z = c8086j;
    }

    /* renamed from: B0 */
    public void m19212B0(Map<String, String> map) {
        this.f21603H = C8212b.m18237c(map);
    }

    /* renamed from: C0 */
    public void m19211C0(List<C8112w> list) {
        this.f21597B = new C7691a5<>(list);
    }

    /* renamed from: D0 */
    public void m19210D0(Date date) {
        this.f21604y = date;
    }

    /* renamed from: E0 */
    public void m19209E0(String str) {
        this.f21600E = str;
    }

    /* renamed from: F0 */
    public void m19208F0(Map<String, Object> map) {
        this.f21602G = map;
    }

    /* renamed from: o0 */
    public List<C8098p> m19198o0() {
        C7691a5<C8098p> c7691a5 = this.f21598C;
        if (c7691a5 == null) {
            return null;
        }
        return c7691a5.m20042a();
    }

    /* renamed from: p0 */
    public List<String> m19197p0() {
        return this.f21601F;
    }

    /* renamed from: q0 */
    public EnumC8021m4 m19196q0() {
        return this.f21599D;
    }

    /* renamed from: r0 */
    public Map<String, String> m19195r0() {
        return this.f21603H;
    }

    /* renamed from: s0 */
    public List<C8112w> m19194s0() {
        C7691a5<C8112w> c7691a5 = this.f21597B;
        if (c7691a5 != null) {
            return c7691a5.m20042a();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("timestamp").mo18188j(interfaceC8040o0, this.f21604y);
        if (this.f21605z != null) {
            interfaceC7919f2.mo18193e("message").mo18188j(interfaceC8040o0, this.f21605z);
        }
        if (this.f21596A != null) {
            interfaceC7919f2.mo18193e("logger").mo18191g(this.f21596A);
        }
        C7691a5<C8112w> c7691a5 = this.f21597B;
        if (c7691a5 != null && !c7691a5.m20042a().isEmpty()) {
            interfaceC7919f2.mo18193e("threads");
            interfaceC7919f2.mo18195c();
            interfaceC7919f2.mo18193e("values").mo18188j(interfaceC8040o0, this.f21597B.m20042a());
            interfaceC7919f2.mo18190h();
        }
        C7691a5<C8098p> c7691a52 = this.f21598C;
        if (c7691a52 != null && !c7691a52.m20042a().isEmpty()) {
            interfaceC7919f2.mo18193e("exception");
            interfaceC7919f2.mo18195c();
            interfaceC7919f2.mo18193e("values").mo18188j(interfaceC8040o0, this.f21598C.m20042a());
            interfaceC7919f2.mo18190h();
        }
        if (this.f21599D != null) {
            interfaceC7919f2.mo18193e("level").mo18188j(interfaceC8040o0, this.f21599D);
        }
        if (this.f21600E != null) {
            interfaceC7919f2.mo18193e("transaction").mo18191g(this.f21600E);
        }
        if (this.f21601F != null) {
            interfaceC7919f2.mo18193e("fingerprint").mo18188j(interfaceC8040o0, this.f21601F);
        }
        if (this.f21603H != null) {
            interfaceC7919f2.mo18193e("modules").mo18188j(interfaceC8040o0, this.f21603H);
        }
        new AbstractC7920f3.C7922b().m19214a(this, interfaceC7919f2, interfaceC8040o0);
        Map<String, Object> map = this.f21602G;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21602G.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* renamed from: t0 */
    public String m19193t0() {
        return this.f21600E;
    }

    /* renamed from: u0 */
    public C8098p m19192u0() {
        C7691a5<C8098p> c7691a5 = this.f21598C;
        if (c7691a5 != null) {
            for (C8098p c8098p : c7691a5.m20042a()) {
                if (c8098p.m18588g() != null && c8098p.m18588g().m18661h() != null && !c8098p.m18588g().m18661h().booleanValue()) {
                    return c8098p;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: v0 */
    public boolean m19191v0() {
        return m19192u0() != null;
    }

    /* renamed from: w0 */
    public boolean m19190w0() {
        C7691a5<C8098p> c7691a5 = this.f21598C;
        return (c7691a5 == null || c7691a5.m20042a().isEmpty()) ? false : true;
    }

    /* renamed from: x0 */
    public void m19189x0(List<C8098p> list) {
        this.f21598C = new C7691a5<>(list);
    }

    /* renamed from: y0 */
    public void m19188y0(List<String> list) {
        this.f21601F = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: z0 */
    public void m19187z0(EnumC8021m4 enumC8021m4) {
        this.f21599D = enumC8021m4;
    }

    public C7923f4(Throwable th2) {
        this();
        this.f21590s = th2;
    }

    public C7923f4() {
        this(new C8100q(), C7991j.m19088c());
    }
}