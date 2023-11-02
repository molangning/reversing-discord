package p291q1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ThreadFactoryC11675g implements ThreadFactory {

    /* renamed from: m */
    private static final AtomicInteger f30440m = new AtomicInteger(1);

    /* renamed from: j */
    private final ThreadGroup f30441j;

    /* renamed from: k */
    private final AtomicInteger f30442k = new AtomicInteger(1);

    /* renamed from: l */
    private final String f30443l;

    public ThreadFactoryC11675g() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f30441j = threadGroup;
        this.f30443l = "lottie-" + f30440m.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f30441j;
        Thread thread = new Thread(threadGroup, runnable, this.f30443l + this.f30442k.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
