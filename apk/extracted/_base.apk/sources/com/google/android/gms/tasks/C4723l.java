package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p134ha.InterfaceC7046d;

/* renamed from: com.google.android.gms.tasks.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4723l<TResult> implements InterfaceC4730s<TResult> {

    /* renamed from: a */
    private final Executor f12948a;

    /* renamed from: b */
    private final Object f12949b = new Object();

    /* renamed from: c */
    private InterfaceC7046d<TResult> f12950c;

    public C4723l(Executor executor, InterfaceC7046d<TResult> interfaceC7046d) {
        this.f12948a = executor;
        this.f12950c = interfaceC7046d;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4730s
    /* renamed from: a */
    public final void mo27986a(Task<TResult> task) {
        synchronized (this.f12949b) {
            if (this.f12950c == null) {
                return;
            }
            this.f12948a.execute(new RunnableC4722k(this, task));
        }
    }
}
