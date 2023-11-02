package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.producers.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3853w0 implements InterfaceC3851v0 {

    /* renamed from: a */
    private boolean f10830a = false;

    /* renamed from: b */
    private final Deque<Runnable> f10831b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f10832c;

    public C3853w0(Executor executor) {
        this.f10832c = (Executor) C13379j.m2677g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3851v0
    /* renamed from: a */
    public synchronized void mo30631a(Runnable runnable) {
        this.f10831b.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3851v0
    /* renamed from: b */
    public synchronized void mo30630b(Runnable runnable) {
        if (this.f10830a) {
            this.f10831b.add(runnable);
        } else {
            this.f10832c.execute(runnable);
        }
    }
}
