package com.google.android.gms.tasks;

import p134ha.InterfaceC7048f;

/* renamed from: com.google.android.gms.tasks.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4726o implements Runnable {

    /* renamed from: j */
    final /* synthetic */ Task f12956j;

    /* renamed from: k */
    final /* synthetic */ C4727p f12957k;

    public RunnableC4726o(C4727p c4727p, Task task) {
        this.f12957k = c4727p;
        this.f12956j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC7048f interfaceC7048f;
        InterfaceC7048f interfaceC7048f2;
        obj = this.f12957k.f12959b;
        synchronized (obj) {
            C4727p c4727p = this.f12957k;
            interfaceC7048f = c4727p.f12960c;
            if (interfaceC7048f != null) {
                interfaceC7048f2 = c4727p.f12960c;
                interfaceC7048f2.mo21486b(this.f12956j.mo27973k());
            }
        }
    }
}