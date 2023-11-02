package com.google.android.gms.tasks;

import p134ha.InterfaceC7046d;

/* renamed from: com.google.android.gms.tasks.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4722k implements Runnable {

    /* renamed from: j */
    final /* synthetic */ Task f12946j;

    /* renamed from: k */
    final /* synthetic */ C4723l f12947k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4722k(C4723l c4723l, Task task) {
        this.f12947k = c4723l;
        this.f12946j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC7046d interfaceC7046d;
        InterfaceC7046d interfaceC7046d2;
        obj = this.f12947k.f12949b;
        synchronized (obj) {
            C4723l c4723l = this.f12947k;
            interfaceC7046d = c4723l.f12950c;
            if (interfaceC7046d != null) {
                interfaceC7046d2 = c4723l.f12950c;
                interfaceC7046d2.mo1614a(this.f12946j);
            }
        }
    }
}
