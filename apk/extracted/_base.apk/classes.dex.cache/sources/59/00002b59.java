package com.google.android.gms.tasks;

import p134ha.InterfaceC7045c;

/* renamed from: com.google.android.gms.tasks.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4720i implements Runnable {

    /* renamed from: j */
    final /* synthetic */ C4721j f12942j;

    public RunnableC4720i(C4721j c4721j) {
        this.f12942j = c4721j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC7045c interfaceC7045c;
        InterfaceC7045c interfaceC7045c2;
        obj = this.f12942j.f12944b;
        synchronized (obj) {
            C4721j c4721j = this.f12942j;
            interfaceC7045c = c4721j.f12945c;
            if (interfaceC7045c != null) {
                interfaceC7045c2 = c4721j.f12945c;
                interfaceC7045c2.mo21487c();
            }
        }
    }
}