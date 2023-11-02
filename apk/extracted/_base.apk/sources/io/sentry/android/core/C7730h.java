package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7759b;
import io.sentry.protocol.C8082h;
import io.sentry.protocol.C8100q;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7730h {

    /* renamed from: a */
    private FrameMetricsAggregator f21189a;

    /* renamed from: b */
    private final SentryAndroidOptions f21190b;

    /* renamed from: c */
    private final Map<C8100q, Map<String, C8082h>> f21191c;

    /* renamed from: d */
    private final Map<Activity, C7732b> f21192d;

    /* renamed from: e */
    private final C7723e1 f21193e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.android.core.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7732b {

        /* renamed from: a */
        private final int f21194a;

        /* renamed from: b */
        private final int f21195b;

        /* renamed from: c */
        private final int f21196c;

        private C7732b(int i, int i2, int i3) {
            this.f21194a = i;
            this.f21195b = i2;
            this.f21196c = i3;
        }
    }

    public C7730h(C7720d1 c7720d1, SentryAndroidOptions sentryAndroidOptions, C7723e1 c7723e1) {
        this.f21189a = null;
        this.f21191c = new ConcurrentHashMap();
        this.f21192d = new WeakHashMap();
        if (c7720d1.m19906a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f21189a = new FrameMetricsAggregator();
        }
        this.f21190b = sentryAndroidOptions;
        this.f21193e = c7723e1;
    }

    /* renamed from: f */
    private C7732b m19850f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!m19848h() || (frameMetricsAggregator = this.f21189a) == null) {
            return null;
        }
        SparseIntArray[] m39130b = frameMetricsAggregator.m39130b();
        int i3 = 0;
        if (m39130b != null && m39130b.length > 0 && (sparseIntArray = m39130b[0]) != null) {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i2 += valueAt;
                } else if (keyAt > 16) {
                    i += valueAt;
                }
                i3++;
            }
            i3 = i4;
        } else {
            i = 0;
            i2 = 0;
        }
        return new C7732b(i3, i, i2);
    }

    /* renamed from: g */
    private C7732b m19849g(Activity activity) {
        C7732b m19850f;
        C7732b remove = this.f21192d.remove(activity);
        if (remove == null || (m19850f = m19850f()) == null) {
            return null;
        }
        return new C7732b(m19850f.f21194a - remove.f21194a, m19850f.f21195b - remove.f21195b, m19850f.f21196c - remove.f21196c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m19847i(Activity activity) {
        this.f21189a.m39131a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m19846j(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                InterfaceC8040o0 logger = this.f21190b.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.WARNING;
                logger.mo18135c(enumC8021m4, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m19845k(Activity activity) {
        this.f21189a.m39129c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m19844l() {
        this.f21189a.m39127e();
    }

    /* renamed from: m */
    private void m19843m(final Runnable runnable, final String str) {
        try {
            if (C7759b.m19778d().mo18150a()) {
                runnable.run();
            } else {
                this.f21193e.m19901b(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7730h.this.m19846j(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                InterfaceC8040o0 logger = this.f21190b.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.WARNING;
                logger.mo18135c(enumC8021m4, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* renamed from: o */
    private void m19841o(Activity activity) {
        C7732b m19850f = m19850f();
        if (m19850f != null) {
            this.f21192d.put(activity, m19850f);
        }
    }

    /* renamed from: e */
    public synchronized void m19851e(final Activity activity) {
        if (!m19848h()) {
            return;
        }
        m19843m(new Runnable() { // from class: io.sentry.android.core.d
            @Override // java.lang.Runnable
            public final void run() {
                C7730h.this.m19847i(activity);
            }
        }, "FrameMetricsAggregator.add");
        m19841o(activity);
    }

    /* renamed from: h */
    public boolean m19848h() {
        return this.f21189a != null && this.f21190b.isEnableFramesTracking();
    }

    /* renamed from: n */
    public synchronized void m19842n(final Activity activity, C8100q c8100q) {
        if (!m19848h()) {
            return;
        }
        m19843m(new Runnable() { // from class: io.sentry.android.core.g
            @Override // java.lang.Runnable
            public final void run() {
                C7730h.this.m19845k(activity);
            }
        }, null);
        C7732b m19849g = m19849g(activity);
        if (m19849g != null && (m19849g.f21194a != 0 || m19849g.f21195b != 0 || m19849g.f21196c != 0)) {
            C8082h c8082h = new C8082h(Integer.valueOf(m19849g.f21194a), ViewProps.NONE);
            C8082h c8082h2 = new C8082h(Integer.valueOf(m19849g.f21195b), ViewProps.NONE);
            C8082h c8082h3 = new C8082h(Integer.valueOf(m19849g.f21196c), ViewProps.NONE);
            HashMap hashMap = new HashMap();
            hashMap.put("frames_total", c8082h);
            hashMap.put("frames_slow", c8082h2);
            hashMap.put("frames_frozen", c8082h3);
            this.f21191c.put(c8100q, hashMap);
        }
    }

    /* renamed from: p */
    public synchronized void m19840p() {
        if (m19848h()) {
            m19843m(new Runnable() { // from class: io.sentry.android.core.e
                @Override // java.lang.Runnable
                public final void run() {
                    C7730h.this.m19844l();
                }
            }, "FrameMetricsAggregator.stop");
            this.f21189a.m39128d();
        }
        this.f21191c.clear();
    }

    /* renamed from: q */
    public synchronized Map<String, C8082h> m19839q(C8100q c8100q) {
        if (!m19848h()) {
            return null;
        }
        Map<String, C8082h> map = this.f21191c.get(c8100q);
        this.f21191c.remove(c8100q);
        return map;
    }

    public C7730h(C7720d1 c7720d1, SentryAndroidOptions sentryAndroidOptions) {
        this(c7720d1, sentryAndroidOptions, new C7723e1());
    }
}
