package io.sentry;

import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8068c;
import io.sentry.protocol.C8090l;
import io.sentry.util.C8212b;
import io.sentry.util.C8229o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import p164j$.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Scope {

    /* renamed from: a */
    private EnumC8021m4 f20989a;

    /* renamed from: b */
    private InterfaceC8259w0 f20990b;

    /* renamed from: c */
    private String f20991c;

    /* renamed from: d */
    private C8062a0 f20992d;

    /* renamed from: e */
    private C8090l f20993e;

    /* renamed from: f */
    private List<String> f20994f;

    /* renamed from: g */
    private final Queue<C7901e> f20995g;

    /* renamed from: h */
    private Map<String, String> f20996h;

    /* renamed from: i */
    private Map<String, Object> f20997i;

    /* renamed from: j */
    private List<InterfaceC8270y> f20998j;

    /* renamed from: k */
    private final C8132r4 f20999k;

    /* renamed from: l */
    private volatile C7836b5 f21000l;

    /* renamed from: m */
    private final Object f21001m;

    /* renamed from: n */
    private final Object f21002n;

    /* renamed from: o */
    private final Object f21003o;

    /* renamed from: p */
    private C8068c f21004p;

    /* renamed from: q */
    private List<C7830b> f21005q;

    /* renamed from: r */
    private C8051p2 f21006r;

    /* renamed from: io.sentry.Scope$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7679a {
        /* renamed from: a */
        void mo18146a(C8051p2 c8051p2);
    }

    /* renamed from: io.sentry.Scope$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC7680b {
        /* renamed from: a */
        void mo19161a(C7836b5 c7836b5);
    }

    /* renamed from: io.sentry.Scope$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7681c {
        /* renamed from: a */
        void mo18033a(InterfaceC8259w0 interfaceC8259w0);
    }

    /* renamed from: io.sentry.Scope$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7682d {

        /* renamed from: a */
        private final C7836b5 f21007a;

        /* renamed from: b */
        private final C7836b5 f21008b;

        public C7682d(C7836b5 c7836b5, C7836b5 c7836b52) {
            this.f21008b = c7836b5;
            this.f21007a = c7836b52;
        }

        /* renamed from: a */
        public C7836b5 m20055a() {
            return this.f21008b;
        }

        /* renamed from: b */
        public C7836b5 m20054b() {
            return this.f21007a;
        }
    }

    public Scope(C8132r4 c8132r4) {
        this.f20994f = new ArrayList();
        this.f20996h = new ConcurrentHashMap();
        this.f20997i = new ConcurrentHashMap();
        this.f20998j = new CopyOnWriteArrayList();
        this.f21001m = new Object();
        this.f21002n = new Object();
        this.f21003o = new Object();
        this.f21004p = new C8068c();
        this.f21005q = new CopyOnWriteArrayList();
        C8132r4 c8132r42 = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required.");
        this.f20999k = c8132r42;
        this.f20995g = m20075g(c8132r42.getMaxBreadcrumbs());
        this.f21006r = new C8051p2();
    }

    /* renamed from: g */
    private Queue<C7901e> m20075g(int i) {
        return C8013l5.m19005e(new C7915f(i));
    }

    /* renamed from: A */
    public void m20089A(C8051p2 c8051p2) {
        this.f21006r = c8051p2;
    }

    /* renamed from: B */
    public void m20088B(String str, String str2) {
        this.f20996h.put(str, str2);
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18454b(str, str2);
            interfaceC8127r0.mo18455a(this.f20996h);
        }
    }

    /* renamed from: C */
    public void m20087C(InterfaceC8259w0 interfaceC8259w0) {
        synchronized (this.f21002n) {
            this.f20990b = interfaceC8259w0;
            for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
                if (interfaceC8259w0 != null) {
                    interfaceC8127r0.mo18445k(interfaceC8259w0.getName());
                    interfaceC8127r0.mo18447i(interfaceC8259w0.mo17936p());
                } else {
                    interfaceC8127r0.mo18445k(null);
                    interfaceC8127r0.mo18447i(null);
                }
            }
        }
    }

    /* renamed from: D */
    public void m20086D(C8062a0 c8062a0) {
        this.f20992d = c8062a0;
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18449g(c8062a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public C7682d m20085E() {
        C7682d c7682d;
        synchronized (this.f21001m) {
            if (this.f21000l != null) {
                this.f21000l.m19584c();
            }
            C7836b5 c7836b5 = this.f21000l;
            c7682d = null;
            C7836b5 c7836b52 = null;
            if (this.f20999k.getRelease() != null) {
                this.f21000l = new C7836b5(this.f20999k.getDistinctId(), this.f20992d, this.f20999k.getEnvironment(), this.f20999k.getRelease());
                if (c7836b5 != null) {
                    c7836b52 = c7836b5.clone();
                }
                c7682d = new C7682d(this.f21000l.clone(), c7836b52);
            } else {
                this.f20999k.getLogger().mo18135c(EnumC8021m4.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
        }
        return c7682d;
    }

    /* renamed from: F */
    public C8051p2 m20084F(InterfaceC7679a interfaceC7679a) {
        C8051p2 c8051p2;
        synchronized (this.f21003o) {
            interfaceC7679a.mo18146a(this.f21006r);
            c8051p2 = new C8051p2(this.f21006r);
        }
        return c8051p2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public C7836b5 m20083G(InterfaceC7680b interfaceC7680b) {
        C7836b5 c7836b5;
        synchronized (this.f21001m) {
            interfaceC7680b.mo19161a(this.f21000l);
            if (this.f21000l != null) {
                c7836b5 = this.f21000l.clone();
            } else {
                c7836b5 = null;
            }
        }
        return c7836b5;
    }

    /* renamed from: H */
    public void m20082H(InterfaceC7681c interfaceC7681c) {
        synchronized (this.f21002n) {
            interfaceC7681c.mo18033a(this.f20990b);
        }
    }

    /* renamed from: a */
    public void m20081a(C7901e c7901e) {
        m20080b(c7901e, null);
    }

    /* renamed from: b */
    public void m20080b(C7901e c7901e, C7831b0 c7831b0) {
        if (c7901e == null) {
            return;
        }
        if (c7831b0 == null) {
            new C7831b0();
        }
        this.f20999k.getBeforeBreadcrumb();
        this.f20995g.add(c7901e);
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18453c(c7901e);
            interfaceC8127r0.mo18451e(this.f20995g);
        }
    }

    /* renamed from: c */
    public void m20079c() {
        this.f20989a = null;
        this.f20992d = null;
        this.f20993e = null;
        this.f20994f.clear();
        m20077e();
        this.f20996h.clear();
        this.f20997i.clear();
        this.f20998j.clear();
        m20076f();
        m20078d();
    }

    /* renamed from: d */
    public void m20078d() {
        this.f21005q.clear();
    }

    /* renamed from: e */
    public void m20077e() {
        this.f20995g.clear();
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18451e(this.f20995g);
        }
    }

    /* renamed from: f */
    public void m20076f() {
        synchronized (this.f21002n) {
            this.f20990b = null;
        }
        this.f20991c = null;
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18445k(null);
            interfaceC8127r0.mo18447i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C7836b5 m20074h() {
        C7836b5 c7836b5;
        synchronized (this.f21001m) {
            c7836b5 = null;
            if (this.f21000l != null) {
                this.f21000l.m19584c();
                C7836b5 clone = this.f21000l.clone();
                this.f21000l = null;
                c7836b5 = clone;
            }
        }
        return c7836b5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public List<C7830b> m20073i() {
        return new CopyOnWriteArrayList(this.f21005q);
    }

    /* renamed from: j */
    public Queue<C7901e> m20072j() {
        return this.f20995g;
    }

    /* renamed from: k */
    public C8068c m20071k() {
        return this.f21004p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<InterfaceC8270y> m20070l() {
        return this.f20998j;
    }

    /* renamed from: m */
    public Map<String, Object> m20069m() {
        return this.f20997i;
    }

    /* renamed from: n */
    public List<String> m20068n() {
        return this.f20994f;
    }

    /* renamed from: o */
    public EnumC8021m4 m20067o() {
        return this.f20989a;
    }

    /* renamed from: p */
    public C8051p2 m20066p() {
        return this.f21006r;
    }

    /* renamed from: q */
    public C8090l m20065q() {
        return this.f20993e;
    }

    /* renamed from: r */
    public C7836b5 m20064r() {
        return this.f21000l;
    }

    /* renamed from: s */
    public ISpan m20063s() {
        C7900d5 mo17938n;
        InterfaceC8259w0 interfaceC8259w0 = this.f20990b;
        if (interfaceC8259w0 != null && (mo17938n = interfaceC8259w0.mo17938n()) != null) {
            return mo17938n;
        }
        return interfaceC8259w0;
    }

    /* renamed from: t */
    public Map<String, String> m20062t() {
        return C8212b.m18238b(this.f20996h);
    }

    /* renamed from: u */
    public InterfaceC8259w0 m20061u() {
        return this.f20990b;
    }

    /* renamed from: v */
    public String m20060v() {
        InterfaceC8259w0 interfaceC8259w0 = this.f20990b;
        if (interfaceC8259w0 != null) {
            return interfaceC8259w0.getName();
        }
        return this.f20991c;
    }

    /* renamed from: w */
    public C8062a0 m20059w() {
        return this.f20992d;
    }

    /* renamed from: x */
    public void m20058x(String str, Object obj) {
        this.f21004p.put(str, obj);
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18448h(this.f21004p);
        }
    }

    /* renamed from: y */
    public void m20057y(String str, String str2) {
        this.f20997i.put(str, str2);
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18452d(str, str2);
            interfaceC8127r0.mo18446j(this.f20997i);
        }
    }

    /* renamed from: z */
    public void m20056z(List<String> list) {
        if (list == null) {
            return;
        }
        this.f20994f = new ArrayList(list);
        for (InterfaceC8127r0 interfaceC8127r0 : this.f20999k.getScopeObservers()) {
            interfaceC8127r0.mo18450f(list);
        }
    }

    public Scope(Scope scope) {
        this.f20994f = new ArrayList();
        this.f20996h = new ConcurrentHashMap();
        this.f20997i = new ConcurrentHashMap();
        this.f20998j = new CopyOnWriteArrayList();
        this.f21001m = new Object();
        this.f21002n = new Object();
        this.f21003o = new Object();
        this.f21004p = new C8068c();
        this.f21005q = new CopyOnWriteArrayList();
        this.f20990b = scope.f20990b;
        this.f20991c = scope.f20991c;
        this.f21000l = scope.f21000l;
        this.f20999k = scope.f20999k;
        this.f20989a = scope.f20989a;
        C8062a0 c8062a0 = scope.f20992d;
        this.f20992d = c8062a0 != null ? new C8062a0(c8062a0) : null;
        C8090l c8090l = scope.f20993e;
        this.f20993e = c8090l != null ? new C8090l(c8090l) : null;
        this.f20994f = new ArrayList(scope.f20994f);
        this.f20998j = new CopyOnWriteArrayList(scope.f20998j);
        C7901e[] c7901eArr = (C7901e[]) scope.f20995g.toArray(new C7901e[0]);
        Queue<C7901e> m20075g = m20075g(scope.f20999k.getMaxBreadcrumbs());
        for (C7901e c7901e : c7901eArr) {
            m20075g.add(new C7901e(c7901e));
        }
        this.f20995g = m20075g;
        Map<String, String> map = scope.f20996h;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f20996h = concurrentHashMap;
        Map<String, Object> map2 = scope.f20997i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f20997i = concurrentHashMap2;
        this.f21004p = new C8068c(scope.f21004p);
        this.f21005q = new CopyOnWriteArrayList(scope.f21005q);
        this.f21006r = new C8051p2(scope.f21006r);
    }
}
