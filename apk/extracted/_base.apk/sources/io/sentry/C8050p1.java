package io.sentry;

import io.sentry.hints.InterfaceC7944b;
import io.sentry.hints.InterfaceC7948f;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8072d;
import io.sentry.protocol.C8098p;
import io.sentry.protocol.C8114x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.p1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8050p1 implements InterfaceC8270y, Closeable {

    /* renamed from: j */
    private final C8132r4 f21788j;

    /* renamed from: k */
    private final C8208u4 f21789k;

    /* renamed from: l */
    private final C7931g4 f21790l;

    /* renamed from: m */
    private volatile C7903e0 f21791m = null;

    public C8050p1(C8132r4 c8132r4) {
        C8132r4 c8132r42 = (C8132r4) C8229o.m18169c(c8132r4, "The SentryOptions is required.");
        this.f21788j = c8132r42;
        C8166t4 c8166t4 = new C8166t4(c8132r42);
        this.f21790l = new C7931g4(c8166t4);
        this.f21789k = new C8208u4(c8166t4, c8132r42);
    }

    /* renamed from: A */
    private void m18892A(C7923f4 c7923f4) {
        Throwable m19257P = c7923f4.m19257P();
        if (m19257P != null) {
            c7923f4.m19189x0(this.f21790l.m19179c(m19257P));
        }
    }

    /* renamed from: D */
    private void m18891D(C7923f4 c7923f4) {
        Map<String, String> mo19094a = this.f21788j.getModulesLoader().mo19094a();
        if (mo19094a == null) {
            return;
        }
        Map<String, String> m19195r0 = c7923f4.m19195r0();
        if (m19195r0 == null) {
            c7923f4.m19212B0(mo19094a);
        } else {
            m19195r0.putAll(mo19094a);
        }
    }

    /* renamed from: H */
    private void m18890H(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19264I() == null) {
            abstractC7920f3.m19249X("java");
        }
    }

    /* renamed from: I */
    private void m18889I(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19263J() == null) {
            abstractC7920f3.m19248Y(this.f21788j.getRelease());
        }
    }

    /* renamed from: Q */
    private void m18888Q(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19261L() == null) {
            abstractC7920f3.m19245a0(this.f21788j.getSdkVersion());
        }
    }

    /* renamed from: R */
    private void m18887R(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19260M() == null) {
            abstractC7920f3.m19243b0(this.f21788j.getServerName());
        }
        if (this.f21788j.isAttachServerName() && abstractC7920f3.m19260M() == null) {
            m18883a();
            if (this.f21791m != null) {
                abstractC7920f3.m19243b0(this.f21791m.m19318d());
            }
        }
    }

    /* renamed from: S */
    private void m18886S(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19259N() == null) {
            abstractC7920f3.m19239d0(new HashMap(this.f21788j.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f21788j.getTags().entrySet()) {
            if (!abstractC7920f3.m19259N().containsKey(entry.getKey())) {
                abstractC7920f3.m19241c0(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: U */
    private void m18885U(C7923f4 c7923f4, C7831b0 c7831b0) {
        boolean z;
        if (c7923f4.m19194s0() == null) {
            List<C8098p> m19198o0 = c7923f4.m19198o0();
            ArrayList arrayList = null;
            if (m19198o0 != null && !m19198o0.isEmpty()) {
                for (C8098p c8098p : m19198o0) {
                    if (c8098p.m18588g() != null && c8098p.m18587h() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c8098p.m18587h());
                    }
                }
            }
            if (!this.f21788j.isAttachThreads() && !C8220j.m18222h(c7831b0, InterfaceC7944b.class)) {
                if (this.f21788j.isAttachStacktrace()) {
                    if ((m19198o0 == null || m19198o0.isEmpty()) && !m18882h(c7831b0)) {
                        c7923f4.m19211C0(this.f21789k.m18247a());
                        return;
                    }
                    return;
                }
                return;
            }
            Object m18223g = C8220j.m18223g(c7831b0);
            if (m18223g instanceof InterfaceC7944b) {
                z = ((InterfaceC7944b) m18223g).mo19153d();
            } else {
                z = false;
            }
            c7923f4.m19211C0(this.f21789k.m18246b(arrayList, z));
        }
    }

    /* renamed from: V */
    private boolean m18884V(AbstractC7920f3 abstractC7920f3, C7831b0 c7831b0) {
        if (C8220j.m18209u(c7831b0)) {
            return true;
        }
        this.f21788j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC7920f3.m19266G());
        return false;
    }

    /* renamed from: a */
    private void m18883a() {
        if (this.f21791m == null) {
            synchronized (this) {
                if (this.f21791m == null) {
                    this.f21791m = C7903e0.m19317e();
                }
            }
        }
    }

    /* renamed from: h */
    private boolean m18882h(C7831b0 c7831b0) {
        return C8220j.m18222h(c7831b0, InterfaceC7948f.class);
    }

    /* renamed from: m */
    private void m18881m(AbstractC7920f3 abstractC7920f3) {
        if (this.f21788j.isSendDefaultPii()) {
            if (abstractC7920f3.m19256Q() == null) {
                C8062a0 c8062a0 = new C8062a0();
                c8062a0.m18813s("{{auto}}");
                abstractC7920f3.m19237e0(c8062a0);
            } else if (abstractC7920f3.m19256Q().m18819m() == null) {
                abstractC7920f3.m19256Q().m18813s("{{auto}}");
            }
        }
    }

    /* renamed from: o */
    private void m18880o(AbstractC7920f3 abstractC7920f3) {
        m18889I(abstractC7920f3);
        m18876v(abstractC7920f3);
        m18887R(abstractC7920f3);
        m18877t(abstractC7920f3);
        m18888Q(abstractC7920f3);
        m18886S(abstractC7920f3);
        m18881m(abstractC7920f3);
    }

    /* renamed from: q */
    private void m18879q(AbstractC7920f3 abstractC7920f3) {
        m18890H(abstractC7920f3);
    }

    /* renamed from: s */
    private void m18878s(AbstractC7920f3 abstractC7920f3) {
        ArrayList arrayList = new ArrayList();
        if (this.f21788j.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(this.f21788j.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : this.f21788j.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (!arrayList.isEmpty()) {
            C8072d m19269D = abstractC7920f3.m19269D();
            if (m19269D == null) {
                m19269D = new C8072d();
            }
            if (m19269D.m18763c() == null) {
                m19269D.m18762d(arrayList);
            } else {
                m19269D.m18763c().addAll(arrayList);
            }
            abstractC7920f3.m19254S(m19269D);
        }
    }

    /* renamed from: t */
    private void m18877t(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19268E() == null) {
            abstractC7920f3.m19253T(this.f21788j.getDist());
        }
    }

    /* renamed from: v */
    private void m18876v(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19267F() == null) {
            abstractC7920f3.m19252U(this.f21788j.getEnvironment());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f21791m != null) {
            this.f21791m.m19319c();
        }
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        m18879q(c7923f4);
        m18892A(c7923f4);
        m18878s(c7923f4);
        m18891D(c7923f4);
        if (m18884V(c7923f4, c7831b0)) {
            m18880o(c7923f4);
            m18885U(c7923f4, c7831b0);
        }
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        m18879q(c8114x);
        m18878s(c8114x);
        if (m18884V(c8114x, c7831b0)) {
            m18880o(c8114x);
        }
        return c8114x;
    }
}
