package p282p8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p8.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class ThreadFactoryC11463l implements ThreadFactory {

    /* renamed from: j */
    private static final AtomicInteger f29793j = new AtomicInteger();

    public /* synthetic */ ThreadFactoryC11463l(C11462k c11462k) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f29793j.incrementAndGet();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("measurement-");
        sb2.append(incrementAndGet);
        return new C11464m(runnable, sb2.toString());
    }
}