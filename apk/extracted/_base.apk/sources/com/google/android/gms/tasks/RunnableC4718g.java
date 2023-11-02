package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.C7049g;
import p134ha.InterfaceC7043a;

/* renamed from: com.google.android.gms.tasks.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4718g implements Runnable {

    /* renamed from: j */
    final /* synthetic */ Task f12937j;

    /* renamed from: k */
    final /* synthetic */ C4719h f12938k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4718g(C4719h c4719h, Task task) {
        this.f12938k = c4719h;
        this.f12937j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4734w c4734w;
        C4734w c4734w2;
        C4734w c4734w3;
        InterfaceC7043a interfaceC7043a;
        try {
            interfaceC7043a = this.f12938k.f12940b;
            Task task = (Task) interfaceC7043a.mo1573a(this.f12937j);
            if (task == null) {
                this.f12938k.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C4712a.f12930b;
            task.mo27977g(executor, this.f12938k);
            task.mo27979e(executor, this.f12938k);
            task.mo27983a(executor, this.f12938k);
        } catch (C7049g e) {
            if (e.getCause() instanceof Exception) {
                c4734w3 = this.f12938k.f12941c;
                c4734w3.m27967q((Exception) e.getCause());
                return;
            }
            c4734w2 = this.f12938k.f12941c;
            c4734w2.m27967q(e);
        } catch (Exception e2) {
            c4734w = this.f12938k.f12941c;
            c4734w.m27967q(e2);
        }
    }
}
