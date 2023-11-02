package com.google.android.gms.tasks;

import p029b9.C2198p;
import p134ha.InterfaceC7047e;

/* renamed from: com.google.android.gms.tasks.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4724m implements Runnable {

    /* renamed from: j */
    final /* synthetic */ Task f12951j;

    /* renamed from: k */
    final /* synthetic */ C4725n f12952k;

    public RunnableC4724m(C4725n c4725n, Task task) {
        this.f12952k = c4725n;
        this.f12951j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC7047e interfaceC7047e;
        InterfaceC7047e interfaceC7047e2;
        obj = this.f12952k.f12954b;
        synchronized (obj) {
            C4725n c4725n = this.f12952k;
            interfaceC7047e = c4725n.f12955c;
            if (interfaceC7047e != null) {
                interfaceC7047e2 = c4725n.f12955c;
                interfaceC7047e2.onFailure((Exception) C2198p.m33985j(this.f12951j.mo27974j()));
            }
        }
    }
}