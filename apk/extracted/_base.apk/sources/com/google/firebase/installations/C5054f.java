package com.google.firebase.installations;

import ac.AbstractC0145d;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.installations.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5054f implements InterfaceC5057h {

    /* renamed from: a */
    final TaskCompletionSource<String> f14259a;

    public C5054f(TaskCompletionSource<String> taskCompletionSource) {
        this.f14259a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC5057h
    /* renamed from: a */
    public boolean mo26400a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC5057h
    /* renamed from: b */
    public boolean mo26399b(AbstractC0145d abstractC0145d) {
        if (!abstractC0145d.m41087l() && !abstractC0145d.m41088k() && !abstractC0145d.m41090i()) {
            return false;
        }
        this.f14259a.m28009e(abstractC0145d.mo41095d());
        return true;
    }
}
