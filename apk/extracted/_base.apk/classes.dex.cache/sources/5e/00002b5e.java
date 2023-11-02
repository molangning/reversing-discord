package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7047e;

/* renamed from: com.google.android.gms.tasks.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4725n<TResult> implements InterfaceC4730s<TResult> {

    /* renamed from: a */
    private final Executor f12953a;

    /* renamed from: b */
    private final Object f12954b = new Object();

    /* renamed from: c */
    private InterfaceC7047e f12955c;

    public C4725n(Executor executor, InterfaceC7047e interfaceC7047e) {
        this.f12953a = executor;
        this.f12955c = interfaceC7047e;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        if (!task.mo27969o() && !task.mo27971m()) {
            synchronized (this.f12954b) {
                if (this.f12955c == null) {
                    return;
                }
                this.f12953a.execute(new RunnableC4724m(this, task));
            }
        }
    }
}