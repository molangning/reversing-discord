package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.C8032n4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8108u implements InterfaceC8026n1 {

    /* renamed from: A */
    private C8032n4 f21978A;

    /* renamed from: j */
    private String f21979j;

    /* renamed from: k */
    private String f21980k;

    /* renamed from: l */
    private String f21981l;

    /* renamed from: m */
    private Integer f21982m;

    /* renamed from: n */
    private Integer f21983n;

    /* renamed from: o */
    private String f21984o;

    /* renamed from: p */
    private String f21985p;

    /* renamed from: q */
    private Boolean f21986q;

    /* renamed from: r */
    private String f21987r;

    /* renamed from: s */
    private Boolean f21988s;

    /* renamed from: t */
    private String f21989t;

    /* renamed from: u */
    private String f21990u;

    /* renamed from: v */
    private String f21991v;

    /* renamed from: w */
    private String f21992w;

    /* renamed from: x */
    private String f21993x;

    /* renamed from: y */
    private Map<String, Object> f21994y;

    /* renamed from: z */
    private String f21995z;

    /* renamed from: io.sentry.protocol.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8109a implements InterfaceC7894d1<C8108u> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8108u mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8108u c8108u = new C8108u();
            c7993j1.m18097h();
            ConcurrentHashMap concurrentHashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1443345323:
                        if (m18105R.equals("image_addr")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1184392185:
                        if (m18105R.equals("in_app")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1113875953:
                        if (m18105R.equals("raw_function")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1102671691:
                        if (m18105R.equals("lineno")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (m18105R.equals("module")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (m18105R.equals("native")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -887523944:
                        if (m18105R.equals("symbol")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -807062458:
                        if (m18105R.equals("package")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -734768633:
                        if (m18105R.equals("filename")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -330260936:
                        if (m18105R.equals("symbol_addr")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 3327275:
                        if (m18105R.equals("lock")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 94842689:
                        if (m18105R.equals("colno")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 410194178:
                        if (m18105R.equals("instruction_addr")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1116694660:
                        if (m18105R.equals("context_line")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 1380938712:
                        if (m18105R.equals("function")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 1713445842:
                        if (m18105R.equals("abs_path")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 1874684019:
                        if (m18105R.equals("platform")) {
                            c = 16;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c8108u.f21990u = c7993j1.m19061T0();
                        break;
                    case 1:
                        c8108u.f21986q = c7993j1.m19072I0();
                        break;
                    case 2:
                        c8108u.f21995z = c7993j1.m19061T0();
                        break;
                    case 3:
                        c8108u.f21982m = c7993j1.m19067N0();
                        break;
                    case 4:
                        c8108u.f21981l = c7993j1.m19061T0();
                        break;
                    case 5:
                        c8108u.f21988s = c7993j1.m19072I0();
                        break;
                    case 6:
                        c8108u.f21993x = c7993j1.m19061T0();
                        break;
                    case 7:
                        c8108u.f21987r = c7993j1.m19061T0();
                        break;
                    case '\b':
                        c8108u.f21979j = c7993j1.m19061T0();
                        break;
                    case '\t':
                        c8108u.f21991v = c7993j1.m19061T0();
                        break;
                    case '\n':
                        c8108u.f21978A = (C8032n4) c7993j1.m19062S0(interfaceC8040o0, new C8032n4.C8033a());
                        break;
                    case 11:
                        c8108u.f21983n = c7993j1.m19067N0();
                        break;
                    case '\f':
                        c8108u.f21992w = c7993j1.m19061T0();
                        break;
                    case '\r':
                        c8108u.f21985p = c7993j1.m19061T0();
                        break;
                    case 14:
                        c8108u.f21980k = c7993j1.m19061T0();
                        break;
                    case 15:
                        c8108u.f21984o = c7993j1.m19061T0();
                        break;
                    case 16:
                        c8108u.f21989t = c7993j1.m19061T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                        break;
                }
            }
            c8108u.m18532z(concurrentHashMap);
            c7993j1.m18091q();
            return c8108u;
        }
    }

    /* renamed from: r */
    public void m18540r(String str) {
        this.f21979j = str;
    }

    /* renamed from: s */
    public void m18539s(String str) {
        this.f21980k = str;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21979j != null) {
            interfaceC7919f2.mo18193e("filename").mo18191g(this.f21979j);
        }
        if (this.f21980k != null) {
            interfaceC7919f2.mo18193e("function").mo18191g(this.f21980k);
        }
        if (this.f21981l != null) {
            interfaceC7919f2.mo18193e("module").mo18191g(this.f21981l);
        }
        if (this.f21982m != null) {
            interfaceC7919f2.mo18193e("lineno").mo18189i(this.f21982m);
        }
        if (this.f21983n != null) {
            interfaceC7919f2.mo18193e("colno").mo18189i(this.f21983n);
        }
        if (this.f21984o != null) {
            interfaceC7919f2.mo18193e("abs_path").mo18191g(this.f21984o);
        }
        if (this.f21985p != null) {
            interfaceC7919f2.mo18193e("context_line").mo18191g(this.f21985p);
        }
        if (this.f21986q != null) {
            interfaceC7919f2.mo18193e("in_app").mo18187k(this.f21986q);
        }
        if (this.f21987r != null) {
            interfaceC7919f2.mo18193e("package").mo18191g(this.f21987r);
        }
        if (this.f21988s != null) {
            interfaceC7919f2.mo18193e("native").mo18187k(this.f21988s);
        }
        if (this.f21989t != null) {
            interfaceC7919f2.mo18193e("platform").mo18191g(this.f21989t);
        }
        if (this.f21990u != null) {
            interfaceC7919f2.mo18193e("image_addr").mo18191g(this.f21990u);
        }
        if (this.f21991v != null) {
            interfaceC7919f2.mo18193e("symbol_addr").mo18191g(this.f21991v);
        }
        if (this.f21992w != null) {
            interfaceC7919f2.mo18193e("instruction_addr").mo18191g(this.f21992w);
        }
        if (this.f21995z != null) {
            interfaceC7919f2.mo18193e("raw_function").mo18191g(this.f21995z);
        }
        if (this.f21993x != null) {
            interfaceC7919f2.mo18193e("symbol").mo18191g(this.f21993x);
        }
        if (this.f21978A != null) {
            interfaceC7919f2.mo18193e("lock").mo18188j(interfaceC8040o0, this.f21978A);
        }
        Map<String, Object> map = this.f21994y;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21994y.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* renamed from: t */
    public void m18538t(Boolean bool) {
        this.f21986q = bool;
    }

    /* renamed from: u */
    public void m18537u(Integer num) {
        this.f21982m = num;
    }

    /* renamed from: v */
    public void m18536v(C8032n4 c8032n4) {
        this.f21978A = c8032n4;
    }

    /* renamed from: w */
    public void m18535w(String str) {
        this.f21981l = str;
    }

    /* renamed from: x */
    public void m18534x(Boolean bool) {
        this.f21988s = bool;
    }

    /* renamed from: y */
    public void m18533y(String str) {
        this.f21987r = str;
    }

    /* renamed from: z */
    public void m18532z(Map<String, Object> map) {
        this.f21994y = map;
    }
}