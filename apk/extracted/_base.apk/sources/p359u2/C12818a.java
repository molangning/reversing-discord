package p359u2;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: u2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12818a extends AbstractExecutorService {

    /* renamed from: j */
    private static final C12818a f33315j = new C12818a();

    private C12818a() {
    }

    /* renamed from: a */
    public static C12818a m3873a() {
        return f33315j;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
