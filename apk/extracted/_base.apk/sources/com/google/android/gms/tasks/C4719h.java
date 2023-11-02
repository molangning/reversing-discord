package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7043a;
import p134ha.InterfaceC7045c;
import p134ha.InterfaceC7047e;
import p134ha.InterfaceC7048f;

/* renamed from: com.google.android.gms.tasks.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4719h<TResult, TContinuationResult> implements InterfaceC7048f<TContinuationResult>, InterfaceC7047e, InterfaceC7045c, InterfaceC4730s {

    /* renamed from: a */
    private final Executor f12939a;

    /* renamed from: b */
    private final InterfaceC7043a<TResult, Task<TContinuationResult>> f12940b;

    /* renamed from: c */
    private final C4734w<TContinuationResult> f12941c;

    public C4719h(Executor executor, InterfaceC7043a<TResult, Task<TContinuationResult>> interfaceC7043a, C4734w<TContinuationResult> c4734w) {
        this.f12939a = executor;
        this.f12940b = interfaceC7043a;
        this.f12941c = c4734w;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        this.f12939a.execute(new RunnableC4718g(this, task));
    }

    @Override // p134ha.InterfaceC7048f
    /* renamed from: b */
    public final void mo21486b(TContinuationResult tcontinuationresult) {
        this.f12941c.m27966r(tcontinuationresult);
    }

    @Override // p134ha.InterfaceC7045c
    /* renamed from: c */
    public final void mo21487c() {
        this.f12941c.m27965s();
    }

    @Override // p134ha.InterfaceC7047e
    public final void onFailure(Exception exc) {
        this.f12941c.m27967q(exc);
    }
}
