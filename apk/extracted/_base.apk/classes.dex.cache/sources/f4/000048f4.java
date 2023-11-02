package p282p8;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: p8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11460i extends FutureTask {

    /* renamed from: j */
    final /* synthetic */ C11461j f29791j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11460i(C11461j c11461j, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f29791j = c11461j;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        uncaughtExceptionHandler = this.f29791j.f29792j.f29800f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
            sb2.append("MeasurementExecutor: job failed with ");
            sb2.append(valueOf);
            Log.e("GAv4", sb2.toString());
        }
        super.setException(th2);
    }
}