package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ThreadFactoryC2743k implements ThreadFactory {

    /* renamed from: j */
    private final ThreadFactory f7376j = Executors.defaultThreadFactory();

    /* renamed from: k */
    private final AtomicInteger f7377k = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC2743k(C2731b c2731b) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7376j.newThread(runnable);
        int andIncrement = this.f7377k.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
