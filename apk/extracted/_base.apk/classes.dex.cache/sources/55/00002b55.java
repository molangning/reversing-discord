package com.google.android.gms.tasks;

import p134ha.C7049g;
import p134ha.InterfaceC7043a;

/* renamed from: com.google.android.gms.tasks.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4716e implements Runnable {

    /* renamed from: j */
    final /* synthetic */ Task f12932j;

    /* renamed from: k */
    final /* synthetic */ C4717f f12933k;

    public RunnableC4716e(C4717f c4717f, Task task) {
        this.f12933k = c4717f;
        this.f12932j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4734w c4734w;
        C4734w c4734w2;
        C4734w c4734w3;
        InterfaceC7043a interfaceC7043a;
        C4734w c4734w4;
        C4734w c4734w5;
        if (this.f12932j.mo27971m()) {
            c4734w5 = this.f12933k.f12936c;
            c4734w5.m27965s();
            return;
        }
        try {
            interfaceC7043a = this.f12933k.f12935b;
            Object mo1573a = interfaceC7043a.mo1573a(this.f12932j);
            c4734w4 = this.f12933k.f12936c;
            c4734w4.m27966r(mo1573a);
        } catch (C7049g e) {
            if (e.getCause() instanceof Exception) {
                c4734w3 = this.f12933k.f12936c;
                c4734w3.m27967q((Exception) e.getCause());
                return;
            }
            c4734w2 = this.f12933k.f12936c;
            c4734w2.m27967q(e);
        } catch (Exception e2) {
            c4734w = this.f12933k.f12936c;
            c4734w.m27967q(e2);
        }
    }
}