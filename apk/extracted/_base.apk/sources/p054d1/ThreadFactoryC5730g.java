package p054d1;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p021b1.C2055l;

/* renamed from: d1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ThreadFactoryC5730g implements ThreadFactory {

    /* renamed from: j */
    private String f16498j;

    /* renamed from: d1.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C5731a implements Thread.UncaughtExceptionHandler {
        C5731a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            C2055l.m34422j().mo34444b("Thread [%s] with error [%s]", thread.getName(), th2.getMessage());
        }
    }

    public ThreadFactoryC5730g(String str) {
        this.f16498j = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        newThread.setName("Adjust-" + newThread.getName() + "-" + this.f16498j);
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new C5731a());
        return newThread;
    }
}
