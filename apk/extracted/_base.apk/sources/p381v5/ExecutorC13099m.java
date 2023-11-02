package p381v5;

import java.util.concurrent.Executor;
import p007a6.C0030a;

/* renamed from: v5.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ExecutorC13099m implements Executor {

    /* renamed from: j */
    private final Executor f33941j;

    /* renamed from: v5.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class RunnableC13100a implements Runnable {

        /* renamed from: j */
        private final Runnable f33942j;

        RunnableC13100a(Runnable runnable) {
            this.f33942j = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f33942j.run();
            } catch (Exception e) {
                C0030a.m41370c("Executor", "Background execution failure.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC13099m(Executor executor) {
        this.f33941j = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f33941j.execute(new RunnableC13100a(runnable));
    }
}
