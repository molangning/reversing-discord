package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class ExecutorC4732u implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}