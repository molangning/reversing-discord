package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0095c;
import p461z8.C14118b;

/* renamed from: com.google.android.gms.nearby.messages.internal.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4698n implements InterfaceC0095c {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f12897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4698n(C4706u c4706u, TaskCompletionSource taskCompletionSource) {
        this.f12897a = taskCompletionSource;
    }

    @Override // p010a9.InterfaceC0095c
    /* renamed from: a */
    public final /* synthetic */ void mo3088a(Object obj) {
        Status status = (Status) obj;
        this.f12897a.m28011c(null);
    }

    @Override // p010a9.InterfaceC0095c
    /* renamed from: b */
    public final void mo28029b(Status status) {
        this.f12897a.m28012b(new C14118b(status));
    }
}
