package io.sentry.cache;

import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC8049p0;
import io.sentry.protocol.C8096o;
import java.util.Map;

/* renamed from: io.sentry.cache.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7859n implements InterfaceC8049p0 {

    /* renamed from: a */
    private final C8132r4 f21461a;

    public C7859n(C8132r4 c8132r4) {
        this.f21461a = c8132r4;
    }

    /* renamed from: n */
    private void m19527n(String str) {
        C7848c.m19552a(this.f21461a, ".options-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m19526o(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            this.f21461a.getLogger().mo18136b(EnumC8021m4.ERROR, "Serialization task failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m19525p(String str) {
        if (str == null) {
            m19527n("dist.json");
        } else {
            m19516y(str, "dist.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m19524q(String str) {
        if (str == null) {
            m19527n("environment.json");
        } else {
            m19516y(str, "environment.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m19523r(String str) {
        if (str == null) {
            m19527n("proguard-uuid.json");
        } else {
            m19516y(str, "proguard-uuid.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m19522s(String str) {
        if (str == null) {
            m19527n("release.json");
        } else {
            m19516y(str, "release.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m19521t(C8096o c8096o) {
        if (c8096o == null) {
            m19527n("sdk-version.json");
        } else {
            m19516y(c8096o, "sdk-version.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m19520u(Map map) {
        m19516y(map, "tags.json");
    }

    /* renamed from: v */
    public static <T> T m19519v(C8132r4 c8132r4, String str, Class<T> cls) {
        return (T) m19518w(c8132r4, str, cls, null);
    }

    /* renamed from: w */
    public static <T, R> T m19518w(C8132r4 c8132r4, String str, Class<T> cls, InterfaceC7894d1<R> interfaceC7894d1) {
        return (T) C7848c.m19550c(c8132r4, ".options-cache", str, cls, interfaceC7894d1);
    }

    /* renamed from: x */
    private void m19517x(final Runnable runnable) {
        try {
            this.f21461a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.m
                @Override // java.lang.Runnable
                public final void run() {
                    C7859n.this.m19526o(runnable);
                }
            });
        } catch (Throwable th2) {
            this.f21461a.getLogger().mo18136b(EnumC8021m4.ERROR, "Serialization task could not be scheduled", th2);
        }
    }

    /* renamed from: y */
    private <T> void m19516y(T t, String str) {
        C7848c.m19549d(this.f21461a, t, ".options-cache", str);
    }

    @Override // io.sentry.InterfaceC8049p0
    /* renamed from: a */
    public void mo18898a(final Map<String, String> map) {
        m19517x(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                C7859n.this.m19520u(map);
            }
        });
    }

    @Override // io.sentry.InterfaceC8049p0
    /* renamed from: b */
    public void mo18897b(final String str) {
        m19517x(new Runnable() { // from class: io.sentry.cache.h
            @Override // java.lang.Runnable
            public final void run() {
                C7859n.this.m19525p(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC8049p0
    /* renamed from: c */
    public void mo18896c(final String str) {
        m19517x(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                C7859n.this.m19524q(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC8049p0
    /* renamed from: d */
    public void mo18895d(final String str) {
        m19517x(new Runnable() { // from class: io.sentry.cache.g
            @Override // java.lang.Runnable
            public final void run() {
                C7859n.this.m19523r(str);
            }
        });
    }

    @Override // io.sentry.InterfaceC8049p0
    /* renamed from: e */
    public void mo18894e(final C8096o c8096o) {
        m19517x(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                C7859n.this.m19521t(c8096o);
            }
        });
    }

    @Override // io.sentry.InterfaceC8049p0
    /* renamed from: f */
    public void mo18893f(final String str) {
        m19517x(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                C7859n.this.m19522s(str);
            }
        });
    }
}
