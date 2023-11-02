package io.sentry;

import io.sentry.util.C8229o;
import java.security.SecureRandom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.o5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8046o5 {

    /* renamed from: c */
    private static final Double f21778c = Double.valueOf(1.0d);

    /* renamed from: a */
    private final C8132r4 f21779a;

    /* renamed from: b */
    private final SecureRandom f21780b;

    public C8046o5(C8132r4 c8132r4) {
        this((C8132r4) C8229o.m18169c(c8132r4, "options are required"), new SecureRandom());
    }

    /* renamed from: b */
    private boolean m18906b(Double d) {
        return d.doubleValue() >= this.f21780b.nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8054p5 m18907a(C8157s2 c8157s2) {
        boolean z;
        Double d;
        C8054p5 m19299g = c8157s2.m18375a().m19299g();
        if (m19299g != null) {
            return m19299g;
        }
        this.f21779a.getProfilesSampler();
        Double profilesSampleRate = this.f21779a.getProfilesSampleRate();
        if (profilesSampleRate != null && m18906b(profilesSampleRate)) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.f21779a.getTracesSampler();
        C8054p5 m18459u = c8157s2.m18375a().m18459u();
        if (m18459u != null) {
            return m18459u;
        }
        Double tracesSampleRate = this.f21779a.getTracesSampleRate();
        if (Boolean.TRUE.equals(this.f21779a.getEnableTracing())) {
            d = f21778c;
        } else {
            d = null;
        }
        if (tracesSampleRate == null) {
            tracesSampleRate = d;
        }
        if (tracesSampleRate != null) {
            return new C8054p5(Boolean.valueOf(m18906b(tracesSampleRate)), tracesSampleRate, valueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new C8054p5(bool, null, bool, null);
    }

    C8046o5(C8132r4 c8132r4, SecureRandom secureRandom) {
        this.f21779a = c8132r4;
        this.f21780b = secureRandom;
    }
}
