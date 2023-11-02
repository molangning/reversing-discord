package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.AbstractC7920f3;
import io.sentry.C7831b0;
import io.sentry.C7923f4;
import io.sentry.C7991j;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8270y;
import io.sentry.android.core.C7803q0;
import io.sentry.android.core.internal.util.C7759b;
import io.sentry.protocol.C8060a;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8088k;
import io.sentry.protocol.C8112w;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7811t0 implements InterfaceC8270y {

    /* renamed from: j */
    final Context f21361j;

    /* renamed from: k */
    private final C7798o0 f21362k;

    /* renamed from: l */
    private final SentryAndroidOptions f21363l;

    /* renamed from: m */
    private final Future<C7813u0> f21364m;

    public C7811t0(final Context context, C7798o0 c7798o0, final SentryAndroidOptions sentryAndroidOptions) {
        this.f21361j = (Context) C8229o.m18169c(context, "The application context is required.");
        this.f21362k = (C7798o0) C8229o.m18169c(c7798o0, "The BuildInfoProvider is required.");
        this.f21363l = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f21364m = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.s0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7813u0 m19644p;
                m19644p = C7813u0.m19644p(context, sentryAndroidOptions);
                return m19644p;
            }
        });
        newSingleThreadExecutor.shutdown();
    }

    /* renamed from: d */
    private void m19673d(AbstractC7920f3 abstractC7920f3) {
        String str;
        C8088k m18800c = abstractC7920f3.m19270C().m18800c();
        try {
            abstractC7920f3.m19270C().m18793k(this.f21364m.get().m19642r());
        } catch (Throwable th2) {
            this.f21363l.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to retrieve os system", th2);
        }
        if (m18800c != null) {
            String m18644g = m18800c.m18644g();
            if (m18644g != null && !m18644g.isEmpty()) {
                str = "os_" + m18644g.trim().toLowerCase(Locale.ROOT);
            } else {
                str = "os_1";
            }
            abstractC7920f3.m19270C().put(str, m18800c);
        }
    }

    /* renamed from: e */
    private void m19672e(AbstractC7920f3 abstractC7920f3) {
        C8062a0 m19256Q = abstractC7920f3.m19256Q();
        if (m19256Q == null) {
            abstractC7920f3.m19237e0(m19675b(this.f21361j));
        } else if (m19256Q.m18820l() == null) {
            m19256Q.m18814r(C7823y0.m19620a(this.f21361j));
        }
    }

    /* renamed from: f */
    private void m19671f(AbstractC7920f3 abstractC7920f3, C7831b0 c7831b0) {
        C8060a m18802a = abstractC7920f3.m19270C().m18802a();
        if (m18802a == null) {
            m18802a = new C8060a();
        }
        m19670g(m18802a, c7831b0);
        m19666m(abstractC7920f3, m18802a);
        abstractC7920f3.m19270C().m18797g(m18802a);
    }

    /* renamed from: g */
    private void m19670g(C8060a c8060a, C7831b0 c7831b0) {
        Boolean m19708b;
        c8060a.m18838m(C7803q0.m19698b(this.f21361j, this.f21363l.getLogger()));
        c8060a.m18837n(C7991j.m19077n(C7792m0.m19723e().m19724d()));
        if (!C8220j.m18221i(c7831b0) && c8060a.m18841j() == null && (m19708b = C7795n0.m19709a().m19708b()) != null) {
            c8060a.m18835p(Boolean.valueOf(!m19708b.booleanValue()));
        }
    }

    /* renamed from: h */
    private void m19669h(AbstractC7920f3 abstractC7920f3, boolean z, boolean z2) {
        m19672e(abstractC7920f3);
        m19668k(abstractC7920f3, z, z2);
        m19665n(abstractC7920f3);
    }

    /* renamed from: k */
    private void m19668k(AbstractC7920f3 abstractC7920f3, boolean z, boolean z2) {
        if (abstractC7920f3.m19270C().m18801b() == null) {
            try {
                abstractC7920f3.m19270C().m18795i(this.f21364m.get().m19659a(z, z2));
            } catch (Throwable th2) {
                this.f21363l.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to retrieve device info", th2);
            }
            m19673d(abstractC7920f3);
        }
    }

    /* renamed from: l */
    private void m19667l(AbstractC7920f3 abstractC7920f3, String str) {
        if (abstractC7920f3.m19268E() == null) {
            abstractC7920f3.m19253T(str);
        }
    }

    /* renamed from: m */
    private void m19666m(AbstractC7920f3 abstractC7920f3, C8060a c8060a) {
        PackageInfo m19691i = C7803q0.m19691i(this.f21361j, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, this.f21363l.getLogger(), this.f21362k);
        if (m19691i != null) {
            m19667l(abstractC7920f3, C7803q0.m19689k(m19691i, this.f21362k));
            C7803q0.m19685o(m19691i, this.f21362k, c8060a);
        }
    }

    /* renamed from: n */
    private void m19665n(AbstractC7920f3 abstractC7920f3) {
        try {
            C7803q0.C7804a m19640t = this.f21364m.get().m19640t();
            if (m19640t != null) {
                for (Map.Entry<String, String> entry : m19640t.m19684a().entrySet()) {
                    abstractC7920f3.m19241c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f21363l.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting side loaded info.", th2);
        }
    }

    /* renamed from: o */
    private void m19664o(C7923f4 c7923f4, C7831b0 c7831b0) {
        if (c7923f4.m19194s0() != null) {
            boolean m18221i = C8220j.m18221i(c7831b0);
            for (C8112w c8112w : c7923f4.m19194s0()) {
                boolean m19777e = C7759b.m19778d().m19777e(c8112w);
                if (c8112w.m18508o() == null) {
                    c8112w.m18505r(Boolean.valueOf(m19777e));
                }
                if (!m18221i && c8112w.m18507p() == null) {
                    c8112w.m18501v(Boolean.valueOf(m19777e));
                }
            }
        }
    }

    /* renamed from: p */
    private boolean m19663p(AbstractC7920f3 abstractC7920f3, C7831b0 c7831b0) {
        if (C8220j.m18209u(c7831b0)) {
            return true;
        }
        this.f21363l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC7920f3.m19266G());
        return false;
    }

    /* renamed from: b */
    public C8062a0 m19675b(Context context) {
        C8062a0 c8062a0 = new C8062a0();
        c8062a0.m18814r(C7823y0.m19620a(context));
        return c8062a0;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        boolean m19663p = m19663p(c7923f4, c7831b0);
        if (m19663p) {
            m19671f(c7923f4, c7831b0);
            m19664o(c7923f4, c7831b0);
        }
        m19669h(c7923f4, true, m19663p);
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        boolean m19663p = m19663p(c8114x, c7831b0);
        if (m19663p) {
            m19671f(c8114x, c7831b0);
        }
        m19669h(c8114x, false, m19663p);
        return c8114x;
    }
}
