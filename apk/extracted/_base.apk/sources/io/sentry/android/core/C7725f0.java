package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.AbstractC7920f3;
import io.sentry.C7831b0;
import io.sentry.C7901e;
import io.sentry.C7911e5;
import io.sentry.C7923f4;
import io.sentry.C7931g4;
import io.sentry.C8166t4;
import io.sentry.C8264x;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7839c;
import io.sentry.android.core.C7803q0;
import io.sentry.android.core.internal.util.C7764f;
import io.sentry.cache.C7859n;
import io.sentry.cache.C7869x;
import io.sentry.hints.InterfaceC7944b;
import io.sentry.hints.InterfaceC7946d;
import io.sentry.protocol.C8060a;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8068c;
import io.sentry.protocol.C8072d;
import io.sentry.protocol.C8074e;
import io.sentry.protocol.C8084i;
import io.sentry.protocol.C8088k;
import io.sentry.protocol.C8090l;
import io.sentry.protocol.C8096o;
import io.sentry.protocol.C8110v;
import io.sentry.protocol.C8112w;
import io.sentry.protocol.C8114x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C8220j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: io.sentry.android.core.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7725f0 implements InterfaceC7839c {

    /* renamed from: j */
    private final Context f21183j;

    /* renamed from: k */
    private final SentryAndroidOptions f21184k;

    /* renamed from: l */
    private final C7798o0 f21185l;

    /* renamed from: m */
    private final C7931g4 f21186m;

    public C7725f0(Context context, SentryAndroidOptions sentryAndroidOptions, C7798o0 c7798o0) {
        this.f21183j = context;
        this.f21184k = sentryAndroidOptions;
        this.f21185l = c7798o0;
        this.f21186m = new C7931g4(new C8166t4(sentryAndroidOptions));
    }

    /* renamed from: A */
    private void m19900A(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19263J() == null) {
            abstractC7920f3.m19248Y((String) C7859n.m19519v(this.f21184k, "release.json", String.class));
        }
    }

    /* renamed from: B */
    private void m19899B(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19262K() == null) {
            abstractC7920f3.m19247Z((C8090l) C7869x.m19511E(this.f21184k, "request.json", C8090l.class));
        }
    }

    /* renamed from: C */
    private void m19898C(AbstractC7920f3 abstractC7920f3) {
        Map map = (Map) C7869x.m19511E(this.f21184k, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC7920f3.m19259N() == null) {
            abstractC7920f3.m19239d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC7920f3.m19259N().containsKey(entry.getKey())) {
                abstractC7920f3.m19241c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: D */
    private void m19897D(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19261L() == null) {
            abstractC7920f3.m19245a0((C8096o) C7859n.m19519v(this.f21184k, "sdk-version.json", C8096o.class));
        }
    }

    /* renamed from: E */
    private void m19896E(AbstractC7920f3 abstractC7920f3) {
        try {
            C7803q0.C7804a m19686n = C7803q0.m19686n(this.f21183j, this.f21184k.getLogger(), this.f21185l);
            if (m19686n != null) {
                for (Map.Entry<String, String> entry : m19686n.m19684a().entrySet()) {
                    abstractC7920f3.m19241c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f21184k.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting side loaded info.", th2);
        }
    }

    /* renamed from: F */
    private void m19895F(C7923f4 c7923f4) {
        m19881m(c7923f4);
        m19896E(c7923f4);
    }

    /* renamed from: G */
    private void m19894G(C7923f4 c7923f4) {
        C7911e5 c7911e5 = (C7911e5) C7869x.m19511E(this.f21184k, "trace.json", C7911e5.class);
        if (c7923f4.m19270C().m18798f() == null && c7911e5 != null && c7911e5.m19298h() != null && c7911e5.m19295k() != null) {
            c7923f4.m19270C().m18790n(c7911e5);
        }
    }

    /* renamed from: H */
    private void m19893H(C7923f4 c7923f4) {
        String str = (String) C7869x.m19511E(this.f21184k, "transaction.json", String.class);
        if (c7923f4.m19193t0() == null) {
            c7923f4.m19209E0(str);
        }
    }

    /* renamed from: I */
    private void m19892I(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19256Q() == null) {
            abstractC7920f3.m19237e0((C8062a0) C7869x.m19511E(this.f21184k, "user.json", C8062a0.class));
        }
    }

    /* renamed from: a */
    private void m19891a(C7923f4 c7923f4, Object obj) {
        m19900A(c7923f4);
        m19874t(c7923f4);
        m19875s(c7923f4);
        m19877q(c7923f4);
        m19897D(c7923f4);
        m19880n(c7923f4, obj);
        m19869y(c7923f4);
    }

    /* renamed from: b */
    private void m19890b(C7923f4 c7923f4) {
        m19899B(c7923f4);
        m19892I(c7923f4);
        m19898C(c7923f4);
        m19879o(c7923f4);
        m19872v(c7923f4);
        m19878p(c7923f4);
        m19893H(c7923f4);
        m19871w(c7923f4);
        m19870x(c7923f4);
        m19894G(c7923f4);
    }

    /* renamed from: c */
    private C8112w m19889c(List<C8112w> list) {
        if (list != null) {
            for (C8112w c8112w : list) {
                String m18510m = c8112w.m18510m();
                if (m18510m != null && m18510m.equals("main")) {
                    return c8112w;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    private C8062a0 m19888d() {
        C8062a0 c8062a0 = new C8062a0();
        c8062a0.m18814r(m19886f());
        return c8062a0;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    private C8074e m19887e() {
        C8074e c8074e = new C8074e();
        if (this.f21184k.isSendDefaultPii()) {
            c8074e.m18720g0(C7803q0.m19696d(this.f21183j, this.f21185l));
        }
        c8074e.m18728c0(Build.MANUFACTURER);
        c8074e.m18743Q(Build.BRAND);
        c8074e.m18738V(C7803q0.m19694f(this.f21184k.getLogger()));
        c8074e.m18724e0(Build.MODEL);
        c8074e.m18722f0(Build.ID);
        c8074e.m18747M(C7803q0.m19697c(this.f21185l));
        ActivityManager.MemoryInfo m19692h = C7803q0.m19692h(this.f21183j, this.f21184k.getLogger());
        if (m19692h != null) {
            c8074e.m18726d0(m19885g(m19692h));
        }
        c8074e.m18702p0(this.f21185l.m19701f());
        DisplayMetrics m19695e = C7803q0.m19695e(this.f21183j, this.f21184k.getLogger());
        if (m19695e != null) {
            c8074e.m18704o0(Integer.valueOf(m19695e.widthPixels));
            c8074e.m18706n0(Integer.valueOf(m19695e.heightPixels));
            c8074e.m18710l0(Float.valueOf(m19695e.density));
            c8074e.m18708m0(Integer.valueOf(m19695e.densityDpi));
        }
        if (c8074e.m18750J() == null) {
            c8074e.m18735Y(m19886f());
        }
        List<Integer> m19765c = C7764f.m19767a().m19765c();
        if (!m19765c.isEmpty()) {
            c8074e.m18712k0(Double.valueOf(((Integer) Collections.max(m19765c)).doubleValue()));
            c8074e.m18714j0(Integer.valueOf(m19765c.size()));
        }
        return c8074e;
    }

    /* renamed from: f */
    private String m19886f() {
        try {
            return C7823y0.m19620a(this.f21183j);
        } catch (Throwable th2) {
            this.f21184k.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    private Long m19885g(ActivityManager.MemoryInfo memoryInfo) {
        if (this.f21185l.m19703d() >= 16) {
            return Long.valueOf(memoryInfo.totalMem);
        }
        return Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    /* renamed from: h */
    private C8088k m19884h() {
        C8088k c8088k = new C8088k();
        c8088k.m18641j("Android");
        c8088k.m18638m(Build.VERSION.RELEASE);
        c8088k.m18643h(Build.DISPLAY);
        try {
            c8088k.m18642i(C7803q0.m19693g(this.f21184k.getLogger()));
        } catch (Throwable th2) {
            this.f21184k.getLogger().mo18136b(EnumC8021m4.ERROR, "Error getting OperatingSystem.", th2);
        }
        return c8088k;
    }

    /* renamed from: k */
    private boolean m19883k(Object obj) {
        if (obj instanceof InterfaceC7944b) {
            return "anr_background".equals(((InterfaceC7944b) obj).mo19152f());
        }
        return false;
    }

    /* renamed from: l */
    private void m19882l(AbstractC7920f3 abstractC7920f3) {
        String str;
        C8088k m18800c = abstractC7920f3.m19270C().m18800c();
        abstractC7920f3.m19270C().m18793k(m19884h());
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

    /* renamed from: m */
    private void m19881m(AbstractC7920f3 abstractC7920f3) {
        if (this.f21184k.isSendDefaultPii()) {
            if (abstractC7920f3.m19256Q() == null) {
                C8062a0 c8062a0 = new C8062a0();
                c8062a0.m18813s("{{auto}}");
                abstractC7920f3.m19237e0(c8062a0);
            } else if (abstractC7920f3.m19256Q().m18819m() == null) {
                abstractC7920f3.m19256Q().m18813s("{{auto}}");
            }
        }
        C8062a0 m19256Q = abstractC7920f3.m19256Q();
        if (m19256Q == null) {
            abstractC7920f3.m19237e0(m19888d());
        } else if (m19256Q.m18820l() == null) {
            m19256Q.m18814r(m19886f());
        }
    }

    /* renamed from: n */
    private void m19880n(AbstractC7920f3 abstractC7920f3, Object obj) {
        String str;
        C8060a m18802a = abstractC7920f3.m19270C().m18802a();
        if (m18802a == null) {
            m18802a = new C8060a();
        }
        m18802a.m18838m(C7803q0.m19698b(this.f21183j, this.f21184k.getLogger()));
        m18802a.m18835p(Boolean.valueOf(!m19883k(obj)));
        PackageInfo m19690j = C7803q0.m19690j(this.f21183j, this.f21184k.getLogger(), this.f21185l);
        if (m19690j != null) {
            m18802a.m18839l(m19690j.packageName);
        }
        if (abstractC7920f3.m19263J() != null) {
            str = abstractC7920f3.m19263J();
        } else {
            str = (String) C7859n.m19519v(this.f21184k, "release.json", String.class);
        }
        if (str != null) {
            try {
                String substring = str.substring(str.indexOf(64) + 1, str.indexOf(43));
                String substring2 = str.substring(str.indexOf(43) + 1);
                m18802a.m18836o(substring);
                m18802a.m18840k(substring2);
            } catch (Throwable unused) {
                this.f21184k.getLogger().mo18135c(EnumC8021m4.WARNING, "Failed to parse release from scope cache: %s", str);
            }
        }
        abstractC7920f3.m19270C().m18797g(m18802a);
    }

    /* renamed from: o */
    private void m19879o(AbstractC7920f3 abstractC7920f3) {
        List list = (List) C7869x.m19510F(this.f21184k, "breadcrumbs.json", List.class, new C7901e.C7902a());
        if (list == null) {
            return;
        }
        if (abstractC7920f3.m19271B() == null) {
            abstractC7920f3.m19255R(new ArrayList(list));
        } else {
            abstractC7920f3.m19271B().addAll(list);
        }
    }

    /* renamed from: p */
    private void m19878p(AbstractC7920f3 abstractC7920f3) {
        C8068c c8068c = (C8068c) C7869x.m19511E(this.f21184k, "contexts.json", C8068c.class);
        if (c8068c == null) {
            return;
        }
        C8068c m19270C = abstractC7920f3.m19270C();
        for (Map.Entry<String, Object> entry : new C8068c(c8068c).entrySet()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof C7911e5)) {
                if (!m19270C.containsKey(entry.getKey())) {
                    m19270C.put(entry.getKey(), value);
                }
            }
        }
    }

    /* renamed from: q */
    private void m19877q(AbstractC7920f3 abstractC7920f3) {
        C8072d m19269D = abstractC7920f3.m19269D();
        if (m19269D == null) {
            m19269D = new C8072d();
        }
        if (m19269D.m18763c() == null) {
            m19269D.m18762d(new ArrayList());
        }
        List<DebugImage> m18763c = m19269D.m18763c();
        if (m18763c != null) {
            String str = (String) C7859n.m19519v(this.f21184k, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                m18763c.add(debugImage);
            }
            abstractC7920f3.m19254S(m19269D);
        }
    }

    /* renamed from: r */
    private void m19876r(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19270C().m18801b() == null) {
            abstractC7920f3.m19270C().m18795i(m19887e());
        }
    }

    /* renamed from: s */
    private void m19875s(AbstractC7920f3 abstractC7920f3) {
        String str;
        if (abstractC7920f3.m19268E() == null) {
            abstractC7920f3.m19253T((String) C7859n.m19519v(this.f21184k, "dist.json", String.class));
        }
        if (abstractC7920f3.m19268E() == null && (str = (String) C7859n.m19519v(this.f21184k, "release.json", String.class)) != null) {
            try {
                abstractC7920f3.m19253T(str.substring(str.indexOf(43) + 1));
            } catch (Throwable unused) {
                this.f21184k.getLogger().mo18135c(EnumC8021m4.WARNING, "Failed to parse release from scope cache: %s", str);
            }
        }
    }

    /* renamed from: t */
    private void m19874t(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19267F() == null) {
            String str = (String) C7859n.m19519v(this.f21184k, "environment.json", String.class);
            if (str == null) {
                str = this.f21184k.getEnvironment();
            }
            abstractC7920f3.m19252U(str);
        }
    }

    /* renamed from: u */
    private void m19873u(C7923f4 c7923f4, Object obj) {
        C8084i c8084i = new C8084i();
        if (!((InterfaceC7946d) obj).mo19151a()) {
            c8084i.m18659j("HistoricalAppExitInfo");
        } else {
            c8084i.m18659j("AppExitInfo");
        }
        String str = "ANR";
        if (m19883k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        C8112w m19889c = m19889c(c7923f4.m19194s0());
        if (m19889c == null) {
            m19889c = new C8112w();
            m19889c.m18498y(new C8110v());
        }
        c7923f4.m19189x0(this.f21186m.m19177e(m19889c, c8084i, applicationNotResponding));
    }

    /* renamed from: v */
    private void m19872v(AbstractC7920f3 abstractC7920f3) {
        Map map = (Map) C7869x.m19511E(this.f21184k, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC7920f3.m19265H() == null) {
            abstractC7920f3.m19250W(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC7920f3.m19265H().containsKey(entry.getKey())) {
                abstractC7920f3.m19265H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: w */
    private void m19871w(C7923f4 c7923f4) {
        List<String> list = (List) C7869x.m19511E(this.f21184k, "fingerprint.json", List.class);
        if (c7923f4.m19197p0() == null) {
            c7923f4.m19188y0(list);
        }
    }

    /* renamed from: x */
    private void m19870x(C7923f4 c7923f4) {
        EnumC8021m4 enumC8021m4 = (EnumC8021m4) C7869x.m19511E(this.f21184k, "level.json", EnumC8021m4.class);
        if (c7923f4.m19196q0() == null) {
            c7923f4.m19187z0(enumC8021m4);
        }
    }

    /* renamed from: y */
    private void m19869y(AbstractC7920f3 abstractC7920f3) {
        Map map = (Map) C7859n.m19519v(this.f21184k, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC7920f3.m19259N() == null) {
            abstractC7920f3.m19239d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC7920f3.m19259N().containsKey(entry.getKey())) {
                abstractC7920f3.m19241c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: z */
    private void m19868z(AbstractC7920f3 abstractC7920f3) {
        if (abstractC7920f3.m19264I() == null) {
            abstractC7920f3.m19249X("java");
        }
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        Object m18223g = C8220j.m18223g(c7831b0);
        if (!(m18223g instanceof InterfaceC7946d)) {
            this.f21184k.getLogger().mo18135c(EnumC8021m4.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c7923f4;
        }
        m19873u(c7923f4, m18223g);
        m19868z(c7923f4);
        m19882l(c7923f4);
        m19876r(c7923f4);
        if (!((InterfaceC7946d) m18223g).mo19151a()) {
            this.f21184k.getLogger().mo18135c(EnumC8021m4.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c7923f4;
        }
        m19890b(c7923f4);
        m19891a(c7923f4, m18223g);
        m19895F(c7923f4);
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public /* synthetic */ C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        return C8264x.m18050a(this, c8114x, c7831b0);
    }
}
