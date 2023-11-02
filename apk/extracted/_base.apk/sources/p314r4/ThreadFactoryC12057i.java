package p314r4;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r4.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ThreadFactoryC12057i implements ThreadFactory {

    /* renamed from: j */
    private final int f31139j;

    /* renamed from: k */
    private final String f31140k;

    /* renamed from: l */
    private final boolean f31141l;

    /* renamed from: m */
    private final AtomicInteger f31142m = new AtomicInteger(1);

    /* renamed from: r4.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC12058a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Runnable f31143j;

        RunnableC12058a(Runnable runnable) {
            this.f31143j = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(ThreadFactoryC12057i.this.f31139j);
            } catch (Throwable unused) {
            }
            this.f31143j.run();
        }
    }

    public ThreadFactoryC12057i(int i, String str, boolean z) {
        this.f31139j = i;
        this.f31140k = str;
        this.f31141l = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        RunnableC12058a runnableC12058a = new RunnableC12058a(runnable);
        if (this.f31141l) {
            str = this.f31140k + "-" + this.f31142m.getAndIncrement();
        } else {
            str = this.f31140k;
        }
        return new Thread(runnableC12058a, str);
    }
}
