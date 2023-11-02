package p282p8;

import android.os.Process;

/* renamed from: p8.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11464m extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11464m(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
