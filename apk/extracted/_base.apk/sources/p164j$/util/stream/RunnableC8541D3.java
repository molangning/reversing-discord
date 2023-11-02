package p164j$.util.stream;

/* renamed from: j$.util.stream.D3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class RunnableC8541D3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f22660a;

    /* renamed from: b */
    final /* synthetic */ Runnable f22661b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC8541D3(Runnable runnable, Runnable runnable2) {
        this.f22660a = runnable;
        this.f22661b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f22661b;
        try {
            this.f22660a.run();
            runnable.run();
        } catch (Throwable th2) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
