package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p134ha.C7049g;
import p134ha.InterfaceC7050h;

/* renamed from: com.google.android.gms.tasks.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4728q implements Runnable {

    /* renamed from: j */
    final /* synthetic */ Task f12961j;

    /* renamed from: k */
    final /* synthetic */ C4729r f12962k;

    public RunnableC4728q(C4729r c4729r, Task task) {
        this.f12962k = c4729r;
        this.f12961j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7050h interfaceC7050h;
        try {
            interfaceC7050h = this.f12962k.f12964b;
            Task mo1607a = interfaceC7050h.mo1607a(this.f12961j.mo27973k());
            if (mo1607a == null) {
                this.f12962k.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C4712a.f12930b;
            mo1607a.mo27977g(executor, this.f12962k);
            mo1607a.mo27979e(executor, this.f12962k);
            mo1607a.mo27983a(executor, this.f12962k);
        } catch (C7049g e) {
            if (e.getCause() instanceof Exception) {
                this.f12962k.onFailure((Exception) e.getCause());
            } else {
                this.f12962k.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f12962k.mo21487c();
        } catch (Exception e2) {
            this.f12962k.onFailure(e2);
        }
    }
}