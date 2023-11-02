package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p134ha.C7051i;

/* renamed from: com.google.android.gms.tasks.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4714c implements InterfaceC4715d {

    /* renamed from: a */
    private final CountDownLatch f12931a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4714c(C7051i c7051i) {
    }

    /* renamed from: a */
    public final void m28001a() {
        this.f12931a.await();
    }

    @Override // p134ha.InterfaceC7048f
    /* renamed from: b */
    public final void mo21486b(Object obj) {
        this.f12931a.countDown();
    }

    @Override // p134ha.InterfaceC7045c
    /* renamed from: c */
    public final void mo21487c() {
        this.f12931a.countDown();
    }

    /* renamed from: d */
    public final boolean m28000d(long j, TimeUnit timeUnit) {
        return this.f12931a.await(j, timeUnit);
    }

    @Override // p134ha.InterfaceC7047e
    public final void onFailure(Exception exc) {
        this.f12931a.countDown();
    }
}
