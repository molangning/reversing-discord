package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RunnableC4735x implements Runnable {

    /* renamed from: j */
    final /* synthetic */ C4734w f12976j;

    /* renamed from: k */
    final /* synthetic */ Callable f12977k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4735x(C4734w c4734w, Callable callable) {
        this.f12976j = c4734w;
        this.f12977k = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12976j.m27966r(this.f12977k.call());
        } catch (Exception e) {
            this.f12976j.m27967q(e);
        } catch (Throwable th2) {
            this.f12976j.m27967q(new RuntimeException(th2));
        }
    }
}
