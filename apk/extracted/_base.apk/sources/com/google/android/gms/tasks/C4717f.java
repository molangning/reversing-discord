package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7043a;

/* renamed from: com.google.android.gms.tasks.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4717f<TResult, TContinuationResult> implements InterfaceC4730s<TResult> {

    /* renamed from: a */
    private final Executor f12934a;

    /* renamed from: b */
    private final InterfaceC7043a<TResult, TContinuationResult> f12935b;

    /* renamed from: c */
    private final C4734w<TContinuationResult> f12936c;

    public C4717f(Executor executor, InterfaceC7043a<TResult, TContinuationResult> interfaceC7043a, C4734w<TContinuationResult> c4734w) {
        this.f12934a = executor;
        this.f12935b = interfaceC7043a;
        this.f12936c = c4734w;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        this.f12934a.execute(new RunnableC4716e(this, task));
    }
}
