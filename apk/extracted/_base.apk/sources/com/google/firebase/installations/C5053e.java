package com.google.firebase.installations;

import ac.AbstractC0145d;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.installations.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5053e implements InterfaceC5057h {

    /* renamed from: a */
    private final C5058i f14257a;

    /* renamed from: b */
    private final TaskCompletionSource<AbstractC5055g> f14258b;

    public C5053e(C5058i c5058i, TaskCompletionSource<AbstractC5055g> taskCompletionSource) {
        this.f14257a = c5058i;
        this.f14258b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC5057h
    /* renamed from: a */
    public boolean mo26400a(Exception exc) {
        this.f14258b.m28010d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC5057h
    /* renamed from: b */
    public boolean mo26399b(AbstractC0145d abstractC0145d) {
        if (abstractC0145d.m41088k() && !this.f14257a.m26393f(abstractC0145d)) {
            this.f14258b.m28011c(AbstractC5055g.m26408a().mo26403b(abstractC0145d.mo41097b()).mo26401d(abstractC0145d.mo41096c()).mo26402c(abstractC0145d.mo41091h()).mo26404a());
            return true;
        }
        return false;
    }
}
