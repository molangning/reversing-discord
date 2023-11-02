package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7045c;
import p134ha.InterfaceC7047e;
import p134ha.InterfaceC7048f;
import p134ha.InterfaceC7050h;

/* renamed from: com.google.android.gms.tasks.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4729r<TResult, TContinuationResult> implements InterfaceC7048f<TContinuationResult>, InterfaceC7047e, InterfaceC7045c, InterfaceC4730s {

    /* renamed from: a */
    private final Executor f12963a;

    /* renamed from: b */
    private final InterfaceC7050h<TResult, TContinuationResult> f12964b;

    /* renamed from: c */
    private final C4734w<TContinuationResult> f12965c;

    public C4729r(Executor executor, InterfaceC7050h<TResult, TContinuationResult> interfaceC7050h, C4734w<TContinuationResult> c4734w) {
        this.f12963a = executor;
        this.f12964b = interfaceC7050h;
        this.f12965c = c4734w;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        this.f12963a.execute(new RunnableC4728q(this, task));
    }

    @Override // p134ha.InterfaceC7048f
    /* renamed from: b */
    public final void mo21486b(TContinuationResult tcontinuationresult) {
        this.f12965c.m27966r(tcontinuationresult);
    }

    @Override // p134ha.InterfaceC7045c
    /* renamed from: c */
    public final void mo21487c() {
        this.f12965c.m27965s();
    }

    @Override // p134ha.InterfaceC7047e
    public final void onFailure(Exception exc) {
        this.f12965c.m27967q(exc);
    }
}
