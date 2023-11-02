package p180jf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: jf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ThreadFactoryC8924e extends AtomicLong implements ThreadFactory {

    /* renamed from: j */
    final String f23353j;

    /* renamed from: k */
    final int f23354k;

    /* renamed from: l */
    final boolean f23355l;

    /* renamed from: jf.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8925a extends Thread {
        C8925a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ThreadFactoryC8924e(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f23353j + '-' + incrementAndGet();
        if (this.f23355l) {
            thread = new C8925a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f23354k);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f23353j + "]";
    }

    public ThreadFactoryC8924e(String str, int i) {
        this(str, i, false);
    }

    public ThreadFactoryC8924e(String str, int i, boolean z) {
        this.f23353j = str;
        this.f23354k = i;
        this.f23355l = z;
    }
}