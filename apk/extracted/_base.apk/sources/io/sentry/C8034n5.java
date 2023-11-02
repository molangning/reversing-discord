package io.sentry;

import io.sentry.protocol.C8100q;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.n5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8034n5 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final C8100q f21751j;

    /* renamed from: k */
    private final String f21752k;

    /* renamed from: l */
    private final String f21753l;

    /* renamed from: m */
    private final String f21754m;

    /* renamed from: n */
    private final String f21755n;

    /* renamed from: o */
    private final String f21756o;

    /* renamed from: p */
    private final String f21757p;

    /* renamed from: q */
    private final String f21758q;

    /* renamed from: r */
    private Map<String, Object> f21759r;

    /* renamed from: io.sentry.n5$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8036b implements InterfaceC7894d1<C8034n5> {
        /* renamed from: c */
        private Exception m18925c(String str, InterfaceC8040o0 interfaceC8040o0) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8034n5 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            String str;
            String str2;
            c7993j1.m18097h();
            C8037c c8037c = null;
            String str3 = null;
            C8100q c8100q = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -795593025:
                        if (m18105R.equals("user_segment")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -147132913:
                        if (m18105R.equals("user_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -85904877:
                        if (m18105R.equals("environment")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3599307:
                        if (m18105R.equals("user")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 153193045:
                        if (m18105R.equals("sample_rate")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1090594823:
                        if (m18105R.equals("release")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (m18105R.equals("trace_id")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1904812937:
                        if (m18105R.equals("public_key")) {
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
                        str4 = c7993j1.m19061T0();
                        break;
                    case 1:
                        str3 = c7993j1.m19061T0();
                        break;
                    case 2:
                        str7 = c7993j1.m19061T0();
                        break;
                    case 3:
                        c8037c = (C8037c) c7993j1.m19062S0(interfaceC8040o0, new C8037c.C8038a());
                        break;
                    case 4:
                        str9 = c7993j1.m19061T0();
                        break;
                    case 5:
                        str6 = c7993j1.m19061T0();
                        break;
                    case 6:
                        c8100q = new C8100q.C8101a().mo18130a(c7993j1, interfaceC8040o0);
                        break;
                    case 7:
                        str5 = c7993j1.m18101Y();
                        break;
                    case '\b':
                        str8 = c7993j1.m19061T0();
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
                if (str5 != null) {
                    if (c8037c != null) {
                        if (str3 == null) {
                            str3 = c8037c.m18924a();
                        }
                        if (str4 == null) {
                            str2 = c8037c.m18923b();
                            str = str3;
                            C8034n5 c8034n5 = new C8034n5(c8100q, str5, str6, str7, str, str2, str8, str9);
                            c8034n5.m18927b(concurrentHashMap);
                            c7993j1.m18091q();
                            return c8034n5;
                        }
                    }
                    str = str3;
                    str2 = str4;
                    C8034n5 c8034n52 = new C8034n5(c8100q, str5, str6, str7, str, str2, str8, str9);
                    c8034n52.m18927b(concurrentHashMap);
                    c7993j1.m18091q();
                    return c8034n52;
                }
                throw m18925c("public_key", interfaceC8040o0);
            }
            throw m18925c("trace_id", interfaceC8040o0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: io.sentry.n5$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8037c {

        /* renamed from: a */
        private String f21760a;

        /* renamed from: b */
        private String f21761b;

        /* renamed from: c */
        private Map<String, Object> f21762c;

        /* renamed from: io.sentry.n5$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C8038a implements InterfaceC7894d1<C8037c> {
            @Override // io.sentry.InterfaceC7894d1
            /* renamed from: b */
            public C8037c mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
                c7993j1.m18097h();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                    String m18105R = c7993j1.m18105R();
                    m18105R.hashCode();
                    if (!m18105R.equals("id")) {
                        if (!m18105R.equals("segment")) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        } else {
                            str2 = c7993j1.m19061T0();
                        }
                    } else {
                        str = c7993j1.m19061T0();
                    }
                }
                C8037c c8037c = new C8037c(str, str2);
                c8037c.m18922c(concurrentHashMap);
                c7993j1.m18091q();
                return c8037c;
            }
        }

        /* renamed from: a */
        public String m18924a() {
            return this.f21760a;
        }

        /* renamed from: b */
        public String m18923b() {
            return this.f21761b;
        }

        /* renamed from: c */
        public void m18922c(Map<String, Object> map) {
            this.f21762c = map;
        }

        private C8037c(String str, String str2) {
            this.f21760a = str;
            this.f21761b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8034n5(C8100q c8100q, String str) {
        this(c8100q, str, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public String m18928a() {
        return this.f21758q;
    }

    /* renamed from: b */
    public void m18927b(Map<String, Object> map) {
        this.f21759r = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("trace_id").mo18188j(interfaceC8040o0, this.f21751j);
        interfaceC7919f2.mo18193e("public_key").mo18191g(this.f21752k);
        if (this.f21753l != null) {
            interfaceC7919f2.mo18193e("release").mo18191g(this.f21753l);
        }
        if (this.f21754m != null) {
            interfaceC7919f2.mo18193e("environment").mo18191g(this.f21754m);
        }
        if (this.f21755n != null) {
            interfaceC7919f2.mo18193e("user_id").mo18191g(this.f21755n);
        }
        if (this.f21756o != null) {
            interfaceC7919f2.mo18193e("user_segment").mo18191g(this.f21756o);
        }
        if (this.f21757p != null) {
            interfaceC7919f2.mo18193e("transaction").mo18191g(this.f21757p);
        }
        if (this.f21758q != null) {
            interfaceC7919f2.mo18193e("sample_rate").mo18191g(this.f21758q);
        }
        Map<String, Object> map = this.f21759r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21759r.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8034n5(C8100q c8100q, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21751j = c8100q;
        this.f21752k = str;
        this.f21753l = str2;
        this.f21754m = str3;
        this.f21755n = str4;
        this.f21756o = str5;
        this.f21757p = str6;
        this.f21758q = str7;
    }
}
