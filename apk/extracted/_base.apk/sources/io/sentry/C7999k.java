package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.EnumC7950h;
import io.sentry.protocol.C8098p;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8220j;
import java.util.HashMap;
import java.util.Map;
import p164j$.util.DesugarCollections;

/* renamed from: io.sentry.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7999k implements InterfaceC8270y {

    /* renamed from: j */
    private final Map<String, Long> f21681j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final C8132r4 f21682k;

    public C7999k(C8132r4 c8132r4) {
        this.f21682k = c8132r4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        if (!C8220j.m18222h(c7831b0, UncaughtExceptionHandlerIntegration.C7683a.class)) {
            return c7923f4;
        }
        C8098p m19192u0 = c7923f4.m19192u0();
        if (m19192u0 == null) {
            return c7923f4;
        }
        String m18586i = m19192u0.m18586i();
        if (m18586i == null) {
            return c7923f4;
        }
        Long m18587h = m19192u0.m18587h();
        if (m18587h == null) {
            return c7923f4;
        }
        Long l = this.f21681j.get(m18586i);
        if (l != null && !l.equals(m18587h)) {
            this.f21682k.getLogger().mo18135c(EnumC8021m4.INFO, "Event %s has been dropped due to multi-threaded deduplication", c7923f4.m19266G());
            C8220j.m18212r(c7831b0, EnumC7950h.MULTITHREADED_DEDUPLICATION);
            return null;
        }
        this.f21681j.put(m18586i, m18587h);
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public /* synthetic */ C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        return C8264x.m18050a(this, c8114x, c7831b0);
    }
}
