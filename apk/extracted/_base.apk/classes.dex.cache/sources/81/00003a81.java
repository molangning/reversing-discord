package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.y1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8272y1 implements InterfaceC8204u0 {

    /* renamed from: a */
    private static final C8272y1 f22222a = new C8272y1();

    private C8272y1() {
    }

    /* renamed from: e */
    public static InterfaceC8204u0 m18036e() {
        return f22222a;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m18035f() {
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m18034g() {
        return null;
    }

    @Override // io.sentry.InterfaceC8204u0
    /* renamed from: a */
    public void mo18040a(long j) {
    }

    @Override // io.sentry.InterfaceC8204u0
    /* renamed from: b */
    public Future<?> mo18039b(Runnable runnable, long j) {
        return new FutureTask(new Callable() { // from class: io.sentry.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m18035f;
                m18035f = C8272y1.m18035f();
                return m18035f;
            }
        });
    }

    @Override // io.sentry.InterfaceC8204u0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC8204u0
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.w1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m18034g;
                m18034g = C8272y1.m18034g();
                return m18034g;
            }
        });
    }
}