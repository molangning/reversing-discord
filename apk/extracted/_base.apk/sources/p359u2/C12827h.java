package p359u2;

import android.os.Handler;
import android.os.Looper;

/* renamed from: u2.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12827h extends ScheduledExecutorServiceC12823d {

    /* renamed from: k */
    private static C12827h f33329k;

    private C12827h() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: g */
    public static C12827h m3853g() {
        if (f33329k == null) {
            f33329k = new C12827h();
        }
        return f33329k;
    }

    @Override // p359u2.ScheduledExecutorServiceC12823d, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (m3866a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
