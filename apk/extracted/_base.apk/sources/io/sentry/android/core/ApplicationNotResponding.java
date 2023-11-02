package io.sentry.android.core;

import io.sentry.util.C8229o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: j */
    private final Thread f21065j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) C8229o.m18169c(thread, "Thread must be provided.");
        this.f21065j = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    /* renamed from: a */
    public Thread m19979a() {
        return this.f21065j;
    }
}
