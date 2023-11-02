package io.sentry.protocol;

import io.sentry.C7900d5;
import io.sentry.C7932g5;
import io.sentry.C7991j;
import io.sentry.C7993j1;
import io.sentry.EnumC7975i5;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8100q;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8106t implements InterfaceC8026n1 {

    /* renamed from: j */
    private final Double f21966j;

    /* renamed from: k */
    private final Double f21967k;

    /* renamed from: l */
    private final C8100q f21968l;

    /* renamed from: m */
    private final C7932g5 f21969m;

    /* renamed from: n */
    private final C7932g5 f21970n;

    /* renamed from: o */
    private final String f21971o;

    /* renamed from: p */
    private final String f21972p;

    /* renamed from: q */
    private final EnumC7975i5 f21973q;

    /* renamed from: r */
    private final String f21974r;

    /* renamed from: s */
    private final Map<String, String> f21975s;

    /* renamed from: t */
    private final Map<String, Object> f21976t;

    /* renamed from: u */
    private Map<String, Object> f21977u;

    /* renamed from: io.sentry.protocol.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8107a implements InterfaceC7894d1<C8106t> {
        /* renamed from: c */
        private Exception m18558c(String str, InterfaceC8040o0 interfaceC8040o0) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8106t mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            Map map;
            c7993j1.m18097h();
            Map map2 = null;
            Double d = null;
            Double d2 = null;
            C8100q c8100q = null;
            C7932g5 c7932g5 = null;
            C7932g5 c7932g52 = null;
            String str = null;
            String str2 = null;
            EnumC7975i5 enumC7975i5 = null;
            String str3 = null;
            ConcurrentHashMap concurrentHashMap = null;
            Map map3 = null;
            while (true) {
                Map map4 = map3;
                String str4 = str3;
                EnumC7975i5 enumC7975i52 = enumC7975i5;
                String str5 = str2;
                if (c7993j1.m18098e0() == EnumC8255b.NAME) {
                    String m18105R = c7993j1.m18105R();
                    m18105R.hashCode();
                    char c = 65535;
                    switch (m18105R.hashCode()) {
                        case -2011840976:
                            if (m18105R.equals("span_id")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1757797477:
                            if (m18105R.equals("parent_span_id")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1724546052:
                            if (m18105R.equals("description")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1526966919:
                            if (m18105R.equals("start_timestamp")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1008619738:
                            if (m18105R.equals("origin")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -892481550:
                            if (m18105R.equals("status")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 3553:
                            if (m18105R.equals("op")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 3076010:
                            if (m18105R.equals("data")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 3552281:
                            if (m18105R.equals("tags")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 55126294:
                            if (m18105R.equals("timestamp")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 1270300245:
                            if (m18105R.equals("trace_id")) {
                                c = '\n';
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            c7932g5 = new C7932g5.C7933a().mo18130a(c7993j1, interfaceC8040o0);
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case 1:
                            c7932g52 = (C7932g5) c7993j1.m19062S0(interfaceC8040o0, new C7932g5.C7933a());
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case 2:
                            str2 = c7993j1.m19061T0();
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            continue;
                        case 3:
                            try {
                                d = c7993j1.m19070K0();
                            } catch (NumberFormatException unused) {
                                Date m19071J0 = c7993j1.m19071J0(interfaceC8040o0);
                                if (m19071J0 != null) {
                                    d = Double.valueOf(C7991j.m19089b(m19071J0));
                                } else {
                                    d = null;
                                }
                            }
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case 4:
                            str3 = c7993j1.m19061T0();
                            map3 = map4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case 5:
                            enumC7975i5 = (EnumC7975i5) c7993j1.m19062S0(interfaceC8040o0, new EnumC7975i5.C7976a());
                            map3 = map4;
                            str3 = str4;
                            break;
                        case 6:
                            str = c7993j1.m19061T0();
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case 7:
                            map3 = (Map) c7993j1.m19063R0();
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case '\b':
                            map2 = (Map) c7993j1.m19063R0();
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case '\t':
                            try {
                                d2 = c7993j1.m19070K0();
                            } catch (NumberFormatException unused2) {
                                Date m19071J02 = c7993j1.m19071J0(interfaceC8040o0);
                                if (m19071J02 != null) {
                                    d2 = Double.valueOf(C7991j.m19089b(m19071J02));
                                } else {
                                    d2 = null;
                                }
                            }
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        case '\n':
                            c8100q = new C8100q.C8101a().mo18130a(c7993j1, interfaceC8040o0);
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                            map3 = map4;
                            str3 = str4;
                            enumC7975i5 = enumC7975i52;
                            break;
                    }
                    str2 = str5;
                } else if (d != null) {
                    if (c8100q != null) {
                        if (c7932g5 != null) {
                            if (str != null) {
                                if (map2 == null) {
                                    map = new HashMap();
                                } else {
                                    map = map2;
                                }
                                C8106t c8106t = new C8106t(d, d2, c8100q, c7932g5, c7932g52, str, str5, enumC7975i52, str4, map, map4);
                                c8106t.m18560c(concurrentHashMap);
                                c7993j1.m18091q();
                                return c8106t;
                            }
                            throw m18558c("op", interfaceC8040o0);
                        }
                        throw m18558c("span_id", interfaceC8040o0);
                    }
                    throw m18558c("trace_id", interfaceC8040o0);
                } else {
                    throw m18558c("start_timestamp", interfaceC8040o0);
                }
            }
        }
    }

    public C8106t(C7900d5 c7900d5) {
        this(c7900d5, c7900d5.m19347t());
    }

    /* renamed from: a */
    private BigDecimal m18562a(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: b */
    public String m18561b() {
        return this.f21971o;
    }

    /* renamed from: c */
    public void m18560c(Map<String, Object> map) {
        this.f21977u = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("start_timestamp").mo18188j(interfaceC8040o0, m18562a(this.f21966j));
        if (this.f21967k != null) {
            interfaceC7919f2.mo18193e("timestamp").mo18188j(interfaceC8040o0, m18562a(this.f21967k));
        }
        interfaceC7919f2.mo18193e("trace_id").mo18188j(interfaceC8040o0, this.f21968l);
        interfaceC7919f2.mo18193e("span_id").mo18188j(interfaceC8040o0, this.f21969m);
        if (this.f21970n != null) {
            interfaceC7919f2.mo18193e("parent_span_id").mo18188j(interfaceC8040o0, this.f21970n);
        }
        interfaceC7919f2.mo18193e("op").mo18191g(this.f21971o);
        if (this.f21972p != null) {
            interfaceC7919f2.mo18193e("description").mo18191g(this.f21972p);
        }
        if (this.f21973q != null) {
            interfaceC7919f2.mo18193e("status").mo18188j(interfaceC8040o0, this.f21973q);
        }
        if (this.f21974r != null) {
            interfaceC7919f2.mo18193e("origin").mo18188j(interfaceC8040o0, this.f21974r);
        }
        if (!this.f21975s.isEmpty()) {
            interfaceC7919f2.mo18193e("tags").mo18188j(interfaceC8040o0, this.f21975s);
        }
        if (this.f21976t != null) {
            interfaceC7919f2.mo18193e("data").mo18188j(interfaceC8040o0, this.f21976t);
        }
        Map<String, Object> map = this.f21977u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21977u.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C8106t(C7900d5 c7900d5, Map<String, Object> map) {
        C8229o.m18169c(c7900d5, "span is required");
        this.f21972p = c7900d5.getDescription();
        this.f21971o = c7900d5.m19345v();
        this.f21969m = c7900d5.m19341z();
        this.f21970n = c7900d5.m19343x();
        this.f21968l = c7900d5.m19354B();
        this.f21973q = c7900d5.mo17950b();
        this.f21974r = c7900d5.mo17936p().m19303c();
        Map<String, String> m18238b = C8212b.m18238b(c7900d5.m19355A());
        this.f21975s = m18238b == null ? new ConcurrentHashMap<>() : m18238b;
        this.f21967k = Double.valueOf(C7991j.m19079l(c7900d5.mo17933s().mo18865e(c7900d5.mo17935q())));
        this.f21966j = Double.valueOf(C7991j.m19079l(c7900d5.mo17933s().mo18864f()));
        this.f21976t = map;
    }

    public C8106t(Double d, Double d2, C8100q c8100q, C7932g5 c7932g5, C7932g5 c7932g52, String str, String str2, EnumC7975i5 enumC7975i5, String str3, Map<String, String> map, Map<String, Object> map2) {
        this.f21966j = d;
        this.f21967k = d2;
        this.f21968l = c8100q;
        this.f21969m = c7932g5;
        this.f21970n = c7932g52;
        this.f21971o = str;
        this.f21972p = str2;
        this.f21973q = enumC7975i5;
        this.f21975s = map;
        this.f21976t = map2;
        this.f21974r = str3;
    }
}
