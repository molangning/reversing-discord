package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4731t<TResult> {

    /* renamed from: a */
    private final Object f12966a = new Object();

    /* renamed from: b */
    private Queue<InterfaceC4730s<TResult>> f12967b;

    /* renamed from: c */
    private boolean f12968c;

    /* renamed from: a */
    public final void m27985a(InterfaceC4730s<TResult> interfaceC4730s) {
        synchronized (this.f12966a) {
            if (this.f12967b == null) {
                this.f12967b = new ArrayDeque();
            }
            this.f12967b.add(interfaceC4730s);
        }
    }

    /* renamed from: b */
    public final void m27984b(Task<TResult> task) {
        InterfaceC4730s<TResult> poll;
        synchronized (this.f12966a) {
            if (this.f12967b != null && !this.f12968c) {
                this.f12968c = true;
                while (true) {
                    synchronized (this.f12966a) {
                        poll = this.f12967b.poll();
                        if (poll == null) {
                            this.f12968c = false;
                            return;
                        }
                    }
                    poll.mo27986a(task);
                }
            }
        }
    }
}
