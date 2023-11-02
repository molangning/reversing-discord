package io.sentry;

import p164j$.time.Instant;

/* renamed from: io.sentry.i4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7974i4 extends AbstractC8003k3 {

    /* renamed from: j */
    private final Instant f21646j;

    public C7974i4() {
        this(Instant.now());
    }

    @Override // io.sentry.AbstractC8003k3
    /* renamed from: f */
    public long mo18864f() {
        return C7991j.m19078m(this.f21646j.getEpochSecond()) + this.f21646j.getNano();
    }

    public C7974i4(Instant instant) {
        this.f21646j = instant;
    }
}
