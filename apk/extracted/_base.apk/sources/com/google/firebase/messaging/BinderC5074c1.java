package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC5084f1;
import p134ha.InterfaceC7046d;

/* renamed from: com.google.firebase.messaging.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class BinderC5074c1 extends Binder {

    /* renamed from: c */
    private final InterfaceC5075a f14324c;

    /* renamed from: com.google.firebase.messaging.c1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC5075a {
        /* renamed from: a */
        Task<Void> mo26314a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5074c1(InterfaceC5075a interfaceC5075a) {
        this.f14324c = interfaceC5075a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m26315c(final ServiceConnectionC5084f1.C5085a c5085a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f14324c.mo26314a(c5085a.f14345a).mo27981c(new ExecutorC5082f(), new InterfaceC7046d() { // from class: com.google.firebase.messaging.b1
                @Override // p134ha.InterfaceC7046d
                /* renamed from: a */
                public final void mo1614a(Task task) {
                    ServiceConnectionC5084f1.C5085a.this.m26239d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
