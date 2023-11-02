package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p442y9.HandlerC13953a;

/* renamed from: com.google.android.gms.tasks.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class ExecutorC4733v implements Executor {

    /* renamed from: j */
    private final Handler f12969j = new HandlerC13953a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12969j.post(runnable);
    }
}