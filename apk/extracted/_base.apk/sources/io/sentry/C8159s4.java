package io.sentry;

import io.sentry.protocol.C8104s;
import io.sentry.protocol.C8114x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.s4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8159s4 implements InterfaceC8270y {

    /* renamed from: j */
    private final String f22078j;

    /* renamed from: k */
    private final String f22079k;

    public C8159s4(String str, String str2) {
        this.f22078j = str;
        this.f22079k = str2;
    }

    /* renamed from: a */
    private <T extends AbstractC7920f3> T m18374a(T t) {
        if (t.m19270C().m18799e() == null) {
            t.m19270C().m18791m(new C8104s());
        }
        C8104s m18799e = t.m19270C().m18799e();
        if (m18799e != null && m18799e.m18568d() == null && m18799e.m18567e() == null) {
            m18799e.m18566f(this.f22079k);
            m18799e.m18564h(this.f22078j);
        }
        return t;
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        return (C7923f4) m18374a(c7923f4);
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        return (C8114x) m18374a(c8114x);
    }

    public C8159s4() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
