package io.sentry;

import io.sentry.util.C8231q;

/* renamed from: io.sentry.e3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7908e3 implements InterfaceC8010l3 {

    /* renamed from: a */
    private final InterfaceC8010l3 f21548a;

    public C7908e3() {
        if (m19311a()) {
            this.f21548a = new C7996j4();
        } else {
            this.f21548a = new C8124q4();
        }
    }

    /* renamed from: a */
    private static boolean m19311a() {
        return C8231q.m18165b() && C8231q.m18166a();
    }

    @Override // io.sentry.InterfaceC8010l3
    public AbstractC8003k3 now() {
        return this.f21548a.now();
    }
}