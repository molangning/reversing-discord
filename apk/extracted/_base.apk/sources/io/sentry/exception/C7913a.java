package io.sentry.exception;

import io.sentry.protocol.C8084i;
import io.sentry.util.C8229o;

/* renamed from: io.sentry.exception.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7913a extends RuntimeException {

    /* renamed from: j */
    private final C8084i f21566j;

    /* renamed from: k */
    private final Throwable f21567k;

    /* renamed from: l */
    private final Thread f21568l;

    /* renamed from: m */
    private final boolean f21569m;

    public C7913a(C8084i c8084i, Throwable th2, Thread thread, boolean z) {
        this.f21566j = (C8084i) C8229o.m18169c(c8084i, "Mechanism is required.");
        this.f21567k = (Throwable) C8229o.m18169c(th2, "Throwable is required.");
        this.f21568l = (Thread) C8229o.m18169c(thread, "Thread is required.");
        this.f21569m = z;
    }

    /* renamed from: a */
    public C8084i m19288a() {
        return this.f21566j;
    }

    /* renamed from: b */
    public Thread m19287b() {
        return this.f21568l;
    }

    /* renamed from: c */
    public Throwable m19286c() {
        return this.f21567k;
    }

    /* renamed from: d */
    public boolean m19285d() {
        return this.f21569m;
    }

    public C7913a(C8084i c8084i, Throwable th2, Thread thread) {
        this(c8084i, th2, thread, false);
    }
}
