package io.sentry;

import io.sentry.C7932g5;
import io.sentry.EnumC7975i5;
import io.sentry.protocol.C8100q;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.e5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7911e5 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final C8100q f21556j;

    /* renamed from: k */
    private final C7932g5 f21557k;

    /* renamed from: l */
    private final C7932g5 f21558l;

    /* renamed from: m */
    private transient C8054p5 f21559m;

    /* renamed from: n */
    protected String f21560n;

    /* renamed from: o */
    protected String f21561o;

    /* renamed from: p */
    protected EnumC7975i5 f21562p;

    /* renamed from: q */
    protected Map<String, String> f21563q;

    /* renamed from: r */
    protected String f21564r;

    /* renamed from: s */
    private Map<String, Object> f21565s;

    /* renamed from: io.sentry.e5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7912a implements InterfaceC7894d1<C7911e5> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7911e5 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            c7993j1.m18097h();
            ConcurrentHashMap concurrentHashMap = null;
            C8100q c8100q = null;
            C7932g5 c7932g5 = null;
            String str = null;
            C7932g5 c7932g52 = null;
            String str2 = null;
            EnumC7975i5 enumC7975i5 = null;
            String str3 = null;
            Map<String, String> map = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
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
                    case -1008619738:
                        if (m18105R.equals("origin")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -892481550:
                        if (m18105R.equals("status")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3553:
                        if (m18105R.equals("op")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3552281:
                        if (m18105R.equals("tags")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (m18105R.equals("trace_id")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c7932g5 = new C7932g5.C7933a().mo18130a(c7993j1, interfaceC8040o0);
                        break;
                    case 1:
                        c7932g52 = (C7932g5) c7993j1.m19062S0(interfaceC8040o0, new C7932g5.C7933a());
                        break;
                    case 2:
                        str2 = c7993j1.m18101Y();
                        break;
                    case 3:
                        str3 = c7993j1.m18101Y();
                        break;
                    case 4:
                        enumC7975i5 = (EnumC7975i5) c7993j1.m19062S0(interfaceC8040o0, new EnumC7975i5.C7976a());
                        break;
                    case 5:
                        str = c7993j1.m18101Y();
                        break;
                    case 6:
                        map = C8212b.m18238b((Map) c7993j1.m19063R0());
                        break;
                    case 7:
                        c8100q = new C8100q.C8101a().mo18130a(c7993j1, interfaceC8040o0);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            if (c8100q != null) {
                if (c7932g5 != null) {
                    if (str != null) {
                        C7911e5 c7911e5 = new C7911e5(c8100q, c7932g5, str, c7932g52, null);
                        c7911e5.m19294l(str2);
                        c7911e5.m19291o(enumC7975i5);
                        c7911e5.m19293m(str3);
                        if (map != null) {
                            c7911e5.f21563q = map;
                        }
                        c7911e5.m19290p(concurrentHashMap);
                        c7993j1.m18091q();
                        return c7911e5;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"op\"");
                    interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"op\"", illegalStateException);
                    throw illegalStateException;
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"trace_id\"");
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Missing required field \"trace_id\"", illegalStateException3);
            throw illegalStateException3;
        }
    }

    public C7911e5(String str) {
        this(new C8100q(), new C7932g5(), str, null, null);
    }

    /* renamed from: a */
    public String m19305a() {
        return this.f21561o;
    }

    /* renamed from: b */
    public String m19304b() {
        return this.f21560n;
    }

    /* renamed from: c */
    public String m19303c() {
        return this.f21564r;
    }

    /* renamed from: d */
    public C7932g5 m19302d() {
        return this.f21558l;
    }

    /* renamed from: e */
    public Boolean m19301e() {
        C8054p5 c8054p5 = this.f21559m;
        if (c8054p5 == null) {
            return null;
        }
        return c8054p5.m18862a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7911e5)) {
            return false;
        }
        C7911e5 c7911e5 = (C7911e5) obj;
        if (this.f21556j.equals(c7911e5.f21556j) && this.f21557k.equals(c7911e5.f21557k) && C8229o.m18171a(this.f21558l, c7911e5.f21558l) && this.f21560n.equals(c7911e5.f21560n) && C8229o.m18171a(this.f21561o, c7911e5.f21561o) && this.f21562p == c7911e5.f21562p) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Boolean m19300f() {
        C8054p5 c8054p5 = this.f21559m;
        if (c8054p5 == null) {
            return null;
        }
        return c8054p5.m18860c();
    }

    /* renamed from: g */
    public C8054p5 m19299g() {
        return this.f21559m;
    }

    /* renamed from: h */
    public C7932g5 m19298h() {
        return this.f21557k;
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21556j, this.f21557k, this.f21558l, this.f21560n, this.f21561o, this.f21562p);
    }

    /* renamed from: i */
    public EnumC7975i5 m19297i() {
        return this.f21562p;
    }

    /* renamed from: j */
    public Map<String, String> m19296j() {
        return this.f21563q;
    }

    /* renamed from: k */
    public C8100q m19295k() {
        return this.f21556j;
    }

    /* renamed from: l */
    public void m19294l(String str) {
        this.f21561o = str;
    }

    /* renamed from: m */
    public void m19293m(String str) {
        this.f21564r = str;
    }

    /* renamed from: n */
    public void m19292n(C8054p5 c8054p5) {
        this.f21559m = c8054p5;
    }

    /* renamed from: o */
    public void m19291o(EnumC7975i5 enumC7975i5) {
        this.f21562p = enumC7975i5;
    }

    /* renamed from: p */
    public void m19290p(Map<String, Object> map) {
        this.f21565s = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("trace_id");
        this.f21556j.serialize(interfaceC7919f2, interfaceC8040o0);
        interfaceC7919f2.mo18193e("span_id");
        this.f21557k.serialize(interfaceC7919f2, interfaceC8040o0);
        if (this.f21558l != null) {
            interfaceC7919f2.mo18193e("parent_span_id");
            this.f21558l.serialize(interfaceC7919f2, interfaceC8040o0);
        }
        interfaceC7919f2.mo18193e("op").mo18191g(this.f21560n);
        if (this.f21561o != null) {
            interfaceC7919f2.mo18193e("description").mo18191g(this.f21561o);
        }
        if (this.f21562p != null) {
            interfaceC7919f2.mo18193e("status").mo18188j(interfaceC8040o0, this.f21562p);
        }
        if (this.f21564r != null) {
            interfaceC7919f2.mo18193e("origin").mo18188j(interfaceC8040o0, this.f21564r);
        }
        if (!this.f21563q.isEmpty()) {
            interfaceC7919f2.mo18193e("tags").mo18188j(interfaceC8040o0, this.f21563q);
        }
        Map<String, Object> map = this.f21565s;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21565s.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C7911e5(C8100q c8100q, C7932g5 c7932g5, String str, C7932g5 c7932g52, C8054p5 c8054p5) {
        this(c8100q, c7932g5, c7932g52, str, null, c8054p5, null, "manual");
    }

    public C7911e5(C8100q c8100q, C7932g5 c7932g5, C7932g5 c7932g52, String str, String str2, C8054p5 c8054p5, EnumC7975i5 enumC7975i5, String str3) {
        this.f21563q = new ConcurrentHashMap();
        this.f21564r = "manual";
        this.f21556j = (C8100q) C8229o.m18169c(c8100q, "traceId is required");
        this.f21557k = (C7932g5) C8229o.m18169c(c7932g5, "spanId is required");
        this.f21560n = (String) C8229o.m18169c(str, "operation is required");
        this.f21558l = c7932g52;
        this.f21559m = c8054p5;
        this.f21561o = str2;
        this.f21562p = enumC7975i5;
        this.f21564r = str3;
    }

    public C7911e5(C7911e5 c7911e5) {
        this.f21563q = new ConcurrentHashMap();
        this.f21564r = "manual";
        this.f21556j = c7911e5.f21556j;
        this.f21557k = c7911e5.f21557k;
        this.f21558l = c7911e5.f21558l;
        this.f21559m = c7911e5.f21559m;
        this.f21560n = c7911e5.f21560n;
        this.f21561o = c7911e5.f21561o;
        this.f21562p = c7911e5.f21562p;
        Map<String, String> m18238b = C8212b.m18238b(c7911e5.f21563q);
        if (m18238b != null) {
            this.f21563q = m18238b;
        }
    }
}
