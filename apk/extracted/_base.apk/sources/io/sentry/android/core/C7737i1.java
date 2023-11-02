package io.sentry.android.core;

import io.sentry.C7831b0;
import io.sentry.C7911e5;
import io.sentry.C7923f4;
import io.sentry.InterfaceC8128r1;
import io.sentry.InterfaceC8270y;
import io.sentry.protocol.C8082h;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8229o;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7737i1 implements InterfaceC8270y {

    /* renamed from: j */
    private boolean f21201j = false;

    /* renamed from: k */
    private final C7730h f21202k;

    /* renamed from: l */
    private final SentryAndroidOptions f21203l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7737i1(SentryAndroidOptions sentryAndroidOptions, C7730h c7730h) {
        this.f21203l = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21202k = (C7730h) C8229o.m18169c(c7730h, "ActivityFramesTracker is required");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m19832a(java.util.List<io.sentry.protocol.C8106t> r4) {
        /*
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.next()
            io.sentry.protocol.t r0 = (io.sentry.protocol.C8106t) r0
            java.lang.String r1 = r0.m18561b()
            java.lang.String r2 = "app.start.cold"
            boolean r1 = r1.contentEquals(r2)
            if (r1 != 0) goto L28
            java.lang.String r0 = r0.m18561b()
            java.lang.String r1 = "app.start.warm"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L4
        L28:
            r4 = 1
            return r4
        L2a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C7737i1.m19832a(java.util.List):boolean");
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        return c7923f4;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public synchronized C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        Map<String, C8082h> m19839q;
        Long m19726b;
        String str;
        if (!this.f21203l.isTracingEnabled()) {
            return c8114x;
        }
        if (!this.f21201j && m19832a(c8114x.m18486o0()) && (m19726b = C7792m0.m19723e().m19726b()) != null) {
            C8082h c8082h = new C8082h(Float.valueOf((float) m19726b.longValue()), InterfaceC8128r1.EnumC8129a.MILLISECOND.apiName());
            if (C7792m0.m19723e().m19722f().booleanValue()) {
                str = "app_start_cold";
            } else {
                str = "app_start_warm";
            }
            c8114x.m18488m0().put(str, c8082h);
            this.f21201j = true;
        }
        C8100q m19266G = c8114x.m19266G();
        C7911e5 m18798f = c8114x.m19270C().m18798f();
        if (m19266G != null && m18798f != null && m18798f.m19304b().contentEquals("ui.load") && (m19839q = this.f21202k.m19839q(m19266G)) != null) {
            c8114x.m18488m0().putAll(m19839q);
        }
        return c8114x;
    }
}
