package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7045c;

/* renamed from: com.google.android.gms.tasks.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4721j<TResult> implements InterfaceC4730s<TResult> {

    /* renamed from: a */
    private final Executor f12943a;

    /* renamed from: b */
    private final Object f12944b = new Object();

    /* renamed from: c */
    private InterfaceC7045c f12945c;

    public C4721j(Executor executor, InterfaceC7045c interfaceC7045c) {
        this.f12943a = executor;
        this.f12945c = interfaceC7045c;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        if (task.mo27971m()) {
            synchronized (this.f12944b) {
                if (this.f12945c == null) {
                    return;
                }
                this.f12943a.execute(new RunnableC4720i(this));
            }
        }
    }
}