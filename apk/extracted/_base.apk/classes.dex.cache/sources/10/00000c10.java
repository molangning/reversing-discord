package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p331s1.C12378m;
import p331s1.InterfaceC12355c;
import p401w9.AbstractBinderC13452m;
import p401w9.C13450k;

/* renamed from: com.android.billingclient.api.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ServiceConnectionC2746n implements ServiceConnection {

    /* renamed from: j */
    private final Object f7380j = new Object();

    /* renamed from: k */
    private boolean f7381k = false;

    /* renamed from: l */
    private InterfaceC12355c f7382l;

    /* renamed from: m */
    final /* synthetic */ C2731b f7383m;

    public /* synthetic */ ServiceConnectionC2746n(C2731b c2731b, InterfaceC12355c interfaceC12355c, C12378m c12378m) {
        this.f7383m = c2731b;
        this.f7382l = interfaceC12355c;
    }

    /* renamed from: d */
    private final void m32456d(BillingResult billingResult) {
        synchronized (this.f7380j) {
            InterfaceC12355c interfaceC12355c = this.f7382l;
            if (interfaceC12355c != null) {
                interfaceC12355c.onBillingSetupFinished(billingResult);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0166  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object m32459a() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ServiceConnectionC2746n.m32459a():java.lang.Object");
    }

    /* renamed from: b */
    public final /* synthetic */ void m32458b() {
        this.f7383m.f7328a = 0;
        this.f7383m.f7333f = null;
        m32456d(C2748p.f7399n);
    }

    /* renamed from: c */
    public final void m32457c() {
        synchronized (this.f7380j) {
            this.f7382l = null;
            this.f7381k = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler m32466t;
        Future m32462x;
        BillingResult m32464v;
        C13450k.m2464m("BillingClient", "Billing service connected.");
        this.f7383m.f7333f = AbstractBinderC13452m.m2459b(iBinder);
        C2731b c2731b = this.f7383m;
        Callable callable = new Callable() { // from class: com.android.billingclient.api.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ServiceConnectionC2746n.this.m32459a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.m
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2746n.this.m32458b();
            }
        };
        m32466t = c2731b.m32466t();
        m32462x = c2731b.m32462x(callable, 30000L, runnable, m32466t);
        if (m32462x == null) {
            m32464v = this.f7383m.m32464v();
            m32456d(m32464v);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C13450k.m2463n("BillingClient", "Billing service disconnected.");
        this.f7383m.f7333f = null;
        this.f7383m.f7328a = 0;
        synchronized (this.f7380j) {
            InterfaceC12355c interfaceC12355c = this.f7382l;
            if (interfaceC12355c != null) {
                interfaceC12355c.onBillingServiceDisconnected();
            }
        }
    }
}