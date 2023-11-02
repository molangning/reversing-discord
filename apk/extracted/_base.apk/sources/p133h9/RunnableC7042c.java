package p133h9;

import android.os.Process;

/* renamed from: h9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC7042c implements Runnable {

    /* renamed from: j */
    private final Runnable f19299j;

    public RunnableC7042c(Runnable runnable, int i) {
        this.f19299j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f19299j.run();
    }
}
