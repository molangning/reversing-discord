package io.sentry;

import io.sentry.protocol.C8096o;
import io.sentry.protocol.C8100q;
import io.sentry.util.C8229o;
import java.util.ArrayList;

/* renamed from: io.sentry.m3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8020m3 {

    /* renamed from: a */
    private final C8030n3 f21708a;

    /* renamed from: b */
    private final Iterable<C7898d4> f21709b;

    public C8020m3(C8030n3 c8030n3, Iterable<C7898d4> iterable) {
        this.f21708a = (C8030n3) C8229o.m18169c(c8030n3, "SentryEnvelopeHeader is required.");
        this.f21709b = (Iterable) C8229o.m18169c(iterable, "SentryEnvelope items are required.");
    }

    /* renamed from: a */
    public static C8020m3 m18988a(InterfaceC8243v0 interfaceC8243v0, C7836b5 c7836b5, C8096o c8096o) {
        C8229o.m18169c(interfaceC8243v0, "Serializer is required.");
        C8229o.m18169c(c7836b5, "session is required.");
        return new C8020m3(null, c8096o, C7898d4.m19363u(interfaceC8243v0, c7836b5));
    }

    /* renamed from: b */
    public C8030n3 m18987b() {
        return this.f21708a;
    }

    /* renamed from: c */
    public Iterable<C7898d4> m18986c() {
        return this.f21709b;
    }

    public C8020m3(C8100q c8100q, C8096o c8096o, C7898d4 c7898d4) {
        C8229o.m18169c(c7898d4, "SentryEnvelopeItem is required.");
        this.f21708a = new C8030n3(c8100q, c8096o);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c7898d4);
        this.f21709b = arrayList;
    }
}
