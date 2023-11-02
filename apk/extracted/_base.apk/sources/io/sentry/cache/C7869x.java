package io.sentry.cache;

import io.sentry.C7901e;
import io.sentry.C7911e5;
import io.sentry.C8120q0;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC8127r0;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8068c;
import java.util.Collection;
import java.util.Map;

/* renamed from: io.sentry.cache.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7869x implements InterfaceC8127r0 {

    /* renamed from: a */
    private final C8132r4 f21480a;

    public C7869x(C8132r4 c8132r4) {
        this.f21480a = c8132r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m19515A(Map map) {
        m19508H(map, "tags.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m19514B(C7911e5 c7911e5) {
        if (c7911e5 == null) {
            m19498u("trace.json");
        } else {
            m19508H(c7911e5, "trace.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m19513C(String str) {
        if (str == null) {
            m19498u("transaction.json");
        } else {
            m19508H(str, "transaction.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m19512D(C8062a0 c8062a0) {
        if (c8062a0 == null) {
            m19498u("user.json");
        } else {
            m19508H(c8062a0, "user.json");
        }
    }

    /* renamed from: E */
    public static <T> T m19511E(C8132r4 c8132r4, String str, Class<T> cls) {
        return (T) m19510F(c8132r4, str, cls, null);
    }

    /* renamed from: F */
    public static <T, R> T m19510F(C8132r4 c8132r4, String str, Class<T> cls, InterfaceC7894d1<R> interfaceC7894d1) {
        return (T) C7848c.m19550c(c8132r4, ".scope-cache", str, cls, interfaceC7894d1);
    }

    /* renamed from: G */
    private void m19509G(final Runnable runnable) {
        try {
            this.f21480a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.u
                @Override // java.lang.Runnable
                public final void run() {
                    C7869x.this.m19497v(runnable);
                }
            });
        } catch (Throwable th2) {
            this.f21480a.getLogger().mo18136b(EnumC8021m4.ERROR, "Serialization task could not be scheduled", th2);
        }
    }

    /* renamed from: H */
    private <T> void m19508H(T t, String str) {
        C7848c.m19549d(this.f21480a, t, ".scope-cache", str);
    }

    /* renamed from: u */
    private void m19498u(String str) {
        C7848c.m19552a(this.f21480a, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m19497v(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            this.f21480a.getLogger().mo18136b(EnumC8021m4.ERROR, "Serialization task failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m19496w(Collection collection) {
        m19508H(collection, "breadcrumbs.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m19495x(C8068c c8068c) {
        m19508H(c8068c, "contexts.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m19494y(Map map) {
        m19508H(map, "extras.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m19493z(Collection collection) {
        m19508H(collection, "fingerprint.json");
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: a */
    public void mo18455a(final Map<String, String> map) {
        m19509G(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19515A(map);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: b */
    public /* synthetic */ void mo18454b(String str, String str2) {
        C8120q0.m18470g(this, str, str2);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: c */
    public /* synthetic */ void mo18453c(C7901e c7901e) {
        C8120q0.m18476a(this, c7901e);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: d */
    public /* synthetic */ void mo18452d(String str, String str2) {
        C8120q0.m18473d(this, str, str2);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: e */
    public void mo18451e(final Collection<C7901e> collection) {
        m19509G(new Runnable() { // from class: io.sentry.cache.t
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19496w(collection);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: f */
    public void mo18450f(final Collection<String> collection) {
        m19509G(new Runnable() { // from class: io.sentry.cache.q
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19493z(collection);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: g */
    public void mo18449g(final C8062a0 c8062a0) {
        m19509G(new Runnable() { // from class: io.sentry.cache.s
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19512D(c8062a0);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: h */
    public void mo18448h(final C8068c c8068c) {
        m19509G(new Runnable() { // from class: io.sentry.cache.r
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19495x(c8068c);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: i */
    public void mo18447i(final C7911e5 c7911e5) {
        m19509G(new Runnable() { // from class: io.sentry.cache.v
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19514B(c7911e5);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: j */
    public void mo18446j(final Map<String, Object> map) {
        m19509G(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19494y(map);
            }
        });
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: k */
    public void mo18445k(final String str) {
        m19509G(new Runnable() { // from class: io.sentry.cache.w
            @Override // java.lang.Runnable
            public final void run() {
                C7869x.this.m19513C(str);
            }
        });
    }
}
