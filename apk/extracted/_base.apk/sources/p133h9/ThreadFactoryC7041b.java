package p133h9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p029b9.C2198p;

/* renamed from: h9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ThreadFactoryC7041b implements ThreadFactory {

    /* renamed from: j */
    private final String f19297j;

    /* renamed from: k */
    private final ThreadFactory f19298k = Executors.defaultThreadFactory();

    public ThreadFactoryC7041b(String str) {
        C2198p.m33984k(str, "Name must not be null");
        this.f19297j = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f19298k.newThread(new RunnableC7042c(runnable, 0));
        newThread.setName(this.f19297j);
        return newThread;
    }
}
