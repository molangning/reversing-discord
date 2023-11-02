package p359u2;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: u2.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12822c extends C12819b implements InterfaceExecutorServiceC12825f {
    public C12822c(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    @Override // p359u2.C12819b, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
