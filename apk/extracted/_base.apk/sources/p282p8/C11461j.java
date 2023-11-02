package p282p8;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p8.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11461j extends ThreadPoolExecutor {

    /* renamed from: j */
    final /* synthetic */ C11465n f29792j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11461j(C11465n c11465n) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f29792j = c11465n;
        setThreadFactory(new ThreadFactoryC11463l(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C11460i(this, runnable, t);
    }
}
