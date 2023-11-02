package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p134ha.InterfaceC7046d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.nearby.messages.internal.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4700o implements InterfaceC7046d {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f12898a;

    public C4700o(C4706u c4706u, TaskCompletionSource taskCompletionSource) {
        this.f12898a = taskCompletionSource;
    }

    @Override // p134ha.InterfaceC7046d
    /* renamed from: a */
    public final void mo1614a(Task task) {
        if (task.mo27969o()) {
            this.f12898a.m28011c(null);
        } else {
            this.f12898a.m28012b(task.mo27974j());
        }
    }
}