package io.sentry.protocol;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8074e implements InterfaceC8026n1 {

    /* renamed from: A */
    private Long f21850A;

    /* renamed from: B */
    private Long f21851B;

    /* renamed from: C */
    private Long f21852C;

    /* renamed from: D */
    private Integer f21853D;

    /* renamed from: E */
    private Integer f21854E;

    /* renamed from: F */
    private Float f21855F;

    /* renamed from: G */
    private Integer f21856G;

    /* renamed from: H */
    private Date f21857H;

    /* renamed from: I */
    private TimeZone f21858I;

    /* renamed from: J */
    private String f21859J;
    @Deprecated

    /* renamed from: K */
    private String f21860K;

    /* renamed from: L */
    private String f21861L;

    /* renamed from: M */
    private String f21862M;

    /* renamed from: N */
    private Float f21863N;

    /* renamed from: O */
    private Integer f21864O;

    /* renamed from: P */
    private Double f21865P;

    /* renamed from: Q */
    private String f21866Q;

    /* renamed from: R */
    private Map<String, Object> f21867R;

    /* renamed from: j */
    private String f21868j;

    /* renamed from: k */
    private String f21869k;

    /* renamed from: l */
    private String f21870l;

    /* renamed from: m */
    private String f21871m;

    /* renamed from: n */
    private String f21872n;

    /* renamed from: o */
    private String f21873o;

    /* renamed from: p */
    private String[] f21874p;

    /* renamed from: q */
    private Float f21875q;

    /* renamed from: r */
    private Boolean f21876r;

    /* renamed from: s */
    private Boolean f21877s;

    /* renamed from: t */
    private EnumC8076b f21878t;

    /* renamed from: u */
    private Boolean f21879u;

    /* renamed from: v */
    private Long f21880v;

    /* renamed from: w */
    private Long f21881w;

    /* renamed from: x */
    private Long f21882x;

    /* renamed from: y */
    private Boolean f21883y;

    /* renamed from: z */
    private Long f21884z;

    /* renamed from: io.sentry.protocol.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8075a implements InterfaceC7894d1<C8074e> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8074e mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            C8074e c8074e = new C8074e();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -2076227591:
                        if (m18105R.equals("timezone")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -2012489734:
                        if (m18105R.equals("boot_time")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1981332476:
                        if (m18105R.equals("simulator")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1969347631:
                        if (m18105R.equals("manufacturer")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1613589672:
                        if (m18105R.equals("language")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1608004830:
                        if (m18105R.equals("processor_count")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1439500848:
                        if (m18105R.equals("orientation")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -1410521534:
                        if (m18105R.equals("battery_temperature")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1281860764:
                        if (m18105R.equals("family")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -1097462182:
                        if (m18105R.equals("locale")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -1012222381:
                        if (m18105R.equals("online")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -877252910:
                        if (m18105R.equals("battery_level")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -619038223:
                        if (m18105R.equals("model_id")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case -568274923:
                        if (m18105R.equals("screen_density")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case -417046774:
                        if (m18105R.equals("screen_dpi")) {
                            c = 14;
                            break;
                        }
                        break;
                    case -136523212:
                        if (m18105R.equals("free_memory")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 3355:
                        if (m18105R.equals("id")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m18105R.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
                            c = 17;
                            break;
                        }
                        break;
                    case 59142220:
                        if (m18105R.equals("low_memory")) {
                            c = 18;
                            break;
                        }
                        break;
                    case 93076189:
                        if (m18105R.equals("archs")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 93997959:
                        if (m18105R.equals("brand")) {
                            c = 20;
                            break;
                        }
                        break;
                    case 104069929:
                        if (m18105R.equals("model")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 115746789:
                        if (m18105R.equals("cpu_description")) {
                            c = 22;
                            break;
                        }
                        break;
                    case 244497903:
                        if (m18105R.equals("processor_frequency")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 731866107:
                        if (m18105R.equals("connection_type")) {
                            c = 24;
                            break;
                        }
                        break;
                    case 817830969:
                        if (m18105R.equals("screen_width_pixels")) {
                            c = 25;
                            break;
                        }
                        break;
                    case 823882553:
                        if (m18105R.equals("external_storage_size")) {
                            c = 26;
                            break;
                        }
                        break;
                    case 897428293:
                        if (m18105R.equals("storage_size")) {
                            c = 27;
                            break;
                        }
                        break;
                    case 1331465768:
                        if (m18105R.equals("usable_memory")) {
                            c = 28;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (m18105R.equals("memory_size")) {
                            c = 29;
                            break;
                        }
                        break;
                    case 1436115569:
                        if (m18105R.equals("charging")) {
                            c = 30;
                            break;
                        }
                        break;
                    case 1450613660:
                        if (m18105R.equals("external_free_storage")) {
                            c = 31;
                            break;
                        }
                        break;
                    case 1524159400:
                        if (m18105R.equals("free_storage")) {
                            c = ' ';
                            break;
                        }
                        break;
                    case 1556284978:
                        if (m18105R.equals("screen_height_pixels")) {
                            c = '!';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8074e.f21858I = c7993j1.m19060U0(interfaceC8040o0);
                        break;
                    case 1:
                        if (c7993j1.m18098e0() != EnumC8255b.STRING) {
                            break;
                        } else {
                            c8074e.f21857H = c7993j1.m19071J0(interfaceC8040o0);
                            break;
                        }
                    case 2:
                        c8074e.f21879u = c7993j1.m19072I0();
                        break;
                    case 3:
                        c8074e.f21869k = c7993j1.m19061T0();
                        break;
                    case 4:
                        c8074e.f21860K = c7993j1.m19061T0();
                        break;
                    case 5:
                        c8074e.f21864O = c7993j1.m19067N0();
                        break;
                    case 6:
                        c8074e.f21878t = (EnumC8076b) c7993j1.m19062S0(interfaceC8040o0, new EnumC8076b.C8077a());
                        break;
                    case 7:
                        c8074e.f21863N = c7993j1.m19068M0();
                        break;
                    case '\b':
                        c8074e.f21871m = c7993j1.m19061T0();
                        break;
                    case '\t':
                        c8074e.f21861L = c7993j1.m19061T0();
                        break;
                    case '\n':
                        c8074e.f21877s = c7993j1.m19072I0();
                        break;
                    case 11:
                        c8074e.f21875q = c7993j1.m19068M0();
                        break;
                    case '\f':
                        c8074e.f21873o = c7993j1.m19061T0();
                        break;
                    case '\r':
                        c8074e.f21855F = c7993j1.m19068M0();
                        break;
                    case 14:
                        c8074e.f21856G = c7993j1.m19067N0();
                        break;
                    case 15:
                        c8074e.f21881w = c7993j1.m19065P0();
                        break;
                    case 16:
                        c8074e.f21859J = c7993j1.m19061T0();
                        break;
                    case 17:
                        c8074e.f21868j = c7993j1.m19061T0();
                        break;
                    case 18:
                        c8074e.f21883y = c7993j1.m19072I0();
                        break;
                    case 19:
                        List list = (List) c7993j1.m19063R0();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c8074e.f21874p = strArr;
                            break;
                        }
                    case 20:
                        c8074e.f21870l = c7993j1.m19061T0();
                        break;
                    case 21:
                        c8074e.f21872n = c7993j1.m19061T0();
                        break;
                    case 22:
                        c8074e.f21866Q = c7993j1.m19061T0();
                        break;
                    case 23:
                        c8074e.f21865P = c7993j1.m19070K0();
                        break;
                    case 24:
                        c8074e.f21862M = c7993j1.m19061T0();
                        break;
                    case 25:
                        c8074e.f21853D = c7993j1.m19067N0();
                        break;
                    case 26:
                        c8074e.f21851B = c7993j1.m19065P0();
                        break;
                    case 27:
                        c8074e.f21884z = c7993j1.m19065P0();
                        break;
                    case 28:
                        c8074e.f21882x = c7993j1.m19065P0();
                        break;
                    case 29:
                        c8074e.f21880v = c7993j1.m19065P0();
                        break;
                    case 30:
                        c8074e.f21876r = c7993j1.m19072I0();
                        break;
                    case 31:
                        c8074e.f21852C = c7993j1.m19065P0();
                        break;
                    case ' ':
                        c8074e.f21850A = c7993j1.m19065P0();
                        break;
                    case '!':
                        c8074e.f21854E = c7993j1.m19067N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8074e.m18696s0(concurrentHashMap);
            c7993j1.m18091q();
            return c8074e;
        }
    }

    /* renamed from: io.sentry.protocol.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC8076b implements InterfaceC8026n1 {
        PORTRAIT,
        LANDSCAPE;

        /* renamed from: io.sentry.protocol.e$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C8077a implements InterfaceC7894d1<EnumC8076b> {
            @Override // io.sentry.InterfaceC7894d1
            /* renamed from: b */
            public EnumC8076b mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
                return EnumC8076b.valueOf(c7993j1.m18101Y().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC8026n1
        public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
            interfaceC7919f2.mo18191g(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C8074e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8074e(C8074e c8074e) {
        String[] strArr;
        this.f21868j = c8074e.f21868j;
        this.f21869k = c8074e.f21869k;
        this.f21870l = c8074e.f21870l;
        this.f21871m = c8074e.f21871m;
        this.f21872n = c8074e.f21872n;
        this.f21873o = c8074e.f21873o;
        this.f21876r = c8074e.f21876r;
        this.f21877s = c8074e.f21877s;
        this.f21878t = c8074e.f21878t;
        this.f21879u = c8074e.f21879u;
        this.f21880v = c8074e.f21880v;
        this.f21881w = c8074e.f21881w;
        this.f21882x = c8074e.f21882x;
        this.f21883y = c8074e.f21883y;
        this.f21884z = c8074e.f21884z;
        this.f21850A = c8074e.f21850A;
        this.f21851B = c8074e.f21851B;
        this.f21852C = c8074e.f21852C;
        this.f21853D = c8074e.f21853D;
        this.f21854E = c8074e.f21854E;
        this.f21855F = c8074e.f21855F;
        this.f21856G = c8074e.f21856G;
        this.f21857H = c8074e.f21857H;
        this.f21859J = c8074e.f21859J;
        this.f21860K = c8074e.f21860K;
        this.f21862M = c8074e.f21862M;
        this.f21863N = c8074e.f21863N;
        this.f21875q = c8074e.f21875q;
        String[] strArr2 = c8074e.f21874p;
        if (strArr2 != null) {
            strArr = (String[]) strArr2.clone();
        } else {
            strArr = null;
        }
        this.f21874p = strArr;
        this.f21861L = c8074e.f21861L;
        TimeZone timeZone = c8074e.f21858I;
        this.f21858I = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f21864O = c8074e.f21864O;
        this.f21865P = c8074e.f21865P;
        this.f21866Q = c8074e.f21866Q;
        this.f21867R = C8212b.m18238b(c8074e.f21867R);
    }

    /* renamed from: I */
    public String m18751I() {
        return this.f21862M;
    }

    /* renamed from: J */
    public String m18750J() {
        return this.f21859J;
    }

    /* renamed from: K */
    public String m18749K() {
        return this.f21860K;
    }

    /* renamed from: L */
    public String m18748L() {
        return this.f21861L;
    }

    /* renamed from: M */
    public void m18747M(String[] strArr) {
        this.f21874p = strArr;
    }

    /* renamed from: N */
    public void m18746N(Float f) {
        this.f21875q = f;
    }

    /* renamed from: O */
    public void m18745O(Float f) {
        this.f21863N = f;
    }

    /* renamed from: P */
    public void m18744P(Date date) {
        this.f21857H = date;
    }

    /* renamed from: Q */
    public void m18743Q(String str) {
        this.f21870l = str;
    }

    /* renamed from: R */
    public void m18742R(Boolean bool) {
        this.f21876r = bool;
    }

    /* renamed from: S */
    public void m18741S(String str) {
        this.f21862M = str;
    }

    /* renamed from: T */
    public void m18740T(Long l) {
        this.f21852C = l;
    }

    /* renamed from: U */
    public void m18739U(Long l) {
        this.f21851B = l;
    }

    /* renamed from: V */
    public void m18738V(String str) {
        this.f21871m = str;
    }

    /* renamed from: W */
    public void m18737W(Long l) {
        this.f21881w = l;
    }

    /* renamed from: X */
    public void m18736X(Long l) {
        this.f21850A = l;
    }

    /* renamed from: Y */
    public void m18735Y(String str) {
        this.f21859J = str;
    }

    /* renamed from: Z */
    public void m18734Z(String str) {
        this.f21860K = str;
    }

    /* renamed from: a0 */
    public void m18732a0(String str) {
        this.f21861L = str;
    }

    /* renamed from: b0 */
    public void m18730b0(Boolean bool) {
        this.f21883y = bool;
    }

    /* renamed from: c0 */
    public void m18728c0(String str) {
        this.f21869k = str;
    }

    /* renamed from: d0 */
    public void m18726d0(Long l) {
        this.f21880v = l;
    }

    /* renamed from: e0 */
    public void m18724e0(String str) {
        this.f21872n = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8074e.class != obj.getClass()) {
            return false;
        }
        C8074e c8074e = (C8074e) obj;
        if (C8229o.m18171a(this.f21868j, c8074e.f21868j) && C8229o.m18171a(this.f21869k, c8074e.f21869k) && C8229o.m18171a(this.f21870l, c8074e.f21870l) && C8229o.m18171a(this.f21871m, c8074e.f21871m) && C8229o.m18171a(this.f21872n, c8074e.f21872n) && C8229o.m18171a(this.f21873o, c8074e.f21873o) && Arrays.equals(this.f21874p, c8074e.f21874p) && C8229o.m18171a(this.f21875q, c8074e.f21875q) && C8229o.m18171a(this.f21876r, c8074e.f21876r) && C8229o.m18171a(this.f21877s, c8074e.f21877s) && this.f21878t == c8074e.f21878t && C8229o.m18171a(this.f21879u, c8074e.f21879u) && C8229o.m18171a(this.f21880v, c8074e.f21880v) && C8229o.m18171a(this.f21881w, c8074e.f21881w) && C8229o.m18171a(this.f21882x, c8074e.f21882x) && C8229o.m18171a(this.f21883y, c8074e.f21883y) && C8229o.m18171a(this.f21884z, c8074e.f21884z) && C8229o.m18171a(this.f21850A, c8074e.f21850A) && C8229o.m18171a(this.f21851B, c8074e.f21851B) && C8229o.m18171a(this.f21852C, c8074e.f21852C) && C8229o.m18171a(this.f21853D, c8074e.f21853D) && C8229o.m18171a(this.f21854E, c8074e.f21854E) && C8229o.m18171a(this.f21855F, c8074e.f21855F) && C8229o.m18171a(this.f21856G, c8074e.f21856G) && C8229o.m18171a(this.f21857H, c8074e.f21857H) && C8229o.m18171a(this.f21859J, c8074e.f21859J) && C8229o.m18171a(this.f21860K, c8074e.f21860K) && C8229o.m18171a(this.f21861L, c8074e.f21861L) && C8229o.m18171a(this.f21862M, c8074e.f21862M) && C8229o.m18171a(this.f21863N, c8074e.f21863N) && C8229o.m18171a(this.f21864O, c8074e.f21864O) && C8229o.m18171a(this.f21865P, c8074e.f21865P) && C8229o.m18171a(this.f21866Q, c8074e.f21866Q)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public void m18722f0(String str) {
        this.f21873o = str;
    }

    /* renamed from: g0 */
    public void m18720g0(String str) {
        this.f21868j = str;
    }

    /* renamed from: h0 */
    public void m18718h0(Boolean bool) {
        this.f21877s = bool;
    }

    public int hashCode() {
        return (C8229o.m18170b(this.f21868j, this.f21869k, this.f21870l, this.f21871m, this.f21872n, this.f21873o, this.f21875q, this.f21876r, this.f21877s, this.f21878t, this.f21879u, this.f21880v, this.f21881w, this.f21882x, this.f21883y, this.f21884z, this.f21850A, this.f21851B, this.f21852C, this.f21853D, this.f21854E, this.f21855F, this.f21856G, this.f21857H, this.f21858I, this.f21859J, this.f21860K, this.f21861L, this.f21862M, this.f21863N, this.f21864O, this.f21865P, this.f21866Q) * 31) + Arrays.hashCode(this.f21874p);
    }

    /* renamed from: i0 */
    public void m18716i0(EnumC8076b enumC8076b) {
        this.f21878t = enumC8076b;
    }

    /* renamed from: j0 */
    public void m18714j0(Integer num) {
        this.f21864O = num;
    }

    /* renamed from: k0 */
    public void m18712k0(Double d) {
        this.f21865P = d;
    }

    /* renamed from: l0 */
    public void m18710l0(Float f) {
        this.f21855F = f;
    }

    /* renamed from: m0 */
    public void m18708m0(Integer num) {
        this.f21856G = num;
    }

    /* renamed from: n0 */
    public void m18706n0(Integer num) {
        this.f21854E = num;
    }

    /* renamed from: o0 */
    public void m18704o0(Integer num) {
        this.f21853D = num;
    }

    /* renamed from: p0 */
    public void m18702p0(Boolean bool) {
        this.f21879u = bool;
    }

    /* renamed from: q0 */
    public void m18700q0(Long l) {
        this.f21884z = l;
    }

    /* renamed from: r0 */
    public void m18698r0(TimeZone timeZone) {
        this.f21858I = timeZone;
    }

    /* renamed from: s0 */
    public void m18696s0(Map<String, Object> map) {
        this.f21867R = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21868j != null) {
            interfaceC7919f2.mo18193e(ZeroconfModule.KEY_SERVICE_NAME).mo18191g(this.f21868j);
        }
        if (this.f21869k != null) {
            interfaceC7919f2.mo18193e("manufacturer").mo18191g(this.f21869k);
        }
        if (this.f21870l != null) {
            interfaceC7919f2.mo18193e("brand").mo18191g(this.f21870l);
        }
        if (this.f21871m != null) {
            interfaceC7919f2.mo18193e("family").mo18191g(this.f21871m);
        }
        if (this.f21872n != null) {
            interfaceC7919f2.mo18193e("model").mo18191g(this.f21872n);
        }
        if (this.f21873o != null) {
            interfaceC7919f2.mo18193e("model_id").mo18191g(this.f21873o);
        }
        if (this.f21874p != null) {
            interfaceC7919f2.mo18193e("archs").mo18188j(interfaceC8040o0, this.f21874p);
        }
        if (this.f21875q != null) {
            interfaceC7919f2.mo18193e("battery_level").mo18189i(this.f21875q);
        }
        if (this.f21876r != null) {
            interfaceC7919f2.mo18193e("charging").mo18187k(this.f21876r);
        }
        if (this.f21877s != null) {
            interfaceC7919f2.mo18193e("online").mo18187k(this.f21877s);
        }
        if (this.f21878t != null) {
            interfaceC7919f2.mo18193e("orientation").mo18188j(interfaceC8040o0, this.f21878t);
        }
        if (this.f21879u != null) {
            interfaceC7919f2.mo18193e("simulator").mo18187k(this.f21879u);
        }
        if (this.f21880v != null) {
            interfaceC7919f2.mo18193e("memory_size").mo18189i(this.f21880v);
        }
        if (this.f21881w != null) {
            interfaceC7919f2.mo18193e("free_memory").mo18189i(this.f21881w);
        }
        if (this.f21882x != null) {
            interfaceC7919f2.mo18193e("usable_memory").mo18189i(this.f21882x);
        }
        if (this.f21883y != null) {
            interfaceC7919f2.mo18193e("low_memory").mo18187k(this.f21883y);
        }
        if (this.f21884z != null) {
            interfaceC7919f2.mo18193e("storage_size").mo18189i(this.f21884z);
        }
        if (this.f21850A != null) {
            interfaceC7919f2.mo18193e("free_storage").mo18189i(this.f21850A);
        }
        if (this.f21851B != null) {
            interfaceC7919f2.mo18193e("external_storage_size").mo18189i(this.f21851B);
        }
        if (this.f21852C != null) {
            interfaceC7919f2.mo18193e("external_free_storage").mo18189i(this.f21852C);
        }
        if (this.f21853D != null) {
            interfaceC7919f2.mo18193e("screen_width_pixels").mo18189i(this.f21853D);
        }
        if (this.f21854E != null) {
            interfaceC7919f2.mo18193e("screen_height_pixels").mo18189i(this.f21854E);
        }
        if (this.f21855F != null) {
            interfaceC7919f2.mo18193e("screen_density").mo18189i(this.f21855F);
        }
        if (this.f21856G != null) {
            interfaceC7919f2.mo18193e("screen_dpi").mo18189i(this.f21856G);
        }
        if (this.f21857H != null) {
            interfaceC7919f2.mo18193e("boot_time").mo18188j(interfaceC8040o0, this.f21857H);
        }
        if (this.f21858I != null) {
            interfaceC7919f2.mo18193e("timezone").mo18188j(interfaceC8040o0, this.f21858I);
        }
        if (this.f21859J != null) {
            interfaceC7919f2.mo18193e("id").mo18191g(this.f21859J);
        }
        if (this.f21860K != null) {
            interfaceC7919f2.mo18193e("language").mo18191g(this.f21860K);
        }
        if (this.f21862M != null) {
            interfaceC7919f2.mo18193e("connection_type").mo18191g(this.f21862M);
        }
        if (this.f21863N != null) {
            interfaceC7919f2.mo18193e("battery_temperature").mo18189i(this.f21863N);
        }
        if (this.f21861L != null) {
            interfaceC7919f2.mo18193e("locale").mo18191g(this.f21861L);
        }
        if (this.f21864O != null) {
            interfaceC7919f2.mo18193e("processor_count").mo18189i(this.f21864O);
        }
        if (this.f21865P != null) {
            interfaceC7919f2.mo18193e("processor_frequency").mo18189i(this.f21865P);
        }
        if (this.f21866Q != null) {
            interfaceC7919f2.mo18193e("cpu_description").mo18191g(this.f21866Q);
        }
        Map<String, Object> map = this.f21867R;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21867R.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
