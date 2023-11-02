package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7048f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4727p<TResult> implements InterfaceC4730s<TResult> {

    /* renamed from: a */
    private final Executor f12958a;

    /* renamed from: b */
    private final Object f12959b = new Object();

    /* renamed from: c */
    private InterfaceC7048f<? super TResult> f12960c;

    public C4727p(Executor executor, InterfaceC7048f<? super TResult> interfaceC7048f) {
        this.f12958a = executor;
        this.f12960c = interfaceC7048f;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        if (task.mo27969o()) {
            synchronized (this.f12959b) {
                if (this.f12960c == null) {
                    return;
                }
                this.f12958a.execute(new RunnableC4726o(this, task));
            }
        }
    }
}
