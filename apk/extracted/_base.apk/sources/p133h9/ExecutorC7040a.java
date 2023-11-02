package p133h9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p351t9.HandlerC12609e;

/* renamed from: h9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ExecutorC7040a implements Executor {

    /* renamed from: j */
    private final Handler f19296j;

    public ExecutorC7040a(Looper looper) {
        this.f19296j = new HandlerC12609e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19296j.post(runnable);
    }
}
