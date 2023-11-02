package io.sentry;

import io.sentry.transport.C8175d;
import io.sentry.transport.C8200y;
import io.sentry.transport.InterfaceC8190p;
import io.sentry.util.C8229o;

/* renamed from: io.sentry.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7684a implements InterfaceC8271y0 {
    @Override // io.sentry.InterfaceC8271y0
    /* renamed from: a */
    public InterfaceC8190p mo18041a(C8132r4 c8132r4, C8122q2 c8122q2) {
        C8229o.m18169c(c8132r4, "options is required");
        C8229o.m18169c(c8122q2, "requestDetails is required");
        return new C8175d(c8132r4, new C8200y(c8132r4), c8132r4.getTransportGate(), c8122q2);
    }
}
