package io.sentry;

import io.sentry.C8042o2;
import io.sentry.profilemeasurements.C8055a;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.n2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8027n2 implements InterfaceC8026n1 {

    /* renamed from: A */
    private String f21712A;

    /* renamed from: B */
    private String f21713B;

    /* renamed from: C */
    private String f21714C;

    /* renamed from: D */
    private String f21715D;

    /* renamed from: E */
    private String f21716E;

    /* renamed from: F */
    private String f21717F;

    /* renamed from: G */
    private String f21718G;

    /* renamed from: H */
    private String f21719H;

    /* renamed from: I */
    private final Map<String, C8055a> f21720I;

    /* renamed from: J */
    private String f21721J;

    /* renamed from: K */
    private Map<String, Object> f21722K;

    /* renamed from: j */
    private final File f21723j;

    /* renamed from: k */
    private final Callable<List<Integer>> f21724k;

    /* renamed from: l */
    private int f21725l;

    /* renamed from: m */
    private String f21726m;

    /* renamed from: n */
    private String f21727n;

    /* renamed from: o */
    private String f21728o;

    /* renamed from: p */
    private String f21729p;

    /* renamed from: q */
    private String f21730q;

    /* renamed from: r */
    private String f21731r;

    /* renamed from: s */
    private boolean f21732s;

    /* renamed from: t */
    private String f21733t;

    /* renamed from: u */
    private List<Integer> f21734u;

    /* renamed from: v */
    private String f21735v;

    /* renamed from: w */
    private String f21736w;

    /* renamed from: x */
    private String f21737x;

    /* renamed from: y */
    private List<C8042o2> f21738y;

    /* renamed from: z */
    private String f21739z;

    /* renamed from: io.sentry.n2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8029b implements InterfaceC7894d1<C8027n2> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8027n2 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            ConcurrentHashMap concurrentHashMap = null;
            C8027n2 c8027n2 = new C8027n2();
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -2133529830:
                        if (m18105R.equals("device_manufacturer")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1981468849:
                        if (m18105R.equals("android_api_level")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1430655860:
                        if (m18105R.equals("build_id")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1172160413:
                        if (m18105R.equals("device_locale")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1102636175:
                        if (m18105R.equals("profile_id")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -716656436:
                        if (m18105R.equals("device_os_build_number")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -591076352:
                        if (m18105R.equals("device_model")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -512511455:
                        if (m18105R.equals("device_is_emulator")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -478065584:
                        if (m18105R.equals("duration_ns")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -362243017:
                        if (m18105R.equals("measurements")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -332426004:
                        if (m18105R.equals("device_physical_memory_bytes")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -212264198:
                        if (m18105R.equals("device_cpu_frequencies")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -102985484:
                        if (m18105R.equals("version_code")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case -102670958:
                        if (m18105R.equals("version_name")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case -85904877:
                        if (m18105R.equals("environment")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 508853068:
                        if (m18105R.equals("transaction_name")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 796476189:
                        if (m18105R.equals("device_os_name")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 839674195:
                        if (m18105R.equals("architecture")) {
                            c = 17;
                            break;
                        }
                        break;
                    case 1010584092:
                        if (m18105R.equals("transaction_id")) {
                            c = 18;
                            break;
                        }
                        break;
                    case 1052553990:
                        if (m18105R.equals("device_os_version")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 1163928186:
                        if (m18105R.equals("truncation_reason")) {
                            c = 20;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (m18105R.equals("trace_id")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 1874684019:
                        if (m18105R.equals("platform")) {
                            c = 22;
                            break;
                        }
                        break;
                    case 1953158756:
                        if (m18105R.equals("sampled_profile")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 1954122069:
                        if (m18105R.equals("transactions")) {
                            c = 24;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        String m19061T0 = c7993j1.m19061T0();
                        if (m19061T0 == null) {
                            break;
                        } else {
                            c8027n2.f21727n = m19061T0;
                            break;
                        }
                    case 1:
                        Integer m19067N0 = c7993j1.m19067N0();
                        if (m19067N0 == null) {
                            break;
                        } else {
                            c8027n2.f21725l = m19067N0.intValue();
                            break;
                        }
                    case 2:
                        String m19061T02 = c7993j1.m19061T0();
                        if (m19061T02 == null) {
                            break;
                        } else {
                            c8027n2.f21737x = m19061T02;
                            break;
                        }
                    case 3:
                        String m19061T03 = c7993j1.m19061T0();
                        if (m19061T03 == null) {
                            break;
                        } else {
                            c8027n2.f21726m = m19061T03;
                            break;
                        }
                    case 4:
                        String m19061T04 = c7993j1.m19061T0();
                        if (m19061T04 == null) {
                            break;
                        } else {
                            c8027n2.f21717F = m19061T04;
                            break;
                        }
                    case 5:
                        String m19061T05 = c7993j1.m19061T0();
                        if (m19061T05 == null) {
                            break;
                        } else {
                            c8027n2.f21729p = m19061T05;
                            break;
                        }
                    case 6:
                        String m19061T06 = c7993j1.m19061T0();
                        if (m19061T06 == null) {
                            break;
                        } else {
                            c8027n2.f21728o = m19061T06;
                            break;
                        }
                    case 7:
                        Boolean m19072I0 = c7993j1.m19072I0();
                        if (m19072I0 == null) {
                            break;
                        } else {
                            c8027n2.f21732s = m19072I0.booleanValue();
                            break;
                        }
                    case '\b':
                        String m19061T07 = c7993j1.m19061T0();
                        if (m19061T07 == null) {
                            break;
                        } else {
                            c8027n2.f21712A = m19061T07;
                            break;
                        }
                    case '\t':
                        Map m19064Q0 = c7993j1.m19064Q0(interfaceC8040o0, new C8055a.C8056a());
                        if (m19064Q0 == null) {
                            break;
                        } else {
                            c8027n2.f21720I.putAll(m19064Q0);
                            break;
                        }
                    case '\n':
                        String m19061T08 = c7993j1.m19061T0();
                        if (m19061T08 == null) {
                            break;
                        } else {
                            c8027n2.f21735v = m19061T08;
                            break;
                        }
                    case 11:
                        List list = (List) c7993j1.m19063R0();
                        if (list == null) {
                            break;
                        } else {
                            c8027n2.f21734u = list;
                            break;
                        }
                    case '\f':
                        String m19061T09 = c7993j1.m19061T0();
                        if (m19061T09 == null) {
                            break;
                        } else {
                            c8027n2.f21713B = m19061T09;
                            break;
                        }
                    case '\r':
                        String m19061T010 = c7993j1.m19061T0();
                        if (m19061T010 == null) {
                            break;
                        } else {
                            c8027n2.f21714C = m19061T010;
                            break;
                        }
                    case 14:
                        String m19061T011 = c7993j1.m19061T0();
                        if (m19061T011 == null) {
                            break;
                        } else {
                            c8027n2.f21718G = m19061T011;
                            break;
                        }
                    case 15:
                        String m19061T012 = c7993j1.m19061T0();
                        if (m19061T012 == null) {
                            break;
                        } else {
                            c8027n2.f21739z = m19061T012;
                            break;
                        }
                    case 16:
                        String m19061T013 = c7993j1.m19061T0();
                        if (m19061T013 == null) {
                            break;
                        } else {
                            c8027n2.f21730q = m19061T013;
                            break;
                        }
                    case 17:
                        String m19061T014 = c7993j1.m19061T0();
                        if (m19061T014 == null) {
                            break;
                        } else {
                            c8027n2.f21733t = m19061T014;
                            break;
                        }
                    case 18:
                        String m19061T015 = c7993j1.m19061T0();
                        if (m19061T015 == null) {
                            break;
                        } else {
                            c8027n2.f21715D = m19061T015;
                            break;
                        }
                    case 19:
                        String m19061T016 = c7993j1.m19061T0();
                        if (m19061T016 == null) {
                            break;
                        } else {
                            c8027n2.f21731r = m19061T016;
                            break;
                        }
                    case 20:
                        String m19061T017 = c7993j1.m19061T0();
                        if (m19061T017 == null) {
                            break;
                        } else {
                            c8027n2.f21719H = m19061T017;
                            break;
                        }
                    case 21:
                        String m19061T018 = c7993j1.m19061T0();
                        if (m19061T018 == null) {
                            break;
                        } else {
                            c8027n2.f21716E = m19061T018;
                            break;
                        }
                    case 22:
                        String m19061T019 = c7993j1.m19061T0();
                        if (m19061T019 == null) {
                            break;
                        } else {
                            c8027n2.f21736w = m19061T019;
                            break;
                        }
                    case 23:
                        String m19061T020 = c7993j1.m19061T0();
                        if (m19061T020 == null) {
                            break;
                        } else {
                            c8027n2.f21721J = m19061T020;
                            break;
                        }
                    case 24:
                        List m19066O0 = c7993j1.m19066O0(interfaceC8040o0, new C8042o2.C8043a());
                        if (m19066O0 == null) {
                            break;
                        } else {
                            c8027n2.f21738y.addAll(m19066O0);
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
            c8027n2.m18976H(concurrentHashMap);
            c7993j1.m18091q();
            return c8027n2;
        }
    }

    /* renamed from: D */
    private boolean m18980D() {
        if (!this.f21719H.equals("normal") && !this.f21719H.equals("timeout") && !this.f21719H.equals("backgrounded")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ List m18979E() {
        return new ArrayList();
    }

    /* renamed from: A */
    public String m18983A() {
        return this.f21717F;
    }

    /* renamed from: B */
    public File m18982B() {
        return this.f21723j;
    }

    /* renamed from: C */
    public String m18981C() {
        return this.f21715D;
    }

    /* renamed from: F */
    public void m18978F() {
        try {
            this.f21734u = this.f21724k.call();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: G */
    public void m18977G(String str) {
        this.f21721J = str;
    }

    /* renamed from: H */
    public void m18976H(Map<String, Object> map) {
        this.f21722K = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("android_api_level").mo18188j(interfaceC8040o0, Integer.valueOf(this.f21725l));
        interfaceC7919f2.mo18193e("device_locale").mo18188j(interfaceC8040o0, this.f21726m);
        interfaceC7919f2.mo18193e("device_manufacturer").mo18191g(this.f21727n);
        interfaceC7919f2.mo18193e("device_model").mo18191g(this.f21728o);
        interfaceC7919f2.mo18193e("device_os_build_number").mo18191g(this.f21729p);
        interfaceC7919f2.mo18193e("device_os_name").mo18191g(this.f21730q);
        interfaceC7919f2.mo18193e("device_os_version").mo18191g(this.f21731r);
        interfaceC7919f2.mo18193e("device_is_emulator").mo18196b(this.f21732s);
        interfaceC7919f2.mo18193e("architecture").mo18188j(interfaceC8040o0, this.f21733t);
        interfaceC7919f2.mo18193e("device_cpu_frequencies").mo18188j(interfaceC8040o0, this.f21734u);
        interfaceC7919f2.mo18193e("device_physical_memory_bytes").mo18191g(this.f21735v);
        interfaceC7919f2.mo18193e("platform").mo18191g(this.f21736w);
        interfaceC7919f2.mo18193e("build_id").mo18191g(this.f21737x);
        interfaceC7919f2.mo18193e("transaction_name").mo18191g(this.f21739z);
        interfaceC7919f2.mo18193e("duration_ns").mo18191g(this.f21712A);
        interfaceC7919f2.mo18193e("version_name").mo18191g(this.f21714C);
        interfaceC7919f2.mo18193e("version_code").mo18191g(this.f21713B);
        if (!this.f21738y.isEmpty()) {
            interfaceC7919f2.mo18193e("transactions").mo18188j(interfaceC8040o0, this.f21738y);
        }
        interfaceC7919f2.mo18193e("transaction_id").mo18191g(this.f21715D);
        interfaceC7919f2.mo18193e("trace_id").mo18191g(this.f21716E);
        interfaceC7919f2.mo18193e("profile_id").mo18191g(this.f21717F);
        interfaceC7919f2.mo18193e("environment").mo18191g(this.f21718G);
        interfaceC7919f2.mo18193e("truncation_reason").mo18191g(this.f21719H);
        if (this.f21721J != null) {
            interfaceC7919f2.mo18193e("sampled_profile").mo18191g(this.f21721J);
        }
        interfaceC7919f2.mo18193e("measurements").mo18188j(interfaceC8040o0, this.f21720I);
        Map<String, Object> map = this.f21722K;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21722K.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    private C8027n2() {
        this(new File("dummy"), C7833b2.m19587t());
    }

    public C8027n2(File file, InterfaceC8259w0 interfaceC8259w0) {
        this(file, new ArrayList(), interfaceC8259w0, "0", 0, "", new Callable() { // from class: io.sentry.m2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m18979E;
                m18979E = C8027n2.m18979E();
                return m18979E;
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C8027n2(File file, List<C8042o2> list, InterfaceC8259w0 interfaceC8259w0, String str, int i, String str2, Callable<List<Integer>> callable, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, Map<String, C8055a> map) {
        this.f21734u = new ArrayList();
        this.f21721J = null;
        this.f21723j = file;
        this.f21733t = str2;
        this.f21724k = callable;
        this.f21725l = i;
        this.f21726m = Locale.getDefault().toString();
        this.f21727n = str3 != null ? str3 : "";
        this.f21728o = str4 != null ? str4 : "";
        this.f21731r = str5 != null ? str5 : "";
        this.f21732s = bool != null ? bool.booleanValue() : false;
        this.f21735v = str6 != null ? str6 : "0";
        this.f21729p = "";
        this.f21730q = "android";
        this.f21736w = "android";
        this.f21737x = str7 != null ? str7 : "";
        this.f21738y = list;
        this.f21739z = interfaceC8259w0.getName();
        this.f21712A = str;
        this.f21713B = "";
        this.f21714C = str8 != null ? str8 : "";
        this.f21715D = interfaceC8259w0.mo17947e().toString();
        this.f21716E = interfaceC8259w0.mo17936p().m19295k().toString();
        this.f21717F = UUID.randomUUID().toString();
        this.f21718G = str9 != null ? str9 : "production";
        this.f21719H = str10;
        if (!m18980D()) {
            this.f21719H = "normal";
        }
        this.f21720I = map;
    }
}
