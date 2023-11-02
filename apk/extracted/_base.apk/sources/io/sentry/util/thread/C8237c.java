package io.sentry.util.thread;

/* renamed from: io.sentry.util.thread.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8237c implements InterfaceC8236b {

    /* renamed from: a */
    private static final long f22157a = Thread.currentThread().getId();

    /* renamed from: b */
    private static final C8237c f22158b = new C8237c();

    private C8237c() {
    }

    /* renamed from: d */
    public static C8237c m18151d() {
        return f22158b;
    }

    @Override // io.sentry.util.thread.InterfaceC8236b
    /* renamed from: a */
    public /* synthetic */ boolean mo18150a() {
        return C8235a.m18154a(this);
    }

    @Override // io.sentry.util.thread.InterfaceC8236b
    /* renamed from: b */
    public boolean mo18149b(long j) {
        return f22157a == j;
    }

    @Override // io.sentry.util.thread.InterfaceC8236b
    /* renamed from: c */
    public /* synthetic */ boolean mo18148c(Thread thread) {
        return C8235a.m18152c(this, thread);
    }
}
