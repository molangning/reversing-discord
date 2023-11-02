package io.sentry;

import io.sentry.C7901e;
import io.sentry.exception.C7913a;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8068c;
import io.sentry.protocol.C8072d;
import io.sentry.protocol.C8090l;
import io.sentry.protocol.C8096o;
import io.sentry.protocol.C8100q;
import io.sentry.util.C8212b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.f3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7920f3 {

    /* renamed from: j */
    private C8100q f21581j;

    /* renamed from: k */
    private final C8068c f21582k;

    /* renamed from: l */
    private C8096o f21583l;

    /* renamed from: m */
    private C8090l f21584m;

    /* renamed from: n */
    private Map<String, String> f21585n;

    /* renamed from: o */
    private String f21586o;

    /* renamed from: p */
    private String f21587p;

    /* renamed from: q */
    private String f21588q;

    /* renamed from: r */
    private C8062a0 f21589r;

    /* renamed from: s */
    protected transient Throwable f21590s;

    /* renamed from: t */
    private String f21591t;

    /* renamed from: u */
    private String f21592u;

    /* renamed from: v */
    private List<C7901e> f21593v;

    /* renamed from: w */
    private C8072d f21594w;

    /* renamed from: x */
    private Map<String, Object> f21595x;

    /* renamed from: io.sentry.f3$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7921a {
        /* renamed from: a */
        public boolean m19215a(AbstractC7920f3 abstractC7920f3, String str, C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1840434063:
                    if (str.equals("debug_meta")) {
                        c = 0;
                        break;
                    }
                    break;
                case -758770169:
                    if (str.equals("server_name")) {
                        c = 1;
                        break;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        c = 2;
                        break;
                    }
                    break;
                case -85904877:
                    if (str.equals("environment")) {
                        c = 3;
                        break;
                    }
                    break;
                case -51457840:
                    if (str.equals("breadcrumbs")) {
                        c = 4;
                        break;
                    }
                    break;
                case 113722:
                    if (str.equals("sdk")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3083686:
                    if (str.equals("dist")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    abstractC7920f3.f21594w = (C8072d) c7993j1.m19062S0(interfaceC8040o0, new C8072d.C8073a());
                    return true;
                case 1:
                    abstractC7920f3.f21591t = c7993j1.m19061T0();
                    return true;
                case 2:
                    abstractC7920f3.f21582k.putAll(new C8068c.C8069a().mo18130a(c7993j1, interfaceC8040o0));
                    return true;
                case 3:
                    abstractC7920f3.f21587p = c7993j1.m19061T0();
                    return true;
                case 4:
                    abstractC7920f3.f21593v = c7993j1.m19066O0(interfaceC8040o0, new C7901e.C7902a());
                    return true;
                case 5:
                    abstractC7920f3.f21583l = (C8096o) c7993j1.m19062S0(interfaceC8040o0, new C8096o.C8097a());
                    return true;
                case 6:
                    abstractC7920f3.f21592u = c7993j1.m19061T0();
                    return true;
                case 7:
                    abstractC7920f3.f21585n = C8212b.m18238b((Map) c7993j1.m19063R0());
                    return true;
                case '\b':
                    abstractC7920f3.f21589r = (C8062a0) c7993j1.m19062S0(interfaceC8040o0, new C8062a0.C8063a());
                    return true;
                case '\t':
                    abstractC7920f3.f21595x = C8212b.m18238b((Map) c7993j1.m19063R0());
                    return true;
                case '\n':
                    abstractC7920f3.f21581j = (C8100q) c7993j1.m19062S0(interfaceC8040o0, new C8100q.C8101a());
                    return true;
                case 11:
                    abstractC7920f3.f21586o = c7993j1.m19061T0();
                    return true;
                case '\f':
                    abstractC7920f3.f21584m = (C8090l) c7993j1.m19062S0(interfaceC8040o0, new C8090l.C8091a());
                    return true;
                case '\r':
                    abstractC7920f3.f21588q = c7993j1.m19061T0();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: io.sentry.f3$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7922b {
        /* renamed from: a */
        public void m19214a(AbstractC7920f3 abstractC7920f3, InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
            if (abstractC7920f3.f21581j != null) {
                interfaceC7919f2.mo18193e("event_id").mo18188j(interfaceC8040o0, abstractC7920f3.f21581j);
            }
            interfaceC7919f2.mo18193e("contexts").mo18188j(interfaceC8040o0, abstractC7920f3.f21582k);
            if (abstractC7920f3.f21583l != null) {
                interfaceC7919f2.mo18193e("sdk").mo18188j(interfaceC8040o0, abstractC7920f3.f21583l);
            }
            if (abstractC7920f3.f21584m != null) {
                interfaceC7919f2.mo18193e("request").mo18188j(interfaceC8040o0, abstractC7920f3.f21584m);
            }
            if (abstractC7920f3.f21585n != null && !abstractC7920f3.f21585n.isEmpty()) {
                interfaceC7919f2.mo18193e("tags").mo18188j(interfaceC8040o0, abstractC7920f3.f21585n);
            }
            if (abstractC7920f3.f21586o != null) {
                interfaceC7919f2.mo18193e("release").mo18191g(abstractC7920f3.f21586o);
            }
            if (abstractC7920f3.f21587p != null) {
                interfaceC7919f2.mo18193e("environment").mo18191g(abstractC7920f3.f21587p);
            }
            if (abstractC7920f3.f21588q != null) {
                interfaceC7919f2.mo18193e("platform").mo18191g(abstractC7920f3.f21588q);
            }
            if (abstractC7920f3.f21589r != null) {
                interfaceC7919f2.mo18193e("user").mo18188j(interfaceC8040o0, abstractC7920f3.f21589r);
            }
            if (abstractC7920f3.f21591t != null) {
                interfaceC7919f2.mo18193e("server_name").mo18191g(abstractC7920f3.f21591t);
            }
            if (abstractC7920f3.f21592u != null) {
                interfaceC7919f2.mo18193e("dist").mo18191g(abstractC7920f3.f21592u);
            }
            if (abstractC7920f3.f21593v != null && !abstractC7920f3.f21593v.isEmpty()) {
                interfaceC7919f2.mo18193e("breadcrumbs").mo18188j(interfaceC8040o0, abstractC7920f3.f21593v);
            }
            if (abstractC7920f3.f21594w != null) {
                interfaceC7919f2.mo18193e("debug_meta").mo18188j(interfaceC8040o0, abstractC7920f3.f21594w);
            }
            if (abstractC7920f3.f21595x != null && !abstractC7920f3.f21595x.isEmpty()) {
                interfaceC7919f2.mo18193e("extra").mo18188j(interfaceC8040o0, abstractC7920f3.f21595x);
            }
        }
    }

    public AbstractC7920f3(C8100q c8100q) {
        this.f21582k = new C8068c();
        this.f21581j = c8100q;
    }

    /* renamed from: B */
    public List<C7901e> m19271B() {
        return this.f21593v;
    }

    /* renamed from: C */
    public C8068c m19270C() {
        return this.f21582k;
    }

    /* renamed from: D */
    public C8072d m19269D() {
        return this.f21594w;
    }

    /* renamed from: E */
    public String m19268E() {
        return this.f21592u;
    }

    /* renamed from: F */
    public String m19267F() {
        return this.f21587p;
    }

    /* renamed from: G */
    public C8100q m19266G() {
        return this.f21581j;
    }

    /* renamed from: H */
    public Map<String, Object> m19265H() {
        return this.f21595x;
    }

    /* renamed from: I */
    public String m19264I() {
        return this.f21588q;
    }

    /* renamed from: J */
    public String m19263J() {
        return this.f21586o;
    }

    /* renamed from: K */
    public C8090l m19262K() {
        return this.f21584m;
    }

    /* renamed from: L */
    public C8096o m19261L() {
        return this.f21583l;
    }

    /* renamed from: M */
    public String m19260M() {
        return this.f21591t;
    }

    /* renamed from: N */
    public Map<String, String> m19259N() {
        return this.f21585n;
    }

    /* renamed from: O */
    public Throwable m19258O() {
        Throwable th2 = this.f21590s;
        if (th2 instanceof C7913a) {
            return ((C7913a) th2).m19286c();
        }
        return th2;
    }

    /* renamed from: P */
    public Throwable m19257P() {
        return this.f21590s;
    }

    /* renamed from: Q */
    public C8062a0 m19256Q() {
        return this.f21589r;
    }

    /* renamed from: R */
    public void m19255R(List<C7901e> list) {
        this.f21593v = C8212b.m18239a(list);
    }

    /* renamed from: S */
    public void m19254S(C8072d c8072d) {
        this.f21594w = c8072d;
    }

    /* renamed from: T */
    public void m19253T(String str) {
        this.f21592u = str;
    }

    /* renamed from: U */
    public void m19252U(String str) {
        this.f21587p = str;
    }

    /* renamed from: V */
    public void m19251V(String str, Object obj) {
        if (this.f21595x == null) {
            this.f21595x = new HashMap();
        }
        this.f21595x.put(str, obj);
    }

    /* renamed from: W */
    public void m19250W(Map<String, Object> map) {
        this.f21595x = C8212b.m18237c(map);
    }

    /* renamed from: X */
    public void m19249X(String str) {
        this.f21588q = str;
    }

    /* renamed from: Y */
    public void m19248Y(String str) {
        this.f21586o = str;
    }

    /* renamed from: Z */
    public void m19247Z(C8090l c8090l) {
        this.f21584m = c8090l;
    }

    /* renamed from: a0 */
    public void m19245a0(C8096o c8096o) {
        this.f21583l = c8096o;
    }

    /* renamed from: b0 */
    public void m19243b0(String str) {
        this.f21591t = str;
    }

    /* renamed from: c0 */
    public void m19241c0(String str, String str2) {
        if (this.f21585n == null) {
            this.f21585n = new HashMap();
        }
        this.f21585n.put(str, str2);
    }

    /* renamed from: d0 */
    public void m19239d0(Map<String, String> map) {
        this.f21585n = C8212b.m18237c(map);
    }

    /* renamed from: e0 */
    public void m19237e0(C8062a0 c8062a0) {
        this.f21589r = c8062a0;
    }

    public AbstractC7920f3() {
        this(new C8100q());
    }
}